// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/expr/v1alpha1/explain.proto
// Protobuf Java Version: 4.27.2

package com.google.api.expr.v1alpha1;

@java.lang.Deprecated public interface ExplainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1alpha1.Explain)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * All of the observed values.
   *
   * The field value_index is an index in the values list.
   * Separating values from steps is needed to remove redundant values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.Value values = 1 [json_name = "values"];</code>
   */
  java.util.List<com.google.api.expr.v1alpha1.Value> 
      getValuesList();
  /**
   * <pre>
   * All of the observed values.
   *
   * The field value_index is an index in the values list.
   * Separating values from steps is needed to remove redundant values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.Value values = 1 [json_name = "values"];</code>
   */
  com.google.api.expr.v1alpha1.Value getValues(int index);
  /**
   * <pre>
   * All of the observed values.
   *
   * The field value_index is an index in the values list.
   * Separating values from steps is needed to remove redundant values.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.Value values = 1 [json_name = "values"];</code>
   */
  int getValuesCount();

  /**
   * <pre>
   * List of steps.
   *
   * Repeated evaluations of the same expression generate new ExprStep
   * instances. The order of such ExprStep instances matches the order of
   * elements returned by Comprehension.iter_range.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.Explain.ExprStep expr_steps = 2 [json_name = "exprSteps"];</code>
   */
  java.util.List<com.google.api.expr.v1alpha1.Explain.ExprStep> 
      getExprStepsList();
  /**
   * <pre>
   * List of steps.
   *
   * Repeated evaluations of the same expression generate new ExprStep
   * instances. The order of such ExprStep instances matches the order of
   * elements returned by Comprehension.iter_range.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.Explain.ExprStep expr_steps = 2 [json_name = "exprSteps"];</code>
   */
  com.google.api.expr.v1alpha1.Explain.ExprStep getExprSteps(int index);
  /**
   * <pre>
   * List of steps.
   *
   * Repeated evaluations of the same expression generate new ExprStep
   * instances. The order of such ExprStep instances matches the order of
   * elements returned by Comprehension.iter_range.
   * </pre>
   *
   * <code>repeated .google.api.expr.v1alpha1.Explain.ExprStep expr_steps = 2 [json_name = "exprSteps"];</code>
   */
  int getExprStepsCount();
}
