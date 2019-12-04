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
import com.google.protobuf.Internal.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class MPArrayConstraint extends GeneratedMessageV3 implements MPArrayConstraintOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int VAR_INDEX_FIELD_NUMBER = 1;
   private IntList varIndex_;
   public static final int RESULTANT_VAR_INDEX_FIELD_NUMBER = 2;
   private int resultantVarIndex_;
   private byte memoizedIsInitialized;
   private static final MPArrayConstraint DEFAULT_INSTANCE = new MPArrayConstraint();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPArrayConstraint parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPArrayConstraint(var1, var2);
      }
   };

   private MPArrayConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPArrayConstraint() {
      this.memoizedIsInitialized = -1;
      this.varIndex_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPArrayConstraint();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPArrayConstraint(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                  case 16:
                     this.bitField0_ |= 1;
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
      return LinearSolver.internal_static_operations_research_MPArrayConstraint_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPArrayConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPArrayConstraint.class, MPArrayConstraint.Builder.class);
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

   public boolean hasResultantVarIndex() {
      return (this.bitField0_ & 1) != 0;
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
         var1.writeInt32(2, this.resultantVarIndex_);
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
      } else if (!(var1 instanceof MPArrayConstraint)) {
         return super.equals(var1);
      } else {
         MPArrayConstraint var2 = (MPArrayConstraint)var1;
         if (!this.getVarIndexList().equals(var2.getVarIndexList())) {
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

         if (this.hasResultantVarIndex()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getResultantVarIndex();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPArrayConstraint parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPArrayConstraint)PARSER.parseFrom(var0);
   }

   public static MPArrayConstraint parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPArrayConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPArrayConstraint parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPArrayConstraint)PARSER.parseFrom(var0);
   }

   public static MPArrayConstraint parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPArrayConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPArrayConstraint parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPArrayConstraint)PARSER.parseFrom(var0);
   }

   public static MPArrayConstraint parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPArrayConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPArrayConstraint parseFrom(InputStream var0) throws IOException {
      return (MPArrayConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPArrayConstraint parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPArrayConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPArrayConstraint parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPArrayConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPArrayConstraint parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPArrayConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPArrayConstraint parseFrom(CodedInputStream var0) throws IOException {
      return (MPArrayConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPArrayConstraint parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPArrayConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPArrayConstraint.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPArrayConstraint.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPArrayConstraint.Builder newBuilder(MPArrayConstraint var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPArrayConstraint.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPArrayConstraint.Builder() : (new MPArrayConstraint.Builder()).mergeFrom(this);
   }

   protected MPArrayConstraint.Builder newBuilderForType(BuilderParent var1) {
      MPArrayConstraint.Builder var2 = new MPArrayConstraint.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPArrayConstraint getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPArrayConstraint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPArrayConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPArrayConstraint(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPArrayConstraintOrBuilder {
      private int bitField0_;
      private IntList varIndex_;
      private int resultantVarIndex_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPArrayConstraint_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPArrayConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPArrayConstraint.class, MPArrayConstraint.Builder.class);
      }

      private Builder() {
         this.varIndex_ = MPArrayConstraint.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.varIndex_ = MPArrayConstraint.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPArrayConstraint.alwaysUseFieldBuilders) {
         }

      }

      public MPArrayConstraint.Builder clear() {
         super.clear();
         this.varIndex_ = MPArrayConstraint.emptyIntList();
         this.bitField0_ &= -2;
         this.resultantVarIndex_ = 0;
         this.bitField0_ &= -3;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPArrayConstraint_descriptor;
      }

      public MPArrayConstraint getDefaultInstanceForType() {
         return MPArrayConstraint.getDefaultInstance();
      }

      public MPArrayConstraint build() {
         MPArrayConstraint var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPArrayConstraint buildPartial() {
         MPArrayConstraint var1 = new MPArrayConstraint(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((this.bitField0_ & 1) != 0) {
            this.varIndex_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.varIndex_ = this.varIndex_;
         if ((var2 & 2) != 0) {
            var1.resultantVarIndex_ = this.resultantVarIndex_;
            var3 |= 1;
         }

         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPArrayConstraint.Builder clone() {
         return (MPArrayConstraint.Builder)super.clone();
      }

      public MPArrayConstraint.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPArrayConstraint.Builder)super.setField(var1, var2);
      }

      public MPArrayConstraint.Builder clearField(FieldDescriptor var1) {
         return (MPArrayConstraint.Builder)super.clearField(var1);
      }

      public MPArrayConstraint.Builder clearOneof(OneofDescriptor var1) {
         return (MPArrayConstraint.Builder)super.clearOneof(var1);
      }

      public MPArrayConstraint.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPArrayConstraint.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPArrayConstraint.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPArrayConstraint.Builder)super.addRepeatedField(var1, var2);
      }

      public MPArrayConstraint.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPArrayConstraint) {
            return this.mergeFrom((MPArrayConstraint)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPArrayConstraint.Builder mergeFrom(MPArrayConstraint var1) {
         if (var1 == MPArrayConstraint.getDefaultInstance()) {
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

      public MPArrayConstraint.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPArrayConstraint var3 = null;

         try {
            var3 = (MPArrayConstraint)MPArrayConstraint.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPArrayConstraint)var8.getUnfinishedMessage();
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
            this.varIndex_ = MPArrayConstraint.mutableCopy(this.varIndex_);
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

      public MPArrayConstraint.Builder setVarIndex(int var1, int var2) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public MPArrayConstraint.Builder addVarIndex(int var1) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.addInt(var1);
         this.onChanged();
         return this;
      }

      public MPArrayConstraint.Builder addAllVarIndex(Iterable var1) {
         this.ensureVarIndexIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.varIndex_);
         this.onChanged();
         return this;
      }

      public MPArrayConstraint.Builder clearVarIndex() {
         this.varIndex_ = MPArrayConstraint.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public boolean hasResultantVarIndex() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResultantVarIndex() {
         return this.resultantVarIndex_;
      }

      public MPArrayConstraint.Builder setResultantVarIndex(int var1) {
         this.bitField0_ |= 2;
         this.resultantVarIndex_ = var1;
         this.onChanged();
         return this;
      }

      public MPArrayConstraint.Builder clearResultantVarIndex() {
         this.bitField0_ &= -3;
         this.resultantVarIndex_ = 0;
         this.onChanged();
         return this;
      }

      public final MPArrayConstraint.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPArrayConstraint.Builder)super.setUnknownFields(var1);
      }

      public final MPArrayConstraint.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPArrayConstraint.Builder)super.mergeUnknownFields(var1);
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
