package com.google.ortools.constraintsolver;

public class Constraint extends PropagationBaseObject {
   private transient long swigCPtr;

   protected Constraint(long var1, boolean var3) {
      super(mainJNI.Constraint_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(Constraint var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_Constraint(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public void post() {
      mainJNI.Constraint_post(this.swigCPtr, this);
   }

   public void initialPropagate() {
      mainJNI.Constraint_initialPropagate(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.Constraint_toString(this.swigCPtr, this);
   }

   public void postAndPropagate() {
      mainJNI.Constraint_postAndPropagate(this.swigCPtr, this);
   }

   public void accept(ModelVisitor var1) {
      mainJNI.Constraint_accept(this.swigCPtr, this, ModelVisitor.getCPtr(var1), var1);
   }

   public boolean isCastConstraint() {
      return mainJNI.Constraint_isCastConstraint(this.swigCPtr, this);
   }

   public IntVar var() {
      long var1 = mainJNI.Constraint_var(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVar(var1, false);
   }
}
