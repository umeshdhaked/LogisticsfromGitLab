package com.google.ortools.sat;

public final class IntervalVar {
   private final CpModelProto.Builder modelBuilder;
   private final int constraintIndex;
   private final IntervalConstraintProto.Builder intervalBuilder;

   IntervalVar(CpModelProto.Builder var1, int var2, int var3, int var4, String var5) {
      this.modelBuilder = var1;
      this.constraintIndex = this.modelBuilder.getConstraintsCount();
      ConstraintProto.Builder var6 = this.modelBuilder.addConstraintsBuilder();
      var6.setName(var5);
      this.intervalBuilder = var6.getIntervalBuilder();
      this.intervalBuilder.setStart(var2);
      this.intervalBuilder.setSize(var3);
      this.intervalBuilder.setEnd(var4);
   }

   IntervalVar(CpModelProto.Builder var1, int var2, int var3, int var4, int var5, String var6) {
      this.modelBuilder = var1;
      this.constraintIndex = this.modelBuilder.getConstraintsCount();
      ConstraintProto.Builder var7 = this.modelBuilder.addConstraintsBuilder();
      var7.setName(var6);
      var7.addEnforcementLiteral(var5);
      this.intervalBuilder = var7.getIntervalBuilder();
      this.intervalBuilder.setStart(var2);
      this.intervalBuilder.setSize(var3);
      this.intervalBuilder.setEnd(var4);
   }

   public String toString() {
      return this.modelBuilder.getConstraints(this.constraintIndex).toString();
   }

   public int getIndex() {
      return this.constraintIndex;
   }

   public IntervalConstraintProto.Builder getBuilder() {
      return this.intervalBuilder;
   }

   public String getName() {
      return this.modelBuilder.getConstraints(this.constraintIndex).getName();
   }
}
