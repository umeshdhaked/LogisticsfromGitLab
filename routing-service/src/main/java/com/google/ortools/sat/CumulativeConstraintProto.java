package com.google.ortools.sat;

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
import com.google.protobuf.Internal.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class CumulativeConstraintProto extends GeneratedMessageV3 implements CumulativeConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int CAPACITY_FIELD_NUMBER = 1;
   private int capacity_;
   public static final int INTERVALS_FIELD_NUMBER = 2;
   private IntList intervals_;
   private int intervalsMemoizedSerializedSize;
   public static final int DEMANDS_FIELD_NUMBER = 3;
   private IntList demands_;
   private int demandsMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final CumulativeConstraintProto DEFAULT_INSTANCE = new CumulativeConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public CumulativeConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new CumulativeConstraintProto(var1, var2);
      }
   };

   private CumulativeConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.intervalsMemoizedSerializedSize = -1;
      this.demandsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private CumulativeConstraintProto() {
      this.intervalsMemoizedSerializedSize = -1;
      this.demandsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.intervals_ = emptyIntList();
      this.demands_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new CumulativeConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private CumulativeConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                  int var7;
                  int var8;
                  switch(var6) {
                  case 0:
                     var5 = true;
                     continue;
                  case 8:
                     this.capacity_ = var1.readInt32();
                     continue;
                  case 16:
                     if ((var3 & 1) == 0) {
                        this.intervals_ = newIntList();
                        var3 |= 1;
                     }

                     this.intervals_.addInt(var1.readInt32());
                     continue;
                  case 18:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.intervals_ = newIntList();
                        var3 |= 1;
                     }
                     break;
                  case 24:
                     if ((var3 & 2) == 0) {
                        this.demands_ = newIntList();
                        var3 |= 2;
                     }

                     this.demands_.addInt(var1.readInt32());
                     continue;
                  case 26:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.demands_ = newIntList();
                        var3 |= 2;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.demands_.addInt(var1.readInt32());
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
                     this.intervals_.addInt(var1.readInt32());
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
            if ((var3 & 1) != 0) {
               this.intervals_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.demands_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_CumulativeConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_CumulativeConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(CumulativeConstraintProto.class, CumulativeConstraintProto.Builder.class);
   }

   public int getCapacity() {
      return this.capacity_;
   }

   public List getIntervalsList() {
      return this.intervals_;
   }

   public int getIntervalsCount() {
      return this.intervals_.size();
   }

   public int getIntervals(int var1) {
      return this.intervals_.getInt(var1);
   }

   public List getDemandsList() {
      return this.demands_;
   }

   public int getDemandsCount() {
      return this.demands_.size();
   }

   public int getDemands(int var1) {
      return this.demands_.getInt(var1);
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
      if (this.capacity_ != 0) {
         var1.writeInt32(1, this.capacity_);
      }

      if (this.getIntervalsList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.intervalsMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.intervals_.size(); ++var2) {
         var1.writeInt32NoTag(this.intervals_.getInt(var2));
      }

      if (this.getDemandsList().size() > 0) {
         var1.writeUInt32NoTag(26);
         var1.writeUInt32NoTag(this.demandsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.demands_.size(); ++var2) {
         var1.writeInt32NoTag(this.demands_.getInt(var2));
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (this.capacity_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(1, this.capacity_);
         }

         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < this.intervals_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.intervals_.getInt(var3));
         }

         var1 += var2;
         if (!this.getIntervalsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.intervalsMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.demands_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.demands_.getInt(var3));
         }

         var1 += var2;
         if (!this.getDemandsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.demandsMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CumulativeConstraintProto)) {
         return super.equals(var1);
      } else {
         CumulativeConstraintProto var2 = (CumulativeConstraintProto)var1;
         if (this.getCapacity() != var2.getCapacity()) {
            return false;
         } else if (!this.getIntervalsList().equals(var2.getIntervalsList())) {
            return false;
         } else if (!this.getDemandsList().equals(var2.getDemandsList())) {
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
         var2 = 53 * var2 + this.getCapacity();
         if (this.getIntervalsCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getIntervalsList().hashCode();
         }

         if (this.getDemandsCount() > 0) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getDemandsList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static CumulativeConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (CumulativeConstraintProto)PARSER.parseFrom(var0);
   }

   public static CumulativeConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CumulativeConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static CumulativeConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (CumulativeConstraintProto)PARSER.parseFrom(var0);
   }

   public static CumulativeConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CumulativeConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static CumulativeConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (CumulativeConstraintProto)PARSER.parseFrom(var0);
   }

   public static CumulativeConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CumulativeConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static CumulativeConstraintProto parseFrom(InputStream var0) throws IOException {
      return (CumulativeConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CumulativeConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CumulativeConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CumulativeConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (CumulativeConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CumulativeConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CumulativeConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CumulativeConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (CumulativeConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CumulativeConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CumulativeConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CumulativeConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CumulativeConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CumulativeConstraintProto.Builder newBuilder(CumulativeConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CumulativeConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CumulativeConstraintProto.Builder() : (new CumulativeConstraintProto.Builder()).mergeFrom(this);
   }

   protected CumulativeConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      CumulativeConstraintProto.Builder var2 = new CumulativeConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static CumulativeConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public CumulativeConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   CumulativeConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   CumulativeConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements CumulativeConstraintProtoOrBuilder {
      private int bitField0_;
      private int capacity_;
      private IntList intervals_;
      private IntList demands_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_CumulativeConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_CumulativeConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(CumulativeConstraintProto.class, CumulativeConstraintProto.Builder.class);
      }

      private Builder() {
         this.intervals_ = CumulativeConstraintProto.emptyIntList();
         this.demands_ = CumulativeConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.intervals_ = CumulativeConstraintProto.emptyIntList();
         this.demands_ = CumulativeConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (CumulativeConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public CumulativeConstraintProto.Builder clear() {
         super.clear();
         this.capacity_ = 0;
         this.intervals_ = CumulativeConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.demands_ = CumulativeConstraintProto.emptyIntList();
         this.bitField0_ &= -3;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_CumulativeConstraintProto_descriptor;
      }

      public CumulativeConstraintProto getDefaultInstanceForType() {
         return CumulativeConstraintProto.getDefaultInstance();
      }

      public CumulativeConstraintProto build() {
         CumulativeConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CumulativeConstraintProto buildPartial() {
         CumulativeConstraintProto var1 = new CumulativeConstraintProto(this);
         int var2 = this.bitField0_;
         var1.capacity_ = this.capacity_;
         if ((this.bitField0_ & 1) != 0) {
            this.intervals_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.intervals_ = this.intervals_;
         if ((this.bitField0_ & 2) != 0) {
            this.demands_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.demands_ = this.demands_;
         this.onBuilt();
         return var1;
      }

      public CumulativeConstraintProto.Builder clone() {
         return (CumulativeConstraintProto.Builder)super.clone();
      }

      public CumulativeConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (CumulativeConstraintProto.Builder)super.setField(var1, var2);
      }

      public CumulativeConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (CumulativeConstraintProto.Builder)super.clearField(var1);
      }

      public CumulativeConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (CumulativeConstraintProto.Builder)super.clearOneof(var1);
      }

      public CumulativeConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (CumulativeConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CumulativeConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (CumulativeConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public CumulativeConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof CumulativeConstraintProto) {
            return this.mergeFrom((CumulativeConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public CumulativeConstraintProto.Builder mergeFrom(CumulativeConstraintProto var1) {
         if (var1 == CumulativeConstraintProto.getDefaultInstance()) {
            return this;
         } else {
            if (var1.getCapacity() != 0) {
               this.setCapacity(var1.getCapacity());
            }

            if (!var1.intervals_.isEmpty()) {
               if (this.intervals_.isEmpty()) {
                  this.intervals_ = var1.intervals_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureIntervalsIsMutable();
                  this.intervals_.addAll(var1.intervals_);
               }

               this.onChanged();
            }

            if (!var1.demands_.isEmpty()) {
               if (this.demands_.isEmpty()) {
                  this.demands_ = var1.demands_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureDemandsIsMutable();
                  this.demands_.addAll(var1.demands_);
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

      public CumulativeConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         CumulativeConstraintProto var3 = null;

         try {
            var3 = (CumulativeConstraintProto)CumulativeConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (CumulativeConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public int getCapacity() {
         return this.capacity_;
      }

      public CumulativeConstraintProto.Builder setCapacity(int var1) {
         this.capacity_ = var1;
         this.onChanged();
         return this;
      }

      public CumulativeConstraintProto.Builder clearCapacity() {
         this.capacity_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureIntervalsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.intervals_ = CumulativeConstraintProto.mutableCopy(this.intervals_);
            this.bitField0_ |= 1;
         }

      }

      public List getIntervalsList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.intervals_) : this.intervals_);
      }

      public int getIntervalsCount() {
         return this.intervals_.size();
      }

      public int getIntervals(int var1) {
         return this.intervals_.getInt(var1);
      }

      public CumulativeConstraintProto.Builder setIntervals(int var1, int var2) {
         this.ensureIntervalsIsMutable();
         this.intervals_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public CumulativeConstraintProto.Builder addIntervals(int var1) {
         this.ensureIntervalsIsMutable();
         this.intervals_.addInt(var1);
         this.onChanged();
         return this;
      }

      public CumulativeConstraintProto.Builder addAllIntervals(Iterable var1) {
         this.ensureIntervalsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.intervals_);
         this.onChanged();
         return this;
      }

      public CumulativeConstraintProto.Builder clearIntervals() {
         this.intervals_ = CumulativeConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureDemandsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.demands_ = CumulativeConstraintProto.mutableCopy(this.demands_);
            this.bitField0_ |= 2;
         }

      }

      public List getDemandsList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.demands_) : this.demands_);
      }

      public int getDemandsCount() {
         return this.demands_.size();
      }

      public int getDemands(int var1) {
         return this.demands_.getInt(var1);
      }

      public CumulativeConstraintProto.Builder setDemands(int var1, int var2) {
         this.ensureDemandsIsMutable();
         this.demands_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public CumulativeConstraintProto.Builder addDemands(int var1) {
         this.ensureDemandsIsMutable();
         this.demands_.addInt(var1);
         this.onChanged();
         return this;
      }

      public CumulativeConstraintProto.Builder addAllDemands(Iterable var1) {
         this.ensureDemandsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.demands_);
         this.onChanged();
         return this;
      }

      public CumulativeConstraintProto.Builder clearDemands() {
         this.demands_ = CumulativeConstraintProto.emptyIntList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public final CumulativeConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CumulativeConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final CumulativeConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CumulativeConstraintProto.Builder)super.mergeUnknownFields(var1);
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
