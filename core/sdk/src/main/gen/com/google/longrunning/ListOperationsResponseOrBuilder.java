// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

// Protobuf Java Version: 3.25.2
package com.google.longrunning;

public interface ListOperationsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.longrunning.ListOperationsResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1 [json_name = "operations"];</code>
   */
  java.util.List<com.google.longrunning.Operation> 
      getOperationsList();
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1 [json_name = "operations"];</code>
   */
  com.google.longrunning.Operation getOperations(int index);
  /**
   * <pre>
   * A list of operations that matches the specified filter in the request.
   * </pre>
   *
   * <code>repeated .google.longrunning.Operation operations = 1 [json_name = "operations"];</code>
   */
  int getOperationsCount();

  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The standard List next-page token.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
