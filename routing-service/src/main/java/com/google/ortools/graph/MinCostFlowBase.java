package com.google.ortools.graph;

public class MinCostFlowBase {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected MinCostFlowBase(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(MinCostFlowBase var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_MinCostFlowBase(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public MinCostFlowBase() {
      this(mainJNI.new_MinCostFlowBase(), true);
   }

   public static enum Status {
      NOT_SOLVED,
      OPTIMAL,
      FEASIBLE,
      INFEASIBLE,
      UNBALANCED,
      BAD_RESULT,
      BAD_COST_RANGE;

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static MinCostFlowBase.Status swigToEnum(int var0) {
         MinCostFlowBase.Status[] var1 = (MinCostFlowBase.Status[])MinCostFlowBase.Status.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            MinCostFlowBase.Status[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               MinCostFlowBase.Status var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + MinCostFlowBase.Status.class + " with value " + var0);
         }
      }

      private Status() {
         this.swigValue = MinCostFlowBase.Status.SwigNext.next++;
      }

      private Status(int var3) {
         this.swigValue = var3;
         MinCostFlowBase.Status.SwigNext.next = var3 + 1;
      }

      private Status(MinCostFlowBase.Status var3) {
         this.swigValue = var3.swigValue;
         MinCostFlowBase.Status.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }
}
