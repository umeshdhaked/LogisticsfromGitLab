package com.google.ortools.graph;

public class MinCostFlow extends MinCostFlowBase {
   private transient long swigCPtr;

   protected MinCostFlow(long var1, boolean var3) {
      super(mainJNI.MinCostFlow_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(MinCostFlow var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_MinCostFlow(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public MinCostFlow() {
      this(mainJNI.new_MinCostFlow(), true);
   }

   public int addArcWithCapacityAndUnitCost(int var1, int var2, long var3, long var5) {
      return mainJNI.MinCostFlow_addArcWithCapacityAndUnitCost(this.swigCPtr, this, var1, var2, var3, var5);
   }

   public void setNodeSupply(int var1, long var2) {
      mainJNI.MinCostFlow_setNodeSupply(this.swigCPtr, this, var1, var2);
   }

   public MinCostFlowBase.Status solve() {
      return MinCostFlowBase.Status.swigToEnum(mainJNI.MinCostFlow_solve(this.swigCPtr, this));
   }

   public MinCostFlowBase.Status solveMaxFlowWithMinCost() {
      return MinCostFlowBase.Status.swigToEnum(mainJNI.MinCostFlow_solveMaxFlowWithMinCost(this.swigCPtr, this));
   }

   public long getOptimalCost() {
      return mainJNI.MinCostFlow_getOptimalCost(this.swigCPtr, this);
   }

   public long getMaximumFlow() {
      return mainJNI.MinCostFlow_getMaximumFlow(this.swigCPtr, this);
   }

   public long getFlow(int var1) {
      return mainJNI.MinCostFlow_getFlow(this.swigCPtr, this, var1);
   }

   public int getNumNodes() {
      return mainJNI.MinCostFlow_getNumNodes(this.swigCPtr, this);
   }

   public int getNumArcs() {
      return mainJNI.MinCostFlow_getNumArcs(this.swigCPtr, this);
   }

   public int getTail(int var1) {
      return mainJNI.MinCostFlow_getTail(this.swigCPtr, this, var1);
   }

   public int getHead(int var1) {
      return mainJNI.MinCostFlow_getHead(this.swigCPtr, this, var1);
   }

   public long getCapacity(int var1) {
      return mainJNI.MinCostFlow_getCapacity(this.swigCPtr, this, var1);
   }

   public long getSupply(int var1) {
      return mainJNI.MinCostFlow_getSupply(this.swigCPtr, this, var1);
   }

   public long getUnitCost(int var1) {
      return mainJNI.MinCostFlow_getUnitCost(this.swigCPtr, this, var1);
   }
}
