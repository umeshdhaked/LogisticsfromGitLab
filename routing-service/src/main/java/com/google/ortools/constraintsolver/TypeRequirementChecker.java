package com.google.ortools.constraintsolver;

public class TypeRequirementChecker extends TypeRegulationsChecker {
   private transient long swigCPtr;

   protected TypeRequirementChecker(long var1, boolean var3) {
      super(mainJNI.TypeRequirementChecker_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(TypeRequirementChecker var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_TypeRequirementChecker(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public TypeRequirementChecker(RoutingModel var1) {
      this(mainJNI.new_TypeRequirementChecker(RoutingModel.getCPtr(var1), var1), true);
   }
}
