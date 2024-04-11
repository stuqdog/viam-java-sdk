// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/reflection/v1alpha/reflection.proto

// Protobuf Java Version: 3.25.2
package com.viam.sdk.core.rpc.reflectionv1alpha;

public interface ListServiceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.reflection.v1alpha.ListServiceResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The information of each service may be expanded in the future, so we use
   * ServiceResponse message to encapsulate it.
   * </pre>
   *
   * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1 [json_name =
   * "service"];</code>
   */
  java.util.List<ServiceResponse>
  getServiceList();

  /**
   * <pre>
   * The information of each service may be expanded in the future, so we use
   * ServiceResponse message to encapsulate it.
   * </pre>
   *
   * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1 [json_name =
   * "service"];</code>
   */
  ServiceResponse getService(int index);

  /**
   * <pre>
   * The information of each service may be expanded in the future, so we use
   * ServiceResponse message to encapsulate it.
   * </pre>
   *
   * <code>repeated .grpc.reflection.v1alpha.ServiceResponse service = 1 [json_name =
   * "service"];</code>
   */
  int getServiceCount();
}
