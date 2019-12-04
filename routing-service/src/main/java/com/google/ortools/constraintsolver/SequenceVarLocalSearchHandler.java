package com.google.ortools.constraintsolver;

public class SequenceVarLocalSearchHandler {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected SequenceVarLocalSearchHandler(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SequenceVarLocalSearchHandler var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SequenceVarLocalSearchHandler(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public SequenceVarLocalSearchHandler() {
      this(mainJNI.new_SequenceVarLocalSearchHandler__SWIG_0(), true);
   }

   public SequenceVarLocalSearchHandler(SequenceVarLocalSearchHandler var1) {
      this(mainJNI.new_SequenceVarLocalSearchHandler__SWIG_1(getCPtr(var1), var1), true);
   }

   public SequenceVarLocalSearchHandler(SequenceVarLocalSearchOperator var1) {
      this(mainJNI.new_SequenceVarLocalSearchHandler__SWIG_2(SequenceVarLocalSearchOperator.getCPtr(var1), var1), true);
   }

   public void addToAssignment(SequenceVar var1, int[] var2, boolean var3, SWIGTYPE_p_std__vectorT_int_t var4, long var5, Assignment var7) {
      mainJNI.SequenceVarLocalSearchHandler_addToAssignment(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2, var3, SWIGTYPE_p_std__vectorT_int_t.getCPtr(var4), var5, Assignment.getCPtr(var7), var7);
   }

   public boolean valueFromAssignent(Assignment var1, SequenceVar var2, long var3, SWIGTYPE_p_std__vectorT_int_t var5) {
      return mainJNI.SequenceVarLocalSearchHandler_valueFromAssignent(this.swigCPtr, this, Assignment.getCPtr(var1), var1, SequenceVar.getCPtr(var2), var2, var3, SWIGTYPE_p_std__vectorT_int_t.getCPtr(var5));
   }

   public void onRevertChanges(long var1) {
      mainJNI.SequenceVarLocalSearchHandler_onRevertChanges(this.swigCPtr, this, var1);
   }

   public void onAddVars() {
      mainJNI.SequenceVarLocalSearchHandler_onAddVars(this.swigCPtr, this);
   }
}
