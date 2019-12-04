package com.google.ortools.algorithms;

public class mainJNI {
   public static final native int KnapsackSolver_KNAPSACK_BRUTE_FORCE_SOLVER_get();

   public static final native int KnapsackSolver_KNAPSACK_64ITEMS_SOLVER_get();

   public static final native int KnapsackSolver_KNAPSACK_DYNAMIC_PROGRAMMING_SOLVER_get();

   public static final native int KnapsackSolver_KNAPSACK_MULTIDIMENSION_CBC_MIP_SOLVER_get();

   public static final native int KnapsackSolver_KNAPSACK_MULTIDIMENSION_BRANCH_AND_BOUND_SOLVER_get();

   public static final native long new_KnapsackSolver__SWIG_0(String var0);

   public static final native long new_KnapsackSolver__SWIG_1(int var0, String var1);

   public static final native void delete_KnapsackSolver(long var0);

   public static final native void KnapsackSolver_init(long var0, KnapsackSolver var2, long[] var3, long[][] var4, long[] var5);

   public static final native long KnapsackSolver_solve(long var0, KnapsackSolver var2);

   public static final native boolean KnapsackSolver_bestSolutionContains(long var0, KnapsackSolver var2, int var3);

   public static final native boolean KnapsackSolver_isSolutionOptimal(long var0, KnapsackSolver var2);

   public static final native String KnapsackSolver_getName(long var0, KnapsackSolver var2);

   public static final native boolean KnapsackSolver_useReduction(long var0, KnapsackSolver var2);

   public static final native void KnapsackSolver_setUseReduction(long var0, KnapsackSolver var2, boolean var3);

   public static final native void KnapsackSolver_setTimeLimit(long var0, KnapsackSolver var2, double var3);
}
