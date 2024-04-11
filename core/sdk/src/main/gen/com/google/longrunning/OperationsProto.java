// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

// Protobuf Java Version: 3.25.2
package com.google.longrunning;

public final class OperationsProto {
  private OperationsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
  }
  public static final int OPERATION_INFO_FIELD_NUMBER = 1049;
  /**
   * <pre>
   * Additional information regarding long-running operations.
   * In particular, this specifies the types that are returned from
   * long-running operations.
   *
   * Required for methods that return `google.longrunning.Operation`; invalid
   * otherwise.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      com.google.longrunning.OperationInfo> operationInfo = com.google.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        com.google.protobuf.DescriptorProtos.MethodOptions.getDefaultInstance(),
        com.google.longrunning.OperationInfo.getDefaultInstance(),
        com.google.longrunning.OperationInfo.getDefaultInstance(),
        null,
        1049,
        com.google.protobuf.WireFormat.FieldType.MESSAGE,
        com.google.longrunning.OperationInfo.class);

  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
