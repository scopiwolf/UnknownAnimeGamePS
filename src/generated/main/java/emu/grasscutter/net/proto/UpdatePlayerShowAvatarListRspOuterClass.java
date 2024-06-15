// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdatePlayerShowAvatarListRsp.proto

package emu.grasscutter.net.proto;

public final class UpdatePlayerShowAvatarListRspOuterClass {
  private UpdatePlayerShowAvatarListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdatePlayerShowAvatarListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdatePlayerShowAvatarListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_show_avatar = 10;</code>
     * @return The isShowAvatar.
     */
    boolean getIsShowAvatar();

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 show_avatar_id_list = 15;</code>
     * @return A list containing the showAvatarIdList.
     */
    java.util.List<java.lang.Integer> getShowAvatarIdListList();
    /**
     * <code>repeated uint32 show_avatar_id_list = 15;</code>
     * @return The count of showAvatarIdList.
     */
    int getShowAvatarIdListCount();
    /**
     * <code>repeated uint32 show_avatar_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The showAvatarIdList at the given index.
     */
    int getShowAvatarIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 21752
   * </pre>
   *
   * Protobuf type {@code UpdatePlayerShowAvatarListRsp}
   */
  public static final class UpdatePlayerShowAvatarListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdatePlayerShowAvatarListRsp)
      UpdatePlayerShowAvatarListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdatePlayerShowAvatarListRsp.newBuilder() to construct.
    private UpdatePlayerShowAvatarListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdatePlayerShowAvatarListRsp() {
      showAvatarIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdatePlayerShowAvatarListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UpdatePlayerShowAvatarListRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 80: {

              isShowAvatar_ = input.readBool();
              break;
            }
            case 88: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                showAvatarIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              showAvatarIdList_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                showAvatarIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                showAvatarIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          showAvatarIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.internal_static_UpdatePlayerShowAvatarListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.internal_static_UpdatePlayerShowAvatarListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.class, emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.Builder.class);
    }

    public static final int IS_SHOW_AVATAR_FIELD_NUMBER = 10;
    private boolean isShowAvatar_;
    /**
     * <code>bool is_show_avatar = 10;</code>
     * @return The isShowAvatar.
     */
    @java.lang.Override
    public boolean getIsShowAvatar() {
      return isShowAvatar_;
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SHOW_AVATAR_ID_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList showAvatarIdList_;
    /**
     * <code>repeated uint32 show_avatar_id_list = 15;</code>
     * @return A list containing the showAvatarIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getShowAvatarIdListList() {
      return showAvatarIdList_;
    }
    /**
     * <code>repeated uint32 show_avatar_id_list = 15;</code>
     * @return The count of showAvatarIdList.
     */
    public int getShowAvatarIdListCount() {
      return showAvatarIdList_.size();
    }
    /**
     * <code>repeated uint32 show_avatar_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The showAvatarIdList at the given index.
     */
    public int getShowAvatarIdList(int index) {
      return showAvatarIdList_.getInt(index);
    }
    private int showAvatarIdListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (isShowAvatar_ != false) {
        output.writeBool(10, isShowAvatar_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      if (getShowAvatarIdListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(showAvatarIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < showAvatarIdList_.size(); i++) {
        output.writeUInt32NoTag(showAvatarIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isShowAvatar_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isShowAvatar_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < showAvatarIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(showAvatarIdList_.getInt(i));
        }
        size += dataSize;
        if (!getShowAvatarIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        showAvatarIdListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp other = (emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp) obj;

      if (getIsShowAvatar()
          != other.getIsShowAvatar()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getShowAvatarIdListList()
          .equals(other.getShowAvatarIdListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_SHOW_AVATAR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsShowAvatar());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getShowAvatarIdListCount() > 0) {
        hash = (37 * hash) + SHOW_AVATAR_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getShowAvatarIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 21752
     * </pre>
     *
     * Protobuf type {@code UpdatePlayerShowAvatarListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdatePlayerShowAvatarListRsp)
        emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.internal_static_UpdatePlayerShowAvatarListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.internal_static_UpdatePlayerShowAvatarListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.class, emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isShowAvatar_ = false;

        retcode_ = 0;

        showAvatarIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.internal_static_UpdatePlayerShowAvatarListRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp build() {
        emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp buildPartial() {
        emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp result = new emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp(this);
        int from_bitField0_ = bitField0_;
        result.isShowAvatar_ = isShowAvatar_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          showAvatarIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.showAvatarIdList_ = showAvatarIdList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp) {
          return mergeFrom((emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp other) {
        if (other == emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp.getDefaultInstance()) return this;
        if (other.getIsShowAvatar() != false) {
          setIsShowAvatar(other.getIsShowAvatar());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.showAvatarIdList_.isEmpty()) {
          if (showAvatarIdList_.isEmpty()) {
            showAvatarIdList_ = other.showAvatarIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShowAvatarIdListIsMutable();
            showAvatarIdList_.addAll(other.showAvatarIdList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isShowAvatar_ ;
      /**
       * <code>bool is_show_avatar = 10;</code>
       * @return The isShowAvatar.
       */
      @java.lang.Override
      public boolean getIsShowAvatar() {
        return isShowAvatar_;
      }
      /**
       * <code>bool is_show_avatar = 10;</code>
       * @param value The isShowAvatar to set.
       * @return This builder for chaining.
       */
      public Builder setIsShowAvatar(boolean value) {
        
        isShowAvatar_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_show_avatar = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsShowAvatar() {
        
        isShowAvatar_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList showAvatarIdList_ = emptyIntList();
      private void ensureShowAvatarIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          showAvatarIdList_ = mutableCopy(showAvatarIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 15;</code>
       * @return A list containing the showAvatarIdList.
       */
      public java.util.List<java.lang.Integer>
          getShowAvatarIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(showAvatarIdList_) : showAvatarIdList_;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 15;</code>
       * @return The count of showAvatarIdList.
       */
      public int getShowAvatarIdListCount() {
        return showAvatarIdList_.size();
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 15;</code>
       * @param index The index of the element to return.
       * @return The showAvatarIdList at the given index.
       */
      public int getShowAvatarIdList(int index) {
        return showAvatarIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The showAvatarIdList to set.
       * @return This builder for chaining.
       */
      public Builder setShowAvatarIdList(
          int index, int value) {
        ensureShowAvatarIdListIsMutable();
        showAvatarIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 15;</code>
       * @param value The showAvatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addShowAvatarIdList(int value) {
        ensureShowAvatarIdListIsMutable();
        showAvatarIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 15;</code>
       * @param values The showAvatarIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllShowAvatarIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureShowAvatarIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, showAvatarIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_avatar_id_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearShowAvatarIdList() {
        showAvatarIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:UpdatePlayerShowAvatarListRsp)
    }

    // @@protoc_insertion_point(class_scope:UpdatePlayerShowAvatarListRsp)
    private static final emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp();
    }

    public static emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdatePlayerShowAvatarListRsp>
        PARSER = new com.google.protobuf.AbstractParser<UpdatePlayerShowAvatarListRsp>() {
      @java.lang.Override
      public UpdatePlayerShowAvatarListRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdatePlayerShowAvatarListRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UpdatePlayerShowAvatarListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdatePlayerShowAvatarListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UpdatePlayerShowAvatarListRspOuterClass.UpdatePlayerShowAvatarListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdatePlayerShowAvatarListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdatePlayerShowAvatarListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#UpdatePlayerShowAvatarListRsp.proto\"e\n" +
      "\035UpdatePlayerShowAvatarListRsp\022\026\n\016is_sho" +
      "w_avatar\030\n \001(\010\022\017\n\007retcode\030\013 \001(\005\022\033\n\023show_" +
      "avatar_id_list\030\017 \003(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UpdatePlayerShowAvatarListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdatePlayerShowAvatarListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdatePlayerShowAvatarListRsp_descriptor,
        new java.lang.String[] { "IsShowAvatar", "Retcode", "ShowAvatarIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
