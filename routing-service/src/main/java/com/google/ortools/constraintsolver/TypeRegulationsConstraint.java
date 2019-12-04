package com.google.ortools.constraintsolver;

public class TypeRegulationsConstraint extends Constraint {
   private transient long swigCPtr;

   protected TypeRegulationsConstraint(long var1, boolean var3) {
      super(mainJNI.TypeRegulationsConstraint_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(TypeRegulationsConstraint var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_TypeRegulationsConstraint(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public TypeRegulationsConstraint(RoutingModel var1) {
      this(mainJNI.new_TypeRegulationsConstraint(RoutingModel.getCPtr(var1), var1), true);
   }

   public void post() {
      mainJNI.TypeRegulationsConstraint_post(this.swigCPtr, this);
   }

   public void initialPropagate() {
      mainJNI.TypeRegulationsConstraint_initialPropagate(this.swigCPtr, this);
   }
}
