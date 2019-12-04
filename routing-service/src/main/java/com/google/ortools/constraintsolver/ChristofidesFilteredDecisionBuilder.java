package com.google.ortools.constraintsolver;

public class ChristofidesFilteredDecisionBuilder extends RoutingFilteredDecisionBuilder {
   private transient long swigCPtr;

   protected ChristofidesFilteredDecisionBuilder(long var1, boolean var3) {
      super(mainJNI.ChristofidesFilteredDecisionBuilder_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(ChristofidesFilteredDecisionBuilder var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_ChristofidesFilteredDecisionBuilder(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public boolean buildSolution() {
      return mainJNI.ChristofidesFilteredDecisionBuilder_buildSolution(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.ChristofidesFilteredDecisionBuilder_toString(this.swigCPtr, this);
   }
}
