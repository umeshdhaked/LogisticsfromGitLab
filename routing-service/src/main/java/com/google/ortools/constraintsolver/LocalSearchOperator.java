package com.google.ortools.constraintsolver;

public class LocalSearchOperator extends BaseObject {
   private transient long swigCPtr;

   protected LocalSearchOperator(long var1, boolean var3) {
      super(mainJNI.LocalSearchOperator_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(LocalSearchOperator var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_LocalSearchOperator(this.swigCPtr);
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
      mainJNI.LocalSearchOperator_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.LocalSearchOperator_change_ownership(this, this.swigCPtr, true);
   }

   public LocalSearchOperator() {
      this(mainJNI.new_LocalSearchOperator(), true);
      mainJNI.LocalSearchOperator_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public boolean nextNeighbor(Assignment var1, Assignment var2) {
      return mainJNI.LocalSearchOperator_nextNeighbor(this.swigCPtr, this, Assignment.getCPtr(var1), var1, Assignment.getCPtr(var2), var2);
   }

   public void start(Assignment var1) {
      mainJNI.LocalSearchOperator_start(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
   }

   public void reset() {
      if (this.getClass() == LocalSearchOperator.class) {
         mainJNI.LocalSearchOperator_reset(this.swigCPtr, this);
      } else {
         mainJNI.LocalSearchOperator_resetSwigExplicitLocalSearchOperator(this.swigCPtr, this);
      }

   }

   public boolean HasFragments() {
      return this.getClass() == LocalSearchOperator.class ? mainJNI.LocalSearchOperator_HasFragments(this.swigCPtr, this) : mainJNI.LocalSearchOperator_HasFragmentsSwigExplicitLocalSearchOperator(this.swigCPtr, this);
   }

   public boolean HoldsDelta() {
      return this.getClass() == LocalSearchOperator.class ? mainJNI.LocalSearchOperator_HoldsDelta(this.swigCPtr, this) : mainJNI.LocalSearchOperator_HoldsDeltaSwigExplicitLocalSearchOperator(this.swigCPtr, this);
   }
}
