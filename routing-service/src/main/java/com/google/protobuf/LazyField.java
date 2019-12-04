package com.google.protobuf;

import java.util.Iterator;
import java.util.Map.Entry;

public class LazyField extends LazyFieldLite {
   private final MessageLite defaultInstance;

   public LazyField(MessageLite var1, ExtensionRegistryLite var2, ByteString var3) {
      super(var2, var3);
      this.defaultInstance = var1;
   }

   public boolean containsDefaultInstance() {
      return super.containsDefaultInstance() || this.value == this.defaultInstance;
   }

   public MessageLite getValue() {
      return this.getValue(this.defaultInstance);
   }

   public int hashCode() {
      return this.getValue().hashCode();
   }

   public boolean equals(Object var1) {
      return this.getValue().equals(var1);
   }

   public String toString() {
      return this.getValue().toString();
   }

   static class LazyIterator implements Iterator {
      private Iterator iterator;

      public LazyIterator(Iterator var1) {
         this.iterator = var1;
      }

      public boolean hasNext() {
         return this.iterator.hasNext();
      }

      public Entry next() {
         Entry var1 = (Entry)this.iterator.next();
         return (Entry)(var1.getValue() instanceof LazyField ? new LazyField.LazyEntry(var1) : var1);
      }

      public void remove() {
         this.iterator.remove();
      }
   }

   static class LazyEntry implements Entry {
      private Entry entry;

      private LazyEntry(Entry var1) {
         this.entry = var1;
      }

      public Object getKey() {
         return this.entry.getKey();
      }

      public Object getValue() {
         LazyField var1 = (LazyField)this.entry.getValue();
         return var1 == null ? null : var1.getValue();
      }

      public LazyField getField() {
         return (LazyField)this.entry.getValue();
      }

      public Object setValue(Object var1) {
         if (!(var1 instanceof MessageLite)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
         } else {
            return ((LazyField)this.entry.getValue()).setValue((MessageLite)var1);
         }
      }

      // $FF: synthetic method
      LazyEntry(Entry var1, Object var2) {
         this(var1);
      }
   }
}
