package com.google.ortools.constraintsolver;

public class Decision extends BaseObject {
   private transient long swigCPtr;

   protected Decision(long var1, boolean var3) {
      super(mainJNI.Decision_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(Decision var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_Decision(this.swigCPtr);
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
      mainJNI.Decision_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.Decision_change_ownership(this, this.swigCPtr, true);
   }

   public Decision() {
      this(mainJNI.new_Decision(), true);
      mainJNI.Decision_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public void apply(Solver var1) {
      mainJNI.Decision_apply(this.swigCPtr, this, Solver.getCPtr(var1), var1);
   }

   public void refute(Solver var1) {
      mainJNI.Decision_refute(this.swigCPtr, this, Solver.getCPtr(var1), var1);
   }

   public String toString() {
      return this.getClass() == Decision.class ? mainJNI.Decision_toString(this.swigCPtr, this) : mainJNI.Decision_toStringSwigExplicitDecision(this.swigCPtr, this);
   }

   public void accept(DecisionVisitor var1) {
      if (this.getClass() == Decision.class) {
         mainJNI.Decision_accept(this.swigCPtr, this, DecisionVisitor.getCPtr(var1), var1);
      } else {
         mainJNI.Decision_acceptSwigExplicitDecision(this.swigCPtr, this, DecisionVisitor.getCPtr(var1), var1);
      }

   }
}
