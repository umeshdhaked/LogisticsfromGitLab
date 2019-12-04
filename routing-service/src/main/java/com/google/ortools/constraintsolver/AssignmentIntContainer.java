package com.google.ortools.constraintsolver;

public class AssignmentIntContainer {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected AssignmentIntContainer(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(AssignmentIntContainer var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_AssignmentIntContainer(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public AssignmentIntContainer() {
      this(mainJNI.new_AssignmentIntContainer(), true);
   }

   public IntVarElement add(IntVar var1) {
      long var2 = mainJNI.AssignmentIntContainer_add(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntVarElement(var2, false);
   }

   public IntVarElement fastAdd(IntVar var1) {
      long var2 = mainJNI.AssignmentIntContainer_fastAdd(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntVarElement(var2, false);
   }

   public IntVarElement addAtPosition(IntVar var1, int var2) {
      long var3 = mainJNI.AssignmentIntContainer_addAtPosition(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new IntVarElement(var3, false);
   }

   public void clear() {
      mainJNI.AssignmentIntContainer_clear(this.swigCPtr, this);
   }

   public void resize(long var1) {
      mainJNI.AssignmentIntContainer_resize(this.swigCPtr, this, var1);
   }

   public boolean empty() {
      return mainJNI.AssignmentIntContainer_empty(this.swigCPtr, this);
   }

   public void copyIntersection(AssignmentIntContainer var1) {
      mainJNI.AssignmentIntContainer_copyIntersection(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public void copy(AssignmentIntContainer var1) {
      mainJNI.AssignmentIntContainer_copy(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public boolean contains(IntVar var1) {
      return mainJNI.AssignmentIntContainer_contains(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public IntVarElement mutableElement(IntVar var1) {
      long var2 = mainJNI.AssignmentIntContainer_mutableElement__SWIG_0(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntVarElement(var2, false);
   }

   public IntVarElement element(IntVar var1) {
      return new IntVarElement(mainJNI.AssignmentIntContainer_element__SWIG_0(this.swigCPtr, this, IntVar.getCPtr(var1), var1), false);
   }

   public IntVarElement mutableElement(int var1) {
      long var2 = mainJNI.AssignmentIntContainer_mutableElement__SWIG_1(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVarElement(var2, false);
   }

   public IntVarElement element(int var1) {
      return new IntVarElement(mainJNI.AssignmentIntContainer_element__SWIG_1(this.swigCPtr, this, var1), false);
   }

   public int size() {
      return mainJNI.AssignmentIntContainer_size(this.swigCPtr, this);
   }

   public void store() {
      mainJNI.AssignmentIntContainer_store(this.swigCPtr, this);
   }

   public void restore() {
      mainJNI.AssignmentIntContainer_restore(this.swigCPtr, this);
   }

   public boolean AreAllElementsBound() {
      return mainJNI.AssignmentIntContainer_AreAllElementsBound(this.swigCPtr, this);
   }
}
