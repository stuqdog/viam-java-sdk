// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/color.proto

// Protobuf Java Version: 3.25.2
package com.google.type;

/**
 * <pre>
 * Represents a color in the RGBA color space. This representation is designed
 * for simplicity of conversion to/from color representations in various
 * languages over compactness. For example, the fields of this representation
 * can be trivially provided to the constructor of `java.awt.Color` in Java; it
 * can also be trivially provided to UIColor's `+colorWithRed:green:blue:alpha`
 * method in iOS; and, with just a little work, it can be easily formatted into
 * a CSS `rgba()` string in JavaScript.
 *
 * This reference page doesn't carry information about the absolute color
 * space
 * that should be used to interpret the RGB value (e.g. sRGB, Adobe RGB,
 * DCI-P3, BT.2020, etc.). By default, applications should assume the sRGB color
 * space.
 *
 * When color equality needs to be decided, implementations, unless
 * documented otherwise, treat two colors as equal if all their red,
 * green, blue, and alpha values each differ by at most 1e-5.
 *
 * Example (Java):
 *
 *      import com.google.type.Color;
 *
 *      // ...
 *      public static java.awt.Color fromProto(Color protocolor) {
 *        float alpha = protocolor.hasAlpha()
 *            ? protocolor.getAlpha().getValue()
 *            : 1.0;
 *
 *        return new java.awt.Color(
 *            protocolor.getRed(),
 *            protocolor.getGreen(),
 *            protocolor.getBlue(),
 *            alpha);
 *      }
 *
 *      public static Color toProto(java.awt.Color color) {
 *        float red = (float) color.getRed();
 *        float green = (float) color.getGreen();
 *        float blue = (float) color.getBlue();
 *        float denominator = 255.0;
 *        Color.Builder resultBuilder =
 *            Color
 *                .newBuilder()
 *                .setRed(red / denominator)
 *                .setGreen(green / denominator)
 *                .setBlue(blue / denominator);
 *        int alpha = color.getAlpha();
 *        if (alpha != 255) {
 *          result.setAlpha(
 *              FloatValue
 *                  .newBuilder()
 *                  .setValue(((float) alpha) / denominator)
 *                  .build());
 *        }
 *        return resultBuilder.build();
 *      }
 *      // ...
 *
 * Example (iOS / Obj-C):
 *
 *      // ...
 *      static UIColor* fromProto(Color* protocolor) {
 *         float red = [protocolor red];
 *         float green = [protocolor green];
 *         float blue = [protocolor blue];
 *         FloatValue* alpha_wrapper = [protocolor alpha];
 *         float alpha = 1.0;
 *         if (alpha_wrapper != nil) {
 *           alpha = [alpha_wrapper value];
 *         }
 *         return [UIColor colorWithRed:red green:green blue:blue alpha:alpha];
 *      }
 *
 *      static Color* toProto(UIColor* color) {
 *          CGFloat red, green, blue, alpha;
 *          if (![color getRed:&amp;red green:&amp;green blue:&amp;blue alpha:&amp;alpha]) {
 *            return nil;
 *          }
 *          Color* result = [[Color alloc] init];
 *          [result setRed:red];
 *          [result setGreen:green];
 *          [result setBlue:blue];
 *          if (alpha &lt;= 0.9999) {
 *            [result setAlpha:floatWrapperWithValue(alpha)];
 *          }
 *          [result autorelease];
 *          return result;
 *     }
 *     // ...
 *
 *  Example (JavaScript):
 *
 *     // ...
 *
 *     var protoToCssColor = function(rgb_color) {
 *        var redFrac = rgb_color.red || 0.0;
 *        var greenFrac = rgb_color.green || 0.0;
 *        var blueFrac = rgb_color.blue || 0.0;
 *        var red = Math.floor(redFrac * 255);
 *        var green = Math.floor(greenFrac * 255);
 *        var blue = Math.floor(blueFrac * 255);
 *
 *        if (!('alpha' in rgb_color)) {
 *           return rgbToCssColor(red, green, blue);
 *        }
 *
 *        var alphaFrac = rgb_color.alpha.value || 0.0;
 *        var rgbParams = [red, green, blue].join(',');
 *        return ['rgba(', rgbParams, ',', alphaFrac, ')'].join('');
 *     };
 *
 *     var rgbToCssColor = function(red, green, blue) {
 *       var rgbNumber = new Number((red &lt;&lt; 16) | (green &lt;&lt; 8) | blue);
 *       var hexString = rgbNumber.toString(16);
 *       var missingZeros = 6 - hexString.length;
 *       var resultBuilder = ['#'];
 *       for (var i = 0; i &lt; missingZeros; i++) {
 *          resultBuilder.push('0');
 *       }
 *       resultBuilder.push(hexString);
 *       return resultBuilder.join('');
 *     };
 *
 *     // ...
 * </pre>
 *
 * Protobuf type {@code google.type.Color}
 */
public  final class Color extends
    com.google.protobuf.GeneratedMessageLite<
        Color, Color.Builder> implements
    // @@protoc_insertion_point(message_implements:google.type.Color)
    ColorOrBuilder {
  private Color() {
  }
  private int bitField0_;
  public static final int RED_FIELD_NUMBER = 1;
  private float red_;
  /**
   * <pre>
   * The amount of red in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float red = 1 [json_name = "red"];</code>
   * @return The red.
   */
  @java.lang.Override
  public float getRed() {
    return red_;
  }
  /**
   * <pre>
   * The amount of red in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float red = 1 [json_name = "red"];</code>
   * @param value The red to set.
   */
  private void setRed(float value) {
    
    red_ = value;
  }
  /**
   * <pre>
   * The amount of red in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float red = 1 [json_name = "red"];</code>
   */
  private void clearRed() {

    red_ = 0F;
  }

  public static final int GREEN_FIELD_NUMBER = 2;
  private float green_;
  /**
   * <pre>
   * The amount of green in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float green = 2 [json_name = "green"];</code>
   * @return The green.
   */
  @java.lang.Override
  public float getGreen() {
    return green_;
  }
  /**
   * <pre>
   * The amount of green in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float green = 2 [json_name = "green"];</code>
   * @param value The green to set.
   */
  private void setGreen(float value) {
    
    green_ = value;
  }
  /**
   * <pre>
   * The amount of green in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float green = 2 [json_name = "green"];</code>
   */
  private void clearGreen() {

    green_ = 0F;
  }

  public static final int BLUE_FIELD_NUMBER = 3;
  private float blue_;
  /**
   * <pre>
   * The amount of blue in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float blue = 3 [json_name = "blue"];</code>
   * @return The blue.
   */
  @java.lang.Override
  public float getBlue() {
    return blue_;
  }
  /**
   * <pre>
   * The amount of blue in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float blue = 3 [json_name = "blue"];</code>
   * @param value The blue to set.
   */
  private void setBlue(float value) {
    
    blue_ = value;
  }
  /**
   * <pre>
   * The amount of blue in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float blue = 3 [json_name = "blue"];</code>
   */
  private void clearBlue() {

    blue_ = 0F;
  }

  public static final int ALPHA_FIELD_NUMBER = 4;
  private com.google.protobuf.FloatValue alpha_;
  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
   */
  @java.lang.Override
  public boolean hasAlpha() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FloatValue getAlpha() {
    return alpha_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : alpha_;
  }
  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
   */
  private void setAlpha(com.google.protobuf.FloatValue value) {
    value.getClass();
  alpha_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeAlpha(com.google.protobuf.FloatValue value) {
    value.getClass();
  if (alpha_ != null &&
        alpha_ != com.google.protobuf.FloatValue.getDefaultInstance()) {
      alpha_ =
        com.google.protobuf.FloatValue.newBuilder(alpha_).mergeFrom(value).buildPartial();
    } else {
      alpha_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The fraction of this color that should be applied to the pixel. That is,
   * the final pixel color is defined by the equation:
   *
   *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
   *
   * This means that a value of 1.0 corresponds to a solid color, whereas
   * a value of 0.0 corresponds to a completely transparent color. This
   * uses a wrapper message rather than a simple float scalar so that it is
   * possible to distinguish between a default value and the value being unset.
   * If omitted, this color object is rendered as a solid color
   * (as if the alpha value had been explicitly given a value of 1.0).
   * </pre>
   *
   * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
   */
  private void clearAlpha() {  alpha_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static com.google.type.Color parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.Color parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.Color parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.Color parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.Color parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.type.Color parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.type.Color parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.Color parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.type.Color parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.type.Color parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.type.Color parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.type.Color parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.type.Color prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Represents a color in the RGBA color space. This representation is designed
   * for simplicity of conversion to/from color representations in various
   * languages over compactness. For example, the fields of this representation
   * can be trivially provided to the constructor of `java.awt.Color` in Java; it
   * can also be trivially provided to UIColor's `+colorWithRed:green:blue:alpha`
   * method in iOS; and, with just a little work, it can be easily formatted into
   * a CSS `rgba()` string in JavaScript.
   *
   * This reference page doesn't carry information about the absolute color
   * space
   * that should be used to interpret the RGB value (e.g. sRGB, Adobe RGB,
   * DCI-P3, BT.2020, etc.). By default, applications should assume the sRGB color
   * space.
   *
   * When color equality needs to be decided, implementations, unless
   * documented otherwise, treat two colors as equal if all their red,
   * green, blue, and alpha values each differ by at most 1e-5.
   *
   * Example (Java):
   *
   *      import com.google.type.Color;
   *
   *      // ...
   *      public static java.awt.Color fromProto(Color protocolor) {
   *        float alpha = protocolor.hasAlpha()
   *            ? protocolor.getAlpha().getValue()
   *            : 1.0;
   *
   *        return new java.awt.Color(
   *            protocolor.getRed(),
   *            protocolor.getGreen(),
   *            protocolor.getBlue(),
   *            alpha);
   *      }
   *
   *      public static Color toProto(java.awt.Color color) {
   *        float red = (float) color.getRed();
   *        float green = (float) color.getGreen();
   *        float blue = (float) color.getBlue();
   *        float denominator = 255.0;
   *        Color.Builder resultBuilder =
   *            Color
   *                .newBuilder()
   *                .setRed(red / denominator)
   *                .setGreen(green / denominator)
   *                .setBlue(blue / denominator);
   *        int alpha = color.getAlpha();
   *        if (alpha != 255) {
   *          result.setAlpha(
   *              FloatValue
   *                  .newBuilder()
   *                  .setValue(((float) alpha) / denominator)
   *                  .build());
   *        }
   *        return resultBuilder.build();
   *      }
   *      // ...
   *
   * Example (iOS / Obj-C):
   *
   *      // ...
   *      static UIColor* fromProto(Color* protocolor) {
   *         float red = [protocolor red];
   *         float green = [protocolor green];
   *         float blue = [protocolor blue];
   *         FloatValue* alpha_wrapper = [protocolor alpha];
   *         float alpha = 1.0;
   *         if (alpha_wrapper != nil) {
   *           alpha = [alpha_wrapper value];
   *         }
   *         return [UIColor colorWithRed:red green:green blue:blue alpha:alpha];
   *      }
   *
   *      static Color* toProto(UIColor* color) {
   *          CGFloat red, green, blue, alpha;
   *          if (![color getRed:&amp;red green:&amp;green blue:&amp;blue alpha:&amp;alpha]) {
   *            return nil;
   *          }
   *          Color* result = [[Color alloc] init];
   *          [result setRed:red];
   *          [result setGreen:green];
   *          [result setBlue:blue];
   *          if (alpha &lt;= 0.9999) {
   *            [result setAlpha:floatWrapperWithValue(alpha)];
   *          }
   *          [result autorelease];
   *          return result;
   *     }
   *     // ...
   *
   *  Example (JavaScript):
   *
   *     // ...
   *
   *     var protoToCssColor = function(rgb_color) {
   *        var redFrac = rgb_color.red || 0.0;
   *        var greenFrac = rgb_color.green || 0.0;
   *        var blueFrac = rgb_color.blue || 0.0;
   *        var red = Math.floor(redFrac * 255);
   *        var green = Math.floor(greenFrac * 255);
   *        var blue = Math.floor(blueFrac * 255);
   *
   *        if (!('alpha' in rgb_color)) {
   *           return rgbToCssColor(red, green, blue);
   *        }
   *
   *        var alphaFrac = rgb_color.alpha.value || 0.0;
   *        var rgbParams = [red, green, blue].join(',');
   *        return ['rgba(', rgbParams, ',', alphaFrac, ')'].join('');
   *     };
   *
   *     var rgbToCssColor = function(red, green, blue) {
   *       var rgbNumber = new Number((red &lt;&lt; 16) | (green &lt;&lt; 8) | blue);
   *       var hexString = rgbNumber.toString(16);
   *       var missingZeros = 6 - hexString.length;
   *       var resultBuilder = ['#'];
   *       for (var i = 0; i &lt; missingZeros; i++) {
   *          resultBuilder.push('0');
   *       }
   *       resultBuilder.push(hexString);
   *       return resultBuilder.join('');
   *     };
   *
   *     // ...
   * </pre>
   *
   * Protobuf type {@code google.type.Color}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.type.Color, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.type.Color)
      com.google.type.ColorOrBuilder {
    // Construct using com.google.type.Color.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The amount of red in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float red = 1 [json_name = "red"];</code>
     * @return The red.
     */
    @java.lang.Override
    public float getRed() {
      return instance.getRed();
    }
    /**
     * <pre>
     * The amount of red in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float red = 1 [json_name = "red"];</code>
     * @param value The red to set.
     * @return This builder for chaining.
     */
    public Builder setRed(float value) {
      copyOnWrite();
      instance.setRed(value);
      return this;
    }
    /**
     * <pre>
     * The amount of red in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float red = 1 [json_name = "red"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRed() {
      copyOnWrite();
      instance.clearRed();
      return this;
    }

    /**
     * <pre>
     * The amount of green in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float green = 2 [json_name = "green"];</code>
     * @return The green.
     */
    @java.lang.Override
    public float getGreen() {
      return instance.getGreen();
    }
    /**
     * <pre>
     * The amount of green in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float green = 2 [json_name = "green"];</code>
     * @param value The green to set.
     * @return This builder for chaining.
     */
    public Builder setGreen(float value) {
      copyOnWrite();
      instance.setGreen(value);
      return this;
    }
    /**
     * <pre>
     * The amount of green in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float green = 2 [json_name = "green"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGreen() {
      copyOnWrite();
      instance.clearGreen();
      return this;
    }

    /**
     * <pre>
     * The amount of blue in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float blue = 3 [json_name = "blue"];</code>
     * @return The blue.
     */
    @java.lang.Override
    public float getBlue() {
      return instance.getBlue();
    }
    /**
     * <pre>
     * The amount of blue in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float blue = 3 [json_name = "blue"];</code>
     * @param value The blue to set.
     * @return This builder for chaining.
     */
    public Builder setBlue(float value) {
      copyOnWrite();
      instance.setBlue(value);
      return this;
    }
    /**
     * <pre>
     * The amount of blue in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float blue = 3 [json_name = "blue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBlue() {
      copyOnWrite();
      instance.clearBlue();
      return this;
    }

    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    @java.lang.Override
    public boolean hasAlpha() {
      return instance.hasAlpha();
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.FloatValue getAlpha() {
      return instance.getAlpha();
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    public Builder setAlpha(com.google.protobuf.FloatValue value) {
      copyOnWrite();
      instance.setAlpha(value);
      return this;
      }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    public Builder setAlpha(
        com.google.protobuf.FloatValue.Builder builderForValue) {
      copyOnWrite();
      instance.setAlpha(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    public Builder mergeAlpha(com.google.protobuf.FloatValue value) {
      copyOnWrite();
      instance.mergeAlpha(value);
      return this;
    }
    /**
     * <pre>
     * The fraction of this color that should be applied to the pixel. That is,
     * the final pixel color is defined by the equation:
     *
     *   `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)`
     *
     * This means that a value of 1.0 corresponds to a solid color, whereas
     * a value of 0.0 corresponds to a completely transparent color. This
     * uses a wrapper message rather than a simple float scalar so that it is
     * possible to distinguish between a default value and the value being unset.
     * If omitted, this color object is rendered as a solid color
     * (as if the alpha value had been explicitly given a value of 1.0).
     * </pre>
     *
     * <code>.google.protobuf.FloatValue alpha = 4 [json_name = "alpha"];</code>
     */
    public Builder clearAlpha() {  copyOnWrite();
      instance.clearAlpha();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.type.Color)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.type.Color();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "red_",
            "green_",
            "blue_",
            "alpha_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001" +
              "\u0003\u0001\u0004\u1009\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.type.Color> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.type.Color.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.type.Color>(
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


  // @@protoc_insertion_point(class_scope:google.type.Color)
  private static final com.google.type.Color DEFAULT_INSTANCE;
  static {
    Color defaultInstance = new Color();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Color.class, defaultInstance);
  }

  public static com.google.type.Color getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Color> PARSER;

  public static com.google.protobuf.Parser<Color> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

