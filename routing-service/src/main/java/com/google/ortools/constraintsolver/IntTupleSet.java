package com.google.ortools.constraintsolver;

public class IntTupleSet {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected IntTupleSet(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntTupleSet var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntTupleSet(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public IntTupleSet(int var1) {
      this(mainJNI.new_IntTupleSet__SWIG_0(var1), true);
   }

   public IntTupleSet(IntTupleSet var1) {
      this(mainJNI.new_IntTupleSet__SWIG_1(getCPtr(var1), var1), true);
   }

   public void clear() {
      mainJNI.IntTupleSet_clear(this.swigCPtr, this);
   }

   public int insert(int[] var1) {
      return mainJNI.IntTupleSet_insert__SWIG_0(this.swigCPtr, this, var1);
   }

   public int insert(long[] var1) {
      return mainJNI.IntTupleSet_insert__SWIG_1(this.swigCPtr, this, var1);
   }

   public int insert2(long var1, long var3) {
      return mainJNI.IntTupleSet_insert2(this.swigCPtr, this, var1, var3);
   }

   public int insert3(long var1, long var3, long var5) {
      return mainJNI.IntTupleSet_insert3(this.swigCPtr, this, var1, var3, var5);
   }

   public int insert4(long var1, long var3, long var5, long var7) {
      return mainJNI.IntTupleSet_insert4(this.swigCPtr, this, var1, var3, var5, var7);
   }

   public void insertAll(long[][] var1) {
      mainJNI.IntTupleSet_insertAll__SWIG_0(this.swigCPtr, this, var1);
   }

   public void insertAll(int[][] var1) {
      mainJNI.IntTupleSet_insertAll__SWIG_1(this.swigCPtr, this, var1);
   }

   public boolean contains(int[] var1) {
      return mainJNI.IntTupleSet_contains__SWIG_0(this.swigCPtr, this, var1);
   }

   public boolean contains(long[] var1) {
      return mainJNI.IntTupleSet_contains__SWIG_1(this.swigCPtr, this, var1);
   }

   public int numTuples() {
      return mainJNI.IntTupleSet_numTuples(this.swigCPtr, this);
   }

   public long value(int var1, int var2) {
      return mainJNI.IntTupleSet_value(this.swigCPtr, this, var1, var2);
   }

   public int arity() {
      return mainJNI.IntTupleSet_arity(this.swigCPtr, this);
   }

   public int numDifferentValuesInColumn(int var1) {
      return mainJNI.IntTupleSet_numDifferentValuesInColumn(this.swigCPtr, this, var1);
   }

   public IntTupleSet sortedByColumn(int var1) {
      return new IntTupleSet(mainJNI.IntTupleSet_sortedByColumn(this.swigCPtr, this, var1), true);
   }

   public IntTupleSet sortedLexicographically() {
      return new IntTupleSet(mainJNI.IntTupleSet_sortedLexicographically(this.swigCPtr, this), true);
   }
}
