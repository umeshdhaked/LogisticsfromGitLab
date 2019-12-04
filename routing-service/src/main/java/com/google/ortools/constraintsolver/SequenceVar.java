package com.google.ortools.constraintsolver;

public class SequenceVar extends PropagationBaseObject {
   private transient long swigCPtr;

   protected SequenceVar(long var1, boolean var3) {
      super(mainJNI.SequenceVar_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SequenceVar var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SequenceVar(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public SequenceVar(Solver var1, IntervalVar[] var2, IntVar[] var3, String var4) {
      this(mainJNI.new_SequenceVar(Solver.getCPtr(var1), var1, var2, var3, var4), true);
   }

   public String toString() {
      return mainJNI.SequenceVar_toString(this.swigCPtr, this);
   }

   public void rankFirst(int var1) {
      mainJNI.SequenceVar_rankFirst(this.swigCPtr, this, var1);
   }

   public void rankNotFirst(int var1) {
      mainJNI.SequenceVar_rankNotFirst(this.swigCPtr, this, var1);
   }

   public void rankLast(int var1) {
      mainJNI.SequenceVar_rankLast(this.swigCPtr, this, var1);
   }

   public void rankNotLast(int var1) {
      mainJNI.SequenceVar_rankNotLast(this.swigCPtr, this, var1);
   }

   public void rankSequence(int[] var1, int[] var2, int[] var3) {
      mainJNI.SequenceVar_rankSequence(this.swigCPtr, this, var1, var2, var3);
   }

   public IntervalVar interval(int var1) {
      long var2 = mainJNI.SequenceVar_interval(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntervalVar(var2, false);
   }

   public IntVar next(int var1) {
      long var2 = mainJNI.SequenceVar_next(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVar(var2, false);
   }

   public long size() {
      return mainJNI.SequenceVar_size(this.swigCPtr, this);
   }

   public void accept(ModelVisitor var1) {
      mainJNI.SequenceVar_accept(this.swigCPtr, this, ModelVisitor.getCPtr(var1), var1);
   }
}
