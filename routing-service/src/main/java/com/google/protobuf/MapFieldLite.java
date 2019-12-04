package com.google.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class MapFieldLite extends LinkedHashMap {
   private boolean isMutable = true;
   private static final MapFieldLite EMPTY_MAP_FIELD = new MapFieldLite();

   private MapFieldLite() {
   }

   private MapFieldLite(Map var1) {
      super(var1);
   }

   public static MapFieldLite emptyMapField() {
      return EMPTY_MAP_FIELD;
   }

   public void mergeFrom(MapFieldLite var1) {
      this.ensureMutable();
      if (!var1.isEmpty()) {
         this.putAll(var1);
      }

   }

   public Set entrySet() {
      return this.isEmpty() ? Collections.emptySet() : super.entrySet();
   }

   public void clear() {
      this.ensureMutable();
      super.clear();
   }

   public Object put(Object var1, Object var2) {
      this.ensureMutable();
      Internal.checkNotNull(var1);
      Internal.checkNotNull(var2);
      return super.put(var1, var2);
   }

   public Object put(Entry var1) {
      return this.put(var1.getKey(), var1.getValue());
   }

   public void putAll(Map var1) {
      this.ensureMutable();
      checkForNullKeysAndValues(var1);
      super.putAll(var1);
   }

   public Object remove(Object var1) {
      this.ensureMutable();
      return super.remove(var1);
   }

   private static void checkForNullKeysAndValues(Map var0) {
      Iterator var1 = var0.keySet().iterator();

      while(var1.hasNext()) {
         Object var2 = var1.next();
         Internal.checkNotNull(var2);
         Internal.checkNotNull(var0.get(var2));
      }

   }

   private static boolean equals(Object var0, Object var1) {
      return var0 instanceof byte[] && var1 instanceof byte[] ? Arrays.equals((byte[])((byte[])var0), (byte[])((byte[])var1)) : var0.equals(var1);
   }

   static boolean equals(Map var0, Map var1) {
      if (var0 == var1) {
         return true;
      } else if (var0.size() != var1.size()) {
         return false;
      } else {
         Iterator var2 = var0.entrySet().iterator();

         Entry var3;
         do {
            if (!var2.hasNext()) {
               return true;
            }

            var3 = (Entry)var2.next();
            if (!var1.containsKey(var3.getKey())) {
               return false;
            }
         } while(equals(var3.getValue(), var1.get(var3.getKey())));

         return false;
      }
   }

   public boolean equals(Object var1) {
      return var1 instanceof Map && equals((Map)this, (Map)((Map)var1));
   }

   private static int calculateHashCodeForObject(Object var0) {
      if (var0 instanceof byte[]) {
         return Internal.hashCode((byte[])((byte[])var0));
      } else if (var0 instanceof Internal.EnumLite) {
         throw new UnsupportedOperationException();
      } else {
         return var0.hashCode();
      }
   }

   static int calculateHashCodeForMap(Map var0) {
      int var1 = 0;

      Entry var3;
      for(Iterator var2 = var0.entrySet().iterator(); var2.hasNext(); var1 += calculateHashCodeForObject(var3.getKey()) ^ calculateHashCodeForObject(var3.getValue())) {
         var3 = (Entry)var2.next();
      }

      return var1;
   }

   public int hashCode() {
      return calculateHashCodeForMap(this);
   }

   private static Object copy(Object var0) {
      if (var0 instanceof byte[]) {
         byte[] var1 = (byte[])((byte[])var0);
         return Arrays.copyOf(var1, var1.length);
      } else {
         return var0;
      }
   }

   static Map copy(Map var0) {
      LinkedHashMap var1 = new LinkedHashMap();
      Iterator var2 = var0.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.put(var3.getKey(), copy(var3.getValue()));
      }

      return var1;
   }

   public MapFieldLite mutableCopy() {
      return this.isEmpty() ? new MapFieldLite() : new MapFieldLite(this);
   }

   public void makeImmutable() {
      this.isMutable = false;
   }

   public boolean isMutable() {
      return this.isMutable;
   }

   private void ensureMutable() {
      if (!this.isMutable()) {
         throw new UnsupportedOperationException();
      }
   }

   static {
      EMPTY_MAP_FIELD.makeImmutable();
   }
}
