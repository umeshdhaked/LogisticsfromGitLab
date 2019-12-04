package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class SmallSortedMap extends AbstractMap {
   private final int maxArraySize;
   private List entryList;
   private Map overflowEntries;
   private boolean isImmutable;
   private volatile SmallSortedMap.EntrySet lazyEntrySet;
   private Map overflowEntriesDescending;
   private volatile SmallSortedMap.DescendingEntrySet lazyDescendingEntrySet;

   static SmallSortedMap newFieldMap(int var0) {
      return new SmallSortedMap(var0) {
         public void makeImmutable() {
            if (!this.isImmutable()) {
               java.util.Map.Entry var2;
               List var3;
               for(int var1 = 0; var1 < this.getNumArrayEntries(); ++var1) {
                  var2 = this.getArrayEntryAt(var1);
                  if (((FieldSet.FieldDescriptorLite)var2.getKey()).isRepeated()) {
                     var3 = (List)var2.getValue();
                     var2.setValue(Collections.unmodifiableList(var3));
                  }
               }

               Iterator var4 = this.getOverflowEntries().iterator();

               while(var4.hasNext()) {
                  var2 = (java.util.Map.Entry)var4.next();
                  if (((FieldSet.FieldDescriptorLite)var2.getKey()).isRepeated()) {
                     var3 = (List)var2.getValue();
                     var2.setValue(Collections.unmodifiableList(var3));
                  }
               }
            }

            super.makeImmutable();
         }
      };
   }

   static SmallSortedMap newInstanceForTest(int var0) {
      return new SmallSortedMap(var0);
   }

   private SmallSortedMap(int var1) {
      this.maxArraySize = var1;
      this.entryList = Collections.emptyList();
      this.overflowEntries = Collections.emptyMap();
      this.overflowEntriesDescending = Collections.emptyMap();
   }

   public void makeImmutable() {
      if (!this.isImmutable) {
         this.overflowEntries = this.overflowEntries.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.overflowEntries);
         this.overflowEntriesDescending = this.overflowEntriesDescending.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.overflowEntriesDescending);
         this.isImmutable = true;
      }

   }

   public boolean isImmutable() {
      return this.isImmutable;
   }

   public int getNumArrayEntries() {
      return this.entryList.size();
   }

   public java.util.Map.Entry getArrayEntryAt(int var1) {
      return (java.util.Map.Entry)this.entryList.get(var1);
   }

   public int getNumOverflowEntries() {
      return this.overflowEntries.size();
   }

   public Iterable getOverflowEntries() {
      return (Iterable)(this.overflowEntries.isEmpty() ? SmallSortedMap.EmptySet.iterable() : this.overflowEntries.entrySet());
   }

   Iterable getOverflowEntriesDescending() {
      return (Iterable)(this.overflowEntriesDescending.isEmpty() ? SmallSortedMap.EmptySet.iterable() : this.overflowEntriesDescending.entrySet());
   }

   public int size() {
      return this.entryList.size() + this.overflowEntries.size();
   }

   public boolean containsKey(Object var1) {
      Comparable var2 = (Comparable)var1;
      return this.binarySearchInArray(var2) >= 0 || this.overflowEntries.containsKey(var2);
   }

   public Object get(Object var1) {
      Comparable var2 = (Comparable)var1;
      int var3 = this.binarySearchInArray(var2);
      return var3 >= 0 ? ((SmallSortedMap.Entry)this.entryList.get(var3)).getValue() : this.overflowEntries.get(var2);
   }

   public Object put(Comparable var1, Object var2) {
      this.checkMutable();
      int var3 = this.binarySearchInArray(var1);
      if (var3 >= 0) {
         return ((SmallSortedMap.Entry)this.entryList.get(var3)).setValue(var2);
      } else {
         this.ensureEntryArrayMutable();
         int var4 = -(var3 + 1);
         if (var4 >= this.maxArraySize) {
            return this.getOverflowEntriesMutable().put(var1, var2);
         } else {
            if (this.entryList.size() == this.maxArraySize) {
               SmallSortedMap.Entry var5 = (SmallSortedMap.Entry)this.entryList.remove(this.maxArraySize - 1);
               this.getOverflowEntriesMutable().put(var5.getKey(), var5.getValue());
            }

            this.entryList.add(var4, new SmallSortedMap.Entry(var1, var2));
            return null;
         }
      }
   }

   public void clear() {
      this.checkMutable();
      if (!this.entryList.isEmpty()) {
         this.entryList.clear();
      }

      if (!this.overflowEntries.isEmpty()) {
         this.overflowEntries.clear();
      }

   }

   public Object remove(Object var1) {
      this.checkMutable();
      Comparable var2 = (Comparable)var1;
      int var3 = this.binarySearchInArray(var2);
      if (var3 >= 0) {
         return this.removeArrayEntryAt(var3);
      } else {
         return this.overflowEntries.isEmpty() ? null : this.overflowEntries.remove(var2);
      }
   }

   private Object removeArrayEntryAt(int var1) {
      this.checkMutable();
      Object var2 = ((SmallSortedMap.Entry)this.entryList.remove(var1)).getValue();
      if (!this.overflowEntries.isEmpty()) {
         Iterator var3 = this.getOverflowEntriesMutable().entrySet().iterator();
         this.entryList.add(new SmallSortedMap.Entry((java.util.Map.Entry)var3.next()));
         var3.remove();
      }

      return var2;
   }

   private int binarySearchInArray(Comparable var1) {
      int var2 = 0;
      int var3 = this.entryList.size() - 1;
      int var4;
      if (var3 >= 0) {
         var4 = var1.compareTo(((SmallSortedMap.Entry)this.entryList.get(var3)).getKey());
         if (var4 > 0) {
            return -(var3 + 2);
         }

         if (var4 == 0) {
            return var3;
         }
      }

      while(var2 <= var3) {
         var4 = (var2 + var3) / 2;
         int var5 = var1.compareTo(((SmallSortedMap.Entry)this.entryList.get(var4)).getKey());
         if (var5 < 0) {
            var3 = var4 - 1;
         } else {
            if (var5 <= 0) {
               return var4;
            }

            var2 = var4 + 1;
         }
      }

      return -(var2 + 1);
   }

   public Set entrySet() {
      if (this.lazyEntrySet == null) {
         this.lazyEntrySet = new SmallSortedMap.EntrySet();
      }

      return this.lazyEntrySet;
   }

   Set descendingEntrySet() {
      if (this.lazyDescendingEntrySet == null) {
         this.lazyDescendingEntrySet = new SmallSortedMap.DescendingEntrySet();
      }

      return this.lazyDescendingEntrySet;
   }

   private void checkMutable() {
      if (this.isImmutable) {
         throw new UnsupportedOperationException();
      }
   }

   private SortedMap getOverflowEntriesMutable() {
      this.checkMutable();
      if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
         this.overflowEntries = new TreeMap();
         this.overflowEntriesDescending = ((TreeMap)this.overflowEntries).descendingMap();
      }

      return (SortedMap)this.overflowEntries;
   }

   private void ensureEntryArrayMutable() {
      this.checkMutable();
      if (this.entryList.isEmpty() && !(this.entryList instanceof ArrayList)) {
         this.entryList = new ArrayList(this.maxArraySize);
      }

   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof SmallSortedMap)) {
         return super.equals(var1);
      } else {
         SmallSortedMap var2 = (SmallSortedMap)var1;
         int var3 = this.size();
         if (var3 != var2.size()) {
            return false;
         } else {
            int var4 = this.getNumArrayEntries();
            if (var4 != var2.getNumArrayEntries()) {
               return this.entrySet().equals(var2.entrySet());
            } else {
               for(int var5 = 0; var5 < var4; ++var5) {
                  if (!this.getArrayEntryAt(var5).equals(var2.getArrayEntryAt(var5))) {
                     return false;
                  }
               }

               if (var4 != var3) {
                  return this.overflowEntries.equals(var2.overflowEntries);
               } else {
                  return true;
               }
            }
         }
      }
   }

   public int hashCode() {
      int var1 = 0;
      int var2 = this.getNumArrayEntries();

      for(int var3 = 0; var3 < var2; ++var3) {
         var1 += ((SmallSortedMap.Entry)this.entryList.get(var3)).hashCode();
      }

      if (this.getNumOverflowEntries() > 0) {
         var1 += this.overflowEntries.hashCode();
      }

      return var1;
   }

   // $FF: synthetic method
   SmallSortedMap(int var1, Object var2) {
      this(var1);
   }

   private static class EmptySet {
      private static final Iterator ITERATOR = new Iterator() {
         public boolean hasNext() {
            return false;
         }

         public Object next() {
            throw new NoSuchElementException();
         }

         public void remove() {
            throw new UnsupportedOperationException();
         }
      };
      private static final Iterable ITERABLE = new Iterable() {
         public Iterator iterator() {
            return SmallSortedMap.EmptySet.ITERATOR;
         }
      };

      static Iterable iterable() {
         return ITERABLE;
      }
   }

   private class DescendingEntryIterator implements Iterator {
      private int pos;
      private Iterator lazyOverflowIterator;

      private DescendingEntryIterator() {
         this.pos = SmallSortedMap.this.entryList.size();
      }

      public boolean hasNext() {
         return this.pos > 0 && this.pos <= SmallSortedMap.this.entryList.size() || this.getOverflowIterator().hasNext();
      }

      public java.util.Map.Entry next() {
         return this.getOverflowIterator().hasNext() ? (java.util.Map.Entry)this.getOverflowIterator().next() : (java.util.Map.Entry)SmallSortedMap.this.entryList.get(--this.pos);
      }

      public void remove() {
         throw new UnsupportedOperationException();
      }

      private Iterator getOverflowIterator() {
         if (this.lazyOverflowIterator == null) {
            this.lazyOverflowIterator = SmallSortedMap.this.overflowEntriesDescending.entrySet().iterator();
         }

         return this.lazyOverflowIterator;
      }

      // $FF: synthetic method
      DescendingEntryIterator(Object var2) {
         this();
      }
   }

   private class EntryIterator implements Iterator {
      private int pos;
      private boolean nextCalledBeforeRemove;
      private Iterator lazyOverflowIterator;

      private EntryIterator() {
         this.pos = -1;
      }

      public boolean hasNext() {
         return this.pos + 1 < SmallSortedMap.this.entryList.size() || !SmallSortedMap.this.overflowEntries.isEmpty() && this.getOverflowIterator().hasNext();
      }

      public java.util.Map.Entry next() {
         this.nextCalledBeforeRemove = true;
         return ++this.pos < SmallSortedMap.this.entryList.size() ? (java.util.Map.Entry)SmallSortedMap.this.entryList.get(this.pos) : (java.util.Map.Entry)this.getOverflowIterator().next();
      }

      public void remove() {
         if (!this.nextCalledBeforeRemove) {
            throw new IllegalStateException("remove() was called before next()");
         } else {
            this.nextCalledBeforeRemove = false;
            SmallSortedMap.this.checkMutable();
            if (this.pos < SmallSortedMap.this.entryList.size()) {
               SmallSortedMap.this.removeArrayEntryAt(this.pos--);
            } else {
               this.getOverflowIterator().remove();
            }

         }
      }

      private Iterator getOverflowIterator() {
         if (this.lazyOverflowIterator == null) {
            this.lazyOverflowIterator = SmallSortedMap.this.overflowEntries.entrySet().iterator();
         }

         return this.lazyOverflowIterator;
      }

      // $FF: synthetic method
      EntryIterator(Object var2) {
         this();
      }
   }

   private class DescendingEntrySet extends SmallSortedMap.EntrySet {
      private DescendingEntrySet() {
         super(null);
      }

      public Iterator iterator() {
         return SmallSortedMap.this.new DescendingEntryIterator();
      }

      // $FF: synthetic method
      DescendingEntrySet(Object var2) {
         this();
      }
   }

   private class EntrySet extends AbstractSet {
      private EntrySet() {
      }

      public Iterator iterator() {
         return SmallSortedMap.this.new EntryIterator();
      }

      public int size() {
         return SmallSortedMap.this.size();
      }

      public boolean contains(Object var1) {
         java.util.Map.Entry var2 = (java.util.Map.Entry)var1;
         Object var3 = SmallSortedMap.this.get(var2.getKey());
         Object var4 = var2.getValue();
         return var3 == var4 || var3 != null && var3.equals(var4);
      }

      public boolean add(java.util.Map.Entry var1) {
         if (!this.contains(var1)) {
            SmallSortedMap.this.put((Comparable)var1.getKey(), var1.getValue());
            return true;
         } else {
            return false;
         }
      }

      public boolean remove(Object var1) {
         java.util.Map.Entry var2 = (java.util.Map.Entry)var1;
         if (this.contains(var2)) {
            SmallSortedMap.this.remove(var2.getKey());
            return true;
         } else {
            return false;
         }
      }

      public void clear() {
         SmallSortedMap.this.clear();
      }

      // $FF: synthetic method
      EntrySet(Object var2) {
         this();
      }
   }

   private class Entry implements java.util.Map.Entry, Comparable {
      private final Comparable key;
      private Object value;

      Entry(java.util.Map.Entry var2) {
         this((Comparable)var2.getKey(), var2.getValue());
      }

      Entry(Comparable var2, Object var3) {
         this.key = var2;
         this.value = var3;
      }

      public Comparable getKey() {
         return this.key;
      }

      public Object getValue() {
         return this.value;
      }

      public int compareTo(SmallSortedMap.Entry var1) {
         return this.getKey().compareTo(var1.getKey());
      }

      public Object setValue(Object var1) {
         SmallSortedMap.this.checkMutable();
         Object var2 = this.value;
         this.value = var1;
         return var2;
      }

      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof java.util.Map.Entry)) {
            return false;
         } else {
            java.util.Map.Entry var2 = (java.util.Map.Entry)var1;
            return this.equals(this.key, var2.getKey()) && this.equals(this.value, var2.getValue());
         }
      }

      public int hashCode() {
         return (this.key == null ? 0 : this.key.hashCode()) ^ (this.value == null ? 0 : this.value.hashCode());
      }

      public String toString() {
         return this.key + "=" + this.value;
      }

      private boolean equals(Object var1, Object var2) {
         return var1 == null ? var2 == null : var1.equals(var2);
      }

      @Override
      public int compareTo(Object o) {
         return 0;
      }
   }
}
