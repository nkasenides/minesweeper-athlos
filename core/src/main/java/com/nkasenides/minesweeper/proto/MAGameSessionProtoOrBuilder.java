// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

public interface MAGameSessionProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.nkasenides.minesweeper.proto.MAGameSessionProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ipAddress = 1;</code>
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   * <code>string ipAddress = 1;</code>
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString
      getIpAddressBytes();

  /**
   * <code>uint64 expiresOn = 2;</code>
   * @return The expiresOn.
   */
  long getExpiresOn();

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
   * <code>uint64 createdOn = 4;</code>
   * @return The createdOn.
   */
  long getCreatedOn();

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
}