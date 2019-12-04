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

public final class LocalSearchMetaheuristic extends GeneratedMessageV3 implements LocalSearchMetaheuristicOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized;
   private static final LocalSearchMetaheuristic DEFAULT_INSTANCE = new LocalSearchMetaheuristic();
   private static final Parser PARSER = new AbstractParser() {
      public LocalSearchMetaheuristic parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new LocalSearchMetaheuristic(var1, var2);
      }
   };

   private LocalSearchMetaheuristic(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private LocalSearchMetaheuristic() {
      this.memoizedIsInitialized = -1;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new LocalSearchMetaheuristic();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private LocalSearchMetaheuristic(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
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
      return RoutingEnums.internal_static_operations_research_LocalSearchMetaheuristic_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return RoutingEnums.internal_static_operations_research_LocalSearchMetaheuristic_fieldAccessorTable.ensureFieldAccessorsInitialized(LocalSearchMetaheuristic.class, LocalSearchMetaheuristic.Builder.class);
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
      } else if (!(var1 instanceof LocalSearchMetaheuristic)) {
         return super.equals(var1);
      } else {
         LocalSearchMetaheuristic var2 = (LocalSearchMetaheuristic)var1;
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

   public static LocalSearchMetaheuristic parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (LocalSearchMetaheuristic)PARSER.parseFrom(var0);
   }

   public static LocalSearchMetaheuristic parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (LocalSearchMetaheuristic)PARSER.parseFrom(var0, var1);
   }

   public static LocalSearchMetaheuristic parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (LocalSearchMetaheuristic)PARSER.parseFrom(var0);
   }

   public static LocalSearchMetaheuristic parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (LocalSearchMetaheuristic)PARSER.parseFrom(var0, var1);
   }

   public static LocalSearchMetaheuristic parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (LocalSearchMetaheuristic)PARSER.parseFrom(var0);
   }

   public static LocalSearchMetaheuristic parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (LocalSearchMetaheuristic)PARSER.parseFrom(var0, var1);
   }

   public static LocalSearchMetaheuristic parseFrom(InputStream var0) throws IOException {
      return (LocalSearchMetaheuristic)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LocalSearchMetaheuristic parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (LocalSearchMetaheuristic)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LocalSearchMetaheuristic parseDelimitedFrom(InputStream var0) throws IOException {
      return (LocalSearchMetaheuristic)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LocalSearchMetaheuristic parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (LocalSearchMetaheuristic)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LocalSearchMetaheuristic parseFrom(CodedInputStream var0) throws IOException {
      return (LocalSearchMetaheuristic)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LocalSearchMetaheuristic parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (LocalSearchMetaheuristic)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LocalSearchMetaheuristic.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LocalSearchMetaheuristic.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LocalSearchMetaheuristic.Builder newBuilder(LocalSearchMetaheuristic var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LocalSearchMetaheuristic.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LocalSearchMetaheuristic.Builder() : (new LocalSearchMetaheuristic.Builder()).mergeFrom(this);
   }

   protected LocalSearchMetaheuristic.Builder newBuilderForType(BuilderParent var1) {
      LocalSearchMetaheuristic.Builder var2 = new LocalSearchMetaheuristic.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static LocalSearchMetaheuristic getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public LocalSearchMetaheuristic getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   LocalSearchMetaheuristic(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   LocalSearchMetaheuristic(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements LocalSearchMetaheuristicOrBuilder {
      public static final Descriptor getDescriptor() {
         return RoutingEnums.internal_static_operations_research_LocalSearchMetaheuristic_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return RoutingEnums.internal_static_operations_research_LocalSearchMetaheuristic_fieldAccessorTable.ensureFieldAccessorsInitialized(LocalSearchMetaheuristic.class, LocalSearchMetaheuristic.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LocalSearchMetaheuristic.alwaysUseFieldBuilders) {
         }

      }

      public LocalSearchMetaheuristic.Builder clear() {
         super.clear();
         return this;
      }

      public Descriptor getDescriptorForType() {
         return RoutingEnums.internal_static_operations_research_LocalSearchMetaheuristic_descriptor;
      }

      public LocalSearchMetaheuristic getDefaultInstanceForType() {
         return LocalSearchMetaheuristic.getDefaultInstance();
      }

      public LocalSearchMetaheuristic build() {
         LocalSearchMetaheuristic var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LocalSearchMetaheuristic buildPartial() {
         LocalSearchMetaheuristic var1 = new LocalSearchMetaheuristic(this);
         this.onBuilt();
         return var1;
      }

      public LocalSearchMetaheuristic.Builder clone() {
         return (LocalSearchMetaheuristic.Builder)super.clone();
      }

      public LocalSearchMetaheuristic.Builder setField(FieldDescriptor var1, Object var2) {
         return (LocalSearchMetaheuristic.Builder)super.setField(var1, var2);
      }

      public LocalSearchMetaheuristic.Builder clearField(FieldDescriptor var1) {
         return (LocalSearchMetaheuristic.Builder)super.clearField(var1);
      }

      public LocalSearchMetaheuristic.Builder clearOneof(OneofDescriptor var1) {
         return (LocalSearchMetaheuristic.Builder)super.clearOneof(var1);
      }

      public LocalSearchMetaheuristic.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (LocalSearchMetaheuristic.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LocalSearchMetaheuristic.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (LocalSearchMetaheuristic.Builder)super.addRepeatedField(var1, var2);
      }

      public LocalSearchMetaheuristic.Builder mergeFrom(Message var1) {
         if (var1 instanceof LocalSearchMetaheuristic) {
            return this.mergeFrom((LocalSearchMetaheuristic)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public LocalSearchMetaheuristic.Builder mergeFrom(LocalSearchMetaheuristic var1) {
         if (var1 == LocalSearchMetaheuristic.getDefaultInstance()) {
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

      public LocalSearchMetaheuristic.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         LocalSearchMetaheuristic var3 = null;

         try {
            var3 = (LocalSearchMetaheuristic)LocalSearchMetaheuristic.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (LocalSearchMetaheuristic)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public final LocalSearchMetaheuristic.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LocalSearchMetaheuristic.Builder)super.setUnknownFields(var1);
      }

      public final LocalSearchMetaheuristic.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LocalSearchMetaheuristic.Builder)super.mergeUnknownFields(var1);
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
      AUTOMATIC(6),
      GREEDY_DESCENT(1),
      GUIDED_LOCAL_SEARCH(2),
      SIMULATED_ANNEALING(3),
      TABU_SEARCH(4),
      GENERIC_TABU_SEARCH(5),
      UNRECOGNIZED(-1);

      public static final int UNSET_VALUE = 0;
      public static final int AUTOMATIC_VALUE = 6;
      public static final int GREEDY_DESCENT_VALUE = 1;
      public static final int GUIDED_LOCAL_SEARCH_VALUE = 2;
      public static final int SIMULATED_ANNEALING_VALUE = 3;
      public static final int TABU_SEARCH_VALUE = 4;
      public static final int GENERIC_TABU_SEARCH_VALUE = 5;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public LocalSearchMetaheuristic.Value findValueByNumber(int var1) {
            return LocalSearchMetaheuristic.Value.forNumber(var1);
         }
      };
      private static final LocalSearchMetaheuristic.Value[] VALUES = values();
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
      public static LocalSearchMetaheuristic.Value valueOf(int var0) {
         return forNumber(var0);
      }

      public static LocalSearchMetaheuristic.Value forNumber(int var0) {
         switch(var0) {
         case 0:
            return UNSET;
         case 1:
            return GREEDY_DESCENT;
         case 2:
            return GUIDED_LOCAL_SEARCH;
         case 3:
            return SIMULATED_ANNEALING;
         case 4:
            return TABU_SEARCH;
         case 5:
            return GENERIC_TABU_SEARCH;
         case 6:
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
         return (EnumDescriptor)LocalSearchMetaheuristic.getDescriptor().getEnumTypes().get(0);
      }

      public static LocalSearchMetaheuristic.Value valueOf(EnumValueDescriptor var0) {
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
