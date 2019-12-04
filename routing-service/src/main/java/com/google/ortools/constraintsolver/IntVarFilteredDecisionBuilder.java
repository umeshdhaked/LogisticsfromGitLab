package com.google.ortools.constraintsolver;

public class IntVarFilteredDecisionBuilder extends DecisionBuilder {
   private transient long swigCPtr;

   protected IntVarFilteredDecisionBuilder(long var1, boolean var3) {
      super(mainJNI.IntVarFilteredDecisionBuilder_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntVarFilteredDecisionBuilder var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntVarFilteredDecisionBuilder(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public Decision nextWrap(Solver var1) {
      long var2 = mainJNI.IntVarFilteredDecisionBuilder_nextWrap(this.swigCPtr, this, Solver.getCPtr(var1), var1);
      return var2 == 0L ? null : new Decision(var2, false);
   }

   public boolean buildSolution() {
      return mainJNI.IntVarFilteredDecisionBuilder_buildSolution(this.swigCPtr, this);
   }

   public long number_of_decisions() {
      return mainJNI.IntVarFilteredDecisionBuilder_number_of_decisions(this.swigCPtr, this);
   }

   public long number_of_rejects() {
      return mainJNI.IntVarFilteredDecisionBuilder_number_of_rejects(this.swigCPtr, this);
   }
}
