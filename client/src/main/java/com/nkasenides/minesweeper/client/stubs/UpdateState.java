/* --------------------------------------------------------------------------------
  This file was automatically generated by the Athlos Project Editor.
  Athlos Framework: http://nkasenides.github.io/athlos
  Generated on: 23-11-2021 11:16:51
  Athlos Project Editor, v0.1.0 BETA
-------------------------------------------------------------------------------- */

package com.nkasenides.minesweeper.client.stubs;


import com.nkasenides.minesweeper.client.MAClient;
import com.nkasenides.minesweeper.proto.*;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;


public class UpdateState {

    private final MAServiceProtoGrpc.MAServiceProtoStub asyncStub;
    private final StreamObserver<UpdateStateRequest> sender;
    private final MAClient client;

    public UpdateState(MAServiceProtoGrpc.MAServiceProtoStub asyncStub, MAClient client) {
        this.client = client;
        this.asyncStub = asyncStub;
        sender = asyncStub.updateState(new StreamObserver<UpdateStateResponse>() {
            @Override
            public void onNext(UpdateStateResponse response) {
                if (response.getStatus() == UpdateStateResponse.Status.OK) {
                    final MAPartialStateProto partialState = response.getStateUpdate().getPartialState();
                    client.setWorldSession(partialState.getWorldSession().toObject());
                    client.setGameState(partialState.getGameState());
                    client.setBoard(new HashMap<>(partialState.getTerrainMap()));
                    MAClient.gameForm.update();
                }
                else {
                    System.err.println("Error - could not update state: " + response.getMessage());
                }

            }

            @Override
            public void onError(Throwable throwable) {
                //TODO - Handle exception
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                //TODO - Implement
            }
        });
    }

    public UpdateState send(Collection<UpdateStateRequest> requests) {
        for (UpdateStateRequest request : requests) {
            sender.onNext(request);
        }
        return this;
    }

    public UpdateState send(UpdateStateRequest... requests) {
        for (UpdateStateRequest request : requests) {
            sender.onNext(request);
        }
        return this;
    }

    public UpdateState terminate() {
        sender.onCompleted();
        return this;
    }

}
