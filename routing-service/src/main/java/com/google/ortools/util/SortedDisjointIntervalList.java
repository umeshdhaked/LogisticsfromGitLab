package com.google.ortools.util;

public class SortedDisjointIntervalList {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected SortedDisjointIntervalList(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SortedDisjointIntervalList var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SortedDisjointIntervalList(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public SortedDisjointIntervalList() {
      this(mainJNI.new_SortedDisjointIntervalList__SWIG_0(), true);
   }

   public SortedDisjointIntervalList(SWIGTYPE_p_std__vectorT_operations_research__ClosedInterval_t var1) {
      this(mainJNI.new_SortedDisjointIntervalList__SWIG_1(SWIGTYPE_p_std__vectorT_operations_research__ClosedInterval_t.getCPtr(var1)), true);
   }

   public SortedDisjointIntervalList(long[] var1, long[] var2) {
      this(mainJNI.new_SortedDisjointIntervalList__SWIG_2(var1, var2), true);
   }

   public SortedDisjointIntervalList(int[] var1, int[] var2) {
      this(mainJNI.new_SortedDisjointIntervalList__SWIG_3(var1, var2), true);
   }

   public SortedDisjointIntervalList buildComplementOnInterval(long var1, long var3) {
      return new SortedDisjointIntervalList(mainJNI.SortedDisjointIntervalList_buildComplementOnInterval(this.swigCPtr, this, var1, var3), true);
   }

   public SWIGTYPE_p_std__setT_operations_research__ClosedInterval_operations_research__SortedDisjointIntervalList__IntervalComparator_t__iterator insertInterval(long var1, long var3) {
      return new SWIGTYPE_p_std__setT_operations_research__ClosedInterval_operations_research__SortedDisjointIntervalList__IntervalComparator_t__iterator(mainJNI.SortedDisjointIntervalList_insertInterval(this.swigCPtr, this, var1, var3), true);
   }

   public void insertIntervals(long[] var1, long[] var2) {
      mainJNI.SortedDisjointIntervalList_insertIntervals__SWIG_0(this.swigCPtr, this, var1, var2);
   }

   public void insertIntervals(int[] var1, int[] var2) {
      mainJNI.SortedDisjointIntervalList_insertIntervals__SWIG_1(this.swigCPtr, this, var1, var2);
   }

   public int numIntervals() {
      return mainJNI.SortedDisjointIntervalList_numIntervals(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.SortedDisjointIntervalList_toString(this.swigCPtr, this);
   }
}
