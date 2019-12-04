package com.google.ortools.sat;

import com.google.ortools.util.Domain;

public final class CpModel {
   private final CpModelProto.Builder modelBuilder = CpModelProto.newBuilder();

   public IntVar newIntVar(long var1, long var3, String var5) {
      return new IntVar(this.modelBuilder, new Domain(var1, var3), var5);
   }

   public IntVar newIntVarFromDomain(Domain var1, String var2) {
      return new IntVar(this.modelBuilder, var1, var2);
   }

   public IntVar newBoolVar(String var1) {
      return new IntVar(this.modelBuilder, new Domain(0L, 1L), var1);
   }

   public IntVar newConstant(long var1) {
      return new IntVar(this.modelBuilder, new Domain(var1), "");
   }

   public Constraint addBoolOr(Literal[] var1) {
      Constraint var2 = new Constraint(this.modelBuilder);
      BoolArgumentProto.Builder var3 = var2.getBuilder().getBoolOrBuilder();
      Literal[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         Literal var7 = var4[var6];
         var3.addLiterals(var7.getIndex());
      }

      return var2;
   }

   public Constraint addBoolAnd(Literal[] var1) {
      Constraint var2 = new Constraint(this.modelBuilder);
      BoolArgumentProto.Builder var3 = var2.getBuilder().getBoolAndBuilder();
      Literal[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         Literal var7 = var4[var6];
         var3.addLiterals(var7.getIndex());
      }

      return var2;
   }

   public Constraint addBoolXor(Literal[] var1) {
      Constraint var2 = new Constraint(this.modelBuilder);
      BoolArgumentProto.Builder var3 = var2.getBuilder().getBoolXorBuilder();
      Literal[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         Literal var7 = var4[var6];
         var3.addLiterals(var7.getIndex());
      }

      return var2;
   }

   public Constraint addImplication(Literal var1, Literal var2) {
      return this.addBoolOr(new Literal[]{var1.not(), var2});
   }

   public Constraint addLinearExpressionInDomain(LinearExpr var1, Domain var2) {
      Constraint var3 = new Constraint(this.modelBuilder);
      LinearConstraintProto.Builder var4 = var3.getBuilder().getLinearBuilder();

      for(int var5 = 0; var5 < var1.numElements(); ++var5) {
         var4.addVars(var1.getVariable(var5).getIndex());
         var4.addCoeffs(var1.getCoefficient(var5));
      }

      long[] var10 = var2.flattenedIntervals();
      int var6 = var10.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         long var8 = var10[var7];
         var4.addDomain(var8);
      }

      return var3;
   }

   public Constraint addLinearConstraint(LinearExpr var1, long var2, long var4) {
      return this.addLinearExpressionInDomain(var1, new Domain(var2, var4));
   }

   public Constraint addEquality(LinearExpr var1, long var2) {
      return this.addLinearExpressionInDomain(var1, new Domain(var2));
   }

   public Constraint addEquality(LinearExpr var1, LinearExpr var2) {
      return this.addLinearExpressionInDomain(new Difference(var1, var2), new Domain(0L));
   }

   public Constraint addEqualityWithOffset(LinearExpr var1, LinearExpr var2, long var3) {
      return this.addLinearExpressionInDomain(new Difference(var1, var2), new Domain(-var3));
   }

   public Constraint addLessOrEqual(LinearExpr var1, long var2) {
      return this.addLinearExpressionInDomain(var1, new Domain(Long.MIN_VALUE, var2));
   }

   public Constraint addLessOrEqual(LinearExpr var1, LinearExpr var2) {
      return this.addLinearExpressionInDomain(new Difference(var1, var2), new Domain(Long.MIN_VALUE, 0L));
   }

   public Constraint addLessThan(LinearExpr var1, long var2) {
      return this.addLinearExpressionInDomain(var1, new Domain(Long.MIN_VALUE, var2 - 1L));
   }

   public Constraint addLessThan(LinearExpr var1, LinearExpr var2) {
      return this.addLinearExpressionInDomain(new Difference(var1, var2), new Domain(Long.MIN_VALUE, -1L));
   }

   public Constraint addLessOrEqualWithOffset(LinearExpr var1, LinearExpr var2, long var3) {
      return this.addLinearExpressionInDomain(new Difference(var1, var2), new Domain(Long.MIN_VALUE, -var3));
   }

   public Constraint addGreaterOrEqual(LinearExpr var1, long var2) {
      return this.addLinearExpressionInDomain(var1, new Domain(var2, Long.MAX_VALUE));
   }

   public Constraint addGreaterOrEqual(LinearExpr var1, LinearExpr var2) {
      return this.addLinearExpressionInDomain(new Difference(var1, var2), new Domain(0L, Long.MAX_VALUE));
   }

   public Constraint addGreaterThan(LinearExpr var1, long var2) {
      return this.addLinearExpressionInDomain(var1, new Domain(var2 + 1L, Long.MAX_VALUE));
   }

   public Constraint addGreaterThan(LinearExpr var1, LinearExpr var2) {
      return this.addLinearExpressionInDomain(new Difference(var1, var2), new Domain(1L, Long.MAX_VALUE));
   }

   public Constraint addGreaterOrEqualWithOffset(LinearExpr var1, LinearExpr var2, long var3) {
      return this.addLinearExpressionInDomain(new Difference(var1, var2), new Domain(-var3, Long.MAX_VALUE));
   }

   public Constraint addDifferent(LinearExpr var1, long var2) {
      return this.addLinearExpressionInDomain(var1, Domain.fromFlatIntervals(new long[]{Long.MIN_VALUE, var2 - 1L, var2 + 1L, Long.MAX_VALUE}));
   }

   public Constraint addDifferent(IntVar var1, IntVar var2) {
      return this.addLinearExpressionInDomain(new Difference(var1, var2), Domain.fromFlatIntervals(new long[]{Long.MIN_VALUE, -1L, 1L, Long.MAX_VALUE}));
   }

   public Constraint addDifferentWithOffset(IntVar var1, IntVar var2, long var3) {
      return this.addLinearExpressionInDomain(new Difference(var1, var2), Domain.fromFlatIntervals(new long[]{Long.MIN_VALUE, -var3 - 1L, -var3 + 1L, Long.MAX_VALUE}));
   }

   public Constraint addAllDifferent(IntVar[] var1) {
      Constraint var2 = new Constraint(this.modelBuilder);
      AllDifferentConstraintProto.Builder var3 = var2.getBuilder().getAllDiffBuilder();
      IntVar[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         IntVar var7 = var4[var6];
         var3.addVars(var7.getIndex());
      }

      return var2;
   }

   public Constraint addElement(IntVar var1, IntVar[] var2, IntVar var3) {
      Constraint var4 = new Constraint(this.modelBuilder);
      ElementConstraintProto.Builder var5 = var4.getBuilder().getElementBuilder();
      var5.setIndex(var1.getIndex());
      IntVar[] var6 = var2;
      int var7 = var2.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         IntVar var9 = var6[var8];
         var5.addVars(var9.getIndex());
      }

      var5.setTarget(var3.getIndex());
      return var4;
   }

   public Constraint addElement(IntVar var1, long[] var2, IntVar var3) {
      Constraint var4 = new Constraint(this.modelBuilder);
      ElementConstraintProto.Builder var5 = var4.getBuilder().getElementBuilder();
      var5.setIndex(var1.getIndex());
      long[] var6 = var2;
      int var7 = var2.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         long var9 = var6[var8];
         var5.addVars(this.indexFromConstant(var9));
      }

      var5.setTarget(var3.getIndex());
      return var4;
   }

   public Constraint addElement(IntVar var1, int[] var2, IntVar var3) {
      Constraint var4 = new Constraint(this.modelBuilder);
      ElementConstraintProto.Builder var5 = var4.getBuilder().getElementBuilder();
      var5.setIndex(var1.getIndex());
      int[] var6 = var2;
      int var7 = var2.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         long var9 = (long)var6[var8];
         var5.addVars(this.indexFromConstant(var9));
      }

      var5.setTarget(var3.getIndex());
      return var4;
   }

   public Constraint addCircuit(int[] var1, int[] var2, Literal[] var3) throws CpModel.MismatchedArrayLengths {
      if (var1.length != var2.length) {
         throw new CpModel.MismatchedArrayLengths("addCircuit", "tails", "heads");
      } else if (var1.length != var3.length) {
         throw new CpModel.MismatchedArrayLengths("addCircuit", "tails", "literals");
      } else {
         Constraint var4 = new Constraint(this.modelBuilder);
         CircuitConstraintProto.Builder var5 = var4.getBuilder().getCircuitBuilder();
         int[] var6 = var1;
         int var7 = var1.length;

         int var8;
         int var9;
         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var6[var8];
            var5.addTails(var9);
         }

         var6 = var2;
         var7 = var2.length;

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var6[var8];
            var5.addHeads(var9);
         }

         Literal[] var10 = var3;
         var7 = var3.length;

         for(var8 = 0; var8 < var7; ++var8) {
            Literal var11 = var10[var8];
            var5.addLiterals(var11.getIndex());
         }

         return var4;
      }
   }

   public Constraint addAllowedAssignments(IntVar[] var1, long[][] var2) throws CpModel.WrongLength {
      Constraint var3 = new Constraint(this.modelBuilder);
      TableConstraintProto.Builder var4 = var3.getBuilder().getTableBuilder();
      IntVar[] var5 = var1;
      int var6 = var1.length;

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         IntVar var8 = var5[var7];
         var4.addVars(var8.getIndex());
      }

      int var9 = var1.length;

      for(var6 = 0; var6 < var2.length; ++var6) {
         if (var2[var6].length != var9) {
            throw new CpModel.WrongLength("addAllowedAssignments", "tuple " + var6 + " does not have the same length as the variables");
         }

         for(var7 = 0; var7 < var2[var6].length; ++var7) {
            var4.addValues(var2[var6][var7]);
         }
      }

      return var3;
   }

   public Constraint addAllowedAssignments(IntVar[] var1, int[][] var2) throws CpModel.WrongLength {
      Constraint var3 = new Constraint(this.modelBuilder);
      TableConstraintProto.Builder var4 = var3.getBuilder().getTableBuilder();
      IntVar[] var5 = var1;
      int var6 = var1.length;

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         IntVar var8 = var5[var7];
         var4.addVars(var8.getIndex());
      }

      int var9 = var1.length;

      for(var6 = 0; var6 < var2.length; ++var6) {
         if (var2[var6].length != var9) {
            throw new CpModel.WrongLength("addAllowedAssignments", "tuple " + var6 + " does not have the same length as the variables");
         }

         for(var7 = 0; var7 < var2[var6].length; ++var7) {
            var4.addValues((long)var2[var6][var7]);
         }
      }

      return var3;
   }

   public Constraint addForbiddenAssignments(IntVar[] var1, long[][] var2) throws CpModel.WrongLength {
      Constraint var3 = this.addAllowedAssignments(var1, var2);
      var3.getBuilder().getTableBuilder().setNegated(true);
      return var3;
   }

   public Constraint addForbiddenAssignments(IntVar[] var1, int[][] var2) throws CpModel.WrongLength {
      Constraint var3 = this.addAllowedAssignments(var1, var2);
      var3.getBuilder().getTableBuilder().setNegated(true);
      return var3;
   }

   public Constraint addAutomaton(IntVar[] var1, long var2, long[] var4, long[][] var5) throws CpModel.WrongLength {
      Constraint var6 = new Constraint(this.modelBuilder);
      AutomatonConstraintProto.Builder var7 = var6.getBuilder().getAutomatonBuilder();
      IntVar[] var8 = var1;
      int var9 = var1.length;

      int var10;
      for(var10 = 0; var10 < var9; ++var10) {
         IntVar var11 = var8[var10];
         var7.addVars(var11.getIndex());
      }

      var7.setStartingState(var2);
      long[] var13 = var4;
      var9 = var4.length;

      for(var10 = 0; var10 < var9; ++var10) {
         long var15 = var13[var10];
         var7.addFinalStates(var15);
      }

      long[][] var14 = var5;
      var9 = var5.length;

      for(var10 = 0; var10 < var9; ++var10) {
         long[] var16 = var14[var10];
         if (var16.length != 3) {
            throw new CpModel.WrongLength("addAutomaton", "transition does not have length 3");
         }

         var7.addTransitionTail(var16[0]);
         var7.addTransitionLabel(var16[1]);
         var7.addTransitionHead(var16[2]);
      }

      return var6;
   }

   public Constraint addInverse(IntVar[] var1, IntVar[] var2) throws CpModel.MismatchedArrayLengths {
      if (var1.length != var2.length) {
         throw new CpModel.MismatchedArrayLengths("addInverse", "variables", "inverseVariables");
      } else {
         Constraint var3 = new Constraint(this.modelBuilder);
         InverseConstraintProto.Builder var4 = var3.getBuilder().getInverseBuilder();
         IntVar[] var5 = var1;
         int var6 = var1.length;

         int var7;
         IntVar var8;
         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var5[var7];
            var4.addFDirect(var8.getIndex());
         }

         var5 = var2;
         var6 = var2.length;

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var5[var7];
            var4.addFInverse(var8.getIndex());
         }

         return var3;
      }
   }

   public Constraint addReservoirConstraint(IntVar[] var1, long[] var2, long var3, long var5) throws CpModel.MismatchedArrayLengths {
      if (var1.length != var2.length) {
         throw new CpModel.MismatchedArrayLengths("addReservoirConstraint", "times", "demands");
      } else {
         Constraint var7 = new Constraint(this.modelBuilder);
         ReservoirConstraintProto.Builder var8 = var7.getBuilder().getReservoirBuilder();
         IntVar[] var9 = var1;
         int var10 = var1.length;

         int var11;
         for(var11 = 0; var11 < var10; ++var11) {
            IntVar var12 = var9[var11];
            var8.addTimes(var12.getIndex());
         }

         long[] var15 = var2;
         var10 = var2.length;

         for(var11 = 0; var11 < var10; ++var11) {
            long var14 = var15[var11];
            var8.addDemands(var14);
         }

         var8.setMinLevel(var3);
         var8.setMaxLevel(var5);
         return var7;
      }
   }

   public Constraint addReservoirConstraint(IntVar[] var1, int[] var2, long var3, long var5) throws CpModel.MismatchedArrayLengths {
      return this.addReservoirConstraint(var1, this.toLongArray(var2), var3, var5);
   }

   public Constraint addReservoirConstraintWithActive(IntVar[] var1, long[] var2, IntVar[] var3, long var4, long var6) throws CpModel.MismatchedArrayLengths {
      if (var1.length != var2.length) {
         throw new CpModel.MismatchedArrayLengths("addReservoirConstraint", "times", "demands");
      } else if (var1.length != var3.length) {
         throw new CpModel.MismatchedArrayLengths("addReservoirConstraint", "times", "actives");
      } else {
         Constraint var8 = new Constraint(this.modelBuilder);
         ReservoirConstraintProto.Builder var9 = var8.getBuilder().getReservoirBuilder();
         IntVar[] var10 = var1;
         int var11 = var1.length;

         int var12;
         IntVar var13;
         for(var12 = 0; var12 < var11; ++var12) {
            var13 = var10[var12];
            var9.addTimes(var13.getIndex());
         }

         long[] var15 = var2;
         var11 = var2.length;

         for(var12 = 0; var12 < var11; ++var12) {
            long var16 = var15[var12];
            var9.addDemands(var16);
         }

         var10 = var3;
         var11 = var3.length;

         for(var12 = 0; var12 < var11; ++var12) {
            var13 = var10[var12];
            var9.addActives(var13.getIndex());
         }

         var9.setMinLevel(var4);
         var9.setMaxLevel(var6);
         return var8;
      }
   }

   public Constraint addReservoirConstraintWithActive(IntVar[] var1, int[] var2, IntVar[] var3, long var4, long var6) throws CpModel.MismatchedArrayLengths {
      return this.addReservoirConstraintWithActive(var1, this.toLongArray(var2), var3, var4, var6);
   }

   public void addMapDomain(IntVar var1, Literal[] var2, long var3) {
      for(int var5 = 0; var5 < var2.length; ++var5) {
         this.addEquality(var1, var3 + (long)var5).onlyEnforceIf(var2[var5]);
         this.addDifferent(var1, var3 + (long)var5).onlyEnforceIf(var2[var5].not());
      }

   }

   public Constraint addMinEquality(IntVar var1, IntVar[] var2) {
      Constraint var3 = new Constraint(this.modelBuilder);
      IntegerArgumentProto.Builder var4 = var3.getBuilder().getIntMinBuilder();
      var4.setTarget(var1.getIndex());
      IntVar[] var5 = var2;
      int var6 = var2.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         IntVar var8 = var5[var7];
         var4.addVars(var8.getIndex());
      }

      return var3;
   }

   public Constraint addMaxEquality(IntVar var1, IntVar[] var2) {
      Constraint var3 = new Constraint(this.modelBuilder);
      IntegerArgumentProto.Builder var4 = var3.getBuilder().getIntMaxBuilder();
      var4.setTarget(var1.getIndex());
      IntVar[] var5 = var2;
      int var6 = var2.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         IntVar var8 = var5[var7];
         var4.addVars(var8.getIndex());
      }

      return var3;
   }

   public Constraint addDivisionEquality(IntVar var1, IntVar var2, IntVar var3) {
      Constraint var4 = new Constraint(this.modelBuilder);
      IntegerArgumentProto.Builder var5 = var4.getBuilder().getIntDivBuilder();
      var5.setTarget(var1.getIndex());
      var5.addVars(var2.getIndex());
      var5.addVars(var3.getIndex());
      return var4;
   }

   public Constraint addAbsEquality(IntVar var1, IntVar var2) {
      Constraint var3 = new Constraint(this.modelBuilder);
      IntegerArgumentProto.Builder var4 = var3.getBuilder().getIntMaxBuilder();
      var4.setTarget(var1.getIndex());
      var4.addVars(var2.getIndex());
      var4.addVars(-var2.getIndex() - 1);
      return var3;
   }

   public Constraint addModuloEquality(IntVar var1, IntVar var2, IntVar var3) {
      Constraint var4 = new Constraint(this.modelBuilder);
      IntegerArgumentProto.Builder var5 = var4.getBuilder().getIntModBuilder();
      var5.setTarget(var1.getIndex());
      var5.addVars(var2.getIndex());
      var5.addVars(var3.getIndex());
      return var4;
   }

   public Constraint addModuloEquality(IntVar var1, IntVar var2, long var3) {
      Constraint var5 = new Constraint(this.modelBuilder);
      IntegerArgumentProto.Builder var6 = var5.getBuilder().getIntModBuilder();
      var6.setTarget(var1.getIndex());
      var6.addVars(var2.getIndex());
      var6.addVars(this.indexFromConstant(var3));
      return var5;
   }

   public Constraint addProductEquality(IntVar var1, IntVar[] var2) {
      Constraint var3 = new Constraint(this.modelBuilder);
      IntegerArgumentProto.Builder var4 = var3.getBuilder().getIntProdBuilder();
      var4.setTarget(var1.getIndex());
      IntVar[] var5 = var2;
      int var6 = var2.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         IntVar var8 = var5[var7];
         var4.addVars(var8.getIndex());
      }

      return var3;
   }

   public IntervalVar newIntervalVar(IntVar var1, IntVar var2, IntVar var3, String var4) {
      return new IntervalVar(this.modelBuilder, var1.getIndex(), var2.getIndex(), var3.getIndex(), var4);
   }

   public IntervalVar newIntervalVar(IntVar var1, IntVar var2, long var3, String var5) {
      return new IntervalVar(this.modelBuilder, var1.getIndex(), var2.getIndex(), this.indexFromConstant(var3), var5);
   }

   public IntervalVar newIntervalVar(IntVar var1, long var2, IntVar var4, String var5) {
      return new IntervalVar(this.modelBuilder, var1.getIndex(), this.indexFromConstant(var2), var4.getIndex(), var5);
   }

   public IntervalVar newIntervalVar(long var1, IntVar var3, IntVar var4, String var5) {
      return new IntervalVar(this.modelBuilder, this.indexFromConstant(var1), var3.getIndex(), var4.getIndex(), var5);
   }

   public IntervalVar newFixedInterval(long var1, long var3, String var5) {
      return new IntervalVar(this.modelBuilder, this.indexFromConstant(var1), this.indexFromConstant(var3), this.indexFromConstant(var1 + var3), var5);
   }

   public IntervalVar newOptionalIntervalVar(IntVar var1, IntVar var2, IntVar var3, Literal var4, String var5) {
      return new IntervalVar(this.modelBuilder, var1.getIndex(), var2.getIndex(), var3.getIndex(), var4.getIndex(), var5);
   }

   public IntervalVar newOptionalIntervalVar(IntVar var1, IntVar var2, long var3, Literal var5, String var6) {
      return new IntervalVar(this.modelBuilder, var1.getIndex(), var2.getIndex(), this.indexFromConstant(var3), var5.getIndex(), var6);
   }

   public IntervalVar newOptionalIntervalVar(IntVar var1, long var2, IntVar var4, Literal var5, String var6) {
      return new IntervalVar(this.modelBuilder, var1.getIndex(), this.indexFromConstant(var2), var4.getIndex(), var5.getIndex(), var6);
   }

   public IntervalVar newOptionalIntervalVar(long var1, IntVar var3, IntVar var4, Literal var5, String var6) {
      return new IntervalVar(this.modelBuilder, this.indexFromConstant(var1), var3.getIndex(), var4.getIndex(), var5.getIndex(), var6);
   }

   public IntervalVar newOptionalFixedInterval(long var1, long var3, Literal var5, String var6) {
      return new IntervalVar(this.modelBuilder, this.indexFromConstant(var1), this.indexFromConstant(var3), this.indexFromConstant(var1 + var3), var5.getIndex(), var6);
   }

   public Constraint addNoOverlap(IntervalVar[] var1) {
      Constraint var2 = new Constraint(this.modelBuilder);
      NoOverlapConstraintProto.Builder var3 = var2.getBuilder().getNoOverlapBuilder();
      IntervalVar[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         IntervalVar var7 = var4[var6];
         var3.addIntervals(var7.getIndex());
      }

      return var2;
   }

   public Constraint addNoOverlap2D(IntervalVar[] var1, IntervalVar[] var2) {
      Constraint var3 = new Constraint(this.modelBuilder);
      NoOverlap2DConstraintProto.Builder var4 = var3.getBuilder().getNoOverlap2DBuilder();
      IntervalVar[] var5 = var1;
      int var6 = var1.length;

      int var7;
      IntervalVar var8;
      for(var7 = 0; var7 < var6; ++var7) {
         var8 = var5[var7];
         var4.addXIntervals(var8.getIndex());
      }

      var5 = var2;
      var6 = var2.length;

      for(var7 = 0; var7 < var6; ++var7) {
         var8 = var5[var7];
         var4.addYIntervals(var8.getIndex());
      }

      return var3;
   }

   public Constraint addCumulative(IntervalVar[] var1, IntVar[] var2, IntVar var3) {
      Constraint var4 = new Constraint(this.modelBuilder);
      CumulativeConstraintProto.Builder var5 = var4.getBuilder().getCumulativeBuilder();
      IntervalVar[] var6 = var1;
      int var7 = var1.length;

      int var8;
      for(var8 = 0; var8 < var7; ++var8) {
         IntervalVar var9 = var6[var8];
         var5.addIntervals(var9.getIndex());
      }

      IntVar[] var10 = var2;
      var7 = var2.length;

      for(var8 = 0; var8 < var7; ++var8) {
         IntVar var11 = var10[var8];
         var5.addDemands(var11.getIndex());
      }

      var5.setCapacity(var3.getIndex());
      return var4;
   }

   public Constraint addCumulative(IntervalVar[] var1, long[] var2, IntVar var3) {
      Constraint var4 = new Constraint(this.modelBuilder);
      CumulativeConstraintProto.Builder var5 = var4.getBuilder().getCumulativeBuilder();
      IntervalVar[] var6 = var1;
      int var7 = var1.length;

      int var8;
      for(var8 = 0; var8 < var7; ++var8) {
         IntervalVar var9 = var6[var8];
         var5.addIntervals(var9.getIndex());
      }

      long[] var11 = var2;
      var7 = var2.length;

      for(var8 = 0; var8 < var7; ++var8) {
         long var12 = var11[var8];
         var5.addDemands(this.indexFromConstant(var12));
      }

      var5.setCapacity(var3.getIndex());
      return var4;
   }

   public Constraint addCumulative(IntervalVar[] var1, int[] var2, IntVar var3) {
      return this.addCumulative(var1, this.toLongArray(var2), var3);
   }

   public Constraint addCumulative(IntervalVar[] var1, IntVar[] var2, long var3) {
      Constraint var5 = new Constraint(this.modelBuilder);
      CumulativeConstraintProto.Builder var6 = var5.getBuilder().getCumulativeBuilder();
      IntervalVar[] var7 = var1;
      int var8 = var1.length;

      int var9;
      for(var9 = 0; var9 < var8; ++var9) {
         IntervalVar var10 = var7[var9];
         var6.addIntervals(var10.getIndex());
      }

      IntVar[] var12 = var2;
      var8 = var2.length;

      for(var9 = 0; var9 < var8; ++var9) {
         IntVar var11 = var12[var9];
         var6.addDemands(var11.getIndex());
      }

      var6.setCapacity(this.indexFromConstant(var3));
      return var5;
   }

   public Constraint addCumulative(IntervalVar[] var1, long[] var2, long var3) {
      Constraint var5 = new Constraint(this.modelBuilder);
      CumulativeConstraintProto.Builder var6 = var5.getBuilder().getCumulativeBuilder();
      IntervalVar[] var7 = var1;
      int var8 = var1.length;

      int var9;
      for(var9 = 0; var9 < var8; ++var9) {
         IntervalVar var10 = var7[var9];
         var6.addIntervals(var10.getIndex());
      }

      long[] var13 = var2;
      var8 = var2.length;

      for(var9 = 0; var9 < var8; ++var9) {
         long var12 = var13[var9];
         var6.addDemands(this.indexFromConstant(var12));
      }

      var6.setCapacity(this.indexFromConstant(var3));
      return var5;
   }

   public Constraint addCumulative(IntervalVar[] var1, int[] var2, long var3) {
      return this.addCumulative(var1, this.toLongArray(var2), var3);
   }

   public void addHint(IntVar var1, long var2) {
      this.modelBuilder.getSolutionHintBuilder().addVars(var1.getIndex());
      this.modelBuilder.getSolutionHintBuilder().addValues(var2);
   }

   public void minimize(LinearExpr var1) {
      CpObjectiveProto.Builder var2 = this.modelBuilder.getObjectiveBuilder();

      for(int var3 = 0; var3 < var1.numElements(); ++var3) {
         var2.addVars(var1.getVariable(var3).getIndex());
         var2.addCoeffs(var1.getCoefficient(var3));
      }

   }

   public void maximize(LinearExpr var1) {
      CpObjectiveProto.Builder var2 = this.modelBuilder.getObjectiveBuilder();

      for(int var3 = 0; var3 < var1.numElements(); ++var3) {
         var2.addVars(var1.getVariable(var3).getIndex());
         var2.addCoeffs(-var1.getCoefficient(var3));
      }

      var2.setScalingFactor(-1.0D);
   }

   public void addDecisionStrategy(IntVar[] var1, DecisionStrategyProto.VariableSelectionStrategy var2, DecisionStrategyProto.DomainReductionStrategy var3) {
      DecisionStrategyProto.Builder var4 = this.modelBuilder.addSearchStrategyBuilder();
      IntVar[] var5 = var1;
      int var6 = var1.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         IntVar var8 = var5[var7];
         var4.addVariables(var8.getIndex());
      }

      var4.setVariableSelectionStrategy(var2);
      var4.setDomainReductionStrategy(var3);
   }

   public String modelStats() {
      return SatHelper.modelStats(this.model());
   }

   public String validate() {
      return SatHelper.validateModel(this.model());
   }

   long[] toLongArray(int[] var1) {
      long[] var2 = new long[var1.length];

      for(int var3 = 0; var3 < var1.length; ++var3) {
         var2[var3] = (long)var1[var3];
      }

      return var2;
   }

   int indexFromConstant(long var1) {
      int var3 = this.modelBuilder.getVariablesCount();
      IntegerVariableProto.Builder var4 = this.modelBuilder.addVariablesBuilder();
      var4.addDomain(var1);
      var4.addDomain(var1);
      return var3;
   }

   public CpModelProto model() {
      return this.modelBuilder.build();
   }

   public int negated(int var1) {
      return -var1 - 1;
   }

   public CpModelProto.Builder getBuilder() {
      return this.modelBuilder;
   }

   public static class WrongLength extends CpModel.CpModelException {
      public WrongLength(String var1, String var2) {
         super(var1, var2);
      }
   }

   public static class MismatchedArrayLengths extends CpModel.CpModelException {
      public MismatchedArrayLengths(String var1, String var2, String var3) {
         super(var1, var2 + " and " + var3 + " have mismatched lengths");
      }
   }

   static class CpModelException extends Exception {
      public CpModelException(String var1, String var2) {
         super("CpModel." + var1 + ": " + var2);
      }
   }
}
