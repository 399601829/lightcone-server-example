// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_dex.proto

package io.lightcone.data.dex;

/**
 * Protobuf type {@code io.lightcone.data.dex.SubmitOrderRes}
 */
public  final class SubmitOrderRes extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.dex.SubmitOrderRes)
    SubmitOrderResOrBuilder {
  // Use SubmitOrderRes.newBuilder() to construct.
  private SubmitOrderRes(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SubmitOrderRes() {
    orderUuid_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SubmitOrderRes(
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
          case 8: {

            orderUuid_ = input.readUInt64();
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
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_SubmitOrderRes_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_SubmitOrderRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.dex.SubmitOrderRes.class, io.lightcone.data.dex.SubmitOrderRes.Builder.class);
  }

  public static final int ORDER_UUID_FIELD_NUMBER = 1;
  private long orderUuid_;
  /**
   * <code>optional uint64 order_uuid = 1;</code>
   */
  public long getOrderUuid() {
    return orderUuid_;
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
    if (orderUuid_ != 0L) {
      output.writeUInt64(1, orderUuid_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (orderUuid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, orderUuid_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.dex.SubmitOrderRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.SubmitOrderRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.SubmitOrderRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.SubmitOrderRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.SubmitOrderRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.SubmitOrderRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.SubmitOrderRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.dex.SubmitOrderRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.SubmitOrderRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.SubmitOrderRes parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.dex.SubmitOrderRes prototype) {
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
   * Protobuf type {@code io.lightcone.data.dex.SubmitOrderRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.dex.SubmitOrderRes)
      io.lightcone.data.dex.SubmitOrderResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_SubmitOrderRes_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_SubmitOrderRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.dex.SubmitOrderRes.class, io.lightcone.data.dex.SubmitOrderRes.Builder.class);
    }

    // Construct using io.lightcone.data.dex.SubmitOrderRes.newBuilder()
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
      orderUuid_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_SubmitOrderRes_descriptor;
    }

    public io.lightcone.data.dex.SubmitOrderRes getDefaultInstanceForType() {
      return io.lightcone.data.dex.SubmitOrderRes.getDefaultInstance();
    }

    public io.lightcone.data.dex.SubmitOrderRes build() {
      io.lightcone.data.dex.SubmitOrderRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.dex.SubmitOrderRes buildPartial() {
      io.lightcone.data.dex.SubmitOrderRes result = new io.lightcone.data.dex.SubmitOrderRes(this);
      result.orderUuid_ = orderUuid_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.dex.SubmitOrderRes) {
        return mergeFrom((io.lightcone.data.dex.SubmitOrderRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.dex.SubmitOrderRes other) {
      if (other == io.lightcone.data.dex.SubmitOrderRes.getDefaultInstance()) return this;
      if (other.getOrderUuid() != 0L) {
        setOrderUuid(other.getOrderUuid());
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
      io.lightcone.data.dex.SubmitOrderRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.dex.SubmitOrderRes) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long orderUuid_ ;
    /**
     * <code>optional uint64 order_uuid = 1;</code>
     */
    public long getOrderUuid() {
      return orderUuid_;
    }
    /**
     * <code>optional uint64 order_uuid = 1;</code>
     */
    public Builder setOrderUuid(long value) {
      
      orderUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 order_uuid = 1;</code>
     */
    public Builder clearOrderUuid() {
      
      orderUuid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.dex.SubmitOrderRes)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.dex.SubmitOrderRes)
  private static final io.lightcone.data.dex.SubmitOrderRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.dex.SubmitOrderRes();
  }

  public static io.lightcone.data.dex.SubmitOrderRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitOrderRes>
      PARSER = new com.google.protobuf.AbstractParser<SubmitOrderRes>() {
    public SubmitOrderRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new SubmitOrderRes(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<SubmitOrderRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitOrderRes> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.dex.SubmitOrderRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

