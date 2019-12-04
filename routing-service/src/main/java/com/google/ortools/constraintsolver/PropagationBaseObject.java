package com.google.ortools.constraintsolver;

public class PropagationBaseObject extends BaseObject {
   private transient long swigCPtr;

   protected PropagationBaseObject(long var1, boolean var3) {
      super(mainJNI.PropagationBaseObject_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(PropagationBaseObject var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_PropagationBaseObject(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public PropagationBaseObject(Solver var1) {
      this(mainJNI.new_PropagationBaseObject(Solver.getCPtr(var1), var1), true);
   }

   public String toString() {
      return mainJNI.PropagationBaseObject_toString(this.swigCPtr, this);
   }

   public Solver solver() {
      long var1 = mainJNI.PropagationBaseObject_solver(this.swigCPtr, this);
      return var1 == 0L ? null : new Solver(var1, false);
   }

   public void freezeQueue() {
      mainJNI.PropagationBaseObject_freezeQueue(this.swigCPtr, this);
   }

   public void unfreezeQueue() {
      mainJNI.PropagationBaseObject_unfreezeQueue(this.swigCPtr, this);
   }

   public void enqueueDelayedDemon(Demon var1) {
      mainJNI.PropagationBaseObject_enqueueDelayedDemon(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void enqueueVar(Demon var1) {
      mainJNI.PropagationBaseObject_enqueueVar(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void reset_action_on_fail() {
      mainJNI.PropagationBaseObject_reset_action_on_fail(this.swigCPtr, this);
   }

   public void set_variable_to_clean_on_fail(IntVar var1) {
      mainJNI.PropagationBaseObject_set_variable_to_clean_on_fail(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public String name() {
      return mainJNI.PropagationBaseObject_name(this.swigCPtr, this);
   }

   public void setName(String var1) {
      mainJNI.PropagationBaseObject_setName(this.swigCPtr, this, var1);
   }

   public boolean hasName() {
      return mainJNI.PropagationBaseObject_hasName(this.swigCPtr, this);
   }

   public String baseName() {
      return mainJNI.PropagationBaseObject_baseName(this.swigCPtr, this);
   }
}
