// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/expr.proto

// Protobuf Java Version: 3.25.2
package com.google.type;

/**
 * <pre>
 * Represents a textual expression in the Common Expression Language (CEL)
 * syntax. CEL is a C-like expression language. The syntax and semantics of CEL
 * are documented at https://github.com/google/cel-spec.
 *
 * Example (Comparison):
 *
 *     title: "Summary size limit"
 *     description: "Determines if a summary is less than 100 chars"
 *     expression: "document.summary.size() &lt; 100"
 *
 * Example (Equality):
 *
 *     title: "Requestor is owner"
 *     description: "Determines if requestor is the document owner"
 *     expression: "document.owner == request.auth.claims.email"
 *
 * Example (Logic):
 *
 *     title: "Public documents"
 *     description: "Determine whether the document should be publicly visible"
 *     expression: "document.type != 'private' &amp;&amp; document.type != 'internal'"
 *
 * Example (Data Manipulation):
 *
 *     title: "Notification string"
 *     description: "Create a notification string with a timestamp."
 *     expression: "'New message received at ' + string(document.create_time)"
 *
 * The exact variables and functions that may be referenced within an expression
 * are determined by the service that evaluates it. See the service
 * documentation for additional information.
 * </pre>
 *
 * Protobuf type {@code google.type.Expr}
 */
public  final class Expr extends
    com.google.protobuf.GeneratedMessageLite<
        Expr, Expr.Builder> implements
    // @@protoc_insertion_point(message_implements:google.type.Expr)
    ExprOrBuilder {
  private Expr() {
    expression_ = "";
    title_ = "";
    description_ = "";
    location_ = "";
  }
  public static final int EXPRESSION_FIELD_NUMBER = 1;
  private java.lang.String expression_;
  /**
   * <pre>
   * Textual representation of an expression in Common Expression Language
   * syntax.
   * </pre>
   *
   * <code>string expression = 1 [json_name = "expression"];</code>
   * @return The expression.
   */
  @java.lang.Override
  public java.lang.String getExpression() {
    return expression_;
  }
  /**
   * <pre>
   * Textual representation of an expression in Common Expression Language
   * syntax.
   * </pre>
   *
   * <code>string expression = 1 [json_name = "expression"];</code>
   * @return The bytes for expression.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExpressionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(expression_);
  }
  /**
   * <pre>
   * Textual representation of an expression in Common Expression Language
   * syntax.
   * </pre>
   *
   * <code>string expression = 1 [json_name = "expression"];</code>
   * @param value The expression to set.
   */
  private void setExpression(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    expression_ = value;
  }
  /**
   * <pre>
   * Textual representation of an expression in Common Expression Language
   * syntax.
   * </pre>
   *
   * <code>string expression = 1 [json_name = "expression"];</code>
   */
  private void clearExpression() {

    expression_ = getDefaultInstance().getExpression();
  }
  /**
   * <pre>
   * Textual representation of an expression in Common Expression Language
   * syntax.
   * </pre>
   *
   * <code>string expression = 1 [json_name = "expression"];</code>
   * @param value The bytes for expression to set.
   */
  private void setExpressionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    expression_ = value.toStringUtf8();

  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private java.lang.String title_;
  /**
   * <pre>
   * Optional. Title for the expression, i.e. a short string describing
   * its purpose. This can be used e.g. in UIs which allow to enter the
   * expression.
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    return title_;
  }
  /**
   * <pre>
   * Optional. Title for the expression, i.e. a short string describing
   * its purpose. This can be used e.g. in UIs which allow to enter the
   * expression.
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(title_);
  }
  /**
   * <pre>
   * Optional. Title for the expression, i.e. a short string describing
   * its purpose. This can be used e.g. in UIs which allow to enter the
   * expression.
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @param value The title to set.
   */
  private void setTitle(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    title_ = value;
  }
  /**
   * <pre>
   * Optional. Title for the expression, i.e. a short string describing
   * its purpose. This can be used e.g. in UIs which allow to enter the
   * expression.
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   */
  private void clearTitle() {

    title_ = getDefaultInstance().getTitle();
  }
  /**
   * <pre>
   * Optional. Title for the expression, i.e. a short string describing
   * its purpose. This can be used e.g. in UIs which allow to enter the
   * expression.
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @param value The bytes for title to set.
   */
  private void setTitleBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    title_ = value.toStringUtf8();

  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private java.lang.String description_;
  /**
   * <pre>
   * Optional. Description of the expression. This is a longer text which
   * describes the expression, e.g. when hovered over it in a UI.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    return description_;
  }
  /**
   * <pre>
   * Optional. Description of the expression. This is a longer text which
   * describes the expression, e.g. when hovered over it in a UI.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(description_);
  }
  /**
   * <pre>
   * Optional. Description of the expression. This is a longer text which
   * describes the expression, e.g. when hovered over it in a UI.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @param value The description to set.
   */
  private void setDescription(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    description_ = value;
  }
  /**
   * <pre>
   * Optional. Description of the expression. This is a longer text which
   * describes the expression, e.g. when hovered over it in a UI.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   */
  private void clearDescription() {

    description_ = getDefaultInstance().getDescription();
  }
  /**
   * <pre>
   * Optional. Description of the expression. This is a longer text which
   * describes the expression, e.g. when hovered over it in a UI.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @param value The bytes for description to set.
   */
  private void setDescriptionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    description_ = value.toStringUtf8();

  }

  public static final int LOCATION_FIELD_NUMBER = 4;
  private java.lang.String location_;
  /**
   * <pre>
   * Optional. String indicating the location of the expression for error
   * reporting, e.g. a file name and a position in the file.
   * </pre>
   *
   * <code>string location = 4 [json_name = "location"];</code>
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    return location_;
  }
  /**
   * <pre>
   * Optional. String indicating the location of the expression for error
   * reporting, e.g. a file name and a position in the file.
   * </pre>
   *
   * <code>string location = 4 [json_name = "location"];</code>
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(location_);
  }
  /**
   * <pre>
   * Optional. String indicating the location of the expression for error
   * reporting, e.g. a file name and a position in the file.
   * </pre>
   *
   * <code>string location = 4 [json_name = "location"];</code>
   * @param value The location to set.
   */
  private void setLocation(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    location_ = value;
  }
  /**
   * <pre>
   * Optional. String indicating the location of the expression for error
   * reporting, e.g. a file name and a position in the file.
   * </pre>
   *
   * <code>string location = 4 [json_name = "location"];</code>
   */
  private void clearLocation() {

    location_ = getDefaultInstance().getLocation();
  }
  /**
   * <pre>
   * Optional. String indicating the location of the expression for error
   * reporting, e.g. a file name and a position in the file.
   * </pre>
   *
   * <code>string location = 4 [json_name = "location"];</code>
   * @param value The bytes for location to set.
   */
  private void setLocationBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    location_ = value.toStringUtf8();

  }

  public static com.google.type.Expr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.Expr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.Expr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.Expr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.Expr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.Expr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.Expr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.Expr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.type.Expr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.type.Expr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.Expr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.Expr parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.type.Expr prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Represents a textual expression in the Common Expression Language (CEL)
   * syntax. CEL is a C-like expression language. The syntax and semantics of CEL
   * are documented at https://github.com/google/cel-spec.
   *
   * Example (Comparison):
   *
   *     title: "Summary size limit"
   *     description: "Determines if a summary is less than 100 chars"
   *     expression: "document.summary.size() &lt; 100"
   *
   * Example (Equality):
   *
   *     title: "Requestor is owner"
   *     description: "Determines if requestor is the document owner"
   *     expression: "document.owner == request.auth.claims.email"
   *
   * Example (Logic):
   *
   *     title: "Public documents"
   *     description: "Determine whether the document should be publicly visible"
   *     expression: "document.type != 'private' &amp;&amp; document.type != 'internal'"
   *
   * Example (Data Manipulation):
   *
   *     title: "Notification string"
   *     description: "Create a notification string with a timestamp."
   *     expression: "'New message received at ' + string(document.create_time)"
   *
   * The exact variables and functions that may be referenced within an expression
   * are determined by the service that evaluates it. See the service
   * documentation for additional information.
   * </pre>
   *
   * Protobuf type {@code google.type.Expr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.type.Expr, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.Expr)
      com.google.type.ExprOrBuilder {
    // Construct using com.google.type.Expr.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Textual representation of an expression in Common Expression Language
     * syntax.
     * </pre>
     *
     * <code>string expression = 1 [json_name = "expression"];</code>
     * @return The expression.
     */
    @java.lang.Override
    public java.lang.String getExpression() {
      return instance.getExpression();
    }
    /**
     * <pre>
     * Textual representation of an expression in Common Expression Language
     * syntax.
     * </pre>
     *
     * <code>string expression = 1 [json_name = "expression"];</code>
     * @return The bytes for expression.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getExpressionBytes() {
      return instance.getExpressionBytes();
    }
    /**
     * <pre>
     * Textual representation of an expression in Common Expression Language
     * syntax.
     * </pre>
     *
     * <code>string expression = 1 [json_name = "expression"];</code>
     * @param value The expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpression(
        java.lang.String value) {
      copyOnWrite();
      instance.setExpression(value);
      return this;
    }
    /**
     * <pre>
     * Textual representation of an expression in Common Expression Language
     * syntax.
     * </pre>
     *
     * <code>string expression = 1 [json_name = "expression"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpression() {
      copyOnWrite();
      instance.clearExpression();
      return this;
    }
    /**
     * <pre>
     * Textual representation of an expression in Common Expression Language
     * syntax.
     * </pre>
     *
     * <code>string expression = 1 [json_name = "expression"];</code>
     * @param value The bytes for expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpressionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setExpressionBytes(value);
      return this;
    }

    /**
     * <pre>
     * Optional. Title for the expression, i.e. a short string describing
     * its purpose. This can be used e.g. in UIs which allow to enter the
     * expression.
     * </pre>
     *
     * <code>string title = 2 [json_name = "title"];</code>
     * @return The title.
     */
    @java.lang.Override
    public java.lang.String getTitle() {
      return instance.getTitle();
    }
    /**
     * <pre>
     * Optional. Title for the expression, i.e. a short string describing
     * its purpose. This can be used e.g. in UIs which allow to enter the
     * expression.
     * </pre>
     *
     * <code>string title = 2 [json_name = "title"];</code>
     * @return The bytes for title.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTitleBytes() {
      return instance.getTitleBytes();
    }
    /**
     * <pre>
     * Optional. Title for the expression, i.e. a short string describing
     * its purpose. This can be used e.g. in UIs which allow to enter the
     * expression.
     * </pre>
     *
     * <code>string title = 2 [json_name = "title"];</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      copyOnWrite();
      instance.setTitle(value);
      return this;
    }
    /**
     * <pre>
     * Optional. Title for the expression, i.e. a short string describing
     * its purpose. This can be used e.g. in UIs which allow to enter the
     * expression.
     * </pre>
     *
     * <code>string title = 2 [json_name = "title"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      copyOnWrite();
      instance.clearTitle();
      return this;
    }
    /**
     * <pre>
     * Optional. Title for the expression, i.e. a short string describing
     * its purpose. This can be used e.g. in UIs which allow to enter the
     * expression.
     * </pre>
     *
     * <code>string title = 2 [json_name = "title"];</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTitleBytes(value);
      return this;
    }

    /**
     * <pre>
     * Optional. Description of the expression. This is a longer text which
     * describes the expression, e.g. when hovered over it in a UI.
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return The description.
     */
    @java.lang.Override
    public java.lang.String getDescription() {
      return instance.getDescription();
    }
    /**
     * <pre>
     * Optional. Description of the expression. This is a longer text which
     * describes the expression, e.g. when hovered over it in a UI.
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return instance.getDescriptionBytes();
    }
    /**
     * <pre>
     * Optional. Description of the expression. This is a longer text which
     * describes the expression, e.g. when hovered over it in a UI.
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      copyOnWrite();
      instance.setDescription(value);
      return this;
    }
    /**
     * <pre>
     * Optional. Description of the expression. This is a longer text which
     * describes the expression, e.g. when hovered over it in a UI.
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      copyOnWrite();
      instance.clearDescription();
      return this;
    }
    /**
     * <pre>
     * Optional. Description of the expression. This is a longer text which
     * describes the expression, e.g. when hovered over it in a UI.
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDescriptionBytes(value);
      return this;
    }

    /**
     * <pre>
     * Optional. String indicating the location of the expression for error
     * reporting, e.g. a file name and a position in the file.
     * </pre>
     *
     * <code>string location = 4 [json_name = "location"];</code>
     * @return The location.
     */
    @java.lang.Override
    public java.lang.String getLocation() {
      return instance.getLocation();
    }
    /**
     * <pre>
     * Optional. String indicating the location of the expression for error
     * reporting, e.g. a file name and a position in the file.
     * </pre>
     *
     * <code>string location = 4 [json_name = "location"];</code>
     * @return The bytes for location.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLocationBytes() {
      return instance.getLocationBytes();
    }
    /**
     * <pre>
     * Optional. String indicating the location of the expression for error
     * reporting, e.g. a file name and a position in the file.
     * </pre>
     *
     * <code>string location = 4 [json_name = "location"];</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        java.lang.String value) {
      copyOnWrite();
      instance.setLocation(value);
      return this;
    }
    /**
     * <pre>
     * Optional. String indicating the location of the expression for error
     * reporting, e.g. a file name and a position in the file.
     * </pre>
     *
     * <code>string location = 4 [json_name = "location"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      copyOnWrite();
      instance.clearLocation();
      return this;
    }
    /**
     * <pre>
     * Optional. String indicating the location of the expression for error
     * reporting, e.g. a file name and a position in the file.
     * </pre>
     *
     * <code>string location = 4 [json_name = "location"];</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLocationBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.type.Expr)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.type.Expr();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "expression_",
            "title_",
            "description_",
            "location_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208\u0004\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.type.Expr> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.type.Expr.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.type.Expr>(
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


  // @@protoc_insertion_point(class_scope:google.type.Expr)
  private static final com.google.type.Expr DEFAULT_INSTANCE;
  static {
    Expr defaultInstance = new Expr();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Expr.class, defaultInstance);
  }

  public static com.google.type.Expr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Expr> PARSER;

  public static com.google.protobuf.Parser<Expr> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

