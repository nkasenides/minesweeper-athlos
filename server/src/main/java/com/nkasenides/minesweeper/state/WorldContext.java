/* --------------------------------------------------------------------------------
  This file was automatically generated by the Athlos Project Editor.
  Athlos Framework: http://nkasenides.github.io/athlos
  Generated on: 16-11-2021 12:37:22
  Athlos Project Editor, v0.1.0 BETA
-------------------------------------------------------------------------------- */

package com.nkasenides.minesweeper.state;


import com.nkasenides.minesweeper.model.*;
import com.nkasenides.minesweeper.proto.*;
import com.nkasenides.minesweeper.persistence.DBManager;
import com.nkasenides.minesweeper.generation.MATerrainGenerator;
import com.raylabz.jsec.Hashing;
import com.raylabz.jsec.HashType;
import java.util.*;
import io.grpc.stub.StreamObserver;

public class WorldContext {

    private final String worldID;
    private final MAWorld world;
    private final MATerrainGenerator terrainGenerator;
    private final HashMap<MAWorldSession, StreamObserver<UpdateStateResponse>> subscribers = new HashMap<>();

    public WorldContext(String worldID) {
        this.worldID = worldID;
        this.world = DBManager.world.get(worldID);
        this.terrainGenerator = new MATerrainGenerator(world);
    }

    public String getWorldID() {
        return worldID;
    }

    public MATerrainGenerator getTerrainGenerator() {
        return terrainGenerator;
    }

    public MAWorld getWorld() {
        return world;
    }

     /**
     * Requests terrain data for a specific chunk.
     * @param chunkRow The row of the chunk to load.
     * @param chunkCol The column of the chunk to load.
     * @return Returns a TerrainChunk.
     */
    private MATerrainChunk requestChunk(int chunkRow, int chunkCol) {
        final String chunkHash = Hashing.hash(HashType.MD5, chunkRow + "," + chunkCol);

        //Find the chunk using the identifier:
        MATerrainIdentifier chunkIdentifier = null;
        final Collection<MATerrainIdentifier> terrainIdentifiers = DBManager.terrainIdentifier.listForWorld(worldID);
        for (MATerrainIdentifier terrainIdentifier : terrainIdentifiers) {
            if (terrainIdentifier.getChunkPosition().toHash().equals(chunkHash)) {
                chunkIdentifier = terrainIdentifier;
            }
        }

        //Retrieve the chunk by ID, if it exists:
        if (chunkIdentifier != null) {
            return DBManager.terrainChunk.get(chunkIdentifier.getChunkID());
        }
        //If cache and/or database don't have the chunk, generate it and store it:
        else {
            final MATerrainChunk generatedChunk = terrainGenerator.generateChunk(chunkRow, chunkCol);
            DBManager.terrainChunk.create(generatedChunk);
            MAWorld updatedWorld = DBManager.world.get(worldID);
            updatedWorld.addChunk(generatedChunk.getId());
            DBManager.world.update(updatedWorld);
            return generatedChunk;
        }
    }

    /**
     * Retrieves the terrain cells that are within the area of interest of a list of entities.
     * @param playerEntities The list of entities.
     * @return Returns a Map containing the terrain cells.
     */
    public Map<String, MATerrainCellProto> getTerrain(Collection<MAEntity> playerEntities) {

        HashMap<String, MATerrainCellProto> cells = new HashMap<>();

        HashSet<MatrixPosition> chunksNeeded = new HashSet<>();
        for (MAEntity entity : playerEntities) {
            int minRow, maxRow, minCol, maxCol;
            minRow = (int) (entity.getPosition().getRow() - entity.getAreaOfInterest());
            maxRow = (int) (entity.getPosition().getRow() + entity.getAreaOfInterest());
            minCol = (int) (entity.getPosition().getCol() - entity.getAreaOfInterest());
            maxCol = (int) (entity.getPosition().getCol() + entity.getAreaOfInterest());

            final int INCREMENTATION_STEP = (int) Math.min(entity.getAreaOfInterest(), MATerrainChunk.SIZE);

            for (int cellRow = minRow; cellRow <= maxRow; cellRow += INCREMENTATION_STEP) {
                for (int cellCol = minCol; cellCol <= maxCol; cellCol += INCREMENTATION_STEP) {
                    chunksNeeded.add(MATerrainChunk.getChunkPosition(cellRow, cellCol));
                }
            }
        }

        ArrayList<MATerrainChunk> chunks = new ArrayList<>();
        for (MatrixPosition chunkPos : chunksNeeded) {
            if (world.chunkIsInBounds(chunkPos.getRow(), chunkPos.getCol())) {
                //Request the entire chunk:
                MATerrainChunk chunk = requestChunk(chunkPos.getRow(), chunkPos.getCol());
                chunks.add(chunk);
            }
        }

        for (MAEntity entity : playerEntities) {
            for (MATerrainChunk chunk : chunks) {
                //Only include cells from this chunk that are within the AoI:
                for (Map.Entry<String, MATerrainCell> entry : chunk.getCells().entrySet()) {
                    final MatrixPosition position = entry.getValue().getPosition();
                    final double distance = position.distanceTo(entity.getPosition());
                    if (distance <= entity.getAreaOfInterest()) {
                        cells.put(position.toHash(), entry.getValue().toProto().build());
                    }
                }
            }
        }
        return cells;
    }

    /**
     * Retrieves the terrain cells that are within the area of interest of a list of entities.
     * @param playerEntities The list of entities.
     * @return Returns a Map containing the terrain cells.
     */
    public Map<String, MATerrainCellProto> getTerrain(List<MAEntityProto> playerEntities) {

        HashMap<String, MATerrainCellProto> cells = new HashMap<>();

        HashSet<MatrixPosition> chunksNeeded = new HashSet<>();
        for (MAEntityProto entity : playerEntities) {
            int minRow, maxRow, minCol, maxCol;
            minRow = (int) (entity.getPosition().getRow() - entity.getAreaOfInterest());
            maxRow = (int) (entity.getPosition().getRow() + entity.getAreaOfInterest());
            minCol = (int) (entity.getPosition().getCol() - entity.getAreaOfInterest());
            maxCol = (int) (entity.getPosition().getCol() + entity.getAreaOfInterest());

            final int INCREMENTATION_STEP = (int) Math.min(entity.getAreaOfInterest(), MATerrainChunk.SIZE);

            for (int cellRow = minRow; cellRow <= maxRow; cellRow += INCREMENTATION_STEP) {
                for (int cellCol = minCol; cellCol <= maxCol; cellCol += INCREMENTATION_STEP) {
                    chunksNeeded.add(MATerrainChunk.getChunkPosition(cellRow, cellCol));
                }
            }
        }

        ArrayList<MATerrainChunk> chunks = new ArrayList<>();
        for (MatrixPosition chunkPos : chunksNeeded) {
            if (world.chunkIsInBounds(chunkPos.getRow(), chunkPos.getCol())) {
                //Request the entire chunk:
                MATerrainChunk chunk = requestChunk(chunkPos.getRow(), chunkPos.getCol());
                chunks.add(chunk);
            }
        }

        for (MAEntityProto entity : playerEntities) {
            for (MATerrainChunk chunk : chunks) {
                //Only include cells from this chunk that are within the AoI:
                for (Map.Entry<String, MATerrainCell> entry : chunk.getCells().entrySet()) {
                    final MatrixPosition position = entry.getValue().getPosition();
                    final double distance = position.distanceTo(entity.getPosition().toObject());
                    if (distance <= entity.getAreaOfInterest()) {
                        cells.put(position.toHash(), entry.getValue().toProto().build());
                    }
                }
            }
        }
        return cells;
    }

    /**
     * Retrieves the terrain cells that are within the area of interest of a specific position.
     * @param position The position.
     * @param radius The radius of the area of interest.
     * @return Returns a map of terrain cells.
     */
    public Map<String, MATerrainCellProto> getTerrain(MatrixPosition position, float radius) {
        HashMap<String, MATerrainCellProto> cells = new HashMap<>();

        HashSet<MatrixPosition> chunksNeeded = new HashSet<>();
        int minRow, maxRow, minCol, maxCol;
        minRow = (int) (position.getRow() - radius);
        maxRow = (int) (position.getRow() + radius);
        minCol = (int) (position.getCol() - radius);
        maxCol = (int) (position.getCol() + radius);

        final int INCREMENTATION_STEP = (int) Math.min(radius, MATerrainChunk.SIZE);

        for (int cellRow = minRow; cellRow <= maxRow; cellRow += INCREMENTATION_STEP) {
            for (int cellCol = minCol; cellCol <= maxCol; cellCol += INCREMENTATION_STEP) {
                chunksNeeded.add(MATerrainChunk.getChunkPosition(cellRow, cellCol));
            }
        }

        ArrayList<MATerrainChunk> chunks = new ArrayList<>();
        for (MatrixPosition chunkPos : chunksNeeded) {
            if (world.chunkIsInBounds(chunkPos.getRow(), chunkPos.getCol())) {
                //Request the entire chunk:
                MATerrainChunk chunk = requestChunk(chunkPos.getRow(), chunkPos.getCol());
                chunks.add(chunk);
            }
        }

        for (MATerrainChunk chunk : chunks) {
            //Only include cells from this chunk that are within the AoI:
            for (Map.Entry<String, MATerrainCell> entry : chunk.getCells().entrySet()) {
                final MatrixPosition cellPosition = entry.getValue().getPosition();
                final double distance = cellPosition.distanceTo(position);
                if (distance <= radius) {
                    cells.put(cellPosition.toHash(), entry.getValue().toProto().build());
                }
            }
        }
        return cells;
    }

    /**
     * Retrieves the entities that are within the area of interest of a given set of entities.
     * @param playerEntities The entities given.
     * @return Returns a map of entities.
     */
    public Map<String, MAEntityProto> getEntities(Collection<MAEntity> playerEntities) {
        HashMap<String, MAEntityProto> entitiesInAOI = new HashMap<>();
        for (MAEntity e : playerEntities) {
            entitiesInAOI.put(e.getId(), e.toGenericProto().build());
        }
        final Collection<MAEntity> allEntities = DBManager.entity.listForWorld(worldID);
        for (MAEntity providedEntity : playerEntities) {
            for (MAEntity entity : allEntities) {
                if (!providedEntity.getId().equals(entity.getId()) && !entitiesInAOI.containsKey(entity.getId())) {
                    if (providedEntity.getPosition().distanceTo(entity.getPosition()) <= providedEntity.getAreaOfInterest()) {
                        entitiesInAOI.put(entity.getId(), entity.toGenericProto().build());
                    }
                }
            }
        }
        return entitiesInAOI;
    }

    /**
     * Retrieves the entities that are within a radius of a given position.
     * @param position The position given.
     * @param radius The radius.
     * @return Returns a map of entities.
     */
    public Map<String, MAEntityProto> getEntities(MatrixPosition position, float radius) {
        HashMap<String, MAEntityProto> entitiesInAOI = new HashMap<>();
        final Collection<MAEntity> allEntities = DBManager.entity.listForWorld(worldID);
        for (MAEntity entity : allEntities) {
            if (!entitiesInAOI.containsKey(entity.getId())) {
                if (position.distanceTo(entity.getPosition()) <= radius) {
                    entitiesInAOI.put(entity.getId(), entity.toGenericProto().build());
                }
            }
        }
        return entitiesInAOI;
    }

    /**
     * Retrieves a snapshot of the current partial state using a player's entities and their AoI.
     * @param worldSession The world session retrieving the snapshot.
     * @return Returns a PartialStateProto.
     */
    public MAPartialStateProto getPartialStateSnapshot(MAWorldSession worldSession) {
        final Collection<MAEntity> playerEntities = DBManager.entity.listForPlayerAndWorld(worldSession.getPlayerID(), worldSession.getWorldID());
        return MAPartialStateProto.newBuilder()
//                .putAllEntities(getEntities(playerEntities))
                .putAllTerrain(getTerrain(playerEntities))
                .setTimestamp(System.currentTimeMillis())
                .setWorldSession(worldSession.toProto())
                //TODO - Set custom partial state attributes here.
                .build();
    }

    /**
     * Retrieves a snapshot of the current partial state using a position and a radius as an AoI.
     * @param worldSession The world session retrieving the snapshot.
     * @param position The position to retrieve the partial state at.
     * @param radius The radius of the AoI in this partial state.
     * @return Returns a PartialStateProto.
     */
    public MAPartialStateProto getPartialStateSnapshot(MAWorldSession worldSession, MatrixPosition position, float radius) {
        return MAPartialStateProto.newBuilder()
                .putAllEntities(getEntities(position, radius))
                .putAllTerrain(getTerrain(position, radius))
                .setTimestamp(System.currentTimeMillis())
                .setWorldSession(worldSession.toProto())
                //TODO - Set custom partial state attributes here.
                .build();
    }

    /**
     * Saves the state of an <b>entire</b> partial state to the cache/DB.
     * @param partialStateProto The partial state.
     */
    public void saveState(MAPartialStateProto partialStateProto) {
        saveTerrain(partialStateProto);
        saveEntities(partialStateProto);
    }

    /**
     * Saves the state to the cache/DB based on a state update.
     * @param stateUpdateProto The state update.
     */
    public void saveState(MAStateUpdateProto stateUpdateProto) {
        saveTerrain(stateUpdateProto);
        saveEntities(stateUpdateProto);
    }

    /**
     * Saves the terrain of an <b>entire</b> partial state to the cache/DB.
     * @param partialStateProto The partial state.
     */
    public void saveTerrain(MAPartialStateProto partialStateProto) {
        //Get the referenced chunks using the partial state provided:
        final Map<String, MATerrainCellProto> terrainMap = partialStateProto.getTerrainMap();
        HashSet<MatrixPosition> chunkPositions = new HashSet<>();
        for (MATerrainCellProto cell : terrainMap.values()) {
            chunkPositions.add(MATerrainChunk.getChunkPosition(cell.getPosition().toObject()));
        }

        HashMap<String, MATerrainChunk> chunks = new HashMap<>();
        for (MatrixPosition chunkPosition : chunkPositions) {
            final MATerrainChunk chunk = DBManager.terrainChunk.getForWorld(worldID, chunkPosition.toHash());
            chunks.put(chunkPosition.toHash(), chunk);
        }

        //For each cell, find its corresponding chunk and update it:
        for (MATerrainCellProto cell : partialStateProto.getTerrainMap().values()) {
            final MATerrainChunk referencedChunk = chunks.get(MATerrainChunk.getChunkPosition(cell.getPosition().toObject()).toHash());
            referencedChunk.getCells().put(cell.getPosition().toHash(), cell.toObject());
        }

        //Save the chunks:
        for (MATerrainChunk chunk : chunks.values()) {
            DBManager.terrainChunk.update(chunk);
        }
    }

    /**
     * Saves the terrain to the cache/DB based on a state update.
     * @param stateUpdateProto The state update.
     */
    public void saveTerrain(MAStateUpdateProto stateUpdateProto) {
        //Get the referenced chunks using the state update:
        final Map<String, MATerrainCellProto> terrainMap = stateUpdateProto.getPartialState().getTerrainMap();
        HashSet<MatrixPosition> chunkPositions = new HashSet<>();
        for (MATerrainCellProto cell : terrainMap.values()) {
            chunkPositions.add(MATerrainChunk.getChunkPosition(cell.getPosition().toObject()));
        }

        HashMap<String, MATerrainChunk> chunks = new HashMap<>();
        for (MatrixPosition chunkPosition : chunkPositions) {
            final MATerrainChunk chunk = DBManager.terrainChunk.getForWorld(worldID, chunkPosition.toHash());
            chunks.put(chunkPosition.toHash(), chunk);
        }

        //For each cell, find its corresponding chunk and update it:
        for (MATerrainCellProto cell : stateUpdateProto.getPartialState().getTerrainMap().values()) {
            final MATerrainChunk referencedChunk = chunks.get(MATerrainChunk.getChunkPosition(cell.getPosition().toObject()).toHash());
            referencedChunk.getCells().put(cell.getPosition().toHash(), cell.toObject());
        }

        //Save the chunks:
        for (MATerrainChunk chunk : chunks.values()) {
            DBManager.terrainChunk.update(chunk);
        }
    }

    /**
     * Saves the entities of an <b>entire</b> partial state to the cache/DB.
     * @param partialStateProto The partial state.
     */
    public void saveEntities(MAPartialStateProto partialStateProto) {
        for (MAEntityProto entity : partialStateProto.getEntitiesMap().values()) {
        }
    }

    /**
     * Saves the entities to the cache/DB based on a state update.
     * @param stateUpdateProto The state update.
     */
    public void saveEntities(MAStateUpdateProto stateUpdateProto) {
        for (MAEntityProto entity : stateUpdateProto.getPartialState().getEntitiesMap().values()) {
        }
    }

   /**
     * Refreshes the terrain of a particular StateUpdateBuilder using the new entities' AoI.
     * @param entities The old (existing) entities.
     * @param stateUpdateBuilder The builder, which contains the new entities.
     * @return Returns a StateUpdateBuilder.
     */
    public StateUpdateBuilder refreshTerrain(List<MAEntity> entities, StateUpdateBuilder stateUpdateBuilder) {
        final Map<String, MATerrainCellProto> terrain = getTerrain(entities);
        for (MATerrainCellProto terrainCell : terrain.values()) {
            stateUpdateBuilder.addUpdatedTerrain(terrainCell);
        }
        return stateUpdateBuilder;
    }

    /**
     * Refreshes the entities of a particular StateUpdateBuilder.
     * @param stateUpdateBuilder The builder.
     * @return Returns a StateUpdateBuilder.
     */
    public StateUpdateBuilder refreshEntities(MAWorldSession worldSession, StateUpdateBuilder stateUpdateBuilder) {
        final Collection<MAEntity> playerEntities = DBManager.entity.listForPlayerAndWorld(worldSession.getPlayerID(), worldSession.getWorldID());
        final Map<String, MAEntityProto> aoiEntities = getEntities(playerEntities);
        for (MAEntityProto value : aoiEntities.values()) {
            stateUpdateBuilder.addUpdatedEntity(value);
        }
        return stateUpdateBuilder;
    }

    /**
     * Refreshes an existing state's terrain ONLY, using existing entities in the stateUpdateBuilder provided.
     * @param stateUpdateBuilder An existing state update builder, containing the entities created in the last action.
     * @return Returns a StateUpdateBuilder.
     */
    public StateUpdateBuilder checkAndRefreshTerrain(MAWorldSession worldSession, StateUpdateBuilder stateUpdateBuilder) {
        //For each entity, find if the a entity is contained inside it
        final List<MAEntity> entities = new ArrayList<>(DBManager.entity.listForPlayerAndWorld(worldSession.getPlayerID(), worldSession.getWorldID()));

        boolean contained = false;
        outterLoop:
        for (MAEntity existingEntity : entities) {
            for (MAEntityProto createdEntity : stateUpdateBuilder.getUpdatedEntities().values()) {
                if (worldSession.getPlayerID().equals(createdEntity.getPlayerID())) {
                    break outterLoop;
                }
                double distance = existingEntity.getPosition().distanceTo(createdEntity.getPosition().toObject());
                if (distance - createdEntity.getAreaOfInterest() < existingEntity.getAreaOfInterest()) {
                    contained = true;
                    break outterLoop;
                }
            }
        }

        //If not contained, fetch the terrain and any entities associated with it.
        if (!contained) {
            stateUpdateBuilder = refreshTerrain(entities, stateUpdateBuilder);
            stateUpdateBuilder = refreshEntities(worldSession, stateUpdateBuilder);
        }

        return stateUpdateBuilder;
    }

    /**
     * Composes a custom state update, optionally refreshing the terrain and/or entities.
     * Important note: Refreshing terrain/entities may impact the performance of this method significantly. Opt to refresh
     * the terrain and entities only when necessary.
     * @param worldSessionsMap A map of world sessions for which the state must be updated.
     * @param globalStateUpdateBuilder The state update, as provided by the action made.
     * @param refreshEntities Refresh entities?
     * @param refreshTerrain Refresh terrain?
     * @return Returns a StateUpdateProto
     */
    public HashMap<MAWorldSession, UpdateStateResponse> composeStateUpdate(HashMap<MAWorldSession, ArrayList<MAEntity>> worldSessionsMap, StateUpdateBuilder globalStateUpdateBuilder,
                                                 boolean refreshTerrain, boolean refreshEntities) {
        final HashMap<MAWorldSession, UpdateStateResponse> stateUpdateMap = new HashMap<>();
        for (Map.Entry<MAWorldSession, ArrayList<MAEntity>> entry : worldSessionsMap.entrySet()) {
            if (refreshTerrain) {
                globalStateUpdateBuilder = checkAndRefreshTerrain(entry.getKey(), globalStateUpdateBuilder);
            }
            if (refreshEntities) {
                globalStateUpdateBuilder = refreshEntities(entry.getKey(), globalStateUpdateBuilder);
            }
            StateUpdateBuilder individualStateUpdateBuilder = globalStateUpdateBuilder.clone();
            final MAPlayer player = DBManager.player.get(entry.getKey().getPlayerID());

            //If any of the new entities belonging to the player are not within the current AOI of the player's entities, get the terrain around their AOI:
            final Collection<MAEntity> currentPlayerEntities = DBManager.entity.listForPlayerAndWorld(player.getId(), entry.getKey().getWorldID());
            for (MAEntityProto updatedEntity : individualStateUpdateBuilder.getUpdatedEntities().values()) {
                if (updatedEntity.getPlayerID().equals(entry.getKey().getPlayerID())) {
                    for (MAEntity playerEntity : currentPlayerEntities) {
                        if (State.Entities.isOutOfAOI(updatedEntity, playerEntity.toGenericProto().build())) {
                            final Map<String, MATerrainCellProto> newTerrain = getTerrain(updatedEntity.getPosition().toObject(), updatedEntity.getAreaOfInterest());
                            for (Map.Entry<String, MATerrainCellProto> tEntry : newTerrain.entrySet()) {
                                individualStateUpdateBuilder.addUpdatedTerrain(tEntry.getValue());
                            }
                        }
                    }
                }
            }

            final UpdateStateResponse response = UpdateStateResponse.newBuilder()
                    .setStatus(UpdateStateResponse.Status.OK)
                    .setMessage("OK")
                    .setStateUpdate(globalStateUpdateBuilder.build())
                    .build();
            stateUpdateMap.put(entry.getKey(), response);
        }
        return stateUpdateMap;
    }

    /**
     * Returns the active sessions for this world.
     * @return Returns a collection of WorldSessions.
     */
    public Collection<MAWorldSession> getAllSessions() {
        return DBManager.worldSession.listForWorld(worldID);
    }

    /**
     * Returns the subscribed sessions (those receiving state updates) for this world.
     * @return Returns the subscribed sessions of this world.
     */
    public Collection<MAWorldSession> getSubscribedSessions() {
        final List<String> subscribedSessionIDs = DBManager.world.get(worldID).getSubscribedSessionIDs();
        return DBManager.worldSession.getMany(subscribedSessionIDs);
    }

    /**
     * Subscribes a world session to a world.
     * @param worldSession The world session.
     */
    public void subscribe(MAWorldSession worldSession, StreamObserver<UpdateStateResponse> observer) {
        subscribers.put(worldSession, observer);
        final MAWorld world = DBManager.world.get(worldID);
        if (!world.getSubscribedSessionIDs().contains(worldSession.getId())) {
            world.getSubscribedSessionIDs().add(worldSession.getId());
            DBManager.world.update(world);
        }
    }

    /**
     * Unsubscribes a world session.
     * @param worldSession The world session to unsubscribe.
     */
    public void unsubscribe(MAWorldSession worldSession) {        subscribers.remove(worldSession);
        final MAWorld world = DBManager.world.get(worldID);
        world.getSubscribedSessionIDs().remove(worldSession.getId());
        DBManager.world.update(world);
    }

    /**
     * Retrieve the subscribes on this server.
     * @return Returns a map of WorldSession to StreamObserver.
     */
    public HashMap<MAWorldSession, StreamObserver<UpdateStateResponse>> getSubscribers() {
        return subscribers;
    }


}
