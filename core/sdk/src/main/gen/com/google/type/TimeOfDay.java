// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/timeofday.proto

// Protobuf Java Version: 3.25.2
package com.google.type;

/**
 * <pre>
 * Represents a time of day. The date and time zone are either not significant
 * or are specified elsewhere. An API may choose to allow leap seconds. Related
 * types are [google.type.Date][google.type.Date] and
 * `google.protobuf.Timestamp`.
 * </pre>
 *
 * Protobuf type {@code google.type.TimeOfDay}
 */
public  final class TimeOfDay extends
    com.google.protobuf.GeneratedMessageLite<
        TimeOfDay, TimeOfDay.Builder> implements
    // @@protoc_insertion_point(message_implements:google.type.TimeOfDay)
    TimeOfDayOrBuilder {
  private TimeOfDay() {
  }
  public static final int HOURS_FIELD_NUMBER = 1;
  private int hours_;
  /**
   * <pre>
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
   * to allow the value "24:00:00" for scenarios like business closing time.
   * </pre>
   *
   * <code>int32 hours = 1 [json_name = "hours"];</code>
   * @return The hours.
   */
  @java.lang.Override
  public int getHours() {
    return hours_;
  }
  /**
   * <pre>
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
   * to allow the value "24:00:00" for scenarios like business closing time.
   * </pre>
   *
   * <code>int32 hours = 1 [json_name = "hours"];</code>
   * @param value The hours to set.
   */
  private void setHours(int value) {
    
    hours_ = value;
  }
  /**
   * <pre>
   * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
   * to allow the value "24:00:00" for scenarios like business closing time.
   * </pre>
   *
   * <code>int32 hours = 1 [json_name = "hours"];</code>
   */
  private void clearHours() {

    hours_ = 0;
  }

  public static final int MINUTES_FIELD_NUMBER = 2;
  private int minutes_;
  /**
   * <pre>
   * Minutes of hour of day. Must be from 0 to 59.
   * </pre>
   *
   * <code>int32 minutes = 2 [json_name = "minutes"];</code>
   * @return The minutes.
   */
  @java.lang.Override
  public int getMinutes() {
    return minutes_;
  }
  /**
   * <pre>
   * Minutes of hour of day. Must be from 0 to 59.
   * </pre>
   *
   * <code>int32 minutes = 2 [json_name = "minutes"];</code>
   * @param value The minutes to set.
   */
  private void setMinutes(int value) {
    
    minutes_ = value;
  }
  /**
   * <pre>
   * Minutes of hour of day. Must be from 0 to 59.
   * </pre>
   *
   * <code>int32 minutes = 2 [json_name = "minutes"];</code>
   */
  private void clearMinutes() {

    minutes_ = 0;
  }

  public static final int SECONDS_FIELD_NUMBER = 3;
  private int seconds_;
  /**
   * <pre>
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
   * allow the value 60 if it allows leap-seconds.
   * </pre>
   *
   * <code>int32 seconds = 3 [json_name = "seconds"];</code>
   * @return The seconds.
   */
  @java.lang.Override
  public int getSeconds() {
    return seconds_;
  }
  /**
   * <pre>
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
   * allow the value 60 if it allows leap-seconds.
   * </pre>
   *
   * <code>int32 seconds = 3 [json_name = "seconds"];</code>
   * @param value The seconds to set.
   */
  private void setSeconds(int value) {
    
    seconds_ = value;
  }
  /**
   * <pre>
   * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
   * allow the value 60 if it allows leap-seconds.
   * </pre>
   *
   * <code>int32 seconds = 3 [json_name = "seconds"];</code>
   */
  private void clearSeconds() {

    seconds_ = 0;
  }

  public static final int NANOS_FIELD_NUMBER = 4;
  private int nanos_;
  /**
   * <pre>
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * </pre>
   *
   * <code>int32 nanos = 4 [json_name = "nanos"];</code>
   * @return The nanos.
   */
  @java.lang.Override
  public int getNanos() {
    return nanos_;
  }
  /**
   * <pre>
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * </pre>
   *
   * <code>int32 nanos = 4 [json_name = "nanos"];</code>
   * @param value The nanos to set.
   */
  private void setNanos(int value) {
    
    nanos_ = value;
  }
  /**
   * <pre>
   * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
   * </pre>
   *
   * <code>int32 nanos = 4 [json_name = "nanos"];</code>
   */
  private void clearNanos() {

    nanos_ = 0;
  }

  public static com.google.type.TimeOfDay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.TimeOfDay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.TimeOfDay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.TimeOfDay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.TimeOfDay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.TimeOfDay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.TimeOfDay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.TimeOfDay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.type.TimeOfDay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.type.TimeOfDay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.TimeOfDay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.TimeOfDay parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.type.TimeOfDay prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Represents a time of day. The date and time zone are either not significant
   * or are specified elsewhere. An API may choose to allow leap seconds. Related
   * types are [google.type.Date][google.type.Date] and
   * `google.protobuf.Timestamp`.
   * </pre>
   *
   * Protobuf type {@code google.type.TimeOfDay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.type.TimeOfDay, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.TimeOfDay)
      com.google.type.TimeOfDayOrBuilder {
    // Construct using com.google.type.TimeOfDay.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
     * to allow the value "24:00:00" for scenarios like business closing time.
     * </pre>
     *
     * <code>int32 hours = 1 [json_name = "hours"];</code>
     * @return The hours.
     */
    @java.lang.Override
    public int getHours() {
      return instance.getHours();
    }
    /**
     * <pre>
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
     * to allow the value "24:00:00" for scenarios like business closing time.
     * </pre>
     *
     * <code>int32 hours = 1 [json_name = "hours"];</code>
     * @param value The hours to set.
     * @return This builder for chaining.
     */
    public Builder setHours(int value) {
      copyOnWrite();
      instance.setHours(value);
      return this;
    }
    /**
     * <pre>
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
     * to allow the value "24:00:00" for scenarios like business closing time.
     * </pre>
     *
     * <code>int32 hours = 1 [json_name = "hours"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHours() {
      copyOnWrite();
      instance.clearHours();
      return this;
    }

    /**
     * <pre>
     * Minutes of hour of day. Must be from 0 to 59.
     * </pre>
     *
     * <code>int32 minutes = 2 [json_name = "minutes"];</code>
     * @return The minutes.
     */
    @java.lang.Override
    public int getMinutes() {
      return instance.getMinutes();
    }
    /**
     * <pre>
     * Minutes of hour of day. Must be from 0 to 59.
     * </pre>
     *
     * <code>int32 minutes = 2 [json_name = "minutes"];</code>
     * @param value The minutes to set.
     * @return This builder for chaining.
     */
    public Builder setMinutes(int value) {
      copyOnWrite();
      instance.setMinutes(value);
      return this;
    }
    /**
     * <pre>
     * Minutes of hour of day. Must be from 0 to 59.
     * </pre>
     *
     * <code>int32 minutes = 2 [json_name = "minutes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinutes() {
      copyOnWrite();
      instance.clearMinutes();
      return this;
    }

    /**
     * <pre>
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
     * allow the value 60 if it allows leap-seconds.
     * </pre>
     *
     * <code>int32 seconds = 3 [json_name = "seconds"];</code>
     * @return The seconds.
     */
    @java.lang.Override
    public int getSeconds() {
      return instance.getSeconds();
    }
    /**
     * <pre>
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
     * allow the value 60 if it allows leap-seconds.
     * </pre>
     *
     * <code>int32 seconds = 3 [json_name = "seconds"];</code>
     * @param value The seconds to set.
     * @return This builder for chaining.
     */
    public Builder setSeconds(int value) {
      copyOnWrite();
      instance.setSeconds(value);
      return this;
    }
    /**
     * <pre>
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
     * allow the value 60 if it allows leap-seconds.
     * </pre>
     *
     * <code>int32 seconds = 3 [json_name = "seconds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSeconds() {
      copyOnWrite();
      instance.clearSeconds();
      return this;
    }

    /**
     * <pre>
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * </pre>
     *
     * <code>int32 nanos = 4 [json_name = "nanos"];</code>
     * @return The nanos.
     */
    @java.lang.Override
    public int getNanos() {
      return instance.getNanos();
    }
    /**
     * <pre>
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * </pre>
     *
     * <code>int32 nanos = 4 [json_name = "nanos"];</code>
     * @param value The nanos to set.
     * @return This builder for chaining.
     */
    public Builder setNanos(int value) {
      copyOnWrite();
      instance.setNanos(value);
      return this;
    }
    /**
     * <pre>
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * </pre>
     *
     * <code>int32 nanos = 4 [json_name = "nanos"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNanos() {
      copyOnWrite();
      instance.clearNanos();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.type.TimeOfDay)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.type.TimeOfDay();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "hours_",
            "minutes_",
            "seconds_",
            "nanos_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004" +
              "\u0003\u0004\u0004\u0004";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.type.TimeOfDay> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.type.TimeOfDay.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.type.TimeOfDay>(
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


  // @@protoc_insertion_point(class_scope:google.type.TimeOfDay)
  private static final com.google.type.TimeOfDay DEFAULT_INSTANCE;
  static {
    TimeOfDay defaultInstance = new TimeOfDay();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TimeOfDay.class, defaultInstance);
  }

  public static com.google.type.TimeOfDay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TimeOfDay> PARSER;

  public static com.google.protobuf.Parser<TimeOfDay> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

