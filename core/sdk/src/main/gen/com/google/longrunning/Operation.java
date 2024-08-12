// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/longrunning/operations.proto
// Protobuf Java Version: 4.27.2

package com.google.longrunning;

/**
 * <pre>
 * This resource represents a long-running operation that is the result of a
 * network API call.
 * </pre>
 *
 * Protobuf type {@code google.longrunning.Operation}
 */
public  final class Operation extends
    com.google.protobuf.GeneratedMessageLite<
        Operation, Operation.Builder> implements
    // @@protoc_insertion_point(message_implements:google.longrunning.Operation)
    OperationOrBuilder {
  private Operation() {
    name_ = "";
  }
  private int bitField0_;
  private int resultCase_ = 0;
  private java.lang.Object result_;
  public enum ResultCase {
    ERROR(4),
    RESPONSE(5),
    RESULT_NOT_SET(0);
    private final int value;
    private ResultCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResultCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResultCase forNumber(int value) {
      switch (value) {
        case 4: return ERROR;
        case 5: return RESPONSE;
        case 0: return RESULT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public ResultCase
  getResultCase() {
    return ResultCase.forNumber(
        resultCase_);
  }

  private void clearResult() {
    resultCase_ = 0;
    result_ = null;
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * The server-assigned name, which is only unique within the same service that
   * originally returns it. If you use the default HTTP mapping, the
   * `name` should be a resource name ending with `operations/{unique_id}`.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * The server-assigned name, which is only unique within the same service that
   * originally returns it. If you use the default HTTP mapping, the
   * `name` should be a resource name ending with `operations/{unique_id}`.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * The server-assigned name, which is only unique within the same service that
   * originally returns it. If you use the default HTTP mapping, the
   * `name` should be a resource name ending with `operations/{unique_id}`.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <pre>
   * The server-assigned name, which is only unique within the same service that
   * originally returns it. If you use the default HTTP mapping, the
   * `name` should be a resource name ending with `operations/{unique_id}`.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   */
  private void clearName() {

    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * The server-assigned name, which is only unique within the same service that
   * originally returns it. If you use the default HTTP mapping, the
   * `name` should be a resource name ending with `operations/{unique_id}`.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();

  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.google.protobuf.Any metadata_;
  /**
   * <pre>
   * Service-specific metadata associated with the operation.  It typically
   * contains progress information and common metadata such as create time.
   * Some services might not provide such metadata.  Any method that returns a
   * long-running operation should document the metadata type, if any.
   * </pre>
   *
   * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Service-specific metadata associated with the operation.  It typically
   * contains progress information and common metadata such as create time.
   * Some services might not provide such metadata.  Any method that returns a
   * long-running operation should document the metadata type, if any.
   * </pre>
   *
   * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Any getMetadata() {
    return metadata_ == null ? com.google.protobuf.Any.getDefaultInstance() : metadata_;
  }
  /**
   * <pre>
   * Service-specific metadata associated with the operation.  It typically
   * contains progress information and common metadata such as create time.
   * Some services might not provide such metadata.  Any method that returns a
   * long-running operation should document the metadata type, if any.
   * </pre>
   *
   * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
   */
  private void setMetadata(com.google.protobuf.Any value) {
    value.getClass();
  metadata_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * Service-specific metadata associated with the operation.  It typically
   * contains progress information and common metadata such as create time.
   * Some services might not provide such metadata.  Any method that returns a
   * long-running operation should document the metadata type, if any.
   * </pre>
   *
   * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeMetadata(com.google.protobuf.Any value) {
    value.getClass();
  if (metadata_ != null &&
        metadata_ != com.google.protobuf.Any.getDefaultInstance()) {
      metadata_ =
        com.google.protobuf.Any.newBuilder(metadata_).mergeFrom(value).buildPartial();
    } else {
      metadata_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Service-specific metadata associated with the operation.  It typically
   * contains progress information and common metadata such as create time.
   * Some services might not provide such metadata.  Any method that returns a
   * long-running operation should document the metadata type, if any.
   * </pre>
   *
   * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
   */
  private void clearMetadata() {  metadata_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int DONE_FIELD_NUMBER = 3;
  private boolean done_;
  /**
   * <pre>
   * If the value is `false`, it means the operation is still in progress.
   * If `true`, the operation is completed, and either `error` or `response` is
   * available.
   * </pre>
   *
   * <code>bool done = 3 [json_name = "done"];</code>
   * @return The done.
   */
  @java.lang.Override
  public boolean getDone() {
    return done_;
  }
  /**
   * <pre>
   * If the value is `false`, it means the operation is still in progress.
   * If `true`, the operation is completed, and either `error` or `response` is
   * available.
   * </pre>
   *
   * <code>bool done = 3 [json_name = "done"];</code>
   * @param value The done to set.
   */
  private void setDone(boolean value) {
    
    done_ = value;
  }
  /**
   * <pre>
   * If the value is `false`, it means the operation is still in progress.
   * If `true`, the operation is completed, and either `error` or `response` is
   * available.
   * </pre>
   *
   * <code>bool done = 3 [json_name = "done"];</code>
   */
  private void clearDone() {

    done_ = false;
  }

  public static final int ERROR_FIELD_NUMBER = 4;
  /**
   * <pre>
   * The error result of the operation in case of failure or cancellation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
   */
  @java.lang.Override
  public boolean hasError() {
    return resultCase_ == 4;
  }
  /**
   * <pre>
   * The error result of the operation in case of failure or cancellation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
   */
  @java.lang.Override
  public com.google.rpc.Status getError() {
    if (resultCase_ == 4) {
       return (com.google.rpc.Status) result_;
    }
    return com.google.rpc.Status.getDefaultInstance();
  }
  /**
   * <pre>
   * The error result of the operation in case of failure or cancellation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
   */
  private void setError(com.google.rpc.Status value) {
    value.getClass();
  result_ = value;
    resultCase_ = 4;
  }
  /**
   * <pre>
   * The error result of the operation in case of failure or cancellation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
   */
  private void mergeError(com.google.rpc.Status value) {
    value.getClass();
  if (resultCase_ == 4 &&
        result_ != com.google.rpc.Status.getDefaultInstance()) {
      result_ = com.google.rpc.Status.newBuilder((com.google.rpc.Status) result_)
          .mergeFrom(value).buildPartial();
    } else {
      result_ = value;
    }
    resultCase_ = 4;
  }
  /**
   * <pre>
   * The error result of the operation in case of failure or cancellation.
   * </pre>
   *
   * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
   */
  private void clearError() {
    if (resultCase_ == 4) {
      resultCase_ = 0;
      result_ = null;
    }
  }

  public static final int RESPONSE_FIELD_NUMBER = 5;
  /**
   * <pre>
   * The normal response of the operation in case of success.  If the original
   * method returns no data on success, such as `Delete`, the response is
   * `google.protobuf.Empty`.  If the original method is standard
   * `Get`/`Create`/`Update`, the response should be the resource.  For other
   * methods, the response should have the type `XxxResponse`, where `Xxx`
   * is the original method name.  For example, if the original method name
   * is `TakeSnapshot()`, the inferred response type is
   * `TakeSnapshotResponse`.
   * </pre>
   *
   * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
   */
  @java.lang.Override
  public boolean hasResponse() {
    return resultCase_ == 5;
  }
  /**
   * <pre>
   * The normal response of the operation in case of success.  If the original
   * method returns no data on success, such as `Delete`, the response is
   * `google.protobuf.Empty`.  If the original method is standard
   * `Get`/`Create`/`Update`, the response should be the resource.  For other
   * methods, the response should have the type `XxxResponse`, where `Xxx`
   * is the original method name.  For example, if the original method name
   * is `TakeSnapshot()`, the inferred response type is
   * `TakeSnapshotResponse`.
   * </pre>
   *
   * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Any getResponse() {
    if (resultCase_ == 5) {
       return (com.google.protobuf.Any) result_;
    }
    return com.google.protobuf.Any.getDefaultInstance();
  }
  /**
   * <pre>
   * The normal response of the operation in case of success.  If the original
   * method returns no data on success, such as `Delete`, the response is
   * `google.protobuf.Empty`.  If the original method is standard
   * `Get`/`Create`/`Update`, the response should be the resource.  For other
   * methods, the response should have the type `XxxResponse`, where `Xxx`
   * is the original method name.  For example, if the original method name
   * is `TakeSnapshot()`, the inferred response type is
   * `TakeSnapshotResponse`.
   * </pre>
   *
   * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
   */
  private void setResponse(com.google.protobuf.Any value) {
    value.getClass();
  result_ = value;
    resultCase_ = 5;
  }
  /**
   * <pre>
   * The normal response of the operation in case of success.  If the original
   * method returns no data on success, such as `Delete`, the response is
   * `google.protobuf.Empty`.  If the original method is standard
   * `Get`/`Create`/`Update`, the response should be the resource.  For other
   * methods, the response should have the type `XxxResponse`, where `Xxx`
   * is the original method name.  For example, if the original method name
   * is `TakeSnapshot()`, the inferred response type is
   * `TakeSnapshotResponse`.
   * </pre>
   *
   * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
   */
  private void mergeResponse(com.google.protobuf.Any value) {
    value.getClass();
  if (resultCase_ == 5 &&
        result_ != com.google.protobuf.Any.getDefaultInstance()) {
      result_ = com.google.protobuf.Any.newBuilder((com.google.protobuf.Any) result_)
          .mergeFrom(value).buildPartial();
    } else {
      result_ = value;
    }
    resultCase_ = 5;
  }
  /**
   * <pre>
   * The normal response of the operation in case of success.  If the original
   * method returns no data on success, such as `Delete`, the response is
   * `google.protobuf.Empty`.  If the original method is standard
   * `Get`/`Create`/`Update`, the response should be the resource.  For other
   * methods, the response should have the type `XxxResponse`, where `Xxx`
   * is the original method name.  For example, if the original method name
   * is `TakeSnapshot()`, the inferred response type is
   * `TakeSnapshotResponse`.
   * </pre>
   *
   * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
   */
  private void clearResponse() {
    if (resultCase_ == 5) {
      resultCase_ = 0;
      result_ = null;
    }
  }

  public static com.google.longrunning.Operation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.longrunning.Operation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.longrunning.Operation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.longrunning.Operation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.longrunning.Operation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.longrunning.Operation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.longrunning.Operation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.longrunning.Operation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.longrunning.Operation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.longrunning.Operation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.longrunning.Operation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.longrunning.Operation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.longrunning.Operation prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * This resource represents a long-running operation that is the result of a
   * network API call.
   * </pre>
   *
   * Protobuf type {@code google.longrunning.Operation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.longrunning.Operation, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.longrunning.Operation)
      com.google.longrunning.OperationOrBuilder {
    // Construct using com.google.longrunning.Operation.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public ResultCase
        getResultCase() {
      return instance.getResultCase();
    }

    public Builder clearResult() {
      copyOnWrite();
      instance.clearResult();
      return this;
    }


    /**
     * <pre>
     * The server-assigned name, which is only unique within the same service that
     * originally returns it. If you use the default HTTP mapping, the
     * `name` should be a resource name ending with `operations/{unique_id}`.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * The server-assigned name, which is only unique within the same service that
     * originally returns it. If you use the default HTTP mapping, the
     * `name` should be a resource name ending with `operations/{unique_id}`.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * The server-assigned name, which is only unique within the same service that
     * originally returns it. If you use the default HTTP mapping, the
     * `name` should be a resource name ending with `operations/{unique_id}`.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * The server-assigned name, which is only unique within the same service that
     * originally returns it. If you use the default HTTP mapping, the
     * `name` should be a resource name ending with `operations/{unique_id}`.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * The server-assigned name, which is only unique within the same service that
     * originally returns it. If you use the default HTTP mapping, the
     * `name` should be a resource name ending with `operations/{unique_id}`.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * Service-specific metadata associated with the operation.  It typically
     * contains progress information and common metadata such as create time.
     * Some services might not provide such metadata.  Any method that returns a
     * long-running operation should document the metadata type, if any.
     * </pre>
     *
     * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
     */
    @java.lang.Override
    public boolean hasMetadata() {
      return instance.hasMetadata();
    }
    /**
     * <pre>
     * Service-specific metadata associated with the operation.  It typically
     * contains progress information and common metadata such as create time.
     * Some services might not provide such metadata.  Any method that returns a
     * long-running operation should document the metadata type, if any.
     * </pre>
     *
     * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.Any getMetadata() {
      return instance.getMetadata();
    }
    /**
     * <pre>
     * Service-specific metadata associated with the operation.  It typically
     * contains progress information and common metadata such as create time.
     * Some services might not provide such metadata.  Any method that returns a
     * long-running operation should document the metadata type, if any.
     * </pre>
     *
     * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(com.google.protobuf.Any value) {
      copyOnWrite();
      instance.setMetadata(value);
      return this;
      }
    /**
     * <pre>
     * Service-specific metadata associated with the operation.  It typically
     * contains progress information and common metadata such as create time.
     * Some services might not provide such metadata.  Any method that returns a
     * long-running operation should document the metadata type, if any.
     * </pre>
     *
     * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(
        com.google.protobuf.Any.Builder builderForValue) {
      copyOnWrite();
      instance.setMetadata(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Service-specific metadata associated with the operation.  It typically
     * contains progress information and common metadata such as create time.
     * Some services might not provide such metadata.  Any method that returns a
     * long-running operation should document the metadata type, if any.
     * </pre>
     *
     * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder mergeMetadata(com.google.protobuf.Any value) {
      copyOnWrite();
      instance.mergeMetadata(value);
      return this;
    }
    /**
     * <pre>
     * Service-specific metadata associated with the operation.  It typically
     * contains progress information and common metadata such as create time.
     * Some services might not provide such metadata.  Any method that returns a
     * long-running operation should document the metadata type, if any.
     * </pre>
     *
     * <code>.google.protobuf.Any metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder clearMetadata() {  copyOnWrite();
      instance.clearMetadata();
      return this;
    }

    /**
     * <pre>
     * If the value is `false`, it means the operation is still in progress.
     * If `true`, the operation is completed, and either `error` or `response` is
     * available.
     * </pre>
     *
     * <code>bool done = 3 [json_name = "done"];</code>
     * @return The done.
     */
    @java.lang.Override
    public boolean getDone() {
      return instance.getDone();
    }
    /**
     * <pre>
     * If the value is `false`, it means the operation is still in progress.
     * If `true`, the operation is completed, and either `error` or `response` is
     * available.
     * </pre>
     *
     * <code>bool done = 3 [json_name = "done"];</code>
     * @param value The done to set.
     * @return This builder for chaining.
     */
    public Builder setDone(boolean value) {
      copyOnWrite();
      instance.setDone(value);
      return this;
    }
    /**
     * <pre>
     * If the value is `false`, it means the operation is still in progress.
     * If `true`, the operation is completed, and either `error` or `response` is
     * available.
     * </pre>
     *
     * <code>bool done = 3 [json_name = "done"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDone() {
      copyOnWrite();
      instance.clearDone();
      return this;
    }

    /**
     * <pre>
     * The error result of the operation in case of failure or cancellation.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
     */
    @java.lang.Override
    public boolean hasError() {
      return instance.hasError();
    }
    /**
     * <pre>
     * The error result of the operation in case of failure or cancellation.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
     */
    @java.lang.Override
    public com.google.rpc.Status getError() {
      return instance.getError();
    }
    /**
     * <pre>
     * The error result of the operation in case of failure or cancellation.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
     */
    public Builder setError(com.google.rpc.Status value) {
      copyOnWrite();
      instance.setError(value);
      return this;
    }
    /**
     * <pre>
     * The error result of the operation in case of failure or cancellation.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
     */
    public Builder setError(
        com.google.rpc.Status.Builder builderForValue) {
      copyOnWrite();
      instance.setError(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The error result of the operation in case of failure or cancellation.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
     */
    public Builder mergeError(com.google.rpc.Status value) {
      copyOnWrite();
      instance.mergeError(value);
      return this;
    }
    /**
     * <pre>
     * The error result of the operation in case of failure or cancellation.
     * </pre>
     *
     * <code>.google.rpc.Status error = 4 [json_name = "error"];</code>
     */
    public Builder clearError() {
      copyOnWrite();
      instance.clearError();
      return this;
    }

    /**
     * <pre>
     * The normal response of the operation in case of success.  If the original
     * method returns no data on success, such as `Delete`, the response is
     * `google.protobuf.Empty`.  If the original method is standard
     * `Get`/`Create`/`Update`, the response should be the resource.  For other
     * methods, the response should have the type `XxxResponse`, where `Xxx`
     * is the original method name.  For example, if the original method name
     * is `TakeSnapshot()`, the inferred response type is
     * `TakeSnapshotResponse`.
     * </pre>
     *
     * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
     */
    @java.lang.Override
    public boolean hasResponse() {
      return instance.hasResponse();
    }
    /**
     * <pre>
     * The normal response of the operation in case of success.  If the original
     * method returns no data on success, such as `Delete`, the response is
     * `google.protobuf.Empty`.  If the original method is standard
     * `Get`/`Create`/`Update`, the response should be the resource.  For other
     * methods, the response should have the type `XxxResponse`, where `Xxx`
     * is the original method name.  For example, if the original method name
     * is `TakeSnapshot()`, the inferred response type is
     * `TakeSnapshotResponse`.
     * </pre>
     *
     * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.Any getResponse() {
      return instance.getResponse();
    }
    /**
     * <pre>
     * The normal response of the operation in case of success.  If the original
     * method returns no data on success, such as `Delete`, the response is
     * `google.protobuf.Empty`.  If the original method is standard
     * `Get`/`Create`/`Update`, the response should be the resource.  For other
     * methods, the response should have the type `XxxResponse`, where `Xxx`
     * is the original method name.  For example, if the original method name
     * is `TakeSnapshot()`, the inferred response type is
     * `TakeSnapshotResponse`.
     * </pre>
     *
     * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
     */
    public Builder setResponse(com.google.protobuf.Any value) {
      copyOnWrite();
      instance.setResponse(value);
      return this;
    }
    /**
     * <pre>
     * The normal response of the operation in case of success.  If the original
     * method returns no data on success, such as `Delete`, the response is
     * `google.protobuf.Empty`.  If the original method is standard
     * `Get`/`Create`/`Update`, the response should be the resource.  For other
     * methods, the response should have the type `XxxResponse`, where `Xxx`
     * is the original method name.  For example, if the original method name
     * is `TakeSnapshot()`, the inferred response type is
     * `TakeSnapshotResponse`.
     * </pre>
     *
     * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
     */
    public Builder setResponse(
        com.google.protobuf.Any.Builder builderForValue) {
      copyOnWrite();
      instance.setResponse(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The normal response of the operation in case of success.  If the original
     * method returns no data on success, such as `Delete`, the response is
     * `google.protobuf.Empty`.  If the original method is standard
     * `Get`/`Create`/`Update`, the response should be the resource.  For other
     * methods, the response should have the type `XxxResponse`, where `Xxx`
     * is the original method name.  For example, if the original method name
     * is `TakeSnapshot()`, the inferred response type is
     * `TakeSnapshotResponse`.
     * </pre>
     *
     * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
     */
    public Builder mergeResponse(com.google.protobuf.Any value) {
      copyOnWrite();
      instance.mergeResponse(value);
      return this;
    }
    /**
     * <pre>
     * The normal response of the operation in case of success.  If the original
     * method returns no data on success, such as `Delete`, the response is
     * `google.protobuf.Empty`.  If the original method is standard
     * `Get`/`Create`/`Update`, the response should be the resource.  For other
     * methods, the response should have the type `XxxResponse`, where `Xxx`
     * is the original method name.  For example, if the original method name
     * is `TakeSnapshot()`, the inferred response type is
     * `TakeSnapshotResponse`.
     * </pre>
     *
     * <code>.google.protobuf.Any response = 5 [json_name = "response"];</code>
     */
    public Builder clearResponse() {
      copyOnWrite();
      instance.clearResponse();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.longrunning.Operation)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.longrunning.Operation();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "result_",
            "resultCase_",
            "bitField0_",
            "name_",
            "metadata_",
            "done_",
            com.google.rpc.Status.class,
            com.google.protobuf.Any.class,
          };
          java.lang.String info =
              "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u1009" +
              "\u0000\u0003\u0007\u0004<\u0000\u0005<\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.longrunning.Operation> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.longrunning.Operation.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.longrunning.Operation>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.longrunning.Operation)
  private static final com.google.longrunning.Operation DEFAULT_INSTANCE;
  static {
    Operation defaultInstance = new Operation();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Operation.class, defaultInstance);
  }

  public static com.google.longrunning.Operation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Operation> PARSER;

  public static com.google.protobuf.Parser<Operation> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

