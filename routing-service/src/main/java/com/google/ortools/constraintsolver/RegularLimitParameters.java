package com.google.ortools.constraintsolver;

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

public final class RegularLimitParameters extends GeneratedMessageV3 implements RegularLimitParametersOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TIME_FIELD_NUMBER = 1;
   private long time_;
   public static final int BRANCHES_FIELD_NUMBER = 2;
   private long branches_;
   public static final int FAILURES_FIELD_NUMBER = 3;
   private long failures_;
   public static final int SOLUTIONS_FIELD_NUMBER = 4;
   private long solutions_;
   public static final int SMART_TIME_CHECK_FIELD_NUMBER = 5;
   private boolean smartTimeCheck_;
   public static final int CUMULATIVE_FIELD_NUMBER = 6;
   private boolean cumulative_;
   private byte memoizedIsInitialized;
   private static final RegularLimitParameters DEFAULT_INSTANCE = new RegularLimitParameters();
   private static final Parser PARSER = new AbstractParser() {
      public RegularLimitParameters parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new RegularLimitParameters(var1, var2);
      }
   };

   private RegularLimitParameters(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private RegularLimitParameters() {
      this.memoizedIsInitialized = -1;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new RegularLimitParameters();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private RegularLimitParameters(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
                  this.time_ = var1.readInt64();
                  break;
               case 16:
                  this.branches_ = var1.readInt64();
                  break;
               case 24:
                  this.failures_ = var1.readInt64();
                  break;
               case 32:
                  this.solutions_ = var1.readInt64();
                  break;
               case 40:
                  this.smartTimeCheck_ = var1.readBool();
                  break;
               case 48:
                  this.cumulative_ = var1.readBool();
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
      return SearchLimitProtobuf.internal_static_operations_research_RegularLimitParameters_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SearchLimitProtobuf.internal_static_operations_research_RegularLimitParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(RegularLimitParameters.class, RegularLimitParameters.Builder.class);
   }

   public long getTime() {
      return this.time_;
   }

   public long getBranches() {
      return this.branches_;
   }

   public long getFailures() {
      return this.failures_;
   }

   public long getSolutions() {
      return this.solutions_;
   }

   public boolean getSmartTimeCheck() {
      return this.smartTimeCheck_;
   }

   public boolean getCumulative() {
      return this.cumulative_;
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
      if (this.time_ != 0L) {
         var1.writeInt64(1, this.time_);
      }

      if (this.branches_ != 0L) {
         var1.writeInt64(2, this.branches_);
      }

      if (this.failures_ != 0L) {
         var1.writeInt64(3, this.failures_);
      }

      if (this.solutions_ != 0L) {
         var1.writeInt64(4, this.solutions_);
      }

      if (this.smartTimeCheck_) {
         var1.writeBool(5, this.smartTimeCheck_);
      }

      if (this.cumulative_) {
         var1.writeBool(6, this.cumulative_);
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (this.time_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(1, this.time_);
         }

         if (this.branches_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(2, this.branches_);
         }

         if (this.failures_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(3, this.failures_);
         }

         if (this.solutions_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(4, this.solutions_);
         }

         if (this.smartTimeCheck_) {
            var1 += CodedOutputStream.computeBoolSize(5, this.smartTimeCheck_);
         }

         if (this.cumulative_) {
            var1 += CodedOutputStream.computeBoolSize(6, this.cumulative_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RegularLimitParameters)) {
         return super.equals(var1);
      } else {
         RegularLimitParameters var2 = (RegularLimitParameters)var1;
         if (this.getTime() != var2.getTime()) {
            return false;
         } else if (this.getBranches() != var2.getBranches()) {
            return false;
         } else if (this.getFailures() != var2.getFailures()) {
            return false;
         } else if (this.getSolutions() != var2.getSolutions()) {
            return false;
         } else if (this.getSmartTimeCheck() != var2.getSmartTimeCheck()) {
            return false;
         } else if (this.getCumulative() != var2.getCumulative()) {
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
         var2 = 53 * var2 + Internal.hashLong(this.getTime());
         var2 = 37 * var2 + 2;
         var2 = 53 * var2 + Internal.hashLong(this.getBranches());
         var2 = 37 * var2 + 3;
         var2 = 53 * var2 + Internal.hashLong(this.getFailures());
         var2 = 37 * var2 + 4;
         var2 = 53 * var2 + Internal.hashLong(this.getSolutions());
         var2 = 37 * var2 + 5;
         var2 = 53 * var2 + Internal.hashBoolean(this.getSmartTimeCheck());
         var2 = 37 * var2 + 6;
         var2 = 53 * var2 + Internal.hashBoolean(this.getCumulative());
         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static RegularLimitParameters parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (RegularLimitParameters)PARSER.parseFrom(var0);
   }

   public static RegularLimitParameters parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RegularLimitParameters)PARSER.parseFrom(var0, var1);
   }

   public static RegularLimitParameters parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (RegularLimitParameters)PARSER.parseFrom(var0);
   }

   public static RegularLimitParameters parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RegularLimitParameters)PARSER.parseFrom(var0, var1);
   }

   public static RegularLimitParameters parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (RegularLimitParameters)PARSER.parseFrom(var0);
   }

   public static RegularLimitParameters parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RegularLimitParameters)PARSER.parseFrom(var0, var1);
   }

   public static RegularLimitParameters parseFrom(InputStream var0) throws IOException {
      return (RegularLimitParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RegularLimitParameters parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RegularLimitParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RegularLimitParameters parseDelimitedFrom(InputStream var0) throws IOException {
      return (RegularLimitParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RegularLimitParameters parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RegularLimitParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RegularLimitParameters parseFrom(CodedInputStream var0) throws IOException {
      return (RegularLimitParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RegularLimitParameters parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RegularLimitParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RegularLimitParameters.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RegularLimitParameters.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RegularLimitParameters.Builder newBuilder(RegularLimitParameters var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RegularLimitParameters.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RegularLimitParameters.Builder() : (new RegularLimitParameters.Builder()).mergeFrom(this);
   }

   protected RegularLimitParameters.Builder newBuilderForType(BuilderParent var1) {
      RegularLimitParameters.Builder var2 = new RegularLimitParameters.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static RegularLimitParameters getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public RegularLimitParameters getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   RegularLimitParameters(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   RegularLimitParameters(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements RegularLimitParametersOrBuilder {
      private long time_;
      private long branches_;
      private long failures_;
      private long solutions_;
      private boolean smartTimeCheck_;
      private boolean cumulative_;

      public static final Descriptor getDescriptor() {
         return SearchLimitProtobuf.internal_static_operations_research_RegularLimitParameters_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return SearchLimitProtobuf.internal_static_operations_research_RegularLimitParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(RegularLimitParameters.class, RegularLimitParameters.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RegularLimitParameters.alwaysUseFieldBuilders) {
         }

      }

      public RegularLimitParameters.Builder clear() {
         super.clear();
         this.time_ = 0L;
         this.branches_ = 0L;
         this.failures_ = 0L;
         this.solutions_ = 0L;
         this.smartTimeCheck_ = false;
         this.cumulative_ = false;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return SearchLimitProtobuf.internal_static_operations_research_RegularLimitParameters_descriptor;
      }

      public RegularLimitParameters getDefaultInstanceForType() {
         return RegularLimitParameters.getDefaultInstance();
      }

      public RegularLimitParameters build() {
         RegularLimitParameters var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RegularLimitParameters buildPartial() {
         RegularLimitParameters var1 = new RegularLimitParameters(this);
         var1.time_ = this.time_;
         var1.branches_ = this.branches_;
         var1.failures_ = this.failures_;
         var1.solutions_ = this.solutions_;
         var1.smartTimeCheck_ = this.smartTimeCheck_;
         var1.cumulative_ = this.cumulative_;
         this.onBuilt();
         return var1;
      }

      public RegularLimitParameters.Builder clone() {
         return (RegularLimitParameters.Builder)super.clone();
      }

      public RegularLimitParameters.Builder setField(FieldDescriptor var1, Object var2) {
         return (RegularLimitParameters.Builder)super.setField(var1, var2);
      }

      public RegularLimitParameters.Builder clearField(FieldDescriptor var1) {
         return (RegularLimitParameters.Builder)super.clearField(var1);
      }

      public RegularLimitParameters.Builder clearOneof(OneofDescriptor var1) {
         return (RegularLimitParameters.Builder)super.clearOneof(var1);
      }

      public RegularLimitParameters.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (RegularLimitParameters.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RegularLimitParameters.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (RegularLimitParameters.Builder)super.addRepeatedField(var1, var2);
      }

      public RegularLimitParameters.Builder mergeFrom(Message var1) {
         if (var1 instanceof RegularLimitParameters) {
            return this.mergeFrom((RegularLimitParameters)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public RegularLimitParameters.Builder mergeFrom(RegularLimitParameters var1) {
         if (var1 == RegularLimitParameters.getDefaultInstance()) {
            return this;
         } else {
            if (var1.getTime() != 0L) {
               this.setTime(var1.getTime());
            }

            if (var1.getBranches() != 0L) {
               this.setBranches(var1.getBranches());
            }

            if (var1.getFailures() != 0L) {
               this.setFailures(var1.getFailures());
            }

            if (var1.getSolutions() != 0L) {
               this.setSolutions(var1.getSolutions());
            }

            if (var1.getSmartTimeCheck()) {
               this.setSmartTimeCheck(var1.getSmartTimeCheck());
            }

            if (var1.getCumulative()) {
               this.setCumulative(var1.getCumulative());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public RegularLimitParameters.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         RegularLimitParameters var3 = null;

         try {
            var3 = (RegularLimitParameters)RegularLimitParameters.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (RegularLimitParameters)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public long getTime() {
         return this.time_;
      }

      public RegularLimitParameters.Builder setTime(long var1) {
         this.time_ = var1;
         this.onChanged();
         return this;
      }

      public RegularLimitParameters.Builder clearTime() {
         this.time_ = 0L;
         this.onChanged();
         return this;
      }

      public long getBranches() {
         return this.branches_;
      }

      public RegularLimitParameters.Builder setBranches(long var1) {
         this.branches_ = var1;
         this.onChanged();
         return this;
      }

      public RegularLimitParameters.Builder clearBranches() {
         this.branches_ = 0L;
         this.onChanged();
         return this;
      }

      public long getFailures() {
         return this.failures_;
      }

      public RegularLimitParameters.Builder setFailures(long var1) {
         this.failures_ = var1;
         this.onChanged();
         return this;
      }

      public RegularLimitParameters.Builder clearFailures() {
         this.failures_ = 0L;
         this.onChanged();
         return this;
      }

      public long getSolutions() {
         return this.solutions_;
      }

      public RegularLimitParameters.Builder setSolutions(long var1) {
         this.solutions_ = var1;
         this.onChanged();
         return this;
      }

      public RegularLimitParameters.Builder clearSolutions() {
         this.solutions_ = 0L;
         this.onChanged();
         return this;
      }

      public boolean getSmartTimeCheck() {
         return this.smartTimeCheck_;
      }

      public RegularLimitParameters.Builder setSmartTimeCheck(boolean var1) {
         this.smartTimeCheck_ = var1;
         this.onChanged();
         return this;
      }

      public RegularLimitParameters.Builder clearSmartTimeCheck() {
         this.smartTimeCheck_ = false;
         this.onChanged();
         return this;
      }

      public boolean getCumulative() {
         return this.cumulative_;
      }

      public RegularLimitParameters.Builder setCumulative(boolean var1) {
         this.cumulative_ = var1;
         this.onChanged();
         return this;
      }

      public RegularLimitParameters.Builder clearCumulative() {
         this.cumulative_ = false;
         this.onChanged();
         return this;
      }

      public final RegularLimitParameters.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RegularLimitParameters.Builder)super.setUnknownFields(var1);
      }

      public final RegularLimitParameters.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RegularLimitParameters.Builder)super.mergeUnknownFields(var1);
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
