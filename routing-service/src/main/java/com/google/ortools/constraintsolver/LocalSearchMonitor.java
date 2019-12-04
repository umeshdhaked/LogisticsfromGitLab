package com.google.ortools.constraintsolver;

public class LocalSearchMonitor extends SearchMonitor {
   private transient long swigCPtr;

   protected LocalSearchMonitor(long var1, boolean var3) {
      super(mainJNI.LocalSearchMonitor_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(LocalSearchMonitor var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_LocalSearchMonitor(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public String toString() {
      return mainJNI.LocalSearchMonitor_toString(this.swigCPtr, this);
   }

   public void beginOperatorStart() {
      mainJNI.LocalSearchMonitor_beginOperatorStart(this.swigCPtr, this);
   }

   public void endOperatorStart() {
      mainJNI.LocalSearchMonitor_endOperatorStart(this.swigCPtr, this);
   }

   public void beginMakeNextNeighbor(LocalSearchOperator var1) {
      mainJNI.LocalSearchMonitor_beginMakeNextNeighbor(this.swigCPtr, this, LocalSearchOperator.getCPtr(var1), var1);
   }

   public void endMakeNextNeighbor(LocalSearchOperator var1, boolean var2, Assignment var3, Assignment var4) {
      mainJNI.LocalSearchMonitor_endMakeNextNeighbor(this.swigCPtr, this, LocalSearchOperator.getCPtr(var1), var1, var2, Assignment.getCPtr(var3), var3, Assignment.getCPtr(var4), var4);
   }

   public void beginFilterNeighbor(LocalSearchOperator var1) {
      mainJNI.LocalSearchMonitor_beginFilterNeighbor(this.swigCPtr, this, LocalSearchOperator.getCPtr(var1), var1);
   }

   public void endFilterNeighbor(LocalSearchOperator var1, boolean var2) {
      mainJNI.LocalSearchMonitor_endFilterNeighbor(this.swigCPtr, this, LocalSearchOperator.getCPtr(var1), var1, var2);
   }

   public void beginAcceptNeighbor(LocalSearchOperator var1) {
      mainJNI.LocalSearchMonitor_beginAcceptNeighbor(this.swigCPtr, this, LocalSearchOperator.getCPtr(var1), var1);
   }

   public void endAcceptNeighbor(LocalSearchOperator var1, boolean var2) {
      mainJNI.LocalSearchMonitor_endAcceptNeighbor(this.swigCPtr, this, LocalSearchOperator.getCPtr(var1), var1, var2);
   }

   public void beginFiltering(LocalSearchFilter var1) {
      mainJNI.LocalSearchMonitor_beginFiltering(this.swigCPtr, this, LocalSearchFilter.getCPtr(var1), var1);
   }

   public void endFiltering(LocalSearchFilter var1, boolean var2) {
      mainJNI.LocalSearchMonitor_endFiltering(this.swigCPtr, this, LocalSearchFilter.getCPtr(var1), var1, var2);
   }

   public void install() {
      mainJNI.LocalSearchMonitor_install(this.swigCPtr, this);
   }
}
