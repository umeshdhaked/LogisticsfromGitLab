package com.google.ortools.constraintsolver;

public class BasePathFilter extends IntVarLocalSearchFilter {
   private transient long swigCPtr;

   protected BasePathFilter(long var1, boolean var3) {
      super(mainJNI.BasePathFilter_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(BasePathFilter var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_BasePathFilter(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public boolean accept(Assignment var1, Assignment var2, long var3, long var5) {
      return mainJNI.BasePathFilter_accept(this.swigCPtr, this, Assignment.getCPtr(var1), var1, Assignment.getCPtr(var2), var2, var3, var5);
   }

   public void onSynchronize(Assignment var1) {
      mainJNI.BasePathFilter_onSynchronize(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
   }
}
