package com.google.ortools.constraintsolver;

public class Demon extends BaseObject {
   private transient long swigCPtr;

   protected Demon(long var1, boolean var3) {
      super(mainJNI.Demon_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(Demon var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_Demon(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public void run(Solver var1) {
      mainJNI.Demon_run(this.swigCPtr, this, Solver.getCPtr(var1), var1);
   }

   public int priority() {
      return mainJNI.Demon_priority(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.Demon_toString(this.swigCPtr, this);
   }

   public void inhibit(Solver var1) {
      mainJNI.Demon_inhibit(this.swigCPtr, this, Solver.getCPtr(var1), var1);
   }

   public void desinhibit(Solver var1) {
      mainJNI.Demon_desinhibit(this.swigCPtr, this, Solver.getCPtr(var1), var1);
   }
}
