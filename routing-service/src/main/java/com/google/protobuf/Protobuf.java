package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class Protobuf {
   private static final Protobuf INSTANCE = new Protobuf();
   private final SchemaFactory schemaFactory = new ManifestSchemaFactory();
   private final ConcurrentMap schemaCache = new ConcurrentHashMap();

   public static Protobuf getInstance() {
      return INSTANCE;
   }

   public void writeTo(Object var1, Writer var2) throws IOException {
      this.schemaFor(var1).writeTo(var1, var2);
   }

   public void mergeFrom(Object var1, Reader var2) throws IOException {
      this.mergeFrom(var1, var2, ExtensionRegistryLite.getEmptyRegistry());
   }

   public void mergeFrom(Object var1, Reader var2, ExtensionRegistryLite var3) throws IOException {
      this.schemaFor(var1).mergeFrom(var1, var2, var3);
   }

   public void makeImmutable(Object var1) {
      this.schemaFor(var1).makeImmutable(var1);
   }

   public boolean isInitialized(Object var1) {
      return this.schemaFor(var1).isInitialized(var1);
   }

   public Schema schemaFor(Class var1) {
      Internal.checkNotNull(var1, "messageType");
      Schema var2 = (Schema)this.schemaCache.get(var1);
      if (var2 == null) {
         var2 = this.schemaFactory.createSchema(var1);
         Schema var3 = this.registerSchema(var1, var2);
         if (var3 != null) {
            var2 = var3;
         }
      }

      return var2;
   }

   public Schema schemaFor(Object var1) {
      return this.schemaFor(var1.getClass());
   }

   public Schema registerSchema(Class var1, Schema var2) {
      Internal.checkNotNull(var1, "messageType");
      Internal.checkNotNull(var2, "schema");
      return (Schema)this.schemaCache.putIfAbsent(var1, var2);
   }

   public Schema registerSchemaOverride(Class var1, Schema var2) {
      Internal.checkNotNull(var1, "messageType");
      Internal.checkNotNull(var2, "schema");
      return (Schema)this.schemaCache.put(var1, var2);
   }

   private Protobuf() {
   }

   int getTotalSchemaSize() {
      int var1 = 0;
      Iterator var2 = this.schemaCache.values().iterator();

      while(var2.hasNext()) {
         Schema var3 = (Schema)var2.next();
         if (var3 instanceof MessageSchema) {
            var1 += ((MessageSchema)var3).getSchemaSize();
         }
      }

      return var1;
   }
}
