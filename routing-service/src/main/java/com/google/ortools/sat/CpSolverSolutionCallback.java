package com.google.ortools.sat;

public class CpSolverSolutionCallback extends SolutionCallback {
   public long value(IntVar var1) {
      int var2 = var1.getIndex();
      return this.solutionIntegerValue(var2);
   }

   public Boolean booleanValue(Literal var1) {
      return this.solutionBooleanValue(var1.getIndex());
   }

   public void onSolutionCallback() {
   }
}
