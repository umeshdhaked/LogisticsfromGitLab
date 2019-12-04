package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapField implements MutabilityOracle {
   private volatile boolean isMutable;
   private volatile MapField.StorageMode mode;
   private MapField.MutatabilityAwareMap mapData;
   private List listData;
   private final MapField.Converter converter;

   private MapField(MapField.Converter var1, MapField.StorageMode var2, Map var3) {
      this.converter = var1;
      this.isMutable = true;
      this.mode = var2;
      this.mapData = new MapField.MutatabilityAwareMap(this, var3);
      this.listData = null;
   }

   private MapField(MapEntry var1, MapField.StorageMode var2, Map var3) {
      this((MapField.Converter)(new MapField.ImmutableMessageConverter(var1)), var2, var3);
   }

   public static MapField emptyMapField(MapEntry var0) {
      return new MapField(var0, MapField.StorageMode.MAP, Collections.emptyMap());
   }

   public static MapField newMapField(MapEntry var0) {
      return new MapField(var0, MapField.StorageMode.MAP, new LinkedHashMap());
   }

   private Message convertKeyAndValueToMessage(Object var1, Object var2) {
      return this.converter.convertKeyAndValueToMessage(var1, var2);
   }

   private void convertMessageToKeyAndValue(Message var1, Map var2) {
      this.converter.convertMessageToKeyAndValue(var1, var2);
   }

   private List convertMapToList(MapField.MutatabilityAwareMap var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = var1.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var2.add(this.convertKeyAndValueToMessage(var4.getKey(), var4.getValue()));
      }

      return var2;
   }

   private MapField.MutatabilityAwareMap convertListToMap(List var1) {
      LinkedHashMap var2 = new LinkedHashMap();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Message var4 = (Message)var3.next();
         this.convertMessageToKeyAndValue(var4, var2);
      }

      return new MapField.MutatabilityAwareMap(this, var2);
   }

   public Map getMap() {
      if (this.mode == MapField.StorageMode.LIST) {
         synchronized(this) {
            if (this.mode == MapField.StorageMode.LIST) {
               this.mapData = this.convertListToMap(this.listData);
               this.mode = MapField.StorageMode.BOTH;
            }
         }
      }

      return Collections.unmodifiableMap(this.mapData);
   }

   public Map getMutableMap() {
      if (this.mode != MapField.StorageMode.MAP) {
         if (this.mode == MapField.StorageMode.LIST) {
            this.mapData = this.convertListToMap(this.listData);
         }

         this.listData = null;
         this.mode = MapField.StorageMode.MAP;
      }

      return this.mapData;
   }

   public void mergeFrom(MapField var1) {
      this.getMutableMap().putAll(MapFieldLite.copy(var1.getMap()));
   }

   public void clear() {
      this.mapData = new MapField.MutatabilityAwareMap(this, new LinkedHashMap());
      this.mode = MapField.StorageMode.MAP;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof MapField)) {
         return false;
      } else {
         MapField var2 = (MapField)var1;
         return MapFieldLite.equals(this.getMap(), var2.getMap());
      }
   }

   public int hashCode() {
      return MapFieldLite.calculateHashCodeForMap(this.getMap());
   }

   public MapField copy() {
      return new MapField(this.converter, MapField.StorageMode.MAP, MapFieldLite.copy(this.getMap()));
   }

   List getList() {
      if (this.mode == MapField.StorageMode.MAP) {
         synchronized(this) {
            if (this.mode == MapField.StorageMode.MAP) {
               this.listData = this.convertMapToList(this.mapData);
               this.mode = MapField.StorageMode.BOTH;
            }
         }
      }

      return Collections.unmodifiableList(this.listData);
   }

   List getMutableList() {
      if (this.mode != MapField.StorageMode.LIST) {
         if (this.mode == MapField.StorageMode.MAP) {
            this.listData = this.convertMapToList(this.mapData);
         }

         this.mapData = null;
         this.mode = MapField.StorageMode.LIST;
      }

      return this.listData;
   }

   Message getMapEntryMessageDefaultInstance() {
      return this.converter.getMessageDefaultInstance();
   }

   public void makeImmutable() {
      this.isMutable = false;
   }

   public boolean isMutable() {
      return this.isMutable;
   }

   public void ensureMutable() {
      if (!this.isMutable()) {
         throw new UnsupportedOperationException();
      }
   }

   private static class MutatabilityAwareMap implements Map {
      private final MutabilityOracle mutabilityOracle;
      private final Map delegate;

      MutatabilityAwareMap(MutabilityOracle var1, Map var2) {
         this.mutabilityOracle = var1;
         this.delegate = var2;
      }

      public int size() {
         return this.delegate.size();
      }

      public boolean isEmpty() {
         return this.delegate.isEmpty();
      }

      public boolean containsKey(Object var1) {
         return this.delegate.containsKey(var1);
      }

      public boolean containsValue(Object var1) {
         return this.delegate.containsValue(var1);
      }

      public Object get(Object var1) {
         return this.delegate.get(var1);
      }

      public Object put(Object var1, Object var2) {
         this.mutabilityOracle.ensureMutable();
         Internal.checkNotNull(var1);
         Internal.checkNotNull(var2);
         return this.delegate.put(var1, var2);
      }

      public Object remove(Object var1) {
         this.mutabilityOracle.ensureMutable();
         return this.delegate.remove(var1);
      }

      public void putAll(Map var1) {
         this.mutabilityOracle.ensureMutable();
         Iterator var2 = var1.keySet().iterator();

         while(var2.hasNext()) {
            Object var3 = var2.next();
            Internal.checkNotNull(var3);
            Internal.checkNotNull(var1.get(var3));
         }

         this.delegate.putAll(var1);
      }

      public void clear() {
         this.mutabilityOracle.ensureMutable();
         this.delegate.clear();
      }

      public Set keySet() {
         return new MapField.MutatabilityAwareMap.MutatabilityAwareSet(this.mutabilityOracle, this.delegate.keySet());
      }

      public Collection values() {
         return new MapField.MutatabilityAwareMap.MutatabilityAwareCollection(this.mutabilityOracle, this.delegate.values());
      }

      public Set entrySet() {
         return new MapField.MutatabilityAwareMap.MutatabilityAwareSet(this.mutabilityOracle, this.delegate.entrySet());
      }

      public boolean equals(Object var1) {
         return this.delegate.equals(var1);
      }

      public int hashCode() {
         return this.delegate.hashCode();
      }

      public String toString() {
         return this.delegate.toString();
      }

      private static class MutatabilityAwareIterator implements Iterator {
         private final MutabilityOracle mutabilityOracle;
         private final Iterator delegate;

         MutatabilityAwareIterator(MutabilityOracle var1, Iterator var2) {
            this.mutabilityOracle = var1;
            this.delegate = var2;
         }

         public boolean hasNext() {
            return this.delegate.hasNext();
         }

         public Object next() {
            return this.delegate.next();
         }

         public void remove() {
            this.mutabilityOracle.ensureMutable();
            this.delegate.remove();
         }

         public boolean equals(Object var1) {
            return this.delegate.equals(var1);
         }

         public int hashCode() {
            return this.delegate.hashCode();
         }

         public String toString() {
            return this.delegate.toString();
         }
      }

      private static class MutatabilityAwareSet implements Set {
         private final MutabilityOracle mutabilityOracle;
         private final Set delegate;

         MutatabilityAwareSet(MutabilityOracle var1, Set var2) {
            this.mutabilityOracle = var1;
            this.delegate = var2;
         }

         public int size() {
            return this.delegate.size();
         }

         public boolean isEmpty() {
            return this.delegate.isEmpty();
         }

         public boolean contains(Object var1) {
            return this.delegate.contains(var1);
         }

         public Iterator iterator() {
            return new MapField.MutatabilityAwareMap.MutatabilityAwareIterator(this.mutabilityOracle, this.delegate.iterator());
         }

         public Object[] toArray() {
            return this.delegate.toArray();
         }

         public Object[] toArray(Object[] var1) {
            return this.delegate.toArray(var1);
         }

         public boolean add(Object var1) {
            this.mutabilityOracle.ensureMutable();
            return this.delegate.add(var1);
         }

         public boolean remove(Object var1) {
            this.mutabilityOracle.ensureMutable();
            return this.delegate.remove(var1);
         }

         public boolean containsAll(Collection var1) {
            return this.delegate.containsAll(var1);
         }

         public boolean addAll(Collection var1) {
            this.mutabilityOracle.ensureMutable();
            return this.delegate.addAll(var1);
         }

         public boolean retainAll(Collection var1) {
            this.mutabilityOracle.ensureMutable();
            return this.delegate.retainAll(var1);
         }

         public boolean removeAll(Collection var1) {
            this.mutabilityOracle.ensureMutable();
            return this.delegate.removeAll(var1);
         }

         public void clear() {
            this.mutabilityOracle.ensureMutable();
            this.delegate.clear();
         }

         public boolean equals(Object var1) {
            return this.delegate.equals(var1);
         }

         public int hashCode() {
            return this.delegate.hashCode();
         }

         public String toString() {
            return this.delegate.toString();
         }
      }

      private static class MutatabilityAwareCollection implements Collection {
         private final MutabilityOracle mutabilityOracle;
         private final Collection delegate;

         MutatabilityAwareCollection(MutabilityOracle var1, Collection var2) {
            this.mutabilityOracle = var1;
            this.delegate = var2;
         }

         public int size() {
            return this.delegate.size();
         }

         public boolean isEmpty() {
            return this.delegate.isEmpty();
         }

         public boolean contains(Object var1) {
            return this.delegate.contains(var1);
         }

         public Iterator iterator() {
            return new MapField.MutatabilityAwareMap.MutatabilityAwareIterator(this.mutabilityOracle, this.delegate.iterator());
         }

         public Object[] toArray() {
            return this.delegate.toArray();
         }

         public Object[] toArray(Object[] var1) {
            return this.delegate.toArray(var1);
         }

         public boolean add(Object var1) {
            throw new UnsupportedOperationException();
         }

         public boolean remove(Object var1) {
            this.mutabilityOracle.ensureMutable();
            return this.delegate.remove(var1);
         }

         public boolean containsAll(Collection var1) {
            return this.delegate.containsAll(var1);
         }

         public boolean addAll(Collection var1) {
            throw new UnsupportedOperationException();
         }

         public boolean removeAll(Collection var1) {
            this.mutabilityOracle.ensureMutable();
            return this.delegate.removeAll(var1);
         }

         public boolean retainAll(Collection var1) {
            this.mutabilityOracle.ensureMutable();
            return this.delegate.retainAll(var1);
         }

         public void clear() {
            this.mutabilityOracle.ensureMutable();
            this.delegate.clear();
         }

         public boolean equals(Object var1) {
            return this.delegate.equals(var1);
         }

         public int hashCode() {
            return this.delegate.hashCode();
         }

         public String toString() {
            return this.delegate.toString();
         }
      }
   }

   private static class ImmutableMessageConverter implements MapField.Converter {
      private final MapEntry defaultEntry;

      public ImmutableMessageConverter(MapEntry var1) {
         this.defaultEntry = var1;
      }

      public Message convertKeyAndValueToMessage(Object var1, Object var2) {
         return this.defaultEntry.newBuilderForType().setKey(var1).setValue(var2).buildPartial();
      }

      public void convertMessageToKeyAndValue(Message var1, Map var2) {
         MapEntry var3 = (MapEntry)var1;
         var2.put(var3.getKey(), var3.getValue());
      }

      public Message getMessageDefaultInstance() {
         return this.defaultEntry;
      }
   }

   private interface Converter {
      Message convertKeyAndValueToMessage(Object var1, Object var2);

      void convertMessageToKeyAndValue(Message var1, Map var2);

      Message getMessageDefaultInstance();
   }

   private static enum StorageMode {
      MAP,
      LIST,
      BOTH;
   }
}
