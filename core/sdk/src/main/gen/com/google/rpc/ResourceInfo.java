// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/rpc/error_details.proto
// Protobuf Java Version: 4.27.2

package com.google.rpc;

/**
 * <pre>
 * Describes the resource that is being accessed.
 * </pre>
 *
 * Protobuf type {@code google.rpc.ResourceInfo}
 */
public  final class ResourceInfo extends
    com.google.protobuf.GeneratedMessageLite<
        ResourceInfo, ResourceInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:google.rpc.ResourceInfo)
    ResourceInfoOrBuilder {
  private ResourceInfo() {
    resourceType_ = "";
    resourceName_ = "";
    owner_ = "";
    description_ = "";
  }
  public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
  private java.lang.String resourceType_;
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>string resource_type = 1 [json_name = "resourceType"];</code>
   * @return The resourceType.
   */
  @java.lang.Override
  public java.lang.String getResourceType() {
    return resourceType_;
  }
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>string resource_type = 1 [json_name = "resourceType"];</code>
   * @return The bytes for resourceType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceTypeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(resourceType_);
  }
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>string resource_type = 1 [json_name = "resourceType"];</code>
   * @param value The resourceType to set.
   */
  private void setResourceType(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    resourceType_ = value;
  }
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>string resource_type = 1 [json_name = "resourceType"];</code>
   */
  private void clearResourceType() {

    resourceType_ = getDefaultInstance().getResourceType();
  }
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>string resource_type = 1 [json_name = "resourceType"];</code>
   * @param value The bytes for resourceType to set.
   */
  private void setResourceTypeBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    resourceType_ = value.toStringUtf8();

  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
  private java.lang.String resourceName_;
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is
   * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>string resource_name = 2 [json_name = "resourceName"];</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    return resourceName_;
  }
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is
   * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>string resource_name = 2 [json_name = "resourceName"];</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(resourceName_);
  }
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is
   * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>string resource_name = 2 [json_name = "resourceName"];</code>
   * @param value The resourceName to set.
   */
  private void setResourceName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    resourceName_ = value;
  }
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is
   * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>string resource_name = 2 [json_name = "resourceName"];</code>
   */
  private void clearResourceName() {

    resourceName_ = getDefaultInstance().getResourceName();
  }
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is
   * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>string resource_name = 2 [json_name = "resourceName"];</code>
   * @param value The bytes for resourceName to set.
   */
  private void setResourceNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    resourceName_ = value.toStringUtf8();

  }

  public static final int OWNER_FIELD_NUMBER = 3;
  private java.lang.String owner_;
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>string owner = 3 [json_name = "owner"];</code>
   * @return The owner.
   */
  @java.lang.Override
  public java.lang.String getOwner() {
    return owner_;
  }
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>string owner = 3 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(owner_);
  }
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>string owner = 3 [json_name = "owner"];</code>
   * @param value The owner to set.
   */
  private void setOwner(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    owner_ = value;
  }
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>string owner = 3 [json_name = "owner"];</code>
   */
  private void clearOwner() {

    owner_ = getDefaultInstance().getOwner();
  }
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>string owner = 3 [json_name = "owner"];</code>
   * @param value The bytes for owner to set.
   */
  private void setOwnerBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    owner_ = value.toStringUtf8();

  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  private java.lang.String description_;
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    return description_;
  }
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(description_);
  }
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @param value The description to set.
   */
  private void setDescription(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    description_ = value;
  }
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   */
  private void clearDescription() {

    description_ = getDefaultInstance().getDescription();
  }
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @param value The bytes for description to set.
   */
  private void setDescriptionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    description_ = value.toStringUtf8();

  }

  public static com.google.rpc.ResourceInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.google.rpc.ResourceInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.google.rpc.ResourceInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.rpc.ResourceInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.rpc.ResourceInfo prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Describes the resource that is being accessed.
   * </pre>
   *
   * Protobuf type {@code google.rpc.ResourceInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.rpc.ResourceInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.rpc.ResourceInfo)
      com.google.rpc.ResourceInfoOrBuilder {
    // Construct using com.google.rpc.ResourceInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>string resource_type = 1 [json_name = "resourceType"];</code>
     * @return The resourceType.
     */
    @java.lang.Override
    public java.lang.String getResourceType() {
      return instance.getResourceType();
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>string resource_type = 1 [json_name = "resourceType"];</code>
     * @return The bytes for resourceType.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getResourceTypeBytes() {
      return instance.getResourceTypeBytes();
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>string resource_type = 1 [json_name = "resourceType"];</code>
     * @param value The resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceType(
        java.lang.String value) {
      copyOnWrite();
      instance.setResourceType(value);
      return this;
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>string resource_type = 1 [json_name = "resourceType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceType() {
      copyOnWrite();
      instance.clearResourceType();
      return this;
    }
    /**
     * <pre>
     * A name for the type of resource being accessed, e.g. "sql table",
     * "cloud storage bucket", "file", "Google calendar"; or the type URL
     * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
     * </pre>
     *
     * <code>string resource_type = 1 [json_name = "resourceType"];</code>
     * @param value The bytes for resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceTypeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setResourceTypeBytes(value);
      return this;
    }

    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is
     * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>string resource_name = 2 [json_name = "resourceName"];</code>
     * @return The resourceName.
     */
    @java.lang.Override
    public java.lang.String getResourceName() {
      return instance.getResourceName();
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is
     * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>string resource_name = 2 [json_name = "resourceName"];</code>
     * @return The bytes for resourceName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      return instance.getResourceNameBytes();
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is
     * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>string resource_name = 2 [json_name = "resourceName"];</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      copyOnWrite();
      instance.setResourceName(value);
      return this;
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is
     * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>string resource_name = 2 [json_name = "resourceName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      copyOnWrite();
      instance.clearResourceName();
      return this;
    }
    /**
     * <pre>
     * The name of the resource being accessed.  For example, a shared calendar
     * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
     * error is
     * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
     * </pre>
     *
     * <code>string resource_name = 2 [json_name = "resourceName"];</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setResourceNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>string owner = 3 [json_name = "owner"];</code>
     * @return The owner.
     */
    @java.lang.Override
    public java.lang.String getOwner() {
      return instance.getOwner();
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>string owner = 3 [json_name = "owner"];</code>
     * @return The bytes for owner.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      return instance.getOwnerBytes();
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>string owner = 3 [json_name = "owner"];</code>
     * @param value The owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwner(
        java.lang.String value) {
      copyOnWrite();
      instance.setOwner(value);
      return this;
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>string owner = 3 [json_name = "owner"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOwner() {
      copyOnWrite();
      instance.clearOwner();
      return this;
    }
    /**
     * <pre>
     * The owner of the resource (optional).
     * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
     * id&gt;".
     * </pre>
     *
     * <code>string owner = 3 [json_name = "owner"];</code>
     * @param value The bytes for owner to set.
     * @return This builder for chaining.
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setOwnerBytes(value);
      return this;
    }

    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
     * @return The description.
     */
    @java.lang.Override
    public java.lang.String getDescription() {
      return instance.getDescription();
    }
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return instance.getDescriptionBytes();
    }
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
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
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      copyOnWrite();
      instance.clearDescription();
      return this;
    }
    /**
     * <pre>
     * Describes what error is encountered when accessing this resource.
     * For example, updating a cloud project may require the `writer` permission
     * on the developer console project.
     * </pre>
     *
     * <code>string description = 4 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDescriptionBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.rpc.ResourceInfo)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.rpc.ResourceInfo();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "resourceType_",
            "resourceName_",
            "owner_",
            "description_",
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
        com.google.protobuf.Parser<com.google.rpc.ResourceInfo> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.rpc.ResourceInfo.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.rpc.ResourceInfo>(
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


  // @@protoc_insertion_point(class_scope:google.rpc.ResourceInfo)
  private static final com.google.rpc.ResourceInfo DEFAULT_INSTANCE;
  static {
    ResourceInfo defaultInstance = new ResourceInfo();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ResourceInfo.class, defaultInstance);
  }

  public static com.google.rpc.ResourceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ResourceInfo> PARSER;

  public static com.google.protobuf.Parser<ResourceInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

