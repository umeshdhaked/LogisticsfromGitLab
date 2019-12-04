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

public final class AllDifferentConstraintProto extends GeneratedMessageV3 implements AllDifferentConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VARS_FIELD_NUMBER = 1;
   private IntList vars_;
   private int varsMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final AllDifferentConstraintProto DEFAULT_INSTANCE = new AllDifferentConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public AllDifferentConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new AllDifferentConstraintProto(var1, var2);
      }
   };

   private AllDifferentConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.varsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private AllDifferentConstraintProto() {
      this.varsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.vars_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new AllDifferentConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private AllDifferentConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                        this.vars_ = newIntList();
                        var3 |= true;
                     }

                     this.vars_.addInt(var1.readInt32());
                     break;
                  case 10:
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
      return CpModelProtobuf.internal_static_operations_research_sat_AllDifferentConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_AllDifferentConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(AllDifferentConstraintProto.class, AllDifferentConstraintProto.Builder.class);
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
      if (this.getVarsList().size() > 0) {
         var1.writeUInt32NoTag(10);
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
         byte var4 = 0;
         int var2 = 0;

         for(int var3 = 0; var3 < this.vars_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.vars_.getInt(var3));
         }

         var1 = var4 + var2;
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
      } else if (!(var1 instanceof AllDifferentConstraintProto)) {
         return super.equals(var1);
      } else {
         AllDifferentConstraintProto var2 = (AllDifferentConstraintProto)var1;
         if (!this.getVarsList().equals(var2.getVarsList())) {
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
         if (this.getVarsCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getVarsList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static AllDifferentConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (AllDifferentConstraintProto)PARSER.parseFrom(var0);
   }

   public static AllDifferentConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (AllDifferentConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static AllDifferentConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (AllDifferentConstraintProto)PARSER.parseFrom(var0);
   }

   public static AllDifferentConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (AllDifferentConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static AllDifferentConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (AllDifferentConstraintProto)PARSER.parseFrom(var0);
   }

   public static AllDifferentConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (AllDifferentConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static AllDifferentConstraintProto parseFrom(InputStream var0) throws IOException {
      return (AllDifferentConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AllDifferentConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (AllDifferentConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AllDifferentConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (AllDifferentConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AllDifferentConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (AllDifferentConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AllDifferentConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (AllDifferentConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AllDifferentConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (AllDifferentConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AllDifferentConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AllDifferentConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AllDifferentConstraintProto.Builder newBuilder(AllDifferentConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AllDifferentConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AllDifferentConstraintProto.Builder() : (new AllDifferentConstraintProto.Builder()).mergeFrom(this);
   }

   protected AllDifferentConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      AllDifferentConstraintProto.Builder var2 = new AllDifferentConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static AllDifferentConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public AllDifferentConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   AllDifferentConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   AllDifferentConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements AllDifferentConstraintProtoOrBuilder {
      private int bitField0_;
      private IntList vars_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_AllDifferentConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_AllDifferentConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(AllDifferentConstraintProto.class, AllDifferentConstraintProto.Builder.class);
      }

      private Builder() {
         this.vars_ = AllDifferentConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.vars_ = AllDifferentConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (AllDifferentConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public AllDifferentConstraintProto.Builder clear() {
         super.clear();
         this.vars_ = AllDifferentConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_AllDifferentConstraintProto_descriptor;
      }

      public AllDifferentConstraintProto getDefaultInstanceForType() {
         return AllDifferentConstraintProto.getDefaultInstance();
      }

      public AllDifferentConstraintProto build() {
         AllDifferentConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AllDifferentConstraintProto buildPartial() {
         AllDifferentConstraintProto var1 = new AllDifferentConstraintProto(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.vars_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.vars_ = this.vars_;
         this.onBuilt();
         return var1;
      }

      public AllDifferentConstraintProto.Builder clone() {
         return (AllDifferentConstraintProto.Builder)super.clone();
      }

      public AllDifferentConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (AllDifferentConstraintProto.Builder)super.setField(var1, var2);
      }

      public AllDifferentConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (AllDifferentConstraintProto.Builder)super.clearField(var1);
      }

      public AllDifferentConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (AllDifferentConstraintProto.Builder)super.clearOneof(var1);
      }

      public AllDifferentConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (AllDifferentConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AllDifferentConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (AllDifferentConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public AllDifferentConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof AllDifferentConstraintProto) {
            return this.mergeFrom((AllDifferentConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public AllDifferentConstraintProto.Builder mergeFrom(AllDifferentConstraintProto var1) {
         if (var1 == AllDifferentConstraintProto.getDefaultInstance()) {
            return this;
         } else {
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

      public AllDifferentConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         AllDifferentConstraintProto var3 = null;

         try {
            var3 = (AllDifferentConstraintProto)AllDifferentConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (AllDifferentConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureVarsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.vars_ = AllDifferentConstraintProto.mutableCopy(this.vars_);
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

      public AllDifferentConstraintProto.Builder setVars(int var1, int var2) {
         this.ensureVarsIsMutable();
         this.vars_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public AllDifferentConstraintProto.Builder addVars(int var1) {
         this.ensureVarsIsMutable();
         this.vars_.addInt(var1);
         this.onChanged();
         return this;
      }

      public AllDifferentConstraintProto.Builder addAllVars(Iterable var1) {
         this.ensureVarsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.vars_);
         this.onChanged();
         return this;
      }

      public AllDifferentConstraintProto.Builder clearVars() {
         this.vars_ = AllDifferentConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public final AllDifferentConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AllDifferentConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final AllDifferentConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AllDifferentConstraintProto.Builder)super.mergeUnknownFields(var1);
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
