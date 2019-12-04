package com.google.ortools.constraintsolver;

public class RevLong {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected RevLong(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(RevLong var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_RevLong(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public RevLong(long var1) {
      this(mainJNI.new_RevLong(var1), true);
   }

   public long value() {
      return mainJNI.RevLong_value(this.swigCPtr, this);
   }

   public void setValue(Solver var1, long var2) {
      mainJNI.RevLong_setValue(this.swigCPtr, this, Solver.getCPtr(var1), var1, var2);
   }
}
