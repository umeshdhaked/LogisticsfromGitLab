package com.google.ortools.constraintsolver;

public class OptimizeVar extends SearchMonitor {
   private transient long swigCPtr;

   protected OptimizeVar(long var1, boolean var3) {
      super(mainJNI.OptimizeVar_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(OptimizeVar var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_OptimizeVar(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public OptimizeVar(Solver var1, boolean var2, IntVar var3, long var4) {
      this(mainJNI.new_OptimizeVar(Solver.getCPtr(var1), var1, var2, IntVar.getCPtr(var3), var3, var4), true);
   }

   public long best() {
      return mainJNI.OptimizeVar_best(this.swigCPtr, this);
   }

   public IntVar var() {
      long var1 = mainJNI.OptimizeVar_var(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVar(var1, false);
   }

   public boolean acceptDelta(Assignment var1, Assignment var2) {
      return mainJNI.OptimizeVar_acceptDelta(this.swigCPtr, this, Assignment.getCPtr(var1), var1, Assignment.getCPtr(var2), var2);
   }

   public void enterSearch() {
      mainJNI.OptimizeVar_enterSearch(this.swigCPtr, this);
   }

   public void beginNextDecision(DecisionBuilder var1) {
      mainJNI.OptimizeVar_beginNextDecision(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1);
   }

   public void refuteDecision(Decision var1) {
      mainJNI.OptimizeVar_refuteDecision(this.swigCPtr, this, Decision.getCPtr(var1), var1);
   }

   public boolean atSolution() {
      return mainJNI.OptimizeVar_atSolution(this.swigCPtr, this);
   }

   public boolean acceptSolution() {
      return mainJNI.OptimizeVar_acceptSolution(this.swigCPtr, this);
   }

   public String print() {
      return mainJNI.OptimizeVar_print(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.OptimizeVar_toString(this.swigCPtr, this);
   }

   public void accept(ModelVisitor var1) {
      mainJNI.OptimizeVar_accept(this.swigCPtr, this, ModelVisitor.getCPtr(var1), var1);
   }

   public void applyBound() {
      mainJNI.OptimizeVar_applyBound(this.swigCPtr, this);
   }
}
