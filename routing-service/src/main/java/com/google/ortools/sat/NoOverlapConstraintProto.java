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

public final class NoOverlapConstraintProto extends GeneratedMessageV3 implements NoOverlapConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int INTERVALS_FIELD_NUMBER = 1;
   private IntList intervals_;
   private int intervalsMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final NoOverlapConstraintProto DEFAULT_INSTANCE = new NoOverlapConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public NoOverlapConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new NoOverlapConstraintProto(var1, var2);
      }
   };

   private NoOverlapConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.intervalsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private NoOverlapConstraintProto() {
      this.intervalsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.intervals_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new NoOverlapConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private NoOverlapConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         boolean var3 = false;
         com.google.protobuf.UnknownFieldSet.Builder var4 = UnknownFieldSet.newBuilder();

         try {
            boolean var5 = false;

            while(true) {
               while(!var5) {
                  int var6 = var1.readTag();
                  switch(var6) {
                  case 0:
                     var5 = true;
                     break;
                  case 8:
                     if (!(var3 & true)) {
                        this.intervals_ = newIntList();
                        var3 |= true;
                     }

                     this.intervals_.addInt(var1.readInt32());
                     break;
                  case 10:
                     int var7 = var1.readRawVarint32();
                     int var8 = var1.pushLimit(var7);
                     if (!(var3 & true) && var1.getBytesUntilLimit() > 0) {
                        this.intervals_ = newIntList();
                        var3 |= true;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.intervals_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var8);
                     break;
                  default:
                     if (!this.parseUnknownField(var1, var4, var2, var6)) {
                        var5 = true;
                     }
                  }
               }

               return;
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            if (var3 & true) {
               this.intervals_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_NoOverlapConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_NoOverlapConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(NoOverlapConstraintProto.class, NoOverlapConstraintProto.Builder.class);
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
      if (this.getIntervalsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.intervalsMemoizedSerializedSize);
      }

      for(int var2 = 0; var2 < this.intervals_.size(); ++var2) {
         var1.writeInt32NoTag(this.intervals_.getInt(var2));
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

         for(int var3 = 0; var3 < this.intervals_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.intervals_.getInt(var3));
         }

         var1 = var4 + var2;
         if (!this.getIntervalsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.intervalsMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof NoOverlapConstraintProto)) {
         return super.equals(var1);
      } else {
         NoOverlapConstraintProto var2 = (NoOverlapConstraintProto)var1;
         if (!this.getIntervalsList().equals(var2.getIntervalsList())) {
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
         if (this.getIntervalsCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getIntervalsList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static NoOverlapConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (NoOverlapConstraintProto)PARSER.parseFrom(var0);
   }

   public static NoOverlapConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (NoOverlapConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static NoOverlapConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (NoOverlapConstraintProto)PARSER.parseFrom(var0);
   }

   public static NoOverlapConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (NoOverlapConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static NoOverlapConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (NoOverlapConstraintProto)PARSER.parseFrom(var0);
   }

   public static NoOverlapConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (NoOverlapConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static NoOverlapConstraintProto parseFrom(InputStream var0) throws IOException {
      return (NoOverlapConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NoOverlapConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (NoOverlapConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static NoOverlapConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (NoOverlapConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static NoOverlapConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (NoOverlapConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static NoOverlapConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (NoOverlapConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NoOverlapConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (NoOverlapConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public NoOverlapConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static NoOverlapConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static NoOverlapConstraintProto.Builder newBuilder(NoOverlapConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public NoOverlapConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new NoOverlapConstraintProto.Builder() : (new NoOverlapConstraintProto.Builder()).mergeFrom(this);
   }

   protected NoOverlapConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      NoOverlapConstraintProto.Builder var2 = new NoOverlapConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static NoOverlapConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public NoOverlapConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   NoOverlapConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   NoOverlapConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements NoOverlapConstraintProtoOrBuilder {
      private int bitField0_;
      private IntList intervals_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_NoOverlapConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_NoOverlapConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(NoOverlapConstraintProto.class, NoOverlapConstraintProto.Builder.class);
      }

      private Builder() {
         this.intervals_ = NoOverlapConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.intervals_ = NoOverlapConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (NoOverlapConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public NoOverlapConstraintProto.Builder clear() {
         super.clear();
         this.intervals_ = NoOverlapConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_NoOverlapConstraintProto_descriptor;
      }

      public NoOverlapConstraintProto getDefaultInstanceForType() {
         return NoOverlapConstraintProto.getDefaultInstance();
      }

      public NoOverlapConstraintProto build() {
         NoOverlapConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public NoOverlapConstraintProto buildPartial() {
         NoOverlapConstraintProto var1 = new NoOverlapConstraintProto(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.intervals_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.intervals_ = this.intervals_;
         this.onBuilt();
         return var1;
      }

      public NoOverlapConstraintProto.Builder clone() {
         return (NoOverlapConstraintProto.Builder)super.clone();
      }

      public NoOverlapConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (NoOverlapConstraintProto.Builder)super.setField(var1, var2);
      }

      public NoOverlapConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (NoOverlapConstraintProto.Builder)super.clearField(var1);
      }

      public NoOverlapConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (NoOverlapConstraintProto.Builder)super.clearOneof(var1);
      }

      public NoOverlapConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (NoOverlapConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public NoOverlapConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (NoOverlapConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public NoOverlapConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof NoOverlapConstraintProto) {
            return this.mergeFrom((NoOverlapConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public NoOverlapConstraintProto.Builder mergeFrom(NoOverlapConstraintProto var1) {
         if (var1 == NoOverlapConstraintProto.getDefaultInstance()) {
            return this;
         } else {
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

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public NoOverlapConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         NoOverlapConstraintProto var3 = null;

         try {
            var3 = (NoOverlapConstraintProto)NoOverlapConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (NoOverlapConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureIntervalsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.intervals_ = NoOverlapConstraintProto.mutableCopy(this.intervals_);
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

      public NoOverlapConstraintProto.Builder setIntervals(int var1, int var2) {
         this.ensureIntervalsIsMutable();
         this.intervals_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public NoOverlapConstraintProto.Builder addIntervals(int var1) {
         this.ensureIntervalsIsMutable();
         this.intervals_.addInt(var1);
         this.onChanged();
         return this;
      }

      public NoOverlapConstraintProto.Builder addAllIntervals(Iterable var1) {
         this.ensureIntervalsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.intervals_);
         this.onChanged();
         return this;
      }

      public NoOverlapConstraintProto.Builder clearIntervals() {
         this.intervals_ = NoOverlapConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public final NoOverlapConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (NoOverlapConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final NoOverlapConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (NoOverlapConstraintProto.Builder)super.mergeUnknownFields(var1);
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
