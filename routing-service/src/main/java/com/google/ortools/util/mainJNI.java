package com.google.ortools.util;

public class mainJNI {
   public static final native long new_Domain__SWIG_0();

   public static final native long new_Domain__SWIG_1(long var0);

   public static final native long new_Domain__SWIG_2(long var0, long var2);

   public static final native long Domain_allValues();

   public static final native long Domain_fromValues(long[] var0);

   public static final native long Domain_fromIntervals(long[][] var0);

   public static final native long Domain_fromFlatIntervals(long[] var0);

   public static final native long[] Domain_flattenedIntervals(long var0, Domain var2);

   public static final native boolean Domain_isEmpty(long var0, Domain var2);

   public static final native long Domain_size(long var0, Domain var2);

   public static final native long Domain_min(long var0, Domain var2);

   public static final native long Domain_max(long var0, Domain var2);

   public static final native boolean Domain_contains(long var0, Domain var2, long var3);

   public static final native long Domain_complement(long var0, Domain var2);

   public static final native long Domain_negation(long var0, Domain var2);

   public static final native long Domain_intersectionWith(long var0, Domain var2, long var3, Domain var5);

   public static final native long Domain_unionWith(long var0, Domain var2, long var3, Domain var5);

   public static final native long Domain_additionWith(long var0, Domain var2, long var3, Domain var5);

   public static final native String Domain_toString(long var0, Domain var2);

   public static final native void delete_Domain(long var0);

   public static final native long new_SortedDisjointIntervalList__SWIG_0();

   public static final native long new_SortedDisjointIntervalList__SWIG_1(long var0);

   public static final native long new_SortedDisjointIntervalList__SWIG_2(long[] var0, long[] var1);

   public static final native long new_SortedDisjointIntervalList__SWIG_3(int[] var0, int[] var1);

   public static final native long SortedDisjointIntervalList_buildComplementOnInterval(long var0, SortedDisjointIntervalList var2, long var3, long var5);

   public static final native long SortedDisjointIntervalList_insertInterval(long var0, SortedDisjointIntervalList var2, long var3, long var5);

   public static final native void SortedDisjointIntervalList_insertIntervals__SWIG_0(long var0, SortedDisjointIntervalList var2, long[] var3, long[] var4);

   public static final native void SortedDisjointIntervalList_insertIntervals__SWIG_1(long var0, SortedDisjointIntervalList var2, int[] var3, int[] var4);

   public static final native int SortedDisjointIntervalList_numIntervals(long var0, SortedDisjointIntervalList var2);

   public static final native String SortedDisjointIntervalList_toString(long var0, SortedDisjointIntervalList var2);

   public static final native void delete_SortedDisjointIntervalList(long var0);
}
