package com.google.ortools.constraintsolver;

public class IntVarLocalSearchOperatorTemplate extends LocalSearchOperator {
   private transient long swigCPtr;

   protected IntVarLocalSearchOperatorTemplate(long var1, boolean var3) {
      super(mainJNI.IntVarLocalSearchOperatorTemplate_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntVarLocalSearchOperatorTemplate var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntVarLocalSearchOperatorTemplate(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public boolean HoldsDelta() {
      return mainJNI.IntVarLocalSearchOperatorTemplate_HoldsDelta(this.swigCPtr, this);
   }

   public boolean isIncremental() {
      return mainJNI.IntVarLocalSearchOperatorTemplate_isIncremental(this.swigCPtr, this);
   }

   public int size() {
      return mainJNI.IntVarLocalSearchOperatorTemplate_size(this.swigCPtr, this);
   }

   public long value(long var1) {
      return mainJNI.IntVarLocalSearchOperatorTemplate_value(this.swigCPtr, this, var1);
   }

   public IntVar var(long var1) {
      long var3 = mainJNI.IntVarLocalSearchOperatorTemplate_var(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public long oldValue(long var1) {
      return mainJNI.IntVarLocalSearchOperatorTemplate_oldValue(this.swigCPtr, this, var1);
   }

   public void setValue(long var1, long var3) {
      mainJNI.IntVarLocalSearchOperatorTemplate_setValue(this.swigCPtr, this, var1, var3);
   }

   public boolean activated(long var1) {
      return mainJNI.IntVarLocalSearchOperatorTemplate_activated(this.swigCPtr, this, var1);
   }

   public void activate(long var1) {
      mainJNI.IntVarLocalSearchOperatorTemplate_activate(this.swigCPtr, this, var1);
   }

   public void deactivate(long var1) {
      mainJNI.IntVarLocalSearchOperatorTemplate_deactivate(this.swigCPtr, this, var1);
   }

   public void addVars(IntVar[] var1) {
      mainJNI.IntVarLocalSearchOperatorTemplate_addVars(this.swigCPtr, this, var1);
   }

   public void onStart() {
      mainJNI.IntVarLocalSearchOperatorTemplate_onStart(this.swigCPtr, this);
   }
}
