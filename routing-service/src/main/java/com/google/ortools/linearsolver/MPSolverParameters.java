package com.google.ortools.linearsolver;

public class MPSolverParameters {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected MPSolverParameters(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(MPSolverParameters var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            main_research_linear_solverJNI.delete_MPSolverParameters(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public static double getKDefaultRelativeMipGap() {
      return main_research_linear_solverJNI.MPSolverParameters_kDefaultRelativeMipGap_get();
   }

   public static double getKDefaultPrimalTolerance() {
      return main_research_linear_solverJNI.MPSolverParameters_kDefaultPrimalTolerance_get();
   }

   public static double getKDefaultDualTolerance() {
      return main_research_linear_solverJNI.MPSolverParameters_kDefaultDualTolerance_get();
   }

   public static MPSolverParameters.PresolveValues getKDefaultPresolve() {
      return MPSolverParameters.PresolveValues.swigToEnum(main_research_linear_solverJNI.MPSolverParameters_kDefaultPresolve_get());
   }

   public static MPSolverParameters.IncrementalityValues getKDefaultIncrementality() {
      return MPSolverParameters.IncrementalityValues.swigToEnum(main_research_linear_solverJNI.MPSolverParameters_kDefaultIncrementality_get());
   }

   public MPSolverParameters() {
      this(main_research_linear_solverJNI.new_MPSolverParameters(), true);
   }

   public void setDoubleParam(MPSolverParameters.DoubleParam var1, double var2) {
      main_research_linear_solverJNI.MPSolverParameters_setDoubleParam(this.swigCPtr, this, var1.swigValue(), var2);
   }

   public void setIntegerParam(MPSolverParameters.IntegerParam var1, int var2) {
      main_research_linear_solverJNI.MPSolverParameters_setIntegerParam(this.swigCPtr, this, var1.swigValue(), var2);
   }

   public double getDoubleParam(MPSolverParameters.DoubleParam var1) {
      return main_research_linear_solverJNI.MPSolverParameters_getDoubleParam(this.swigCPtr, this, var1.swigValue());
   }

   public int getIntegerParam(MPSolverParameters.IntegerParam var1) {
      return main_research_linear_solverJNI.MPSolverParameters_getIntegerParam(this.swigCPtr, this, var1.swigValue());
   }

   public static enum ScalingValues {
      SCALING_OFF(main_research_linear_solverJNI.MPSolverParameters_SCALING_OFF_get()),
      SCALING_ON(main_research_linear_solverJNI.MPSolverParameters_SCALING_ON_get());

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static MPSolverParameters.ScalingValues swigToEnum(int var0) {
         MPSolverParameters.ScalingValues[] var1 = (MPSolverParameters.ScalingValues[])MPSolverParameters.ScalingValues.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            MPSolverParameters.ScalingValues[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               MPSolverParameters.ScalingValues var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + MPSolverParameters.ScalingValues.class + " with value " + var0);
         }
      }

      private ScalingValues() {
         this.swigValue = MPSolverParameters.ScalingValues.SwigNext.next++;
      }

      private ScalingValues(int var3) {
         this.swigValue = var3;
         MPSolverParameters.ScalingValues.SwigNext.next = var3 + 1;
      }

      private ScalingValues(MPSolverParameters.ScalingValues var3) {
         this.swigValue = var3.swigValue;
         MPSolverParameters.ScalingValues.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }

   public static enum IncrementalityValues {
      INCREMENTALITY_OFF(main_research_linear_solverJNI.MPSolverParameters_INCREMENTALITY_OFF_get()),
      INCREMENTALITY_ON(main_research_linear_solverJNI.MPSolverParameters_INCREMENTALITY_ON_get());

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static MPSolverParameters.IncrementalityValues swigToEnum(int var0) {
         MPSolverParameters.IncrementalityValues[] var1 = (MPSolverParameters.IncrementalityValues[])MPSolverParameters.IncrementalityValues.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            MPSolverParameters.IncrementalityValues[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               MPSolverParameters.IncrementalityValues var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + MPSolverParameters.IncrementalityValues.class + " with value " + var0);
         }
      }

      private IncrementalityValues() {
         this.swigValue = MPSolverParameters.IncrementalityValues.SwigNext.next++;
      }

      private IncrementalityValues(int var3) {
         this.swigValue = var3;
         MPSolverParameters.IncrementalityValues.SwigNext.next = var3 + 1;
      }

      private IncrementalityValues(MPSolverParameters.IncrementalityValues var3) {
         this.swigValue = var3.swigValue;
         MPSolverParameters.IncrementalityValues.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }

   public static enum LpAlgorithmValues {
      DUAL(main_research_linear_solverJNI.MPSolverParameters_DUAL_get()),
      PRIMAL(main_research_linear_solverJNI.MPSolverParameters_PRIMAL_get()),
      BARRIER(main_research_linear_solverJNI.MPSolverParameters_BARRIER_get());

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static MPSolverParameters.LpAlgorithmValues swigToEnum(int var0) {
         MPSolverParameters.LpAlgorithmValues[] var1 = (MPSolverParameters.LpAlgorithmValues[])MPSolverParameters.LpAlgorithmValues.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            MPSolverParameters.LpAlgorithmValues[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               MPSolverParameters.LpAlgorithmValues var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + MPSolverParameters.LpAlgorithmValues.class + " with value " + var0);
         }
      }

      private LpAlgorithmValues() {
         this.swigValue = MPSolverParameters.LpAlgorithmValues.SwigNext.next++;
      }

      private LpAlgorithmValues(int var3) {
         this.swigValue = var3;
         MPSolverParameters.LpAlgorithmValues.SwigNext.next = var3 + 1;
      }

      private LpAlgorithmValues(MPSolverParameters.LpAlgorithmValues var3) {
         this.swigValue = var3.swigValue;
         MPSolverParameters.LpAlgorithmValues.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }

   public static enum PresolveValues {
      PRESOLVE_OFF(main_research_linear_solverJNI.MPSolverParameters_PRESOLVE_OFF_get()),
      PRESOLVE_ON(main_research_linear_solverJNI.MPSolverParameters_PRESOLVE_ON_get());

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static MPSolverParameters.PresolveValues swigToEnum(int var0) {
         MPSolverParameters.PresolveValues[] var1 = (MPSolverParameters.PresolveValues[])MPSolverParameters.PresolveValues.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            MPSolverParameters.PresolveValues[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               MPSolverParameters.PresolveValues var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + MPSolverParameters.PresolveValues.class + " with value " + var0);
         }
      }

      private PresolveValues() {
         this.swigValue = MPSolverParameters.PresolveValues.SwigNext.next++;
      }

      private PresolveValues(int var3) {
         this.swigValue = var3;
         MPSolverParameters.PresolveValues.SwigNext.next = var3 + 1;
      }

      private PresolveValues(MPSolverParameters.PresolveValues var3) {
         this.swigValue = var3.swigValue;
         MPSolverParameters.PresolveValues.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }

   public static enum IntegerParam {
      PRESOLVE(main_research_linear_solverJNI.MPSolverParameters_PRESOLVE_get()),
      LP_ALGORITHM(main_research_linear_solverJNI.MPSolverParameters_LP_ALGORITHM_get()),
      INCREMENTALITY(main_research_linear_solverJNI.MPSolverParameters_INCREMENTALITY_get()),
      SCALING(main_research_linear_solverJNI.MPSolverParameters_SCALING_get());

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static MPSolverParameters.IntegerParam swigToEnum(int var0) {
         MPSolverParameters.IntegerParam[] var1 = (MPSolverParameters.IntegerParam[])MPSolverParameters.IntegerParam.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            MPSolverParameters.IntegerParam[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               MPSolverParameters.IntegerParam var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + MPSolverParameters.IntegerParam.class + " with value " + var0);
         }
      }

      private IntegerParam() {
         this.swigValue = MPSolverParameters.IntegerParam.SwigNext.next++;
      }

      private IntegerParam(int var3) {
         this.swigValue = var3;
         MPSolverParameters.IntegerParam.SwigNext.next = var3 + 1;
      }

      private IntegerParam(MPSolverParameters.IntegerParam var3) {
         this.swigValue = var3.swigValue;
         MPSolverParameters.IntegerParam.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }

   public static enum DoubleParam {
      RELATIVE_MIP_GAP(main_research_linear_solverJNI.MPSolverParameters_RELATIVE_MIP_GAP_get()),
      PRIMAL_TOLERANCE(main_research_linear_solverJNI.MPSolverParameters_PRIMAL_TOLERANCE_get()),
      DUAL_TOLERANCE(main_research_linear_solverJNI.MPSolverParameters_DUAL_TOLERANCE_get());

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static MPSolverParameters.DoubleParam swigToEnum(int var0) {
         MPSolverParameters.DoubleParam[] var1 = (MPSolverParameters.DoubleParam[])MPSolverParameters.DoubleParam.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            MPSolverParameters.DoubleParam[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               MPSolverParameters.DoubleParam var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + MPSolverParameters.DoubleParam.class + " with value " + var0);
         }
      }

      private DoubleParam() {
         this.swigValue = MPSolverParameters.DoubleParam.SwigNext.next++;
      }

      private DoubleParam(int var3) {
         this.swigValue = var3;
         MPSolverParameters.DoubleParam.SwigNext.next = var3 + 1;
      }

      private DoubleParam(MPSolverParameters.DoubleParam var3) {
         this.swigValue = var3.swigValue;
         MPSolverParameters.DoubleParam.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }
}
