// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/reflection/v1alpha/reflection.proto

// Protobuf Java Version: 3.25.2
package com.viam.sdk.core.rpc.reflectionv1alpha;

public interface ServerReflectionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.reflection.v1alpha.ServerReflectionResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string valid_host = 1 [json_name = "validHost"];</code>
   *
   * @return The validHost.
   */
  String getValidHost();

  /**
   * <code>string valid_host = 1 [json_name = "validHost"];</code>
   *
   * @return The bytes for validHost.
   */
  com.google.protobuf.ByteString
  getValidHostBytes();

  /**
   * <code>.grpc.reflection.v1alpha.ServerReflectionRequest original_request = 2 [json_name =
   * "originalRequest"];</code>
   *
   * @return Whether the originalRequest field is set.
   */
  boolean hasOriginalRequest();

  /**
   * <code>.grpc.reflection.v1alpha.ServerReflectionRequest original_request = 2 [json_name =
   * "originalRequest"];</code>
   *
   * @return The originalRequest.
   */
  ServerReflectionRequest getOriginalRequest();

  /**
   * <pre>
   * This message is used to answer file_by_filename, file_containing_symbol,
   * file_containing_extension requests with transitive dependencies. As
   * the repeated label is not allowed in oneof fields, we use a
   * FileDescriptorResponse message to encapsulate the repeated fields.
   * The reflection service is allowed to avoid sending FileDescriptorProtos
   * that were previously sent in response to earlier requests in the stream.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.FileDescriptorResponse file_descriptor_response = 4 [json_name =
   * "fileDescriptorResponse"];</code>
   *
   * @return Whether the fileDescriptorResponse field is set.
   */
  boolean hasFileDescriptorResponse();

  /**
   * <pre>
   * This message is used to answer file_by_filename, file_containing_symbol,
   * file_containing_extension requests with transitive dependencies. As
   * the repeated label is not allowed in oneof fields, we use a
   * FileDescriptorResponse message to encapsulate the repeated fields.
   * The reflection service is allowed to avoid sending FileDescriptorProtos
   * that were previously sent in response to earlier requests in the stream.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.FileDescriptorResponse file_descriptor_response = 4 [json_name =
   * "fileDescriptorResponse"];</code>
   *
   * @return The fileDescriptorResponse.
   */
  FileDescriptorResponse getFileDescriptorResponse();

  /**
   * <pre>
   * This message is used to answer all_extension_numbers_of_type requst.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ExtensionNumberResponse all_extension_numbers_response = 5
   * [json_name = "allExtensionNumbersResponse"];</code>
   *
   * @return Whether the allExtensionNumbersResponse field is set.
   */
  boolean hasAllExtensionNumbersResponse();

  /**
   * <pre>
   * This message is used to answer all_extension_numbers_of_type requst.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ExtensionNumberResponse all_extension_numbers_response = 5
   * [json_name = "allExtensionNumbersResponse"];</code>
   *
   * @return The allExtensionNumbersResponse.
   */
  ExtensionNumberResponse getAllExtensionNumbersResponse();

  /**
   * <pre>
   * This message is used to answer list_services request.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ListServiceResponse list_services_response = 6 [json_name =
   * "listServicesResponse"];</code>
   *
   * @return Whether the listServicesResponse field is set.
   */
  boolean hasListServicesResponse();

  /**
   * <pre>
   * This message is used to answer list_services request.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ListServiceResponse list_services_response = 6 [json_name =
   * "listServicesResponse"];</code>
   *
   * @return The listServicesResponse.
   */
  ListServiceResponse getListServicesResponse();

  /**
   * <pre>
   * This message is used when an error occurs.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ErrorResponse error_response = 7 [json_name =
   * "errorResponse"];</code>
   *
   * @return Whether the errorResponse field is set.
   */
  boolean hasErrorResponse();

  /**
   * <pre>
   * This message is used when an error occurs.
   * </pre>
   *
   * <code>.grpc.reflection.v1alpha.ErrorResponse error_response = 7 [json_name =
   * "errorResponse"];</code>
   *
   * @return The errorResponse.
   */
  ErrorResponse getErrorResponse();

  ServerReflectionResponse.MessageResponseCase getMessageResponseCase();
}
