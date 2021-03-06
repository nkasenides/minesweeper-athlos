// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

/**
 * Protobuf type {@code com.nkasenides.minesweeper.proto.SubscribeRequest}
 */
public final class SubscribeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.nkasenides.minesweeper.proto.SubscribeRequest)
    SubscribeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubscribeRequest.newBuilder() to construct.
  private SubscribeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubscribeRequest() {
    gameID_ = "";
    worldSessionID_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubscribeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SubscribeRequest(
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

            gameID_ = s;
            break;
          }
          case 16: {

            partialStateHeight_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            worldSessionID_ = s;
            break;
          }
          case 32: {

            partialStateWidth_ = input.readInt32();
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
    return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_SubscribeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_SubscribeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.nkasenides.minesweeper.proto.SubscribeRequest.class, com.nkasenides.minesweeper.proto.SubscribeRequest.Builder.class);
  }

  public static final int GAMEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object gameID_;
  /**
   * <code>string gameID = 1;</code>
   * @return The gameID.
   */
  @java.lang.Override
  public java.lang.String getGameID() {
    java.lang.Object ref = gameID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gameID_ = s;
      return s;
    }
  }
  /**
   * <code>string gameID = 1;</code>
   * @return The bytes for gameID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGameIDBytes() {
    java.lang.Object ref = gameID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      gameID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTIALSTATEHEIGHT_FIELD_NUMBER = 2;
  private int partialStateHeight_;
  /**
   * <code>int32 partialStateHeight = 2;</code>
   * @return The partialStateHeight.
   */
  @java.lang.Override
  public int getPartialStateHeight() {
    return partialStateHeight_;
  }

  public static final int WORLDSESSIONID_FIELD_NUMBER = 3;
  private volatile java.lang.Object worldSessionID_;
  /**
   * <code>string worldSessionID = 3;</code>
   * @return The worldSessionID.
   */
  @java.lang.Override
  public java.lang.String getWorldSessionID() {
    java.lang.Object ref = worldSessionID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      worldSessionID_ = s;
      return s;
    }
  }
  /**
   * <code>string worldSessionID = 3;</code>
   * @return The bytes for worldSessionID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWorldSessionIDBytes() {
    java.lang.Object ref = worldSessionID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      worldSessionID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTIALSTATEWIDTH_FIELD_NUMBER = 4;
  private int partialStateWidth_;
  /**
   * <code>int32 partialStateWidth = 4;</code>
   * @return The partialStateWidth.
   */
  @java.lang.Override
  public int getPartialStateWidth() {
    return partialStateWidth_;
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
    if (!getGameIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, gameID_);
    }
    if (partialStateHeight_ != 0) {
      output.writeInt32(2, partialStateHeight_);
    }
    if (!getWorldSessionIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, worldSessionID_);
    }
    if (partialStateWidth_ != 0) {
      output.writeInt32(4, partialStateWidth_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGameIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, gameID_);
    }
    if (partialStateHeight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, partialStateHeight_);
    }
    if (!getWorldSessionIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, worldSessionID_);
    }
    if (partialStateWidth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, partialStateWidth_);
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
    if (!(obj instanceof com.nkasenides.minesweeper.proto.SubscribeRequest)) {
      return super.equals(obj);
    }
    com.nkasenides.minesweeper.proto.SubscribeRequest other = (com.nkasenides.minesweeper.proto.SubscribeRequest) obj;

    if (!getGameID()
        .equals(other.getGameID())) return false;
    if (getPartialStateHeight()
        != other.getPartialStateHeight()) return false;
    if (!getWorldSessionID()
        .equals(other.getWorldSessionID())) return false;
    if (getPartialStateWidth()
        != other.getPartialStateWidth()) return false;
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
    hash = (37 * hash) + GAMEID_FIELD_NUMBER;
    hash = (53 * hash) + getGameID().hashCode();
    hash = (37 * hash) + PARTIALSTATEHEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getPartialStateHeight();
    hash = (37 * hash) + WORLDSESSIONID_FIELD_NUMBER;
    hash = (53 * hash) + getWorldSessionID().hashCode();
    hash = (37 * hash) + PARTIALSTATEWIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getPartialStateWidth();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nkasenides.minesweeper.proto.SubscribeRequest parseFrom(
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
  public static Builder newBuilder(com.nkasenides.minesweeper.proto.SubscribeRequest prototype) {
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
   * Protobuf type {@code com.nkasenides.minesweeper.proto.SubscribeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.nkasenides.minesweeper.proto.SubscribeRequest)
      com.nkasenides.minesweeper.proto.SubscribeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_SubscribeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_SubscribeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nkasenides.minesweeper.proto.SubscribeRequest.class, com.nkasenides.minesweeper.proto.SubscribeRequest.Builder.class);
    }

    // Construct using com.nkasenides.minesweeper.proto.SubscribeRequest.newBuilder()
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
      gameID_ = "";

      partialStateHeight_ = 0;

      worldSessionID_ = "";

      partialStateWidth_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_SubscribeRequest_descriptor;
    }

    @java.lang.Override
    public com.nkasenides.minesweeper.proto.SubscribeRequest getDefaultInstanceForType() {
      return com.nkasenides.minesweeper.proto.SubscribeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.nkasenides.minesweeper.proto.SubscribeRequest build() {
      com.nkasenides.minesweeper.proto.SubscribeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.nkasenides.minesweeper.proto.SubscribeRequest buildPartial() {
      com.nkasenides.minesweeper.proto.SubscribeRequest result = new com.nkasenides.minesweeper.proto.SubscribeRequest(this);
      result.gameID_ = gameID_;
      result.partialStateHeight_ = partialStateHeight_;
      result.worldSessionID_ = worldSessionID_;
      result.partialStateWidth_ = partialStateWidth_;
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
      if (other instanceof com.nkasenides.minesweeper.proto.SubscribeRequest) {
        return mergeFrom((com.nkasenides.minesweeper.proto.SubscribeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.nkasenides.minesweeper.proto.SubscribeRequest other) {
      if (other == com.nkasenides.minesweeper.proto.SubscribeRequest.getDefaultInstance()) return this;
      if (!other.getGameID().isEmpty()) {
        gameID_ = other.gameID_;
        onChanged();
      }
      if (other.getPartialStateHeight() != 0) {
        setPartialStateHeight(other.getPartialStateHeight());
      }
      if (!other.getWorldSessionID().isEmpty()) {
        worldSessionID_ = other.worldSessionID_;
        onChanged();
      }
      if (other.getPartialStateWidth() != 0) {
        setPartialStateWidth(other.getPartialStateWidth());
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
      com.nkasenides.minesweeper.proto.SubscribeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.nkasenides.minesweeper.proto.SubscribeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object gameID_ = "";
    /**
     * <code>string gameID = 1;</code>
     * @return The gameID.
     */
    public java.lang.String getGameID() {
      java.lang.Object ref = gameID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gameID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string gameID = 1;</code>
     * @return The bytes for gameID.
     */
    public com.google.protobuf.ByteString
        getGameIDBytes() {
      java.lang.Object ref = gameID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        gameID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string gameID = 1;</code>
     * @param value The gameID to set.
     * @return This builder for chaining.
     */
    public Builder setGameID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      gameID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string gameID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGameID() {
      
      gameID_ = getDefaultInstance().getGameID();
      onChanged();
      return this;
    }
    /**
     * <code>string gameID = 1;</code>
     * @param value The bytes for gameID to set.
     * @return This builder for chaining.
     */
    public Builder setGameIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      gameID_ = value;
      onChanged();
      return this;
    }

    private int partialStateHeight_ ;
    /**
     * <code>int32 partialStateHeight = 2;</code>
     * @return The partialStateHeight.
     */
    @java.lang.Override
    public int getPartialStateHeight() {
      return partialStateHeight_;
    }
    /**
     * <code>int32 partialStateHeight = 2;</code>
     * @param value The partialStateHeight to set.
     * @return This builder for chaining.
     */
    public Builder setPartialStateHeight(int value) {
      
      partialStateHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 partialStateHeight = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartialStateHeight() {
      
      partialStateHeight_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object worldSessionID_ = "";
    /**
     * <code>string worldSessionID = 3;</code>
     * @return The worldSessionID.
     */
    public java.lang.String getWorldSessionID() {
      java.lang.Object ref = worldSessionID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        worldSessionID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string worldSessionID = 3;</code>
     * @return The bytes for worldSessionID.
     */
    public com.google.protobuf.ByteString
        getWorldSessionIDBytes() {
      java.lang.Object ref = worldSessionID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        worldSessionID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string worldSessionID = 3;</code>
     * @param value The worldSessionID to set.
     * @return This builder for chaining.
     */
    public Builder setWorldSessionID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      worldSessionID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string worldSessionID = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorldSessionID() {
      
      worldSessionID_ = getDefaultInstance().getWorldSessionID();
      onChanged();
      return this;
    }
    /**
     * <code>string worldSessionID = 3;</code>
     * @param value The bytes for worldSessionID to set.
     * @return This builder for chaining.
     */
    public Builder setWorldSessionIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      worldSessionID_ = value;
      onChanged();
      return this;
    }

    private int partialStateWidth_ ;
    /**
     * <code>int32 partialStateWidth = 4;</code>
     * @return The partialStateWidth.
     */
    @java.lang.Override
    public int getPartialStateWidth() {
      return partialStateWidth_;
    }
    /**
     * <code>int32 partialStateWidth = 4;</code>
     * @param value The partialStateWidth to set.
     * @return This builder for chaining.
     */
    public Builder setPartialStateWidth(int value) {
      
      partialStateWidth_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 partialStateWidth = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartialStateWidth() {
      
      partialStateWidth_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.nkasenides.minesweeper.proto.SubscribeRequest)
  }

  // @@protoc_insertion_point(class_scope:com.nkasenides.minesweeper.proto.SubscribeRequest)
  private static final com.nkasenides.minesweeper.proto.SubscribeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.nkasenides.minesweeper.proto.SubscribeRequest();
  }

  public static com.nkasenides.minesweeper.proto.SubscribeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeRequest>
      PARSER = new com.google.protobuf.AbstractParser<SubscribeRequest>() {
    @java.lang.Override
    public SubscribeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SubscribeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubscribeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.nkasenides.minesweeper.proto.SubscribeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

