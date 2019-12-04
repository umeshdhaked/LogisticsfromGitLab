package com.google.ortools.constraintsolver;

public class ChangeValue extends IntVarLocalSearchOperator {
   private transient long swigCPtr;

   protected ChangeValue(long var1, boolean var3) {
      super(mainJNI.ChangeValue_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(ChangeValue var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_ChangeValue(this.swigCPtr);
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
      mainJNI.ChangeValue_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.ChangeValue_change_ownership(this, this.swigCPtr, true);
   }

   public ChangeValue(IntVar[] var1) {
      this(mainJNI.new_ChangeValue(var1), true);
      mainJNI.ChangeValue_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public long modifyValue(long var1, long var3) {
      return mainJNI.ChangeValue_modifyValue(this.swigCPtr, this, var1, var3);
   }

   protected boolean oneNeighbor() {
      return this.getClass() == ChangeValue.class ? mainJNI.ChangeValue_oneNeighbor(this.swigCPtr, this) : mainJNI.ChangeValue_oneNeighborSwigExplicitChangeValue(this.swigCPtr, this);
   }
}
