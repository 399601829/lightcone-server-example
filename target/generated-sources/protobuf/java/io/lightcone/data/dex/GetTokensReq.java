// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DexServiceImpl.proto

package io.lightcone.data.dex;

/**
 * Protobuf type {@code io.lightcone.data.dex.GetTokensReq}
 */
public  final class GetTokensReq extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.lightcone.data.dex.GetTokensReq)
    GetTokensReqOrBuilder {
  // Use GetTokensReq.newBuilder() to construct.
  private GetTokensReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetTokensReq() {
    requireMetadata_ = false;
    requireInfo_ = false;
    requirePrice_ = false;
    quoteCurrencyForPrice_ = "";
    tokens_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetTokensReq(
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

            requireMetadata_ = input.readBool();
            break;
          }
          case 16: {

            requireInfo_ = input.readBool();
            break;
          }
          case 24: {

            requirePrice_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            quoteCurrencyForPrice_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              tokens_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000010;
            }
            tokens_.add(s);
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
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        tokens_ = tokens_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetTokensReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetTokensReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.lightcone.data.dex.GetTokensReq.class, io.lightcone.data.dex.GetTokensReq.Builder.class);
  }

  private int bitField0_;
  public static final int REQUIRE_METADATA_FIELD_NUMBER = 1;
  private boolean requireMetadata_;
  /**
   * <code>optional bool require_metadata = 1;</code>
   */
  public boolean getRequireMetadata() {
    return requireMetadata_;
  }

  public static final int REQUIRE_INFO_FIELD_NUMBER = 2;
  private boolean requireInfo_;
  /**
   * <code>optional bool require_info = 2;</code>
   */
  public boolean getRequireInfo() {
    return requireInfo_;
  }

  public static final int REQUIRE_PRICE_FIELD_NUMBER = 3;
  private boolean requirePrice_;
  /**
   * <code>optional bool require_price = 3;</code>
   */
  public boolean getRequirePrice() {
    return requirePrice_;
  }

  public static final int QUOTE_CURRENCY_FOR_PRICE_FIELD_NUMBER = 4;
  private volatile java.lang.Object quoteCurrencyForPrice_;
  /**
   * <code>optional string quote_currency_for_price = 4;</code>
   *
   * <pre>
   * USD, CNY
   * </pre>
   */
  public java.lang.String getQuoteCurrencyForPrice() {
    java.lang.Object ref = quoteCurrencyForPrice_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      quoteCurrencyForPrice_ = s;
      return s;
    }
  }
  /**
   * <code>optional string quote_currency_for_price = 4;</code>
   *
   * <pre>
   * USD, CNY
   * </pre>
   */
  public com.google.protobuf.ByteString
      getQuoteCurrencyForPriceBytes() {
    java.lang.Object ref = quoteCurrencyForPrice_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      quoteCurrencyForPrice_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKENS_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList tokens_;
  /**
   * <code>repeated string tokens = 5;</code>
   *
   * <pre>
   * addresses
   * </pre>
   */
  public com.google.protobuf.ProtocolStringList
      getTokensList() {
    return tokens_;
  }
  /**
   * <code>repeated string tokens = 5;</code>
   *
   * <pre>
   * addresses
   * </pre>
   */
  public int getTokensCount() {
    return tokens_.size();
  }
  /**
   * <code>repeated string tokens = 5;</code>
   *
   * <pre>
   * addresses
   * </pre>
   */
  public java.lang.String getTokens(int index) {
    return tokens_.get(index);
  }
  /**
   * <code>repeated string tokens = 5;</code>
   *
   * <pre>
   * addresses
   * </pre>
   */
  public com.google.protobuf.ByteString
      getTokensBytes(int index) {
    return tokens_.getByteString(index);
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
    if (requireMetadata_ != false) {
      output.writeBool(1, requireMetadata_);
    }
    if (requireInfo_ != false) {
      output.writeBool(2, requireInfo_);
    }
    if (requirePrice_ != false) {
      output.writeBool(3, requirePrice_);
    }
    if (!getQuoteCurrencyForPriceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, quoteCurrencyForPrice_);
    }
    for (int i = 0; i < tokens_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, tokens_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requireMetadata_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, requireMetadata_);
    }
    if (requireInfo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, requireInfo_);
    }
    if (requirePrice_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, requirePrice_);
    }
    if (!getQuoteCurrencyForPriceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, quoteCurrencyForPrice_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < tokens_.size(); i++) {
        dataSize += computeStringSizeNoTag(tokens_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTokensList().size();
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.lightcone.data.dex.GetTokensReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.GetTokensReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetTokensReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.lightcone.data.dex.GetTokensReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetTokensReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.GetTokensReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetTokensReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.lightcone.data.dex.GetTokensReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.lightcone.data.dex.GetTokensReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.lightcone.data.dex.GetTokensReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.lightcone.data.dex.GetTokensReq prototype) {
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
   * Protobuf type {@code io.lightcone.data.dex.GetTokensReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.lightcone.data.dex.GetTokensReq)
      io.lightcone.data.dex.GetTokensReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetTokensReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetTokensReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.lightcone.data.dex.GetTokensReq.class, io.lightcone.data.dex.GetTokensReq.Builder.class);
    }

    // Construct using io.lightcone.data.dex.GetTokensReq.newBuilder()
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
      requireMetadata_ = false;

      requireInfo_ = false;

      requirePrice_ = false;

      quoteCurrencyForPrice_ = "";

      tokens_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.lightcone.data.dex.ServiceDex.internal_static_io_lightcone_data_dex_GetTokensReq_descriptor;
    }

    public io.lightcone.data.dex.GetTokensReq getDefaultInstanceForType() {
      return io.lightcone.data.dex.GetTokensReq.getDefaultInstance();
    }

    public io.lightcone.data.dex.GetTokensReq build() {
      io.lightcone.data.dex.GetTokensReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.lightcone.data.dex.GetTokensReq buildPartial() {
      io.lightcone.data.dex.GetTokensReq result = new io.lightcone.data.dex.GetTokensReq(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.requireMetadata_ = requireMetadata_;
      result.requireInfo_ = requireInfo_;
      result.requirePrice_ = requirePrice_;
      result.quoteCurrencyForPrice_ = quoteCurrencyForPrice_;
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        tokens_ = tokens_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000010);
      }
      result.tokens_ = tokens_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.lightcone.data.dex.GetTokensReq) {
        return mergeFrom((io.lightcone.data.dex.GetTokensReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.lightcone.data.dex.GetTokensReq other) {
      if (other == io.lightcone.data.dex.GetTokensReq.getDefaultInstance()) return this;
      if (other.getRequireMetadata() != false) {
        setRequireMetadata(other.getRequireMetadata());
      }
      if (other.getRequireInfo() != false) {
        setRequireInfo(other.getRequireInfo());
      }
      if (other.getRequirePrice() != false) {
        setRequirePrice(other.getRequirePrice());
      }
      if (!other.getQuoteCurrencyForPrice().isEmpty()) {
        quoteCurrencyForPrice_ = other.quoteCurrencyForPrice_;
        onChanged();
      }
      if (!other.tokens_.isEmpty()) {
        if (tokens_.isEmpty()) {
          tokens_ = other.tokens_;
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          ensureTokensIsMutable();
          tokens_.addAll(other.tokens_);
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
      io.lightcone.data.dex.GetTokensReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.lightcone.data.dex.GetTokensReq) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean requireMetadata_ ;
    /**
     * <code>optional bool require_metadata = 1;</code>
     */
    public boolean getRequireMetadata() {
      return requireMetadata_;
    }
    /**
     * <code>optional bool require_metadata = 1;</code>
     */
    public Builder setRequireMetadata(boolean value) {

      requireMetadata_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool require_metadata = 1;</code>
     */
    public Builder clearRequireMetadata() {

      requireMetadata_ = false;
      onChanged();
      return this;
    }

    private boolean requireInfo_ ;
    /**
     * <code>optional bool require_info = 2;</code>
     */
    public boolean getRequireInfo() {
      return requireInfo_;
    }
    /**
     * <code>optional bool require_info = 2;</code>
     */
    public Builder setRequireInfo(boolean value) {

      requireInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool require_info = 2;</code>
     */
    public Builder clearRequireInfo() {

      requireInfo_ = false;
      onChanged();
      return this;
    }

    private boolean requirePrice_ ;
    /**
     * <code>optional bool require_price = 3;</code>
     */
    public boolean getRequirePrice() {
      return requirePrice_;
    }
    /**
     * <code>optional bool require_price = 3;</code>
     */
    public Builder setRequirePrice(boolean value) {

      requirePrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool require_price = 3;</code>
     */
    public Builder clearRequirePrice() {

      requirePrice_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object quoteCurrencyForPrice_ = "";
    /**
     * <code>optional string quote_currency_for_price = 4;</code>
     *
     * <pre>
     * USD, CNY
     * </pre>
     */
    public java.lang.String getQuoteCurrencyForPrice() {
      java.lang.Object ref = quoteCurrencyForPrice_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        quoteCurrencyForPrice_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string quote_currency_for_price = 4;</code>
     *
     * <pre>
     * USD, CNY
     * </pre>
     */
    public com.google.protobuf.ByteString
        getQuoteCurrencyForPriceBytes() {
      java.lang.Object ref = quoteCurrencyForPrice_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        quoteCurrencyForPrice_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string quote_currency_for_price = 4;</code>
     *
     * <pre>
     * USD, CNY
     * </pre>
     */
    public Builder setQuoteCurrencyForPrice(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      quoteCurrencyForPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string quote_currency_for_price = 4;</code>
     *
     * <pre>
     * USD, CNY
     * </pre>
     */
    public Builder clearQuoteCurrencyForPrice() {

      quoteCurrencyForPrice_ = getDefaultInstance().getQuoteCurrencyForPrice();
      onChanged();
      return this;
    }
    /**
     * <code>optional string quote_currency_for_price = 4;</code>
     *
     * <pre>
     * USD, CNY
     * </pre>
     */
    public Builder setQuoteCurrencyForPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      quoteCurrencyForPrice_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList tokens_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTokensIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        tokens_ = new com.google.protobuf.LazyStringArrayList(tokens_);
        bitField0_ |= 0x00000010;
       }
    }
    /**
     * <code>repeated string tokens = 5;</code>
     *
     * <pre>
     * addresses
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getTokensList() {
      return tokens_.getUnmodifiableView();
    }
    /**
     * <code>repeated string tokens = 5;</code>
     *
     * <pre>
     * addresses
     * </pre>
     */
    public int getTokensCount() {
      return tokens_.size();
    }
    /**
     * <code>repeated string tokens = 5;</code>
     *
     * <pre>
     * addresses
     * </pre>
     */
    public java.lang.String getTokens(int index) {
      return tokens_.get(index);
    }
    /**
     * <code>repeated string tokens = 5;</code>
     *
     * <pre>
     * addresses
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTokensBytes(int index) {
      return tokens_.getByteString(index);
    }
    /**
     * <code>repeated string tokens = 5;</code>
     *
     * <pre>
     * addresses
     * </pre>
     */
    public Builder setTokens(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTokensIsMutable();
      tokens_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tokens = 5;</code>
     *
     * <pre>
     * addresses
     * </pre>
     */
    public Builder addTokens(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTokensIsMutable();
      tokens_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tokens = 5;</code>
     *
     * <pre>
     * addresses
     * </pre>
     */
    public Builder addAllTokens(
        java.lang.Iterable<java.lang.String> values) {
      ensureTokensIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tokens_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tokens = 5;</code>
     *
     * <pre>
     * addresses
     * </pre>
     */
    public Builder clearTokens() {
      tokens_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string tokens = 5;</code>
     *
     * <pre>
     * addresses
     * </pre>
     */
    public Builder addTokensBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTokensIsMutable();
      tokens_.add(value);
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


    // @@protoc_insertion_point(builder_scope:io.lightcone.data.dex.GetTokensReq)
  }

  // @@protoc_insertion_point(class_scope:io.lightcone.data.dex.GetTokensReq)
  private static final io.lightcone.data.dex.GetTokensReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.lightcone.data.dex.GetTokensReq();
  }

  public static io.lightcone.data.dex.GetTokensReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTokensReq>
      PARSER = new com.google.protobuf.AbstractParser<GetTokensReq>() {
    public GetTokensReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetTokensReq(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<GetTokensReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTokensReq> getParserForType() {
    return PARSER;
  }

  public io.lightcone.data.dex.GetTokensReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
