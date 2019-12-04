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
import com.google.protobuf.Internal.LongList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class TableConstraintProto extends GeneratedMessageV3 implements TableConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VARS_FIELD_NUMBER = 1;
   private IntList vars_;
   private int varsMemoizedSerializedSize;
   public static final int VALUES_FIELD_NUMBER = 2;
   private LongList values_;
   private int valuesMemoizedSerializedSize;
   public static final int NEGATED_FIELD_NUMBER = 3;
   private boolean negated_;
   private byte memoizedIsInitialized;
   private static final TableConstraintProto DEFAULT_INSTANCE = new TableConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public TableConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new TableConstraintProto(var1, var2);
      }
   };

   private TableConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.varsMemoizedSerializedSize = -1;
      this.valuesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private TableConstraintProto() {
      this.varsMemoizedSerializedSize = -1;
      this.valuesMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.vars_ = emptyIntList();
      this.values_ = emptyLongList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new TableConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private TableConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                  case 24:
                     this.negated_ = var1.readBool();
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
      return CpModelProtobuf.internal_static_operations_research_sat_TableConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_TableConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(TableConstraintProto.class, TableConstraintProto.Builder.class);
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

   public boolean getNegated() {
      return this.negated_;
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

      if (this.negated_) {
         var1.writeBool(3, this.negated_);
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
         if (this.negated_) {
            var1 += CodedOutputStream.computeBoolSize(3, this.negated_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof TableConstraintProto)) {
         return super.equals(var1);
      } else {
         TableConstraintProto var2 = (TableConstraintProto)var1;
         if (!this.getVarsList().equals(var2.getVarsList())) {
            return false;
         } else if (!this.getValuesList().equals(var2.getValuesList())) {
            return false;
         } else if (this.getNegated() != var2.getNegated()) {
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

         var2 = 37 * var2 + 3;
         var2 = 53 * var2 + Internal.hashBoolean(this.getNegated());
         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static TableConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (TableConstraintProto)PARSER.parseFrom(var0);
   }

   public static TableConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (TableConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static TableConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (TableConstraintProto)PARSER.parseFrom(var0);
   }

   public static TableConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (TableConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static TableConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (TableConstraintProto)PARSER.parseFrom(var0);
   }

   public static TableConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (TableConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static TableConstraintProto parseFrom(InputStream var0) throws IOException {
      return (TableConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TableConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (TableConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TableConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (TableConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TableConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (TableConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TableConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (TableConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TableConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (TableConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public TableConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static TableConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TableConstraintProto.Builder newBuilder(TableConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public TableConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new TableConstraintProto.Builder() : (new TableConstraintProto.Builder()).mergeFrom(this);
   }

   protected TableConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      TableConstraintProto.Builder var2 = new TableConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static TableConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public TableConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   TableConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   TableConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements TableConstraintProtoOrBuilder {
      private int bitField0_;
      private IntList vars_;
      private LongList values_;
      private boolean negated_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_TableConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_TableConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(TableConstraintProto.class, TableConstraintProto.Builder.class);
      }

      private Builder() {
         this.vars_ = TableConstraintProto.emptyIntList();
         this.values_ = TableConstraintProto.emptyLongList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.vars_ = TableConstraintProto.emptyIntList();
         this.values_ = TableConstraintProto.emptyLongList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (TableConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public TableConstraintProto.Builder clear() {
         super.clear();
         this.vars_ = TableConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.values_ = TableConstraintProto.emptyLongList();
         this.bitField0_ &= -3;
         this.negated_ = false;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_TableConstraintProto_descriptor;
      }

      public TableConstraintProto getDefaultInstanceForType() {
         return TableConstraintProto.getDefaultInstance();
      }

      public TableConstraintProto build() {
         TableConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public TableConstraintProto buildPartial() {
         TableConstraintProto var1 = new TableConstraintProto(this);
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
         var1.negated_ = this.negated_;
         this.onBuilt();
         return var1;
      }

      public TableConstraintProto.Builder clone() {
         return (TableConstraintProto.Builder)super.clone();
      }

      public TableConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (TableConstraintProto.Builder)super.setField(var1, var2);
      }

      public TableConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (TableConstraintProto.Builder)super.clearField(var1);
      }

      public TableConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (TableConstraintProto.Builder)super.clearOneof(var1);
      }

      public TableConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (TableConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public TableConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (TableConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public TableConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof TableConstraintProto) {
            return this.mergeFrom((TableConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public TableConstraintProto.Builder mergeFrom(TableConstraintProto var1) {
         if (var1 == TableConstraintProto.getDefaultInstance()) {
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

            if (var1.getNegated()) {
               this.setNegated(var1.getNegated());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public TableConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         TableConstraintProto var3 = null;

         try {
            var3 = (TableConstraintProto)TableConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (TableConstraintProto)var8.getUnfinishedMessage();
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
            this.vars_ = TableConstraintProto.mutableCopy(this.vars_);
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

      public TableConstraintProto.Builder setVars(int var1, int var2) {
         this.ensureVarsIsMutable();
         this.vars_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public TableConstraintProto.Builder addVars(int var1) {
         this.ensureVarsIsMutable();
         this.vars_.addInt(var1);
         this.onChanged();
         return this;
      }

      public TableConstraintProto.Builder addAllVars(Iterable var1) {
         this.ensureVarsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.vars_);
         this.onChanged();
         return this;
      }

      public TableConstraintProto.Builder clearVars() {
         this.vars_ = TableConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureValuesIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.values_ = TableConstraintProto.mutableCopy(this.values_);
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

      public TableConstraintProto.Builder setValues(int var1, long var2) {
         this.ensureValuesIsMutable();
         this.values_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public TableConstraintProto.Builder addValues(long var1) {
         this.ensureValuesIsMutable();
         this.values_.addLong(var1);
         this.onChanged();
         return this;
      }

      public TableConstraintProto.Builder addAllValues(Iterable var1) {
         this.ensureValuesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.values_);
         this.onChanged();
         return this;
      }

      public TableConstraintProto.Builder clearValues() {
         this.values_ = TableConstraintProto.emptyLongList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public boolean getNegated() {
         return this.negated_;
      }

      public TableConstraintProto.Builder setNegated(boolean var1) {
         this.negated_ = var1;
         this.onChanged();
         return this;
      }

      public TableConstraintProto.Builder clearNegated() {
         this.negated_ = false;
         this.onChanged();
         return this;
      }

      public final TableConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (TableConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final TableConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (TableConstraintProto.Builder)super.mergeUnknownFields(var1);
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
