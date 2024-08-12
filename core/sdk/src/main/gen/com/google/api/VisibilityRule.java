// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/visibility.proto
// Protobuf Java Version: 4.27.2

package com.google.api;

/**
 * <pre>
 * A visibility rule provides visibility configuration for an individual API
 * element.
 * </pre>
 *
 * Protobuf type {@code google.api.VisibilityRule}
 */
public  final class VisibilityRule extends
    com.google.protobuf.GeneratedMessageLite<
        VisibilityRule, VisibilityRule.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.VisibilityRule)
    VisibilityRuleOrBuilder {
  private VisibilityRule() {
    selector_ = "";
    restriction_ = "";
  }
  public static final int SELECTOR_FIELD_NUMBER = 1;
  private java.lang.String selector_;
  /**
   * <pre>
   * Selects methods, messages, fields, enums, etc. to which this rule applies.
   *
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax
   * details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   * @return The selector.
   */
  @java.lang.Override
  public java.lang.String getSelector() {
    return selector_;
  }
  /**
   * <pre>
   * Selects methods, messages, fields, enums, etc. to which this rule applies.
   *
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax
   * details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   * @return The bytes for selector.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSelectorBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(selector_);
  }
  /**
   * <pre>
   * Selects methods, messages, fields, enums, etc. to which this rule applies.
   *
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax
   * details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   * @param value The selector to set.
   */
  private void setSelector(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    selector_ = value;
  }
  /**
   * <pre>
   * Selects methods, messages, fields, enums, etc. to which this rule applies.
   *
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax
   * details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   */
  private void clearSelector() {

    selector_ = getDefaultInstance().getSelector();
  }
  /**
   * <pre>
   * Selects methods, messages, fields, enums, etc. to which this rule applies.
   *
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax
   * details.
   * </pre>
   *
   * <code>string selector = 1 [json_name = "selector"];</code>
   * @param value The bytes for selector to set.
   */
  private void setSelectorBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    selector_ = value.toStringUtf8();

  }

  public static final int RESTRICTION_FIELD_NUMBER = 2;
  private java.lang.String restriction_;
  /**
   * <pre>
   * A comma-separated list of visibility labels that apply to the `selector`.
   * Any of the listed labels can be used to grant the visibility.
   *
   * If a rule has multiple labels, removing one of the labels but not all of
   * them can break clients.
   *
   * Example:
   *
   * visibility:
   * rules:
   * - selector: google.calendar.Calendar.EnhancedSearch
   * restriction: INTERNAL, PREVIEW
   *
   * Removing INTERNAL from this restriction will break clients that rely on
   * this method and only had access to it through INTERNAL.
   * </pre>
   *
   * <code>string restriction = 2 [json_name = "restriction"];</code>
   * @return The restriction.
   */
  @java.lang.Override
  public java.lang.String getRestriction() {
    return restriction_;
  }
  /**
   * <pre>
   * A comma-separated list of visibility labels that apply to the `selector`.
   * Any of the listed labels can be used to grant the visibility.
   *
   * If a rule has multiple labels, removing one of the labels but not all of
   * them can break clients.
   *
   * Example:
   *
   * visibility:
   * rules:
   * - selector: google.calendar.Calendar.EnhancedSearch
   * restriction: INTERNAL, PREVIEW
   *
   * Removing INTERNAL from this restriction will break clients that rely on
   * this method and only had access to it through INTERNAL.
   * </pre>
   *
   * <code>string restriction = 2 [json_name = "restriction"];</code>
   * @return The bytes for restriction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRestrictionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(restriction_);
  }
  /**
   * <pre>
   * A comma-separated list of visibility labels that apply to the `selector`.
   * Any of the listed labels can be used to grant the visibility.
   *
   * If a rule has multiple labels, removing one of the labels but not all of
   * them can break clients.
   *
   * Example:
   *
   * visibility:
   * rules:
   * - selector: google.calendar.Calendar.EnhancedSearch
   * restriction: INTERNAL, PREVIEW
   *
   * Removing INTERNAL from this restriction will break clients that rely on
   * this method and only had access to it through INTERNAL.
   * </pre>
   *
   * <code>string restriction = 2 [json_name = "restriction"];</code>
   * @param value The restriction to set.
   */
  private void setRestriction(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    restriction_ = value;
  }
  /**
   * <pre>
   * A comma-separated list of visibility labels that apply to the `selector`.
   * Any of the listed labels can be used to grant the visibility.
   *
   * If a rule has multiple labels, removing one of the labels but not all of
   * them can break clients.
   *
   * Example:
   *
   * visibility:
   * rules:
   * - selector: google.calendar.Calendar.EnhancedSearch
   * restriction: INTERNAL, PREVIEW
   *
   * Removing INTERNAL from this restriction will break clients that rely on
   * this method and only had access to it through INTERNAL.
   * </pre>
   *
   * <code>string restriction = 2 [json_name = "restriction"];</code>
   */
  private void clearRestriction() {

    restriction_ = getDefaultInstance().getRestriction();
  }
  /**
   * <pre>
   * A comma-separated list of visibility labels that apply to the `selector`.
   * Any of the listed labels can be used to grant the visibility.
   *
   * If a rule has multiple labels, removing one of the labels but not all of
   * them can break clients.
   *
   * Example:
   *
   * visibility:
   * rules:
   * - selector: google.calendar.Calendar.EnhancedSearch
   * restriction: INTERNAL, PREVIEW
   *
   * Removing INTERNAL from this restriction will break clients that rely on
   * this method and only had access to it through INTERNAL.
   * </pre>
   *
   * <code>string restriction = 2 [json_name = "restriction"];</code>
   * @param value The bytes for restriction to set.
   */
  private void setRestrictionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    restriction_ = value.toStringUtf8();

  }

  public static com.google.api.VisibilityRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.VisibilityRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.VisibilityRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.VisibilityRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.VisibilityRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.VisibilityRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.VisibilityRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.VisibilityRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.api.VisibilityRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.api.VisibilityRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.VisibilityRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.VisibilityRule parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.api.VisibilityRule prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A visibility rule provides visibility configuration for an individual API
   * element.
   * </pre>
   *
   * Protobuf type {@code google.api.VisibilityRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.VisibilityRule, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.VisibilityRule)
      com.google.api.VisibilityRuleOrBuilder {
    // Construct using com.google.api.VisibilityRule.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Selects methods, messages, fields, enums, etc. to which this rule applies.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax
     * details.
     * </pre>
     *
     * <code>string selector = 1 [json_name = "selector"];</code>
     * @return The selector.
     */
    @java.lang.Override
    public java.lang.String getSelector() {
      return instance.getSelector();
    }
    /**
     * <pre>
     * Selects methods, messages, fields, enums, etc. to which this rule applies.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax
     * details.
     * </pre>
     *
     * <code>string selector = 1 [json_name = "selector"];</code>
     * @return The bytes for selector.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSelectorBytes() {
      return instance.getSelectorBytes();
    }
    /**
     * <pre>
     * Selects methods, messages, fields, enums, etc. to which this rule applies.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax
     * details.
     * </pre>
     *
     * <code>string selector = 1 [json_name = "selector"];</code>
     * @param value The selector to set.
     * @return This builder for chaining.
     */
    public Builder setSelector(
        java.lang.String value) {
      copyOnWrite();
      instance.setSelector(value);
      return this;
    }
    /**
     * <pre>
     * Selects methods, messages, fields, enums, etc. to which this rule applies.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax
     * details.
     * </pre>
     *
     * <code>string selector = 1 [json_name = "selector"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSelector() {
      copyOnWrite();
      instance.clearSelector();
      return this;
    }
    /**
     * <pre>
     * Selects methods, messages, fields, enums, etc. to which this rule applies.
     *
     * Refer to [selector][google.api.DocumentationRule.selector] for syntax
     * details.
     * </pre>
     *
     * <code>string selector = 1 [json_name = "selector"];</code>
     * @param value The bytes for selector to set.
     * @return This builder for chaining.
     */
    public Builder setSelectorBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSelectorBytes(value);
      return this;
    }

    /**
     * <pre>
     * A comma-separated list of visibility labels that apply to the `selector`.
     * Any of the listed labels can be used to grant the visibility.
     *
     * If a rule has multiple labels, removing one of the labels but not all of
     * them can break clients.
     *
     * Example:
     *
     * visibility:
     * rules:
     * - selector: google.calendar.Calendar.EnhancedSearch
     * restriction: INTERNAL, PREVIEW
     *
     * Removing INTERNAL from this restriction will break clients that rely on
     * this method and only had access to it through INTERNAL.
     * </pre>
     *
     * <code>string restriction = 2 [json_name = "restriction"];</code>
     * @return The restriction.
     */
    @java.lang.Override
    public java.lang.String getRestriction() {
      return instance.getRestriction();
    }
    /**
     * <pre>
     * A comma-separated list of visibility labels that apply to the `selector`.
     * Any of the listed labels can be used to grant the visibility.
     *
     * If a rule has multiple labels, removing one of the labels but not all of
     * them can break clients.
     *
     * Example:
     *
     * visibility:
     * rules:
     * - selector: google.calendar.Calendar.EnhancedSearch
     * restriction: INTERNAL, PREVIEW
     *
     * Removing INTERNAL from this restriction will break clients that rely on
     * this method and only had access to it through INTERNAL.
     * </pre>
     *
     * <code>string restriction = 2 [json_name = "restriction"];</code>
     * @return The bytes for restriction.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRestrictionBytes() {
      return instance.getRestrictionBytes();
    }
    /**
     * <pre>
     * A comma-separated list of visibility labels that apply to the `selector`.
     * Any of the listed labels can be used to grant the visibility.
     *
     * If a rule has multiple labels, removing one of the labels but not all of
     * them can break clients.
     *
     * Example:
     *
     * visibility:
     * rules:
     * - selector: google.calendar.Calendar.EnhancedSearch
     * restriction: INTERNAL, PREVIEW
     *
     * Removing INTERNAL from this restriction will break clients that rely on
     * this method and only had access to it through INTERNAL.
     * </pre>
     *
     * <code>string restriction = 2 [json_name = "restriction"];</code>
     * @param value The restriction to set.
     * @return This builder for chaining.
     */
    public Builder setRestriction(
        java.lang.String value) {
      copyOnWrite();
      instance.setRestriction(value);
      return this;
    }
    /**
     * <pre>
     * A comma-separated list of visibility labels that apply to the `selector`.
     * Any of the listed labels can be used to grant the visibility.
     *
     * If a rule has multiple labels, removing one of the labels but not all of
     * them can break clients.
     *
     * Example:
     *
     * visibility:
     * rules:
     * - selector: google.calendar.Calendar.EnhancedSearch
     * restriction: INTERNAL, PREVIEW
     *
     * Removing INTERNAL from this restriction will break clients that rely on
     * this method and only had access to it through INTERNAL.
     * </pre>
     *
     * <code>string restriction = 2 [json_name = "restriction"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRestriction() {
      copyOnWrite();
      instance.clearRestriction();
      return this;
    }
    /**
     * <pre>
     * A comma-separated list of visibility labels that apply to the `selector`.
     * Any of the listed labels can be used to grant the visibility.
     *
     * If a rule has multiple labels, removing one of the labels but not all of
     * them can break clients.
     *
     * Example:
     *
     * visibility:
     * rules:
     * - selector: google.calendar.Calendar.EnhancedSearch
     * restriction: INTERNAL, PREVIEW
     *
     * Removing INTERNAL from this restriction will break clients that rely on
     * this method and only had access to it through INTERNAL.
     * </pre>
     *
     * <code>string restriction = 2 [json_name = "restriction"];</code>
     * @param value The bytes for restriction to set.
     * @return This builder for chaining.
     */
    public Builder setRestrictionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setRestrictionBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.VisibilityRule)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.VisibilityRule();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "selector_",
            "restriction_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.api.VisibilityRule> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.api.VisibilityRule.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.api.VisibilityRule>(
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


  // @@protoc_insertion_point(class_scope:google.api.VisibilityRule)
  private static final com.google.api.VisibilityRule DEFAULT_INSTANCE;
  static {
    VisibilityRule defaultInstance = new VisibilityRule();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      VisibilityRule.class, defaultInstance);
  }

  public static com.google.api.VisibilityRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<VisibilityRule> PARSER;

  public static com.google.protobuf.Parser<VisibilityRule> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

