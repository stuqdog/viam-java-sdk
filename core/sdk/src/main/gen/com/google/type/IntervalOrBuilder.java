// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/type/interval.proto

// Protobuf Java Version: 3.25.2
package com.google.type;

public interface IntervalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.type.Interval)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Optional. Inclusive start of the interval.
   *
   * If specified, a Timestamp matching this interval will have to be the same
   * or after the start.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Optional. Inclusive start of the interval.
   *
   * If specified, a Timestamp matching this interval will have to be the same
   * or after the start.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   * <pre>
   * Optional. Exclusive end of the interval.
   *
   * If specified, a Timestamp matching this interval will have to be before the
   * end.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime"];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Optional. Exclusive end of the interval.
   *
   * If specified, a Timestamp matching this interval will have to be before the
   * end.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [json_name = "endTime"];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
}
