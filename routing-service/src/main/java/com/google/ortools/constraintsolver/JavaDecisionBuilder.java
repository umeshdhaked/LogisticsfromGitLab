package com.google.ortools.constraintsolver;

public class JavaDecisionBuilder extends DecisionBuilder {
   public final Decision nextWrap(Solver var1) {
      try {
         return this.next(var1);
      } catch (Solver.FailException var3) {
         return var1.makeFailDecision();
      }
   }

   public Decision next(Solver var1) throws Solver.FailException {
      return null;
   }
}
