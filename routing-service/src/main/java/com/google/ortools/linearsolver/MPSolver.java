package com.google.ortools.linearsolver;

import com.google.protobuf.InvalidProtocolBufferException;

public class MPSolver {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected MPSolver(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(MPSolver var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            main_research_linear_solverJNI.delete_MPSolver(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public MPVariable[] makeVarArray(int var1, double var2, double var4, boolean var6) {
      MPVariable[] var7 = new MPVariable[var1];

      for(int var8 = 0; var8 < var1; ++var8) {
         var7[var8] = this.makeVar(var2, var4, var6, "");
      }

      return var7;
   }

   public MPVariable[] makeVarArray(int var1, double var2, double var4, boolean var6, String var7) {
      MPVariable[] var8 = new MPVariable[var1];

      for(int var9 = 0; var9 < var1; ++var9) {
         var8[var9] = this.makeVar(var2, var4, var6, var7 + var9);
      }

      return var8;
   }

   public MPVariable[] makeNumVarArray(int var1, double var2, double var4) {
      return this.makeVarArray(var1, var2, var4, false);
   }

   public MPVariable[] makeNumVarArray(int var1, double var2, double var4, String var6) {
      return this.makeVarArray(var1, var2, var4, false, var6);
   }

   public MPVariable[] makeIntVarArray(int var1, double var2, double var4) {
      return this.makeVarArray(var1, var2, var4, true);
   }

   public MPVariable[] makeIntVarArray(int var1, double var2, double var4, String var6) {
      return this.makeVarArray(var1, var2, var4, true, var6);
   }

   public MPVariable[] makeBoolVarArray(int var1) {
      return this.makeVarArray(var1, 0.0D, 1.0D, true);
   }

   public MPVariable[] makeBoolVarArray(int var1, String var2) {
      return this.makeVarArray(var1, 0.0D, 1.0D, true, var2);
   }

   public MPSolver(String var1, MPSolver.OptimizationProblemType var2) {
      this(main_research_linear_solverJNI.new_MPSolver(var1, var2.swigValue()), true);
   }

   public static boolean supportsProblemType(MPSolver.OptimizationProblemType var0) {
      return main_research_linear_solverJNI.MPSolver_supportsProblemType(var0.swigValue());
   }

   public void clear() {
      main_research_linear_solverJNI.MPSolver_clear(this.swigCPtr, this);
   }

   public int numVariables() {
      return main_research_linear_solverJNI.MPSolver_numVariables(this.swigCPtr, this);
   }

   public MPVariable[] variables() {
      return main_research_linear_solverJNI.MPSolver_variables(this.swigCPtr, this);
   }

   public MPVariable lookupVariableOrNull(String var1) {
      long var2 = main_research_linear_solverJNI.MPSolver_lookupVariableOrNull(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new MPVariable(var2, false);
   }

   public MPVariable makeVar(double var1, double var3, boolean var5, String var6) {
      long var7 = main_research_linear_solverJNI.MPSolver_makeVar(this.swigCPtr, this, var1, var3, var5, var6);
      return var7 == 0L ? null : new MPVariable(var7, false);
   }

   public MPVariable makeNumVar(double var1, double var3, String var5) {
      long var6 = main_research_linear_solverJNI.MPSolver_makeNumVar(this.swigCPtr, this, var1, var3, var5);
      return var6 == 0L ? null : new MPVariable(var6, false);
   }

   public MPVariable makeIntVar(double var1, double var3, String var5) {
      long var6 = main_research_linear_solverJNI.MPSolver_makeIntVar(this.swigCPtr, this, var1, var3, var5);
      return var6 == 0L ? null : new MPVariable(var6, false);
   }

   public MPVariable makeBoolVar(String var1) {
      long var2 = main_research_linear_solverJNI.MPSolver_makeBoolVar(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new MPVariable(var2, false);
   }

   public int numConstraints() {
      return main_research_linear_solverJNI.MPSolver_numConstraints(this.swigCPtr, this);
   }

   public MPConstraint[] constraints() {
      return main_research_linear_solverJNI.MPSolver_constraints(this.swigCPtr, this);
   }

   public MPConstraint lookupConstraintOrNull(String var1) {
      long var2 = main_research_linear_solverJNI.MPSolver_lookupConstraintOrNull(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new MPConstraint(var2, false);
   }

   public MPConstraint makeConstraint(double var1, double var3) {
      long var5 = main_research_linear_solverJNI.MPSolver_makeConstraint__SWIG_0(this.swigCPtr, this, var1, var3);
      return var5 == 0L ? null : new MPConstraint(var5, false);
   }

   public MPConstraint makeConstraint() {
      long var1 = main_research_linear_solverJNI.MPSolver_makeConstraint__SWIG_1(this.swigCPtr, this);
      return var1 == 0L ? null : new MPConstraint(var1, false);
   }

   public MPConstraint makeConstraint(double var1, double var3, String var5) {
      long var6 = main_research_linear_solverJNI.MPSolver_makeConstraint__SWIG_2(this.swigCPtr, this, var1, var3, var5);
      return var6 == 0L ? null : new MPConstraint(var6, false);
   }

   public MPConstraint makeConstraint(String var1) {
      long var2 = main_research_linear_solverJNI.MPSolver_makeConstraint__SWIG_3(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new MPConstraint(var2, false);
   }

   public MPObjective objective() {
      long var1 = main_research_linear_solverJNI.MPSolver_objective(this.swigCPtr, this);
      return var1 == 0L ? null : new MPObjective(var1, false);
   }

   public MPSolver.ResultStatus solve() {
      return MPSolver.ResultStatus.swigToEnum(main_research_linear_solverJNI.MPSolver_solve__SWIG_0(this.swigCPtr, this));
   }

   public MPSolver.ResultStatus solve(MPSolverParameters var1) {
      return MPSolver.ResultStatus.swigToEnum(main_research_linear_solverJNI.MPSolver_solve__SWIG_1(this.swigCPtr, this, MPSolverParameters.getCPtr(var1), var1));
   }

   public double[] computeConstraintActivities() {
      return main_research_linear_solverJNI.MPSolver_computeConstraintActivities(this.swigCPtr, this);
   }

   public boolean verifySolution(double var1, boolean var3) {
      return main_research_linear_solverJNI.MPSolver_verifySolution(this.swigCPtr, this, var1, var3);
   }

   public void reset() {
      main_research_linear_solverJNI.MPSolver_reset(this.swigCPtr, this);
   }

   public boolean interruptSolve() {
      return main_research_linear_solverJNI.MPSolver_interruptSolve(this.swigCPtr, this);
   }

   public boolean setSolverSpecificParametersAsString(String var1) {
      return main_research_linear_solverJNI.MPSolver_setSolverSpecificParametersAsString(this.swigCPtr, this, var1);
   }

   public void SetStartingLpBasis(SWIGTYPE_p_std__vectorT_operations_research__MPSolver__BasisStatus_t var1, SWIGTYPE_p_std__vectorT_operations_research__MPSolver__BasisStatus_t var2) {
      main_research_linear_solverJNI.MPSolver_SetStartingLpBasis(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_operations_research__MPSolver__BasisStatus_t.getCPtr(var1), SWIGTYPE_p_std__vectorT_operations_research__MPSolver__BasisStatus_t.getCPtr(var2));
   }

   public static double infinity() {
      return main_research_linear_solverJNI.MPSolver_infinity();
   }

   public void enableOutput() {
      main_research_linear_solverJNI.MPSolver_enableOutput(this.swigCPtr, this);
   }

   public void suppressOutput() {
      main_research_linear_solverJNI.MPSolver_suppressOutput(this.swigCPtr, this);
   }

   public long iterations() {
      return main_research_linear_solverJNI.MPSolver_iterations(this.swigCPtr, this);
   }

   public long nodes() {
      return main_research_linear_solverJNI.MPSolver_nodes(this.swigCPtr, this);
   }

   public double computeExactConditionNumber() {
      return main_research_linear_solverJNI.MPSolver_computeExactConditionNumber(this.swigCPtr, this);
   }

   public void setTimeLimit(long var1) {
      main_research_linear_solverJNI.MPSolver_setTimeLimit(this.swigCPtr, this, var1);
   }

   public long wallTime() {
      return main_research_linear_solverJNI.MPSolver_wallTime(this.swigCPtr, this);
   }

   public String loadModelFromProto(MPModelProto var1) {
      return main_research_linear_solverJNI.MPSolver_loadModelFromProto(this.swigCPtr, this, var1.toByteArray());
   }

   public String loadModelFromProtoWithUniqueNamesOrDie(MPModelProto var1) {
      return main_research_linear_solverJNI.MPSolver_loadModelFromProtoWithUniqueNamesOrDie(this.swigCPtr, this, var1.toByteArray());
   }

   public MPModelProto exportModelToProto() {
      byte[] var1 = main_research_linear_solverJNI.MPSolver_exportModelToProto(this.swigCPtr, this);
      if (var1 != null && var1.length != 0) {
         try {
            return MPModelProto.parseFrom(var1);
         } catch (InvalidProtocolBufferException var3) {
            throw new RuntimeException("Unable to parse com.google.ortools.linearsolver.MPModelProto protocol message.");
         }
      } else {
         return null;
      }
   }

   public MPSolutionResponse createSolutionResponseProto() {
      byte[] var1 = main_research_linear_solverJNI.MPSolver_createSolutionResponseProto(this.swigCPtr, this);
      if (var1 != null && var1.length != 0) {
         try {
            return MPSolutionResponse.parseFrom(var1);
         } catch (InvalidProtocolBufferException var3) {
            throw new RuntimeException("Unable to parse com.google.ortools.linearsolver.MPSolutionResponse protocol message.");
         }
      } else {
         return null;
      }
   }

   public boolean loadSolutionFromProto(MPSolutionResponse var1) {
      return main_research_linear_solverJNI.MPSolver_loadSolutionFromProto(this.swigCPtr, this, var1.toByteArray());
   }

   public static MPSolutionResponse solveWithProto(MPModelRequest var0) {
      byte[] var1 = main_research_linear_solverJNI.MPSolver_solveWithProto(var0.toByteArray());
      if (var1 != null && var1.length != 0) {
         try {
            return MPSolutionResponse.parseFrom(var1);
         } catch (InvalidProtocolBufferException var3) {
            throw new RuntimeException("Unable to parse com.google.ortools.linearsolver.MPSolutionResponse protocol message.");
         }
      } else {
         return null;
      }
   }

   public String exportModelAsLpFormat(MPModelExportOptions var1) {
      return main_research_linear_solverJNI.MPSolver_exportModelAsLpFormat__SWIG_0(this.swigCPtr, this, MPModelExportOptions.getCPtr(var1), var1);
   }

   public String exportModelAsLpFormat() {
      return main_research_linear_solverJNI.MPSolver_exportModelAsLpFormat__SWIG_1(this.swigCPtr, this);
   }

   public String exportModelAsMpsFormat(MPModelExportOptions var1) {
      return main_research_linear_solverJNI.MPSolver_exportModelAsMpsFormat__SWIG_0(this.swigCPtr, this, MPModelExportOptions.getCPtr(var1), var1);
   }

   public String exportModelAsMpsFormat() {
      return main_research_linear_solverJNI.MPSolver_exportModelAsMpsFormat__SWIG_1(this.swigCPtr, this);
   }

   public void setHint(MPVariable[] var1, double[] var2) {
      main_research_linear_solverJNI.MPSolver_setHint(this.swigCPtr, this, var1, var2);
   }

   public boolean setNumThreads(int var1) {
      return main_research_linear_solverJNI.MPSolver_setNumThreads(this.swigCPtr, this, var1);
   }

   public static enum BasisStatus {
      FREE(main_research_linear_solverJNI.MPSolver_FREE_get()),
      AT_LOWER_BOUND,
      AT_UPPER_BOUND,
      FIXED_VALUE,
      BASIC;

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static MPSolver.BasisStatus swigToEnum(int var0) {
         MPSolver.BasisStatus[] var1 = (MPSolver.BasisStatus[])MPSolver.BasisStatus.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            MPSolver.BasisStatus[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               MPSolver.BasisStatus var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + MPSolver.BasisStatus.class + " with value " + var0);
         }
      }

      private BasisStatus() {
         this.swigValue = MPSolver.BasisStatus.SwigNext.next++;
      }

      private BasisStatus(int var3) {
         this.swigValue = var3;
         MPSolver.BasisStatus.SwigNext.next = var3 + 1;
      }

      private BasisStatus(MPSolver.BasisStatus var3) {
         this.swigValue = var3.swigValue;
         MPSolver.BasisStatus.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }

   public static enum ResultStatus {
      OPTIMAL,
      FEASIBLE,
      INFEASIBLE,
      UNBOUNDED,
      ABNORMAL,
      NOT_SOLVED(main_research_linear_solverJNI.MPSolver_NOT_SOLVED_get());

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static MPSolver.ResultStatus swigToEnum(int var0) {
         MPSolver.ResultStatus[] var1 = (MPSolver.ResultStatus[])MPSolver.ResultStatus.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            MPSolver.ResultStatus[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               MPSolver.ResultStatus var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + MPSolver.ResultStatus.class + " with value " + var0);
         }
      }

      private ResultStatus() {
         this.swigValue = MPSolver.ResultStatus.SwigNext.next++;
      }

      private ResultStatus(int var3) {
         this.swigValue = var3;
         MPSolver.ResultStatus.SwigNext.next = var3 + 1;
      }

      private ResultStatus(MPSolver.ResultStatus var3) {
         this.swigValue = var3.swigValue;
         MPSolver.ResultStatus.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }

   public static enum OptimizationProblemType {
      CLP_LINEAR_PROGRAMMING(main_research_linear_solverJNI.MPSolver_CLP_LINEAR_PROGRAMMING_get()),
      GLOP_LINEAR_PROGRAMMING(main_research_linear_solverJNI.MPSolver_GLOP_LINEAR_PROGRAMMING_get()),
      CBC_MIXED_INTEGER_PROGRAMMING(main_research_linear_solverJNI.MPSolver_CBC_MIXED_INTEGER_PROGRAMMING_get()),
      BOP_INTEGER_PROGRAMMING(main_research_linear_solverJNI.MPSolver_BOP_INTEGER_PROGRAMMING_get());

      private final int swigValue;

      public final int swigValue() {
         return this.swigValue;
      }

      public static MPSolver.OptimizationProblemType swigToEnum(int var0) {
         MPSolver.OptimizationProblemType[] var1 = (MPSolver.OptimizationProblemType[])MPSolver.OptimizationProblemType.class.getEnumConstants();
         if (var0 < var1.length && var0 >= 0 && var1[var0].swigValue == var0) {
            return var1[var0];
         } else {
            MPSolver.OptimizationProblemType[] var2 = var1;
            int var3 = var1.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               MPSolver.OptimizationProblemType var5 = var2[var4];
               if (var5.swigValue == var0) {
                  return var5;
               }
            }

            throw new IllegalArgumentException("No enum " + MPSolver.OptimizationProblemType.class + " with value " + var0);
         }
      }

      private OptimizationProblemType() {
         this.swigValue = MPSolver.OptimizationProblemType.SwigNext.next++;
      }

      private OptimizationProblemType(int var3) {
         this.swigValue = var3;
         MPSolver.OptimizationProblemType.SwigNext.next = var3 + 1;
      }

      private OptimizationProblemType(MPSolver.OptimizationProblemType var3) {
         this.swigValue = var3.swigValue;
         MPSolver.OptimizationProblemType.SwigNext.next = this.swigValue + 1;
      }

      private static class SwigNext {
         private static int next = 0;
      }
   }
}
