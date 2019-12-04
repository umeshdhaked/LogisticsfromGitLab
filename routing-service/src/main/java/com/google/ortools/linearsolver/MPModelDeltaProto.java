package com.google.ortools.linearsolver;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.WireFormat.FieldType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class MPModelDeltaProto extends GeneratedMessageV3 implements MPModelDeltaProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int BASELINE_MODEL_FILE_PATH_FIELD_NUMBER = 1;
   private volatile Object baselineModelFilePath_;
   public static final int VARIABLE_OVERRIDES_FIELD_NUMBER = 2;
   private MapField variableOverrides_;
   public static final int CONSTRAINT_OVERRIDES_FIELD_NUMBER = 3;
   private MapField constraintOverrides_;
   private byte memoizedIsInitialized;
   private static final MPModelDeltaProto DEFAULT_INSTANCE = new MPModelDeltaProto();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public MPModelDeltaProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new MPModelDeltaProto(var1, var2);
      }
   };

   private MPModelDeltaProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private MPModelDeltaProto() {
      this.memoizedIsInitialized = -1;
      this.baselineModelFilePath_ = "";
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new MPModelDeltaProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private MPModelDeltaProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
               MapEntry var7;
               switch(var6) {
               case 0:
                  var5 = true;
                  break;
               case 10:
                  ByteString var15 = var1.readBytes();
                  this.bitField0_ |= 1;
                  this.baselineModelFilePath_ = var15;
                  break;
               case 18:
                  if ((var3 & 2) == 0) {
                     this.variableOverrides_ = MapField.newMapField(MPModelDeltaProto.VariableOverridesDefaultEntryHolder.defaultEntry);
                     var3 |= 2;
                  }

                  var7 = (MapEntry)var1.readMessage(MPModelDeltaProto.VariableOverridesDefaultEntryHolder.defaultEntry.getParserForType(), var2);
                  this.variableOverrides_.getMutableMap().put(var7.getKey(), var7.getValue());
                  break;
               case 26:
                  if ((var3 & 4) == 0) {
                     this.constraintOverrides_ = MapField.newMapField(MPModelDeltaProto.ConstraintOverridesDefaultEntryHolder.defaultEntry);
                     var3 |= 4;
                  }

                  var7 = (MapEntry)var1.readMessage(MPModelDeltaProto.ConstraintOverridesDefaultEntryHolder.defaultEntry.getParserForType(), var2);
                  this.constraintOverrides_.getMutableMap().put(var7.getKey(), var7.getValue());
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
      return LinearSolver.internal_static_operations_research_MPModelDeltaProto_descriptor;
   }

   protected MapField internalGetMapField(int var1) {
      switch(var1) {
      case 2:
         return this.internalGetVariableOverrides();
      case 3:
         return this.internalGetConstraintOverrides();
      default:
         throw new RuntimeException("Invalid map field number: " + var1);
      }
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return LinearSolver.internal_static_operations_research_MPModelDeltaProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MPModelDeltaProto.class, MPModelDeltaProto.Builder.class);
   }

   public boolean hasBaselineModelFilePath() {
      return (this.bitField0_ & 1) != 0;
   }

   public String getBaselineModelFilePath() {
      Object var1 = this.baselineModelFilePath_;
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.baselineModelFilePath_ = var3;
         }

         return var3;
      }
   }

   public ByteString getBaselineModelFilePathBytes() {
      Object var1 = this.baselineModelFilePath_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.baselineModelFilePath_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   private MapField internalGetVariableOverrides() {
      return this.variableOverrides_ == null ? MapField.emptyMapField(MPModelDeltaProto.VariableOverridesDefaultEntryHolder.defaultEntry) : this.variableOverrides_;
   }

   public int getVariableOverridesCount() {
      return this.internalGetVariableOverrides().getMap().size();
   }

   public boolean containsVariableOverrides(int var1) {
      return this.internalGetVariableOverrides().getMap().containsKey(var1);
   }

   /** @deprecated */
   @Deprecated
   public Map getVariableOverrides() {
      return this.getVariableOverridesMap();
   }

   public Map getVariableOverridesMap() {
      return this.internalGetVariableOverrides().getMap();
   }

   public MPVariableProto getVariableOverridesOrDefault(int var1, MPVariableProto var2) {
      Map var3 = this.internalGetVariableOverrides().getMap();
      return var3.containsKey(var1) ? (MPVariableProto)var3.get(var1) : var2;
   }

   public MPVariableProto getVariableOverridesOrThrow(int var1) {
      Map var2 = this.internalGetVariableOverrides().getMap();
      if (!var2.containsKey(var1)) {
         throw new IllegalArgumentException();
      } else {
         return (MPVariableProto)var2.get(var1);
      }
   }

   private MapField internalGetConstraintOverrides() {
      return this.constraintOverrides_ == null ? MapField.emptyMapField(MPModelDeltaProto.ConstraintOverridesDefaultEntryHolder.defaultEntry) : this.constraintOverrides_;
   }

   public int getConstraintOverridesCount() {
      return this.internalGetConstraintOverrides().getMap().size();
   }

   public boolean containsConstraintOverrides(int var1) {
      return this.internalGetConstraintOverrides().getMap().containsKey(var1);
   }

   /** @deprecated */
   @Deprecated
   public Map getConstraintOverrides() {
      return this.getConstraintOverridesMap();
   }

   public Map getConstraintOverridesMap() {
      return this.internalGetConstraintOverrides().getMap();
   }

   public MPConstraintProto getConstraintOverridesOrDefault(int var1, MPConstraintProto var2) {
      Map var3 = this.internalGetConstraintOverrides().getMap();
      return var3.containsKey(var1) ? (MPConstraintProto)var3.get(var1) : var2;
   }

   public MPConstraintProto getConstraintOverridesOrThrow(int var1) {
      Map var2 = this.internalGetConstraintOverrides().getMap();
      if (!var2.containsKey(var1)) {
         throw new IllegalArgumentException();
      } else {
         return (MPConstraintProto)var2.get(var1);
      }
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
         GeneratedMessageV3.writeString(var1, 1, this.baselineModelFilePath_);
      }

      GeneratedMessageV3.serializeIntegerMapTo(var1, this.internalGetVariableOverrides(), MPModelDeltaProto.VariableOverridesDefaultEntryHolder.defaultEntry, 2);
      GeneratedMessageV3.serializeIntegerMapTo(var1, this.internalGetConstraintOverrides(), MPModelDeltaProto.ConstraintOverridesDefaultEntryHolder.defaultEntry, 3);
      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if ((this.bitField0_ & 1) != 0) {
            var1 += GeneratedMessageV3.computeStringSize(1, this.baselineModelFilePath_);
         }

         Iterator var2;
         Entry var3;
         MapEntry var4;
         for(var2 = this.internalGetVariableOverrides().getMap().entrySet().iterator(); var2.hasNext(); var1 += CodedOutputStream.computeMessageSize(2, var4)) {
            var3 = (Entry)var2.next();
            var4 = MPModelDeltaProto.VariableOverridesDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(var3.getKey()).setValue(var3.getValue()).build();
         }

         for(var2 = this.internalGetConstraintOverrides().getMap().entrySet().iterator(); var2.hasNext(); var1 += CodedOutputStream.computeMessageSize(3, var4)) {
            var3 = (Entry)var2.next();
            var4 = MPModelDeltaProto.ConstraintOverridesDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(var3.getKey()).setValue(var3.getValue()).build();
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof MPModelDeltaProto)) {
         return super.equals(var1);
      } else {
         MPModelDeltaProto var2 = (MPModelDeltaProto)var1;
         if (this.hasBaselineModelFilePath() != var2.hasBaselineModelFilePath()) {
            return false;
         } else if (this.hasBaselineModelFilePath() && !this.getBaselineModelFilePath().equals(var2.getBaselineModelFilePath())) {
            return false;
         } else if (!this.internalGetVariableOverrides().equals(var2.internalGetVariableOverrides())) {
            return false;
         } else if (!this.internalGetConstraintOverrides().equals(var2.internalGetConstraintOverrides())) {
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
         if (this.hasBaselineModelFilePath()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.getBaselineModelFilePath().hashCode();
         }

         if (!this.internalGetVariableOverrides().getMap().isEmpty()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.internalGetVariableOverrides().hashCode();
         }

         if (!this.internalGetConstraintOverrides().getMap().isEmpty()) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.internalGetConstraintOverrides().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static MPModelDeltaProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (MPModelDeltaProto)PARSER.parseFrom(var0);
   }

   public static MPModelDeltaProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPModelDeltaProto)PARSER.parseFrom(var0, var1);
   }

   public static MPModelDeltaProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (MPModelDeltaProto)PARSER.parseFrom(var0);
   }

   public static MPModelDeltaProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPModelDeltaProto)PARSER.parseFrom(var0, var1);
   }

   public static MPModelDeltaProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (MPModelDeltaProto)PARSER.parseFrom(var0);
   }

   public static MPModelDeltaProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (MPModelDeltaProto)PARSER.parseFrom(var0, var1);
   }

   public static MPModelDeltaProto parseFrom(InputStream var0) throws IOException {
      return (MPModelDeltaProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPModelDeltaProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPModelDeltaProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MPModelDeltaProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (MPModelDeltaProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MPModelDeltaProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPModelDeltaProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MPModelDeltaProto parseFrom(CodedInputStream var0) throws IOException {
      return (MPModelDeltaProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MPModelDeltaProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (MPModelDeltaProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MPModelDeltaProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MPModelDeltaProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MPModelDeltaProto.Builder newBuilder(MPModelDeltaProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MPModelDeltaProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MPModelDeltaProto.Builder() : (new MPModelDeltaProto.Builder()).mergeFrom(this);
   }

   protected MPModelDeltaProto.Builder newBuilderForType(BuilderParent var1) {
      MPModelDeltaProto.Builder var2 = new MPModelDeltaProto.Builder(var1);
      return var2;
   }

   public static MPModelDeltaProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public MPModelDeltaProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   MPModelDeltaProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   MPModelDeltaProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements MPModelDeltaProtoOrBuilder {
      private int bitField0_;
      private Object baselineModelFilePath_;
      private MapField variableOverrides_;
      private MapField constraintOverrides_;

      public static final Descriptor getDescriptor() {
         return LinearSolver.internal_static_operations_research_MPModelDeltaProto_descriptor;
      }

      protected MapField internalGetMapField(int var1) {
         switch(var1) {
         case 2:
            return this.internalGetVariableOverrides();
         case 3:
            return this.internalGetConstraintOverrides();
         default:
            throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      protected MapField internalGetMutableMapField(int var1) {
         switch(var1) {
         case 2:
            return this.internalGetMutableVariableOverrides();
         case 3:
            return this.internalGetMutableConstraintOverrides();
         default:
            throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return LinearSolver.internal_static_operations_research_MPModelDeltaProto_fieldAccessorTable.ensureFieldAccessorsInitialized(MPModelDeltaProto.class, MPModelDeltaProto.Builder.class);
      }

      private Builder() {
         this.baselineModelFilePath_ = "";
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.baselineModelFilePath_ = "";
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (MPModelDeltaProto.alwaysUseFieldBuilders) {
         }

      }

      public MPModelDeltaProto.Builder clear() {
         super.clear();
         this.baselineModelFilePath_ = "";
         this.bitField0_ &= -2;
         this.internalGetMutableVariableOverrides().clear();
         this.internalGetMutableConstraintOverrides().clear();
         return this;
      }

      public Descriptor getDescriptorForType() {
         return LinearSolver.internal_static_operations_research_MPModelDeltaProto_descriptor;
      }

      public MPModelDeltaProto getDefaultInstanceForType() {
         return MPModelDeltaProto.getDefaultInstance();
      }

      public MPModelDeltaProto build() {
         MPModelDeltaProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MPModelDeltaProto buildPartial() {
         MPModelDeltaProto var1 = new MPModelDeltaProto(this);
         int var2 = this.bitField0_;
         int var3 = 0;
         if ((var2 & 1) != 0) {
            var3 |= 1;
         }

         var1.baselineModelFilePath_ = this.baselineModelFilePath_;
         var1.variableOverrides_ = this.internalGetVariableOverrides();
         var1.variableOverrides_.makeImmutable();
         var1.constraintOverrides_ = this.internalGetConstraintOverrides();
         var1.constraintOverrides_.makeImmutable();
         var1.bitField0_ = var3;
         this.onBuilt();
         return var1;
      }

      public MPModelDeltaProto.Builder clone() {
         return (MPModelDeltaProto.Builder)super.clone();
      }

      public MPModelDeltaProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (MPModelDeltaProto.Builder)super.setField(var1, var2);
      }

      public MPModelDeltaProto.Builder clearField(FieldDescriptor var1) {
         return (MPModelDeltaProto.Builder)super.clearField(var1);
      }

      public MPModelDeltaProto.Builder clearOneof(OneofDescriptor var1) {
         return (MPModelDeltaProto.Builder)super.clearOneof(var1);
      }

      public MPModelDeltaProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (MPModelDeltaProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MPModelDeltaProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (MPModelDeltaProto.Builder)super.addRepeatedField(var1, var2);
      }

      public MPModelDeltaProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof MPModelDeltaProto) {
            return this.mergeFrom((MPModelDeltaProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public MPModelDeltaProto.Builder mergeFrom(MPModelDeltaProto var1) {
         if (var1 == MPModelDeltaProto.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasBaselineModelFilePath()) {
               this.bitField0_ |= 1;
               this.baselineModelFilePath_ = var1.baselineModelFilePath_;
               this.onChanged();
            }

            this.internalGetMutableVariableOverrides().mergeFrom(var1.internalGetVariableOverrides());
            this.internalGetMutableConstraintOverrides().mergeFrom(var1.internalGetConstraintOverrides());
            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public MPModelDeltaProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         MPModelDeltaProto var3 = null;

         try {
            var3 = (MPModelDeltaProto)MPModelDeltaProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (MPModelDeltaProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public boolean hasBaselineModelFilePath() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getBaselineModelFilePath() {
         Object var1 = this.baselineModelFilePath_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (var2.isValidUtf8()) {
               this.baselineModelFilePath_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      public ByteString getBaselineModelFilePathBytes() {
         Object var1 = this.baselineModelFilePath_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.baselineModelFilePath_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public MPModelDeltaProto.Builder setBaselineModelFilePath(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 1;
            this.baselineModelFilePath_ = var1;
            this.onChanged();
            return this;
         }
      }

      public MPModelDeltaProto.Builder clearBaselineModelFilePath() {
         this.bitField0_ &= -2;
         this.baselineModelFilePath_ = MPModelDeltaProto.getDefaultInstance().getBaselineModelFilePath();
         this.onChanged();
         return this;
      }

      public MPModelDeltaProto.Builder setBaselineModelFilePathBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 1;
            this.baselineModelFilePath_ = var1;
            this.onChanged();
            return this;
         }
      }

      private MapField internalGetVariableOverrides() {
         return this.variableOverrides_ == null ? MapField.emptyMapField(MPModelDeltaProto.VariableOverridesDefaultEntryHolder.defaultEntry) : this.variableOverrides_;
      }

      private MapField internalGetMutableVariableOverrides() {
         this.onChanged();
         if (this.variableOverrides_ == null) {
            this.variableOverrides_ = MapField.newMapField(MPModelDeltaProto.VariableOverridesDefaultEntryHolder.defaultEntry);
         }

         if (!this.variableOverrides_.isMutable()) {
            this.variableOverrides_ = this.variableOverrides_.copy();
         }

         return this.variableOverrides_;
      }

      public int getVariableOverridesCount() {
         return this.internalGetVariableOverrides().getMap().size();
      }

      public boolean containsVariableOverrides(int var1) {
         return this.internalGetVariableOverrides().getMap().containsKey(var1);
      }

      /** @deprecated */
      @Deprecated
      public Map getVariableOverrides() {
         return this.getVariableOverridesMap();
      }

      public Map getVariableOverridesMap() {
         return this.internalGetVariableOverrides().getMap();
      }

      public MPVariableProto getVariableOverridesOrDefault(int var1, MPVariableProto var2) {
         Map var3 = this.internalGetVariableOverrides().getMap();
         return var3.containsKey(var1) ? (MPVariableProto)var3.get(var1) : var2;
      }

      public MPVariableProto getVariableOverridesOrThrow(int var1) {
         Map var2 = this.internalGetVariableOverrides().getMap();
         if (!var2.containsKey(var1)) {
            throw new IllegalArgumentException();
         } else {
            return (MPVariableProto)var2.get(var1);
         }
      }

      public MPModelDeltaProto.Builder clearVariableOverrides() {
         this.internalGetMutableVariableOverrides().getMutableMap().clear();
         return this;
      }

      public MPModelDeltaProto.Builder removeVariableOverrides(int var1) {
         this.internalGetMutableVariableOverrides().getMutableMap().remove(var1);
         return this;
      }

      /** @deprecated */
      @Deprecated
      public Map getMutableVariableOverrides() {
         return this.internalGetMutableVariableOverrides().getMutableMap();
      }

      public MPModelDeltaProto.Builder putVariableOverrides(int var1, MPVariableProto var2) {
         if (var2 == null) {
            throw new NullPointerException();
         } else {
            this.internalGetMutableVariableOverrides().getMutableMap().put(var1, var2);
            return this;
         }
      }

      public MPModelDeltaProto.Builder putAllVariableOverrides(Map var1) {
         this.internalGetMutableVariableOverrides().getMutableMap().putAll(var1);
         return this;
      }

      private MapField internalGetConstraintOverrides() {
         return this.constraintOverrides_ == null ? MapField.emptyMapField(MPModelDeltaProto.ConstraintOverridesDefaultEntryHolder.defaultEntry) : this.constraintOverrides_;
      }

      private MapField internalGetMutableConstraintOverrides() {
         this.onChanged();
         if (this.constraintOverrides_ == null) {
            this.constraintOverrides_ = MapField.newMapField(MPModelDeltaProto.ConstraintOverridesDefaultEntryHolder.defaultEntry);
         }

         if (!this.constraintOverrides_.isMutable()) {
            this.constraintOverrides_ = this.constraintOverrides_.copy();
         }

         return this.constraintOverrides_;
      }

      public int getConstraintOverridesCount() {
         return this.internalGetConstraintOverrides().getMap().size();
      }

      public boolean containsConstraintOverrides(int var1) {
         return this.internalGetConstraintOverrides().getMap().containsKey(var1);
      }

      /** @deprecated */
      @Deprecated
      public Map getConstraintOverrides() {
         return this.getConstraintOverridesMap();
      }

      public Map getConstraintOverridesMap() {
         return this.internalGetConstraintOverrides().getMap();
      }

      public MPConstraintProto getConstraintOverridesOrDefault(int var1, MPConstraintProto var2) {
         Map var3 = this.internalGetConstraintOverrides().getMap();
         return var3.containsKey(var1) ? (MPConstraintProto)var3.get(var1) : var2;
      }

      public MPConstraintProto getConstraintOverridesOrThrow(int var1) {
         Map var2 = this.internalGetConstraintOverrides().getMap();
         if (!var2.containsKey(var1)) {
            throw new IllegalArgumentException();
         } else {
            return (MPConstraintProto)var2.get(var1);
         }
      }

      public MPModelDeltaProto.Builder clearConstraintOverrides() {
         this.internalGetMutableConstraintOverrides().getMutableMap().clear();
         return this;
      }

      public MPModelDeltaProto.Builder removeConstraintOverrides(int var1) {
         this.internalGetMutableConstraintOverrides().getMutableMap().remove(var1);
         return this;
      }

      /** @deprecated */
      @Deprecated
      public Map getMutableConstraintOverrides() {
         return this.internalGetMutableConstraintOverrides().getMutableMap();
      }

      public MPModelDeltaProto.Builder putConstraintOverrides(int var1, MPConstraintProto var2) {
         if (var2 == null) {
            throw new NullPointerException();
         } else {
            this.internalGetMutableConstraintOverrides().getMutableMap().put(var1, var2);
            return this;
         }
      }

      public MPModelDeltaProto.Builder putAllConstraintOverrides(Map var1) {
         this.internalGetMutableConstraintOverrides().getMutableMap().putAll(var1);
         return this;
      }

      public final MPModelDeltaProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MPModelDeltaProto.Builder)super.setUnknownFields(var1);
      }

      public final MPModelDeltaProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MPModelDeltaProto.Builder)super.mergeUnknownFields(var1);
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

   private static final class ConstraintOverridesDefaultEntryHolder {
      static final MapEntry defaultEntry;

      static {
         defaultEntry = MapEntry.newDefaultInstance(LinearSolver.internal_static_operations_research_MPModelDeltaProto_ConstraintOverridesEntry_descriptor, FieldType.INT32, 0, FieldType.MESSAGE, MPConstraintProto.getDefaultInstance());
      }
   }

   private static final class VariableOverridesDefaultEntryHolder {
      static final MapEntry defaultEntry;

      static {
         defaultEntry = MapEntry.newDefaultInstance(LinearSolver.internal_static_operations_research_MPModelDeltaProto_VariableOverridesEntry_descriptor, FieldType.INT32, 0, FieldType.MESSAGE, MPVariableProto.getDefaultInstance());
      }
   }
}
