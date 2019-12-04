package com.google.ortools.sat;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.Internal.LongList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class IntegerVariableProto extends GeneratedMessageV3 implements IntegerVariableProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_;
   public static final int DOMAIN_FIELD_NUMBER = 2;
   private LongList domain_;
   private int domainMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final IntegerVariableProto DEFAULT_INSTANCE = new IntegerVariableProto();
   private static final Parser PARSER = new AbstractParser() {
      public IntegerVariableProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new IntegerVariableProto(var1, var2);
      }
   };

   private IntegerVariableProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.domainMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private IntegerVariableProto() {
      this.domainMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.name_ = "";
      this.domain_ = emptyLongList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new IntegerVariableProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private IntegerVariableProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         boolean var3 = false;
         com.google.protobuf.UnknownFieldSet.Builder var4 = UnknownFieldSet.newBuilder();

         try {
            boolean var5 = false;

            while(true) {
               while(!var5) {
                  int var6 = var1.readTag();
                  switch(var6) {
                  case 0:
                     var5 = true;
                     break;
                  case 10:
                     String var16 = var1.readStringRequireUtf8();
                     this.name_ = var16;
                     break;
                  case 16:
                     if (!(var3 & true)) {
                        this.domain_ = newLongList();
                        var3 |= true;
                     }

                     this.domain_.addLong(var1.readInt64());
                     break;
                  case 18:
                     int var7 = var1.readRawVarint32();
                     int var8 = var1.pushLimit(var7);
                     if (!(var3 & true) && var1.getBytesUntilLimit() > 0) {
                        this.domain_ = newLongList();
                        var3 |= true;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.domain_.addLong(var1.readInt64());
                     }

                     var1.popLimit(var8);
                     break;
                  default:
                     if (!this.parseUnknownField(var1, var4, var2, var6)) {
                        var5 = true;
                     }
                  }
               }

               return;
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            if (var3 & true) {
               this.domain_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_IntegerVariableProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_IntegerVariableProto_fieldAccessorTable.ensureFieldAccessorsInitialized(IntegerVariableProto.class, IntegerVariableProto.Builder.class);
   }

   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.name_ = var3;
         return var3;
      }
   }

   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   public List getDomainList() {
      return this.domain_;
   }

   public int getDomainCount() {
      return this.domain_.size();
   }

   public long getDomain(int var1) {
      return this.domain_.getLong(var1);
   }

   public final boolean isInitialized() {
      byte var1 = this.memoizedIsInitialized;
      if (var1 == 1) {
         return true;
      } else if (var1 == 0) {
         return false;
      } else {
         this.memoizedIsInitialized = 1;
         return true;
      }
   }

   public void writeTo(CodedOutputStream var1) throws IOException {
      this.getSerializedSize();
      if (!this.getNameBytes().isEmpty()) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      if (this.getDomainList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.domainMemoizedSerializedSize);
      }

      for(int var2 = 0; var2 < this.domain_.size(); ++var2) {
         var1.writeInt64NoTag(this.domain_.getLong(var2));
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (!this.getNameBytes().isEmpty()) {
            var1 += GeneratedMessageV3.computeStringSize(1, this.name_);
         }

         int var2 = 0;

         for(int var3 = 0; var3 < this.domain_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.domain_.getLong(var3));
         }

         var1 += var2;
         if (!this.getDomainList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.domainMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof IntegerVariableProto)) {
         return super.equals(var1);
      } else {
         IntegerVariableProto var2 = (IntegerVariableProto)var1;
         if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getDomainList().equals(var2.getDomainList())) {
            return false;
         } else {
            return this.unknownFields.equals(var2.unknownFields);
         }
      }
   }

   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      } else {
         byte var1 = 41;
         int var2 = 19 * var1 + getDescriptor().hashCode();
         var2 = 37 * var2 + 1;
         var2 = 53 * var2 + this.getName().hashCode();
         if (this.getDomainCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getDomainList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static IntegerVariableProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (IntegerVariableProto)PARSER.parseFrom(var0);
   }

   public static IntegerVariableProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (IntegerVariableProto)PARSER.parseFrom(var0, var1);
   }

   public static IntegerVariableProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (IntegerVariableProto)PARSER.parseFrom(var0);
   }

   public static IntegerVariableProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (IntegerVariableProto)PARSER.parseFrom(var0, var1);
   }

   public static IntegerVariableProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (IntegerVariableProto)PARSER.parseFrom(var0);
   }

   public static IntegerVariableProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (IntegerVariableProto)PARSER.parseFrom(var0, var1);
   }

   public static IntegerVariableProto parseFrom(InputStream var0) throws IOException {
      return (IntegerVariableProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static IntegerVariableProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (IntegerVariableProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static IntegerVariableProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (IntegerVariableProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static IntegerVariableProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (IntegerVariableProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static IntegerVariableProto parseFrom(CodedInputStream var0) throws IOException {
      return (IntegerVariableProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static IntegerVariableProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (IntegerVariableProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public IntegerVariableProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static IntegerVariableProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static IntegerVariableProto.Builder newBuilder(IntegerVariableProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public IntegerVariableProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new IntegerVariableProto.Builder() : (new IntegerVariableProto.Builder()).mergeFrom(this);
   }

   protected IntegerVariableProto.Builder newBuilderForType(BuilderParent var1) {
      IntegerVariableProto.Builder var2 = new IntegerVariableProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static IntegerVariableProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public IntegerVariableProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   IntegerVariableProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   IntegerVariableProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements IntegerVariableProtoOrBuilder {
      private int bitField0_;
      private Object name_;
      private LongList domain_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_IntegerVariableProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_IntegerVariableProto_fieldAccessorTable.ensureFieldAccessorsInitialized(IntegerVariableProto.class, IntegerVariableProto.Builder.class);
      }

      private Builder() {
         this.name_ = "";
         this.domain_ = IntegerVariableProto.emptyLongList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.name_ = "";
         this.domain_ = IntegerVariableProto.emptyLongList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (IntegerVariableProto.alwaysUseFieldBuilders) {
         }

      }

      public IntegerVariableProto.Builder clear() {
         super.clear();
         this.name_ = "";
         this.domain_ = IntegerVariableProto.emptyLongList();
         this.bitField0_ &= -2;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_IntegerVariableProto_descriptor;
      }

      public IntegerVariableProto getDefaultInstanceForType() {
         return IntegerVariableProto.getDefaultInstance();
      }

      public IntegerVariableProto build() {
         IntegerVariableProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public IntegerVariableProto buildPartial() {
         IntegerVariableProto var1 = new IntegerVariableProto(this);
         int var2 = this.bitField0_;
         var1.name_ = this.name_;
         if ((this.bitField0_ & 1) != 0) {
            this.domain_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.domain_ = this.domain_;
         this.onBuilt();
         return var1;
      }

      public IntegerVariableProto.Builder clone() {
         return (IntegerVariableProto.Builder)super.clone();
      }

      public IntegerVariableProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (IntegerVariableProto.Builder)super.setField(var1, var2);
      }

      public IntegerVariableProto.Builder clearField(FieldDescriptor var1) {
         return (IntegerVariableProto.Builder)super.clearField(var1);
      }

      public IntegerVariableProto.Builder clearOneof(OneofDescriptor var1) {
         return (IntegerVariableProto.Builder)super.clearOneof(var1);
      }

      public IntegerVariableProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (IntegerVariableProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public IntegerVariableProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (IntegerVariableProto.Builder)super.addRepeatedField(var1, var2);
      }

      public IntegerVariableProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof IntegerVariableProto) {
            return this.mergeFrom((IntegerVariableProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public IntegerVariableProto.Builder mergeFrom(IntegerVariableProto var1) {
         if (var1 == IntegerVariableProto.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.getName().isEmpty()) {
               this.name_ = var1.name_;
               this.onChanged();
            }

            if (!var1.domain_.isEmpty()) {
               if (this.domain_.isEmpty()) {
                  this.domain_ = var1.domain_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureDomainIsMutable();
                  this.domain_.addAll(var1.domain_);
               }

               this.onChanged();
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public IntegerVariableProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         IntegerVariableProto var3 = null;

         try {
            var3 = (IntegerVariableProto)IntegerVariableProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (IntegerVariableProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public IntegerVariableProto.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      public IntegerVariableProto.Builder clearName() {
         this.name_ = IntegerVariableProto.getDefaultInstance().getName();
         this.onChanged();
         return this;
      }

      public IntegerVariableProto.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            IntegerVariableProto.checkByteStringIsUtf8(var1);
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      private void ensureDomainIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.domain_ = IntegerVariableProto.mutableCopy(this.domain_);
            this.bitField0_ |= 1;
         }

      }

      public List getDomainList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.domain_) : this.domain_);
      }

      public int getDomainCount() {
         return this.domain_.size();
      }

      public long getDomain(int var1) {
         return this.domain_.getLong(var1);
      }

      public IntegerVariableProto.Builder setDomain(int var1, long var2) {
         this.ensureDomainIsMutable();
         this.domain_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public IntegerVariableProto.Builder addDomain(long var1) {
         this.ensureDomainIsMutable();
         this.domain_.addLong(var1);
         this.onChanged();
         return this;
      }

      public IntegerVariableProto.Builder addAllDomain(Iterable var1) {
         this.ensureDomainIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.domain_);
         this.onChanged();
         return this;
      }

      public IntegerVariableProto.Builder clearDomain() {
         this.domain_ = IntegerVariableProto.emptyLongList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public final IntegerVariableProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (IntegerVariableProto.Builder)super.setUnknownFields(var1);
      }

      public final IntegerVariableProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (IntegerVariableProto.Builder)super.mergeUnknownFields(var1);
      }

      // $FF: synthetic method
      Builder(Object var1) {
         this();
      }

      // $FF: synthetic method
      Builder(BuilderParent var1, Object var2) {
         this(var1);
      }
   }
}
