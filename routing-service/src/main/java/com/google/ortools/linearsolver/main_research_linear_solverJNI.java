package com.google.ortools.linearsolver;

public class main_research_linear_solverJNI {
   public static final native int MPSolver_CLP_LINEAR_PROGRAMMING_get();

   public static final native int MPSolver_GLOP_LINEAR_PROGRAMMING_get();

   public static final native int MPSolver_CBC_MIXED_INTEGER_PROGRAMMING_get();

   public static final native int MPSolver_BOP_INTEGER_PROGRAMMING_get();

   public static final native long new_MPSolver(String var0, int var1);

   public static final native void delete_MPSolver(long var0);

   public static final native boolean MPSolver_supportsProblemType(int var0);

   public static final native void MPSolver_clear(long var0, MPSolver var2);

   public static final native int MPSolver_numVariables(long var0, MPSolver var2);

   public static final native MPVariable[] MPSolver_variables(long var0, MPSolver var2);

   public static final native long MPSolver_lookupVariableOrNull(long var0, MPSolver var2, String var3);

   public static final native long MPSolver_makeVar(long var0, MPSolver var2, double var3, double var5, boolean var7, String var8);

   public static final native long MPSolver_makeNumVar(long var0, MPSolver var2, double var3, double var5, String var7);

   public static final native long MPSolver_makeIntVar(long var0, MPSolver var2, double var3, double var5, String var7);

   public static final native long MPSolver_makeBoolVar(long var0, MPSolver var2, String var3);

   public static final native int MPSolver_numConstraints(long var0, MPSolver var2);

   public static final native MPConstraint[] MPSolver_constraints(long var0, MPSolver var2);

   public static final native long MPSolver_lookupConstraintOrNull(long var0, MPSolver var2, String var3);

   public static final native long MPSolver_makeConstraint__SWIG_0(long var0, MPSolver var2, double var3, double var5);

   public static final native long MPSolver_makeConstraint__SWIG_1(long var0, MPSolver var2);

   public static final native long MPSolver_makeConstraint__SWIG_2(long var0, MPSolver var2, double var3, double var5, String var7);

   public static final native long MPSolver_makeConstraint__SWIG_3(long var0, MPSolver var2, String var3);

   public static final native long MPSolver_objective(long var0, MPSolver var2);

   public static final native int MPSolver_NOT_SOLVED_get();

   public static final native int MPSolver_solve__SWIG_0(long var0, MPSolver var2);

   public static final native int MPSolver_solve__SWIG_1(long var0, MPSolver var2, long var3, MPSolverParameters var5);

   public static final native double[] MPSolver_computeConstraintActivities(long var0, MPSolver var2);

   public static final native boolean MPSolver_verifySolution(long var0, MPSolver var2, double var3, boolean var5);

   public static final native void MPSolver_reset(long var0, MPSolver var2);

   public static final native boolean MPSolver_interruptSolve(long var0, MPSolver var2);

   public static final native boolean MPSolver_setSolverSpecificParametersAsString(long var0, MPSolver var2, String var3);

   public static final native int MPSolver_FREE_get();

   public static final native void MPSolver_SetStartingLpBasis(long var0, MPSolver var2, long var3, long var5);

   public static final native double MPSolver_infinity();

   public static final native void MPSolver_enableOutput(long var0, MPSolver var2);

   public static final native void MPSolver_suppressOutput(long var0, MPSolver var2);

   public static final native long MPSolver_iterations(long var0, MPSolver var2);

   public static final native long MPSolver_nodes(long var0, MPSolver var2);

   public static final native double MPSolver_computeExactConditionNumber(long var0, MPSolver var2);

   public static final native void MPSolver_setTimeLimit(long var0, MPSolver var2, long var3);

   public static final native long MPSolver_wallTime(long var0, MPSolver var2);

   public static final native String MPSolver_loadModelFromProto(long var0, MPSolver var2, byte[] var3);

   public static final native String MPSolver_loadModelFromProtoWithUniqueNamesOrDie(long var0, MPSolver var2, byte[] var3);

   public static final native byte[] MPSolver_exportModelToProto(long var0, MPSolver var2);

   public static final native byte[] MPSolver_createSolutionResponseProto(long var0, MPSolver var2);

   public static final native boolean MPSolver_loadSolutionFromProto(long var0, MPSolver var2, byte[] var3);

   public static final native byte[] MPSolver_solveWithProto(byte[] var0);

   public static final native String MPSolver_exportModelAsLpFormat__SWIG_0(long var0, MPSolver var2, long var3, MPModelExportOptions var5);

   public static final native String MPSolver_exportModelAsLpFormat__SWIG_1(long var0, MPSolver var2);

   public static final native String MPSolver_exportModelAsMpsFormat__SWIG_0(long var0, MPSolver var2, long var3, MPModelExportOptions var5);

   public static final native String MPSolver_exportModelAsMpsFormat__SWIG_1(long var0, MPSolver var2);

   public static final native void MPSolver_setHint(long var0, MPSolver var2, MPVariable[] var3, double[] var4);

   public static final native boolean MPSolver_setNumThreads(long var0, MPSolver var2, int var3);

   public static final native void MPObjective_clear(long var0, MPObjective var2);

   public static final native void MPObjective_setCoefficient(long var0, MPObjective var2, long var3, MPVariable var5, double var6);

   public static final native double MPObjective_getCoefficient(long var0, MPObjective var2, long var3, MPVariable var5);

   public static final native void MPObjective_setOffset(long var0, MPObjective var2, double var3);

   public static final native double MPObjective_offset(long var0, MPObjective var2);

   public static final native void MPObjective_setOptimizationDirection(long var0, MPObjective var2, boolean var3);

   public static final native void MPObjective_setMinimization(long var0, MPObjective var2);

   public static final native void MPObjective_setMaximization(long var0, MPObjective var2);

   public static final native boolean MPObjective_maximization(long var0, MPObjective var2);

   public static final native boolean MPObjective_minimization(long var0, MPObjective var2);

   public static final native double MPObjective_value(long var0, MPObjective var2);

   public static final native double MPObjective_bestBound(long var0, MPObjective var2);

   public static final native void delete_MPObjective(long var0);

   public static final native String MPVariable_name(long var0, MPVariable var2);

   public static final native void MPVariable_setInteger(long var0, MPVariable var2, boolean var3);

   public static final native double MPVariable_solutionValue(long var0, MPVariable var2);

   public static final native int MPVariable_index(long var0, MPVariable var2);

   public static final native double MPVariable_lb(long var0, MPVariable var2);

   public static final native double MPVariable_ub(long var0, MPVariable var2);

   public static final native void MPVariable_setLb(long var0, MPVariable var2, double var3);

   public static final native void MPVariable_setUb(long var0, MPVariable var2, double var3);

   public static final native void MPVariable_setBounds(long var0, MPVariable var2, double var3, double var5);

   public static final native double MPVariable_reducedCost(long var0, MPVariable var2);

   public static final native int MPVariable_basisStatus(long var0, MPVariable var2);

   public static final native void delete_MPVariable(long var0);

   public static final native String MPConstraint_name(long var0, MPConstraint var2);

   public static final native void MPConstraint_setCoefficient(long var0, MPConstraint var2, long var3, MPVariable var5, double var6);

   public static final native double MPConstraint_getCoefficient(long var0, MPConstraint var2, long var3, MPVariable var5);

   public static final native double MPConstraint_lb(long var0, MPConstraint var2);

   public static final native double MPConstraint_ub(long var0, MPConstraint var2);

   public static final native void MPConstraint_setLb(long var0, MPConstraint var2, double var3);

   public static final native void MPConstraint_setUb(long var0, MPConstraint var2, double var3);

   public static final native void MPConstraint_setBounds(long var0, MPConstraint var2, double var3, double var5);

   public static final native boolean MPConstraint_isLazy(long var0, MPConstraint var2);

   public static final native void MPConstraint_setIsLazy(long var0, MPConstraint var2, boolean var3);

   public static final native int MPConstraint_index(long var0, MPConstraint var2);

   public static final native double MPConstraint_dualValue(long var0, MPConstraint var2);

   public static final native int MPConstraint_basisStatus(long var0, MPConstraint var2);

   public static final native void delete_MPConstraint(long var0);

   public static final native int MPSolverParameters_RELATIVE_MIP_GAP_get();

   public static final native int MPSolverParameters_PRIMAL_TOLERANCE_get();

   public static final native int MPSolverParameters_DUAL_TOLERANCE_get();

   public static final native int MPSolverParameters_PRESOLVE_get();

   public static final native int MPSolverParameters_LP_ALGORITHM_get();

   public static final native int MPSolverParameters_INCREMENTALITY_get();

   public static final native int MPSolverParameters_SCALING_get();

   public static final native int MPSolverParameters_PRESOLVE_OFF_get();

   public static final native int MPSolverParameters_PRESOLVE_ON_get();

   public static final native int MPSolverParameters_DUAL_get();

   public static final native int MPSolverParameters_PRIMAL_get();

   public static final native int MPSolverParameters_BARRIER_get();

   public static final native int MPSolverParameters_INCREMENTALITY_OFF_get();

   public static final native int MPSolverParameters_INCREMENTALITY_ON_get();

   public static final native int MPSolverParameters_SCALING_OFF_get();

   public static final native int MPSolverParameters_SCALING_ON_get();

   public static final native double MPSolverParameters_kDefaultRelativeMipGap_get();

   public static final native double MPSolverParameters_kDefaultPrimalTolerance_get();

   public static final native double MPSolverParameters_kDefaultDualTolerance_get();

   public static final native int MPSolverParameters_kDefaultPresolve_get();

   public static final native int MPSolverParameters_kDefaultIncrementality_get();

   public static final native long new_MPSolverParameters();

   public static final native void MPSolverParameters_setDoubleParam(long var0, MPSolverParameters var2, int var3, double var4);

   public static final native void MPSolverParameters_setIntegerParam(long var0, MPSolverParameters var2, int var3, int var4);

   public static final native double MPSolverParameters_getDoubleParam(long var0, MPSolverParameters var2, int var3);

   public static final native int MPSolverParameters_getIntegerParam(long var0, MPSolverParameters var2, int var3);

   public static final native void delete_MPSolverParameters(long var0);

   public static final native long new_MPModelExportOptions();

   public static final native void MPModelExportOptions_Obfuscate_set(long var0, MPModelExportOptions var2, boolean var3);

   public static final native boolean MPModelExportOptions_Obfuscate_get(long var0, MPModelExportOptions var2);

   public static final native void MPModelExportOptions_LogInvalidNames_set(long var0, MPModelExportOptions var2, boolean var3);

   public static final native boolean MPModelExportOptions_LogInvalidNames_get(long var0, MPModelExportOptions var2);

   public static final native void MPModelExportOptions_ShowUnusedVariables_set(long var0, MPModelExportOptions var2, boolean var3);

   public static final native boolean MPModelExportOptions_ShowUnusedVariables_get(long var0, MPModelExportOptions var2);

   public static final native void MPModelExportOptions_MaxLineLength_set(long var0, MPModelExportOptions var2, int var3);

   public static final native int MPModelExportOptions_MaxLineLength_get(long var0, MPModelExportOptions var2);

   public static final native void delete_MPModelExportOptions(long var0);
}
