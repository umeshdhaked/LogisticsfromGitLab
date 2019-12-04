package com.google.ortools.constraintsolver;

public class SolutionPool extends BaseObject {
   private transient long swigCPtr;

   protected SolutionPool(long var1, boolean var3) {
      super(mainJNI.SolutionPool_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SolutionPool var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SolutionPool(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public void initialize(Assignment var1) {
      mainJNI.SolutionPool_initialize(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
   }

   public void registerNewSolution(Assignment var1) {
      mainJNI.SolutionPool_registerNewSolution(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
   }

   public void getNextSolution(Assignment var1) {
      mainJNI.SolutionPool_getNextSolution(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
   }

   public boolean syncNeeded(Assignment var1) {
      return mainJNI.SolutionPool_syncNeeded(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
   }
}
