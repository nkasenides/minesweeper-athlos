// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

public interface SubscribeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.nkasenides.minesweeper.proto.SubscribeRequest)
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
   * <code>string worldSessionID = 3;</code>
   * @return The worldSessionID.
   */
  java.lang.String getWorldSessionID();
  /**
   * <code>string worldSessionID = 3;</code>
   * @return The bytes for worldSessionID.
   */
  com.google.protobuf.ByteString
      getWorldSessionIDBytes();

  /**
   * <code>int32 partialStateWidth = 4;</code>
   * @return The partialStateWidth.
   */
  int getPartialStateWidth();
}
