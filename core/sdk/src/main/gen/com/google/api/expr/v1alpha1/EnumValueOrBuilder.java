// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/expr/v1alpha1/value.proto
// Protobuf Java Version: 4.27.2

package com.google.api.expr.v1alpha1;

public interface EnumValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1alpha1.EnumValue)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The fully qualified name of the enum type.
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * The fully qualified name of the enum type.
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * The value of the enum.
   * </pre>
   *
   * <code>int32 value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  int getValue();
}
