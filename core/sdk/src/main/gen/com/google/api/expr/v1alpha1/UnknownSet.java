// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/eval.proto

// Protobuf Java Version: 3.25.2
package com.google.api.expr.v1alpha1;

/**
 * <pre>
 * A set of expressions for which the value is unknown.
 *
 * The unknowns included depend on the context. See `ExprValue.unknown`.
 * </pre>
 *
 * Protobuf type {@code google.api.expr.v1alpha1.UnknownSet}
 */
public  final class UnknownSet extends
    com.google.protobuf.GeneratedMessageLite<
        UnknownSet, UnknownSet.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.expr.v1alpha1.UnknownSet)
    UnknownSetOrBuilder {
  private UnknownSet() {
    exprs_ = emptyLongList();
  }
  public static final int EXPRS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList exprs_;
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
   * @return A list containing the exprs.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getExprsList() {
    return exprs_;
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
   * @return The count of exprs.
   */
  @java.lang.Override
  public int getExprsCount() {
    return exprs_.size();
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
   * @param index The index of the element to return.
   * @return The exprs at the given index.
   */
  @java.lang.Override
  public long getExprs(int index) {
    return exprs_.getLong(index);
  }
  private int exprsMemoizedSerializedSize = -1;
  private void ensureExprsIsMutable() {
    com.google.protobuf.Internal.LongList tmp = exprs_;
    if (!tmp.isModifiable()) {
      exprs_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
   * @param index The index to set the value at.
   * @param value The exprs to set.
   */
  private void setExprs(
      int index, long value) {
    ensureExprsIsMutable();
    exprs_.setLong(index, value);
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
   * @param value The exprs to add.
   */
  private void addExprs(long value) {
    ensureExprsIsMutable();
    exprs_.addLong(value);
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
   * @param values The exprs to add.
   */
  private void addAllExprs(
      java.lang.Iterable<? extends java.lang.Long> values) {
    ensureExprsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, exprs_);
  }
  /**
   * <pre>
   * The ids of the expressions with unknown values.
   * </pre>
   *
   * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
   */
  private void clearExprs() {
    exprs_ = emptyLongList();
  }

  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.api.expr.v1alpha1.UnknownSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.api.expr.v1alpha1.UnknownSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.expr.v1alpha1.UnknownSet parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.api.expr.v1alpha1.UnknownSet prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A set of expressions for which the value is unknown.
   *
   * The unknowns included depend on the context. See `ExprValue.unknown`.
   * </pre>
   *
   * Protobuf type {@code google.api.expr.v1alpha1.UnknownSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.expr.v1alpha1.UnknownSet, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.expr.v1alpha1.UnknownSet)
      com.google.api.expr.v1alpha1.UnknownSetOrBuilder {
    // Construct using com.google.api.expr.v1alpha1.UnknownSet.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
     * @return A list containing the exprs.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getExprsList() {
      return java.util.Collections.unmodifiableList(
          instance.getExprsList());
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
     * @return The count of exprs.
     */
    @java.lang.Override
    public int getExprsCount() {
      return instance.getExprsCount();
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
     * @param index The index of the element to return.
     * @return The exprs at the given index.
     */
    @java.lang.Override
    public long getExprs(int index) {
      return instance.getExprs(index);
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
     * @param value The exprs to set.
     * @return This builder for chaining.
     */
    public Builder setExprs(
        int index, long value) {
      copyOnWrite();
      instance.setExprs(index, value);
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
     * @param value The exprs to add.
     * @return This builder for chaining.
     */
    public Builder addExprs(long value) {
      copyOnWrite();
      instance.addExprs(value);
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
     * @param values The exprs to add.
     * @return This builder for chaining.
     */
    public Builder addAllExprs(
        java.lang.Iterable<? extends java.lang.Long> values) {
      copyOnWrite();
      instance.addAllExprs(values);
      return this;
    }
    /**
     * <pre>
     * The ids of the expressions with unknown values.
     * </pre>
     *
     * <code>repeated int64 exprs = 1 [json_name = "exprs"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExprs() {
      copyOnWrite();
      instance.clearExprs();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.expr.v1alpha1.UnknownSet)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.expr.v1alpha1.UnknownSet();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "exprs_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.api.expr.v1alpha1.UnknownSet> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.api.expr.v1alpha1.UnknownSet.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.api.expr.v1alpha1.UnknownSet>(
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


  // @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.UnknownSet)
  private static final com.google.api.expr.v1alpha1.UnknownSet DEFAULT_INSTANCE;
  static {
    UnknownSet defaultInstance = new UnknownSet();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UnknownSet.class, defaultInstance);
  }

  public static com.google.api.expr.v1alpha1.UnknownSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UnknownSet> PARSER;

  public static com.google.protobuf.Parser<UnknownSet> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

