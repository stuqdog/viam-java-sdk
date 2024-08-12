// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/type/datetime.proto
// Protobuf Java Version: 4.27.2

package com.google.type;

/**
 * <pre>
 * Represents a time zone from the
 * [IANA Time Zone Database](https://www.iana.org/time-zones).
 * </pre>
 *
 * Protobuf type {@code google.type.TimeZone}
 */
public  final class TimeZone extends
    com.google.protobuf.GeneratedMessageLite<
        TimeZone, TimeZone.Builder> implements
    // @@protoc_insertion_point(message_implements:google.type.TimeZone)
    TimeZoneOrBuilder {
  private TimeZone() {
    id_ = "";
    version_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String id_;
  /**
   * <pre>
   * IANA Time Zone Database time zone, e.g. "America/New_York".
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    return id_;
  }
  /**
   * <pre>
   * IANA Time Zone Database time zone, e.g. "America/New_York".
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <pre>
   * IANA Time Zone Database time zone, e.g. "America/New_York".
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @param value The id to set.
   */
  private void setId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    id_ = value;
  }
  /**
   * <pre>
   * IANA Time Zone Database time zone, e.g. "America/New_York".
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   */
  private void clearId() {

    id_ = getDefaultInstance().getId();
  }
  /**
   * <pre>
   * IANA Time Zone Database time zone, e.g. "America/New_York".
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @param value The bytes for id to set.
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    id_ = value.toStringUtf8();

  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private java.lang.String version_;
  /**
   * <pre>
   * Optional. IANA Time Zone Database version number, e.g. "2019a".
   * </pre>
   *
   * <code>string version = 2 [json_name = "version"];</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    return version_;
  }
  /**
   * <pre>
   * Optional. IANA Time Zone Database version number, e.g. "2019a".
   * </pre>
   *
   * <code>string version = 2 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(version_);
  }
  /**
   * <pre>
   * Optional. IANA Time Zone Database version number, e.g. "2019a".
   * </pre>
   *
   * <code>string version = 2 [json_name = "version"];</code>
   * @param value The version to set.
   */
  private void setVersion(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    version_ = value;
  }
  /**
   * <pre>
   * Optional. IANA Time Zone Database version number, e.g. "2019a".
   * </pre>
   *
   * <code>string version = 2 [json_name = "version"];</code>
   */
  private void clearVersion() {

    version_ = getDefaultInstance().getVersion();
  }
  /**
   * <pre>
   * Optional. IANA Time Zone Database version number, e.g. "2019a".
   * </pre>
   *
   * <code>string version = 2 [json_name = "version"];</code>
   * @param value The bytes for version to set.
   */
  private void setVersionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    version_ = value.toStringUtf8();

  }

  public static com.google.type.TimeZone parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.TimeZone parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.TimeZone parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.TimeZone parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.TimeZone parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.TimeZone parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.TimeZone parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.TimeZone parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.type.TimeZone parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.type.TimeZone parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.TimeZone parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.TimeZone parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.type.TimeZone prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Represents a time zone from the
   * [IANA Time Zone Database](https://www.iana.org/time-zones).
   * </pre>
   *
   * Protobuf type {@code google.type.TimeZone}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.type.TimeZone, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.TimeZone)
      com.google.type.TimeZoneOrBuilder {
    // Construct using com.google.type.TimeZone.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * IANA Time Zone Database time zone, e.g. "America/New_York".
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      return instance.getId();
    }
    /**
     * <pre>
     * IANA Time Zone Database time zone, e.g. "America/New_York".
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      return instance.getIdBytes();
    }
    /**
     * <pre>
     * IANA Time Zone Database time zone, e.g. "America/New_York".
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <pre>
     * IANA Time Zone Database time zone, e.g. "America/New_York".
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }
    /**
     * <pre>
     * IANA Time Zone Database time zone, e.g. "America/New_York".
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * </pre>
     *
     * <code>string version = 2 [json_name = "version"];</code>
     * @return The version.
     */
    @java.lang.Override
    public java.lang.String getVersion() {
      return instance.getVersion();
    }
    /**
     * <pre>
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * </pre>
     *
     * <code>string version = 2 [json_name = "version"];</code>
     * @return The bytes for version.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getVersionBytes() {
      return instance.getVersionBytes();
    }
    /**
     * <pre>
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * </pre>
     *
     * <code>string version = 2 [json_name = "version"];</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      copyOnWrite();
      instance.setVersion(value);
      return this;
    }
    /**
     * <pre>
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * </pre>
     *
     * <code>string version = 2 [json_name = "version"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      copyOnWrite();
      instance.clearVersion();
      return this;
    }
    /**
     * <pre>
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * </pre>
     *
     * <code>string version = 2 [json_name = "version"];</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setVersionBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.type.TimeZone)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.type.TimeZone();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "id_",
            "version_",
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
        com.google.protobuf.Parser<com.google.type.TimeZone> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.type.TimeZone.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.type.TimeZone>(
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


  // @@protoc_insertion_point(class_scope:google.type.TimeZone)
  private static final com.google.type.TimeZone DEFAULT_INSTANCE;
  static {
    TimeZone defaultInstance = new TimeZone();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TimeZone.class, defaultInstance);
  }

  public static com.google.type.TimeZone getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TimeZone> PARSER;

  public static com.google.protobuf.Parser<TimeZone> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

