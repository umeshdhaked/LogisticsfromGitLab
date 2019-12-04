package com.google.ortools.linearsolver;

import com.google.ortools.util.OptionalBoolean;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.Internal.EnumLiteMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class MPSolverCommonParameters extends GeneratedMessageV3 implements MPSolverCommonParametersOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int RELATIVE_MIP_GAP_FIELD_NUMBER = 1;
   private OptionalDouble relativeMipGap_;
   public static final int PRIMAL_TOLERANCE_FIELD_NUMBER = 2;
   private OptionalDouble primalTolerance_;
   public static final int DUAL_TOLERANCE_FIELD_NUMBER = 3;
   private OptionalDouble dualTolerance_;
   public static final int LP_ALGORITHM_FIELD_NUMBER = 4;
   private int lpAlgorithm_;
   public static final int PRESOLVE_FIELD_NUMBER = 5;
   private int presolve_;
   public static final int SCALING_FIELD_NUMBER = 7;
   private int scaling_;
   private byte memoizedIsInitialized;
   private static final MPSolverCommonParameters DEFAULT_INSTANCE = new MPSolverCommonParameters();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPSolverCommonParameters parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPSolverCommonParameters(var1, var2);
      }
   };

   private MPSolverCommonParameters(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPSolverCommonParameters() {
      this.memoizedIsInitialized = -1;
      this.lpAlgorithm_ = 0;
      this.presolve_ = 0;
      this.scaling_ = 0;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPSolverCommonParameters();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPSolverCommonParameters(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
               int var7;
               OptionalBoolean var8;
               OptionalDouble.Builder var16;
               switch(var6) {
               case 0:
                  var5 = true;
                  break;
               case 10:
                  var16 = null;
                  if ((this.bitField0_ & 1) != 0) {
                     var16 = this.relativeMipGap_.toBuilder();
                  }

                  this.relativeMipGap_ = (OptionalDouble)var1.readMessage(OptionalDouble.PARSER, var2);
                  if (var16 != null) {
                     var16.mergeFrom(this.relativeMipGap_);
                     this.relativeMipGap_ = var16.buildPartial();
                  }

                  this.bitField0_ |= 1;
                  break;
               case 18:
                  var16 = null;
                  if ((this.bitField0_ & 2) != 0) {
                     var16 = this.primalTolerance_.toBuilder();
                  }

                  this.primalTolerance_ = (OptionalDouble)var1.readMessage(OptionalDouble.PARSER, var2);
                  if (var16 != null) {
                     var16.mergeFrom(this.primalTolerance_);
                     this.primalTolerance_ = var16.buildPartial();
                  }

                  this.bitField0_ |= 2;
                  break;
               case 26:
                  var16 = null;
                  if ((this.bitField0_ & 4) != 0) {
                     var16 = this.dualTolerance_.toBuilder();
                  }

                  this.dualTolerance_ = (OptionalDouble)var1.readMessage(OptionalDouble.PARSER, var2);
                  if (var16 != null) {
                     var16.mergeFrom(this.dualTolerance_);
                     this.dualTolerance_ = var16.buildPartial();
                  }

                  this.bitField0_ |= 4;
                  break;
               case 32:
                  var7 = var1.readEnum();
                  MPSolverCommonParameters.LPAlgorithmValues var17 = MPSolverCommonParameters.LPAlgorithmValues.valueOf(var7);
                  if (var17 == null) {
                     var4.mergeVarintField(4, var7);
                  } else {
                     this.bitField0_ |= 8;
                     this.lpAlgorithm_ = var7;
                  }
                  break;
               case 40:
                  var7 = var1.readEnum();
                  var8 = OptionalBoolean.valueOf(var7);
                  if (var8 == null) {
                     var4.mergeVarintField(5, var7);
                  } else {
                     this.bitField0_ |= 16;
                     this.presolve_ = var7;
                  }
                  break;
               case 56:
                  var7 = var1.readEnum();
                  var8 = OptionalBoolean.valueOf(var7);
                  if (var8 == null) {
                     var4.mergeVarintField(7, var7);
                  } else {
                     this.bitField0_ |= 32;
                     this.scaling_ = var7;
                  }
                  break;
               default:
                  if (!this.parseUnknownField(var1, var4, var2, var6)) {
                     var5 = true;
                  }
               }
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPSolverCommonParameters_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPSolverCommonParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(MPSolverCommonParameters.class, MPSolverCommonParameters.Builder.class);
   }

   public boolean hasRelativeMipGap() {
      return (this.bitField0_ & 1) != 0;
   }

   public OptionalDouble getRelativeMipGap() {
      return this.relativeMipGap_ == null ? OptionalDouble.getDefaultInstance() : this.relativeMipGap_;
   }

   public OptionalDoubleOrBuilder getRelativeMipGapOrBuilder() {
      return this.relativeMipGap_ == null ? OptionalDouble.getDefaultInstance() : this.relativeMipGap_;
   }

   public boolean hasPrimalTolerance() {
      return (this.bitField0_ & 2) != 0;
   }

   public OptionalDouble getPrimalTolerance() {
      return this.primalTolerance_ == null ? OptionalDouble.getDefaultInstance() : this.primalTolerance_;
   }

   public OptionalDoubleOrBuilder getPrimalToleranceOrBuilder() {
      return this.primalTolerance_ == null ? OptionalDouble.getDefaultInstance() : this.primalTolerance_;
   }

   public boolean hasDualTolerance() {
      return (this.bitField0_ & 4) != 0;
   }

   public OptionalDouble getDualTolerance() {
      return this.dualTolerance_ == null ? OptionalDouble.getDefaultInstance() : this.dualTolerance_;
   }

   public OptionalDoubleOrBuilder getDualToleranceOrBuilder() {
      return this.dualTolerance_ == null ? OptionalDouble.getDefaultInstance() : this.dualTolerance_;
   }

   public boolean hasLpAlgorithm() {
      return (this.bitField0_ & 8) != 0;
   }

   public MPSolverCommonParameters.LPAlgorithmValues getLpAlgorithm() {
      MPSolverCommonParameters.LPAlgorithmValues var1 = MPSolverCommonParameters.LPAlgorithmValues.valueOf(this.lpAlgorithm_);
      return var1 == null ? MPSolverCommonParameters.LPAlgorithmValues.LP_ALGO_UNSPECIFIED : var1;
   }

   public boolean hasPresolve() {
      return (this.bitField0_ & 16) != 0;
   }

   public OptionalBoolean getPresolve() {
      OptionalBoolean var1 = OptionalBoolean.valueOf(this.presolve_);
      return var1 == null ? OptionalBoolean.BOOL_UNSPECIFIED : var1;
   }

   public boolean hasScaling() {
      return (this.bitField0_ & 32) != 0;
   }

   public OptionalBoolean getScaling() {
      OptionalBoolean var1 = OptionalBoolean.valueOf(this.scaling_);
      return var1 == null ? OptionalBoolean.BOOL_UNSPECIFIED : var1;
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
         var1.writeMessage(1, this.getRelativeMipGap());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getPrimalTolerance());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getDualTolerance());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeEnum(4, this.lpAlgorithm_);
      }

      if ((this.bitField0_ & 16) != 0) {
         var1.writeEnum(5, this.presolve_);
      }

      if ((this.bitField0_ & 32) != 0) {
         var1.writeEnum(7, this.scaling_);
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
            var1 += CodedOutputStream.computeMessageSize(1, this.getRelativeMipGap());
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeMessageSize(2, this.getPrimalTolerance());
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += CodedOutputStream.computeMessageSize(3, this.getDualTolerance());
         }

         if ((this.bitField0_ & 8) != 0) {
            var1 += CodedOutputStream.computeEnumSize(4, this.lpAlgorithm_);
         }

         if ((this.bitField0_ & 16) != 0) {
            var1 += CodedOutputStream.computeEnumSize(5, this.presolve_);
         }

         if ((this.bitField0_ & 32) != 0) {
            var1 += CodedOutputStream.computeEnumSize(7, this.scaling_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPSolverCommonParameters)) {
         return super.equals(var1);
      } else {
         MPSolverCommonParameters var2 = (MPSolverCommonParameters)var1;
         if (this.hasRelativeMipGap() != var2.hasRelativeMipGap()) {
            return false;
         } else if (this.hasRelativeMipGap() && !this.getRelativeMipGap().equals(var2.getRelativeMipGap())) {
            return false;
         } else if (this.hasPrimalTolerance() != var2.hasPrimalTolerance()) {
            return false;
         } else if (this.hasPrimalTolerance() && !this.getPrimalTolerance().equals(var2.getPrimalTolerance())) {
            return false;
         } else if (this.hasDualTolerance() != var2.hasDualTolerance()) {
            return false;
         } else if (this.hasDualTolerance() && !this.getDualTolerance().equals(var2.getDualTolerance())) {
            return false;
         } else if (this.hasLpAlgorithm() != var2.hasLpAlgorithm()) {
            return false;
         } else if (this.hasLpAlgorithm() && this.lpAlgorithm_ != var2.lpAlgorithm_) {
            return false;
         } else if (this.hasPresolve() != var2.hasPresolve()) {
            return false;
         } else if (this.hasPresolve() && this.presolve_ != var2.presolve_) {
            return false;
         } else if (this.hasScaling() != var2.hasScaling()) {
            return false;
         } else if (this.hasScaling() && this.scaling_ != var2.scaling_) {
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
         if (this.hasRelativeMipGap()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getRelativeMipGap().hashCode();
         }

         if (this.hasPrimalTolerance()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getPrimalTolerance().hashCode();
         }

         if (this.hasDualTolerance()) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getDualTolerance().hashCode();
         }

         if (this.hasLpAlgorithm()) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.lpAlgorithm_;
         }

         if (this.hasPresolve()) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.presolve_;
         }

         if (this.hasScaling()) {
            var2 = 37 * var2 + 7;
            var2 = 53 * var2 + this.scaling_;
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPSolverCommonParameters parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPSolverCommonParameters)PARSER.parseFrom(var0);
   }

   public static MPSolverCommonParameters parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPSolverCommonParameters)PARSER.parseFrom(var0, var1);
   }

   public static MPSolverCommonParameters parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPSolverCommonParameters)PARSER.parseFrom(var0);
   }

   public static MPSolverCommonParameters parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPSolverCommonParameters)PARSER.parseFrom(var0, var1);
   }

   public static MPSolverCommonParameters parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPSolverCommonParameters)PARSER.parseFrom(var0);
   }

   public static MPSolverCommonParameters parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPSolverCommonParameters)PARSER.parseFrom(var0, var1);
   }

   public static MPSolverCommonParameters parseFrom(InputStream var0) throws IOException {
      return (MPSolverCommonParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPSolverCommonParameters parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPSolverCommonParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPSolverCommonParameters parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPSolverCommonParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPSolverCommonParameters parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPSolverCommonParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPSolverCommonParameters parseFrom(CodedInputStream var0) throws IOException {
      return (MPSolverCommonParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPSolverCommonParameters parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPSolverCommonParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPSolverCommonParameters.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPSolverCommonParameters.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPSolverCommonParameters.Builder newBuilder(MPSolverCommonParameters var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPSolverCommonParameters.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPSolverCommonParameters.Builder() : (new MPSolverCommonParameters.Builder()).mergeFrom(this);
   }

   protected MPSolverCommonParameters.Builder newBuilderForType(BuilderParent var1) {
      MPSolverCommonParameters.Builder var2 = new MPSolverCommonParameters.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPSolverCommonParameters getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPSolverCommonParameters getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPSolverCommonParameters(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPSolverCommonParameters(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPSolverCommonParametersOrBuilder {
      private int bitField0_;
      private OptionalDouble relativeMipGap_;
      private SingleFieldBuilderV3 relativeMipGapBuilder_;
      private OptionalDouble primalTolerance_;
      private SingleFieldBuilderV3 primalToleranceBuilder_;
      private OptionalDouble dualTolerance_;
      private SingleFieldBuilderV3 dualToleranceBuilder_;
      private int lpAlgorithm_;
      private int presolve_;
      private int scaling_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPSolverCommonParameters_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPSolverCommonParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(MPSolverCommonParameters.class, MPSolverCommonParameters.Builder.class);
      }

      private Builder() {
         this.lpAlgorithm_ = 0;
         this.presolve_ = 0;
         this.scaling_ = 0;
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.lpAlgorithm_ = 0;
         this.presolve_ = 0;
         this.scaling_ = 0;
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPSolverCommonParameters.alwaysUseFieldBuilders) {
            this.getRelativeMipGapFieldBuilder();
            this.getPrimalToleranceFieldBuilder();
            this.getDualToleranceFieldBuilder();
         }

      }

      public MPSolverCommonParameters.Builder clear() {
         super.clear();
         if (this.relativeMipGapBuilder_ == null) {
            this.relativeMipGap_ = null;
         } else {
            this.relativeMipGapBuilder_.clear();
         }

         this.bitField0_ &= -2;
         if (this.primalToleranceBuilder_ == null) {
            this.primalTolerance_ = null;
         } else {
            this.primalToleranceBuilder_.clear();
         }

         this.bitField0_ &= -3;
         if (this.dualToleranceBuilder_ == null) {
            this.dualTolerance_ = null;
         } else {
            this.dualToleranceBuilder_.clear();
         }

         this.bitField0_ &= -5;
         this.lpAlgorithm_ = 0;
         this.bitField0_ &= -9;
         this.presolve_ = 0;
         this.bitField0_ &= -17;
         this.scaling_ = 0;
         this.bitField0_ &= -33;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPSolverCommonParameters_descriptor;
      }

      public MPSolverCommonParameters getDefaultInstanceForType() {
         return MPSolverCommonParameters.getDefaultInstance();
      }

      public MPSolverCommonParameters build() {
         MPSolverCommonParameters var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPSolverCommonParameters buildPartial() {
         MPSolverCommonParameters var1 = new MPSolverCommonParameters(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((var2 & 1) != 0) {
            if (this.relativeMipGapBuilder_ == null) {
               var1.relativeMipGap_ = this.relativeMipGap_;
            } else {
               var1.relativeMipGap_ = (OptionalDouble)this.relativeMipGapBuilder_.build();
            }

            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            if (this.primalToleranceBuilder_ == null) {
               var1.primalTolerance_ = this.primalTolerance_;
            } else {
               var1.primalTolerance_ = (OptionalDouble)this.primalToleranceBuilder_.build();
            }

            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            if (this.dualToleranceBuilder_ == null) {
               var1.dualTolerance_ = this.dualTolerance_;
            } else {
               var1.dualTolerance_ = (OptionalDouble)this.dualToleranceBuilder_.build();
            }

            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var3 |= 8;
         }

         var1.lpAlgorithm_ = this.lpAlgorithm_;
         if ((var2 & 16) != 0) {
            var3 |= 16;
         }

         var1.presolve_ = this.presolve_;
         if ((var2 & 32) != 0) {
            var3 |= 32;
         }

         var1.scaling_ = this.scaling_;
         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPSolverCommonParameters.Builder clone() {
         return (MPSolverCommonParameters.Builder)super.clone();
      }

      public MPSolverCommonParameters.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPSolverCommonParameters.Builder)super.setField(var1, var2);
      }

      public MPSolverCommonParameters.Builder clearField(FieldDescriptor var1) {
         return (MPSolverCommonParameters.Builder)super.clearField(var1);
      }

      public MPSolverCommonParameters.Builder clearOneof(OneofDescriptor var1) {
         return (MPSolverCommonParameters.Builder)super.clearOneof(var1);
      }

      public MPSolverCommonParameters.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPSolverCommonParameters.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPSolverCommonParameters.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPSolverCommonParameters.Builder)super.addRepeatedField(var1, var2);
      }

      public MPSolverCommonParameters.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPSolverCommonParameters) {
            return this.mergeFrom((MPSolverCommonParameters)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPSolverCommonParameters.Builder mergeFrom(MPSolverCommonParameters var1) {
         if (var1 == MPSolverCommonParameters.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasRelativeMipGap()) {
               this.mergeRelativeMipGap(var1.getRelativeMipGap());
            }

            if (var1.hasPrimalTolerance()) {
               this.mergePrimalTolerance(var1.getPrimalTolerance());
            }

            if (var1.hasDualTolerance()) {
               this.mergeDualTolerance(var1.getDualTolerance());
            }

            if (var1.hasLpAlgorithm()) {
               this.setLpAlgorithm(var1.getLpAlgorithm());
            }

            if (var1.hasPresolve()) {
               this.setPresolve(var1.getPresolve());
            }

            if (var1.hasScaling()) {
               this.setScaling(var1.getScaling());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public MPSolverCommonParameters.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPSolverCommonParameters var3 = null;

         try {
            var3 = (MPSolverCommonParameters)MPSolverCommonParameters.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPSolverCommonParameters)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public boolean hasRelativeMipGap() {
         return (this.bitField0_ & 1) != 0;
      }

      public OptionalDouble getRelativeMipGap() {
         if (this.relativeMipGapBuilder_ == null) {
            return this.relativeMipGap_ == null ? OptionalDouble.getDefaultInstance() : this.relativeMipGap_;
         } else {
            return (OptionalDouble)this.relativeMipGapBuilder_.getMessage();
         }
      }

      public MPSolverCommonParameters.Builder setRelativeMipGap(OptionalDouble var1) {
         if (this.relativeMipGapBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.relativeMipGap_ = var1;
            this.onChanged();
         } else {
            this.relativeMipGapBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         return this;
      }

      public MPSolverCommonParameters.Builder setRelativeMipGap(OptionalDouble.Builder var1) {
         if (this.relativeMipGapBuilder_ == null) {
            this.relativeMipGap_ = var1.build();
            this.onChanged();
         } else {
            this.relativeMipGapBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         return this;
      }

      public MPSolverCommonParameters.Builder mergeRelativeMipGap(OptionalDouble var1) {
         if (this.relativeMipGapBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.relativeMipGap_ != null && this.relativeMipGap_ != OptionalDouble.getDefaultInstance()) {
               this.relativeMipGap_ = OptionalDouble.newBuilder(this.relativeMipGap_).mergeFrom(var1).buildPartial();
            } else {
               this.relativeMipGap_ = var1;
            }

            this.onChanged();
         } else {
            this.relativeMipGapBuilder_.mergeFrom(var1);
         }

         this.bitField0_ |= 1;
         return this;
      }

      public MPSolverCommonParameters.Builder clearRelativeMipGap() {
         if (this.relativeMipGapBuilder_ == null) {
            this.relativeMipGap_ = null;
            this.onChanged();
         } else {
            this.relativeMipGapBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      public OptionalDouble.Builder getRelativeMipGapBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return (OptionalDouble.Builder)this.getRelativeMipGapFieldBuilder().getBuilder();
      }

      public OptionalDoubleOrBuilder getRelativeMipGapOrBuilder() {
         if (this.relativeMipGapBuilder_ != null) {
            return (OptionalDoubleOrBuilder)this.relativeMipGapBuilder_.getMessageOrBuilder();
         } else {
            return this.relativeMipGap_ == null ? OptionalDouble.getDefaultInstance() : this.relativeMipGap_;
         }
      }

      private SingleFieldBuilderV3 getRelativeMipGapFieldBuilder() {
         if (this.relativeMipGapBuilder_ == null) {
            this.relativeMipGapBuilder_ = new SingleFieldBuilderV3(this.getRelativeMipGap(), this.getParentForChildren(), this.isClean());
            this.relativeMipGap_ = null;
         }

         return this.relativeMipGapBuilder_;
      }

      public boolean hasPrimalTolerance() {
         return (this.bitField0_ & 2) != 0;
      }

      public OptionalDouble getPrimalTolerance() {
         if (this.primalToleranceBuilder_ == null) {
            return this.primalTolerance_ == null ? OptionalDouble.getDefaultInstance() : this.primalTolerance_;
         } else {
            return (OptionalDouble)this.primalToleranceBuilder_.getMessage();
         }
      }

      public MPSolverCommonParameters.Builder setPrimalTolerance(OptionalDouble var1) {
         if (this.primalToleranceBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.primalTolerance_ = var1;
            this.onChanged();
         } else {
            this.primalToleranceBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         return this;
      }

      public MPSolverCommonParameters.Builder setPrimalTolerance(OptionalDouble.Builder var1) {
         if (this.primalToleranceBuilder_ == null) {
            this.primalTolerance_ = var1.build();
            this.onChanged();
         } else {
            this.primalToleranceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         return this;
      }

      public MPSolverCommonParameters.Builder mergePrimalTolerance(OptionalDouble var1) {
         if (this.primalToleranceBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.primalTolerance_ != null && this.primalTolerance_ != OptionalDouble.getDefaultInstance()) {
               this.primalTolerance_ = OptionalDouble.newBuilder(this.primalTolerance_).mergeFrom(var1).buildPartial();
            } else {
               this.primalTolerance_ = var1;
            }

            this.onChanged();
         } else {
            this.primalToleranceBuilder_.mergeFrom(var1);
         }

         this.bitField0_ |= 2;
         return this;
      }

      public MPSolverCommonParameters.Builder clearPrimalTolerance() {
         if (this.primalToleranceBuilder_ == null) {
            this.primalTolerance_ = null;
            this.onChanged();
         } else {
            this.primalToleranceBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      public OptionalDouble.Builder getPrimalToleranceBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return (OptionalDouble.Builder)this.getPrimalToleranceFieldBuilder().getBuilder();
      }

      public OptionalDoubleOrBuilder getPrimalToleranceOrBuilder() {
         if (this.primalToleranceBuilder_ != null) {
            return (OptionalDoubleOrBuilder)this.primalToleranceBuilder_.getMessageOrBuilder();
         } else {
            return this.primalTolerance_ == null ? OptionalDouble.getDefaultInstance() : this.primalTolerance_;
         }
      }

      private SingleFieldBuilderV3 getPrimalToleranceFieldBuilder() {
         if (this.primalToleranceBuilder_ == null) {
            this.primalToleranceBuilder_ = new SingleFieldBuilderV3(this.getPrimalTolerance(), this.getParentForChildren(), this.isClean());
            this.primalTolerance_ = null;
         }

         return this.primalToleranceBuilder_;
      }

      public boolean hasDualTolerance() {
         return (this.bitField0_ & 4) != 0;
      }

      public OptionalDouble getDualTolerance() {
         if (this.dualToleranceBuilder_ == null) {
            return this.dualTolerance_ == null ? OptionalDouble.getDefaultInstance() : this.dualTolerance_;
         } else {
            return (OptionalDouble)this.dualToleranceBuilder_.getMessage();
         }
      }

      public MPSolverCommonParameters.Builder setDualTolerance(OptionalDouble var1) {
         if (this.dualToleranceBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.dualTolerance_ = var1;
            this.onChanged();
         } else {
            this.dualToleranceBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         return this;
      }

      public MPSolverCommonParameters.Builder setDualTolerance(OptionalDouble.Builder var1) {
         if (this.dualToleranceBuilder_ == null) {
            this.dualTolerance_ = var1.build();
            this.onChanged();
         } else {
            this.dualToleranceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         return this;
      }

      public MPSolverCommonParameters.Builder mergeDualTolerance(OptionalDouble var1) {
         if (this.dualToleranceBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.dualTolerance_ != null && this.dualTolerance_ != OptionalDouble.getDefaultInstance()) {
               this.dualTolerance_ = OptionalDouble.newBuilder(this.dualTolerance_).mergeFrom(var1).buildPartial();
            } else {
               this.dualTolerance_ = var1;
            }

            this.onChanged();
         } else {
            this.dualToleranceBuilder_.mergeFrom(var1);
         }

         this.bitField0_ |= 4;
         return this;
      }

      public MPSolverCommonParameters.Builder clearDualTolerance() {
         if (this.dualToleranceBuilder_ == null) {
            this.dualTolerance_ = null;
            this.onChanged();
         } else {
            this.dualToleranceBuilder_.clear();
         }

         this.bitField0_ &= -5;
         return this;
      }

      public OptionalDouble.Builder getDualToleranceBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return (OptionalDouble.Builder)this.getDualToleranceFieldBuilder().getBuilder();
      }

      public OptionalDoubleOrBuilder getDualToleranceOrBuilder() {
         if (this.dualToleranceBuilder_ != null) {
            return (OptionalDoubleOrBuilder)this.dualToleranceBuilder_.getMessageOrBuilder();
         } else {
            return this.dualTolerance_ == null ? OptionalDouble.getDefaultInstance() : this.dualTolerance_;
         }
      }

      private SingleFieldBuilderV3 getDualToleranceFieldBuilder() {
         if (this.dualToleranceBuilder_ == null) {
            this.dualToleranceBuilder_ = new SingleFieldBuilderV3(this.getDualTolerance(), this.getParentForChildren(), this.isClean());
            this.dualTolerance_ = null;
         }

         return this.dualToleranceBuilder_;
      }

      public boolean hasLpAlgorithm() {
         return (this.bitField0_ & 8) != 0;
      }

      public MPSolverCommonParameters.LPAlgorithmValues getLpAlgorithm() {
         MPSolverCommonParameters.LPAlgorithmValues var1 = MPSolverCommonParameters.LPAlgorithmValues.valueOf(this.lpAlgorithm_);
         return var1 == null ? MPSolverCommonParameters.LPAlgorithmValues.LP_ALGO_UNSPECIFIED : var1;
      }

      public MPSolverCommonParameters.Builder setLpAlgorithm(MPSolverCommonParameters.LPAlgorithmValues var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 8;
            this.lpAlgorithm_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public MPSolverCommonParameters.Builder clearLpAlgorithm() {
         this.bitField0_ &= -9;
         this.lpAlgorithm_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasPresolve() {
         return (this.bitField0_ & 16) != 0;
      }

      public OptionalBoolean getPresolve() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.presolve_);
         return var1 == null ? OptionalBoolean.BOOL_UNSPECIFIED : var1;
      }

      public MPSolverCommonParameters.Builder setPresolve(OptionalBoolean var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 16;
            this.presolve_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public MPSolverCommonParameters.Builder clearPresolve() {
         this.bitField0_ &= -17;
         this.presolve_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasScaling() {
         return (this.bitField0_ & 32) != 0;
      }

      public OptionalBoolean getScaling() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.scaling_);
         return var1 == null ? OptionalBoolean.BOOL_UNSPECIFIED : var1;
      }

      public MPSolverCommonParameters.Builder setScaling(OptionalBoolean var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 32;
            this.scaling_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public MPSolverCommonParameters.Builder clearScaling() {
         this.bitField0_ &= -33;
         this.scaling_ = 0;
         this.onChanged();
         return this;
      }

      public final MPSolverCommonParameters.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPSolverCommonParameters.Builder)super.setUnknownFields(var1);
      }

      public final MPSolverCommonParameters.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPSolverCommonParameters.Builder)super.mergeUnknownFields(var1);
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

   public static enum LPAlgorithmValues implements ProtocolMessageEnum {
      LP_ALGO_UNSPECIFIED(0),
      LP_ALGO_DUAL(1),
      LP_ALGO_PRIMAL(2),
      LP_ALGO_BARRIER(3);

      public static final int LP_ALGO_UNSPECIFIED_VALUE = 0;
      public static final int LP_ALGO_DUAL_VALUE = 1;
      public static final int LP_ALGO_PRIMAL_VALUE = 2;
      public static final int LP_ALGO_BARRIER_VALUE = 3;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public MPSolverCommonParameters.LPAlgorithmValues findValueByNumber(int var1) {
            return MPSolverCommonParameters.LPAlgorithmValues.forNumber(var1);
         }
      };
      private static final MPSolverCommonParameters.LPAlgorithmValues[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static MPSolverCommonParameters.LPAlgorithmValues valueOf(int var0) {
         return forNumber(var0);
      }

      public static MPSolverCommonParameters.LPAlgorithmValues forNumber(int var0) {
         switch(var0) {
         case 0:
            return LP_ALGO_UNSPECIFIED;
         case 1:
            return LP_ALGO_DUAL;
         case 2:
            return LP_ALGO_PRIMAL;
         case 3:
            return LP_ALGO_BARRIER;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)MPSolverCommonParameters.getDescriptor().getEnumTypes().get(0);
      }

      public static MPSolverCommonParameters.LPAlgorithmValues valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private LPAlgorithmValues(int var3) {
         this.value = var3;
      }
   }
}
