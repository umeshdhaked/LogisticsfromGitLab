package com.google.ortools.sat;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CpModelProto extends GeneratedMessageV3 implements CpModelProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_;
   public static final int VARIABLES_FIELD_NUMBER = 2;
   private List variables_;
   public static final int CONSTRAINTS_FIELD_NUMBER = 3;
   private List constraints_;
   public static final int OBJECTIVE_FIELD_NUMBER = 4;
   private CpObjectiveProto objective_;
   public static final int SEARCH_STRATEGY_FIELD_NUMBER = 5;
   private List searchStrategy_;
   public static final int SOLUTION_HINT_FIELD_NUMBER = 6;
   private PartialVariableAssignment solutionHint_;
   private byte memoizedIsInitialized;
   private static final CpModelProto DEFAULT_INSTANCE = new CpModelProto();
   private static final Parser PARSER = new AbstractParser() {
      public CpModelProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new CpModelProto(var1, var2);
      }
   };

   private CpModelProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private CpModelProto() {
      this.memoizedIsInitialized = -1;
      this.name_ = "";
      this.variables_ = Collections.emptyList();
      this.constraints_ = Collections.emptyList();
      this.searchStrategy_ = Collections.emptyList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new CpModelProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private CpModelProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
               switch(var6) {
               case 0:
                  var5 = true;
                  break;
               case 10:
                  String var16 = var1.readStringRequireUtf8();
                  this.name_ = var16;
                  break;
               case 18:
                  if ((var3 & 1) == 0) {
                     this.variables_ = new ArrayList();
                     var3 |= 1;
                  }

                  this.variables_.add(var1.readMessage(IntegerVariableProto.parser(), var2));
                  break;
               case 26:
                  if ((var3 & 2) == 0) {
                     this.constraints_ = new ArrayList();
                     var3 |= 2;
                  }

                  this.constraints_.add(var1.readMessage(ConstraintProto.parser(), var2));
                  break;
               case 34:
                  CpObjectiveProto.Builder var15 = null;
                  if (this.objective_ != null) {
                     var15 = this.objective_.toBuilder();
                  }

                  this.objective_ = (CpObjectiveProto)var1.readMessage(CpObjectiveProto.parser(), var2);
                  if (var15 != null) {
                     var15.mergeFrom(this.objective_);
                     this.objective_ = var15.buildPartial();
                  }
                  break;
               case 42:
                  if ((var3 & 4) == 0) {
                     this.searchStrategy_ = new ArrayList();
                     var3 |= 4;
                  }

                  this.searchStrategy_.add(var1.readMessage(DecisionStrategyProto.parser(), var2));
                  break;
               case 50:
                  PartialVariableAssignment.Builder var7 = null;
                  if (this.solutionHint_ != null) {
                     var7 = this.solutionHint_.toBuilder();
                  }

                  this.solutionHint_ = (PartialVariableAssignment)var1.readMessage(PartialVariableAssignment.parser(), var2);
                  if (var7 != null) {
                     var7.mergeFrom(this.solutionHint_);
                     this.solutionHint_ = var7.buildPartial();
                  }
                  break;
               default:
                  if (!this.parseUnknownField(var1, var4, var2, var6)) {
                     var5 = true;
                  }
               }
            }
         } catch (InvalidProtocolBufferException var12) {
            throw var12.setUnfinishedMessage(this);
         } catch (IOException var13) {
            throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
         } finally {
            if ((var3 & 1) != 0) {
               this.variables_ = Collections.unmodifiableList(this.variables_);
            }

            if ((var3 & 2) != 0) {
               this.constraints_ = Collections.unmodifiableList(this.constraints_);
            }

            if ((var3 & 4) != 0) {
               this.searchStrategy_ = Collections.unmodifiableList(this.searchStrategy_);
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_CpModelProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_CpModelProto_fieldAccessorTable.ensureFieldAccessorsInitialized(CpModelProto.class, CpModelProto.Builder.class);
   }

   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.name_ = var3;
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

   public List getVariablesList() {
      return this.variables_;
   }

   public List getVariablesOrBuilderList() {
      return this.variables_;
   }

   public int getVariablesCount() {
      return this.variables_.size();
   }

   public IntegerVariableProto getVariables(int var1) {
      return (IntegerVariableProto)this.variables_.get(var1);
   }

   public IntegerVariableProtoOrBuilder getVariablesOrBuilder(int var1) {
      return (IntegerVariableProtoOrBuilder)this.variables_.get(var1);
   }

   public List getConstraintsList() {
      return this.constraints_;
   }

   public List getConstraintsOrBuilderList() {
      return this.constraints_;
   }

   public int getConstraintsCount() {
      return this.constraints_.size();
   }

   public ConstraintProto getConstraints(int var1) {
      return (ConstraintProto)this.constraints_.get(var1);
   }

   public ConstraintProtoOrBuilder getConstraintsOrBuilder(int var1) {
      return (ConstraintProtoOrBuilder)this.constraints_.get(var1);
   }

   public boolean hasObjective() {
      return this.objective_ != null;
   }

   public CpObjectiveProto getObjective() {
      return this.objective_ == null ? CpObjectiveProto.getDefaultInstance() : this.objective_;
   }

   public CpObjectiveProtoOrBuilder getObjectiveOrBuilder() {
      return this.getObjective();
   }

   public List getSearchStrategyList() {
      return this.searchStrategy_;
   }

   public List getSearchStrategyOrBuilderList() {
      return this.searchStrategy_;
   }

   public int getSearchStrategyCount() {
      return this.searchStrategy_.size();
   }

   public DecisionStrategyProto getSearchStrategy(int var1) {
      return (DecisionStrategyProto)this.searchStrategy_.get(var1);
   }

   public DecisionStrategyProtoOrBuilder getSearchStrategyOrBuilder(int var1) {
      return (DecisionStrategyProtoOrBuilder)this.searchStrategy_.get(var1);
   }

   public boolean hasSolutionHint() {
      return this.solutionHint_ != null;
   }

   public PartialVariableAssignment getSolutionHint() {
      return this.solutionHint_ == null ? PartialVariableAssignment.getDefaultInstance() : this.solutionHint_;
   }

   public PartialVariableAssignmentOrBuilder getSolutionHintOrBuilder() {
      return this.getSolutionHint();
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
      if (!this.getNameBytes().isEmpty()) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      int var2;
      for(var2 = 0; var2 < this.variables_.size(); ++var2) {
         var1.writeMessage(2, (MessageLite)this.variables_.get(var2));
      }

      for(var2 = 0; var2 < this.constraints_.size(); ++var2) {
         var1.writeMessage(3, (MessageLite)this.constraints_.get(var2));
      }

      if (this.objective_ != null) {
         var1.writeMessage(4, this.getObjective());
      }

      for(var2 = 0; var2 < this.searchStrategy_.size(); ++var2) {
         var1.writeMessage(5, (MessageLite)this.searchStrategy_.get(var2));
      }

      if (this.solutionHint_ != null) {
         var1.writeMessage(6, this.getSolutionHint());
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (!this.getNameBytes().isEmpty()) {
            var1 += GeneratedMessageV3.computeStringSize(1, this.name_);
         }

         int var2;
         for(var2 = 0; var2 < this.variables_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(2, (MessageLite)this.variables_.get(var2));
         }

         for(var2 = 0; var2 < this.constraints_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(3, (MessageLite)this.constraints_.get(var2));
         }

         if (this.objective_ != null) {
            var1 += CodedOutputStream.computeMessageSize(4, this.getObjective());
         }

         for(var2 = 0; var2 < this.searchStrategy_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(5, (MessageLite)this.searchStrategy_.get(var2));
         }

         if (this.solutionHint_ != null) {
            var1 += CodedOutputStream.computeMessageSize(6, this.getSolutionHint());
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CpModelProto)) {
         return super.equals(var1);
      } else {
         CpModelProto var2 = (CpModelProto)var1;
         if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getVariablesList().equals(var2.getVariablesList())) {
            return false;
         } else if (!this.getConstraintsList().equals(var2.getConstraintsList())) {
            return false;
         } else if (this.hasObjective() != var2.hasObjective()) {
            return false;
         } else if (this.hasObjective() && !this.getObjective().equals(var2.getObjective())) {
            return false;
         } else if (!this.getSearchStrategyList().equals(var2.getSearchStrategyList())) {
            return false;
         } else if (this.hasSolutionHint() != var2.hasSolutionHint()) {
            return false;
         } else if (this.hasSolutionHint() && !this.getSolutionHint().equals(var2.getSolutionHint())) {
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
         var2 = 53 * var2 + this.getName().hashCode();
         if (this.getVariablesCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getVariablesList().hashCode();
         }

         if (this.getConstraintsCount() > 0) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getConstraintsList().hashCode();
         }

         if (this.hasObjective()) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getObjective().hashCode();
         }

         if (this.getSearchStrategyCount() > 0) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.getSearchStrategyList().hashCode();
         }

         if (this.hasSolutionHint()) {
            var2 = 37 * var2 + 6;
            var2 = 53 * var2 + this.getSolutionHint().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static CpModelProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (CpModelProto)PARSER.parseFrom(var0);
   }

   public static CpModelProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CpModelProto)PARSER.parseFrom(var0, var1);
   }

   public static CpModelProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (CpModelProto)PARSER.parseFrom(var0);
   }

   public static CpModelProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CpModelProto)PARSER.parseFrom(var0, var1);
   }

   public static CpModelProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (CpModelProto)PARSER.parseFrom(var0);
   }

   public static CpModelProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CpModelProto)PARSER.parseFrom(var0, var1);
   }

   public static CpModelProto parseFrom(InputStream var0) throws IOException {
      return (CpModelProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CpModelProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CpModelProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CpModelProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (CpModelProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CpModelProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CpModelProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CpModelProto parseFrom(CodedInputStream var0) throws IOException {
      return (CpModelProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CpModelProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CpModelProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CpModelProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CpModelProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CpModelProto.Builder newBuilder(CpModelProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CpModelProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CpModelProto.Builder() : (new CpModelProto.Builder()).mergeFrom(this);
   }

   protected CpModelProto.Builder newBuilderForType(BuilderParent var1) {
      CpModelProto.Builder var2 = new CpModelProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static CpModelProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public CpModelProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   CpModelProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   CpModelProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements CpModelProtoOrBuilder {
      private int bitField0_;
      private Object name_;
      private List variables_;
      private RepeatedFieldBuilderV3 variablesBuilder_;
      private List constraints_;
      private RepeatedFieldBuilderV3 constraintsBuilder_;
      private CpObjectiveProto objective_;
      private SingleFieldBuilderV3 objectiveBuilder_;
      private List searchStrategy_;
      private RepeatedFieldBuilderV3 searchStrategyBuilder_;
      private PartialVariableAssignment solutionHint_;
      private SingleFieldBuilderV3 solutionHintBuilder_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_CpModelProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_CpModelProto_fieldAccessorTable.ensureFieldAccessorsInitialized(CpModelProto.class, CpModelProto.Builder.class);
      }

      private Builder() {
         this.name_ = "";
         this.variables_ = Collections.emptyList();
         this.constraints_ = Collections.emptyList();
         this.searchStrategy_ = Collections.emptyList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.name_ = "";
         this.variables_ = Collections.emptyList();
         this.constraints_ = Collections.emptyList();
         this.searchStrategy_ = Collections.emptyList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (CpModelProto.alwaysUseFieldBuilders) {
            this.getVariablesFieldBuilder();
            this.getConstraintsFieldBuilder();
            this.getSearchStrategyFieldBuilder();
         }

      }

      public CpModelProto.Builder clear() {
         super.clear();
         this.name_ = "";
         if (this.variablesBuilder_ == null) {
            this.variables_ = Collections.emptyList();
            this.bitField0_ &= -2;
         } else {
            this.variablesBuilder_.clear();
         }

         if (this.constraintsBuilder_ == null) {
            this.constraints_ = Collections.emptyList();
            this.bitField0_ &= -3;
         } else {
            this.constraintsBuilder_.clear();
         }

         if (this.objectiveBuilder_ == null) {
            this.objective_ = null;
         } else {
            this.objective_ = null;
            this.objectiveBuilder_ = null;
         }

         if (this.searchStrategyBuilder_ == null) {
            this.searchStrategy_ = Collections.emptyList();
            this.bitField0_ &= -5;
         } else {
            this.searchStrategyBuilder_.clear();
         }

         if (this.solutionHintBuilder_ == null) {
            this.solutionHint_ = null;
         } else {
            this.solutionHint_ = null;
            this.solutionHintBuilder_ = null;
         }

         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_CpModelProto_descriptor;
      }

      public CpModelProto getDefaultInstanceForType() {
         return CpModelProto.getDefaultInstance();
      }

      public CpModelProto build() {
         CpModelProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CpModelProto buildPartial() {
         CpModelProto var1 = new CpModelProto(this);
         int var2 = this.bitField0_;
         var1.name_ = this.name_;
         if (this.variablesBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.variables_ = Collections.unmodifiableList(this.variables_);
               this.bitField0_ &= -2;
            }

            var1.variables_ = this.variables_;
         } else {
            var1.variables_ = this.variablesBuilder_.build();
         }

         if (this.constraintsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.constraints_ = Collections.unmodifiableList(this.constraints_);
               this.bitField0_ &= -3;
            }

            var1.constraints_ = this.constraints_;
         } else {
            var1.constraints_ = this.constraintsBuilder_.build();
         }

         if (this.objectiveBuilder_ == null) {
            var1.objective_ = this.objective_;
         } else {
            var1.objective_ = (CpObjectiveProto)this.objectiveBuilder_.build();
         }

         if (this.searchStrategyBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.searchStrategy_ = Collections.unmodifiableList(this.searchStrategy_);
               this.bitField0_ &= -5;
            }

            var1.searchStrategy_ = this.searchStrategy_;
         } else {
            var1.searchStrategy_ = this.searchStrategyBuilder_.build();
         }

         if (this.solutionHintBuilder_ == null) {
            var1.solutionHint_ = this.solutionHint_;
         } else {
            var1.solutionHint_ = (PartialVariableAssignment)this.solutionHintBuilder_.build();
         }

         this.onBuilt();
         return var1;
      }

      public CpModelProto.Builder clone() {
         return (CpModelProto.Builder)super.clone();
      }

      public CpModelProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (CpModelProto.Builder)super.setField(var1, var2);
      }

      public CpModelProto.Builder clearField(FieldDescriptor var1) {
         return (CpModelProto.Builder)super.clearField(var1);
      }

      public CpModelProto.Builder clearOneof(OneofDescriptor var1) {
         return (CpModelProto.Builder)super.clearOneof(var1);
      }

      public CpModelProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (CpModelProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CpModelProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (CpModelProto.Builder)super.addRepeatedField(var1, var2);
      }

      public CpModelProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof CpModelProto) {
            return this.mergeFrom((CpModelProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public CpModelProto.Builder mergeFrom(CpModelProto var1) {
         if (var1 == CpModelProto.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.getName().isEmpty()) {
               this.name_ = var1.name_;
               this.onChanged();
            }

            if (this.variablesBuilder_ == null) {
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
            } else if (!var1.variables_.isEmpty()) {
               if (this.variablesBuilder_.isEmpty()) {
                  this.variablesBuilder_.dispose();
                  this.variablesBuilder_ = null;
                  this.variables_ = var1.variables_;
                  this.bitField0_ &= -2;
                  this.variablesBuilder_ = CpModelProto.alwaysUseFieldBuilders ? this.getVariablesFieldBuilder() : null;
               } else {
                  this.variablesBuilder_.addAllMessages(var1.variables_);
               }
            }

            if (this.constraintsBuilder_ == null) {
               if (!var1.constraints_.isEmpty()) {
                  if (this.constraints_.isEmpty()) {
                     this.constraints_ = var1.constraints_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureConstraintsIsMutable();
                     this.constraints_.addAll(var1.constraints_);
                  }

                  this.onChanged();
               }
            } else if (!var1.constraints_.isEmpty()) {
               if (this.constraintsBuilder_.isEmpty()) {
                  this.constraintsBuilder_.dispose();
                  this.constraintsBuilder_ = null;
                  this.constraints_ = var1.constraints_;
                  this.bitField0_ &= -3;
                  this.constraintsBuilder_ = CpModelProto.alwaysUseFieldBuilders ? this.getConstraintsFieldBuilder() : null;
               } else {
                  this.constraintsBuilder_.addAllMessages(var1.constraints_);
               }
            }

            if (var1.hasObjective()) {
               this.mergeObjective(var1.getObjective());
            }

            if (this.searchStrategyBuilder_ == null) {
               if (!var1.searchStrategy_.isEmpty()) {
                  if (this.searchStrategy_.isEmpty()) {
                     this.searchStrategy_ = var1.searchStrategy_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureSearchStrategyIsMutable();
                     this.searchStrategy_.addAll(var1.searchStrategy_);
                  }

                  this.onChanged();
               }
            } else if (!var1.searchStrategy_.isEmpty()) {
               if (this.searchStrategyBuilder_.isEmpty()) {
                  this.searchStrategyBuilder_.dispose();
                  this.searchStrategyBuilder_ = null;
                  this.searchStrategy_ = var1.searchStrategy_;
                  this.bitField0_ &= -5;
                  this.searchStrategyBuilder_ = CpModelProto.alwaysUseFieldBuilders ? this.getSearchStrategyFieldBuilder() : null;
               } else {
                  this.searchStrategyBuilder_.addAllMessages(var1.searchStrategy_);
               }
            }

            if (var1.hasSolutionHint()) {
               this.mergeSolutionHint(var1.getSolutionHint());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public CpModelProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         CpModelProto var3 = null;

         try {
            var3 = (CpModelProto)CpModelProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (CpModelProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
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

      public CpModelProto.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      public CpModelProto.Builder clearName() {
         this.name_ = CpModelProto.getDefaultInstance().getName();
         this.onChanged();
         return this;
      }

      public CpModelProto.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            CpModelProto.checkByteStringIsUtf8(var1);
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      private void ensureVariablesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.variables_ = new ArrayList(this.variables_);
            this.bitField0_ |= 1;
         }

      }

      public List getVariablesList() {
         return this.variablesBuilder_ == null ? Collections.unmodifiableList(this.variables_) : this.variablesBuilder_.getMessageList();
      }

      public int getVariablesCount() {
         return this.variablesBuilder_ == null ? this.variables_.size() : this.variablesBuilder_.getCount();
      }

      public IntegerVariableProto getVariables(int var1) {
         return this.variablesBuilder_ == null ? (IntegerVariableProto)this.variables_.get(var1) : (IntegerVariableProto)this.variablesBuilder_.getMessage(var1);
      }

      public CpModelProto.Builder setVariables(int var1, IntegerVariableProto var2) {
         if (this.variablesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureVariablesIsMutable();
            this.variables_.set(var1, var2);
            this.onChanged();
         } else {
            this.variablesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public CpModelProto.Builder setVariables(int var1, IntegerVariableProto.Builder var2) {
         if (this.variablesBuilder_ == null) {
            this.ensureVariablesIsMutable();
            this.variables_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.variablesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public CpModelProto.Builder addVariables(IntegerVariableProto var1) {
         if (this.variablesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureVariablesIsMutable();
            this.variables_.add(var1);
            this.onChanged();
         } else {
            this.variablesBuilder_.addMessage(var1);
         }

         return this;
      }

      public CpModelProto.Builder addVariables(int var1, IntegerVariableProto var2) {
         if (this.variablesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureVariablesIsMutable();
            this.variables_.add(var1, var2);
            this.onChanged();
         } else {
            this.variablesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public CpModelProto.Builder addVariables(IntegerVariableProto.Builder var1) {
         if (this.variablesBuilder_ == null) {
            this.ensureVariablesIsMutable();
            this.variables_.add(var1.build());
            this.onChanged();
         } else {
            this.variablesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public CpModelProto.Builder addVariables(int var1, IntegerVariableProto.Builder var2) {
         if (this.variablesBuilder_ == null) {
            this.ensureVariablesIsMutable();
            this.variables_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.variablesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public CpModelProto.Builder addAllVariables(Iterable var1) {
         if (this.variablesBuilder_ == null) {
            this.ensureVariablesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.variables_);
            this.onChanged();
         } else {
            this.variablesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public CpModelProto.Builder clearVariables() {
         if (this.variablesBuilder_ == null) {
            this.variables_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.variablesBuilder_.clear();
         }

         return this;
      }

      public CpModelProto.Builder removeVariables(int var1) {
         if (this.variablesBuilder_ == null) {
            this.ensureVariablesIsMutable();
            this.variables_.remove(var1);
            this.onChanged();
         } else {
            this.variablesBuilder_.remove(var1);
         }

         return this;
      }

      public IntegerVariableProto.Builder getVariablesBuilder(int var1) {
         return (IntegerVariableProto.Builder)this.getVariablesFieldBuilder().getBuilder(var1);
      }

      public IntegerVariableProtoOrBuilder getVariablesOrBuilder(int var1) {
         return this.variablesBuilder_ == null ? (IntegerVariableProtoOrBuilder)this.variables_.get(var1) : (IntegerVariableProtoOrBuilder)this.variablesBuilder_.getMessageOrBuilder(var1);
      }

      public List getVariablesOrBuilderList() {
         return this.variablesBuilder_ != null ? this.variablesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.variables_);
      }

      public IntegerVariableProto.Builder addVariablesBuilder() {
         return (IntegerVariableProto.Builder)this.getVariablesFieldBuilder().addBuilder(IntegerVariableProto.getDefaultInstance());
      }

      public IntegerVariableProto.Builder addVariablesBuilder(int var1) {
         return (IntegerVariableProto.Builder)this.getVariablesFieldBuilder().addBuilder(var1, IntegerVariableProto.getDefaultInstance());
      }

      public List getVariablesBuilderList() {
         return this.getVariablesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3 getVariablesFieldBuilder() {
         if (this.variablesBuilder_ == null) {
            this.variablesBuilder_ = new RepeatedFieldBuilderV3(this.variables_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.variables_ = null;
         }

         return this.variablesBuilder_;
      }

      private void ensureConstraintsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.constraints_ = new ArrayList(this.constraints_);
            this.bitField0_ |= 2;
         }

      }

      public List getConstraintsList() {
         return this.constraintsBuilder_ == null ? Collections.unmodifiableList(this.constraints_) : this.constraintsBuilder_.getMessageList();
      }

      public int getConstraintsCount() {
         return this.constraintsBuilder_ == null ? this.constraints_.size() : this.constraintsBuilder_.getCount();
      }

      public ConstraintProto getConstraints(int var1) {
         return this.constraintsBuilder_ == null ? (ConstraintProto)this.constraints_.get(var1) : (ConstraintProto)this.constraintsBuilder_.getMessage(var1);
      }

      public CpModelProto.Builder setConstraints(int var1, ConstraintProto var2) {
         if (this.constraintsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConstraintsIsMutable();
            this.constraints_.set(var1, var2);
            this.onChanged();
         } else {
            this.constraintsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public CpModelProto.Builder setConstraints(int var1, ConstraintProto.Builder var2) {
         if (this.constraintsBuilder_ == null) {
            this.ensureConstraintsIsMutable();
            this.constraints_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.constraintsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public CpModelProto.Builder addConstraints(ConstraintProto var1) {
         if (this.constraintsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureConstraintsIsMutable();
            this.constraints_.add(var1);
            this.onChanged();
         } else {
            this.constraintsBuilder_.addMessage(var1);
         }

         return this;
      }

      public CpModelProto.Builder addConstraints(int var1, ConstraintProto var2) {
         if (this.constraintsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConstraintsIsMutable();
            this.constraints_.add(var1, var2);
            this.onChanged();
         } else {
            this.constraintsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public CpModelProto.Builder addConstraints(ConstraintProto.Builder var1) {
         if (this.constraintsBuilder_ == null) {
            this.ensureConstraintsIsMutable();
            this.constraints_.add(var1.build());
            this.onChanged();
         } else {
            this.constraintsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public CpModelProto.Builder addConstraints(int var1, ConstraintProto.Builder var2) {
         if (this.constraintsBuilder_ == null) {
            this.ensureConstraintsIsMutable();
            this.constraints_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.constraintsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public CpModelProto.Builder addAllConstraints(Iterable var1) {
         if (this.constraintsBuilder_ == null) {
            this.ensureConstraintsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.constraints_);
            this.onChanged();
         } else {
            this.constraintsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public CpModelProto.Builder clearConstraints() {
         if (this.constraintsBuilder_ == null) {
            this.constraints_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.constraintsBuilder_.clear();
         }

         return this;
      }

      public CpModelProto.Builder removeConstraints(int var1) {
         if (this.constraintsBuilder_ == null) {
            this.ensureConstraintsIsMutable();
            this.constraints_.remove(var1);
            this.onChanged();
         } else {
            this.constraintsBuilder_.remove(var1);
         }

         return this;
      }

      public ConstraintProto.Builder getConstraintsBuilder(int var1) {
         return (ConstraintProto.Builder)this.getConstraintsFieldBuilder().getBuilder(var1);
      }

      public ConstraintProtoOrBuilder getConstraintsOrBuilder(int var1) {
         return this.constraintsBuilder_ == null ? (ConstraintProtoOrBuilder)this.constraints_.get(var1) : (ConstraintProtoOrBuilder)this.constraintsBuilder_.getMessageOrBuilder(var1);
      }

      public List getConstraintsOrBuilderList() {
         return this.constraintsBuilder_ != null ? this.constraintsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.constraints_);
      }

      public ConstraintProto.Builder addConstraintsBuilder() {
         return (ConstraintProto.Builder)this.getConstraintsFieldBuilder().addBuilder(ConstraintProto.getDefaultInstance());
      }

      public ConstraintProto.Builder addConstraintsBuilder(int var1) {
         return (ConstraintProto.Builder)this.getConstraintsFieldBuilder().addBuilder(var1, ConstraintProto.getDefaultInstance());
      }

      public List getConstraintsBuilderList() {
         return this.getConstraintsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3 getConstraintsFieldBuilder() {
         if (this.constraintsBuilder_ == null) {
            this.constraintsBuilder_ = new RepeatedFieldBuilderV3(this.constraints_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.constraints_ = null;
         }

         return this.constraintsBuilder_;
      }

      public boolean hasObjective() {
         return this.objectiveBuilder_ != null || this.objective_ != null;
      }

      public CpObjectiveProto getObjective() {
         if (this.objectiveBuilder_ == null) {
            return this.objective_ == null ? CpObjectiveProto.getDefaultInstance() : this.objective_;
         } else {
            return (CpObjectiveProto)this.objectiveBuilder_.getMessage();
         }
      }

      public CpModelProto.Builder setObjective(CpObjectiveProto var1) {
         if (this.objectiveBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.objective_ = var1;
            this.onChanged();
         } else {
            this.objectiveBuilder_.setMessage(var1);
         }

         return this;
      }

      public CpModelProto.Builder setObjective(CpObjectiveProto.Builder var1) {
         if (this.objectiveBuilder_ == null) {
            this.objective_ = var1.build();
            this.onChanged();
         } else {
            this.objectiveBuilder_.setMessage(var1.build());
         }

         return this;
      }

      public CpModelProto.Builder mergeObjective(CpObjectiveProto var1) {
         if (this.objectiveBuilder_ == null) {
            if (this.objective_ != null) {
               this.objective_ = CpObjectiveProto.newBuilder(this.objective_).mergeFrom(var1).buildPartial();
            } else {
               this.objective_ = var1;
            }

            this.onChanged();
         } else {
            this.objectiveBuilder_.mergeFrom(var1);
         }

         return this;
      }

      public CpModelProto.Builder clearObjective() {
         if (this.objectiveBuilder_ == null) {
            this.objective_ = null;
            this.onChanged();
         } else {
            this.objective_ = null;
            this.objectiveBuilder_ = null;
         }

         return this;
      }

      public CpObjectiveProto.Builder getObjectiveBuilder() {
         this.onChanged();
         return (CpObjectiveProto.Builder)this.getObjectiveFieldBuilder().getBuilder();
      }

      public CpObjectiveProtoOrBuilder getObjectiveOrBuilder() {
         if (this.objectiveBuilder_ != null) {
            return (CpObjectiveProtoOrBuilder)this.objectiveBuilder_.getMessageOrBuilder();
         } else {
            return this.objective_ == null ? CpObjectiveProto.getDefaultInstance() : this.objective_;
         }
      }

      private SingleFieldBuilderV3 getObjectiveFieldBuilder() {
         if (this.objectiveBuilder_ == null) {
            this.objectiveBuilder_ = new SingleFieldBuilderV3(this.getObjective(), this.getParentForChildren(), this.isClean());
            this.objective_ = null;
         }

         return this.objectiveBuilder_;
      }

      private void ensureSearchStrategyIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.searchStrategy_ = new ArrayList(this.searchStrategy_);
            this.bitField0_ |= 4;
         }

      }

      public List getSearchStrategyList() {
         return this.searchStrategyBuilder_ == null ? Collections.unmodifiableList(this.searchStrategy_) : this.searchStrategyBuilder_.getMessageList();
      }

      public int getSearchStrategyCount() {
         return this.searchStrategyBuilder_ == null ? this.searchStrategy_.size() : this.searchStrategyBuilder_.getCount();
      }

      public DecisionStrategyProto getSearchStrategy(int var1) {
         return this.searchStrategyBuilder_ == null ? (DecisionStrategyProto)this.searchStrategy_.get(var1) : (DecisionStrategyProto)this.searchStrategyBuilder_.getMessage(var1);
      }

      public CpModelProto.Builder setSearchStrategy(int var1, DecisionStrategyProto var2) {
         if (this.searchStrategyBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSearchStrategyIsMutable();
            this.searchStrategy_.set(var1, var2);
            this.onChanged();
         } else {
            this.searchStrategyBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public CpModelProto.Builder setSearchStrategy(int var1, DecisionStrategyProto.Builder var2) {
         if (this.searchStrategyBuilder_ == null) {
            this.ensureSearchStrategyIsMutable();
            this.searchStrategy_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.searchStrategyBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public CpModelProto.Builder addSearchStrategy(DecisionStrategyProto var1) {
         if (this.searchStrategyBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureSearchStrategyIsMutable();
            this.searchStrategy_.add(var1);
            this.onChanged();
         } else {
            this.searchStrategyBuilder_.addMessage(var1);
         }

         return this;
      }

      public CpModelProto.Builder addSearchStrategy(int var1, DecisionStrategyProto var2) {
         if (this.searchStrategyBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureSearchStrategyIsMutable();
            this.searchStrategy_.add(var1, var2);
            this.onChanged();
         } else {
            this.searchStrategyBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public CpModelProto.Builder addSearchStrategy(DecisionStrategyProto.Builder var1) {
         if (this.searchStrategyBuilder_ == null) {
            this.ensureSearchStrategyIsMutable();
            this.searchStrategy_.add(var1.build());
            this.onChanged();
         } else {
            this.searchStrategyBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public CpModelProto.Builder addSearchStrategy(int var1, DecisionStrategyProto.Builder var2) {
         if (this.searchStrategyBuilder_ == null) {
            this.ensureSearchStrategyIsMutable();
            this.searchStrategy_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.searchStrategyBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public CpModelProto.Builder addAllSearchStrategy(Iterable var1) {
         if (this.searchStrategyBuilder_ == null) {
            this.ensureSearchStrategyIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.searchStrategy_);
            this.onChanged();
         } else {
            this.searchStrategyBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public CpModelProto.Builder clearSearchStrategy() {
         if (this.searchStrategyBuilder_ == null) {
            this.searchStrategy_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.searchStrategyBuilder_.clear();
         }

         return this;
      }

      public CpModelProto.Builder removeSearchStrategy(int var1) {
         if (this.searchStrategyBuilder_ == null) {
            this.ensureSearchStrategyIsMutable();
            this.searchStrategy_.remove(var1);
            this.onChanged();
         } else {
            this.searchStrategyBuilder_.remove(var1);
         }

         return this;
      }

      public DecisionStrategyProto.Builder getSearchStrategyBuilder(int var1) {
         return (DecisionStrategyProto.Builder)this.getSearchStrategyFieldBuilder().getBuilder(var1);
      }

      public DecisionStrategyProtoOrBuilder getSearchStrategyOrBuilder(int var1) {
         return this.searchStrategyBuilder_ == null ? (DecisionStrategyProtoOrBuilder)this.searchStrategy_.get(var1) : (DecisionStrategyProtoOrBuilder)this.searchStrategyBuilder_.getMessageOrBuilder(var1);
      }

      public List getSearchStrategyOrBuilderList() {
         return this.searchStrategyBuilder_ != null ? this.searchStrategyBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.searchStrategy_);
      }

      public DecisionStrategyProto.Builder addSearchStrategyBuilder() {
         return (DecisionStrategyProto.Builder)this.getSearchStrategyFieldBuilder().addBuilder(DecisionStrategyProto.getDefaultInstance());
      }

      public DecisionStrategyProto.Builder addSearchStrategyBuilder(int var1) {
         return (DecisionStrategyProto.Builder)this.getSearchStrategyFieldBuilder().addBuilder(var1, DecisionStrategyProto.getDefaultInstance());
      }

      public List getSearchStrategyBuilderList() {
         return this.getSearchStrategyFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3 getSearchStrategyFieldBuilder() {
         if (this.searchStrategyBuilder_ == null) {
            this.searchStrategyBuilder_ = new RepeatedFieldBuilderV3(this.searchStrategy_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
            this.searchStrategy_ = null;
         }

         return this.searchStrategyBuilder_;
      }

      public boolean hasSolutionHint() {
         return this.solutionHintBuilder_ != null || this.solutionHint_ != null;
      }

      public PartialVariableAssignment getSolutionHint() {
         if (this.solutionHintBuilder_ == null) {
            return this.solutionHint_ == null ? PartialVariableAssignment.getDefaultInstance() : this.solutionHint_;
         } else {
            return (PartialVariableAssignment)this.solutionHintBuilder_.getMessage();
         }
      }

      public CpModelProto.Builder setSolutionHint(PartialVariableAssignment var1) {
         if (this.solutionHintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.solutionHint_ = var1;
            this.onChanged();
         } else {
            this.solutionHintBuilder_.setMessage(var1);
         }

         return this;
      }

      public CpModelProto.Builder setSolutionHint(PartialVariableAssignment.Builder var1) {
         if (this.solutionHintBuilder_ == null) {
            this.solutionHint_ = var1.build();
            this.onChanged();
         } else {
            this.solutionHintBuilder_.setMessage(var1.build());
         }

         return this;
      }

      public CpModelProto.Builder mergeSolutionHint(PartialVariableAssignment var1) {
         if (this.solutionHintBuilder_ == null) {
            if (this.solutionHint_ != null) {
               this.solutionHint_ = PartialVariableAssignment.newBuilder(this.solutionHint_).mergeFrom(var1).buildPartial();
            } else {
               this.solutionHint_ = var1;
            }

            this.onChanged();
         } else {
            this.solutionHintBuilder_.mergeFrom(var1);
         }

         return this;
      }

      public CpModelProto.Builder clearSolutionHint() {
         if (this.solutionHintBuilder_ == null) {
            this.solutionHint_ = null;
            this.onChanged();
         } else {
            this.solutionHint_ = null;
            this.solutionHintBuilder_ = null;
         }

         return this;
      }

      public PartialVariableAssignment.Builder getSolutionHintBuilder() {
         this.onChanged();
         return (PartialVariableAssignment.Builder)this.getSolutionHintFieldBuilder().getBuilder();
      }

      public PartialVariableAssignmentOrBuilder getSolutionHintOrBuilder() {
         if (this.solutionHintBuilder_ != null) {
            return (PartialVariableAssignmentOrBuilder)this.solutionHintBuilder_.getMessageOrBuilder();
         } else {
            return this.solutionHint_ == null ? PartialVariableAssignment.getDefaultInstance() : this.solutionHint_;
         }
      }

      private SingleFieldBuilderV3 getSolutionHintFieldBuilder() {
         if (this.solutionHintBuilder_ == null) {
            this.solutionHintBuilder_ = new SingleFieldBuilderV3(this.getSolutionHint(), this.getParentForChildren(), this.isClean());
            this.solutionHint_ = null;
         }

         return this.solutionHintBuilder_;
      }

      public final CpModelProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CpModelProto.Builder)super.setUnknownFields(var1);
      }

      public final CpModelProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CpModelProto.Builder)super.mergeUnknownFields(var1);
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
