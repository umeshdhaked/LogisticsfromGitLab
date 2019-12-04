package com.google.ortools.util;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.FileDescriptor;

public final class OptionalBooleanOuterClass {
   private static FileDescriptor descriptor;

   private OptionalBooleanOuterClass() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{"\n#ortools/util/optional_boolean.proto\u0012\u0013operations_research*F\n\u000fOptionalBoolean\u0012\u0014\n\u0010BOOL_UNSPECIFIED\u0010\u0000\u0012\u000e\n\nBOOL_FALSE\u0010\u0002\u0012\r\n\tBOOL_TRUE\u0010\u0003B1\n\u0017com.google.ortools.utilP\u0001ª\u0002\u0013Google.OrTools.Utilb\u0006proto3"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(var0, new FileDescriptor[0]);
   }
}
