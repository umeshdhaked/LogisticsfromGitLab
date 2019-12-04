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

public final class IntegerArgumentProto extends GeneratedMessageV3 implements IntegerArgumentProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TARGET_FIELD_NUMBER = 1;
   private int target_;
   public static final int VARS_FIELD_NUMBER = 2;
   private IntList vars_;
   private int varsMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final IntegerArgumentProto DEFAULT_INSTANCE = new IntegerArgumentProto();
   private static final Parser PARSER = new AbstractParser() {
      public IntegerArgumentProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new IntegerArgumentProto(var1, var2);
      }
   };

   private IntegerArgumentProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.varsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private IntegerArgumentProto() {
      this.varsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.vars_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new IntegerArgumentProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private IntegerArgumentProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                     this.target_ = var1.readInt32();
                     break;
                  case 16:
                     if (!(var3 & true)) {
                        this.vars_ = newIntList();
                        var3 |= true;
                     }

                     this.vars_.addInt(var1.readInt32());
                     break;
                  case 18:
                     int var7 = var1.readRawVarint32();
                     int var8 = var1.pushLimit(var7);
                     if (!(var3 & true) && var1.getBytesUntilLimit() > 0) {
                        this.vars_ = newIntList();
                        var3 |= true;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.vars_.addInt(var1.readInt32());
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
               this.vars_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_IntegerArgumentProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_IntegerArgumentProto_fieldAccessorTable.ensureFieldAccessorsInitialized(IntegerArgumentProto.class, IntegerArgumentProto.Builder.class);
   }

   public int getTarget() {
      return this.target_;
   }

   public List getVarsList() {
      return this.vars_;
   }

   public int getVarsCount() {
      return this.vars_.size();
   }

   public int getVars(int var1) {
      return this.vars_.getInt(var1);
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
      if (this.target_ != 0) {
         var1.writeInt32(1, this.target_);
      }

      if (this.getVarsList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.varsMemoizedSerializedSize);
      }

      for(int var2 = 0; var2 < this.vars_.size(); ++var2) {
         var1.writeInt32NoTag(this.vars_.getInt(var2));
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (this.target_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(1, this.target_);
         }

         int var2 = 0;

         for(int var3 = 0; var3 < this.vars_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.vars_.getInt(var3));
         }

         var1 += var2;
         if (!this.getVarsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.varsMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof IntegerArgumentProto)) {
         return super.equals(var1);
      } else {
         IntegerArgumentProto var2 = (IntegerArgumentProto)var1;
         if (this.getTarget() != var2.getTarget()) {
            return false;
         } else if (!this.getVarsList().equals(var2.getVarsList())) {
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
         var2 = 53 * var2 + this.getTarget();
         if (this.getVarsCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getVarsList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static IntegerArgumentProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (IntegerArgumentProto)PARSER.parseFrom(var0);
   }

   public static IntegerArgumentProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (IntegerArgumentProto)PARSER.parseFrom(var0, var1);
   }

   public static IntegerArgumentProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (IntegerArgumentProto)PARSER.parseFrom(var0);
   }

   public static IntegerArgumentProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (IntegerArgumentProto)PARSER.parseFrom(var0, var1);
   }

   public static IntegerArgumentProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (IntegerArgumentProto)PARSER.parseFrom(var0);
   }

   public static IntegerArgumentProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (IntegerArgumentProto)PARSER.parseFrom(var0, var1);
   }

   public static IntegerArgumentProto parseFrom(InputStream var0) throws IOException {
      return (IntegerArgumentProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static IntegerArgumentProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (IntegerArgumentProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static IntegerArgumentProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (IntegerArgumentProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static IntegerArgumentProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (IntegerArgumentProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static IntegerArgumentProto parseFrom(CodedInputStream var0) throws IOException {
      return (IntegerArgumentProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static IntegerArgumentProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (IntegerArgumentProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public IntegerArgumentProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static IntegerArgumentProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static IntegerArgumentProto.Builder newBuilder(IntegerArgumentProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public IntegerArgumentProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new IntegerArgumentProto.Builder() : (new IntegerArgumentProto.Builder()).mergeFrom(this);
   }

   protected IntegerArgumentProto.Builder newBuilderForType(BuilderParent var1) {
      IntegerArgumentProto.Builder var2 = new IntegerArgumentProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static IntegerArgumentProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public IntegerArgumentProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   IntegerArgumentProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   IntegerArgumentProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements IntegerArgumentProtoOrBuilder {
      private int bitField0_;
      private int target_;
      private IntList vars_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_IntegerArgumentProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_IntegerArgumentProto_fieldAccessorTable.ensureFieldAccessorsInitialized(IntegerArgumentProto.class, IntegerArgumentProto.Builder.class);
      }

      private Builder() {
         this.vars_ = IntegerArgumentProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.vars_ = IntegerArgumentProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (IntegerArgumentProto.alwaysUseFieldBuilders) {
         }

      }

      public IntegerArgumentProto.Builder clear() {
         super.clear();
         this.target_ = 0;
         this.vars_ = IntegerArgumentProto.emptyIntList();
         this.bitField0_ &= -2;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_IntegerArgumentProto_descriptor;
      }

      public IntegerArgumentProto getDefaultInstanceForType() {
         return IntegerArgumentProto.getDefaultInstance();
      }

      public IntegerArgumentProto build() {
         IntegerArgumentProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public IntegerArgumentProto buildPartial() {
         IntegerArgumentProto var1 = new IntegerArgumentProto(this);
         int var2 = this.bitField0_;
         var1.target_ = this.target_;
         if ((this.bitField0_ & 1) != 0) {
            this.vars_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.vars_ = this.vars_;
         this.onBuilt();
         return var1;
      }

      public IntegerArgumentProto.Builder clone() {
         return (IntegerArgumentProto.Builder)super.clone();
      }

      public IntegerArgumentProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (IntegerArgumentProto.Builder)super.setField(var1, var2);
      }

      public IntegerArgumentProto.Builder clearField(FieldDescriptor var1) {
         return (IntegerArgumentProto.Builder)super.clearField(var1);
      }

      public IntegerArgumentProto.Builder clearOneof(OneofDescriptor var1) {
         return (IntegerArgumentProto.Builder)super.clearOneof(var1);
      }

      public IntegerArgumentProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (IntegerArgumentProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public IntegerArgumentProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (IntegerArgumentProto.Builder)super.addRepeatedField(var1, var2);
      }

      public IntegerArgumentProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof IntegerArgumentProto) {
            return this.mergeFrom((IntegerArgumentProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public IntegerArgumentProto.Builder mergeFrom(IntegerArgumentProto var1) {
         if (var1 == IntegerArgumentProto.getDefaultInstance()) {
            return this;
         } else {
            if (var1.getTarget() != 0) {
               this.setTarget(var1.getTarget());
            }

            if (!var1.vars_.isEmpty()) {
               if (this.vars_.isEmpty()) {
                  this.vars_ = var1.vars_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureVarsIsMutable();
                  this.vars_.addAll(var1.vars_);
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

      public IntegerArgumentProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         IntegerArgumentProto var3 = null;

         try {
            var3 = (IntegerArgumentProto)IntegerArgumentProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (IntegerArgumentProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public int getTarget() {
         return this.target_;
      }

      public IntegerArgumentProto.Builder setTarget(int var1) {
         this.target_ = var1;
         this.onChanged();
         return this;
      }

      public IntegerArgumentProto.Builder clearTarget() {
         this.target_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureVarsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.vars_ = IntegerArgumentProto.mutableCopy(this.vars_);
            this.bitField0_ |= 1;
         }

      }

      public List getVarsList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.vars_) : this.vars_);
      }

      public int getVarsCount() {
         return this.vars_.size();
      }

      public int getVars(int var1) {
         return this.vars_.getInt(var1);
      }

      public IntegerArgumentProto.Builder setVars(int var1, int var2) {
         this.ensureVarsIsMutable();
         this.vars_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public IntegerArgumentProto.Builder addVars(int var1) {
         this.ensureVarsIsMutable();
         this.vars_.addInt(var1);
         this.onChanged();
         return this;
      }

      public IntegerArgumentProto.Builder addAllVars(Iterable var1) {
         this.ensureVarsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.vars_);
         this.onChanged();
         return this;
      }

      public IntegerArgumentProto.Builder clearVars() {
         this.vars_ = IntegerArgumentProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public final IntegerArgumentProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (IntegerArgumentProto.Builder)super.setUnknownFields(var1);
      }

      public final IntegerArgumentProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (IntegerArgumentProto.Builder)super.mergeUnknownFields(var1);
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
