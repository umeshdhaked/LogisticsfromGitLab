package com.google.ortools.constraintsolver;

import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;

public class RoutingModel {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;
   public static final int ROUTING_NOT_SOLVED = mainJNI.RoutingModel_ROUTING_NOT_SOLVED_get();
   public static final int ROUTING_SUCCESS = mainJNI.RoutingModel_ROUTING_SUCCESS_get();
   public static final int ROUTING_FAIL = mainJNI.RoutingModel_ROUTING_FAIL_get();
   public static final int ROUTING_FAIL_TIMEOUT = mainJNI.RoutingModel_ROUTING_FAIL_TIMEOUT_get();
   public static final int ROUTING_INVALID = mainJNI.RoutingModel_ROUTING_INVALID_get();
   public static final int PICKUP_AND_DELIVERY_NO_ORDER = mainJNI.RoutingModel_PICKUP_AND_DELIVERY_NO_ORDER_get();
   public static final int PICKUP_AND_DELIVERY_LIFO = mainJNI.RoutingModel_PICKUP_AND_DELIVERY_LIFO_get();
   public static final int PICKUP_AND_DELIVERY_FIFO = mainJNI.RoutingModel_PICKUP_AND_DELIVERY_FIFO_get();

   protected RoutingModel(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(RoutingModel var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_RoutingModel(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public static long getKNoPenalty() {
      return mainJNI.RoutingModel_kNoPenalty_get();
   }

   public static int getKNoDisjunction() {
      return mainJNI.RoutingModel_kNoDisjunction_get();
   }

   public static int getKNoDimension() {
      return mainJNI.RoutingModel_kNoDimension_get();
   }

   public RoutingModel(RoutingIndexManager var1) {
      this(mainJNI.new_RoutingModel__SWIG_0(RoutingIndexManager.getCPtr(var1), var1), true);
   }

   public RoutingModel(RoutingIndexManager var1, RoutingModelParameters var2) {
      this(mainJNI.new_RoutingModel__SWIG_1(RoutingIndexManager.getCPtr(var1), var1, var2.toByteArray()), true);
   }

   public int registerUnaryTransitCallback(LongUnaryOperator var1) {
      return mainJNI.RoutingModel_registerUnaryTransitCallback(this.swigCPtr, this, var1);
   }

   public int RegisterPositiveUnaryTransitCallback(LongUnaryOperator var1) {
      return mainJNI.RoutingModel_RegisterPositiveUnaryTransitCallback(this.swigCPtr, this, var1);
   }

   public int registerTransitCallback(LongBinaryOperator var1) {
      return mainJNI.RoutingModel_registerTransitCallback(this.swigCPtr, this, var1);
   }

   public int registerPositiveTransitCallback(LongBinaryOperator var1) {
      return mainJNI.RoutingModel_registerPositiveTransitCallback(this.swigCPtr, this, var1);
   }

   public boolean addDimension(int var1, long var2, long var4, boolean var6, String var7) {
      return mainJNI.RoutingModel_addDimension(this.swigCPtr, this, var1, var2, var4, var6, var7);
   }

   public boolean addDimensionWithVehicleTransits(int[] var1, long var2, long var4, boolean var6, String var7) {
      return mainJNI.RoutingModel_addDimensionWithVehicleTransits(this.swigCPtr, this, var1, var2, var4, var6, var7);
   }

   public boolean addDimensionWithVehicleCapacity(int var1, long var2, long[] var4, boolean var5, String var6) {
      return mainJNI.RoutingModel_addDimensionWithVehicleCapacity(this.swigCPtr, this, var1, var2, var4, var5, var6);
   }

   public boolean addDimensionWithVehicleTransitAndCapacity(int[] var1, long var2, long[] var4, boolean var5, String var6) {
      return mainJNI.RoutingModel_addDimensionWithVehicleTransitAndCapacity(this.swigCPtr, this, var1, var2, var4, var5, var6);
   }

   public boolean addConstantDimensionWithSlack(long var1, long var3, long var5, boolean var7, String var8) {
      return mainJNI.RoutingModel_addConstantDimensionWithSlack(this.swigCPtr, this, var1, var3, var5, var7, var8);
   }

   public boolean addConstantDimension(long var1, long var3, boolean var5, String var6) {
      return mainJNI.RoutingModel_addConstantDimension(this.swigCPtr, this, var1, var3, var5, var6);
   }

   public boolean addVectorDimension(long[] var1, long var2, boolean var4, String var5) {
      return mainJNI.RoutingModel_addVectorDimension(this.swigCPtr, this, var1, var2, var4, var5);
   }

   public Constraint MakePathSpansAndTotalSlacks(RoutingDimension var1, IntVar[] var2, IntVar[] var3) {
      long var4 = mainJNI.RoutingModel_MakePathSpansAndTotalSlacks(this.swigCPtr, this, RoutingDimension.getCPtr(var1), var1, var2, var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public SWIGTYPE_p_std__vectorT_std__unique_ptrT_operations_research__GlobalDimensionCumulOptimizer_t_t GetGlobalDimensionCumulOptimizers() {
      return new SWIGTYPE_p_std__vectorT_std__unique_ptrT_operations_research__GlobalDimensionCumulOptimizer_t_t(mainJNI.RoutingModel_GetGlobalDimensionCumulOptimizers(this.swigCPtr, this), false);
   }

   public SWIGTYPE_p_std__vectorT_std__unique_ptrT_operations_research__LocalDimensionCumulOptimizer_t_t GetLocalDimensionCumulOptimizers() {
      return new SWIGTYPE_p_std__vectorT_std__unique_ptrT_operations_research__LocalDimensionCumulOptimizer_t_t(mainJNI.RoutingModel_GetLocalDimensionCumulOptimizers(this.swigCPtr, this), false);
   }

   public SWIGTYPE_p_operations_research__GlobalDimensionCumulOptimizer GetMutableGlobalCumulOptimizer(RoutingDimension var1) {
      long var2 = mainJNI.RoutingModel_GetMutableGlobalCumulOptimizer(this.swigCPtr, this, RoutingDimension.getCPtr(var1), var1);
      return var2 == 0L ? null : new SWIGTYPE_p_operations_research__GlobalDimensionCumulOptimizer(var2, false);
   }

   public SWIGTYPE_p_operations_research__LocalDimensionCumulOptimizer GetMutableLocalCumulOptimizer(RoutingDimension var1) {
      long var2 = mainJNI.RoutingModel_GetMutableLocalCumulOptimizer(this.swigCPtr, this, RoutingDimension.getCPtr(var1), var1);
      return var2 == 0L ? null : new SWIGTYPE_p_operations_research__LocalDimensionCumulOptimizer(var2, false);
   }

   public boolean hasDimension(String var1) {
      return mainJNI.RoutingModel_hasDimension(this.swigCPtr, this, var1);
   }

   public RoutingDimension getDimensionOrDie(String var1) {
      return new RoutingDimension(mainJNI.RoutingModel_getDimensionOrDie(this.swigCPtr, this, var1), false);
   }

   public RoutingDimension getMutableDimension(String var1) {
      long var2 = mainJNI.RoutingModel_getMutableDimension(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new RoutingDimension(var2, false);
   }

   public void setPrimaryConstrainedDimension(String var1) {
      mainJNI.RoutingModel_setPrimaryConstrainedDimension(this.swigCPtr, this, var1);
   }

   public String getPrimaryConstrainedDimension() {
      return mainJNI.RoutingModel_getPrimaryConstrainedDimension(this.swigCPtr, this);
   }

   public int addDisjunction(long[] var1, long var2, long var4) {
      return mainJNI.RoutingModel_addDisjunction__SWIG_0(this.swigCPtr, this, var1, var2, var4);
   }

   public int addDisjunction(long[] var1, long var2) {
      return mainJNI.RoutingModel_addDisjunction__SWIG_1(this.swigCPtr, this, var1, var2);
   }

   public int addDisjunction(long[] var1) {
      return mainJNI.RoutingModel_addDisjunction__SWIG_2(this.swigCPtr, this, var1);
   }

   public int[] getDisjunctionIndices(long var1) {
      return mainJNI.RoutingModel_getDisjunctionIndices__SWIG_0(this.swigCPtr, this, var1);
   }

   public long[] getDisjunctionIndices(int var1) {
      return mainJNI.RoutingModel_getDisjunctionIndices__SWIG_1(this.swigCPtr, this, var1);
   }

   public long getDisjunctionPenalty(int var1) {
      return mainJNI.RoutingModel_getDisjunctionPenalty(this.swigCPtr, this, var1);
   }

   public long getDisjunctionMaxCardinality(int var1) {
      return mainJNI.RoutingModel_getDisjunctionMaxCardinality(this.swigCPtr, this, var1);
   }

   public int getNumberOfDisjunctions() {
      return mainJNI.RoutingModel_getNumberOfDisjunctions(this.swigCPtr, this);
   }

   public void ignoreDisjunctionsAlreadyForcedToZero() {
      mainJNI.RoutingModel_ignoreDisjunctionsAlreadyForcedToZero(this.swigCPtr, this);
   }

   public void addSoftSameVehicleConstraint(long[] var1, long var2) {
      mainJNI.RoutingModel_addSoftSameVehicleConstraint(this.swigCPtr, this, var1, var2);
   }

   public void setAllowedVehiclesForIndex(int[] var1, long var2) {
      mainJNI.RoutingModel_setAllowedVehiclesForIndex(this.swigCPtr, this, var1, var2);
   }

   public boolean isVehicleAllowedForIndex(int var1, long var2) {
      return mainJNI.RoutingModel_isVehicleAllowedForIndex(this.swigCPtr, this, var1, var2);
   }

   public void addPickupAndDelivery(long var1, long var3) {
      mainJNI.RoutingModel_addPickupAndDelivery(this.swigCPtr, this, var1, var3);
   }

   public void addPickupAndDeliverySets(int var1, int var2) {
      mainJNI.RoutingModel_addPickupAndDeliverySets(this.swigCPtr, this, var1, var2);
   }

   public void setPickupAndDeliveryPolicyOfAllVehicles(int var1) {
      mainJNI.RoutingModel_setPickupAndDeliveryPolicyOfAllVehicles(this.swigCPtr, this, var1);
   }

   public void setPickupAndDeliveryPolicyOfVehicle(int var1, int var2) {
      mainJNI.RoutingModel_setPickupAndDeliveryPolicyOfVehicle(this.swigCPtr, this, var1, var2);
   }

   public int getPickupAndDeliveryPolicyOfVehicle(int var1) {
      return mainJNI.RoutingModel_getPickupAndDeliveryPolicyOfVehicle(this.swigCPtr, this, var1);
   }

   public int getNumOfSingletonNodes() {
      return mainJNI.RoutingModel_getNumOfSingletonNodes(this.swigCPtr, this);
   }

   public void setVisitType(long var1, int var3) {
      mainJNI.RoutingModel_setVisitType(this.swigCPtr, this, var1, var3);
   }

   public int getVisitType(long var1) {
      return mainJNI.RoutingModel_getVisitType(this.swigCPtr, this, var1);
   }

   public int getNumberOfVisitTypes() {
      return mainJNI.RoutingModel_getNumberOfVisitTypes(this.swigCPtr, this);
   }

   public long unperformedPenalty(long var1) {
      return mainJNI.RoutingModel_unperformedPenalty(this.swigCPtr, this, var1);
   }

   public long unperformedPenaltyOrValue(long var1, long var3) {
      return mainJNI.RoutingModel_unperformedPenaltyOrValue(this.swigCPtr, this, var1, var3);
   }

   public long getDepot() {
      return mainJNI.RoutingModel_getDepot(this.swigCPtr, this);
   }

   public void setArcCostEvaluatorOfAllVehicles(int var1) {
      mainJNI.RoutingModel_setArcCostEvaluatorOfAllVehicles(this.swigCPtr, this, var1);
   }

   public void setArcCostEvaluatorOfVehicle(int var1, int var2) {
      mainJNI.RoutingModel_setArcCostEvaluatorOfVehicle(this.swigCPtr, this, var1, var2);
   }

   public void setFixedCostOfAllVehicles(long var1) {
      mainJNI.RoutingModel_setFixedCostOfAllVehicles(this.swigCPtr, this, var1);
   }

   public void setFixedCostOfVehicle(long var1, int var3) {
      mainJNI.RoutingModel_setFixedCostOfVehicle(this.swigCPtr, this, var1, var3);
   }

   public long getFixedCostOfVehicle(int var1) {
      return mainJNI.RoutingModel_getFixedCostOfVehicle(this.swigCPtr, this, var1);
   }

   public void setAmortizedCostFactorsOfAllVehicles(long var1, long var3) {
      mainJNI.RoutingModel_setAmortizedCostFactorsOfAllVehicles(this.swigCPtr, this, var1, var3);
   }

   public void setAmortizedCostFactorsOfVehicle(long var1, long var3, int var5) {
      mainJNI.RoutingModel_setAmortizedCostFactorsOfVehicle(this.swigCPtr, this, var1, var3, var5);
   }

   public long[] getAmortizedLinearCostFactorOfVehicles() {
      return mainJNI.RoutingModel_getAmortizedLinearCostFactorOfVehicles(this.swigCPtr, this);
   }

   public long[] getAmortizedQuadraticCostFactorOfVehicles() {
      return mainJNI.RoutingModel_getAmortizedQuadraticCostFactorOfVehicles(this.swigCPtr, this);
   }

   public void ConsiderEmptyRouteCostsForVehicle(boolean var1, int var2) {
      mainJNI.RoutingModel_ConsiderEmptyRouteCostsForVehicle(this.swigCPtr, this, var1, var2);
   }

   public boolean AreEmptyRouteCostsConsideredForVehicle(int var1) {
      return mainJNI.RoutingModel_AreEmptyRouteCostsConsideredForVehicle(this.swigCPtr, this, var1);
   }

   public void setFirstSolutionEvaluator(LongBinaryOperator var1) {
      mainJNI.RoutingModel_setFirstSolutionEvaluator(this.swigCPtr, this, var1);
   }

   public void addLocalSearchOperator(LocalSearchOperator var1) {
      mainJNI.RoutingModel_addLocalSearchOperator(this.swigCPtr, this, LocalSearchOperator.getCPtr(var1), var1);
   }

   public void addSearchMonitor(SearchMonitor var1) {
      mainJNI.RoutingModel_addSearchMonitor(this.swigCPtr, this, SearchMonitor.getCPtr(var1), var1);
   }

   public void addAtSolutionCallback(Runnable var1) {
      mainJNI.RoutingModel_addAtSolutionCallback(this.swigCPtr, this, var1);
   }

   public void addVariableMinimizedByFinalizer(IntVar var1) {
      mainJNI.RoutingModel_addVariableMinimizedByFinalizer(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void addVariableMaximizedByFinalizer(IntVar var1) {
      mainJNI.RoutingModel_addVariableMaximizedByFinalizer(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void AddWeightedVariableMinimizedByFinalizer(IntVar var1, long var2) {
      mainJNI.RoutingModel_AddWeightedVariableMinimizedByFinalizer(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void AddVariableTargetToFinalizer(IntVar var1, long var2) {
      mainJNI.RoutingModel_AddVariableTargetToFinalizer(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void closeModel() {
      mainJNI.RoutingModel_closeModel(this.swigCPtr, this);
   }

   public void closeModelWithParameters(RoutingSearchParameters var1) {
      mainJNI.RoutingModel_closeModelWithParameters(this.swigCPtr, this, var1.toByteArray());
   }

   public Assignment solve(Assignment var1) {
      long var2 = mainJNI.RoutingModel_solve__SWIG_0(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      return var2 == 0L ? null : new Assignment(var2, false);
   }

   public Assignment solve() {
      long var1 = mainJNI.RoutingModel_solve__SWIG_1(this.swigCPtr, this);
      return var1 == 0L ? null : new Assignment(var1, false);
   }

   public Assignment solveWithParameters(RoutingSearchParameters var1) {
      long var2 = mainJNI.RoutingModel_solveWithParameters(this.swigCPtr, this, var1.toByteArray());
      return var2 == 0L ? null : new Assignment(var2, false);
   }

   public Assignment solveFromAssignmentWithParameters(Assignment var1, RoutingSearchParameters var2) {
      long var3 = mainJNI.RoutingModel_solveFromAssignmentWithParameters(this.swigCPtr, this, Assignment.getCPtr(var1), var1, var2.toByteArray());
      return var3 == 0L ? null : new Assignment(var3, false);
   }

   public void setAssignmentFromOtherModelAssignment(Assignment var1, RoutingModel var2, Assignment var3) {
      mainJNI.RoutingModel_setAssignmentFromOtherModelAssignment(this.swigCPtr, this, Assignment.getCPtr(var1), var1, getCPtr(var2), var2, Assignment.getCPtr(var3), var3);
   }

   public long computeLowerBound() {
      return mainJNI.RoutingModel_computeLowerBound(this.swigCPtr, this);
   }

   public int status() {
      return mainJNI.RoutingModel_status(this.swigCPtr, this);
   }

   public IntVar applyLocks(long[] var1) {
      long var2 = mainJNI.RoutingModel_applyLocks(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVar(var2, false);
   }

   public boolean applyLocksToAllVehicles(long[][] var1, boolean var2) {
      return mainJNI.RoutingModel_applyLocksToAllVehicles(this.swigCPtr, this, var1, var2);
   }

   public Assignment preAssignment() {
      long var1 = mainJNI.RoutingModel_preAssignment(this.swigCPtr, this);
      return var1 == 0L ? null : new Assignment(var1, false);
   }

   public Assignment mutablePreAssignment() {
      long var1 = mainJNI.RoutingModel_mutablePreAssignment(this.swigCPtr, this);
      return var1 == 0L ? null : new Assignment(var1, false);
   }

   public boolean writeAssignment(String var1) {
      return mainJNI.RoutingModel_writeAssignment(this.swigCPtr, this, var1);
   }

   public Assignment readAssignment(String var1) {
      long var2 = mainJNI.RoutingModel_readAssignment(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new Assignment(var2, false);
   }

   public Assignment restoreAssignment(Assignment var1) {
      long var2 = mainJNI.RoutingModel_restoreAssignment(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      return var2 == 0L ? null : new Assignment(var2, false);
   }

   public Assignment readAssignmentFromRoutes(long[][] var1, boolean var2) {
      long var3 = mainJNI.RoutingModel_readAssignmentFromRoutes(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Assignment(var3, false);
   }

   public boolean routesToAssignment(long[][] var1, boolean var2, boolean var3, Assignment var4) {
      return mainJNI.RoutingModel_routesToAssignment(this.swigCPtr, this, var1, var2, var3, Assignment.getCPtr(var4), var4);
   }

   public void assignmentToRoutes(Assignment var1, long[][] var2) {
      mainJNI.RoutingModel_assignmentToRoutes(this.swigCPtr, this, Assignment.getCPtr(var1), var1, var2);
   }

   public Assignment compactAssignment(Assignment var1) {
      long var2 = mainJNI.RoutingModel_compactAssignment(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      return var2 == 0L ? null : new Assignment(var2, false);
   }

   public Assignment compactAndCheckAssignment(Assignment var1) {
      long var2 = mainJNI.RoutingModel_compactAndCheckAssignment(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      return var2 == 0L ? null : new Assignment(var2, false);
   }

   public void addToAssignment(IntVar var1) {
      mainJNI.RoutingModel_addToAssignment(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void addIntervalToAssignment(IntervalVar var1) {
      mainJNI.RoutingModel_addIntervalToAssignment(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public Assignment PackCumulsOfOptimizerDimensionsFromAssignment(Assignment var1, SWIGTYPE_p_absl__Duration var2) {
      long var3 = mainJNI.RoutingModel_PackCumulsOfOptimizerDimensionsFromAssignment(this.swigCPtr, this, Assignment.getCPtr(var1), var1, SWIGTYPE_p_absl__Duration.getCPtr(var2));
      return var3 == 0L ? null : new Assignment(var3, false);
   }

   public void addLocalSearchFilter(LocalSearchFilter var1) {
      mainJNI.RoutingModel_addLocalSearchFilter(this.swigCPtr, this, LocalSearchFilter.getCPtr(var1), var1);
   }

   public long start(int var1) {
      return mainJNI.RoutingModel_start(this.swigCPtr, this, var1);
   }

   public long end(int var1) {
      return mainJNI.RoutingModel_end(this.swigCPtr, this, var1);
   }

   public boolean isStart(long var1) {
      return mainJNI.RoutingModel_isStart(this.swigCPtr, this, var1);
   }

   public boolean isEnd(long var1) {
      return mainJNI.RoutingModel_isEnd(this.swigCPtr, this, var1);
   }

   public int VehicleIndex(int var1) {
      return mainJNI.RoutingModel_VehicleIndex(this.swigCPtr, this, var1);
   }

   public long next(Assignment var1, long var2) {
      return mainJNI.RoutingModel_next(this.swigCPtr, this, Assignment.getCPtr(var1), var1, var2);
   }

   public boolean isVehicleUsed(Assignment var1, int var2) {
      return mainJNI.RoutingModel_isVehicleUsed(this.swigCPtr, this, Assignment.getCPtr(var1), var1, var2);
   }

   public IntVar[] nexts() {
      return mainJNI.RoutingModel_nexts(this.swigCPtr, this);
   }

   public IntVar[] vehicleVars() {
      return mainJNI.RoutingModel_vehicleVars(this.swigCPtr, this);
   }

   public IntVar nextVar(long var1) {
      long var3 = mainJNI.RoutingModel_nextVar(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar activeVar(long var1) {
      long var3 = mainJNI.RoutingModel_activeVar(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar VehicleCostsConsideredVar(int var1) {
      long var2 = mainJNI.RoutingModel_VehicleCostsConsideredVar(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVar(var2, false);
   }

   public IntVar vehicleVar(long var1) {
      long var3 = mainJNI.RoutingModel_vehicleVar(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar costVar() {
      long var1 = mainJNI.RoutingModel_costVar(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVar(var1, false);
   }

   public long getArcCostForVehicle(long var1, long var3, long var5) {
      return mainJNI.RoutingModel_getArcCostForVehicle(this.swigCPtr, this, var1, var3, var5);
   }

   public boolean costsAreHomogeneousAcrossVehicles() {
      return mainJNI.RoutingModel_costsAreHomogeneousAcrossVehicles(this.swigCPtr, this);
   }

   public long getHomogeneousCost(long var1, long var3) {
      return mainJNI.RoutingModel_getHomogeneousCost(this.swigCPtr, this, var1, var3);
   }

   public long getArcCostForFirstSolution(long var1, long var3) {
      return mainJNI.RoutingModel_getArcCostForFirstSolution(this.swigCPtr, this, var1, var3);
   }

   public long getArcCostForClass(long var1, long var3, long var5) {
      return mainJNI.RoutingModel_getArcCostForClass(this.swigCPtr, this, var1, var3, var5);
   }

   public int getCostClassIndexOfVehicle(long var1) {
      return mainJNI.RoutingModel_getCostClassIndexOfVehicle(this.swigCPtr, this, var1);
   }

   public boolean hasVehicleWithCostClassIndex(int var1) {
      return mainJNI.RoutingModel_hasVehicleWithCostClassIndex(this.swigCPtr, this, var1);
   }

   public int getCostClassesCount() {
      return mainJNI.RoutingModel_getCostClassesCount(this.swigCPtr, this);
   }

   public int getNonZeroCostClassesCount() {
      return mainJNI.RoutingModel_getNonZeroCostClassesCount(this.swigCPtr, this);
   }

   public int getVehicleClassIndexOfVehicle(long var1) {
      return mainJNI.RoutingModel_getVehicleClassIndexOfVehicle(this.swigCPtr, this, var1);
   }

   public int getVehicleClassesCount() {
      return mainJNI.RoutingModel_getVehicleClassesCount(this.swigCPtr, this);
   }

   public int[] getSameVehicleIndicesOfIndex(int var1) {
      return mainJNI.RoutingModel_getSameVehicleIndicesOfIndex(this.swigCPtr, this, var1);
   }

   public boolean arcIsMoreConstrainedThanArc(long var1, long var3, long var5) {
      return mainJNI.RoutingModel_arcIsMoreConstrainedThanArc(this.swigCPtr, this, var1, var3, var5);
   }

   public String debugOutputAssignment(Assignment var1, String var2) {
      return mainJNI.RoutingModel_debugOutputAssignment(this.swigCPtr, this, Assignment.getCPtr(var1), var1, var2);
   }

   public Solver solver() {
      long var1 = mainJNI.RoutingModel_solver(this.swigCPtr, this);
      return var1 == 0L ? null : new Solver(var1, false);
   }

   public boolean checkLimit() {
      return mainJNI.RoutingModel_checkLimit(this.swigCPtr, this);
   }

   public SWIGTYPE_p_absl__Duration RemainingTime() {
      return new SWIGTYPE_p_absl__Duration(mainJNI.RoutingModel_RemainingTime(this.swigCPtr, this), true);
   }

   public int nodes() {
      return mainJNI.RoutingModel_nodes(this.swigCPtr, this);
   }

   public int vehicles() {
      return mainJNI.RoutingModel_vehicles(this.swigCPtr, this);
   }

   public long size() {
      return mainJNI.RoutingModel_size(this.swigCPtr, this);
   }

   public long getNumberOfDecisionsInFirstSolution(RoutingSearchParameters var1) {
      return mainJNI.RoutingModel_getNumberOfDecisionsInFirstSolution(this.swigCPtr, this, var1.toByteArray());
   }

   public long getNumberOfRejectsInFirstSolution(RoutingSearchParameters var1) {
      return mainJNI.RoutingModel_getNumberOfRejectsInFirstSolution(this.swigCPtr, this, var1.toByteArray());
   }

   public boolean isMatchingModel() {
      return mainJNI.RoutingModel_isMatchingModel(this.swigCPtr, this);
   }

   public DecisionBuilder makeGuidedSlackFinalizer(RoutingDimension var1, LongUnaryOperator var2) {
      long var3 = mainJNI.RoutingModel_makeGuidedSlackFinalizer(this.swigCPtr, this, RoutingDimension.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new DecisionBuilder(var3, false);
   }

   public DecisionBuilder makeSelfDependentDimensionFinalizer(RoutingDimension var1) {
      long var2 = mainJNI.RoutingModel_makeSelfDependentDimensionFinalizer(this.swigCPtr, this, RoutingDimension.getCPtr(var1), var1);
      return var2 == 0L ? null : new DecisionBuilder(var2, false);
   }

   public void addMatrixDimension(long[][] var1, long var2, boolean var4, String var5) {
      mainJNI.RoutingModel_addMatrixDimension(this.swigCPtr, this, var1, var2, var4, var5);
   }
}
