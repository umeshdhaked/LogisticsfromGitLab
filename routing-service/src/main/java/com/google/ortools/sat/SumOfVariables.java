package com.google.ortools.sat;

public final class SumOfVariables implements LinearExpr {
   private final IntVar[] variables;

   public SumOfVariables(IntVar[] var1) {
      this.variables = var1;
   }

   public int numElements() {
      return this.variables.length;
   }

   public IntVar getVariable(int var1) {
      assert var1 >= 0;

      assert var1 < this.variables.length;

      return this.variables[var1];
   }

   public long getCoefficient(int var1) {
      return 1L;
   }
}
