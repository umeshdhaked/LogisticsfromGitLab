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

public final class MPModelProto extends GeneratedMessageV3 implements MPModelProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int VARIABLE_FIELD_NUMBER = 3;
   private List variable_;
   public static final int CONSTRAINT_FIELD_NUMBER = 4;
   private List constraint_;
   public static final int GENERAL_CONSTRAINT_FIELD_NUMBER = 7;
   private List generalConstraint_;
   public static final int MAXIMIZE_FIELD_NUMBER = 1;
   private boolean maximize_;
   public static final int OBJECTIVE_OFFSET_FIELD_NUMBER = 2;
   private double objectiveOffset_;
   public static final int QUADRATIC_OBJECTIVE_FIELD_NUMBER = 8;
   private MPQuadraticObjective quadraticObjective_;
   public static final int NAME_FIELD_NUMBER = 5;
   private volatile Object name_;
   public static final int SOLUTION_HINT_FIELD_NUMBER = 6;
   private PartialVariableAssignment solutionHint_;
   private byte memoizedIsInitialized;
   private static final MPModelProto DEFAULT_INSTANCE = new MPModelProto();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPModelProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPModelProto(var1, var2);
      }
   };

   private MPModelProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPModelProto() {
      this.memoizedIsInitialized = -1;
      this.variable_ = Collections.emptyList();
      this.constraint_ = Collections.emptyList();
      this.generalConstraint_ = Collections.emptyList();
      this.name_ = "";
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPModelProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPModelProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
               case 8:
                  this.bitField0_ |= 1;
                  this.maximize_ = var1.readBool();
                  break;
               case 17:
                  this.bitField0_ |= 2;
                  this.objectiveOffset_ = var1.readDouble();
                  break;
               case 26:
                  if ((var3 & 1) == 0) {
                     this.variable_ = new ArrayList();
                     var3 |= 1;
                  }

                  this.variable_.add(var1.readMessage(MPVariableProto.PARSER, var2));
                  break;
               case 34:
                  if ((var3 & 2) == 0) {
                     this.constraint_ = new ArrayList();
                     var3 |= 2;
                  }

                  this.constraint_.add(var1.readMessage(MPConstraintProto.PARSER, var2));
                  break;
               case 42:
                  ByteString var16 = var1.readBytes();
                  this.bitField0_ |= 8;
                  this.name_ = var16;
                  break;
               case 50:
                  PartialVariableAssignment.Builder var15 = null;
                  if ((this.bitField0_ & 16) != 0) {
                     var15 = this.solutionHint_.toBuilder();
                  }

                  this.solutionHint_ = (PartialVariableAssignment)var1.readMessage(PartialVariableAssignment.PARSER, var2);
                  if (var15 != null) {
                     var15.mergeFrom(this.solutionHint_);
                     this.solutionHint_ = var15.buildPartial();
                  }

                  this.bitField0_ |= 16;
                  break;
               case 58:
                  if ((var3 & 4) == 0) {
                     this.generalConstraint_ = new ArrayList();
                     var3 |= 4;
                  }

                  this.generalConstraint_.add(var1.readMessage(MPGeneralConstraintProto.PARSER, var2));
                  break;
               case 66:
                  MPQuadraticObjective.Builder var7 = null;
                  if ((this.bitField0_ & 4) != 0) {
                     var7 = this.quadraticObjective_.toBuilder();
                  }

                  this.quadraticObjective_ = (MPQuadraticObjective)var1.readMessage(MPQuadraticObjective.PARSER, var2);
                  if (var7 != null) {
                     var7.mergeFrom(this.quadraticObjective_);
                     this.quadraticObjective_ = var7.buildPartial();
                  }

                  this.bitField0_ |= 4;
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
               this.variable_ = Collections.unmodifiableList(this.variable_);
            }

            if ((var3 & 2) != 0) {
               this.constraint_ = Collections.unmodifiableList(this.constraint_);
            }

            if ((var3 & 4) != 0) {
               this.generalConstraint_ = Collections.unmodifiableList(this.generalConstraint_);
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPModelProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPModelProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MPModelProto.class, MPModelProto.Builder.class);
   }

   public List getVariableList() {
      return this.variable_;
   }

   public List getVariableOrBuilderList() {
      return this.variable_;
   }

   public int getVariableCount() {
      return this.variable_.size();
   }

   public MPVariableProto getVariable(int var1) {
      return (MPVariableProto)this.variable_.get(var1);
   }

   public MPVariableProtoOrBuilder getVariableOrBuilder(int var1) {
      return (MPVariableProtoOrBuilder)this.variable_.get(var1);
   }

   public List getConstraintList() {
      return this.constraint_;
   }

   public List getConstraintOrBuilderList() {
      return this.constraint_;
   }

   public int getConstraintCount() {
      return this.constraint_.size();
   }

   public MPConstraintProto getConstraint(int var1) {
      return (MPConstraintProto)this.constraint_.get(var1);
   }

   public MPConstraintProtoOrBuilder getConstraintOrBuilder(int var1) {
      return (MPConstraintProtoOrBuilder)this.constraint_.get(var1);
   }

   public List getGeneralConstraintList() {
      return this.generalConstraint_;
   }

   public List getGeneralConstraintOrBuilderList() {
      return this.generalConstraint_;
   }

   public int getGeneralConstraintCount() {
      return this.generalConstraint_.size();
   }

   public MPGeneralConstraintProto getGeneralConstraint(int var1) {
      return (MPGeneralConstraintProto)this.generalConstraint_.get(var1);
   }

   public MPGeneralConstraintProtoOrBuilder getGeneralConstraintOrBuilder(int var1) {
      return (MPGeneralConstraintProtoOrBuilder)this.generalConstraint_.get(var1);
   }

   public boolean hasMaximize() {
      return (this.bitField0_ & 1) != 0;
   }

   public boolean getMaximize() {
      return this.maximize_;
   }

   public boolean hasObjectiveOffset() {
      return (this.bitField0_ & 2) != 0;
   }

   public double getObjectiveOffset() {
      return this.objectiveOffset_;
   }

   public boolean hasQuadraticObjective() {
      return (this.bitField0_ & 4) != 0;
   }

   public MPQuadraticObjective getQuadraticObjective() {
      return this.quadraticObjective_ == null ? MPQuadraticObjective.getDefaultInstance() : this.quadraticObjective_;
   }

   public MPQuadraticObjectiveOrBuilder getQuadraticObjectiveOrBuilder() {
      return this.quadraticObjective_ == null ? MPQuadraticObjective.getDefaultInstance() : this.quadraticObjective_;
   }

   public boolean hasName() {
      return (this.bitField0_ & 8) != 0;
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

   public boolean hasSolutionHint() {
      return (this.bitField0_ & 16) != 0;
   }

   public PartialVariableAssignment getSolutionHint() {
      return this.solutionHint_ == null ? PartialVariableAssignment.getDefaultInstance() : this.solutionHint_;
   }

   public PartialVariableAssignmentOrBuilder getSolutionHintOrBuilder() {
      return this.solutionHint_ == null ? PartialVariableAssignment.getDefaultInstance() : this.solutionHint_;
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
         var1.writeBool(1, this.maximize_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeDouble(2, this.objectiveOffset_);
      }

      int var2;
      for(var2 = 0; var2 < this.variable_.size(); ++var2) {
         var1.writeMessage(3, (MessageLite)this.variable_.get(var2));
      }

      for(var2 = 0; var2 < this.constraint_.size(); ++var2) {
         var1.writeMessage(4, (MessageLite)this.constraint_.get(var2));
      }

      if ((this.bitField0_ & 8) != 0) {
         GeneratedMessageV3.writeString(var1, 5, this.name_);
      }

      if ((this.bitField0_ & 16) != 0) {
         var1.writeMessage(6, this.getSolutionHint());
      }

      for(var2 = 0; var2 < this.generalConstraint_.size(); ++var2) {
         var1.writeMessage(7, (MessageLite)this.generalConstraint_.get(var2));
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(8, this.getQuadraticObjective());
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
            var1 += CodedOutputStream.computeBoolSize(1, this.maximize_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(2, this.objectiveOffset_);
         }

         int var2;
         for(var2 = 0; var2 < this.variable_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(3, (MessageLite)this.variable_.get(var2));
         }

         for(var2 = 0; var2 < this.constraint_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(4, (MessageLite)this.constraint_.get(var2));
         }

         if ((this.bitField0_ & 8) != 0) {
            var1 += GeneratedMessageV3.computeStringSize(5, this.name_);
         }

         if ((this.bitField0_ & 16) != 0) {
            var1 += CodedOutputStream.computeMessageSize(6, this.getSolutionHint());
         }

         for(var2 = 0; var2 < this.generalConstraint_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(7, (MessageLite)this.generalConstraint_.get(var2));
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += CodedOutputStream.computeMessageSize(8, this.getQuadraticObjective());
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPModelProto)) {
         return super.equals(var1);
      } else {
         MPModelProto var2 = (MPModelProto)var1;
         if (!this.getVariableList().equals(var2.getVariableList())) {
            return false;
         } else if (!this.getConstraintList().equals(var2.getConstraintList())) {
            return false;
         } else if (!this.getGeneralConstraintList().equals(var2.getGeneralConstraintList())) {
            return false;
         } else if (this.hasMaximize() != var2.hasMaximize()) {
            return false;
         } else if (this.hasMaximize() && this.getMaximize() != var2.getMaximize()) {
            return false;
         } else if (this.hasObjectiveOffset() != var2.hasObjectiveOffset()) {
            return false;
         } else if (this.hasObjectiveOffset() && Double.doubleToLongBits(this.getObjectiveOffset()) != Double.doubleToLongBits(var2.getObjectiveOffset())) {
            return false;
         } else if (this.hasQuadraticObjective() != var2.hasQuadraticObjective()) {
            return false;
         } else if (this.hasQuadraticObjective() && !this.getQuadraticObjective().equals(var2.getQuadraticObjective())) {
            return false;
         } else if (this.hasName() != var2.hasName()) {
            return false;
         } else if (this.hasName() && !this.getName().equals(var2.getName())) {
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
         if (this.getVariableCount() > 0) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getVariableList().hashCode();
         }

         if (this.getConstraintCount() > 0) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getConstraintList().hashCode();
         }

         if (this.getGeneralConstraintCount() > 0) {
            var2 = 37 * var2 + 7;
            var2 = 53 * var2 + this.getGeneralConstraintList().hashCode();
         }

         if (this.hasMaximize()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + Internal.hashBoolean(this.getMaximize());
         }

         if (this.hasObjectiveOffset()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getObjectiveOffset()));
         }

         if (this.hasQuadraticObjective()) {
            var2 = 37 * var2 + 8;
            var2 = 53 * var2 + this.getQuadraticObjective().hashCode();
         }

         if (this.hasName()) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.getName().hashCode();
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

   public static MPModelProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPModelProto)PARSER.parseFrom(var0);
   }

   public static MPModelProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPModelProto)PARSER.parseFrom(var0, var1);
   }

   public static MPModelProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPModelProto)PARSER.parseFrom(var0);
   }

   public static MPModelProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPModelProto)PARSER.parseFrom(var0, var1);
   }

   public static MPModelProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPModelProto)PARSER.parseFrom(var0);
   }

   public static MPModelProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPModelProto)PARSER.parseFrom(var0, var1);
   }

   public static MPModelProto parseFrom(InputStream var0) throws IOException {
      return (MPModelProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPModelProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPModelProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPModelProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPModelProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPModelProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPModelProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPModelProto parseFrom(CodedInputStream var0) throws IOException {
      return (MPModelProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPModelProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPModelProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPModelProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPModelProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPModelProto.Builder newBuilder(MPModelProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPModelProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPModelProto.Builder() : (new MPModelProto.Builder()).mergeFrom(this);
   }

   protected MPModelProto.Builder newBuilderForType(BuilderParent var1) {
      MPModelProto.Builder var2 = new MPModelProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPModelProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPModelProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPModelProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPModelProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPModelProtoOrBuilder {
      private int bitField0_;
      private List variable_;
      private RepeatedFieldBuilderV3 variableBuilder_;
      private List constraint_;
      private RepeatedFieldBuilderV3 constraintBuilder_;
      private List generalConstraint_;
      private RepeatedFieldBuilderV3 generalConstraintBuilder_;
      private boolean maximize_;
      private double objectiveOffset_;
      private MPQuadraticObjective quadraticObjective_;
      private SingleFieldBuilderV3 quadraticObjectiveBuilder_;
      private Object name_;
      private PartialVariableAssignment solutionHint_;
      private SingleFieldBuilderV3 solutionHintBuilder_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPModelProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPModelProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MPModelProto.class, MPModelProto.Builder.class);
      }

      private Builder() {
         this.variable_ = Collections.emptyList();
         this.constraint_ = Collections.emptyList();
         this.generalConstraint_ = Collections.emptyList();
         this.name_ = "";
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.variable_ = Collections.emptyList();
         this.constraint_ = Collections.emptyList();
         this.generalConstraint_ = Collections.emptyList();
         this.name_ = "";
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPModelProto.alwaysUseFieldBuilders) {
            this.getVariableFieldBuilder();
            this.getConstraintFieldBuilder();
            this.getGeneralConstraintFieldBuilder();
            this.getQuadraticObjectiveFieldBuilder();
            this.getSolutionHintFieldBuilder();
         }

      }

      public MPModelProto.Builder clear() {
         super.clear();
         if (this.variableBuilder_ == null) {
            this.variable_ = Collections.emptyList();
            this.bitField0_ &= -2;
         } else {
            this.variableBuilder_.clear();
         }

         if (this.constraintBuilder_ == null) {
            this.constraint_ = Collections.emptyList();
            this.bitField0_ &= -3;
         } else {
            this.constraintBuilder_.clear();
         }

         if (this.generalConstraintBuilder_ == null) {
            this.generalConstraint_ = Collections.emptyList();
            this.bitField0_ &= -5;
         } else {
            this.generalConstraintBuilder_.clear();
         }

         this.maximize_ = false;
         this.bitField0_ &= -9;
         this.objectiveOffset_ = 0.0D;
         this.bitField0_ &= -17;
         if (this.quadraticObjectiveBuilder_ == null) {
            this.quadraticObjective_ = null;
         } else {
            this.quadraticObjectiveBuilder_.clear();
         }

         this.bitField0_ &= -33;
         this.name_ = "";
         this.bitField0_ &= -65;
         if (this.solutionHintBuilder_ == null) {
            this.solutionHint_ = null;
         } else {
            this.solutionHintBuilder_.clear();
         }

         this.bitField0_ &= -129;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPModelProto_descriptor;
      }

      public MPModelProto getDefaultInstanceForType() {
         return MPModelProto.getDefaultInstance();
      }

      public MPModelProto build() {
         MPModelProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPModelProto buildPartial() {
         MPModelProto var1 = new MPModelProto(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if (this.variableBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.variable_ = Collections.unmodifiableList(this.variable_);
               this.bitField0_ &= -2;
            }

            var1.variable_ = this.variable_;
         } else {
            var1.variable_ = this.variableBuilder_.build();
         }

         if (this.constraintBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.constraint_ = Collections.unmodifiableList(this.constraint_);
               this.bitField0_ &= -3;
            }

            var1.constraint_ = this.constraint_;
         } else {
            var1.constraint_ = this.constraintBuilder_.build();
         }

         if (this.generalConstraintBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.generalConstraint_ = Collections.unmodifiableList(this.generalConstraint_);
               this.bitField0_ &= -5;
            }

            var1.generalConstraint_ = this.generalConstraint_;
         } else {
            var1.generalConstraint_ = this.generalConstraintBuilder_.build();
         }

         if ((var2 & 8) != 0) {
            var1.maximize_ = this.maximize_;
            var3 |= 1;
         }

         if ((var2 & 16) != 0) {
            var1.objectiveOffset_ = this.objectiveOffset_;
            var3 |= 2;
         }

         if ((var2 & 32) != 0) {
            if (this.quadraticObjectiveBuilder_ == null) {
               var1.quadraticObjective_ = this.quadraticObjective_;
            } else {
               var1.quadraticObjective_ = (MPQuadraticObjective)this.quadraticObjectiveBuilder_.build();
            }

            var3 |= 4;
         }

         if ((var2 & 64) != 0) {
            var3 |= 8;
         }

         var1.name_ = this.name_;
         if ((var2 & 128) != 0) {
            if (this.solutionHintBuilder_ == null) {
               var1.solutionHint_ = this.solutionHint_;
            } else {
               var1.solutionHint_ = (PartialVariableAssignment)this.solutionHintBuilder_.build();
            }

            var3 |= 16;
         }

         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPModelProto.Builder clone() {
         return (MPModelProto.Builder)super.clone();
      }

      public MPModelProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPModelProto.Builder)super.setField(var1, var2);
      }

      public MPModelProto.Builder clearField(FieldDescriptor var1) {
         return (MPModelProto.Builder)super.clearField(var1);
      }

      public MPModelProto.Builder clearOneof(OneofDescriptor var1) {
         return (MPModelProto.Builder)super.clearOneof(var1);
      }

      public MPModelProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPModelProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPModelProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPModelProto.Builder)super.addRepeatedField(var1, var2);
      }

      public MPModelProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPModelProto) {
            return this.mergeFrom((MPModelProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPModelProto.Builder mergeFrom(MPModelProto var1) {
         if (var1 == MPModelProto.getDefaultInstance()) {
            return this;
         } else {
            if (this.variableBuilder_ == null) {
               if (!var1.variable_.isEmpty()) {
                  if (this.variable_.isEmpty()) {
                     this.variable_ = var1.variable_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureVariableIsMutable();
                     this.variable_.addAll(var1.variable_);
                  }

                  this.onChanged();
               }
            } else if (!var1.variable_.isEmpty()) {
               if (this.variableBuilder_.isEmpty()) {
                  this.variableBuilder_.dispose();
                  this.variableBuilder_ = null;
                  this.variable_ = var1.variable_;
                  this.bitField0_ &= -2;
                  this.variableBuilder_ = MPModelProto.alwaysUseFieldBuilders ? this.getVariableFieldBuilder() : null;
               } else {
                  this.variableBuilder_.addAllMessages(var1.variable_);
               }
            }

            if (this.constraintBuilder_ == null) {
               if (!var1.constraint_.isEmpty()) {
                  if (this.constraint_.isEmpty()) {
                     this.constraint_ = var1.constraint_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureConstraintIsMutable();
                     this.constraint_.addAll(var1.constraint_);
                  }

                  this.onChanged();
               }
            } else if (!var1.constraint_.isEmpty()) {
               if (this.constraintBuilder_.isEmpty()) {
                  this.constraintBuilder_.dispose();
                  this.constraintBuilder_ = null;
                  this.constraint_ = var1.constraint_;
                  this.bitField0_ &= -3;
                  this.constraintBuilder_ = MPModelProto.alwaysUseFieldBuilders ? this.getConstraintFieldBuilder() : null;
               } else {
                  this.constraintBuilder_.addAllMessages(var1.constraint_);
               }
            }

            if (this.generalConstraintBuilder_ == null) {
               if (!var1.generalConstraint_.isEmpty()) {
                  if (this.generalConstraint_.isEmpty()) {
                     this.generalConstraint_ = var1.generalConstraint_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureGeneralConstraintIsMutable();
                     this.generalConstraint_.addAll(var1.generalConstraint_);
                  }

                  this.onChanged();
               }
            } else if (!var1.generalConstraint_.isEmpty()) {
               if (this.generalConstraintBuilder_.isEmpty()) {
                  this.generalConstraintBuilder_.dispose();
                  this.generalConstraintBuilder_ = null;
                  this.generalConstraint_ = var1.generalConstraint_;
                  this.bitField0_ &= -5;
                  this.generalConstraintBuilder_ = MPModelProto.alwaysUseFieldBuilders ? this.getGeneralConstraintFieldBuilder() : null;
               } else {
                  this.generalConstraintBuilder_.addAllMessages(var1.generalConstraint_);
               }
            }

            if (var1.hasMaximize()) {
               this.setMaximize(var1.getMaximize());
            }

            if (var1.hasObjectiveOffset()) {
               this.setObjectiveOffset(var1.getObjectiveOffset());
            }

            if (var1.hasQuadraticObjective()) {
               this.mergeQuadraticObjective(var1.getQuadraticObjective());
            }

            if (var1.hasName()) {
               this.bitField0_ |= 64;
               this.name_ = var1.name_;
               this.onChanged();
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

      public MPModelProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPModelProto var3 = null;

         try {
            var3 = (MPModelProto)MPModelProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPModelProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureVariableIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.variable_ = new ArrayList(this.variable_);
            this.bitField0_ |= 1;
         }

      }

      public List getVariableList() {
         return this.variableBuilder_ == null ? Collections.unmodifiableList(this.variable_) : this.variableBuilder_.getMessageList();
      }

      public int getVariableCount() {
         return this.variableBuilder_ == null ? this.variable_.size() : this.variableBuilder_.getCount();
      }

      public MPVariableProto getVariable(int var1) {
         return this.variableBuilder_ == null ? (MPVariableProto)this.variable_.get(var1) : (MPVariableProto)this.variableBuilder_.getMessage(var1);
      }

      public MPModelProto.Builder setVariable(int var1, MPVariableProto var2) {
         if (this.variableBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureVariableIsMutable();
            this.variable_.set(var1, var2);
            this.onChanged();
         } else {
            this.variableBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public MPModelProto.Builder setVariable(int var1, MPVariableProto.Builder var2) {
         if (this.variableBuilder_ == null) {
            this.ensureVariableIsMutable();
            this.variable_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.variableBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public MPModelProto.Builder addVariable(MPVariableProto var1) {
         if (this.variableBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureVariableIsMutable();
            this.variable_.add(var1);
            this.onChanged();
         } else {
            this.variableBuilder_.addMessage(var1);
         }

         return this;
      }

      public MPModelProto.Builder addVariable(int var1, MPVariableProto var2) {
         if (this.variableBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureVariableIsMutable();
            this.variable_.add(var1, var2);
            this.onChanged();
         } else {
            this.variableBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public MPModelProto.Builder addVariable(MPVariableProto.Builder var1) {
         if (this.variableBuilder_ == null) {
            this.ensureVariableIsMutable();
            this.variable_.add(var1.build());
            this.onChanged();
         } else {
            this.variableBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public MPModelProto.Builder addVariable(int var1, MPVariableProto.Builder var2) {
         if (this.variableBuilder_ == null) {
            this.ensureVariableIsMutable();
            this.variable_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.variableBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public MPModelProto.Builder addAllVariable(Iterable var1) {
         if (this.variableBuilder_ == null) {
            this.ensureVariableIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.variable_);
            this.onChanged();
         } else {
            this.variableBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public MPModelProto.Builder clearVariable() {
         if (this.variableBuilder_ == null) {
            this.variable_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.variableBuilder_.clear();
         }

         return this;
      }

      public MPModelProto.Builder removeVariable(int var1) {
         if (this.variableBuilder_ == null) {
            this.ensureVariableIsMutable();
            this.variable_.remove(var1);
            this.onChanged();
         } else {
            this.variableBuilder_.remove(var1);
         }

         return this;
      }

      public MPVariableProto.Builder getVariableBuilder(int var1) {
         return (MPVariableProto.Builder)this.getVariableFieldBuilder().getBuilder(var1);
      }

      public MPVariableProtoOrBuilder getVariableOrBuilder(int var1) {
         return this.variableBuilder_ == null ? (MPVariableProtoOrBuilder)this.variable_.get(var1) : (MPVariableProtoOrBuilder)this.variableBuilder_.getMessageOrBuilder(var1);
      }

      public List getVariableOrBuilderList() {
         return this.variableBuilder_ != null ? this.variableBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.variable_);
      }

      public MPVariableProto.Builder addVariableBuilder() {
         return (MPVariableProto.Builder)this.getVariableFieldBuilder().addBuilder(MPVariableProto.getDefaultInstance());
      }

      public MPVariableProto.Builder addVariableBuilder(int var1) {
         return (MPVariableProto.Builder)this.getVariableFieldBuilder().addBuilder(var1, MPVariableProto.getDefaultInstance());
      }

      public List getVariableBuilderList() {
         return this.getVariableFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3 getVariableFieldBuilder() {
         if (this.variableBuilder_ == null) {
            this.variableBuilder_ = new RepeatedFieldBuilderV3(this.variable_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.variable_ = null;
         }

         return this.variableBuilder_;
      }

      private void ensureConstraintIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.constraint_ = new ArrayList(this.constraint_);
            this.bitField0_ |= 2;
         }

      }

      public List getConstraintList() {
         return this.constraintBuilder_ == null ? Collections.unmodifiableList(this.constraint_) : this.constraintBuilder_.getMessageList();
      }

      public int getConstraintCount() {
         return this.constraintBuilder_ == null ? this.constraint_.size() : this.constraintBuilder_.getCount();
      }

      public MPConstraintProto getConstraint(int var1) {
         return this.constraintBuilder_ == null ? (MPConstraintProto)this.constraint_.get(var1) : (MPConstraintProto)this.constraintBuilder_.getMessage(var1);
      }

      public MPModelProto.Builder setConstraint(int var1, MPConstraintProto var2) {
         if (this.constraintBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConstraintIsMutable();
            this.constraint_.set(var1, var2);
            this.onChanged();
         } else {
            this.constraintBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public MPModelProto.Builder setConstraint(int var1, MPConstraintProto.Builder var2) {
         if (this.constraintBuilder_ == null) {
            this.ensureConstraintIsMutable();
            this.constraint_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.constraintBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public MPModelProto.Builder addConstraint(MPConstraintProto var1) {
         if (this.constraintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureConstraintIsMutable();
            this.constraint_.add(var1);
            this.onChanged();
         } else {
            this.constraintBuilder_.addMessage(var1);
         }

         return this;
      }

      public MPModelProto.Builder addConstraint(int var1, MPConstraintProto var2) {
         if (this.constraintBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConstraintIsMutable();
            this.constraint_.add(var1, var2);
            this.onChanged();
         } else {
            this.constraintBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public MPModelProto.Builder addConstraint(MPConstraintProto.Builder var1) {
         if (this.constraintBuilder_ == null) {
            this.ensureConstraintIsMutable();
            this.constraint_.add(var1.build());
            this.onChanged();
         } else {
            this.constraintBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public MPModelProto.Builder addConstraint(int var1, MPConstraintProto.Builder var2) {
         if (this.constraintBuilder_ == null) {
            this.ensureConstraintIsMutable();
            this.constraint_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.constraintBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public MPModelProto.Builder addAllConstraint(Iterable var1) {
         if (this.constraintBuilder_ == null) {
            this.ensureConstraintIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.constraint_);
            this.onChanged();
         } else {
            this.constraintBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public MPModelProto.Builder clearConstraint() {
         if (this.constraintBuilder_ == null) {
            this.constraint_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.constraintBuilder_.clear();
         }

         return this;
      }

      public MPModelProto.Builder removeConstraint(int var1) {
         if (this.constraintBuilder_ == null) {
            this.ensureConstraintIsMutable();
            this.constraint_.remove(var1);
            this.onChanged();
         } else {
            this.constraintBuilder_.remove(var1);
         }

         return this;
      }

      public MPConstraintProto.Builder getConstraintBuilder(int var1) {
         return (MPConstraintProto.Builder)this.getConstraintFieldBuilder().getBuilder(var1);
      }

      public MPConstraintProtoOrBuilder getConstraintOrBuilder(int var1) {
         return this.constraintBuilder_ == null ? (MPConstraintProtoOrBuilder)this.constraint_.get(var1) : (MPConstraintProtoOrBuilder)this.constraintBuilder_.getMessageOrBuilder(var1);
      }

      public List getConstraintOrBuilderList() {
         return this.constraintBuilder_ != null ? this.constraintBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.constraint_);
      }

      public MPConstraintProto.Builder addConstraintBuilder() {
         return (MPConstraintProto.Builder)this.getConstraintFieldBuilder().addBuilder(MPConstraintProto.getDefaultInstance());
      }

      public MPConstraintProto.Builder addConstraintBuilder(int var1) {
         return (MPConstraintProto.Builder)this.getConstraintFieldBuilder().addBuilder(var1, MPConstraintProto.getDefaultInstance());
      }

      public List getConstraintBuilderList() {
         return this.getConstraintFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3 getConstraintFieldBuilder() {
         if (this.constraintBuilder_ == null) {
            this.constraintBuilder_ = new RepeatedFieldBuilderV3(this.constraint_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         return this.constraintBuilder_;
      }

      private void ensureGeneralConstraintIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.generalConstraint_ = new ArrayList(this.generalConstraint_);
            this.bitField0_ |= 4;
         }

      }

      public List getGeneralConstraintList() {
         return this.generalConstraintBuilder_ == null ? Collections.unmodifiableList(this.generalConstraint_) : this.generalConstraintBuilder_.getMessageList();
      }

      public int getGeneralConstraintCount() {
         return this.generalConstraintBuilder_ == null ? this.generalConstraint_.size() : this.generalConstraintBuilder_.getCount();
      }

      public MPGeneralConstraintProto getGeneralConstraint(int var1) {
         return this.generalConstraintBuilder_ == null ? (MPGeneralConstraintProto)this.generalConstraint_.get(var1) : (MPGeneralConstraintProto)this.generalConstraintBuilder_.getMessage(var1);
      }

      public MPModelProto.Builder setGeneralConstraint(int var1, MPGeneralConstraintProto var2) {
         if (this.generalConstraintBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureGeneralConstraintIsMutable();
            this.generalConstraint_.set(var1, var2);
            this.onChanged();
         } else {
            this.generalConstraintBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public MPModelProto.Builder setGeneralConstraint(int var1, MPGeneralConstraintProto.Builder var2) {
         if (this.generalConstraintBuilder_ == null) {
            this.ensureGeneralConstraintIsMutable();
            this.generalConstraint_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.generalConstraintBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public MPModelProto.Builder addGeneralConstraint(MPGeneralConstraintProto var1) {
         if (this.generalConstraintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureGeneralConstraintIsMutable();
            this.generalConstraint_.add(var1);
            this.onChanged();
         } else {
            this.generalConstraintBuilder_.addMessage(var1);
         }

         return this;
      }

      public MPModelProto.Builder addGeneralConstraint(int var1, MPGeneralConstraintProto var2) {
         if (this.generalConstraintBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureGeneralConstraintIsMutable();
            this.generalConstraint_.add(var1, var2);
            this.onChanged();
         } else {
            this.generalConstraintBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public MPModelProto.Builder addGeneralConstraint(MPGeneralConstraintProto.Builder var1) {
         if (this.generalConstraintBuilder_ == null) {
            this.ensureGeneralConstraintIsMutable();
            this.generalConstraint_.add(var1.build());
            this.onChanged();
         } else {
            this.generalConstraintBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public MPModelProto.Builder addGeneralConstraint(int var1, MPGeneralConstraintProto.Builder var2) {
         if (this.generalConstraintBuilder_ == null) {
            this.ensureGeneralConstraintIsMutable();
            this.generalConstraint_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.generalConstraintBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public MPModelProto.Builder addAllGeneralConstraint(Iterable var1) {
         if (this.generalConstraintBuilder_ == null) {
            this.ensureGeneralConstraintIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.generalConstraint_);
            this.onChanged();
         } else {
            this.generalConstraintBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public MPModelProto.Builder clearGeneralConstraint() {
         if (this.generalConstraintBuilder_ == null) {
            this.generalConstraint_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.generalConstraintBuilder_.clear();
         }

         return this;
      }

      public MPModelProto.Builder removeGeneralConstraint(int var1) {
         if (this.generalConstraintBuilder_ == null) {
            this.ensureGeneralConstraintIsMutable();
            this.generalConstraint_.remove(var1);
            this.onChanged();
         } else {
            this.generalConstraintBuilder_.remove(var1);
         }

         return this;
      }

      public MPGeneralConstraintProto.Builder getGeneralConstraintBuilder(int var1) {
         return (MPGeneralConstraintProto.Builder)this.getGeneralConstraintFieldBuilder().getBuilder(var1);
      }

      public MPGeneralConstraintProtoOrBuilder getGeneralConstraintOrBuilder(int var1) {
         return this.generalConstraintBuilder_ == null ? (MPGeneralConstraintProtoOrBuilder)this.generalConstraint_.get(var1) : (MPGeneralConstraintProtoOrBuilder)this.generalConstraintBuilder_.getMessageOrBuilder(var1);
      }

      public List getGeneralConstraintOrBuilderList() {
         return this.generalConstraintBuilder_ != null ? this.generalConstraintBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.generalConstraint_);
      }

      public MPGeneralConstraintProto.Builder addGeneralConstraintBuilder() {
         return (MPGeneralConstraintProto.Builder)this.getGeneralConstraintFieldBuilder().addBuilder(MPGeneralConstraintProto.getDefaultInstance());
      }

      public MPGeneralConstraintProto.Builder addGeneralConstraintBuilder(int var1) {
         return (MPGeneralConstraintProto.Builder)this.getGeneralConstraintFieldBuilder().addBuilder(var1, MPGeneralConstraintProto.getDefaultInstance());
      }

      public List getGeneralConstraintBuilderList() {
         return this.getGeneralConstraintFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3 getGeneralConstraintFieldBuilder() {
         if (this.generalConstraintBuilder_ == null) {
            this.generalConstraintBuilder_ = new RepeatedFieldBuilderV3(this.generalConstraint_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
            this.generalConstraint_ = null;
         }

         return this.generalConstraintBuilder_;
      }

      public boolean hasMaximize() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getMaximize() {
         return this.maximize_;
      }

      public MPModelProto.Builder setMaximize(boolean var1) {
         this.bitField0_ |= 8;
         this.maximize_ = var1;
         this.onChanged();
         return this;
      }

      public MPModelProto.Builder clearMaximize() {
         this.bitField0_ &= -9;
         this.maximize_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasObjectiveOffset() {
         return (this.bitField0_ & 16) != 0;
      }

      public double getObjectiveOffset() {
         return this.objectiveOffset_;
      }

      public MPModelProto.Builder setObjectiveOffset(double var1) {
         this.bitField0_ |= 16;
         this.objectiveOffset_ = var1;
         this.onChanged();
         return this;
      }

      public MPModelProto.Builder clearObjectiveOffset() {
         this.bitField0_ &= -17;
         this.objectiveOffset_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean hasQuadraticObjective() {
         return (this.bitField0_ & 32) != 0;
      }

      public MPQuadraticObjective getQuadraticObjective() {
         if (this.quadraticObjectiveBuilder_ == null) {
            return this.quadraticObjective_ == null ? MPQuadraticObjective.getDefaultInstance() : this.quadraticObjective_;
         } else {
            return (MPQuadraticObjective)this.quadraticObjectiveBuilder_.getMessage();
         }
      }

      public MPModelProto.Builder setQuadraticObjective(MPQuadraticObjective var1) {
         if (this.quadraticObjectiveBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.quadraticObjective_ = var1;
            this.onChanged();
         } else {
            this.quadraticObjectiveBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         return this;
      }

      public MPModelProto.Builder setQuadraticObjective(MPQuadraticObjective.Builder var1) {
         if (this.quadraticObjectiveBuilder_ == null) {
            this.quadraticObjective_ = var1.build();
            this.onChanged();
         } else {
            this.quadraticObjectiveBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         return this;
      }

      public MPModelProto.Builder mergeQuadraticObjective(MPQuadraticObjective var1) {
         if (this.quadraticObjectiveBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.quadraticObjective_ != null && this.quadraticObjective_ != MPQuadraticObjective.getDefaultInstance()) {
               this.quadraticObjective_ = MPQuadraticObjective.newBuilder(this.quadraticObjective_).mergeFrom(var1).buildPartial();
            } else {
               this.quadraticObjective_ = var1;
            }

            this.onChanged();
         } else {
            this.quadraticObjectiveBuilder_.mergeFrom(var1);
         }

         this.bitField0_ |= 32;
         return this;
      }

      public MPModelProto.Builder clearQuadraticObjective() {
         if (this.quadraticObjectiveBuilder_ == null) {
            this.quadraticObjective_ = null;
            this.onChanged();
         } else {
            this.quadraticObjectiveBuilder_.clear();
         }

         this.bitField0_ &= -33;
         return this;
      }

      public MPQuadraticObjective.Builder getQuadraticObjectiveBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return (MPQuadraticObjective.Builder)this.getQuadraticObjectiveFieldBuilder().getBuilder();
      }

      public MPQuadraticObjectiveOrBuilder getQuadraticObjectiveOrBuilder() {
         if (this.quadraticObjectiveBuilder_ != null) {
            return (MPQuadraticObjectiveOrBuilder)this.quadraticObjectiveBuilder_.getMessageOrBuilder();
         } else {
            return this.quadraticObjective_ == null ? MPQuadraticObjective.getDefaultInstance() : this.quadraticObjective_;
         }
      }

      private SingleFieldBuilderV3 getQuadraticObjectiveFieldBuilder() {
         if (this.quadraticObjectiveBuilder_ == null) {
            this.quadraticObjectiveBuilder_ = new SingleFieldBuilderV3(this.getQuadraticObjective(), this.getParentForChildren(), this.isClean());
            this.quadraticObjective_ = null;
         }

         return this.quadraticObjectiveBuilder_;
      }

      public boolean hasName() {
         return (this.bitField0_ & 64) != 0;
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

      public MPModelProto.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 64;
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      public MPModelProto.Builder clearName() {
         this.bitField0_ &= -65;
         this.name_ = MPModelProto.getDefaultInstance().getName();
         this.onChanged();
         return this;
      }

      public MPModelProto.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 64;
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      public boolean hasSolutionHint() {
         return (this.bitField0_ & 128) != 0;
      }

      public PartialVariableAssignment getSolutionHint() {
         if (this.solutionHintBuilder_ == null) {
            return this.solutionHint_ == null ? PartialVariableAssignment.getDefaultInstance() : this.solutionHint_;
         } else {
            return (PartialVariableAssignment)this.solutionHintBuilder_.getMessage();
         }
      }

      public MPModelProto.Builder setSolutionHint(PartialVariableAssignment var1) {
         if (this.solutionHintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.solutionHint_ = var1;
            this.onChanged();
         } else {
            this.solutionHintBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         return this;
      }

      public MPModelProto.Builder setSolutionHint(PartialVariableAssignment.Builder var1) {
         if (this.solutionHintBuilder_ == null) {
            this.solutionHint_ = var1.build();
            this.onChanged();
         } else {
            this.solutionHintBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         return this;
      }

      public MPModelProto.Builder mergeSolutionHint(PartialVariableAssignment var1) {
         if (this.solutionHintBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.solutionHint_ != null && this.solutionHint_ != PartialVariableAssignment.getDefaultInstance()) {
               this.solutionHint_ = PartialVariableAssignment.newBuilder(this.solutionHint_).mergeFrom(var1).buildPartial();
            } else {
               this.solutionHint_ = var1;
            }

            this.onChanged();
         } else {
            this.solutionHintBuilder_.mergeFrom(var1);
         }

         this.bitField0_ |= 128;
         return this;
      }

      public MPModelProto.Builder clearSolutionHint() {
         if (this.solutionHintBuilder_ == null) {
            this.solutionHint_ = null;
            this.onChanged();
         } else {
            this.solutionHintBuilder_.clear();
         }

         this.bitField0_ &= -129;
         return this;
      }

      public PartialVariableAssignment.Builder getSolutionHintBuilder() {
         this.bitField0_ |= 128;
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

      public final MPModelProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPModelProto.Builder)super.setUnknownFields(var1);
      }

      public final MPModelProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPModelProto.Builder)super.mergeUnknownFields(var1);
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
