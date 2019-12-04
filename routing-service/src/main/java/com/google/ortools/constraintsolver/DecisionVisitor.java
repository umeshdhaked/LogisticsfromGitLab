package com.google.ortools.constraintsolver;

public class DecisionVisitor extends BaseObject {
   private transient long swigCPtr;

   protected DecisionVisitor(long var1, boolean var3) {
      super(mainJNI.DecisionVisitor_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(DecisionVisitor var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_DecisionVisitor(this.swigCPtr);
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
      mainJNI.DecisionVisitor_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.DecisionVisitor_change_ownership(this, this.swigCPtr, true);
   }

   public DecisionVisitor() {
      this(mainJNI.new_DecisionVisitor(), true);
      mainJNI.DecisionVisitor_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public void visitSetVariableValue(IntVar var1, long var2) {
      if (this.getClass() == DecisionVisitor.class) {
         mainJNI.DecisionVisitor_visitSetVariableValue(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      } else {
         mainJNI.DecisionVisitor_visitSetVariableValueSwigExplicitDecisionVisitor(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      }

   }

   public void visitSplitVariableDomain(IntVar var1, long var2, boolean var4) {
      if (this.getClass() == DecisionVisitor.class) {
         mainJNI.DecisionVisitor_visitSplitVariableDomain(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var4);
      } else {
         mainJNI.DecisionVisitor_visitSplitVariableDomainSwigExplicitDecisionVisitor(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var4);
      }

   }

   public void visitScheduleOrPostpone(IntervalVar var1, long var2) {
      if (this.getClass() == DecisionVisitor.class) {
         mainJNI.DecisionVisitor_visitScheduleOrPostpone(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
      } else {
         mainJNI.DecisionVisitor_visitScheduleOrPostponeSwigExplicitDecisionVisitor(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
      }

   }

   public void visitScheduleOrExpedite(IntervalVar var1, long var2) {
      if (this.getClass() == DecisionVisitor.class) {
         mainJNI.DecisionVisitor_visitScheduleOrExpedite(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
      } else {
         mainJNI.DecisionVisitor_visitScheduleOrExpediteSwigExplicitDecisionVisitor(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
      }

   }

   public void visitRankFirstInterval(SequenceVar var1, int var2) {
      if (this.getClass() == DecisionVisitor.class) {
         mainJNI.DecisionVisitor_visitRankFirstInterval(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
      } else {
         mainJNI.DecisionVisitor_visitRankFirstIntervalSwigExplicitDecisionVisitor(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
      }

   }

   public void visitRankLastInterval(SequenceVar var1, int var2) {
      if (this.getClass() == DecisionVisitor.class) {
         mainJNI.DecisionVisitor_visitRankLastInterval(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
      } else {
         mainJNI.DecisionVisitor_visitRankLastIntervalSwigExplicitDecisionVisitor(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
      }

   }

   public void visitUnknownDecision() {
      if (this.getClass() == DecisionVisitor.class) {
         mainJNI.DecisionVisitor_visitUnknownDecision(this.swigCPtr, this);
      } else {
         mainJNI.DecisionVisitor_visitUnknownDecisionSwigExplicitDecisionVisitor(this.swigCPtr, this);
      }

   }
}
