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
import com.google.protobuf.Internal.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class BoolArgumentProto extends GeneratedMessageV3 implements BoolArgumentProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int LITERALS_FIELD_NUMBER = 1;
   private IntList literals_;
   private int literalsMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final BoolArgumentProto DEFAULT_INSTANCE = new BoolArgumentProto();
   private static final Parser PARSER = new AbstractParser() {
      public BoolArgumentProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new BoolArgumentProto(var1, var2);
      }
   };

   private BoolArgumentProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.literalsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private BoolArgumentProto() {
      this.literalsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.literals_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new BoolArgumentProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private BoolArgumentProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                  case 8:
                     if (!(var3 & true)) {
                        this.literals_ = newIntList();
                        var3 |= true;
                     }

                     this.literals_.addInt(var1.readInt32());
                     break;
                  case 10:
                     int var7 = var1.readRawVarint32();
                     int var8 = var1.pushLimit(var7);
                     if (!(var3 & true) && var1.getBytesUntilLimit() > 0) {
                        this.literals_ = newIntList();
                        var3 |= true;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.literals_.addInt(var1.readInt32());
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
               this.literals_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_BoolArgumentProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_BoolArgumentProto_fieldAccessorTable.ensureFieldAccessorsInitialized(BoolArgumentProto.class, BoolArgumentProto.Builder.class);
   }

   public List getLiteralsList() {
      return this.literals_;
   }

   public int getLiteralsCount() {
      return this.literals_.size();
   }

   public int getLiterals(int var1) {
      return this.literals_.getInt(var1);
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
      if (this.getLiteralsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.literalsMemoizedSerializedSize);
      }

      for(int var2 = 0; var2 < this.literals_.size(); ++var2) {
         var1.writeInt32NoTag(this.literals_.getInt(var2));
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         byte var4 = 0;
         int var2 = 0;

         for(int var3 = 0; var3 < this.literals_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.literals_.getInt(var3));
         }

         var1 = var4 + var2;
         if (!this.getLiteralsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.literalsMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof BoolArgumentProto)) {
         return super.equals(var1);
      } else {
         BoolArgumentProto var2 = (BoolArgumentProto)var1;
         if (!this.getLiteralsList().equals(var2.getLiteralsList())) {
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
         if (this.getLiteralsCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getLiteralsList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static BoolArgumentProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (BoolArgumentProto)PARSER.parseFrom(var0);
   }

   public static BoolArgumentProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (BoolArgumentProto)PARSER.parseFrom(var0, var1);
   }

   public static BoolArgumentProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (BoolArgumentProto)PARSER.parseFrom(var0);
   }

   public static BoolArgumentProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (BoolArgumentProto)PARSER.parseFrom(var0, var1);
   }

   public static BoolArgumentProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (BoolArgumentProto)PARSER.parseFrom(var0);
   }

   public static BoolArgumentProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (BoolArgumentProto)PARSER.parseFrom(var0, var1);
   }

   public static BoolArgumentProto parseFrom(InputStream var0) throws IOException {
      return (BoolArgumentProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BoolArgumentProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (BoolArgumentProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BoolArgumentProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (BoolArgumentProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BoolArgumentProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (BoolArgumentProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BoolArgumentProto parseFrom(CodedInputStream var0) throws IOException {
      return (BoolArgumentProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BoolArgumentProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (BoolArgumentProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BoolArgumentProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BoolArgumentProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BoolArgumentProto.Builder newBuilder(BoolArgumentProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BoolArgumentProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BoolArgumentProto.Builder() : (new BoolArgumentProto.Builder()).mergeFrom(this);
   }

   protected BoolArgumentProto.Builder newBuilderForType(BuilderParent var1) {
      BoolArgumentProto.Builder var2 = new BoolArgumentProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static BoolArgumentProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public BoolArgumentProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   BoolArgumentProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   BoolArgumentProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements BoolArgumentProtoOrBuilder {
      private int bitField0_;
      private IntList literals_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_BoolArgumentProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_BoolArgumentProto_fieldAccessorTable.ensureFieldAccessorsInitialized(BoolArgumentProto.class, BoolArgumentProto.Builder.class);
      }

      private Builder() {
         this.literals_ = BoolArgumentProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.literals_ = BoolArgumentProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (BoolArgumentProto.alwaysUseFieldBuilders) {
         }

      }

      public BoolArgumentProto.Builder clear() {
         super.clear();
         this.literals_ = BoolArgumentProto.emptyIntList();
         this.bitField0_ &= -2;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_BoolArgumentProto_descriptor;
      }

      public BoolArgumentProto getDefaultInstanceForType() {
         return BoolArgumentProto.getDefaultInstance();
      }

      public BoolArgumentProto build() {
         BoolArgumentProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BoolArgumentProto buildPartial() {
         BoolArgumentProto var1 = new BoolArgumentProto(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.literals_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.literals_ = this.literals_;
         this.onBuilt();
         return var1;
      }

      public BoolArgumentProto.Builder clone() {
         return (BoolArgumentProto.Builder)super.clone();
      }

      public BoolArgumentProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (BoolArgumentProto.Builder)super.setField(var1, var2);
      }

      public BoolArgumentProto.Builder clearField(FieldDescriptor var1) {
         return (BoolArgumentProto.Builder)super.clearField(var1);
      }

      public BoolArgumentProto.Builder clearOneof(OneofDescriptor var1) {
         return (BoolArgumentProto.Builder)super.clearOneof(var1);
      }

      public BoolArgumentProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (BoolArgumentProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BoolArgumentProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (BoolArgumentProto.Builder)super.addRepeatedField(var1, var2);
      }

      public BoolArgumentProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof BoolArgumentProto) {
            return this.mergeFrom((BoolArgumentProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public BoolArgumentProto.Builder mergeFrom(BoolArgumentProto var1) {
         if (var1 == BoolArgumentProto.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.literals_.isEmpty()) {
               if (this.literals_.isEmpty()) {
                  this.literals_ = var1.literals_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureLiteralsIsMutable();
                  this.literals_.addAll(var1.literals_);
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

      public BoolArgumentProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         BoolArgumentProto var3 = null;

         try {
            var3 = (BoolArgumentProto)BoolArgumentProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (BoolArgumentProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureLiteralsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.literals_ = BoolArgumentProto.mutableCopy(this.literals_);
            this.bitField0_ |= 1;
         }

      }

      public List getLiteralsList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.literals_) : this.literals_);
      }

      public int getLiteralsCount() {
         return this.literals_.size();
      }

      public int getLiterals(int var1) {
         return this.literals_.getInt(var1);
      }

      public BoolArgumentProto.Builder setLiterals(int var1, int var2) {
         this.ensureLiteralsIsMutable();
         this.literals_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public BoolArgumentProto.Builder addLiterals(int var1) {
         this.ensureLiteralsIsMutable();
         this.literals_.addInt(var1);
         this.onChanged();
         return this;
      }

      public BoolArgumentProto.Builder addAllLiterals(Iterable var1) {
         this.ensureLiteralsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.literals_);
         this.onChanged();
         return this;
      }

      public BoolArgumentProto.Builder clearLiterals() {
         this.literals_ = BoolArgumentProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public final BoolArgumentProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BoolArgumentProto.Builder)super.setUnknownFields(var1);
      }

      public final BoolArgumentProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BoolArgumentProto.Builder)super.mergeUnknownFields(var1);
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
