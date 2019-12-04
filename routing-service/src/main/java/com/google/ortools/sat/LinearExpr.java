package com.google.ortools.sat;

public interface LinearExpr {
   int numElements();

   IntVar getVariable(int var1);

   long getCoefficient(int var1);

   static LinearExpr sum(IntVar[] var0) {
      return new SumOfVariables(var0);
   }

   static LinearExpr scalProd(IntVar[] var0, long[] var1) {
      return new ScalProd(var0, var1);
   }

   static LinearExpr scalProd(IntVar[] var0, int[] var1) {
      long[] var2 = new long[var1.length];

      for(int var3 = 0; var3 < var1.length; ++var3) {
         var2[var3] = (long)var1[var3];
      }

      return new ScalProd(var0, var2);
   }

   static LinearExpr term(IntVar var0, long var1) {
      return new ScalProd(new IntVar[]{var0}, new long[]{var1});
   }
}
