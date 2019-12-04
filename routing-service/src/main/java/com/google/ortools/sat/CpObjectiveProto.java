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
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.Internal.IntList;
import com.google.protobuf.Internal.LongList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class CpObjectiveProto extends GeneratedMessageV3 implements CpObjectiveProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VARS_FIELD_NUMBER = 1;
   private IntList vars_;
   private int varsMemoizedSerializedSize;
   public static final int COEFFS_FIELD_NUMBER = 4;
   private LongList coeffs_;
   private int coeffsMemoizedSerializedSize;
   public static final int OFFSET_FIELD_NUMBER = 2;
   private double offset_;
   public static final int SCALING_FACTOR_FIELD_NUMBER = 3;
   private double scalingFactor_;
   public static final int DOMAIN_FIELD_NUMBER = 5;
   private LongList domain_;
   private int domainMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final CpObjectiveProto DEFAULT_INSTANCE = new CpObjectiveProto();
   private static final Parser PARSER = new AbstractParser() {
      public CpObjectiveProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new CpObjectiveProto(var1, var2);
      }
   };

   private CpObjectiveProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.varsMemoizedSerializedSize = -1;
      this.coeffsMemoizedSerializedSize = -1;
      this.domainMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private CpObjectiveProto() {
      this.varsMemoizedSerializedSize = -1;
      this.coeffsMemoizedSerializedSize = -1;
      this.domainMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.vars_ = emptyIntList();
      this.coeffs_ = emptyLongList();
      this.domain_ = emptyLongList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new CpObjectiveProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private CpObjectiveProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                     this.vars_ = newIntList();
                     var3 |= 1;
                  }

                  this.vars_.addInt(var1.readInt32());
                  continue;
               case 10:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.vars_ = newIntList();
                     var3 |= 1;
                  }
                  break;
               case 17:
                  this.offset_ = var1.readDouble();
                  continue;
               case 25:
                  this.scalingFactor_ = var1.readDouble();
                  continue;
               case 32:
                  if ((var3 & 2) == 0) {
                     this.coeffs_ = newLongList();
                     var3 |= 2;
                  }

                  this.coeffs_.addLong(var1.readInt64());
                  continue;
               case 34:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.coeffs_ = newLongList();
                     var3 |= 2;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.coeffs_.addLong(var1.readInt64());
                  }

                  var1.popLimit(var8);
                  continue;
               case 40:
                  if ((var3 & 4) == 0) {
                     this.domain_ = newLongList();
                     var3 |= 4;
                  }

                  this.domain_.addLong(var1.readInt64());
                  continue;
               case 42:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 4) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.domain_ = newLongList();
                     var3 |= 4;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.domain_.addLong(var1.readInt64());
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
                  this.vars_.addInt(var1.readInt32());
               }

               var1.popLimit(var8);
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            if ((var3 & 1) != 0) {
               this.vars_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.coeffs_.makeImmutable();
            }

            if ((var3 & 4) != 0) {
               this.domain_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_CpObjectiveProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_CpObjectiveProto_fieldAccessorTable.ensureFieldAccessorsInitialized(CpObjectiveProto.class, CpObjectiveProto.Builder.class);
   }

   public List getVarsList() {
      return this.vars_;
   }

   public int getVarsCount() {
      return this.vars_.size();
   }

   public int getVars(int var1) {
      return this.vars_.getInt(var1);
   }

   public List getCoeffsList() {
      return this.coeffs_;
   }

   public int getCoeffsCount() {
      return this.coeffs_.size();
   }

   public long getCoeffs(int var1) {
      return this.coeffs_.getLong(var1);
   }

   public double getOffset() {
      return this.offset_;
   }

   public double getScalingFactor() {
      return this.scalingFactor_;
   }

   public List getDomainList() {
      return this.domain_;
   }

   public int getDomainCount() {
      return this.domain_.size();
   }

   public long getDomain(int var1) {
      return this.domain_.getLong(var1);
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
      if (this.getVarsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.varsMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.vars_.size(); ++var2) {
         var1.writeInt32NoTag(this.vars_.getInt(var2));
      }

      if (this.offset_ != 0.0D) {
         var1.writeDouble(2, this.offset_);
      }

      if (this.scalingFactor_ != 0.0D) {
         var1.writeDouble(3, this.scalingFactor_);
      }

      if (this.getCoeffsList().size() > 0) {
         var1.writeUInt32NoTag(34);
         var1.writeUInt32NoTag(this.coeffsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.coeffs_.size(); ++var2) {
         var1.writeInt64NoTag(this.coeffs_.getLong(var2));
      }

      if (this.getDomainList().size() > 0) {
         var1.writeUInt32NoTag(42);
         var1.writeUInt32NoTag(this.domainMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.domain_.size(); ++var2) {
         var1.writeInt64NoTag(this.domain_.getLong(var2));
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
         for(var3 = 0; var3 < this.vars_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.vars_.getInt(var3));
         }

         var1 = var4 + var2;
         if (!this.getVarsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.varsMemoizedSerializedSize = var2;
         if (this.offset_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(2, this.offset_);
         }

         if (this.scalingFactor_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(3, this.scalingFactor_);
         }

         var2 = 0;

         for(var3 = 0; var3 < this.coeffs_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.coeffs_.getLong(var3));
         }

         var1 += var2;
         if (!this.getCoeffsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.coeffsMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.domain_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.domain_.getLong(var3));
         }

         var1 += var2;
         if (!this.getDomainList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.domainMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CpObjectiveProto)) {
         return super.equals(var1);
      } else {
         CpObjectiveProto var2 = (CpObjectiveProto)var1;
         if (!this.getVarsList().equals(var2.getVarsList())) {
            return false;
         } else if (!this.getCoeffsList().equals(var2.getCoeffsList())) {
            return false;
         } else if (Double.doubleToLongBits(this.getOffset()) != Double.doubleToLongBits(var2.getOffset())) {
            return false;
         } else if (Double.doubleToLongBits(this.getScalingFactor()) != Double.doubleToLongBits(var2.getScalingFactor())) {
            return false;
         } else if (!this.getDomainList().equals(var2.getDomainList())) {
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
         if (this.getVarsCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getVarsList().hashCode();
         }

         if (this.getCoeffsCount() > 0) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getCoeffsList().hashCode();
         }

         var2 = 37 * var2 + 2;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getOffset()));
         var2 = 37 * var2 + 3;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getScalingFactor()));
         if (this.getDomainCount() > 0) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.getDomainList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static CpObjectiveProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (CpObjectiveProto)PARSER.parseFrom(var0);
   }

   public static CpObjectiveProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CpObjectiveProto)PARSER.parseFrom(var0, var1);
   }

   public static CpObjectiveProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (CpObjectiveProto)PARSER.parseFrom(var0);
   }

   public static CpObjectiveProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CpObjectiveProto)PARSER.parseFrom(var0, var1);
   }

   public static CpObjectiveProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (CpObjectiveProto)PARSER.parseFrom(var0);
   }

   public static CpObjectiveProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CpObjectiveProto)PARSER.parseFrom(var0, var1);
   }

   public static CpObjectiveProto parseFrom(InputStream var0) throws IOException {
      return (CpObjectiveProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CpObjectiveProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CpObjectiveProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CpObjectiveProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (CpObjectiveProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CpObjectiveProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CpObjectiveProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CpObjectiveProto parseFrom(CodedInputStream var0) throws IOException {
      return (CpObjectiveProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CpObjectiveProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CpObjectiveProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CpObjectiveProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CpObjectiveProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CpObjectiveProto.Builder newBuilder(CpObjectiveProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CpObjectiveProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CpObjectiveProto.Builder() : (new CpObjectiveProto.Builder()).mergeFrom(this);
   }

   protected CpObjectiveProto.Builder newBuilderForType(BuilderParent var1) {
      CpObjectiveProto.Builder var2 = new CpObjectiveProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static CpObjectiveProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public CpObjectiveProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   CpObjectiveProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   CpObjectiveProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements CpObjectiveProtoOrBuilder {
      private int bitField0_;
      private IntList vars_;
      private LongList coeffs_;
      private double offset_;
      private double scalingFactor_;
      private LongList domain_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_CpObjectiveProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_CpObjectiveProto_fieldAccessorTable.ensureFieldAccessorsInitialized(CpObjectiveProto.class, CpObjectiveProto.Builder.class);
      }

      private Builder() {
         this.vars_ = CpObjectiveProto.emptyIntList();
         this.coeffs_ = CpObjectiveProto.emptyLongList();
         this.domain_ = CpObjectiveProto.emptyLongList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.vars_ = CpObjectiveProto.emptyIntList();
         this.coeffs_ = CpObjectiveProto.emptyLongList();
         this.domain_ = CpObjectiveProto.emptyLongList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (CpObjectiveProto.alwaysUseFieldBuilders) {
         }

      }

      public CpObjectiveProto.Builder clear() {
         super.clear();
         this.vars_ = CpObjectiveProto.emptyIntList();
         this.bitField0_ &= -2;
         this.coeffs_ = CpObjectiveProto.emptyLongList();
         this.bitField0_ &= -3;
         this.offset_ = 0.0D;
         this.scalingFactor_ = 0.0D;
         this.domain_ = CpObjectiveProto.emptyLongList();
         this.bitField0_ &= -5;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_CpObjectiveProto_descriptor;
      }

      public CpObjectiveProto getDefaultInstanceForType() {
         return CpObjectiveProto.getDefaultInstance();
      }

      public CpObjectiveProto build() {
         CpObjectiveProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CpObjectiveProto buildPartial() {
         CpObjectiveProto var1 = new CpObjectiveProto(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.vars_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.vars_ = this.vars_;
         if ((this.bitField0_ & 2) != 0) {
            this.coeffs_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.coeffs_ = this.coeffs_;
         var1.offset_ = this.offset_;
         var1.scalingFactor_ = this.scalingFactor_;
         if ((this.bitField0_ & 4) != 0) {
            this.domain_.makeImmutable();
            this.bitField0_ &= -5;
         }

         var1.domain_ = this.domain_;
         this.onBuilt();
         return var1;
      }

      public CpObjectiveProto.Builder clone() {
         return (CpObjectiveProto.Builder)super.clone();
      }

      public CpObjectiveProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (CpObjectiveProto.Builder)super.setField(var1, var2);
      }

      public CpObjectiveProto.Builder clearField(FieldDescriptor var1) {
         return (CpObjectiveProto.Builder)super.clearField(var1);
      }

      public CpObjectiveProto.Builder clearOneof(OneofDescriptor var1) {
         return (CpObjectiveProto.Builder)super.clearOneof(var1);
      }

      public CpObjectiveProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (CpObjectiveProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CpObjectiveProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (CpObjectiveProto.Builder)super.addRepeatedField(var1, var2);
      }

      public CpObjectiveProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof CpObjectiveProto) {
            return this.mergeFrom((CpObjectiveProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public CpObjectiveProto.Builder mergeFrom(CpObjectiveProto var1) {
         if (var1 == CpObjectiveProto.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.vars_.isEmpty()) {
               if (this.vars_.isEmpty()) {
                  this.vars_ = var1.vars_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureVarsIsMutable();
                  this.vars_.addAll(var1.vars_);
               }

               this.onChanged();
            }

            if (!var1.coeffs_.isEmpty()) {
               if (this.coeffs_.isEmpty()) {
                  this.coeffs_ = var1.coeffs_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureCoeffsIsMutable();
                  this.coeffs_.addAll(var1.coeffs_);
               }

               this.onChanged();
            }

            if (var1.getOffset() != 0.0D) {
               this.setOffset(var1.getOffset());
            }

            if (var1.getScalingFactor() != 0.0D) {
               this.setScalingFactor(var1.getScalingFactor());
            }

            if (!var1.domain_.isEmpty()) {
               if (this.domain_.isEmpty()) {
                  this.domain_ = var1.domain_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureDomainIsMutable();
                  this.domain_.addAll(var1.domain_);
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

      public CpObjectiveProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         CpObjectiveProto var3 = null;

         try {
            var3 = (CpObjectiveProto)CpObjectiveProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (CpObjectiveProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureVarsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.vars_ = CpObjectiveProto.mutableCopy(this.vars_);
            this.bitField0_ |= 1;
         }

      }

      public List getVarsList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.vars_) : this.vars_);
      }

      public int getVarsCount() {
         return this.vars_.size();
      }

      public int getVars(int var1) {
         return this.vars_.getInt(var1);
      }

      public CpObjectiveProto.Builder setVars(int var1, int var2) {
         this.ensureVarsIsMutable();
         this.vars_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public CpObjectiveProto.Builder addVars(int var1) {
         this.ensureVarsIsMutable();
         this.vars_.addInt(var1);
         this.onChanged();
         return this;
      }

      public CpObjectiveProto.Builder addAllVars(Iterable var1) {
         this.ensureVarsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.vars_);
         this.onChanged();
         return this;
      }

      public CpObjectiveProto.Builder clearVars() {
         this.vars_ = CpObjectiveProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureCoeffsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.coeffs_ = CpObjectiveProto.mutableCopy(this.coeffs_);
            this.bitField0_ |= 2;
         }

      }

      public List getCoeffsList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.coeffs_) : this.coeffs_);
      }

      public int getCoeffsCount() {
         return this.coeffs_.size();
      }

      public long getCoeffs(int var1) {
         return this.coeffs_.getLong(var1);
      }

      public CpObjectiveProto.Builder setCoeffs(int var1, long var2) {
         this.ensureCoeffsIsMutable();
         this.coeffs_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public CpObjectiveProto.Builder addCoeffs(long var1) {
         this.ensureCoeffsIsMutable();
         this.coeffs_.addLong(var1);
         this.onChanged();
         return this;
      }

      public CpObjectiveProto.Builder addAllCoeffs(Iterable var1) {
         this.ensureCoeffsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.coeffs_);
         this.onChanged();
         return this;
      }

      public CpObjectiveProto.Builder clearCoeffs() {
         this.coeffs_ = CpObjectiveProto.emptyLongList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public double getOffset() {
         return this.offset_;
      }

      public CpObjectiveProto.Builder setOffset(double var1) {
         this.offset_ = var1;
         this.onChanged();
         return this;
      }

      public CpObjectiveProto.Builder clearOffset() {
         this.offset_ = 0.0D;
         this.onChanged();
         return this;
      }

      public double getScalingFactor() {
         return this.scalingFactor_;
      }

      public CpObjectiveProto.Builder setScalingFactor(double var1) {
         this.scalingFactor_ = var1;
         this.onChanged();
         return this;
      }

      public CpObjectiveProto.Builder clearScalingFactor() {
         this.scalingFactor_ = 0.0D;
         this.onChanged();
         return this;
      }

      private void ensureDomainIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.domain_ = CpObjectiveProto.mutableCopy(this.domain_);
            this.bitField0_ |= 4;
         }

      }

      public List getDomainList() {
         return (List)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.domain_) : this.domain_);
      }

      public int getDomainCount() {
         return this.domain_.size();
      }

      public long getDomain(int var1) {
         return this.domain_.getLong(var1);
      }

      public CpObjectiveProto.Builder setDomain(int var1, long var2) {
         this.ensureDomainIsMutable();
         this.domain_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public CpObjectiveProto.Builder addDomain(long var1) {
         this.ensureDomainIsMutable();
         this.domain_.addLong(var1);
         this.onChanged();
         return this;
      }

      public CpObjectiveProto.Builder addAllDomain(Iterable var1) {
         this.ensureDomainIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.domain_);
         this.onChanged();
         return this;
      }

      public CpObjectiveProto.Builder clearDomain() {
         this.domain_ = CpObjectiveProto.emptyLongList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public final CpObjectiveProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CpObjectiveProto.Builder)super.setUnknownFields(var1);
      }

      public final CpObjectiveProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CpObjectiveProto.Builder)super.mergeUnknownFields(var1);
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
