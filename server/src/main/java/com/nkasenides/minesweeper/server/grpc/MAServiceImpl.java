/* --------------------------------------------------------------------------------
  This file was automatically generated by the Athlos Project Editor.
  Athlos Framework: http://nkasenides.github.io/athlos
  Generated on: 16-11-2021 12:37:22
  Athlos Project Editor, v0.1.0 BETA
-------------------------------------------------------------------------------- */

package com.nkasenides.minesweeper.server.grpc;

import com.nkasenides.minesweeper.model.*;
import com.nkasenides.minesweeper.persistence.DBManager;
import com.nkasenides.minesweeper.proto.MAServiceProtoGrpc;

import io.grpc.stub.StreamObserver;

import com.nkasenides.minesweeper.proto.*;

import com.nkasenides.minesweeper.auth.*;

import java.util.Collection;
import java.util.UUID;
import java.util.function.Consumer;


public class MAServiceImpl extends MAServiceProtoGrpc.MAServiceProtoImplBase {
    @Override    
    public void listGames(ListGamesRequest request, StreamObserver<ListGameResponse> responseObserver) {
        //NEW
        final Collection<MAWorld> worlds = DBManager.world.list();
        ListGameResponse.Builder response = ListGameResponse.newBuilder()
                .setStatus(ListGameResponse.Status.OK)
                .setMessage("GAMES_LISTED");

        worlds.forEach(maWorld -> response.addWorlds(maWorld.toProto().build()));
        responseObserver.onNext(response.build());
    }    
    
    @Override    
    public void startGame(StartGameRequest request, StreamObserver<StartGameResponse> responseObserver) {    

    }    
    
    @Override    
    public void move(MoveRequest request, StreamObserver<MoveResponse> responseObserver) {    
        super.move(request, responseObserver);        
        //TODO - Implement this service.        
    }    
    
    @Override    
    public void createGame(CreateGameRequest request, StreamObserver<CreateGameResponse> responseObserver) {    
        super.createGame(request, responseObserver);        
        //TODO - Implement this service.        
    }    
    
    @Override    
    public void getState(GetStateRequest request, StreamObserver<GetStateResponse> responseObserver) {    
        super.getState(request, responseObserver);        
        //TODO - Implement this service.        
    }    
    
    @Override    
    public void subscribe(SubscribeRequest request, StreamObserver<SubscribeResponse> responseObserver) {    
        super.subscribe(request, responseObserver);        
        //TODO - Implement this service.        
    }    
    
    @Override    
    public void joinGame(JoinGameRequest request, StreamObserver<JoinGameResponse> responseObserver) {
        //NEW

        //Check game session:
        final MAGameSession gameSession = DBManager.gameSession.get(request.getGameSessionID());
        if (gameSession == null) {
            final JoinGameResponse response = JoinGameResponse.newBuilder()
                    .setStatus(JoinGameResponse.Status.INVALID_GAME_SESSION_ID)
                    .setMessage("INVALID_GAME_SESSION_ID")
                    .build();
            responseObserver.onNext(response);
            return;
        }

        //Check world:
        final MAWorld world = DBManager.world.get(request.getGameID());
        if (world == null) {
            final JoinGameResponse response = JoinGameResponse.newBuilder()
                    .setStatus(JoinGameResponse.Status.CANNOT_JOIN)
                    .setMessage("CANNOT_FIND_WORLD")
                    .build();
            responseObserver.onNext(response);
            return;
        }

        final PartialStatePreferenceProto partialStatePreference = request.getPartialStatePreference();

        //Check max players:
        final Collection<MAWorldSession> worldSessionsForWorld = DBManager.worldSession.listForWorld(world.getId());
        if (worldSessionsForWorld.size() >= world.getMaxPlayers()) {
            final JoinGameResponse response = JoinGameResponse.newBuilder()
                    .setStatus(JoinGameResponse.Status.CANNOT_JOIN)
                    .setMessage("MAX_PLAYERS_REACHED")
                    .build();
            responseObserver.onNext(response);
            return;
        }

        MAWorldSession playerWorldSession = DBManager.worldSession.getForPlayerAndWorld(gameSession.getPlayerID(), world.getId());
        if (playerWorldSession != null) {
            final JoinGameResponse response = JoinGameResponse.newBuilder()
                    .setStatus(JoinGameResponse.Status.OK)
                    .setMessage("OK")
                    .setWorldSession(playerWorldSession.toProto().build())
                    .build();
            responseObserver.onNext(response);
        }
        else {
            final MAPlayer player = DBManager.player.get(gameSession.getPlayerID());

            playerWorldSession = new MAWorldSession();
            playerWorldSession.setId(UUID.randomUUID().toString());
            playerWorldSession.setWorldID(world.getId());
            playerWorldSession.setPlayerID(gameSession.getPlayerID());
            playerWorldSession.setPlayerName(player.getName());
            playerWorldSession.setCameraPosition(new MatrixPosition(0, 0));
            playerWorldSession.setCreatedOn(System.currentTimeMillis());
            playerWorldSession.setExpiresOn(System.currentTimeMillis() + 3600 * 24 * 5);
            playerWorldSession.setIpAddress("");
            playerWorldSession.setPoints(0);
            playerWorldSession.setPartialStatePreference(partialStatePreference.toObject());
            DBManager.worldSession.create(playerWorldSession);

            final JoinGameResponse response = JoinGameResponse.newBuilder()
                    .setStatus(JoinGameResponse.Status.OK)
                    .setMessage("OK")
                    .setWorldSession(playerWorldSession.toProto().build())
                    .build();
            responseObserver.onNext(response);

        }
    }    
    
    @Override    
    public void viewGame(ViewGameRequest request, StreamObserver<ViewGameResponse> responseObserver) {    
        super.viewGame(request, responseObserver);        
        //TODO - Implement this service.        
    }    
    
    @Override    
    public void flag(FlagRequest request, StreamObserver<RevealResponse> responseObserver) {    
        super.flag(request, responseObserver);        
        //TODO - Implement this service.        
    }    
    
    @Override    
    public void reveal(RevealRequest request, StreamObserver<RevealResponse> responseObserver) {    
        super.reveal(request, responseObserver);        
        //TODO - Implement this service.        
    }    
    
}
