package com.google.ortools.constraintsolver;

public class PropagationMonitor extends SearchMonitor {
   private transient long swigCPtr;

   protected PropagationMonitor(long var1, boolean var3) {
      super(mainJNI.PropagationMonitor_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(PropagationMonitor var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_PropagationMonitor(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public String toString() {
      return mainJNI.PropagationMonitor_toString(this.swigCPtr, this);
   }

   public void beginConstraintInitialPropagation(Constraint var1) {
      mainJNI.PropagationMonitor_beginConstraintInitialPropagation(this.swigCPtr, this, Constraint.getCPtr(var1), var1);
   }

   public void endConstraintInitialPropagation(Constraint var1) {
      mainJNI.PropagationMonitor_endConstraintInitialPropagation(this.swigCPtr, this, Constraint.getCPtr(var1), var1);
   }

   public void beginNestedConstraintInitialPropagation(Constraint var1, Constraint var2) {
      mainJNI.PropagationMonitor_beginNestedConstraintInitialPropagation(this.swigCPtr, this, Constraint.getCPtr(var1), var1, Constraint.getCPtr(var2), var2);
   }

   public void endNestedConstraintInitialPropagation(Constraint var1, Constraint var2) {
      mainJNI.PropagationMonitor_endNestedConstraintInitialPropagation(this.swigCPtr, this, Constraint.getCPtr(var1), var1, Constraint.getCPtr(var2), var2);
   }

   public void registerDemon(Demon var1) {
      mainJNI.PropagationMonitor_registerDemon(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void beginDemonRun(Demon var1) {
      mainJNI.PropagationMonitor_beginDemonRun(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void endDemonRun(Demon var1) {
      mainJNI.PropagationMonitor_endDemonRun(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void startProcessingIntegerVariable(IntVar var1) {
      mainJNI.PropagationMonitor_startProcessingIntegerVariable(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void endProcessingIntegerVariable(IntVar var1) {
      mainJNI.PropagationMonitor_endProcessingIntegerVariable(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void pushContext(String var1) {
      mainJNI.PropagationMonitor_pushContext(this.swigCPtr, this, var1);
   }

   public void popContext() {
      mainJNI.PropagationMonitor_popContext(this.swigCPtr, this);
   }

   public void setMin(IntExpr var1, long var2) {
      mainJNI.PropagationMonitor_setMin__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
   }

   public void setMax(IntExpr var1, long var2) {
      mainJNI.PropagationMonitor_setMax__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
   }

   public void setRange(IntExpr var1, long var2, long var4) {
      mainJNI.PropagationMonitor_setRange__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var4);
   }

   public void setMin(IntVar var1, long var2) {
      mainJNI.PropagationMonitor_setMin__SWIG_1(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void setMax(IntVar var1, long var2) {
      mainJNI.PropagationMonitor_setMax__SWIG_1(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void setRange(IntVar var1, long var2, long var4) {
      mainJNI.PropagationMonitor_setRange__SWIG_1(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var4);
   }

   public void removeValue(IntVar var1, long var2) {
      mainJNI.PropagationMonitor_removeValue(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void setValue(IntVar var1, long var2) {
      mainJNI.PropagationMonitor_setValue__SWIG_0(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void removeInterval(IntVar var1, long var2, long var4) {
      mainJNI.PropagationMonitor_removeInterval(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var4);
   }

   public void setValue(IntVar var1, long[] var2) {
      mainJNI.PropagationMonitor_setValue__SWIG_1(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void removeValues(IntVar var1, long[] var2) {
      mainJNI.PropagationMonitor_removeValues(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void setStartMin(IntervalVar var1, long var2) {
      mainJNI.PropagationMonitor_setStartMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setStartMax(IntervalVar var1, long var2) {
      mainJNI.PropagationMonitor_setStartMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setStartRange(IntervalVar var1, long var2, long var4) {
      mainJNI.PropagationMonitor_setStartRange(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
   }

   public void setEndMin(IntervalVar var1, long var2) {
      mainJNI.PropagationMonitor_setEndMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setEndMax(IntervalVar var1, long var2) {
      mainJNI.PropagationMonitor_setEndMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setEndRange(IntervalVar var1, long var2, long var4) {
      mainJNI.PropagationMonitor_setEndRange(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
   }

   public void setDurationMin(IntervalVar var1, long var2) {
      mainJNI.PropagationMonitor_setDurationMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setDurationMax(IntervalVar var1, long var2) {
      mainJNI.PropagationMonitor_setDurationMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setDurationRange(IntervalVar var1, long var2, long var4) {
      mainJNI.PropagationMonitor_setDurationRange(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
   }

   public void setPerformed(IntervalVar var1, boolean var2) {
      mainJNI.PropagationMonitor_setPerformed(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void rankFirst(SequenceVar var1, int var2) {
      mainJNI.PropagationMonitor_rankFirst(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
   }

   public void rankNotFirst(SequenceVar var1, int var2) {
      mainJNI.PropagationMonitor_rankNotFirst(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
   }

   public void rankLast(SequenceVar var1, int var2) {
      mainJNI.PropagationMonitor_rankLast(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
   }

   public void rankNotLast(SequenceVar var1, int var2) {
      mainJNI.PropagationMonitor_rankNotLast(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
   }

   public void rankSequence(SequenceVar var1, int[] var2, int[] var3, int[] var4) {
      mainJNI.PropagationMonitor_rankSequence(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2, var3, var4);
   }

   public void install() {
      mainJNI.PropagationMonitor_install(this.swigCPtr, this);
   }
}
