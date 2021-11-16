// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

/**
 * Protobuf enum {@code com.nkasenides.minesweeper.proto.RevealState}
 */
public enum RevealState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REVEALED_8_RevealState = 0;</code>
   */
  REVEALED_8_RevealState(0),
  /**
   * <code>REVEALED_7_RevealState = 1;</code>
   */
  REVEALED_7_RevealState(1),
  /**
   * <code>FLAGGED_RevealState = 2;</code>
   */
  FLAGGED_RevealState(2),
  /**
   * <code>REVEALED_4_RevealState = 3;</code>
   */
  REVEALED_4_RevealState(3),
  /**
   * <code>REVEALED_3_RevealState = 4;</code>
   */
  REVEALED_3_RevealState(4),
  /**
   * <code>REVEALED_6_RevealState = 5;</code>
   */
  REVEALED_6_RevealState(5),
  /**
   * <code>REVEALED_5_RevealState = 6;</code>
   */
  REVEALED_5_RevealState(6),
  /**
   * <code>REVEALED_0_RevealState = 7;</code>
   */
  REVEALED_0_RevealState(7),
  /**
   * <code>COVERED_RevealState = 8;</code>
   */
  COVERED_RevealState(8),
  /**
   * <code>REVEALED_2_RevealState = 9;</code>
   */
  REVEALED_2_RevealState(9),
  /**
   * <code>REVEALED_1_RevealState = 10;</code>
   */
  REVEALED_1_RevealState(10),
  /**
   * <code>REVEALED_MINE_RevealState = 11;</code>
   */
  REVEALED_MINE_RevealState(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REVEALED_8_RevealState = 0;</code>
   */
  public static final int REVEALED_8_RevealState_VALUE = 0;
  /**
   * <code>REVEALED_7_RevealState = 1;</code>
   */
  public static final int REVEALED_7_RevealState_VALUE = 1;
  /**
   * <code>FLAGGED_RevealState = 2;</code>
   */
  public static final int FLAGGED_RevealState_VALUE = 2;
  /**
   * <code>REVEALED_4_RevealState = 3;</code>
   */
  public static final int REVEALED_4_RevealState_VALUE = 3;
  /**
   * <code>REVEALED_3_RevealState = 4;</code>
   */
  public static final int REVEALED_3_RevealState_VALUE = 4;
  /**
   * <code>REVEALED_6_RevealState = 5;</code>
   */
  public static final int REVEALED_6_RevealState_VALUE = 5;
  /**
   * <code>REVEALED_5_RevealState = 6;</code>
   */
  public static final int REVEALED_5_RevealState_VALUE = 6;
  /**
   * <code>REVEALED_0_RevealState = 7;</code>
   */
  public static final int REVEALED_0_RevealState_VALUE = 7;
  /**
   * <code>COVERED_RevealState = 8;</code>
   */
  public static final int COVERED_RevealState_VALUE = 8;
  /**
   * <code>REVEALED_2_RevealState = 9;</code>
   */
  public static final int REVEALED_2_RevealState_VALUE = 9;
  /**
   * <code>REVEALED_1_RevealState = 10;</code>
   */
  public static final int REVEALED_1_RevealState_VALUE = 10;
  /**
   * <code>REVEALED_MINE_RevealState = 11;</code>
   */
  public static final int REVEALED_MINE_RevealState_VALUE = 11;


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
  public static RevealState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RevealState forNumber(int value) {
    switch (value) {
      case 0: return REVEALED_8_RevealState;
      case 1: return REVEALED_7_RevealState;
      case 2: return FLAGGED_RevealState;
      case 3: return REVEALED_4_RevealState;
      case 4: return REVEALED_3_RevealState;
      case 5: return REVEALED_6_RevealState;
      case 6: return REVEALED_5_RevealState;
      case 7: return REVEALED_0_RevealState;
      case 8: return COVERED_RevealState;
      case 9: return REVEALED_2_RevealState;
      case 10: return REVEALED_1_RevealState;
      case 11: return REVEALED_MINE_RevealState;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RevealState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RevealState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RevealState>() {
          public RevealState findValueByNumber(int number) {
            return RevealState.forNumber(number);
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
    return com.nkasenides.minesweeper.proto.MProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final RevealState[] VALUES = values();

  public static RevealState valueOf(
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

  private RevealState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.nkasenides.minesweeper.proto.RevealState)
}

