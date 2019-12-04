package com.google.ortools.linearsolver;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class MPIndicatorConstraint extends GeneratedMessageV3 implements MPIndicatorConstraintOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int VAR_INDEX_FIELD_NUMBER = 1;
   private int varIndex_;
   public static final int VAR_VALUE_FIELD_NUMBER = 2;
   private int varValue_;
   public static final int CONSTRAINT_FIELD_NUMBER = 3;
   private MPConstraintProto constraint_;
   private byte memoizedIsInitialized;
   private static final MPIndicatorConstraint DEFAULT_INSTANCE = new MPIndicatorConstraint();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPIndicatorConstraint parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPIndicatorConstraint(var1, var2);
      }
   };

   private MPIndicatorConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPIndicatorConstraint() {
      this.memoizedIsInitialized = -1;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPIndicatorConstraint();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPIndicatorConstraint(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         boolean var3 = false;
         com.google.protobuf.UnknownFieldSet.Builder var4 = UnknownFieldSet.newBuilder();

         try {
            boolean var5 = false;

            while(!var5) {
               int var6 = var1.readTag();
               switch(var6) {
               case 0:
                  var5 = true;
                  break;
               case 8:
                  this.bitField0_ |= 1;
                  this.varIndex_ = var1.readInt32();
                  break;
               case 16:
                  this.bitField0_ |= 2;
                  this.varValue_ = var1.readInt32();
                  break;
               case 26:
                  MPConstraintProto.Builder var7 = null;
                  if ((this.bitField0_ & 4) != 0) {
                     var7 = this.constraint_.toBuilder();
                  }

                  this.constraint_ = (MPConstraintProto)var1.readMessage(MPConstraintProto.PARSER, var2);
                  if (var7 != null) {
                     var7.mergeFrom(this.constraint_);
                     this.constraint_ = var7.buildPartial();
                  }

                  this.bitField0_ |= 4;
                  break;
               default:
                  if (!this.parseUnknownField(var1, var4, var2, var6)) {
                     var5 = true;
                  }
               }
            }
         } catch (InvalidProtocolBufferException var12) {
            throw var12.setUnfinishedMessage(this);
         } catch (IOException var13) {
            throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
         } finally {
            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPIndicatorConstraint_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPIndicatorConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPIndicatorConstraint.class, MPIndicatorConstraint.Builder.class);
   }

   public boolean hasVarIndex() {
      return (this.bitField0_ & 1) != 0;
   }

   public int getVarIndex() {
      return this.varIndex_;
   }

   public boolean hasVarValue() {
      return (this.bitField0_ & 2) != 0;
   }

   public int getVarValue() {
      return this.varValue_;
   }

   public boolean hasConstraint() {
      return (this.bitField0_ & 4) != 0;
   }

   public MPConstraintProto getConstraint() {
      return this.constraint_ == null ? MPConstraintProto.getDefaultInstance() : this.constraint_;
   }

   public MPConstraintProtoOrBuilder getConstraintOrBuilder() {
      return this.constraint_ == null ? MPConstraintProto.getDefaultInstance() : this.constraint_;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeInt32(1, this.varIndex_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeInt32(2, this.varValue_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getConstraint());
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if ((this.bitField0_ & 1) != 0) {
            var1 += CodedOutputStream.computeInt32Size(1, this.varIndex_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeInt32Size(2, this.varValue_);
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += CodedOutputStream.computeMessageSize(3, this.getConstraint());
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPIndicatorConstraint)) {
         return super.equals(var1);
      } else {
         MPIndicatorConstraint var2 = (MPIndicatorConstraint)var1;
         if (this.hasVarIndex() != var2.hasVarIndex()) {
            return false;
         } else if (this.hasVarIndex() && this.getVarIndex() != var2.getVarIndex()) {
            return false;
         } else if (this.hasVarValue() != var2.hasVarValue()) {
            return false;
         } else if (this.hasVarValue() && this.getVarValue() != var2.getVarValue()) {
            return false;
         } else if (this.hasConstraint() != var2.hasConstraint()) {
            return false;
         } else if (this.hasConstraint() && !this.getConstraint().equals(var2.getConstraint())) {
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
         if (this.hasVarIndex()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getVarIndex();
         }

         if (this.hasVarValue()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getVarValue();
         }

         if (this.hasConstraint()) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getConstraint().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPIndicatorConstraint parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPIndicatorConstraint)PARSER.parseFrom(var0);
   }

   public static MPIndicatorConstraint parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPIndicatorConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPIndicatorConstraint parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPIndicatorConstraint)PARSER.parseFrom(var0);
   }

   public static MPIndicatorConstraint parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPIndicatorConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPIndicatorConstraint parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPIndicatorConstraint)PARSER.parseFrom(var0);
   }

   public static MPIndicatorConstraint parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPIndicatorConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPIndicatorConstraint parseFrom(InputStream var0) throws IOException {
      return (MPIndicatorConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPIndicatorConstraint parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPIndicatorConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPIndicatorConstraint parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPIndicatorConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPIndicatorConstraint parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPIndicatorConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPIndicatorConstraint parseFrom(CodedInputStream var0) throws IOException {
      return (MPIndicatorConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPIndicatorConstraint parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPIndicatorConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPIndicatorConstraint.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPIndicatorConstraint.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPIndicatorConstraint.Builder newBuilder(MPIndicatorConstraint var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPIndicatorConstraint.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPIndicatorConstraint.Builder() : (new MPIndicatorConstraint.Builder()).mergeFrom(this);
   }

   protected MPIndicatorConstraint.Builder newBuilderForType(BuilderParent var1) {
      MPIndicatorConstraint.Builder var2 = new MPIndicatorConstraint.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPIndicatorConstraint getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPIndicatorConstraint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPIndicatorConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPIndicatorConstraint(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPIndicatorConstraintOrBuilder {
      private int bitField0_;
      private int varIndex_;
      private int varValue_;
      private MPConstraintProto constraint_;
      private SingleFieldBuilderV3 constraintBuilder_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPIndicatorConstraint_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPIndicatorConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPIndicatorConstraint.class, MPIndicatorConstraint.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPIndicatorConstraint.alwaysUseFieldBuilders) {
            this.getConstraintFieldBuilder();
         }

      }

      public MPIndicatorConstraint.Builder clear() {
         super.clear();
         this.varIndex_ = 0;
         this.bitField0_ &= -2;
         this.varValue_ = 0;
         this.bitField0_ &= -3;
         if (this.constraintBuilder_ == null) {
            this.constraint_ = null;
         } else {
            this.constraintBuilder_.clear();
         }

         this.bitField0_ &= -5;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPIndicatorConstraint_descriptor;
      }

      public MPIndicatorConstraint getDefaultInstanceForType() {
         return MPIndicatorConstraint.getDefaultInstance();
      }

      public MPIndicatorConstraint build() {
         MPIndicatorConstraint var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPIndicatorConstraint buildPartial() {
         MPIndicatorConstraint var1 = new MPIndicatorConstraint(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((var2 & 1) != 0) {
            var1.varIndex_ = this.varIndex_;
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.varValue_ = this.varValue_;
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            if (this.constraintBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = (MPConstraintProto)this.constraintBuilder_.build();
            }

            var3 |= 4;
         }

         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPIndicatorConstraint.Builder clone() {
         return (MPIndicatorConstraint.Builder)super.clone();
      }

      public MPIndicatorConstraint.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPIndicatorConstraint.Builder)super.setField(var1, var2);
      }

      public MPIndicatorConstraint.Builder clearField(FieldDescriptor var1) {
         return (MPIndicatorConstraint.Builder)super.clearField(var1);
      }

      public MPIndicatorConstraint.Builder clearOneof(OneofDescriptor var1) {
         return (MPIndicatorConstraint.Builder)super.clearOneof(var1);
      }

      public MPIndicatorConstraint.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPIndicatorConstraint.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPIndicatorConstraint.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPIndicatorConstraint.Builder)super.addRepeatedField(var1, var2);
      }

      public MPIndicatorConstraint.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPIndicatorConstraint) {
            return this.mergeFrom((MPIndicatorConstraint)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPIndicatorConstraint.Builder mergeFrom(MPIndicatorConstraint var1) {
         if (var1 == MPIndicatorConstraint.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasVarIndex()) {
               this.setVarIndex(var1.getVarIndex());
            }

            if (var1.hasVarValue()) {
               this.setVarValue(var1.getVarValue());
            }

            if (var1.hasConstraint()) {
               this.mergeConstraint(var1.getConstraint());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public MPIndicatorConstraint.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPIndicatorConstraint var3 = null;

         try {
            var3 = (MPIndicatorConstraint)MPIndicatorConstraint.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPIndicatorConstraint)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public boolean hasVarIndex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getVarIndex() {
         return this.varIndex_;
      }

      public MPIndicatorConstraint.Builder setVarIndex(int var1) {
         this.bitField0_ |= 1;
         this.varIndex_ = var1;
         this.onChanged();
         return this;
      }

      public MPIndicatorConstraint.Builder clearVarIndex() {
         this.bitField0_ &= -2;
         this.varIndex_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasVarValue() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getVarValue() {
         return this.varValue_;
      }

      public MPIndicatorConstraint.Builder setVarValue(int var1) {
         this.bitField0_ |= 2;
         this.varValue_ = var1;
         this.onChanged();
         return this;
      }

      public MPIndicatorConstraint.Builder clearVarValue() {
         this.bitField0_ &= -3;
         this.varValue_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasConstraint() {
         return (this.bitField0_ & 4) != 0;
      }

      public MPConstraintProto getConstraint() {
         if (this.constraintBuilder_ == null) {
            return this.constraint_ == null ? MPConstraintProto.getDefaultInstance() : this.constraint_;
         } else {
            return (MPConstraintProto)this.constraintBuilder_.getMessage();
         }
      }

      public MPIndicatorConstraint.Builder setConstraint(MPConstraintProto var1) {
         if (this.constraintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.constraintBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         return this;
      }

      public MPIndicatorConstraint.Builder setConstraint(MPConstraintProto.Builder var1) {
         if (this.constraintBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.constraintBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         return this;
      }

      public MPIndicatorConstraint.Builder mergeConstraint(MPConstraintProto var1) {
         if (this.constraintBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.constraint_ != null && this.constraint_ != MPConstraintProto.getDefaultInstance()) {
               this.constraint_ = MPConstraintProto.newBuilder(this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            this.constraintBuilder_.mergeFrom(var1);
         }

         this.bitField0_ |= 4;
         return this;
      }

      public MPIndicatorConstraint.Builder clearConstraint() {
         if (this.constraintBuilder_ == null) {
            this.constraint_ = null;
            this.onChanged();
         } else {
            this.constraintBuilder_.clear();
         }

         this.bitField0_ &= -5;
         return this;
      }

      public MPConstraintProto.Builder getConstraintBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return (MPConstraintProto.Builder)this.getConstraintFieldBuilder().getBuilder();
      }

      public MPConstraintProtoOrBuilder getConstraintOrBuilder() {
         if (this.constraintBuilder_ != null) {
            return (MPConstraintProtoOrBuilder)this.constraintBuilder_.getMessageOrBuilder();
         } else {
            return this.constraint_ == null ? MPConstraintProto.getDefaultInstance() : this.constraint_;
         }
      }

      private SingleFieldBuilderV3 getConstraintFieldBuilder() {
         if (this.constraintBuilder_ == null) {
            this.constraintBuilder_ = new SingleFieldBuilderV3(this.getConstraint(), this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         return this.constraintBuilder_;
      }

      public final MPIndicatorConstraint.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPIndicatorConstraint.Builder)super.setUnknownFields(var1);
      }

      public final MPIndicatorConstraint.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPIndicatorConstraint.Builder)super.mergeUnknownFields(var1);
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
