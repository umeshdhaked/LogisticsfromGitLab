package com.google.ortools.constraintsolver;

public class PathWithPreviousNodesOperator extends PathOperator {
   private transient long swigCPtr;

   protected PathWithPreviousNodesOperator(long var1, boolean var3) {
      super(mainJNI.PathWithPreviousNodesOperator_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(PathWithPreviousNodesOperator var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_PathWithPreviousNodesOperator(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public boolean isPathStart(long var1) {
      return mainJNI.PathWithPreviousNodesOperator_isPathStart(this.swigCPtr, this, var1);
   }

   public long prev(long var1) {
      return mainJNI.PathWithPreviousNodesOperator_prev(this.swigCPtr, this, var1);
   }

   public String toString() {
      return mainJNI.PathWithPreviousNodesOperator_toString(this.swigCPtr, this);
   }
}
