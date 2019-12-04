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

public final class AutomatonConstraintProto extends GeneratedMessageV3 implements AutomatonConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STARTING_STATE_FIELD_NUMBER = 2;
   private long startingState_;
   public static final int FINAL_STATES_FIELD_NUMBER = 3;
   private LongList finalStates_;
   private int finalStatesMemoizedSerializedSize;
   public static final int TRANSITION_TAIL_FIELD_NUMBER = 4;
   private LongList transitionTail_;
   private int transitionTailMemoizedSerializedSize;
   public static final int TRANSITION_HEAD_FIELD_NUMBER = 5;
   private LongList transitionHead_;
   private int transitionHeadMemoizedSerializedSize;
   public static final int TRANSITION_LABEL_FIELD_NUMBER = 6;
   private LongList transitionLabel_;
   private int transitionLabelMemoizedSerializedSize;
   public static final int VARS_FIELD_NUMBER = 7;
   private IntList vars_;
   private int varsMemoizedSerializedSize;
   private byte memoizedIsInitialized;
   private static final AutomatonConstraintProto DEFAULT_INSTANCE = new AutomatonConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public AutomatonConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new AutomatonConstraintProto(var1, var2);
      }
   };

   private AutomatonConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.finalStatesMemoizedSerializedSize = -1;
      this.transitionTailMemoizedSerializedSize = -1;
      this.transitionHeadMemoizedSerializedSize = -1;
      this.transitionLabelMemoizedSerializedSize = -1;
      this.varsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private AutomatonConstraintProto() {
      this.finalStatesMemoizedSerializedSize = -1;
      this.transitionTailMemoizedSerializedSize = -1;
      this.transitionHeadMemoizedSerializedSize = -1;
      this.transitionLabelMemoizedSerializedSize = -1;
      this.varsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.finalStates_ = emptyLongList();
      this.transitionTail_ = emptyLongList();
      this.transitionHead_ = emptyLongList();
      this.transitionLabel_ = emptyLongList();
      this.vars_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new AutomatonConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private AutomatonConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
               case 16:
                  this.startingState_ = var1.readInt64();
                  continue;
               case 24:
                  if ((var3 & 1) == 0) {
                     this.finalStates_ = newLongList();
                     var3 |= 1;
                  }

                  this.finalStates_.addLong(var1.readInt64());
                  continue;
               case 26:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.finalStates_ = newLongList();
                     var3 |= 1;
                  }
                  break;
               case 32:
                  if ((var3 & 2) == 0) {
                     this.transitionTail_ = newLongList();
                     var3 |= 2;
                  }

                  this.transitionTail_.addLong(var1.readInt64());
                  continue;
               case 34:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.transitionTail_ = newLongList();
                     var3 |= 2;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.transitionTail_.addLong(var1.readInt64());
                  }

                  var1.popLimit(var8);
                  continue;
               case 40:
                  if ((var3 & 4) == 0) {
                     this.transitionHead_ = newLongList();
                     var3 |= 4;
                  }

                  this.transitionHead_.addLong(var1.readInt64());
                  continue;
               case 42:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 4) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.transitionHead_ = newLongList();
                     var3 |= 4;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.transitionHead_.addLong(var1.readInt64());
                  }

                  var1.popLimit(var8);
                  continue;
               case 48:
                  if ((var3 & 8) == 0) {
                     this.transitionLabel_ = newLongList();
                     var3 |= 8;
                  }

                  this.transitionLabel_.addLong(var1.readInt64());
                  continue;
               case 50:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 8) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.transitionLabel_ = newLongList();
                     var3 |= 8;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.transitionLabel_.addLong(var1.readInt64());
                  }

                  var1.popLimit(var8);
                  continue;
               case 56:
                  if ((var3 & 16) == 0) {
                     this.vars_ = newIntList();
                     var3 |= 16;
                  }

                  this.vars_.addInt(var1.readInt32());
                  continue;
               case 58:
                  var7 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var7);
                  if ((var3 & 16) == 0 && var1.getBytesUntilLimit() > 0) {
                     this.vars_ = newIntList();
                     var3 |= 16;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.vars_.addInt(var1.readInt32());
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
                  this.finalStates_.addLong(var1.readInt64());
               }

               var1.popLimit(var8);
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            if ((var3 & 1) != 0) {
               this.finalStates_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.transitionTail_.makeImmutable();
            }

            if ((var3 & 4) != 0) {
               this.transitionHead_.makeImmutable();
            }

            if ((var3 & 8) != 0) {
               this.transitionLabel_.makeImmutable();
            }

            if ((var3 & 16) != 0) {
               this.vars_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_AutomatonConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_AutomatonConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(AutomatonConstraintProto.class, AutomatonConstraintProto.Builder.class);
   }

   public long getStartingState() {
      return this.startingState_;
   }

   public List getFinalStatesList() {
      return this.finalStates_;
   }

   public int getFinalStatesCount() {
      return this.finalStates_.size();
   }

   public long getFinalStates(int var1) {
      return this.finalStates_.getLong(var1);
   }

   public List getTransitionTailList() {
      return this.transitionTail_;
   }

   public int getTransitionTailCount() {
      return this.transitionTail_.size();
   }

   public long getTransitionTail(int var1) {
      return this.transitionTail_.getLong(var1);
   }

   public List getTransitionHeadList() {
      return this.transitionHead_;
   }

   public int getTransitionHeadCount() {
      return this.transitionHead_.size();
   }

   public long getTransitionHead(int var1) {
      return this.transitionHead_.getLong(var1);
   }

   public List getTransitionLabelList() {
      return this.transitionLabel_;
   }

   public int getTransitionLabelCount() {
      return this.transitionLabel_.size();
   }

   public long getTransitionLabel(int var1) {
      return this.transitionLabel_.getLong(var1);
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
      if (this.startingState_ != 0L) {
         var1.writeInt64(2, this.startingState_);
      }

      if (this.getFinalStatesList().size() > 0) {
         var1.writeUInt32NoTag(26);
         var1.writeUInt32NoTag(this.finalStatesMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.finalStates_.size(); ++var2) {
         var1.writeInt64NoTag(this.finalStates_.getLong(var2));
      }

      if (this.getTransitionTailList().size() > 0) {
         var1.writeUInt32NoTag(34);
         var1.writeUInt32NoTag(this.transitionTailMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.transitionTail_.size(); ++var2) {
         var1.writeInt64NoTag(this.transitionTail_.getLong(var2));
      }

      if (this.getTransitionHeadList().size() > 0) {
         var1.writeUInt32NoTag(42);
         var1.writeUInt32NoTag(this.transitionHeadMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.transitionHead_.size(); ++var2) {
         var1.writeInt64NoTag(this.transitionHead_.getLong(var2));
      }

      if (this.getTransitionLabelList().size() > 0) {
         var1.writeUInt32NoTag(50);
         var1.writeUInt32NoTag(this.transitionLabelMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.transitionLabel_.size(); ++var2) {
         var1.writeInt64NoTag(this.transitionLabel_.getLong(var2));
      }

      if (this.getVarsList().size() > 0) {
         var1.writeUInt32NoTag(58);
         var1.writeUInt32NoTag(this.varsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.vars_.size(); ++var2) {
         var1.writeInt32NoTag(this.vars_.getInt(var2));
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (this.startingState_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(2, this.startingState_);
         }

         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < this.finalStates_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.finalStates_.getLong(var3));
         }

         var1 += var2;
         if (!this.getFinalStatesList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.finalStatesMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.transitionTail_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.transitionTail_.getLong(var3));
         }

         var1 += var2;
         if (!this.getTransitionTailList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.transitionTailMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.transitionHead_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.transitionHead_.getLong(var3));
         }

         var1 += var2;
         if (!this.getTransitionHeadList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.transitionHeadMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.transitionLabel_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.transitionLabel_.getLong(var3));
         }

         var1 += var2;
         if (!this.getTransitionLabelList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.transitionLabelMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.vars_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.vars_.getInt(var3));
         }

         var1 += var2;
         if (!this.getVarsList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.varsMemoizedSerializedSize = var2;
         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof AutomatonConstraintProto)) {
         return super.equals(var1);
      } else {
         AutomatonConstraintProto var2 = (AutomatonConstraintProto)var1;
         if (this.getStartingState() != var2.getStartingState()) {
            return false;
         } else if (!this.getFinalStatesList().equals(var2.getFinalStatesList())) {
            return false;
         } else if (!this.getTransitionTailList().equals(var2.getTransitionTailList())) {
            return false;
         } else if (!this.getTransitionHeadList().equals(var2.getTransitionHeadList())) {
            return false;
         } else if (!this.getTransitionLabelList().equals(var2.getTransitionLabelList())) {
            return false;
         } else if (!this.getVarsList().equals(var2.getVarsList())) {
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
         var2 = 37 * var2 + 2;
         var2 = 53 * var2 + Internal.hashLong(this.getStartingState());
         if (this.getFinalStatesCount() > 0) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getFinalStatesList().hashCode();
         }

         if (this.getTransitionTailCount() > 0) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getTransitionTailList().hashCode();
         }

         if (this.getTransitionHeadCount() > 0) {
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.getTransitionHeadList().hashCode();
         }

         if (this.getTransitionLabelCount() > 0) {
            var2 = 37 * var2 + 6;
            var2 = 53 * var2 + this.getTransitionLabelList().hashCode();
         }

         if (this.getVarsCount() > 0) {
            var2 = 37 * var2 + 7;
            var2 = 53 * var2 + this.getVarsList().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static AutomatonConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (AutomatonConstraintProto)PARSER.parseFrom(var0);
   }

   public static AutomatonConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (AutomatonConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static AutomatonConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (AutomatonConstraintProto)PARSER.parseFrom(var0);
   }

   public static AutomatonConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (AutomatonConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static AutomatonConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (AutomatonConstraintProto)PARSER.parseFrom(var0);
   }

   public static AutomatonConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (AutomatonConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static AutomatonConstraintProto parseFrom(InputStream var0) throws IOException {
      return (AutomatonConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AutomatonConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (AutomatonConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AutomatonConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (AutomatonConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AutomatonConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (AutomatonConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AutomatonConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (AutomatonConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AutomatonConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (AutomatonConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AutomatonConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AutomatonConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AutomatonConstraintProto.Builder newBuilder(AutomatonConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AutomatonConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AutomatonConstraintProto.Builder() : (new AutomatonConstraintProto.Builder()).mergeFrom(this);
   }

   protected AutomatonConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      AutomatonConstraintProto.Builder var2 = new AutomatonConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static AutomatonConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public AutomatonConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   AutomatonConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   AutomatonConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements AutomatonConstraintProtoOrBuilder {
      private int bitField0_;
      private long startingState_;
      private LongList finalStates_;
      private LongList transitionTail_;
      private LongList transitionHead_;
      private LongList transitionLabel_;
      private IntList vars_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_AutomatonConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_AutomatonConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(AutomatonConstraintProto.class, AutomatonConstraintProto.Builder.class);
      }

      private Builder() {
         this.finalStates_ = AutomatonConstraintProto.emptyLongList();
         this.transitionTail_ = AutomatonConstraintProto.emptyLongList();
         this.transitionHead_ = AutomatonConstraintProto.emptyLongList();
         this.transitionLabel_ = AutomatonConstraintProto.emptyLongList();
         this.vars_ = AutomatonConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.finalStates_ = AutomatonConstraintProto.emptyLongList();
         this.transitionTail_ = AutomatonConstraintProto.emptyLongList();
         this.transitionHead_ = AutomatonConstraintProto.emptyLongList();
         this.transitionLabel_ = AutomatonConstraintProto.emptyLongList();
         this.vars_ = AutomatonConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (AutomatonConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public AutomatonConstraintProto.Builder clear() {
         super.clear();
         this.startingState_ = 0L;
         this.finalStates_ = AutomatonConstraintProto.emptyLongList();
         this.bitField0_ &= -2;
         this.transitionTail_ = AutomatonConstraintProto.emptyLongList();
         this.bitField0_ &= -3;
         this.transitionHead_ = AutomatonConstraintProto.emptyLongList();
         this.bitField0_ &= -5;
         this.transitionLabel_ = AutomatonConstraintProto.emptyLongList();
         this.bitField0_ &= -9;
         this.vars_ = AutomatonConstraintProto.emptyIntList();
         this.bitField0_ &= -17;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_AutomatonConstraintProto_descriptor;
      }

      public AutomatonConstraintProto getDefaultInstanceForType() {
         return AutomatonConstraintProto.getDefaultInstance();
      }

      public AutomatonConstraintProto build() {
         AutomatonConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AutomatonConstraintProto buildPartial() {
         AutomatonConstraintProto var1 = new AutomatonConstraintProto(this);
         int var2 = this.bitField0_;
         var1.startingState_ = this.startingState_;
         if ((this.bitField0_ & 1) != 0) {
            this.finalStates_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.finalStates_ = this.finalStates_;
         if ((this.bitField0_ & 2) != 0) {
            this.transitionTail_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.transitionTail_ = this.transitionTail_;
         if ((this.bitField0_ & 4) != 0) {
            this.transitionHead_.makeImmutable();
            this.bitField0_ &= -5;
         }

         var1.transitionHead_ = this.transitionHead_;
         if ((this.bitField0_ & 8) != 0) {
            this.transitionLabel_.makeImmutable();
            this.bitField0_ &= -9;
         }

         var1.transitionLabel_ = this.transitionLabel_;
         if ((this.bitField0_ & 16) != 0) {
            this.vars_.makeImmutable();
            this.bitField0_ &= -17;
         }

         var1.vars_ = this.vars_;
         this.onBuilt();
         return var1;
      }

      public AutomatonConstraintProto.Builder clone() {
         return (AutomatonConstraintProto.Builder)super.clone();
      }

      public AutomatonConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (AutomatonConstraintProto.Builder)super.setField(var1, var2);
      }

      public AutomatonConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (AutomatonConstraintProto.Builder)super.clearField(var1);
      }

      public AutomatonConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (AutomatonConstraintProto.Builder)super.clearOneof(var1);
      }

      public AutomatonConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (AutomatonConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AutomatonConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (AutomatonConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public AutomatonConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof AutomatonConstraintProto) {
            return this.mergeFrom((AutomatonConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public AutomatonConstraintProto.Builder mergeFrom(AutomatonConstraintProto var1) {
         if (var1 == AutomatonConstraintProto.getDefaultInstance()) {
            return this;
         } else {
            if (var1.getStartingState() != 0L) {
               this.setStartingState(var1.getStartingState());
            }

            if (!var1.finalStates_.isEmpty()) {
               if (this.finalStates_.isEmpty()) {
                  this.finalStates_ = var1.finalStates_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureFinalStatesIsMutable();
                  this.finalStates_.addAll(var1.finalStates_);
               }

               this.onChanged();
            }

            if (!var1.transitionTail_.isEmpty()) {
               if (this.transitionTail_.isEmpty()) {
                  this.transitionTail_ = var1.transitionTail_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureTransitionTailIsMutable();
                  this.transitionTail_.addAll(var1.transitionTail_);
               }

               this.onChanged();
            }

            if (!var1.transitionHead_.isEmpty()) {
               if (this.transitionHead_.isEmpty()) {
                  this.transitionHead_ = var1.transitionHead_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureTransitionHeadIsMutable();
                  this.transitionHead_.addAll(var1.transitionHead_);
               }

               this.onChanged();
            }

            if (!var1.transitionLabel_.isEmpty()) {
               if (this.transitionLabel_.isEmpty()) {
                  this.transitionLabel_ = var1.transitionLabel_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureTransitionLabelIsMutable();
                  this.transitionLabel_.addAll(var1.transitionLabel_);
               }

               this.onChanged();
            }

            if (!var1.vars_.isEmpty()) {
               if (this.vars_.isEmpty()) {
                  this.vars_ = var1.vars_;
                  this.bitField0_ &= -17;
               } else {
                  this.ensureVarsIsMutable();
                  this.vars_.addAll(var1.vars_);
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

      public AutomatonConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         AutomatonConstraintProto var3 = null;

         try {
            var3 = (AutomatonConstraintProto)AutomatonConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (AutomatonConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public long getStartingState() {
         return this.startingState_;
      }

      public AutomatonConstraintProto.Builder setStartingState(long var1) {
         this.startingState_ = var1;
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder clearStartingState() {
         this.startingState_ = 0L;
         this.onChanged();
         return this;
      }

      private void ensureFinalStatesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.finalStates_ = AutomatonConstraintProto.mutableCopy(this.finalStates_);
            this.bitField0_ |= 1;
         }

      }

      public List getFinalStatesList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.finalStates_) : this.finalStates_);
      }

      public int getFinalStatesCount() {
         return this.finalStates_.size();
      }

      public long getFinalStates(int var1) {
         return this.finalStates_.getLong(var1);
      }

      public AutomatonConstraintProto.Builder setFinalStates(int var1, long var2) {
         this.ensureFinalStatesIsMutable();
         this.finalStates_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder addFinalStates(long var1) {
         this.ensureFinalStatesIsMutable();
         this.finalStates_.addLong(var1);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder addAllFinalStates(Iterable var1) {
         this.ensureFinalStatesIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.finalStates_);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder clearFinalStates() {
         this.finalStates_ = AutomatonConstraintProto.emptyLongList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      private void ensureTransitionTailIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.transitionTail_ = AutomatonConstraintProto.mutableCopy(this.transitionTail_);
            this.bitField0_ |= 2;
         }

      }

      public List getTransitionTailList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.transitionTail_) : this.transitionTail_);
      }

      public int getTransitionTailCount() {
         return this.transitionTail_.size();
      }

      public long getTransitionTail(int var1) {
         return this.transitionTail_.getLong(var1);
      }

      public AutomatonConstraintProto.Builder setTransitionTail(int var1, long var2) {
         this.ensureTransitionTailIsMutable();
         this.transitionTail_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder addTransitionTail(long var1) {
         this.ensureTransitionTailIsMutable();
         this.transitionTail_.addLong(var1);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder addAllTransitionTail(Iterable var1) {
         this.ensureTransitionTailIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.transitionTail_);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder clearTransitionTail() {
         this.transitionTail_ = AutomatonConstraintProto.emptyLongList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      private void ensureTransitionHeadIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.transitionHead_ = AutomatonConstraintProto.mutableCopy(this.transitionHead_);
            this.bitField0_ |= 4;
         }

      }

      public List getTransitionHeadList() {
         return (List)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.transitionHead_) : this.transitionHead_);
      }

      public int getTransitionHeadCount() {
         return this.transitionHead_.size();
      }

      public long getTransitionHead(int var1) {
         return this.transitionHead_.getLong(var1);
      }

      public AutomatonConstraintProto.Builder setTransitionHead(int var1, long var2) {
         this.ensureTransitionHeadIsMutable();
         this.transitionHead_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder addTransitionHead(long var1) {
         this.ensureTransitionHeadIsMutable();
         this.transitionHead_.addLong(var1);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder addAllTransitionHead(Iterable var1) {
         this.ensureTransitionHeadIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.transitionHead_);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder clearTransitionHead() {
         this.transitionHead_ = AutomatonConstraintProto.emptyLongList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      private void ensureTransitionLabelIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.transitionLabel_ = AutomatonConstraintProto.mutableCopy(this.transitionLabel_);
            this.bitField0_ |= 8;
         }

      }

      public List getTransitionLabelList() {
         return (List)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.transitionLabel_) : this.transitionLabel_);
      }

      public int getTransitionLabelCount() {
         return this.transitionLabel_.size();
      }

      public long getTransitionLabel(int var1) {
         return this.transitionLabel_.getLong(var1);
      }

      public AutomatonConstraintProto.Builder setTransitionLabel(int var1, long var2) {
         this.ensureTransitionLabelIsMutable();
         this.transitionLabel_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder addTransitionLabel(long var1) {
         this.ensureTransitionLabelIsMutable();
         this.transitionLabel_.addLong(var1);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder addAllTransitionLabel(Iterable var1) {
         this.ensureTransitionLabelIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.transitionLabel_);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder clearTransitionLabel() {
         this.transitionLabel_ = AutomatonConstraintProto.emptyLongList();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      private void ensureVarsIsMutable() {
         if ((this.bitField0_ & 16) == 0) {
            this.vars_ = AutomatonConstraintProto.mutableCopy(this.vars_);
            this.bitField0_ |= 16;
         }

      }

      public List getVarsList() {
         return (List)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.vars_) : this.vars_);
      }

      public int getVarsCount() {
         return this.vars_.size();
      }

      public int getVars(int var1) {
         return this.vars_.getInt(var1);
      }

      public AutomatonConstraintProto.Builder setVars(int var1, int var2) {
         this.ensureVarsIsMutable();
         this.vars_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder addVars(int var1) {
         this.ensureVarsIsMutable();
         this.vars_.addInt(var1);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder addAllVars(Iterable var1) {
         this.ensureVarsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.vars_);
         this.onChanged();
         return this;
      }

      public AutomatonConstraintProto.Builder clearVars() {
         this.vars_ = AutomatonConstraintProto.emptyIntList();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public final AutomatonConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AutomatonConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final AutomatonConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AutomatonConstraintProto.Builder)super.mergeUnknownFields(var1);
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
