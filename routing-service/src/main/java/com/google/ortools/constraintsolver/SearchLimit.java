package com.google.ortools.constraintsolver;

public class SearchLimit extends SearchMonitor {
   private transient long swigCPtr;

   protected SearchLimit(long var1, boolean var3) {
      super(mainJNI.SearchLimit_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SearchLimit var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SearchLimit(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public boolean crossed() {
      return mainJNI.SearchLimit_crossed(this.swigCPtr, this);
   }

   public boolean check() {
      return mainJNI.SearchLimit_check(this.swigCPtr, this);
   }

   public void init() {
      mainJNI.SearchLimit_init(this.swigCPtr, this);
   }

   public void copy(SearchLimit var1) {
      mainJNI.SearchLimit_copy(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public SearchLimit makeClone() {
      long var1 = mainJNI.SearchLimit_makeClone(this.swigCPtr, this);
      return var1 == 0L ? null : new SearchLimit(var1, false);
   }

   public void enterSearch() {
      mainJNI.SearchLimit_enterSearch(this.swigCPtr, this);
   }

   public void beginNextDecision(DecisionBuilder var1) {
      mainJNI.SearchLimit_beginNextDecision(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1);
   }

   public void periodicCheck() {
      mainJNI.SearchLimit_periodicCheck(this.swigCPtr, this);
   }

   public void refuteDecision(Decision var1) {
      mainJNI.SearchLimit_refuteDecision(this.swigCPtr, this, Decision.getCPtr(var1), var1);
   }

   public String toString() {
      return mainJNI.SearchLimit_toString(this.swigCPtr, this);
   }
}
