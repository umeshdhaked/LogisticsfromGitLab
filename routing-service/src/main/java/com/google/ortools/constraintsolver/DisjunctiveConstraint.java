package com.google.ortools.constraintsolver;

import java.util.function.LongBinaryOperator;

public class DisjunctiveConstraint extends Constraint {
   private transient long swigCPtr;

   protected DisjunctiveConstraint(long var1, boolean var3) {
      super(mainJNI.DisjunctiveConstraint_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(DisjunctiveConstraint var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_DisjunctiveConstraint(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public SequenceVar makeSequenceVar() {
      long var1 = mainJNI.DisjunctiveConstraint_makeSequenceVar(this.swigCPtr, this);
      return var1 == 0L ? null : new SequenceVar(var1, false);
   }

   public void setTransitionTime(LongBinaryOperator var1) {
      mainJNI.DisjunctiveConstraint_setTransitionTime(this.swigCPtr, this, var1);
   }

   public long transitionTime(int var1, int var2) {
      return mainJNI.DisjunctiveConstraint_transitionTime(this.swigCPtr, this, var1, var2);
   }
}
