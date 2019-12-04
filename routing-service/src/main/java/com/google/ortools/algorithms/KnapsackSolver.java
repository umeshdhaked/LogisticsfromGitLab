package com.google.ortools.algorithms;

public class KnapsackSolver {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected KnapsackSolver(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(KnapsackSolver var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_KnapsackSolver(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public KnapsackSolver(String var1) {
      this(mainJNI.new_KnapsackSolver__SWIG_0(var1), true);
   }

   public KnapsackSolver(KnapsackSolver.SolverType var1, String var2) {
      this(mainJNI.new_KnapsackSolver__SWIG_1(var1.swigValue(), var2), true);
   }

   public void init(long[] var1, long[][] var2, long[] var3) {
      mainJNI.KnapsackSolver_init(this.swigCPtr, this, var1, var2, var3);
   }

   public long solve() {
      return mainJNI.KnapsackSolver_solve(this.swigCPtr, this);
   }

   public boolean bestSolutionContains(int var1) {
      return mainJNI.KnapsackSolver_bestSolutionContains(this.swigCPtr, this, var1);
   }

   public boolean isSolutionOptimal() {
      return mainJNI.KnapsackSolver_isSolutionOptimal(this.swigCPtr, this);
   }

   public String getName() {
      return mainJNI.KnapsackSolver_getName(this.swigCPtr, this);
   }

   public boolean useReduction() {
      return mainJNI.KnapsackSolver_useReduction(this.swigCPtr, this);
   }

   public void setUseReduction(boolean var1) {
      mainJNI.KnapsackSolver_setUseReduction(this.swigCPtr, this, var1);
   }

   public void setTimeLimit(double var1) {
      mainJNI.KnapsackSolver_setTimeLimit(this.swigCPtr, this, var1);
   }

   public static enum SolverType {
      KNAPSACK_BRUTE_FORCE_SOLVER(mainJNI.KnapsackSolver_KNAPSACK_BRUTE_FORCE_SOLVER_get()),
      KNAPSACK_64ITEMS_SOLVER(mainJNI.KnapsackSolver_KNAPSACK_64ITEMS_SOLVER_get()),
      KNAPSACK_DYNAMIC_PROGRAMMING_SOLVER(mainJNI.KnapsackSolver_KNAPSACK_DYNAMIC_PROGRAMMING_SOLVER_get()),
      KNAPSACK_MULTIDIMENSION_CBC_MIP_SOLVER(mainJNI.KnapsackSolver_KNAPSACK_MULTIDIMENSION_CBC_MIP_SOLVER_get()),
      KNAPSACK_MULTIDIMENSION_BRANCH_AND_BOUND_SOLVER(mainJNI.KnapsackSolver_KNAPSACK_MULTIDIMENSION_BRANCH_AND_BOUND_SOLVER_get());

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static KnapsackSolver.SolverType swigToEnum(int var0) {
         KnapsackSolver.SolverType[] var1 = (KnapsackSolver.SolverType[])KnapsackSolver.SolverType.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            KnapsackSolver.SolverType[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               KnapsackSolver.SolverType var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + KnapsackSolver.SolverType.class + " with value " + var0);
         }
      }

      private SolverType() {
         this.swigValue = KnapsackSolver.SolverType.SwigNext.next++;
      }

      private SolverType(int var3) {
         this.swigValue = var3;
         KnapsackSolver.SolverType.SwigNext.next = var3 + 1;
      }

      private SolverType(KnapsackSolver.SolverType var3) {
         this.swigValue = var3.swigValue;
         KnapsackSolver.SolverType.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }
}
