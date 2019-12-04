package com.google.ortools.constraintsolver;

public class RoutingFilteredDecisionBuilder extends IntVarFilteredDecisionBuilder {
   private transient long swigCPtr;

   protected RoutingFilteredDecisionBuilder(long var1, boolean var3) {
      super(mainJNI.RoutingFilteredDecisionBuilder_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(RoutingFilteredDecisionBuilder var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_RoutingFilteredDecisionBuilder(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public RoutingModel model() {
      long var1 = mainJNI.RoutingFilteredDecisionBuilder_model(this.swigCPtr, this);
      return var1 == 0L ? null : new RoutingModel(var1, false);
   }

   public int getStartChainEnd(int var1) {
      return mainJNI.RoutingFilteredDecisionBuilder_getStartChainEnd(this.swigCPtr, this, var1);
   }

   public int getEndChainStart(int var1) {
      return mainJNI.RoutingFilteredDecisionBuilder_getEndChainStart(this.swigCPtr, this, var1);
   }

   public void makeDisjunctionNodesUnperformed(long var1) {
      mainJNI.RoutingFilteredDecisionBuilder_makeDisjunctionNodesUnperformed(this.swigCPtr, this, var1);
   }

   public void makeUnassignedNodesUnperformed() {
      mainJNI.RoutingFilteredDecisionBuilder_makeUnassignedNodesUnperformed(this.swigCPtr, this);
   }
}
