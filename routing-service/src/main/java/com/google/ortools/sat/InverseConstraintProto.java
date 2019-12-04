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

public final class InverseConstraintProto extends GeneratedMessageV3 implements InverseConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int F_DIRECT_FIELD_NUMBER = 1;
   private IntList fDirect_;
   private int fDirectMemoizedSerializedSize;
   public static final int F_INVERSE_FIELD_NUMBER = 2;
   private IntList fInverse_;
   private int fInverseMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final InverseConstraintProto DEFAULT_INSTANCE = new InverseConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public InverseConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new InverseConstraintProto(var1, var2);
      }
   };

   private InverseConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.fDirectMemoizedSerializedSize = -1;
      this.fInverseMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private InverseConstraintProto() {
      this.fDirectMemoizedSerializedSize = -1;
      this.fInverseMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.fDirect_ = emptyIntList();
      this.fInverse_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new InverseConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private InverseConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                        this.fDirect_ = newIntList();
                        var3 |= 1;
                     }

                     this.fDirect_.addInt(var1.readInt32());
                     continue;
                  case 10:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.fDirect_ = newIntList();
                        var3 |= 1;
                     }
                     break;
                  case 16:
                     if ((var3 & 2) == 0) {
                        this.fInverse_ = newIntList();
                        var3 |= 2;
                     }

                     this.fInverse_.addInt(var1.readInt32());
                     continue;
                  case 18:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.fInverse_ = newIntList();
                        var3 |= 2;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.fInverse_.addInt(var1.readInt32());
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
                     this.fDirect_.addInt(var1.readInt32());
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
               this.fDirect_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.fInverse_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_InverseConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_InverseConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(InverseConstraintProto.class, InverseConstraintProto.Builder.class);
   }

   public List getFDirectList() {
      return this.fDirect_;
   }

   public int getFDirectCount() {
      return this.fDirect_.size();
   }

   public int getFDirect(int var1) {
      return this.fDirect_.getInt(var1);
   }

   public List getFInverseList() {
      return this.fInverse_;
   }

   public int getFInverseCount() {
      return this.fInverse_.size();
   }

   public int getFInverse(int var1) {
      return this.fInverse_.getInt(var1);
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
      if (this.getFDirectList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.fDirectMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.fDirect_.size(); ++var2) {
         var1.writeInt32NoTag(this.fDirect_.getInt(var2));
      }

      if (this.getFInverseList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.fInverseMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.fInverse_.size(); ++var2) {
         var1.writeInt32NoTag(this.fInverse_.getInt(var2));
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
         for(var3 = 0; var3 < this.fDirect_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.fDirect_.getInt(var3));
         }

         var1 = var4 + var2;
         if (!this.getFDirectList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.fDirectMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.fInverse_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.fInverse_.getInt(var3));
         }

         var1 += var2;
         if (!this.getFInverseList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.fInverseMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof InverseConstraintProto)) {
         return super.equals(var1);
      } else {
         InverseConstraintProto var2 = (InverseConstraintProto)var1;
         if (!this.getFDirectList().equals(var2.getFDirectList())) {
            return false;
         } else if (!this.getFInverseList().equals(var2.getFInverseList())) {
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
         if (this.getFDirectCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getFDirectList().hashCode();
         }

         if (this.getFInverseCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getFInverseList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static InverseConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (InverseConstraintProto)PARSER.parseFrom(var0);
   }

   public static InverseConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (InverseConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static InverseConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (InverseConstraintProto)PARSER.parseFrom(var0);
   }

   public static InverseConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (InverseConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static InverseConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (InverseConstraintProto)PARSER.parseFrom(var0);
   }

   public static InverseConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (InverseConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static InverseConstraintProto parseFrom(InputStream var0) throws IOException {
      return (InverseConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InverseConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (InverseConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InverseConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (InverseConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InverseConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (InverseConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InverseConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (InverseConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InverseConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (InverseConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InverseConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InverseConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InverseConstraintProto.Builder newBuilder(InverseConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InverseConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InverseConstraintProto.Builder() : (new InverseConstraintProto.Builder()).mergeFrom(this);
   }

   protected InverseConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      InverseConstraintProto.Builder var2 = new InverseConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static InverseConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public InverseConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   InverseConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   InverseConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements InverseConstraintProtoOrBuilder {
      private int bitField0_;
      private IntList fDirect_;
      private IntList fInverse_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_InverseConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_InverseConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(InverseConstraintProto.class, InverseConstraintProto.Builder.class);
      }

      private Builder() {
         this.fDirect_ = InverseConstraintProto.emptyIntList();
         this.fInverse_ = InverseConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.fDirect_ = InverseConstraintProto.emptyIntList();
         this.fInverse_ = InverseConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (InverseConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public InverseConstraintProto.Builder clear() {
         super.clear();
         this.fDirect_ = InverseConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.fInverse_ = InverseConstraintProto.emptyIntList();
         this.bitField0_ &= -3;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_InverseConstraintProto_descriptor;
      }

      public InverseConstraintProto getDefaultInstanceForType() {
         return InverseConstraintProto.getDefaultInstance();
      }

      public InverseConstraintProto build() {
         InverseConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InverseConstraintProto buildPartial() {
         InverseConstraintProto var1 = new InverseConstraintProto(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.fDirect_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.fDirect_ = this.fDirect_;
         if ((this.bitField0_ & 2) != 0) {
            this.fInverse_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.fInverse_ = this.fInverse_;
         this.onBuilt();
         return var1;
      }

      public InverseConstraintProto.Builder clone() {
         return (InverseConstraintProto.Builder)super.clone();
      }

      public InverseConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (InverseConstraintProto.Builder)super.setField(var1, var2);
      }

      public InverseConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (InverseConstraintProto.Builder)super.clearField(var1);
      }

      public InverseConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (InverseConstraintProto.Builder)super.clearOneof(var1);
      }

      public InverseConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (InverseConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InverseConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (InverseConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public InverseConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof InverseConstraintProto) {
            return this.mergeFrom((InverseConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public InverseConstraintProto.Builder mergeFrom(InverseConstraintProto var1) {
         if (var1 == InverseConstraintProto.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.fDirect_.isEmpty()) {
               if (this.fDirect_.isEmpty()) {
                  this.fDirect_ = var1.fDirect_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureFDirectIsMutable();
                  this.fDirect_.addAll(var1.fDirect_);
               }

               this.onChanged();
            }

            if (!var1.fInverse_.isEmpty()) {
               if (this.fInverse_.isEmpty()) {
                  this.fInverse_ = var1.fInverse_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureFInverseIsMutable();
                  this.fInverse_.addAll(var1.fInverse_);
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

      public InverseConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         InverseConstraintProto var3 = null;

         try {
            var3 = (InverseConstraintProto)InverseConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (InverseConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureFDirectIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.fDirect_ = InverseConstraintProto.mutableCopy(this.fDirect_);
            this.bitField0_ |= 1;
         }

      }

      public List getFDirectList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.fDirect_) : this.fDirect_);
      }

      public int getFDirectCount() {
         return this.fDirect_.size();
      }

      public int getFDirect(int var1) {
         return this.fDirect_.getInt(var1);
      }

      public InverseConstraintProto.Builder setFDirect(int var1, int var2) {
         this.ensureFDirectIsMutable();
         this.fDirect_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public InverseConstraintProto.Builder addFDirect(int var1) {
         this.ensureFDirectIsMutable();
         this.fDirect_.addInt(var1);
         this.onChanged();
         return this;
      }

      public InverseConstraintProto.Builder addAllFDirect(Iterable var1) {
         this.ensureFDirectIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.fDirect_);
         this.onChanged();
         return this;
      }

      public InverseConstraintProto.Builder clearFDirect() {
         this.fDirect_ = InverseConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureFInverseIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.fInverse_ = InverseConstraintProto.mutableCopy(this.fInverse_);
            this.bitField0_ |= 2;
         }

      }

      public List getFInverseList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.fInverse_) : this.fInverse_);
      }

      public int getFInverseCount() {
         return this.fInverse_.size();
      }

      public int getFInverse(int var1) {
         return this.fInverse_.getInt(var1);
      }

      public InverseConstraintProto.Builder setFInverse(int var1, int var2) {
         this.ensureFInverseIsMutable();
         this.fInverse_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public InverseConstraintProto.Builder addFInverse(int var1) {
         this.ensureFInverseIsMutable();
         this.fInverse_.addInt(var1);
         this.onChanged();
         return this;
      }

      public InverseConstraintProto.Builder addAllFInverse(Iterable var1) {
         this.ensureFInverseIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.fInverse_);
         this.onChanged();
         return this;
      }

      public InverseConstraintProto.Builder clearFInverse() {
         this.fInverse_ = InverseConstraintProto.emptyIntList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public final InverseConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InverseConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final InverseConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InverseConstraintProto.Builder)super.mergeUnknownFields(var1);
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
