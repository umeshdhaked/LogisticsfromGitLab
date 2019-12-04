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

public final class CircuitConstraintProto extends GeneratedMessageV3 implements CircuitConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TAILS_FIELD_NUMBER = 3;
   private IntList tails_;
   private int tailsMemoizedSerializedSize;
   public static final int HEADS_FIELD_NUMBER = 4;
   private IntList heads_;
   private int headsMemoizedSerializedSize;
   public static final int LITERALS_FIELD_NUMBER = 5;
   private IntList literals_;
   private int literalsMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final CircuitConstraintProto DEFAULT_INSTANCE = new CircuitConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public CircuitConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new CircuitConstraintProto(var1, var2);
      }
   };

   private CircuitConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.tailsMemoizedSerializedSize = -1;
      this.headsMemoizedSerializedSize = -1;
      this.literalsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private CircuitConstraintProto() {
      this.tailsMemoizedSerializedSize = -1;
      this.headsMemoizedSerializedSize = -1;
      this.literalsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.tails_ = emptyIntList();
      this.heads_ = emptyIntList();
      this.literals_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new CircuitConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private CircuitConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
               case 24:
                  if ((var3 & 1) == 0) {
                     this.tails_ = newIntList();
                     var3 |= 1;
                  }

                  this.tails_.addInt(var1.readInt32());
                  continue;
               case 26:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.tails_ = newIntList();
                     var3 |= 1;
                  }
                  break;
               case 32:
                  if ((var3 & 2) == 0) {
                     this.heads_ = newIntList();
                     var3 |= 2;
                  }

                  this.heads_.addInt(var1.readInt32());
                  continue;
               case 34:
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
               case 40:
                  if ((var3 & 4) == 0) {
                     this.literals_ = newIntList();
                     var3 |= 4;
                  }

                  this.literals_.addInt(var1.readInt32());
                  continue;
               case 42:
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

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_CircuitConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_CircuitConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(CircuitConstraintProto.class, CircuitConstraintProto.Builder.class);
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
         var1.writeUInt32NoTag(26);
         var1.writeUInt32NoTag(this.tailsMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.tails_.size(); ++var2) {
         var1.writeInt32NoTag(this.tails_.getInt(var2));
      }

      if (this.getHeadsList().size() > 0) {
         var1.writeUInt32NoTag(34);
         var1.writeUInt32NoTag(this.headsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.heads_.size(); ++var2) {
         var1.writeInt32NoTag(this.heads_.getInt(var2));
      }

      if (this.getLiteralsList().size() > 0) {
         var1.writeUInt32NoTag(42);
         var1.writeUInt32NoTag(this.literalsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.literals_.size(); ++var2) {
         var1.writeInt32NoTag(this.literals_.getInt(var2));
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
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CircuitConstraintProto)) {
         return super.equals(var1);
      } else {
         CircuitConstraintProto var2 = (CircuitConstraintProto)var1;
         if (!this.getTailsList().equals(var2.getTailsList())) {
            return false;
         } else if (!this.getHeadsList().equals(var2.getHeadsList())) {
            return false;
         } else if (!this.getLiteralsList().equals(var2.getLiteralsList())) {
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
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getTailsList().hashCode();
         }

         if (this.getHeadsCount() > 0) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getHeadsList().hashCode();
         }

         if (this.getLiteralsCount() > 0) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.getLiteralsList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static CircuitConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (CircuitConstraintProto)PARSER.parseFrom(var0);
   }

   public static CircuitConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CircuitConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static CircuitConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (CircuitConstraintProto)PARSER.parseFrom(var0);
   }

   public static CircuitConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CircuitConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static CircuitConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (CircuitConstraintProto)PARSER.parseFrom(var0);
   }

   public static CircuitConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CircuitConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static CircuitConstraintProto parseFrom(InputStream var0) throws IOException {
      return (CircuitConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CircuitConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CircuitConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CircuitConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (CircuitConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CircuitConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CircuitConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CircuitConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (CircuitConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CircuitConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CircuitConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CircuitConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CircuitConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CircuitConstraintProto.Builder newBuilder(CircuitConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CircuitConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CircuitConstraintProto.Builder() : (new CircuitConstraintProto.Builder()).mergeFrom(this);
   }

   protected CircuitConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      CircuitConstraintProto.Builder var2 = new CircuitConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static CircuitConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public CircuitConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   CircuitConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   CircuitConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements CircuitConstraintProtoOrBuilder {
      private int bitField0_;
      private IntList tails_;
      private IntList heads_;
      private IntList literals_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_CircuitConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_CircuitConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(CircuitConstraintProto.class, CircuitConstraintProto.Builder.class);
      }

      private Builder() {
         this.tails_ = CircuitConstraintProto.emptyIntList();
         this.heads_ = CircuitConstraintProto.emptyIntList();
         this.literals_ = CircuitConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.tails_ = CircuitConstraintProto.emptyIntList();
         this.heads_ = CircuitConstraintProto.emptyIntList();
         this.literals_ = CircuitConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (CircuitConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public CircuitConstraintProto.Builder clear() {
         super.clear();
         this.tails_ = CircuitConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.heads_ = CircuitConstraintProto.emptyIntList();
         this.bitField0_ &= -3;
         this.literals_ = CircuitConstraintProto.emptyIntList();
         this.bitField0_ &= -5;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_CircuitConstraintProto_descriptor;
      }

      public CircuitConstraintProto getDefaultInstanceForType() {
         return CircuitConstraintProto.getDefaultInstance();
      }

      public CircuitConstraintProto build() {
         CircuitConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CircuitConstraintProto buildPartial() {
         CircuitConstraintProto var1 = new CircuitConstraintProto(this);
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
         this.onBuilt();
         return var1;
      }

      public CircuitConstraintProto.Builder clone() {
         return (CircuitConstraintProto.Builder)super.clone();
      }

      public CircuitConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (CircuitConstraintProto.Builder)super.setField(var1, var2);
      }

      public CircuitConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (CircuitConstraintProto.Builder)super.clearField(var1);
      }

      public CircuitConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (CircuitConstraintProto.Builder)super.clearOneof(var1);
      }

      public CircuitConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (CircuitConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CircuitConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (CircuitConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public CircuitConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof CircuitConstraintProto) {
            return this.mergeFrom((CircuitConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public CircuitConstraintProto.Builder mergeFrom(CircuitConstraintProto var1) {
         if (var1 == CircuitConstraintProto.getDefaultInstance()) {
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

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public CircuitConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         CircuitConstraintProto var3 = null;

         try {
            var3 = (CircuitConstraintProto)CircuitConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (CircuitConstraintProto)var8.getUnfinishedMessage();
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
            this.tails_ = CircuitConstraintProto.mutableCopy(this.tails_);
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

      public CircuitConstraintProto.Builder setTails(int var1, int var2) {
         this.ensureTailsIsMutable();
         this.tails_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public CircuitConstraintProto.Builder addTails(int var1) {
         this.ensureTailsIsMutable();
         this.tails_.addInt(var1);
         this.onChanged();
         return this;
      }

      public CircuitConstraintProto.Builder addAllTails(Iterable var1) {
         this.ensureTailsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.tails_);
         this.onChanged();
         return this;
      }

      public CircuitConstraintProto.Builder clearTails() {
         this.tails_ = CircuitConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureHeadsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.heads_ = CircuitConstraintProto.mutableCopy(this.heads_);
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

      public CircuitConstraintProto.Builder setHeads(int var1, int var2) {
         this.ensureHeadsIsMutable();
         this.heads_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public CircuitConstraintProto.Builder addHeads(int var1) {
         this.ensureHeadsIsMutable();
         this.heads_.addInt(var1);
         this.onChanged();
         return this;
      }

      public CircuitConstraintProto.Builder addAllHeads(Iterable var1) {
         this.ensureHeadsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.heads_);
         this.onChanged();
         return this;
      }

      public CircuitConstraintProto.Builder clearHeads() {
         this.heads_ = CircuitConstraintProto.emptyIntList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      private void ensureLiteralsIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.literals_ = CircuitConstraintProto.mutableCopy(this.literals_);
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

      public CircuitConstraintProto.Builder setLiterals(int var1, int var2) {
         this.ensureLiteralsIsMutable();
         this.literals_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public CircuitConstraintProto.Builder addLiterals(int var1) {
         this.ensureLiteralsIsMutable();
         this.literals_.addInt(var1);
         this.onChanged();
         return this;
      }

      public CircuitConstraintProto.Builder addAllLiterals(Iterable var1) {
         this.ensureLiteralsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.literals_);
         this.onChanged();
         return this;
      }

      public CircuitConstraintProto.Builder clearLiterals() {
         this.literals_ = CircuitConstraintProto.emptyIntList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public final CircuitConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CircuitConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final CircuitConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CircuitConstraintProto.Builder)super.mergeUnknownFields(var1);
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
