package com.google.ortools.constraintsolver;

public class GlobalVehicleBreaksConstraint extends Constraint {
   private transient long swigCPtr;

   protected GlobalVehicleBreaksConstraint(long var1, boolean var3) {
      super(mainJNI.GlobalVehicleBreaksConstraint_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(GlobalVehicleBreaksConstraint var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_GlobalVehicleBreaksConstraint(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public GlobalVehicleBreaksConstraint(RoutingDimension var1) {
      this(mainJNI.new_GlobalVehicleBreaksConstraint(RoutingDimension.getCPtr(var1), var1), true);
   }

   public String toString() {
      return mainJNI.GlobalVehicleBreaksConstraint_toString(this.swigCPtr, this);
   }

   public void post() {
      mainJNI.GlobalVehicleBreaksConstraint_post(this.swigCPtr, this);
   }

   public void initialPropagate() {
      mainJNI.GlobalVehicleBreaksConstraint_initialPropagate(this.swigCPtr, this);
   }
}
