package com.google.ortools.sat;

public final class ScalProd implements LinearExpr {
   private final IntVar[] variables;
   private final long[] coefficients;

   public ScalProd(IntVar[] var1, long[] var2) {
      assert var1.length == var2.length;

      this.variables = var1;
      this.coefficients = var2;
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
      assert var1 >= 0;

      assert var1 < this.coefficients.length;

      return this.coefficients[var1];
   }
}
