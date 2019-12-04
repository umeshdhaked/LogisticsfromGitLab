package com.google.ortools.constraintsolver;

public class DefaultPhaseParameters {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;
   public static final int CHOOSE_MAX_SUM_IMPACT = mainJNI.DefaultPhaseParameters_CHOOSE_MAX_SUM_IMPACT_get();
   public static final int CHOOSE_MAX_AVERAGE_IMPACT = mainJNI.DefaultPhaseParameters_CHOOSE_MAX_AVERAGE_IMPACT_get();
   public static final int CHOOSE_MAX_VALUE_IMPACT = mainJNI.DefaultPhaseParameters_CHOOSE_MAX_VALUE_IMPACT_get();
   public static final int SELECT_MIN_IMPACT = mainJNI.DefaultPhaseParameters_SELECT_MIN_IMPACT_get();
   public static final int SELECT_MAX_IMPACT = mainJNI.DefaultPhaseParameters_SELECT_MAX_IMPACT_get();
   public static final int NONE = mainJNI.DefaultPhaseParameters_NONE_get();
   public static final int NORMAL = mainJNI.DefaultPhaseParameters_NORMAL_get();
   public static final int VERBOSE = mainJNI.DefaultPhaseParameters_VERBOSE_get();

   protected DefaultPhaseParameters(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(DefaultPhaseParameters var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_DefaultPhaseParameters(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public void setVar_selection_schema(int var1) {
      mainJNI.DefaultPhaseParameters_var_selection_schema_set(this.swigCPtr, this, var1);
   }

   public int getVar_selection_schema() {
      return mainJNI.DefaultPhaseParameters_var_selection_schema_get(this.swigCPtr, this);
   }

   public void setValue_selection_schema(int var1) {
      mainJNI.DefaultPhaseParameters_value_selection_schema_set(this.swigCPtr, this, var1);
   }

   public int getValue_selection_schema() {
      return mainJNI.DefaultPhaseParameters_value_selection_schema_get(this.swigCPtr, this);
   }

   public void setInitialization_splits(int var1) {
      mainJNI.DefaultPhaseParameters_initialization_splits_set(this.swigCPtr, this, var1);
   }

   public int getInitialization_splits() {
      return mainJNI.DefaultPhaseParameters_initialization_splits_get(this.swigCPtr, this);
   }

   public void setRun_all_heuristics(boolean var1) {
      mainJNI.DefaultPhaseParameters_run_all_heuristics_set(this.swigCPtr, this, var1);
   }

   public boolean getRun_all_heuristics() {
      return mainJNI.DefaultPhaseParameters_run_all_heuristics_get(this.swigCPtr, this);
   }

   public void setHeuristic_period(int var1) {
      mainJNI.DefaultPhaseParameters_heuristic_period_set(this.swigCPtr, this, var1);
   }

   public int getHeuristic_period() {
      return mainJNI.DefaultPhaseParameters_heuristic_period_get(this.swigCPtr, this);
   }

   public void setHeuristic_num_failures_limit(int var1) {
      mainJNI.DefaultPhaseParameters_heuristic_num_failures_limit_set(this.swigCPtr, this, var1);
   }

   public int getHeuristic_num_failures_limit() {
      return mainJNI.DefaultPhaseParameters_heuristic_num_failures_limit_get(this.swigCPtr, this);
   }

   public void setPersistent_impact(boolean var1) {
      mainJNI.DefaultPhaseParameters_persistent_impact_set(this.swigCPtr, this, var1);
   }

   public boolean getPersistent_impact() {
      return mainJNI.DefaultPhaseParameters_persistent_impact_get(this.swigCPtr, this);
   }

   public void setRandom_seed(int var1) {
      mainJNI.DefaultPhaseParameters_random_seed_set(this.swigCPtr, this, var1);
   }

   public int getRandom_seed() {
      return mainJNI.DefaultPhaseParameters_random_seed_get(this.swigCPtr, this);
   }

   public void setDisplay_level(int var1) {
      mainJNI.DefaultPhaseParameters_display_level_set(this.swigCPtr, this, var1);
   }

   public int getDisplay_level() {
      return mainJNI.DefaultPhaseParameters_display_level_get(this.swigCPtr, this);
   }

   public void setUse_last_conflict(boolean var1) {
      mainJNI.DefaultPhaseParameters_use_last_conflict_set(this.swigCPtr, this, var1);
   }

   public boolean getUse_last_conflict() {
      return mainJNI.DefaultPhaseParameters_use_last_conflict_get(this.swigCPtr, this);
   }

   public void setDecision_builder(DecisionBuilder var1) {
      mainJNI.DefaultPhaseParameters_decision_builder_set(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1);
   }

   public DecisionBuilder getDecision_builder() {
      long var1 = mainJNI.DefaultPhaseParameters_decision_builder_get(this.swigCPtr, this);
      return var1 == 0L ? null : new DecisionBuilder(var1, false);
   }

   public DefaultPhaseParameters() {
      this(mainJNI.new_DefaultPhaseParameters(), true);
   }
}
