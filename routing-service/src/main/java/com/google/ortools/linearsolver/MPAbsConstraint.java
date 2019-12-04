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

public final class MPAbsConstraint extends GeneratedMessageV3 implements MPAbsConstraintOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int VAR_INDEX_FIELD_NUMBER = 1;
   private int varIndex_;
   public static final int RESULTANT_VAR_INDEX_FIELD_NUMBER = 2;
   private int resultantVarIndex_;
   private byte memoizedIsInitialized;
   private static final MPAbsConstraint DEFAULT_INSTANCE = new MPAbsConstraint();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPAbsConstraint parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPAbsConstraint(var1, var2);
      }
   };

   private MPAbsConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPAbsConstraint() {
      this.memoizedIsInitialized = -1;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPAbsConstraint();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPAbsConstraint(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                  this.resultantVarIndex_ = var1.readInt32();
                  break;
               default:
                  if (!this.parseUnknownField(var1, var4, var2, var6)) {
                     var5 = true;
                  }
               }
            }
         } catch (InvalidProtocolBufferException var11) {
            throw var11.setUnfinishedMessage(this);
         } catch (IOException var12) {
            throw (new InvalidProtocolBufferException(var12)).setUnfinishedMessage(this);
         } finally {
            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPAbsConstraint_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPAbsConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPAbsConstraint.class, MPAbsConstraint.Builder.class);
   }

   public boolean hasVarIndex() {
      return (this.bitField0_ & 1) != 0;
   }

   public int getVarIndex() {
      return this.varIndex_;
   }

   public boolean hasResultantVarIndex() {
      return (this.bitField0_ & 2) != 0;
   }

   public int getResultantVarIndex() {
      return this.resultantVarIndex_;
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
         var1.writeInt32(2, this.resultantVarIndex_);
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
            var1 += CodedOutputStream.computeInt32Size(2, this.resultantVarIndex_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPAbsConstraint)) {
         return super.equals(var1);
      } else {
         MPAbsConstraint var2 = (MPAbsConstraint)var1;
         if (this.hasVarIndex() != var2.hasVarIndex()) {
            return false;
         } else if (this.hasVarIndex() && this.getVarIndex() != var2.getVarIndex()) {
            return false;
         } else if (this.hasResultantVarIndex() != var2.hasResultantVarIndex()) {
            return false;
         } else if (this.hasResultantVarIndex() && this.getResultantVarIndex() != var2.getResultantVarIndex()) {
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

         if (this.hasResultantVarIndex()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getResultantVarIndex();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPAbsConstraint parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPAbsConstraint)PARSER.parseFrom(var0);
   }

   public static MPAbsConstraint parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPAbsConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPAbsConstraint parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPAbsConstraint)PARSER.parseFrom(var0);
   }

   public static MPAbsConstraint parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPAbsConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPAbsConstraint parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPAbsConstraint)PARSER.parseFrom(var0);
   }

   public static MPAbsConstraint parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPAbsConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPAbsConstraint parseFrom(InputStream var0) throws IOException {
      return (MPAbsConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPAbsConstraint parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPAbsConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPAbsConstraint parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPAbsConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPAbsConstraint parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPAbsConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPAbsConstraint parseFrom(CodedInputStream var0) throws IOException {
      return (MPAbsConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPAbsConstraint parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPAbsConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPAbsConstraint.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPAbsConstraint.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPAbsConstraint.Builder newBuilder(MPAbsConstraint var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPAbsConstraint.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPAbsConstraint.Builder() : (new MPAbsConstraint.Builder()).mergeFrom(this);
   }

   protected MPAbsConstraint.Builder newBuilderForType(BuilderParent var1) {
      MPAbsConstraint.Builder var2 = new MPAbsConstraint.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPAbsConstraint getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPAbsConstraint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPAbsConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPAbsConstraint(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPAbsConstraintOrBuilder {
      private int bitField0_;
      private int varIndex_;
      private int resultantVarIndex_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPAbsConstraint_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPAbsConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPAbsConstraint.class, MPAbsConstraint.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPAbsConstraint.alwaysUseFieldBuilders) {
         }

      }

      public MPAbsConstraint.Builder clear() {
         super.clear();
         this.varIndex_ = 0;
         this.bitField0_ &= -2;
         this.resultantVarIndex_ = 0;
         this.bitField0_ &= -3;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPAbsConstraint_descriptor;
      }

      public MPAbsConstraint getDefaultInstanceForType() {
         return MPAbsConstraint.getDefaultInstance();
      }

      public MPAbsConstraint build() {
         MPAbsConstraint var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPAbsConstraint buildPartial() {
         MPAbsConstraint var1 = new MPAbsConstraint(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((var2 & 1) != 0) {
            var1.varIndex_ = this.varIndex_;
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.resultantVarIndex_ = this.resultantVarIndex_;
            var3 |= 2;
         }

         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPAbsConstraint.Builder clone() {
         return (MPAbsConstraint.Builder)super.clone();
      }

      public MPAbsConstraint.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPAbsConstraint.Builder)super.setField(var1, var2);
      }

      public MPAbsConstraint.Builder clearField(FieldDescriptor var1) {
         return (MPAbsConstraint.Builder)super.clearField(var1);
      }

      public MPAbsConstraint.Builder clearOneof(OneofDescriptor var1) {
         return (MPAbsConstraint.Builder)super.clearOneof(var1);
      }

      public MPAbsConstraint.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPAbsConstraint.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPAbsConstraint.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPAbsConstraint.Builder)super.addRepeatedField(var1, var2);
      }

      public MPAbsConstraint.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPAbsConstraint) {
            return this.mergeFrom((MPAbsConstraint)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPAbsConstraint.Builder mergeFrom(MPAbsConstraint var1) {
         if (var1 == MPAbsConstraint.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasVarIndex()) {
               this.setVarIndex(var1.getVarIndex());
            }

            if (var1.hasResultantVarIndex()) {
               this.setResultantVarIndex(var1.getResultantVarIndex());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public MPAbsConstraint.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPAbsConstraint var3 = null;

         try {
            var3 = (MPAbsConstraint)MPAbsConstraint.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPAbsConstraint)var8.getUnfinishedMessage();
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

      public MPAbsConstraint.Builder setVarIndex(int var1) {
         this.bitField0_ |= 1;
         this.varIndex_ = var1;
         this.onChanged();
         return this;
      }

      public MPAbsConstraint.Builder clearVarIndex() {
         this.bitField0_ &= -2;
         this.varIndex_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasResultantVarIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResultantVarIndex() {
         return this.resultantVarIndex_;
      }

      public MPAbsConstraint.Builder setResultantVarIndex(int var1) {
         this.bitField0_ |= 2;
         this.resultantVarIndex_ = var1;
         this.onChanged();
         return this;
      }

      public MPAbsConstraint.Builder clearResultantVarIndex() {
         this.bitField0_ &= -3;
         this.resultantVarIndex_ = 0;
         this.onChanged();
         return this;
      }

      public final MPAbsConstraint.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPAbsConstraint.Builder)super.setUnknownFields(var1);
      }

      public final MPAbsConstraint.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPAbsConstraint.Builder)super.mergeUnknownFields(var1);
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
