// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/value.proto

// Protobuf Java Version: 3.25.2
package com.google.api.expr.v1alpha1;

/**
 * <pre>
 * An enum value.
 * </pre>
 *
 * Protobuf type {@code google.api.expr.v1alpha1.EnumValue}
 */
public  final class EnumValue extends
    com.google.protobuf.GeneratedMessageLite<
        EnumValue, EnumValue.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.expr.v1alpha1.EnumValue)
    EnumValueOrBuilder {
  private EnumValue() {
    type_ = "";
  }
  public static final int TYPE_FIELD_NUMBER = 1;
  private java.lang.String type_;
  /**
   * <pre>
   * The fully qualified name of the enum type.
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    return type_;
  }
  /**
   * <pre>
   * The fully qualified name of the enum type.
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(type_);
  }
  /**
   * <pre>
   * The fully qualified name of the enum type.
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @param value The type to set.
   */
  private void setType(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    type_ = value;
  }
  /**
   * <pre>
   * The fully qualified name of the enum type.
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   */
  private void clearType() {

    type_ = getDefaultInstance().getType();
  }
  /**
   * <pre>
   * The fully qualified name of the enum type.
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @param value The bytes for type to set.
   */
  private void setTypeBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    type_ = value.toStringUtf8();

  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private int value_;
  /**
   * <pre>
   * The value of the enum.
   * </pre>
   *
   * <code>int32 value = 2 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public int getValue() {
    return value_;
  }
  /**
   * <pre>
   * The value of the enum.
   * </pre>
   *
   * <code>int32 value = 2 [json_name = "value"];</code>
   * @param value The value to set.
   */
  private void setValue(int value) {
    
    value_ = value;
  }
  /**
   * <pre>
   * The value of the enum.
   * </pre>
   *
   * <code>int32 value = 2 [json_name = "value"];</code>
   */
  private void clearValue() {

    value_ = 0;
  }

  public static com.google.api.expr.v1alpha1.EnumValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1alpha1.EnumValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.EnumValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1alpha1.EnumValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.EnumValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1alpha1.EnumValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.EnumValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.expr.v1alpha1.EnumValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.api.expr.v1alpha1.EnumValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.api.expr.v1alpha1.EnumValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.EnumValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.expr.v1alpha1.EnumValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.api.expr.v1alpha1.EnumValue prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * An enum value.
   * </pre>
   *
   * Protobuf type {@code google.api.expr.v1alpha1.EnumValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.expr.v1alpha1.EnumValue, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.expr.v1alpha1.EnumValue)
      com.google.api.expr.v1alpha1.EnumValueOrBuilder {
    // Construct using com.google.api.expr.v1alpha1.EnumValue.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The fully qualified name of the enum type.
     * </pre>
     *
     * <code>string type = 1 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public java.lang.String getType() {
      return instance.getType();
    }
    /**
     * <pre>
     * The fully qualified name of the enum type.
     * </pre>
     *
     * <code>string type = 1 [json_name = "type"];</code>
     * @return The bytes for type.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      return instance.getTypeBytes();
    }
    /**
     * <pre>
     * The fully qualified name of the enum type.
     * </pre>
     *
     * <code>string type = 1 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <pre>
     * The fully qualified name of the enum type.
     * </pre>
     *
     * <code>string type = 1 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }
    /**
     * <pre>
     * The fully qualified name of the enum type.
     * </pre>
     *
     * <code>string type = 1 [json_name = "type"];</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTypeBytes(value);
      return this;
    }

    /**
     * <pre>
     * The value of the enum.
     * </pre>
     *
     * <code>int32 value = 2 [json_name = "value"];</code>
     * @return The value.
     */
    @java.lang.Override
    public int getValue() {
      return instance.getValue();
    }
    /**
     * <pre>
     * The value of the enum.
     * </pre>
     *
     * <code>int32 value = 2 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(int value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
    }
    /**
     * <pre>
     * The value of the enum.
     * </pre>
     *
     * <code>int32 value = 2 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      copyOnWrite();
      instance.clearValue();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.expr.v1alpha1.EnumValue)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.expr.v1alpha1.EnumValue();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "type_",
            "value_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0004" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.api.expr.v1alpha1.EnumValue> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.api.expr.v1alpha1.EnumValue.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.api.expr.v1alpha1.EnumValue>(
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


  // @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.EnumValue)
  private static final com.google.api.expr.v1alpha1.EnumValue DEFAULT_INSTANCE;
  static {
    EnumValue defaultInstance = new EnumValue();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      EnumValue.class, defaultInstance);
  }

  public static com.google.api.expr.v1alpha1.EnumValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<EnumValue> PARSER;

  public static com.google.protobuf.Parser<EnumValue> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

