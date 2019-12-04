package com.google.ortools.linearsolver;

public class MPObjective {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected MPObjective(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(MPObjective var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            main_research_linear_solverJNI.delete_MPObjective(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public void clear() {
      main_research_linear_solverJNI.MPObjective_clear(this.swigCPtr, this);
   }

   public void setCoefficient(MPVariable var1, double var2) {
      main_research_linear_solverJNI.MPObjective_setCoefficient(this.swigCPtr, this, MPVariable.getCPtr(var1), var1, var2);
   }

   public double getCoefficient(MPVariable var1) {
      return main_research_linear_solverJNI.MPObjective_getCoefficient(this.swigCPtr, this, MPVariable.getCPtr(var1), var1);
   }

   public void setOffset(double var1) {
      main_research_linear_solverJNI.MPObjective_setOffset(this.swigCPtr, this, var1);
   }

   public double offset() {
      return main_research_linear_solverJNI.MPObjective_offset(this.swigCPtr, this);
   }

   public void setOptimizationDirection(boolean var1) {
      main_research_linear_solverJNI.MPObjective_setOptimizationDirection(this.swigCPtr, this, var1);
   }

   public void setMinimization() {
      main_research_linear_solverJNI.MPObjective_setMinimization(this.swigCPtr, this);
   }

   public void setMaximization() {
      main_research_linear_solverJNI.MPObjective_setMaximization(this.swigCPtr, this);
   }

   public boolean maximization() {
      return main_research_linear_solverJNI.MPObjective_maximization(this.swigCPtr, this);
   }

   public boolean minimization() {
      return main_research_linear_solverJNI.MPObjective_minimization(this.swigCPtr, this);
   }

   public double value() {
      return main_research_linear_solverJNI.MPObjective_value(this.swigCPtr, this);
   }

   public double bestBound() {
      return main_research_linear_solverJNI.MPObjective_bestBound(this.swigCPtr, this);
   }
}
