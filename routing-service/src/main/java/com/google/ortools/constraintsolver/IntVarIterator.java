package com.google.ortools.constraintsolver;

public class IntVarIterator extends BaseObject {
   private transient long swigCPtr;

   protected IntVarIterator(long var1, boolean var3) {
      super(mainJNI.IntVarIterator_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntVarIterator var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntVarIterator(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public void init() {
      mainJNI.IntVarIterator_init(this.swigCPtr, this);
   }

   public boolean ok() {
      return mainJNI.IntVarIterator_ok(this.swigCPtr, this);
   }

   public long value() {
      return mainJNI.IntVarIterator_value(this.swigCPtr, this);
   }

   public void next() {
      mainJNI.IntVarIterator_next(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.IntVarIterator_toString(this.swigCPtr, this);
   }
}
