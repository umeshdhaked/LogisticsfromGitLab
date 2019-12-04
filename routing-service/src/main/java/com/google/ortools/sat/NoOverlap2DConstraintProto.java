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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class NoOverlap2DConstraintProto extends GeneratedMessageV3 implements NoOverlap2DConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int X_INTERVALS_FIELD_NUMBER = 1;
   private IntList xIntervals_;
   private int xIntervalsMemoizedSerializedSize;
   public static final int Y_INTERVALS_FIELD_NUMBER = 2;
   private IntList yIntervals_;
   private int yIntervalsMemoizedSerializedSize;
   public static final int BOXES_WITH_NULL_AREA_CAN_OVERLAP_FIELD_NUMBER = 3;
   private boolean boxesWithNullAreaCanOverlap_;
   private byte memoizedIsInitialized;
   private static final NoOverlap2DConstraintProto DEFAULT_INSTANCE = new NoOverlap2DConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public NoOverlap2DConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new NoOverlap2DConstraintProto(var1, var2);
      }
   };

   private NoOverlap2DConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.xIntervalsMemoizedSerializedSize = -1;
      this.yIntervalsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private NoOverlap2DConstraintProto() {
      this.xIntervalsMemoizedSerializedSize = -1;
      this.yIntervalsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.xIntervals_ = emptyIntList();
      this.yIntervals_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new NoOverlap2DConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private NoOverlap2DConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                     if ((var3 & 1) == 0) {
                        this.xIntervals_ = newIntList();
                        var3 |= 1;
                     }

                     this.xIntervals_.addInt(var1.readInt32());
                     continue;
                  case 10:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.xIntervals_ = newIntList();
                        var3 |= 1;
                     }
                     break;
                  case 16:
                     if ((var3 & 2) == 0) {
                        this.yIntervals_ = newIntList();
                        var3 |= 2;
                     }

                     this.yIntervals_.addInt(var1.readInt32());
                     continue;
                  case 18:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.yIntervals_ = newIntList();
                        var3 |= 2;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.yIntervals_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var8);
                     continue;
                  case 24:
                     this.boxesWithNullAreaCanOverlap_ = var1.readBool();
                     continue;
                  default:
                     if (!this.parseUnknownField(var1, var4, var2, var6)) {
                        var5 = true;
                     }
                     continue;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.xIntervals_.addInt(var1.readInt32());
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
               this.xIntervals_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.yIntervals_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_NoOverlap2DConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_NoOverlap2DConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(NoOverlap2DConstraintProto.class, NoOverlap2DConstraintProto.Builder.class);
   }

   public List getXIntervalsList() {
      return this.xIntervals_;
   }

   public int getXIntervalsCount() {
      return this.xIntervals_.size();
   }

   public int getXIntervals(int var1) {
      return this.xIntervals_.getInt(var1);
   }

   public List getYIntervalsList() {
      return this.yIntervals_;
   }

   public int getYIntervalsCount() {
      return this.yIntervals_.size();
   }

   public int getYIntervals(int var1) {
      return this.yIntervals_.getInt(var1);
   }

   public boolean getBoxesWithNullAreaCanOverlap() {
      return this.boxesWithNullAreaCanOverlap_;
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
      if (this.getXIntervalsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.xIntervalsMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.xIntervals_.size(); ++var2) {
         var1.writeInt32NoTag(this.xIntervals_.getInt(var2));
      }

      if (this.getYIntervalsList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.yIntervalsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.yIntervals_.size(); ++var2) {
         var1.writeInt32NoTag(this.yIntervals_.getInt(var2));
      }

      if (this.boxesWithNullAreaCanOverlap_) {
         var1.writeBool(3, this.boxesWithNullAreaCanOverlap_);
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
         for(var3 = 0; var3 < this.xIntervals_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.xIntervals_.getInt(var3));
         }

         var1 = var4 + var2;
         if (!this.getXIntervalsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.xIntervalsMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.yIntervals_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.yIntervals_.getInt(var3));
         }

         var1 += var2;
         if (!this.getYIntervalsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.yIntervalsMemoizedSerializedSize = var2;
         if (this.boxesWithNullAreaCanOverlap_) {
            var1 += CodedOutputStream.computeBoolSize(3, this.boxesWithNullAreaCanOverlap_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof NoOverlap2DConstraintProto)) {
         return super.equals(var1);
      } else {
         NoOverlap2DConstraintProto var2 = (NoOverlap2DConstraintProto)var1;
         if (!this.getXIntervalsList().equals(var2.getXIntervalsList())) {
            return false;
         } else if (!this.getYIntervalsList().equals(var2.getYIntervalsList())) {
            return false;
         } else if (this.getBoxesWithNullAreaCanOverlap() != var2.getBoxesWithNullAreaCanOverlap()) {
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
         if (this.getXIntervalsCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getXIntervalsList().hashCode();
         }

         if (this.getYIntervalsCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getYIntervalsList().hashCode();
         }

         var2 = 37 * var2 + 3;
         var2 = 53 * var2 + Internal.hashBoolean(this.getBoxesWithNullAreaCanOverlap());
         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static NoOverlap2DConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (NoOverlap2DConstraintProto)PARSER.parseFrom(var0);
   }

   public static NoOverlap2DConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (NoOverlap2DConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static NoOverlap2DConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (NoOverlap2DConstraintProto)PARSER.parseFrom(var0);
   }

   public static NoOverlap2DConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (NoOverlap2DConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static NoOverlap2DConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (NoOverlap2DConstraintProto)PARSER.parseFrom(var0);
   }

   public static NoOverlap2DConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (NoOverlap2DConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static NoOverlap2DConstraintProto parseFrom(InputStream var0) throws IOException {
      return (NoOverlap2DConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NoOverlap2DConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (NoOverlap2DConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static NoOverlap2DConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (NoOverlap2DConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static NoOverlap2DConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (NoOverlap2DConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static NoOverlap2DConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (NoOverlap2DConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NoOverlap2DConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (NoOverlap2DConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public NoOverlap2DConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static NoOverlap2DConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static NoOverlap2DConstraintProto.Builder newBuilder(NoOverlap2DConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public NoOverlap2DConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new NoOverlap2DConstraintProto.Builder() : (new NoOverlap2DConstraintProto.Builder()).mergeFrom(this);
   }

   protected NoOverlap2DConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      NoOverlap2DConstraintProto.Builder var2 = new NoOverlap2DConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static NoOverlap2DConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public NoOverlap2DConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   NoOverlap2DConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   NoOverlap2DConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements NoOverlap2DConstraintProtoOrBuilder {
      private int bitField0_;
      private IntList xIntervals_;
      private IntList yIntervals_;
      private boolean boxesWithNullAreaCanOverlap_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_NoOverlap2DConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_NoOverlap2DConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(NoOverlap2DConstraintProto.class, NoOverlap2DConstraintProto.Builder.class);
      }

      private Builder() {
         this.xIntervals_ = NoOverlap2DConstraintProto.emptyIntList();
         this.yIntervals_ = NoOverlap2DConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.xIntervals_ = NoOverlap2DConstraintProto.emptyIntList();
         this.yIntervals_ = NoOverlap2DConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (NoOverlap2DConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public NoOverlap2DConstraintProto.Builder clear() {
         super.clear();
         this.xIntervals_ = NoOverlap2DConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.yIntervals_ = NoOverlap2DConstraintProto.emptyIntList();
         this.bitField0_ &= -3;
         this.boxesWithNullAreaCanOverlap_ = false;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_NoOverlap2DConstraintProto_descriptor;
      }

      public NoOverlap2DConstraintProto getDefaultInstanceForType() {
         return NoOverlap2DConstraintProto.getDefaultInstance();
      }

      public NoOverlap2DConstraintProto build() {
         NoOverlap2DConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public NoOverlap2DConstraintProto buildPartial() {
         NoOverlap2DConstraintProto var1 = new NoOverlap2DConstraintProto(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.xIntervals_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.xIntervals_ = this.xIntervals_;
         if ((this.bitField0_ & 2) != 0) {
            this.yIntervals_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.yIntervals_ = this.yIntervals_;
         var1.boxesWithNullAreaCanOverlap_ = this.boxesWithNullAreaCanOverlap_;
         this.onBuilt();
         return var1;
      }

      public NoOverlap2DConstraintProto.Builder clone() {
         return (NoOverlap2DConstraintProto.Builder)super.clone();
      }

      public NoOverlap2DConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (NoOverlap2DConstraintProto.Builder)super.setField(var1, var2);
      }

      public NoOverlap2DConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (NoOverlap2DConstraintProto.Builder)super.clearField(var1);
      }

      public NoOverlap2DConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (NoOverlap2DConstraintProto.Builder)super.clearOneof(var1);
      }

      public NoOverlap2DConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (NoOverlap2DConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public NoOverlap2DConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (NoOverlap2DConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public NoOverlap2DConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof NoOverlap2DConstraintProto) {
            return this.mergeFrom((NoOverlap2DConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public NoOverlap2DConstraintProto.Builder mergeFrom(NoOverlap2DConstraintProto var1) {
         if (var1 == NoOverlap2DConstraintProto.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.xIntervals_.isEmpty()) {
               if (this.xIntervals_.isEmpty()) {
                  this.xIntervals_ = var1.xIntervals_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureXIntervalsIsMutable();
                  this.xIntervals_.addAll(var1.xIntervals_);
               }

               this.onChanged();
            }

            if (!var1.yIntervals_.isEmpty()) {
               if (this.yIntervals_.isEmpty()) {
                  this.yIntervals_ = var1.yIntervals_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureYIntervalsIsMutable();
                  this.yIntervals_.addAll(var1.yIntervals_);
               }

               this.onChanged();
            }

            if (var1.getBoxesWithNullAreaCanOverlap()) {
               this.setBoxesWithNullAreaCanOverlap(var1.getBoxesWithNullAreaCanOverlap());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public NoOverlap2DConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         NoOverlap2DConstraintProto var3 = null;

         try {
            var3 = (NoOverlap2DConstraintProto)NoOverlap2DConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (NoOverlap2DConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureXIntervalsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.xIntervals_ = NoOverlap2DConstraintProto.mutableCopy(this.xIntervals_);
            this.bitField0_ |= 1;
         }

      }

      public List getXIntervalsList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.xIntervals_) : this.xIntervals_);
      }

      public int getXIntervalsCount() {
         return this.xIntervals_.size();
      }

      public int getXIntervals(int var1) {
         return this.xIntervals_.getInt(var1);
      }

      public NoOverlap2DConstraintProto.Builder setXIntervals(int var1, int var2) {
         this.ensureXIntervalsIsMutable();
         this.xIntervals_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public NoOverlap2DConstraintProto.Builder addXIntervals(int var1) {
         this.ensureXIntervalsIsMutable();
         this.xIntervals_.addInt(var1);
         this.onChanged();
         return this;
      }

      public NoOverlap2DConstraintProto.Builder addAllXIntervals(Iterable var1) {
         this.ensureXIntervalsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.xIntervals_);
         this.onChanged();
         return this;
      }

      public NoOverlap2DConstraintProto.Builder clearXIntervals() {
         this.xIntervals_ = NoOverlap2DConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureYIntervalsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.yIntervals_ = NoOverlap2DConstraintProto.mutableCopy(this.yIntervals_);
            this.bitField0_ |= 2;
         }

      }

      public List getYIntervalsList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.yIntervals_) : this.yIntervals_);
      }

      public int getYIntervalsCount() {
         return this.yIntervals_.size();
      }

      public int getYIntervals(int var1) {
         return this.yIntervals_.getInt(var1);
      }

      public NoOverlap2DConstraintProto.Builder setYIntervals(int var1, int var2) {
         this.ensureYIntervalsIsMutable();
         this.yIntervals_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public NoOverlap2DConstraintProto.Builder addYIntervals(int var1) {
         this.ensureYIntervalsIsMutable();
         this.yIntervals_.addInt(var1);
         this.onChanged();
         return this;
      }

      public NoOverlap2DConstraintProto.Builder addAllYIntervals(Iterable var1) {
         this.ensureYIntervalsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.yIntervals_);
         this.onChanged();
         return this;
      }

      public NoOverlap2DConstraintProto.Builder clearYIntervals() {
         this.yIntervals_ = NoOverlap2DConstraintProto.emptyIntList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public boolean getBoxesWithNullAreaCanOverlap() {
         return this.boxesWithNullAreaCanOverlap_;
      }

      public NoOverlap2DConstraintProto.Builder setBoxesWithNullAreaCanOverlap(boolean var1) {
         this.boxesWithNullAreaCanOverlap_ = var1;
         this.onChanged();
         return this;
      }

      public NoOverlap2DConstraintProto.Builder clearBoxesWithNullAreaCanOverlap() {
         this.boxesWithNullAreaCanOverlap_ = false;
         this.onChanged();
         return this;
      }

      public final NoOverlap2DConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (NoOverlap2DConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final NoOverlap2DConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (NoOverlap2DConstraintProto.Builder)super.mergeUnknownFields(var1);
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
