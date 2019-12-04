package com.google.ortools.constraintsolver;

public class DecisionBuilder extends BaseObject {
   private transient long swigCPtr;

   protected DecisionBuilder(long var1, boolean var3) {
      super(mainJNI.DecisionBuilder_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(DecisionBuilder var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_DecisionBuilder(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   protected void swigDirectorDisconnect() {
      this.swigCMemOwn = false;
      this.delete();
   }

   public void swigReleaseOwnership() {
      this.swigCMemOwn = false;
      mainJNI.DecisionBuilder_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.DecisionBuilder_change_ownership(this, this.swigCPtr, true);
   }

   public DecisionBuilder() {
      this(mainJNI.new_DecisionBuilder(), true);
      mainJNI.DecisionBuilder_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public Decision nextWrap(Solver var1) {
      long var2 = mainJNI.DecisionBuilder_nextWrap(this.swigCPtr, this, Solver.getCPtr(var1), var1);
      return var2 == 0L ? null : new Decision(var2, false);
   }

   public String toString() {
      return this.getClass() == DecisionBuilder.class ? mainJNI.DecisionBuilder_toString(this.swigCPtr, this) : mainJNI.DecisionBuilder_toStringSwigExplicitDecisionBuilder(this.swigCPtr, this);
   }
}
