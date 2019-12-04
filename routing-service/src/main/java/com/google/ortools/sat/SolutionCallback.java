package com.google.ortools.sat;

public class SolutionCallback {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected SolutionCallback(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SolutionCallback var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SolutionCallback(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   protected void swigDirectorDisconnect() {
      this.swigCMemOwn = false;
      this.delete();
   }

   public void swigReleaseOwnership() {
      this.swigCMemOwn = false;
      mainJNI.SolutionCallback_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.SolutionCallback_change_ownership(this, this.swigCPtr, true);
   }

   public void onSolutionCallback() {
      mainJNI.SolutionCallback_onSolutionCallback(this.swigCPtr, this);
   }

   public long numBooleans() {
      return mainJNI.SolutionCallback_numBooleans(this.swigCPtr, this);
   }

   public long numBranches() {
      return mainJNI.SolutionCallback_numBranches(this.swigCPtr, this);
   }

   public long numConflicts() {
      return mainJNI.SolutionCallback_numConflicts(this.swigCPtr, this);
   }

   public long numBinaryPropagations() {
      return mainJNI.SolutionCallback_numBinaryPropagations(this.swigCPtr, this);
   }

   public long numIntegerPropagations() {
      return mainJNI.SolutionCallback_numIntegerPropagations(this.swigCPtr, this);
   }

   public double wallTime() {
      return mainJNI.SolutionCallback_wallTime(this.swigCPtr, this);
   }

   public double userTime() {
      return mainJNI.SolutionCallback_userTime(this.swigCPtr, this);
   }

   public double objectiveValue() {
      return mainJNI.SolutionCallback_objectiveValue(this.swigCPtr, this);
   }

   public double bestObjectiveBound() {
      return mainJNI.SolutionCallback_bestObjectiveBound(this.swigCPtr, this);
   }

   public long solutionIntegerValue(int var1) {
      return mainJNI.SolutionCallback_solutionIntegerValue(this.swigCPtr, this, var1);
   }

   public boolean solutionBooleanValue(int var1) {
      return mainJNI.SolutionCallback_solutionBooleanValue(this.swigCPtr, this, var1);
   }

   public void stopSearch() {
      mainJNI.SolutionCallback_stopSearch(this.swigCPtr, this);
   }

   public SolutionCallback() {
      this(mainJNI.new_SolutionCallback(), true);
      mainJNI.SolutionCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }
}
