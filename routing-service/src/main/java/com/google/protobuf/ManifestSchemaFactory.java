package com.google.protobuf;

final class ManifestSchemaFactory implements SchemaFactory {
   private final MessageInfoFactory messageInfoFactory;
   private static final MessageInfoFactory EMPTY_FACTORY = new MessageInfoFactory() {
      public boolean isSupported(Class var1) {
         return false;
      }

      public MessageInfo messageInfoFor(Class var1) {
         throw new IllegalStateException("This should never be called.");
      }
   };

   public ManifestSchemaFactory() {
      this(getDefaultMessageInfoFactory());
   }

   private ManifestSchemaFactory(MessageInfoFactory var1) {
      this.messageInfoFactory = (MessageInfoFactory)Internal.checkNotNull(var1, "messageInfoFactory");
   }

   public Schema createSchema(Class var1) {
      SchemaUtil.requireGeneratedMessage(var1);
      MessageInfo var2 = this.messageInfoFactory.messageInfoFor(var1);
      if (var2.isMessageSetWireFormat()) {
         return GeneratedMessageLite.class.isAssignableFrom(var1) ? MessageSetSchema.newSchema(SchemaUtil.unknownFieldSetLiteSchema(), ExtensionSchemas.lite(), var2.getDefaultInstance()) : MessageSetSchema.newSchema(SchemaUtil.proto2UnknownFieldSetSchema(), ExtensionSchemas.full(), var2.getDefaultInstance());
      } else {
         return newSchema(var1, var2);
      }
   }

   private static Schema newSchema(Class var0, MessageInfo var1) {
      if (GeneratedMessageLite.class.isAssignableFrom(var0)) {
         return isProto2(var1) ? MessageSchema.newSchema(var0, var1, NewInstanceSchemas.lite(), ListFieldSchema.lite(), SchemaUtil.unknownFieldSetLiteSchema(), ExtensionSchemas.lite(), MapFieldSchemas.lite()) : MessageSchema.newSchema(var0, var1, NewInstanceSchemas.lite(), ListFieldSchema.lite(), SchemaUtil.unknownFieldSetLiteSchema(), (ExtensionSchema)null, MapFieldSchemas.lite());
      } else {
         return isProto2(var1) ? MessageSchema.newSchema(var0, var1, NewInstanceSchemas.full(), ListFieldSchema.full(), SchemaUtil.proto2UnknownFieldSetSchema(), ExtensionSchemas.full(), MapFieldSchemas.full()) : MessageSchema.newSchema(var0, var1, NewInstanceSchemas.full(), ListFieldSchema.full(), SchemaUtil.proto3UnknownFieldSetSchema(), (ExtensionSchema)null, MapFieldSchemas.full());
      }
   }

   private static boolean isProto2(MessageInfo var0) {
      return var0.getSyntax() == ProtoSyntax.PROTO2;
   }

   private static MessageInfoFactory getDefaultMessageInfoFactory() {
      return new ManifestSchemaFactory.CompositeMessageInfoFactory(new MessageInfoFactory[]{GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory()});
   }

   private static MessageInfoFactory getDescriptorMessageInfoFactory() {
      try {
         Class var0 = Class.forName("com.google.protobuf.DescriptorMessageInfoFactory");
         return (MessageInfoFactory)var0.getDeclaredMethod("getInstance").invoke((Object)null);
      } catch (Exception var1) {
         return EMPTY_FACTORY;
      }
   }

   private static class CompositeMessageInfoFactory implements MessageInfoFactory {
      private MessageInfoFactory[] factories;

      CompositeMessageInfoFactory(MessageInfoFactory... var1) {
         this.factories = var1;
      }

      public boolean isSupported(Class var1) {
         MessageInfoFactory[] var2 = this.factories;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            MessageInfoFactory var5 = var2[var4];
            if (var5.isSupported(var1)) {
               return true;
            }
         }

         return false;
      }

      public MessageInfo messageInfoFor(Class var1) {
         MessageInfoFactory[] var2 = this.factories;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            MessageInfoFactory var5 = var2[var4];
            if (var5.isSupported(var1)) {
               return var5.messageInfoFor(var1);
            }
         }

         throw new UnsupportedOperationException("No factory is available for message type: " + var1.getName());
      }
   }
}
