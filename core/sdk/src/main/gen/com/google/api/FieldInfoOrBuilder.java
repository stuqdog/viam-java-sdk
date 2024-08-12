// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/field_info.proto
// Protobuf Java Version: 4.27.2

package com.google.api;

public interface FieldInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.FieldInfo)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The standard format of a field value. This does not explicitly configure
   * any API consumer, just documents the API's format for the field it is
   * applied to.
   * </pre>
   *
   * <code>.google.api.FieldInfo.Format format = 1 [json_name = "format"];</code>
   * @return The enum numeric value on the wire for format.
   */
  int getFormatValue();
  /**
   * <pre>
   * The standard format of a field value. This does not explicitly configure
   * any API consumer, just documents the API's format for the field it is
   * applied to.
   * </pre>
   *
   * <code>.google.api.FieldInfo.Format format = 1 [json_name = "format"];</code>
   * @return The format.
   */
  com.google.api.FieldInfo.Format getFormat();

  /**
   * <pre>
   * The type(s) that the annotated, generic field may represent.
   *
   * Currently, this must only be used on fields of type `google.protobuf.Any`.
   * Supporting other generic types may be considered in the future.
   * </pre>
   *
   * <code>repeated .google.api.TypeReference referenced_types = 2 [json_name = "referencedTypes"];</code>
   */
  java.util.List<com.google.api.TypeReference> 
      getReferencedTypesList();
  /**
   * <pre>
   * The type(s) that the annotated, generic field may represent.
   *
   * Currently, this must only be used on fields of type `google.protobuf.Any`.
   * Supporting other generic types may be considered in the future.
   * </pre>
   *
   * <code>repeated .google.api.TypeReference referenced_types = 2 [json_name = "referencedTypes"];</code>
   */
  com.google.api.TypeReference getReferencedTypes(int index);
  /**
   * <pre>
   * The type(s) that the annotated, generic field may represent.
   *
   * Currently, this must only be used on fields of type `google.protobuf.Any`.
   * Supporting other generic types may be considered in the future.
   * </pre>
   *
   * <code>repeated .google.api.TypeReference referenced_types = 2 [json_name = "referencedTypes"];</code>
   */
  int getReferencedTypesCount();
}
