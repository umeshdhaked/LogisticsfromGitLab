package com.google.ortools.constraintsolver;

public class IntervalVarElement extends AssignmentElement {
   private transient long swigCPtr;

   protected IntervalVarElement(long var1, boolean var3) {
      super(mainJNI.IntervalVarElement_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntervalVarElement var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntervalVarElement(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public IntervalVarElement() {
      this(mainJNI.new_IntervalVarElement__SWIG_0(), true);
   }

   public IntervalVarElement(IntervalVar var1) {
      this(mainJNI.new_IntervalVarElement__SWIG_1(IntervalVar.getCPtr(var1), var1), true);
   }

   public void reset(IntervalVar var1) {
      mainJNI.IntervalVarElement_reset(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public IntervalVarElement clone() {
      long var1 = mainJNI.IntervalVarElement_clone(this.swigCPtr, this);
      return var1 == 0L ? null : new IntervalVarElement(var1, false);
   }

   public void copy(IntervalVarElement var1) {
      mainJNI.IntervalVarElement_copy(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public IntervalVar var() {
      long var1 = mainJNI.IntervalVarElement_var(this.swigCPtr, this);
      return var1 == 0L ? null : new IntervalVar(var1, false);
   }

   public void store() {
      mainJNI.IntervalVarElement_store(this.swigCPtr, this);
   }

   public void restore() {
      mainJNI.IntervalVarElement_restore(this.swigCPtr, this);
   }

   public long startMin() {
      return mainJNI.IntervalVarElement_startMin(this.swigCPtr, this);
   }

   public long startMax() {
      return mainJNI.IntervalVarElement_startMax(this.swigCPtr, this);
   }

   public long startValue() {
      return mainJNI.IntervalVarElement_startValue(this.swigCPtr, this);
   }

   public long durationMin() {
      return mainJNI.IntervalVarElement_durationMin(this.swigCPtr, this);
   }

   public long durationMax() {
      return mainJNI.IntervalVarElement_durationMax(this.swigCPtr, this);
   }

   public long durationValue() {
      return mainJNI.IntervalVarElement_durationValue(this.swigCPtr, this);
   }

   public long endMin() {
      return mainJNI.IntervalVarElement_endMin(this.swigCPtr, this);
   }

   public long endMax() {
      return mainJNI.IntervalVarElement_endMax(this.swigCPtr, this);
   }

   public long endValue() {
      return mainJNI.IntervalVarElement_endValue(this.swigCPtr, this);
   }

   public long performedMin() {
      return mainJNI.IntervalVarElement_performedMin(this.swigCPtr, this);
   }

   public long performedMax() {
      return mainJNI.IntervalVarElement_performedMax(this.swigCPtr, this);
   }

   public long performedValue() {
      return mainJNI.IntervalVarElement_performedValue(this.swigCPtr, this);
   }

   public void setStartMin(long var1) {
      mainJNI.IntervalVarElement_setStartMin(this.swigCPtr, this, var1);
   }

   public void setStartMax(long var1) {
      mainJNI.IntervalVarElement_setStartMax(this.swigCPtr, this, var1);
   }

   public void setStartRange(long var1, long var3) {
      mainJNI.IntervalVarElement_setStartRange(this.swigCPtr, this, var1, var3);
   }

   public void setStartValue(long var1) {
      mainJNI.IntervalVarElement_setStartValue(this.swigCPtr, this, var1);
   }

   public void setDurationMin(long var1) {
      mainJNI.IntervalVarElement_setDurationMin(this.swigCPtr, this, var1);
   }

   public void setDurationMax(long var1) {
      mainJNI.IntervalVarElement_setDurationMax(this.swigCPtr, this, var1);
   }

   public void setDurationRange(long var1, long var3) {
      mainJNI.IntervalVarElement_setDurationRange(this.swigCPtr, this, var1, var3);
   }

   public void setDurationValue(long var1) {
      mainJNI.IntervalVarElement_setDurationValue(this.swigCPtr, this, var1);
   }

   public void setEndMin(long var1) {
      mainJNI.IntervalVarElement_setEndMin(this.swigCPtr, this, var1);
   }

   public void setEndMax(long var1) {
      mainJNI.IntervalVarElement_setEndMax(this.swigCPtr, this, var1);
   }

   public void setEndRange(long var1, long var3) {
      mainJNI.IntervalVarElement_setEndRange(this.swigCPtr, this, var1, var3);
   }

   public void setEndValue(long var1) {
      mainJNI.IntervalVarElement_setEndValue(this.swigCPtr, this, var1);
   }

   public void setPerformedMin(long var1) {
      mainJNI.IntervalVarElement_setPerformedMin(this.swigCPtr, this, var1);
   }

   public void setPerformedMax(long var1) {
      mainJNI.IntervalVarElement_setPerformedMax(this.swigCPtr, this, var1);
   }

   public void setPerformedRange(long var1, long var3) {
      mainJNI.IntervalVarElement_setPerformedRange(this.swigCPtr, this, var1, var3);
   }

   public void setPerformedValue(long var1) {
      mainJNI.IntervalVarElement_setPerformedValue(this.swigCPtr, this, var1);
   }

   public boolean bound() {
      return mainJNI.IntervalVarElement_bound(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.IntervalVarElement_toString(this.swigCPtr, this);
   }
}
