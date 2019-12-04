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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.Internal.DoubleList;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class MPSosConstraint extends GeneratedMessageV3 implements MPSosConstraintOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TYPE_FIELD_NUMBER = 1;
   private int type_;
   public static final int VAR_INDEX_FIELD_NUMBER = 2;
   private IntList varIndex_;
   public static final int WEIGHT_FIELD_NUMBER = 3;
   private DoubleList weight_;
   private byte memoizedIsInitialized;
   private static final MPSosConstraint DEFAULT_INSTANCE = new MPSosConstraint();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPSosConstraint parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPSosConstraint(var1, var2);
      }
   };

   private MPSosConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPSosConstraint() {
      this.memoizedIsInitialized = -1;
      this.type_ = 0;
      this.varIndex_ = emptyIntList();
      this.weight_ = emptyDoubleList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPSosConstraint();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPSosConstraint(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                     var7 = var1.readEnum();
                     MPSosConstraint.Type var16 = MPSosConstraint.Type.valueOf(var7);
                     if (var16 == null) {
                        var4.mergeVarintField(1, var7);
                     } else {
                        this.bitField0_ |= 1;
                        this.type_ = var7;
                     }
                     continue;
                  case 16:
                     if ((var3 & 2) == 0) {
                        this.varIndex_ = newIntList();
                        var3 |= 2;
                     }

                     this.varIndex_.addInt(var1.readInt32());
                     continue;
                  case 18:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.varIndex_ = newIntList();
                        var3 |= 2;
                     }
                     break;
                  case 25:
                     if ((var3 & 4) == 0) {
                        this.weight_ = newDoubleList();
                        var3 |= 4;
                     }

                     this.weight_.addDouble(var1.readDouble());
                     continue;
                  case 26:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 4) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.weight_ = newDoubleList();
                        var3 |= 4;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.weight_.addDouble(var1.readDouble());
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
                     this.varIndex_.addInt(var1.readInt32());
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
            if ((var3 & 2) != 0) {
               this.varIndex_.makeImmutable();
            }

            if ((var3 & 4) != 0) {
               this.weight_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return LinearSolver.internal_static_operations_research_MPSosConstraint_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPSosConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPSosConstraint.class, MPSosConstraint.Builder.class);
   }

   public boolean hasType() {
      return (this.bitField0_ & 1) != 0;
   }

   public MPSosConstraint.Type getType() {
      MPSosConstraint.Type var1 = MPSosConstraint.Type.valueOf(this.type_);
      return var1 == null ? MPSosConstraint.Type.SOS1_DEFAULT : var1;
   }

   public List getVarIndexList() {
      return this.varIndex_;
   }

   public int getVarIndexCount() {
      return this.varIndex_.size();
   }

   public int getVarIndex(int var1) {
      return this.varIndex_.getInt(var1);
   }

   public List getWeightList() {
      return this.weight_;
   }

   public int getWeightCount() {
      return this.weight_.size();
   }

   public double getWeight(int var1) {
      return this.weight_.getDouble(var1);
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
         var1.writeEnum(1, this.type_);
      }

      int var2;
      for(var2 = 0; var2 < this.varIndex_.size(); ++var2) {
         var1.writeInt32(2, this.varIndex_.getInt(var2));
      }

      for(var2 = 0; var2 < this.weight_.size(); ++var2) {
         var1.writeDouble(3, this.weight_.getDouble(var2));
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
            var1 += CodedOutputStream.computeEnumSize(1, this.type_);
         }

         int var2 = 0;

         for(int var3 = 0; var3 < this.varIndex_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.varIndex_.getInt(var3));
         }

         var1 += var2;
         var1 += 1 * this.getVarIndexList().size();
         boolean var4 = false;
         var2 = 8 * this.getWeightList().size();
         var1 += var2;
         var1 += 1 * this.getWeightList().size();
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPSosConstraint)) {
         return super.equals(var1);
      } else {
         MPSosConstraint var2 = (MPSosConstraint)var1;
         if (this.hasType() != var2.hasType()) {
            return false;
         } else if (this.hasType() && this.type_ != var2.type_) {
            return false;
         } else if (!this.getVarIndexList().equals(var2.getVarIndexList())) {
            return false;
         } else if (!this.getWeightList().equals(var2.getWeightList())) {
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
         if (this.hasType()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.type_;
         }

         if (this.getVarIndexCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getVarIndexList().hashCode();
         }

         if (this.getWeightCount() > 0) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getWeightList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPSosConstraint parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPSosConstraint)PARSER.parseFrom(var0);
   }

   public static MPSosConstraint parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPSosConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPSosConstraint parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPSosConstraint)PARSER.parseFrom(var0);
   }

   public static MPSosConstraint parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPSosConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPSosConstraint parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPSosConstraint)PARSER.parseFrom(var0);
   }

   public static MPSosConstraint parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPSosConstraint)PARSER.parseFrom(var0, var1);
   }

   public static MPSosConstraint parseFrom(InputStream var0) throws IOException {
      return (MPSosConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPSosConstraint parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPSosConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPSosConstraint parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPSosConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPSosConstraint parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPSosConstraint)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPSosConstraint parseFrom(CodedInputStream var0) throws IOException {
      return (MPSosConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPSosConstraint parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPSosConstraint)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPSosConstraint.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPSosConstraint.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPSosConstraint.Builder newBuilder(MPSosConstraint var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPSosConstraint.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPSosConstraint.Builder() : (new MPSosConstraint.Builder()).mergeFrom(this);
   }

   protected MPSosConstraint.Builder newBuilderForType(BuilderParent var1) {
      MPSosConstraint.Builder var2 = new MPSosConstraint.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static MPSosConstraint getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPSosConstraint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPSosConstraint(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPSosConstraint(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPSosConstraintOrBuilder {
      private int bitField0_;
      private int type_;
      private IntList varIndex_;
      private DoubleList weight_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPSosConstraint_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPSosConstraint_fieldAccessorTable.ensureFieldAccessorsInitialized(MPSosConstraint.class, MPSosConstraint.Builder.class);
      }

      private Builder() {
         this.type_ = 0;
         this.varIndex_ = MPSosConstraint.emptyIntList();
         this.weight_ = MPSosConstraint.emptyDoubleList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.type_ = 0;
         this.varIndex_ = MPSosConstraint.emptyIntList();
         this.weight_ = MPSosConstraint.emptyDoubleList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPSosConstraint.alwaysUseFieldBuilders) {
         }

      }

      public MPSosConstraint.Builder clear() {
         super.clear();
         this.type_ = 0;
         this.bitField0_ &= -2;
         this.varIndex_ = MPSosConstraint.emptyIntList();
         this.bitField0_ &= -3;
         this.weight_ = MPSosConstraint.emptyDoubleList();
         this.bitField0_ &= -5;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPSosConstraint_descriptor;
      }

      public MPSosConstraint getDefaultInstanceForType() {
         return MPSosConstraint.getDefaultInstance();
      }

      public MPSosConstraint build() {
         MPSosConstraint var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPSosConstraint buildPartial() {
         MPSosConstraint var1 = new MPSosConstraint(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((var2 & 1) != 0) {
            var3 |= 1;
         }

         var1.type_ = this.type_;
         if ((this.bitField0_ & 2) != 0) {
            this.varIndex_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.varIndex_ = this.varIndex_;
         if ((this.bitField0_ & 4) != 0) {
            this.weight_.makeImmutable();
            this.bitField0_ &= -5;
         }

         var1.weight_ = this.weight_;
         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPSosConstraint.Builder clone() {
         return (MPSosConstraint.Builder)super.clone();
      }

      public MPSosConstraint.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPSosConstraint.Builder)super.setField(var1, var2);
      }

      public MPSosConstraint.Builder clearField(FieldDescriptor var1) {
         return (MPSosConstraint.Builder)super.clearField(var1);
      }

      public MPSosConstraint.Builder clearOneof(OneofDescriptor var1) {
         return (MPSosConstraint.Builder)super.clearOneof(var1);
      }

      public MPSosConstraint.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPSosConstraint.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPSosConstraint.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPSosConstraint.Builder)super.addRepeatedField(var1, var2);
      }

      public MPSosConstraint.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPSosConstraint) {
            return this.mergeFrom((MPSosConstraint)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPSosConstraint.Builder mergeFrom(MPSosConstraint var1) {
         if (var1 == MPSosConstraint.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasType()) {
               this.setType(var1.getType());
            }

            if (!var1.varIndex_.isEmpty()) {
               if (this.varIndex_.isEmpty()) {
                  this.varIndex_ = var1.varIndex_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureVarIndexIsMutable();
                  this.varIndex_.addAll(var1.varIndex_);
               }

               this.onChanged();
            }

            if (!var1.weight_.isEmpty()) {
               if (this.weight_.isEmpty()) {
                  this.weight_ = var1.weight_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureWeightIsMutable();
                  this.weight_.addAll(var1.weight_);
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

      public MPSosConstraint.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPSosConstraint var3 = null;

         try {
            var3 = (MPSosConstraint)MPSosConstraint.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPSosConstraint)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public MPSosConstraint.Type getType() {
         MPSosConstraint.Type var1 = MPSosConstraint.Type.valueOf(this.type_);
         return var1 == null ? MPSosConstraint.Type.SOS1_DEFAULT : var1;
      }

      public MPSosConstraint.Builder setType(MPSosConstraint.Type var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 1;
            this.type_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public MPSosConstraint.Builder clearType() {
         this.bitField0_ &= -2;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureVarIndexIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.varIndex_ = MPSosConstraint.mutableCopy(this.varIndex_);
            this.bitField0_ |= 2;
         }

      }

      public List getVarIndexList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.varIndex_) : this.varIndex_);
      }

      public int getVarIndexCount() {
         return this.varIndex_.size();
      }

      public int getVarIndex(int var1) {
         return this.varIndex_.getInt(var1);
      }

      public MPSosConstraint.Builder setVarIndex(int var1, int var2) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public MPSosConstraint.Builder addVarIndex(int var1) {
         this.ensureVarIndexIsMutable();
         this.varIndex_.addInt(var1);
         this.onChanged();
         return this;
      }

      public MPSosConstraint.Builder addAllVarIndex(Iterable var1) {
         this.ensureVarIndexIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.varIndex_);
         this.onChanged();
         return this;
      }

      public MPSosConstraint.Builder clearVarIndex() {
         this.varIndex_ = MPSosConstraint.emptyIntList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      private void ensureWeightIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.weight_ = MPSosConstraint.mutableCopy(this.weight_);
            this.bitField0_ |= 4;
         }

      }

      public List getWeightList() {
         return (List)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.weight_) : this.weight_);
      }

      public int getWeightCount() {
         return this.weight_.size();
      }

      public double getWeight(int var1) {
         return this.weight_.getDouble(var1);
      }

      public MPSosConstraint.Builder setWeight(int var1, double var2) {
         this.ensureWeightIsMutable();
         this.weight_.setDouble(var1, var2);
         this.onChanged();
         return this;
      }

      public MPSosConstraint.Builder addWeight(double var1) {
         this.ensureWeightIsMutable();
         this.weight_.addDouble(var1);
         this.onChanged();
         return this;
      }

      public MPSosConstraint.Builder addAllWeight(Iterable var1) {
         this.ensureWeightIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.weight_);
         this.onChanged();
         return this;
      }

      public MPSosConstraint.Builder clearWeight() {
         this.weight_ = MPSosConstraint.emptyDoubleList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public final MPSosConstraint.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPSosConstraint.Builder)super.setUnknownFields(var1);
      }

      public final MPSosConstraint.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPSosConstraint.Builder)super.mergeUnknownFields(var1);
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

   public static enum Type implements ProtocolMessageEnum {
      SOS1_DEFAULT(0),
      SOS2(1);

      public static final int SOS1_DEFAULT_VALUE = 0;
      public static final int SOS2_VALUE = 1;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public MPSosConstraint.Type findValueByNumber(int var1) {
            return MPSosConstraint.Type.forNumber(var1);
         }
      };
      private static final MPSosConstraint.Type[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static MPSosConstraint.Type valueOf(int var0) {
         return forNumber(var0);
      }

      public static MPSosConstraint.Type forNumber(int var0) {
         switch(var0) {
         case 0:
            return SOS1_DEFAULT;
         case 1:
            return SOS2;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)MPSosConstraint.getDescriptor().getEnumTypes().get(0);
      }

      public static MPSosConstraint.Type valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private Type(int var3) {
         this.value = var3;
      }
   }
}
