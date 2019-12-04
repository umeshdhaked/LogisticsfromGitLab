package com.google.ortools.sat;

import com.google.ortools.util.Domain;

public final class IntVar implements Literal, LinearExpr {
   private final CpModelProto.Builder modelBuilder;
   private final int variableIndex;
   private final IntegerVariableProto.Builder varBuilder;
   private NotBooleanVariable negation_;

   IntVar(CpModelProto.Builder var1, Domain var2, String var3) {
      this.modelBuilder = var1;
      this.variableIndex = this.modelBuilder.getVariablesCount();
      this.varBuilder = this.modelBuilder.addVariablesBuilder();
      this.varBuilder.setName(var3);
      long[] var4 = var2.flattenedIntervals();
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         long var7 = var4[var6];
         this.varBuilder.addDomain(var7);
      }

      this.negation_ = null;
   }

   public String toString() {
      return this.varBuilder.toString();
   }

   public String getName() {
      return this.varBuilder.getName();
   }

   public int getIndex() {
      return this.variableIndex;
   }

   public IntegerVariableProto.Builder getBuilder() {
      return this.varBuilder;
   }

   public int numElements() {
      return 1;
   }

   public IntVar getVariable(int var1) {
      assert var1 == 0;

      return this;
   }

   public long getCoefficient(int var1) {
      assert var1 == 0;

      return 1L;
   }

   public String getShortString() {
      if (this.varBuilder.getName().isEmpty()) {
         return this.varBuilder.getDomainCount() == 2 && this.varBuilder.getDomain(0) == this.varBuilder.getDomain(1) ? String.format("%d", this.varBuilder.getDomain(0)) : String.format("var_%d(%s)", this.getIndex(), this.displayBounds());
      } else {
         return String.format("%s(%s)", this.getName(), this.displayBounds());
      }
   }

   public String displayBounds() {
      String var1 = "";

      for(int var2 = 0; var2 < this.varBuilder.getDomainCount(); var2 += 2) {
         if (var2 != 0) {
            var1 = var1 + ", ";
         }

         if (this.varBuilder.getDomain(var2) == this.varBuilder.getDomain(var2 + 1)) {
            var1 = var1 + String.format("%d", this.varBuilder.getDomain(var2));
         } else {
            var1 = var1 + String.format("%d..%d", this.varBuilder.getDomain(var2), this.varBuilder.getDomain(var2 + 1));
         }
      }

      return var1;
   }

   public Literal not() {
      if (this.negation_ == null) {
         this.negation_ = new NotBooleanVariable(this);
      }

      return this.negation_;
   }
}
