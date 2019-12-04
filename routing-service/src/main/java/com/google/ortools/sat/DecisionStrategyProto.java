package com.google.ortools.sat;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
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
import com.google.protobuf.Internal.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DecisionStrategyProto extends GeneratedMessageV3 implements DecisionStrategyProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VARIABLES_FIELD_NUMBER = 1;
   private IntList variables_;
   private int variablesMemoizedSerializedSize;
   public static final int VARIABLE_SELECTION_STRATEGY_FIELD_NUMBER = 2;
   private int variableSelectionStrategy_;
   public static final int DOMAIN_REDUCTION_STRATEGY_FIELD_NUMBER = 3;
   private int domainReductionStrategy_;
   public static final int TRANSFORMATIONS_FIELD_NUMBER = 4;
   private List transformations_;
   private byte memoizedIsInitialized;
   private static final DecisionStrategyProto DEFAULT_INSTANCE = new DecisionStrategyProto();
   private static final Parser PARSER = new AbstractParser() {
      public DecisionStrategyProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new DecisionStrategyProto(var1, var2);
      }
   };

   private DecisionStrategyProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.variablesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private DecisionStrategyProto() {
      this.variablesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.variables_ = emptyIntList();
      this.variableSelectionStrategy_ = 0;
      this.domainReductionStrategy_ = 0;
      this.transformations_ = Collections.emptyList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new DecisionStrategyProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private DecisionStrategyProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                     this.variables_ = newIntList();
                     var3 |= 1;
                  }

                  this.variables_.addInt(var1.readInt32());
                  continue;
               case 10:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.variables_ = newIntList();
                     var3 |= 1;
                  }
                  break;
               case 16:
                  var7 = var1.readEnum();
                  this.variableSelectionStrategy_ = var7;
                  continue;
               case 24:
                  var7 = var1.readEnum();
                  this.domainReductionStrategy_ = var7;
                  continue;
               case 34:
                  if ((var3 & 2) == 0) {
                     this.transformations_ = new ArrayList();
                     var3 |= 2;
                  }

                  this.transformations_.add(var1.readMessage(DecisionStrategyProto.AffineTransformation.parser(), var2));
                  continue;
               default:
                  if (!this.parseUnknownField(var1, var4, var2, var6)) {
                     var5 = true;
                  }
                  continue;
               }

               while(var1.getBytesUntilLimit() > 0) {
                  this.variables_.addInt(var1.readInt32());
               }

               var1.popLimit(var8);
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            if ((var3 & 1) != 0) {
               this.variables_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.transformations_ = Collections.unmodifiableList(this.transformations_);
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_DecisionStrategyProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_DecisionStrategyProto_fieldAccessorTable.ensureFieldAccessorsInitialized(DecisionStrategyProto.class, DecisionStrategyProto.Builder.class);
   }

   public List getVariablesList() {
      return this.variables_;
   }

   public int getVariablesCount() {
      return this.variables_.size();
   }

   public int getVariables(int var1) {
      return this.variables_.getInt(var1);
   }

   public int getVariableSelectionStrategyValue() {
      return this.variableSelectionStrategy_;
   }

   public DecisionStrategyProto.VariableSelectionStrategy getVariableSelectionStrategy() {
      DecisionStrategyProto.VariableSelectionStrategy var1 = DecisionStrategyProto.VariableSelectionStrategy.valueOf(this.variableSelectionStrategy_);
      return var1 == null ? DecisionStrategyProto.VariableSelectionStrategy.UNRECOGNIZED : var1;
   }

   public int getDomainReductionStrategyValue() {
      return this.domainReductionStrategy_;
   }

   public DecisionStrategyProto.DomainReductionStrategy getDomainReductionStrategy() {
      DecisionStrategyProto.DomainReductionStrategy var1 = DecisionStrategyProto.DomainReductionStrategy.valueOf(this.domainReductionStrategy_);
      return var1 == null ? DecisionStrategyProto.DomainReductionStrategy.UNRECOGNIZED : var1;
   }

   public List getTransformationsList() {
      return this.transformations_;
   }

   public List getTransformationsOrBuilderList() {
      return this.transformations_;
   }

   public int getTransformationsCount() {
      return this.transformations_.size();
   }

   public DecisionStrategyProto.AffineTransformation getTransformations(int var1) {
      return (DecisionStrategyProto.AffineTransformation)this.transformations_.get(var1);
   }

   public DecisionStrategyProto.AffineTransformationOrBuilder getTransformationsOrBuilder(int var1) {
      return (DecisionStrategyProto.AffineTransformationOrBuilder)this.transformations_.get(var1);
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
      if (this.getVariablesList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.variablesMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.variables_.size(); ++var2) {
         var1.writeInt32NoTag(this.variables_.getInt(var2));
      }

      if (this.variableSelectionStrategy_ != DecisionStrategyProto.VariableSelectionStrategy.CHOOSE_FIRST.getNumber()) {
         var1.writeEnum(2, this.variableSelectionStrategy_);
      }

      if (this.domainReductionStrategy_ != DecisionStrategyProto.DomainReductionStrategy.SELECT_MIN_VALUE.getNumber()) {
         var1.writeEnum(3, this.domainReductionStrategy_);
      }

      for(var2 = 0; var2 < this.transformations_.size(); ++var2) {
         var1.writeMessage(4, (MessageLite)this.transformations_.get(var2));
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

         for(int var3 = 0; var3 < this.variables_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.variables_.getInt(var3));
         }

         var1 = var4 + var2;
         if (!this.getVariablesList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.variablesMemoizedSerializedSize = var2;
         if (this.variableSelectionStrategy_ != DecisionStrategyProto.VariableSelectionStrategy.CHOOSE_FIRST.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(2, this.variableSelectionStrategy_);
         }

         if (this.domainReductionStrategy_ != DecisionStrategyProto.DomainReductionStrategy.SELECT_MIN_VALUE.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(3, this.domainReductionStrategy_);
         }

         for(var2 = 0; var2 < this.transformations_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(4, (MessageLite)this.transformations_.get(var2));
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DecisionStrategyProto)) {
         return super.equals(var1);
      } else {
         DecisionStrategyProto var2 = (DecisionStrategyProto)var1;
         if (!this.getVariablesList().equals(var2.getVariablesList())) {
            return false;
         } else if (this.variableSelectionStrategy_ != var2.variableSelectionStrategy_) {
            return false;
         } else if (this.domainReductionStrategy_ != var2.domainReductionStrategy_) {
            return false;
         } else if (!this.getTransformationsList().equals(var2.getTransformationsList())) {
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
         if (this.getVariablesCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getVariablesList().hashCode();
         }

         var2 = 37 * var2 + 2;
         var2 = 53 * var2 + this.variableSelectionStrategy_;
         var2 = 37 * var2 + 3;
         var2 = 53 * var2 + this.domainReductionStrategy_;
         if (this.getTransformationsCount() > 0) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getTransformationsList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static DecisionStrategyProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (DecisionStrategyProto)PARSER.parseFrom(var0);
   }

   public static DecisionStrategyProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (DecisionStrategyProto)PARSER.parseFrom(var0, var1);
   }

   public static DecisionStrategyProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (DecisionStrategyProto)PARSER.parseFrom(var0);
   }

   public static DecisionStrategyProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (DecisionStrategyProto)PARSER.parseFrom(var0, var1);
   }

   public static DecisionStrategyProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (DecisionStrategyProto)PARSER.parseFrom(var0);
   }

   public static DecisionStrategyProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (DecisionStrategyProto)PARSER.parseFrom(var0, var1);
   }

   public static DecisionStrategyProto parseFrom(InputStream var0) throws IOException {
      return (DecisionStrategyProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DecisionStrategyProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (DecisionStrategyProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DecisionStrategyProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (DecisionStrategyProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DecisionStrategyProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (DecisionStrategyProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DecisionStrategyProto parseFrom(CodedInputStream var0) throws IOException {
      return (DecisionStrategyProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DecisionStrategyProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (DecisionStrategyProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DecisionStrategyProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DecisionStrategyProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DecisionStrategyProto.Builder newBuilder(DecisionStrategyProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DecisionStrategyProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DecisionStrategyProto.Builder() : (new DecisionStrategyProto.Builder()).mergeFrom(this);
   }

   protected DecisionStrategyProto.Builder newBuilderForType(BuilderParent var1) {
      DecisionStrategyProto.Builder var2 = new DecisionStrategyProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static DecisionStrategyProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public DecisionStrategyProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   DecisionStrategyProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   DecisionStrategyProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements DecisionStrategyProtoOrBuilder {
      private int bitField0_;
      private IntList variables_;
      private int variableSelectionStrategy_;
      private int domainReductionStrategy_;
      private List transformations_;
      private RepeatedFieldBuilderV3 transformationsBuilder_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_DecisionStrategyProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_DecisionStrategyProto_fieldAccessorTable.ensureFieldAccessorsInitialized(DecisionStrategyProto.class, DecisionStrategyProto.Builder.class);
      }

      private Builder() {
         this.variables_ = DecisionStrategyProto.emptyIntList();
         this.variableSelectionStrategy_ = 0;
         this.domainReductionStrategy_ = 0;
         this.transformations_ = Collections.emptyList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.variables_ = DecisionStrategyProto.emptyIntList();
         this.variableSelectionStrategy_ = 0;
         this.domainReductionStrategy_ = 0;
         this.transformations_ = Collections.emptyList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DecisionStrategyProto.alwaysUseFieldBuilders) {
            this.getTransformationsFieldBuilder();
         }

      }

      public DecisionStrategyProto.Builder clear() {
         super.clear();
         this.variables_ = DecisionStrategyProto.emptyIntList();
         this.bitField0_ &= -2;
         this.variableSelectionStrategy_ = 0;
         this.domainReductionStrategy_ = 0;
         if (this.transformationsBuilder_ == null) {
            this.transformations_ = Collections.emptyList();
            this.bitField0_ &= -3;
         } else {
            this.transformationsBuilder_.clear();
         }

         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_DecisionStrategyProto_descriptor;
      }

      public DecisionStrategyProto getDefaultInstanceForType() {
         return DecisionStrategyProto.getDefaultInstance();
      }

      public DecisionStrategyProto build() {
         DecisionStrategyProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DecisionStrategyProto buildPartial() {
         DecisionStrategyProto var1 = new DecisionStrategyProto(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.variables_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.variables_ = this.variables_;
         var1.variableSelectionStrategy_ = this.variableSelectionStrategy_;
         var1.domainReductionStrategy_ = this.domainReductionStrategy_;
         if (this.transformationsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.transformations_ = Collections.unmodifiableList(this.transformations_);
               this.bitField0_ &= -3;
            }

            var1.transformations_ = this.transformations_;
         } else {
            var1.transformations_ = this.transformationsBuilder_.build();
         }

         this.onBuilt();
         return var1;
      }

      public DecisionStrategyProto.Builder clone() {
         return (DecisionStrategyProto.Builder)super.clone();
      }

      public DecisionStrategyProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (DecisionStrategyProto.Builder)super.setField(var1, var2);
      }

      public DecisionStrategyProto.Builder clearField(FieldDescriptor var1) {
         return (DecisionStrategyProto.Builder)super.clearField(var1);
      }

      public DecisionStrategyProto.Builder clearOneof(OneofDescriptor var1) {
         return (DecisionStrategyProto.Builder)super.clearOneof(var1);
      }

      public DecisionStrategyProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (DecisionStrategyProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DecisionStrategyProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (DecisionStrategyProto.Builder)super.addRepeatedField(var1, var2);
      }

      public DecisionStrategyProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof DecisionStrategyProto) {
            return this.mergeFrom((DecisionStrategyProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public DecisionStrategyProto.Builder mergeFrom(DecisionStrategyProto var1) {
         if (var1 == DecisionStrategyProto.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.variables_.isEmpty()) {
               if (this.variables_.isEmpty()) {
                  this.variables_ = var1.variables_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureVariablesIsMutable();
                  this.variables_.addAll(var1.variables_);
               }

               this.onChanged();
            }

            if (var1.variableSelectionStrategy_ != 0) {
               this.setVariableSelectionStrategyValue(var1.getVariableSelectionStrategyValue());
            }

            if (var1.domainReductionStrategy_ != 0) {
               this.setDomainReductionStrategyValue(var1.getDomainReductionStrategyValue());
            }

            if (this.transformationsBuilder_ == null) {
               if (!var1.transformations_.isEmpty()) {
                  if (this.transformations_.isEmpty()) {
                     this.transformations_ = var1.transformations_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureTransformationsIsMutable();
                     this.transformations_.addAll(var1.transformations_);
                  }

                  this.onChanged();
               }
            } else if (!var1.transformations_.isEmpty()) {
               if (this.transformationsBuilder_.isEmpty()) {
                  this.transformationsBuilder_.dispose();
                  this.transformationsBuilder_ = null;
                  this.transformations_ = var1.transformations_;
                  this.bitField0_ &= -3;
                  this.transformationsBuilder_ = DecisionStrategyProto.alwaysUseFieldBuilders ? this.getTransformationsFieldBuilder() : null;
               } else {
                  this.transformationsBuilder_.addAllMessages(var1.transformations_);
               }
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public DecisionStrategyProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         DecisionStrategyProto var3 = null;

         try {
            var3 = (DecisionStrategyProto)DecisionStrategyProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (DecisionStrategyProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureVariablesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.variables_ = DecisionStrategyProto.mutableCopy(this.variables_);
            this.bitField0_ |= 1;
         }

      }

      public List getVariablesList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.variables_) : this.variables_);
      }

      public int getVariablesCount() {
         return this.variables_.size();
      }

      public int getVariables(int var1) {
         return this.variables_.getInt(var1);
      }

      public DecisionStrategyProto.Builder setVariables(int var1, int var2) {
         this.ensureVariablesIsMutable();
         this.variables_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public DecisionStrategyProto.Builder addVariables(int var1) {
         this.ensureVariablesIsMutable();
         this.variables_.addInt(var1);
         this.onChanged();
         return this;
      }

      public DecisionStrategyProto.Builder addAllVariables(Iterable var1) {
         this.ensureVariablesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.variables_);
         this.onChanged();
         return this;
      }

      public DecisionStrategyProto.Builder clearVariables() {
         this.variables_ = DecisionStrategyProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public int getVariableSelectionStrategyValue() {
         return this.variableSelectionStrategy_;
      }

      public DecisionStrategyProto.Builder setVariableSelectionStrategyValue(int var1) {
         this.variableSelectionStrategy_ = var1;
         this.onChanged();
         return this;
      }

      public DecisionStrategyProto.VariableSelectionStrategy getVariableSelectionStrategy() {
         DecisionStrategyProto.VariableSelectionStrategy var1 = DecisionStrategyProto.VariableSelectionStrategy.valueOf(this.variableSelectionStrategy_);
         return var1 == null ? DecisionStrategyProto.VariableSelectionStrategy.UNRECOGNIZED : var1;
      }

      public DecisionStrategyProto.Builder setVariableSelectionStrategy(DecisionStrategyProto.VariableSelectionStrategy var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.variableSelectionStrategy_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public DecisionStrategyProto.Builder clearVariableSelectionStrategy() {
         this.variableSelectionStrategy_ = 0;
         this.onChanged();
         return this;
      }

      public int getDomainReductionStrategyValue() {
         return this.domainReductionStrategy_;
      }

      public DecisionStrategyProto.Builder setDomainReductionStrategyValue(int var1) {
         this.domainReductionStrategy_ = var1;
         this.onChanged();
         return this;
      }

      public DecisionStrategyProto.DomainReductionStrategy getDomainReductionStrategy() {
         DecisionStrategyProto.DomainReductionStrategy var1 = DecisionStrategyProto.DomainReductionStrategy.valueOf(this.domainReductionStrategy_);
         return var1 == null ? DecisionStrategyProto.DomainReductionStrategy.UNRECOGNIZED : var1;
      }

      public DecisionStrategyProto.Builder setDomainReductionStrategy(DecisionStrategyProto.DomainReductionStrategy var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.domainReductionStrategy_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public DecisionStrategyProto.Builder clearDomainReductionStrategy() {
         this.domainReductionStrategy_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureTransformationsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.transformations_ = new ArrayList(this.transformations_);
            this.bitField0_ |= 2;
         }

      }

      public List getTransformationsList() {
         return this.transformationsBuilder_ == null ? Collections.unmodifiableList(this.transformations_) : this.transformationsBuilder_.getMessageList();
      }

      public int getTransformationsCount() {
         return this.transformationsBuilder_ == null ? this.transformations_.size() : this.transformationsBuilder_.getCount();
      }

      public DecisionStrategyProto.AffineTransformation getTransformations(int var1) {
         return this.transformationsBuilder_ == null ? (DecisionStrategyProto.AffineTransformation)this.transformations_.get(var1) : (DecisionStrategyProto.AffineTransformation)this.transformationsBuilder_.getMessage(var1);
      }

      public DecisionStrategyProto.Builder setTransformations(int var1, DecisionStrategyProto.AffineTransformation var2) {
         if (this.transformationsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTransformationsIsMutable();
            this.transformations_.set(var1, var2);
            this.onChanged();
         } else {
            this.transformationsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public DecisionStrategyProto.Builder setTransformations(int var1, DecisionStrategyProto.AffineTransformation.Builder var2) {
         if (this.transformationsBuilder_ == null) {
            this.ensureTransformationsIsMutable();
            this.transformations_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.transformationsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public DecisionStrategyProto.Builder addTransformations(DecisionStrategyProto.AffineTransformation var1) {
         if (this.transformationsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureTransformationsIsMutable();
            this.transformations_.add(var1);
            this.onChanged();
         } else {
            this.transformationsBuilder_.addMessage(var1);
         }

         return this;
      }

      public DecisionStrategyProto.Builder addTransformations(int var1, DecisionStrategyProto.AffineTransformation var2) {
         if (this.transformationsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTransformationsIsMutable();
            this.transformations_.add(var1, var2);
            this.onChanged();
         } else {
            this.transformationsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public DecisionStrategyProto.Builder addTransformations(DecisionStrategyProto.AffineTransformation.Builder var1) {
         if (this.transformationsBuilder_ == null) {
            this.ensureTransformationsIsMutable();
            this.transformations_.add(var1.build());
            this.onChanged();
         } else {
            this.transformationsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public DecisionStrategyProto.Builder addTransformations(int var1, DecisionStrategyProto.AffineTransformation.Builder var2) {
         if (this.transformationsBuilder_ == null) {
            this.ensureTransformationsIsMutable();
            this.transformations_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.transformationsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public DecisionStrategyProto.Builder addAllTransformations(Iterable var1) {
         if (this.transformationsBuilder_ == null) {
            this.ensureTransformationsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.transformations_);
            this.onChanged();
         } else {
            this.transformationsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public DecisionStrategyProto.Builder clearTransformations() {
         if (this.transformationsBuilder_ == null) {
            this.transformations_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.transformationsBuilder_.clear();
         }

         return this;
      }

      public DecisionStrategyProto.Builder removeTransformations(int var1) {
         if (this.transformationsBuilder_ == null) {
            this.ensureTransformationsIsMutable();
            this.transformations_.remove(var1);
            this.onChanged();
         } else {
            this.transformationsBuilder_.remove(var1);
         }

         return this;
      }

      public DecisionStrategyProto.AffineTransformation.Builder getTransformationsBuilder(int var1) {
         return (DecisionStrategyProto.AffineTransformation.Builder)this.getTransformationsFieldBuilder().getBuilder(var1);
      }

      public DecisionStrategyProto.AffineTransformationOrBuilder getTransformationsOrBuilder(int var1) {
         return this.transformationsBuilder_ == null ? (DecisionStrategyProto.AffineTransformationOrBuilder)this.transformations_.get(var1) : (DecisionStrategyProto.AffineTransformationOrBuilder)this.transformationsBuilder_.getMessageOrBuilder(var1);
      }

      public List getTransformationsOrBuilderList() {
         return this.transformationsBuilder_ != null ? this.transformationsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.transformations_);
      }

      public DecisionStrategyProto.AffineTransformation.Builder addTransformationsBuilder() {
         return (DecisionStrategyProto.AffineTransformation.Builder)this.getTransformationsFieldBuilder().addBuilder(DecisionStrategyProto.AffineTransformation.getDefaultInstance());
      }

      public DecisionStrategyProto.AffineTransformation.Builder addTransformationsBuilder(int var1) {
         return (DecisionStrategyProto.AffineTransformation.Builder)this.getTransformationsFieldBuilder().addBuilder(var1, DecisionStrategyProto.AffineTransformation.getDefaultInstance());
      }

      public List getTransformationsBuilderList() {
         return this.getTransformationsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3 getTransformationsFieldBuilder() {
         if (this.transformationsBuilder_ == null) {
            this.transformationsBuilder_ = new RepeatedFieldBuilderV3(this.transformations_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.transformations_ = null;
         }

         return this.transformationsBuilder_;
      }

      public final DecisionStrategyProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DecisionStrategyProto.Builder)super.setUnknownFields(var1);
      }

      public final DecisionStrategyProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DecisionStrategyProto.Builder)super.mergeUnknownFields(var1);
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

   public static final class AffineTransformation extends GeneratedMessageV3 implements DecisionStrategyProto.AffineTransformationOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int VAR_FIELD_NUMBER = 1;
      private int var_;
      public static final int OFFSET_FIELD_NUMBER = 2;
      private long offset_;
      public static final int POSITIVE_COEFF_FIELD_NUMBER = 3;
      private long positiveCoeff_;
      private byte memoizedIsInitialized;
      private static final DecisionStrategyProto.AffineTransformation DEFAULT_INSTANCE = new DecisionStrategyProto.AffineTransformation();
      private static final Parser PARSER = new AbstractParser() {
         public DecisionStrategyProto.AffineTransformation parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
            return new DecisionStrategyProto.AffineTransformation(var1, var2);
         }
      };

      private AffineTransformation(com.google.protobuf.GeneratedMessageV3.Builder var1) {
         super(var1);
         this.memoizedIsInitialized = -1;
      }

      private AffineTransformation() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(UnusedPrivateParameter var1) {
         return new DecisionStrategyProto.AffineTransformation();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private AffineTransformation(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                  case 8:
                     this.var_ = var1.readInt32();
                     break;
                  case 16:
                     this.offset_ = var1.readInt64();
                     break;
                  case 24:
                     this.positiveCoeff_ = var1.readInt64();
                     break;
                  default:
                     if (!this.parseUnknownField(var1, var3, var2, var5)) {
                        var4 = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var10) {
               throw var10.setUnfinishedMessage(this);
            } catch (IOException var11) {
               throw (new InvalidProtocolBufferException(var11)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = var3.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_DecisionStrategyProto_AffineTransformation_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_DecisionStrategyProto_AffineTransformation_fieldAccessorTable.ensureFieldAccessorsInitialized(DecisionStrategyProto.AffineTransformation.class, DecisionStrategyProto.AffineTransformation.Builder.class);
      }

      public int getVar() {
         return this.var_;
      }

      public long getOffset() {
         return this.offset_;
      }

      public long getPositiveCoeff() {
         return this.positiveCoeff_;
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
         if (this.var_ != 0) {
            var1.writeInt32(1, this.var_);
         }

         if (this.offset_ != 0L) {
            var1.writeInt64(2, this.offset_);
         }

         if (this.positiveCoeff_ != 0L) {
            var1.writeInt64(3, this.positiveCoeff_);
         }

         this.unknownFields.writeTo(var1);
      }

      public int getSerializedSize() {
         int var1 = this.memoizedSize;
         if (var1 != -1) {
            return var1;
         } else {
            var1 = 0;
            if (this.var_ != 0) {
               var1 += CodedOutputStream.computeInt32Size(1, this.var_);
            }

            if (this.offset_ != 0L) {
               var1 += CodedOutputStream.computeInt64Size(2, this.offset_);
            }

            if (this.positiveCoeff_ != 0L) {
               var1 += CodedOutputStream.computeInt64Size(3, this.positiveCoeff_);
            }

            var1 += this.unknownFields.getSerializedSize();
            this.memoizedSize = var1;
            return var1;
         }
      }

      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof DecisionStrategyProto.AffineTransformation)) {
            return super.equals(var1);
         } else {
            DecisionStrategyProto.AffineTransformation var2 = (DecisionStrategyProto.AffineTransformation)var1;
            if (this.getVar() != var2.getVar()) {
               return false;
            } else if (this.getOffset() != var2.getOffset()) {
               return false;
            } else if (this.getPositiveCoeff() != var2.getPositiveCoeff()) {
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
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getVar();
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + Internal.hashLong(this.getOffset());
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + Internal.hashLong(this.getPositiveCoeff());
            var2 = 29 * var2 + this.unknownFields.hashCode();
            this.memoizedHashCode = var2;
            return var2;
         }
      }

      public static DecisionStrategyProto.AffineTransformation parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
         return (DecisionStrategyProto.AffineTransformation)PARSER.parseFrom(var0);
      }

      public static DecisionStrategyProto.AffineTransformation parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
         return (DecisionStrategyProto.AffineTransformation)PARSER.parseFrom(var0, var1);
      }

      public static DecisionStrategyProto.AffineTransformation parseFrom(ByteString var0) throws InvalidProtocolBufferException {
         return (DecisionStrategyProto.AffineTransformation)PARSER.parseFrom(var0);
      }

      public static DecisionStrategyProto.AffineTransformation parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
         return (DecisionStrategyProto.AffineTransformation)PARSER.parseFrom(var0, var1);
      }

      public static DecisionStrategyProto.AffineTransformation parseFrom(byte[] var0) throws InvalidProtocolBufferException {
         return (DecisionStrategyProto.AffineTransformation)PARSER.parseFrom(var0);
      }

      public static DecisionStrategyProto.AffineTransformation parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
         return (DecisionStrategyProto.AffineTransformation)PARSER.parseFrom(var0, var1);
      }

      public static DecisionStrategyProto.AffineTransformation parseFrom(InputStream var0) throws IOException {
         return (DecisionStrategyProto.AffineTransformation)GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static DecisionStrategyProto.AffineTransformation parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
         return (DecisionStrategyProto.AffineTransformation)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static DecisionStrategyProto.AffineTransformation parseDelimitedFrom(InputStream var0) throws IOException {
         return (DecisionStrategyProto.AffineTransformation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static DecisionStrategyProto.AffineTransformation parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
         return (DecisionStrategyProto.AffineTransformation)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static DecisionStrategyProto.AffineTransformation parseFrom(CodedInputStream var0) throws IOException {
         return (DecisionStrategyProto.AffineTransformation)GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static DecisionStrategyProto.AffineTransformation parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
         return (DecisionStrategyProto.AffineTransformation)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public DecisionStrategyProto.AffineTransformation.Builder newBuilderForType() {
         return newBuilder();
      }

      public static DecisionStrategyProto.AffineTransformation.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static DecisionStrategyProto.AffineTransformation.Builder newBuilder(DecisionStrategyProto.AffineTransformation var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public DecisionStrategyProto.AffineTransformation.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new DecisionStrategyProto.AffineTransformation.Builder() : (new DecisionStrategyProto.AffineTransformation.Builder()).mergeFrom(this);
      }

      protected DecisionStrategyProto.AffineTransformation.Builder newBuilderForType(BuilderParent var1) {
         DecisionStrategyProto.AffineTransformation.Builder var2 = new DecisionStrategyProto.AffineTransformation.Builder(var1);
         return var2;
      }

      @Override
      public byte[] toByteArray() {
         return new byte[0];
      }

      public static DecisionStrategyProto.AffineTransformation getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser parser() {
         return PARSER;
      }

      public Parser getParserForType() {
         return PARSER;
      }

      public DecisionStrategyProto.AffineTransformation getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      AffineTransformation(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
         this(var1);
      }

      // $FF: synthetic method
      AffineTransformation(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
         this(var1, var2);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements DecisionStrategyProto.AffineTransformationOrBuilder {
         private int var_;
         private long offset_;
         private long positiveCoeff_;

         public static final Descriptor getDescriptor() {
            return CpModelProtobuf.internal_static_operations_research_sat_DecisionStrategyProto_AffineTransformation_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CpModelProtobuf.internal_static_operations_research_sat_DecisionStrategyProto_AffineTransformation_fieldAccessorTable.ensureFieldAccessorsInitialized(DecisionStrategyProto.AffineTransformation.class, DecisionStrategyProto.AffineTransformation.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DecisionStrategyProto.AffineTransformation.alwaysUseFieldBuilders) {
            }

         }

         public DecisionStrategyProto.AffineTransformation.Builder clear() {
            super.clear();
            this.var_ = 0;
            this.offset_ = 0L;
            this.positiveCoeff_ = 0L;
            return this;
         }

         public Descriptor getDescriptorForType() {
            return CpModelProtobuf.internal_static_operations_research_sat_DecisionStrategyProto_AffineTransformation_descriptor;
         }

         public DecisionStrategyProto.AffineTransformation getDefaultInstanceForType() {
            return DecisionStrategyProto.AffineTransformation.getDefaultInstance();
         }

         public DecisionStrategyProto.AffineTransformation build() {
            DecisionStrategyProto.AffineTransformation var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public DecisionStrategyProto.AffineTransformation buildPartial() {
            DecisionStrategyProto.AffineTransformation var1 = new DecisionStrategyProto.AffineTransformation(this);
            var1.var_ = this.var_;
            var1.offset_ = this.offset_;
            var1.positiveCoeff_ = this.positiveCoeff_;
            this.onBuilt();
            return var1;
         }

         public DecisionStrategyProto.AffineTransformation.Builder clone() {
            return (DecisionStrategyProto.AffineTransformation.Builder)super.clone();
         }

         public DecisionStrategyProto.AffineTransformation.Builder setField(FieldDescriptor var1, Object var2) {
            return (DecisionStrategyProto.AffineTransformation.Builder)super.setField(var1, var2);
         }

         public DecisionStrategyProto.AffineTransformation.Builder clearField(FieldDescriptor var1) {
            return (DecisionStrategyProto.AffineTransformation.Builder)super.clearField(var1);
         }

         public DecisionStrategyProto.AffineTransformation.Builder clearOneof(OneofDescriptor var1) {
            return (DecisionStrategyProto.AffineTransformation.Builder)super.clearOneof(var1);
         }

         public DecisionStrategyProto.AffineTransformation.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
            return (DecisionStrategyProto.AffineTransformation.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public DecisionStrategyProto.AffineTransformation.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
            return (DecisionStrategyProto.AffineTransformation.Builder)super.addRepeatedField(var1, var2);
         }

         public DecisionStrategyProto.AffineTransformation.Builder mergeFrom(Message var1) {
            if (var1 instanceof DecisionStrategyProto.AffineTransformation) {
               return this.mergeFrom((DecisionStrategyProto.AffineTransformation)var1);
            } else {
               super.mergeFrom(var1);
               return this;
            }
         }

         public DecisionStrategyProto.AffineTransformation.Builder mergeFrom(DecisionStrategyProto.AffineTransformation var1) {
            if (var1 == DecisionStrategyProto.AffineTransformation.getDefaultInstance()) {
               return this;
            } else {
               if (var1.getVar() != 0) {
                  this.setVar(var1.getVar());
               }

               if (var1.getOffset() != 0L) {
                  this.setOffset(var1.getOffset());
               }

               if (var1.getPositiveCoeff() != 0L) {
                  this.setPositiveCoeff(var1.getPositiveCoeff());
               }

               this.mergeUnknownFields(var1.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public DecisionStrategyProto.AffineTransformation.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
            DecisionStrategyProto.AffineTransformation var3 = null;

            try {
               var3 = (DecisionStrategyProto.AffineTransformation)DecisionStrategyProto.AffineTransformation.PARSER.parsePartialFrom(var1, var2);
            } catch (InvalidProtocolBufferException var8) {
               var3 = (DecisionStrategyProto.AffineTransformation)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (var3 != null) {
                  this.mergeFrom(var3);
               }

            }

            return this;
         }

         public int getVar() {
            return this.var_;
         }

         public DecisionStrategyProto.AffineTransformation.Builder setVar(int var1) {
            this.var_ = var1;
            this.onChanged();
            return this;
         }

         public DecisionStrategyProto.AffineTransformation.Builder clearVar() {
            this.var_ = 0;
            this.onChanged();
            return this;
         }

         public long getOffset() {
            return this.offset_;
         }

         public DecisionStrategyProto.AffineTransformation.Builder setOffset(long var1) {
            this.offset_ = var1;
            this.onChanged();
            return this;
         }

         public DecisionStrategyProto.AffineTransformation.Builder clearOffset() {
            this.offset_ = 0L;
            this.onChanged();
            return this;
         }

         public long getPositiveCoeff() {
            return this.positiveCoeff_;
         }

         public DecisionStrategyProto.AffineTransformation.Builder setPositiveCoeff(long var1) {
            this.positiveCoeff_ = var1;
            this.onChanged();
            return this;
         }

         public DecisionStrategyProto.AffineTransformation.Builder clearPositiveCoeff() {
            this.positiveCoeff_ = 0L;
            this.onChanged();
            return this;
         }

         public final DecisionStrategyProto.AffineTransformation.Builder setUnknownFields(UnknownFieldSet var1) {
            return (DecisionStrategyProto.AffineTransformation.Builder)super.setUnknownFields(var1);
         }

         public final DecisionStrategyProto.AffineTransformation.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (DecisionStrategyProto.AffineTransformation.Builder)super.mergeUnknownFields(var1);
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

   public interface AffineTransformationOrBuilder extends MessageOrBuilder {
      int getVar();

      long getOffset();

      long getPositiveCoeff();
   }

   public static enum DomainReductionStrategy implements ProtocolMessageEnum {
      SELECT_MIN_VALUE(0),
      SELECT_MAX_VALUE(1),
      SELECT_LOWER_HALF(2),
      SELECT_UPPER_HALF(3),
      SELECT_MEDIAN_VALUE(4),
      UNRECOGNIZED(-1);

      public static final int SELECT_MIN_VALUE_VALUE = 0;
      public static final int SELECT_MAX_VALUE_VALUE = 1;
      public static final int SELECT_LOWER_HALF_VALUE = 2;
      public static final int SELECT_UPPER_HALF_VALUE = 3;
      public static final int SELECT_MEDIAN_VALUE_VALUE = 4;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public DecisionStrategyProto.DomainReductionStrategy findValueByNumber(int var1) {
            return DecisionStrategyProto.DomainReductionStrategy.forNumber(var1);
         }
      };
      private static final DecisionStrategyProto.DomainReductionStrategy[] VALUES = values();
      private final int value;

      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      /** @deprecated */
      @Deprecated
      public static DecisionStrategyProto.DomainReductionStrategy valueOf(int var0) {
         return forNumber(var0);
      }

      public static DecisionStrategyProto.DomainReductionStrategy forNumber(int var0) {
         switch(var0) {
         case 0:
            return SELECT_MIN_VALUE;
         case 1:
            return SELECT_MAX_VALUE;
         case 2:
            return SELECT_LOWER_HALF;
         case 3:
            return SELECT_UPPER_HALF;
         case 4:
            return SELECT_MEDIAN_VALUE;
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
         return (EnumDescriptor)DecisionStrategyProto.getDescriptor().getEnumTypes().get(1);
      }

      public static DecisionStrategyProto.DomainReductionStrategy valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      private DomainReductionStrategy(int var3) {
         this.value = var3;
      }
   }

   public static enum VariableSelectionStrategy implements ProtocolMessageEnum {
      CHOOSE_FIRST(0),
      CHOOSE_LOWEST_MIN(1),
      CHOOSE_HIGHEST_MAX(2),
      CHOOSE_MIN_DOMAIN_SIZE(3),
      CHOOSE_MAX_DOMAIN_SIZE(4),
      UNRECOGNIZED(-1);

      public static final int CHOOSE_FIRST_VALUE = 0;
      public static final int CHOOSE_LOWEST_MIN_VALUE = 1;
      public static final int CHOOSE_HIGHEST_MAX_VALUE = 2;
      public static final int CHOOSE_MIN_DOMAIN_SIZE_VALUE = 3;
      public static final int CHOOSE_MAX_DOMAIN_SIZE_VALUE = 4;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public DecisionStrategyProto.VariableSelectionStrategy findValueByNumber(int var1) {
            return DecisionStrategyProto.VariableSelectionStrategy.forNumber(var1);
         }
      };
      private static final DecisionStrategyProto.VariableSelectionStrategy[] VALUES = values();
      private final int value;

      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      /** @deprecated */
      @Deprecated
      public static DecisionStrategyProto.VariableSelectionStrategy valueOf(int var0) {
         return forNumber(var0);
      }

      public static DecisionStrategyProto.VariableSelectionStrategy forNumber(int var0) {
         switch(var0) {
         case 0:
            return CHOOSE_FIRST;
         case 1:
            return CHOOSE_LOWEST_MIN;
         case 2:
            return CHOOSE_HIGHEST_MAX;
         case 3:
            return CHOOSE_MIN_DOMAIN_SIZE;
         case 4:
            return CHOOSE_MAX_DOMAIN_SIZE;
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
         return (EnumDescriptor)DecisionStrategyProto.getDescriptor().getEnumTypes().get(0);
      }

      public static DecisionStrategyProto.VariableSelectionStrategy valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      private VariableSelectionStrategy(int var3) {
         this.value = var3;
      }
   }
}
