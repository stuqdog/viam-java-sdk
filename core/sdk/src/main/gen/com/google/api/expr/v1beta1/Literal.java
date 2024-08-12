// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/expr/v1beta1/expr.proto
// Protobuf Java Version: 4.27.2

package com.google.api.expr.v1beta1;

/**
 * <pre>
 * Represents a primitive literal.
 *
 * This is similar to the primitives supported in the well-known type
 * `google.protobuf.Value`, but richer so it can represent CEL's full range of
 * primitives.
 *
 * Lists and structs are not included as constants as these aggregate types may
 * contain [Expr][google.api.expr.v1beta1.Expr] elements which require evaluation and are thus not constant.
 *
 * Examples of literals include: `"hello"`, `b'bytes'`, `1u`, `4.2`, `-2`,
 * `true`, `null`.
 * </pre>
 *
 * Protobuf type {@code google.api.expr.v1beta1.Literal}
 */
public  final class Literal extends
    com.google.protobuf.GeneratedMessageLite<
        Literal, Literal.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.expr.v1beta1.Literal)
    LiteralOrBuilder {
  private Literal() {
  }
  private int constantKindCase_ = 0;
  private java.lang.Object constantKind_;
  public enum ConstantKindCase {
    NULL_VALUE(1),
    BOOL_VALUE(2),
    INT64_VALUE(3),
    UINT64_VALUE(4),
    DOUBLE_VALUE(5),
    STRING_VALUE(6),
    BYTES_VALUE(7),
    CONSTANTKIND_NOT_SET(0);
    private final int value;
    private ConstantKindCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConstantKindCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConstantKindCase forNumber(int value) {
      switch (value) {
        case 1: return NULL_VALUE;
        case 2: return BOOL_VALUE;
        case 3: return INT64_VALUE;
        case 4: return UINT64_VALUE;
        case 5: return DOUBLE_VALUE;
        case 6: return STRING_VALUE;
        case 7: return BYTES_VALUE;
        case 0: return CONSTANTKIND_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public ConstantKindCase
  getConstantKindCase() {
    return ConstantKindCase.forNumber(
        constantKindCase_);
  }

  private void clearConstantKind() {
    constantKindCase_ = 0;
    constantKind_ = null;
  }

  public static final int NULL_VALUE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
   * @return Whether the nullValue field is set.
   */
  @java.lang.Override
  public boolean hasNullValue() {
    return constantKindCase_ == 1;
  }
  /**
   * <pre>
   * null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
   * @return The enum numeric value on the wire for nullValue.
   */
  @java.lang.Override
  public int getNullValueValue() {
    if (constantKindCase_ == 1) {
      return (java.lang.Integer) constantKind_;
    }
    return 0;
  }
  /**
   * <pre>
   * null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
   * @return The nullValue.
   */
  @java.lang.Override
  public com.google.protobuf.NullValue getNullValue() {
    if (constantKindCase_ == 1) {
      com.google.protobuf.NullValue result = com.google.protobuf.NullValue.forNumber((java.lang.Integer) constantKind_);
      return result == null ? com.google.protobuf.NullValue.UNRECOGNIZED : result;
    }
    return com.google.protobuf.NullValue.NULL_VALUE;
  }
  /**
   * <pre>
   * null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
   * @param value The enum numeric value on the wire for nullValue to set.
   */
  private void setNullValueValue(int value) {
    constantKindCase_ = 1;
    constantKind_ = value;
  }
  /**
   * <pre>
   * null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
   * @param value The nullValue to set.
   */
  private void setNullValue(com.google.protobuf.NullValue value) {
    constantKind_ = value.getNumber();
    constantKindCase_ = 1;
  }
  /**
   * <pre>
   * null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
   */
  private void clearNullValue() {
    if (constantKindCase_ == 1) {
      constantKindCase_ = 0;
      constantKind_ = null;
    }
  }

  public static final int BOOL_VALUE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * boolean value.
   * </pre>
   *
   * <code>bool bool_value = 2 [json_name = "boolValue"];</code>
   * @return Whether the boolValue field is set.
   */
  @java.lang.Override
  public boolean hasBoolValue() {
    return constantKindCase_ == 2;
  }
  /**
   * <pre>
   * boolean value.
   * </pre>
   *
   * <code>bool bool_value = 2 [json_name = "boolValue"];</code>
   * @return The boolValue.
   */
  @java.lang.Override
  public boolean getBoolValue() {
    if (constantKindCase_ == 2) {
      return (java.lang.Boolean) constantKind_;
    }
    return false;
  }
  /**
   * <pre>
   * boolean value.
   * </pre>
   *
   * <code>bool bool_value = 2 [json_name = "boolValue"];</code>
   * @param value The boolValue to set.
   */
  private void setBoolValue(boolean value) {
    constantKindCase_ = 2;
    constantKind_ = value;
  }
  /**
   * <pre>
   * boolean value.
   * </pre>
   *
   * <code>bool bool_value = 2 [json_name = "boolValue"];</code>
   */
  private void clearBoolValue() {
    if (constantKindCase_ == 2) {
      constantKindCase_ = 0;
      constantKind_ = null;
    }
  }

  public static final int INT64_VALUE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * int64 value.
   * </pre>
   *
   * <code>int64 int64_value = 3 [json_name = "int64Value"];</code>
   * @return Whether the int64Value field is set.
   */
  @java.lang.Override
  public boolean hasInt64Value() {
    return constantKindCase_ == 3;
  }
  /**
   * <pre>
   * int64 value.
   * </pre>
   *
   * <code>int64 int64_value = 3 [json_name = "int64Value"];</code>
   * @return The int64Value.
   */
  @java.lang.Override
  public long getInt64Value() {
    if (constantKindCase_ == 3) {
      return (java.lang.Long) constantKind_;
    }
    return 0L;
  }
  /**
   * <pre>
   * int64 value.
   * </pre>
   *
   * <code>int64 int64_value = 3 [json_name = "int64Value"];</code>
   * @param value The int64Value to set.
   */
  private void setInt64Value(long value) {
    constantKindCase_ = 3;
    constantKind_ = value;
  }
  /**
   * <pre>
   * int64 value.
   * </pre>
   *
   * <code>int64 int64_value = 3 [json_name = "int64Value"];</code>
   */
  private void clearInt64Value() {
    if (constantKindCase_ == 3) {
      constantKindCase_ = 0;
      constantKind_ = null;
    }
  }

  public static final int UINT64_VALUE_FIELD_NUMBER = 4;
  /**
   * <pre>
   * uint64 value.
   * </pre>
   *
   * <code>uint64 uint64_value = 4 [json_name = "uint64Value"];</code>
   * @return Whether the uint64Value field is set.
   */
  @java.lang.Override
  public boolean hasUint64Value() {
    return constantKindCase_ == 4;
  }
  /**
   * <pre>
   * uint64 value.
   * </pre>
   *
   * <code>uint64 uint64_value = 4 [json_name = "uint64Value"];</code>
   * @return The uint64Value.
   */
  @java.lang.Override
  public long getUint64Value() {
    if (constantKindCase_ == 4) {
      return (java.lang.Long) constantKind_;
    }
    return 0L;
  }
  /**
   * <pre>
   * uint64 value.
   * </pre>
   *
   * <code>uint64 uint64_value = 4 [json_name = "uint64Value"];</code>
   * @param value The uint64Value to set.
   */
  private void setUint64Value(long value) {
    constantKindCase_ = 4;
    constantKind_ = value;
  }
  /**
   * <pre>
   * uint64 value.
   * </pre>
   *
   * <code>uint64 uint64_value = 4 [json_name = "uint64Value"];</code>
   */
  private void clearUint64Value() {
    if (constantKindCase_ == 4) {
      constantKindCase_ = 0;
      constantKind_ = null;
    }
  }

  public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
  /**
   * <pre>
   * double value.
   * </pre>
   *
   * <code>double double_value = 5 [json_name = "doubleValue"];</code>
   * @return Whether the doubleValue field is set.
   */
  @java.lang.Override
  public boolean hasDoubleValue() {
    return constantKindCase_ == 5;
  }
  /**
   * <pre>
   * double value.
   * </pre>
   *
   * <code>double double_value = 5 [json_name = "doubleValue"];</code>
   * @return The doubleValue.
   */
  @java.lang.Override
  public double getDoubleValue() {
    if (constantKindCase_ == 5) {
      return (java.lang.Double) constantKind_;
    }
    return 0D;
  }
  /**
   * <pre>
   * double value.
   * </pre>
   *
   * <code>double double_value = 5 [json_name = "doubleValue"];</code>
   * @param value The doubleValue to set.
   */
  private void setDoubleValue(double value) {
    constantKindCase_ = 5;
    constantKind_ = value;
  }
  /**
   * <pre>
   * double value.
   * </pre>
   *
   * <code>double double_value = 5 [json_name = "doubleValue"];</code>
   */
  private void clearDoubleValue() {
    if (constantKindCase_ == 5) {
      constantKindCase_ = 0;
      constantKind_ = null;
    }
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 6;
  /**
   * <pre>
   * string value.
   * </pre>
   *
   * <code>string string_value = 6 [json_name = "stringValue"];</code>
   * @return Whether the stringValue field is set.
   */
  @java.lang.Override
  public boolean hasStringValue() {
    return constantKindCase_ == 6;
  }
  /**
   * <pre>
   * string value.
   * </pre>
   *
   * <code>string string_value = 6 [json_name = "stringValue"];</code>
   * @return The stringValue.
   */
  @java.lang.Override
  public java.lang.String getStringValue() {
    java.lang.String ref = "";
    if (constantKindCase_ == 6) {
      ref = (java.lang.String) constantKind_;
    }
    return ref;
  }
  /**
   * <pre>
   * string value.
   * </pre>
   *
   * <code>string string_value = 6 [json_name = "stringValue"];</code>
   * @return The bytes for stringValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    java.lang.String ref = "";
    if (constantKindCase_ == 6) {
      ref = (java.lang.String) constantKind_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * string value.
   * </pre>
   *
   * <code>string string_value = 6 [json_name = "stringValue"];</code>
   * @param value The stringValue to set.
   */
  private void setStringValue(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  constantKindCase_ = 6;
    constantKind_ = value;
  }
  /**
   * <pre>
   * string value.
   * </pre>
   *
   * <code>string string_value = 6 [json_name = "stringValue"];</code>
   */
  private void clearStringValue() {
    if (constantKindCase_ == 6) {
      constantKindCase_ = 0;
      constantKind_ = null;
    }
  }
  /**
   * <pre>
   * string value.
   * </pre>
   *
   * <code>string string_value = 6 [json_name = "stringValue"];</code>
   * @param value The bytes for stringValue to set.
   */
  private void setStringValueBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    constantKind_ = value.toStringUtf8();
    constantKindCase_ = 6;
  }

  public static final int BYTES_VALUE_FIELD_NUMBER = 7;
  /**
   * <pre>
   * bytes value.
   * </pre>
   *
   * <code>bytes bytes_value = 7 [json_name = "bytesValue"];</code>
   * @return Whether the bytesValue field is set.
   */
  @java.lang.Override
  public boolean hasBytesValue() {
    return constantKindCase_ == 7;
  }
  /**
   * <pre>
   * bytes value.
   * </pre>
   *
   * <code>bytes bytes_value = 7 [json_name = "bytesValue"];</code>
   * @return The bytesValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBytesValue() {
    if (constantKindCase_ == 7) {
      return (com.google.protobuf.ByteString) constantKind_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }
  /**
   * <pre>
   * bytes value.
   * </pre>
   *
   * <code>bytes bytes_value = 7 [json_name = "bytesValue"];</code>
   * @param value The bytesValue to set.
   */
  private void setBytesValue(com.google.protobuf.ByteString value) {
    java.lang.Class<?> valueClass = value.getClass();
  constantKindCase_ = 7;
    constantKind_ = value;
  }
  /**
   * <pre>
   * bytes value.
   * </pre>
   *
   * <code>bytes bytes_value = 7 [json_name = "bytesValue"];</code>
   */
  private void clearBytesValue() {
    if (constantKindCase_ == 7) {
      constantKindCase_ = 0;
      constantKind_ = null;
    }
  }

  public static com.google.api.expr.v1beta1.Literal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.api.expr.v1beta1.Literal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.api.expr.v1beta1.Literal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.expr.v1beta1.Literal parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.api.expr.v1beta1.Literal prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Represents a primitive literal.
   *
   * This is similar to the primitives supported in the well-known type
   * `google.protobuf.Value`, but richer so it can represent CEL's full range of
   * primitives.
   *
   * Lists and structs are not included as constants as these aggregate types may
   * contain [Expr][google.api.expr.v1beta1.Expr] elements which require evaluation and are thus not constant.
   *
   * Examples of literals include: `"hello"`, `b'bytes'`, `1u`, `4.2`, `-2`,
   * `true`, `null`.
   * </pre>
   *
   * Protobuf type {@code google.api.expr.v1beta1.Literal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.expr.v1beta1.Literal, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.expr.v1beta1.Literal)
      com.google.api.expr.v1beta1.LiteralOrBuilder {
    // Construct using com.google.api.expr.v1beta1.Literal.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public ConstantKindCase
        getConstantKindCase() {
      return instance.getConstantKindCase();
    }

    public Builder clearConstantKind() {
      copyOnWrite();
      instance.clearConstantKind();
      return this;
    }


    /**
     * <pre>
     * null value.
     * </pre>
     *
     * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
     * @return Whether the nullValue field is set.
     */
    @java.lang.Override
    public boolean hasNullValue() {
      return instance.hasNullValue();
    }
    /**
     * <pre>
     * null value.
     * </pre>
     *
     * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
     * @return The enum numeric value on the wire for nullValue.
     */
    @java.lang.Override
    public int getNullValueValue() {
      return instance.getNullValueValue();
    }
    /**
     * <pre>
     * null value.
     * </pre>
     *
     * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
     * @param value The enum numeric value on the wire for nullValue to set.
     * @return This builder for chaining.
     */
    public Builder setNullValueValue(int value) {
      copyOnWrite();
      instance.setNullValueValue(value);
      return this;
    }
    /**
     * <pre>
     * null value.
     * </pre>
     *
     * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
     * @return The nullValue.
     */
    @java.lang.Override
    public com.google.protobuf.NullValue getNullValue() {
      return instance.getNullValue();
    }
    /**
     * <pre>
     * null value.
     * </pre>
     *
     * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
     * @param value The nullValue to set.
     * @return This builder for chaining.
     */
    public Builder setNullValue(com.google.protobuf.NullValue value) {
      copyOnWrite();
      instance.setNullValue(value);
      return this;
    }
    /**
     * <pre>
     * null value.
     * </pre>
     *
     * <code>.google.protobuf.NullValue null_value = 1 [json_name = "nullValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNullValue() {
      copyOnWrite();
      instance.clearNullValue();
      return this;
    }

    /**
     * <pre>
     * boolean value.
     * </pre>
     *
     * <code>bool bool_value = 2 [json_name = "boolValue"];</code>
     * @return Whether the boolValue field is set.
     */
    @java.lang.Override
    public boolean hasBoolValue() {
      return instance.hasBoolValue();
    }
    /**
     * <pre>
     * boolean value.
     * </pre>
     *
     * <code>bool bool_value = 2 [json_name = "boolValue"];</code>
     * @return The boolValue.
     */
    @java.lang.Override
    public boolean getBoolValue() {
      return instance.getBoolValue();
    }
    /**
     * <pre>
     * boolean value.
     * </pre>
     *
     * <code>bool bool_value = 2 [json_name = "boolValue"];</code>
     * @param value The boolValue to set.
     * @return This builder for chaining.
     */
    public Builder setBoolValue(boolean value) {
      copyOnWrite();
      instance.setBoolValue(value);
      return this;
    }
    /**
     * <pre>
     * boolean value.
     * </pre>
     *
     * <code>bool bool_value = 2 [json_name = "boolValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBoolValue() {
      copyOnWrite();
      instance.clearBoolValue();
      return this;
    }

    /**
     * <pre>
     * int64 value.
     * </pre>
     *
     * <code>int64 int64_value = 3 [json_name = "int64Value"];</code>
     * @return Whether the int64Value field is set.
     */
    @java.lang.Override
    public boolean hasInt64Value() {
      return instance.hasInt64Value();
    }
    /**
     * <pre>
     * int64 value.
     * </pre>
     *
     * <code>int64 int64_value = 3 [json_name = "int64Value"];</code>
     * @return The int64Value.
     */
    @java.lang.Override
    public long getInt64Value() {
      return instance.getInt64Value();
    }
    /**
     * <pre>
     * int64 value.
     * </pre>
     *
     * <code>int64 int64_value = 3 [json_name = "int64Value"];</code>
     * @param value The int64Value to set.
     * @return This builder for chaining.
     */
    public Builder setInt64Value(long value) {
      copyOnWrite();
      instance.setInt64Value(value);
      return this;
    }
    /**
     * <pre>
     * int64 value.
     * </pre>
     *
     * <code>int64 int64_value = 3 [json_name = "int64Value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInt64Value() {
      copyOnWrite();
      instance.clearInt64Value();
      return this;
    }

    /**
     * <pre>
     * uint64 value.
     * </pre>
     *
     * <code>uint64 uint64_value = 4 [json_name = "uint64Value"];</code>
     * @return Whether the uint64Value field is set.
     */
    @java.lang.Override
    public boolean hasUint64Value() {
      return instance.hasUint64Value();
    }
    /**
     * <pre>
     * uint64 value.
     * </pre>
     *
     * <code>uint64 uint64_value = 4 [json_name = "uint64Value"];</code>
     * @return The uint64Value.
     */
    @java.lang.Override
    public long getUint64Value() {
      return instance.getUint64Value();
    }
    /**
     * <pre>
     * uint64 value.
     * </pre>
     *
     * <code>uint64 uint64_value = 4 [json_name = "uint64Value"];</code>
     * @param value The uint64Value to set.
     * @return This builder for chaining.
     */
    public Builder setUint64Value(long value) {
      copyOnWrite();
      instance.setUint64Value(value);
      return this;
    }
    /**
     * <pre>
     * uint64 value.
     * </pre>
     *
     * <code>uint64 uint64_value = 4 [json_name = "uint64Value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUint64Value() {
      copyOnWrite();
      instance.clearUint64Value();
      return this;
    }

    /**
     * <pre>
     * double value.
     * </pre>
     *
     * <code>double double_value = 5 [json_name = "doubleValue"];</code>
     * @return Whether the doubleValue field is set.
     */
    @java.lang.Override
    public boolean hasDoubleValue() {
      return instance.hasDoubleValue();
    }
    /**
     * <pre>
     * double value.
     * </pre>
     *
     * <code>double double_value = 5 [json_name = "doubleValue"];</code>
     * @return The doubleValue.
     */
    @java.lang.Override
    public double getDoubleValue() {
      return instance.getDoubleValue();
    }
    /**
     * <pre>
     * double value.
     * </pre>
     *
     * <code>double double_value = 5 [json_name = "doubleValue"];</code>
     * @param value The doubleValue to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleValue(double value) {
      copyOnWrite();
      instance.setDoubleValue(value);
      return this;
    }
    /**
     * <pre>
     * double value.
     * </pre>
     *
     * <code>double double_value = 5 [json_name = "doubleValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleValue() {
      copyOnWrite();
      instance.clearDoubleValue();
      return this;
    }

    /**
     * <pre>
     * string value.
     * </pre>
     *
     * <code>string string_value = 6 [json_name = "stringValue"];</code>
     * @return Whether the stringValue field is set.
     */
    @java.lang.Override
    public boolean hasStringValue() {
      return instance.hasStringValue();
    }
    /**
     * <pre>
     * string value.
     * </pre>
     *
     * <code>string string_value = 6 [json_name = "stringValue"];</code>
     * @return The stringValue.
     */
    @java.lang.Override
    public java.lang.String getStringValue() {
      return instance.getStringValue();
    }
    /**
     * <pre>
     * string value.
     * </pre>
     *
     * <code>string string_value = 6 [json_name = "stringValue"];</code>
     * @return The bytes for stringValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      return instance.getStringValueBytes();
    }
    /**
     * <pre>
     * string value.
     * </pre>
     *
     * <code>string string_value = 6 [json_name = "stringValue"];</code>
     * @param value The stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValue(
        java.lang.String value) {
      copyOnWrite();
      instance.setStringValue(value);
      return this;
    }
    /**
     * <pre>
     * string value.
     * </pre>
     *
     * <code>string string_value = 6 [json_name = "stringValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStringValue() {
      copyOnWrite();
      instance.clearStringValue();
      return this;
    }
    /**
     * <pre>
     * string value.
     * </pre>
     *
     * <code>string string_value = 6 [json_name = "stringValue"];</code>
     * @param value The bytes for stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setStringValueBytes(value);
      return this;
    }

    /**
     * <pre>
     * bytes value.
     * </pre>
     *
     * <code>bytes bytes_value = 7 [json_name = "bytesValue"];</code>
     * @return Whether the bytesValue field is set.
     */
    @java.lang.Override
    public boolean hasBytesValue() {
      return instance.hasBytesValue();
    }
    /**
     * <pre>
     * bytes value.
     * </pre>
     *
     * <code>bytes bytes_value = 7 [json_name = "bytesValue"];</code>
     * @return The bytesValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBytesValue() {
      return instance.getBytesValue();
    }
    /**
     * <pre>
     * bytes value.
     * </pre>
     *
     * <code>bytes bytes_value = 7 [json_name = "bytesValue"];</code>
     * @param value The bytesValue to set.
     * @return This builder for chaining.
     */
    public Builder setBytesValue(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBytesValue(value);
      return this;
    }
    /**
     * <pre>
     * bytes value.
     * </pre>
     *
     * <code>bytes bytes_value = 7 [json_name = "bytesValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBytesValue() {
      copyOnWrite();
      instance.clearBytesValue();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.expr.v1beta1.Literal)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.expr.v1beta1.Literal();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "constantKind_",
            "constantKindCase_",
          };
          java.lang.String info =
              "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001?\u0000\u0002:" +
              "\u0000\u00035\u0000\u00046\u0000\u00053\u0000\u0006\u023b\u0000\u0007=\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.api.expr.v1beta1.Literal> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.api.expr.v1beta1.Literal.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.api.expr.v1beta1.Literal>(
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


  // @@protoc_insertion_point(class_scope:google.api.expr.v1beta1.Literal)
  private static final com.google.api.expr.v1beta1.Literal DEFAULT_INSTANCE;
  static {
    Literal defaultInstance = new Literal();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Literal.class, defaultInstance);
  }

  public static com.google.api.expr.v1beta1.Literal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Literal> PARSER;

  public static com.google.protobuf.Parser<Literal> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

