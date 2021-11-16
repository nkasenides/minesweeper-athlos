// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Proto/MProto.proto

package com.nkasenides.minesweeper.proto;

public interface MAPartialStateProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.nkasenides.minesweeper.proto.MAPartialStateProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .com.nkasenides.minesweeper.proto.MAEntityProto&gt; entities = 1;</code>
   */
  int getEntitiesCount();
  /**
   * <code>map&lt;string, .com.nkasenides.minesweeper.proto.MAEntityProto&gt; entities = 1;</code>
   */
  boolean containsEntities(
      java.lang.String key);
  /**
   * Use {@link #getEntitiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.nkasenides.minesweeper.proto.MAEntityProto>
  getEntities();
  /**
   * <code>map&lt;string, .com.nkasenides.minesweeper.proto.MAEntityProto&gt; entities = 1;</code>
   */
  java.util.Map<java.lang.String, com.nkasenides.minesweeper.proto.MAEntityProto>
  getEntitiesMap();
  /**
   * <code>map&lt;string, .com.nkasenides.minesweeper.proto.MAEntityProto&gt; entities = 1;</code>
   */

  com.nkasenides.minesweeper.proto.MAEntityProto getEntitiesOrDefault(
      java.lang.String key,
      com.nkasenides.minesweeper.proto.MAEntityProto defaultValue);
  /**
   * <code>map&lt;string, .com.nkasenides.minesweeper.proto.MAEntityProto&gt; entities = 1;</code>
   */

  com.nkasenides.minesweeper.proto.MAEntityProto getEntitiesOrThrow(
      java.lang.String key);

  /**
   * <code>.com.nkasenides.minesweeper.proto.MAWorldSessionProto worldSession = 2;</code>
   * @return Whether the worldSession field is set.
   */
  boolean hasWorldSession();
  /**
   * <code>.com.nkasenides.minesweeper.proto.MAWorldSessionProto worldSession = 2;</code>
   * @return The worldSession.
   */
  com.nkasenides.minesweeper.proto.MAWorldSessionProto getWorldSession();
  /**
   * <code>.com.nkasenides.minesweeper.proto.MAWorldSessionProto worldSession = 2;</code>
   */
  com.nkasenides.minesweeper.proto.MAWorldSessionProtoOrBuilder getWorldSessionOrBuilder();

  /**
   * <code>map&lt;string, .com.nkasenides.minesweeper.proto.MATerrainCellProto&gt; terrain = 3;</code>
   */
  int getTerrainCount();
  /**
   * <code>map&lt;string, .com.nkasenides.minesweeper.proto.MATerrainCellProto&gt; terrain = 3;</code>
   */
  boolean containsTerrain(
      java.lang.String key);
  /**
   * Use {@link #getTerrainMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.nkasenides.minesweeper.proto.MATerrainCellProto>
  getTerrain();
  /**
   * <code>map&lt;string, .com.nkasenides.minesweeper.proto.MATerrainCellProto&gt; terrain = 3;</code>
   */
  java.util.Map<java.lang.String, com.nkasenides.minesweeper.proto.MATerrainCellProto>
  getTerrainMap();
  /**
   * <code>map&lt;string, .com.nkasenides.minesweeper.proto.MATerrainCellProto&gt; terrain = 3;</code>
   */

  com.nkasenides.minesweeper.proto.MATerrainCellProto getTerrainOrDefault(
      java.lang.String key,
      com.nkasenides.minesweeper.proto.MATerrainCellProto defaultValue);
  /**
   * <code>map&lt;string, .com.nkasenides.minesweeper.proto.MATerrainCellProto&gt; terrain = 3;</code>
   */

  com.nkasenides.minesweeper.proto.MATerrainCellProto getTerrainOrThrow(
      java.lang.String key);

  /**
   * <code>uint64 timestamp = 4;</code>
   * @return The timestamp.
   */
  long getTimestamp();
}
