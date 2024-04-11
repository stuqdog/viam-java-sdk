// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/client.proto

// Protobuf Java Version: 3.25.2
package com.google.api;

public interface ClientLibrarySettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.ClientLibrarySettings)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Version of the API to apply these settings to. This is the full protobuf
   * package for the API, ending in the version element.
   * Examples: "google.cloud.speech.v1" and "google.spanner.admin.database.v1".
   * </pre>
   *
   * <code>string version = 1 [json_name = "version"];</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Version of the API to apply these settings to. This is the full protobuf
   * package for the API, ending in the version element.
   * Examples: "google.cloud.speech.v1" and "google.spanner.admin.database.v1".
   * </pre>
   *
   * <code>string version = 1 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Launch stage of this version of the API.
   * </pre>
   *
   * <code>.google.api.LaunchStage launch_stage = 2 [json_name = "launchStage"];</code>
   * @return The enum numeric value on the wire for launchStage.
   */
  int getLaunchStageValue();
  /**
   * <pre>
   * Launch stage of this version of the API.
   * </pre>
   *
   * <code>.google.api.LaunchStage launch_stage = 2 [json_name = "launchStage"];</code>
   * @return The launchStage.
   */
  com.google.api.LaunchStage getLaunchStage();

  /**
   * <pre>
   * When using transport=rest, the client request will encode enums as
   * numbers rather than strings.
   * </pre>
   *
   * <code>bool rest_numeric_enums = 3 [json_name = "restNumericEnums"];</code>
   * @return The restNumericEnums.
   */
  boolean getRestNumericEnums();

  /**
   * <pre>
   * Settings for legacy Java features, supported in the Service YAML.
   * </pre>
   *
   * <code>.google.api.JavaSettings java_settings = 21 [json_name = "javaSettings"];</code>
   * @return Whether the javaSettings field is set.
   */
  boolean hasJavaSettings();
  /**
   * <pre>
   * Settings for legacy Java features, supported in the Service YAML.
   * </pre>
   *
   * <code>.google.api.JavaSettings java_settings = 21 [json_name = "javaSettings"];</code>
   * @return The javaSettings.
   */
  com.google.api.JavaSettings getJavaSettings();

  /**
   * <pre>
   * Settings for C++ client libraries.
   * </pre>
   *
   * <code>.google.api.CppSettings cpp_settings = 22 [json_name = "cppSettings"];</code>
   * @return Whether the cppSettings field is set.
   */
  boolean hasCppSettings();
  /**
   * <pre>
   * Settings for C++ client libraries.
   * </pre>
   *
   * <code>.google.api.CppSettings cpp_settings = 22 [json_name = "cppSettings"];</code>
   * @return The cppSettings.
   */
  com.google.api.CppSettings getCppSettings();

  /**
   * <pre>
   * Settings for PHP client libraries.
   * </pre>
   *
   * <code>.google.api.PhpSettings php_settings = 23 [json_name = "phpSettings"];</code>
   * @return Whether the phpSettings field is set.
   */
  boolean hasPhpSettings();
  /**
   * <pre>
   * Settings for PHP client libraries.
   * </pre>
   *
   * <code>.google.api.PhpSettings php_settings = 23 [json_name = "phpSettings"];</code>
   * @return The phpSettings.
   */
  com.google.api.PhpSettings getPhpSettings();

  /**
   * <pre>
   * Settings for Python client libraries.
   * </pre>
   *
   * <code>.google.api.PythonSettings python_settings = 24 [json_name = "pythonSettings"];</code>
   * @return Whether the pythonSettings field is set.
   */
  boolean hasPythonSettings();
  /**
   * <pre>
   * Settings for Python client libraries.
   * </pre>
   *
   * <code>.google.api.PythonSettings python_settings = 24 [json_name = "pythonSettings"];</code>
   * @return The pythonSettings.
   */
  com.google.api.PythonSettings getPythonSettings();

  /**
   * <pre>
   * Settings for Node client libraries.
   * </pre>
   *
   * <code>.google.api.NodeSettings node_settings = 25 [json_name = "nodeSettings"];</code>
   * @return Whether the nodeSettings field is set.
   */
  boolean hasNodeSettings();
  /**
   * <pre>
   * Settings for Node client libraries.
   * </pre>
   *
   * <code>.google.api.NodeSettings node_settings = 25 [json_name = "nodeSettings"];</code>
   * @return The nodeSettings.
   */
  com.google.api.NodeSettings getNodeSettings();

  /**
   * <pre>
   * Settings for .NET client libraries.
   * </pre>
   *
   * <code>.google.api.DotnetSettings dotnet_settings = 26 [json_name = "dotnetSettings"];</code>
   * @return Whether the dotnetSettings field is set.
   */
  boolean hasDotnetSettings();
  /**
   * <pre>
   * Settings for .NET client libraries.
   * </pre>
   *
   * <code>.google.api.DotnetSettings dotnet_settings = 26 [json_name = "dotnetSettings"];</code>
   * @return The dotnetSettings.
   */
  com.google.api.DotnetSettings getDotnetSettings();

  /**
   * <pre>
   * Settings for Ruby client libraries.
   * </pre>
   *
   * <code>.google.api.RubySettings ruby_settings = 27 [json_name = "rubySettings"];</code>
   * @return Whether the rubySettings field is set.
   */
  boolean hasRubySettings();
  /**
   * <pre>
   * Settings for Ruby client libraries.
   * </pre>
   *
   * <code>.google.api.RubySettings ruby_settings = 27 [json_name = "rubySettings"];</code>
   * @return The rubySettings.
   */
  com.google.api.RubySettings getRubySettings();

  /**
   * <pre>
   * Settings for Go client libraries.
   * </pre>
   *
   * <code>.google.api.GoSettings go_settings = 28 [json_name = "goSettings"];</code>
   * @return Whether the goSettings field is set.
   */
  boolean hasGoSettings();
  /**
   * <pre>
   * Settings for Go client libraries.
   * </pre>
   *
   * <code>.google.api.GoSettings go_settings = 28 [json_name = "goSettings"];</code>
   * @return The goSettings.
   */
  com.google.api.GoSettings getGoSettings();
}
