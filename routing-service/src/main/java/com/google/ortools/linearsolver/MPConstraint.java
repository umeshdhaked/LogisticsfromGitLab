package com.google.ortools.linearsolver;

public class MPConstraint {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected MPConstraint(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(MPConstraint var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            main_research_linear_solverJNI.delete_MPConstraint(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public String name() {
      return main_research_linear_solverJNI.MPConstraint_name(this.swigCPtr, this);
   }

   public void setCoefficient(MPVariable var1, double var2) {
      main_research_linear_solverJNI.MPConstraint_setCoefficient(this.swigCPtr, this, MPVariable.getCPtr(var1), var1, var2);
   }

   public double getCoefficient(MPVariable var1) {
      return main_research_linear_solverJNI.MPConstraint_getCoefficient(this.swigCPtr, this, MPVariable.getCPtr(var1), var1);
   }

   public double lb() {
      return main_research_linear_solverJNI.MPConstraint_lb(this.swigCPtr, this);
   }

   public double ub() {
      return main_research_linear_solverJNI.MPConstraint_ub(this.swigCPtr, this);
   }

   public void setLb(double var1) {
      main_research_linear_solverJNI.MPConstraint_setLb(this.swigCPtr, this, var1);
   }

   public void setUb(double var1) {
      main_research_linear_solverJNI.MPConstraint_setUb(this.swigCPtr, this, var1);
   }

   public void setBounds(double var1, double var3) {
      main_research_linear_solverJNI.MPConstraint_setBounds(this.swigCPtr, this, var1, var3);
   }

   public boolean isLazy() {
      return main_research_linear_solverJNI.MPConstraint_isLazy(this.swigCPtr, this);
   }

   public void setIsLazy(boolean var1) {
      main_research_linear_solverJNI.MPConstraint_setIsLazy(this.swigCPtr, this, var1);
   }

   public int index() {
      return main_research_linear_solverJNI.MPConstraint_index(this.swigCPtr, this);
   }

   public double dualValue() {
      return main_research_linear_solverJNI.MPConstraint_dualValue(this.swigCPtr, this);
   }

   public MPSolver.BasisStatus basisStatus() {
      return MPSolver.BasisStatus.swigToEnum(main_research_linear_solverJNI.MPConstraint_basisStatus(this.swigCPtr, this));
   }
}
