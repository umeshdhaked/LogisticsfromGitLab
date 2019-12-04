package com.google.ortools.constraintsolver;

public class SolutionCollector extends SearchMonitor {
   private transient long swigCPtr;

   protected SolutionCollector(long var1, boolean var3) {
      super(mainJNI.SolutionCollector_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SolutionCollector var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SolutionCollector(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public SolutionCollector(Solver var1, Assignment var2) {
      this(mainJNI.new_SolutionCollector__SWIG_0(Solver.getCPtr(var1), var1, Assignment.getCPtr(var2), var2), true);
   }

   public SolutionCollector(Solver var1) {
      this(mainJNI.new_SolutionCollector__SWIG_1(Solver.getCPtr(var1), var1), true);
   }

   public String toString() {
      return mainJNI.SolutionCollector_toString(this.swigCPtr, this);
   }

   public void add(IntVar var1) {
      mainJNI.SolutionCollector_add__SWIG_0(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void add(IntVar[] var1) {
      mainJNI.SolutionCollector_add__SWIG_1(this.swigCPtr, this, var1);
   }

   public void add(IntervalVar var1) {
      mainJNI.SolutionCollector_add__SWIG_2(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public void add(IntervalVar[] var1) {
      mainJNI.SolutionCollector_add__SWIG_3(this.swigCPtr, this, var1);
   }

   public void add(SequenceVar var1) {
      mainJNI.SolutionCollector_add__SWIG_4(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
   }

   public void add(SequenceVar[] var1) {
      mainJNI.SolutionCollector_add__SWIG_5(this.swigCPtr, this, var1);
   }

   public void addObjective(IntVar var1) {
      mainJNI.SolutionCollector_addObjective(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void enterSearch() {
      mainJNI.SolutionCollector_enterSearch(this.swigCPtr, this);
   }

   public int solutionCount() {
      return mainJNI.SolutionCollector_solutionCount(this.swigCPtr, this);
   }

   public Assignment solution(int var1) {
      long var2 = mainJNI.SolutionCollector_solution(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new Assignment(var2, false);
   }

   public long wallTime(int var1) {
      return mainJNI.SolutionCollector_wallTime(this.swigCPtr, this, var1);
   }

   public long branches(int var1) {
      return mainJNI.SolutionCollector_branches(this.swigCPtr, this, var1);
   }

   public long failures(int var1) {
      return mainJNI.SolutionCollector_failures(this.swigCPtr, this, var1);
   }

   public long objectiveValue(int var1) {
      return mainJNI.SolutionCollector_objectiveValue(this.swigCPtr, this, var1);
   }

   public long value(int var1, IntVar var2) {
      return mainJNI.SolutionCollector_value(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2);
   }

   public long startValue(int var1, IntervalVar var2) {
      return mainJNI.SolutionCollector_startValue(this.swigCPtr, this, var1, IntervalVar.getCPtr(var2), var2);
   }

   public long endValue(int var1, IntervalVar var2) {
      return mainJNI.SolutionCollector_endValue(this.swigCPtr, this, var1, IntervalVar.getCPtr(var2), var2);
   }

   public long durationValue(int var1, IntervalVar var2) {
      return mainJNI.SolutionCollector_durationValue(this.swigCPtr, this, var1, IntervalVar.getCPtr(var2), var2);
   }

   public long performedValue(int var1, IntervalVar var2) {
      return mainJNI.SolutionCollector_performedValue(this.swigCPtr, this, var1, IntervalVar.getCPtr(var2), var2);
   }

   public int[] forwardSequence(int var1, SequenceVar var2) {
      return mainJNI.SolutionCollector_forwardSequence(this.swigCPtr, this, var1, SequenceVar.getCPtr(var2), var2);
   }

   public int[] backwardSequence(int var1, SequenceVar var2) {
      return mainJNI.SolutionCollector_backwardSequence(this.swigCPtr, this, var1, SequenceVar.getCPtr(var2), var2);
   }

   public int[] unperformed(int var1, SequenceVar var2) {
      return mainJNI.SolutionCollector_unperformed(this.swigCPtr, this, var1, SequenceVar.getCPtr(var2), var2);
   }
}
