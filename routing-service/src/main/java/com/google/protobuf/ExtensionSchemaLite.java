package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class ExtensionSchemaLite extends ExtensionSchema {
   boolean hasExtensions(MessageLite var1) {
      return var1 instanceof GeneratedMessageLite.ExtendableMessage;
   }

   FieldSet getExtensions(Object var1) {
      return ((GeneratedMessageLite.ExtendableMessage)var1).extensions;
   }

   void setExtensions(Object var1, FieldSet var2) {
      ((GeneratedMessageLite.ExtendableMessage)var1).extensions = var2;
   }

   FieldSet getMutableExtensions(Object var1) {
      return ((GeneratedMessageLite.ExtendableMessage)var1).ensureExtensionsAreMutable();
   }

   void makeImmutable(Object var1) {
      this.getExtensions(var1).makeImmutable();
   }

   Object parseExtension(Reader var1, Object var2, ExtensionRegistryLite var3, FieldSet var4, Object var5, UnknownFieldSchema var6) throws IOException {
      GeneratedMessageLite.GeneratedExtension var7 = (GeneratedMessageLite.GeneratedExtension)var2;
      int var8 = var7.getNumber();
      Object var9;
      if (var7.descriptor.isRepeated() && var7.descriptor.isPacked()) {
         var9 = null;
         ArrayList var13;
         ArrayList var14;
         switch(var7.getLiteType()) {
         case DOUBLE:
            var13 = new ArrayList();
            var1.readDoubleList(var13);
            var14 = var13;
            break;
         case FLOAT:
            var13 = new ArrayList();
            var1.readFloatList(var13);
            var14 = var13;
            break;
         case INT64:
            var13 = new ArrayList();
            var1.readInt64List(var13);
            var14 = var13;
            break;
         case UINT64:
            var13 = new ArrayList();
            var1.readUInt64List(var13);
            var14 = var13;
            break;
         case INT32:
            var13 = new ArrayList();
            var1.readInt32List(var13);
            var14 = var13;
            break;
         case FIXED64:
            var13 = new ArrayList();
            var1.readFixed64List(var13);
            var14 = var13;
            break;
         case FIXED32:
            var13 = new ArrayList();
            var1.readFixed32List(var13);
            var14 = var13;
            break;
         case BOOL:
            var13 = new ArrayList();
            var1.readBoolList(var13);
            var14 = var13;
            break;
         case UINT32:
            var13 = new ArrayList();
            var1.readUInt32List(var13);
            var14 = var13;
            break;
         case SFIXED32:
            var13 = new ArrayList();
            var1.readSFixed32List(var13);
            var14 = var13;
            break;
         case SFIXED64:
            var13 = new ArrayList();
            var1.readSFixed64List(var13);
            var14 = var13;
            break;
         case SINT32:
            var13 = new ArrayList();
            var1.readSInt32List(var13);
            var14 = var13;
            break;
         case SINT64:
            var13 = new ArrayList();
            var1.readSInt64List(var13);
            var14 = var13;
            break;
         case ENUM:
            var13 = new ArrayList();
            var1.readEnumList(var13);
            var5 = SchemaUtil.filterUnknownEnumList(var8, var13, (Internal.EnumLiteMap)var7.descriptor.getEnumType(), var5, var6);
            var14 = var13;
            break;
         default:
            throw new IllegalStateException("Type cannot be packed: " + var7.descriptor.getLiteType());
         }

         var4.setField(var7.descriptor, var14);
      } else {
         var9 = null;
         if (var7.getLiteType() == WireFormat.FieldType.ENUM) {
            int var10 = var1.readInt32();
            Internal.EnumLite var11 = var7.descriptor.getEnumType().findValueByNumber(var10);
            if (var11 == null) {
               return SchemaUtil.storeUnknownEnum(var8, var10, var5, var6);
            }

            var9 = var10;
         } else {
            switch(var7.getLiteType()) {
            case DOUBLE:
               var9 = var1.readDouble();
               break;
            case FLOAT:
               var9 = var1.readFloat();
               break;
            case INT64:
               var9 = var1.readInt64();
               break;
            case UINT64:
               var9 = var1.readUInt64();
               break;
            case INT32:
               var9 = var1.readInt32();
               break;
            case FIXED64:
               var9 = var1.readFixed64();
               break;
            case FIXED32:
               var9 = var1.readFixed32();
               break;
            case BOOL:
               var9 = var1.readBool();
               break;
            case UINT32:
               var9 = var1.readUInt32();
               break;
            case SFIXED32:
               var9 = var1.readSFixed32();
               break;
            case SFIXED64:
               var9 = var1.readSFixed64();
               break;
            case SINT32:
               var9 = var1.readSInt32();
               break;
            case SINT64:
               var9 = var1.readSInt64();
               break;
            case ENUM:
               throw new IllegalStateException("Shouldn't reach here.");
            case BYTES:
               var9 = var1.readBytes();
               break;
            case STRING:
               var9 = var1.readString();
               break;
            case GROUP:
               var9 = var1.readGroup(var7.getMessageDefaultInstance().getClass(), var3);
               break;
            case MESSAGE:
               var9 = var1.readMessage(var7.getMessageDefaultInstance().getClass(), var3);
            }
         }

         if (var7.isRepeated()) {
            var4.addRepeatedField(var7.descriptor, var9);
         } else {
            switch(var7.getLiteType()) {
            case GROUP:
            case MESSAGE:
               Object var12 = var4.getField(var7.descriptor);
               if (var12 != null) {
                  var9 = Internal.mergeMessage(var12, var9);
               }
            default:
               var4.setField(var7.descriptor, var9);
            }
         }
      }

      return var5;
   }

   int extensionNumber(Entry var1) {
      GeneratedMessageLite.ExtensionDescriptor var2 = (GeneratedMessageLite.ExtensionDescriptor)var1.getKey();
      return var2.getNumber();
   }

   void serializeExtension(Writer var1, Entry var2) throws IOException {
      GeneratedMessageLite.ExtensionDescriptor var3 = (GeneratedMessageLite.ExtensionDescriptor)var2.getKey();
      if (var3.isRepeated()) {
         List var4;
         switch(var3.getLiteType()) {
         case DOUBLE:
            SchemaUtil.writeDoubleList(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case FLOAT:
            SchemaUtil.writeFloatList(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case INT64:
            SchemaUtil.writeInt64List(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case UINT64:
            SchemaUtil.writeUInt64List(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case INT32:
            SchemaUtil.writeInt32List(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case FIXED64:
            SchemaUtil.writeFixed64List(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case FIXED32:
            SchemaUtil.writeFixed32List(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case BOOL:
            SchemaUtil.writeBoolList(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case UINT32:
            SchemaUtil.writeUInt32List(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case SFIXED32:
            SchemaUtil.writeSFixed32List(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case SFIXED64:
            SchemaUtil.writeSFixed64List(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case SINT32:
            SchemaUtil.writeSInt32List(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case SINT64:
            SchemaUtil.writeSInt64List(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case ENUM:
            SchemaUtil.writeInt32List(var3.getNumber(), (List)var2.getValue(), var1, var3.isPacked());
            break;
         case BYTES:
            SchemaUtil.writeBytesList(var3.getNumber(), (List)var2.getValue(), var1);
            break;
         case STRING:
            SchemaUtil.writeStringList(var3.getNumber(), (List)var2.getValue(), var1);
            break;
         case GROUP:
            var4 = (List)var2.getValue();
            if (var4 != null && !var4.isEmpty()) {
               SchemaUtil.writeGroupList(var3.getNumber(), (List)var2.getValue(), var1, Protobuf.getInstance().schemaFor(var4.get(0).getClass()));
            }
            break;
         case MESSAGE:
            var4 = (List)var2.getValue();
            if (var4 != null && !var4.isEmpty()) {
               SchemaUtil.writeMessageList(var3.getNumber(), (List)var2.getValue(), var1, Protobuf.getInstance().schemaFor(var4.get(0).getClass()));
            }
         }
      } else {
         switch(var3.getLiteType()) {
         case DOUBLE:
            var1.writeDouble(var3.getNumber(), (Double)var2.getValue());
            break;
         case FLOAT:
            var1.writeFloat(var3.getNumber(), (Float)var2.getValue());
            break;
         case INT64:
            var1.writeInt64(var3.getNumber(), (Long)var2.getValue());
            break;
         case UINT64:
            var1.writeUInt64(var3.getNumber(), (Long)var2.getValue());
            break;
         case INT32:
            var1.writeInt32(var3.getNumber(), (Integer)var2.getValue());
            break;
         case FIXED64:
            var1.writeFixed64(var3.getNumber(), (Long)var2.getValue());
            break;
         case FIXED32:
            var1.writeFixed32(var3.getNumber(), (Integer)var2.getValue());
            break;
         case BOOL:
            var1.writeBool(var3.getNumber(), (Boolean)var2.getValue());
            break;
         case UINT32:
            var1.writeUInt32(var3.getNumber(), (Integer)var2.getValue());
            break;
         case SFIXED32:
            var1.writeSFixed32(var3.getNumber(), (Integer)var2.getValue());
            break;
         case SFIXED64:
            var1.writeSFixed64(var3.getNumber(), (Long)var2.getValue());
            break;
         case SINT32:
            var1.writeSInt32(var3.getNumber(), (Integer)var2.getValue());
            break;
         case SINT64:
            var1.writeSInt64(var3.getNumber(), (Long)var2.getValue());
            break;
         case ENUM:
            var1.writeInt32(var3.getNumber(), (Integer)var2.getValue());
            break;
         case BYTES:
            var1.writeBytes(var3.getNumber(), (ByteString)var2.getValue());
            break;
         case STRING:
            var1.writeString(var3.getNumber(), (String)var2.getValue());
            break;
         case GROUP:
            var1.writeGroup(var3.getNumber(), var2.getValue(), Protobuf.getInstance().schemaFor(var2.getValue().getClass()));
            break;
         case MESSAGE:
            var1.writeMessage(var3.getNumber(), var2.getValue(), Protobuf.getInstance().schemaFor(var2.getValue().getClass()));
         }
      }

   }

   Object findExtensionByNumber(ExtensionRegistryLite var1, MessageLite var2, int var3) {
      return var1.findLiteExtensionByNumber(var2, var3);
   }

   void parseLengthPrefixedMessageSetItem(Reader var1, Object var2, ExtensionRegistryLite var3, FieldSet var4) throws IOException {
      GeneratedMessageLite.GeneratedExtension var5 = (GeneratedMessageLite.GeneratedExtension)var2;
      Object var6 = var1.readMessage(var5.getMessageDefaultInstance().getClass(), var3);
      var4.setField(var5.descriptor, var6);
   }

   void parseMessageSetItem(ByteString var1, Object var2, ExtensionRegistryLite var3, FieldSet var4) throws IOException {
      GeneratedMessageLite.GeneratedExtension var5 = (GeneratedMessageLite.GeneratedExtension)var2;
      MessageLite var6 = var5.getMessageDefaultInstance().newBuilderForType().buildPartial();
      BinaryReader var7 = BinaryReader.newInstance(ByteBuffer.wrap(var1.toByteArray()), true);
      Protobuf.getInstance().mergeFrom(var6, var7, var3);
      var4.setField(var5.descriptor, var6);
      if (var7.getFieldNumber() != Integer.MAX_VALUE) {
         throw InvalidProtocolBufferException.invalidEndTag();
      }
   }
}
