package com.google.ortools.constraintsolver;

public class TypeRegulationsChecker {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected TypeRegulationsChecker(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(TypeRegulationsChecker var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_TypeRegulationsChecker(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public boolean CheckVehicle(int var1, SWIGTYPE_p_std__functionT_long_long_flong_longF_t var2) {
      return mainJNI.TypeRegulationsChecker_CheckVehicle(this.swigCPtr, this, var1, SWIGTYPE_p_std__functionT_long_long_flong_longF_t.getCPtr(var2));
   }
}
