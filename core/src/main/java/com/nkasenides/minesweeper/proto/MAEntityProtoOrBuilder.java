// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

public interface MAEntityProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.nkasenides.minesweeper.proto.MAEntityProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string worldID = 1;</code>
   * @return The worldID.
   */
  java.lang.String getWorldID();
  /**
   * <code>string worldID = 1;</code>
   * @return The bytes for worldID.
   */
  com.google.protobuf.ByteString
      getWorldIDBytes();

  /**
   * <code>float areaOfInterest = 2;</code>
   * @return The areaOfInterest.
   */
  float getAreaOfInterest();

  /**
   * <code>string id = 3;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 3;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.com.nkasenides.minesweeper.proto.MatrixPositionProto position = 4;</code>
   * @return Whether the position field is set.
   */
  boolean hasPosition();
  /**
   * <code>.com.nkasenides.minesweeper.proto.MatrixPositionProto position = 4;</code>
   * @return The position.
   */
  com.nkasenides.minesweeper.proto.MatrixPositionProto getPosition();
  /**
   * <code>.com.nkasenides.minesweeper.proto.MatrixPositionProto position = 4;</code>
   */
  com.nkasenides.minesweeper.proto.MatrixPositionProtoOrBuilder getPositionOrBuilder();

  /**
   * <code>string playerID = 5;</code>
   * @return The playerID.
   */
  java.lang.String getPlayerID();
  /**
   * <code>string playerID = 5;</code>
   * @return The bytes for playerID.
   */
  com.google.protobuf.ByteString
      getPlayerIDBytes();

  /**
   * <code>.com.nkasenides.minesweeper.proto.Direction4 direction = 6;</code>
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();
  /**
   * <code>.com.nkasenides.minesweeper.proto.Direction4 direction = 6;</code>
   * @return The direction.
   */
  com.nkasenides.minesweeper.proto.Direction4 getDirection();
}
