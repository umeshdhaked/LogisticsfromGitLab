package com.google.ortools.constraintsolver;

public class IntVarLocalSearchOperator extends IntVarLocalSearchOperatorTemplate {
   private transient long swigCPtr;

   protected IntVarLocalSearchOperator(long var1, boolean var3) {
      super(mainJNI.IntVarLocalSearchOperator_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntVarLocalSearchOperator var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntVarLocalSearchOperator(this.swigCPtr);
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
      mainJNI.IntVarLocalSearchOperator_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.IntVarLocalSearchOperator_change_ownership(this, this.swigCPtr, true);
   }

   public IntVarLocalSearchOperator() {
      this(mainJNI.new_IntVarLocalSearchOperator__SWIG_0(), true);
      mainJNI.IntVarLocalSearchOperator_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public IntVarLocalSearchOperator(IntVar[] var1) {
      this(mainJNI.new_IntVarLocalSearchOperator__SWIG_1(var1), true);
      mainJNI.IntVarLocalSearchOperator_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   protected boolean oneNeighbor() {
      return this.getClass() == IntVarLocalSearchOperator.class ? mainJNI.IntVarLocalSearchOperator_oneNeighbor(this.swigCPtr, this) : mainJNI.IntVarLocalSearchOperator_oneNeighborSwigExplicitIntVarLocalSearchOperator(this.swigCPtr, this);
   }
}
