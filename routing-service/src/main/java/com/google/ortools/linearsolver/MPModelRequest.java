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

public final class MPModelRequest extends GeneratedMessageV3 implements MPModelRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int MODEL_FIELD_NUMBER = 1;
   private MPModelProto model_;
   public static final int SOLVER_TYPE_FIELD_NUMBER = 2;
   private int solverType_;
   public static final int SOLVER_TIME_LIMIT_SECONDS_FIELD_NUMBER = 3;
   private double solverTimeLimitSeconds_;
   public static final int ENABLE_INTERNAL_SOLVER_OUTPUT_FIELD_NUMBER = 4;
   private boolean enableInternalSolverOutput_;
   public static final int SOLVER_SPECIFIC_PARAMETERS_FIELD_NUMBER = 5;
   private volatile Object solverSpecificParameters_;
   public static final int MODEL_DELTA_FIELD_NUMBER = 8;
   private MPModelDeltaProto modelDelta_;
   private byte memoizedIsInitialized;
   private static final MPModelRequest DEFAULT_INSTANCE = new MPModelRequest();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPModelRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPModelRequest(var1, var2);
      }
   };

   private MPModelRequest(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPModelRequest() {
      this.memoizedIsInitialized = -1;
      this.solverType_ = 2;
      this.solverSpecificParameters_ = "";
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPModelRequest();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPModelRequest(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
               case 10:
                  MPModelProto.Builder var18 = null;
                  if ((this.bitField0_ & 1) != 0) {
                     var18 = this.model_.toBuilder();
                  }

                  this.model_ = (MPModelProto)var1.readMessage(MPModelProto.PARSER, var2);
                  if (var18 != null) {
                     var18.mergeFrom(this.model_);
                     this.model_ = var18.buildPartial();
                  }

                  this.bitField0_ |= 1;
                  break;
               case 16:
                  int var17 = var1.readEnum();
                  MPModelRequest.SolverType var8 = MPModelRequest.SolverType.valueOf(var17);
                  if (var8 == null) {
                     var4.mergeVarintField(2, var17);
                  } else {
                     this.bitField0_ |= 2;
                     this.solverType_ = var17;
                  }
                  break;
               case 25:
                  this.bitField0_ |= 4;
                  this.solverTimeLimitSeconds_ = var1.readDouble();
                  break;
               case 32:
                  this.bitField0_ |= 8;
                  this.enableInternalSolverOutput_ = var1.readBool();
                  break;
               case 42:
                  ByteString var16 = var1.readBytes();
                  this.bitField0_ |= 16;
                  this.solverSpecificParameters_ = var16;
                  break;
               case 66:
                  MPModelDeltaProto.Builder var7 = null;
                  if ((this.bitField0_ & 32) != 0) {
                     var7 = this.modelDelta_.toBuilder();
                  }

                  this.modelDelta_ = (MPModelDeltaProto)var1.readMessage(MPModelDeltaProto.PARSER, var2);
                  if (var7 != null) {
                     var7.mergeFrom(this.modelDelta_);
                     this.modelDelta_ = var7.buildPartial();
                  }

                  this.bitField0_ |= 32;
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
      return LinearSolver.internal_static_operations_research_MPModelRequest_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPModelRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MPModelRequest.class, MPModelRequest.Builder.class);
   }

   public boolean hasModel() {
      return (this.bitField0_ & 1) != 0;
   }

   public MPModelProto getModel() {
      return this.model_ == null ? MPModelProto.getDefaultInstance() : this.model_;
   }

   public MPModelProtoOrBuilder getModelOrBuilder() {
      return this.model_ == null ? MPModelProto.getDefaultInstance() : this.model_;
   }

   public boolean hasSolverType() {
      return (this.bitField0_ & 2) != 0;
   }

   public MPModelRequest.SolverType getSolverType() {
      MPModelRequest.SolverType var1 = MPModelRequest.SolverType.valueOf(this.solverType_);
      return var1 == null ? MPModelRequest.SolverType.GLOP_LINEAR_PROGRAMMING : var1;
   }

   public boolean hasSolverTimeLimitSeconds() {
      return (this.bitField0_ & 4) != 0;
   }

   public double getSolverTimeLimitSeconds() {
      return this.solverTimeLimitSeconds_;
   }

   public boolean hasEnableInternalSolverOutput() {
      return (this.bitField0_ & 8) != 0;
   }

   public boolean getEnableInternalSolverOutput() {
      return this.enableInternalSolverOutput_;
   }

   public boolean hasSolverSpecificParameters() {
      return (this.bitField0_ & 16) != 0;
   }

   public String getSolverSpecificParameters() {
      Object var1 = this.solverSpecificParameters_;
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.solverSpecificParameters_ = var3;
         }

         return var3;
      }
   }

   public ByteString getSolverSpecificParametersBytes() {
      Object var1 = this.solverSpecificParameters_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.solverSpecificParameters_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   public boolean hasModelDelta() {
      return (this.bitField0_ & 32) != 0;
   }

   public MPModelDeltaProto getModelDelta() {
      return this.modelDelta_ == null ? MPModelDeltaProto.getDefaultInstance() : this.modelDelta_;
   }

   public MPModelDeltaProtoOrBuilder getModelDeltaOrBuilder() {
      return this.modelDelta_ == null ? MPModelDeltaProto.getDefaultInstance() : this.modelDelta_;
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
         var1.writeMessage(1, this.getModel());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeEnum(2, this.solverType_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeDouble(3, this.solverTimeLimitSeconds_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeBool(4, this.enableInternalSolverOutput_);
      }

      if ((this.bitField0_ & 16) != 0) {
         GeneratedMessageV3.writeString(var1, 5, this.solverSpecificParameters_);
      }

      if ((this.bitField0_ & 32) != 0) {
         var1.writeMessage(8, this.getModelDelta());
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
            var1 += CodedOutputStream.computeMessageSize(1, this.getModel());
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeEnumSize(2, this.solverType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(3, this.solverTimeLimitSeconds_);
         }

         if ((this.bitField0_ & 8) != 0) {
            var1 += CodedOutputStream.computeBoolSize(4, this.enableInternalSolverOutput_);
         }

         if ((this.bitField0_ & 16) != 0) {
            var1 += GeneratedMessageV3.computeStringSize(5, this.solverSpecificParameters_);
         }

         if ((this.bitField0_ & 32) != 0) {
            var1 += CodedOutputStream.computeMessageSize(8, this.getModelDelta());
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPModelRequest)) {
         return super.equals(var1);
      } else {
         MPModelRequest var2 = (MPModelRequest)var1;
         if (this.hasModel() != var2.hasModel()) {
            return false;
         } else if (this.hasModel() && !this.getModel().equals(var2.getModel())) {
            return false;
         } else if (this.hasSolverType() != var2.hasSolverType()) {
            return false;
         } else if (this.hasSolverType() && this.solverType_ != var2.solverType_) {
            return false;
         } else if (this.hasSolverTimeLimitSeconds() != var2.hasSolverTimeLimitSeconds()) {
            return false;
         } else if (this.hasSolverTimeLimitSeconds() && Double.doubleToLongBits(this.getSolverTimeLimitSeconds()) != Double.doubleToLongBits(var2.getSolverTimeLimitSeconds())) {
            return false;
         } else if (this.hasEnableInternalSolverOutput() != var2.hasEnableInternalSolverOutput()) {
            return false;
         } else if (this.hasEnableInternalSolverOutput() && this.getEnableInternalSolverOutput() != var2.getEnableInternalSolverOutput()) {
            return false;
         } else if (this.hasSolverSpecificParameters() != var2.hasSolverSpecificParameters()) {
            return false;
         } else if (this.hasSolverSpecificParameters() && !this.getSolverSpecificParameters().equals(var2.getSolverSpecificParameters())) {
            return false;
         } else if (this.hasModelDelta() != var2.hasModelDelta()) {
            return false;
         } else if (this.hasModelDelta() && !this.getModelDelta().equals(var2.getModelDelta())) {
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
         if (this.hasModel()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getModel().hashCode();
         }

         if (this.hasSolverType()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.solverType_;
         }

         if (this.hasSolverTimeLimitSeconds()) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getSolverTimeLimitSeconds()));
         }

         if (this.hasEnableInternalSolverOutput()) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + Internal.hashBoolean(this.getEnableInternalSolverOutput());
         }

         if (this.hasSolverSpecificParameters()) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.getSolverSpecificParameters().hashCode();
         }

         if (this.hasModelDelta()) {
            var2 = 37 * var2 + 8;
            var2 = 53 * var2 + this.getModelDelta().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPModelRequest parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPModelRequest)PARSER.parseFrom(var0);
   }

   public static MPModelRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPModelRequest)PARSER.parseFrom(var0, var1);
   }

   public static MPModelRequest parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPModelRequest)PARSER.parseFrom(var0);
   }

   public static MPModelRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPModelRequest)PARSER.parseFrom(var0, var1);
   }

   public static MPModelRequest parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPModelRequest)PARSER.parseFrom(var0);
   }

   public static MPModelRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPModelRequest)PARSER.parseFrom(var0, var1);
   }

   public static MPModelRequest parseFrom(InputStream var0) throws IOException {
      return (MPModelRequest)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPModelRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPModelRequest)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPModelRequest parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPModelRequest)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPModelRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPModelRequest)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPModelRequest parseFrom(CodedInputStream var0) throws IOException {
      return (MPModelRequest)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPModelRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPModelRequest)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPModelRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPModelRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPModelRequest.Builder newBuilder(MPModelRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPModelRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPModelRequest.Builder() : (new MPModelRequest.Builder()).mergeFrom(this);
   }

   protected MPModelRequest.Builder newBuilderForType(BuilderParent var1) {
      MPModelRequest.Builder var2 = new MPModelRequest.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPModelRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPModelRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPModelRequest(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPModelRequest(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPModelRequestOrBuilder {
      private int bitField0_;
      private MPModelProto model_;
      private SingleFieldBuilderV3 modelBuilder_;
      private int solverType_;
      private double solverTimeLimitSeconds_;
      private boolean enableInternalSolverOutput_;
      private Object solverSpecificParameters_;
      private MPModelDeltaProto modelDelta_;
      private SingleFieldBuilderV3 modelDeltaBuilder_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPModelRequest_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPModelRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MPModelRequest.class, MPModelRequest.Builder.class);
      }

      private Builder() {
         this.solverType_ = 2;
         this.solverSpecificParameters_ = "";
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.solverType_ = 2;
         this.solverSpecificParameters_ = "";
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPModelRequest.alwaysUseFieldBuilders) {
            this.getModelFieldBuilder();
            this.getModelDeltaFieldBuilder();
         }

      }

      public MPModelRequest.Builder clear() {
         super.clear();
         if (this.modelBuilder_ == null) {
            this.model_ = null;
         } else {
            this.modelBuilder_.clear();
         }

         this.bitField0_ &= -2;
         this.solverType_ = 2;
         this.bitField0_ &= -3;
         this.solverTimeLimitSeconds_ = 0.0D;
         this.bitField0_ &= -5;
         this.enableInternalSolverOutput_ = false;
         this.bitField0_ &= -9;
         this.solverSpecificParameters_ = "";
         this.bitField0_ &= -17;
         if (this.modelDeltaBuilder_ == null) {
            this.modelDelta_ = null;
         } else {
            this.modelDeltaBuilder_.clear();
         }

         this.bitField0_ &= -33;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPModelRequest_descriptor;
      }

      public MPModelRequest getDefaultInstanceForType() {
         return MPModelRequest.getDefaultInstance();
      }

      public MPModelRequest build() {
         MPModelRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPModelRequest buildPartial() {
         MPModelRequest var1 = new MPModelRequest(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((var2 & 1) != 0) {
            if (this.modelBuilder_ == null) {
               var1.model_ = this.model_;
            } else {
               var1.model_ = (MPModelProto)this.modelBuilder_.build();
            }

            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var3 |= 2;
         }

         var1.solverType_ = this.solverType_;
         if ((var2 & 4) != 0) {
            var1.solverTimeLimitSeconds_ = this.solverTimeLimitSeconds_;
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.enableInternalSolverOutput_ = this.enableInternalSolverOutput_;
            var3 |= 8;
         }

         if ((var2 & 16) != 0) {
            var3 |= 16;
         }

         var1.solverSpecificParameters_ = this.solverSpecificParameters_;
         if ((var2 & 32) != 0) {
            if (this.modelDeltaBuilder_ == null) {
               var1.modelDelta_ = this.modelDelta_;
            } else {
               var1.modelDelta_ = (MPModelDeltaProto)this.modelDeltaBuilder_.build();
            }

            var3 |= 32;
         }

         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPModelRequest.Builder clone() {
         return (MPModelRequest.Builder)super.clone();
      }

      public MPModelRequest.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPModelRequest.Builder)super.setField(var1, var2);
      }

      public MPModelRequest.Builder clearField(FieldDescriptor var1) {
         return (MPModelRequest.Builder)super.clearField(var1);
      }

      public MPModelRequest.Builder clearOneof(OneofDescriptor var1) {
         return (MPModelRequest.Builder)super.clearOneof(var1);
      }

      public MPModelRequest.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPModelRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPModelRequest.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPModelRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public MPModelRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPModelRequest) {
            return this.mergeFrom((MPModelRequest)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPModelRequest.Builder mergeFrom(MPModelRequest var1) {
         if (var1 == MPModelRequest.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasModel()) {
               this.mergeModel(var1.getModel());
            }

            if (var1.hasSolverType()) {
               this.setSolverType(var1.getSolverType());
            }

            if (var1.hasSolverTimeLimitSeconds()) {
               this.setSolverTimeLimitSeconds(var1.getSolverTimeLimitSeconds());
            }

            if (var1.hasEnableInternalSolverOutput()) {
               this.setEnableInternalSolverOutput(var1.getEnableInternalSolverOutput());
            }

            if (var1.hasSolverSpecificParameters()) {
               this.bitField0_ |= 16;
               this.solverSpecificParameters_ = var1.solverSpecificParameters_;
               this.onChanged();
            }

            if (var1.hasModelDelta()) {
               this.mergeModelDelta(var1.getModelDelta());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public MPModelRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPModelRequest var3 = null;

         try {
            var3 = (MPModelRequest)MPModelRequest.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPModelRequest)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public MPModelProto getModel() {
         if (this.modelBuilder_ == null) {
            return this.model_ == null ? MPModelProto.getDefaultInstance() : this.model_;
         } else {
            return (MPModelProto)this.modelBuilder_.getMessage();
         }
      }

      public MPModelRequest.Builder setModel(MPModelProto var1) {
         if (this.modelBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.model_ = var1;
            this.onChanged();
         } else {
            this.modelBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         return this;
      }

      public MPModelRequest.Builder setModel(MPModelProto.Builder var1) {
         if (this.modelBuilder_ == null) {
            this.model_ = var1.build();
            this.onChanged();
         } else {
            this.modelBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         return this;
      }

      public MPModelRequest.Builder mergeModel(MPModelProto var1) {
         if (this.modelBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.model_ != null && this.model_ != MPModelProto.getDefaultInstance()) {
               this.model_ = MPModelProto.newBuilder(this.model_).mergeFrom(var1).buildPartial();
            } else {
               this.model_ = var1;
            }

            this.onChanged();
         } else {
            this.modelBuilder_.mergeFrom(var1);
         }

         this.bitField0_ |= 1;
         return this;
      }

      public MPModelRequest.Builder clearModel() {
         if (this.modelBuilder_ == null) {
            this.model_ = null;
            this.onChanged();
         } else {
            this.modelBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      public MPModelProto.Builder getModelBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return (MPModelProto.Builder)this.getModelFieldBuilder().getBuilder();
      }

      public MPModelProtoOrBuilder getModelOrBuilder() {
         if (this.modelBuilder_ != null) {
            return (MPModelProtoOrBuilder)this.modelBuilder_.getMessageOrBuilder();
         } else {
            return this.model_ == null ? MPModelProto.getDefaultInstance() : this.model_;
         }
      }

      private SingleFieldBuilderV3 getModelFieldBuilder() {
         if (this.modelBuilder_ == null) {
            this.modelBuilder_ = new SingleFieldBuilderV3(this.getModel(), this.getParentForChildren(), this.isClean());
            this.model_ = null;
         }

         return this.modelBuilder_;
      }

      public boolean hasSolverType() {
         return (this.bitField0_ & 2) != 0;
      }

      public MPModelRequest.SolverType getSolverType() {
         MPModelRequest.SolverType var1 = MPModelRequest.SolverType.valueOf(this.solverType_);
         return var1 == null ? MPModelRequest.SolverType.GLOP_LINEAR_PROGRAMMING : var1;
      }

      public MPModelRequest.Builder setSolverType(MPModelRequest.SolverType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 2;
            this.solverType_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public MPModelRequest.Builder clearSolverType() {
         this.bitField0_ &= -3;
         this.solverType_ = 2;
         this.onChanged();
         return this;
      }

      public boolean hasSolverTimeLimitSeconds() {
         return (this.bitField0_ & 4) != 0;
      }

      public double getSolverTimeLimitSeconds() {
         return this.solverTimeLimitSeconds_;
      }

      public MPModelRequest.Builder setSolverTimeLimitSeconds(double var1) {
         this.bitField0_ |= 4;
         this.solverTimeLimitSeconds_ = var1;
         this.onChanged();
         return this;
      }

      public MPModelRequest.Builder clearSolverTimeLimitSeconds() {
         this.bitField0_ &= -5;
         this.solverTimeLimitSeconds_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean hasEnableInternalSolverOutput() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getEnableInternalSolverOutput() {
         return this.enableInternalSolverOutput_;
      }

      public MPModelRequest.Builder setEnableInternalSolverOutput(boolean var1) {
         this.bitField0_ |= 8;
         this.enableInternalSolverOutput_ = var1;
         this.onChanged();
         return this;
      }

      public MPModelRequest.Builder clearEnableInternalSolverOutput() {
         this.bitField0_ &= -9;
         this.enableInternalSolverOutput_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasSolverSpecificParameters() {
         return (this.bitField0_ & 16) != 0;
      }

      public String getSolverSpecificParameters() {
         Object var1 = this.solverSpecificParameters_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (var2.isValidUtf8()) {
               this.solverSpecificParameters_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      public ByteString getSolverSpecificParametersBytes() {
         Object var1 = this.solverSpecificParameters_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.solverSpecificParameters_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public MPModelRequest.Builder setSolverSpecificParameters(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 16;
            this.solverSpecificParameters_ = var1;
            this.onChanged();
            return this;
         }
      }

      public MPModelRequest.Builder clearSolverSpecificParameters() {
         this.bitField0_ &= -17;
         this.solverSpecificParameters_ = MPModelRequest.getDefaultInstance().getSolverSpecificParameters();
         this.onChanged();
         return this;
      }

      public MPModelRequest.Builder setSolverSpecificParametersBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 16;
            this.solverSpecificParameters_ = var1;
            this.onChanged();
            return this;
         }
      }

      public boolean hasModelDelta() {
         return (this.bitField0_ & 32) != 0;
      }

      public MPModelDeltaProto getModelDelta() {
         if (this.modelDeltaBuilder_ == null) {
            return this.modelDelta_ == null ? MPModelDeltaProto.getDefaultInstance() : this.modelDelta_;
         } else {
            return (MPModelDeltaProto)this.modelDeltaBuilder_.getMessage();
         }
      }

      public MPModelRequest.Builder setModelDelta(MPModelDeltaProto var1) {
         if (this.modelDeltaBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.modelDelta_ = var1;
            this.onChanged();
         } else {
            this.modelDeltaBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         return this;
      }

      public MPModelRequest.Builder setModelDelta(MPModelDeltaProto.Builder var1) {
         if (this.modelDeltaBuilder_ == null) {
            this.modelDelta_ = var1.build();
            this.onChanged();
         } else {
            this.modelDeltaBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         return this;
      }

      public MPModelRequest.Builder mergeModelDelta(MPModelDeltaProto var1) {
         if (this.modelDeltaBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.modelDelta_ != null && this.modelDelta_ != MPModelDeltaProto.getDefaultInstance()) {
               this.modelDelta_ = MPModelDeltaProto.newBuilder(this.modelDelta_).mergeFrom(var1).buildPartial();
            } else {
               this.modelDelta_ = var1;
            }

            this.onChanged();
         } else {
            this.modelDeltaBuilder_.mergeFrom(var1);
         }

         this.bitField0_ |= 32;
         return this;
      }

      public MPModelRequest.Builder clearModelDelta() {
         if (this.modelDeltaBuilder_ == null) {
            this.modelDelta_ = null;
            this.onChanged();
         } else {
            this.modelDeltaBuilder_.clear();
         }

         this.bitField0_ &= -33;
         return this;
      }

      public MPModelDeltaProto.Builder getModelDeltaBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return (MPModelDeltaProto.Builder)this.getModelDeltaFieldBuilder().getBuilder();
      }

      public MPModelDeltaProtoOrBuilder getModelDeltaOrBuilder() {
         if (this.modelDeltaBuilder_ != null) {
            return (MPModelDeltaProtoOrBuilder)this.modelDeltaBuilder_.getMessageOrBuilder();
         } else {
            return this.modelDelta_ == null ? MPModelDeltaProto.getDefaultInstance() : this.modelDelta_;
         }
      }

      private SingleFieldBuilderV3 getModelDeltaFieldBuilder() {
         if (this.modelDeltaBuilder_ == null) {
            this.modelDeltaBuilder_ = new SingleFieldBuilderV3(this.getModelDelta(), this.getParentForChildren(), this.isClean());
            this.modelDelta_ = null;
         }

         return this.modelDeltaBuilder_;
      }

      public final MPModelRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPModelRequest.Builder)super.setUnknownFields(var1);
      }

      public final MPModelRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPModelRequest.Builder)super.mergeUnknownFields(var1);
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

   public static enum SolverType implements ProtocolMessageEnum {
      GLOP_LINEAR_PROGRAMMING(2),
      CLP_LINEAR_PROGRAMMING(0),
      GLPK_LINEAR_PROGRAMMING(1),
      GUROBI_LINEAR_PROGRAMMING(6),
      XPRESS_LINEAR_PROGRAMMING(101),
      CPLEX_LINEAR_PROGRAMMING(10),
      SCIP_MIXED_INTEGER_PROGRAMMING(3),
      GLPK_MIXED_INTEGER_PROGRAMMING(4),
      CBC_MIXED_INTEGER_PROGRAMMING(5),
      GUROBI_MIXED_INTEGER_PROGRAMMING(7),
      XPRESS_MIXED_INTEGER_PROGRAMMING(102),
      CPLEX_MIXED_INTEGER_PROGRAMMING(11),
      BOP_INTEGER_PROGRAMMING(12),
      SAT_INTEGER_PROGRAMMING(14),
      KNAPSACK_MIXED_INTEGER_PROGRAMMING(13);

      public static final int GLOP_LINEAR_PROGRAMMING_VALUE = 2;
      public static final int CLP_LINEAR_PROGRAMMING_VALUE = 0;
      public static final int GLPK_LINEAR_PROGRAMMING_VALUE = 1;
      public static final int GUROBI_LINEAR_PROGRAMMING_VALUE = 6;
      public static final int XPRESS_LINEAR_PROGRAMMING_VALUE = 101;
      public static final int CPLEX_LINEAR_PROGRAMMING_VALUE = 10;
      public static final int SCIP_MIXED_INTEGER_PROGRAMMING_VALUE = 3;
      public static final int GLPK_MIXED_INTEGER_PROGRAMMING_VALUE = 4;
      public static final int CBC_MIXED_INTEGER_PROGRAMMING_VALUE = 5;
      public static final int GUROBI_MIXED_INTEGER_PROGRAMMING_VALUE = 7;
      public static final int XPRESS_MIXED_INTEGER_PROGRAMMING_VALUE = 102;
      public static final int CPLEX_MIXED_INTEGER_PROGRAMMING_VALUE = 11;
      public static final int BOP_INTEGER_PROGRAMMING_VALUE = 12;
      public static final int SAT_INTEGER_PROGRAMMING_VALUE = 14;
      public static final int KNAPSACK_MIXED_INTEGER_PROGRAMMING_VALUE = 13;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public MPModelRequest.SolverType findValueByNumber(int var1) {
            return MPModelRequest.SolverType.forNumber(var1);
         }
      };
      private static final MPModelRequest.SolverType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static MPModelRequest.SolverType valueOf(int var0) {
         return forNumber(var0);
      }

      public static MPModelRequest.SolverType forNumber(int var0) {
         switch(var0) {
         case 0:
            return CLP_LINEAR_PROGRAMMING;
         case 1:
            return GLPK_LINEAR_PROGRAMMING;
         case 2:
            return GLOP_LINEAR_PROGRAMMING;
         case 3:
            return SCIP_MIXED_INTEGER_PROGRAMMING;
         case 4:
            return GLPK_MIXED_INTEGER_PROGRAMMING;
         case 5:
            return CBC_MIXED_INTEGER_PROGRAMMING;
         case 6:
            return GUROBI_LINEAR_PROGRAMMING;
         case 7:
            return GUROBI_MIXED_INTEGER_PROGRAMMING;
         case 10:
            return CPLEX_LINEAR_PROGRAMMING;
         case 11:
            return CPLEX_MIXED_INTEGER_PROGRAMMING;
         case 12:
            return BOP_INTEGER_PROGRAMMING;
         case 13:
            return KNAPSACK_MIXED_INTEGER_PROGRAMMING;
         case 14:
            return SAT_INTEGER_PROGRAMMING;
         case 101:
            return XPRESS_LINEAR_PROGRAMMING;
         case 102:
            return XPRESS_MIXED_INTEGER_PROGRAMMING;
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
         return (EnumDescriptor)MPModelRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static MPModelRequest.SolverType valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private SolverType(int var3) {
         this.value = var3;
      }
   }
}
