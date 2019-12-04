package com.google.ortools.constraintsolver;

public class IntVarLocalSearchFilter extends LocalSearchFilter {
   private transient long swigCPtr;

   protected IntVarLocalSearchFilter(long var1, boolean var3) {
      super(mainJNI.IntVarLocalSearchFilter_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntVarLocalSearchFilter var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntVarLocalSearchFilter(this.swigCPtr);
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
      mainJNI.IntVarLocalSearchFilter_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.IntVarLocalSearchFilter_change_ownership(this, this.swigCPtr, true);
   }

   public IntVarLocalSearchFilter(IntVar[] var1) {
      this(mainJNI.new_IntVarLocalSearchFilter(var1), true);
      mainJNI.IntVarLocalSearchFilter_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public void synchronize(Assignment var1, Assignment var2) {
      mainJNI.IntVarLocalSearchFilter_synchronize(this.swigCPtr, this, Assignment.getCPtr(var1), var1, Assignment.getCPtr(var2), var2);
   }

   public void addVars(IntVar[] var1) {
      mainJNI.IntVarLocalSearchFilter_addVars(this.swigCPtr, this, var1);
   }

   public int size() {
      return mainJNI.IntVarLocalSearchFilter_size(this.swigCPtr, this);
   }

   public IntVar var(int var1) {
      long var2 = mainJNI.IntVarLocalSearchFilter_var(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVar(var2, false);
   }

   public long value(int var1) {
      return mainJNI.IntVarLocalSearchFilter_value(this.swigCPtr, this, var1);
   }

   protected void onSynchronize(Assignment var1) {
      if (this.getClass() == IntVarLocalSearchFilter.class) {
         mainJNI.IntVarLocalSearchFilter_onSynchronize(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      } else {
         mainJNI.IntVarLocalSearchFilter_onSynchronizeSwigExplicitIntVarLocalSearchFilter(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      }

   }

   public int index(IntVar var1) {
      return mainJNI.IntVarLocalSearchFilter_index(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }
}
