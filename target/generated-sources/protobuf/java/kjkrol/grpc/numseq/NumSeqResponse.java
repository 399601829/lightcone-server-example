// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: numseq.proto

package kjkrol.grpc.numseq;

/**
 * Protobuf type {@code kjkrol.numseq.NumSeqResponse}
 */
public  final class NumSeqResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:kjkrol.numseq.NumSeqResponse)
    NumSeqResponseOrBuilder {
  // Use NumSeqResponse.newBuilder() to construct.
  private NumSeqResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private NumSeqResponse() {
    total_ = 0;
    number_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private NumSeqResponse(
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

            total_ = input.readInt32();
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              number_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            number_.add(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
              number_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              number_.add(input.readInt32());
            }
            input.popLimit(limit);
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
        number_ = java.util.Collections.unmodifiableList(number_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return kjkrol.grpc.numseq.NumSeqProto.internal_static_kjkrol_numseq_NumSeqResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kjkrol.grpc.numseq.NumSeqProto.internal_static_kjkrol_numseq_NumSeqResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kjkrol.grpc.numseq.NumSeqResponse.class, kjkrol.grpc.numseq.NumSeqResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TOTAL_FIELD_NUMBER = 1;
  private int total_;
  /**
   * <code>optional int32 total = 1;</code>
   */
  public int getTotal() {
    return total_;
  }

  public static final int NUMBER_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> number_;
  /**
   * <code>repeated int32 number = 2;</code>
   */
  public java.util.List<java.lang.Integer>
      getNumberList() {
    return number_;
  }
  /**
   * <code>repeated int32 number = 2;</code>
   */
  public int getNumberCount() {
    return number_.size();
  }
  /**
   * <code>repeated int32 number = 2;</code>
   */
  public int getNumber(int index) {
    return number_.get(index);
  }
  private int numberMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (total_ != 0) {
      output.writeInt32(1, total_);
    }
    if (getNumberList().size() > 0) {
      output.writeRawVarint32(18);
      output.writeRawVarint32(numberMemoizedSerializedSize);
    }
    for (int i = 0; i < number_.size(); i++) {
      output.writeInt32NoTag(number_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (total_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, total_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < number_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(number_.get(i));
      }
      size += dataSize;
      if (!getNumberList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      numberMemoizedSerializedSize = dataSize;
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static kjkrol.grpc.numseq.NumSeqResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kjkrol.grpc.numseq.NumSeqResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kjkrol.grpc.numseq.NumSeqResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kjkrol.grpc.numseq.NumSeqResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kjkrol.grpc.numseq.NumSeqResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static kjkrol.grpc.numseq.NumSeqResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static kjkrol.grpc.numseq.NumSeqResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static kjkrol.grpc.numseq.NumSeqResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static kjkrol.grpc.numseq.NumSeqResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static kjkrol.grpc.numseq.NumSeqResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(kjkrol.grpc.numseq.NumSeqResponse prototype) {
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
   * Protobuf type {@code kjkrol.numseq.NumSeqResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kjkrol.numseq.NumSeqResponse)
      kjkrol.grpc.numseq.NumSeqResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kjkrol.grpc.numseq.NumSeqProto.internal_static_kjkrol_numseq_NumSeqResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kjkrol.grpc.numseq.NumSeqProto.internal_static_kjkrol_numseq_NumSeqResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kjkrol.grpc.numseq.NumSeqResponse.class, kjkrol.grpc.numseq.NumSeqResponse.Builder.class);
    }

    // Construct using kjkrol.grpc.numseq.NumSeqResponse.newBuilder()
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
      total_ = 0;

      number_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kjkrol.grpc.numseq.NumSeqProto.internal_static_kjkrol_numseq_NumSeqResponse_descriptor;
    }

    public kjkrol.grpc.numseq.NumSeqResponse getDefaultInstanceForType() {
      return kjkrol.grpc.numseq.NumSeqResponse.getDefaultInstance();
    }

    public kjkrol.grpc.numseq.NumSeqResponse build() {
      kjkrol.grpc.numseq.NumSeqResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public kjkrol.grpc.numseq.NumSeqResponse buildPartial() {
      kjkrol.grpc.numseq.NumSeqResponse result = new kjkrol.grpc.numseq.NumSeqResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.total_ = total_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        number_ = java.util.Collections.unmodifiableList(number_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.number_ = number_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof kjkrol.grpc.numseq.NumSeqResponse) {
        return mergeFrom((kjkrol.grpc.numseq.NumSeqResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kjkrol.grpc.numseq.NumSeqResponse other) {
      if (other == kjkrol.grpc.numseq.NumSeqResponse.getDefaultInstance()) return this;
      if (other.getTotal() != 0) {
        setTotal(other.getTotal());
      }
      if (!other.number_.isEmpty()) {
        if (number_.isEmpty()) {
          number_ = other.number_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureNumberIsMutable();
          number_.addAll(other.number_);
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
      kjkrol.grpc.numseq.NumSeqResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kjkrol.grpc.numseq.NumSeqResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int total_ ;
    /**
     * <code>optional int32 total = 1;</code>
     */
    public int getTotal() {
      return total_;
    }
    /**
     * <code>optional int32 total = 1;</code>
     */
    public Builder setTotal(int value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 total = 1;</code>
     */
    public Builder clearTotal() {
      
      total_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> number_ = java.util.Collections.emptyList();
    private void ensureNumberIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        number_ = new java.util.ArrayList<java.lang.Integer>(number_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 number = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getNumberList() {
      return java.util.Collections.unmodifiableList(number_);
    }
    /**
     * <code>repeated int32 number = 2;</code>
     */
    public int getNumberCount() {
      return number_.size();
    }
    /**
     * <code>repeated int32 number = 2;</code>
     */
    public int getNumber(int index) {
      return number_.get(index);
    }
    /**
     * <code>repeated int32 number = 2;</code>
     */
    public Builder setNumber(
        int index, int value) {
      ensureNumberIsMutable();
      number_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 number = 2;</code>
     */
    public Builder addNumber(int value) {
      ensureNumberIsMutable();
      number_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 number = 2;</code>
     */
    public Builder addAllNumber(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureNumberIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, number_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 number = 2;</code>
     */
    public Builder clearNumber() {
      number_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:kjkrol.numseq.NumSeqResponse)
  }

  // @@protoc_insertion_point(class_scope:kjkrol.numseq.NumSeqResponse)
  private static final kjkrol.grpc.numseq.NumSeqResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kjkrol.grpc.numseq.NumSeqResponse();
  }

  public static kjkrol.grpc.numseq.NumSeqResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NumSeqResponse>
      PARSER = new com.google.protobuf.AbstractParser<NumSeqResponse>() {
    public NumSeqResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new NumSeqResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<NumSeqResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NumSeqResponse> getParserForType() {
    return PARSER;
  }

  public kjkrol.grpc.numseq.NumSeqResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
