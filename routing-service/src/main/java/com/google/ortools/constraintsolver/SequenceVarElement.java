package com.google.ortools.constraintsolver;

public class SequenceVarElement extends AssignmentElement {
   private transient long swigCPtr;

   protected SequenceVarElement(long var1, boolean var3) {
      super(mainJNI.SequenceVarElement_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SequenceVarElement var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SequenceVarElement(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public SequenceVarElement() {
      this(mainJNI.new_SequenceVarElement__SWIG_0(), true);
   }

   public SequenceVarElement(SequenceVar var1) {
      this(mainJNI.new_SequenceVarElement__SWIG_1(SequenceVar.getCPtr(var1), var1), true);
   }

   public void reset(SequenceVar var1) {
      mainJNI.SequenceVarElement_reset(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
   }

   public SequenceVarElement clone() {
      long var1 = mainJNI.SequenceVarElement_clone(this.swigCPtr, this);
      return var1 == 0L ? null : new SequenceVarElement(var1, false);
   }

   public void copy(SequenceVarElement var1) {
      mainJNI.SequenceVarElement_copy(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public SequenceVar var() {
      long var1 = mainJNI.SequenceVarElement_var(this.swigCPtr, this);
      return var1 == 0L ? null : new SequenceVar(var1, false);
   }

   public void store() {
      mainJNI.SequenceVarElement_store(this.swigCPtr, this);
   }

   public void restore() {
      mainJNI.SequenceVarElement_restore(this.swigCPtr, this);
   }

   public int[] forwardSequence() {
      return mainJNI.SequenceVarElement_forwardSequence(this.swigCPtr, this);
   }

   public int[] backwardSequence() {
      return mainJNI.SequenceVarElement_backwardSequence(this.swigCPtr, this);
   }

   public int[] unperformed() {
      return mainJNI.SequenceVarElement_unperformed(this.swigCPtr, this);
   }

   public void setSequence(int[] var1, int[] var2, int[] var3) {
      mainJNI.SequenceVarElement_setSequence(this.swigCPtr, this, var1, var2, var3);
   }

   public void setForwardSequence(int[] var1) {
      mainJNI.SequenceVarElement_setForwardSequence(this.swigCPtr, this, var1);
   }

   public void setBackwardSequence(int[] var1) {
      mainJNI.SequenceVarElement_setBackwardSequence(this.swigCPtr, this, var1);
   }

   public void setUnperformed(int[] var1) {
      mainJNI.SequenceVarElement_setUnperformed(this.swigCPtr, this, var1);
   }

   public boolean bound() {
      return mainJNI.SequenceVarElement_bound(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.SequenceVarElement_toString(this.swigCPtr, this);
   }
}
