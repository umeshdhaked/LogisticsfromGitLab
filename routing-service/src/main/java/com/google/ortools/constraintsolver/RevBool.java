package com.google.ortools.constraintsolver;

public class RevBool {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected RevBool(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(RevBool var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_RevBool(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public RevBool(boolean var1) {
      this(mainJNI.new_RevBool(var1), true);
   }

   public boolean value() {
      return mainJNI.RevBool_value(this.swigCPtr, this);
   }

   public void setValue(Solver var1, boolean var2) {
      mainJNI.RevBool_setValue(this.swigCPtr, this, Solver.getCPtr(var1), var1, var2);
   }
}
