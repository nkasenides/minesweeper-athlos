/* --------------------------------------------------------------------------------
  This file was automatically generated by the Athlos Project Editor.
  Athlos Framework: http://nkasenides.github.io/athlos
  Generated on: 16-11-2021 12:37:22
  Athlos Project Editor, v0.1.0 BETA
-------------------------------------------------------------------------------- */

package com.nkasenides.minesweeper.client.stubs;


import com.nkasenides.minesweeper.proto.*;
import io.grpc.stub.StreamObserver;
import java.util.Iterator;
import java.util.Collection;


public class ViewGame {

    private final MAServiceProtoGrpc.MAServiceProtoBlockingStub blockingStub;
    private final MAServiceProtoGrpc.MAServiceProtoStub asyncStub;

    public ViewGame(MAServiceProtoGrpc.MAServiceProtoBlockingStub blockingStub, MAServiceProtoGrpc.MAServiceProtoStub asyncStub) {
        this.blockingStub = blockingStub;
        this.asyncStub = asyncStub;
    }

    public ViewGameResponse sendAndWait(ViewGameRequest request) {
        return blockingStub.viewGame(request);
    }

    public void send(ViewGameRequest request) {
        asyncStub.viewGame(request, new StreamObserver<ViewGameResponse>() {
            @Override
            public void onNext(ViewGameResponse response) {
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

            public void onReceive(ViewGameResponse response) {
                //TODO - Implement
            }
        });
    }
}
