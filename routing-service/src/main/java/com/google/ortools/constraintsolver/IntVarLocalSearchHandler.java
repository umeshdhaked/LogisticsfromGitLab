package com.google.ortools.constraintsolver;

public class IntVarLocalSearchHandler {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected IntVarLocalSearchHandler(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntVarLocalSearchHandler var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntVarLocalSearchHandler(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public void addToAssignment(IntVar var1, long var2, boolean var4, SWIGTYPE_p_std__vectorT_int_t var5, long var6, Assignment var8) {
      mainJNI.IntVarLocalSearchHandler_addToAssignment(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var4, SWIGTYPE_p_std__vectorT_int_t.getCPtr(var5), var6, Assignment.getCPtr(var8), var8);
   }

   public boolean valueFromAssignent(Assignment var1, IntVar var2, long var3, long[] var5) {
      return mainJNI.IntVarLocalSearchHandler_valueFromAssignent(this.swigCPtr, this, Assignment.getCPtr(var1), var1, IntVar.getCPtr(var2), var2, var3, var5);
   }

   public void onRevertChanges(long var1) {
      mainJNI.IntVarLocalSearchHandler_onRevertChanges(this.swigCPtr, this, var1);
   }

   public void onAddVars() {
      mainJNI.IntVarLocalSearchHandler_onAddVars(this.swigCPtr, this);
   }

   public IntVarLocalSearchHandler() {
      this(mainJNI.new_IntVarLocalSearchHandler(), true);
   }
}
