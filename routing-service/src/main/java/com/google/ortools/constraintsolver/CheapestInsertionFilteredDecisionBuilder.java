package com.google.ortools.constraintsolver;

public class CheapestInsertionFilteredDecisionBuilder extends RoutingFilteredDecisionBuilder {
   private transient long swigCPtr;

   protected CheapestInsertionFilteredDecisionBuilder(long var1, boolean var3) {
      super(mainJNI.CheapestInsertionFilteredDecisionBuilder_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(CheapestInsertionFilteredDecisionBuilder var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_CheapestInsertionFilteredDecisionBuilder(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }
}
