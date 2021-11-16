// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

/**
 * Protobuf type {@code com.nkasenides.minesweeper.proto.ListGameResponse}
 */
public final class ListGameResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.nkasenides.minesweeper.proto.ListGameResponse)
    ListGameResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListGameResponse.newBuilder() to construct.
  private ListGameResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListGameResponse() {
    message_ = "";
    status_ = 0;
    worlds_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListGameResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListGameResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 16: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              worlds_ = new java.util.ArrayList<MAWorldProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            worlds_.add(
                input.readMessage(MAWorldProto.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        worlds_ = java.util.Collections.unmodifiableList(worlds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MProto.internal_static_com_nkasenides_minesweeper_proto_ListGameResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MProto.internal_static_com_nkasenides_minesweeper_proto_ListGameResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ListGameResponse.class, Builder.class);
  }

  /**
   * Protobuf enum {@code com.nkasenides.minesweeper.proto.ListGameResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OK = 0;</code>
     */
    OK(0),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OK = 0;</code>
     */
    public static final int OK_VALUE = 0;


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
        case 0: return OK;
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
      return ListGameResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:com.nkasenides.minesweeper.proto.ListGameResponse.Status)
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

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <code>.com.nkasenides.minesweeper.proto.ListGameResponse.Status status = 2;</code>
   * @return The enum numeric value on the wire for status.
   */
  @Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.com.nkasenides.minesweeper.proto.ListGameResponse.Status status = 2;</code>
   * @return The status.
   */
  @Override public Status getStatus() {
    @SuppressWarnings("deprecation")
    Status result = Status.valueOf(status_);
    return result == null ? Status.UNRECOGNIZED : result;
  }

  public static final int WORLDS_FIELD_NUMBER = 3;
  private java.util.List<MAWorldProto> worlds_;
  /**
   * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
   */
  @Override
  public java.util.List<MAWorldProto> getWorldsList() {
    return worlds_;
  }
  /**
   * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
   */
  @Override
  public java.util.List<? extends MAWorldProtoOrBuilder>
      getWorldsOrBuilderList() {
    return worlds_;
  }
  /**
   * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
   */
  @Override
  public int getWorldsCount() {
    return worlds_.size();
  }
  /**
   * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
   */
  @Override
  public MAWorldProto getWorlds(int index) {
    return worlds_.get(index);
  }
  /**
   * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
   */
  @Override
  public MAWorldProtoOrBuilder getWorldsOrBuilder(
      int index) {
    return worlds_.get(index);
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
    if (status_ != Status.OK.getNumber()) {
      output.writeEnum(2, status_);
    }
    for (int i = 0; i < worlds_.size(); i++) {
      output.writeMessage(3, worlds_.get(i));
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
    if (status_ != Status.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
    }
    for (int i = 0; i < worlds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, worlds_.get(i));
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
    if (!(obj instanceof ListGameResponse)) {
      return super.equals(obj);
    }
    ListGameResponse other = (ListGameResponse) obj;

    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (status_ != other.status_) return false;
    if (!getWorldsList()
        .equals(other.getWorldsList())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (getWorldsCount() > 0) {
      hash = (37 * hash) + WORLDS_FIELD_NUMBER;
      hash = (53 * hash) + getWorldsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ListGameResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListGameResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListGameResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListGameResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListGameResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListGameResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListGameResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ListGameResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ListGameResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ListGameResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ListGameResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ListGameResponse parseFrom(
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
  public static Builder newBuilder(ListGameResponse prototype) {
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
   * Protobuf type {@code com.nkasenides.minesweeper.proto.ListGameResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.nkasenides.minesweeper.proto.ListGameResponse)
      ListGameResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MProto.internal_static_com_nkasenides_minesweeper_proto_ListGameResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MProto.internal_static_com_nkasenides_minesweeper_proto_ListGameResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ListGameResponse.class, Builder.class);
    }

    // Construct using com.nkasenides.minesweeper.proto.ListGameResponse.newBuilder()
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
        getWorldsFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      message_ = "";

      status_ = 0;

      if (worldsBuilder_ == null) {
        worlds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        worldsBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MProto.internal_static_com_nkasenides_minesweeper_proto_ListGameResponse_descriptor;
    }

    @Override
    public ListGameResponse getDefaultInstanceForType() {
      return ListGameResponse.getDefaultInstance();
    }

    @Override
    public ListGameResponse build() {
      ListGameResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ListGameResponse buildPartial() {
      ListGameResponse result = new ListGameResponse(this);
      int from_bitField0_ = bitField0_;
      result.message_ = message_;
      result.status_ = status_;
      if (worldsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          worlds_ = java.util.Collections.unmodifiableList(worlds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.worlds_ = worlds_;
      } else {
        result.worlds_ = worldsBuilder_.build();
      }
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
      if (other instanceof ListGameResponse) {
        return mergeFrom((ListGameResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ListGameResponse other) {
      if (other == ListGameResponse.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (worldsBuilder_ == null) {
        if (!other.worlds_.isEmpty()) {
          if (worlds_.isEmpty()) {
            worlds_ = other.worlds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWorldsIsMutable();
            worlds_.addAll(other.worlds_);
          }
          onChanged();
        }
      } else {
        if (!other.worlds_.isEmpty()) {
          if (worldsBuilder_.isEmpty()) {
            worldsBuilder_.dispose();
            worldsBuilder_ = null;
            worlds_ = other.worlds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            worldsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWorldsFieldBuilder() : null;
          } else {
            worldsBuilder_.addAllMessages(other.worlds_);
          }
        }
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
      ListGameResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ListGameResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private int status_ = 0;
    /**
     * <code>.com.nkasenides.minesweeper.proto.ListGameResponse.Status status = 2;</code>
     * @return The enum numeric value on the wire for status.
     */
    @Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.ListGameResponse.Status status = 2;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.ListGameResponse.Status status = 2;</code>
     * @return The status.
     */
    @Override
    public Status getStatus() {
      @SuppressWarnings("deprecation")
      Status result = Status.valueOf(status_);
      return result == null ? Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.nkasenides.minesweeper.proto.ListGameResponse.Status status = 2;</code>
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
     * <code>.com.nkasenides.minesweeper.proto.ListGameResponse.Status status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<MAWorldProto> worlds_ =
      java.util.Collections.emptyList();
    private void ensureWorldsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        worlds_ = new java.util.ArrayList<MAWorldProto>(worlds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        MAWorldProto, MAWorldProto.Builder, MAWorldProtoOrBuilder> worldsBuilder_;

    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public java.util.List<MAWorldProto> getWorldsList() {
      if (worldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(worlds_);
      } else {
        return worldsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public int getWorldsCount() {
      if (worldsBuilder_ == null) {
        return worlds_.size();
      } else {
        return worldsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public MAWorldProto getWorlds(int index) {
      if (worldsBuilder_ == null) {
        return worlds_.get(index);
      } else {
        return worldsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public Builder setWorlds(
        int index, MAWorldProto value) {
      if (worldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorldsIsMutable();
        worlds_.set(index, value);
        onChanged();
      } else {
        worldsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public Builder setWorlds(
        int index, MAWorldProto.Builder builderForValue) {
      if (worldsBuilder_ == null) {
        ensureWorldsIsMutable();
        worlds_.set(index, builderForValue.build());
        onChanged();
      } else {
        worldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public Builder addWorlds(MAWorldProto value) {
      if (worldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorldsIsMutable();
        worlds_.add(value);
        onChanged();
      } else {
        worldsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public Builder addWorlds(
        int index, MAWorldProto value) {
      if (worldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWorldsIsMutable();
        worlds_.add(index, value);
        onChanged();
      } else {
        worldsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public Builder addWorlds(
        MAWorldProto.Builder builderForValue) {
      if (worldsBuilder_ == null) {
        ensureWorldsIsMutable();
        worlds_.add(builderForValue.build());
        onChanged();
      } else {
        worldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public Builder addWorlds(
        int index, MAWorldProto.Builder builderForValue) {
      if (worldsBuilder_ == null) {
        ensureWorldsIsMutable();
        worlds_.add(index, builderForValue.build());
        onChanged();
      } else {
        worldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public Builder addAllWorlds(
        Iterable<? extends MAWorldProto> values) {
      if (worldsBuilder_ == null) {
        ensureWorldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, worlds_);
        onChanged();
      } else {
        worldsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public Builder clearWorlds() {
      if (worldsBuilder_ == null) {
        worlds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        worldsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public Builder removeWorlds(int index) {
      if (worldsBuilder_ == null) {
        ensureWorldsIsMutable();
        worlds_.remove(index);
        onChanged();
      } else {
        worldsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public MAWorldProto.Builder getWorldsBuilder(
        int index) {
      return getWorldsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public MAWorldProtoOrBuilder getWorldsOrBuilder(
        int index) {
      if (worldsBuilder_ == null) {
        return worlds_.get(index);  } else {
        return worldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public java.util.List<? extends MAWorldProtoOrBuilder>
         getWorldsOrBuilderList() {
      if (worldsBuilder_ != null) {
        return worldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(worlds_);
      }
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public MAWorldProto.Builder addWorldsBuilder() {
      return getWorldsFieldBuilder().addBuilder(
          MAWorldProto.getDefaultInstance());
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public MAWorldProto.Builder addWorldsBuilder(
        int index) {
      return getWorldsFieldBuilder().addBuilder(
          index, MAWorldProto.getDefaultInstance());
    }
    /**
     * <code>repeated .com.nkasenides.minesweeper.proto.MAWorldProto worlds = 3;</code>
     */
    public java.util.List<MAWorldProto.Builder>
         getWorldsBuilderList() {
      return getWorldsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        MAWorldProto, MAWorldProto.Builder, MAWorldProtoOrBuilder>
        getWorldsFieldBuilder() {
      if (worldsBuilder_ == null) {
        worldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            MAWorldProto, MAWorldProto.Builder, MAWorldProtoOrBuilder>(
                worlds_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        worlds_ = null;
      }
      return worldsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.nkasenides.minesweeper.proto.ListGameResponse)
  }

  // @@protoc_insertion_point(class_scope:com.nkasenides.minesweeper.proto.ListGameResponse)
  private static final ListGameResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListGameResponse();
  }

  public static ListGameResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListGameResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListGameResponse>() {
    @Override
    public ListGameResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListGameResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListGameResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ListGameResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public ListGameResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
