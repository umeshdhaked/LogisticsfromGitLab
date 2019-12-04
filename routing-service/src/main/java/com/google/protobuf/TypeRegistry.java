package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class TypeRegistry {
   private static final Logger logger = Logger.getLogger(TypeRegistry.class.getName());
   private final Map types;

   public static TypeRegistry getEmptyTypeRegistry() {
      return TypeRegistry.EmptyTypeRegistryHolder.EMPTY;
   }

   public static TypeRegistry.Builder newBuilder() {
      return new TypeRegistry.Builder();
   }

   public Descriptors.Descriptor find(String var1) {
      return (Descriptors.Descriptor)this.types.get(var1);
   }

   public final Descriptors.Descriptor getDescriptorForTypeUrl(String var1) throws InvalidProtocolBufferException {
      return this.find(getTypeName(var1));
   }

   TypeRegistry(Map var1) {
      this.types = var1;
   }

   private static String getTypeName(String var0) throws InvalidProtocolBufferException {
      String[] var1 = var0.split("/");
      if (var1.length == 1) {
         throw new InvalidProtocolBufferException("Invalid type url found: " + var0);
      } else {
         return var1[var1.length - 1];
      }
   }

   public static final class Builder {
      private final Set files;
      private Map types;

      private Builder() {
         this.files = new HashSet();
         this.types = new HashMap();
      }

      public TypeRegistry.Builder add(Descriptors.Descriptor var1) {
         if (this.types == null) {
            throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
         } else {
            this.addFile(var1.getFile());
            return this;
         }
      }

      public TypeRegistry.Builder add(Iterable var1) {
         if (this.types == null) {
            throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
         } else {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               Descriptors.Descriptor var3 = (Descriptors.Descriptor)var2.next();
               this.addFile(var3.getFile());
            }

            return this;
         }
      }

      public TypeRegistry build() {
         TypeRegistry var1 = new TypeRegistry(this.types);
         this.types = null;
         return var1;
      }

      private void addFile(Descriptors.FileDescriptor var1) {
         if (this.files.add(var1.getFullName())) {
            Iterator var2 = var1.getDependencies().iterator();

            while(var2.hasNext()) {
               Descriptors.FileDescriptor var3 = (Descriptors.FileDescriptor)var2.next();
               this.addFile(var3);
            }

            var2 = var1.getMessageTypes().iterator();

            while(var2.hasNext()) {
               Descriptors.Descriptor var4 = (Descriptors.Descriptor)var2.next();
               this.addMessage(var4);
            }

         }
      }

      private void addMessage(Descriptors.Descriptor var1) {
         Iterator var2 = var1.getNestedTypes().iterator();

         while(var2.hasNext()) {
            Descriptors.Descriptor var3 = (Descriptors.Descriptor)var2.next();
            this.addMessage(var3);
         }

         if (this.types.containsKey(var1.getFullName())) {
            TypeRegistry.logger.warning("Type " + var1.getFullName() + " is added multiple times.");
         } else {
            this.types.put(var1.getFullName(), var1);
         }
      }

      // $FF: synthetic method
      Builder(Object var1) {
         this();
      }
   }

   private static class EmptyTypeRegistryHolder {
      private static final TypeRegistry EMPTY = new TypeRegistry(Collections.emptyMap());
   }
}
