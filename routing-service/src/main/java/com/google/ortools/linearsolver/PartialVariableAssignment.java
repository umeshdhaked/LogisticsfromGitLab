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
import com.google.protobuf.Internal.DoubleList;
import com.google.protobuf.Internal.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class PartialVariableAssignment extends GeneratedMessageV3 implements PartialVariableAssignmentOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VAR_INDEX_FIELD_NUMBER = 1;
   private IntList varIndex_;
   private int varIndexMemoizedSerializedSize;
   public static final int VAR_VALUE_FIELD_NUMBER = 2;
   private DoubleList varValue_;
   private int varValueMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final PartialVariableAssignment DEFAULT_INSTANCE = new PartialVariableAssignment();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public PartialVariableAssignment parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new PartialVariableAssignment(var1, var2);
      }
   };

   private PartialVariableAssignment(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.varIndexMemoizedSerializedSize = -1;
      this.varValueMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private PartialVariableAssignment() {
      this.varIndexMemoizedSerializedSize = -1;
      this.varValueMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.varIndex_ = emptyIntList();
      this.varValue_ = emptyDoubleList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new PartialVariableAssignment();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private PartialVariableAssignment(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         int var3 = 0;
         com.google.protobuf.UnknownFieldSet.Builder var4 = UnknownFieldSet.newBuilder();

         try {
            boolean var5 = false;

            while(true) {
               while(!var5) {
                  int var6 = var1.readTag();
                  int var7;
                  int var8;
                  switch(var6) {
                  case 0:
                     var5 = true;
                     continue;
                  case 8:
                     if ((var3 & 1) == 0) {
                        this.varIndex_ = newIntList();
                        var3 |= 1;
                     }

                     this.varIndex_.addInt(var1.readInt32());
                     continue;
                  case 10:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.varIndex_ = newIntList();
                        var3 |= 1;
                     }
                     break;
                  case 17:
                     if ((var3 & 2) == 0) {
                        this.varValue_ = newDoubleList();
                        var3 |= 2;
                     }

                     this.varValue_.addDouble(var1.readDouble());
                     continue;
                  case 18:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.varValue_ = newDoubleList();
                        var3 |= 2;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.varValue_.addDouble(var1.readDouble());
                     }

                     var1.popLimit(var8);
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
            if ((var3 & 1) != 0) {
               this.varIndex_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.varValue_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_PartialVariableAssignment_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_PartialVariableAssignment_fieldAccessorTable.ensureFieldAccessorsInitialized(PartialVariableAssignment.class, PartialVariableAssignment.Builder.class);
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

   public List getVarValueList() {
      return this.varValue_;
   }

   public int getVarValueCount() {
      return this.varValue_.size();
   }

   public double getVarValue(int var1) {
      return this.varValue_.getDouble(var1);
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
      if (this.getVarIndexList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.varIndexMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.varIndex_.size(); ++var2) {
         var1.writeInt32NoTag(this.varIndex_.getInt(var2));
      }

      if (this.getVarValueList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.varValueMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.varValue_.size(); ++var2) {
         var1.writeDoubleNoTag(this.varValue_.getDouble(var2));
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
         if (!this.getVarIndexList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.varIndexMemoizedSerializedSize = var2;
         boolean var5 = false;
         var2 = 8 * this.getVarValueList().size();
         var1 += var2;
         if (!this.getVarValueList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.varValueMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PartialVariableAssignment)) {
         return super.equals(var1);
      } else {
         PartialVariableAssignment var2 = (PartialVariableAssignment)var1;
         if (!this.getVarIndexList().equals(var2.getVarIndexList())) {
            return false;
         } else if (!this.getVarValueList().equals(var2.getVarValueList())) {
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

         if (this.getVarValueCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getVarValueList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static PartialVariableAssignment parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0);
   }

   public static PartialVariableAssignment parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0, var1);
   }

   public static PartialVariableAssignment parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0);
   }

   public static PartialVariableAssignment parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0, var1);
   }

   public static PartialVariableAssignment parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0);
   }

   public static PartialVariableAssignment parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0, var1);
   }

   public static PartialVariableAssignment parseFrom(InputStream var0) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PartialVariableAssignment parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PartialVariableAssignment parseDelimitedFrom(InputStream var0) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PartialVariableAssignment parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PartialVariableAssignment parseFrom(CodedInputStream var0) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PartialVariableAssignment parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PartialVariableAssignment.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PartialVariableAssignment.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PartialVariableAssignment.Builder newBuilder(PartialVariableAssignment var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PartialVariableAssignment.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PartialVariableAssignment.Builder() : (new PartialVariableAssignment.Builder()).mergeFrom(this);
   }

   protected PartialVariableAssignment.Builder newBuilderForType(BuilderParent var1) {
      PartialVariableAssignment.Builder var2 = new PartialVariableAssignment.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static PartialVariableAssignment getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public PartialVariableAssignment getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   PartialVariableAssignment(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   PartialVariableAssignment(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements PartialVariableAssignmentOrBuilder {
      private int bitField0_;
      private IntList varIndex_;
      private DoubleList varValue_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_PartialVariableAssignment_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_PartialVariableAssignment_fieldAccessorTable.ensureFieldAccessorsInitialized(PartialVariableAssignment.class, PartialVariableAssignment.Builder.class);
      }

      private Builder() {
         this.varIndex_ = PartialVariableAssignment.emptyIntList();
         this.varValue_ = PartialVariableAssignment.emptyDoubleList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.varIndex_ = PartialVariableAssignment.emptyIntList();
         this.varValue_ = PartialVariableAssignment.emptyDoubleList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PartialVariableAssignment.alwaysUseFieldBuilders) {
         }

      }

      public PartialVariableAssignment.Builder clear() {
         super.clear();
         this.varIndex_ = PartialVariableAssignment.emptyIntList();
         this.bitField0_ &= -2;
         this.varValue_ = PartialVariableAssignment.emptyDoubleList();
         this.bitField0_ &= -3;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_PartialVariableAssignment_descriptor;
      }

      public PartialVariableAssignment getDefaultInstanceForType() {
         return PartialVariableAssignment.getDefaultInstance();
      }

      public PartialVariableAssignment build() {
         PartialVariableAssignment var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PartialVariableAssignment buildPartial() {
         PartialVariableAssignment var1 = new PartialVariableAssignment(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.varIndex_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.varIndex_ = this.varIndex_;
         if ((this.bitField0_ & 2) != 0) {
            this.varValue_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.varValue_ = this.varValue_;
         this.onBuilt();
         return var1;
      }

      public PartialVariableAssignment.Builder clone() {
         return (PartialVariableAssignment.Builder)super.clone();
      }

      public PartialVariableAssignment.Builder setField(FieldDescriptor var1, Object var2) {
         return (PartialVariableAssignment.Builder)super.setField(var1, var2);
      }

      public PartialVariableAssignment.Builder clearField(FieldDescriptor var1) {
         return (PartialVariableAssignment.Builder)super.clearField(var1);
      }

      public PartialVariableAssignment.Builder clearOneof(OneofDescriptor var1) {
         return (PartialVariableAssignment.Builder)super.clearOneof(var1);
      }

      public PartialVariableAssignment.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (PartialVariableAssignment.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PartialVariableAssignment.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (PartialVariableAssignment.Builder)super.addRepeatedField(var1, var2);
      }

      public PartialVariableAssignment.Builder mergeFrom(Message var1) {
         if (var1 instanceof PartialVariableAssignment) {
            return this.mergeFrom((PartialVariableAssignment)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public PartialVariableAssignment.Builder mergeFrom(PartialVariableAssignment var1) {
         if (var1 == PartialVariableAssignment.getDefaultInstance()) {
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

            if (!var1.varValue_.isEmpty()) {
               if (this.varValue_.isEmpty()) {
                  this.varValue_ = var1.varValue_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureVarValueIsMutable();
                  this.varValue_.addAll(var1.varValue_);
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

      public PartialVariableAssignment.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         PartialVariableAssignment var3 = null;

         try {
            var3 = (PartialVariableAssignment)PartialVariableAssignment.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (PartialVariableAssignment)var8.getUnfinishedMessage();
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
            this.varIndex_ = PartialVariableAssignment.mutableCopy(this.varIndex_);
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

      public PartialVariableAssignment.Builder setVarIndex(int var1, int var2) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder addVarIndex(int var1) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.addInt(var1);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder addAllVarIndex(Iterable var1) {
         this.ensureVarIndexIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.varIndex_);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder clearVarIndex() {
         this.varIndex_ = PartialVariableAssignment.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureVarValueIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.varValue_ = PartialVariableAssignment.mutableCopy(this.varValue_);
            this.bitField0_ |= 2;
         }

      }

      public List getVarValueList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.varValue_) : this.varValue_);
      }

      public int getVarValueCount() {
         return this.varValue_.size();
      }

      public double getVarValue(int var1) {
         return this.varValue_.getDouble(var1);
      }

      public PartialVariableAssignment.Builder setVarValue(int var1, double var2) {
         this.ensureVarValueIsMutable();
         this.varValue_.setDouble(var1, var2);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder addVarValue(double var1) {
         this.ensureVarValueIsMutable();
         this.varValue_.addDouble(var1);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder addAllVarValue(Iterable var1) {
         this.ensureVarValueIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.varValue_);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder clearVarValue() {
         this.varValue_ = PartialVariableAssignment.emptyDoubleList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public final PartialVariableAssignment.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PartialVariableAssignment.Builder)super.setUnknownFields(var1);
      }

      public final PartialVariableAssignment.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PartialVariableAssignment.Builder)super.mergeUnknownFields(var1);
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
