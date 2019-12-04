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

public final class PartialVariableAssignment extends GeneratedMessageV3 implements PartialVariableAssignmentOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VARS_FIELD_NUMBER = 1;
   private IntList vars_;
   private int varsMemoizedSerializedSize;
   public static final int VALUES_FIELD_NUMBER = 2;
   private LongList values_;
   private int valuesMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final PartialVariableAssignment DEFAULT_INSTANCE = new PartialVariableAssignment();
   private static final Parser PARSER = new AbstractParser() {
      public PartialVariableAssignment parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new PartialVariableAssignment(var1, var2);
      }
   };

   private PartialVariableAssignment(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.varsMemoizedSerializedSize = -1;
      this.valuesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private PartialVariableAssignment() {
      this.varsMemoizedSerializedSize = -1;
      this.valuesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.vars_ = emptyIntList();
      this.values_ = emptyLongList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new PartialVariableAssignment();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private PartialVariableAssignment(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                        this.vars_ = newIntList();
                        var3 |= 1;
                     }

                     this.vars_.addInt(var1.readInt32());
                     continue;
                  case 10:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.vars_ = newIntList();
                        var3 |= 1;
                     }
                     break;
                  case 16:
                     if ((var3 & 2) == 0) {
                        this.values_ = newLongList();
                        var3 |= 2;
                     }

                     this.values_.addLong(var1.readInt64());
                     continue;
                  case 18:
                     var7 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var7);
                     if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.values_ = newLongList();
                        var3 |= 2;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.values_.addLong(var1.readInt64());
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
                     this.vars_.addInt(var1.readInt32());
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
               this.vars_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.values_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_PartialVariableAssignment_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_PartialVariableAssignment_fieldAccessorTable.ensureFieldAccessorsInitialized(PartialVariableAssignment.class, PartialVariableAssignment.Builder.class);
   }

   public List getVarsList() {
      return this.vars_;
   }

   public int getVarsCount() {
      return this.vars_.size();
   }

   public int getVars(int var1) {
      return this.vars_.getInt(var1);
   }

   public List getValuesList() {
      return this.values_;
   }

   public int getValuesCount() {
      return this.values_.size();
   }

   public long getValues(int var1) {
      return this.values_.getLong(var1);
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
      if (this.getVarsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.varsMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.vars_.size(); ++var2) {
         var1.writeInt32NoTag(this.vars_.getInt(var2));
      }

      if (this.getValuesList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.valuesMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.values_.size(); ++var2) {
         var1.writeInt64NoTag(this.values_.getLong(var2));
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
         for(var3 = 0; var3 < this.vars_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.vars_.getInt(var3));
         }

         var1 = var4 + var2;
         if (!this.getVarsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.varsMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.values_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.values_.getLong(var3));
         }

         var1 += var2;
         if (!this.getValuesList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.valuesMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PartialVariableAssignment)) {
         return super.equals(var1);
      } else {
         PartialVariableAssignment var2 = (PartialVariableAssignment)var1;
         if (!this.getVarsList().equals(var2.getVarsList())) {
            return false;
         } else if (!this.getValuesList().equals(var2.getValuesList())) {
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
         if (this.getVarsCount() > 0) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getVarsList().hashCode();
         }

         if (this.getValuesCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getValuesList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static PartialVariableAssignment parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0);
   }

   public static PartialVariableAssignment parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0, var1);
   }

   public static PartialVariableAssignment parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0);
   }

   public static PartialVariableAssignment parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0, var1);
   }

   public static PartialVariableAssignment parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0);
   }

   public static PartialVariableAssignment parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (PartialVariableAssignment)PARSER.parseFrom(var0, var1);
   }

   public static PartialVariableAssignment parseFrom(InputStream var0) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PartialVariableAssignment parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PartialVariableAssignment parseDelimitedFrom(InputStream var0) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PartialVariableAssignment parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PartialVariableAssignment parseFrom(CodedInputStream var0) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PartialVariableAssignment parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (PartialVariableAssignment)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PartialVariableAssignment.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PartialVariableAssignment.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PartialVariableAssignment.Builder newBuilder(PartialVariableAssignment var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PartialVariableAssignment.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PartialVariableAssignment.Builder() : (new PartialVariableAssignment.Builder()).mergeFrom(this);
   }

   protected PartialVariableAssignment.Builder newBuilderForType(BuilderParent var1) {
      PartialVariableAssignment.Builder var2 = new PartialVariableAssignment.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static PartialVariableAssignment getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public PartialVariableAssignment getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   PartialVariableAssignment(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   PartialVariableAssignment(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements PartialVariableAssignmentOrBuilder {
      private int bitField0_;
      private IntList vars_;
      private LongList values_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_PartialVariableAssignment_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_PartialVariableAssignment_fieldAccessorTable.ensureFieldAccessorsInitialized(PartialVariableAssignment.class, PartialVariableAssignment.Builder.class);
      }

      private Builder() {
         this.vars_ = PartialVariableAssignment.emptyIntList();
         this.values_ = PartialVariableAssignment.emptyLongList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.vars_ = PartialVariableAssignment.emptyIntList();
         this.values_ = PartialVariableAssignment.emptyLongList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PartialVariableAssignment.alwaysUseFieldBuilders) {
         }

      }

      public PartialVariableAssignment.Builder clear() {
         super.clear();
         this.vars_ = PartialVariableAssignment.emptyIntList();
         this.bitField0_ &= -2;
         this.values_ = PartialVariableAssignment.emptyLongList();
         this.bitField0_ &= -3;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_PartialVariableAssignment_descriptor;
      }

      public PartialVariableAssignment getDefaultInstanceForType() {
         return PartialVariableAssignment.getDefaultInstance();
      }

      public PartialVariableAssignment build() {
         PartialVariableAssignment var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PartialVariableAssignment buildPartial() {
         PartialVariableAssignment var1 = new PartialVariableAssignment(this);
         int var2 = this.bitField0_;
         if ((this.bitField0_ & 1) != 0) {
            this.vars_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.vars_ = this.vars_;
         if ((this.bitField0_ & 2) != 0) {
            this.values_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.values_ = this.values_;
         this.onBuilt();
         return var1;
      }

      public PartialVariableAssignment.Builder clone() {
         return (PartialVariableAssignment.Builder)super.clone();
      }

      public PartialVariableAssignment.Builder setField(FieldDescriptor var1, Object var2) {
         return (PartialVariableAssignment.Builder)super.setField(var1, var2);
      }

      public PartialVariableAssignment.Builder clearField(FieldDescriptor var1) {
         return (PartialVariableAssignment.Builder)super.clearField(var1);
      }

      public PartialVariableAssignment.Builder clearOneof(OneofDescriptor var1) {
         return (PartialVariableAssignment.Builder)super.clearOneof(var1);
      }

      public PartialVariableAssignment.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (PartialVariableAssignment.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PartialVariableAssignment.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (PartialVariableAssignment.Builder)super.addRepeatedField(var1, var2);
      }

      public PartialVariableAssignment.Builder mergeFrom(Message var1) {
         if (var1 instanceof PartialVariableAssignment) {
            return this.mergeFrom((PartialVariableAssignment)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public PartialVariableAssignment.Builder mergeFrom(PartialVariableAssignment var1) {
         if (var1 == PartialVariableAssignment.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.vars_.isEmpty()) {
               if (this.vars_.isEmpty()) {
                  this.vars_ = var1.vars_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureVarsIsMutable();
                  this.vars_.addAll(var1.vars_);
               }

               this.onChanged();
            }

            if (!var1.values_.isEmpty()) {
               if (this.values_.isEmpty()) {
                  this.values_ = var1.values_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureValuesIsMutable();
                  this.values_.addAll(var1.values_);
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

      public PartialVariableAssignment.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         PartialVariableAssignment var3 = null;

         try {
            var3 = (PartialVariableAssignment)PartialVariableAssignment.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (PartialVariableAssignment)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      private void ensureVarsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.vars_ = PartialVariableAssignment.mutableCopy(this.vars_);
            this.bitField0_ |= 1;
         }

      }

      public List getVarsList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.vars_) : this.vars_);
      }

      public int getVarsCount() {
         return this.vars_.size();
      }

      public int getVars(int var1) {
         return this.vars_.getInt(var1);
      }

      public PartialVariableAssignment.Builder setVars(int var1, int var2) {
         this.ensureVarsIsMutable();
         this.vars_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder addVars(int var1) {
         this.ensureVarsIsMutable();
         this.vars_.addInt(var1);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder addAllVars(Iterable var1) {
         this.ensureVarsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.vars_);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder clearVars() {
         this.vars_ = PartialVariableAssignment.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureValuesIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.values_ = PartialVariableAssignment.mutableCopy(this.values_);
            this.bitField0_ |= 2;
         }

      }

      public List getValuesList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.values_) : this.values_);
      }

      public int getValuesCount() {
         return this.values_.size();
      }

      public long getValues(int var1) {
         return this.values_.getLong(var1);
      }

      public PartialVariableAssignment.Builder setValues(int var1, long var2) {
         this.ensureValuesIsMutable();
         this.values_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder addValues(long var1) {
         this.ensureValuesIsMutable();
         this.values_.addLong(var1);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder addAllValues(Iterable var1) {
         this.ensureValuesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.values_);
         this.onChanged();
         return this;
      }

      public PartialVariableAssignment.Builder clearValues() {
         this.values_ = PartialVariableAssignment.emptyLongList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public final PartialVariableAssignment.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PartialVariableAssignment.Builder)super.setUnknownFields(var1);
      }

      public final PartialVariableAssignment.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PartialVariableAssignment.Builder)super.mergeUnknownFields(var1);
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
