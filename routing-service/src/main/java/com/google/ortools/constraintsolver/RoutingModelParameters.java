package com.google.ortools.constraintsolver;

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

public final class RoutingModelParameters extends GeneratedMessageV3 implements RoutingModelParametersOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SOLVER_PARAMETERS_FIELD_NUMBER = 1;
   private ConstraintSolverParameters solverParameters_;
   public static final int REDUCE_VEHICLE_COST_MODEL_FIELD_NUMBER = 2;
   private boolean reduceVehicleCostModel_;
   public static final int MAX_CALLBACK_CACHE_SIZE_FIELD_NUMBER = 3;
   private int maxCallbackCacheSize_;
   private byte memoizedIsInitialized;
   private static final RoutingModelParameters DEFAULT_INSTANCE = new RoutingModelParameters();
   private static final Parser PARSER = new AbstractParser() {
      public RoutingModelParameters parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new RoutingModelParameters(var1, var2);
      }
   };

   private RoutingModelParameters(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private RoutingModelParameters() {
      this.memoizedIsInitialized = -1;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new RoutingModelParameters();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private RoutingModelParameters(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         com.google.protobuf.UnknownFieldSet.Builder var3 = UnknownFieldSet.newBuilder();

         try {
            boolean var4 = false;

            while(!var4) {
               int var5 = var1.readTag();
               switch(var5) {
               case 0:
                  var4 = true;
                  break;
               case 10:
                  ConstraintSolverParameters.Builder var6 = null;
                  if (this.solverParameters_ != null) {
                     var6 = this.solverParameters_.toBuilder();
                  }

                  this.solverParameters_ = (ConstraintSolverParameters)var1.readMessage(ConstraintSolverParameters.parser(), var2);
                  if (var6 != null) {
                     var6.mergeFrom(this.solverParameters_);
                     this.solverParameters_ = var6.buildPartial();
                  }
                  break;
               case 16:
                  this.reduceVehicleCostModel_ = var1.readBool();
                  break;
               case 24:
                  this.maxCallbackCacheSize_ = var1.readInt32();
                  break;
               default:
                  if (!this.parseUnknownField(var1, var3, var2, var5)) {
                     var4 = true;
                  }
               }
            }
         } catch (InvalidProtocolBufferException var11) {
            throw var11.setUnfinishedMessage(this);
         } catch (IOException var12) {
            throw (new InvalidProtocolBufferException(var12)).setUnfinishedMessage(this);
         } finally {
            this.unknownFields = var3.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return RoutingParameters.internal_static_operations_research_RoutingModelParameters_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return RoutingParameters.internal_static_operations_research_RoutingModelParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutingModelParameters.class, RoutingModelParameters.Builder.class);
   }

   public boolean hasSolverParameters() {
      return this.solverParameters_ != null;
   }

   public ConstraintSolverParameters getSolverParameters() {
      return this.solverParameters_ == null ? ConstraintSolverParameters.getDefaultInstance() : this.solverParameters_;
   }

   public ConstraintSolverParametersOrBuilder getSolverParametersOrBuilder() {
      return this.getSolverParameters();
   }

   public boolean getReduceVehicleCostModel() {
      return this.reduceVehicleCostModel_;
   }

   public int getMaxCallbackCacheSize() {
      return this.maxCallbackCacheSize_;
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
      if (this.solverParameters_ != null) {
         var1.writeMessage(1, this.getSolverParameters());
      }

      if (this.reduceVehicleCostModel_) {
         var1.writeBool(2, this.reduceVehicleCostModel_);
      }

      if (this.maxCallbackCacheSize_ != 0) {
         var1.writeInt32(3, this.maxCallbackCacheSize_);
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (this.solverParameters_ != null) {
            var1 += CodedOutputStream.computeMessageSize(1, this.getSolverParameters());
         }

         if (this.reduceVehicleCostModel_) {
            var1 += CodedOutputStream.computeBoolSize(2, this.reduceVehicleCostModel_);
         }

         if (this.maxCallbackCacheSize_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(3, this.maxCallbackCacheSize_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RoutingModelParameters)) {
         return super.equals(var1);
      } else {
         RoutingModelParameters var2 = (RoutingModelParameters)var1;
         if (this.hasSolverParameters() != var2.hasSolverParameters()) {
            return false;
         } else if (this.hasSolverParameters() && !this.getSolverParameters().equals(var2.getSolverParameters())) {
            return false;
         } else if (this.getReduceVehicleCostModel() != var2.getReduceVehicleCostModel()) {
            return false;
         } else if (this.getMaxCallbackCacheSize() != var2.getMaxCallbackCacheSize()) {
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
         if (this.hasSolverParameters()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getSolverParameters().hashCode();
         }

         var2 = 37 * var2 + 2;
         var2 = 53 * var2 + Internal.hashBoolean(this.getReduceVehicleCostModel());
         var2 = 37 * var2 + 3;
         var2 = 53 * var2 + this.getMaxCallbackCacheSize();
         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static RoutingModelParameters parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (RoutingModelParameters)PARSER.parseFrom(var0);
   }

   public static RoutingModelParameters parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RoutingModelParameters)PARSER.parseFrom(var0, var1);
   }

   public static RoutingModelParameters parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (RoutingModelParameters)PARSER.parseFrom(var0);
   }

   public static RoutingModelParameters parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RoutingModelParameters)PARSER.parseFrom(var0, var1);
   }

   public static RoutingModelParameters parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (RoutingModelParameters)PARSER.parseFrom(var0);
   }

   public static RoutingModelParameters parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RoutingModelParameters)PARSER.parseFrom(var0, var1);
   }

   public static RoutingModelParameters parseFrom(InputStream var0) throws IOException {
      return (RoutingModelParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RoutingModelParameters parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RoutingModelParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RoutingModelParameters parseDelimitedFrom(InputStream var0) throws IOException {
      return (RoutingModelParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RoutingModelParameters parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RoutingModelParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RoutingModelParameters parseFrom(CodedInputStream var0) throws IOException {
      return (RoutingModelParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RoutingModelParameters parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RoutingModelParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RoutingModelParameters.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RoutingModelParameters.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RoutingModelParameters.Builder newBuilder(RoutingModelParameters var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RoutingModelParameters.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RoutingModelParameters.Builder() : (new RoutingModelParameters.Builder()).mergeFrom(this);
   }

   protected RoutingModelParameters.Builder newBuilderForType(BuilderParent var1) {
      RoutingModelParameters.Builder var2 = new RoutingModelParameters.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static RoutingModelParameters getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public RoutingModelParameters getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   RoutingModelParameters(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   RoutingModelParameters(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements RoutingModelParametersOrBuilder {
      private ConstraintSolverParameters solverParameters_;
      private SingleFieldBuilderV3 solverParametersBuilder_;
      private boolean reduceVehicleCostModel_;
      private int maxCallbackCacheSize_;

      public static final Descriptor getDescriptor() {
         return RoutingParameters.internal_static_operations_research_RoutingModelParameters_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return RoutingParameters.internal_static_operations_research_RoutingModelParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutingModelParameters.class, RoutingModelParameters.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RoutingModelParameters.alwaysUseFieldBuilders) {
         }

      }

      public RoutingModelParameters.Builder clear() {
         super.clear();
         if (this.solverParametersBuilder_ == null) {
            this.solverParameters_ = null;
         } else {
            this.solverParameters_ = null;
            this.solverParametersBuilder_ = null;
         }

         this.reduceVehicleCostModel_ = false;
         this.maxCallbackCacheSize_ = 0;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return RoutingParameters.internal_static_operations_research_RoutingModelParameters_descriptor;
      }

      public RoutingModelParameters getDefaultInstanceForType() {
         return RoutingModelParameters.getDefaultInstance();
      }

      public RoutingModelParameters build() {
         RoutingModelParameters var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RoutingModelParameters buildPartial() {
         RoutingModelParameters var1 = new RoutingModelParameters(this);
         if (this.solverParametersBuilder_ == null) {
            var1.solverParameters_ = this.solverParameters_;
         } else {
            var1.solverParameters_ = (ConstraintSolverParameters)this.solverParametersBuilder_.build();
         }

         var1.reduceVehicleCostModel_ = this.reduceVehicleCostModel_;
         var1.maxCallbackCacheSize_ = this.maxCallbackCacheSize_;
         this.onBuilt();
         return var1;
      }

      public RoutingModelParameters.Builder clone() {
         return (RoutingModelParameters.Builder)super.clone();
      }

      public RoutingModelParameters.Builder setField(FieldDescriptor var1, Object var2) {
         return (RoutingModelParameters.Builder)super.setField(var1, var2);
      }

      public RoutingModelParameters.Builder clearField(FieldDescriptor var1) {
         return (RoutingModelParameters.Builder)super.clearField(var1);
      }

      public RoutingModelParameters.Builder clearOneof(OneofDescriptor var1) {
         return (RoutingModelParameters.Builder)super.clearOneof(var1);
      }

      public RoutingModelParameters.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (RoutingModelParameters.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RoutingModelParameters.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (RoutingModelParameters.Builder)super.addRepeatedField(var1, var2);
      }

      public RoutingModelParameters.Builder mergeFrom(Message var1) {
         if (var1 instanceof RoutingModelParameters) {
            return this.mergeFrom((RoutingModelParameters)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public RoutingModelParameters.Builder mergeFrom(RoutingModelParameters var1) {
         if (var1 == RoutingModelParameters.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasSolverParameters()) {
               this.mergeSolverParameters(var1.getSolverParameters());
            }

            if (var1.getReduceVehicleCostModel()) {
               this.setReduceVehicleCostModel(var1.getReduceVehicleCostModel());
            }

            if (var1.getMaxCallbackCacheSize() != 0) {
               this.setMaxCallbackCacheSize(var1.getMaxCallbackCacheSize());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public RoutingModelParameters.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         RoutingModelParameters var3 = null;

         try {
            var3 = (RoutingModelParameters)RoutingModelParameters.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (RoutingModelParameters)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public boolean hasSolverParameters() {
         return this.solverParametersBuilder_ != null || this.solverParameters_ != null;
      }

      public ConstraintSolverParameters getSolverParameters() {
         if (this.solverParametersBuilder_ == null) {
            return this.solverParameters_ == null ? ConstraintSolverParameters.getDefaultInstance() : this.solverParameters_;
         } else {
            return (ConstraintSolverParameters)this.solverParametersBuilder_.getMessage();
         }
      }

      public RoutingModelParameters.Builder setSolverParameters(ConstraintSolverParameters var1) {
         if (this.solverParametersBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.solverParameters_ = var1;
            this.onChanged();
         } else {
            this.solverParametersBuilder_.setMessage(var1);
         }

         return this;
      }

      public RoutingModelParameters.Builder setSolverParameters(ConstraintSolverParameters.Builder var1) {
         if (this.solverParametersBuilder_ == null) {
            this.solverParameters_ = var1.build();
            this.onChanged();
         } else {
            this.solverParametersBuilder_.setMessage(var1.build());
         }

         return this;
      }

      public RoutingModelParameters.Builder mergeSolverParameters(ConstraintSolverParameters var1) {
         if (this.solverParametersBuilder_ == null) {
            if (this.solverParameters_ != null) {
               this.solverParameters_ = ConstraintSolverParameters.newBuilder(this.solverParameters_).mergeFrom(var1).buildPartial();
            } else {
               this.solverParameters_ = var1;
            }

            this.onChanged();
         } else {
            this.solverParametersBuilder_.mergeFrom(var1);
         }

         return this;
      }

      public RoutingModelParameters.Builder clearSolverParameters() {
         if (this.solverParametersBuilder_ == null) {
            this.solverParameters_ = null;
            this.onChanged();
         } else {
            this.solverParameters_ = null;
            this.solverParametersBuilder_ = null;
         }

         return this;
      }

      public ConstraintSolverParameters.Builder getSolverParametersBuilder() {
         this.onChanged();
         return (ConstraintSolverParameters.Builder)this.getSolverParametersFieldBuilder().getBuilder();
      }

      public ConstraintSolverParametersOrBuilder getSolverParametersOrBuilder() {
         if (this.solverParametersBuilder_ != null) {
            return (ConstraintSolverParametersOrBuilder)this.solverParametersBuilder_.getMessageOrBuilder();
         } else {
            return this.solverParameters_ == null ? ConstraintSolverParameters.getDefaultInstance() : this.solverParameters_;
         }
      }

      private SingleFieldBuilderV3 getSolverParametersFieldBuilder() {
         if (this.solverParametersBuilder_ == null) {
            this.solverParametersBuilder_ = new SingleFieldBuilderV3(this.getSolverParameters(), this.getParentForChildren(), this.isClean());
            this.solverParameters_ = null;
         }

         return this.solverParametersBuilder_;
      }

      public boolean getReduceVehicleCostModel() {
         return this.reduceVehicleCostModel_;
      }

      public RoutingModelParameters.Builder setReduceVehicleCostModel(boolean var1) {
         this.reduceVehicleCostModel_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingModelParameters.Builder clearReduceVehicleCostModel() {
         this.reduceVehicleCostModel_ = false;
         this.onChanged();
         return this;
      }

      public int getMaxCallbackCacheSize() {
         return this.maxCallbackCacheSize_;
      }

      public RoutingModelParameters.Builder setMaxCallbackCacheSize(int var1) {
         this.maxCallbackCacheSize_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingModelParameters.Builder clearMaxCallbackCacheSize() {
         this.maxCallbackCacheSize_ = 0;
         this.onChanged();
         return this;
      }

      public final RoutingModelParameters.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RoutingModelParameters.Builder)super.setUnknownFields(var1);
      }

      public final RoutingModelParameters.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RoutingModelParameters.Builder)super.mergeUnknownFields(var1);
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
