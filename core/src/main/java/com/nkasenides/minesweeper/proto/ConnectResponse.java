// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

/**
 * Protobuf type {@code com.nkasenides.minesweeper.proto.ConnectResponse}
 */
public final class ConnectResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.nkasenides.minesweeper.proto.ConnectResponse)
    ConnectResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConnectResponse.newBuilder() to construct.
  private ConnectResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConnectResponse() {
    message_ = "";
    status_ = 0;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConnectResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConnectResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 18: {
            MAGameSessionProto.Builder subBuilder = null;
            if (gameSession_ != null) {
              subBuilder = gameSession_.toBuilder();
            }
            gameSession_ = input.readMessage(MAGameSessionProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gameSession_);
              gameSession_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MProto.internal_static_com_nkasenides_minesweeper_proto_ConnectResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MProto.internal_static_com_nkasenides_minesweeper_proto_ConnectResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ConnectResponse.class, Builder.class);
  }

  /**
   * Protobuf enum {@code com.nkasenides.minesweeper.proto.ConnectResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INVALID_PLAYER_NAME = 0;</code>
     */
    INVALID_PLAYER_NAME(0),
    /**
     * <code>OK = 1;</code>
     */
    OK(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INVALID_PLAYER_NAME = 0;</code>
     */
    public static final int INVALID_PLAYER_NAME_VALUE = 0;
    /**
     * <code>OK = 1;</code>
     */
    public static final int OK_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return INVALID_PLAYER_NAME;
        case 1: return OK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return ConnectResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.nkasenides.minesweeper.proto.ConnectResponse.Status)
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile Object message_;
  /**
   * <code>string message = 1;</code>
   * @return The message.
   */
  @Override
  public String getMessage() {
    Object ref = message_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  @Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    Object ref = message_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GAMESESSION_FIELD_NUMBER = 2;
  private MAGameSessionProto gameSession_;
  /**
   * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
   * @return Whether the gameSession field is set.
   */
  @Override
  public boolean hasGameSession() {
    return gameSession_ != null;
  }
  /**
   * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
   * @return The gameSession.
   */
  @Override
  public MAGameSessionProto getGameSession() {
    return gameSession_ == null ? MAGameSessionProto.getDefaultInstance() : gameSession_;
  }
  /**
   * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
   */
  @Override
  public MAGameSessionProtoOrBuilder getGameSessionOrBuilder() {
    return getGameSession();
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>.com.nkasenides.minesweeper.proto.ConnectResponse.Status status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  @Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.com.nkasenides.minesweeper.proto.ConnectResponse.Status status = 3;</code>
   * @return The status.
   */
  @Override public Status getStatus() {
    @SuppressWarnings("deprecation")
    Status result = Status.valueOf(status_);
    return result == null ? Status.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (gameSession_ != null) {
      output.writeMessage(2, getGameSession());
    }
    if (status_ != Status.INVALID_PLAYER_NAME.getNumber()) {
      output.writeEnum(3, status_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (gameSession_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGameSession());
    }
    if (status_ != Status.INVALID_PLAYER_NAME.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ConnectResponse)) {
      return super.equals(obj);
    }
    ConnectResponse other = (ConnectResponse) obj;

    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasGameSession() != other.hasGameSession()) return false;
    if (hasGameSession()) {
      if (!getGameSession()
          .equals(other.getGameSession())) return false;
    }
    if (status_ != other.status_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasGameSession()) {
      hash = (37 * hash) + GAMESESSION_FIELD_NUMBER;
      hash = (53 * hash) + getGameSession().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ConnectResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConnectResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConnectResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConnectResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConnectResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ConnectResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ConnectResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ConnectResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ConnectResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ConnectResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ConnectResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ConnectResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ConnectResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.nkasenides.minesweeper.proto.ConnectResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.nkasenides.minesweeper.proto.ConnectResponse)
      ConnectResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MProto.internal_static_com_nkasenides_minesweeper_proto_ConnectResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MProto.internal_static_com_nkasenides_minesweeper_proto_ConnectResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ConnectResponse.class, Builder.class);
    }

    // Construct using com.nkasenides.minesweeper.proto.ConnectResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      message_ = "";

      if (gameSessionBuilder_ == null) {
        gameSession_ = null;
      } else {
        gameSession_ = null;
        gameSessionBuilder_ = null;
      }
      status_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MProto.internal_static_com_nkasenides_minesweeper_proto_ConnectResponse_descriptor;
    }

    @Override
    public ConnectResponse getDefaultInstanceForType() {
      return ConnectResponse.getDefaultInstance();
    }

    @Override
    public ConnectResponse build() {
      ConnectResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ConnectResponse buildPartial() {
      ConnectResponse result = new ConnectResponse(this);
      result.message_ = message_;
      if (gameSessionBuilder_ == null) {
        result.gameSession_ = gameSession_;
      } else {
        result.gameSession_ = gameSessionBuilder_.build();
      }
      result.status_ = status_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ConnectResponse) {
        return mergeFrom((ConnectResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ConnectResponse other) {
      if (other == ConnectResponse.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.hasGameSession()) {
        mergeGameSession(other.getGameSession());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ConnectResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ConnectResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object message_ = "";
    /**
     * <code>string message = 1;</code>
     * @return The message.
     */
    public String getMessage() {
      Object ref = message_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private MAGameSessionProto gameSession_;
    private com.google.protobuf.SingleFieldBuilderV3<
        MAGameSessionProto, MAGameSessionProto.Builder, MAGameSessionProtoOrBuilder> gameSessionBuilder_;
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
     * @return Whether the gameSession field is set.
     */
    public boolean hasGameSession() {
      return gameSessionBuilder_ != null || gameSession_ != null;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
     * @return The gameSession.
     */
    public MAGameSessionProto getGameSession() {
      if (gameSessionBuilder_ == null) {
        return gameSession_ == null ? MAGameSessionProto.getDefaultInstance() : gameSession_;
      } else {
        return gameSessionBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
     */
    public Builder setGameSession(MAGameSessionProto value) {
      if (gameSessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gameSession_ = value;
        onChanged();
      } else {
        gameSessionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
     */
    public Builder setGameSession(
        MAGameSessionProto.Builder builderForValue) {
      if (gameSessionBuilder_ == null) {
        gameSession_ = builderForValue.build();
        onChanged();
      } else {
        gameSessionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
     */
    public Builder mergeGameSession(MAGameSessionProto value) {
      if (gameSessionBuilder_ == null) {
        if (gameSession_ != null) {
          gameSession_ =
            MAGameSessionProto.newBuilder(gameSession_).mergeFrom(value).buildPartial();
        } else {
          gameSession_ = value;
        }
        onChanged();
      } else {
        gameSessionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
     */
    public Builder clearGameSession() {
      if (gameSessionBuilder_ == null) {
        gameSession_ = null;
        onChanged();
      } else {
        gameSession_ = null;
        gameSessionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
     */
    public MAGameSessionProto.Builder getGameSessionBuilder() {
      
      onChanged();
      return getGameSessionFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
     */
    public MAGameSessionProtoOrBuilder getGameSessionOrBuilder() {
      if (gameSessionBuilder_ != null) {
        return gameSessionBuilder_.getMessageOrBuilder();
      } else {
        return gameSession_ == null ?
            MAGameSessionProto.getDefaultInstance() : gameSession_;
      }
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAGameSessionProto gameSession = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        MAGameSessionProto, MAGameSessionProto.Builder, MAGameSessionProtoOrBuilder>
        getGameSessionFieldBuilder() {
      if (gameSessionBuilder_ == null) {
        gameSessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            MAGameSessionProto, MAGameSessionProto.Builder, MAGameSessionProtoOrBuilder>(
                getGameSession(),
                getParentForChildren(),
                isClean());
        gameSession_ = null;
      }
      return gameSessionBuilder_;
    }

    private int status_ = 0;
    /**
     * <code>.com.nkasenides.minesweeper.proto.ConnectResponse.Status status = 3;</code>
     * @return The enum numeric value on the wire for status.
     */
    @Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.ConnectResponse.Status status = 3;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.ConnectResponse.Status status = 3;</code>
     * @return The status.
     */
    @Override
    public Status getStatus() {
      @SuppressWarnings("deprecation")
      Status result = Status.valueOf(status_);
      return result == null ? Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.ConnectResponse.Status status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.ConnectResponse.Status status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.nkasenides.minesweeper.proto.ConnectResponse)
  }

  // @@protoc_insertion_point(class_scope:com.nkasenides.minesweeper.proto.ConnectResponse)
  private static final ConnectResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ConnectResponse();
  }

  public static ConnectResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConnectResponse>
      PARSER = new com.google.protobuf.AbstractParser<ConnectResponse>() {
    @Override
    public ConnectResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConnectResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConnectResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ConnectResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public ConnectResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

