package com.google.ortools.linearsolver;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OptionalDouble extends GeneratedMessageV3 implements OptionalDoubleOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int VALUE_FIELD_NUMBER = 1;
   private double value_;
   private byte memoizedIsInitialized;
   private static final OptionalDouble DEFAULT_INSTANCE = new OptionalDouble();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public OptionalDouble parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new OptionalDouble(var1, var2);
      }
   };

   private OptionalDouble(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private OptionalDouble() {
      this.memoizedIsInitialized = -1;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new OptionalDouble();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private OptionalDouble(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         boolean var3 = false;
         com.google.protobuf.UnknownFieldSet.Builder var4 = UnknownFieldSet.newBuilder();

         try {
            boolean var5 = false;

            while(!var5) {
               int var6 = var1.readTag();
               switch(var6) {
               case 0:
                  var5 = true;
                  break;
               case 9:
                  this.bitField0_ |= 1;
                  this.value_ = var1.readDouble();
                  break;
               default:
                  if (!this.parseUnknownField(var1, var4, var2, var6)) {
                     var5 = true;
                  }
               }
            }
         } catch (InvalidProtocolBufferException var11) {
            throw var11.setUnfinishedMessage(this);
         } catch (IOException var12) {
            throw (new InvalidProtocolBufferException(var12)).setUnfinishedMessage(this);
         } finally {
            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_OptionalDouble_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_OptionalDouble_fieldAccessorTable.ensureFieldAccessorsInitialized(OptionalDouble.class, OptionalDouble.Builder.class);
   }

   public boolean hasValue() {
      return (this.bitField0_ & 1) != 0;
   }

   public double getValue() {
      return this.value_;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeDouble(1, this.value_);
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if ((this.bitField0_ & 1) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(1, this.value_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OptionalDouble)) {
         return super.equals(var1);
      } else {
         OptionalDouble var2 = (OptionalDouble)var1;
         if (this.hasValue() != var2.hasValue()) {
            return false;
         } else if (this.hasValue() && Double.doubleToLongBits(this.getValue()) != Double.doubleToLongBits(var2.getValue())) {
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
         if (this.hasValue()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getValue()));
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static OptionalDouble parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (OptionalDouble)PARSER.parseFrom(var0);
   }

   public static OptionalDouble parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (OptionalDouble)PARSER.parseFrom(var0, var1);
   }

   public static OptionalDouble parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (OptionalDouble)PARSER.parseFrom(var0);
   }

   public static OptionalDouble parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (OptionalDouble)PARSER.parseFrom(var0, var1);
   }

   public static OptionalDouble parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (OptionalDouble)PARSER.parseFrom(var0);
   }

   public static OptionalDouble parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (OptionalDouble)PARSER.parseFrom(var0, var1);
   }

   public static OptionalDouble parseFrom(InputStream var0) throws IOException {
      return (OptionalDouble)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OptionalDouble parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (OptionalDouble)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OptionalDouble parseDelimitedFrom(InputStream var0) throws IOException {
      return (OptionalDouble)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OptionalDouble parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (OptionalDouble)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OptionalDouble parseFrom(CodedInputStream var0) throws IOException {
      return (OptionalDouble)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OptionalDouble parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (OptionalDouble)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OptionalDouble.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OptionalDouble.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OptionalDouble.Builder newBuilder(OptionalDouble var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OptionalDouble.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OptionalDouble.Builder() : (new OptionalDouble.Builder()).mergeFrom(this);
   }

   protected OptionalDouble.Builder newBuilderForType(BuilderParent var1) {
      OptionalDouble.Builder var2 = new OptionalDouble.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static OptionalDouble getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public OptionalDouble getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   OptionalDouble(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   OptionalDouble(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements OptionalDoubleOrBuilder {
      private int bitField0_;
      private double value_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_OptionalDouble_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_OptionalDouble_fieldAccessorTable.ensureFieldAccessorsInitialized(OptionalDouble.class, OptionalDouble.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OptionalDouble.alwaysUseFieldBuilders) {
         }

      }

      public OptionalDouble.Builder clear() {
         super.clear();
         this.value_ = 0.0D;
         this.bitField0_ &= -2;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_OptionalDouble_descriptor;
      }

      public OptionalDouble getDefaultInstanceForType() {
         return OptionalDouble.getDefaultInstance();
      }

      public OptionalDouble build() {
         OptionalDouble var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OptionalDouble buildPartial() {
         OptionalDouble var1 = new OptionalDouble(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((var2 & 1) != 0) {
            var1.value_ = this.value_;
            var3 |= 1;
         }

         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public OptionalDouble.Builder clone() {
         return (OptionalDouble.Builder)super.clone();
      }

      public OptionalDouble.Builder setField(FieldDescriptor var1, Object var2) {
         return (OptionalDouble.Builder)super.setField(var1, var2);
      }

      public OptionalDouble.Builder clearField(FieldDescriptor var1) {
         return (OptionalDouble.Builder)super.clearField(var1);
      }

      public OptionalDouble.Builder clearOneof(OneofDescriptor var1) {
         return (OptionalDouble.Builder)super.clearOneof(var1);
      }

      public OptionalDouble.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (OptionalDouble.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OptionalDouble.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (OptionalDouble.Builder)super.addRepeatedField(var1, var2);
      }

      public OptionalDouble.Builder mergeFrom(Message var1) {
         if (var1 instanceof OptionalDouble) {
            return this.mergeFrom((OptionalDouble)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public OptionalDouble.Builder mergeFrom(OptionalDouble var1) {
         if (var1 == OptionalDouble.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasValue()) {
               this.setValue(var1.getValue());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public OptionalDouble.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         OptionalDouble var3 = null;

         try {
            var3 = (OptionalDouble)OptionalDouble.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (OptionalDouble)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public boolean hasValue() {
         return (this.bitField0_ & 1) != 0;
      }

      public double getValue() {
         return this.value_;
      }

      public OptionalDouble.Builder setValue(double var1) {
         this.bitField0_ |= 1;
         this.value_ = var1;
         this.onChanged();
         return this;
      }

      public OptionalDouble.Builder clearValue() {
         this.bitField0_ &= -2;
         this.value_ = 0.0D;
         this.onChanged();
         return this;
      }

      public final OptionalDouble.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OptionalDouble.Builder)super.setUnknownFields(var1);
      }

      public final OptionalDouble.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OptionalDouble.Builder)super.mergeUnknownFields(var1);
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
