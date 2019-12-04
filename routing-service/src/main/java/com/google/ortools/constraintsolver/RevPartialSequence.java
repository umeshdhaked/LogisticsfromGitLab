package com.google.ortools.constraintsolver;

public class RevPartialSequence {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected RevPartialSequence(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(RevPartialSequence var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_RevPartialSequence(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public RevPartialSequence(int[] var1) {
      this(mainJNI.new_RevPartialSequence__SWIG_0(var1), true);
   }

   public RevPartialSequence(int var1) {
      this(mainJNI.new_RevPartialSequence__SWIG_1(var1), true);
   }

   public int numFirstRanked() {
      return mainJNI.RevPartialSequence_numFirstRanked(this.swigCPtr, this);
   }

   public int numLastRanked() {
      return mainJNI.RevPartialSequence_numLastRanked(this.swigCPtr, this);
   }

   public int size() {
      return mainJNI.RevPartialSequence_size(this.swigCPtr, this);
   }

   public void rankFirst(Solver var1, int var2) {
      mainJNI.RevPartialSequence_rankFirst(this.swigCPtr, this, Solver.getCPtr(var1), var1, var2);
   }

   public void rankLast(Solver var1, int var2) {
      mainJNI.RevPartialSequence_rankLast(this.swigCPtr, this, Solver.getCPtr(var1), var1, var2);
   }

   public boolean isRanked(int var1) {
      return mainJNI.RevPartialSequence_isRanked(this.swigCPtr, this, var1);
   }

   public String toString() {
      return mainJNI.RevPartialSequence_toString(this.swigCPtr, this);
   }
}
