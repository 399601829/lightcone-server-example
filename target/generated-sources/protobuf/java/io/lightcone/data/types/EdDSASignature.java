// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_types.proto

package io.lightcone.data.types;

/**
 * Protobuf type {@code io.lightcone.data.types.EdDSASignature}
 */
public  final class EdDSASignature extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.types.EdDSASignature)
    EdDSASignatureOrBuilder {
  // Use EdDSASignature.newBuilder() to construct.
  private EdDSASignature(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private EdDSASignature() {
    rx_ = com.google.protobuf.ByteString.EMPTY;
    ry_ = com.google.protobuf.ByteString.EMPTY;
    s_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EdDSASignature(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {

            rx_ = input.readBytes();
            break;
          }
          case 18: {

            ry_ = input.readBytes();
            break;
          }
          case 26: {

            s_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.lightcone.data.types.DataTypes.internal_static_io_lightcone_data_types_EdDSASignature_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.types.DataTypes.internal_static_io_lightcone_data_types_EdDSASignature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.types.EdDSASignature.class, io.lightcone.data.types.EdDSASignature.Builder.class);
  }

  public static final int RX_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString rx_;
  /**
   * <code>optional bytes rx = 1;</code>
   *
   * <pre>
   * 256bit
   * </pre>
   */
  public com.google.protobuf.ByteString getRx() {
    return rx_;
  }

  public static final int RY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString ry_;
  /**
   * <code>optional bytes ry = 2;</code>
   *
   * <pre>
   * 256bit
   * </pre>
   */
  public com.google.protobuf.ByteString getRy() {
    return ry_;
  }

  public static final int S_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString s_;
  /**
   * <code>optional bytes s = 3;</code>
   *
   * <pre>
   * 256bit
   * </pre>
   */
  public com.google.protobuf.ByteString getS() {
    return s_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!rx_.isEmpty()) {
      output.writeBytes(1, rx_);
    }
    if (!ry_.isEmpty()) {
      output.writeBytes(2, ry_);
    }
    if (!s_.isEmpty()) {
      output.writeBytes(3, s_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!rx_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, rx_);
    }
    if (!ry_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, ry_);
    }
    if (!s_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, s_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.types.EdDSASignature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.types.EdDSASignature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.types.EdDSASignature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.types.EdDSASignature parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.types.EdDSASignature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.types.EdDSASignature parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.types.EdDSASignature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.types.EdDSASignature parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.types.EdDSASignature parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.types.EdDSASignature parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.types.EdDSASignature prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code io.lightcone.data.types.EdDSASignature}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.types.EdDSASignature)
      io.lightcone.data.types.EdDSASignatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.types.DataTypes.internal_static_io_lightcone_data_types_EdDSASignature_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.types.DataTypes.internal_static_io_lightcone_data_types_EdDSASignature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.types.EdDSASignature.class, io.lightcone.data.types.EdDSASignature.Builder.class);
    }

    // Construct using io.lightcone.data.types.EdDSASignature.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      rx_ = com.google.protobuf.ByteString.EMPTY;

      ry_ = com.google.protobuf.ByteString.EMPTY;

      s_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.types.DataTypes.internal_static_io_lightcone_data_types_EdDSASignature_descriptor;
    }

    public io.lightcone.data.types.EdDSASignature getDefaultInstanceForType() {
      return io.lightcone.data.types.EdDSASignature.getDefaultInstance();
    }

    public io.lightcone.data.types.EdDSASignature build() {
      io.lightcone.data.types.EdDSASignature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.types.EdDSASignature buildPartial() {
      io.lightcone.data.types.EdDSASignature result = new io.lightcone.data.types.EdDSASignature(this);
      result.rx_ = rx_;
      result.ry_ = ry_;
      result.s_ = s_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.types.EdDSASignature) {
        return mergeFrom((io.lightcone.data.types.EdDSASignature)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.types.EdDSASignature other) {
      if (other == io.lightcone.data.types.EdDSASignature.getDefaultInstance()) return this;
      if (other.getRx() != com.google.protobuf.ByteString.EMPTY) {
        setRx(other.getRx());
      }
      if (other.getRy() != com.google.protobuf.ByteString.EMPTY) {
        setRy(other.getRy());
      }
      if (other.getS() != com.google.protobuf.ByteString.EMPTY) {
        setS(other.getS());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.lightcone.data.types.EdDSASignature parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.types.EdDSASignature) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString rx_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes rx = 1;</code>
     *
     * <pre>
     * 256bit
     * </pre>
     */
    public com.google.protobuf.ByteString getRx() {
      return rx_;
    }
    /**
     * <code>optional bytes rx = 1;</code>
     *
     * <pre>
     * 256bit
     * </pre>
     */
    public Builder setRx(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rx_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes rx = 1;</code>
     *
     * <pre>
     * 256bit
     * </pre>
     */
    public Builder clearRx() {
      
      rx_ = getDefaultInstance().getRx();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString ry_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes ry = 2;</code>
     *
     * <pre>
     * 256bit
     * </pre>
     */
    public com.google.protobuf.ByteString getRy() {
      return ry_;
    }
    /**
     * <code>optional bytes ry = 2;</code>
     *
     * <pre>
     * 256bit
     * </pre>
     */
    public Builder setRy(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ry_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes ry = 2;</code>
     *
     * <pre>
     * 256bit
     * </pre>
     */
    public Builder clearRy() {
      
      ry_ = getDefaultInstance().getRy();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString s_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes s = 3;</code>
     *
     * <pre>
     * 256bit
     * </pre>
     */
    public com.google.protobuf.ByteString getS() {
      return s_;
    }
    /**
     * <code>optional bytes s = 3;</code>
     *
     * <pre>
     * 256bit
     * </pre>
     */
    public Builder setS(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      s_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes s = 3;</code>
     *
     * <pre>
     * 256bit
     * </pre>
     */
    public Builder clearS() {
      
      s_ = getDefaultInstance().getS();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.types.EdDSASignature)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.types.EdDSASignature)
  private static final io.lightcone.data.types.EdDSASignature DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.types.EdDSASignature();
  }

  public static io.lightcone.data.types.EdDSASignature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EdDSASignature>
      PARSER = new com.google.protobuf.AbstractParser<EdDSASignature>() {
    public EdDSASignature parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new EdDSASignature(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<EdDSASignature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EdDSASignature> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.types.EdDSASignature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

