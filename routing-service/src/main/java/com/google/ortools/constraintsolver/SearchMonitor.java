package com.google.ortools.constraintsolver;

public class SearchMonitor extends BaseObject {
   private transient long swigCPtr;
   public static final int kNoProgress = mainJNI.SearchMonitor_kNoProgress_get();

   protected SearchMonitor(long var1, boolean var3) {
      super(mainJNI.SearchMonitor_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SearchMonitor var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SearchMonitor(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   protected void swigDirectorDisconnect() {
      this.swigCMemOwn = false;
      this.delete();
   }

   public void swigReleaseOwnership() {
      this.swigCMemOwn = false;
      mainJNI.SearchMonitor_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.SearchMonitor_change_ownership(this, this.swigCPtr, true);
   }

   public SearchMonitor(Solver var1) {
      this(mainJNI.new_SearchMonitor(Solver.getCPtr(var1), var1), true);
      mainJNI.SearchMonitor_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public void enterSearch() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_enterSearch(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_enterSearchSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }

   public void restartSearch() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_restartSearch(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_restartSearchSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }

   public void exitSearch() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_exitSearch(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_exitSearchSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }

   public void beginNextDecision(DecisionBuilder var1) {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_beginNextDecision(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1);
      } else {
         mainJNI.SearchMonitor_beginNextDecisionSwigExplicitSearchMonitor(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1);
      }

   }

   public void endNextDecision(DecisionBuilder var1, Decision var2) {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_endNextDecision(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, Decision.getCPtr(var2), var2);
      } else {
         mainJNI.SearchMonitor_endNextDecisionSwigExplicitSearchMonitor(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, Decision.getCPtr(var2), var2);
      }

   }

   public void applyDecision(Decision var1) {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_applyDecision(this.swigCPtr, this, Decision.getCPtr(var1), var1);
      } else {
         mainJNI.SearchMonitor_applyDecisionSwigExplicitSearchMonitor(this.swigCPtr, this, Decision.getCPtr(var1), var1);
      }

   }

   public void refuteDecision(Decision var1) {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_refuteDecision(this.swigCPtr, this, Decision.getCPtr(var1), var1);
      } else {
         mainJNI.SearchMonitor_refuteDecisionSwigExplicitSearchMonitor(this.swigCPtr, this, Decision.getCPtr(var1), var1);
      }

   }

   public void afterDecision(Decision var1, boolean var2) {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_afterDecision(this.swigCPtr, this, Decision.getCPtr(var1), var1, var2);
      } else {
         mainJNI.SearchMonitor_afterDecisionSwigExplicitSearchMonitor(this.swigCPtr, this, Decision.getCPtr(var1), var1, var2);
      }

   }

   public void beginFail() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_beginFail(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_beginFailSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }

   public void endFail() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_endFail(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_endFailSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }

   public void beginInitialPropagation() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_beginInitialPropagation(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_beginInitialPropagationSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }

   public void endInitialPropagation() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_endInitialPropagation(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_endInitialPropagationSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }

   public boolean acceptSolution() {
      return this.getClass() == SearchMonitor.class ? mainJNI.SearchMonitor_acceptSolution(this.swigCPtr, this) : mainJNI.SearchMonitor_acceptSolutionSwigExplicitSearchMonitor(this.swigCPtr, this);
   }

   public boolean atSolution() {
      return this.getClass() == SearchMonitor.class ? mainJNI.SearchMonitor_atSolution(this.swigCPtr, this) : mainJNI.SearchMonitor_atSolutionSwigExplicitSearchMonitor(this.swigCPtr, this);
   }

   public void noMoreSolutions() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_noMoreSolutions(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_noMoreSolutionsSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }

   public boolean localOptimum() {
      return this.getClass() == SearchMonitor.class ? mainJNI.SearchMonitor_localOptimum(this.swigCPtr, this) : mainJNI.SearchMonitor_localOptimumSwigExplicitSearchMonitor(this.swigCPtr, this);
   }

   public boolean acceptDelta(Assignment var1, Assignment var2) {
      return this.getClass() == SearchMonitor.class ? mainJNI.SearchMonitor_acceptDelta(this.swigCPtr, this, Assignment.getCPtr(var1), var1, Assignment.getCPtr(var2), var2) : mainJNI.SearchMonitor_acceptDeltaSwigExplicitSearchMonitor(this.swigCPtr, this, Assignment.getCPtr(var1), var1, Assignment.getCPtr(var2), var2);
   }

   public void acceptNeighbor() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_acceptNeighbor(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_acceptNeighborSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }

   public void AcceptUncheckedNeighbor() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_AcceptUncheckedNeighbor(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_AcceptUncheckedNeighborSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }

   public boolean IsUncheckedSolutionLimitReached() {
      return this.getClass() == SearchMonitor.class ? mainJNI.SearchMonitor_IsUncheckedSolutionLimitReached(this.swigCPtr, this) : mainJNI.SearchMonitor_IsUncheckedSolutionLimitReachedSwigExplicitSearchMonitor(this.swigCPtr, this);
   }

   public Solver solver() {
      long var1 = mainJNI.SearchMonitor_solver(this.swigCPtr, this);
      return var1 == 0L ? null : new Solver(var1, false);
   }

   public void periodicCheck() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_periodicCheck(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_periodicCheckSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }

   public int progressPercent() {
      return this.getClass() == SearchMonitor.class ? mainJNI.SearchMonitor_progressPercent(this.swigCPtr, this) : mainJNI.SearchMonitor_progressPercentSwigExplicitSearchMonitor(this.swigCPtr, this);
   }

   public void accept(ModelVisitor var1) {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_accept(this.swigCPtr, this, ModelVisitor.getCPtr(var1), var1);
      } else {
         mainJNI.SearchMonitor_acceptSwigExplicitSearchMonitor(this.swigCPtr, this, ModelVisitor.getCPtr(var1), var1);
      }

   }

   public void install() {
      if (this.getClass() == SearchMonitor.class) {
         mainJNI.SearchMonitor_install(this.swigCPtr, this);
      } else {
         mainJNI.SearchMonitor_installSwigExplicitSearchMonitor(this.swigCPtr, this);
      }

   }
}
