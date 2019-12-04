package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

abstract class ListFieldSchema {
   private static final ListFieldSchema FULL_INSTANCE = new ListFieldSchema.ListFieldSchemaFull();
   private static final ListFieldSchema LITE_INSTANCE = new ListFieldSchema.ListFieldSchemaLite();

   private ListFieldSchema() {
   }

   abstract List mutableListAt(Object var1, long var2);

   abstract void makeImmutableListAt(Object var1, long var2);

   abstract void mergeListsAt(Object var1, Object var2, long var3);

   static ListFieldSchema full() {
      return FULL_INSTANCE;
   }

   static ListFieldSchema lite() {
      return LITE_INSTANCE;
   }

   // $FF: synthetic method
   ListFieldSchema(Object var1) {
      this();
   }

   private static final class ListFieldSchemaLite extends ListFieldSchema {
      private ListFieldSchemaLite() {
         super(null);
      }

      List mutableListAt(Object var1, long var2) {
         Internal.ProtobufList var4 = getProtobufList(var1, var2);
         if (!var4.isModifiable()) {
            int var5 = var4.size();
            var4 = var4.mutableCopyWithCapacity(var5 == 0 ? 10 : var5 * 2);
            UnsafeUtil.putObject((Object)var1, var2, var4);
         }

         return var4;
      }

      void makeImmutableListAt(Object var1, long var2) {
         Internal.ProtobufList var4 = getProtobufList(var1, var2);
         var4.makeImmutable();
      }

      void mergeListsAt(Object var1, Object var2, long var3) {
         Internal.ProtobufList var5 = getProtobufList(var1, var3);
         Internal.ProtobufList var6 = getProtobufList(var2, var3);
         int var7 = var5.size();
         int var8 = var6.size();
         if (var7 > 0 && var8 > 0) {
            if (!var5.isModifiable()) {
               var5 = var5.mutableCopyWithCapacity(var7 + var8);
            }

            var5.addAll(var6);
         }

         Internal.ProtobufList var9 = var7 > 0 ? var5 : var6;
         UnsafeUtil.putObject((Object)var1, var3, var9);
      }

      static Internal.ProtobufList getProtobufList(Object var0, long var1) {
         return (Internal.ProtobufList)UnsafeUtil.getObject(var0, var1);
      }

      // $FF: synthetic method
      ListFieldSchemaLite(Object var1) {
         this();
      }
   }

   private static final class ListFieldSchemaFull extends ListFieldSchema {
      private static final Class UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

      private ListFieldSchemaFull() {
         super(null);
      }

      List mutableListAt(Object var1, long var2) {
         return mutableListAt(var1, var2, 10);
      }

      void makeImmutableListAt(Object var1, long var2) {
         List var4 = (List)UnsafeUtil.getObject(var1, var2);
         Object var5 = null;
         if (var4 instanceof LazyStringList) {
            var5 = ((LazyStringList)var4).getUnmodifiableView();
         } else {
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(var4.getClass())) {
               return;
            }

            if (var4 instanceof PrimitiveNonBoxingCollection && var4 instanceof Internal.ProtobufList) {
               if (((Internal.ProtobufList)var4).isModifiable()) {
                  ((Internal.ProtobufList)var4).makeImmutable();
               }

               return;
            }

            var5 = Collections.unmodifiableList(var4);
         }

         UnsafeUtil.putObject(var1, var2, var5);
      }

      private static List mutableListAt(Object var0, long var1, int var3) {
         Object var4 = getList(var0, var1);
         if (((List)var4).isEmpty()) {
            if (var4 instanceof LazyStringList) {
               var4 = new LazyStringArrayList(var3);
            } else if (var4 instanceof PrimitiveNonBoxingCollection && var4 instanceof Internal.ProtobufList) {
               var4 = ((Internal.ProtobufList)var4).mutableCopyWithCapacity(var3);
            } else {
               var4 = new ArrayList(var3);
            }

            UnsafeUtil.putObject(var0, var1, var4);
         } else if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(var4.getClass())) {
            ArrayList var5 = new ArrayList(((List)var4).size() + var3);
            var5.addAll((Collection)var4);
            var4 = var5;
            UnsafeUtil.putObject((Object)var0, var1, var5);
         } else if (var4 instanceof UnmodifiableLazyStringList) {
            LazyStringArrayList var6 = new LazyStringArrayList(((List)var4).size() + var3);
            var6.addAll((UnmodifiableLazyStringList)var4);
            var4 = var6;
            UnsafeUtil.putObject((Object)var0, var1, var6);
         } else if (var4 instanceof PrimitiveNonBoxingCollection && var4 instanceof Internal.ProtobufList && !((Internal.ProtobufList)var4).isModifiable()) {
            var4 = ((Internal.ProtobufList)var4).mutableCopyWithCapacity(((List)var4).size() + var3);
            UnsafeUtil.putObject(var0, var1, var4);
         }

         return (List)var4;
      }

      void mergeListsAt(Object var1, Object var2, long var3) {
         List var5 = getList(var2, var3);
         List var6 = mutableListAt(var1, var3, var5.size());
         int var7 = var6.size();
         int var8 = var5.size();
         if (var7 > 0 && var8 > 0) {
            var6.addAll(var5);
         }

         List var9 = var7 > 0 ? var6 : var5;
         UnsafeUtil.putObject((Object)var1, var3, var9);
      }

      static List getList(Object var0, long var1) {
         return (List)UnsafeUtil.getObject(var0, var1);
      }

      // $FF: synthetic method
      ListFieldSchemaFull(Object var1) {
         this();
      }
   }
}
