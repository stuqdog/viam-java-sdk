// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/latlng.proto

// Protobuf Java Version: 3.25.2
package com.google.type;

/**
 * <pre>
 * An object that represents a latitude/longitude pair. This is expressed as a
 * pair of doubles to represent degrees latitude and degrees longitude. Unless
 * specified otherwise, this must conform to the
 * &lt;a href="http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf"&gt;WGS84
 * standard&lt;/a&gt;. Values must be within normalized ranges.
 * </pre>
 *
 * Protobuf type {@code google.type.LatLng}
 */
public  final class LatLng extends
    com.google.protobuf.GeneratedMessageLite<
        LatLng, LatLng.Builder> implements
    // @@protoc_insertion_point(message_implements:google.type.LatLng)
    LatLngOrBuilder {
  private LatLng() {
  }
  public static final int LATITUDE_FIELD_NUMBER = 1;
  private double latitude_;
  /**
   * <pre>
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * </pre>
   *
   * <code>double latitude = 1 [json_name = "latitude"];</code>
   * @return The latitude.
   */
  @java.lang.Override
  public double getLatitude() {
    return latitude_;
  }
  /**
   * <pre>
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * </pre>
   *
   * <code>double latitude = 1 [json_name = "latitude"];</code>
   * @param value The latitude to set.
   */
  private void setLatitude(double value) {
    
    latitude_ = value;
  }
  /**
   * <pre>
   * The latitude in degrees. It must be in the range [-90.0, +90.0].
   * </pre>
   *
   * <code>double latitude = 1 [json_name = "latitude"];</code>
   */
  private void clearLatitude() {

    latitude_ = 0D;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private double longitude_;
  /**
   * <pre>
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * </pre>
   *
   * <code>double longitude = 2 [json_name = "longitude"];</code>
   * @return The longitude.
   */
  @java.lang.Override
  public double getLongitude() {
    return longitude_;
  }
  /**
   * <pre>
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * </pre>
   *
   * <code>double longitude = 2 [json_name = "longitude"];</code>
   * @param value The longitude to set.
   */
  private void setLongitude(double value) {
    
    longitude_ = value;
  }
  /**
   * <pre>
   * The longitude in degrees. It must be in the range [-180.0, +180.0].
   * </pre>
   *
   * <code>double longitude = 2 [json_name = "longitude"];</code>
   */
  private void clearLongitude() {

    longitude_ = 0D;
  }

  public static com.google.type.LatLng parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.LatLng parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.LatLng parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.LatLng parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.LatLng parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.LatLng parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.type.LatLng parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.type.LatLng parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.LatLng parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.type.LatLng prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * An object that represents a latitude/longitude pair. This is expressed as a
   * pair of doubles to represent degrees latitude and degrees longitude. Unless
   * specified otherwise, this must conform to the
   * &lt;a href="http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf"&gt;WGS84
   * standard&lt;/a&gt;. Values must be within normalized ranges.
   * </pre>
   *
   * Protobuf type {@code google.type.LatLng}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.type.LatLng, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.LatLng)
      com.google.type.LatLngOrBuilder {
    // Construct using com.google.type.LatLng.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>double latitude = 1 [json_name = "latitude"];</code>
     * @return The latitude.
     */
    @java.lang.Override
    public double getLatitude() {
      return instance.getLatitude();
    }
    /**
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>double latitude = 1 [json_name = "latitude"];</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(double value) {
      copyOnWrite();
      instance.setLatitude(value);
      return this;
    }
    /**
     * <pre>
     * The latitude in degrees. It must be in the range [-90.0, +90.0].
     * </pre>
     *
     * <code>double latitude = 1 [json_name = "latitude"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      copyOnWrite();
      instance.clearLatitude();
      return this;
    }

    /**
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>double longitude = 2 [json_name = "longitude"];</code>
     * @return The longitude.
     */
    @java.lang.Override
    public double getLongitude() {
      return instance.getLongitude();
    }
    /**
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>double longitude = 2 [json_name = "longitude"];</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(double value) {
      copyOnWrite();
      instance.setLongitude(value);
      return this;
    }
    /**
     * <pre>
     * The longitude in degrees. It must be in the range [-180.0, +180.0].
     * </pre>
     *
     * <code>double longitude = 2 [json_name = "longitude"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      copyOnWrite();
      instance.clearLongitude();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.type.LatLng)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.type.LatLng();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "latitude_",
            "longitude_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.type.LatLng> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.type.LatLng.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.type.LatLng>(
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


  // @@protoc_insertion_point(class_scope:google.type.LatLng)
  private static final com.google.type.LatLng DEFAULT_INSTANCE;
  static {
    LatLng defaultInstance = new LatLng();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      LatLng.class, defaultInstance);
  }

  public static com.google.type.LatLng getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LatLng> PARSER;

  public static com.google.protobuf.Parser<LatLng> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

