package com.google.ortools.constraintsolver;

import java.util.function.Supplier;

public class SearchLog extends SearchMonitor {
   private transient long swigCPtr;

   protected SearchLog(long var1, boolean var3) {
      super(mainJNI.SearchLog_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SearchLog var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SearchLog(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public SearchLog(Solver var1, OptimizeVar var2, IntVar var3, double var4, double var6, Supplier var8, int var9) {
      this(mainJNI.new_SearchLog(Solver.getCPtr(var1), var1, OptimizeVar.getCPtr(var2), var2, IntVar.getCPtr(var3), var3, var4, var6, var8, var9), true);
   }

   public void enterSearch() {
      mainJNI.SearchLog_enterSearch(this.swigCPtr, this);
   }

   public void exitSearch() {
      mainJNI.SearchLog_exitSearch(this.swigCPtr, this);
   }

   public boolean atSolution() {
      return mainJNI.SearchLog_atSolution(this.swigCPtr, this);
   }

   public void beginFail() {
      mainJNI.SearchLog_beginFail(this.swigCPtr, this);
   }

   public void noMoreSolutions() {
      mainJNI.SearchLog_noMoreSolutions(this.swigCPtr, this);
   }

   public void AcceptUncheckedNeighbor() {
      mainJNI.SearchLog_AcceptUncheckedNeighbor(this.swigCPtr, this);
   }

   public void applyDecision(Decision var1) {
      mainJNI.SearchLog_applyDecision(this.swigCPtr, this, Decision.getCPtr(var1), var1);
   }

   public void refuteDecision(Decision var1) {
      mainJNI.SearchLog_refuteDecision(this.swigCPtr, this, Decision.getCPtr(var1), var1);
   }

   public void outputDecision() {
      mainJNI.SearchLog_outputDecision(this.swigCPtr, this);
   }

   public void maintain() {
      mainJNI.SearchLog_maintain(this.swigCPtr, this);
   }

   public void beginInitialPropagation() {
      mainJNI.SearchLog_beginInitialPropagation(this.swigCPtr, this);
   }

   public void endInitialPropagation() {
      mainJNI.SearchLog_endInitialPropagation(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.SearchLog_toString(this.swigCPtr, this);
   }
}
