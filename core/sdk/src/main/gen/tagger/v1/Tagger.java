// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tagger/v1/tagger.proto

package tagger.v1;

public final class Tagger {
  private Tagger() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(tagger.v1.Tagger.tags);
    registry.add(tagger.v1.Tagger.oneofTags);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int TAGS_FIELD_NUMBER = 847939;
  /**
   * <pre>
   * Multiple Tags can be spcified.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.String> tags = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int ONEOF_TAGS_FIELD_NUMBER = 847939;
  /**
   * <pre>
   * Multiple Tags can be spcified.
   * </pre>
   *
   * <code>extend .google.protobuf.OneofOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.OneofOptions,
      java.lang.String> oneofTags = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026tagger/v1/tagger.proto\022\ttagger.v1\032 goo" +
      "gle/protobuf/descriptor.proto:3\n\004tags\022\035." +
      "google.protobuf.FieldOptions\030\303\3403 \001(\tR\004ta" +
      "gs:>\n\noneof_tags\022\035.google.protobuf.Oneof" +
      "Options\030\303\3403 \001(\tR\toneofTagsB4Z2github.com" +
      "/srikrsna/protoc-gen-gotag/tagger;tagger" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    tags.internalInit(descriptor.getExtensions().get(0));
    oneofTags.internalInit(descriptor.getExtensions().get(1));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
