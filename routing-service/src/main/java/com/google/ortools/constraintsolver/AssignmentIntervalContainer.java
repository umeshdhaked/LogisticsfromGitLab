package com.google.ortools.constraintsolver;

public class AssignmentIntervalContainer {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected AssignmentIntervalContainer(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(AssignmentIntervalContainer var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_AssignmentIntervalContainer(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public AssignmentIntervalContainer() {
      this(mainJNI.new_AssignmentIntervalContainer(), true);
   }

   public IntervalVarElement add(IntervalVar var1) {
      long var2 = mainJNI.AssignmentIntervalContainer_add(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntervalVarElement(var2, false);
   }

   public IntervalVarElement fastAdd(IntervalVar var1) {
      long var2 = mainJNI.AssignmentIntervalContainer_fastAdd(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntervalVarElement(var2, false);
   }

   public IntervalVarElement addAtPosition(IntervalVar var1, int var2) {
      long var3 = mainJNI.AssignmentIntervalContainer_addAtPosition(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new IntervalVarElement(var3, false);
   }

   public void clear() {
      mainJNI.AssignmentIntervalContainer_clear(this.swigCPtr, this);
   }

   public void resize(long var1) {
      mainJNI.AssignmentIntervalContainer_resize(this.swigCPtr, this, var1);
   }

   public boolean empty() {
      return mainJNI.AssignmentIntervalContainer_empty(this.swigCPtr, this);
   }

   public void copyIntersection(AssignmentIntervalContainer var1) {
      mainJNI.AssignmentIntervalContainer_copyIntersection(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public void copy(AssignmentIntervalContainer var1) {
      mainJNI.AssignmentIntervalContainer_copy(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public boolean contains(IntervalVar var1) {
      return mainJNI.AssignmentIntervalContainer_contains(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public IntervalVarElement mutableElement(IntervalVar var1) {
      long var2 = mainJNI.AssignmentIntervalContainer_mutableElement__SWIG_0(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntervalVarElement(var2, false);
   }

   public IntervalVarElement element(IntervalVar var1) {
      return new IntervalVarElement(mainJNI.AssignmentIntervalContainer_element__SWIG_0(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1), false);
   }

   public IntervalVarElement mutableElement(int var1) {
      long var2 = mainJNI.AssignmentIntervalContainer_mutableElement__SWIG_1(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntervalVarElement(var2, false);
   }

   public IntervalVarElement element(int var1) {
      return new IntervalVarElement(mainJNI.AssignmentIntervalContainer_element__SWIG_1(this.swigCPtr, this, var1), false);
   }

   public int size() {
      return mainJNI.AssignmentIntervalContainer_size(this.swigCPtr, this);
   }

   public void store() {
      mainJNI.AssignmentIntervalContainer_store(this.swigCPtr, this);
   }

   public void restore() {
      mainJNI.AssignmentIntervalContainer_restore(this.swigCPtr, this);
   }

   public boolean AreAllElementsBound() {
      return mainJNI.AssignmentIntervalContainer_AreAllElementsBound(this.swigCPtr, this);
   }
}
