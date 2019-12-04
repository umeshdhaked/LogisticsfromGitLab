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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class MPVariableProto extends GeneratedMessageV3 implements MPVariableProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int LOWER_BOUND_FIELD_NUMBER = 1;
   private double lowerBound_;
   public static final int UPPER_BOUND_FIELD_NUMBER = 2;
   private double upperBound_;
   public static final int OBJECTIVE_COEFFICIENT_FIELD_NUMBER = 3;
   private double objectiveCoefficient_;
   public static final int IS_INTEGER_FIELD_NUMBER = 4;
   private boolean isInteger_;
   public static final int NAME_FIELD_NUMBER = 5;
   private volatile Object name_;
   public static final int BRANCHING_PRIORITY_FIELD_NUMBER = 6;
   private int branchingPriority_;
   private byte memoizedIsInitialized;
   private static final MPVariableProto DEFAULT_INSTANCE = new MPVariableProto();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPVariableProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPVariableProto(var1, var2);
      }
   };

   private MPVariableProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPVariableProto() {
      this.memoizedIsInitialized = -1;
      this.lowerBound_ = Double.NEGATIVE_INFINITY;
      this.upperBound_ = Double.POSITIVE_INFINITY;
      this.name_ = "";
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPVariableProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPVariableProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
               case 9:
                  this.bitField0_ |= 1;
                  this.lowerBound_ = var1.readDouble();
                  break;
               case 17:
                  this.bitField0_ |= 2;
                  this.upperBound_ = var1.readDouble();
                  break;
               case 25:
                  this.bitField0_ |= 4;
                  this.objectiveCoefficient_ = var1.readDouble();
                  break;
               case 32:
                  this.bitField0_ |= 8;
                  this.isInteger_ = var1.readBool();
                  break;
               case 42:
                  ByteString var7 = var1.readBytes();
                  this.bitField0_ |= 16;
                  this.name_ = var7;
                  break;
               case 48:
                  this.bitField0_ |= 32;
                  this.branchingPriority_ = var1.readInt32();
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
            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPVariableProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPVariableProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MPVariableProto.class, MPVariableProto.Builder.class);
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

   public boolean hasObjectiveCoefficient() {
      return (this.bitField0_ & 4) != 0;
   }

   public double getObjectiveCoefficient() {
      return this.objectiveCoefficient_;
   }

   public boolean hasIsInteger() {
      return (this.bitField0_ & 8) != 0;
   }

   public boolean getIsInteger() {
      return this.isInteger_;
   }

   public boolean hasName() {
      return (this.bitField0_ & 16) != 0;
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

   public boolean hasBranchingPriority() {
      return (this.bitField0_ & 32) != 0;
   }

   public int getBranchingPriority() {
      return this.branchingPriority_;
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
         var1.writeDouble(1, this.lowerBound_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeDouble(2, this.upperBound_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeDouble(3, this.objectiveCoefficient_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeBool(4, this.isInteger_);
      }

      if ((this.bitField0_ & 16) != 0) {
         GeneratedMessageV3.writeString(var1, 5, this.name_);
      }

      if ((this.bitField0_ & 32) != 0) {
         var1.writeInt32(6, this.branchingPriority_);
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
            var1 += CodedOutputStream.computeDoubleSize(1, this.lowerBound_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(2, this.upperBound_);
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(3, this.objectiveCoefficient_);
         }

         if ((this.bitField0_ & 8) != 0) {
            var1 += CodedOutputStream.computeBoolSize(4, this.isInteger_);
         }

         if ((this.bitField0_ & 16) != 0) {
            var1 += GeneratedMessageV3.computeStringSize(5, this.name_);
         }

         if ((this.bitField0_ & 32) != 0) {
            var1 += CodedOutputStream.computeInt32Size(6, this.branchingPriority_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPVariableProto)) {
         return super.equals(var1);
      } else {
         MPVariableProto var2 = (MPVariableProto)var1;
         if (this.hasLowerBound() != var2.hasLowerBound()) {
            return false;
         } else if (this.hasLowerBound() && Double.doubleToLongBits(this.getLowerBound()) != Double.doubleToLongBits(var2.getLowerBound())) {
            return false;
         } else if (this.hasUpperBound() != var2.hasUpperBound()) {
            return false;
         } else if (this.hasUpperBound() && Double.doubleToLongBits(this.getUpperBound()) != Double.doubleToLongBits(var2.getUpperBound())) {
            return false;
         } else if (this.hasObjectiveCoefficient() != var2.hasObjectiveCoefficient()) {
            return false;
         } else if (this.hasObjectiveCoefficient() && Double.doubleToLongBits(this.getObjectiveCoefficient()) != Double.doubleToLongBits(var2.getObjectiveCoefficient())) {
            return false;
         } else if (this.hasIsInteger() != var2.hasIsInteger()) {
            return false;
         } else if (this.hasIsInteger() && this.getIsInteger() != var2.getIsInteger()) {
            return false;
         } else if (this.hasName() != var2.hasName()) {
            return false;
         } else if (this.hasName() && !this.getName().equals(var2.getName())) {
            return false;
         } else if (this.hasBranchingPriority() != var2.hasBranchingPriority()) {
            return false;
         } else if (this.hasBranchingPriority() && this.getBranchingPriority() != var2.getBranchingPriority()) {
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
         if (this.hasLowerBound()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getLowerBound()));
         }

         if (this.hasUpperBound()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getUpperBound()));
         }

         if (this.hasObjectiveCoefficient()) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getObjectiveCoefficient()));
         }

         if (this.hasIsInteger()) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + Internal.hashBoolean(this.getIsInteger());
         }

         if (this.hasName()) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.getName().hashCode();
         }

         if (this.hasBranchingPriority()) {
            var2 = 37 * var2 + 6;
            var2 = 53 * var2 + this.getBranchingPriority();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPVariableProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPVariableProto)PARSER.parseFrom(var0);
   }

   public static MPVariableProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPVariableProto)PARSER.parseFrom(var0, var1);
   }

   public static MPVariableProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPVariableProto)PARSER.parseFrom(var0);
   }

   public static MPVariableProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPVariableProto)PARSER.parseFrom(var0, var1);
   }

   public static MPVariableProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPVariableProto)PARSER.parseFrom(var0);
   }

   public static MPVariableProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPVariableProto)PARSER.parseFrom(var0, var1);
   }

   public static MPVariableProto parseFrom(InputStream var0) throws IOException {
      return (MPVariableProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPVariableProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPVariableProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPVariableProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPVariableProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPVariableProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPVariableProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPVariableProto parseFrom(CodedInputStream var0) throws IOException {
      return (MPVariableProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPVariableProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPVariableProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPVariableProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPVariableProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPVariableProto.Builder newBuilder(MPVariableProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPVariableProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPVariableProto.Builder() : (new MPVariableProto.Builder()).mergeFrom(this);
   }

   protected MPVariableProto.Builder newBuilderForType(BuilderParent var1) {
      MPVariableProto.Builder var2 = new MPVariableProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPVariableProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPVariableProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPVariableProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPVariableProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPVariableProtoOrBuilder {
      private int bitField0_;
      private double lowerBound_;
      private double upperBound_;
      private double objectiveCoefficient_;
      private boolean isInteger_;
      private Object name_;
      private int branchingPriority_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPVariableProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPVariableProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MPVariableProto.class, MPVariableProto.Builder.class);
      }

      private Builder() {
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.name_ = "";
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.name_ = "";
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPVariableProto.alwaysUseFieldBuilders) {
         }

      }

      public MPVariableProto.Builder clear() {
         super.clear();
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.bitField0_ &= -2;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.bitField0_ &= -3;
         this.objectiveCoefficient_ = 0.0D;
         this.bitField0_ &= -5;
         this.isInteger_ = false;
         this.bitField0_ &= -9;
         this.name_ = "";
         this.bitField0_ &= -17;
         this.branchingPriority_ = 0;
         this.bitField0_ &= -33;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPVariableProto_descriptor;
      }

      public MPVariableProto getDefaultInstanceForType() {
         return MPVariableProto.getDefaultInstance();
      }

      public MPVariableProto build() {
         MPVariableProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPVariableProto buildPartial() {
         MPVariableProto var1 = new MPVariableProto(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((var2 & 1) != 0) {
            var3 |= 1;
         }

         var1.lowerBound_ = this.lowerBound_;
         if ((var2 & 2) != 0) {
            var3 |= 2;
         }

         var1.upperBound_ = this.upperBound_;
         if ((var2 & 4) != 0) {
            var1.objectiveCoefficient_ = this.objectiveCoefficient_;
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.isInteger_ = this.isInteger_;
            var3 |= 8;
         }

         if ((var2 & 16) != 0) {
            var3 |= 16;
         }

         var1.name_ = this.name_;
         if ((var2 & 32) != 0) {
            var1.branchingPriority_ = this.branchingPriority_;
            var3 |= 32;
         }

         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPVariableProto.Builder clone() {
         return (MPVariableProto.Builder)super.clone();
      }

      public MPVariableProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPVariableProto.Builder)super.setField(var1, var2);
      }

      public MPVariableProto.Builder clearField(FieldDescriptor var1) {
         return (MPVariableProto.Builder)super.clearField(var1);
      }

      public MPVariableProto.Builder clearOneof(OneofDescriptor var1) {
         return (MPVariableProto.Builder)super.clearOneof(var1);
      }

      public MPVariableProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPVariableProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPVariableProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPVariableProto.Builder)super.addRepeatedField(var1, var2);
      }

      public MPVariableProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPVariableProto) {
            return this.mergeFrom((MPVariableProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPVariableProto.Builder mergeFrom(MPVariableProto var1) {
         if (var1 == MPVariableProto.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasLowerBound()) {
               this.setLowerBound(var1.getLowerBound());
            }

            if (var1.hasUpperBound()) {
               this.setUpperBound(var1.getUpperBound());
            }

            if (var1.hasObjectiveCoefficient()) {
               this.setObjectiveCoefficient(var1.getObjectiveCoefficient());
            }

            if (var1.hasIsInteger()) {
               this.setIsInteger(var1.getIsInteger());
            }

            if (var1.hasName()) {
               this.bitField0_ |= 16;
               this.name_ = var1.name_;
               this.onChanged();
            }

            if (var1.hasBranchingPriority()) {
               this.setBranchingPriority(var1.getBranchingPriority());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public MPVariableProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPVariableProto var3 = null;

         try {
            var3 = (MPVariableProto)MPVariableProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPVariableProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public boolean hasLowerBound() {
         return (this.bitField0_ & 1) != 0;
      }

      public double getLowerBound() {
         return this.lowerBound_;
      }

      public MPVariableProto.Builder setLowerBound(double var1) {
         this.bitField0_ |= 1;
         this.lowerBound_ = var1;
         this.onChanged();
         return this;
      }

      public MPVariableProto.Builder clearLowerBound() {
         this.bitField0_ &= -2;
         this.lowerBound_ = Double.NEGATIVE_INFINITY;
         this.onChanged();
         return this;
      }

      public boolean hasUpperBound() {
         return (this.bitField0_ & 2) != 0;
      }

      public double getUpperBound() {
         return this.upperBound_;
      }

      public MPVariableProto.Builder setUpperBound(double var1) {
         this.bitField0_ |= 2;
         this.upperBound_ = var1;
         this.onChanged();
         return this;
      }

      public MPVariableProto.Builder clearUpperBound() {
         this.bitField0_ &= -3;
         this.upperBound_ = Double.POSITIVE_INFINITY;
         this.onChanged();
         return this;
      }

      public boolean hasObjectiveCoefficient() {
         return (this.bitField0_ & 4) != 0;
      }

      public double getObjectiveCoefficient() {
         return this.objectiveCoefficient_;
      }

      public MPVariableProto.Builder setObjectiveCoefficient(double var1) {
         this.bitField0_ |= 4;
         this.objectiveCoefficient_ = var1;
         this.onChanged();
         return this;
      }

      public MPVariableProto.Builder clearObjectiveCoefficient() {
         this.bitField0_ &= -5;
         this.objectiveCoefficient_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean hasIsInteger() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsInteger() {
         return this.isInteger_;
      }

      public MPVariableProto.Builder setIsInteger(boolean var1) {
         this.bitField0_ |= 8;
         this.isInteger_ = var1;
         this.onChanged();
         return this;
      }

      public MPVariableProto.Builder clearIsInteger() {
         this.bitField0_ &= -9;
         this.isInteger_ = false;
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

      public MPVariableProto.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 16;
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      public MPVariableProto.Builder clearName() {
         this.bitField0_ &= -17;
         this.name_ = MPVariableProto.getDefaultInstance().getName();
         this.onChanged();
         return this;
      }

      public MPVariableProto.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 16;
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      public boolean hasBranchingPriority() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getBranchingPriority() {
         return this.branchingPriority_;
      }

      public MPVariableProto.Builder setBranchingPriority(int var1) {
         this.bitField0_ |= 32;
         this.branchingPriority_ = var1;
         this.onChanged();
         return this;
      }

      public MPVariableProto.Builder clearBranchingPriority() {
         this.bitField0_ &= -33;
         this.branchingPriority_ = 0;
         this.onChanged();
         return this;
      }

      public final MPVariableProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPVariableProto.Builder)super.setUnknownFields(var1);
      }

      public final MPVariableProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPVariableProto.Builder)super.mergeUnknownFields(var1);
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
