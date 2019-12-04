package com.google.ortools.constraintsolver;

public class AssignmentSequenceContainer {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected AssignmentSequenceContainer(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(AssignmentSequenceContainer var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_AssignmentSequenceContainer(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public AssignmentSequenceContainer() {
      this(mainJNI.new_AssignmentSequenceContainer(), true);
   }

   public SequenceVarElement add(SequenceVar var1) {
      long var2 = mainJNI.AssignmentSequenceContainer_add(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new SequenceVarElement(var2, false);
   }

   public SequenceVarElement fastAdd(SequenceVar var1) {
      long var2 = mainJNI.AssignmentSequenceContainer_fastAdd(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new SequenceVarElement(var2, false);
   }

   public SequenceVarElement addAtPosition(SequenceVar var1, int var2) {
      long var3 = mainJNI.AssignmentSequenceContainer_addAtPosition(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new SequenceVarElement(var3, false);
   }

   public void clear() {
      mainJNI.AssignmentSequenceContainer_clear(this.swigCPtr, this);
   }

   public void resize(long var1) {
      mainJNI.AssignmentSequenceContainer_resize(this.swigCPtr, this, var1);
   }

   public boolean empty() {
      return mainJNI.AssignmentSequenceContainer_empty(this.swigCPtr, this);
   }

   public void copyIntersection(AssignmentSequenceContainer var1) {
      mainJNI.AssignmentSequenceContainer_copyIntersection(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public void copy(AssignmentSequenceContainer var1) {
      mainJNI.AssignmentSequenceContainer_copy(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public boolean contains(SequenceVar var1) {
      return mainJNI.AssignmentSequenceContainer_contains(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
   }

   public SequenceVarElement mutableElement(SequenceVar var1) {
      long var2 = mainJNI.AssignmentSequenceContainer_mutableElement__SWIG_0(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new SequenceVarElement(var2, false);
   }

   public SequenceVarElement element(SequenceVar var1) {
      return new SequenceVarElement(mainJNI.AssignmentSequenceContainer_element__SWIG_0(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1), false);
   }

   public SequenceVarElement mutableElement(int var1) {
      long var2 = mainJNI.AssignmentSequenceContainer_mutableElement__SWIG_1(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new SequenceVarElement(var2, false);
   }

   public SequenceVarElement element(int var1) {
      return new SequenceVarElement(mainJNI.AssignmentSequenceContainer_element__SWIG_1(this.swigCPtr, this, var1), false);
   }

   public int size() {
      return mainJNI.AssignmentSequenceContainer_size(this.swigCPtr, this);
   }

   public void store() {
      mainJNI.AssignmentSequenceContainer_store(this.swigCPtr, this);
   }

   public void restore() {
      mainJNI.AssignmentSequenceContainer_restore(this.swigCPtr, this);
   }

   public boolean AreAllElementsBound() {
      return mainJNI.AssignmentSequenceContainer_AreAllElementsBound(this.swigCPtr, this);
   }
}
