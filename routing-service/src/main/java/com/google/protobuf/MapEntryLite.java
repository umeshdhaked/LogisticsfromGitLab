package com.google.protobuf;

import java.io.IOException;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

public class MapEntryLite {
   private static final int KEY_FIELD_NUMBER = 1;
   private static final int VALUE_FIELD_NUMBER = 2;
   private final MapEntryLite.Metadata metadata;
   private final Object key;
   private final Object value;

   private MapEntryLite(WireFormat.FieldType var1, Object var2, WireFormat.FieldType var3, Object var4) {
      this.metadata = new MapEntryLite.Metadata(var1, var2, var3, var4);
      this.key = var2;
      this.value = var4;
   }

   private MapEntryLite(MapEntryLite.Metadata var1, Object var2, Object var3) {
      this.metadata = var1;
      this.key = var2;
      this.value = var3;
   }

   public Object getKey() {
      return this.key;
   }

   public Object getValue() {
      return this.value;
   }

   public static MapEntryLite newDefaultInstance(WireFormat.FieldType var0, Object var1, WireFormat.FieldType var2, Object var3) {
      return new MapEntryLite(var0, var1, var2, var3);
   }

   static void writeTo(CodedOutputStream var0, MapEntryLite.Metadata var1, Object var2, Object var3) throws IOException {
      FieldSet.writeElement(var0, var1.keyType, 1, var2);
      FieldSet.writeElement(var0, var1.valueType, 2, var3);
   }

   static int computeSerializedSize(MapEntryLite.Metadata var0, Object var1, Object var2) {
      return FieldSet.computeElementSize(var0.keyType, 1, var1) + FieldSet.computeElementSize(var0.valueType, 2, var2);
   }

   static Object parseField(CodedInputStream var0, ExtensionRegistryLite var1, WireFormat.FieldType var2, Object var3) throws IOException {
      switch(var2) {
      case MESSAGE:
         MessageLite.Builder var4 = ((MessageLite)var3).toBuilder();
         var0.readMessage(var4, var1);
         return var4.buildPartial();
      case ENUM:
         return var0.readEnum();
      case GROUP:
         throw new RuntimeException("Groups are not allowed in maps.");
      default:
         return FieldSet.readPrimitiveField(var0, var2, true);
      }
   }

   public void serializeTo(CodedOutputStream var1, int var2, Object var3, Object var4) throws IOException {
      var1.writeTag(var2, 2);
      var1.writeUInt32NoTag(computeSerializedSize(this.metadata, var3, var4));
      writeTo(var1, this.metadata, var3, var4);
   }

   public int computeMessageSize(int var1, Object var2, Object var3) {
      return CodedOutputStream.computeTagSize(var1) + CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, var2, var3));
   }

   public Entry parseEntry(ByteString var1, ExtensionRegistryLite var2) throws IOException {
      return parseEntry(var1.newCodedInput(), this.metadata, var2);
   }

   static Entry parseEntry(CodedInputStream var0, MapEntryLite.Metadata var1, ExtensionRegistryLite var2) throws IOException {
      Object var3 = var1.defaultKey;
      Object var4 = var1.defaultValue;

      while(true) {
         int var5 = var0.readTag();
         if (var5 == 0) {
            break;
         }

         if (var5 == WireFormat.makeTag(1, var1.keyType.getWireType())) {
            var3 = parseField(var0, var2, var1.keyType, var3);
         } else if (var5 == WireFormat.makeTag(2, var1.valueType.getWireType())) {
            var4 = parseField(var0, var2, var1.valueType, var4);
         } else if (!var0.skipField(var5)) {
            break;
         }
      }

      return new SimpleImmutableEntry(var3, var4);
   }

   public void parseInto(MapFieldLite var1, CodedInputStream var2, ExtensionRegistryLite var3) throws IOException {
      int var4 = var2.readRawVarint32();
      int var5 = var2.pushLimit(var4);
      Object var6 = this.metadata.defaultKey;
      Object var7 = this.metadata.defaultValue;

      while(true) {
         int var8 = var2.readTag();
         if (var8 == 0) {
            break;
         }

         if (var8 == WireFormat.makeTag(1, this.metadata.keyType.getWireType())) {
            var6 = parseField(var2, var3, this.metadata.keyType, var6);
         } else if (var8 == WireFormat.makeTag(2, this.metadata.valueType.getWireType())) {
            var7 = parseField(var2, var3, this.metadata.valueType, var7);
         } else if (!var2.skipField(var8)) {
            break;
         }
      }

      var2.checkLastTagWas(0);
      var2.popLimit(var5);
      var1.put(var6, var7);
   }

   MapEntryLite.Metadata getMetadata() {
      return this.metadata;
   }

   static class Metadata {
      public final WireFormat.FieldType keyType;
      public final Object defaultKey;
      public final WireFormat.FieldType valueType;
      public final Object defaultValue;

      public Metadata(WireFormat.FieldType var1, Object var2, WireFormat.FieldType var3, Object var4) {
         this.keyType = var1;
         this.defaultKey = var2;
         this.valueType = var3;
         this.defaultValue = var4;
      }
   }
}
