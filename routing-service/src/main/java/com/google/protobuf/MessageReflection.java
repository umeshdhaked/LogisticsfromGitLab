package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

class MessageReflection {
   static void writeMessageTo(Message var0, Map var1, CodedOutputStream var2, boolean var3) throws IOException {
      boolean var4 = var0.getDescriptorForType().getOptions().getMessageSetWireFormat();
      Iterator var5;
      if (var3) {
         var1 = new TreeMap((Map)var1);
         var5 = var0.getDescriptorForType().getFields().iterator();

         while(var5.hasNext()) {
            Descriptors.FieldDescriptor var6 = (Descriptors.FieldDescriptor)var5.next();
            if (var6.isRequired() && !((Map)var1).containsKey(var6)) {
               ((Map)var1).put(var6, var0.getField(var6));
            }
         }
      }

      var5 = ((Map)var1).entrySet().iterator();

      while(true) {
         while(var5.hasNext()) {
            Entry var10 = (Entry)var5.next();
            Descriptors.FieldDescriptor var7 = (Descriptors.FieldDescriptor)var10.getKey();
            Object var8 = var10.getValue();
            if (var4 && var7.isExtension() && var7.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !var7.isRepeated()) {
               var2.writeMessageSetExtension(var7.getNumber(), (Message)var8);
            } else {
               FieldSet.writeField(var7, var8, var2);
            }
         }

         UnknownFieldSet var9 = var0.getUnknownFields();
         if (var4) {
            var9.writeAsMessageSetTo(var2);
         } else {
            var9.writeTo(var2);
         }

         return;
      }
   }

   static int getSerializedSize(Message var0, Map var1) {
      int var2 = 0;
      boolean var3 = var0.getDescriptorForType().getOptions().getMessageSetWireFormat();
      Iterator var4 = var1.entrySet().iterator();

      while(true) {
         while(var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            Descriptors.FieldDescriptor var6 = (Descriptors.FieldDescriptor)var5.getKey();
            Object var7 = var5.getValue();
            if (var3 && var6.isExtension() && var6.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && !var6.isRepeated()) {
               var2 += CodedOutputStream.computeMessageSetExtensionSize(var6.getNumber(), (Message)var7);
            } else {
               var2 += FieldSet.computeFieldSize(var6, var7);
            }
         }

         UnknownFieldSet var8 = var0.getUnknownFields();
         if (var3) {
            var2 += var8.getSerializedSizeAsMessageSet();
         } else {
            var2 += var8.getSerializedSize();
         }

         return var2;
      }
   }

   static String delimitWithCommas(List var0) {
      StringBuilder var1 = new StringBuilder();

      String var3;
      for(Iterator var2 = var0.iterator(); var2.hasNext(); var1.append(var3)) {
         var3 = (String)var2.next();
         if (var1.length() > 0) {
            var1.append(", ");
         }
      }

      return var1.toString();
   }

   static boolean isInitialized(MessageOrBuilder var0) {
      Iterator var1 = var0.getDescriptorForType().getFields().iterator();

      while(var1.hasNext()) {
         Descriptors.FieldDescriptor var2 = (Descriptors.FieldDescriptor)var1.next();
         if (var2.isRequired() && !var0.hasField(var2)) {
            return false;
         }
      }

      var1 = var0.getAllFields().entrySet().iterator();

      while(true) {
         while(true) {
            Descriptors.FieldDescriptor var3;
            Entry var6;
            do {
               if (!var1.hasNext()) {
                  return true;
               }

               var6 = (Entry)var1.next();
               var3 = (Descriptors.FieldDescriptor)var6.getKey();
            } while(var3.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE);

            if (var3.isRepeated()) {
               Iterator var4 = ((List)var6.getValue()).iterator();

               while(var4.hasNext()) {
                  Message var5 = (Message)var4.next();
                  if (!var5.isInitialized()) {
                     return false;
                  }
               }
            } else if (!((Message)var6.getValue()).isInitialized()) {
               return false;
            }
         }
      }
   }

   private static String subMessagePrefix(String var0, Descriptors.FieldDescriptor var1, int var2) {
      StringBuilder var3 = new StringBuilder(var0);
      if (var1.isExtension()) {
         var3.append('(').append(var1.getFullName()).append(')');
      } else {
         var3.append(var1.getName());
      }

      if (var2 != -1) {
         var3.append('[').append(var2).append(']');
      }

      var3.append('.');
      return var3.toString();
   }

   private static void findMissingFields(MessageOrBuilder var0, String var1, List var2) {
      Iterator var3 = var0.getDescriptorForType().getFields().iterator();

      while(var3.hasNext()) {
         Descriptors.FieldDescriptor var4 = (Descriptors.FieldDescriptor)var3.next();
         if (var4.isRequired() && !var0.hasField(var4)) {
            var2.add(var1 + var4.getName());
         }
      }

      var3 = var0.getAllFields().entrySet().iterator();

      while(true) {
         while(true) {
            Descriptors.FieldDescriptor var5;
            Object var6;
            do {
               if (!var3.hasNext()) {
                  return;
               }

               Entry var10 = (Entry)var3.next();
               var5 = (Descriptors.FieldDescriptor)var10.getKey();
               var6 = var10.getValue();
            } while(var5.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE);

            if (var5.isRepeated()) {
               int var7 = 0;
               Iterator var8 = ((List)var6).iterator();

               while(var8.hasNext()) {
                  Object var9 = var8.next();
                  findMissingFields((MessageOrBuilder)var9, subMessagePrefix(var1, var5, var7++), var2);
               }
            } else if (var0.hasField(var5)) {
               findMissingFields((MessageOrBuilder)var6, subMessagePrefix(var1, var5, -1), var2);
            }
         }
      }
   }

   static List findMissingFields(MessageOrBuilder var0) {
      ArrayList var1 = new ArrayList();
      findMissingFields(var0, "", var1);
      return var1;
   }

   static boolean mergeFieldFrom(CodedInputStream var0, UnknownFieldSet.Builder var1, ExtensionRegistryLite var2, Descriptors.Descriptor var3, MessageReflection.MergeTarget var4, int var5) throws IOException {
      if (var3.getOptions().getMessageSetWireFormat() && var5 == WireFormat.MESSAGE_SET_ITEM_TAG) {
         mergeMessageSetExtensionFromCodedStream(var0, var1, var2, var3, var4);
         return true;
      } else {
         int var6 = WireFormat.getTagWireType(var5);
         int var7 = WireFormat.getTagFieldNumber(var5);
         Message var9 = null;
         Descriptors.FieldDescriptor var8;
         if (var3.isExtensionNumber(var7)) {
            if (var2 instanceof ExtensionRegistry) {
               ExtensionRegistry.ExtensionInfo var10 = var4.findExtensionByNumber((ExtensionRegistry)var2, var3, var7);
               if (var10 == null) {
                  var8 = null;
               } else {
                  var8 = var10.descriptor;
                  var9 = var10.defaultInstance;
                  if (var9 == null && var8.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                     throw new IllegalStateException("Message-typed extension lacked default instance: " + var8.getFullName());
                  }
               }
            } else {
               var8 = null;
            }
         } else if (var4.getContainerType() == MessageReflection.MergeTarget.ContainerType.MESSAGE) {
            var8 = var3.findFieldByNumber(var7);
         } else {
            var8 = null;
         }

         boolean var16 = false;
         boolean var11 = false;
         if (var8 == null) {
            var16 = true;
         } else if (var6 == FieldSet.getWireFormatForFieldType(var8.getLiteType(), false)) {
            var11 = false;
         } else if (var8.isPackable() && var6 == FieldSet.getWireFormatForFieldType(var8.getLiteType(), true)) {
            var11 = true;
         } else {
            var16 = true;
         }

         if (var16) {
            return var1 != null ? var1.mergeFieldFrom(var5, var0) : var0.skipField(var5);
         } else {
            int var13;
            if (var11) {
               int var12 = var0.readRawVarint32();
               var13 = var0.pushLimit(var12);
               if (var8.getLiteType() == WireFormat.FieldType.ENUM) {
                  while(var0.getBytesUntilLimit() > 0) {
                     int var18 = var0.readEnum();
                     if (var8.getFile().supportsUnknownEnumValue()) {
                        var4.addRepeatedField(var8, var8.getEnumType().findValueByNumberCreatingIfUnknown(var18));
                     } else {
                        Descriptors.EnumValueDescriptor var15 = var8.getEnumType().findValueByNumber(var18);
                        if (var15 == null) {
                           if (var1 != null) {
                              var1.mergeVarintField(var7, var18);
                           }
                        } else {
                           var4.addRepeatedField(var8, var15);
                        }
                     }
                  }
               } else {
                  while(var0.getBytesUntilLimit() > 0) {
                     Object var14 = WireFormat.readPrimitiveField(var0, var8.getLiteType(), var4.getUtf8Validation(var8));
                     var4.addRepeatedField(var8, var14);
                  }
               }

               var0.popLimit(var13);
            } else {
               Object var17;
               switch(var8.getType()) {
               case GROUP:
                  var17 = var4.parseGroup(var0, var2, var8, var9);
                  break;
               case MESSAGE:
                  var17 = var4.parseMessage(var0, var2, var8, var9);
                  break;
               case ENUM:
                  var13 = var0.readEnum();
                  if (var8.getFile().supportsUnknownEnumValue()) {
                     var17 = var8.getEnumType().findValueByNumberCreatingIfUnknown(var13);
                  } else {
                     var17 = var8.getEnumType().findValueByNumber(var13);
                     if (var17 == null) {
                        if (var1 != null) {
                           var1.mergeVarintField(var7, var13);
                        }

                        return true;
                     }
                  }
                  break;
               default:
                  var17 = WireFormat.readPrimitiveField(var0, var8.getLiteType(), var4.getUtf8Validation(var8));
               }

               if (var8.isRepeated()) {
                  var4.addRepeatedField(var8, var17);
               } else {
                  var4.setField(var8, var17);
               }
            }

            return true;
         }
      }
   }

   private static void mergeMessageSetExtensionFromCodedStream(CodedInputStream var0, UnknownFieldSet.Builder var1, ExtensionRegistryLite var2, Descriptors.Descriptor var3, MessageReflection.MergeTarget var4) throws IOException {
      int var5 = 0;
      ByteString var6 = null;
      ExtensionRegistry.ExtensionInfo var7 = null;

      while(true) {
         int var8 = var0.readTag();
         if (var8 == 0) {
            break;
         }

         if (var8 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
            var5 = var0.readUInt32();
            if (var5 != 0 && var2 instanceof ExtensionRegistry) {
               var7 = var4.findExtensionByNumber((ExtensionRegistry)var2, var3, var5);
            }
         } else if (var8 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
            if (var5 != 0 && var7 != null && ExtensionRegistryLite.isEagerlyParseMessageSets()) {
               eagerlyMergeMessageSetExtension(var0, var7, var2, var4);
               var6 = null;
            } else {
               var6 = var0.readBytes();
            }
         } else if (!var0.skipField(var8)) {
            break;
         }
      }

      var0.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
      if (var6 != null && var5 != 0) {
         if (var7 != null) {
            mergeMessageSetExtensionFromBytes(var6, var7, var2, var4);
         } else if (var6 != null && var1 != null) {
            var1.mergeField(var5, UnknownFieldSet.Field.newBuilder().addLengthDelimited(var6).build());
         }
      }

   }

   private static void mergeMessageSetExtensionFromBytes(ByteString var0, ExtensionRegistry.ExtensionInfo var1, ExtensionRegistryLite var2, MessageReflection.MergeTarget var3) throws IOException {
      Descriptors.FieldDescriptor var4 = var1.descriptor;
      boolean var5 = var3.hasField(var4);
      if (!var5 && !ExtensionRegistryLite.isEagerlyParseMessageSets()) {
         LazyField var7 = new LazyField(var1.defaultInstance, var2, var0);
         var3.setField(var4, var7);
      } else {
         Object var6 = var3.parseMessageFromBytes(var0, var2, var4, var1.defaultInstance);
         var3.setField(var4, var6);
      }

   }

   private static void eagerlyMergeMessageSetExtension(CodedInputStream var0, ExtensionRegistry.ExtensionInfo var1, ExtensionRegistryLite var2, MessageReflection.MergeTarget var3) throws IOException {
      Descriptors.FieldDescriptor var4 = var1.descriptor;
      Object var5 = var3.parseMessage(var0, var2, var4, var1.defaultInstance);
      var3.setField(var4, var5);
   }

   static class ExtensionAdapter implements MessageReflection.MergeTarget {
      private final FieldSet extensions;

      ExtensionAdapter(FieldSet var1) {
         this.extensions = var1;
      }

      public Descriptors.Descriptor getDescriptorForType() {
         throw new UnsupportedOperationException("getDescriptorForType() called on FieldSet object");
      }

      public Object getField(Descriptors.FieldDescriptor var1) {
         return this.extensions.getField(var1);
      }

      public boolean hasField(Descriptors.FieldDescriptor var1) {
         return this.extensions.hasField(var1);
      }

      public MessageReflection.MergeTarget setField(Descriptors.FieldDescriptor var1, Object var2) {
         this.extensions.setField(var1, var2);
         return this;
      }

      public MessageReflection.MergeTarget clearField(Descriptors.FieldDescriptor var1) {
         this.extensions.clearField(var1);
         return this;
      }

      public MessageReflection.MergeTarget setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         this.extensions.setRepeatedField(var1, var2, var3);
         return this;
      }

      public MessageReflection.MergeTarget addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         this.extensions.addRepeatedField(var1, var2);
         return this;
      }

      public boolean hasOneof(Descriptors.OneofDescriptor var1) {
         return false;
      }

      public MessageReflection.MergeTarget clearOneof(Descriptors.OneofDescriptor var1) {
         return this;
      }

      public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor var1) {
         return null;
      }

      public MessageReflection.MergeTarget.ContainerType getContainerType() {
         return MessageReflection.MergeTarget.ContainerType.EXTENSION_SET;
      }

      public ExtensionRegistry.ExtensionInfo findExtensionByName(ExtensionRegistry var1, String var2) {
         return var1.findImmutableExtensionByName(var2);
      }

      public ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry var1, Descriptors.Descriptor var2, int var3) {
         return var1.findImmutableExtensionByNumber(var2, var3);
      }

      public Object parseGroup(CodedInputStream var1, ExtensionRegistryLite var2, Descriptors.FieldDescriptor var3, Message var4) throws IOException {
         Message.Builder var5 = var4.newBuilderForType();
         if (!var3.isRepeated()) {
            Message var6 = (Message)this.getField(var3);
            if (var6 != null) {
               var5.mergeFrom(var6);
            }
         }

         var1.readGroup(var3.getNumber(), (MessageLite.Builder)var5, var2);
         return var5.buildPartial();
      }

      public Object parseMessage(CodedInputStream var1, ExtensionRegistryLite var2, Descriptors.FieldDescriptor var3, Message var4) throws IOException {
         Message.Builder var5 = var4.newBuilderForType();
         if (!var3.isRepeated()) {
            Message var6 = (Message)this.getField(var3);
            if (var6 != null) {
               var5.mergeFrom(var6);
            }
         }

         var1.readMessage((MessageLite.Builder)var5, var2);
         return var5.buildPartial();
      }

      public Object parseMessageFromBytes(ByteString var1, ExtensionRegistryLite var2, Descriptors.FieldDescriptor var3, Message var4) throws IOException {
         Message.Builder var5 = var4.newBuilderForType();
         if (!var3.isRepeated()) {
            Message var6 = (Message)this.getField(var3);
            if (var6 != null) {
               var5.mergeFrom(var6);
            }
         }

         var5.mergeFrom(var1, var2);
         return var5.buildPartial();
      }

      public MessageReflection.MergeTarget newMergeTargetForField(Descriptors.FieldDescriptor var1, Message var2) {
         throw new UnsupportedOperationException("newMergeTargetForField() called on FieldSet object");
      }

      public MessageReflection.MergeTarget newEmptyTargetForField(Descriptors.FieldDescriptor var1, Message var2) {
         throw new UnsupportedOperationException("newEmptyTargetForField() called on FieldSet object");
      }

      public WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor var1) {
         return var1.needsUtf8Check() ? WireFormat.Utf8Validation.STRICT : WireFormat.Utf8Validation.LOOSE;
      }

      public Object finish() {
         throw new UnsupportedOperationException("finish() called on FieldSet object");
      }
   }

   static class BuilderAdapter implements MessageReflection.MergeTarget {
      private final Message.Builder builder;

      public Descriptors.Descriptor getDescriptorForType() {
         return this.builder.getDescriptorForType();
      }

      public BuilderAdapter(Message.Builder var1) {
         this.builder = var1;
      }

      public Object getField(Descriptors.FieldDescriptor var1) {
         return this.builder.getField(var1);
      }

      public boolean hasField(Descriptors.FieldDescriptor var1) {
         return this.builder.hasField(var1);
      }

      public MessageReflection.MergeTarget setField(Descriptors.FieldDescriptor var1, Object var2) {
         this.builder.setField(var1, var2);
         return this;
      }

      public MessageReflection.MergeTarget clearField(Descriptors.FieldDescriptor var1) {
         this.builder.clearField(var1);
         return this;
      }

      public MessageReflection.MergeTarget setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         this.builder.setRepeatedField(var1, var2, var3);
         return this;
      }

      public MessageReflection.MergeTarget addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         this.builder.addRepeatedField(var1, var2);
         return this;
      }

      public boolean hasOneof(Descriptors.OneofDescriptor var1) {
         return this.builder.hasOneof(var1);
      }

      public MessageReflection.MergeTarget clearOneof(Descriptors.OneofDescriptor var1) {
         this.builder.clearOneof(var1);
         return this;
      }

      public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor var1) {
         return this.builder.getOneofFieldDescriptor(var1);
      }

      public MessageReflection.MergeTarget.ContainerType getContainerType() {
         return MessageReflection.MergeTarget.ContainerType.MESSAGE;
      }

      public ExtensionRegistry.ExtensionInfo findExtensionByName(ExtensionRegistry var1, String var2) {
         return var1.findImmutableExtensionByName(var2);
      }

      public ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry var1, Descriptors.Descriptor var2, int var3) {
         return var1.findImmutableExtensionByNumber(var2, var3);
      }

      public Object parseGroup(CodedInputStream var1, ExtensionRegistryLite var2, Descriptors.FieldDescriptor var3, Message var4) throws IOException {
         Message.Builder var5;
         if (var4 != null) {
            var5 = var4.newBuilderForType();
         } else {
            var5 = this.builder.newBuilderForField(var3);
         }

         if (!var3.isRepeated()) {
            Message var6 = (Message)this.getField(var3);
            if (var6 != null) {
               var5.mergeFrom(var6);
            }
         }

         var1.readGroup(var3.getNumber(), (MessageLite.Builder)var5, var2);
         return var5.buildPartial();
      }

      public Object parseMessage(CodedInputStream var1, ExtensionRegistryLite var2, Descriptors.FieldDescriptor var3, Message var4) throws IOException {
         Message.Builder var5;
         if (var4 != null) {
            var5 = var4.newBuilderForType();
         } else {
            var5 = this.builder.newBuilderForField(var3);
         }

         if (!var3.isRepeated()) {
            Message var6 = (Message)this.getField(var3);
            if (var6 != null) {
               var5.mergeFrom(var6);
            }
         }

         var1.readMessage((MessageLite.Builder)var5, var2);
         return var5.buildPartial();
      }

      public Object parseMessageFromBytes(ByteString var1, ExtensionRegistryLite var2, Descriptors.FieldDescriptor var3, Message var4) throws IOException {
         Message.Builder var5;
         if (var4 != null) {
            var5 = var4.newBuilderForType();
         } else {
            var5 = this.builder.newBuilderForField(var3);
         }

         if (!var3.isRepeated()) {
            Message var6 = (Message)this.getField(var3);
            if (var6 != null) {
               var5.mergeFrom(var6);
            }
         }

         var5.mergeFrom(var1, var2);
         return var5.buildPartial();
      }

      public MessageReflection.MergeTarget newMergeTargetForField(Descriptors.FieldDescriptor var1, Message var2) {
         Message.Builder var3;
         if (var2 != null) {
            var3 = var2.newBuilderForType();
         } else {
            var3 = this.builder.newBuilderForField(var1);
         }

         if (!var1.isRepeated()) {
            Message var4 = (Message)this.getField(var1);
            if (var4 != null) {
               var3.mergeFrom(var4);
            }
         }

         return new MessageReflection.BuilderAdapter(var3);
      }

      public MessageReflection.MergeTarget newEmptyTargetForField(Descriptors.FieldDescriptor var1, Message var2) {
         Message.Builder var3;
         if (var2 != null) {
            var3 = var2.newBuilderForType();
         } else {
            var3 = this.builder.newBuilderForField(var1);
         }

         return new MessageReflection.BuilderAdapter(var3);
      }

      public WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor var1) {
         if (var1.needsUtf8Check()) {
            return WireFormat.Utf8Validation.STRICT;
         } else {
            return !var1.isRepeated() && this.builder instanceof GeneratedMessage.Builder ? WireFormat.Utf8Validation.LAZY : WireFormat.Utf8Validation.LOOSE;
         }
      }

      public Object finish() {
         return this.builder.buildPartial();
      }
   }

   interface MergeTarget {
      Descriptors.Descriptor getDescriptorForType();

      MessageReflection.MergeTarget.ContainerType getContainerType();

      ExtensionRegistry.ExtensionInfo findExtensionByName(ExtensionRegistry var1, String var2);

      ExtensionRegistry.ExtensionInfo findExtensionByNumber(ExtensionRegistry var1, Descriptors.Descriptor var2, int var3);

      Object getField(Descriptors.FieldDescriptor var1);

      boolean hasField(Descriptors.FieldDescriptor var1);

      MessageReflection.MergeTarget setField(Descriptors.FieldDescriptor var1, Object var2);

      MessageReflection.MergeTarget clearField(Descriptors.FieldDescriptor var1);

      MessageReflection.MergeTarget setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3);

      MessageReflection.MergeTarget addRepeatedField(Descriptors.FieldDescriptor var1, Object var2);

      boolean hasOneof(Descriptors.OneofDescriptor var1);

      MessageReflection.MergeTarget clearOneof(Descriptors.OneofDescriptor var1);

      Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor var1);

      Object parseGroup(CodedInputStream var1, ExtensionRegistryLite var2, Descriptors.FieldDescriptor var3, Message var4) throws IOException;

      Object parseMessage(CodedInputStream var1, ExtensionRegistryLite var2, Descriptors.FieldDescriptor var3, Message var4) throws IOException;

      Object parseMessageFromBytes(ByteString var1, ExtensionRegistryLite var2, Descriptors.FieldDescriptor var3, Message var4) throws IOException;

      WireFormat.Utf8Validation getUtf8Validation(Descriptors.FieldDescriptor var1);

      MessageReflection.MergeTarget newMergeTargetForField(Descriptors.FieldDescriptor var1, Message var2);

      MessageReflection.MergeTarget newEmptyTargetForField(Descriptors.FieldDescriptor var1, Message var2);

      Object finish();

      public static enum ContainerType {
         MESSAGE,
         EXTENSION_SET;
      }
   }
}
