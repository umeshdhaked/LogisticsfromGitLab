package com.google.ortools.sat;

final class Difference implements LinearExpr {
   private final LinearExpr left;
   private final LinearExpr right;

   public Difference(LinearExpr var1, LinearExpr var2) {
      this.left = var1;
      this.right = var2;
   }

   public int numElements() {
      return this.left.numElements() + this.right.numElements();
   }

   public IntVar getVariable(int var1) {
      return var1 < this.left.numElements() ? this.left.getVariable(var1) : this.right.getVariable(var1 - this.left.numElements());
   }

   public long getCoefficient(int var1) {
      return var1 < this.left.numElements() ? this.left.getCoefficient(var1) : -this.right.getCoefficient(var1 - this.left.numElements());
   }
}
