// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

public interface ViewGameRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.nkasenides.minesweeper.proto.ViewGameRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string gameID = 1;</code>
   * @return The gameID.
   */
  java.lang.String getGameID();
  /**
   * <code>string gameID = 1;</code>
   * @return The bytes for gameID.
   */
  com.google.protobuf.ByteString
      getGameIDBytes();

  /**
   * <code>int32 partialStateHeight = 2;</code>
   * @return The partialStateHeight.
   */
  int getPartialStateHeight();

  /**
   * <code>int32 partialStateWidth = 3;</code>
   * @return The partialStateWidth.
   */
  int getPartialStateWidth();

  /**
   * <code>.com.nkasenides.minesweeper.proto.MatrixPositionProto startPosition = 4;</code>
   * @return Whether the startPosition field is set.
   */
  boolean hasStartPosition();
  /**
   * <code>.com.nkasenides.minesweeper.proto.MatrixPositionProto startPosition = 4;</code>
   * @return The startPosition.
   */
  com.nkasenides.minesweeper.proto.MatrixPositionProto getStartPosition();
  /**
   * <code>.com.nkasenides.minesweeper.proto.MatrixPositionProto startPosition = 4;</code>
   */
  com.nkasenides.minesweeper.proto.MatrixPositionProtoOrBuilder getStartPositionOrBuilder();
}
