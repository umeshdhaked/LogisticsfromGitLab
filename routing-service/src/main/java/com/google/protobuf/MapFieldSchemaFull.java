package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class MapFieldSchemaFull implements MapFieldSchema {
   public Map forMutableMapData(Object var1) {
      return ((MapField)var1).getMutableMap();
   }

   public Map forMapData(Object var1) {
      return ((MapField)var1).getMap();
   }

   public boolean isImmutable(Object var1) {
      return !((MapField)var1).isMutable();
   }

   public Object toImmutable(Object var1) {
      ((MapField)var1).makeImmutable();
      return var1;
   }

   public Object newMapField(Object var1) {
      return MapField.newMapField((MapEntry)var1);
   }

   public MapEntryLite.Metadata forMapMetadata(Object var1) {
      return ((MapEntry)var1).getMetadata();
   }

   public Object mergeFrom(Object var1, Object var2) {
      return mergeFromFull(var1, var2);
   }

   private static Object mergeFromFull(Object var0, Object var1) {
      MapField var2 = (MapField)var0;
      MapField var3 = (MapField)var1;
      if (!var2.isMutable()) {
         var2.copy();
      }

      var2.mergeFrom(var3);
      return var2;
   }

   public int getSerializedSize(int var1, Object var2, Object var3) {
      return getSerializedSizeFull(var1, var2, var3);
   }

   private static int getSerializedSizeFull(int var0, Object var1, Object var2) {
      if (var1 == null) {
         return 0;
      } else {
         Map var3 = ((MapField)var1).getMap();
         MapEntry var4 = (MapEntry)var2;
         if (var3.isEmpty()) {
            return 0;
         } else {
            int var5 = 0;

            Entry var7;
            for(Iterator var6 = var3.entrySet().iterator(); var6.hasNext(); var5 += CodedOutputStream.computeTagSize(var0) + CodedOutputStream.computeLengthDelimitedFieldSize(MapEntryLite.computeSerializedSize(var4.getMetadata(), var7.getKey(), var7.getValue()))) {
               var7 = (Entry)var6.next();
            }

            return var5;
         }
      }
   }
}
