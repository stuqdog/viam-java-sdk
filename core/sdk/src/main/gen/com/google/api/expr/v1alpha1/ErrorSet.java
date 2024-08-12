// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/expr/v1alpha1/eval.proto
// Protobuf Java Version: 4.27.2

package com.google.api.expr.v1alpha1;

/**
 * <pre>
 * A set of errors.
 *
 * The errors included depend on the context. See `ExprValue.error`.
 * </pre>
 *
 * Protobuf type {@code google.api.expr.v1alpha1.ErrorSet}
 */
public  final class ErrorSet extends
    com.google.protobuf.GeneratedMessageLite<
        ErrorSet, ErrorSet.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.expr.v1alpha1.ErrorSet)
    ErrorSetOrBuilder {
  private ErrorSet() {
    errors_ = emptyProtobufList();
  }
  public static final int ERRORS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.google.rpc.Status> errors_;
  /**
   * <pre>
   * The errors in the set.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.rpc.Status> getErrorsList() {
    return errors_;
  }
  /**
   * <pre>
   * The errors in the set.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
   */
  public java.util.List<? extends com.google.rpc.StatusOrBuilder> 
      getErrorsOrBuilderList() {
    return errors_;
  }
  /**
   * <pre>
   * The errors in the set.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
   */
  @java.lang.Override
  public int getErrorsCount() {
    return errors_.size();
  }
  /**
   * <pre>
   * The errors in the set.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
   */
  @java.lang.Override
  public com.google.rpc.Status getErrors(int index) {
    return errors_.get(index);
  }
  /**
   * <pre>
   * The errors in the set.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
   */
  public com.google.rpc.StatusOrBuilder getErrorsOrBuilder(
      int index) {
    return errors_.get(index);
  }
  private void ensureErrorsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.google.rpc.Status> tmp = errors_;
    if (!tmp.isModifiable()) {
      errors_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * The errors in the set.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
   */
  private void setErrors(
      int index, com.google.rpc.Status value) {
    value.getClass();
  ensureErrorsIsMutable();
    errors_.set(index, value);
  }
  /**
   * <pre>
   * The errors in the set.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
   */
  private void addErrors(com.google.rpc.Status value) {
    value.getClass();
  ensureErrorsIsMutable();
    errors_.add(value);
  }
  /**
   * <pre>
   * The errors in the set.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
   */
  private void addErrors(
      int index, com.google.rpc.Status value) {
    value.getClass();
  ensureErrorsIsMutable();
    errors_.add(index, value);
  }
  /**
   * <pre>
   * The errors in the set.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
   */
  private void addAllErrors(
      java.lang.Iterable<? extends com.google.rpc.Status> values) {
    ensureErrorsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, errors_);
  }
  /**
   * <pre>
   * The errors in the set.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
   */
  private void clearErrors() {
    errors_ = emptyProtobufList();
  }
  /**
   * <pre>
   * The errors in the set.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
   */
  private void removeErrors(int index) {
    ensureErrorsIsMutable();
    errors_.remove(index);
  }

  public static com.google.api.expr.v1alpha1.ErrorSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1alpha1.ErrorSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.ErrorSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1alpha1.ErrorSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.ErrorSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1alpha1.ErrorSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.ErrorSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.expr.v1alpha1.ErrorSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.api.expr.v1alpha1.ErrorSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.api.expr.v1alpha1.ErrorSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.ErrorSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.expr.v1alpha1.ErrorSet parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.api.expr.v1alpha1.ErrorSet prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A set of errors.
   *
   * The errors included depend on the context. See `ExprValue.error`.
   * </pre>
   *
   * Protobuf type {@code google.api.expr.v1alpha1.ErrorSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.expr.v1alpha1.ErrorSet, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.expr.v1alpha1.ErrorSet)
      com.google.api.expr.v1alpha1.ErrorSetOrBuilder {
    // Construct using com.google.api.expr.v1alpha1.ErrorSet.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    @java.lang.Override
    public java.util.List<com.google.rpc.Status> getErrorsList() {
      return java.util.Collections.unmodifiableList(
          instance.getErrorsList());
    }
    /**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    @java.lang.Override
    public int getErrorsCount() {
      return instance.getErrorsCount();
    }/**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    @java.lang.Override
    public com.google.rpc.Status getErrors(int index) {
      return instance.getErrors(index);
    }
    /**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    public Builder setErrors(
        int index, com.google.rpc.Status value) {
      copyOnWrite();
      instance.setErrors(index, value);
      return this;
    }
    /**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    public Builder setErrors(
        int index, com.google.rpc.Status.Builder builderForValue) {
      copyOnWrite();
      instance.setErrors(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    public Builder addErrors(com.google.rpc.Status value) {
      copyOnWrite();
      instance.addErrors(value);
      return this;
    }
    /**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    public Builder addErrors(
        int index, com.google.rpc.Status value) {
      copyOnWrite();
      instance.addErrors(index, value);
      return this;
    }
    /**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    public Builder addErrors(
        com.google.rpc.Status.Builder builderForValue) {
      copyOnWrite();
      instance.addErrors(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    public Builder addErrors(
        int index, com.google.rpc.Status.Builder builderForValue) {
      copyOnWrite();
      instance.addErrors(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    public Builder addAllErrors(
        java.lang.Iterable<? extends com.google.rpc.Status> values) {
      copyOnWrite();
      instance.addAllErrors(values);
      return this;
    }
    /**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    public Builder clearErrors() {
      copyOnWrite();
      instance.clearErrors();
      return this;
    }
    /**
     * <pre>
     * The errors in the set.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 1 [json_name = "errors"];</code>
     */
    public Builder removeErrors(int index) {
      copyOnWrite();
      instance.removeErrors(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.expr.v1alpha1.ErrorSet)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.expr.v1alpha1.ErrorSet();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "errors_",
            com.google.rpc.Status.class,
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.api.expr.v1alpha1.ErrorSet> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.api.expr.v1alpha1.ErrorSet.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.api.expr.v1alpha1.ErrorSet>(
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


  // @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.ErrorSet)
  private static final com.google.api.expr.v1alpha1.ErrorSet DEFAULT_INSTANCE;
  static {
    ErrorSet defaultInstance = new ErrorSet();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ErrorSet.class, defaultInstance);
  }

  public static com.google.api.expr.v1alpha1.ErrorSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ErrorSet> PARSER;

  public static com.google.protobuf.Parser<ErrorSet> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

