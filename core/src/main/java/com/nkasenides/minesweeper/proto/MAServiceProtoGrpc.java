package com.nkasenides.minesweeper.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.0)",
    comments = "Source: MProto.proto")
public final class MAServiceProtoGrpc {

  private MAServiceProtoGrpc() {}

  public static final String SERVICE_NAME = "com.nkasenides.minesweeper.proto.MAServiceProto";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.StartGameRequest,
      com.nkasenides.minesweeper.proto.StartGameResponse> getListGamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGames",
      requestType = com.nkasenides.minesweeper.proto.StartGameRequest.class,
      responseType = com.nkasenides.minesweeper.proto.StartGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.StartGameRequest,
      com.nkasenides.minesweeper.proto.StartGameResponse> getListGamesMethod() {
    io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.StartGameRequest, com.nkasenides.minesweeper.proto.StartGameResponse> getListGamesMethod;
    if ((getListGamesMethod = MAServiceProtoGrpc.getListGamesMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getListGamesMethod = MAServiceProtoGrpc.getListGamesMethod) == null) {
          MAServiceProtoGrpc.getListGamesMethod = getListGamesMethod =
              io.grpc.MethodDescriptor.<com.nkasenides.minesweeper.proto.StartGameRequest, com.nkasenides.minesweeper.proto.StartGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.StartGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.StartGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("ListGames"))
              .build();
        }
      }
    }
    return getListGamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.StartGameRequest,
      com.nkasenides.minesweeper.proto.StartGameResponse> getStartGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartGame",
      requestType = com.nkasenides.minesweeper.proto.StartGameRequest.class,
      responseType = com.nkasenides.minesweeper.proto.StartGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.StartGameRequest,
      com.nkasenides.minesweeper.proto.StartGameResponse> getStartGameMethod() {
    io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.StartGameRequest, com.nkasenides.minesweeper.proto.StartGameResponse> getStartGameMethod;
    if ((getStartGameMethod = MAServiceProtoGrpc.getStartGameMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getStartGameMethod = MAServiceProtoGrpc.getStartGameMethod) == null) {
          MAServiceProtoGrpc.getStartGameMethod = getStartGameMethod =
              io.grpc.MethodDescriptor.<com.nkasenides.minesweeper.proto.StartGameRequest, com.nkasenides.minesweeper.proto.StartGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.StartGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.StartGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("StartGame"))
              .build();
        }
      }
    }
    return getStartGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.MoveRequest,
      com.nkasenides.minesweeper.proto.MoveResponse> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = com.nkasenides.minesweeper.proto.MoveRequest.class,
      responseType = com.nkasenides.minesweeper.proto.MoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.MoveRequest,
      com.nkasenides.minesweeper.proto.MoveResponse> getMoveMethod() {
    io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.MoveRequest, com.nkasenides.minesweeper.proto.MoveResponse> getMoveMethod;
    if ((getMoveMethod = MAServiceProtoGrpc.getMoveMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getMoveMethod = MAServiceProtoGrpc.getMoveMethod) == null) {
          MAServiceProtoGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<com.nkasenides.minesweeper.proto.MoveRequest, com.nkasenides.minesweeper.proto.MoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.MoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.MoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.CreateGameRequest,
      com.nkasenides.minesweeper.proto.CreateGameResponse> getCreateGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGame",
      requestType = com.nkasenides.minesweeper.proto.CreateGameRequest.class,
      responseType = com.nkasenides.minesweeper.proto.CreateGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.CreateGameRequest,
      com.nkasenides.minesweeper.proto.CreateGameResponse> getCreateGameMethod() {
    io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.CreateGameRequest, com.nkasenides.minesweeper.proto.CreateGameResponse> getCreateGameMethod;
    if ((getCreateGameMethod = MAServiceProtoGrpc.getCreateGameMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getCreateGameMethod = MAServiceProtoGrpc.getCreateGameMethod) == null) {
          MAServiceProtoGrpc.getCreateGameMethod = getCreateGameMethod =
              io.grpc.MethodDescriptor.<com.nkasenides.minesweeper.proto.CreateGameRequest, com.nkasenides.minesweeper.proto.CreateGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.CreateGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.CreateGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("CreateGame"))
              .build();
        }
      }
    }
    return getCreateGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.GetStateRequest,
      com.nkasenides.minesweeper.proto.GetStateResponse> getGetStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetState",
      requestType = com.nkasenides.minesweeper.proto.GetStateRequest.class,
      responseType = com.nkasenides.minesweeper.proto.GetStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.GetStateRequest,
      com.nkasenides.minesweeper.proto.GetStateResponse> getGetStateMethod() {
    io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.GetStateRequest, com.nkasenides.minesweeper.proto.GetStateResponse> getGetStateMethod;
    if ((getGetStateMethod = MAServiceProtoGrpc.getGetStateMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getGetStateMethod = MAServiceProtoGrpc.getGetStateMethod) == null) {
          MAServiceProtoGrpc.getGetStateMethod = getGetStateMethod =
              io.grpc.MethodDescriptor.<com.nkasenides.minesweeper.proto.GetStateRequest, com.nkasenides.minesweeper.proto.GetStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.GetStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.GetStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("GetState"))
              .build();
        }
      }
    }
    return getGetStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.SubscribeRequest,
      com.nkasenides.minesweeper.proto.SubscribeResponse> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = com.nkasenides.minesweeper.proto.SubscribeRequest.class,
      responseType = com.nkasenides.minesweeper.proto.SubscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.SubscribeRequest,
      com.nkasenides.minesweeper.proto.SubscribeResponse> getSubscribeMethod() {
    io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.SubscribeRequest, com.nkasenides.minesweeper.proto.SubscribeResponse> getSubscribeMethod;
    if ((getSubscribeMethod = MAServiceProtoGrpc.getSubscribeMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getSubscribeMethod = MAServiceProtoGrpc.getSubscribeMethod) == null) {
          MAServiceProtoGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<com.nkasenides.minesweeper.proto.SubscribeRequest, com.nkasenides.minesweeper.proto.SubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.SubscribeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.JoinGameRequest,
      com.nkasenides.minesweeper.proto.JoinGameResponse> getJoinGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinGame",
      requestType = com.nkasenides.minesweeper.proto.JoinGameRequest.class,
      responseType = com.nkasenides.minesweeper.proto.JoinGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.JoinGameRequest,
      com.nkasenides.minesweeper.proto.JoinGameResponse> getJoinGameMethod() {
    io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.JoinGameRequest, com.nkasenides.minesweeper.proto.JoinGameResponse> getJoinGameMethod;
    if ((getJoinGameMethod = MAServiceProtoGrpc.getJoinGameMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getJoinGameMethod = MAServiceProtoGrpc.getJoinGameMethod) == null) {
          MAServiceProtoGrpc.getJoinGameMethod = getJoinGameMethod =
              io.grpc.MethodDescriptor.<com.nkasenides.minesweeper.proto.JoinGameRequest, com.nkasenides.minesweeper.proto.JoinGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.JoinGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.JoinGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("JoinGame"))
              .build();
        }
      }
    }
    return getJoinGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.ViewGameRequest,
      com.nkasenides.minesweeper.proto.ViewGameResponse> getViewGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewGame",
      requestType = com.nkasenides.minesweeper.proto.ViewGameRequest.class,
      responseType = com.nkasenides.minesweeper.proto.ViewGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.ViewGameRequest,
      com.nkasenides.minesweeper.proto.ViewGameResponse> getViewGameMethod() {
    io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.ViewGameRequest, com.nkasenides.minesweeper.proto.ViewGameResponse> getViewGameMethod;
    if ((getViewGameMethod = MAServiceProtoGrpc.getViewGameMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getViewGameMethod = MAServiceProtoGrpc.getViewGameMethod) == null) {
          MAServiceProtoGrpc.getViewGameMethod = getViewGameMethod =
              io.grpc.MethodDescriptor.<com.nkasenides.minesweeper.proto.ViewGameRequest, com.nkasenides.minesweeper.proto.ViewGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.ViewGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.ViewGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("ViewGame"))
              .build();
        }
      }
    }
    return getViewGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.FlagRequest,
      com.nkasenides.minesweeper.proto.RevealResponse> getFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Flag",
      requestType = com.nkasenides.minesweeper.proto.FlagRequest.class,
      responseType = com.nkasenides.minesweeper.proto.RevealResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.FlagRequest,
      com.nkasenides.minesweeper.proto.RevealResponse> getFlagMethod() {
    io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.FlagRequest, com.nkasenides.minesweeper.proto.RevealResponse> getFlagMethod;
    if ((getFlagMethod = MAServiceProtoGrpc.getFlagMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getFlagMethod = MAServiceProtoGrpc.getFlagMethod) == null) {
          MAServiceProtoGrpc.getFlagMethod = getFlagMethod =
              io.grpc.MethodDescriptor.<com.nkasenides.minesweeper.proto.FlagRequest, com.nkasenides.minesweeper.proto.RevealResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Flag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.FlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.RevealResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("Flag"))
              .build();
        }
      }
    }
    return getFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.RevealRequest,
      com.nkasenides.minesweeper.proto.RevealResponse> getRevealMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reveal",
      requestType = com.nkasenides.minesweeper.proto.RevealRequest.class,
      responseType = com.nkasenides.minesweeper.proto.RevealResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.RevealRequest,
      com.nkasenides.minesweeper.proto.RevealResponse> getRevealMethod() {
    io.grpc.MethodDescriptor<com.nkasenides.minesweeper.proto.RevealRequest, com.nkasenides.minesweeper.proto.RevealResponse> getRevealMethod;
    if ((getRevealMethod = MAServiceProtoGrpc.getRevealMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getRevealMethod = MAServiceProtoGrpc.getRevealMethod) == null) {
          MAServiceProtoGrpc.getRevealMethod = getRevealMethod =
              io.grpc.MethodDescriptor.<com.nkasenides.minesweeper.proto.RevealRequest, com.nkasenides.minesweeper.proto.RevealResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reveal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.RevealRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nkasenides.minesweeper.proto.RevealResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("Reveal"))
              .build();
        }
      }
    }
    return getRevealMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MAServiceProtoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MAServiceProtoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MAServiceProtoStub>() {
        @java.lang.Override
        public MAServiceProtoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MAServiceProtoStub(channel, callOptions);
        }
      };
    return MAServiceProtoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MAServiceProtoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MAServiceProtoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MAServiceProtoBlockingStub>() {
        @java.lang.Override
        public MAServiceProtoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MAServiceProtoBlockingStub(channel, callOptions);
        }
      };
    return MAServiceProtoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MAServiceProtoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MAServiceProtoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MAServiceProtoFutureStub>() {
        @java.lang.Override
        public MAServiceProtoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MAServiceProtoFutureStub(channel, callOptions);
        }
      };
    return MAServiceProtoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MAServiceProtoImplBase implements io.grpc.BindableService {

    /**
     */
    public void listGames(com.nkasenides.minesweeper.proto.StartGameRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.StartGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListGamesMethod(), responseObserver);
    }

    /**
     */
    public void startGame(com.nkasenides.minesweeper.proto.StartGameRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.StartGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartGameMethod(), responseObserver);
    }

    /**
     */
    public void move(com.nkasenides.minesweeper.proto.MoveRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.MoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     */
    public void createGame(com.nkasenides.minesweeper.proto.CreateGameRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.CreateGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGameMethod(), responseObserver);
    }

    /**
     */
    public void getState(com.nkasenides.minesweeper.proto.GetStateRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.GetStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStateMethod(), responseObserver);
    }

    /**
     */
    public void subscribe(com.nkasenides.minesweeper.proto.SubscribeRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.SubscribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     */
    public void joinGame(com.nkasenides.minesweeper.proto.JoinGameRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.JoinGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinGameMethod(), responseObserver);
    }

    /**
     */
    public void viewGame(com.nkasenides.minesweeper.proto.ViewGameRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.ViewGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getViewGameMethod(), responseObserver);
    }

    /**
     */
    public void flag(com.nkasenides.minesweeper.proto.FlagRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.RevealResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFlagMethod(), responseObserver);
    }

    /**
     */
    public void reveal(com.nkasenides.minesweeper.proto.RevealRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.RevealResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRevealMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListGamesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nkasenides.minesweeper.proto.StartGameRequest,
                com.nkasenides.minesweeper.proto.StartGameResponse>(
                  this, METHODID_LIST_GAMES)))
          .addMethod(
            getStartGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nkasenides.minesweeper.proto.StartGameRequest,
                com.nkasenides.minesweeper.proto.StartGameResponse>(
                  this, METHODID_START_GAME)))
          .addMethod(
            getMoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nkasenides.minesweeper.proto.MoveRequest,
                com.nkasenides.minesweeper.proto.MoveResponse>(
                  this, METHODID_MOVE)))
          .addMethod(
            getCreateGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nkasenides.minesweeper.proto.CreateGameRequest,
                com.nkasenides.minesweeper.proto.CreateGameResponse>(
                  this, METHODID_CREATE_GAME)))
          .addMethod(
            getGetStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nkasenides.minesweeper.proto.GetStateRequest,
                com.nkasenides.minesweeper.proto.GetStateResponse>(
                  this, METHODID_GET_STATE)))
          .addMethod(
            getSubscribeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nkasenides.minesweeper.proto.SubscribeRequest,
                com.nkasenides.minesweeper.proto.SubscribeResponse>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getJoinGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nkasenides.minesweeper.proto.JoinGameRequest,
                com.nkasenides.minesweeper.proto.JoinGameResponse>(
                  this, METHODID_JOIN_GAME)))
          .addMethod(
            getViewGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nkasenides.minesweeper.proto.ViewGameRequest,
                com.nkasenides.minesweeper.proto.ViewGameResponse>(
                  this, METHODID_VIEW_GAME)))
          .addMethod(
            getFlagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nkasenides.minesweeper.proto.FlagRequest,
                com.nkasenides.minesweeper.proto.RevealResponse>(
                  this, METHODID_FLAG)))
          .addMethod(
            getRevealMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nkasenides.minesweeper.proto.RevealRequest,
                com.nkasenides.minesweeper.proto.RevealResponse>(
                  this, METHODID_REVEAL)))
          .build();
    }
  }

  /**
   */
  public static final class MAServiceProtoStub extends io.grpc.stub.AbstractAsyncStub<MAServiceProtoStub> {
    private MAServiceProtoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MAServiceProtoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MAServiceProtoStub(channel, callOptions);
    }

    /**
     */
    public void listGames(com.nkasenides.minesweeper.proto.StartGameRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.StartGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startGame(com.nkasenides.minesweeper.proto.StartGameRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.StartGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void move(com.nkasenides.minesweeper.proto.MoveRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.MoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGame(com.nkasenides.minesweeper.proto.CreateGameRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.CreateGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getState(com.nkasenides.minesweeper.proto.GetStateRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.GetStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribe(com.nkasenides.minesweeper.proto.SubscribeRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.SubscribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinGame(com.nkasenides.minesweeper.proto.JoinGameRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.JoinGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewGame(com.nkasenides.minesweeper.proto.ViewGameRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.ViewGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void flag(com.nkasenides.minesweeper.proto.FlagRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.RevealResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reveal(com.nkasenides.minesweeper.proto.RevealRequest request,
        io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.RevealResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevealMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MAServiceProtoBlockingStub extends io.grpc.stub.AbstractBlockingStub<MAServiceProtoBlockingStub> {
    private MAServiceProtoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MAServiceProtoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MAServiceProtoBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.nkasenides.minesweeper.proto.StartGameResponse listGames(com.nkasenides.minesweeper.proto.StartGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getListGamesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nkasenides.minesweeper.proto.StartGameResponse startGame(com.nkasenides.minesweeper.proto.StartGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nkasenides.minesweeper.proto.MoveResponse move(com.nkasenides.minesweeper.proto.MoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nkasenides.minesweeper.proto.CreateGameResponse createGame(com.nkasenides.minesweeper.proto.CreateGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nkasenides.minesweeper.proto.GetStateResponse getState(com.nkasenides.minesweeper.proto.GetStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nkasenides.minesweeper.proto.SubscribeResponse subscribe(com.nkasenides.minesweeper.proto.SubscribeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nkasenides.minesweeper.proto.JoinGameResponse joinGame(com.nkasenides.minesweeper.proto.JoinGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getJoinGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nkasenides.minesweeper.proto.ViewGameResponse viewGame(com.nkasenides.minesweeper.proto.ViewGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getViewGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nkasenides.minesweeper.proto.RevealResponse flag(com.nkasenides.minesweeper.proto.FlagRequest request) {
      return blockingUnaryCall(
          getChannel(), getFlagMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.nkasenides.minesweeper.proto.RevealResponse reveal(com.nkasenides.minesweeper.proto.RevealRequest request) {
      return blockingUnaryCall(
          getChannel(), getRevealMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MAServiceProtoFutureStub extends io.grpc.stub.AbstractFutureStub<MAServiceProtoFutureStub> {
    private MAServiceProtoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MAServiceProtoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MAServiceProtoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nkasenides.minesweeper.proto.StartGameResponse> listGames(
        com.nkasenides.minesweeper.proto.StartGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGamesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nkasenides.minesweeper.proto.StartGameResponse> startGame(
        com.nkasenides.minesweeper.proto.StartGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nkasenides.minesweeper.proto.MoveResponse> move(
        com.nkasenides.minesweeper.proto.MoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nkasenides.minesweeper.proto.CreateGameResponse> createGame(
        com.nkasenides.minesweeper.proto.CreateGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nkasenides.minesweeper.proto.GetStateResponse> getState(
        com.nkasenides.minesweeper.proto.GetStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nkasenides.minesweeper.proto.SubscribeResponse> subscribe(
        com.nkasenides.minesweeper.proto.SubscribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nkasenides.minesweeper.proto.JoinGameResponse> joinGame(
        com.nkasenides.minesweeper.proto.JoinGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nkasenides.minesweeper.proto.ViewGameResponse> viewGame(
        com.nkasenides.minesweeper.proto.ViewGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getViewGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nkasenides.minesweeper.proto.RevealResponse> flag(
        com.nkasenides.minesweeper.proto.FlagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFlagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nkasenides.minesweeper.proto.RevealResponse> reveal(
        com.nkasenides.minesweeper.proto.RevealRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRevealMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_GAMES = 0;
  private static final int METHODID_START_GAME = 1;
  private static final int METHODID_MOVE = 2;
  private static final int METHODID_CREATE_GAME = 3;
  private static final int METHODID_GET_STATE = 4;
  private static final int METHODID_SUBSCRIBE = 5;
  private static final int METHODID_JOIN_GAME = 6;
  private static final int METHODID_VIEW_GAME = 7;
  private static final int METHODID_FLAG = 8;
  private static final int METHODID_REVEAL = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MAServiceProtoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MAServiceProtoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_GAMES:
          serviceImpl.listGames((com.nkasenides.minesweeper.proto.StartGameRequest) request,
              (io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.StartGameResponse>) responseObserver);
          break;
        case METHODID_START_GAME:
          serviceImpl.startGame((com.nkasenides.minesweeper.proto.StartGameRequest) request,
              (io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.StartGameResponse>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((com.nkasenides.minesweeper.proto.MoveRequest) request,
              (io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.MoveResponse>) responseObserver);
          break;
        case METHODID_CREATE_GAME:
          serviceImpl.createGame((com.nkasenides.minesweeper.proto.CreateGameRequest) request,
              (io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.CreateGameResponse>) responseObserver);
          break;
        case METHODID_GET_STATE:
          serviceImpl.getState((com.nkasenides.minesweeper.proto.GetStateRequest) request,
              (io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.GetStateResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((com.nkasenides.minesweeper.proto.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.SubscribeResponse>) responseObserver);
          break;
        case METHODID_JOIN_GAME:
          serviceImpl.joinGame((com.nkasenides.minesweeper.proto.JoinGameRequest) request,
              (io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.JoinGameResponse>) responseObserver);
          break;
        case METHODID_VIEW_GAME:
          serviceImpl.viewGame((com.nkasenides.minesweeper.proto.ViewGameRequest) request,
              (io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.ViewGameResponse>) responseObserver);
          break;
        case METHODID_FLAG:
          serviceImpl.flag((com.nkasenides.minesweeper.proto.FlagRequest) request,
              (io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.RevealResponse>) responseObserver);
          break;
        case METHODID_REVEAL:
          serviceImpl.reveal((com.nkasenides.minesweeper.proto.RevealRequest) request,
              (io.grpc.stub.StreamObserver<com.nkasenides.minesweeper.proto.RevealResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MAServiceProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MAServiceProtoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nkasenides.minesweeper.proto.MProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MAServiceProto");
    }
  }

  private static final class MAServiceProtoFileDescriptorSupplier
      extends MAServiceProtoBaseDescriptorSupplier {
    MAServiceProtoFileDescriptorSupplier() {}
  }

  private static final class MAServiceProtoMethodDescriptorSupplier
      extends MAServiceProtoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MAServiceProtoMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MAServiceProtoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MAServiceProtoFileDescriptorSupplier())
              .addMethod(getListGamesMethod())
              .addMethod(getStartGameMethod())
              .addMethod(getMoveMethod())
              .addMethod(getCreateGameMethod())
              .addMethod(getGetStateMethod())
              .addMethod(getSubscribeMethod())
              .addMethod(getJoinGameMethod())
              .addMethod(getViewGameMethod())
              .addMethod(getFlagMethod())
              .addMethod(getRevealMethod())
              .build();
        }
      }
    }
    return result;
  }
}
