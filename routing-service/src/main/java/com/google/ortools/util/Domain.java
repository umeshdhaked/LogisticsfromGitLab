package com.google.ortools.util;

public class Domain {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected Domain(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(Domain var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_Domain(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public Domain() {
      this(mainJNI.new_Domain__SWIG_0(), true);
   }

   public Domain(long var1) {
      this(mainJNI.new_Domain__SWIG_1(var1), true);
   }

   public Domain(long var1, long var3) {
      this(mainJNI.new_Domain__SWIG_2(var1, var3), true);
   }

   public static Domain allValues() {
      return new Domain(mainJNI.Domain_allValues(), true);
   }

   public static Domain fromValues(long[] var0) {
      return new Domain(mainJNI.Domain_fromValues(var0), true);
   }

   public static Domain fromIntervals(long[][] var0) {
      return new Domain(mainJNI.Domain_fromIntervals(var0), true);
   }

   public static Domain fromFlatIntervals(long[] var0) {
      return new Domain(mainJNI.Domain_fromFlatIntervals(var0), true);
   }

   public long[] flattenedIntervals() {
      return mainJNI.Domain_flattenedIntervals(this.swigCPtr, this);
   }

   public boolean isEmpty() {
      return mainJNI.Domain_isEmpty(this.swigCPtr, this);
   }

   public long size() {
      return mainJNI.Domain_size(this.swigCPtr, this);
   }

   public long min() {
      return mainJNI.Domain_min(this.swigCPtr, this);
   }

   public long max() {
      return mainJNI.Domain_max(this.swigCPtr, this);
   }

   public boolean contains(long var1) {
      return mainJNI.Domain_contains(this.swigCPtr, this, var1);
   }

   public Domain complement() {
      return new Domain(mainJNI.Domain_complement(this.swigCPtr, this), true);
   }

   public Domain negation() {
      return new Domain(mainJNI.Domain_negation(this.swigCPtr, this), true);
   }

   public Domain intersectionWith(Domain var1) {
      return new Domain(mainJNI.Domain_intersectionWith(this.swigCPtr, this, getCPtr(var1), var1), true);
   }

   public Domain unionWith(Domain var1) {
      return new Domain(mainJNI.Domain_unionWith(this.swigCPtr, this, getCPtr(var1), var1), true);
   }

   public Domain additionWith(Domain var1) {
      return new Domain(mainJNI.Domain_additionWith(this.swigCPtr, this, getCPtr(var1), var1), true);
   }

   public String toString() {
      return mainJNI.Domain_toString(this.swigCPtr, this);
   }
}
