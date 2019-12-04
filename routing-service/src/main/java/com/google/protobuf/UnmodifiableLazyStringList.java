package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class UnmodifiableLazyStringList extends AbstractList implements LazyStringList, RandomAccess {
   private final LazyStringList list;

   public UnmodifiableLazyStringList(LazyStringList var1) {
      this.list = var1;
   }

   public String get(int var1) {
      return (String)this.list.get(var1);
   }

   public Object getRaw(int var1) {
      return this.list.getRaw(var1);
   }

   public int size() {
      return this.list.size();
   }

   public ByteString getByteString(int var1) {
      return this.list.getByteString(var1);
   }

   public void add(ByteString var1) {
      throw new UnsupportedOperationException();
   }

   public void set(int var1, ByteString var2) {
      throw new UnsupportedOperationException();
   }

   public boolean addAllByteString(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public byte[] getByteArray(int var1) {
      return this.list.getByteArray(var1);
   }

   public void add(byte[] var1) {
      throw new UnsupportedOperationException();
   }

   public void set(int var1, byte[] var2) {
      throw new UnsupportedOperationException();
   }

   public boolean addAllByteArray(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public ListIterator listIterator(final int var1) {
      return new ListIterator() {
         ListIterator iter;

         {
            this.iter = UnmodifiableLazyStringList.this.list.listIterator(var1);
         }

         public boolean hasNext() {
            return this.iter.hasNext();
         }

         public String next() {
            return (String)this.iter.next();
         }

         public boolean hasPrevious() {
            return this.iter.hasPrevious();
         }

         public String previous() {
            return (String)this.iter.previous();
         }

         public int nextIndex() {
            return this.iter.nextIndex();
         }

         public int previousIndex() {
            return this.iter.previousIndex();
         }

         public void remove() {
            throw new UnsupportedOperationException();
         }

         @Override
         public void set(Object o) {

         }

         @Override
         public void add(Object o) {

         }

         public void set(String var1x) {
            throw new UnsupportedOperationException();
         }

         public void add(String var1x) {
            throw new UnsupportedOperationException();
         }
      };
   }

   public Iterator iterator() {
      return new Iterator() {
         Iterator iter;

         {
            this.iter = UnmodifiableLazyStringList.this.list.iterator();
         }

         public boolean hasNext() {
            return this.iter.hasNext();
         }

         public String next() {
            return (String)this.iter.next();
         }

         public void remove() {
            throw new UnsupportedOperationException();
         }
      };
   }

   public List getUnderlyingElements() {
      return this.list.getUnderlyingElements();
   }

   public void mergeFrom(LazyStringList var1) {
      throw new UnsupportedOperationException();
   }

   public List asByteArrayList() {
      return Collections.unmodifiableList(this.list.asByteArrayList());
   }

   public List asByteStringList() {
      return Collections.unmodifiableList(this.list.asByteStringList());
   }

   public LazyStringList getUnmodifiableView() {
      return this;
   }
}
