package com.google.ortools.graph;

public class MaxFlow {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected MaxFlow(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(MaxFlow var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_MaxFlow(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public MaxFlow() {
      this(mainJNI.new_MaxFlow(), true);
   }

   public int addArcWithCapacity(int var1, int var2, long var3) {
      return mainJNI.MaxFlow_addArcWithCapacity(this.swigCPtr, this, var1, var2, var3);
   }

   public int getNumNodes() {
      return mainJNI.MaxFlow_getNumNodes(this.swigCPtr, this);
   }

   public int getNumArcs() {
      return mainJNI.MaxFlow_getNumArcs(this.swigCPtr, this);
   }

   public int getTail(int var1) {
      return mainJNI.MaxFlow_getTail(this.swigCPtr, this, var1);
   }

   public int getHead(int var1) {
      return mainJNI.MaxFlow_getHead(this.swigCPtr, this, var1);
   }

   public long getCapacity(int var1) {
      return mainJNI.MaxFlow_getCapacity(this.swigCPtr, this, var1);
   }

   public MaxFlow.Status solve(int var1, int var2) {
      return MaxFlow.Status.swigToEnum(mainJNI.MaxFlow_solve(this.swigCPtr, this, var1, var2));
   }

   public long getOptimalFlow() {
      return mainJNI.MaxFlow_getOptimalFlow(this.swigCPtr, this);
   }

   public long getFlow(int var1) {
      return mainJNI.MaxFlow_getFlow(this.swigCPtr, this, var1);
   }

   public void setArcCapacity(int var1, long var2) {
      mainJNI.MaxFlow_setArcCapacity(this.swigCPtr, this, var1, var2);
   }

   public static enum Status {
      OPTIMAL,
      POSSIBLE_OVERFLOW,
      BAD_INPUT,
      BAD_RESULT;

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static MaxFlow.Status swigToEnum(int var0) {
         MaxFlow.Status[] var1 = (MaxFlow.Status[])MaxFlow.Status.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            MaxFlow.Status[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               MaxFlow.Status var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + MaxFlow.Status.class + " with value " + var0);
         }
      }

      private Status() {
         this.swigValue = MaxFlow.Status.SwigNext.next++;
      }

      private Status(int var3) {
         this.swigValue = var3;
         MaxFlow.Status.SwigNext.next = var3 + 1;
      }

      private Status(MaxFlow.Status var3) {
         this.swigValue = var3.swigValue;
         MaxFlow.Status.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }
}
