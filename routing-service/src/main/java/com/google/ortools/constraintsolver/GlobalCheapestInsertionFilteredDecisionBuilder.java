package com.google.ortools.constraintsolver;

public class GlobalCheapestInsertionFilteredDecisionBuilder extends CheapestInsertionFilteredDecisionBuilder {
   private transient long swigCPtr;

   protected GlobalCheapestInsertionFilteredDecisionBuilder(long var1, boolean var3) {
      super(mainJNI.GlobalCheapestInsertionFilteredDecisionBuilder_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(GlobalCheapestInsertionFilteredDecisionBuilder var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_GlobalCheapestInsertionFilteredDecisionBuilder(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public boolean buildSolution() {
      return mainJNI.GlobalCheapestInsertionFilteredDecisionBuilder_buildSolution(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.GlobalCheapestInsertionFilteredDecisionBuilder_toString(this.swigCPtr, this);
   }
}
