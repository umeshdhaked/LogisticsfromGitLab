package com.google.ortools.constraintsolver;

import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

public class Pack extends Constraint {
   private transient long swigCPtr;

   protected Pack(long var1, boolean var3) {
      super(mainJNI.Pack_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(Pack var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_Pack(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public Pack(Solver var1, IntVar[] var2, int var3) {
      this(mainJNI.new_Pack(Solver.getCPtr(var1), var1, var2, var3), true);
   }

   public void addWeightedSumLessOrEqualConstantDimension(long[] var1, long[] var2) {
      mainJNI.Pack_addWeightedSumLessOrEqualConstantDimension__SWIG_0(this.swigCPtr, this, var1, var2);
   }

   public void addWeightedSumLessOrEqualConstantDimension(LongUnaryOperator var1, long[] var2) {
      mainJNI.Pack_addWeightedSumLessOrEqualConstantDimension__SWIG_1(this.swigCPtr, this, var1, var2);
   }

   public void addWeightedSumLessOrEqualConstantDimension(LongBinaryOperator var1, long[] var2) {
      mainJNI.Pack_addWeightedSumLessOrEqualConstantDimension__SWIG_2(this.swigCPtr, this, var1, var2);
   }

   public void addWeightedSumEqualVarDimension(long[] var1, IntVar[] var2) {
      mainJNI.Pack_addWeightedSumEqualVarDimension__SWIG_0(this.swigCPtr, this, var1, var2);
   }

   public void addWeightedSumEqualVarDimension(LongBinaryOperator var1, IntVar[] var2) {
      mainJNI.Pack_addWeightedSumEqualVarDimension__SWIG_1(this.swigCPtr, this, var1, var2);
   }

   public void addSumVariableWeightsLessOrEqualConstantDimension(IntVar[] var1, long[] var2) {
      mainJNI.Pack_addSumVariableWeightsLessOrEqualConstantDimension(this.swigCPtr, this, var1, var2);
   }

   public void addWeightedSumOfAssignedDimension(long[] var1, IntVar var2) {
      mainJNI.Pack_addWeightedSumOfAssignedDimension(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2);
   }

   public void addCountUsedBinDimension(IntVar var1) {
      mainJNI.Pack_addCountUsedBinDimension(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void addCountAssignedItemsDimension(IntVar var1) {
      mainJNI.Pack_addCountAssignedItemsDimension(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void post() {
      mainJNI.Pack_post(this.swigCPtr, this);
   }

   public void clearAll() {
      mainJNI.Pack_clearAll(this.swigCPtr, this);
   }

   public void propagateDelayed() {
      mainJNI.Pack_propagateDelayed(this.swigCPtr, this);
   }

   public void initialPropagate() {
      mainJNI.Pack_initialPropagate(this.swigCPtr, this);
   }

   public void propagate() {
      mainJNI.Pack_propagate(this.swigCPtr, this);
   }

   public void oneDomain(int var1) {
      mainJNI.Pack_oneDomain(this.swigCPtr, this, var1);
   }

   public String toString() {
      return mainJNI.Pack_toString(this.swigCPtr, this);
   }

   public boolean isUndecided(int var1, int var2) {
      return mainJNI.Pack_isUndecided(this.swigCPtr, this, var1, var2);
   }

   public void setImpossible(int var1, int var2) {
      mainJNI.Pack_setImpossible(this.swigCPtr, this, var1, var2);
   }

   public void assign(int var1, int var2) {
      mainJNI.Pack_assign(this.swigCPtr, this, var1, var2);
   }

   public boolean isAssignedStatusKnown(int var1) {
      return mainJNI.Pack_isAssignedStatusKnown(this.swigCPtr, this, var1);
   }

   public boolean isPossible(int var1, int var2) {
      return mainJNI.Pack_isPossible(this.swigCPtr, this, var1, var2);
   }

   public IntVar assignVar(int var1, int var2) {
      long var3 = mainJNI.Pack_assignVar(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public void setAssigned(int var1) {
      mainJNI.Pack_setAssigned(this.swigCPtr, this, var1);
   }

   public void setUnassigned(int var1) {
      mainJNI.Pack_setUnassigned(this.swigCPtr, this, var1);
   }

   public void removeAllPossibleFromBin(int var1) {
      mainJNI.Pack_removeAllPossibleFromBin(this.swigCPtr, this, var1);
   }

   public void assignAllPossibleToBin(int var1) {
      mainJNI.Pack_assignAllPossibleToBin(this.swigCPtr, this, var1);
   }

   public void assignFirstPossibleToBin(int var1) {
      mainJNI.Pack_assignFirstPossibleToBin(this.swigCPtr, this, var1);
   }

   public void assignAllRemainingItems() {
      mainJNI.Pack_assignAllRemainingItems(this.swigCPtr, this);
   }

   public void unassignAllRemainingItems() {
      mainJNI.Pack_unassignAllRemainingItems(this.swigCPtr, this);
   }

   public void accept(ModelVisitor var1) {
      mainJNI.Pack_accept(this.swigCPtr, this, ModelVisitor.getCPtr(var1), var1);
   }
}
