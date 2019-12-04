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
import com.google.protobuf.Internal.LongList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class CircuitCoveringConstraintProto extends GeneratedMessageV3 implements CircuitCoveringConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int NEXTS_FIELD_NUMBER = 1;
   private IntList nexts_;
   private int nextsMemoizedSerializedSize;
   public static final int DISTINGUISHED_NODES_FIELD_NUMBER = 2;
   private LongList distinguishedNodes_;
   private int distinguishedNodesMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final CircuitCoveringConstraintProto DEFAULT_INSTANCE = new CircuitCoveringConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public CircuitCoveringConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new CircuitCoveringConstraintProto(var1, var2);
      }
   };

   private CircuitCoveringConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.nextsMemoizedSerializedSize = -1;
      this.distinguishedNodesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private CircuitCoveringConstraintProto() {
      this.nextsMemoizedSerializedSize = -1;
      this.distinguishedNodesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.nexts_ = emptyIntList();
      this.distinguishedNodes_ = emptyLongList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new CircuitCoveringConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private CircuitCoveringConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                        this.nexts_ = newIntList();
                        var3 |= 1;
                     }

                     this.nexts_.addInt(var1.readInt32());
                     continue;
                  case 10:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.nexts_ = newIntList();
                        var3 |= 1;
                     }
                     break;
                  case 16:
                     if ((var3 & 2) == 0) {
                        this.distinguishedNodes_ = newLongList();
                        var3 |= 2;
                     }

                     this.distinguishedNodes_.addLong(var1.readInt64());
                     continue;
                  case 18:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.distinguishedNodes_ = newLongList();
                        var3 |= 2;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.distinguishedNodes_.addLong(var1.readInt64());
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
                     this.nexts_.addInt(var1.readInt32());
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
               this.nexts_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.distinguishedNodes_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_CircuitCoveringConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_CircuitCoveringConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(CircuitCoveringConstraintProto.class, CircuitCoveringConstraintProto.Builder.class);
   }

   public List getNextsList() {
      return this.nexts_;
   }

   public int getNextsCount() {
      return this.nexts_.size();
   }

   public int getNexts(int var1) {
      return this.nexts_.getInt(var1);
   }

   public List getDistinguishedNodesList() {
      return this.distinguishedNodes_;
   }

   public int getDistinguishedNodesCount() {
      return this.distinguishedNodes_.size();
   }

   public long getDistinguishedNodes(int var1) {
      return this.distinguishedNodes_.getLong(var1);
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
      if (this.getNextsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.nextsMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.nexts_.size(); ++var2) {
         var1.writeInt32NoTag(this.nexts_.getInt(var2));
      }

      if (this.getDistinguishedNodesList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.distinguishedNodesMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.distinguishedNodes_.size(); ++var2) {
         var1.writeInt64NoTag(this.distinguishedNodes_.getLong(var2));
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
         for(var3 = 0; var3 < this.nexts_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.nexts_.getInt(var3));
         }

         var1 = var4 + var2;
         if (!this.getNextsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.nextsMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.distinguishedNodes_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.distinguishedNodes_.getLong(var3));
         }

         var1 += var2;
         if (!this.getDistinguishedNodesList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.distinguishedNodesMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CircuitCoveringConstraintProto)) {
         return super.equals(var1);
      } else {
         CircuitCoveringConstraintProto var2 = (CircuitCoveringConstraintProto)var1;
         if (!this.getNextsList().equals(var2.getNextsList())) {
            return false;
         } else if (!this.getDistinguishedNodesList().equals(var2.getDistinguishedNodesList())) {
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
         if (this.getNextsCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getNextsList().hashCode();
         }

         if (this.getDistinguishedNodesCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getDistinguishedNodesList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static CircuitCoveringConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (CircuitCoveringConstraintProto)PARSER.parseFrom(var0);
   }

   public static CircuitCoveringConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CircuitCoveringConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static CircuitCoveringConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (CircuitCoveringConstraintProto)PARSER.parseFrom(var0);
   }

   public static CircuitCoveringConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CircuitCoveringConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static CircuitCoveringConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (CircuitCoveringConstraintProto)PARSER.parseFrom(var0);
   }

   public static CircuitCoveringConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CircuitCoveringConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static CircuitCoveringConstraintProto parseFrom(InputStream var0) throws IOException {
      return (CircuitCoveringConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CircuitCoveringConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CircuitCoveringConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CircuitCoveringConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (CircuitCoveringConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CircuitCoveringConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CircuitCoveringConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CircuitCoveringConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (CircuitCoveringConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CircuitCoveringConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CircuitCoveringConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CircuitCoveringConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CircuitCoveringConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CircuitCoveringConstraintProto.Builder newBuilder(CircuitCoveringConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CircuitCoveringConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CircuitCoveringConstraintProto.Builder() : (new CircuitCoveringConstraintProto.Builder()).mergeFrom(this);
   }

   protected CircuitCoveringConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      CircuitCoveringConstraintProto.Builder var2 = new CircuitCoveringConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static CircuitCoveringConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public CircuitCoveringConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   CircuitCoveringConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   CircuitCoveringConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements CircuitCoveringConstraintProtoOrBuilder {
      private int bitField0_;
      private IntList nexts_;
      private LongList distinguishedNodes_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_CircuitCoveringConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_CircuitCoveringConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(CircuitCoveringConstraintProto.class, CircuitCoveringConstraintProto.Builder.class);
      }

      private Builder() {
         this.nexts_ = CircuitCoveringConstraintProto.emptyIntList();
         this.distinguishedNodes_ = CircuitCoveringConstraintProto.emptyLongList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.nexts_ = CircuitCoveringConstraintProto.emptyIntList();
         this.distinguishedNodes_ = CircuitCoveringConstraintProto.emptyLongList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (CircuitCoveringConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public CircuitCoveringConstraintProto.Builder clear() {
         super.clear();
         this.nexts_ = CircuitCoveringConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.distinguishedNodes_ = CircuitCoveringConstraintProto.emptyLongList();
         this.bitField0_ &= -3;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_CircuitCoveringConstraintProto_descriptor;
      }

      public CircuitCoveringConstraintProto getDefaultInstanceForType() {
         return CircuitCoveringConstraintProto.getDefaultInstance();
      }

      public CircuitCoveringConstraintProto build() {
         CircuitCoveringConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CircuitCoveringConstraintProto buildPartial() {
         CircuitCoveringConstraintProto var1 = new CircuitCoveringConstraintProto(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.nexts_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.nexts_ = this.nexts_;
         if ((this.bitField0_ & 2) != 0) {
            this.distinguishedNodes_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.distinguishedNodes_ = this.distinguishedNodes_;
         this.onBuilt();
         return var1;
      }

      public CircuitCoveringConstraintProto.Builder clone() {
         return (CircuitCoveringConstraintProto.Builder)super.clone();
      }

      public CircuitCoveringConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (CircuitCoveringConstraintProto.Builder)super.setField(var1, var2);
      }

      public CircuitCoveringConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (CircuitCoveringConstraintProto.Builder)super.clearField(var1);
      }

      public CircuitCoveringConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (CircuitCoveringConstraintProto.Builder)super.clearOneof(var1);
      }

      public CircuitCoveringConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (CircuitCoveringConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CircuitCoveringConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (CircuitCoveringConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public CircuitCoveringConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof CircuitCoveringConstraintProto) {
            return this.mergeFrom((CircuitCoveringConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public CircuitCoveringConstraintProto.Builder mergeFrom(CircuitCoveringConstraintProto var1) {
         if (var1 == CircuitCoveringConstraintProto.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.nexts_.isEmpty()) {
               if (this.nexts_.isEmpty()) {
                  this.nexts_ = var1.nexts_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureNextsIsMutable();
                  this.nexts_.addAll(var1.nexts_);
               }

               this.onChanged();
            }

            if (!var1.distinguishedNodes_.isEmpty()) {
               if (this.distinguishedNodes_.isEmpty()) {
                  this.distinguishedNodes_ = var1.distinguishedNodes_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureDistinguishedNodesIsMutable();
                  this.distinguishedNodes_.addAll(var1.distinguishedNodes_);
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

      public CircuitCoveringConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         CircuitCoveringConstraintProto var3 = null;

         try {
            var3 = (CircuitCoveringConstraintProto)CircuitCoveringConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (CircuitCoveringConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureNextsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.nexts_ = CircuitCoveringConstraintProto.mutableCopy(this.nexts_);
            this.bitField0_ |= 1;
         }

      }

      public List getNextsList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.nexts_) : this.nexts_);
      }

      public int getNextsCount() {
         return this.nexts_.size();
      }

      public int getNexts(int var1) {
         return this.nexts_.getInt(var1);
      }

      public CircuitCoveringConstraintProto.Builder setNexts(int var1, int var2) {
         this.ensureNextsIsMutable();
         this.nexts_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public CircuitCoveringConstraintProto.Builder addNexts(int var1) {
         this.ensureNextsIsMutable();
         this.nexts_.addInt(var1);
         this.onChanged();
         return this;
      }

      public CircuitCoveringConstraintProto.Builder addAllNexts(Iterable var1) {
         this.ensureNextsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.nexts_);
         this.onChanged();
         return this;
      }

      public CircuitCoveringConstraintProto.Builder clearNexts() {
         this.nexts_ = CircuitCoveringConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureDistinguishedNodesIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.distinguishedNodes_ = CircuitCoveringConstraintProto.mutableCopy(this.distinguishedNodes_);
            this.bitField0_ |= 2;
         }

      }

      public List getDistinguishedNodesList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.distinguishedNodes_) : this.distinguishedNodes_);
      }

      public int getDistinguishedNodesCount() {
         return this.distinguishedNodes_.size();
      }

      public long getDistinguishedNodes(int var1) {
         return this.distinguishedNodes_.getLong(var1);
      }

      public CircuitCoveringConstraintProto.Builder setDistinguishedNodes(int var1, long var2) {
         this.ensureDistinguishedNodesIsMutable();
         this.distinguishedNodes_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public CircuitCoveringConstraintProto.Builder addDistinguishedNodes(long var1) {
         this.ensureDistinguishedNodesIsMutable();
         this.distinguishedNodes_.addLong(var1);
         this.onChanged();
         return this;
      }

      public CircuitCoveringConstraintProto.Builder addAllDistinguishedNodes(Iterable var1) {
         this.ensureDistinguishedNodesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.distinguishedNodes_);
         this.onChanged();
         return this;
      }

      public CircuitCoveringConstraintProto.Builder clearDistinguishedNodes() {
         this.distinguishedNodes_ = CircuitCoveringConstraintProto.emptyLongList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public final CircuitCoveringConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CircuitCoveringConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final CircuitCoveringConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CircuitCoveringConstraintProto.Builder)super.mergeUnknownFields(var1);
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
