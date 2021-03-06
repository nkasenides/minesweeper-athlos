// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

/**
 * Protobuf enum {@code com.nkasenides.minesweeper.proto.GameState}
 */
public enum GameState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENDED_LOST_GameState = 0;</code>
   */
  ENDED_LOST_GameState(0),
  /**
   * <code>NOT_STARTED_GameState = 1;</code>
   */
  NOT_STARTED_GameState(1),
  /**
   * <code>STARTED_GameState = 2;</code>
   */
  STARTED_GameState(2),
  /**
   * <code>ENDED_WON_GameState = 3;</code>
   */
  ENDED_WON_GameState(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ENDED_LOST_GameState = 0;</code>
   */
  public static final int ENDED_LOST_GameState_VALUE = 0;
  /**
   * <code>NOT_STARTED_GameState = 1;</code>
   */
  public static final int NOT_STARTED_GameState_VALUE = 1;
  /**
   * <code>STARTED_GameState = 2;</code>
   */
  public static final int STARTED_GameState_VALUE = 2;
  /**
   * <code>ENDED_WON_GameState = 3;</code>
   */
  public static final int ENDED_WON_GameState_VALUE = 3;


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
  public static GameState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameState forNumber(int value) {
    switch (value) {
      case 0: return ENDED_LOST_GameState;
      case 1: return NOT_STARTED_GameState;
      case 2: return STARTED_GameState;
      case 3: return ENDED_WON_GameState;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameState>() {
          public GameState findValueByNumber(int number) {
            return GameState.forNumber(number);
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
    return com.nkasenides.minesweeper.proto.MProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final GameState[] VALUES = values();

  public static GameState valueOf(
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

  private GameState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.nkasenides.minesweeper.proto.GameState)
}

