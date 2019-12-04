package com.google.ortools.constraintsolver;

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
import com.google.protobuf.Internal.EnumLiteMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class FirstSolutionStrategy extends GeneratedMessageV3 implements FirstSolutionStrategyOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized;
   private static final FirstSolutionStrategy DEFAULT_INSTANCE = new FirstSolutionStrategy();
   private static final Parser PARSER = new AbstractParser() {
      public FirstSolutionStrategy parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new FirstSolutionStrategy(var1, var2);
      }
   };

   private FirstSolutionStrategy(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private FirstSolutionStrategy() {
      this.memoizedIsInitialized = -1;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new FirstSolutionStrategy();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private FirstSolutionStrategy(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
      return RoutingEnums.internal_static_operations_research_FirstSolutionStrategy_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return RoutingEnums.internal_static_operations_research_FirstSolutionStrategy_fieldAccessorTable.ensureFieldAccessorsInitialized(FirstSolutionStrategy.class, FirstSolutionStrategy.Builder.class);
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
      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         byte var2 = 0;
         var1 = var2 + this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof FirstSolutionStrategy)) {
         return super.equals(var1);
      } else {
         FirstSolutionStrategy var2 = (FirstSolutionStrategy)var1;
         return this.unknownFields.equals(var2.unknownFields);
      }
   }

   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      } else {
         byte var1 = 41;
         int var2 = 19 * var1 + getDescriptor().hashCode();
         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static FirstSolutionStrategy parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (FirstSolutionStrategy)PARSER.parseFrom(var0);
   }

   public static FirstSolutionStrategy parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (FirstSolutionStrategy)PARSER.parseFrom(var0, var1);
   }

   public static FirstSolutionStrategy parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (FirstSolutionStrategy)PARSER.parseFrom(var0);
   }

   public static FirstSolutionStrategy parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (FirstSolutionStrategy)PARSER.parseFrom(var0, var1);
   }

   public static FirstSolutionStrategy parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (FirstSolutionStrategy)PARSER.parseFrom(var0);
   }

   public static FirstSolutionStrategy parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (FirstSolutionStrategy)PARSER.parseFrom(var0, var1);
   }

   public static FirstSolutionStrategy parseFrom(InputStream var0) throws IOException {
      return (FirstSolutionStrategy)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FirstSolutionStrategy parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (FirstSolutionStrategy)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FirstSolutionStrategy parseDelimitedFrom(InputStream var0) throws IOException {
      return (FirstSolutionStrategy)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FirstSolutionStrategy parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (FirstSolutionStrategy)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FirstSolutionStrategy parseFrom(CodedInputStream var0) throws IOException {
      return (FirstSolutionStrategy)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FirstSolutionStrategy parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (FirstSolutionStrategy)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FirstSolutionStrategy.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FirstSolutionStrategy.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FirstSolutionStrategy.Builder newBuilder(FirstSolutionStrategy var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FirstSolutionStrategy.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FirstSolutionStrategy.Builder() : (new FirstSolutionStrategy.Builder()).mergeFrom(this);
   }

   protected FirstSolutionStrategy.Builder newBuilderForType(BuilderParent var1) {
      FirstSolutionStrategy.Builder var2 = new FirstSolutionStrategy.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static FirstSolutionStrategy getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public FirstSolutionStrategy getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   FirstSolutionStrategy(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   FirstSolutionStrategy(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements FirstSolutionStrategyOrBuilder {
      public static final Descriptor getDescriptor() {
         return RoutingEnums.internal_static_operations_research_FirstSolutionStrategy_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return RoutingEnums.internal_static_operations_research_FirstSolutionStrategy_fieldAccessorTable.ensureFieldAccessorsInitialized(FirstSolutionStrategy.class, FirstSolutionStrategy.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (FirstSolutionStrategy.alwaysUseFieldBuilders) {
         }

      }

      public FirstSolutionStrategy.Builder clear() {
         super.clear();
         return this;
      }

      public Descriptor getDescriptorForType() {
         return RoutingEnums.internal_static_operations_research_FirstSolutionStrategy_descriptor;
      }

      public FirstSolutionStrategy getDefaultInstanceForType() {
         return FirstSolutionStrategy.getDefaultInstance();
      }

      public FirstSolutionStrategy build() {
         FirstSolutionStrategy var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FirstSolutionStrategy buildPartial() {
         FirstSolutionStrategy var1 = new FirstSolutionStrategy(this);
         this.onBuilt();
         return var1;
      }

      public FirstSolutionStrategy.Builder clone() {
         return (FirstSolutionStrategy.Builder)super.clone();
      }

      public FirstSolutionStrategy.Builder setField(FieldDescriptor var1, Object var2) {
         return (FirstSolutionStrategy.Builder)super.setField(var1, var2);
      }

      public FirstSolutionStrategy.Builder clearField(FieldDescriptor var1) {
         return (FirstSolutionStrategy.Builder)super.clearField(var1);
      }

      public FirstSolutionStrategy.Builder clearOneof(OneofDescriptor var1) {
         return (FirstSolutionStrategy.Builder)super.clearOneof(var1);
      }

      public FirstSolutionStrategy.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (FirstSolutionStrategy.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FirstSolutionStrategy.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (FirstSolutionStrategy.Builder)super.addRepeatedField(var1, var2);
      }

      public FirstSolutionStrategy.Builder mergeFrom(Message var1) {
         if (var1 instanceof FirstSolutionStrategy) {
            return this.mergeFrom((FirstSolutionStrategy)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public FirstSolutionStrategy.Builder mergeFrom(FirstSolutionStrategy var1) {
         if (var1 == FirstSolutionStrategy.getDefaultInstance()) {
            return this;
         } else {
            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public FirstSolutionStrategy.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         FirstSolutionStrategy var3 = null;

         try {
            var3 = (FirstSolutionStrategy)FirstSolutionStrategy.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (FirstSolutionStrategy)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public final FirstSolutionStrategy.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FirstSolutionStrategy.Builder)super.setUnknownFields(var1);
      }

      public final FirstSolutionStrategy.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FirstSolutionStrategy.Builder)super.mergeUnknownFields(var1);
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

   public static enum Value implements ProtocolMessageEnum {
      UNSET(0),
      AUTOMATIC(15),
      PATH_CHEAPEST_ARC(3),
      PATH_MOST_CONSTRAINED_ARC(4),
      EVALUATOR_STRATEGY(5),
      SAVINGS(10),
      SWEEP(11),
      CHRISTOFIDES(13),
      ALL_UNPERFORMED(6),
      BEST_INSERTION(7),
      PARALLEL_CHEAPEST_INSERTION(8),
      SEQUENTIAL_CHEAPEST_INSERTION(14),
      LOCAL_CHEAPEST_INSERTION(9),
      GLOBAL_CHEAPEST_ARC(1),
      LOCAL_CHEAPEST_ARC(2),
      FIRST_UNBOUND_MIN_VALUE(12),
      UNRECOGNIZED(-1);

      public static final int UNSET_VALUE = 0;
      public static final int AUTOMATIC_VALUE = 15;
      public static final int PATH_CHEAPEST_ARC_VALUE = 3;
      public static final int PATH_MOST_CONSTRAINED_ARC_VALUE = 4;
      public static final int EVALUATOR_STRATEGY_VALUE = 5;
      public static final int SAVINGS_VALUE = 10;
      public static final int SWEEP_VALUE = 11;
      public static final int CHRISTOFIDES_VALUE = 13;
      public static final int ALL_UNPERFORMED_VALUE = 6;
      public static final int BEST_INSERTION_VALUE = 7;
      public static final int PARALLEL_CHEAPEST_INSERTION_VALUE = 8;
      public static final int SEQUENTIAL_CHEAPEST_INSERTION_VALUE = 14;
      public static final int LOCAL_CHEAPEST_INSERTION_VALUE = 9;
      public static final int GLOBAL_CHEAPEST_ARC_VALUE = 1;
      public static final int LOCAL_CHEAPEST_ARC_VALUE = 2;
      public static final int FIRST_UNBOUND_MIN_VALUE_VALUE = 12;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public FirstSolutionStrategy.Value findValueByNumber(int var1) {
            return FirstSolutionStrategy.Value.forNumber(var1);
         }
      };
      private static final FirstSolutionStrategy.Value[] VALUES = values();
      private final int value;

      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      /** @deprecated */
      @Deprecated
      public static FirstSolutionStrategy.Value valueOf(int var0) {
         return forNumber(var0);
      }

      public static FirstSolutionStrategy.Value forNumber(int var0) {
         switch(var0) {
         case 0:
            return UNSET;
         case 1:
            return GLOBAL_CHEAPEST_ARC;
         case 2:
            return LOCAL_CHEAPEST_ARC;
         case 3:
            return PATH_CHEAPEST_ARC;
         case 4:
            return PATH_MOST_CONSTRAINED_ARC;
         case 5:
            return EVALUATOR_STRATEGY;
         case 6:
            return ALL_UNPERFORMED;
         case 7:
            return BEST_INSERTION;
         case 8:
            return PARALLEL_CHEAPEST_INSERTION;
         case 9:
            return LOCAL_CHEAPEST_INSERTION;
         case 10:
            return SAVINGS;
         case 11:
            return SWEEP;
         case 12:
            return FIRST_UNBOUND_MIN_VALUE;
         case 13:
            return CHRISTOFIDES;
         case 14:
            return SEQUENTIAL_CHEAPEST_INSERTION;
         case 15:
            return AUTOMATIC;
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
         return (EnumDescriptor)FirstSolutionStrategy.getDescriptor().getEnumTypes().get(0);
      }

      public static FirstSolutionStrategy.Value valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      private Value(int var3) {
         this.value = var3;
      }
   }
}
