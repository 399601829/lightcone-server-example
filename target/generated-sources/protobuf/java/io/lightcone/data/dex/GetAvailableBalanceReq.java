// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_dex.proto

package io.lightcone.data.dex;

/**
 * Protobuf type {@code io.lightcone.data.dex.GetAvailableBalanceReq}
 */
public  final class GetAvailableBalanceReq extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.dex.GetAvailableBalanceReq)
    GetAvailableBalanceReqOrBuilder {
  // Use GetAvailableBalanceReq.newBuilder() to construct.
  private GetAvailableBalanceReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetAvailableBalanceReq() {
    accountId_ = 0L;
    tokenAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetAvailableBalanceReq(
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

            accountId_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              tokenAddresses_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            tokenAddresses_.add(s);
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        tokenAddresses_ = tokenAddresses_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetAvailableBalanceReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetAvailableBalanceReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.dex.GetAvailableBalanceReq.class, io.lightcone.data.dex.GetAvailableBalanceReq.Builder.class);
  }

  private int bitField0_;
  public static final int ACCOUNT_ID_FIELD_NUMBER = 1;
  private long accountId_;
  /**
   * <code>optional uint64 account_id = 1;</code>
   */
  public long getAccountId() {
    return accountId_;
  }

  public static final int TOKEN_ADDRESSES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList tokenAddresses_;
  /**
   * <code>repeated string token_addresses = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getTokenAddressesList() {
    return tokenAddresses_;
  }
  /**
   * <code>repeated string token_addresses = 2;</code>
   */
  public int getTokenAddressesCount() {
    return tokenAddresses_.size();
  }
  /**
   * <code>repeated string token_addresses = 2;</code>
   */
  public java.lang.String getTokenAddresses(int index) {
    return tokenAddresses_.get(index);
  }
  /**
   * <code>repeated string token_addresses = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTokenAddressesBytes(int index) {
    return tokenAddresses_.getByteString(index);
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
    if (accountId_ != 0L) {
      output.writeUInt64(1, accountId_);
    }
    for (int i = 0; i < tokenAddresses_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, tokenAddresses_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, accountId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < tokenAddresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(tokenAddresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTokenAddressesList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.dex.GetAvailableBalanceReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.GetAvailableBalanceReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetAvailableBalanceReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.GetAvailableBalanceReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetAvailableBalanceReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.GetAvailableBalanceReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetAvailableBalanceReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.dex.GetAvailableBalanceReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetAvailableBalanceReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.GetAvailableBalanceReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.dex.GetAvailableBalanceReq prototype) {
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
   * Protobuf type {@code io.lightcone.data.dex.GetAvailableBalanceReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.dex.GetAvailableBalanceReq)
      io.lightcone.data.dex.GetAvailableBalanceReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetAvailableBalanceReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetAvailableBalanceReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.dex.GetAvailableBalanceReq.class, io.lightcone.data.dex.GetAvailableBalanceReq.Builder.class);
    }

    // Construct using io.lightcone.data.dex.GetAvailableBalanceReq.newBuilder()
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
      accountId_ = 0L;

      tokenAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetAvailableBalanceReq_descriptor;
    }

    public io.lightcone.data.dex.GetAvailableBalanceReq getDefaultInstanceForType() {
      return io.lightcone.data.dex.GetAvailableBalanceReq.getDefaultInstance();
    }

    public io.lightcone.data.dex.GetAvailableBalanceReq build() {
      io.lightcone.data.dex.GetAvailableBalanceReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.dex.GetAvailableBalanceReq buildPartial() {
      io.lightcone.data.dex.GetAvailableBalanceReq result = new io.lightcone.data.dex.GetAvailableBalanceReq(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.accountId_ = accountId_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        tokenAddresses_ = tokenAddresses_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.tokenAddresses_ = tokenAddresses_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.dex.GetAvailableBalanceReq) {
        return mergeFrom((io.lightcone.data.dex.GetAvailableBalanceReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.dex.GetAvailableBalanceReq other) {
      if (other == io.lightcone.data.dex.GetAvailableBalanceReq.getDefaultInstance()) return this;
      if (other.getAccountId() != 0L) {
        setAccountId(other.getAccountId());
      }
      if (!other.tokenAddresses_.isEmpty()) {
        if (tokenAddresses_.isEmpty()) {
          tokenAddresses_ = other.tokenAddresses_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureTokenAddressesIsMutable();
          tokenAddresses_.addAll(other.tokenAddresses_);
        }
        onChanged();
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
      io.lightcone.data.dex.GetAvailableBalanceReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.dex.GetAvailableBalanceReq) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long accountId_ ;
    /**
     * <code>optional uint64 account_id = 1;</code>
     */
    public long getAccountId() {
      return accountId_;
    }
    /**
     * <code>optional uint64 account_id = 1;</code>
     */
    public Builder setAccountId(long value) {
      
      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 account_id = 1;</code>
     */
    public Builder clearAccountId() {
      
      accountId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList tokenAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTokenAddressesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        tokenAddresses_ = new com.google.protobuf.LazyStringArrayList(tokenAddresses_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string token_addresses = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getTokenAddressesList() {
      return tokenAddresses_.getUnmodifiableView();
    }
    /**
     * <code>repeated string token_addresses = 2;</code>
     */
    public int getTokenAddressesCount() {
      return tokenAddresses_.size();
    }
    /**
     * <code>repeated string token_addresses = 2;</code>
     */
    public java.lang.String getTokenAddresses(int index) {
      return tokenAddresses_.get(index);
    }
    /**
     * <code>repeated string token_addresses = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTokenAddressesBytes(int index) {
      return tokenAddresses_.getByteString(index);
    }
    /**
     * <code>repeated string token_addresses = 2;</code>
     */
    public Builder setTokenAddresses(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTokenAddressesIsMutable();
      tokenAddresses_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string token_addresses = 2;</code>
     */
    public Builder addTokenAddresses(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTokenAddressesIsMutable();
      tokenAddresses_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string token_addresses = 2;</code>
     */
    public Builder addAllTokenAddresses(
        java.lang.Iterable<java.lang.String> values) {
      ensureTokenAddressesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tokenAddresses_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string token_addresses = 2;</code>
     */
    public Builder clearTokenAddresses() {
      tokenAddresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string token_addresses = 2;</code>
     */
    public Builder addTokenAddressesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTokenAddressesIsMutable();
      tokenAddresses_.add(value);
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


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.dex.GetAvailableBalanceReq)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.dex.GetAvailableBalanceReq)
  private static final io.lightcone.data.dex.GetAvailableBalanceReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.dex.GetAvailableBalanceReq();
  }

  public static io.lightcone.data.dex.GetAvailableBalanceReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAvailableBalanceReq>
      PARSER = new com.google.protobuf.AbstractParser<GetAvailableBalanceReq>() {
    public GetAvailableBalanceReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetAvailableBalanceReq(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<GetAvailableBalanceReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAvailableBalanceReq> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.dex.GetAvailableBalanceReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

