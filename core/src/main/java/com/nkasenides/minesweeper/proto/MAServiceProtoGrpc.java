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
  private static volatile io.grpc.MethodDescriptor<ListGamesRequest,
      ListGameResponse> getListGamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListGames",
      requestType = ListGamesRequest.class,
      responseType = ListGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ListGamesRequest,
      ListGameResponse> getListGamesMethod() {
    io.grpc.MethodDescriptor<ListGamesRequest, ListGameResponse> getListGamesMethod;
    if ((getListGamesMethod = MAServiceProtoGrpc.getListGamesMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getListGamesMethod = MAServiceProtoGrpc.getListGamesMethod) == null) {
          MAServiceProtoGrpc.getListGamesMethod = getListGamesMethod =
              io.grpc.MethodDescriptor.<ListGamesRequest, ListGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListGames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListGamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("ListGames"))
              .build();
        }
      }
    }
    return getListGamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<StartGameRequest,
      StartGameResponse> getStartGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartGame",
      requestType = StartGameRequest.class,
      responseType = StartGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<StartGameRequest,
      StartGameResponse> getStartGameMethod() {
    io.grpc.MethodDescriptor<StartGameRequest, StartGameResponse> getStartGameMethod;
    if ((getStartGameMethod = MAServiceProtoGrpc.getStartGameMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getStartGameMethod = MAServiceProtoGrpc.getStartGameMethod) == null) {
          MAServiceProtoGrpc.getStartGameMethod = getStartGameMethod =
              io.grpc.MethodDescriptor.<StartGameRequest, StartGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StartGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StartGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("StartGame"))
              .build();
        }
      }
    }
    return getStartGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<MoveRequest,
      MoveResponse> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Move",
      requestType = MoveRequest.class,
      responseType = MoveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MoveRequest,
      MoveResponse> getMoveMethod() {
    io.grpc.MethodDescriptor<MoveRequest, MoveResponse> getMoveMethod;
    if ((getMoveMethod = MAServiceProtoGrpc.getMoveMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getMoveMethod = MAServiceProtoGrpc.getMoveMethod) == null) {
          MAServiceProtoGrpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<MoveRequest, MoveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MoveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MoveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("Move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<CreateGameRequest,
      CreateGameResponse> getCreateGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGame",
      requestType = CreateGameRequest.class,
      responseType = CreateGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<CreateGameRequest,
      CreateGameResponse> getCreateGameMethod() {
    io.grpc.MethodDescriptor<CreateGameRequest, CreateGameResponse> getCreateGameMethod;
    if ((getCreateGameMethod = MAServiceProtoGrpc.getCreateGameMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getCreateGameMethod = MAServiceProtoGrpc.getCreateGameMethod) == null) {
          MAServiceProtoGrpc.getCreateGameMethod = getCreateGameMethod =
              io.grpc.MethodDescriptor.<CreateGameRequest, CreateGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CreateGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CreateGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("CreateGame"))
              .build();
        }
      }
    }
    return getCreateGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetStateRequest,
      GetStateResponse> getGetStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetState",
      requestType = GetStateRequest.class,
      responseType = GetStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetStateRequest,
      GetStateResponse> getGetStateMethod() {
    io.grpc.MethodDescriptor<GetStateRequest, GetStateResponse> getGetStateMethod;
    if ((getGetStateMethod = MAServiceProtoGrpc.getGetStateMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getGetStateMethod = MAServiceProtoGrpc.getGetStateMethod) == null) {
          MAServiceProtoGrpc.getGetStateMethod = getGetStateMethod =
              io.grpc.MethodDescriptor.<GetStateRequest, GetStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("GetState"))
              .build();
        }
      }
    }
    return getGetStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SubscribeRequest,
      SubscribeResponse> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = SubscribeRequest.class,
      responseType = SubscribeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SubscribeRequest,
      SubscribeResponse> getSubscribeMethod() {
    io.grpc.MethodDescriptor<SubscribeRequest, SubscribeResponse> getSubscribeMethod;
    if ((getSubscribeMethod = MAServiceProtoGrpc.getSubscribeMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getSubscribeMethod = MAServiceProtoGrpc.getSubscribeMethod) == null) {
          MAServiceProtoGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<SubscribeRequest, SubscribeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SubscribeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<JoinGameRequest,
      JoinGameResponse> getJoinGameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinGame",
      requestType = JoinGameRequest.class,
      responseType = JoinGameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<JoinGameRequest,
      JoinGameResponse> getJoinGameMethod() {
    io.grpc.MethodDescriptor<JoinGameRequest, JoinGameResponse> getJoinGameMethod;
    if ((getJoinGameMethod = MAServiceProtoGrpc.getJoinGameMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getJoinGameMethod = MAServiceProtoGrpc.getJoinGameMethod) == null) {
          MAServiceProtoGrpc.getJoinGameMethod = getJoinGameMethod =
              io.grpc.MethodDescriptor.<JoinGameRequest, JoinGameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinGame"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  JoinGameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  JoinGameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("JoinGame"))
              .build();
        }
      }
    }
    return getJoinGameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<FlagRequest,
      RevealResponse> getFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Flag",
      requestType = FlagRequest.class,
      responseType = RevealResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<FlagRequest,
      RevealResponse> getFlagMethod() {
    io.grpc.MethodDescriptor<FlagRequest, RevealResponse> getFlagMethod;
    if ((getFlagMethod = MAServiceProtoGrpc.getFlagMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getFlagMethod = MAServiceProtoGrpc.getFlagMethod) == null) {
          MAServiceProtoGrpc.getFlagMethod = getFlagMethod =
              io.grpc.MethodDescriptor.<FlagRequest, RevealResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Flag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  FlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RevealResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MAServiceProtoMethodDescriptorSupplier("Flag"))
              .build();
        }
      }
    }
    return getFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<RevealRequest,
      RevealResponse> getRevealMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reveal",
      requestType = RevealRequest.class,
      responseType = RevealResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<RevealRequest,
      RevealResponse> getRevealMethod() {
    io.grpc.MethodDescriptor<RevealRequest, RevealResponse> getRevealMethod;
    if ((getRevealMethod = MAServiceProtoGrpc.getRevealMethod) == null) {
      synchronized (MAServiceProtoGrpc.class) {
        if ((getRevealMethod = MAServiceProtoGrpc.getRevealMethod) == null) {
          MAServiceProtoGrpc.getRevealMethod = getRevealMethod =
              io.grpc.MethodDescriptor.<RevealRequest, RevealResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reveal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RevealRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RevealResponse.getDefaultInstance()))
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
        @Override
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
        @Override
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
        @Override
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
    public void listGames(ListGamesRequest request,
                          io.grpc.stub.StreamObserver<ListGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListGamesMethod(), responseObserver);
    }

    /**
     */
    public void startGame(StartGameRequest request,
                          io.grpc.stub.StreamObserver<StartGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartGameMethod(), responseObserver);
    }

    /**
     */
    public void move(MoveRequest request,
                     io.grpc.stub.StreamObserver<MoveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     */
    public void createGame(CreateGameRequest request,
                           io.grpc.stub.StreamObserver<CreateGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGameMethod(), responseObserver);
    }

    /**
     */
    public void getState(GetStateRequest request,
                         io.grpc.stub.StreamObserver<GetStateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStateMethod(), responseObserver);
    }

    /**
     */
    public void subscribe(SubscribeRequest request,
                          io.grpc.stub.StreamObserver<SubscribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     */
    public void joinGame(JoinGameRequest request,
                         io.grpc.stub.StreamObserver<JoinGameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinGameMethod(), responseObserver);
    }

    /**
     */
    public void flag(FlagRequest request,
                     io.grpc.stub.StreamObserver<RevealResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFlagMethod(), responseObserver);
    }

    /**
     */
    public void reveal(RevealRequest request,
                       io.grpc.stub.StreamObserver<RevealResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRevealMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListGamesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ListGamesRequest,
                ListGameResponse>(
                  this, METHODID_LIST_GAMES)))
          .addMethod(
            getStartGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                StartGameRequest,
                StartGameResponse>(
                  this, METHODID_START_GAME)))
          .addMethod(
            getMoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MoveRequest,
                MoveResponse>(
                  this, METHODID_MOVE)))
          .addMethod(
            getCreateGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                CreateGameRequest,
                CreateGameResponse>(
                  this, METHODID_CREATE_GAME)))
          .addMethod(
            getGetStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GetStateRequest,
                GetStateResponse>(
                  this, METHODID_GET_STATE)))
          .addMethod(
            getSubscribeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SubscribeRequest,
                SubscribeResponse>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getJoinGameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                JoinGameRequest,
                JoinGameResponse>(
                  this, METHODID_JOIN_GAME)))
          .addMethod(
            getFlagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                FlagRequest,
                RevealResponse>(
                  this, METHODID_FLAG)))
          .addMethod(
            getRevealMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                RevealRequest,
                RevealResponse>(
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

    @Override
    protected MAServiceProtoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MAServiceProtoStub(channel, callOptions);
    }

    /**
     */
    public void listGames(ListGamesRequest request,
                          io.grpc.stub.StreamObserver<ListGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListGamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startGame(StartGameRequest request,
                          io.grpc.stub.StreamObserver<StartGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void move(MoveRequest request,
                     io.grpc.stub.StreamObserver<MoveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createGame(CreateGameRequest request,
                           io.grpc.stub.StreamObserver<CreateGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getState(GetStateRequest request,
                         io.grpc.stub.StreamObserver<GetStateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribe(SubscribeRequest request,
                          io.grpc.stub.StreamObserver<SubscribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinGame(JoinGameRequest request,
                         io.grpc.stub.StreamObserver<JoinGameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinGameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void flag(FlagRequest request,
                     io.grpc.stub.StreamObserver<RevealResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reveal(RevealRequest request,
                       io.grpc.stub.StreamObserver<RevealResponse> responseObserver) {
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

    @Override
    protected MAServiceProtoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MAServiceProtoBlockingStub(channel, callOptions);
    }

    /**
     */
    public ListGameResponse listGames(ListGamesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListGamesMethod(), getCallOptions(), request);
    }

    /**
     */
    public StartGameResponse startGame(StartGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public MoveResponse move(MoveRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public CreateGameResponse createGame(CreateGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public GetStateResponse getState(GetStateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public SubscribeResponse subscribe(SubscribeRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public JoinGameResponse joinGame(JoinGameRequest request) {
      return blockingUnaryCall(
          getChannel(), getJoinGameMethod(), getCallOptions(), request);
    }

    /**
     */
    public RevealResponse flag(FlagRequest request) {
      return blockingUnaryCall(
          getChannel(), getFlagMethod(), getCallOptions(), request);
    }

    /**
     */
    public RevealResponse reveal(RevealRequest request) {
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

    @Override
    protected MAServiceProtoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MAServiceProtoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ListGameResponse> listGames(
        ListGamesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListGamesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StartGameResponse> startGame(
        StartGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MoveResponse> move(
        MoveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CreateGameResponse> createGame(
        CreateGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GetStateResponse> getState(
        GetStateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SubscribeResponse> subscribe(
        SubscribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<JoinGameResponse> joinGame(
        JoinGameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinGameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<RevealResponse> flag(
        FlagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFlagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<RevealResponse> reveal(
        RevealRequest request) {
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
  private static final int METHODID_FLAG = 7;
  private static final int METHODID_REVEAL = 8;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_GAMES:
          serviceImpl.listGames((ListGamesRequest) request,
              (io.grpc.stub.StreamObserver<ListGameResponse>) responseObserver);
          break;
        case METHODID_START_GAME:
          serviceImpl.startGame((StartGameRequest) request,
              (io.grpc.stub.StreamObserver<StartGameResponse>) responseObserver);
          break;
        case METHODID_MOVE:
          serviceImpl.move((MoveRequest) request,
              (io.grpc.stub.StreamObserver<MoveResponse>) responseObserver);
          break;
        case METHODID_CREATE_GAME:
          serviceImpl.createGame((CreateGameRequest) request,
              (io.grpc.stub.StreamObserver<CreateGameResponse>) responseObserver);
          break;
        case METHODID_GET_STATE:
          serviceImpl.getState((GetStateRequest) request,
              (io.grpc.stub.StreamObserver<GetStateResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<SubscribeResponse>) responseObserver);
          break;
        case METHODID_JOIN_GAME:
          serviceImpl.joinGame((JoinGameRequest) request,
              (io.grpc.stub.StreamObserver<JoinGameResponse>) responseObserver);
          break;
        case METHODID_FLAG:
          serviceImpl.flag((FlagRequest) request,
              (io.grpc.stub.StreamObserver<RevealResponse>) responseObserver);
          break;
        case METHODID_REVEAL:
          serviceImpl.reveal((RevealRequest) request,
              (io.grpc.stub.StreamObserver<RevealResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return MProto.getDescriptor();
    }

    @Override
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

    @Override
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
              .addMethod(getFlagMethod())
              .addMethod(getRevealMethod())
              .build();
        }
      }
    }
    return result;
  }
}
