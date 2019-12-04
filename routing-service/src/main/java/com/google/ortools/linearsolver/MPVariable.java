package com.google.ortools.linearsolver;

public class MPVariable {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected MPVariable(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(MPVariable var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            main_research_linear_solverJNI.delete_MPVariable(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public String name() {
      return main_research_linear_solverJNI.MPVariable_name(this.swigCPtr, this);
   }

   public void setInteger(boolean var1) {
      main_research_linear_solverJNI.MPVariable_setInteger(this.swigCPtr, this, var1);
   }

   public double solutionValue() {
      return main_research_linear_solverJNI.MPVariable_solutionValue(this.swigCPtr, this);
   }

   public int index() {
      return main_research_linear_solverJNI.MPVariable_index(this.swigCPtr, this);
   }

   public double lb() {
      return main_research_linear_solverJNI.MPVariable_lb(this.swigCPtr, this);
   }

   public double ub() {
      return main_research_linear_solverJNI.MPVariable_ub(this.swigCPtr, this);
   }

   public void setLb(double var1) {
      main_research_linear_solverJNI.MPVariable_setLb(this.swigCPtr, this, var1);
   }

   public void setUb(double var1) {
      main_research_linear_solverJNI.MPVariable_setUb(this.swigCPtr, this, var1);
   }

   public void setBounds(double var1, double var3) {
      main_research_linear_solverJNI.MPVariable_setBounds(this.swigCPtr, this, var1, var3);
   }

   public double reducedCost() {
      return main_research_linear_solverJNI.MPVariable_reducedCost(this.swigCPtr, this);
   }

   public MPSolver.BasisStatus basisStatus() {
      return MPSolver.BasisStatus.swigToEnum(main_research_linear_solverJNI.MPVariable_basisStatus(this.swigCPtr, this));
   }
}
