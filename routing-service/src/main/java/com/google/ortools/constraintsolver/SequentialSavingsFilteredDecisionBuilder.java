package com.google.ortools.constraintsolver;

public class SequentialSavingsFilteredDecisionBuilder extends SavingsFilteredDecisionBuilder {
   private transient long swigCPtr;

   protected SequentialSavingsFilteredDecisionBuilder(long var1, boolean var3) {
      super(mainJNI.SequentialSavingsFilteredDecisionBuilder_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SequentialSavingsFilteredDecisionBuilder var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SequentialSavingsFilteredDecisionBuilder(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public String toString() {
      return mainJNI.SequentialSavingsFilteredDecisionBuilder_toString(this.swigCPtr, this);
   }
}
