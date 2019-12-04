package com.google.ortools.linearsolver;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
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

public final class MPArrayWithConstantConstraint extends GeneratedMessageV3 implements MPArrayWithConstantConstraintOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int VAR_INDEX_FIELD_NUMBER = 1;
   private IntList varIndex_;
   public static final int CONSTANT_FIELD_NUMBER = 2;
   private double constant_;
   public static final int RESULTANT_VAR_INDEX_FIELD_NUMBER = 3;
   private int resultantVarIndex_;
   private byte memoizedIsInitialized;
   private static final MPArrayWithConstantConstraint DEFAULT_INSTANCE = new MPArrayWithConstantConstraint();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPArrayWithConstantConstraint parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPArrayWithConstantConstraint(var1, var2);
      }
   };

   private MPArrayWithConstantConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPArrayWithConstantConstraint() {
      this.memoizedIsInitialized = -1;
      this.varIndex_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPArrayWithConstantConstraint();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPArrayWithConstantConstraint(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                  int var8;
                  switch(var6) {
                  case 0:
                     var5 = true;
                     continue;
                  case 8:
                     if (!(var3 & true)) {
                        this.varIndex_ = newIntList();
                        var3 |= true;
                     }

                     this.varIndex_.addInt(var1.readInt32());
                     continue;
                  case 10:
                     int var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if (!(var3 & true) && var1.getBytesUntilLimit() > 0) {
                        this.varIndex_ = newIntList();
                        var3 |= true;
                     }
                     break;
                  case 17:
                     this.bitField0_ |= 1;
                     this.constant_ = var1.readDouble();
                     continue;
                  case 24:
                     this.bitField0_ |= 2;
                     this.resultantVarIndex_ = var1.readInt32();
                     continue;
                  default:
                     if (!this.parseUnknownField(var1, var4, var2, var6)) {
                        var5 = true;
                     }
                     continue;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.varIndex_.addInt(var1.readInt32());
                  }

                  var1.popLimit(var8);
               }

               return;
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            if (var3 & true) {
               this.varIndex_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPArrayWithConstantConstraint_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPArrayWithConstantConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPArrayWithConstantConstraint.class, MPArrayWithConstantConstraint.Builder.class);
   }

   public List getVarIndexList() {
      return this.varIndex_;
   }

   public int getVarIndexCount() {
      return this.varIndex_.size();
   }

   public int getVarIndex(int var1) {
      return this.varIndex_.getInt(var1);
   }

   public boolean hasConstant() {
      return (this.bitField0_ & 1) != 0;
   }

   public double getConstant() {
      return this.constant_;
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
      for(int var2 = 0; var2 < this.varIndex_.size(); ++var2) {
         var1.writeInt32(1, this.varIndex_.getInt(var2));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeDouble(2, this.constant_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeInt32(3, this.resultantVarIndex_);
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

         for(int var3 = 0; var3 < this.varIndex_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.varIndex_.getInt(var3));
         }

         var1 = var4 + var2;
         var1 += 1 * this.getVarIndexList().size();
         if ((this.bitField0_ & 1) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(2, this.constant_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeInt32Size(3, this.resultantVarIndex_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPArrayWithConstantConstraint)) {
         return super.equals(var1);
      } else {
         MPArrayWithConstantConstraint var2 = (MPArrayWithConstantConstraint)var1;
         if (!this.getVarIndexList().equals(var2.getVarIndexList())) {
            return false;
         } else if (this.hasConstant() != var2.hasConstant()) {
            return false;
         } else if (this.hasConstant() && Double.doubleToLongBits(this.getConstant()) != Double.doubleToLongBits(var2.getConstant())) {
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
         if (this.getVarIndexCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getVarIndexList().hashCode();
         }

         if (this.hasConstant()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getConstant()));
         }

         if (this.hasResultantVarIndex()) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getResultantVarIndex();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPArrayWithConstantConstraint parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPArrayWithConstantConstraint)PARSER.parseFrom(var0);
   }

   public static MPArrayWithConstantConstraint parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPArrayWithConstantConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPArrayWithConstantConstraint parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPArrayWithConstantConstraint)PARSER.parseFrom(var0);
   }

   public static MPArrayWithConstantConstraint parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPArrayWithConstantConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPArrayWithConstantConstraint parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPArrayWithConstantConstraint)PARSER.parseFrom(var0);
   }

   public static MPArrayWithConstantConstraint parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPArrayWithConstantConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPArrayWithConstantConstraint parseFrom(InputStream var0) throws IOException {
      return (MPArrayWithConstantConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPArrayWithConstantConstraint parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPArrayWithConstantConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPArrayWithConstantConstraint parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPArrayWithConstantConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPArrayWithConstantConstraint parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPArrayWithConstantConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPArrayWithConstantConstraint parseFrom(CodedInputStream var0) throws IOException {
      return (MPArrayWithConstantConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPArrayWithConstantConstraint parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPArrayWithConstantConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPArrayWithConstantConstraint.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPArrayWithConstantConstraint.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPArrayWithConstantConstraint.Builder newBuilder(MPArrayWithConstantConstraint var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPArrayWithConstantConstraint.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPArrayWithConstantConstraint.Builder() : (new MPArrayWithConstantConstraint.Builder()).mergeFrom(this);
   }

   protected MPArrayWithConstantConstraint.Builder newBuilderForType(BuilderParent var1) {
      MPArrayWithConstantConstraint.Builder var2 = new MPArrayWithConstantConstraint.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPArrayWithConstantConstraint getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPArrayWithConstantConstraint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPArrayWithConstantConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPArrayWithConstantConstraint(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPArrayWithConstantConstraintOrBuilder {
      private int bitField0_;
      private IntList varIndex_;
      private double constant_;
      private int resultantVarIndex_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPArrayWithConstantConstraint_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPArrayWithConstantConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPArrayWithConstantConstraint.class, MPArrayWithConstantConstraint.Builder.class);
      }

      private Builder() {
         this.varIndex_ = MPArrayWithConstantConstraint.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.varIndex_ = MPArrayWithConstantConstraint.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPArrayWithConstantConstraint.alwaysUseFieldBuilders) {
         }

      }

      public MPArrayWithConstantConstraint.Builder clear() {
         super.clear();
         this.varIndex_ = MPArrayWithConstantConstraint.emptyIntList();
         this.bitField0_ &= -2;
         this.constant_ = 0.0D;
         this.bitField0_ &= -3;
         this.resultantVarIndex_ = 0;
         this.bitField0_ &= -5;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPArrayWithConstantConstraint_descriptor;
      }

      public MPArrayWithConstantConstraint getDefaultInstanceForType() {
         return MPArrayWithConstantConstraint.getDefaultInstance();
      }

      public MPArrayWithConstantConstraint build() {
         MPArrayWithConstantConstraint var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPArrayWithConstantConstraint buildPartial() {
         MPArrayWithConstantConstraint var1 = new MPArrayWithConstantConstraint(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((this.bitField0_ & 1) != 0) {
            this.varIndex_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.varIndex_ = this.varIndex_;
         if ((var2 & 2) != 0) {
            var1.constant_ = this.constant_;
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.resultantVarIndex_ = this.resultantVarIndex_;
            var3 |= 2;
         }

         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPArrayWithConstantConstraint.Builder clone() {
         return (MPArrayWithConstantConstraint.Builder)super.clone();
      }

      public MPArrayWithConstantConstraint.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPArrayWithConstantConstraint.Builder)super.setField(var1, var2);
      }

      public MPArrayWithConstantConstraint.Builder clearField(FieldDescriptor var1) {
         return (MPArrayWithConstantConstraint.Builder)super.clearField(var1);
      }

      public MPArrayWithConstantConstraint.Builder clearOneof(OneofDescriptor var1) {
         return (MPArrayWithConstantConstraint.Builder)super.clearOneof(var1);
      }

      public MPArrayWithConstantConstraint.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPArrayWithConstantConstraint.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPArrayWithConstantConstraint.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPArrayWithConstantConstraint.Builder)super.addRepeatedField(var1, var2);
      }

      public MPArrayWithConstantConstraint.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPArrayWithConstantConstraint) {
            return this.mergeFrom((MPArrayWithConstantConstraint)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPArrayWithConstantConstraint.Builder mergeFrom(MPArrayWithConstantConstraint var1) {
         if (var1 == MPArrayWithConstantConstraint.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.varIndex_.isEmpty()) {
               if (this.varIndex_.isEmpty()) {
                  this.varIndex_ = var1.varIndex_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureVarIndexIsMutable();
                  this.varIndex_.addAll(var1.varIndex_);
               }

               this.onChanged();
            }

            if (var1.hasConstant()) {
               this.setConstant(var1.getConstant());
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

      public MPArrayWithConstantConstraint.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPArrayWithConstantConstraint var3 = null;

         try {
            var3 = (MPArrayWithConstantConstraint)MPArrayWithConstantConstraint.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPArrayWithConstantConstraint)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureVarIndexIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.varIndex_ = MPArrayWithConstantConstraint.mutableCopy(this.varIndex_);
            this.bitField0_ |= 1;
         }

      }

      public List getVarIndexList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.varIndex_) : this.varIndex_);
      }

      public int getVarIndexCount() {
         return this.varIndex_.size();
      }

      public int getVarIndex(int var1) {
         return this.varIndex_.getInt(var1);
      }

      public MPArrayWithConstantConstraint.Builder setVarIndex(int var1, int var2) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public MPArrayWithConstantConstraint.Builder addVarIndex(int var1) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.addInt(var1);
         this.onChanged();
         return this;
      }

      public MPArrayWithConstantConstraint.Builder addAllVarIndex(Iterable var1) {
         this.ensureVarIndexIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.varIndex_);
         this.onChanged();
         return this;
      }

      public MPArrayWithConstantConstraint.Builder clearVarIndex() {
         this.varIndex_ = MPArrayWithConstantConstraint.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public boolean hasConstant() {
         return (this.bitField0_ & 2) != 0;
      }

      public double getConstant() {
         return this.constant_;
      }

      public MPArrayWithConstantConstraint.Builder setConstant(double var1) {
         this.bitField0_ |= 2;
         this.constant_ = var1;
         this.onChanged();
         return this;
      }

      public MPArrayWithConstantConstraint.Builder clearConstant() {
         this.bitField0_ &= -3;
         this.constant_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean hasResultantVarIndex() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getResultantVarIndex() {
         return this.resultantVarIndex_;
      }

      public MPArrayWithConstantConstraint.Builder setResultantVarIndex(int var1) {
         this.bitField0_ |= 4;
         this.resultantVarIndex_ = var1;
         this.onChanged();
         return this;
      }

      public MPArrayWithConstantConstraint.Builder clearResultantVarIndex() {
         this.bitField0_ &= -5;
         this.resultantVarIndex_ = 0;
         this.onChanged();
         return this;
      }

      public final MPArrayWithConstantConstraint.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPArrayWithConstantConstraint.Builder)super.setUnknownFields(var1);
      }

      public final MPArrayWithConstantConstraint.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPArrayWithConstantConstraint.Builder)super.mergeUnknownFields(var1);
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
