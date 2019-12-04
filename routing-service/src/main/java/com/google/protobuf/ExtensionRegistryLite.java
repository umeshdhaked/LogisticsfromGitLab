package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExtensionRegistryLite {
   private static volatile boolean eagerlyParseMessageSets = false;
   private static boolean doFullRuntimeInheritanceCheck = true;
   static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
   private static final Class extensionClass = resolveExtensionClass();
   private static volatile ExtensionRegistryLite emptyRegistry;
   static final ExtensionRegistryLite EMPTY_REGISTRY_LITE = new ExtensionRegistryLite(true);
   private final Map extensionsByNumber;

   static Class resolveExtensionClass() {
      try {
         return Class.forName("com.google.protobuf.Extension");
      } catch (ClassNotFoundException var1) {
         return null;
      }
   }

   public static boolean isEagerlyParseMessageSets() {
      return eagerlyParseMessageSets;
   }

   public static void setEagerlyParseMessageSets(boolean var0) {
      eagerlyParseMessageSets = var0;
   }

   public static ExtensionRegistryLite newInstance() {
      return doFullRuntimeInheritanceCheck ? ExtensionRegistryFactory.create() : new ExtensionRegistryLite();
   }

   public static ExtensionRegistryLite getEmptyRegistry() {
      ExtensionRegistryLite var0 = emptyRegistry;
      if (var0 == null) {
         Class var1 = ExtensionRegistryLite.class;
         synchronized(ExtensionRegistryLite.class) {
            var0 = emptyRegistry;
            if (var0 == null) {
               var0 = emptyRegistry = doFullRuntimeInheritanceCheck ? ExtensionRegistryFactory.createEmpty() : EMPTY_REGISTRY_LITE;
            }
         }
      }

      return var0;
   }

   public ExtensionRegistryLite getUnmodifiable() {
      return new ExtensionRegistryLite(this);
   }

   public GeneratedMessageLite.GeneratedExtension findLiteExtensionByNumber(MessageLite var1, int var2) {
      return (GeneratedMessageLite.GeneratedExtension)this.extensionsByNumber.get(new ExtensionRegistryLite.ObjectIntPair(var1, var2));
   }

   public final void add(GeneratedMessageLite.GeneratedExtension var1) {
      this.extensionsByNumber.put(new ExtensionRegistryLite.ObjectIntPair(var1.getContainingTypeDefaultInstance(), var1.getNumber()), var1);
   }

   public final void add(ExtensionLite var1) {
      if (GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(var1.getClass())) {
         this.add((GeneratedMessageLite.GeneratedExtension)var1);
      }

      if (doFullRuntimeInheritanceCheck && ExtensionRegistryFactory.isFullRegistry(this)) {
         try {
            this.getClass().getMethod("add", extensionClass).invoke(this, var1);
         } catch (Exception var3) {
            throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", var1), var3);
         }
      }

   }

   ExtensionRegistryLite() {
      this.extensionsByNumber = new HashMap();
   }

   ExtensionRegistryLite(ExtensionRegistryLite var1) {
      if (var1 == EMPTY_REGISTRY_LITE) {
         this.extensionsByNumber = Collections.emptyMap();
      } else {
         this.extensionsByNumber = Collections.unmodifiableMap(var1.extensionsByNumber);
      }

   }

   ExtensionRegistryLite(boolean var1) {
      this.extensionsByNumber = Collections.emptyMap();
   }

   private static final class ObjectIntPair {
      private final Object object;
      private final int number;

      ObjectIntPair(Object var1, int var2) {
         this.object = var1;
         this.number = var2;
      }

      public int hashCode() {
         return System.identityHashCode(this.object) * '\uffff' + this.number;
      }

      public boolean equals(Object var1) {
         if (!(var1 instanceof ExtensionRegistryLite.ObjectIntPair)) {
            return false;
         } else {
            ExtensionRegistryLite.ObjectIntPair var2 = (ExtensionRegistryLite.ObjectIntPair)var1;
            return this.object == var2.object && this.number == var2.number;
         }
      }
   }
}
