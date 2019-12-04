package com.google.ortools.constraintsolver;

public class SequenceVarLocalSearchOperator extends SequenceVarLocalSearchOperatorTemplate {
   private transient long swigCPtr;

   protected SequenceVarLocalSearchOperator(long var1, boolean var3) {
      super(mainJNI.SequenceVarLocalSearchOperator_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SequenceVarLocalSearchOperator var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SequenceVarLocalSearchOperator(this.swigCPtr);
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
      mainJNI.SequenceVarLocalSearchOperator_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.SequenceVarLocalSearchOperator_change_ownership(this, this.swigCPtr, true);
   }

   public SequenceVarLocalSearchOperator() {
      this(mainJNI.new_SequenceVarLocalSearchOperator__SWIG_0(), true);
      mainJNI.SequenceVarLocalSearchOperator_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public SequenceVarLocalSearchOperator(SequenceVar[] var1) {
      this(mainJNI.new_SequenceVarLocalSearchOperator__SWIG_1(var1), true);
      mainJNI.SequenceVarLocalSearchOperator_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }
}
