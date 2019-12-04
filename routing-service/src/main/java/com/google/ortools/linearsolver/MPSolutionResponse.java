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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class MPSolutionResponse extends GeneratedMessageV3 implements MPSolutionResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_;
   public static final int STATUS_STR_FIELD_NUMBER = 7;
   private volatile Object statusStr_;
   public static final int OBJECTIVE_VALUE_FIELD_NUMBER = 2;
   private double objectiveValue_;
   public static final int BEST_OBJECTIVE_BOUND_FIELD_NUMBER = 5;
   private double bestObjectiveBound_;
   public static final int VARIABLE_VALUE_FIELD_NUMBER = 3;
   private DoubleList variableValue_;
   private int variableValueMemoizedSerializedSize;
   public static final int DUAL_VALUE_FIELD_NUMBER = 4;
   private DoubleList dualValue_;
   private int dualValueMemoizedSerializedSize;
   public static final int REDUCED_COST_FIELD_NUMBER = 6;
   private DoubleList reducedCost_;
   private int reducedCostMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final MPSolutionResponse DEFAULT_INSTANCE = new MPSolutionResponse();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPSolutionResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPSolutionResponse(var1, var2);
      }
   };

   private MPSolutionResponse(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.variableValueMemoizedSerializedSize = -1;
      this.dualValueMemoizedSerializedSize = -1;
      this.reducedCostMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private MPSolutionResponse() {
      this.variableValueMemoizedSerializedSize = -1;
      this.dualValueMemoizedSerializedSize = -1;
      this.reducedCostMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.status_ = 99;
      this.statusStr_ = "";
      this.variableValue_ = emptyDoubleList();
      this.dualValue_ = emptyDoubleList();
      this.reducedCost_ = emptyDoubleList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPSolutionResponse();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPSolutionResponse(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                  int var8;
                  int var16;
                  switch(var6) {
                  case 0:
                     var5 = true;
                     continue;
                  case 8:
                     var16 = var1.readEnum();
                     MPSolverResponseStatus var17 = MPSolverResponseStatus.valueOf(var16);
                     if (var17 == null) {
                        var4.mergeVarintField(1, var16);
                     } else {
                        this.bitField0_ |= 1;
                        this.status_ = var16;
                     }
                     continue;
                  case 17:
                     this.bitField0_ |= 4;
                     this.objectiveValue_ = var1.readDouble();
                     continue;
                  case 25:
                     if ((var3 & 16) == 0) {
                        this.variableValue_ = newDoubleList();
                        var3 |= 16;
                     }

                     this.variableValue_.addDouble(var1.readDouble());
                     continue;
                  case 26:
                     var16 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var16);
                     if ((var3 & 16) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.variableValue_ = newDoubleList();
                        var3 |= 16;
                     }
                     break;
                  case 33:
                     if ((var3 & 32) == 0) {
                        this.dualValue_ = newDoubleList();
                        var3 |= 32;
                     }

                     this.dualValue_.addDouble(var1.readDouble());
                     continue;
                  case 34:
                     var16 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var16);
                     if ((var3 & 32) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.dualValue_ = newDoubleList();
                        var3 |= 32;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.dualValue_.addDouble(var1.readDouble());
                     }

                     var1.popLimit(var8);
                     continue;
                  case 41:
                     this.bitField0_ |= 8;
                     this.bestObjectiveBound_ = var1.readDouble();
                     continue;
                  case 49:
                     if ((var3 & 64) == 0) {
                        this.reducedCost_ = newDoubleList();
                        var3 |= 64;
                     }

                     this.reducedCost_.addDouble(var1.readDouble());
                     continue;
                  case 50:
                     var16 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var16);
                     if ((var3 & 64) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.reducedCost_ = newDoubleList();
                        var3 |= 64;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.reducedCost_.addDouble(var1.readDouble());
                     }

                     var1.popLimit(var8);
                     continue;
                  case 58:
                     ByteString var7 = var1.readBytes();
                     this.bitField0_ |= 2;
                     this.statusStr_ = var7;
                     continue;
                  default:
                     if (!this.parseUnknownField(var1, var4, var2, var6)) {
                        var5 = true;
                     }
                     continue;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.variableValue_.addDouble(var1.readDouble());
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
            if ((var3 & 16) != 0) {
               this.variableValue_.makeImmutable();
            }

            if ((var3 & 32) != 0) {
               this.dualValue_.makeImmutable();
            }

            if ((var3 & 64) != 0) {
               this.reducedCost_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPSolutionResponse_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPSolutionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(MPSolutionResponse.class, MPSolutionResponse.Builder.class);
   }

   public boolean hasStatus() {
      return (this.bitField0_ & 1) != 0;
   }

   public MPSolverResponseStatus getStatus() {
      MPSolverResponseStatus var1 = MPSolverResponseStatus.valueOf(this.status_);
      return var1 == null ? MPSolverResponseStatus.MPSOLVER_UNKNOWN_STATUS : var1;
   }

   public boolean hasStatusStr() {
      return (this.bitField0_ & 2) != 0;
   }

   public String getStatusStr() {
      Object var1 = this.statusStr_;
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.statusStr_ = var3;
         }

         return var3;
      }
   }

   public ByteString getStatusStrBytes() {
      Object var1 = this.statusStr_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.statusStr_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   public boolean hasObjectiveValue() {
      return (this.bitField0_ & 4) != 0;
   }

   public double getObjectiveValue() {
      return this.objectiveValue_;
   }

   public boolean hasBestObjectiveBound() {
      return (this.bitField0_ & 8) != 0;
   }

   public double getBestObjectiveBound() {
      return this.bestObjectiveBound_;
   }

   public List getVariableValueList() {
      return this.variableValue_;
   }

   public int getVariableValueCount() {
      return this.variableValue_.size();
   }

   public double getVariableValue(int var1) {
      return this.variableValue_.getDouble(var1);
   }

   public List getDualValueList() {
      return this.dualValue_;
   }

   public int getDualValueCount() {
      return this.dualValue_.size();
   }

   public double getDualValue(int var1) {
      return this.dualValue_.getDouble(var1);
   }

   public List getReducedCostList() {
      return this.reducedCost_;
   }

   public int getReducedCostCount() {
      return this.reducedCost_.size();
   }

   public double getReducedCost(int var1) {
      return this.reducedCost_.getDouble(var1);
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
         var1.writeEnum(1, this.status_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeDouble(2, this.objectiveValue_);
      }

      if (this.getVariableValueList().size() > 0) {
         var1.writeUInt32NoTag(26);
         var1.writeUInt32NoTag(this.variableValueMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.variableValue_.size(); ++var2) {
         var1.writeDoubleNoTag(this.variableValue_.getDouble(var2));
      }

      if (this.getDualValueList().size() > 0) {
         var1.writeUInt32NoTag(34);
         var1.writeUInt32NoTag(this.dualValueMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.dualValue_.size(); ++var2) {
         var1.writeDoubleNoTag(this.dualValue_.getDouble(var2));
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeDouble(5, this.bestObjectiveBound_);
      }

      if (this.getReducedCostList().size() > 0) {
         var1.writeUInt32NoTag(50);
         var1.writeUInt32NoTag(this.reducedCostMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.reducedCost_.size(); ++var2) {
         var1.writeDoubleNoTag(this.reducedCost_.getDouble(var2));
      }

      if ((this.bitField0_ & 2) != 0) {
         GeneratedMessageV3.writeString(var1, 7, this.statusStr_);
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
            var1 += CodedOutputStream.computeEnumSize(1, this.status_);
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(2, this.objectiveValue_);
         }

         boolean var2 = false;
         int var3 = 8 * this.getVariableValueList().size();
         var1 += var3;
         if (!this.getVariableValueList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.variableValueMemoizedSerializedSize = var3;
         var2 = false;
         var3 = 8 * this.getDualValueList().size();
         var1 += var3;
         if (!this.getDualValueList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.dualValueMemoizedSerializedSize = var3;
         if ((this.bitField0_ & 8) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(5, this.bestObjectiveBound_);
         }

         var2 = false;
         var3 = 8 * this.getReducedCostList().size();
         var1 += var3;
         if (!this.getReducedCostList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var3);
         }

         this.reducedCostMemoizedSerializedSize = var3;
         if ((this.bitField0_ & 2) != 0) {
            var1 += GeneratedMessageV3.computeStringSize(7, this.statusStr_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPSolutionResponse)) {
         return super.equals(var1);
      } else {
         MPSolutionResponse var2 = (MPSolutionResponse)var1;
         if (this.hasStatus() != var2.hasStatus()) {
            return false;
         } else if (this.hasStatus() && this.status_ != var2.status_) {
            return false;
         } else if (this.hasStatusStr() != var2.hasStatusStr()) {
            return false;
         } else if (this.hasStatusStr() && !this.getStatusStr().equals(var2.getStatusStr())) {
            return false;
         } else if (this.hasObjectiveValue() != var2.hasObjectiveValue()) {
            return false;
         } else if (this.hasObjectiveValue() && Double.doubleToLongBits(this.getObjectiveValue()) != Double.doubleToLongBits(var2.getObjectiveValue())) {
            return false;
         } else if (this.hasBestObjectiveBound() != var2.hasBestObjectiveBound()) {
            return false;
         } else if (this.hasBestObjectiveBound() && Double.doubleToLongBits(this.getBestObjectiveBound()) != Double.doubleToLongBits(var2.getBestObjectiveBound())) {
            return false;
         } else if (!this.getVariableValueList().equals(var2.getVariableValueList())) {
            return false;
         } else if (!this.getDualValueList().equals(var2.getDualValueList())) {
            return false;
         } else if (!this.getReducedCostList().equals(var2.getReducedCostList())) {
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
         if (this.hasStatus()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.status_;
         }

         if (this.hasStatusStr()) {
            var2 = 37 * var2 + 7;
            var2 = 53 * var2 + this.getStatusStr().hashCode();
         }

         if (this.hasObjectiveValue()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getObjectiveValue()));
         }

         if (this.hasBestObjectiveBound()) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getBestObjectiveBound()));
         }

         if (this.getVariableValueCount() > 0) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getVariableValueList().hashCode();
         }

         if (this.getDualValueCount() > 0) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getDualValueList().hashCode();
         }

         if (this.getReducedCostCount() > 0) {
            var2 = 37 * var2 + 6;
            var2 = 53 * var2 + this.getReducedCostList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPSolutionResponse parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPSolutionResponse)PARSER.parseFrom(var0);
   }

   public static MPSolutionResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPSolutionResponse)PARSER.parseFrom(var0, var1);
   }

   public static MPSolutionResponse parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPSolutionResponse)PARSER.parseFrom(var0);
   }

   public static MPSolutionResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPSolutionResponse)PARSER.parseFrom(var0, var1);
   }

   public static MPSolutionResponse parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPSolutionResponse)PARSER.parseFrom(var0);
   }

   public static MPSolutionResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPSolutionResponse)PARSER.parseFrom(var0, var1);
   }

   public static MPSolutionResponse parseFrom(InputStream var0) throws IOException {
      return (MPSolutionResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPSolutionResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPSolutionResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPSolutionResponse parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPSolutionResponse)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPSolutionResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPSolutionResponse)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPSolutionResponse parseFrom(CodedInputStream var0) throws IOException {
      return (MPSolutionResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPSolutionResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPSolutionResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPSolutionResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPSolutionResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPSolutionResponse.Builder newBuilder(MPSolutionResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPSolutionResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPSolutionResponse.Builder() : (new MPSolutionResponse.Builder()).mergeFrom(this);
   }

   protected MPSolutionResponse.Builder newBuilderForType(BuilderParent var1) {
      MPSolutionResponse.Builder var2 = new MPSolutionResponse.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPSolutionResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPSolutionResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPSolutionResponse(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPSolutionResponse(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPSolutionResponseOrBuilder {
      private int bitField0_;
      private int status_;
      private Object statusStr_;
      private double objectiveValue_;
      private double bestObjectiveBound_;
      private DoubleList variableValue_;
      private DoubleList dualValue_;
      private DoubleList reducedCost_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPSolutionResponse_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPSolutionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(MPSolutionResponse.class, MPSolutionResponse.Builder.class);
      }

      private Builder() {
         this.status_ = 99;
         this.statusStr_ = "";
         this.variableValue_ = MPSolutionResponse.emptyDoubleList();
         this.dualValue_ = MPSolutionResponse.emptyDoubleList();
         this.reducedCost_ = MPSolutionResponse.emptyDoubleList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.status_ = 99;
         this.statusStr_ = "";
         this.variableValue_ = MPSolutionResponse.emptyDoubleList();
         this.dualValue_ = MPSolutionResponse.emptyDoubleList();
         this.reducedCost_ = MPSolutionResponse.emptyDoubleList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPSolutionResponse.alwaysUseFieldBuilders) {
         }

      }

      public MPSolutionResponse.Builder clear() {
         super.clear();
         this.status_ = 99;
         this.bitField0_ &= -2;
         this.statusStr_ = "";
         this.bitField0_ &= -3;
         this.objectiveValue_ = 0.0D;
         this.bitField0_ &= -5;
         this.bestObjectiveBound_ = 0.0D;
         this.bitField0_ &= -9;
         this.variableValue_ = MPSolutionResponse.emptyDoubleList();
         this.bitField0_ &= -17;
         this.dualValue_ = MPSolutionResponse.emptyDoubleList();
         this.bitField0_ &= -33;
         this.reducedCost_ = MPSolutionResponse.emptyDoubleList();
         this.bitField0_ &= -65;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPSolutionResponse_descriptor;
      }

      public MPSolutionResponse getDefaultInstanceForType() {
         return MPSolutionResponse.getDefaultInstance();
      }

      public MPSolutionResponse build() {
         MPSolutionResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPSolutionResponse buildPartial() {
         MPSolutionResponse var1 = new MPSolutionResponse(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((var2 & 1) != 0) {
            var3 |= 1;
         }

         var1.status_ = this.status_;
         if ((var2 & 2) != 0) {
            var3 |= 2;
         }

         var1.statusStr_ = this.statusStr_;
         if ((var2 & 4) != 0) {
            var1.objectiveValue_ = this.objectiveValue_;
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.bestObjectiveBound_ = this.bestObjectiveBound_;
            var3 |= 8;
         }

         if ((this.bitField0_ & 16) != 0) {
            this.variableValue_.makeImmutable();
            this.bitField0_ &= -17;
         }

         var1.variableValue_ = this.variableValue_;
         if ((this.bitField0_ & 32) != 0) {
            this.dualValue_.makeImmutable();
            this.bitField0_ &= -33;
         }

         var1.dualValue_ = this.dualValue_;
         if ((this.bitField0_ & 64) != 0) {
            this.reducedCost_.makeImmutable();
            this.bitField0_ &= -65;
         }

         var1.reducedCost_ = this.reducedCost_;
         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPSolutionResponse.Builder clone() {
         return (MPSolutionResponse.Builder)super.clone();
      }

      public MPSolutionResponse.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPSolutionResponse.Builder)super.setField(var1, var2);
      }

      public MPSolutionResponse.Builder clearField(FieldDescriptor var1) {
         return (MPSolutionResponse.Builder)super.clearField(var1);
      }

      public MPSolutionResponse.Builder clearOneof(OneofDescriptor var1) {
         return (MPSolutionResponse.Builder)super.clearOneof(var1);
      }

      public MPSolutionResponse.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPSolutionResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPSolutionResponse.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPSolutionResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public MPSolutionResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPSolutionResponse) {
            return this.mergeFrom((MPSolutionResponse)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPSolutionResponse.Builder mergeFrom(MPSolutionResponse var1) {
         if (var1 == MPSolutionResponse.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasStatus()) {
               this.setStatus(var1.getStatus());
            }

            if (var1.hasStatusStr()) {
               this.bitField0_ |= 2;
               this.statusStr_ = var1.statusStr_;
               this.onChanged();
            }

            if (var1.hasObjectiveValue()) {
               this.setObjectiveValue(var1.getObjectiveValue());
            }

            if (var1.hasBestObjectiveBound()) {
               this.setBestObjectiveBound(var1.getBestObjectiveBound());
            }

            if (!var1.variableValue_.isEmpty()) {
               if (this.variableValue_.isEmpty()) {
                  this.variableValue_ = var1.variableValue_;
                  this.bitField0_ &= -17;
               } else {
                  this.ensureVariableValueIsMutable();
                  this.variableValue_.addAll(var1.variableValue_);
               }

               this.onChanged();
            }

            if (!var1.dualValue_.isEmpty()) {
               if (this.dualValue_.isEmpty()) {
                  this.dualValue_ = var1.dualValue_;
                  this.bitField0_ &= -33;
               } else {
                  this.ensureDualValueIsMutable();
                  this.dualValue_.addAll(var1.dualValue_);
               }

               this.onChanged();
            }

            if (!var1.reducedCost_.isEmpty()) {
               if (this.reducedCost_.isEmpty()) {
                  this.reducedCost_ = var1.reducedCost_;
                  this.bitField0_ &= -65;
               } else {
                  this.ensureReducedCostIsMutable();
                  this.reducedCost_.addAll(var1.reducedCost_);
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

      public MPSolutionResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPSolutionResponse var3 = null;

         try {
            var3 = (MPSolutionResponse)MPSolutionResponse.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPSolutionResponse)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public boolean hasStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      public MPSolverResponseStatus getStatus() {
         MPSolverResponseStatus var1 = MPSolverResponseStatus.valueOf(this.status_);
         return var1 == null ? MPSolverResponseStatus.MPSOLVER_UNKNOWN_STATUS : var1;
      }

      public MPSolutionResponse.Builder setStatus(MPSolverResponseStatus var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 1;
            this.status_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public MPSolutionResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 99;
         this.onChanged();
         return this;
      }

      public boolean hasStatusStr() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getStatusStr() {
         Object var1 = this.statusStr_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (var2.isValidUtf8()) {
               this.statusStr_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      public ByteString getStatusStrBytes() {
         Object var1 = this.statusStr_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.statusStr_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public MPSolutionResponse.Builder setStatusStr(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 2;
            this.statusStr_ = var1;
            this.onChanged();
            return this;
         }
      }

      public MPSolutionResponse.Builder clearStatusStr() {
         this.bitField0_ &= -3;
         this.statusStr_ = MPSolutionResponse.getDefaultInstance().getStatusStr();
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder setStatusStrBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 2;
            this.statusStr_ = var1;
            this.onChanged();
            return this;
         }
      }

      public boolean hasObjectiveValue() {
         return (this.bitField0_ & 4) != 0;
      }

      public double getObjectiveValue() {
         return this.objectiveValue_;
      }

      public MPSolutionResponse.Builder setObjectiveValue(double var1) {
         this.bitField0_ |= 4;
         this.objectiveValue_ = var1;
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder clearObjectiveValue() {
         this.bitField0_ &= -5;
         this.objectiveValue_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean hasBestObjectiveBound() {
         return (this.bitField0_ & 8) != 0;
      }

      public double getBestObjectiveBound() {
         return this.bestObjectiveBound_;
      }

      public MPSolutionResponse.Builder setBestObjectiveBound(double var1) {
         this.bitField0_ |= 8;
         this.bestObjectiveBound_ = var1;
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder clearBestObjectiveBound() {
         this.bitField0_ &= -9;
         this.bestObjectiveBound_ = 0.0D;
         this.onChanged();
         return this;
      }

      private void ensureVariableValueIsMutable() {
         if ((this.bitField0_ & 16) == 0) {
            this.variableValue_ = MPSolutionResponse.mutableCopy(this.variableValue_);
            this.bitField0_ |= 16;
         }

      }

      public List getVariableValueList() {
         return (List)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.variableValue_) : this.variableValue_);
      }

      public int getVariableValueCount() {
         return this.variableValue_.size();
      }

      public double getVariableValue(int var1) {
         return this.variableValue_.getDouble(var1);
      }

      public MPSolutionResponse.Builder setVariableValue(int var1, double var2) {
         this.ensureVariableValueIsMutable();
         this.variableValue_.setDouble(var1, var2);
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder addVariableValue(double var1) {
         this.ensureVariableValueIsMutable();
         this.variableValue_.addDouble(var1);
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder addAllVariableValue(Iterable var1) {
         this.ensureVariableValueIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.variableValue_);
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder clearVariableValue() {
         this.variableValue_ = MPSolutionResponse.emptyDoubleList();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      private void ensureDualValueIsMutable() {
         if ((this.bitField0_ & 32) == 0) {
            this.dualValue_ = MPSolutionResponse.mutableCopy(this.dualValue_);
            this.bitField0_ |= 32;
         }

      }

      public List getDualValueList() {
         return (List)((this.bitField0_ & 32) != 0 ? Collections.unmodifiableList(this.dualValue_) : this.dualValue_);
      }

      public int getDualValueCount() {
         return this.dualValue_.size();
      }

      public double getDualValue(int var1) {
         return this.dualValue_.getDouble(var1);
      }

      public MPSolutionResponse.Builder setDualValue(int var1, double var2) {
         this.ensureDualValueIsMutable();
         this.dualValue_.setDouble(var1, var2);
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder addDualValue(double var1) {
         this.ensureDualValueIsMutable();
         this.dualValue_.addDouble(var1);
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder addAllDualValue(Iterable var1) {
         this.ensureDualValueIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.dualValue_);
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder clearDualValue() {
         this.dualValue_ = MPSolutionResponse.emptyDoubleList();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      private void ensureReducedCostIsMutable() {
         if ((this.bitField0_ & 64) == 0) {
            this.reducedCost_ = MPSolutionResponse.mutableCopy(this.reducedCost_);
            this.bitField0_ |= 64;
         }

      }

      public List getReducedCostList() {
         return (List)((this.bitField0_ & 64) != 0 ? Collections.unmodifiableList(this.reducedCost_) : this.reducedCost_);
      }

      public int getReducedCostCount() {
         return this.reducedCost_.size();
      }

      public double getReducedCost(int var1) {
         return this.reducedCost_.getDouble(var1);
      }

      public MPSolutionResponse.Builder setReducedCost(int var1, double var2) {
         this.ensureReducedCostIsMutable();
         this.reducedCost_.setDouble(var1, var2);
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder addReducedCost(double var1) {
         this.ensureReducedCostIsMutable();
         this.reducedCost_.addDouble(var1);
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder addAllReducedCost(Iterable var1) {
         this.ensureReducedCostIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.reducedCost_);
         this.onChanged();
         return this;
      }

      public MPSolutionResponse.Builder clearReducedCost() {
         this.reducedCost_ = MPSolutionResponse.emptyDoubleList();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public final MPSolutionResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPSolutionResponse.Builder)super.setUnknownFields(var1);
      }

      public final MPSolutionResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPSolutionResponse.Builder)super.mergeUnknownFields(var1);
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
