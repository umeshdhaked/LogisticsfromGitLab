package com.google.ortools.constraintsolver;

public class IntVarElement extends AssignmentElement {
   private transient long swigCPtr;

   protected IntVarElement(long var1, boolean var3) {
      super(mainJNI.IntVarElement_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntVarElement var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntVarElement(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public IntVarElement() {
      this(mainJNI.new_IntVarElement__SWIG_0(), true);
   }

   public IntVarElement(IntVar var1) {
      this(mainJNI.new_IntVarElement__SWIG_1(IntVar.getCPtr(var1), var1), true);
   }

   public void reset(IntVar var1) {
      mainJNI.IntVarElement_reset(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public IntVarElement clone() {
      long var1 = mainJNI.IntVarElement_clone(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVarElement(var1, false);
   }

   public void copy(IntVarElement var1) {
      mainJNI.IntVarElement_copy(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public IntVar var() {
      long var1 = mainJNI.IntVarElement_var(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVar(var1, false);
   }

   public void store() {
      mainJNI.IntVarElement_store(this.swigCPtr, this);
   }

   public void restore() {
      mainJNI.IntVarElement_restore(this.swigCPtr, this);
   }

   public long min() {
      return mainJNI.IntVarElement_min(this.swigCPtr, this);
   }

   public void setMin(long var1) {
      mainJNI.IntVarElement_setMin(this.swigCPtr, this, var1);
   }

   public long max() {
      return mainJNI.IntVarElement_max(this.swigCPtr, this);
   }

   public void setMax(long var1) {
      mainJNI.IntVarElement_setMax(this.swigCPtr, this, var1);
   }

   public long value() {
      return mainJNI.IntVarElement_value(this.swigCPtr, this);
   }

   public boolean bound() {
      return mainJNI.IntVarElement_bound(this.swigCPtr, this);
   }

   public void setRange(long var1, long var3) {
      mainJNI.IntVarElement_setRange(this.swigCPtr, this, var1, var3);
   }

   public void setValue(long var1) {
      mainJNI.IntVarElement_setValue(this.swigCPtr, this, var1);
   }

   public String toString() {
      return mainJNI.IntVarElement_toString(this.swigCPtr, this);
   }
}
