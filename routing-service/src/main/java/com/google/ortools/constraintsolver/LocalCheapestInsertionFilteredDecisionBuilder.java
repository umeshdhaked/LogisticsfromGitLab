package com.google.ortools.constraintsolver;

public class LocalCheapestInsertionFilteredDecisionBuilder extends CheapestInsertionFilteredDecisionBuilder {
   private transient long swigCPtr;

   protected LocalCheapestInsertionFilteredDecisionBuilder(long var1, boolean var3) {
      super(mainJNI.LocalCheapestInsertionFilteredDecisionBuilder_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(LocalCheapestInsertionFilteredDecisionBuilder var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_LocalCheapestInsertionFilteredDecisionBuilder(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public boolean buildSolution() {
      return mainJNI.LocalCheapestInsertionFilteredDecisionBuilder_buildSolution(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.LocalCheapestInsertionFilteredDecisionBuilder_toString(this.swigCPtr, this);
   }
}
