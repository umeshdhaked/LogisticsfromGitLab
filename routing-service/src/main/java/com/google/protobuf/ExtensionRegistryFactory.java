package com.google.protobuf;

final class ExtensionRegistryFactory {
   static final String FULL_REGISTRY_CLASS_NAME = "com.google.protobuf.ExtensionRegistry";
   static final Class EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();

   static Class reflectExtensionRegistry() {
      try {
         return Class.forName("com.google.protobuf.ExtensionRegistry");
      } catch (ClassNotFoundException var1) {
         return null;
      }
   }

   public static ExtensionRegistryLite create() {
      if (EXTENSION_REGISTRY_CLASS != null) {
         try {
            return invokeSubclassFactory("newInstance");
         } catch (Exception var1) {
         }
      }

      return new ExtensionRegistryLite();
   }

   public static ExtensionRegistryLite createEmpty() {
      if (EXTENSION_REGISTRY_CLASS != null) {
         try {
            return invokeSubclassFactory("getEmptyRegistry");
         } catch (Exception var1) {
         }
      }

      return ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
   }

   static boolean isFullRegistry(ExtensionRegistryLite var0) {
      return EXTENSION_REGISTRY_CLASS != null && EXTENSION_REGISTRY_CLASS.isAssignableFrom(var0.getClass());
   }

   private static final ExtensionRegistryLite invokeSubclassFactory(String var0) throws Exception {
      return (ExtensionRegistryLite)EXTENSION_REGISTRY_CLASS.getDeclaredMethod(var0).invoke((Object)null);
   }
}
