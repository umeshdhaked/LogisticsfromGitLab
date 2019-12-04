package com.google.ortools.constraintsolver;

public class IntervalVar extends PropagationBaseObject {
   private transient long swigCPtr;

   protected IntervalVar(long var1, boolean var3) {
      super(mainJNI.IntervalVar_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntervalVar var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntervalVar(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public static long getKMinValidValue() {
      return mainJNI.IntervalVar_kMinValidValue_get();
   }

   public static long getKMaxValidValue() {
      return mainJNI.IntervalVar_kMaxValidValue_get();
   }

   public long startMin() {
      return mainJNI.IntervalVar_startMin(this.swigCPtr, this);
   }

   public long startMax() {
      return mainJNI.IntervalVar_startMax(this.swigCPtr, this);
   }

   public void setStartMin(long var1) {
      mainJNI.IntervalVar_setStartMin(this.swigCPtr, this, var1);
   }

   public void setStartMax(long var1) {
      mainJNI.IntervalVar_setStartMax(this.swigCPtr, this, var1);
   }

   public void setStartRange(long var1, long var3) {
      mainJNI.IntervalVar_setStartRange(this.swigCPtr, this, var1, var3);
   }

   public long oldStartMin() {
      return mainJNI.IntervalVar_oldStartMin(this.swigCPtr, this);
   }

   public long oldStartMax() {
      return mainJNI.IntervalVar_oldStartMax(this.swigCPtr, this);
   }

   public void whenStartRange(Demon var1) {
      mainJNI.IntervalVar_whenStartRange__SWIG_0(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenStartRange(Runnable var1) {
      mainJNI.IntervalVar_whenStartRange__SWIG_1(this.swigCPtr, this, var1);
   }

   public void whenStartBound(Demon var1) {
      mainJNI.IntervalVar_whenStartBound__SWIG_0(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenStartBound(Runnable var1) {
      mainJNI.IntervalVar_whenStartBound__SWIG_1(this.swigCPtr, this, var1);
   }

   public long durationMin() {
      return mainJNI.IntervalVar_durationMin(this.swigCPtr, this);
   }

   public long durationMax() {
      return mainJNI.IntervalVar_durationMax(this.swigCPtr, this);
   }

   public void setDurationMin(long var1) {
      mainJNI.IntervalVar_setDurationMin(this.swigCPtr, this, var1);
   }

   public void setDurationMax(long var1) {
      mainJNI.IntervalVar_setDurationMax(this.swigCPtr, this, var1);
   }

   public void setDurationRange(long var1, long var3) {
      mainJNI.IntervalVar_setDurationRange(this.swigCPtr, this, var1, var3);
   }

   public long oldDurationMin() {
      return mainJNI.IntervalVar_oldDurationMin(this.swigCPtr, this);
   }

   public long oldDurationMax() {
      return mainJNI.IntervalVar_oldDurationMax(this.swigCPtr, this);
   }

   public void whenDurationRange(Demon var1) {
      mainJNI.IntervalVar_whenDurationRange__SWIG_0(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenDurationRange(Runnable var1) {
      mainJNI.IntervalVar_whenDurationRange__SWIG_1(this.swigCPtr, this, var1);
   }

   public void whenDurationBound(Demon var1) {
      mainJNI.IntervalVar_whenDurationBound__SWIG_0(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenDurationBound(Runnable var1) {
      mainJNI.IntervalVar_whenDurationBound__SWIG_1(this.swigCPtr, this, var1);
   }

   public long endMin() {
      return mainJNI.IntervalVar_endMin(this.swigCPtr, this);
   }

   public long endMax() {
      return mainJNI.IntervalVar_endMax(this.swigCPtr, this);
   }

   public void setEndMin(long var1) {
      mainJNI.IntervalVar_setEndMin(this.swigCPtr, this, var1);
   }

   public void setEndMax(long var1) {
      mainJNI.IntervalVar_setEndMax(this.swigCPtr, this, var1);
   }

   public void setEndRange(long var1, long var3) {
      mainJNI.IntervalVar_setEndRange(this.swigCPtr, this, var1, var3);
   }

   public long oldEndMin() {
      return mainJNI.IntervalVar_oldEndMin(this.swigCPtr, this);
   }

   public long oldEndMax() {
      return mainJNI.IntervalVar_oldEndMax(this.swigCPtr, this);
   }

   public void whenEndRange(Demon var1) {
      mainJNI.IntervalVar_whenEndRange__SWIG_0(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenEndRange(Runnable var1) {
      mainJNI.IntervalVar_whenEndRange__SWIG_1(this.swigCPtr, this, var1);
   }

   public void whenEndBound(Demon var1) {
      mainJNI.IntervalVar_whenEndBound__SWIG_0(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenEndBound(Runnable var1) {
      mainJNI.IntervalVar_whenEndBound__SWIG_1(this.swigCPtr, this, var1);
   }

   public boolean mustBePerformed() {
      return mainJNI.IntervalVar_mustBePerformed(this.swigCPtr, this);
   }

   public boolean mayBePerformed() {
      return mainJNI.IntervalVar_mayBePerformed(this.swigCPtr, this);
   }

   public boolean cannotBePerformed() {
      return mainJNI.IntervalVar_cannotBePerformed(this.swigCPtr, this);
   }

   public boolean isPerformedBound() {
      return mainJNI.IntervalVar_isPerformedBound(this.swigCPtr, this);
   }

   public void setPerformed(boolean var1) {
      mainJNI.IntervalVar_setPerformed(this.swigCPtr, this, var1);
   }

   public boolean wasPerformedBound() {
      return mainJNI.IntervalVar_wasPerformedBound(this.swigCPtr, this);
   }

   public void whenPerformedBound(Demon var1) {
      mainJNI.IntervalVar_whenPerformedBound__SWIG_0(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenPerformedBound(Runnable var1) {
      mainJNI.IntervalVar_whenPerformedBound__SWIG_1(this.swigCPtr, this, var1);
   }

   public void whenAnything(Demon var1) {
      mainJNI.IntervalVar_whenAnything__SWIG_0(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenAnything(Runnable var1) {
      mainJNI.IntervalVar_whenAnything__SWIG_1(this.swigCPtr, this, var1);
   }

   public IntExpr startExpr() {
      long var1 = mainJNI.IntervalVar_startExpr(this.swigCPtr, this);
      return var1 == 0L ? null : new IntExpr(var1, false);
   }

   public IntExpr durationExpr() {
      long var1 = mainJNI.IntervalVar_durationExpr(this.swigCPtr, this);
      return var1 == 0L ? null : new IntExpr(var1, false);
   }

   public IntExpr endExpr() {
      long var1 = mainJNI.IntervalVar_endExpr(this.swigCPtr, this);
      return var1 == 0L ? null : new IntExpr(var1, false);
   }

   public IntExpr performedExpr() {
      long var1 = mainJNI.IntervalVar_performedExpr(this.swigCPtr, this);
      return var1 == 0L ? null : new IntExpr(var1, false);
   }

   public IntExpr safeStartExpr(long var1) {
      long var3 = mainJNI.IntervalVar_safeStartExpr(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr safeDurationExpr(long var1) {
      long var3 = mainJNI.IntervalVar_safeDurationExpr(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr safeEndExpr(long var1) {
      long var3 = mainJNI.IntervalVar_safeEndExpr(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public void accept(ModelVisitor var1) {
      mainJNI.IntervalVar_accept(this.swigCPtr, this, ModelVisitor.getCPtr(var1), var1);
   }
}
