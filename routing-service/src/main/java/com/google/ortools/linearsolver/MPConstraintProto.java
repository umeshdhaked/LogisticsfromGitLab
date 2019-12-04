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
import com.google.protobuf.Internal.DoubleList;
import com.google.protobuf.Internal.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class MPConstraintProto extends GeneratedMessageV3 implements MPConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int VAR_INDEX_FIELD_NUMBER = 6;
   private IntList varIndex_;
   private int varIndexMemoizedSerializedSize;
   public static final int COEFFICIENT_FIELD_NUMBER = 7;
   private DoubleList coefficient_;
   private int coefficientMemoizedSerializedSize;
   public static final int LOWER_BOUND_FIELD_NUMBER = 2;
   private double lowerBound_;
   public static final int UPPER_BOUND_FIELD_NUMBER = 3;
   private double upperBound_;
   public static final int NAME_FIELD_NUMBER = 4;
   private volatile Object name_;
   public static final int IS_LAZY_FIELD_NUMBER = 5;
   private boolean isLazy_;
   private byte memoizedIsInitialized;
   private static final MPConstraintProto DEFAULT_INSTANCE = new MPConstraintProto();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPConstraintProto(var1, var2);
      }
   };

   private MPConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.varIndexMemoizedSerializedSize = -1;
      this.coefficientMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private MPConstraintProto() {
      this.varIndexMemoizedSerializedSize = -1;
      this.coefficientMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.varIndex_ = emptyIntList();
      this.coefficient_ = emptyDoubleList();
      this.lowerBound_ = Double.NEGATIVE_INFINITY;
      this.upperBound_ = Double.POSITIVE_INFINITY;
      this.name_ = "";
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                  case 17:
                     this.bitField0_ |= 1;
                     this.lowerBound_ = var1.readDouble();
                     continue;
                  case 25:
                     this.bitField0_ |= 2;
                     this.upperBound_ = var1.readDouble();
                     continue;
                  case 34:
                     ByteString var16 = var1.readBytes();
                     this.bitField0_ |= 4;
                     this.name_ = var16;
                     continue;
                  case 40:
                     this.bitField0_ |= 8;
                     this.isLazy_ = var1.readBool();
                     continue;
                  case 48:
                     if ((var3 & 1) == 0) {
                        this.varIndex_ = newIntList();
                        var3 |= 1;
                     }

                     this.varIndex_.addInt(var1.readInt32());
                     continue;
                  case 50:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.varIndex_ = newIntList();
                        var3 |= 1;
                     }
                     break;
                  case 57:
                     if ((var3 & 2) == 0) {
                        this.coefficient_ = newDoubleList();
                        var3 |= 2;
                     }

                     this.coefficient_.addDouble(var1.readDouble());
                     continue;
                  case 58:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.coefficient_ = newDoubleList();
                        var3 |= 2;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.coefficient_.addDouble(var1.readDouble());
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
               this.coefficient_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MPConstraintProto.class, MPConstraintProto.Builder.class);
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

   public List getCoefficientList() {
      return this.coefficient_;
   }

   public int getCoefficientCount() {
      return this.coefficient_.size();
   }

   public double getCoefficient(int var1) {
      return this.coefficient_.getDouble(var1);
   }

   public boolean hasLowerBound() {
      return (this.bitField0_ & 1) != 0;
   }

   public double getLowerBound() {
      return this.lowerBound_;
   }

   public boolean hasUpperBound() {
      return (this.bitField0_ & 2) != 0;
   }

   public double getUpperBound() {
      return this.upperBound_;
   }

   public boolean hasName() {
      return (this.bitField0_ & 4) != 0;
   }

   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.name_ = var3;
         }

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

   public boolean hasIsLazy() {
      return (this.bitField0_ & 8) != 0;
   }

   public boolean getIsLazy() {
      return this.isLazy_;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeDouble(2, this.lowerBound_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeDouble(3, this.upperBound_);
      }

      if ((this.bitField0_ & 4) != 0) {
         GeneratedMessageV3.writeString(var1, 4, this.name_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeBool(5, this.isLazy_);
      }

      if (this.getVarIndexList().size() > 0) {
         var1.writeUInt32NoTag(50);
         var1.writeUInt32NoTag(this.varIndexMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.varIndex_.size(); ++var2) {
         var1.writeInt32NoTag(this.varIndex_.getInt(var2));
      }

      if (this.getCoefficientList().size() > 0) {
         var1.writeUInt32NoTag(58);
         var1.writeUInt32NoTag(this.coefficientMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.coefficient_.size(); ++var2) {
         var1.writeDoubleNoTag(this.coefficient_.getDouble(var2));
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
            var1 += CodedOutputStream.computeDoubleSize(2, this.lowerBound_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(3, this.upperBound_);
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += GeneratedMessageV3.computeStringSize(4, this.name_);
         }

         if ((this.bitField0_ & 8) != 0) {
            var1 += CodedOutputStream.computeBoolSize(5, this.isLazy_);
         }

         int var2 = 0;

         for(int var3 = 0; var3 < this.varIndex_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.varIndex_.getInt(var3));
         }

         var1 += var2;
         if (!this.getVarIndexList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.varIndexMemoizedSerializedSize = var2;
         boolean var4 = false;
         var2 = 8 * this.getCoefficientList().size();
         var1 += var2;
         if (!this.getCoefficientList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.coefficientMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPConstraintProto)) {
         return super.equals(var1);
      } else {
         MPConstraintProto var2 = (MPConstraintProto)var1;
         if (!this.getVarIndexList().equals(var2.getVarIndexList())) {
            return false;
         } else if (!this.getCoefficientList().equals(var2.getCoefficientList())) {
            return false;
         } else if (this.hasLowerBound() != var2.hasLowerBound()) {
            return false;
         } else if (this.hasLowerBound() && Double.doubleToLongBits(this.getLowerBound()) != Double.doubleToLongBits(var2.getLowerBound())) {
            return false;
         } else if (this.hasUpperBound() != var2.hasUpperBound()) {
            return false;
         } else if (this.hasUpperBound() && Double.doubleToLongBits(this.getUpperBound()) != Double.doubleToLongBits(var2.getUpperBound())) {
            return false;
         } else if (this.hasName() != var2.hasName()) {
            return false;
         } else if (this.hasName() && !this.getName().equals(var2.getName())) {
            return false;
         } else if (this.hasIsLazy() != var2.hasIsLazy()) {
            return false;
         } else if (this.hasIsLazy() && this.getIsLazy() != var2.getIsLazy()) {
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
            var2 = 37 * var2 + 6;
            var2 = 53 * var2 + this.getVarIndexList().hashCode();
         }

         if (this.getCoefficientCount() > 0) {
            var2 = 37 * var2 + 7;
            var2 = 53 * var2 + this.getCoefficientList().hashCode();
         }

         if (this.hasLowerBound()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getLowerBound()));
         }

         if (this.hasUpperBound()) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getUpperBound()));
         }

         if (this.hasName()) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getName().hashCode();
         }

         if (this.hasIsLazy()) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + Internal.hashBoolean(this.getIsLazy());
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPConstraintProto)PARSER.parseFrom(var0);
   }

   public static MPConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static MPConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPConstraintProto)PARSER.parseFrom(var0);
   }

   public static MPConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static MPConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPConstraintProto)PARSER.parseFrom(var0);
   }

   public static MPConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static MPConstraintProto parseFrom(InputStream var0) throws IOException {
      return (MPConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (MPConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPConstraintProto.Builder newBuilder(MPConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPConstraintProto.Builder() : (new MPConstraintProto.Builder()).mergeFrom(this);
   }

   protected MPConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      MPConstraintProto.Builder var2 = new MPConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPConstraintProtoOrBuilder {
      private int bitField0_;
      private IntList varIndex_;
      private DoubleList coefficient_;
      private double lowerBound_;
      private double upperBound_;
      private Object name_;
      private boolean isLazy_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MPConstraintProto.class, MPConstraintProto.Builder.class);
      }

      private Builder() {
         this.varIndex_ = MPConstraintProto.emptyIntList();
         this.coefficient_ = MPConstraintProto.emptyDoubleList();
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.name_ = "";
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.varIndex_ = MPConstraintProto.emptyIntList();
         this.coefficient_ = MPConstraintProto.emptyDoubleList();
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.name_ = "";
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public MPConstraintProto.Builder clear() {
         super.clear();
         this.varIndex_ = MPConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.coefficient_ = MPConstraintProto.emptyDoubleList();
         this.bitField0_ &= -3;
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.bitField0_ &= -5;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.bitField0_ &= -9;
         this.name_ = "";
         this.bitField0_ &= -17;
         this.isLazy_ = false;
         this.bitField0_ &= -33;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPConstraintProto_descriptor;
      }

      public MPConstraintProto getDefaultInstanceForType() {
         return MPConstraintProto.getDefaultInstance();
      }

      public MPConstraintProto build() {
         MPConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPConstraintProto buildPartial() {
         MPConstraintProto var1 = new MPConstraintProto(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((this.bitField0_ & 1) != 0) {
            this.varIndex_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.varIndex_ = this.varIndex_;
         if ((this.bitField0_ & 2) != 0) {
            this.coefficient_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.coefficient_ = this.coefficient_;
         if ((var2 & 4) != 0) {
            var3 |= 1;
         }

         var1.lowerBound_ = this.lowerBound_;
         if ((var2 & 8) != 0) {
            var3 |= 2;
         }

         var1.upperBound_ = this.upperBound_;
         if ((var2 & 16) != 0) {
            var3 |= 4;
         }

         var1.name_ = this.name_;
         if ((var2 & 32) != 0) {
            var1.isLazy_ = this.isLazy_;
            var3 |= 8;
         }

         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPConstraintProto.Builder clone() {
         return (MPConstraintProto.Builder)super.clone();
      }

      public MPConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPConstraintProto.Builder)super.setField(var1, var2);
      }

      public MPConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (MPConstraintProto.Builder)super.clearField(var1);
      }

      public MPConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (MPConstraintProto.Builder)super.clearOneof(var1);
      }

      public MPConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public MPConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPConstraintProto) {
            return this.mergeFrom((MPConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPConstraintProto.Builder mergeFrom(MPConstraintProto var1) {
         if (var1 == MPConstraintProto.getDefaultInstance()) {
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

            if (!var1.coefficient_.isEmpty()) {
               if (this.coefficient_.isEmpty()) {
                  this.coefficient_ = var1.coefficient_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureCoefficientIsMutable();
                  this.coefficient_.addAll(var1.coefficient_);
               }

               this.onChanged();
            }

            if (var1.hasLowerBound()) {
               this.setLowerBound(var1.getLowerBound());
            }

            if (var1.hasUpperBound()) {
               this.setUpperBound(var1.getUpperBound());
            }

            if (var1.hasName()) {
               this.bitField0_ |= 16;
               this.name_ = var1.name_;
               this.onChanged();
            }

            if (var1.hasIsLazy()) {
               this.setIsLazy(var1.getIsLazy());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public MPConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPConstraintProto var3 = null;

         try {
            var3 = (MPConstraintProto)MPConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPConstraintProto)var8.getUnfinishedMessage();
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
            this.varIndex_ = MPConstraintProto.mutableCopy(this.varIndex_);
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

      public MPConstraintProto.Builder setVarIndex(int var1, int var2) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public MPConstraintProto.Builder addVarIndex(int var1) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.addInt(var1);
         this.onChanged();
         return this;
      }

      public MPConstraintProto.Builder addAllVarIndex(Iterable var1) {
         this.ensureVarIndexIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.varIndex_);
         this.onChanged();
         return this;
      }

      public MPConstraintProto.Builder clearVarIndex() {
         this.varIndex_ = MPConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureCoefficientIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.coefficient_ = MPConstraintProto.mutableCopy(this.coefficient_);
            this.bitField0_ |= 2;
         }

      }

      public List getCoefficientList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.coefficient_) : this.coefficient_);
      }

      public int getCoefficientCount() {
         return this.coefficient_.size();
      }

      public double getCoefficient(int var1) {
         return this.coefficient_.getDouble(var1);
      }

      public MPConstraintProto.Builder setCoefficient(int var1, double var2) {
         this.ensureCoefficientIsMutable();
         this.coefficient_.setDouble(var1, var2);
         this.onChanged();
         return this;
      }

      public MPConstraintProto.Builder addCoefficient(double var1) {
         this.ensureCoefficientIsMutable();
         this.coefficient_.addDouble(var1);
         this.onChanged();
         return this;
      }

      public MPConstraintProto.Builder addAllCoefficient(Iterable var1) {
         this.ensureCoefficientIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.coefficient_);
         this.onChanged();
         return this;
      }

      public MPConstraintProto.Builder clearCoefficient() {
         this.coefficient_ = MPConstraintProto.emptyDoubleList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public boolean hasLowerBound() {
         return (this.bitField0_ & 4) != 0;
      }

      public double getLowerBound() {
         return this.lowerBound_;
      }

      public MPConstraintProto.Builder setLowerBound(double var1) {
         this.bitField0_ |= 4;
         this.lowerBound_ = var1;
         this.onChanged();
         return this;
      }

      public MPConstraintProto.Builder clearLowerBound() {
         this.bitField0_ &= -5;
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.onChanged();
         return this;
      }

      public boolean hasUpperBound() {
         return (this.bitField0_ & 8) != 0;
      }

      public double getUpperBound() {
         return this.upperBound_;
      }

      public MPConstraintProto.Builder setUpperBound(double var1) {
         this.bitField0_ |= 8;
         this.upperBound_ = var1;
         this.onChanged();
         return this;
      }

      public MPConstraintProto.Builder clearUpperBound() {
         this.bitField0_ &= -9;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.onChanged();
         return this;
      }

      public boolean hasName() {
         return (this.bitField0_ & 16) != 0;
      }

      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (var2.isValidUtf8()) {
               this.name_ = var3;
            }

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

      public MPConstraintProto.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 16;
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      public MPConstraintProto.Builder clearName() {
         this.bitField0_ &= -17;
         this.name_ = MPConstraintProto.getDefaultInstance().getName();
         this.onChanged();
         return this;
      }

      public MPConstraintProto.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 16;
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      public boolean hasIsLazy() {
         return (this.bitField0_ & 32) != 0;
      }

      public boolean getIsLazy() {
         return this.isLazy_;
      }

      public MPConstraintProto.Builder setIsLazy(boolean var1) {
         this.bitField0_ |= 32;
         this.isLazy_ = var1;
         this.onChanged();
         return this;
      }

      public MPConstraintProto.Builder clearIsLazy() {
         this.bitField0_ &= -33;
         this.isLazy_ = false;
         this.onChanged();
         return this;
      }

      public final MPConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final MPConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPConstraintProto.Builder)super.mergeUnknownFields(var1);
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
