package com.google.ortools.sat;

public class Constraint {
   private final int constraintIndex;
   private final ConstraintProto.Builder constraintBuilder;

   public Constraint(CpModelProto.Builder var1) {
      this.constraintIndex = var1.getConstraintsCount();
      this.constraintBuilder = var1.addConstraintsBuilder();
   }

   public void onlyEnforceIf(Literal var1) {
      this.constraintBuilder.addEnforcementLiteral(var1.getIndex());
   }

   public void onlyEnforceIf(Literal[] var1) {
      Literal[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Literal var5 = var2[var4];
         this.constraintBuilder.addEnforcementLiteral(var5.getIndex());
      }

   }

   public int getIndex() {
      return this.constraintIndex;
   }

   public ConstraintProto.Builder getBuilder() {
      return this.constraintBuilder;
   }
}
