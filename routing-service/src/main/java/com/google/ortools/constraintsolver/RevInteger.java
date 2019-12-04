package com.google.ortools.constraintsolver;

public class RevInteger {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected RevInteger(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(RevInteger var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_RevInteger(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public RevInteger(int var1) {
      this(mainJNI.new_RevInteger(var1), true);
   }

   public int value() {
      return mainJNI.RevInteger_value(this.swigCPtr, this);
   }

   public void setValue(Solver var1, int var2) {
      mainJNI.RevInteger_setValue(this.swigCPtr, this, Solver.getCPtr(var1), var1, var2);
   }
}
