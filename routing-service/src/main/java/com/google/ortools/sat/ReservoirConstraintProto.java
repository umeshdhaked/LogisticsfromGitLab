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

public final class ReservoirConstraintProto extends GeneratedMessageV3 implements ReservoirConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MIN_LEVEL_FIELD_NUMBER = 1;
   private long minLevel_;
   public static final int MAX_LEVEL_FIELD_NUMBER = 2;
   private long maxLevel_;
   public static final int TIMES_FIELD_NUMBER = 3;
   private IntList times_;
   private int timesMemoizedSerializedSize;
   public static final int DEMANDS_FIELD_NUMBER = 4;
   private LongList demands_;
   private int demandsMemoizedSerializedSize;
   public static final int ACTIVES_FIELD_NUMBER = 5;
   private IntList actives_;
   private int activesMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final ReservoirConstraintProto DEFAULT_INSTANCE = new ReservoirConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public ReservoirConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new ReservoirConstraintProto(var1, var2);
      }
   };

   private ReservoirConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.timesMemoizedSerializedSize = -1;
      this.demandsMemoizedSerializedSize = -1;
      this.activesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private ReservoirConstraintProto() {
      this.timesMemoizedSerializedSize = -1;
      this.demandsMemoizedSerializedSize = -1;
      this.activesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.times_ = emptyIntList();
      this.demands_ = emptyLongList();
      this.actives_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new ReservoirConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private ReservoirConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                  this.minLevel_ = var1.readInt64();
                  continue;
               case 16:
                  this.maxLevel_ = var1.readInt64();
                  continue;
               case 24:
                  if ((var3 & 1) == 0) {
                     this.times_ = newIntList();
                     var3 |= 1;
                  }

                  this.times_.addInt(var1.readInt32());
                  continue;
               case 26:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.times_ = newIntList();
                     var3 |= 1;
                  }
                  break;
               case 32:
                  if ((var3 & 2) == 0) {
                     this.demands_ = newLongList();
                     var3 |= 2;
                  }

                  this.demands_.addLong(var1.readInt64());
                  continue;
               case 34:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.demands_ = newLongList();
                     var3 |= 2;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.demands_.addLong(var1.readInt64());
                  }

                  var1.popLimit(var8);
                  continue;
               case 40:
                  if ((var3 & 4) == 0) {
                     this.actives_ = newIntList();
                     var3 |= 4;
                  }

                  this.actives_.addInt(var1.readInt32());
                  continue;
               case 42:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 4) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.actives_ = newIntList();
                     var3 |= 4;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.actives_.addInt(var1.readInt32());
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
                  this.times_.addInt(var1.readInt32());
               }

               var1.popLimit(var8);
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            if ((var3 & 1) != 0) {
               this.times_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.demands_.makeImmutable();
            }

            if ((var3 & 4) != 0) {
               this.actives_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_ReservoirConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_ReservoirConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(ReservoirConstraintProto.class, ReservoirConstraintProto.Builder.class);
   }

   public long getMinLevel() {
      return this.minLevel_;
   }

   public long getMaxLevel() {
      return this.maxLevel_;
   }

   public List getTimesList() {
      return this.times_;
   }

   public int getTimesCount() {
      return this.times_.size();
   }

   public int getTimes(int var1) {
      return this.times_.getInt(var1);
   }

   public List getDemandsList() {
      return this.demands_;
   }

   public int getDemandsCount() {
      return this.demands_.size();
   }

   public long getDemands(int var1) {
      return this.demands_.getLong(var1);
   }

   public List getActivesList() {
      return this.actives_;
   }

   public int getActivesCount() {
      return this.actives_.size();
   }

   public int getActives(int var1) {
      return this.actives_.getInt(var1);
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
      if (this.minLevel_ != 0L) {
         var1.writeInt64(1, this.minLevel_);
      }

      if (this.maxLevel_ != 0L) {
         var1.writeInt64(2, this.maxLevel_);
      }

      if (this.getTimesList().size() > 0) {
         var1.writeUInt32NoTag(26);
         var1.writeUInt32NoTag(this.timesMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.times_.size(); ++var2) {
         var1.writeInt32NoTag(this.times_.getInt(var2));
      }

      if (this.getDemandsList().size() > 0) {
         var1.writeUInt32NoTag(34);
         var1.writeUInt32NoTag(this.demandsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.demands_.size(); ++var2) {
         var1.writeInt64NoTag(this.demands_.getLong(var2));
      }

      if (this.getActivesList().size() > 0) {
         var1.writeUInt32NoTag(42);
         var1.writeUInt32NoTag(this.activesMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.actives_.size(); ++var2) {
         var1.writeInt32NoTag(this.actives_.getInt(var2));
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (this.minLevel_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(1, this.minLevel_);
         }

         if (this.maxLevel_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(2, this.maxLevel_);
         }

         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < this.times_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.times_.getInt(var3));
         }

         var1 += var2;
         if (!this.getTimesList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.timesMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.demands_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.demands_.getLong(var3));
         }

         var1 += var2;
         if (!this.getDemandsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.demandsMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.actives_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.actives_.getInt(var3));
         }

         var1 += var2;
         if (!this.getActivesList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.activesMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ReservoirConstraintProto)) {
         return super.equals(var1);
      } else {
         ReservoirConstraintProto var2 = (ReservoirConstraintProto)var1;
         if (this.getMinLevel() != var2.getMinLevel()) {
            return false;
         } else if (this.getMaxLevel() != var2.getMaxLevel()) {
            return false;
         } else if (!this.getTimesList().equals(var2.getTimesList())) {
            return false;
         } else if (!this.getDemandsList().equals(var2.getDemandsList())) {
            return false;
         } else if (!this.getActivesList().equals(var2.getActivesList())) {
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
         var2 = 53 * var2 + Internal.hashLong(this.getMinLevel());
         var2 = 37 * var2 + 2;
         var2 = 53 * var2 + Internal.hashLong(this.getMaxLevel());
         if (this.getTimesCount() > 0) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getTimesList().hashCode();
         }

         if (this.getDemandsCount() > 0) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getDemandsList().hashCode();
         }

         if (this.getActivesCount() > 0) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.getActivesList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static ReservoirConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (ReservoirConstraintProto)PARSER.parseFrom(var0);
   }

   public static ReservoirConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ReservoirConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static ReservoirConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (ReservoirConstraintProto)PARSER.parseFrom(var0);
   }

   public static ReservoirConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ReservoirConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static ReservoirConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (ReservoirConstraintProto)PARSER.parseFrom(var0);
   }

   public static ReservoirConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ReservoirConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static ReservoirConstraintProto parseFrom(InputStream var0) throws IOException {
      return (ReservoirConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ReservoirConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ReservoirConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ReservoirConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (ReservoirConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ReservoirConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ReservoirConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ReservoirConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (ReservoirConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ReservoirConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ReservoirConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ReservoirConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ReservoirConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ReservoirConstraintProto.Builder newBuilder(ReservoirConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ReservoirConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ReservoirConstraintProto.Builder() : (new ReservoirConstraintProto.Builder()).mergeFrom(this);
   }

   protected ReservoirConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      ReservoirConstraintProto.Builder var2 = new ReservoirConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static ReservoirConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public ReservoirConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   ReservoirConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   ReservoirConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements ReservoirConstraintProtoOrBuilder {
      private int bitField0_;
      private long minLevel_;
      private long maxLevel_;
      private IntList times_;
      private LongList demands_;
      private IntList actives_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_ReservoirConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_ReservoirConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(ReservoirConstraintProto.class, ReservoirConstraintProto.Builder.class);
      }

      private Builder() {
         this.times_ = ReservoirConstraintProto.emptyIntList();
         this.demands_ = ReservoirConstraintProto.emptyLongList();
         this.actives_ = ReservoirConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.times_ = ReservoirConstraintProto.emptyIntList();
         this.demands_ = ReservoirConstraintProto.emptyLongList();
         this.actives_ = ReservoirConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ReservoirConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public ReservoirConstraintProto.Builder clear() {
         super.clear();
         this.minLevel_ = 0L;
         this.maxLevel_ = 0L;
         this.times_ = ReservoirConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.demands_ = ReservoirConstraintProto.emptyLongList();
         this.bitField0_ &= -3;
         this.actives_ = ReservoirConstraintProto.emptyIntList();
         this.bitField0_ &= -5;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_ReservoirConstraintProto_descriptor;
      }

      public ReservoirConstraintProto getDefaultInstanceForType() {
         return ReservoirConstraintProto.getDefaultInstance();
      }

      public ReservoirConstraintProto build() {
         ReservoirConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ReservoirConstraintProto buildPartial() {
         ReservoirConstraintProto var1 = new ReservoirConstraintProto(this);
         int var2 = this.bitField0_;
         var1.minLevel_ = this.minLevel_;
         var1.maxLevel_ = this.maxLevel_;
         if ((this.bitField0_ & 1) != 0) {
            this.times_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.times_ = this.times_;
         if ((this.bitField0_ & 2) != 0) {
            this.demands_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.demands_ = this.demands_;
         if ((this.bitField0_ & 4) != 0) {
            this.actives_.makeImmutable();
            this.bitField0_ &= -5;
         }

         var1.actives_ = this.actives_;
         this.onBuilt();
         return var1;
      }

      public ReservoirConstraintProto.Builder clone() {
         return (ReservoirConstraintProto.Builder)super.clone();
      }

      public ReservoirConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (ReservoirConstraintProto.Builder)super.setField(var1, var2);
      }

      public ReservoirConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (ReservoirConstraintProto.Builder)super.clearField(var1);
      }

      public ReservoirConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (ReservoirConstraintProto.Builder)super.clearOneof(var1);
      }

      public ReservoirConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (ReservoirConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ReservoirConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (ReservoirConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public ReservoirConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof ReservoirConstraintProto) {
            return this.mergeFrom((ReservoirConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public ReservoirConstraintProto.Builder mergeFrom(ReservoirConstraintProto var1) {
         if (var1 == ReservoirConstraintProto.getDefaultInstance()) {
            return this;
         } else {
            if (var1.getMinLevel() != 0L) {
               this.setMinLevel(var1.getMinLevel());
            }

            if (var1.getMaxLevel() != 0L) {
               this.setMaxLevel(var1.getMaxLevel());
            }

            if (!var1.times_.isEmpty()) {
               if (this.times_.isEmpty()) {
                  this.times_ = var1.times_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureTimesIsMutable();
                  this.times_.addAll(var1.times_);
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

            if (!var1.actives_.isEmpty()) {
               if (this.actives_.isEmpty()) {
                  this.actives_ = var1.actives_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureActivesIsMutable();
                  this.actives_.addAll(var1.actives_);
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

      public ReservoirConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         ReservoirConstraintProto var3 = null;

         try {
            var3 = (ReservoirConstraintProto)ReservoirConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (ReservoirConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public long getMinLevel() {
         return this.minLevel_;
      }

      public ReservoirConstraintProto.Builder setMinLevel(long var1) {
         this.minLevel_ = var1;
         this.onChanged();
         return this;
      }

      public ReservoirConstraintProto.Builder clearMinLevel() {
         this.minLevel_ = 0L;
         this.onChanged();
         return this;
      }

      public long getMaxLevel() {
         return this.maxLevel_;
      }

      public ReservoirConstraintProto.Builder setMaxLevel(long var1) {
         this.maxLevel_ = var1;
         this.onChanged();
         return this;
      }

      public ReservoirConstraintProto.Builder clearMaxLevel() {
         this.maxLevel_ = 0L;
         this.onChanged();
         return this;
      }

      private void ensureTimesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.times_ = ReservoirConstraintProto.mutableCopy(this.times_);
            this.bitField0_ |= 1;
         }

      }

      public List getTimesList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.times_) : this.times_);
      }

      public int getTimesCount() {
         return this.times_.size();
      }

      public int getTimes(int var1) {
         return this.times_.getInt(var1);
      }

      public ReservoirConstraintProto.Builder setTimes(int var1, int var2) {
         this.ensureTimesIsMutable();
         this.times_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public ReservoirConstraintProto.Builder addTimes(int var1) {
         this.ensureTimesIsMutable();
         this.times_.addInt(var1);
         this.onChanged();
         return this;
      }

      public ReservoirConstraintProto.Builder addAllTimes(Iterable var1) {
         this.ensureTimesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.times_);
         this.onChanged();
         return this;
      }

      public ReservoirConstraintProto.Builder clearTimes() {
         this.times_ = ReservoirConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureDemandsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.demands_ = ReservoirConstraintProto.mutableCopy(this.demands_);
            this.bitField0_ |= 2;
         }

      }

      public List getDemandsList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.demands_) : this.demands_);
      }

      public int getDemandsCount() {
         return this.demands_.size();
      }

      public long getDemands(int var1) {
         return this.demands_.getLong(var1);
      }

      public ReservoirConstraintProto.Builder setDemands(int var1, long var2) {
         this.ensureDemandsIsMutable();
         this.demands_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public ReservoirConstraintProto.Builder addDemands(long var1) {
         this.ensureDemandsIsMutable();
         this.demands_.addLong(var1);
         this.onChanged();
         return this;
      }

      public ReservoirConstraintProto.Builder addAllDemands(Iterable var1) {
         this.ensureDemandsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.demands_);
         this.onChanged();
         return this;
      }

      public ReservoirConstraintProto.Builder clearDemands() {
         this.demands_ = ReservoirConstraintProto.emptyLongList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      private void ensureActivesIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.actives_ = ReservoirConstraintProto.mutableCopy(this.actives_);
            this.bitField0_ |= 4;
         }

      }

      public List getActivesList() {
         return (List)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.actives_) : this.actives_);
      }

      public int getActivesCount() {
         return this.actives_.size();
      }

      public int getActives(int var1) {
         return this.actives_.getInt(var1);
      }

      public ReservoirConstraintProto.Builder setActives(int var1, int var2) {
         this.ensureActivesIsMutable();
         this.actives_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public ReservoirConstraintProto.Builder addActives(int var1) {
         this.ensureActivesIsMutable();
         this.actives_.addInt(var1);
         this.onChanged();
         return this;
      }

      public ReservoirConstraintProto.Builder addAllActives(Iterable var1) {
         this.ensureActivesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.actives_);
         this.onChanged();
         return this;
      }

      public ReservoirConstraintProto.Builder clearActives() {
         this.actives_ = ReservoirConstraintProto.emptyIntList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public final ReservoirConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ReservoirConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final ReservoirConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ReservoirConstraintProto.Builder)super.mergeUnknownFields(var1);
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
