// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

/**
 * Protobuf type {@code com.nkasenides.minesweeper.proto.MAGameSessionProto}
 */
public final class MAGameSessionProto extends
    com.google.protobuf.GeneratedMessageV3 implements com.nkasenides.athlos.proto.Modelable<com.nkasenides.minesweeper.model.MAGameSession> , com.nkasenides.athlos.model.IGameSession, 
    // @@protoc_insertion_point(message_implements:com.nkasenides.minesweeper.proto.MAGameSessionProto)
    MAGameSessionProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MAGameSessionProto.newBuilder() to construct.
  private MAGameSessionProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MAGameSessionProto() {
    ipAddress_ = "";
    id_ = "";
    playerID_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MAGameSessionProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MAGameSessionProto(
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

            ipAddress_ = s;
            break;
          }
          case 16: {

            expiresOn_ = input.readUInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 32: {

            createdOn_ = input.readUInt64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            playerID_ = s;
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
    return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_MAGameSessionProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_MAGameSessionProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.nkasenides.minesweeper.proto.MAGameSessionProto.class, com.nkasenides.minesweeper.proto.MAGameSessionProto.Builder.class);
  }

  public static final int IPADDRESS_FIELD_NUMBER = 1;
  private volatile java.lang.Object ipAddress_;
  /**
   * <code>string ipAddress = 1;</code>
   * @return The ipAddress.
   */
  @java.lang.Override
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string ipAddress = 1;</code>
   * @return The bytes for ipAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRESON_FIELD_NUMBER = 2;
  private long expiresOn_;
  /**
   * <code>uint64 expiresOn = 2;</code>
   * @return The expiresOn.
   */
  @java.lang.Override
  public long getExpiresOn() {
    return expiresOn_;
  }

  public static final int ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 3;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 3;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATEDON_FIELD_NUMBER = 4;
  private long createdOn_;
  /**
   * <code>uint64 createdOn = 4;</code>
   * @return The createdOn.
   */
  @java.lang.Override
  public long getCreatedOn() {
    return createdOn_;
  }

  public static final int PLAYERID_FIELD_NUMBER = 5;
  private volatile java.lang.Object playerID_;
  /**
   * <code>string playerID = 5;</code>
   * @return The playerID.
   */
  @java.lang.Override
  public java.lang.String getPlayerID() {
    java.lang.Object ref = playerID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      playerID_ = s;
      return s;
    }
  }
  /**
   * <code>string playerID = 5;</code>
   * @return The bytes for playerID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlayerIDBytes() {
    java.lang.Object ref = playerID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      playerID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getIpAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ipAddress_);
    }
    if (expiresOn_ != 0L) {
      output.writeUInt64(2, expiresOn_);
    }
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, id_);
    }
    if (createdOn_ != 0L) {
      output.writeUInt64(4, createdOn_);
    }
    if (!getPlayerIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, playerID_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIpAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ipAddress_);
    }
    if (expiresOn_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, expiresOn_);
    }
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, id_);
    }
    if (createdOn_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, createdOn_);
    }
    if (!getPlayerIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, playerID_);
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
    if (!(obj instanceof com.nkasenides.minesweeper.proto.MAGameSessionProto)) {
      return super.equals(obj);
    }
    com.nkasenides.minesweeper.proto.MAGameSessionProto other = (com.nkasenides.minesweeper.proto.MAGameSessionProto) obj;

    if (!getIpAddress()
        .equals(other.getIpAddress())) return false;
    if (getExpiresOn()
        != other.getExpiresOn()) return false;
    if (!getId()
        .equals(other.getId())) return false;
    if (getCreatedOn()
        != other.getCreatedOn()) return false;
    if (!getPlayerID()
        .equals(other.getPlayerID())) return false;
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
    hash = (37 * hash) + IPADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (37 * hash) + EXPIRESON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpiresOn());
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + CREATEDON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreatedOn());
    hash = (37 * hash) + PLAYERID_FIELD_NUMBER;
    hash = (53 * hash) + getPlayerID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nkasenides.minesweeper.proto.MAGameSessionProto parseFrom(
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
  public static Builder newBuilder(com.nkasenides.minesweeper.proto.MAGameSessionProto prototype) {
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
   * Protobuf type {@code com.nkasenides.minesweeper.proto.MAGameSessionProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements com.nkasenides.athlos.model.IGameSession, com.nkasenides.athlos.proto.Modelable<com.nkasenides.minesweeper.model.MAGameSession>, 
      // @@protoc_insertion_point(builder_implements:com.nkasenides.minesweeper.proto.MAGameSessionProto)
      com.nkasenides.minesweeper.proto.MAGameSessionProtoOrBuilder {    @java.lang.Override    
    public com.nkasenides.minesweeper.model.MAGameSession toObject() {    
        com.nkasenides.minesweeper.model.MAGameSession item = new com.nkasenides.minesweeper.model.MAGameSession();        
        item.setIpAddress(getIpAddress());        
        item.setExpiresOn(getExpiresOn());        
        item.setId(getId());        
        item.setCreatedOn(getCreatedOn());        
        item.setPlayerID(getPlayerID());        
        return item;        
    }    
    

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_MAGameSessionProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_MAGameSessionProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nkasenides.minesweeper.proto.MAGameSessionProto.class, com.nkasenides.minesweeper.proto.MAGameSessionProto.Builder.class);
    }

    // Construct using com.nkasenides.minesweeper.proto.MAGameSessionProto.newBuilder()
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
      ipAddress_ = "";

      expiresOn_ = 0L;

      id_ = "";

      createdOn_ = 0L;

      playerID_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.nkasenides.minesweeper.proto.MProto.internal_static_com_nkasenides_minesweeper_proto_MAGameSessionProto_descriptor;
    }

    @java.lang.Override
    public com.nkasenides.minesweeper.proto.MAGameSessionProto getDefaultInstanceForType() {
      return com.nkasenides.minesweeper.proto.MAGameSessionProto.getDefaultInstance();
    }

    @java.lang.Override
    public com.nkasenides.minesweeper.proto.MAGameSessionProto build() {
      com.nkasenides.minesweeper.proto.MAGameSessionProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.nkasenides.minesweeper.proto.MAGameSessionProto buildPartial() {
      com.nkasenides.minesweeper.proto.MAGameSessionProto result = new com.nkasenides.minesweeper.proto.MAGameSessionProto(this);
      result.ipAddress_ = ipAddress_;
      result.expiresOn_ = expiresOn_;
      result.id_ = id_;
      result.createdOn_ = createdOn_;
      result.playerID_ = playerID_;
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
      if (other instanceof com.nkasenides.minesweeper.proto.MAGameSessionProto) {
        return mergeFrom((com.nkasenides.minesweeper.proto.MAGameSessionProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.nkasenides.minesweeper.proto.MAGameSessionProto other) {
      if (other == com.nkasenides.minesweeper.proto.MAGameSessionProto.getDefaultInstance()) return this;
      if (!other.getIpAddress().isEmpty()) {
        ipAddress_ = other.ipAddress_;
        onChanged();
      }
      if (other.getExpiresOn() != 0L) {
        setExpiresOn(other.getExpiresOn());
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.getCreatedOn() != 0L) {
        setCreatedOn(other.getCreatedOn());
      }
      if (!other.getPlayerID().isEmpty()) {
        playerID_ = other.playerID_;
        onChanged();
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
      com.nkasenides.minesweeper.proto.MAGameSessionProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.nkasenides.minesweeper.proto.MAGameSessionProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ipAddress_ = "";
    /**
     * <code>string ipAddress = 1;</code>
     * @return The ipAddress.
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ipAddress = 1;</code>
     * @return The bytes for ipAddress.
     */
    public com.google.protobuf.ByteString
        getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ipAddress = 1;</code>
     * @param value The ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ipAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ipAddress = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIpAddress() {
      
      ipAddress_ = getDefaultInstance().getIpAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string ipAddress = 1;</code>
     * @param value The bytes for ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ipAddress_ = value;
      onChanged();
      return this;
    }

    private long expiresOn_ ;
    /**
     * <code>uint64 expiresOn = 2;</code>
     * @return The expiresOn.
     */
    @java.lang.Override
    public long getExpiresOn() {
      return expiresOn_;
    }
    /**
     * <code>uint64 expiresOn = 2;</code>
     * @param value The expiresOn to set.
     * @return This builder for chaining.
     */
    public Builder setExpiresOn(long value) {
      
      expiresOn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 expiresOn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearExpiresOn() {
      
      expiresOn_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 3;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 3;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 3;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 3;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private long createdOn_ ;
    /**
     * <code>uint64 createdOn = 4;</code>
     * @return The createdOn.
     */
    @java.lang.Override
    public long getCreatedOn() {
      return createdOn_;
    }
    /**
     * <code>uint64 createdOn = 4;</code>
     * @param value The createdOn to set.
     * @return This builder for chaining.
     */
    public Builder setCreatedOn(long value) {
      
      createdOn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 createdOn = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreatedOn() {
      
      createdOn_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object playerID_ = "";
    /**
     * <code>string playerID = 5;</code>
     * @return The playerID.
     */
    public java.lang.String getPlayerID() {
      java.lang.Object ref = playerID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        playerID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string playerID = 5;</code>
     * @return The bytes for playerID.
     */
    public com.google.protobuf.ByteString
        getPlayerIDBytes() {
      java.lang.Object ref = playerID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        playerID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string playerID = 5;</code>
     * @param value The playerID to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      playerID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string playerID = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerID() {
      
      playerID_ = getDefaultInstance().getPlayerID();
      onChanged();
      return this;
    }
    /**
     * <code>string playerID = 5;</code>
     * @param value The bytes for playerID to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      playerID_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.nkasenides.minesweeper.proto.MAGameSessionProto)
  }

  // @@protoc_insertion_point(class_scope:com.nkasenides.minesweeper.proto.MAGameSessionProto)
  private static final com.nkasenides.minesweeper.proto.MAGameSessionProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.nkasenides.minesweeper.proto.MAGameSessionProto();
  }

  public static com.nkasenides.minesweeper.proto.MAGameSessionProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MAGameSessionProto>
      PARSER = new com.google.protobuf.AbstractParser<MAGameSessionProto>() {
    @java.lang.Override
    public MAGameSessionProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MAGameSessionProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MAGameSessionProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MAGameSessionProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.nkasenides.minesweeper.proto.MAGameSessionProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

    @java.lang.Override    
    public com.nkasenides.minesweeper.model.MAGameSession toObject() {    
        com.nkasenides.minesweeper.model.MAGameSession item = new com.nkasenides.minesweeper.model.MAGameSession();        
        item.setIpAddress(getIpAddress());        
        item.setExpiresOn(getExpiresOn());        
        item.setId(getId());        
        item.setCreatedOn(getCreatedOn());        
        item.setPlayerID(getPlayerID());        
        return item;        
    }    
    
}

