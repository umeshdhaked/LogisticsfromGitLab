package com.google.ortools.constraintsolver;

public class RoutingIndexManager {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected RoutingIndexManager(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(RoutingIndexManager var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_RoutingIndexManager(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public RoutingIndexManager(int var1, int var2, int var3) {
      this(mainJNI.new_RoutingIndexManager__SWIG_0(var1, var2, var3), true);
   }

   public RoutingIndexManager(int var1, int var2, int[] var3, int[] var4) {
      this(mainJNI.new_RoutingIndexManager__SWIG_1(var1, var2, var3, var4), true);
   }

   public int getNumberOfNodes() {
      return mainJNI.RoutingIndexManager_getNumberOfNodes(this.swigCPtr, this);
   }

   public int getNumberOfVehicles() {
      return mainJNI.RoutingIndexManager_getNumberOfVehicles(this.swigCPtr, this);
   }

   public int getNumberOfIndices() {
      return mainJNI.RoutingIndexManager_getNumberOfIndices(this.swigCPtr, this);
   }

   public long nodeToIndex(int var1) {
      return mainJNI.RoutingIndexManager_nodeToIndex(this.swigCPtr, this, var1);
   }

   public long[] nodesToIndices(int[] var1) {
      return mainJNI.RoutingIndexManager_nodesToIndices(this.swigCPtr, this, var1);
   }

   public int indexToNode(long var1) {
      return mainJNI.RoutingIndexManager_indexToNode(this.swigCPtr, this, var1);
   }
}
