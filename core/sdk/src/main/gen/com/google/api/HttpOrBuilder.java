// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/http.proto

// Protobuf Java Version: 3.25.2
package com.google.api;

public interface HttpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Http)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A list of HTTP configuration rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule rules = 1 [json_name = "rules"];</code>
   */
  java.util.List<com.google.api.HttpRule> 
      getRulesList();
  /**
   * <pre>
   * A list of HTTP configuration rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule rules = 1 [json_name = "rules"];</code>
   */
  com.google.api.HttpRule getRules(int index);
  /**
   * <pre>
   * A list of HTTP configuration rules that apply to individual API methods.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.HttpRule rules = 1 [json_name = "rules"];</code>
   */
  int getRulesCount();

  /**
   * <pre>
   * When set to true, URL path parameters will be fully URI-decoded except in
   * cases of single segment matches in reserved expansion, where "%2F" will be
   * left encoded.
   *
   * The default behavior is to not decode RFC 6570 reserved characters in multi
   * segment matches.
   * </pre>
   *
   * <code>bool fully_decode_reserved_expansion = 2 [json_name = "fullyDecodeReservedExpansion"];</code>
   * @return The fullyDecodeReservedExpansion.
   */
  boolean getFullyDecodeReservedExpansion();
}
