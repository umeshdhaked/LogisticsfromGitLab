package com.google.ortools.constraintsolver;

public class BaseObject {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected BaseObject(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(BaseObject var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_BaseObject(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public BaseObject() {
      this(mainJNI.new_BaseObject(), true);
   }

   public String toString() {
      return mainJNI.BaseObject_toString(this.swigCPtr, this);
   }
}
