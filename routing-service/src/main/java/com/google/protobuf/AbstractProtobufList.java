package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class AbstractProtobufList extends AbstractList implements Internal.ProtobufList {
   protected static final int DEFAULT_CAPACITY = 10;
   private boolean isMutable = true;

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof List)) {
         return false;
      } else if (!(var1 instanceof RandomAccess)) {
         return super.equals(var1);
      } else {
         List var2 = (List)var1;
         int var3 = this.size();
         if (var3 != var2.size()) {
            return false;
         } else {
            for(int var4 = 0; var4 < var3; ++var4) {
               if (!this.get(var4).equals(var2.get(var4))) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public int hashCode() {
      int var1 = this.size();
      int var2 = 1;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = 31 * var2 + this.get(var3).hashCode();
      }

      return var2;
   }

   public boolean add(Object var1) {
      this.ensureIsMutable();
      return super.add(var1);
   }

   public void add(int var1, Object var2) {
      this.ensureIsMutable();
      super.add(var1, var2);
   }

   public boolean addAll(Collection var1) {
      this.ensureIsMutable();
      return super.addAll(var1);
   }

   public boolean addAll(int var1, Collection var2) {
      this.ensureIsMutable();
      return super.addAll(var1, var2);
   }

   public void clear() {
      this.ensureIsMutable();
      super.clear();
   }

   public boolean isModifiable() {
      return this.isMutable;
   }

   public final void makeImmutable() {
      this.isMutable = false;
   }

   public Object remove(int var1) {
      this.ensureIsMutable();
      return super.remove(var1);
   }

   public boolean remove(Object var1) {
      this.ensureIsMutable();
      return super.remove(var1);
   }

   public boolean removeAll(Collection var1) {
      this.ensureIsMutable();
      return super.removeAll(var1);
   }

   public boolean retainAll(Collection var1) {
      this.ensureIsMutable();
      return super.retainAll(var1);
   }

   public Object set(int var1, Object var2) {
      this.ensureIsMutable();
      return super.set(var1, var2);
   }

   protected void ensureIsMutable() {
      if (!this.isMutable) {
         throw new UnsupportedOperationException();
      }
   }
}
