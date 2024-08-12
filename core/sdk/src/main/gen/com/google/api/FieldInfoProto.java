// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/field_info.proto
// Protobuf Java Version: 4.27.2

package com.google.api;

public final class FieldInfoProto {
  private FieldInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.api.FieldInfoProto.fieldInfo);
  }
  public static final int FIELD_INFO_FIELD_NUMBER = 291403980;
  /**
   * <pre>
   * Rich semantic descriptor of an API field beyond the basic typing.
   *
   * Examples:
   *
   * string request_id = 1 [(google.api.field_info).format = UUID4];
   * string old_ip_address = 2 [(google.api.field_info).format = IPV4];
   * string new_ip_address = 3 [(google.api.field_info).format = IPV6];
   * string actual_ip_address = 4 [
   * (google.api.field_info).format = IPV4_OR_IPV6
   * ];
   * google.protobuf.Any generic_field = 5 [
   * (google.api.field_info).referenced_types = {type_name: "ActualType"},
   * (google.api.field_info).referenced_types = {type_name: "OtherType"},
   * ];
   * google.protobuf.Any generic_user_input = 5 [
   * (google.api.field_info).referenced_types = {type_name: "*"},
   * ];
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      com.google.api.FieldInfo> fieldInfo = com.google.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        com.google.protobuf.DescriptorProtos.FieldOptions.getDefaultInstance(),
        com.google.api.FieldInfo.getDefaultInstance(),
        com.google.api.FieldInfo.getDefaultInstance(),
        null,
        291403980,
        com.google.protobuf.WireFormat.FieldType.MESSAGE,
        com.google.api.FieldInfo.class);

  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
