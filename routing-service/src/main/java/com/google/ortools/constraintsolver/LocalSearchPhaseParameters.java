package com.google.ortools.constraintsolver;

public class LocalSearchPhaseParameters {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected LocalSearchPhaseParameters(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(LocalSearchPhaseParameters var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_LocalSearchPhaseParameters(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public LocalSearchPhaseParameters() {
      this(mainJNI.new_LocalSearchPhaseParameters(), true);
   }
}
