package com.google.ortools.linearsolver;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
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

public final class MPQuadraticObjective extends GeneratedMessageV3 implements MPQuadraticObjectiveOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int QVAR1_INDEX_FIELD_NUMBER = 1;
   private IntList qvar1Index_;
   public static final int QVAR2_INDEX_FIELD_NUMBER = 2;
   private IntList qvar2Index_;
   public static final int COEFFICIENT_FIELD_NUMBER = 3;
   private DoubleList coefficient_;
   private byte memoizedIsInitialized;
   private static final MPQuadraticObjective DEFAULT_INSTANCE = new MPQuadraticObjective();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPQuadraticObjective parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPQuadraticObjective(var1, var2);
      }
   };

   private MPQuadraticObjective(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPQuadraticObjective() {
      this.memoizedIsInitialized = -1;
      this.qvar1Index_ = emptyIntList();
      this.qvar2Index_ = emptyIntList();
      this.coefficient_ = emptyDoubleList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPQuadraticObjective();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPQuadraticObjective(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                     this.qvar1Index_ = newIntList();
                     var3 |= 1;
                  }

                  this.qvar1Index_.addInt(var1.readInt32());
                  continue;
               case 10:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.qvar1Index_ = newIntList();
                     var3 |= 1;
                  }
                  break;
               case 16:
                  if ((var3 & 2) == 0) {
                     this.qvar2Index_ = newIntList();
                     var3 |= 2;
                  }

                  this.qvar2Index_.addInt(var1.readInt32());
                  continue;
               case 18:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.qvar2Index_ = newIntList();
                     var3 |= 2;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.qvar2Index_.addInt(var1.readInt32());
                  }

                  var1.popLimit(var8);
                  continue;
               case 25:
                  if ((var3 & 4) == 0) {
                     this.coefficient_ = newDoubleList();
                     var3 |= 4;
                  }

                  this.coefficient_.addDouble(var1.readDouble());
                  continue;
               case 26:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 4) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.coefficient_ = newDoubleList();
                     var3 |= 4;
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
                  this.qvar1Index_.addInt(var1.readInt32());
               }

               var1.popLimit(var8);
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            if ((var3 & 1) != 0) {
               this.qvar1Index_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.qvar2Index_.makeImmutable();
            }

            if ((var3 & 4) != 0) {
               this.coefficient_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPQuadraticObjective_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPQuadraticObjective_fieldAccessorTable.ensureFieldAccessorsInitialized(MPQuadraticObjective.class, MPQuadraticObjective.Builder.class);
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

   public List getCoefficientList() {
      return this.coefficient_;
   }

   public int getCoefficientCount() {
      return this.coefficient_.size();
   }

   public double getCoefficient(int var1) {
      return this.coefficient_.getDouble(var1);
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
      for(var2 = 0; var2 < this.qvar1Index_.size(); ++var2) {
         var1.writeInt32(1, this.qvar1Index_.getInt(var2));
      }

      for(var2 = 0; var2 < this.qvar2Index_.size(); ++var2) {
         var1.writeInt32(2, this.qvar2Index_.getInt(var2));
      }

      for(var2 = 0; var2 < this.coefficient_.size(); ++var2) {
         var1.writeDouble(3, this.coefficient_.getDouble(var2));
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
         for(var3 = 0; var3 < this.qvar1Index_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.qvar1Index_.getInt(var3));
         }

         var1 = var4 + var2;
         var1 += 1 * this.getQvar1IndexList().size();
         var2 = 0;

         for(var3 = 0; var3 < this.qvar2Index_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.qvar2Index_.getInt(var3));
         }

         var1 += var2;
         var1 += 1 * this.getQvar2IndexList().size();
         boolean var5 = false;
         var2 = 8 * this.getCoefficientList().size();
         var1 += var2;
         var1 += 1 * this.getCoefficientList().size();
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPQuadraticObjective)) {
         return super.equals(var1);
      } else {
         MPQuadraticObjective var2 = (MPQuadraticObjective)var1;
         if (!this.getQvar1IndexList().equals(var2.getQvar1IndexList())) {
            return false;
         } else if (!this.getQvar2IndexList().equals(var2.getQvar2IndexList())) {
            return false;
         } else if (!this.getCoefficientList().equals(var2.getCoefficientList())) {
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
         if (this.getQvar1IndexCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getQvar1IndexList().hashCode();
         }

         if (this.getQvar2IndexCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getQvar2IndexList().hashCode();
         }

         if (this.getCoefficientCount() > 0) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getCoefficientList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPQuadraticObjective parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPQuadraticObjective)PARSER.parseFrom(var0);
   }

   public static MPQuadraticObjective parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPQuadraticObjective)PARSER.parseFrom(var0, var1);
   }

   public static MPQuadraticObjective parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPQuadraticObjective)PARSER.parseFrom(var0);
   }

   public static MPQuadraticObjective parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPQuadraticObjective)PARSER.parseFrom(var0, var1);
   }

   public static MPQuadraticObjective parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPQuadraticObjective)PARSER.parseFrom(var0);
   }

   public static MPQuadraticObjective parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPQuadraticObjective)PARSER.parseFrom(var0, var1);
   }

   public static MPQuadraticObjective parseFrom(InputStream var0) throws IOException {
      return (MPQuadraticObjective)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPQuadraticObjective parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPQuadraticObjective)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPQuadraticObjective parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPQuadraticObjective)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPQuadraticObjective parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPQuadraticObjective)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPQuadraticObjective parseFrom(CodedInputStream var0) throws IOException {
      return (MPQuadraticObjective)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPQuadraticObjective parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPQuadraticObjective)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPQuadraticObjective.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPQuadraticObjective.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPQuadraticObjective.Builder newBuilder(MPQuadraticObjective var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPQuadraticObjective.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPQuadraticObjective.Builder() : (new MPQuadraticObjective.Builder()).mergeFrom(this);
   }

   protected MPQuadraticObjective.Builder newBuilderForType(BuilderParent var1) {
      MPQuadraticObjective.Builder var2 = new MPQuadraticObjective.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPQuadraticObjective getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPQuadraticObjective getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPQuadraticObjective(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPQuadraticObjective(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPQuadraticObjectiveOrBuilder {
      private int bitField0_;
      private IntList qvar1Index_;
      private IntList qvar2Index_;
      private DoubleList coefficient_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPQuadraticObjective_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPQuadraticObjective_fieldAccessorTable.ensureFieldAccessorsInitialized(MPQuadraticObjective.class, MPQuadraticObjective.Builder.class);
      }

      private Builder() {
         this.qvar1Index_ = MPQuadraticObjective.emptyIntList();
         this.qvar2Index_ = MPQuadraticObjective.emptyIntList();
         this.coefficient_ = MPQuadraticObjective.emptyDoubleList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.qvar1Index_ = MPQuadraticObjective.emptyIntList();
         this.qvar2Index_ = MPQuadraticObjective.emptyIntList();
         this.coefficient_ = MPQuadraticObjective.emptyDoubleList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPQuadraticObjective.alwaysUseFieldBuilders) {
         }

      }

      public MPQuadraticObjective.Builder clear() {
         super.clear();
         this.qvar1Index_ = MPQuadraticObjective.emptyIntList();
         this.bitField0_ &= -2;
         this.qvar2Index_ = MPQuadraticObjective.emptyIntList();
         this.bitField0_ &= -3;
         this.coefficient_ = MPQuadraticObjective.emptyDoubleList();
         this.bitField0_ &= -5;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPQuadraticObjective_descriptor;
      }

      public MPQuadraticObjective getDefaultInstanceForType() {
         return MPQuadraticObjective.getDefaultInstance();
      }

      public MPQuadraticObjective build() {
         MPQuadraticObjective var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPQuadraticObjective buildPartial() {
         MPQuadraticObjective var1 = new MPQuadraticObjective(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.qvar1Index_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.qvar1Index_ = this.qvar1Index_;
         if ((this.bitField0_ & 2) != 0) {
            this.qvar2Index_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.qvar2Index_ = this.qvar2Index_;
         if ((this.bitField0_ & 4) != 0) {
            this.coefficient_.makeImmutable();
            this.bitField0_ &= -5;
         }

         var1.coefficient_ = this.coefficient_;
         this.onBuilt();
         return var1;
      }

      public MPQuadraticObjective.Builder clone() {
         return (MPQuadraticObjective.Builder)super.clone();
      }

      public MPQuadraticObjective.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPQuadraticObjective.Builder)super.setField(var1, var2);
      }

      public MPQuadraticObjective.Builder clearField(FieldDescriptor var1) {
         return (MPQuadraticObjective.Builder)super.clearField(var1);
      }

      public MPQuadraticObjective.Builder clearOneof(OneofDescriptor var1) {
         return (MPQuadraticObjective.Builder)super.clearOneof(var1);
      }

      public MPQuadraticObjective.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPQuadraticObjective.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPQuadraticObjective.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPQuadraticObjective.Builder)super.addRepeatedField(var1, var2);
      }

      public MPQuadraticObjective.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPQuadraticObjective) {
            return this.mergeFrom((MPQuadraticObjective)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPQuadraticObjective.Builder mergeFrom(MPQuadraticObjective var1) {
         if (var1 == MPQuadraticObjective.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.qvar1Index_.isEmpty()) {
               if (this.qvar1Index_.isEmpty()) {
                  this.qvar1Index_ = var1.qvar1Index_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureQvar1IndexIsMutable();
                  this.qvar1Index_.addAll(var1.qvar1Index_);
               }

               this.onChanged();
            }

            if (!var1.qvar2Index_.isEmpty()) {
               if (this.qvar2Index_.isEmpty()) {
                  this.qvar2Index_ = var1.qvar2Index_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureQvar2IndexIsMutable();
                  this.qvar2Index_.addAll(var1.qvar2Index_);
               }

               this.onChanged();
            }

            if (!var1.coefficient_.isEmpty()) {
               if (this.coefficient_.isEmpty()) {
                  this.coefficient_ = var1.coefficient_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureCoefficientIsMutable();
                  this.coefficient_.addAll(var1.coefficient_);
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

      public MPQuadraticObjective.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPQuadraticObjective var3 = null;

         try {
            var3 = (MPQuadraticObjective)MPQuadraticObjective.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPQuadraticObjective)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureQvar1IndexIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.qvar1Index_ = MPQuadraticObjective.mutableCopy(this.qvar1Index_);
            this.bitField0_ |= 1;
         }

      }

      public List getQvar1IndexList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.qvar1Index_) : this.qvar1Index_);
      }

      public int getQvar1IndexCount() {
         return this.qvar1Index_.size();
      }

      public int getQvar1Index(int var1) {
         return this.qvar1Index_.getInt(var1);
      }

      public MPQuadraticObjective.Builder setQvar1Index(int var1, int var2) {
         this.ensureQvar1IndexIsMutable();
         this.qvar1Index_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public MPQuadraticObjective.Builder addQvar1Index(int var1) {
         this.ensureQvar1IndexIsMutable();
         this.qvar1Index_.addInt(var1);
         this.onChanged();
         return this;
      }

      public MPQuadraticObjective.Builder addAllQvar1Index(Iterable var1) {
         this.ensureQvar1IndexIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.qvar1Index_);
         this.onChanged();
         return this;
      }

      public MPQuadraticObjective.Builder clearQvar1Index() {
         this.qvar1Index_ = MPQuadraticObjective.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureQvar2IndexIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.qvar2Index_ = MPQuadraticObjective.mutableCopy(this.qvar2Index_);
            this.bitField0_ |= 2;
         }

      }

      public List getQvar2IndexList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.qvar2Index_) : this.qvar2Index_);
      }

      public int getQvar2IndexCount() {
         return this.qvar2Index_.size();
      }

      public int getQvar2Index(int var1) {
         return this.qvar2Index_.getInt(var1);
      }

      public MPQuadraticObjective.Builder setQvar2Index(int var1, int var2) {
         this.ensureQvar2IndexIsMutable();
         this.qvar2Index_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public MPQuadraticObjective.Builder addQvar2Index(int var1) {
         this.ensureQvar2IndexIsMutable();
         this.qvar2Index_.addInt(var1);
         this.onChanged();
         return this;
      }

      public MPQuadraticObjective.Builder addAllQvar2Index(Iterable var1) {
         this.ensureQvar2IndexIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.qvar2Index_);
         this.onChanged();
         return this;
      }

      public MPQuadraticObjective.Builder clearQvar2Index() {
         this.qvar2Index_ = MPQuadraticObjective.emptyIntList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      private void ensureCoefficientIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.coefficient_ = MPQuadraticObjective.mutableCopy(this.coefficient_);
            this.bitField0_ |= 4;
         }

      }

      public List getCoefficientList() {
         return (List)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.coefficient_) : this.coefficient_);
      }

      public int getCoefficientCount() {
         return this.coefficient_.size();
      }

      public double getCoefficient(int var1) {
         return this.coefficient_.getDouble(var1);
      }

      public MPQuadraticObjective.Builder setCoefficient(int var1, double var2) {
         this.ensureCoefficientIsMutable();
         this.coefficient_.setDouble(var1, var2);
         this.onChanged();
         return this;
      }

      public MPQuadraticObjective.Builder addCoefficient(double var1) {
         this.ensureCoefficientIsMutable();
         this.coefficient_.addDouble(var1);
         this.onChanged();
         return this;
      }

      public MPQuadraticObjective.Builder addAllCoefficient(Iterable var1) {
         this.ensureCoefficientIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.coefficient_);
         this.onChanged();
         return this;
      }

      public MPQuadraticObjective.Builder clearCoefficient() {
         this.coefficient_ = MPQuadraticObjective.emptyDoubleList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public final MPQuadraticObjective.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPQuadraticObjective.Builder)super.setUnknownFields(var1);
      }

      public final MPQuadraticObjective.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPQuadraticObjective.Builder)super.mergeUnknownFields(var1);
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
