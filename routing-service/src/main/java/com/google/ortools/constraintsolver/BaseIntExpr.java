package com.google.ortools.constraintsolver;

public class BaseIntExpr extends IntExpr {
   private transient long swigCPtr;

   protected BaseIntExpr(long var1, boolean var3) {
      super(mainJNI.BaseIntExpr_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(BaseIntExpr var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_BaseIntExpr(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public IntVar var() {
      long var1 = mainJNI.BaseIntExpr_var(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVar(var1, false);
   }

   public IntVar castToVar() {
      long var1 = mainJNI.BaseIntExpr_castToVar(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVar(var1, false);
   }
}
