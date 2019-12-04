package com.google.ortools.constraintsolver;

public class TypeIncompatibilityChecker extends TypeRegulationsChecker {
   private transient long swigCPtr;

   protected TypeIncompatibilityChecker(long var1, boolean var3) {
      super(mainJNI.TypeIncompatibilityChecker_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(TypeIncompatibilityChecker var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_TypeIncompatibilityChecker(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public TypeIncompatibilityChecker(RoutingModel var1, boolean var2) {
      this(mainJNI.new_TypeIncompatibilityChecker(RoutingModel.getCPtr(var1), var1, var2), true);
   }
}
