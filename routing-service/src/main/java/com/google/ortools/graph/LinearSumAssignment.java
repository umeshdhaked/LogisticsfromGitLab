package com.google.ortools.graph;

public class LinearSumAssignment {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected LinearSumAssignment(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(LinearSumAssignment var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_LinearSumAssignment(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public LinearSumAssignment() {
      this(mainJNI.new_LinearSumAssignment(), true);
   }

   public int addArcWithCost(int var1, int var2, long var3) {
      return mainJNI.LinearSumAssignment_addArcWithCost(this.swigCPtr, this, var1, var2, var3);
   }

   public int getNumNodes() {
      return mainJNI.LinearSumAssignment_getNumNodes(this.swigCPtr, this);
   }

   public int getNumArcs() {
      return mainJNI.LinearSumAssignment_getNumArcs(this.swigCPtr, this);
   }

   public int getLeftNode(int var1) {
      return mainJNI.LinearSumAssignment_getLeftNode(this.swigCPtr, this, var1);
   }

   public int getRightNode(int var1) {
      return mainJNI.LinearSumAssignment_getRightNode(this.swigCPtr, this, var1);
   }

   public long getCost(int var1) {
      return mainJNI.LinearSumAssignment_getCost(this.swigCPtr, this, var1);
   }

   public LinearSumAssignment.Status solve() {
      return LinearSumAssignment.Status.swigToEnum(mainJNI.LinearSumAssignment_solve(this.swigCPtr, this));
   }

   public long getOptimalCost() {
      return mainJNI.LinearSumAssignment_getOptimalCost(this.swigCPtr, this);
   }

   public int getRightMate(int var1) {
      return mainJNI.LinearSumAssignment_getRightMate(this.swigCPtr, this, var1);
   }

   public long getAssignmentCost(int var1) {
      return mainJNI.LinearSumAssignment_getAssignmentCost(this.swigCPtr, this, var1);
   }

   public static enum Status {
      OPTIMAL,
      INFEASIBLE,
      POSSIBLE_OVERFLOW;

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static LinearSumAssignment.Status swigToEnum(int var0) {
         LinearSumAssignment.Status[] var1 = (LinearSumAssignment.Status[])LinearSumAssignment.Status.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            LinearSumAssignment.Status[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               LinearSumAssignment.Status var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + LinearSumAssignment.Status.class + " with value " + var0);
         }
      }

      private Status() {
         this.swigValue = LinearSumAssignment.Status.SwigNext.next++;
      }

      private Status(int var3) {
         this.swigValue = var3;
         LinearSumAssignment.Status.SwigNext.next = var3 + 1;
      }

      private Status(LinearSumAssignment.Status var3) {
         this.swigValue = var3.swigValue;
         LinearSumAssignment.Status.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }
}
