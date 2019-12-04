package com.google.ortools.sat;

public class mainJNI {
   public static final native void delete_SolutionCallback(long var0);

   public static final native void SolutionCallback_onSolutionCallback(long var0, SolutionCallback var2);

   public static final native long SolutionCallback_numBooleans(long var0, SolutionCallback var2);

   public static final native long SolutionCallback_numBranches(long var0, SolutionCallback var2);

   public static final native long SolutionCallback_numConflicts(long var0, SolutionCallback var2);

   public static final native long SolutionCallback_numBinaryPropagations(long var0, SolutionCallback var2);

   public static final native long SolutionCallback_numIntegerPropagations(long var0, SolutionCallback var2);

   public static final native double SolutionCallback_wallTime(long var0, SolutionCallback var2);

   public static final native double SolutionCallback_userTime(long var0, SolutionCallback var2);

   public static final native double SolutionCallback_objectiveValue(long var0, SolutionCallback var2);

   public static final native double SolutionCallback_bestObjectiveBound(long var0, SolutionCallback var2);

   public static final native long SolutionCallback_solutionIntegerValue(long var0, SolutionCallback var2, int var3);

   public static final native boolean SolutionCallback_solutionBooleanValue(long var0, SolutionCallback var2, int var3);

   public static final native void SolutionCallback_stopSearch(long var0, SolutionCallback var2);

   public static final native long new_SolutionCallback();

   public static final native void SolutionCallback_director_connect(SolutionCallback var0, long var1, boolean var3, boolean var4);

   public static final native void SolutionCallback_change_ownership(SolutionCallback var0, long var1, boolean var3);

   public static final native byte[] SatHelper_solve(byte[] var0);

   public static final native byte[] SatHelper_solveWithParameters(byte[] var0, byte[] var1);

   public static final native byte[] SatHelper_solveWithParametersAndSolutionCallback(byte[] var0, byte[] var1, long var2, SolutionCallback var4);

   public static final native String SatHelper_modelStats(byte[] var0);

   public static final native String SatHelper_solverResponseStats(byte[] var0);

   public static final native String SatHelper_validateModel(byte[] var0);

   public static final native long new_SatHelper();

   public static final native void delete_SatHelper(long var0);

   public static void SwigDirector_SolutionCallback_onSolutionCallback(SolutionCallback var0) {
      var0.onSolutionCallback();
   }

   private static final native void swig_module_init();

   static {
      swig_module_init();
   }
}
