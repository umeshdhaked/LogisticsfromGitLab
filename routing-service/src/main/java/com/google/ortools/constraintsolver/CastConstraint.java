package com.google.ortools.constraintsolver;

public class CastConstraint extends Constraint {
   private transient long swigCPtr;

   protected CastConstraint(long var1, boolean var3) {
      super(mainJNI.CastConstraint_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(CastConstraint var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_CastConstraint(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public IntVar target_var() {
      long var1 = mainJNI.CastConstraint_target_var(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVar(var1, false);
   }
}
