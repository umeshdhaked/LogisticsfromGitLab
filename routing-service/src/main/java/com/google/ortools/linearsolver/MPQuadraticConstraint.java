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

public final class MPQuadraticConstraint extends GeneratedMessageV3 implements MPQuadraticConstraintOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int VAR_INDEX_FIELD_NUMBER = 1;
   private IntList varIndex_;
   public static final int COEFFICIENT_FIELD_NUMBER = 2;
   private DoubleList coefficient_;
   public static final int QVAR1_INDEX_FIELD_NUMBER = 3;
   private IntList qvar1Index_;
   public static final int QVAR2_INDEX_FIELD_NUMBER = 4;
   private IntList qvar2Index_;
   public static final int QCOEFFICIENT_FIELD_NUMBER = 5;
   private DoubleList qcoefficient_;
   public static final int LOWER_BOUND_FIELD_NUMBER = 6;
   private double lowerBound_;
   public static final int UPPER_BOUND_FIELD_NUMBER = 7;
   private double upperBound_;
   private byte memoizedIsInitialized;
   private static final MPQuadraticConstraint DEFAULT_INSTANCE = new MPQuadraticConstraint();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPQuadraticConstraint parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPQuadraticConstraint(var1, var2);
      }
   };

   private MPQuadraticConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPQuadraticConstraint() {
      this.memoizedIsInitialized = -1;
      this.varIndex_ = emptyIntList();
      this.coefficient_ = emptyDoubleList();
      this.qvar1Index_ = emptyIntList();
      this.qvar2Index_ = emptyIntList();
      this.qcoefficient_ = emptyDoubleList();
      this.lowerBound_ = Double.NEGATIVE_INFINITY;
      this.upperBound_ = Double.POSITIVE_INFINITY;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPQuadraticConstraint();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPQuadraticConstraint(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         int var3 = 0;
         com.google.protobuf.UnknownFieldSet.Builder var4 = UnknownFieldSet.newBuilder();

         try {
            boolean var5 = false;

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
                     this.coefficient_ = newDoubleList();
                     var3 |= 2;
                  }

                  this.coefficient_.addDouble(var1.readDouble());
                  continue;
               case 18:
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
               case 24:
                  if ((var3 & 4) == 0) {
                     this.qvar1Index_ = newIntList();
                     var3 |= 4;
                  }

                  this.qvar1Index_.addInt(var1.readInt32());
                  continue;
               case 26:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 4) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.qvar1Index_ = newIntList();
                     var3 |= 4;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.qvar1Index_.addInt(var1.readInt32());
                  }

                  var1.popLimit(var8);
                  continue;
               case 32:
                  if ((var3 & 8) == 0) {
                     this.qvar2Index_ = newIntList();
                     var3 |= 8;
                  }

                  this.qvar2Index_.addInt(var1.readInt32());
                  continue;
               case 34:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 8) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.qvar2Index_ = newIntList();
                     var3 |= 8;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.qvar2Index_.addInt(var1.readInt32());
                  }

                  var1.popLimit(var8);
                  continue;
               case 41:
                  if ((var3 & 16) == 0) {
                     this.qcoefficient_ = newDoubleList();
                     var3 |= 16;
                  }

                  this.qcoefficient_.addDouble(var1.readDouble());
                  continue;
               case 42:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 16) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.qcoefficient_ = newDoubleList();
                     var3 |= 16;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.qcoefficient_.addDouble(var1.readDouble());
                  }

                  var1.popLimit(var8);
                  continue;
               case 49:
                  this.bitField0_ |= 1;
                  this.lowerBound_ = var1.readDouble();
                  continue;
               case 57:
                  this.bitField0_ |= 2;
                  this.upperBound_ = var1.readDouble();
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

            if ((var3 & 4) != 0) {
               this.qvar1Index_.makeImmutable();
            }

            if ((var3 & 8) != 0) {
               this.qvar2Index_.makeImmutable();
            }

            if ((var3 & 16) != 0) {
               this.qcoefficient_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPQuadraticConstraint_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPQuadraticConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPQuadraticConstraint.class, MPQuadraticConstraint.Builder.class);
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

   public List getQvar1IndexList() {
      return this.qvar1Index_;
   }

   public int getQvar1IndexCount() {
      return this.qvar1Index_.size();
   }

   public int getQvar1Index(int var1) {
      return this.qvar1Index_.getInt(var1);
   }

   public List getQvar2IndexList() {
      return this.qvar2Index_;
   }

   public int getQvar2IndexCount() {
      return this.qvar2Index_.size();
   }

   public int getQvar2Index(int var1) {
      return this.qvar2Index_.getInt(var1);
   }

   public List getQcoefficientList() {
      return this.qcoefficient_;
   }

   public int getQcoefficientCount() {
      return this.qcoefficient_.size();
   }

   public double getQcoefficient(int var1) {
      return this.qcoefficient_.getDouble(var1);
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
      int var2;
      for(var2 = 0; var2 < this.varIndex_.size(); ++var2) {
         var1.writeInt32(1, this.varIndex_.getInt(var2));
      }

      for(var2 = 0; var2 < this.coefficient_.size(); ++var2) {
         var1.writeDouble(2, this.coefficient_.getDouble(var2));
      }

      for(var2 = 0; var2 < this.qvar1Index_.size(); ++var2) {
         var1.writeInt32(3, this.qvar1Index_.getInt(var2));
      }

      for(var2 = 0; var2 < this.qvar2Index_.size(); ++var2) {
         var1.writeInt32(4, this.qvar2Index_.getInt(var2));
      }

      for(var2 = 0; var2 < this.qcoefficient_.size(); ++var2) {
         var1.writeDouble(5, this.qcoefficient_.getDouble(var2));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeDouble(6, this.lowerBound_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeDouble(7, this.upperBound_);
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

         int var3;
         for(var3 = 0; var3 < this.varIndex_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.varIndex_.getInt(var3));
         }

         var1 = var4 + var2;
         var1 += 1 * this.getVarIndexList().size();
         boolean var5 = false;
         var2 = 8 * this.getCoefficientList().size();
         var1 += var2;
         var1 += 1 * this.getCoefficientList().size();
         var2 = 0;

         for(var3 = 0; var3 < this.qvar1Index_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.qvar1Index_.getInt(var3));
         }

         var1 += var2;
         var1 += 1 * this.getQvar1IndexList().size();
         var2 = 0;

         for(var3 = 0; var3 < this.qvar2Index_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.qvar2Index_.getInt(var3));
         }

         var1 += var2;
         var1 += 1 * this.getQvar2IndexList().size();
         var5 = false;
         var2 = 8 * this.getQcoefficientList().size();
         var1 += var2;
         var1 += 1 * this.getQcoefficientList().size();
         if ((this.bitField0_ & 1) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(6, this.lowerBound_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(7, this.upperBound_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPQuadraticConstraint)) {
         return super.equals(var1);
      } else {
         MPQuadraticConstraint var2 = (MPQuadraticConstraint)var1;
         if (!this.getVarIndexList().equals(var2.getVarIndexList())) {
            return false;
         } else if (!this.getCoefficientList().equals(var2.getCoefficientList())) {
            return false;
         } else if (!this.getQvar1IndexList().equals(var2.getQvar1IndexList())) {
            return false;
         } else if (!this.getQvar2IndexList().equals(var2.getQvar2IndexList())) {
            return false;
         } else if (!this.getQcoefficientList().equals(var2.getQcoefficientList())) {
            return false;
         } else if (this.hasLowerBound() != var2.hasLowerBound()) {
            return false;
         } else if (this.hasLowerBound() && Double.doubleToLongBits(this.getLowerBound()) != Double.doubleToLongBits(var2.getLowerBound())) {
            return false;
         } else if (this.hasUpperBound() != var2.hasUpperBound()) {
            return false;
         } else if (this.hasUpperBound() && Double.doubleToLongBits(this.getUpperBound()) != Double.doubleToLongBits(var2.getUpperBound())) {
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

         if (this.getCoefficientCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getCoefficientList().hashCode();
         }

         if (this.getQvar1IndexCount() > 0) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getQvar1IndexList().hashCode();
         }

         if (this.getQvar2IndexCount() > 0) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getQvar2IndexList().hashCode();
         }

         if (this.getQcoefficientCount() > 0) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.getQcoefficientList().hashCode();
         }

         if (this.hasLowerBound()) {
            var2 = 37 * var2 + 6;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getLowerBound()));
         }

         if (this.hasUpperBound()) {
            var2 = 37 * var2 + 7;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getUpperBound()));
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPQuadraticConstraint parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPQuadraticConstraint)PARSER.parseFrom(var0);
   }

   public static MPQuadraticConstraint parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPQuadraticConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPQuadraticConstraint parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPQuadraticConstraint)PARSER.parseFrom(var0);
   }

   public static MPQuadraticConstraint parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPQuadraticConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPQuadraticConstraint parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPQuadraticConstraint)PARSER.parseFrom(var0);
   }

   public static MPQuadraticConstraint parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPQuadraticConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPQuadraticConstraint parseFrom(InputStream var0) throws IOException {
      return (MPQuadraticConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPQuadraticConstraint parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPQuadraticConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPQuadraticConstraint parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPQuadraticConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPQuadraticConstraint parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPQuadraticConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPQuadraticConstraint parseFrom(CodedInputStream var0) throws IOException {
      return (MPQuadraticConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPQuadraticConstraint parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPQuadraticConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPQuadraticConstraint.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPQuadraticConstraint.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPQuadraticConstraint.Builder newBuilder(MPQuadraticConstraint var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPQuadraticConstraint.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPQuadraticConstraint.Builder() : (new MPQuadraticConstraint.Builder()).mergeFrom(this);
   }

   protected MPQuadraticConstraint.Builder newBuilderForType(BuilderParent var1) {
      MPQuadraticConstraint.Builder var2 = new MPQuadraticConstraint.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPQuadraticConstraint getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPQuadraticConstraint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPQuadraticConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPQuadraticConstraint(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPQuadraticConstraintOrBuilder {
      private int bitField0_;
      private IntList varIndex_;
      private DoubleList coefficient_;
      private IntList qvar1Index_;
      private IntList qvar2Index_;
      private DoubleList qcoefficient_;
      private double lowerBound_;
      private double upperBound_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPQuadraticConstraint_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPQuadraticConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPQuadraticConstraint.class, MPQuadraticConstraint.Builder.class);
      }

      private Builder() {
         this.varIndex_ = MPQuadraticConstraint.emptyIntList();
         this.coefficient_ = MPQuadraticConstraint.emptyDoubleList();
         this.qvar1Index_ = MPQuadraticConstraint.emptyIntList();
         this.qvar2Index_ = MPQuadraticConstraint.emptyIntList();
         this.qcoefficient_ = MPQuadraticConstraint.emptyDoubleList();
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.varIndex_ = MPQuadraticConstraint.emptyIntList();
         this.coefficient_ = MPQuadraticConstraint.emptyDoubleList();
         this.qvar1Index_ = MPQuadraticConstraint.emptyIntList();
         this.qvar2Index_ = MPQuadraticConstraint.emptyIntList();
         this.qcoefficient_ = MPQuadraticConstraint.emptyDoubleList();
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPQuadraticConstraint.alwaysUseFieldBuilders) {
         }

      }

      public MPQuadraticConstraint.Builder clear() {
         super.clear();
         this.varIndex_ = MPQuadraticConstraint.emptyIntList();
         this.bitField0_ &= -2;
         this.coefficient_ = MPQuadraticConstraint.emptyDoubleList();
         this.bitField0_ &= -3;
         this.qvar1Index_ = MPQuadraticConstraint.emptyIntList();
         this.bitField0_ &= -5;
         this.qvar2Index_ = MPQuadraticConstraint.emptyIntList();
         this.bitField0_ &= -9;
         this.qcoefficient_ = MPQuadraticConstraint.emptyDoubleList();
         this.bitField0_ &= -17;
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.bitField0_ &= -33;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.bitField0_ &= -65;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPQuadraticConstraint_descriptor;
      }

      public MPQuadraticConstraint getDefaultInstanceForType() {
         return MPQuadraticConstraint.getDefaultInstance();
      }

      public MPQuadraticConstraint build() {
         MPQuadraticConstraint var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPQuadraticConstraint buildPartial() {
         MPQuadraticConstraint var1 = new MPQuadraticConstraint(this);
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
         if ((this.bitField0_ & 4) != 0) {
            this.qvar1Index_.makeImmutable();
            this.bitField0_ &= -5;
         }

         var1.qvar1Index_ = this.qvar1Index_;
         if ((this.bitField0_ & 8) != 0) {
            this.qvar2Index_.makeImmutable();
            this.bitField0_ &= -9;
         }

         var1.qvar2Index_ = this.qvar2Index_;
         if ((this.bitField0_ & 16) != 0) {
            this.qcoefficient_.makeImmutable();
            this.bitField0_ &= -17;
         }

         var1.qcoefficient_ = this.qcoefficient_;
         if ((var2 & 32) != 0) {
            var3 |= 1;
         }

         var1.lowerBound_ = this.lowerBound_;
         if ((var2 & 64) != 0) {
            var3 |= 2;
         }

         var1.upperBound_ = this.upperBound_;
         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPQuadraticConstraint.Builder clone() {
         return (MPQuadraticConstraint.Builder)super.clone();
      }

      public MPQuadraticConstraint.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPQuadraticConstraint.Builder)super.setField(var1, var2);
      }

      public MPQuadraticConstraint.Builder clearField(FieldDescriptor var1) {
         return (MPQuadraticConstraint.Builder)super.clearField(var1);
      }

      public MPQuadraticConstraint.Builder clearOneof(OneofDescriptor var1) {
         return (MPQuadraticConstraint.Builder)super.clearOneof(var1);
      }

      public MPQuadraticConstraint.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPQuadraticConstraint.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPQuadraticConstraint.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPQuadraticConstraint.Builder)super.addRepeatedField(var1, var2);
      }

      public MPQuadraticConstraint.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPQuadraticConstraint) {
            return this.mergeFrom((MPQuadraticConstraint)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPQuadraticConstraint.Builder mergeFrom(MPQuadraticConstraint var1) {
         if (var1 == MPQuadraticConstraint.getDefaultInstance()) {
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

            if (!var1.qvar1Index_.isEmpty()) {
               if (this.qvar1Index_.isEmpty()) {
                  this.qvar1Index_ = var1.qvar1Index_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureQvar1IndexIsMutable();
                  this.qvar1Index_.addAll(var1.qvar1Index_);
               }

               this.onChanged();
            }

            if (!var1.qvar2Index_.isEmpty()) {
               if (this.qvar2Index_.isEmpty()) {
                  this.qvar2Index_ = var1.qvar2Index_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureQvar2IndexIsMutable();
                  this.qvar2Index_.addAll(var1.qvar2Index_);
               }

               this.onChanged();
            }

            if (!var1.qcoefficient_.isEmpty()) {
               if (this.qcoefficient_.isEmpty()) {
                  this.qcoefficient_ = var1.qcoefficient_;
                  this.bitField0_ &= -17;
               } else {
                  this.ensureQcoefficientIsMutable();
                  this.qcoefficient_.addAll(var1.qcoefficient_);
               }

               this.onChanged();
            }

            if (var1.hasLowerBound()) {
               this.setLowerBound(var1.getLowerBound());
            }

            if (var1.hasUpperBound()) {
               this.setUpperBound(var1.getUpperBound());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public MPQuadraticConstraint.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPQuadraticConstraint var3 = null;

         try {
            var3 = (MPQuadraticConstraint)MPQuadraticConstraint.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPQuadraticConstraint)var8.getUnfinishedMessage();
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
            this.varIndex_ = MPQuadraticConstraint.mutableCopy(this.varIndex_);
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

      public MPQuadraticConstraint.Builder setVarIndex(int var1, int var2) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder addVarIndex(int var1) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.addInt(var1);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder addAllVarIndex(Iterable var1) {
         this.ensureVarIndexIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.varIndex_);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder clearVarIndex() {
         this.varIndex_ = MPQuadraticConstraint.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureCoefficientIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.coefficient_ = MPQuadraticConstraint.mutableCopy(this.coefficient_);
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

      public MPQuadraticConstraint.Builder setCoefficient(int var1, double var2) {
         this.ensureCoefficientIsMutable();
         this.coefficient_.setDouble(var1, var2);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder addCoefficient(double var1) {
         this.ensureCoefficientIsMutable();
         this.coefficient_.addDouble(var1);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder addAllCoefficient(Iterable var1) {
         this.ensureCoefficientIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.coefficient_);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder clearCoefficient() {
         this.coefficient_ = MPQuadraticConstraint.emptyDoubleList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      private void ensureQvar1IndexIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.qvar1Index_ = MPQuadraticConstraint.mutableCopy(this.qvar1Index_);
            this.bitField0_ |= 4;
         }

      }

      public List getQvar1IndexList() {
         return (List)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.qvar1Index_) : this.qvar1Index_);
      }

      public int getQvar1IndexCount() {
         return this.qvar1Index_.size();
      }

      public int getQvar1Index(int var1) {
         return this.qvar1Index_.getInt(var1);
      }

      public MPQuadraticConstraint.Builder setQvar1Index(int var1, int var2) {
         this.ensureQvar1IndexIsMutable();
         this.qvar1Index_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder addQvar1Index(int var1) {
         this.ensureQvar1IndexIsMutable();
         this.qvar1Index_.addInt(var1);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder addAllQvar1Index(Iterable var1) {
         this.ensureQvar1IndexIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.qvar1Index_);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder clearQvar1Index() {
         this.qvar1Index_ = MPQuadraticConstraint.emptyIntList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      private void ensureQvar2IndexIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.qvar2Index_ = MPQuadraticConstraint.mutableCopy(this.qvar2Index_);
            this.bitField0_ |= 8;
         }

      }

      public List getQvar2IndexList() {
         return (List)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.qvar2Index_) : this.qvar2Index_);
      }

      public int getQvar2IndexCount() {
         return this.qvar2Index_.size();
      }

      public int getQvar2Index(int var1) {
         return this.qvar2Index_.getInt(var1);
      }

      public MPQuadraticConstraint.Builder setQvar2Index(int var1, int var2) {
         this.ensureQvar2IndexIsMutable();
         this.qvar2Index_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder addQvar2Index(int var1) {
         this.ensureQvar2IndexIsMutable();
         this.qvar2Index_.addInt(var1);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder addAllQvar2Index(Iterable var1) {
         this.ensureQvar2IndexIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.qvar2Index_);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder clearQvar2Index() {
         this.qvar2Index_ = MPQuadraticConstraint.emptyIntList();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      private void ensureQcoefficientIsMutable() {
         if ((this.bitField0_ & 16) == 0) {
            this.qcoefficient_ = MPQuadraticConstraint.mutableCopy(this.qcoefficient_);
            this.bitField0_ |= 16;
         }

      }

      public List getQcoefficientList() {
         return (List)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.qcoefficient_) : this.qcoefficient_);
      }

      public int getQcoefficientCount() {
         return this.qcoefficient_.size();
      }

      public double getQcoefficient(int var1) {
         return this.qcoefficient_.getDouble(var1);
      }

      public MPQuadraticConstraint.Builder setQcoefficient(int var1, double var2) {
         this.ensureQcoefficientIsMutable();
         this.qcoefficient_.setDouble(var1, var2);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder addQcoefficient(double var1) {
         this.ensureQcoefficientIsMutable();
         this.qcoefficient_.addDouble(var1);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder addAllQcoefficient(Iterable var1) {
         this.ensureQcoefficientIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.qcoefficient_);
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder clearQcoefficient() {
         this.qcoefficient_ = MPQuadraticConstraint.emptyDoubleList();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public boolean hasLowerBound() {
         return (this.bitField0_ & 32) != 0;
      }

      public double getLowerBound() {
         return this.lowerBound_;
      }

      public MPQuadraticConstraint.Builder setLowerBound(double var1) {
         this.bitField0_ |= 32;
         this.lowerBound_ = var1;
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder clearLowerBound() {
         this.bitField0_ &= -33;
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.onChanged();
         return this;
      }

      public boolean hasUpperBound() {
         return (this.bitField0_ & 64) != 0;
      }

      public double getUpperBound() {
         return this.upperBound_;
      }

      public MPQuadraticConstraint.Builder setUpperBound(double var1) {
         this.bitField0_ |= 64;
         this.upperBound_ = var1;
         this.onChanged();
         return this;
      }

      public MPQuadraticConstraint.Builder clearUpperBound() {
         this.bitField0_ &= -65;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.onChanged();
         return this;
      }

      public final MPQuadraticConstraint.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPQuadraticConstraint.Builder)super.setUnknownFields(var1);
      }

      public final MPQuadraticConstraint.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPQuadraticConstraint.Builder)super.mergeUnknownFields(var1);
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
