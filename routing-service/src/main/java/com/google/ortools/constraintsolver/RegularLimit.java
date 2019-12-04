package com.google.ortools.constraintsolver;

public class RegularLimit extends SearchLimit {
   private transient long swigCPtr;

   protected RegularLimit(long var1, boolean var3) {
      super(mainJNI.RegularLimit_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(RegularLimit var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_RegularLimit(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public RegularLimit(Solver var1, long var2, long var4, long var6, long var8, boolean var10, boolean var11) {
      this(mainJNI.new_RegularLimit(Solver.getCPtr(var1), var1, var2, var4, var6, var8, var10, var11), true);
   }

   public void copy(SearchLimit var1) {
      mainJNI.RegularLimit_copy(this.swigCPtr, this, SearchLimit.getCPtr(var1), var1);
   }

   public SearchLimit makeClone() {
      long var1 = mainJNI.RegularLimit_makeClone(this.swigCPtr, this);
      return var1 == 0L ? null : new SearchLimit(var1, false);
   }

   public RegularLimit MakeIdenticalClone() {
      long var1 = mainJNI.RegularLimit_MakeIdenticalClone(this.swigCPtr, this);
      return var1 == 0L ? null : new RegularLimit(var1, false);
   }

   public boolean check() {
      return mainJNI.RegularLimit_check(this.swigCPtr, this);
   }

   public void init() {
      mainJNI.RegularLimit_init(this.swigCPtr, this);
   }

   public void exitSearch() {
      mainJNI.RegularLimit_exitSearch(this.swigCPtr, this);
   }

   public void UpdateLimits(long var1, long var3, long var5, long var7) {
      mainJNI.RegularLimit_UpdateLimits(this.swigCPtr, this, var1, var3, var5, var7);
   }

   public SWIGTYPE_p_absl__Duration duration_limit() {
      return new SWIGTYPE_p_absl__Duration(mainJNI.RegularLimit_duration_limit(this.swigCPtr, this), true);
   }

   public long wall_time() {
      return mainJNI.RegularLimit_wall_time(this.swigCPtr, this);
   }

   public long branches() {
      return mainJNI.RegularLimit_branches(this.swigCPtr, this);
   }

   public long failures() {
      return mainJNI.RegularLimit_failures(this.swigCPtr, this);
   }

   public long solutions() {
      return mainJNI.RegularLimit_solutions(this.swigCPtr, this);
   }

   public boolean IsUncheckedSolutionLimitReached() {
      return mainJNI.RegularLimit_IsUncheckedSolutionLimitReached(this.swigCPtr, this);
   }

   public int progressPercent() {
      return mainJNI.RegularLimit_progressPercent(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.RegularLimit_toString(this.swigCPtr, this);
   }

   public SWIGTYPE_p_absl__Time AbsoluteSolverDeadline() {
      return new SWIGTYPE_p_absl__Time(mainJNI.RegularLimit_AbsoluteSolverDeadline(this.swigCPtr, this), true);
   }

   public void accept(ModelVisitor var1) {
      mainJNI.RegularLimit_accept(this.swigCPtr, this, ModelVisitor.getCPtr(var1), var1);
   }
}
