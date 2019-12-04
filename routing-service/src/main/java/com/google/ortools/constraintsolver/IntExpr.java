package com.google.ortools.constraintsolver;

public class IntExpr extends PropagationBaseObject {
   private transient long swigCPtr;

   protected IntExpr(long var1, boolean var3) {
      super(mainJNI.IntExpr_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntExpr var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntExpr(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public long min() {
      return mainJNI.IntExpr_min(this.swigCPtr, this);
   }

   public void setMin(long var1) {
      mainJNI.IntExpr_setMin(this.swigCPtr, this, var1);
   }

   public long max() {
      return mainJNI.IntExpr_max(this.swigCPtr, this);
   }

   public void setMax(long var1) {
      mainJNI.IntExpr_setMax(this.swigCPtr, this, var1);
   }

   public void range(long[] var1, long[] var2) {
      mainJNI.IntExpr_range(this.swigCPtr, this, var1, var2);
   }

   public void setRange(long var1, long var3) {
      mainJNI.IntExpr_setRange(this.swigCPtr, this, var1, var3);
   }

   public void setValue(long var1) {
      mainJNI.IntExpr_setValue(this.swigCPtr, this, var1);
   }

   public boolean bound() {
      return mainJNI.IntExpr_bound(this.swigCPtr, this);
   }

   public boolean isVar() {
      return mainJNI.IntExpr_isVar(this.swigCPtr, this);
   }

   public IntVar var() {
      long var1 = mainJNI.IntExpr_var(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVar(var1, false);
   }

   public IntVar varWithName(String var1) {
      long var2 = mainJNI.IntExpr_varWithName(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVar(var2, false);
   }

   public void whenRange(Demon var1) {
      mainJNI.IntExpr_whenRange__SWIG_0(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenRange(Runnable var1) {
      mainJNI.IntExpr_whenRange__SWIG_1(this.swigCPtr, this, var1);
   }

   public void accept(ModelVisitor var1) {
      mainJNI.IntExpr_accept(this.swigCPtr, this, ModelVisitor.getCPtr(var1), var1);
   }
}
