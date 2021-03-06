/* --------------------------------------------------------------------------------
  This file was automatically generated by the Athlos Project Editor.
  Athlos Framework: http://nkasenides.github.io/athlos
  Generated on: 20-11-2021 11:53:52
  Athlos Project Editor, v0.1.0 BETA
-------------------------------------------------------------------------------- */

package com.nkasenides.minesweeper.client.stubs;


import com.nkasenides.minesweeper.proto.*;
import io.grpc.stub.StreamObserver;
import java.util.Iterator;
import java.util.Collection;


public class StartGame {

    private final MAServiceProtoGrpc.MAServiceProtoBlockingStub blockingStub;
    private final MAServiceProtoGrpc.MAServiceProtoStub asyncStub;

    public StartGame(MAServiceProtoGrpc.MAServiceProtoBlockingStub blockingStub, MAServiceProtoGrpc.MAServiceProtoStub asyncStub) {
        this.blockingStub = blockingStub;
        this.asyncStub = asyncStub;
    }

    public StartGameResponse sendAndWait(StartGameRequest request) {
        return blockingStub.startGame(request);
    }

    public void send(StartGameRequest request) {
        asyncStub.startGame(request, new StreamObserver<StartGameResponse>() {
            @Override
            public void onNext(StartGameResponse response) {
                onReceive(response);
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

            public void onReceive(StartGameResponse response) {
                //TODO - Implement
            }
        });
    }
}
