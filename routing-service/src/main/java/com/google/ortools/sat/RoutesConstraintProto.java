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

public final class RoutesConstraintProto extends GeneratedMessageV3 implements RoutesConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TAILS_FIELD_NUMBER = 1;
   private IntList tails_;
   private int tailsMemoizedSerializedSize;
   public static final int HEADS_FIELD_NUMBER = 2;
   private IntList heads_;
   private int headsMemoizedSerializedSize;
   public static final int LITERALS_FIELD_NUMBER = 3;
   private IntList literals_;
   private int literalsMemoizedSerializedSize;
   public static final int DEMANDS_FIELD_NUMBER = 4;
   private IntList demands_;
   private int demandsMemoizedSerializedSize;
   public static final int CAPACITY_FIELD_NUMBER = 5;
   private long capacity_;
   private byte memoizedIsInitialized;
   private static final RoutesConstraintProto DEFAULT_INSTANCE = new RoutesConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public RoutesConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new RoutesConstraintProto(var1, var2);
      }
   };

   private RoutesConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.tailsMemoizedSerializedSize = -1;
      this.headsMemoizedSerializedSize = -1;
      this.literalsMemoizedSerializedSize = -1;
      this.demandsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private RoutesConstraintProto() {
      this.tailsMemoizedSerializedSize = -1;
      this.headsMemoizedSerializedSize = -1;
      this.literalsMemoizedSerializedSize = -1;
      this.demandsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.tails_ = emptyIntList();
      this.heads_ = emptyIntList();
      this.literals_ = emptyIntList();
      this.demands_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new RoutesConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private RoutesConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                     this.tails_ = newIntList();
                     var3 |= 1;
                  }

                  this.tails_.addInt(var1.readInt32());
                  continue;
               case 10:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.tails_ = newIntList();
                     var3 |= 1;
                  }
                  break;
               case 16:
                  if ((var3 & 2) == 0) {
                     this.heads_ = newIntList();
                     var3 |= 2;
                  }

                  this.heads_.addInt(var1.readInt32());
                  continue;
               case 18:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.heads_ = newIntList();
                     var3 |= 2;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.heads_.addInt(var1.readInt32());
                  }

                  var1.popLimit(var8);
                  continue;
               case 24:
                  if ((var3 & 4) == 0) {
                     this.literals_ = newIntList();
                     var3 |= 4;
                  }

                  this.literals_.addInt(var1.readInt32());
                  continue;
               case 26:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 4) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.literals_ = newIntList();
                     var3 |= 4;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.literals_.addInt(var1.readInt32());
                  }

                  var1.popLimit(var8);
                  continue;
               case 32:
                  if ((var3 & 8) == 0) {
                     this.demands_ = newIntList();
                     var3 |= 8;
                  }

                  this.demands_.addInt(var1.readInt32());
                  continue;
               case 34:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 8) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.demands_ = newIntList();
                     var3 |= 8;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.demands_.addInt(var1.readInt32());
                  }

                  var1.popLimit(var8);
                  continue;
               case 40:
                  this.capacity_ = var1.readInt64();
                  continue;
               default:
                  if (!this.parseUnknownField(var1, var4, var2, var6)) {
                     var5 = true;
                  }
                  continue;
               }

               while(var1.getBytesUntilLimit() > 0) {
                  this.tails_.addInt(var1.readInt32());
               }

               var1.popLimit(var8);
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            if ((var3 & 1) != 0) {
               this.tails_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.heads_.makeImmutable();
            }

            if ((var3 & 4) != 0) {
               this.literals_.makeImmutable();
            }

            if ((var3 & 8) != 0) {
               this.demands_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_RoutesConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_RoutesConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutesConstraintProto.class, RoutesConstraintProto.Builder.class);
   }

   public List getTailsList() {
      return this.tails_;
   }

   public int getTailsCount() {
      return this.tails_.size();
   }

   public int getTails(int var1) {
      return this.tails_.getInt(var1);
   }

   public List getHeadsList() {
      return this.heads_;
   }

   public int getHeadsCount() {
      return this.heads_.size();
   }

   public int getHeads(int var1) {
      return this.heads_.getInt(var1);
   }

   public List getLiteralsList() {
      return this.literals_;
   }

   public int getLiteralsCount() {
      return this.literals_.size();
   }

   public int getLiterals(int var1) {
      return this.literals_.getInt(var1);
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

   public long getCapacity() {
      return this.capacity_;
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
      if (this.getTailsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.tailsMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.tails_.size(); ++var2) {
         var1.writeInt32NoTag(this.tails_.getInt(var2));
      }

      if (this.getHeadsList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.headsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.heads_.size(); ++var2) {
         var1.writeInt32NoTag(this.heads_.getInt(var2));
      }

      if (this.getLiteralsList().size() > 0) {
         var1.writeUInt32NoTag(26);
         var1.writeUInt32NoTag(this.literalsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.literals_.size(); ++var2) {
         var1.writeInt32NoTag(this.literals_.getInt(var2));
      }

      if (this.getDemandsList().size() > 0) {
         var1.writeUInt32NoTag(34);
         var1.writeUInt32NoTag(this.demandsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.demands_.size(); ++var2) {
         var1.writeInt32NoTag(this.demands_.getInt(var2));
      }

      if (this.capacity_ != 0L) {
         var1.writeInt64(5, this.capacity_);
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
         for(var3 = 0; var3 < this.tails_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.tails_.getInt(var3));
         }

         var1 = var4 + var2;
         if (!this.getTailsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.tailsMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.heads_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.heads_.getInt(var3));
         }

         var1 += var2;
         if (!this.getHeadsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.headsMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.literals_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.literals_.getInt(var3));
         }

         var1 += var2;
         if (!this.getLiteralsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.literalsMemoizedSerializedSize = var2;
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
         if (this.capacity_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(5, this.capacity_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RoutesConstraintProto)) {
         return super.equals(var1);
      } else {
         RoutesConstraintProto var2 = (RoutesConstraintProto)var1;
         if (!this.getTailsList().equals(var2.getTailsList())) {
            return false;
         } else if (!this.getHeadsList().equals(var2.getHeadsList())) {
            return false;
         } else if (!this.getLiteralsList().equals(var2.getLiteralsList())) {
            return false;
         } else if (!this.getDemandsList().equals(var2.getDemandsList())) {
            return false;
         } else if (this.getCapacity() != var2.getCapacity()) {
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
         if (this.getTailsCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getTailsList().hashCode();
         }

         if (this.getHeadsCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getHeadsList().hashCode();
         }

         if (this.getLiteralsCount() > 0) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getLiteralsList().hashCode();
         }

         if (this.getDemandsCount() > 0) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getDemandsList().hashCode();
         }

         var2 = 37 * var2 + 5;
         var2 = 53 * var2 + Internal.hashLong(this.getCapacity());
         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static RoutesConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (RoutesConstraintProto)PARSER.parseFrom(var0);
   }

   public static RoutesConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RoutesConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static RoutesConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (RoutesConstraintProto)PARSER.parseFrom(var0);
   }

   public static RoutesConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RoutesConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static RoutesConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (RoutesConstraintProto)PARSER.parseFrom(var0);
   }

   public static RoutesConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RoutesConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static RoutesConstraintProto parseFrom(InputStream var0) throws IOException {
      return (RoutesConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RoutesConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RoutesConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RoutesConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (RoutesConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RoutesConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RoutesConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RoutesConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (RoutesConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RoutesConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RoutesConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RoutesConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RoutesConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RoutesConstraintProto.Builder newBuilder(RoutesConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RoutesConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RoutesConstraintProto.Builder() : (new RoutesConstraintProto.Builder()).mergeFrom(this);
   }

   protected RoutesConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      RoutesConstraintProto.Builder var2 = new RoutesConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static RoutesConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public RoutesConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   RoutesConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   RoutesConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements RoutesConstraintProtoOrBuilder {
      private int bitField0_;
      private IntList tails_;
      private IntList heads_;
      private IntList literals_;
      private IntList demands_;
      private long capacity_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_RoutesConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_RoutesConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutesConstraintProto.class, RoutesConstraintProto.Builder.class);
      }

      private Builder() {
         this.tails_ = RoutesConstraintProto.emptyIntList();
         this.heads_ = RoutesConstraintProto.emptyIntList();
         this.literals_ = RoutesConstraintProto.emptyIntList();
         this.demands_ = RoutesConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.tails_ = RoutesConstraintProto.emptyIntList();
         this.heads_ = RoutesConstraintProto.emptyIntList();
         this.literals_ = RoutesConstraintProto.emptyIntList();
         this.demands_ = RoutesConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RoutesConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public RoutesConstraintProto.Builder clear() {
         super.clear();
         this.tails_ = RoutesConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.heads_ = RoutesConstraintProto.emptyIntList();
         this.bitField0_ &= -3;
         this.literals_ = RoutesConstraintProto.emptyIntList();
         this.bitField0_ &= -5;
         this.demands_ = RoutesConstraintProto.emptyIntList();
         this.bitField0_ &= -9;
         this.capacity_ = 0L;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_RoutesConstraintProto_descriptor;
      }

      public RoutesConstraintProto getDefaultInstanceForType() {
         return RoutesConstraintProto.getDefaultInstance();
      }

      public RoutesConstraintProto build() {
         RoutesConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RoutesConstraintProto buildPartial() {
         RoutesConstraintProto var1 = new RoutesConstraintProto(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.tails_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.tails_ = this.tails_;
         if ((this.bitField0_ & 2) != 0) {
            this.heads_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.heads_ = this.heads_;
         if ((this.bitField0_ & 4) != 0) {
            this.literals_.makeImmutable();
            this.bitField0_ &= -5;
         }

         var1.literals_ = this.literals_;
         if ((this.bitField0_ & 8) != 0) {
            this.demands_.makeImmutable();
            this.bitField0_ &= -9;
         }

         var1.demands_ = this.demands_;
         var1.capacity_ = this.capacity_;
         this.onBuilt();
         return var1;
      }

      public RoutesConstraintProto.Builder clone() {
         return (RoutesConstraintProto.Builder)super.clone();
      }

      public RoutesConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (RoutesConstraintProto.Builder)super.setField(var1, var2);
      }

      public RoutesConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (RoutesConstraintProto.Builder)super.clearField(var1);
      }

      public RoutesConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (RoutesConstraintProto.Builder)super.clearOneof(var1);
      }

      public RoutesConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (RoutesConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RoutesConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (RoutesConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public RoutesConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof RoutesConstraintProto) {
            return this.mergeFrom((RoutesConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public RoutesConstraintProto.Builder mergeFrom(RoutesConstraintProto var1) {
         if (var1 == RoutesConstraintProto.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.tails_.isEmpty()) {
               if (this.tails_.isEmpty()) {
                  this.tails_ = var1.tails_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureTailsIsMutable();
                  this.tails_.addAll(var1.tails_);
               }

               this.onChanged();
            }

            if (!var1.heads_.isEmpty()) {
               if (this.heads_.isEmpty()) {
                  this.heads_ = var1.heads_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureHeadsIsMutable();
                  this.heads_.addAll(var1.heads_);
               }

               this.onChanged();
            }

            if (!var1.literals_.isEmpty()) {
               if (this.literals_.isEmpty()) {
                  this.literals_ = var1.literals_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureLiteralsIsMutable();
                  this.literals_.addAll(var1.literals_);
               }

               this.onChanged();
            }

            if (!var1.demands_.isEmpty()) {
               if (this.demands_.isEmpty()) {
                  this.demands_ = var1.demands_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureDemandsIsMutable();
                  this.demands_.addAll(var1.demands_);
               }

               this.onChanged();
            }

            if (var1.getCapacity() != 0L) {
               this.setCapacity(var1.getCapacity());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public RoutesConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         RoutesConstraintProto var3 = null;

         try {
            var3 = (RoutesConstraintProto)RoutesConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (RoutesConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureTailsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.tails_ = RoutesConstraintProto.mutableCopy(this.tails_);
            this.bitField0_ |= 1;
         }

      }

      public List getTailsList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.tails_) : this.tails_);
      }

      public int getTailsCount() {
         return this.tails_.size();
      }

      public int getTails(int var1) {
         return this.tails_.getInt(var1);
      }

      public RoutesConstraintProto.Builder setTails(int var1, int var2) {
         this.ensureTailsIsMutable();
         this.tails_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder addTails(int var1) {
         this.ensureTailsIsMutable();
         this.tails_.addInt(var1);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder addAllTails(Iterable var1) {
         this.ensureTailsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.tails_);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder clearTails() {
         this.tails_ = RoutesConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureHeadsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.heads_ = RoutesConstraintProto.mutableCopy(this.heads_);
            this.bitField0_ |= 2;
         }

      }

      public List getHeadsList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.heads_) : this.heads_);
      }

      public int getHeadsCount() {
         return this.heads_.size();
      }

      public int getHeads(int var1) {
         return this.heads_.getInt(var1);
      }

      public RoutesConstraintProto.Builder setHeads(int var1, int var2) {
         this.ensureHeadsIsMutable();
         this.heads_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder addHeads(int var1) {
         this.ensureHeadsIsMutable();
         this.heads_.addInt(var1);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder addAllHeads(Iterable var1) {
         this.ensureHeadsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.heads_);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder clearHeads() {
         this.heads_ = RoutesConstraintProto.emptyIntList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      private void ensureLiteralsIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.literals_ = RoutesConstraintProto.mutableCopy(this.literals_);
            this.bitField0_ |= 4;
         }

      }

      public List getLiteralsList() {
         return (List)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.literals_) : this.literals_);
      }

      public int getLiteralsCount() {
         return this.literals_.size();
      }

      public int getLiterals(int var1) {
         return this.literals_.getInt(var1);
      }

      public RoutesConstraintProto.Builder setLiterals(int var1, int var2) {
         this.ensureLiteralsIsMutable();
         this.literals_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder addLiterals(int var1) {
         this.ensureLiteralsIsMutable();
         this.literals_.addInt(var1);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder addAllLiterals(Iterable var1) {
         this.ensureLiteralsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.literals_);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder clearLiterals() {
         this.literals_ = RoutesConstraintProto.emptyIntList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      private void ensureDemandsIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.demands_ = RoutesConstraintProto.mutableCopy(this.demands_);
            this.bitField0_ |= 8;
         }

      }

      public List getDemandsList() {
         return (List)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.demands_) : this.demands_);
      }

      public int getDemandsCount() {
         return this.demands_.size();
      }

      public int getDemands(int var1) {
         return this.demands_.getInt(var1);
      }

      public RoutesConstraintProto.Builder setDemands(int var1, int var2) {
         this.ensureDemandsIsMutable();
         this.demands_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder addDemands(int var1) {
         this.ensureDemandsIsMutable();
         this.demands_.addInt(var1);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder addAllDemands(Iterable var1) {
         this.ensureDemandsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.demands_);
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder clearDemands() {
         this.demands_ = RoutesConstraintProto.emptyIntList();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public long getCapacity() {
         return this.capacity_;
      }

      public RoutesConstraintProto.Builder setCapacity(long var1) {
         this.capacity_ = var1;
         this.onChanged();
         return this;
      }

      public RoutesConstraintProto.Builder clearCapacity() {
         this.capacity_ = 0L;
         this.onChanged();
         return this;
      }

      public final RoutesConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RoutesConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final RoutesConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RoutesConstraintProto.Builder)super.mergeUnknownFields(var1);
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
