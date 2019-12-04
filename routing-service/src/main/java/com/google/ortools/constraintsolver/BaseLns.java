package com.google.ortools.constraintsolver;

public class BaseLns extends IntVarLocalSearchOperator {
   private transient long swigCPtr;

   protected BaseLns(long var1, boolean var3) {
      super(mainJNI.BaseLns_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(BaseLns var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_BaseLns(this.swigCPtr);
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
      mainJNI.BaseLns_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.BaseLns_change_ownership(this, this.swigCPtr, true);
   }

   public BaseLns(IntVar[] var1) {
      this(mainJNI.new_BaseLns(var1), true);
      mainJNI.BaseLns_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public void initFragments() {
      if (this.getClass() == BaseLns.class) {
         mainJNI.BaseLns_initFragments(this.swigCPtr, this);
      } else {
         mainJNI.BaseLns_initFragmentsSwigExplicitBaseLns(this.swigCPtr, this);
      }

   }

   public boolean nextFragment() {
      return mainJNI.BaseLns_nextFragment(this.swigCPtr, this);
   }

   public void appendToFragment(int var1) {
      mainJNI.BaseLns_appendToFragment(this.swigCPtr, this, var1);
   }

   public int fragmentSize() {
      return mainJNI.BaseLns_fragmentSize(this.swigCPtr, this);
   }

   public boolean HasFragments() {
      return this.getClass() == BaseLns.class ? mainJNI.BaseLns_HasFragments(this.swigCPtr, this) : mainJNI.BaseLns_HasFragmentsSwigExplicitBaseLns(this.swigCPtr, this);
   }
}
