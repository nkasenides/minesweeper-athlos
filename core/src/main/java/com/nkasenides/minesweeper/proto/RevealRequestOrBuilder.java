// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

public interface RevealRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.nkasenides.minesweeper.proto.RevealRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string worldSessionID = 1;</code>
   * @return The worldSessionID.
   */
  java.lang.String getWorldSessionID();
  /**
   * <code>string worldSessionID = 1;</code>
   * @return The bytes for worldSessionID.
   */
  com.google.protobuf.ByteString
      getWorldSessionIDBytes();

  /**
   * <code>.com.nkasenides.minesweeper.proto.MatrixPositionProto position = 2;</code>
   * @return Whether the position field is set.
   */
  boolean hasPosition();
  /**
   * <code>.com.nkasenides.minesweeper.proto.MatrixPositionProto position = 2;</code>
   * @return The position.
   */
  com.nkasenides.minesweeper.proto.MatrixPositionProto getPosition();
  /**
   * <code>.com.nkasenides.minesweeper.proto.MatrixPositionProto position = 2;</code>
   */
  com.nkasenides.minesweeper.proto.MatrixPositionProtoOrBuilder getPositionOrBuilder();
}