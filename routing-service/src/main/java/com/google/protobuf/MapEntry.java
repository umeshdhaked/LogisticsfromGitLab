package com.google.protobuf;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public final class MapEntry extends AbstractMessage {
   private final Object key;
   private final Object value;
   private final MapEntry.Metadata metadata;
   private volatile int cachedSerializedSize;

   private MapEntry(Descriptors.Descriptor var1, WireFormat.FieldType var2, Object var3, WireFormat.FieldType var4, Object var5) {
      this.cachedSerializedSize = -1;
      this.key = var3;
      this.value = var5;
      this.metadata = new MapEntry.Metadata(var1, this, var2, var4);
   }

   private MapEntry(MapEntry.Metadata var1, Object var2, Object var3) {
      this.cachedSerializedSize = -1;
      this.key = var2;
      this.value = var3;
      this.metadata = var1;
   }

   private MapEntry(MapEntry.Metadata var1, CodedInputStream var2, ExtensionRegistryLite var3) throws InvalidProtocolBufferException {
      this.cachedSerializedSize = -1;

      try {
         this.metadata = var1;
         Entry var4 = MapEntryLite.parseEntry(var2, var1, var3);
         this.key = var4.getKey();
         this.value = var4.getValue();
      } catch (InvalidProtocolBufferException var5) {
         throw var5.setUnfinishedMessage(this);
      } catch (IOException var6) {
         throw (new InvalidProtocolBufferException(var6)).setUnfinishedMessage(this);
      }
   }

   public static MapEntry newDefaultInstance(Descriptors.Descriptor var0, WireFormat.FieldType var1, Object var2, WireFormat.FieldType var3, Object var4) {
      return new MapEntry(var0, var1, var2, var3, var4);
   }

   public Object getKey() {
      return this.key;
   }

   public Object getValue() {
      return this.value;
   }

   public int getSerializedSize() {
      if (this.cachedSerializedSize != -1) {
         return this.cachedSerializedSize;
      } else {
         int var1 = MapEntryLite.computeSerializedSize(this.metadata, this.key, this.value);
         this.cachedSerializedSize = var1;
         return var1;
      }
   }

   public void writeTo(CodedOutputStream var1) throws IOException {
      MapEntryLite.writeTo(var1, this.metadata, this.key, this.value);
   }

   public boolean isInitialized() {
      return isInitialized(this.metadata, this.value);
   }

   public Parser getParserForType() {
      return this.metadata.parser;
   }

   public MapEntry.Builder newBuilderForType() {
      return new MapEntry.Builder(this.metadata);
   }

   public MapEntry.Builder toBuilder() {
      return new MapEntry.Builder(this.metadata, this.key, this.value, true, true);
   }

   public MapEntry getDefaultInstanceForType() {
      return new MapEntry(this.metadata, this.metadata.defaultKey, this.metadata.defaultValue);
   }

   public Descriptors.Descriptor getDescriptorForType() {
      return this.metadata.descriptor;
   }

   public Map getAllFields() {
      TreeMap var1 = new TreeMap();
      Iterator var2 = this.metadata.descriptor.getFields().iterator();

      while(var2.hasNext()) {
         Descriptors.FieldDescriptor var3 = (Descriptors.FieldDescriptor)var2.next();
         if (this.hasField(var3)) {
            var1.put(var3, this.getField(var3));
         }
      }

      return Collections.unmodifiableMap(var1);
   }

   private void checkFieldDescriptor(Descriptors.FieldDescriptor var1) {
      if (var1.getContainingType() != this.metadata.descriptor) {
         throw new RuntimeException("Wrong FieldDescriptor \"" + var1.getFullName() + "\" used in message \"" + this.metadata.descriptor.getFullName());
      }
   }

   public boolean hasField(Descriptors.FieldDescriptor var1) {
      this.checkFieldDescriptor(var1);
      return true;
   }

   public Object getField(Descriptors.FieldDescriptor var1) {
      this.checkFieldDescriptor(var1);
      Object var2 = var1.getNumber() == 1 ? this.getKey() : this.getValue();
      if (var1.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
         var2 = var1.getEnumType().findValueByNumberCreatingIfUnknown((Integer)var2);
      }

      return var2;
   }

   public int getRepeatedFieldCount(Descriptors.FieldDescriptor var1) {
      throw new RuntimeException("There is no repeated field in a map entry message.");
   }

   public Object getRepeatedField(Descriptors.FieldDescriptor var1, int var2) {
      throw new RuntimeException("There is no repeated field in a map entry message.");
   }

   public UnknownFieldSet getUnknownFields() {
      return UnknownFieldSet.getDefaultInstance();
   }

   private static boolean isInitialized(MapEntry.Metadata var0, Object var1) {
      return var0.valueType.getJavaType() == WireFormat.JavaType.MESSAGE ? ((MessageLite)var1).isInitialized() : true;
   }

   final MapEntry.Metadata getMetadata() {
      return this.metadata;
   }

   // $FF: synthetic method
   MapEntry(MapEntry.Metadata var1, CodedInputStream var2, ExtensionRegistryLite var3, Object var4) throws InvalidProtocolBufferException {
      this(var1, var2, var3);
   }

   // $FF: synthetic method
   MapEntry(MapEntry.Metadata var1, Object var2, Object var3, Object var4) {
      this(var1, var2, var3);
   }

   public static class Builder extends AbstractMessage.Builder {
      private final MapEntry.Metadata metadata;
      private Object key;
      private Object value;
      private boolean hasKey;
      private boolean hasValue;

      private Builder(MapEntry.Metadata var1) {
         this(var1, var1.defaultKey, var1.defaultValue, false, false);
      }

      private Builder(MapEntry.Metadata var1, Object var2, Object var3, boolean var4, boolean var5) {
         this.metadata = var1;
         this.key = var2;
         this.value = var3;
         this.hasKey = var4;
         this.hasValue = var5;
      }

      public Object getKey() {
         return this.key;
      }

      public Object getValue() {
         return this.value;
      }

      public MapEntry.Builder setKey(Object var1) {
         this.key = var1;
         this.hasKey = true;
         return this;
      }

      public MapEntry.Builder clearKey() {
         this.key = this.metadata.defaultKey;
         this.hasKey = false;
         return this;
      }

      public MapEntry.Builder setValue(Object var1) {
         this.value = var1;
         this.hasValue = true;
         return this;
      }

      public MapEntry.Builder clearValue() {
         this.value = this.metadata.defaultValue;
         this.hasValue = false;
         return this;
      }

      public MapEntry build() {
         MapEntry var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MapEntry buildPartial() {
         return new MapEntry(this.metadata, this.key, this.value);
      }

      public Descriptors.Descriptor getDescriptorForType() {
         return this.metadata.descriptor;
      }

      private void checkFieldDescriptor(Descriptors.FieldDescriptor var1) {
         if (var1.getContainingType() != this.metadata.descriptor) {
            throw new RuntimeException("Wrong FieldDescriptor \"" + var1.getFullName() + "\" used in message \"" + this.metadata.descriptor.getFullName());
         }
      }

      public Message.Builder newBuilderForField(Descriptors.FieldDescriptor var1) {
         this.checkFieldDescriptor(var1);
         if (var1.getNumber() == 2 && var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            return ((Message)this.value).newBuilderForType();
         } else {
            throw new RuntimeException("\"" + var1.getFullName() + "\" is not a message value field.");
         }
      }

      public MapEntry.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         this.checkFieldDescriptor(var1);
         if (var1.getNumber() == 1) {
            this.setKey(var2);
         } else {
            if (var1.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
               var2 = ((Descriptors.EnumValueDescriptor)var2).getNumber();
            } else if (var1.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && var2 != null && !this.metadata.defaultValue.getClass().isInstance(var2)) {
               var2 = ((Message)this.metadata.defaultValue).toBuilder().mergeFrom((Message)var2).build();
            }

            this.setValue(var2);
         }

         return this;
      }

      public MapEntry.Builder clearField(Descriptors.FieldDescriptor var1) {
         this.checkFieldDescriptor(var1);
         if (var1.getNumber() == 1) {
            this.clearKey();
         } else {
            this.clearValue();
         }

         return this;
      }

      public MapEntry.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         throw new RuntimeException("There is no repeated field in a map entry message.");
      }

      public MapEntry.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         throw new RuntimeException("There is no repeated field in a map entry message.");
      }

      public MapEntry.Builder setUnknownFields(UnknownFieldSet var1) {
         return this;
      }

      public MapEntry getDefaultInstanceForType() {
         return new MapEntry(this.metadata, this.metadata.defaultKey, this.metadata.defaultValue);
      }

      public boolean isInitialized() {
         return MapEntry.isInitialized(this.metadata, this.value);
      }

      public Map getAllFields() {
         TreeMap var1 = new TreeMap();
         Iterator var2 = this.metadata.descriptor.getFields().iterator();

         while(var2.hasNext()) {
            Descriptors.FieldDescriptor var3 = (Descriptors.FieldDescriptor)var2.next();
            if (this.hasField(var3)) {
               var1.put(var3, this.getField(var3));
            }
         }

         return Collections.unmodifiableMap(var1);
      }

      public boolean hasField(Descriptors.FieldDescriptor var1) {
         this.checkFieldDescriptor(var1);
         return var1.getNumber() == 1 ? this.hasKey : this.hasValue;
      }

      public Object getField(Descriptors.FieldDescriptor var1) {
         this.checkFieldDescriptor(var1);
         Object var2 = var1.getNumber() == 1 ? this.getKey() : this.getValue();
         if (var1.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
            var2 = var1.getEnumType().findValueByNumberCreatingIfUnknown((Integer)var2);
         }

         return var2;
      }

      public int getRepeatedFieldCount(Descriptors.FieldDescriptor var1) {
         throw new RuntimeException("There is no repeated field in a map entry message.");
      }

      public Object getRepeatedField(Descriptors.FieldDescriptor var1, int var2) {
         throw new RuntimeException("There is no repeated field in a map entry message.");
      }

      public UnknownFieldSet getUnknownFields() {
         return UnknownFieldSet.getDefaultInstance();
      }

      public MapEntry.Builder clone() {
         return new MapEntry.Builder(this.metadata, this.key, this.value, this.hasKey, this.hasValue);
      }

      // $FF: synthetic method
      Builder(MapEntry.Metadata var1, Object var2) {
         this(var1);
      }

      // $FF: synthetic method
      Builder(MapEntry.Metadata var1, Object var2, Object var3, boolean var4, boolean var5, Object var6) {
         this(var1, var2, var3, var4, var5);
      }
   }

   private static final class Metadata extends MapEntryLite.Metadata {
      public final Descriptors.Descriptor descriptor;
      public final Parser parser;

      public Metadata(Descriptors.Descriptor var1, MapEntry var2, WireFormat.FieldType var3, WireFormat.FieldType var4) {
         super(var3, var2.key, var4, var2.value);
         this.descriptor = var1;
         this.parser = new AbstractParser() {
            public MapEntry parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
               return new MapEntry(Metadata.this, var1, var2);
            }
         };
      }
   }
}
