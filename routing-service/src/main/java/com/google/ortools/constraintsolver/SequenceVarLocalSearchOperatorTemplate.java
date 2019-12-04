package com.google.ortools.constraintsolver;

public class SequenceVarLocalSearchOperatorTemplate extends LocalSearchOperator {
   private transient long swigCPtr;

   protected SequenceVarLocalSearchOperatorTemplate(long var1, boolean var3) {
      super(mainJNI.SequenceVarLocalSearchOperatorTemplate_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SequenceVarLocalSearchOperatorTemplate var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SequenceVarLocalSearchOperatorTemplate(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public boolean HoldsDelta() {
      return mainJNI.SequenceVarLocalSearchOperatorTemplate_HoldsDelta(this.swigCPtr, this);
   }

   public boolean isIncremental() {
      return mainJNI.SequenceVarLocalSearchOperatorTemplate_isIncremental(this.swigCPtr, this);
   }

   public int size() {
      return mainJNI.SequenceVarLocalSearchOperatorTemplate_size(this.swigCPtr, this);
   }

   public int[] value(long var1) {
      return mainJNI.SequenceVarLocalSearchOperatorTemplate_value(this.swigCPtr, this, var1);
   }

   public SequenceVar var(long var1) {
      long var3 = mainJNI.SequenceVarLocalSearchOperatorTemplate_var(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new SequenceVar(var3, false);
   }

   public int[] oldValue(long var1) {
      return mainJNI.SequenceVarLocalSearchOperatorTemplate_oldValue(this.swigCPtr, this, var1);
   }

   public void setValue(long var1, int[] var3) {
      mainJNI.SequenceVarLocalSearchOperatorTemplate_setValue(this.swigCPtr, this, var1, var3);
   }

   public boolean activated(long var1) {
      return mainJNI.SequenceVarLocalSearchOperatorTemplate_activated(this.swigCPtr, this, var1);
   }

   public void activate(long var1) {
      mainJNI.SequenceVarLocalSearchOperatorTemplate_activate(this.swigCPtr, this, var1);
   }

   public void deactivate(long var1) {
      mainJNI.SequenceVarLocalSearchOperatorTemplate_deactivate(this.swigCPtr, this, var1);
   }

   public void addVars(SequenceVar[] var1) {
      mainJNI.SequenceVarLocalSearchOperatorTemplate_addVars(this.swigCPtr, this, var1);
   }

   public void onStart() {
      mainJNI.SequenceVarLocalSearchOperatorTemplate_onStart(this.swigCPtr, this);
   }
}
