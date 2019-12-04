package com.google.ortools.constraintsolver;

public class SymmetryBreaker extends DecisionVisitor {
   private transient long swigCPtr;

   protected SymmetryBreaker(long var1, boolean var3) {
      super(mainJNI.SymmetryBreaker_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SymmetryBreaker var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SymmetryBreaker(this.swigCPtr);
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
      mainJNI.SymmetryBreaker_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.SymmetryBreaker_change_ownership(this, this.swigCPtr, true);
   }

   public SymmetryBreaker() {
      this(mainJNI.new_SymmetryBreaker(), true);
      mainJNI.SymmetryBreaker_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public void addIntegerVariableEqualValueClause(IntVar var1, long var2) {
      mainJNI.SymmetryBreaker_addIntegerVariableEqualValueClause(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void addIntegerVariableGreaterOrEqualValueClause(IntVar var1, long var2) {
      mainJNI.SymmetryBreaker_addIntegerVariableGreaterOrEqualValueClause(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void addIntegerVariableLessOrEqualValueClause(IntVar var1, long var2) {
      mainJNI.SymmetryBreaker_addIntegerVariableLessOrEqualValueClause(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }
}
