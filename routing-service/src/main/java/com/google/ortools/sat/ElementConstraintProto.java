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

public final class ElementConstraintProto extends GeneratedMessageV3 implements ElementConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int INDEX_FIELD_NUMBER = 1;
   private int index_;
   public static final int TARGET_FIELD_NUMBER = 2;
   private int target_;
   public static final int VARS_FIELD_NUMBER = 3;
   private IntList vars_;
   private int varsMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final ElementConstraintProto DEFAULT_INSTANCE = new ElementConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public ElementConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new ElementConstraintProto(var1, var2);
      }
   };

   private ElementConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.varsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private ElementConstraintProto() {
      this.varsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.vars_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new ElementConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private ElementConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                     this.index_ = var1.readInt32();
                     break;
                  case 16:
                     this.target_ = var1.readInt32();
                     break;
                  case 24:
                     if (!(var3 & true)) {
                        this.vars_ = newIntList();
                        var3 |= true;
                     }

                     this.vars_.addInt(var1.readInt32());
                     break;
                  case 26:
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
      return CpModelProtobuf.internal_static_operations_research_sat_ElementConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_ElementConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(ElementConstraintProto.class, ElementConstraintProto.Builder.class);
   }

   public int getIndex() {
      return this.index_;
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
      if (this.index_ != 0) {
         var1.writeInt32(1, this.index_);
      }

      if (this.target_ != 0) {
         var1.writeInt32(2, this.target_);
      }

      if (this.getVarsList().size() > 0) {
         var1.writeUInt32NoTag(26);
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
         if (this.index_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(1, this.index_);
         }

         if (this.target_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(2, this.target_);
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
      } else if (!(var1 instanceof ElementConstraintProto)) {
         return super.equals(var1);
      } else {
         ElementConstraintProto var2 = (ElementConstraintProto)var1;
         if (this.getIndex() != var2.getIndex()) {
            return false;
         } else if (this.getTarget() != var2.getTarget()) {
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
         var2 = 53 * var2 + this.getIndex();
         var2 = 37 * var2 + 2;
         var2 = 53 * var2 + this.getTarget();
         if (this.getVarsCount() > 0) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getVarsList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static ElementConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (ElementConstraintProto)PARSER.parseFrom(var0);
   }

   public static ElementConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ElementConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static ElementConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (ElementConstraintProto)PARSER.parseFrom(var0);
   }

   public static ElementConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ElementConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static ElementConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (ElementConstraintProto)PARSER.parseFrom(var0);
   }

   public static ElementConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ElementConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static ElementConstraintProto parseFrom(InputStream var0) throws IOException {
      return (ElementConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ElementConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ElementConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ElementConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (ElementConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ElementConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ElementConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ElementConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (ElementConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ElementConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ElementConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ElementConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ElementConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ElementConstraintProto.Builder newBuilder(ElementConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ElementConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ElementConstraintProto.Builder() : (new ElementConstraintProto.Builder()).mergeFrom(this);
   }

   protected ElementConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      ElementConstraintProto.Builder var2 = new ElementConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static ElementConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public ElementConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   ElementConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   ElementConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements ElementConstraintProtoOrBuilder {
      private int bitField0_;
      private int index_;
      private int target_;
      private IntList vars_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_ElementConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_ElementConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(ElementConstraintProto.class, ElementConstraintProto.Builder.class);
      }

      private Builder() {
         this.vars_ = ElementConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.vars_ = ElementConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ElementConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public ElementConstraintProto.Builder clear() {
         super.clear();
         this.index_ = 0;
         this.target_ = 0;
         this.vars_ = ElementConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_ElementConstraintProto_descriptor;
      }

      public ElementConstraintProto getDefaultInstanceForType() {
         return ElementConstraintProto.getDefaultInstance();
      }

      public ElementConstraintProto build() {
         ElementConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ElementConstraintProto buildPartial() {
         ElementConstraintProto var1 = new ElementConstraintProto(this);
         int var2 = this.bitField0_;
         var1.index_ = this.index_;
         var1.target_ = this.target_;
         if ((this.bitField0_ & 1) != 0) {
            this.vars_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.vars_ = this.vars_;
         this.onBuilt();
         return var1;
      }

      public ElementConstraintProto.Builder clone() {
         return (ElementConstraintProto.Builder)super.clone();
      }

      public ElementConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (ElementConstraintProto.Builder)super.setField(var1, var2);
      }

      public ElementConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (ElementConstraintProto.Builder)super.clearField(var1);
      }

      public ElementConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (ElementConstraintProto.Builder)super.clearOneof(var1);
      }

      public ElementConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (ElementConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ElementConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (ElementConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public ElementConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof ElementConstraintProto) {
            return this.mergeFrom((ElementConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public ElementConstraintProto.Builder mergeFrom(ElementConstraintProto var1) {
         if (var1 == ElementConstraintProto.getDefaultInstance()) {
            return this;
         } else {
            if (var1.getIndex() != 0) {
               this.setIndex(var1.getIndex());
            }

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

      public ElementConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         ElementConstraintProto var3 = null;

         try {
            var3 = (ElementConstraintProto)ElementConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (ElementConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public int getIndex() {
         return this.index_;
      }

      public ElementConstraintProto.Builder setIndex(int var1) {
         this.index_ = var1;
         this.onChanged();
         return this;
      }

      public ElementConstraintProto.Builder clearIndex() {
         this.index_ = 0;
         this.onChanged();
         return this;
      }

      public int getTarget() {
         return this.target_;
      }

      public ElementConstraintProto.Builder setTarget(int var1) {
         this.target_ = var1;
         this.onChanged();
         return this;
      }

      public ElementConstraintProto.Builder clearTarget() {
         this.target_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureVarsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.vars_ = ElementConstraintProto.mutableCopy(this.vars_);
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

      public ElementConstraintProto.Builder setVars(int var1, int var2) {
         this.ensureVarsIsMutable();
         this.vars_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public ElementConstraintProto.Builder addVars(int var1) {
         this.ensureVarsIsMutable();
         this.vars_.addInt(var1);
         this.onChanged();
         return this;
      }

      public ElementConstraintProto.Builder addAllVars(Iterable var1) {
         this.ensureVarsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.vars_);
         this.onChanged();
         return this;
      }

      public ElementConstraintProto.Builder clearVars() {
         this.vars_ = ElementConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public final ElementConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ElementConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final ElementConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ElementConstraintProto.Builder)super.mergeUnknownFields(var1);
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
