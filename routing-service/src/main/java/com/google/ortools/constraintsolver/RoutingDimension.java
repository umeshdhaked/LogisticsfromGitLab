package com.google.ortools.constraintsolver;

import java.util.function.LongBinaryOperator;

public class RoutingDimension {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected RoutingDimension(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(RoutingDimension var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_RoutingDimension(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public RoutingModel model() {
      long var1 = mainJNI.RoutingDimension_model(this.swigCPtr, this);
      return var1 == 0L ? null : new RoutingModel(var1, false);
   }

   public long getTransitValue(long var1, long var3, long var5) {
      return mainJNI.RoutingDimension_getTransitValue(this.swigCPtr, this, var1, var3, var5);
   }

   public long getTransitValueFromClass(long var1, long var3, long var5) {
      return mainJNI.RoutingDimension_getTransitValueFromClass(this.swigCPtr, this, var1, var3, var5);
   }

   public IntVar cumulVar(long var1) {
      long var3 = mainJNI.RoutingDimension_cumulVar(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar transitVar(long var1) {
      long var3 = mainJNI.RoutingDimension_transitVar(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar fixedTransitVar(long var1) {
      long var3 = mainJNI.RoutingDimension_fixedTransitVar(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar slackVar(long var1) {
      long var3 = mainJNI.RoutingDimension_slackVar(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar[] cumuls() {
      return mainJNI.RoutingDimension_cumuls(this.swigCPtr, this);
   }

   public IntVar[] fixed_transits() {
      return mainJNI.RoutingDimension_fixed_transits(this.swigCPtr, this);
   }

   public IntVar[] transits() {
      return mainJNI.RoutingDimension_transits(this.swigCPtr, this);
   }

   public IntVar[] slacks() {
      return mainJNI.RoutingDimension_slacks(this.swigCPtr, this);
   }

   public void setSpanUpperBoundForVehicle(long var1, int var3) {
      mainJNI.RoutingDimension_setSpanUpperBoundForVehicle(this.swigCPtr, this, var1, var3);
   }

   public void setSpanCostCoefficientForVehicle(long var1, int var3) {
      mainJNI.RoutingDimension_setSpanCostCoefficientForVehicle(this.swigCPtr, this, var1, var3);
   }

   public void setSpanCostCoefficientForAllVehicles(long var1) {
      mainJNI.RoutingDimension_setSpanCostCoefficientForAllVehicles(this.swigCPtr, this, var1);
   }

   public void setGlobalSpanCostCoefficient(long var1) {
      mainJNI.RoutingDimension_setGlobalSpanCostCoefficient(this.swigCPtr, this, var1);
   }

   public void setCumulVarSoftUpperBound(long var1, long var3, long var5) {
      mainJNI.RoutingDimension_setCumulVarSoftUpperBound(this.swigCPtr, this, var1, var3, var5);
   }

   public boolean hasCumulVarSoftUpperBound(long var1) {
      return mainJNI.RoutingDimension_hasCumulVarSoftUpperBound(this.swigCPtr, this, var1);
   }

   public long getCumulVarSoftUpperBound(long var1) {
      return mainJNI.RoutingDimension_getCumulVarSoftUpperBound(this.swigCPtr, this, var1);
   }

   public long getCumulVarSoftUpperBoundCoefficient(long var1) {
      return mainJNI.RoutingDimension_getCumulVarSoftUpperBoundCoefficient(this.swigCPtr, this, var1);
   }

   public void setCumulVarSoftLowerBound(long var1, long var3, long var5) {
      mainJNI.RoutingDimension_setCumulVarSoftLowerBound(this.swigCPtr, this, var1, var3, var5);
   }

   public boolean hasCumulVarSoftLowerBound(long var1) {
      return mainJNI.RoutingDimension_hasCumulVarSoftLowerBound(this.swigCPtr, this, var1);
   }

   public long getCumulVarSoftLowerBound(long var1) {
      return mainJNI.RoutingDimension_getCumulVarSoftLowerBound(this.swigCPtr, this, var1);
   }

   public long getCumulVarSoftLowerBoundCoefficient(long var1) {
      return mainJNI.RoutingDimension_getCumulVarSoftLowerBoundCoefficient(this.swigCPtr, this, var1);
   }

   public void setBreakIntervalsOfVehicle(IntervalVar[] var1, int var2, int var3, int var4) {
      mainJNI.RoutingDimension_setBreakIntervalsOfVehicle__SWIG_0(this.swigCPtr, this, var1, var2, var3, var4);
   }

   public void setBreakIntervalsOfVehicle(IntervalVar[] var1, int var2, long[] var3) {
      mainJNI.RoutingDimension_setBreakIntervalsOfVehicle__SWIG_1(this.swigCPtr, this, var1, var2, var3);
   }

   public void SetBreakDistanceDurationOfVehicle(long var1, long var3, int var5) {
      mainJNI.RoutingDimension_SetBreakDistanceDurationOfVehicle(this.swigCPtr, this, var1, var3, var5);
   }

   public void InitializeBreaks() {
      mainJNI.RoutingDimension_InitializeBreaks(this.swigCPtr, this);
   }

   public boolean HasBreakConstraints() {
      return mainJNI.RoutingDimension_HasBreakConstraints(this.swigCPtr, this);
   }

   public void setBreakIntervalsOfVehicle(IntervalVar[] var1, int var2, long[] var3, LongBinaryOperator var4) {
      mainJNI.RoutingDimension_setBreakIntervalsOfVehicle__SWIG_2(this.swigCPtr, this, var1, var2, var3, var4);
   }

   public IntervalVar[] getBreakIntervalsOfVehicle(int var1) {
      return mainJNI.RoutingDimension_getBreakIntervalsOfVehicle(this.swigCPtr, this, var1);
   }

   public SWIGTYPE_p_std__vectorT_std__pairT_long_long_long_long_t_t GetBreakDistanceDurationOfVehicle(int var1) {
      return new SWIGTYPE_p_std__vectorT_std__pairT_long_long_long_long_t_t(mainJNI.RoutingDimension_GetBreakDistanceDurationOfVehicle(this.swigCPtr, this, var1), false);
   }

   public int GetPreTravelEvaluatorOfVehicle(int var1) {
      return mainJNI.RoutingDimension_GetPreTravelEvaluatorOfVehicle(this.swigCPtr, this, var1);
   }

   public int GetPostTravelEvaluatorOfVehicle(int var1) {
      return mainJNI.RoutingDimension_GetPostTravelEvaluatorOfVehicle(this.swigCPtr, this, var1);
   }

   public RoutingDimension base_dimension() {
      long var1 = mainJNI.RoutingDimension_base_dimension(this.swigCPtr, this);
      return var1 == 0L ? null : new RoutingDimension(var1, false);
   }

   public long shortestTransitionSlack(long var1) {
      return mainJNI.RoutingDimension_shortestTransitionSlack(this.swigCPtr, this, var1);
   }

   public String name() {
      return mainJNI.RoutingDimension_name(this.swigCPtr, this);
   }

   public void setPickupToDeliveryLimitFunctionForPair(IntIntToLongFunction var1, int var2) {
      mainJNI.RoutingDimension_setPickupToDeliveryLimitFunctionForPair(this.swigCPtr, this, var1, var2);
   }

   public boolean hasPickupToDeliveryLimits() {
      return mainJNI.RoutingDimension_hasPickupToDeliveryLimits(this.swigCPtr, this);
   }

   public void addNodePrecedence(long var1, long var3, long var5) {
      mainJNI.RoutingDimension_addNodePrecedence(this.swigCPtr, this, var1, var3, var5);
   }

   public long getSpanUpperBoundForVehicle(int var1) {
      return mainJNI.RoutingDimension_getSpanUpperBoundForVehicle(this.swigCPtr, this, var1);
   }

   public long getSpanCostCoefficientForVehicle(int var1) {
      return mainJNI.RoutingDimension_getSpanCostCoefficientForVehicle(this.swigCPtr, this, var1);
   }

   public long getGlobalSpanCostCoefficient() {
      return mainJNI.RoutingDimension_getGlobalSpanCostCoefficient(this.swigCPtr, this);
   }

   public long GetGlobalOptimizerOffset() {
      return mainJNI.RoutingDimension_GetGlobalOptimizerOffset(this.swigCPtr, this);
   }

   public long GetLocalOptimizerOffsetForVehicle(int var1) {
      return mainJNI.RoutingDimension_GetLocalOptimizerOffsetForVehicle(this.swigCPtr, this, var1);
   }
}
