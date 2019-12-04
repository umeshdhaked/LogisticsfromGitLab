package com.google.ortools.sat;

public final class CpSolver {
   private CpSolverResponse solveResponse;
   private final SatParameters.Builder solveParameters = SatParameters.newBuilder();

   public CpSolverStatus solve(CpModel var1) {
      this.solveResponse = SatHelper.solveWithParameters(var1.model(), this.solveParameters.build());
      return this.solveResponse.getStatus();
   }

   public CpSolverStatus solveWithSolutionCallback(CpModel var1, CpSolverSolutionCallback var2) {
      this.solveResponse = SatHelper.solveWithParametersAndSolutionCallback(var1.model(), this.solveParameters.build(), var2);
      return this.solveResponse.getStatus();
   }

   public CpSolverStatus searchAllSolutions(CpModel var1, CpSolverSolutionCallback var2) {
      this.solveParameters.setEnumerateAllSolutions(true);
      this.solveResponse = SatHelper.solveWithParametersAndSolutionCallback(var1.model(), this.solveParameters.build(), var2);
      this.solveParameters.setEnumerateAllSolutions(true);
      return this.solveResponse.getStatus();
   }

   public double objectiveValue() {
      return this.solveResponse.getObjectiveValue();
   }

   public double bestObjectiveBound() {
      return this.solveResponse.getBestObjectiveBound();
   }

   public long value(IntVar var1) {
      return this.solveResponse.getSolution(var1.getIndex());
   }

   public Boolean booleanValue(Literal var1) {
      int var2 = var1.getIndex();
      return var2 >= 0 ? this.solveResponse.getSolution(var2) != 0L : this.solveResponse.getSolution(-var2 - 1) == 0L;
   }

   public CpSolverResponse response() {
      return this.solveResponse;
   }

   public long numBranches() {
      return this.solveResponse.getNumBranches();
   }

   public long numConflicts() {
      return this.solveResponse.getNumConflicts();
   }

   public double wallTime() {
      return this.solveResponse.getWallTime();
   }

   public double userTime() {
      return this.solveResponse.getUserTime();
   }

   public SatParameters.Builder getParameters() {
      return this.solveParameters;
   }

   public String responseStats() {
      return SatHelper.solverResponseStats(this.solveResponse);
   }
}
