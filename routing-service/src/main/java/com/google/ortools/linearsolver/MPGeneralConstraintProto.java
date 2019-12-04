package com.google.ortools.linearsolver;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.AbstractMessageLite.InternalOneOfEnum;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.Internal.EnumLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class MPGeneralConstraintProto extends GeneratedMessageV3 implements MPGeneralConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int generalConstraintCase_;
   private Object generalConstraint_;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_;
   public static final int INDICATOR_CONSTRAINT_FIELD_NUMBER = 2;
   public static final int SOS_CONSTRAINT_FIELD_NUMBER = 3;
   public static final int QUADRATIC_CONSTRAINT_FIELD_NUMBER = 4;
   public static final int ABS_CONSTRAINT_FIELD_NUMBER = 5;
   public static final int AND_CONSTRAINT_FIELD_NUMBER = 6;
   public static final int OR_CONSTRAINT_FIELD_NUMBER = 7;
   public static final int MIN_CONSTRAINT_FIELD_NUMBER = 8;
   public static final int MAX_CONSTRAINT_FIELD_NUMBER = 9;
   private byte memoizedIsInitialized;
   private static final MPGeneralConstraintProto DEFAULT_INSTANCE = new MPGeneralConstraintProto();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPGeneralConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPGeneralConstraintProto(var1, var2);
      }
   };

   private MPGeneralConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.generalConstraintCase_ = 0;
      this.memoizedIsInitialized = -1;
   }

   private MPGeneralConstraintProto() {
      this.generalConstraintCase_ = 0;
      this.memoizedIsInitialized = -1;
      this.name_ = "";
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPGeneralConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPGeneralConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
               MPArrayWithConstantConstraint.Builder var7;
               MPArrayConstraint.Builder var15;
               switch(var6) {
               case 0:
                  var5 = true;
                  break;
               case 10:
                  ByteString var20 = var1.readBytes();
                  this.bitField0_ |= 1;
                  this.name_ = var20;
                  break;
               case 18:
                  MPIndicatorConstraint.Builder var19 = null;
                  if (this.generalConstraintCase_ == 2) {
                     var19 = ((MPIndicatorConstraint)this.generalConstraint_).toBuilder();
                  }

                  this.generalConstraint_ = var1.readMessage(MPIndicatorConstraint.PARSER, var2);
                  if (var19 != null) {
                     var19.mergeFrom((MPIndicatorConstraint)this.generalConstraint_);
                     this.generalConstraint_ = var19.buildPartial();
                  }

                  this.generalConstraintCase_ = 2;
                  break;
               case 26:
                  MPSosConstraint.Builder var18 = null;
                  if (this.generalConstraintCase_ == 3) {
                     var18 = ((MPSosConstraint)this.generalConstraint_).toBuilder();
                  }

                  this.generalConstraint_ = var1.readMessage(MPSosConstraint.PARSER, var2);
                  if (var18 != null) {
                     var18.mergeFrom((MPSosConstraint)this.generalConstraint_);
                     this.generalConstraint_ = var18.buildPartial();
                  }

                  this.generalConstraintCase_ = 3;
                  break;
               case 34:
                  MPQuadraticConstraint.Builder var17 = null;
                  if (this.generalConstraintCase_ == 4) {
                     var17 = ((MPQuadraticConstraint)this.generalConstraint_).toBuilder();
                  }

                  this.generalConstraint_ = var1.readMessage(MPQuadraticConstraint.PARSER, var2);
                  if (var17 != null) {
                     var17.mergeFrom((MPQuadraticConstraint)this.generalConstraint_);
                     this.generalConstraint_ = var17.buildPartial();
                  }

                  this.generalConstraintCase_ = 4;
                  break;
               case 42:
                  MPAbsConstraint.Builder var16 = null;
                  if (this.generalConstraintCase_ == 5) {
                     var16 = ((MPAbsConstraint)this.generalConstraint_).toBuilder();
                  }

                  this.generalConstraint_ = var1.readMessage(MPAbsConstraint.PARSER, var2);
                  if (var16 != null) {
                     var16.mergeFrom((MPAbsConstraint)this.generalConstraint_);
                     this.generalConstraint_ = var16.buildPartial();
                  }

                  this.generalConstraintCase_ = 5;
                  break;
               case 50:
                  var15 = null;
                  if (this.generalConstraintCase_ == 6) {
                     var15 = ((MPArrayConstraint)this.generalConstraint_).toBuilder();
                  }

                  this.generalConstraint_ = var1.readMessage(MPArrayConstraint.PARSER, var2);
                  if (var15 != null) {
                     var15.mergeFrom((MPArrayConstraint)this.generalConstraint_);
                     this.generalConstraint_ = var15.buildPartial();
                  }

                  this.generalConstraintCase_ = 6;
                  break;
               case 58:
                  var15 = null;
                  if (this.generalConstraintCase_ == 7) {
                     var15 = ((MPArrayConstraint)this.generalConstraint_).toBuilder();
                  }

                  this.generalConstraint_ = var1.readMessage(MPArrayConstraint.PARSER, var2);
                  if (var15 != null) {
                     var15.mergeFrom((MPArrayConstraint)this.generalConstraint_);
                     this.generalConstraint_ = var15.buildPartial();
                  }

                  this.generalConstraintCase_ = 7;
                  break;
               case 66:
                  var7 = null;
                  if (this.generalConstraintCase_ == 8) {
                     var7 = ((MPArrayWithConstantConstraint)this.generalConstraint_).toBuilder();
                  }

                  this.generalConstraint_ = var1.readMessage(MPArrayWithConstantConstraint.PARSER, var2);
                  if (var7 != null) {
                     var7.mergeFrom((MPArrayWithConstantConstraint)this.generalConstraint_);
                     this.generalConstraint_ = var7.buildPartial();
                  }

                  this.generalConstraintCase_ = 8;
                  break;
               case 74:
                  var7 = null;
                  if (this.generalConstraintCase_ == 9) {
                     var7 = ((MPArrayWithConstantConstraint)this.generalConstraint_).toBuilder();
                  }

                  this.generalConstraint_ = var1.readMessage(MPArrayWithConstantConstraint.PARSER, var2);
                  if (var7 != null) {
                     var7.mergeFrom((MPArrayWithConstantConstraint)this.generalConstraint_);
                     this.generalConstraint_ = var7.buildPartial();
                  }

                  this.generalConstraintCase_ = 9;
                  break;
               default:
                  if (!this.parseUnknownField(var1, var4, var2, var6)) {
                     var5 = true;
                  }
               }
            }
         } catch (InvalidProtocolBufferException var12) {
            throw var12.setUnfinishedMessage(this);
         } catch (IOException var13) {
            throw (new InvalidProtocolBufferException(var13)).setUnfinishedMessage(this);
         } finally {
            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPGeneralConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPGeneralConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MPGeneralConstraintProto.class, MPGeneralConstraintProto.Builder.class);
   }

   public MPGeneralConstraintProto.GeneralConstraintCase getGeneralConstraintCase() {
      return MPGeneralConstraintProto.GeneralConstraintCase.forNumber(this.generalConstraintCase_);
   }

   public boolean hasName() {
      return (this.bitField0_ & 1) != 0;
   }

   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.name_ = var3;
         }

         return var3;
      }
   }

   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   public boolean hasIndicatorConstraint() {
      return this.generalConstraintCase_ == 2;
   }

   public MPIndicatorConstraint getIndicatorConstraint() {
      return this.generalConstraintCase_ == 2 ? (MPIndicatorConstraint)this.generalConstraint_ : MPIndicatorConstraint.getDefaultInstance();
   }

   public MPIndicatorConstraintOrBuilder getIndicatorConstraintOrBuilder() {
      return this.generalConstraintCase_ == 2 ? (MPIndicatorConstraint)this.generalConstraint_ : MPIndicatorConstraint.getDefaultInstance();
   }

   public boolean hasSosConstraint() {
      return this.generalConstraintCase_ == 3;
   }

   public MPSosConstraint getSosConstraint() {
      return this.generalConstraintCase_ == 3 ? (MPSosConstraint)this.generalConstraint_ : MPSosConstraint.getDefaultInstance();
   }

   public MPSosConstraintOrBuilder getSosConstraintOrBuilder() {
      return this.generalConstraintCase_ == 3 ? (MPSosConstraint)this.generalConstraint_ : MPSosConstraint.getDefaultInstance();
   }

   public boolean hasQuadraticConstraint() {
      return this.generalConstraintCase_ == 4;
   }

   public MPQuadraticConstraint getQuadraticConstraint() {
      return this.generalConstraintCase_ == 4 ? (MPQuadraticConstraint)this.generalConstraint_ : MPQuadraticConstraint.getDefaultInstance();
   }

   public MPQuadraticConstraintOrBuilder getQuadraticConstraintOrBuilder() {
      return this.generalConstraintCase_ == 4 ? (MPQuadraticConstraint)this.generalConstraint_ : MPQuadraticConstraint.getDefaultInstance();
   }

   public boolean hasAbsConstraint() {
      return this.generalConstraintCase_ == 5;
   }

   public MPAbsConstraint getAbsConstraint() {
      return this.generalConstraintCase_ == 5 ? (MPAbsConstraint)this.generalConstraint_ : MPAbsConstraint.getDefaultInstance();
   }

   public MPAbsConstraintOrBuilder getAbsConstraintOrBuilder() {
      return this.generalConstraintCase_ == 5 ? (MPAbsConstraint)this.generalConstraint_ : MPAbsConstraint.getDefaultInstance();
   }

   public boolean hasAndConstraint() {
      return this.generalConstraintCase_ == 6;
   }

   public MPArrayConstraint getAndConstraint() {
      return this.generalConstraintCase_ == 6 ? (MPArrayConstraint)this.generalConstraint_ : MPArrayConstraint.getDefaultInstance();
   }

   public MPArrayConstraintOrBuilder getAndConstraintOrBuilder() {
      return this.generalConstraintCase_ == 6 ? (MPArrayConstraint)this.generalConstraint_ : MPArrayConstraint.getDefaultInstance();
   }

   public boolean hasOrConstraint() {
      return this.generalConstraintCase_ == 7;
   }

   public MPArrayConstraint getOrConstraint() {
      return this.generalConstraintCase_ == 7 ? (MPArrayConstraint)this.generalConstraint_ : MPArrayConstraint.getDefaultInstance();
   }

   public MPArrayConstraintOrBuilder getOrConstraintOrBuilder() {
      return this.generalConstraintCase_ == 7 ? (MPArrayConstraint)this.generalConstraint_ : MPArrayConstraint.getDefaultInstance();
   }

   public boolean hasMinConstraint() {
      return this.generalConstraintCase_ == 8;
   }

   public MPArrayWithConstantConstraint getMinConstraint() {
      return this.generalConstraintCase_ == 8 ? (MPArrayWithConstantConstraint)this.generalConstraint_ : MPArrayWithConstantConstraint.getDefaultInstance();
   }

   public MPArrayWithConstantConstraintOrBuilder getMinConstraintOrBuilder() {
      return this.generalConstraintCase_ == 8 ? (MPArrayWithConstantConstraint)this.generalConstraint_ : MPArrayWithConstantConstraint.getDefaultInstance();
   }

   public boolean hasMaxConstraint() {
      return this.generalConstraintCase_ == 9;
   }

   public MPArrayWithConstantConstraint getMaxConstraint() {
      return this.generalConstraintCase_ == 9 ? (MPArrayWithConstantConstraint)this.generalConstraint_ : MPArrayWithConstantConstraint.getDefaultInstance();
   }

   public MPArrayWithConstantConstraintOrBuilder getMaxConstraintOrBuilder() {
      return this.generalConstraintCase_ == 9 ? (MPArrayWithConstantConstraint)this.generalConstraint_ : MPArrayWithConstantConstraint.getDefaultInstance();
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
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      if (this.generalConstraintCase_ == 2) {
         var1.writeMessage(2, (MPIndicatorConstraint)this.generalConstraint_);
      }

      if (this.generalConstraintCase_ == 3) {
         var1.writeMessage(3, (MPSosConstraint)this.generalConstraint_);
      }

      if (this.generalConstraintCase_ == 4) {
         var1.writeMessage(4, (MPQuadraticConstraint)this.generalConstraint_);
      }

      if (this.generalConstraintCase_ == 5) {
         var1.writeMessage(5, (MPAbsConstraint)this.generalConstraint_);
      }

      if (this.generalConstraintCase_ == 6) {
         var1.writeMessage(6, (MPArrayConstraint)this.generalConstraint_);
      }

      if (this.generalConstraintCase_ == 7) {
         var1.writeMessage(7, (MPArrayConstraint)this.generalConstraint_);
      }

      if (this.generalConstraintCase_ == 8) {
         var1.writeMessage(8, (MPArrayWithConstantConstraint)this.generalConstraint_);
      }

      if (this.generalConstraintCase_ == 9) {
         var1.writeMessage(9, (MPArrayWithConstantConstraint)this.generalConstraint_);
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
            var1 += GeneratedMessageV3.computeStringSize(1, this.name_);
         }

         if (this.generalConstraintCase_ == 2) {
            var1 += CodedOutputStream.computeMessageSize(2, (MPIndicatorConstraint)this.generalConstraint_);
         }

         if (this.generalConstraintCase_ == 3) {
            var1 += CodedOutputStream.computeMessageSize(3, (MPSosConstraint)this.generalConstraint_);
         }

         if (this.generalConstraintCase_ == 4) {
            var1 += CodedOutputStream.computeMessageSize(4, (MPQuadraticConstraint)this.generalConstraint_);
         }

         if (this.generalConstraintCase_ == 5) {
            var1 += CodedOutputStream.computeMessageSize(5, (MPAbsConstraint)this.generalConstraint_);
         }

         if (this.generalConstraintCase_ == 6) {
            var1 += CodedOutputStream.computeMessageSize(6, (MPArrayConstraint)this.generalConstraint_);
         }

         if (this.generalConstraintCase_ == 7) {
            var1 += CodedOutputStream.computeMessageSize(7, (MPArrayConstraint)this.generalConstraint_);
         }

         if (this.generalConstraintCase_ == 8) {
            var1 += CodedOutputStream.computeMessageSize(8, (MPArrayWithConstantConstraint)this.generalConstraint_);
         }

         if (this.generalConstraintCase_ == 9) {
            var1 += CodedOutputStream.computeMessageSize(9, (MPArrayWithConstantConstraint)this.generalConstraint_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPGeneralConstraintProto)) {
         return super.equals(var1);
      } else {
         MPGeneralConstraintProto var2 = (MPGeneralConstraintProto)var1;
         if (this.hasName() != var2.hasName()) {
            return false;
         } else if (this.hasName() && !this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getGeneralConstraintCase().equals(var2.getGeneralConstraintCase())) {
            return false;
         } else {
            switch(this.generalConstraintCase_) {
            case 0:
            case 1:
            default:
               break;
            case 2:
               if (!this.getIndicatorConstraint().equals(var2.getIndicatorConstraint())) {
                  return false;
               }
               break;
            case 3:
               if (!this.getSosConstraint().equals(var2.getSosConstraint())) {
                  return false;
               }
               break;
            case 4:
               if (!this.getQuadraticConstraint().equals(var2.getQuadraticConstraint())) {
                  return false;
               }
               break;
            case 5:
               if (!this.getAbsConstraint().equals(var2.getAbsConstraint())) {
                  return false;
               }
               break;
            case 6:
               if (!this.getAndConstraint().equals(var2.getAndConstraint())) {
                  return false;
               }
               break;
            case 7:
               if (!this.getOrConstraint().equals(var2.getOrConstraint())) {
                  return false;
               }
               break;
            case 8:
               if (!this.getMinConstraint().equals(var2.getMinConstraint())) {
                  return false;
               }
               break;
            case 9:
               if (!this.getMaxConstraint().equals(var2.getMaxConstraint())) {
                  return false;
               }
            }

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
         if (this.hasName()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getName().hashCode();
         }

         switch(this.generalConstraintCase_) {
         case 0:
         case 1:
         default:
            break;
         case 2:
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getIndicatorConstraint().hashCode();
            break;
         case 3:
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getSosConstraint().hashCode();
            break;
         case 4:
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getQuadraticConstraint().hashCode();
            break;
         case 5:
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.getAbsConstraint().hashCode();
            break;
         case 6:
            var2 = 37 * var2 + 6;
            var2 = 53 * var2 + this.getAndConstraint().hashCode();
            break;
         case 7:
            var2 = 37 * var2 + 7;
            var2 = 53 * var2 + this.getOrConstraint().hashCode();
            break;
         case 8:
            var2 = 37 * var2 + 8;
            var2 = 53 * var2 + this.getMinConstraint().hashCode();
            break;
         case 9:
            var2 = 37 * var2 + 9;
            var2 = 53 * var2 + this.getMaxConstraint().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPGeneralConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPGeneralConstraintProto)PARSER.parseFrom(var0);
   }

   public static MPGeneralConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPGeneralConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static MPGeneralConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPGeneralConstraintProto)PARSER.parseFrom(var0);
   }

   public static MPGeneralConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPGeneralConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static MPGeneralConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPGeneralConstraintProto)PARSER.parseFrom(var0);
   }

   public static MPGeneralConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPGeneralConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static MPGeneralConstraintProto parseFrom(InputStream var0) throws IOException {
      return (MPGeneralConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPGeneralConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPGeneralConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPGeneralConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPGeneralConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPGeneralConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPGeneralConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPGeneralConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (MPGeneralConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPGeneralConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPGeneralConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPGeneralConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPGeneralConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPGeneralConstraintProto.Builder newBuilder(MPGeneralConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPGeneralConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPGeneralConstraintProto.Builder() : (new MPGeneralConstraintProto.Builder()).mergeFrom(this);
   }

   protected MPGeneralConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      MPGeneralConstraintProto.Builder var2 = new MPGeneralConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPGeneralConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPGeneralConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPGeneralConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPGeneralConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPGeneralConstraintProtoOrBuilder {
      private int generalConstraintCase_;
      private Object generalConstraint_;
      private int bitField0_;
      private Object name_;
      private SingleFieldBuilderV3 indicatorConstraintBuilder_;
      private SingleFieldBuilderV3 sosConstraintBuilder_;
      private SingleFieldBuilderV3 quadraticConstraintBuilder_;
      private SingleFieldBuilderV3 absConstraintBuilder_;
      private SingleFieldBuilderV3 andConstraintBuilder_;
      private SingleFieldBuilderV3 orConstraintBuilder_;
      private SingleFieldBuilderV3 minConstraintBuilder_;
      private SingleFieldBuilderV3 maxConstraintBuilder_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPGeneralConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPGeneralConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MPGeneralConstraintProto.class, MPGeneralConstraintProto.Builder.class);
      }

      private Builder() {
         this.generalConstraintCase_ = 0;
         this.name_ = "";
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.generalConstraintCase_ = 0;
         this.name_ = "";
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPGeneralConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public MPGeneralConstraintProto.Builder clear() {
         super.clear();
         this.name_ = "";
         this.bitField0_ &= -2;
         this.generalConstraintCase_ = 0;
         this.generalConstraint_ = null;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPGeneralConstraintProto_descriptor;
      }

      public MPGeneralConstraintProto getDefaultInstanceForType() {
         return MPGeneralConstraintProto.getDefaultInstance();
      }

      public MPGeneralConstraintProto build() {
         MPGeneralConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPGeneralConstraintProto buildPartial() {
         MPGeneralConstraintProto var1 = new MPGeneralConstraintProto(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((var2 & 1) != 0) {
            var3 |= 1;
         }

         var1.name_ = this.name_;
         if (this.generalConstraintCase_ == 2) {
            if (this.indicatorConstraintBuilder_ == null) {
               var1.generalConstraint_ = this.generalConstraint_;
            } else {
               var1.generalConstraint_ = this.indicatorConstraintBuilder_.build();
            }
         }

         if (this.generalConstraintCase_ == 3) {
            if (this.sosConstraintBuilder_ == null) {
               var1.generalConstraint_ = this.generalConstraint_;
            } else {
               var1.generalConstraint_ = this.sosConstraintBuilder_.build();
            }
         }

         if (this.generalConstraintCase_ == 4) {
            if (this.quadraticConstraintBuilder_ == null) {
               var1.generalConstraint_ = this.generalConstraint_;
            } else {
               var1.generalConstraint_ = this.quadraticConstraintBuilder_.build();
            }
         }

         if (this.generalConstraintCase_ == 5) {
            if (this.absConstraintBuilder_ == null) {
               var1.generalConstraint_ = this.generalConstraint_;
            } else {
               var1.generalConstraint_ = this.absConstraintBuilder_.build();
            }
         }

         if (this.generalConstraintCase_ == 6) {
            if (this.andConstraintBuilder_ == null) {
               var1.generalConstraint_ = this.generalConstraint_;
            } else {
               var1.generalConstraint_ = this.andConstraintBuilder_.build();
            }
         }

         if (this.generalConstraintCase_ == 7) {
            if (this.orConstraintBuilder_ == null) {
               var1.generalConstraint_ = this.generalConstraint_;
            } else {
               var1.generalConstraint_ = this.orConstraintBuilder_.build();
            }
         }

         if (this.generalConstraintCase_ == 8) {
            if (this.minConstraintBuilder_ == null) {
               var1.generalConstraint_ = this.generalConstraint_;
            } else {
               var1.generalConstraint_ = this.minConstraintBuilder_.build();
            }
         }

         if (this.generalConstraintCase_ == 9) {
            if (this.maxConstraintBuilder_ == null) {
               var1.generalConstraint_ = this.generalConstraint_;
            } else {
               var1.generalConstraint_ = this.maxConstraintBuilder_.build();
            }
         }

         var1.bitField0_ = var3;
         var1.generalConstraintCase_ = this.generalConstraintCase_;
         this.onBuilt();
         return var1;
      }

      public MPGeneralConstraintProto.Builder clone() {
         return (MPGeneralConstraintProto.Builder)super.clone();
      }

      public MPGeneralConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPGeneralConstraintProto.Builder)super.setField(var1, var2);
      }

      public MPGeneralConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (MPGeneralConstraintProto.Builder)super.clearField(var1);
      }

      public MPGeneralConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (MPGeneralConstraintProto.Builder)super.clearOneof(var1);
      }

      public MPGeneralConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPGeneralConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPGeneralConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPGeneralConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public MPGeneralConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPGeneralConstraintProto) {
            return this.mergeFrom((MPGeneralConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPGeneralConstraintProto.Builder mergeFrom(MPGeneralConstraintProto var1) {
         if (var1 == MPGeneralConstraintProto.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasName()) {
               this.bitField0_ |= 1;
               this.name_ = var1.name_;
               this.onChanged();
            }

            switch(var1.getGeneralConstraintCase()) {
            case INDICATOR_CONSTRAINT:
               this.mergeIndicatorConstraint(var1.getIndicatorConstraint());
               break;
            case SOS_CONSTRAINT:
               this.mergeSosConstraint(var1.getSosConstraint());
               break;
            case QUADRATIC_CONSTRAINT:
               this.mergeQuadraticConstraint(var1.getQuadraticConstraint());
               break;
            case ABS_CONSTRAINT:
               this.mergeAbsConstraint(var1.getAbsConstraint());
               break;
            case AND_CONSTRAINT:
               this.mergeAndConstraint(var1.getAndConstraint());
               break;
            case OR_CONSTRAINT:
               this.mergeOrConstraint(var1.getOrConstraint());
               break;
            case MIN_CONSTRAINT:
               this.mergeMinConstraint(var1.getMinConstraint());
               break;
            case MAX_CONSTRAINT:
               this.mergeMaxConstraint(var1.getMaxConstraint());
            case GENERALCONSTRAINT_NOT_SET:
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public MPGeneralConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPGeneralConstraintProto var3 = null;

         try {
            var3 = (MPGeneralConstraintProto)MPGeneralConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPGeneralConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public MPGeneralConstraintProto.GeneralConstraintCase getGeneralConstraintCase() {
         return MPGeneralConstraintProto.GeneralConstraintCase.forNumber(this.generalConstraintCase_);
      }

      public MPGeneralConstraintProto.Builder clearGeneralConstraint() {
         this.generalConstraintCase_ = 0;
         this.generalConstraint_ = null;
         this.onChanged();
         return this;
      }

      public boolean hasName() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (var2.isValidUtf8()) {
               this.name_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public MPGeneralConstraintProto.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 1;
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      public MPGeneralConstraintProto.Builder clearName() {
         this.bitField0_ &= -2;
         this.name_ = MPGeneralConstraintProto.getDefaultInstance().getName();
         this.onChanged();
         return this;
      }

      public MPGeneralConstraintProto.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 1;
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      public boolean hasIndicatorConstraint() {
         return this.generalConstraintCase_ == 2;
      }

      public MPIndicatorConstraint getIndicatorConstraint() {
         if (this.indicatorConstraintBuilder_ == null) {
            return this.generalConstraintCase_ == 2 ? (MPIndicatorConstraint)this.generalConstraint_ : MPIndicatorConstraint.getDefaultInstance();
         } else {
            return this.generalConstraintCase_ == 2 ? (MPIndicatorConstraint)this.indicatorConstraintBuilder_.getMessage() : MPIndicatorConstraint.getDefaultInstance();
         }
      }

      public MPGeneralConstraintProto.Builder setIndicatorConstraint(MPIndicatorConstraint var1) {
         if (this.indicatorConstraintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.generalConstraint_ = var1;
            this.onChanged();
         } else {
            this.indicatorConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 2;
         return this;
      }

      public MPGeneralConstraintProto.Builder setIndicatorConstraint(MPIndicatorConstraint.Builder var1) {
         if (this.indicatorConstraintBuilder_ == null) {
            this.generalConstraint_ = var1.build();
            this.onChanged();
         } else {
            this.indicatorConstraintBuilder_.setMessage(var1.build());
         }

         this.generalConstraintCase_ = 2;
         return this;
      }

      public MPGeneralConstraintProto.Builder mergeIndicatorConstraint(MPIndicatorConstraint var1) {
         if (this.indicatorConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 2 && this.generalConstraint_ != MPIndicatorConstraint.getDefaultInstance()) {
               this.generalConstraint_ = MPIndicatorConstraint.newBuilder((MPIndicatorConstraint)this.generalConstraint_).mergeFrom(var1).buildPartial();
            } else {
               this.generalConstraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.generalConstraintCase_ == 2) {
               this.indicatorConstraintBuilder_.mergeFrom(var1);
            }

            this.indicatorConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 2;
         return this;
      }

      public MPGeneralConstraintProto.Builder clearIndicatorConstraint() {
         if (this.indicatorConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 2) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.generalConstraintCase_ == 2) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
            }

            this.indicatorConstraintBuilder_.clear();
         }

         return this;
      }

      public MPIndicatorConstraint.Builder getIndicatorConstraintBuilder() {
         return (MPIndicatorConstraint.Builder)this.getIndicatorConstraintFieldBuilder().getBuilder();
      }

      public MPIndicatorConstraintOrBuilder getIndicatorConstraintOrBuilder() {
         if (this.generalConstraintCase_ == 2 && this.indicatorConstraintBuilder_ != null) {
            return (MPIndicatorConstraintOrBuilder)this.indicatorConstraintBuilder_.getMessageOrBuilder();
         } else {
            return this.generalConstraintCase_ == 2 ? (MPIndicatorConstraint)this.generalConstraint_ : MPIndicatorConstraint.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getIndicatorConstraintFieldBuilder() {
         if (this.indicatorConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ != 2) {
               this.generalConstraint_ = MPIndicatorConstraint.getDefaultInstance();
            }

            this.indicatorConstraintBuilder_ = new SingleFieldBuilderV3((MPIndicatorConstraint)this.generalConstraint_, this.getParentForChildren(), this.isClean());
            this.generalConstraint_ = null;
         }

         this.generalConstraintCase_ = 2;
         this.onChanged();
         return this.indicatorConstraintBuilder_;
      }

      public boolean hasSosConstraint() {
         return this.generalConstraintCase_ == 3;
      }

      public MPSosConstraint getSosConstraint() {
         if (this.sosConstraintBuilder_ == null) {
            return this.generalConstraintCase_ == 3 ? (MPSosConstraint)this.generalConstraint_ : MPSosConstraint.getDefaultInstance();
         } else {
            return this.generalConstraintCase_ == 3 ? (MPSosConstraint)this.sosConstraintBuilder_.getMessage() : MPSosConstraint.getDefaultInstance();
         }
      }

      public MPGeneralConstraintProto.Builder setSosConstraint(MPSosConstraint var1) {
         if (this.sosConstraintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.generalConstraint_ = var1;
            this.onChanged();
         } else {
            this.sosConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 3;
         return this;
      }

      public MPGeneralConstraintProto.Builder setSosConstraint(MPSosConstraint.Builder var1) {
         if (this.sosConstraintBuilder_ == null) {
            this.generalConstraint_ = var1.build();
            this.onChanged();
         } else {
            this.sosConstraintBuilder_.setMessage(var1.build());
         }

         this.generalConstraintCase_ = 3;
         return this;
      }

      public MPGeneralConstraintProto.Builder mergeSosConstraint(MPSosConstraint var1) {
         if (this.sosConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 3 && this.generalConstraint_ != MPSosConstraint.getDefaultInstance()) {
               this.generalConstraint_ = MPSosConstraint.newBuilder((MPSosConstraint)this.generalConstraint_).mergeFrom(var1).buildPartial();
            } else {
               this.generalConstraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.generalConstraintCase_ == 3) {
               this.sosConstraintBuilder_.mergeFrom(var1);
            }

            this.sosConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 3;
         return this;
      }

      public MPGeneralConstraintProto.Builder clearSosConstraint() {
         if (this.sosConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 3) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.generalConstraintCase_ == 3) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
            }

            this.sosConstraintBuilder_.clear();
         }

         return this;
      }

      public MPSosConstraint.Builder getSosConstraintBuilder() {
         return (MPSosConstraint.Builder)this.getSosConstraintFieldBuilder().getBuilder();
      }

      public MPSosConstraintOrBuilder getSosConstraintOrBuilder() {
         if (this.generalConstraintCase_ == 3 && this.sosConstraintBuilder_ != null) {
            return (MPSosConstraintOrBuilder)this.sosConstraintBuilder_.getMessageOrBuilder();
         } else {
            return this.generalConstraintCase_ == 3 ? (MPSosConstraint)this.generalConstraint_ : MPSosConstraint.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getSosConstraintFieldBuilder() {
         if (this.sosConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ != 3) {
               this.generalConstraint_ = MPSosConstraint.getDefaultInstance();
            }

            this.sosConstraintBuilder_ = new SingleFieldBuilderV3((MPSosConstraint)this.generalConstraint_, this.getParentForChildren(), this.isClean());
            this.generalConstraint_ = null;
         }

         this.generalConstraintCase_ = 3;
         this.onChanged();
         return this.sosConstraintBuilder_;
      }

      public boolean hasQuadraticConstraint() {
         return this.generalConstraintCase_ == 4;
      }

      public MPQuadraticConstraint getQuadraticConstraint() {
         if (this.quadraticConstraintBuilder_ == null) {
            return this.generalConstraintCase_ == 4 ? (MPQuadraticConstraint)this.generalConstraint_ : MPQuadraticConstraint.getDefaultInstance();
         } else {
            return this.generalConstraintCase_ == 4 ? (MPQuadraticConstraint)this.quadraticConstraintBuilder_.getMessage() : MPQuadraticConstraint.getDefaultInstance();
         }
      }

      public MPGeneralConstraintProto.Builder setQuadraticConstraint(MPQuadraticConstraint var1) {
         if (this.quadraticConstraintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.generalConstraint_ = var1;
            this.onChanged();
         } else {
            this.quadraticConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 4;
         return this;
      }

      public MPGeneralConstraintProto.Builder setQuadraticConstraint(MPQuadraticConstraint.Builder var1) {
         if (this.quadraticConstraintBuilder_ == null) {
            this.generalConstraint_ = var1.build();
            this.onChanged();
         } else {
            this.quadraticConstraintBuilder_.setMessage(var1.build());
         }

         this.generalConstraintCase_ = 4;
         return this;
      }

      public MPGeneralConstraintProto.Builder mergeQuadraticConstraint(MPQuadraticConstraint var1) {
         if (this.quadraticConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 4 && this.generalConstraint_ != MPQuadraticConstraint.getDefaultInstance()) {
               this.generalConstraint_ = MPQuadraticConstraint.newBuilder((MPQuadraticConstraint)this.generalConstraint_).mergeFrom(var1).buildPartial();
            } else {
               this.generalConstraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.generalConstraintCase_ == 4) {
               this.quadraticConstraintBuilder_.mergeFrom(var1);
            }

            this.quadraticConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 4;
         return this;
      }

      public MPGeneralConstraintProto.Builder clearQuadraticConstraint() {
         if (this.quadraticConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 4) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.generalConstraintCase_ == 4) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
            }

            this.quadraticConstraintBuilder_.clear();
         }

         return this;
      }

      public MPQuadraticConstraint.Builder getQuadraticConstraintBuilder() {
         return (MPQuadraticConstraint.Builder)this.getQuadraticConstraintFieldBuilder().getBuilder();
      }

      public MPQuadraticConstraintOrBuilder getQuadraticConstraintOrBuilder() {
         if (this.generalConstraintCase_ == 4 && this.quadraticConstraintBuilder_ != null) {
            return (MPQuadraticConstraintOrBuilder)this.quadraticConstraintBuilder_.getMessageOrBuilder();
         } else {
            return this.generalConstraintCase_ == 4 ? (MPQuadraticConstraint)this.generalConstraint_ : MPQuadraticConstraint.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getQuadraticConstraintFieldBuilder() {
         if (this.quadraticConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ != 4) {
               this.generalConstraint_ = MPQuadraticConstraint.getDefaultInstance();
            }

            this.quadraticConstraintBuilder_ = new SingleFieldBuilderV3((MPQuadraticConstraint)this.generalConstraint_, this.getParentForChildren(), this.isClean());
            this.generalConstraint_ = null;
         }

         this.generalConstraintCase_ = 4;
         this.onChanged();
         return this.quadraticConstraintBuilder_;
      }

      public boolean hasAbsConstraint() {
         return this.generalConstraintCase_ == 5;
      }

      public MPAbsConstraint getAbsConstraint() {
         if (this.absConstraintBuilder_ == null) {
            return this.generalConstraintCase_ == 5 ? (MPAbsConstraint)this.generalConstraint_ : MPAbsConstraint.getDefaultInstance();
         } else {
            return this.generalConstraintCase_ == 5 ? (MPAbsConstraint)this.absConstraintBuilder_.getMessage() : MPAbsConstraint.getDefaultInstance();
         }
      }

      public MPGeneralConstraintProto.Builder setAbsConstraint(MPAbsConstraint var1) {
         if (this.absConstraintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.generalConstraint_ = var1;
            this.onChanged();
         } else {
            this.absConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 5;
         return this;
      }

      public MPGeneralConstraintProto.Builder setAbsConstraint(MPAbsConstraint.Builder var1) {
         if (this.absConstraintBuilder_ == null) {
            this.generalConstraint_ = var1.build();
            this.onChanged();
         } else {
            this.absConstraintBuilder_.setMessage(var1.build());
         }

         this.generalConstraintCase_ = 5;
         return this;
      }

      public MPGeneralConstraintProto.Builder mergeAbsConstraint(MPAbsConstraint var1) {
         if (this.absConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 5 && this.generalConstraint_ != MPAbsConstraint.getDefaultInstance()) {
               this.generalConstraint_ = MPAbsConstraint.newBuilder((MPAbsConstraint)this.generalConstraint_).mergeFrom(var1).buildPartial();
            } else {
               this.generalConstraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.generalConstraintCase_ == 5) {
               this.absConstraintBuilder_.mergeFrom(var1);
            }

            this.absConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 5;
         return this;
      }

      public MPGeneralConstraintProto.Builder clearAbsConstraint() {
         if (this.absConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 5) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.generalConstraintCase_ == 5) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
            }

            this.absConstraintBuilder_.clear();
         }

         return this;
      }

      public MPAbsConstraint.Builder getAbsConstraintBuilder() {
         return (MPAbsConstraint.Builder)this.getAbsConstraintFieldBuilder().getBuilder();
      }

      public MPAbsConstraintOrBuilder getAbsConstraintOrBuilder() {
         if (this.generalConstraintCase_ == 5 && this.absConstraintBuilder_ != null) {
            return (MPAbsConstraintOrBuilder)this.absConstraintBuilder_.getMessageOrBuilder();
         } else {
            return this.generalConstraintCase_ == 5 ? (MPAbsConstraint)this.generalConstraint_ : MPAbsConstraint.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getAbsConstraintFieldBuilder() {
         if (this.absConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ != 5) {
               this.generalConstraint_ = MPAbsConstraint.getDefaultInstance();
            }

            this.absConstraintBuilder_ = new SingleFieldBuilderV3((MPAbsConstraint)this.generalConstraint_, this.getParentForChildren(), this.isClean());
            this.generalConstraint_ = null;
         }

         this.generalConstraintCase_ = 5;
         this.onChanged();
         return this.absConstraintBuilder_;
      }

      public boolean hasAndConstraint() {
         return this.generalConstraintCase_ == 6;
      }

      public MPArrayConstraint getAndConstraint() {
         if (this.andConstraintBuilder_ == null) {
            return this.generalConstraintCase_ == 6 ? (MPArrayConstraint)this.generalConstraint_ : MPArrayConstraint.getDefaultInstance();
         } else {
            return this.generalConstraintCase_ == 6 ? (MPArrayConstraint)this.andConstraintBuilder_.getMessage() : MPArrayConstraint.getDefaultInstance();
         }
      }

      public MPGeneralConstraintProto.Builder setAndConstraint(MPArrayConstraint var1) {
         if (this.andConstraintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.generalConstraint_ = var1;
            this.onChanged();
         } else {
            this.andConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 6;
         return this;
      }

      public MPGeneralConstraintProto.Builder setAndConstraint(MPArrayConstraint.Builder var1) {
         if (this.andConstraintBuilder_ == null) {
            this.generalConstraint_ = var1.build();
            this.onChanged();
         } else {
            this.andConstraintBuilder_.setMessage(var1.build());
         }

         this.generalConstraintCase_ = 6;
         return this;
      }

      public MPGeneralConstraintProto.Builder mergeAndConstraint(MPArrayConstraint var1) {
         if (this.andConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 6 && this.generalConstraint_ != MPArrayConstraint.getDefaultInstance()) {
               this.generalConstraint_ = MPArrayConstraint.newBuilder((MPArrayConstraint)this.generalConstraint_).mergeFrom(var1).buildPartial();
            } else {
               this.generalConstraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.generalConstraintCase_ == 6) {
               this.andConstraintBuilder_.mergeFrom(var1);
            }

            this.andConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 6;
         return this;
      }

      public MPGeneralConstraintProto.Builder clearAndConstraint() {
         if (this.andConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 6) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.generalConstraintCase_ == 6) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
            }

            this.andConstraintBuilder_.clear();
         }

         return this;
      }

      public MPArrayConstraint.Builder getAndConstraintBuilder() {
         return (MPArrayConstraint.Builder)this.getAndConstraintFieldBuilder().getBuilder();
      }

      public MPArrayConstraintOrBuilder getAndConstraintOrBuilder() {
         if (this.generalConstraintCase_ == 6 && this.andConstraintBuilder_ != null) {
            return (MPArrayConstraintOrBuilder)this.andConstraintBuilder_.getMessageOrBuilder();
         } else {
            return this.generalConstraintCase_ == 6 ? (MPArrayConstraint)this.generalConstraint_ : MPArrayConstraint.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getAndConstraintFieldBuilder() {
         if (this.andConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ != 6) {
               this.generalConstraint_ = MPArrayConstraint.getDefaultInstance();
            }

            this.andConstraintBuilder_ = new SingleFieldBuilderV3((MPArrayConstraint)this.generalConstraint_, this.getParentForChildren(), this.isClean());
            this.generalConstraint_ = null;
         }

         this.generalConstraintCase_ = 6;
         this.onChanged();
         return this.andConstraintBuilder_;
      }

      public boolean hasOrConstraint() {
         return this.generalConstraintCase_ == 7;
      }

      public MPArrayConstraint getOrConstraint() {
         if (this.orConstraintBuilder_ == null) {
            return this.generalConstraintCase_ == 7 ? (MPArrayConstraint)this.generalConstraint_ : MPArrayConstraint.getDefaultInstance();
         } else {
            return this.generalConstraintCase_ == 7 ? (MPArrayConstraint)this.orConstraintBuilder_.getMessage() : MPArrayConstraint.getDefaultInstance();
         }
      }

      public MPGeneralConstraintProto.Builder setOrConstraint(MPArrayConstraint var1) {
         if (this.orConstraintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.generalConstraint_ = var1;
            this.onChanged();
         } else {
            this.orConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 7;
         return this;
      }

      public MPGeneralConstraintProto.Builder setOrConstraint(MPArrayConstraint.Builder var1) {
         if (this.orConstraintBuilder_ == null) {
            this.generalConstraint_ = var1.build();
            this.onChanged();
         } else {
            this.orConstraintBuilder_.setMessage(var1.build());
         }

         this.generalConstraintCase_ = 7;
         return this;
      }

      public MPGeneralConstraintProto.Builder mergeOrConstraint(MPArrayConstraint var1) {
         if (this.orConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 7 && this.generalConstraint_ != MPArrayConstraint.getDefaultInstance()) {
               this.generalConstraint_ = MPArrayConstraint.newBuilder((MPArrayConstraint)this.generalConstraint_).mergeFrom(var1).buildPartial();
            } else {
               this.generalConstraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.generalConstraintCase_ == 7) {
               this.orConstraintBuilder_.mergeFrom(var1);
            }

            this.orConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 7;
         return this;
      }

      public MPGeneralConstraintProto.Builder clearOrConstraint() {
         if (this.orConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 7) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.generalConstraintCase_ == 7) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
            }

            this.orConstraintBuilder_.clear();
         }

         return this;
      }

      public MPArrayConstraint.Builder getOrConstraintBuilder() {
         return (MPArrayConstraint.Builder)this.getOrConstraintFieldBuilder().getBuilder();
      }

      public MPArrayConstraintOrBuilder getOrConstraintOrBuilder() {
         if (this.generalConstraintCase_ == 7 && this.orConstraintBuilder_ != null) {
            return (MPArrayConstraintOrBuilder)this.orConstraintBuilder_.getMessageOrBuilder();
         } else {
            return this.generalConstraintCase_ == 7 ? (MPArrayConstraint)this.generalConstraint_ : MPArrayConstraint.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getOrConstraintFieldBuilder() {
         if (this.orConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ != 7) {
               this.generalConstraint_ = MPArrayConstraint.getDefaultInstance();
            }

            this.orConstraintBuilder_ = new SingleFieldBuilderV3((MPArrayConstraint)this.generalConstraint_, this.getParentForChildren(), this.isClean());
            this.generalConstraint_ = null;
         }

         this.generalConstraintCase_ = 7;
         this.onChanged();
         return this.orConstraintBuilder_;
      }

      public boolean hasMinConstraint() {
         return this.generalConstraintCase_ == 8;
      }

      public MPArrayWithConstantConstraint getMinConstraint() {
         if (this.minConstraintBuilder_ == null) {
            return this.generalConstraintCase_ == 8 ? (MPArrayWithConstantConstraint)this.generalConstraint_ : MPArrayWithConstantConstraint.getDefaultInstance();
         } else {
            return this.generalConstraintCase_ == 8 ? (MPArrayWithConstantConstraint)this.minConstraintBuilder_.getMessage() : MPArrayWithConstantConstraint.getDefaultInstance();
         }
      }

      public MPGeneralConstraintProto.Builder setMinConstraint(MPArrayWithConstantConstraint var1) {
         if (this.minConstraintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.generalConstraint_ = var1;
            this.onChanged();
         } else {
            this.minConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 8;
         return this;
      }

      public MPGeneralConstraintProto.Builder setMinConstraint(MPArrayWithConstantConstraint.Builder var1) {
         if (this.minConstraintBuilder_ == null) {
            this.generalConstraint_ = var1.build();
            this.onChanged();
         } else {
            this.minConstraintBuilder_.setMessage(var1.build());
         }

         this.generalConstraintCase_ = 8;
         return this;
      }

      public MPGeneralConstraintProto.Builder mergeMinConstraint(MPArrayWithConstantConstraint var1) {
         if (this.minConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 8 && this.generalConstraint_ != MPArrayWithConstantConstraint.getDefaultInstance()) {
               this.generalConstraint_ = MPArrayWithConstantConstraint.newBuilder((MPArrayWithConstantConstraint)this.generalConstraint_).mergeFrom(var1).buildPartial();
            } else {
               this.generalConstraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.generalConstraintCase_ == 8) {
               this.minConstraintBuilder_.mergeFrom(var1);
            }

            this.minConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 8;
         return this;
      }

      public MPGeneralConstraintProto.Builder clearMinConstraint() {
         if (this.minConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 8) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.generalConstraintCase_ == 8) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
            }

            this.minConstraintBuilder_.clear();
         }

         return this;
      }

      public MPArrayWithConstantConstraint.Builder getMinConstraintBuilder() {
         return (MPArrayWithConstantConstraint.Builder)this.getMinConstraintFieldBuilder().getBuilder();
      }

      public MPArrayWithConstantConstraintOrBuilder getMinConstraintOrBuilder() {
         if (this.generalConstraintCase_ == 8 && this.minConstraintBuilder_ != null) {
            return (MPArrayWithConstantConstraintOrBuilder)this.minConstraintBuilder_.getMessageOrBuilder();
         } else {
            return this.generalConstraintCase_ == 8 ? (MPArrayWithConstantConstraint)this.generalConstraint_ : MPArrayWithConstantConstraint.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getMinConstraintFieldBuilder() {
         if (this.minConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ != 8) {
               this.generalConstraint_ = MPArrayWithConstantConstraint.getDefaultInstance();
            }

            this.minConstraintBuilder_ = new SingleFieldBuilderV3((MPArrayWithConstantConstraint)this.generalConstraint_, this.getParentForChildren(), this.isClean());
            this.generalConstraint_ = null;
         }

         this.generalConstraintCase_ = 8;
         this.onChanged();
         return this.minConstraintBuilder_;
      }

      public boolean hasMaxConstraint() {
         return this.generalConstraintCase_ == 9;
      }

      public MPArrayWithConstantConstraint getMaxConstraint() {
         if (this.maxConstraintBuilder_ == null) {
            return this.generalConstraintCase_ == 9 ? (MPArrayWithConstantConstraint)this.generalConstraint_ : MPArrayWithConstantConstraint.getDefaultInstance();
         } else {
            return this.generalConstraintCase_ == 9 ? (MPArrayWithConstantConstraint)this.maxConstraintBuilder_.getMessage() : MPArrayWithConstantConstraint.getDefaultInstance();
         }
      }

      public MPGeneralConstraintProto.Builder setMaxConstraint(MPArrayWithConstantConstraint var1) {
         if (this.maxConstraintBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.generalConstraint_ = var1;
            this.onChanged();
         } else {
            this.maxConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 9;
         return this;
      }

      public MPGeneralConstraintProto.Builder setMaxConstraint(MPArrayWithConstantConstraint.Builder var1) {
         if (this.maxConstraintBuilder_ == null) {
            this.generalConstraint_ = var1.build();
            this.onChanged();
         } else {
            this.maxConstraintBuilder_.setMessage(var1.build());
         }

         this.generalConstraintCase_ = 9;
         return this;
      }

      public MPGeneralConstraintProto.Builder mergeMaxConstraint(MPArrayWithConstantConstraint var1) {
         if (this.maxConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 9 && this.generalConstraint_ != MPArrayWithConstantConstraint.getDefaultInstance()) {
               this.generalConstraint_ = MPArrayWithConstantConstraint.newBuilder((MPArrayWithConstantConstraint)this.generalConstraint_).mergeFrom(var1).buildPartial();
            } else {
               this.generalConstraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.generalConstraintCase_ == 9) {
               this.maxConstraintBuilder_.mergeFrom(var1);
            }

            this.maxConstraintBuilder_.setMessage(var1);
         }

         this.generalConstraintCase_ = 9;
         return this;
      }

      public MPGeneralConstraintProto.Builder clearMaxConstraint() {
         if (this.maxConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ == 9) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.generalConstraintCase_ == 9) {
               this.generalConstraintCase_ = 0;
               this.generalConstraint_ = null;
            }

            this.maxConstraintBuilder_.clear();
         }

         return this;
      }

      public MPArrayWithConstantConstraint.Builder getMaxConstraintBuilder() {
         return (MPArrayWithConstantConstraint.Builder)this.getMaxConstraintFieldBuilder().getBuilder();
      }

      public MPArrayWithConstantConstraintOrBuilder getMaxConstraintOrBuilder() {
         if (this.generalConstraintCase_ == 9 && this.maxConstraintBuilder_ != null) {
            return (MPArrayWithConstantConstraintOrBuilder)this.maxConstraintBuilder_.getMessageOrBuilder();
         } else {
            return this.generalConstraintCase_ == 9 ? (MPArrayWithConstantConstraint)this.generalConstraint_ : MPArrayWithConstantConstraint.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getMaxConstraintFieldBuilder() {
         if (this.maxConstraintBuilder_ == null) {
            if (this.generalConstraintCase_ != 9) {
               this.generalConstraint_ = MPArrayWithConstantConstraint.getDefaultInstance();
            }

            this.maxConstraintBuilder_ = new SingleFieldBuilderV3((MPArrayWithConstantConstraint)this.generalConstraint_, this.getParentForChildren(), this.isClean());
            this.generalConstraint_ = null;
         }

         this.generalConstraintCase_ = 9;
         this.onChanged();
         return this.maxConstraintBuilder_;
      }

      public final MPGeneralConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPGeneralConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final MPGeneralConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPGeneralConstraintProto.Builder)super.mergeUnknownFields(var1);
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

   public static enum GeneralConstraintCase implements EnumLite, InternalOneOfEnum {
      INDICATOR_CONSTRAINT(2),
      SOS_CONSTRAINT(3),
      QUADRATIC_CONSTRAINT(4),
      ABS_CONSTRAINT(5),
      AND_CONSTRAINT(6),
      OR_CONSTRAINT(7),
      MIN_CONSTRAINT(8),
      MAX_CONSTRAINT(9),
      GENERALCONSTRAINT_NOT_SET(0);

      private final int value;

      private GeneralConstraintCase(int var3) {
         this.value = var3;
      }

      /** @deprecated */
      @Deprecated
      public static MPGeneralConstraintProto.GeneralConstraintCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static MPGeneralConstraintProto.GeneralConstraintCase forNumber(int var0) {
         switch(var0) {
         case 0:
            return GENERALCONSTRAINT_NOT_SET;
         case 1:
         default:
            return null;
         case 2:
            return INDICATOR_CONSTRAINT;
         case 3:
            return SOS_CONSTRAINT;
         case 4:
            return QUADRATIC_CONSTRAINT;
         case 5:
            return ABS_CONSTRAINT;
         case 6:
            return AND_CONSTRAINT;
         case 7:
            return OR_CONSTRAINT;
         case 8:
            return MIN_CONSTRAINT;
         case 9:
            return MAX_CONSTRAINT;
         }
      }

      public int getNumber() {
         return this.value;
      }
   }
}
