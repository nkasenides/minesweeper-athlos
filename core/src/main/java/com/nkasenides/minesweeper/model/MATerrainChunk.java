/* --------------------------------------------------------------------------------
  This file was automatically generated by the Athlos Project Editor.
  Athlos Framework: http://nkasenides.github.io/athlos
  Generated on: 16-11-2021 12:37:22
  Athlos Project Editor, v0.1.0 BETA
-------------------------------------------------------------------------------- */

package com.nkasenides.minesweeper.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.nkasenides.athlos.proto.Transmittable;
import com.nkasenides.athlos.proto.GenericTransmittable;
import com.nkasenides.minesweeper.proto.*;
import com.nkasenides.athlos.model.*;
import com.raylabz.objectis.annotation.ObjectisObject;

@ObjectisObject
public class MATerrainChunk implements ITerrainChunk, Transmittable<MATerrainChunkProto.Builder>, Serializable {

    private HashMap<String, MATerrainCell> cells = new HashMap<>();
    private String worldID;    
    private String id;    
    private MatrixPosition position;

    public MATerrainChunk() { } //NEW

    public Map<String, MATerrainCell> getCells() {
        return cells;        
    }    
    
    public String getWorldID() {    
        return worldID;        
    }    
    
    public String getId() {    
        return id;        
    }    
    
    public MatrixPosition getPosition() {    
        return position;        
    }    
    

    public void setCells(HashMap<String, MATerrainCell> cells) {
        this.cells = cells;        
    }    
    
    public void setWorldID(String worldID) {    
        this.worldID = worldID;        
    }    
    
    public void setId(String id) {    
        this.id = id;        
    }    
    
    public void setPosition(MatrixPosition position) {    
        this.position = position;        
    }    
    

    @Override    
    public com.nkasenides.minesweeper.proto.MATerrainChunkProto.Builder toProto() {    
        com.nkasenides.minesweeper.proto.MATerrainChunkProto.Builder protoBuilder = com.nkasenides.minesweeper.proto.MATerrainChunkProto.newBuilder();        
        HashMap<String,com.nkasenides.minesweeper.proto.MATerrainCellProto> cellsMap = new HashMap<>();        
        for (java.util.Map.Entry<String,com.nkasenides.minesweeper.model.MATerrainCell> entry : cells.entrySet()) {        
            cellsMap.put(entry.getKey(), entry.getValue().toProto().build());            
        }        
        protoBuilder.getCellsMap().putAll(cellsMap);        
        protoBuilder.setWorldID(worldID);        
        protoBuilder.setId(id);        
        protoBuilder.setPosition(position.toProto().build());        
        return protoBuilder;        
    }    
    
    public static final int SIZE = 16;



    /**
     * Utility method.
     * Returns the cellRow offset for a certain cellRow. Used in calculations for a chunk's starting cellRow and column.
     * Note: An offset for a negative position needs to be -1, in order to accommodate for the fact that negative positions start from -1 and not 0.
     * @param cellRow The cell row.
     * @return Returns an offset - will be -1 if the cellRow was negative, 0 if positive.
     */
    private static int getRowOffset(int cellRow) {
        return (cellRow < 0) ? -1 : 0;
    }

    /**
     * Utility method.
     * Returns the column offset for a certain column. Used in calculations for a chunk's starting row and column.
     * Note: An offset for a negative position needs to be -1, in order to accommodate for the fact that negative positions start from -1 and not 0.
     * @param cellCol The cell column.
     * @return Returns an offset - will be -1 if the column was negative, 0 if positive.
     */
    private static int getColOffset(int cellCol) {
        return (cellCol < 0) ? -1 : 0;
    }

    /**
     * Utility method.
     * Calculates the cellRow of a <b>Chunk</b> that contains a cell based on the cellRow of a cell.
     * @param cellRow The <b>cell</b> cellRow.
     * @return Returns the chunk cellRow.
     */
    public static int getChunkRow(int cellRow) {
        if (cellRow % MATerrainChunk.SIZE != 0) {
            return cellRow / MATerrainChunk.SIZE + getRowOffset(cellRow);
        }
        return cellRow / MATerrainChunk.SIZE;
    }

    /**
     * Utility method.
     * Calculates the column of a <b>Chunk</b> that contains a cell based on the column of a cell.
     * @param cellCol The <b>cell</b> column.
     * @return Returns the chunk column.
     */
    public static int getChunkCol(int cellCol) {
        if (cellCol % MATerrainChunk.SIZE != 0) {
            return cellCol / MATerrainChunk.SIZE + getColOffset(cellCol);
        }
        return cellCol / MATerrainChunk.SIZE;
    }

    /**
     * Utility method.
     * Finds the position of a chunk based on a cell's cellRow and cellCol.
     * @param cellRow The cell's cellRow.
     * @param cellCol The cell's column.
     * @return Returns a MatrixPosition2D.
     */
    public static MatrixPosition getChunkPosition(int cellRow, int cellCol) {
        return new MatrixPosition(getChunkRow(cellRow), getChunkCol(cellCol));
    }

    /**
     * Utility method.
     * Finds the cellPosition of a chunk based on a cell's row and column.
     * @param cellPosition The cell cellPosition.
     * @return Returns a MatrixPosition2D.
     */
    public static MatrixPosition getChunkPosition(MatrixPosition cellPosition) {
        return new MatrixPosition(getChunkRow(cellPosition.getRow()), getChunkCol(cellPosition.getCol()));
    }

    /**
     * Utility method.
     * Calculates the start cellRow of the <b>Chunk</b> that contains a cell with a specific cellRow.
     * @param cellRow The cell's cellRow.
     * @return Returns the starting cellRow of the chunk.
     */
    public static int getChunkStartRow(int cellRow) {
        return getChunkRow(cellRow) * MATerrainChunk.SIZE;
    }

    /**
     * Utility method.
     * Calculates a chunk's starting cell row based on the chunk's row.
     * @param chunkRow The chunk row.
     * @return Returns integer.
     */
    public static int getChunkStartRowFromChunkRow(int chunkRow) {
        return chunkRow * MATerrainChunk.SIZE;
    }

    /**
     * Utility method.
     * Calculates the last cellRow of the <b>Chunk</b> that contains a cell with a specific cellRow.
     * @param cellRow The cell's cellRow.
     * @return Returns the last cellRow of the chunk.
     */
    public static int getChunkLastRow(int cellRow) {
        return getChunkStartRow(cellRow) + MATerrainChunk.SIZE - 1;
    }

    /**
     * Utility method.
     * Calculates a chunk's last cell row based on the chunk's row.
     * @param chunkRow The chunk row.
     * @return Returns integer.
     */
    public static int getChunkLastRowFromChunkRow(int chunkRow) {
        return chunkRow * MATerrainChunk.SIZE + MATerrainChunk.SIZE - 1;
    }

    /**
     * Utility method.
     * Calculates the start column of the <b>Chunk</b> that contains a cell with a specific column.
     * @param cellCol The cell's column.
     * @return Returns the starting column of the chunk.
     */
    public static int getChunkStartCol(int cellCol) {
        return getChunkCol(cellCol) * MATerrainChunk.SIZE;
    }

    /**
     * Utility method.
     * Calculates a chunk's starting cell column based on the chunk's column.
     * @param chunkCol The chunk column.
     * @return Returns integer.
     */
    public static int getChunkStartColFromChunkCol(int chunkCol) {
        return chunkCol * MATerrainChunk.SIZE;
    }

    /**
     * Utility method.
     * Calculates the last column of the <b>Chunk</b> that contains a cell with a specific column.
     * @param cellCol The cell's column.
     * @return Returns the last column of the chunk.
     */
    public static int getChunkLastCol(int cellCol) {
        return getChunkStartCol(cellCol) + MATerrainChunk.SIZE - 1;
    }

    /**
     * Utility method.
     * Calculates a chunk's last cell column based on the chunk's column.
     * @param chunkCol The chunk column.
     * @return Returns integer.
     */
    public static int getChunkLastColFromChunkCol(int chunkCol) {
        return chunkCol * MATerrainChunk.SIZE + MATerrainChunk.SIZE - 1;
    }




}