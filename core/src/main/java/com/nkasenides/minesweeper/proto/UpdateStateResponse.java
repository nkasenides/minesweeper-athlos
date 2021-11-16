// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

/**
 * Protobuf type {@code com.nkasenides.minesweeper.proto.UpdateStateResponse}
 */
public final class UpdateStateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.nkasenides.minesweeper.proto.UpdateStateResponse)
    UpdateStateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateStateResponse.newBuilder() to construct.
  private UpdateStateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateStateResponse() {
    message_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateStateResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateStateResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 18: {
            com.nkasenides.minesweeper.proto.MAStateUpdateProto.Builder subBuilder = null;
            if (stateUpdate_ != null) {
              subBuilder = stateUpdate_.toBuilder();
            }
            stateUpdate_ = input.readMessage(com.nkasenides.minesweeper.proto.MAStateUpdateProto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stateUpdate_);
              stateUpdate_ = subBuilder.buildPartial();
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
    return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_UpdateStateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_UpdateStateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.nkasenides.minesweeper.proto.UpdateStateResponse.class, com.nkasenides.minesweeper.proto.UpdateStateResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code com.nkasenides.minesweeper.proto.UpdateStateResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SERVER_ERROR = 0;</code>
     */
    SERVER_ERROR(0),
    /**
     * <code>NO_SUCH_WORLD_SESSION = 1;</code>
     */
    NO_SUCH_WORLD_SESSION(1),
    /**
     * <code>INVALID_DATA = 2;</code>
     */
    INVALID_DATA(2),
    /**
     * <code>NOT_AUTHORIZED = 3;</code>
     */
    NOT_AUTHORIZED(3),
    /**
     * <code>CANNOT_COMPOSE_STATE = 4;</code>
     */
    CANNOT_COMPOSE_STATE(4),
    /**
     * <code>OK = 5;</code>
     */
    OK(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SERVER_ERROR = 0;</code>
     */
    public static final int SERVER_ERROR_VALUE = 0;
    /**
     * <code>NO_SUCH_WORLD_SESSION = 1;</code>
     */
    public static final int NO_SUCH_WORLD_SESSION_VALUE = 1;
    /**
     * <code>INVALID_DATA = 2;</code>
     */
    public static final int INVALID_DATA_VALUE = 2;
    /**
     * <code>NOT_AUTHORIZED = 3;</code>
     */
    public static final int NOT_AUTHORIZED_VALUE = 3;
    /**
     * <code>CANNOT_COMPOSE_STATE = 4;</code>
     */
    public static final int CANNOT_COMPOSE_STATE_VALUE = 4;
    /**
     * <code>OK = 5;</code>
     */
    public static final int OK_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return SERVER_ERROR;
        case 1: return NO_SUCH_WORLD_SESSION;
        case 2: return INVALID_DATA;
        case 3: return NOT_AUTHORIZED;
        case 4: return CANNOT_COMPOSE_STATE;
        case 5: return OK;
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
        throw new java.lang.IllegalStateException(
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
      return com.nkasenides.minesweeper.proto.UpdateStateResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
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

    // @@protoc_insertion_point(enum_scope:com.nkasenides.minesweeper.proto.UpdateStateResponse.Status)
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 1;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATEUPDATE_FIELD_NUMBER = 2;
  private com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate_;
  /**
   * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
   * @return Whether the stateUpdate field is set.
   */
  @java.lang.Override
  public boolean hasStateUpdate() {
    return stateUpdate_ != null;
  }
  /**
   * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
   * @return The stateUpdate.
   */
  @java.lang.Override
  public com.nkasenides.minesweeper.proto.MAStateUpdateProto getStateUpdate() {
    return stateUpdate_ == null ? com.nkasenides.minesweeper.proto.MAStateUpdateProto.getDefaultInstance() : stateUpdate_;
  }
  /**
   * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
   */
  @java.lang.Override
  public com.nkasenides.minesweeper.proto.MAStateUpdateProtoOrBuilder getStateUpdateOrBuilder() {
    return getStateUpdate();
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>.com.nkasenides.minesweeper.proto.UpdateStateResponse.Status status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.com.nkasenides.minesweeper.proto.UpdateStateResponse.Status status = 3;</code>
   * @return The status.
   */
  @java.lang.Override public com.nkasenides.minesweeper.proto.UpdateStateResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    com.nkasenides.minesweeper.proto.UpdateStateResponse.Status result = com.nkasenides.minesweeper.proto.UpdateStateResponse.Status.valueOf(status_);
    return result == null ? com.nkasenides.minesweeper.proto.UpdateStateResponse.Status.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (stateUpdate_ != null) {
      output.writeMessage(2, getStateUpdate());
    }
    if (status_ != com.nkasenides.minesweeper.proto.UpdateStateResponse.Status.SERVER_ERROR.getNumber()) {
      output.writeEnum(3, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (stateUpdate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getStateUpdate());
    }
    if (status_ != com.nkasenides.minesweeper.proto.UpdateStateResponse.Status.SERVER_ERROR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.nkasenides.minesweeper.proto.UpdateStateResponse)) {
      return super.equals(obj);
    }
    com.nkasenides.minesweeper.proto.UpdateStateResponse other = (com.nkasenides.minesweeper.proto.UpdateStateResponse) obj;

    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasStateUpdate() != other.hasStateUpdate()) return false;
    if (hasStateUpdate()) {
      if (!getStateUpdate()
          .equals(other.getStateUpdate())) return false;
    }
    if (status_ != other.status_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasStateUpdate()) {
      hash = (37 * hash) + STATEUPDATE_FIELD_NUMBER;
      hash = (53 * hash) + getStateUpdate().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nkasenides.minesweeper.proto.UpdateStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.nkasenides.minesweeper.proto.UpdateStateResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.nkasenides.minesweeper.proto.UpdateStateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.nkasenides.minesweeper.proto.UpdateStateResponse)
      com.nkasenides.minesweeper.proto.UpdateStateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_UpdateStateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_UpdateStateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nkasenides.minesweeper.proto.UpdateStateResponse.class, com.nkasenides.minesweeper.proto.UpdateStateResponse.Builder.class);
    }

    // Construct using com.nkasenides.minesweeper.proto.UpdateStateResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      message_ = "";

      if (stateUpdateBuilder_ == null) {
        stateUpdate_ = null;
      } else {
        stateUpdate_ = null;
        stateUpdateBuilder_ = null;
      }
      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_UpdateStateResponse_descriptor;
    }

    @java.lang.Override
    public com.nkasenides.minesweeper.proto.UpdateStateResponse getDefaultInstanceForType() {
      return com.nkasenides.minesweeper.proto.UpdateStateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.nkasenides.minesweeper.proto.UpdateStateResponse build() {
      com.nkasenides.minesweeper.proto.UpdateStateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.nkasenides.minesweeper.proto.UpdateStateResponse buildPartial() {
      com.nkasenides.minesweeper.proto.UpdateStateResponse result = new com.nkasenides.minesweeper.proto.UpdateStateResponse(this);
      result.message_ = message_;
      if (stateUpdateBuilder_ == null) {
        result.stateUpdate_ = stateUpdate_;
      } else {
        result.stateUpdate_ = stateUpdateBuilder_.build();
      }
      result.status_ = status_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.nkasenides.minesweeper.proto.UpdateStateResponse) {
        return mergeFrom((com.nkasenides.minesweeper.proto.UpdateStateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.nkasenides.minesweeper.proto.UpdateStateResponse other) {
      if (other == com.nkasenides.minesweeper.proto.UpdateStateResponse.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.hasStateUpdate()) {
        mergeStateUpdate(other.getStateUpdate());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.nkasenides.minesweeper.proto.UpdateStateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.nkasenides.minesweeper.proto.UpdateStateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 1;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
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
        java.lang.String value) {
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

    private com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.nkasenides.minesweeper.proto.MAStateUpdateProto, com.nkasenides.minesweeper.proto.MAStateUpdateProto.Builder, com.nkasenides.minesweeper.proto.MAStateUpdateProtoOrBuilder> stateUpdateBuilder_;
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
     * @return Whether the stateUpdate field is set.
     */
    public boolean hasStateUpdate() {
      return stateUpdateBuilder_ != null || stateUpdate_ != null;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
     * @return The stateUpdate.
     */
    public com.nkasenides.minesweeper.proto.MAStateUpdateProto getStateUpdate() {
      if (stateUpdateBuilder_ == null) {
        return stateUpdate_ == null ? com.nkasenides.minesweeper.proto.MAStateUpdateProto.getDefaultInstance() : stateUpdate_;
      } else {
        return stateUpdateBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
     */
    public Builder setStateUpdate(com.nkasenides.minesweeper.proto.MAStateUpdateProto value) {
      if (stateUpdateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stateUpdate_ = value;
        onChanged();
      } else {
        stateUpdateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
     */
    public Builder setStateUpdate(
        com.nkasenides.minesweeper.proto.MAStateUpdateProto.Builder builderForValue) {
      if (stateUpdateBuilder_ == null) {
        stateUpdate_ = builderForValue.build();
        onChanged();
      } else {
        stateUpdateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
     */
    public Builder mergeStateUpdate(com.nkasenides.minesweeper.proto.MAStateUpdateProto value) {
      if (stateUpdateBuilder_ == null) {
        if (stateUpdate_ != null) {
          stateUpdate_ =
            com.nkasenides.minesweeper.proto.MAStateUpdateProto.newBuilder(stateUpdate_).mergeFrom(value).buildPartial();
        } else {
          stateUpdate_ = value;
        }
        onChanged();
      } else {
        stateUpdateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
     */
    public Builder clearStateUpdate() {
      if (stateUpdateBuilder_ == null) {
        stateUpdate_ = null;
        onChanged();
      } else {
        stateUpdate_ = null;
        stateUpdateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
     */
    public com.nkasenides.minesweeper.proto.MAStateUpdateProto.Builder getStateUpdateBuilder() {
      
      onChanged();
      return getStateUpdateFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
     */
    public com.nkasenides.minesweeper.proto.MAStateUpdateProtoOrBuilder getStateUpdateOrBuilder() {
      if (stateUpdateBuilder_ != null) {
        return stateUpdateBuilder_.getMessageOrBuilder();
      } else {
        return stateUpdate_ == null ?
            com.nkasenides.minesweeper.proto.MAStateUpdateProto.getDefaultInstance() : stateUpdate_;
      }
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.MAStateUpdateProto stateUpdate = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.nkasenides.minesweeper.proto.MAStateUpdateProto, com.nkasenides.minesweeper.proto.MAStateUpdateProto.Builder, com.nkasenides.minesweeper.proto.MAStateUpdateProtoOrBuilder> 
        getStateUpdateFieldBuilder() {
      if (stateUpdateBuilder_ == null) {
        stateUpdateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.nkasenides.minesweeper.proto.MAStateUpdateProto, com.nkasenides.minesweeper.proto.MAStateUpdateProto.Builder, com.nkasenides.minesweeper.proto.MAStateUpdateProtoOrBuilder>(
                getStateUpdate(),
                getParentForChildren(),
                isClean());
        stateUpdate_ = null;
      }
      return stateUpdateBuilder_;
    }

    private int status_ = 0;
    /**
     * <code>.com.nkasenides.minesweeper.proto.UpdateStateResponse.Status status = 3;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.UpdateStateResponse.Status status = 3;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.UpdateStateResponse.Status status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public com.nkasenides.minesweeper.proto.UpdateStateResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      com.nkasenides.minesweeper.proto.UpdateStateResponse.Status result = com.nkasenides.minesweeper.proto.UpdateStateResponse.Status.valueOf(status_);
      return result == null ? com.nkasenides.minesweeper.proto.UpdateStateResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.UpdateStateResponse.Status status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.nkasenides.minesweeper.proto.UpdateStateResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.UpdateStateResponse.Status status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.nkasenides.minesweeper.proto.UpdateStateResponse)
  }

  // @@protoc_insertion_point(class_scope:com.nkasenides.minesweeper.proto.UpdateStateResponse)
  private static final com.nkasenides.minesweeper.proto.UpdateStateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.nkasenides.minesweeper.proto.UpdateStateResponse();
  }

  public static com.nkasenides.minesweeper.proto.UpdateStateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateStateResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateStateResponse>() {
    @java.lang.Override
    public UpdateStateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateStateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateStateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateStateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.nkasenides.minesweeper.proto.UpdateStateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

