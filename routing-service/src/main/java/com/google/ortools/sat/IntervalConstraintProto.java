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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class IntervalConstraintProto extends GeneratedMessageV3 implements IntervalConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int START_FIELD_NUMBER = 1;
   private int start_;
   public static final int END_FIELD_NUMBER = 2;
   private int end_;
   public static final int SIZE_FIELD_NUMBER = 3;
   private int size_;
   private byte memoizedIsInitialized;
   private static final IntervalConstraintProto DEFAULT_INSTANCE = new IntervalConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public IntervalConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new IntervalConstraintProto(var1, var2);
      }
   };

   private IntervalConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private IntervalConstraintProto() {
      this.memoizedIsInitialized = -1;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new IntervalConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private IntervalConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         com.google.protobuf.UnknownFieldSet.Builder var3 = UnknownFieldSet.newBuilder();

         try {
            boolean var4 = false;

            while(!var4) {
               int var5 = var1.readTag();
               switch(var5) {
               case 0:
                  var4 = true;
                  break;
               case 8:
                  this.start_ = var1.readInt32();
                  break;
               case 16:
                  this.end_ = var1.readInt32();
                  break;
               case 24:
                  this.size_ = var1.readInt32();
                  break;
               default:
                  if (!this.parseUnknownField(var1, var3, var2, var5)) {
                     var4 = true;
                  }
               }
            }
         } catch (InvalidProtocolBufferException var10) {
            throw var10.setUnfinishedMessage(this);
         } catch (IOException var11) {
            throw (new InvalidProtocolBufferException(var11)).setUnfinishedMessage(this);
         } finally {
            this.unknownFields = var3.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_IntervalConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_IntervalConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(IntervalConstraintProto.class, IntervalConstraintProto.Builder.class);
   }

   public int getStart() {
      return this.start_;
   }

   public int getEnd() {
      return this.end_;
   }

   public int getSize() {
      return this.size_;
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
      if (this.start_ != 0) {
         var1.writeInt32(1, this.start_);
      }

      if (this.end_ != 0) {
         var1.writeInt32(2, this.end_);
      }

      if (this.size_ != 0) {
         var1.writeInt32(3, this.size_);
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (this.start_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(1, this.start_);
         }

         if (this.end_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(2, this.end_);
         }

         if (this.size_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(3, this.size_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof IntervalConstraintProto)) {
         return super.equals(var1);
      } else {
         IntervalConstraintProto var2 = (IntervalConstraintProto)var1;
         if (this.getStart() != var2.getStart()) {
            return false;
         } else if (this.getEnd() != var2.getEnd()) {
            return false;
         } else if (this.getSize() != var2.getSize()) {
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
         var2 = 53 * var2 + this.getStart();
         var2 = 37 * var2 + 2;
         var2 = 53 * var2 + this.getEnd();
         var2 = 37 * var2 + 3;
         var2 = 53 * var2 + this.getSize();
         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static IntervalConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (IntervalConstraintProto)PARSER.parseFrom(var0);
   }

   public static IntervalConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (IntervalConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static IntervalConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (IntervalConstraintProto)PARSER.parseFrom(var0);
   }

   public static IntervalConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (IntervalConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static IntervalConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (IntervalConstraintProto)PARSER.parseFrom(var0);
   }

   public static IntervalConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (IntervalConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static IntervalConstraintProto parseFrom(InputStream var0) throws IOException {
      return (IntervalConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static IntervalConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (IntervalConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static IntervalConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (IntervalConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static IntervalConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (IntervalConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static IntervalConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (IntervalConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static IntervalConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (IntervalConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public IntervalConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static IntervalConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static IntervalConstraintProto.Builder newBuilder(IntervalConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public IntervalConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new IntervalConstraintProto.Builder() : (new IntervalConstraintProto.Builder()).mergeFrom(this);
   }

   protected IntervalConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      IntervalConstraintProto.Builder var2 = new IntervalConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static IntervalConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public IntervalConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   IntervalConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   IntervalConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements IntervalConstraintProtoOrBuilder {
      private int start_;
      private int end_;
      private int size_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_IntervalConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_IntervalConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(IntervalConstraintProto.class, IntervalConstraintProto.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (IntervalConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public IntervalConstraintProto.Builder clear() {
         super.clear();
         this.start_ = 0;
         this.end_ = 0;
         this.size_ = 0;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_IntervalConstraintProto_descriptor;
      }

      public IntervalConstraintProto getDefaultInstanceForType() {
         return IntervalConstraintProto.getDefaultInstance();
      }

      public IntervalConstraintProto build() {
         IntervalConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public IntervalConstraintProto buildPartial() {
         IntervalConstraintProto var1 = new IntervalConstraintProto(this);
         var1.start_ = this.start_;
         var1.end_ = this.end_;
         var1.size_ = this.size_;
         this.onBuilt();
         return var1;
      }

      public IntervalConstraintProto.Builder clone() {
         return (IntervalConstraintProto.Builder)super.clone();
      }

      public IntervalConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (IntervalConstraintProto.Builder)super.setField(var1, var2);
      }

      public IntervalConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (IntervalConstraintProto.Builder)super.clearField(var1);
      }

      public IntervalConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (IntervalConstraintProto.Builder)super.clearOneof(var1);
      }

      public IntervalConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (IntervalConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public IntervalConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (IntervalConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public IntervalConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof IntervalConstraintProto) {
            return this.mergeFrom((IntervalConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public IntervalConstraintProto.Builder mergeFrom(IntervalConstraintProto var1) {
         if (var1 == IntervalConstraintProto.getDefaultInstance()) {
            return this;
         } else {
            if (var1.getStart() != 0) {
               this.setStart(var1.getStart());
            }

            if (var1.getEnd() != 0) {
               this.setEnd(var1.getEnd());
            }

            if (var1.getSize() != 0) {
               this.setSize(var1.getSize());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public IntervalConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         IntervalConstraintProto var3 = null;

         try {
            var3 = (IntervalConstraintProto)IntervalConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (IntervalConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public int getStart() {
         return this.start_;
      }

      public IntervalConstraintProto.Builder setStart(int var1) {
         this.start_ = var1;
         this.onChanged();
         return this;
      }

      public IntervalConstraintProto.Builder clearStart() {
         this.start_ = 0;
         this.onChanged();
         return this;
      }

      public int getEnd() {
         return this.end_;
      }

      public IntervalConstraintProto.Builder setEnd(int var1) {
         this.end_ = var1;
         this.onChanged();
         return this;
      }

      public IntervalConstraintProto.Builder clearEnd() {
         this.end_ = 0;
         this.onChanged();
         return this;
      }

      public int getSize() {
         return this.size_;
      }

      public IntervalConstraintProto.Builder setSize(int var1) {
         this.size_ = var1;
         this.onChanged();
         return this;
      }

      public IntervalConstraintProto.Builder clearSize() {
         this.size_ = 0;
         this.onChanged();
         return this;
      }

      public final IntervalConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (IntervalConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final IntervalConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (IntervalConstraintProto.Builder)super.mergeUnknownFields(var1);
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
