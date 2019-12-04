package com.google.ortools.constraintsolver;

public class AssignmentElement {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected AssignmentElement(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(AssignmentElement var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_AssignmentElement(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public AssignmentElement() {
      this(mainJNI.new_AssignmentElement(), true);
   }

   public void activate() {
      mainJNI.AssignmentElement_activate(this.swigCPtr, this);
   }

   public void deactivate() {
      mainJNI.AssignmentElement_deactivate(this.swigCPtr, this);
   }

   public boolean activated() {
      return mainJNI.AssignmentElement_activated(this.swigCPtr, this);
   }
}
