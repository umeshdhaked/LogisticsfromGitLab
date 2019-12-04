package com.google.ortools.constraintsolver;

import java.math.BigInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.Supplier;

public class mainJNI {
   public static final native long new_IntTupleSet__SWIG_0(int var0);

   public static final native long new_IntTupleSet__SWIG_1(long var0, IntTupleSet var2);

   public static final native void delete_IntTupleSet(long var0);

   public static final native void IntTupleSet_clear(long var0, IntTupleSet var2);

   public static final native int IntTupleSet_insert__SWIG_0(long var0, IntTupleSet var2, int[] var3);

   public static final native int IntTupleSet_insert__SWIG_1(long var0, IntTupleSet var2, long[] var3);

   public static final native int IntTupleSet_insert2(long var0, IntTupleSet var2, long var3, long var5);

   public static final native int IntTupleSet_insert3(long var0, IntTupleSet var2, long var3, long var5, long var7);

   public static final native int IntTupleSet_insert4(long var0, IntTupleSet var2, long var3, long var5, long var7, long var9);

   public static final native void IntTupleSet_insertAll__SWIG_0(long var0, IntTupleSet var2, long[][] var3);

   public static final native void IntTupleSet_insertAll__SWIG_1(long var0, IntTupleSet var2, int[][] var3);

   public static final native boolean IntTupleSet_contains__SWIG_0(long var0, IntTupleSet var2, int[] var3);

   public static final native boolean IntTupleSet_contains__SWIG_1(long var0, IntTupleSet var2, long[] var3);

   public static final native int IntTupleSet_numTuples(long var0, IntTupleSet var2);

   public static final native long IntTupleSet_value(long var0, IntTupleSet var2, int var3, int var4);

   public static final native int IntTupleSet_arity(long var0, IntTupleSet var2);

   public static final native int IntTupleSet_numDifferentValuesInColumn(long var0, IntTupleSet var2, int var3);

   public static final native long IntTupleSet_sortedByColumn(long var0, IntTupleSet var2, int var3);

   public static final native long IntTupleSet_sortedLexicographically(long var0, IntTupleSet var2);

   public static final native int DefaultPhaseParameters_CHOOSE_MAX_SUM_IMPACT_get();

   public static final native int DefaultPhaseParameters_CHOOSE_MAX_AVERAGE_IMPACT_get();

   public static final native int DefaultPhaseParameters_CHOOSE_MAX_VALUE_IMPACT_get();

   public static final native int DefaultPhaseParameters_SELECT_MIN_IMPACT_get();

   public static final native int DefaultPhaseParameters_SELECT_MAX_IMPACT_get();

   public static final native int DefaultPhaseParameters_NONE_get();

   public static final native int DefaultPhaseParameters_NORMAL_get();

   public static final native int DefaultPhaseParameters_VERBOSE_get();

   public static final native void DefaultPhaseParameters_var_selection_schema_set(long var0, DefaultPhaseParameters var2, int var3);

   public static final native int DefaultPhaseParameters_var_selection_schema_get(long var0, DefaultPhaseParameters var2);

   public static final native void DefaultPhaseParameters_value_selection_schema_set(long var0, DefaultPhaseParameters var2, int var3);

   public static final native int DefaultPhaseParameters_value_selection_schema_get(long var0, DefaultPhaseParameters var2);

   public static final native void DefaultPhaseParameters_initialization_splits_set(long var0, DefaultPhaseParameters var2, int var3);

   public static final native int DefaultPhaseParameters_initialization_splits_get(long var0, DefaultPhaseParameters var2);

   public static final native void DefaultPhaseParameters_run_all_heuristics_set(long var0, DefaultPhaseParameters var2, boolean var3);

   public static final native boolean DefaultPhaseParameters_run_all_heuristics_get(long var0, DefaultPhaseParameters var2);

   public static final native void DefaultPhaseParameters_heuristic_period_set(long var0, DefaultPhaseParameters var2, int var3);

   public static final native int DefaultPhaseParameters_heuristic_period_get(long var0, DefaultPhaseParameters var2);

   public static final native void DefaultPhaseParameters_heuristic_num_failures_limit_set(long var0, DefaultPhaseParameters var2, int var3);

   public static final native int DefaultPhaseParameters_heuristic_num_failures_limit_get(long var0, DefaultPhaseParameters var2);

   public static final native void DefaultPhaseParameters_persistent_impact_set(long var0, DefaultPhaseParameters var2, boolean var3);

   public static final native boolean DefaultPhaseParameters_persistent_impact_get(long var0, DefaultPhaseParameters var2);

   public static final native void DefaultPhaseParameters_random_seed_set(long var0, DefaultPhaseParameters var2, int var3);

   public static final native int DefaultPhaseParameters_random_seed_get(long var0, DefaultPhaseParameters var2);

   public static final native void DefaultPhaseParameters_display_level_set(long var0, DefaultPhaseParameters var2, int var3);

   public static final native int DefaultPhaseParameters_display_level_get(long var0, DefaultPhaseParameters var2);

   public static final native void DefaultPhaseParameters_use_last_conflict_set(long var0, DefaultPhaseParameters var2, boolean var3);

   public static final native boolean DefaultPhaseParameters_use_last_conflict_get(long var0, DefaultPhaseParameters var2);

   public static final native void DefaultPhaseParameters_decision_builder_set(long var0, DefaultPhaseParameters var2, long var3, DecisionBuilder var5);

   public static final native long DefaultPhaseParameters_decision_builder_get(long var0, DefaultPhaseParameters var2);

   public static final native long new_DefaultPhaseParameters();

   public static final native void delete_DefaultPhaseParameters(long var0);

   public static final native long new_Solver_IntegerCastInfo__SWIG_0();

   public static final native long new_Solver_IntegerCastInfo__SWIG_1(long var0, IntVar var2, long var3, IntExpr var5, long var6, Constraint var8);

   public static final native void Solver_IntegerCastInfo_variable_set(long var0, Solver.IntegerCastInfo var2, long var3, IntVar var5);

   public static final native long Solver_IntegerCastInfo_variable_get(long var0, Solver.IntegerCastInfo var2);

   public static final native void Solver_IntegerCastInfo_expression_set(long var0, Solver.IntegerCastInfo var2, long var3, IntExpr var5);

   public static final native long Solver_IntegerCastInfo_expression_get(long var0, Solver.IntegerCastInfo var2);

   public static final native void Solver_IntegerCastInfo_maintainer_set(long var0, Solver.IntegerCastInfo var2, long var3, Constraint var5);

   public static final native long Solver_IntegerCastInfo_maintainer_get(long var0, Solver.IntegerCastInfo var2);

   public static final native void delete_Solver_IntegerCastInfo(long var0);

   public static final native int Solver_kNumPriorities_get();

   public static final native int Solver_INT_VAR_DEFAULT_get();

   public static final native int Solver_INT_VAR_SIMPLE_get();

   public static final native int Solver_CHOOSE_FIRST_UNBOUND_get();

   public static final native int Solver_CHOOSE_RANDOM_get();

   public static final native int Solver_CHOOSE_MIN_SIZE_LOWEST_MIN_get();

   public static final native int Solver_CHOOSE_MIN_SIZE_HIGHEST_MIN_get();

   public static final native int Solver_CHOOSE_MIN_SIZE_LOWEST_MAX_get();

   public static final native int Solver_CHOOSE_MIN_SIZE_HIGHEST_MAX_get();

   public static final native int Solver_CHOOSE_LOWEST_MIN_get();

   public static final native int Solver_CHOOSE_HIGHEST_MAX_get();

   public static final native int Solver_CHOOSE_MIN_SIZE_get();

   public static final native int Solver_CHOOSE_MAX_SIZE_get();

   public static final native int Solver_CHOOSE_MAX_REGRET_ON_MIN_get();

   public static final native int Solver_CHOOSE_PATH_get();

   public static final native int Solver_INT_VALUE_DEFAULT_get();

   public static final native int Solver_INT_VALUE_SIMPLE_get();

   public static final native int Solver_ASSIGN_MIN_VALUE_get();

   public static final native int Solver_ASSIGN_MAX_VALUE_get();

   public static final native int Solver_ASSIGN_RANDOM_VALUE_get();

   public static final native int Solver_ASSIGN_CENTER_VALUE_get();

   public static final native int Solver_SPLIT_LOWER_HALF_get();

   public static final native int Solver_SPLIT_UPPER_HALF_get();

   public static final native int Solver_CHOOSE_STATIC_GLOBAL_BEST_get();

   public static final native int Solver_CHOOSE_DYNAMIC_GLOBAL_BEST_get();

   public static final native int Solver_SEQUENCE_DEFAULT_get();

   public static final native int Solver_SEQUENCE_SIMPLE_get();

   public static final native int Solver_CHOOSE_MIN_SLACK_RANK_FORWARD_get();

   public static final native int Solver_CHOOSE_RANDOM_RANK_FORWARD_get();

   public static final native int Solver_INTERVAL_DEFAULT_get();

   public static final native int Solver_INTERVAL_SIMPLE_get();

   public static final native int Solver_INTERVAL_SET_TIMES_FORWARD_get();

   public static final native int Solver_INTERVAL_SET_TIMES_BACKWARD_get();

   public static final native int Solver_TWOOPT_get();

   public static final native int Solver_OROPT_get();

   public static final native int Solver_RELOCATE_get();

   public static final native int Solver_EXCHANGE_get();

   public static final native int Solver_CROSS_get();

   public static final native int Solver_MAKEACTIVE_get();

   public static final native int Solver_MAKEINACTIVE_get();

   public static final native int Solver_MAKECHAININACTIVE_get();

   public static final native int Solver_SWAPACTIVE_get();

   public static final native int Solver_EXTENDEDSWAPACTIVE_get();

   public static final native int Solver_PATHLNS_get();

   public static final native int Solver_FULLPATHLNS_get();

   public static final native int Solver_UNACTIVELNS_get();

   public static final native int Solver_INCREMENT_get();

   public static final native int Solver_DECREMENT_get();

   public static final native int Solver_SIMPLELNS_get();

   public static final native int Solver_LK_get();

   public static final native int Solver_TSPOPT_get();

   public static final native int Solver_TSPLNS_get();

   public static final native int Solver_GE_get();

   public static final native int Solver_LE_get();

   public static final native int Solver_EQ_get();

   public static final native int Solver_DELAYED_PRIORITY_get();

   public static final native int Solver_VAR_PRIORITY_get();

   public static final native int Solver_NORMAL_PRIORITY_get();

   public static final native int Solver_ENDS_AFTER_END_get();

   public static final native int Solver_ENDS_AFTER_START_get();

   public static final native int Solver_ENDS_AT_END_get();

   public static final native int Solver_ENDS_AT_START_get();

   public static final native int Solver_STARTS_AFTER_END_get();

   public static final native int Solver_STARTS_AFTER_START_get();

   public static final native int Solver_STARTS_AT_END_get();

   public static final native int Solver_STARTS_AT_START_get();

   public static final native int Solver_STAYS_IN_SYNC_get();

   public static final native int Solver_ENDS_AFTER_get();

   public static final native int Solver_ENDS_AT_get();

   public static final native int Solver_ENDS_BEFORE_get();

   public static final native int Solver_STARTS_AFTER_get();

   public static final native int Solver_STARTS_AT_get();

   public static final native int Solver_STARTS_BEFORE_get();

   public static final native int Solver_CROSS_DATE_get();

   public static final native int Solver_AVOID_DATE_get();

   public static final native int Solver_NO_CHANGE_get();

   public static final native int Solver_KEEP_LEFT_get();

   public static final native int Solver_KEEP_RIGHT_get();

   public static final native int Solver_KILL_BOTH_get();

   public static final native int Solver_SWITCH_BRANCHES_get();

   public static final native int Solver_SENTINEL_get();

   public static final native int Solver_SIMPLE_MARKER_get();

   public static final native int Solver_CHOICE_POINT_get();

   public static final native int Solver_REVERSIBLE_ACTION_get();

   public static final native int Solver_OUTSIDE_SEARCH_get();

   public static final native int Solver_IN_ROOT_NODE_get();

   public static final native int Solver_IN_SEARCH_get();

   public static final native int Solver_AT_SOLUTION_get();

   public static final native int Solver_NO_MORE_SOLUTIONS_get();

   public static final native int Solver_PROBLEM_INFEASIBLE_get();

   public static final native int Solver_NOT_SET_get();

   public static final native int Solver_MAXIMIZATION_get();

   public static final native int Solver_MINIMIZATION_get();

   public static final native long new_Solver__SWIG_0(String var0);

   public static final native long new_Solver__SWIG_1(String var0, byte[] var1);

   public static final native void delete_Solver(long var0);

   public static final native byte[] Solver_parameters(long var0, Solver var2);

   public static final native byte[] Solver_defaultSolverParameters();

   public static final native void Solver_addConstraint(long var0, Solver var2, long var3, Constraint var5);

   public static final native void Solver_addCastConstraint(long var0, Solver var2, long var3, CastConstraint var5, long var6, IntVar var8, long var9, IntExpr var11);

   public static final native boolean Solver_solve__SWIG_0(long var0, Solver var2, long var3, DecisionBuilder var5, SearchMonitor[] var6);

   public static final native boolean Solver_solve__SWIG_1(long var0, Solver var2, long var3, DecisionBuilder var5);

   public static final native boolean Solver_solve__SWIG_2(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8);

   public static final native boolean Solver_solve__SWIG_3(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8, long var9, SearchMonitor var11);

   public static final native boolean Solver_solve__SWIG_4(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8, long var9, SearchMonitor var11, long var12, SearchMonitor var14);

   public static final native boolean Solver_solve__SWIG_5(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8, long var9, SearchMonitor var11, long var12, SearchMonitor var14, long var15, SearchMonitor var17);

   public static final native void Solver_newSearch__SWIG_0(long var0, Solver var2, long var3, DecisionBuilder var5, SearchMonitor[] var6);

   public static final native void Solver_newSearch__SWIG_1(long var0, Solver var2, long var3, DecisionBuilder var5);

   public static final native void Solver_newSearch__SWIG_2(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8);

   public static final native void Solver_newSearch__SWIG_3(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8, long var9, SearchMonitor var11);

   public static final native void Solver_newSearch__SWIG_4(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8, long var9, SearchMonitor var11, long var12, SearchMonitor var14);

   public static final native void Solver_newSearch__SWIG_5(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8, long var9, SearchMonitor var11, long var12, SearchMonitor var14, long var15, SearchMonitor var17);

   public static final native boolean Solver_nextSolution(long var0, Solver var2);

   public static final native void Solver_restartSearch(long var0, Solver var2);

   public static final native void Solver_endSearch(long var0, Solver var2);

   public static final native boolean Solver_solveAndCommit__SWIG_0(long var0, Solver var2, long var3, DecisionBuilder var5, SearchMonitor[] var6);

   public static final native boolean Solver_solveAndCommit__SWIG_1(long var0, Solver var2, long var3, DecisionBuilder var5);

   public static final native boolean Solver_solveAndCommit__SWIG_2(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8);

   public static final native boolean Solver_solveAndCommit__SWIG_3(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8, long var9, SearchMonitor var11);

   public static final native boolean Solver_solveAndCommit__SWIG_4(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8, long var9, SearchMonitor var11, long var12, SearchMonitor var14);

   public static final native boolean Solver_checkAssignment(long var0, Solver var2, long var3, Assignment var5);

   public static final native boolean Solver_checkConstraint(long var0, Solver var2, long var3, Constraint var5);

   public static final native int Solver_state(long var0, Solver var2);

   public static final native void Solver_fail(long var0, Solver var2);

   public static final native String Solver_toString(long var0, Solver var2);

   public static final native long Solver_memoryUsage();

   public static final native long Solver_Now(long var0, Solver var2);

   public static final native long Solver_wallTime(long var0, Solver var2);

   public static final native long Solver_branches(long var0, Solver var2);

   public static final native long Solver_solutions(long var0, Solver var2);

   public static final native long Solver_unchecked_solutions(long var0, Solver var2);

   public static final native long Solver_demon_runs(long var0, Solver var2, int var3);

   public static final native long Solver_failures(long var0, Solver var2);

   public static final native long Solver_neighbors(long var0, Solver var2);

   public static final native long Solver_filteredNeighbors(long var0, Solver var2);

   public static final native long Solver_acceptedNeighbors(long var0, Solver var2);

   public static final native BigInteger Solver_stamp(long var0, Solver var2);

   public static final native BigInteger Solver_fail_stamp(long var0, Solver var2);

   public static final native int Solver_optimization_direction(long var0, Solver var2);

   public static final native void Solver_set_optimization_direction(long var0, Solver var2, int var3);

   public static final native long Solver_makeIntVar__SWIG_0(long var0, Solver var2, long var3, long var5, String var7);

   public static final native long Solver_makeIntVar__SWIG_1(long var0, Solver var2, long[] var3, String var4);

   public static final native long Solver_makeIntVar__SWIG_2(long var0, Solver var2, int[] var3, String var4);

   public static final native long Solver_makeIntVar__SWIG_3(long var0, Solver var2, long var3, long var5);

   public static final native long Solver_makeIntVar__SWIG_4(long var0, Solver var2, long[] var3);

   public static final native long Solver_makeIntVar__SWIG_5(long var0, Solver var2, int[] var3);

   public static final native long Solver_makeBoolVar__SWIG_0(long var0, Solver var2, String var3);

   public static final native long Solver_makeBoolVar__SWIG_1(long var0, Solver var2);

   public static final native long Solver_makeIntConst__SWIG_0(long var0, Solver var2, long var3, String var5);

   public static final native long Solver_makeIntConst__SWIG_1(long var0, Solver var2, long var3);

   public static final native long Solver_makeSum__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeSum__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeSum__SWIG_2(long var0, Solver var2, IntVar[] var3);

   public static final native long Solver_makeScalProd__SWIG_0(long var0, Solver var2, IntVar[] var3, long[] var4);

   public static final native long Solver_makeScalProd__SWIG_1(long var0, Solver var2, IntVar[] var3, int[] var4);

   public static final native long Solver_makeDifference__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeDifference__SWIG_1(long var0, Solver var2, long var3, long var5, IntExpr var7);

   public static final native long Solver_makeOpposite(long var0, Solver var2, long var3, IntExpr var5);

   public static final native long Solver_makeProd__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeProd__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeDiv__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeDiv__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeAbs(long var0, Solver var2, long var3, IntExpr var5);

   public static final native long Solver_makeSquare(long var0, Solver var2, long var3, IntExpr var5);

   public static final native long Solver_makePower(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeElement__SWIG_0(long var0, Solver var2, long[] var3, long var4, IntVar var6);

   public static final native long Solver_makeElement__SWIG_1(long var0, Solver var2, int[] var3, long var4, IntVar var6);

   public static final native long Solver_makeElement__SWIG_2(long var0, Solver var2, LongUnaryOperator var3, long var4, IntVar var6);

   public static final native long Solver_makeMonotonicElement(long var0, Solver var2, LongUnaryOperator var3, boolean var4, long var5, IntVar var7);

   public static final native long Solver_makeElement__SWIG_3(long var0, Solver var2, LongBinaryOperator var3, long var4, IntVar var6, long var7, IntVar var9);

   public static final native long Solver_makeElement__SWIG_4(long var0, Solver var2, IntVar[] var3, long var4, IntVar var6);

   public static final native long Solver_makeIndexExpression(long var0, Solver var2, IntVar[] var3, long var4);

   public static final native long Solver_makeIfThenElseCt(long var0, Solver var2, long var3, IntVar var5, long var6, IntExpr var8, long var9, IntExpr var11, long var12, IntVar var14);

   public static final native long Solver_makeMin__SWIG_0(long var0, Solver var2, IntVar[] var3);

   public static final native long Solver_makeMin__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeMin__SWIG_2(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeMin__SWIG_3(long var0, Solver var2, long var3, IntExpr var5, int var6);

   public static final native long Solver_makeMax__SWIG_0(long var0, Solver var2, IntVar[] var3);

   public static final native long Solver_makeMax__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeMax__SWIG_2(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeMax__SWIG_3(long var0, Solver var2, long var3, IntExpr var5, int var6);

   public static final native long Solver_makeConvexPiecewiseExpr(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8, long var10, long var12);

   public static final native long Solver_makeSemiContinuousExpr(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8);

   public static final native long Solver_makeModulo__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeModulo__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeConditionalExpression(long var0, Solver var2, long var3, IntVar var5, long var6, IntExpr var8, long var9);

   public static final native long Solver_makeTrueConstraint(long var0, Solver var2);

   public static final native long Solver_makeFalseConstraint__SWIG_0(long var0, Solver var2);

   public static final native long Solver_makeFalseConstraint__SWIG_1(long var0, Solver var2, String var3);

   public static final native long Solver_makeIsEqualCstCt(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8, IntVar var10);

   public static final native long Solver_makeIsEqualCstVar(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeIsEqualVar__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8, long var9, IntVar var11);

   public static final native long Solver_makeIsEqualVar__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeEquality__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeEquality__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeEquality__SWIG_2(long var0, Solver var2, long var3, IntExpr var5, int var6);

   public static final native long Solver_makeIsDifferentCstCt__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8, IntVar var10);

   public static final native long Solver_makeIsDifferentCstVar__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeIsDifferentCstVar__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeIsDifferentCstCt__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8, long var9, IntVar var11);

   public static final native long Solver_makeNonEquality__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeNonEquality__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeNonEquality__SWIG_2(long var0, Solver var2, long var3, IntExpr var5, int var6);

   public static final native long Solver_makeIsLessOrEqualCstCt(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8, IntVar var10);

   public static final native long Solver_makeIsLessOrEqualCstVar(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeIsLessOrEqualVar(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeIsLessOrEqualCt(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8, long var9, IntVar var11);

   public static final native long Solver_makeLessOrEqual__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeLessOrEqual__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeLessOrEqual__SWIG_2(long var0, Solver var2, long var3, IntExpr var5, int var6);

   public static final native long Solver_makeIsGreaterOrEqualCstCt(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8, IntVar var10);

   public static final native long Solver_makeIsGreaterOrEqualCstVar(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeIsGreaterOrEqualVar(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeIsGreaterOrEqualCt(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8, long var9, IntVar var11);

   public static final native long Solver_makeGreaterOrEqual__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeGreaterOrEqual__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeGreaterOrEqual__SWIG_2(long var0, Solver var2, long var3, IntExpr var5, int var6);

   public static final native long Solver_makeIsGreaterCstCt(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8, IntVar var10);

   public static final native long Solver_makeIsGreaterCstVar(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeIsGreaterVar(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeIsGreaterCt(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8, long var9, IntVar var11);

   public static final native long Solver_makeGreater__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeGreater__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeGreater__SWIG_2(long var0, Solver var2, long var3, IntExpr var5, int var6);

   public static final native long Solver_makeIsLessCstCt(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8, IntVar var10);

   public static final native long Solver_makeIsLessCstVar(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeIsLessVar(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeIsLessCt(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8, long var9, IntVar var11);

   public static final native long Solver_makeLess__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long var6, IntExpr var8);

   public static final native long Solver_makeLess__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, long var6);

   public static final native long Solver_makeLess__SWIG_2(long var0, Solver var2, long var3, IntExpr var5, int var6);

   public static final native long Solver_makeSumLessOrEqual(long var0, Solver var2, IntVar[] var3, long var4);

   public static final native long Solver_makeSumGreaterOrEqual(long var0, Solver var2, IntVar[] var3, long var4);

   public static final native long Solver_makeSumEquality__SWIG_0(long var0, Solver var2, IntVar[] var3, long var4);

   public static final native long Solver_makeSumEquality__SWIG_1(long var0, Solver var2, IntVar[] var3, long var4, IntVar var6);

   public static final native long Solver_makeScalProdEquality__SWIG_0(long var0, Solver var2, IntVar[] var3, long[] var4, long var5);

   public static final native long Solver_makeScalProdEquality__SWIG_1(long var0, Solver var2, IntVar[] var3, int[] var4, long var5);

   public static final native long Solver_makeScalProdEquality__SWIG_2(long var0, Solver var2, IntVar[] var3, long[] var4, long var5, IntVar var7);

   public static final native long Solver_makeScalProdEquality__SWIG_3(long var0, Solver var2, IntVar[] var3, int[] var4, long var5, IntVar var7);

   public static final native long Solver_makeScalProdGreaterOrEqual__SWIG_0(long var0, Solver var2, IntVar[] var3, long[] var4, long var5);

   public static final native long Solver_makeScalProdGreaterOrEqual__SWIG_1(long var0, Solver var2, IntVar[] var3, int[] var4, long var5);

   public static final native long Solver_makeScalProdLessOrEqual__SWIG_0(long var0, Solver var2, IntVar[] var3, long[] var4, long var5);

   public static final native long Solver_makeScalProdLessOrEqual__SWIG_1(long var0, Solver var2, IntVar[] var3, int[] var4, long var5);

   public static final native long Solver_makeMinEquality(long var0, Solver var2, IntVar[] var3, long var4, IntVar var6);

   public static final native long Solver_makeMaxEquality(long var0, Solver var2, IntVar[] var3, long var4, IntVar var6);

   public static final native long Solver_makeElementEquality__SWIG_0(long var0, Solver var2, long[] var3, long var4, IntVar var6, long var7, IntVar var9);

   public static final native long Solver_makeElementEquality__SWIG_1(long var0, Solver var2, int[] var3, long var4, IntVar var6, long var7, IntVar var9);

   public static final native long Solver_makeElementEquality__SWIG_2(long var0, Solver var2, IntVar[] var3, long var4, IntVar var6, long var7, IntVar var9);

   public static final native long Solver_makeElementEquality__SWIG_3(long var0, Solver var2, IntVar[] var3, long var4, IntVar var6, long var7);

   public static final native long Solver_makeAbsEquality(long var0, Solver var2, long var3, IntVar var5, long var6, IntVar var8);

   public static final native long Solver_makeIndexOfConstraint(long var0, Solver var2, IntVar[] var3, long var4, IntVar var6, long var7);

   public static final native long Solver_makeConstraintInitialPropagateCallback(long var0, Solver var2, long var3, Constraint var5);

   public static final native long Solver_makeDelayedConstraintInitialPropagateCallback(long var0, Solver var2, long var3, Constraint var5);

   public static final native long Solver_makeClosureDemon(long var0, Solver var2, Runnable var3);

   public static final native long Solver_makeBetweenCt(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8);

   public static final native long Solver_makeNotBetweenCt(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8);

   public static final native long Solver_makeIsBetweenCt(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8, long var10, IntVar var12);

   public static final native long Solver_makeIsBetweenVar(long var0, Solver var2, long var3, IntExpr var5, long var6, long var8);

   public static final native long Solver_makeMemberCt__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long[] var6);

   public static final native long Solver_makeMemberCt__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, int[] var6);

   public static final native long Solver_makeNotMemberCt__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long[] var6);

   public static final native long Solver_makeNotMemberCt__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, int[] var6);

   public static final native long Solver_makeNotMemberCt__SWIG_2(long var0, Solver var2, long var3, IntExpr var5, long[] var6, long[] var7);

   public static final native long Solver_makeNotMemberCt__SWIG_3(long var0, Solver var2, long var3, IntExpr var5, int[] var6, int[] var7);

   public static final native long Solver_makeIsMemberCt__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long[] var6, long var7, IntVar var9);

   public static final native long Solver_makeIsMemberCt__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, int[] var6, long var7, IntVar var9);

   public static final native long Solver_makeIsMemberVar__SWIG_0(long var0, Solver var2, long var3, IntExpr var5, long[] var6);

   public static final native long Solver_makeIsMemberVar__SWIG_1(long var0, Solver var2, long var3, IntExpr var5, int[] var6);

   public static final native long Solver_makeCount__SWIG_0(long var0, Solver var2, IntVar[] var3, long var4, long var6);

   public static final native long Solver_makeCount__SWIG_1(long var0, Solver var2, IntVar[] var3, long var4, long var6, IntVar var8);

   public static final native long Solver_makeDistribute__SWIG_0(long var0, Solver var2, IntVar[] var3, long[] var4, IntVar[] var5);

   public static final native long Solver_makeDistribute__SWIG_1(long var0, Solver var2, IntVar[] var3, int[] var4, IntVar[] var5);

   public static final native long Solver_makeDistribute__SWIG_2(long var0, Solver var2, IntVar[] var3, IntVar[] var4);

   public static final native long Solver_makeDistribute__SWIG_3(long var0, Solver var2, IntVar[] var3, long var4, long var6, long var8);

   public static final native long Solver_makeDistribute__SWIG_4(long var0, Solver var2, IntVar[] var3, long[] var4, long[] var5);

   public static final native long Solver_makeDistribute__SWIG_5(long var0, Solver var2, IntVar[] var3, int[] var4, int[] var5);

   public static final native long Solver_makeDistribute__SWIG_6(long var0, Solver var2, IntVar[] var3, long[] var4, long[] var5, long[] var6);

   public static final native long Solver_makeDistribute__SWIG_7(long var0, Solver var2, IntVar[] var3, int[] var4, int[] var5, int[] var6);

   public static final native long Solver_makeDeviation(long var0, Solver var2, IntVar[] var3, long var4, IntVar var6, long var7);

   public static final native long Solver_makeAllDifferent__SWIG_0(long var0, Solver var2, IntVar[] var3);

   public static final native long Solver_makeAllDifferent__SWIG_1(long var0, Solver var2, IntVar[] var3, boolean var4);

   public static final native long Solver_makeAllDifferentExcept(long var0, Solver var2, IntVar[] var3, long var4);

   public static final native long Solver_makeSortingConstraint(long var0, Solver var2, IntVar[] var3, IntVar[] var4);

   public static final native long Solver_makeLexicalLess(long var0, Solver var2, IntVar[] var3, IntVar[] var4);

   public static final native long Solver_makeLexicalLessOrEqual(long var0, Solver var2, IntVar[] var3, IntVar[] var4);

   public static final native long Solver_makeInversePermutationConstraint(long var0, Solver var2, IntVar[] var3, IntVar[] var4);

   public static final native long Solver_makeIndexOfFirstMaxValueConstraint(long var0, Solver var2, long var3, IntVar var5, IntVar[] var6);

   public static final native long Solver_makeIndexOfFirstMinValueConstraint(long var0, Solver var2, long var3, IntVar var5, IntVar[] var6);

   public static final native long Solver_makeNullIntersect(long var0, Solver var2, IntVar[] var3, IntVar[] var4);

   public static final native long Solver_makeNullIntersectExcept(long var0, Solver var2, IntVar[] var3, IntVar[] var4, long var5);

   public static final native long Solver_makeNoCycle__SWIG_0(long var0, Solver var2, IntVar[] var3, IntVar[] var4, LongPredicate var5);

   public static final native long Solver_makeNoCycle__SWIG_1(long var0, Solver var2, IntVar[] var3, IntVar[] var4);

   public static final native long Solver_makeNoCycle__SWIG_2(long var0, Solver var2, IntVar[] var3, IntVar[] var4, LongPredicate var5, boolean var6);

   public static final native long Solver_makeCircuit(long var0, Solver var2, IntVar[] var3);

   public static final native long Solver_makeSubCircuit(long var0, Solver var2, IntVar[] var3);

   public static final native long Solver_makePathCumul__SWIG_0(long var0, Solver var2, IntVar[] var3, IntVar[] var4, IntVar[] var5, IntVar[] var6);

   public static final native long Solver_makeDelayedPathCumul(long var0, Solver var2, IntVar[] var3, IntVar[] var4, IntVar[] var5, IntVar[] var6);

   public static final native long Solver_makePathCumul__SWIG_1(long var0, Solver var2, IntVar[] var3, IntVar[] var4, IntVar[] var5, LongBinaryOperator var6);

   public static final native long Solver_makePathCumul__SWIG_2(long var0, Solver var2, IntVar[] var3, IntVar[] var4, IntVar[] var5, IntVar[] var6, LongBinaryOperator var7);

   public static final native long Solver_makePathConnected(long var0, Solver var2, IntVar[] var3, long[] var4, long[] var5, IntVar[] var6);

   public static final native long Solver_makeMapDomain(long var0, Solver var2, long var3, IntVar var5, IntVar[] var6);

   public static final native long Solver_makeAllowedAssignment(long var0, Solver var2, IntVar[] var3, long var4, IntTupleSet var6);

   public static final native long Solver_makeTransitionConstraint__SWIG_0(long var0, Solver var2, IntVar[] var3, long var4, IntTupleSet var6, long var7, long[] var9);

   public static final native long Solver_makeTransitionConstraint__SWIG_1(long var0, Solver var2, IntVar[] var3, long var4, IntTupleSet var6, long var7, int[] var9);

   public static final native long Solver_makeNonOverlappingBoxesConstraint__SWIG_0(long var0, Solver var2, IntVar[] var3, IntVar[] var4, IntVar[] var5, IntVar[] var6);

   public static final native long Solver_makeNonOverlappingBoxesConstraint__SWIG_1(long var0, Solver var2, IntVar[] var3, IntVar[] var4, long[] var5, long[] var6);

   public static final native long Solver_makeNonOverlappingBoxesConstraint__SWIG_2(long var0, Solver var2, IntVar[] var3, IntVar[] var4, int[] var5, int[] var6);

   public static final native long Solver_makeNonOverlappingNonStrictBoxesConstraint__SWIG_0(long var0, Solver var2, IntVar[] var3, IntVar[] var4, IntVar[] var5, IntVar[] var6);

   public static final native long Solver_makeNonOverlappingNonStrictBoxesConstraint__SWIG_1(long var0, Solver var2, IntVar[] var3, IntVar[] var4, long[] var5, long[] var6);

   public static final native long Solver_makeNonOverlappingNonStrictBoxesConstraint__SWIG_2(long var0, Solver var2, IntVar[] var3, IntVar[] var4, int[] var5, int[] var6);

   public static final native long Solver_makePack(long var0, Solver var2, IntVar[] var3, int var4);

   public static final native long Solver_makeFixedDurationIntervalVar__SWIG_0(long var0, Solver var2, long var3, long var5, long var7, boolean var9, String var10);

   public static final native long Solver_makeFixedDurationIntervalVar__SWIG_1(long var0, Solver var2, long var3, IntVar var5, long var6, String var8);

   public static final native long Solver_makeFixedDurationIntervalVar__SWIG_2(long var0, Solver var2, long var3, IntVar var5, long var6, long var8, IntVar var10, String var11);

   public static final native long Solver_makeFixedInterval(long var0, Solver var2, long var3, long var5, String var7);

   public static final native long Solver_makeIntervalVar(long var0, Solver var2, long var3, long var5, long var7, long var9, long var11, long var13, boolean var15, String var16);

   public static final native long Solver_makeMirrorInterval(long var0, Solver var2, long var3, IntervalVar var5);

   public static final native long Solver_makeFixedDurationStartSyncedOnStartIntervalVar(long var0, Solver var2, long var3, IntervalVar var5, long var6, long var8);

   public static final native long Solver_makeFixedDurationStartSyncedOnEndIntervalVar(long var0, Solver var2, long var3, IntervalVar var5, long var6, long var8);

   public static final native long Solver_makeFixedDurationEndSyncedOnStartIntervalVar(long var0, Solver var2, long var3, IntervalVar var5, long var6, long var8);

   public static final native long Solver_makeFixedDurationEndSyncedOnEndIntervalVar(long var0, Solver var2, long var3, IntervalVar var5, long var6, long var8);

   public static final native long Solver_makeIntervalRelaxedMin(long var0, Solver var2, long var3, IntervalVar var5);

   public static final native long Solver_makeIntervalRelaxedMax(long var0, Solver var2, long var3, IntervalVar var5);

   public static final native long Solver_makeIntervalVarRelation__SWIG_0(long var0, Solver var2, long var3, IntervalVar var5, int var6, long var7);

   public static final native long Solver_makeIntervalVarRelation__SWIG_1(long var0, Solver var2, long var3, IntervalVar var5, int var6, long var7, IntervalVar var9);

   public static final native long Solver_makeIntervalVarRelationWithDelay(long var0, Solver var2, long var3, IntervalVar var5, int var6, long var7, IntervalVar var9, long var10);

   public static final native long Solver_makeTemporalDisjunction__SWIG_0(long var0, Solver var2, long var3, IntervalVar var5, long var6, IntervalVar var8, long var9, IntVar var11);

   public static final native long Solver_makeTemporalDisjunction__SWIG_1(long var0, Solver var2, long var3, IntervalVar var5, long var6, IntervalVar var8);

   public static final native long Solver_makeDisjunctiveConstraint(long var0, Solver var2, IntervalVar[] var3, String var4);

   public static final native long Solver_makeStrictDisjunctiveConstraint(long var0, Solver var2, IntervalVar[] var3, String var4);

   public static final native long Solver_makeCumulative__SWIG_0(long var0, Solver var2, IntervalVar[] var3, long[] var4, long var5, String var7);

   public static final native long Solver_makeCumulative__SWIG_1(long var0, Solver var2, IntervalVar[] var3, int[] var4, long var5, String var7);

   public static final native long Solver_makeCumulative__SWIG_2(long var0, Solver var2, IntervalVar[] var3, long[] var4, long var5, IntVar var7, String var8);

   public static final native long Solver_makeCumulative__SWIG_3(long var0, Solver var2, IntervalVar[] var3, int[] var4, long var5, IntVar var7, String var8);

   public static final native long Solver_makeCumulative__SWIG_4(long var0, Solver var2, IntervalVar[] var3, IntVar[] var4, long var5, String var7);

   public static final native long Solver_makeCumulative__SWIG_5(long var0, Solver var2, IntervalVar[] var3, IntVar[] var4, long var5, IntVar var7, String var8);

   public static final native long Solver_makeCover(long var0, Solver var2, IntervalVar[] var3, long var4, IntervalVar var6);

   public static final native long Solver_makeEquality__SWIG_3(long var0, Solver var2, long var3, IntervalVar var5, long var6, IntervalVar var8);

   public static final native long Solver_makeAssignment__SWIG_0(long var0, Solver var2);

   public static final native long Solver_makeAssignment__SWIG_1(long var0, Solver var2, long var3, Assignment var5);

   public static final native long Solver_makeFirstSolutionCollector__SWIG_0(long var0, Solver var2, long var3, Assignment var5);

   public static final native long Solver_makeFirstSolutionCollector__SWIG_1(long var0, Solver var2);

   public static final native long Solver_makeLastSolutionCollector__SWIG_0(long var0, Solver var2, long var3, Assignment var5);

   public static final native long Solver_makeLastSolutionCollector__SWIG_1(long var0, Solver var2);

   public static final native long Solver_makeBestValueSolutionCollector__SWIG_0(long var0, Solver var2, long var3, Assignment var5, boolean var6);

   public static final native long Solver_makeBestValueSolutionCollector__SWIG_1(long var0, Solver var2, boolean var3);

   public static final native long Solver_makeNBestValueSolutionCollector__SWIG_0(long var0, Solver var2, long var3, Assignment var5, int var6, boolean var7);

   public static final native long Solver_makeNBestValueSolutionCollector__SWIG_1(long var0, Solver var2, int var3, boolean var4);

   public static final native long Solver_makeAllSolutionCollector__SWIG_0(long var0, Solver var2, long var3, Assignment var5);

   public static final native long Solver_makeAllSolutionCollector__SWIG_1(long var0, Solver var2);

   public static final native long Solver_makeMinimize(long var0, Solver var2, long var3, IntVar var5, long var6);

   public static final native long Solver_makeMaximize(long var0, Solver var2, long var3, IntVar var5, long var6);

   public static final native long Solver_makeOptimize(long var0, Solver var2, boolean var3, long var4, IntVar var6, long var7);

   public static final native long Solver_makeWeightedMinimize__SWIG_0(long var0, Solver var2, IntVar[] var3, long[] var4, long var5);

   public static final native long Solver_makeWeightedMinimize__SWIG_1(long var0, Solver var2, IntVar[] var3, int[] var4, long var5);

   public static final native long Solver_makeWeightedMaximize__SWIG_0(long var0, Solver var2, IntVar[] var3, long[] var4, long var5);

   public static final native long Solver_makeWeightedMaximize__SWIG_1(long var0, Solver var2, IntVar[] var3, int[] var4, long var5);

   public static final native long Solver_makeWeightedOptimize__SWIG_0(long var0, Solver var2, boolean var3, IntVar[] var4, long[] var5, long var6);

   public static final native long Solver_makeWeightedOptimize__SWIG_1(long var0, Solver var2, boolean var3, IntVar[] var4, int[] var5, long var6);

   public static final native long Solver_makeTabuSearch(long var0, Solver var2, boolean var3, long var4, IntVar var6, long var7, IntVar[] var9, long var10, long var12, double var14);

   public static final native long Solver_makeGenericTabuSearch(long var0, Solver var2, boolean var3, long var4, IntVar var6, long var7, IntVar[] var9, long var10);

   public static final native long Solver_makeSimulatedAnnealing(long var0, Solver var2, boolean var3, long var4, IntVar var6, long var7, long var9);

   public static final native long Solver_makeGuidedLocalSearch__SWIG_0(long var0, Solver var2, boolean var3, long var4, IntVar var6, LongBinaryOperator var7, long var8, IntVar[] var10, double var11);

   public static final native long Solver_makeGuidedLocalSearch__SWIG_1(long var0, Solver var2, boolean var3, long var4, IntVar var6, LongTernaryOperator var7, long var8, IntVar[] var10, IntVar[] var11, double var12);

   public static final native long Solver_makeLubyRestart(long var0, Solver var2, int var3);

   public static final native long Solver_makeConstantRestart(long var0, Solver var2, int var3);

   public static final native long Solver_makeTimeLimit(long var0, Solver var2, long var3);

   public static final native long Solver_makeBranchesLimit(long var0, Solver var2, long var3);

   public static final native long Solver_makeFailuresLimit(long var0, Solver var2, long var3);

   public static final native long Solver_makeSolutionsLimit(long var0, Solver var2, long var3);

   public static final native long Solver_makeLimit__SWIG_0(long var0, Solver var2, long var3, long var5, long var7, long var9);

   public static final native long Solver_makeLimit__SWIG_1(long var0, Solver var2, long var3, long var5, long var7, long var9, boolean var11);

   public static final native long Solver_makeLimit__SWIG_2(long var0, Solver var2, long var3, long var5, long var7, long var9, boolean var11, boolean var12);

   public static final native long Solver_makeLimit__SWIG_3(long var0, Solver var2, byte[] var3);

   public static final native byte[] Solver_makeDefaultRegularLimitParameters(long var0, Solver var2);

   public static final native long Solver_makeLimit__SWIG_4(long var0, Solver var2, long var3, SearchLimit var5, long var6, SearchLimit var8);

   public static final native long Solver_makeCustomLimit(long var0, Solver var2, BooleanSupplier var3);

   public static final native long Solver_makeSearchLog__SWIG_0(long var0, Solver var2, int var3);

   public static final native long Solver_makeSearchLog__SWIG_1(long var0, Solver var2, int var3, long var4, IntVar var6);

   public static final native long Solver_makeSearchLog__SWIG_2(long var0, Solver var2, int var3, Supplier var4);

   public static final native long Solver_makeSearchLog__SWIG_3(long var0, Solver var2, int var3, long var4, IntVar var6, Supplier var7);

   public static final native long Solver_makeSearchLog__SWIG_4(long var0, Solver var2, int var3, long var4, OptimizeVar var6);

   public static final native long Solver_makeSearchLog__SWIG_5(long var0, Solver var2, int var3, long var4, OptimizeVar var6, Supplier var7);

   public static final native long Solver_makeSearchTrace(long var0, Solver var2, String var3);

   public static final native long Solver_makeEnterSearchCallback(long var0, Solver var2, Runnable var3);

   public static final native long Solver_makeExitSearchCallback(long var0, Solver var2, Runnable var3);

   public static final native long Solver_makeAtSolutionCallback(long var0, Solver var2, Runnable var3);

   public static final native long Solver_makePrintModelVisitor(long var0, Solver var2);

   public static final native long Solver_makeStatisticsModelVisitor(long var0, Solver var2);

   public static final native long Solver_makeSymmetryManager__SWIG_0(long var0, Solver var2, SymmetryBreaker[] var3);

   public static final native long Solver_makeSymmetryManager__SWIG_1(long var0, Solver var2, long var3, SymmetryBreaker var5);

   public static final native long Solver_makeSymmetryManager__SWIG_2(long var0, Solver var2, long var3, SymmetryBreaker var5, long var6, SymmetryBreaker var8);

   public static final native long Solver_makeSymmetryManager__SWIG_3(long var0, Solver var2, long var3, SymmetryBreaker var5, long var6, SymmetryBreaker var8, long var9, SymmetryBreaker var11);

   public static final native long Solver_makeSymmetryManager__SWIG_4(long var0, Solver var2, long var3, SymmetryBreaker var5, long var6, SymmetryBreaker var8, long var9, SymmetryBreaker var11, long var12, SymmetryBreaker var14);

   public static final native long Solver_makeAssignVariableValue(long var0, Solver var2, long var3, IntVar var5, long var6);

   public static final native long Solver_makeVariableLessOrEqualValue(long var0, Solver var2, long var3, IntVar var5, long var6);

   public static final native long Solver_makeVariableGreaterOrEqualValue(long var0, Solver var2, long var3, IntVar var5, long var6);

   public static final native long Solver_makeSplitVariableDomain(long var0, Solver var2, long var3, IntVar var5, long var6, boolean var8);

   public static final native long Solver_makeAssignVariableValueOrFail(long var0, Solver var2, long var3, IntVar var5, long var6);

   public static final native long Solver_MakeAssignVariableValueOrDoNothing(long var0, Solver var2, long var3, IntVar var5, long var6);

   public static final native long Solver_makeAssignVariablesValues(long var0, Solver var2, IntVar[] var3, long[] var4);

   public static final native long Solver_makeFailDecision(long var0, Solver var2);

   public static final native long Solver_makeDecision(long var0, Solver var2, Consumer var3, Consumer var4);

   public static final native long Solver_compose__SWIG_0(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, DecisionBuilder var8);

   public static final native long Solver_compose__SWIG_1(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, DecisionBuilder var8, long var9, DecisionBuilder var11);

   public static final native long Solver_compose__SWIG_2(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, DecisionBuilder var8, long var9, DecisionBuilder var11, long var12, DecisionBuilder var14);

   public static final native long Solver_compose__SWIG_3(long var0, Solver var2, DecisionBuilder[] var3);

   public static final native long Solver_tryDecisions__SWIG_0(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, DecisionBuilder var8);

   public static final native long Solver_tryDecisions__SWIG_1(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, DecisionBuilder var8, long var9, DecisionBuilder var11);

   public static final native long Solver_tryDecisions__SWIG_2(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, DecisionBuilder var8, long var9, DecisionBuilder var11, long var12, DecisionBuilder var14);

   public static final native long Solver_tryDecisions__SWIG_3(long var0, Solver var2, DecisionBuilder[] var3);

   public static final native long Solver_makePhase__SWIG_0(long var0, Solver var2, IntVar[] var3, int var4, int var5);

   public static final native long Solver_makePhase__SWIG_1(long var0, Solver var2, IntVar[] var3, LongUnaryOperator var4, int var5);

   public static final native long Solver_makePhase__SWIG_2(long var0, Solver var2, IntVar[] var3, int var4, LongBinaryOperator var5);

   public static final native long Solver_makePhase__SWIG_3(long var0, Solver var2, IntVar[] var3, int var4, LongTernaryPredicate var5);

   public static final native long Solver_makePhase__SWIG_4(long var0, Solver var2, IntVar[] var3, LongUnaryOperator var4, LongBinaryOperator var5);

   public static final native long Solver_makePhase__SWIG_5(long var0, Solver var2, IntVar[] var3, int var4, LongBinaryOperator var5, LongUnaryOperator var6);

   public static final native long Solver_makePhase__SWIG_6(long var0, Solver var2, IntVar[] var3, LongUnaryOperator var4, LongBinaryOperator var5, LongUnaryOperator var6);

   public static final native long Solver_makeDefaultPhase__SWIG_0(long var0, Solver var2, IntVar[] var3);

   public static final native long Solver_makeDefaultPhase__SWIG_1(long var0, Solver var2, IntVar[] var3, long var4, DefaultPhaseParameters var6);

   public static final native long Solver_makePhase__SWIG_7(long var0, Solver var2, long var3, IntVar var5, int var6, int var7);

   public static final native long Solver_makePhase__SWIG_8(long var0, Solver var2, long var3, IntVar var5, long var6, IntVar var8, int var9, int var10);

   public static final native long Solver_makePhase__SWIG_9(long var0, Solver var2, long var3, IntVar var5, long var6, IntVar var8, long var9, IntVar var11, int var12, int var13);

   public static final native long Solver_makePhase__SWIG_10(long var0, Solver var2, long var3, IntVar var5, long var6, IntVar var8, long var9, IntVar var11, long var12, IntVar var14, int var15, int var16);

   public static final native long Solver_makeScheduleOrPostpone(long var0, Solver var2, long var3, IntervalVar var5, long var6, long[] var8);

   public static final native long Solver_makeScheduleOrExpedite(long var0, Solver var2, long var3, IntervalVar var5, long var6, long[] var8);

   public static final native long Solver_makeRankFirstInterval(long var0, Solver var2, long var3, SequenceVar var5, int var6);

   public static final native long Solver_makeRankLastInterval(long var0, Solver var2, long var3, SequenceVar var5, int var6);

   public static final native long Solver_makePhase__SWIG_11(long var0, Solver var2, IntVar[] var3, LongBinaryOperator var4, int var5);

   public static final native long Solver_makePhase__SWIG_12(long var0, Solver var2, IntVar[] var3, LongBinaryOperator var4, LongUnaryOperator var5, int var6);

   public static final native long Solver_makePhase__SWIG_13(long var0, Solver var2, IntervalVar[] var3, int var4);

   public static final native long Solver_makePhase__SWIG_14(long var0, Solver var2, SequenceVar[] var3, int var4);

   public static final native long Solver_makeDecisionBuilderFromAssignment(long var0, Solver var2, long var3, Assignment var5, long var6, DecisionBuilder var8, IntVar[] var9);

   public static final native long Solver_makeConstraintAdder(long var0, Solver var2, long var3, Constraint var5);

   public static final native long Solver_makeSolveOnce__SWIG_0(long var0, Solver var2, long var3, DecisionBuilder var5);

   public static final native long Solver_makeSolveOnce__SWIG_1(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8);

   public static final native long Solver_makeSolveOnce__SWIG_2(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8, long var9, SearchMonitor var11);

   public static final native long Solver_makeSolveOnce__SWIG_3(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8, long var9, SearchMonitor var11, long var12, SearchMonitor var14);

   public static final native long Solver_makeSolveOnce__SWIG_4(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, SearchMonitor var8, long var9, SearchMonitor var11, long var12, SearchMonitor var14, long var15, SearchMonitor var17);

   public static final native long Solver_makeSolveOnce__SWIG_5(long var0, Solver var2, long var3, DecisionBuilder var5, SearchMonitor[] var6);

   public static final native long Solver_makeNestedOptimize__SWIG_0(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, Assignment var8, boolean var9, long var10);

   public static final native long Solver_makeNestedOptimize__SWIG_1(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, Assignment var8, boolean var9, long var10, long var12, SearchMonitor var14);

   public static final native long Solver_makeNestedOptimize__SWIG_2(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, Assignment var8, boolean var9, long var10, long var12, SearchMonitor var14, long var15, SearchMonitor var17);

   public static final native long Solver_makeNestedOptimize__SWIG_3(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, Assignment var8, boolean var9, long var10, long var12, SearchMonitor var14, long var15, SearchMonitor var17, long var18, SearchMonitor var20);

   public static final native long Solver_makeNestedOptimize__SWIG_4(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, Assignment var8, boolean var9, long var10, long var12, SearchMonitor var14, long var15, SearchMonitor var17, long var18, SearchMonitor var20, long var21, SearchMonitor var23);

   public static final native long Solver_makeNestedOptimize__SWIG_5(long var0, Solver var2, long var3, DecisionBuilder var5, long var6, Assignment var8, boolean var9, long var10, SearchMonitor[] var12);

   public static final native long Solver_makeRestoreAssignment(long var0, Solver var2, long var3, Assignment var5);

   public static final native long Solver_makeStoreAssignment(long var0, Solver var2, long var3, Assignment var5);

   public static final native long Solver_makeOperator__SWIG_0(long var0, Solver var2, IntVar[] var3, int var4);

   public static final native long Solver_makeOperator__SWIG_1(long var0, Solver var2, IntVar[] var3, IntVar[] var4, int var5);

   public static final native long Solver_makeOperator__SWIG_2(long var0, Solver var2, IntVar[] var3, LongTernaryOperator var4, int var5);

   public static final native long Solver_makeOperator__SWIG_3(long var0, Solver var2, IntVar[] var3, IntVar[] var4, LongTernaryOperator var5, int var6);

   public static final native long Solver_makeRandomLnsOperator__SWIG_0(long var0, Solver var2, IntVar[] var3, int var4);

   public static final native long Solver_makeRandomLnsOperator__SWIG_1(long var0, Solver var2, IntVar[] var3, int var4, int var5);

   public static final native long Solver_makeMoveTowardTargetOperator__SWIG_0(long var0, Solver var2, long var3, Assignment var5);

   public static final native long Solver_makeMoveTowardTargetOperator__SWIG_1(long var0, Solver var2, IntVar[] var3, long[] var4);

   public static final native long Solver_concatenateOperators__SWIG_0(long var0, Solver var2, LocalSearchOperator[] var3);

   public static final native long Solver_concatenateOperators__SWIG_1(long var0, Solver var2, LocalSearchOperator[] var3, boolean var4);

   public static final native long Solver_concatenateOperators__SWIG_2(long var0, Solver var2, LocalSearchOperator[] var3, IntIntToLongFunction var4);

   public static final native long Solver_randomConcatenateOperators__SWIG_0(long var0, Solver var2, LocalSearchOperator[] var3);

   public static final native long Solver_randomConcatenateOperators__SWIG_1(long var0, Solver var2, LocalSearchOperator[] var3, int var4);

   public static final native long Solver_makeNeighborhoodLimit(long var0, Solver var2, long var3, LocalSearchOperator var5, long var6);

   public static final native long Solver_makeLocalSearchPhase__SWIG_0(long var0, Solver var2, long var3, Assignment var5, long var6, LocalSearchPhaseParameters var8);

   public static final native long Solver_makeLocalSearchPhase__SWIG_1(long var0, Solver var2, IntVar[] var3, long var4, DecisionBuilder var6, long var7, LocalSearchPhaseParameters var9);

   public static final native long Solver_makeLocalSearchPhase__SWIG_2(long var0, Solver var2, IntVar[] var3, long var4, DecisionBuilder var6, long var7, DecisionBuilder var9, long var10, LocalSearchPhaseParameters var12);

   public static final native long Solver_makeLocalSearchPhase__SWIG_3(long var0, Solver var2, SequenceVar[] var3, long var4, DecisionBuilder var6, long var7, LocalSearchPhaseParameters var9);

   public static final native long Solver_makeDefaultSolutionPool(long var0, Solver var2);

   public static final native long Solver_makeLocalSearchPhaseParameters__SWIG_0(long var0, Solver var2, long var3, IntVar var5, long var6, LocalSearchOperator var8, long var9, DecisionBuilder var11);

   public static final native long Solver_makeLocalSearchPhaseParameters__SWIG_1(long var0, Solver var2, long var3, IntVar var5, long var6, LocalSearchOperator var8, long var9, DecisionBuilder var11, long var12, RegularLimit var14);

   public static final native long Solver_makeLocalSearchPhaseParameters__SWIG_2(long var0, Solver var2, long var3, IntVar var5, long var6, LocalSearchOperator var8, long var9, DecisionBuilder var11, long var12, RegularLimit var14, LocalSearchFilter[] var15);

   public static final native long Solver_makeLocalSearchPhaseParameters__SWIG_3(long var0, Solver var2, long var3, IntVar var5, long var6, SolutionPool var8, long var9, LocalSearchOperator var11, long var12, DecisionBuilder var14);

   public static final native long Solver_makeLocalSearchPhaseParameters__SWIG_4(long var0, Solver var2, long var3, IntVar var5, long var6, SolutionPool var8, long var9, LocalSearchOperator var11, long var12, DecisionBuilder var14, long var15, RegularLimit var17);

   public static final native long Solver_makeLocalSearchPhaseParameters__SWIG_5(long var0, Solver var2, long var3, IntVar var5, long var6, SolutionPool var8, long var9, LocalSearchOperator var11, long var12, DecisionBuilder var14, long var15, RegularLimit var17, LocalSearchFilter[] var18);

   public static final native long Solver_MakeAcceptFilter(long var0, Solver var2);

   public static final native long Solver_MakeRejectFilter(long var0, Solver var2);

   public static final native long Solver_makeVariableDomainFilter(long var0, Solver var2);

   public static final native long Solver_makeSumObjectiveFilter__SWIG_0(long var0, Solver var2, IntVar[] var3, LongBinaryOperator var4, int var5);

   public static final native long Solver_makeSumObjectiveFilter__SWIG_1(long var0, Solver var2, IntVar[] var3, IntVar[] var4, LongTernaryOperator var5, int var6);

   public static final native void Solver_topPeriodicCheck(long var0, Solver var2);

   public static final native int Solver_topProgressPercent(long var0, Solver var2);

   public static final native void Solver_pushState(long var0, Solver var2);

   public static final native void Solver_popState(long var0, Solver var2);

   public static final native int Solver_searchDepth(long var0, Solver var2);

   public static final native int Solver_searchLeftDepth(long var0, Solver var2);

   public static final native int Solver_solveDepth(long var0, Solver var2);

   public static final native long Solver_rand64(long var0, Solver var2, long var3);

   public static final native int Solver_rand32(long var0, Solver var2, int var3);

   public static final native void Solver_reSeed(long var0, Solver var2, int var3);

   public static final native void Solver_exportProfilingOverview(long var0, Solver var2, String var3);

   public static final native String Solver_localSearchProfile(long var0, Solver var2);

   public static final native boolean Solver_currentlyInSolve(long var0, Solver var2);

   public static final native int Solver_constraints(long var0, Solver var2);

   public static final native void Solver_accept(long var0, Solver var2, long var3, ModelVisitor var5);

   public static final native long Solver_balancing_decision(long var0, Solver var2);

   public static final native void Solver_clear_fail_intercept(long var0, Solver var2);

   public static final native void Solver_SetUseFastLocalSearch(long var0, Solver var2, boolean var3);

   public static final native boolean Solver_UseFastLocalSearch(long var0, Solver var2);

   public static final native boolean Solver_hasName(long var0, Solver var2, long var3, PropagationBaseObject var5);

   public static final native long Solver_registerDemon(long var0, Solver var2, long var3, Demon var5);

   public static final native long Solver_registerIntExpr(long var0, Solver var2, long var3, IntExpr var5);

   public static final native long Solver_registerIntVar(long var0, Solver var2, long var3, IntVar var5);

   public static final native long Solver_registerIntervalVar(long var0, Solver var2, long var3, IntervalVar var5);

   public static final native long Solver_cache(long var0, Solver var2);

   public static final native boolean Solver_instrumentsDemons(long var0, Solver var2);

   public static final native boolean Solver_isProfilingEnabled(long var0, Solver var2);

   public static final native boolean Solver_isLocalSearchProfilingEnabled(long var0, Solver var2);

   public static final native boolean Solver_instrumentsVariables(long var0, Solver var2);

   public static final native boolean Solver_nameAllVariables(long var0, Solver var2);

   public static final native String Solver_model_name(long var0, Solver var2);

   public static final native long Solver_getPropagationMonitor(long var0, Solver var2);

   public static final native void Solver_addPropagationMonitor(long var0, Solver var2, long var3, PropagationMonitor var5);

   public static final native long Solver_getLocalSearchMonitor(long var0, Solver var2);

   public static final native void Solver_addLocalSearchMonitor(long var0, Solver var2, long var3, LocalSearchMonitor var5);

   public static final native long Solver_GetOrCreateLocalSearchState(long var0, Solver var2);

   public static final native void Solver_ClearLocalSearchState(long var0, Solver var2);

   public static final native void Solver_tmp_vector__set(long var0, Solver var2, long[] var3);

   public static final native long[] Solver_tmp_vector__get(long var0, Solver var2);

   public static final native long Solver_castExpression(long var0, Solver var2, long var3, IntVar var5);

   public static final native void Solver_finishCurrentSearch(long var0, Solver var2);

   public static final native void Solver_restartCurrentSearch(long var0, Solver var2);

   public static final native void Solver_shouldFail(long var0, Solver var2);

   public static final native void Solver_checkFail(long var0, Solver var2);

   public static final native long zero();

   public static final native long One();

   public static final native long new_BaseObject();

   public static final native void delete_BaseObject(long var0);

   public static final native String BaseObject_toString(long var0, BaseObject var2);

   public static final native long new_PropagationBaseObject(long var0, Solver var2);

   public static final native void delete_PropagationBaseObject(long var0);

   public static final native String PropagationBaseObject_toString(long var0, PropagationBaseObject var2);

   public static final native long PropagationBaseObject_solver(long var0, PropagationBaseObject var2);

   public static final native void PropagationBaseObject_freezeQueue(long var0, PropagationBaseObject var2);

   public static final native void PropagationBaseObject_unfreezeQueue(long var0, PropagationBaseObject var2);

   public static final native void PropagationBaseObject_enqueueDelayedDemon(long var0, PropagationBaseObject var2, long var3, Demon var5);

   public static final native void PropagationBaseObject_enqueueVar(long var0, PropagationBaseObject var2, long var3, Demon var5);

   public static final native void PropagationBaseObject_reset_action_on_fail(long var0, PropagationBaseObject var2);

   public static final native void PropagationBaseObject_set_variable_to_clean_on_fail(long var0, PropagationBaseObject var2, long var3, IntVar var5);

   public static final native String PropagationBaseObject_name(long var0, PropagationBaseObject var2);

   public static final native void PropagationBaseObject_setName(long var0, PropagationBaseObject var2, String var3);

   public static final native boolean PropagationBaseObject_hasName(long var0, PropagationBaseObject var2);

   public static final native String PropagationBaseObject_baseName(long var0, PropagationBaseObject var2);

   public static final native long new_Decision();

   public static final native void delete_Decision(long var0);

   public static final native void Decision_apply(long var0, Decision var2, long var3, Solver var5);

   public static final native void Decision_refute(long var0, Decision var2, long var3, Solver var5);

   public static final native String Decision_toString(long var0, Decision var2);

   public static final native String Decision_toStringSwigExplicitDecision(long var0, Decision var2);

   public static final native void Decision_accept(long var0, Decision var2, long var3, DecisionVisitor var5);

   public static final native void Decision_acceptSwigExplicitDecision(long var0, Decision var2, long var3, DecisionVisitor var5);

   public static final native void Decision_director_connect(Decision var0, long var1, boolean var3, boolean var4);

   public static final native void Decision_change_ownership(Decision var0, long var1, boolean var3);

   public static final native long new_DecisionVisitor();

   public static final native void delete_DecisionVisitor(long var0);

   public static final native void DecisionVisitor_visitSetVariableValue(long var0, DecisionVisitor var2, long var3, IntVar var5, long var6);

   public static final native void DecisionVisitor_visitSetVariableValueSwigExplicitDecisionVisitor(long var0, DecisionVisitor var2, long var3, IntVar var5, long var6);

   public static final native void DecisionVisitor_visitSplitVariableDomain(long var0, DecisionVisitor var2, long var3, IntVar var5, long var6, boolean var8);

   public static final native void DecisionVisitor_visitSplitVariableDomainSwigExplicitDecisionVisitor(long var0, DecisionVisitor var2, long var3, IntVar var5, long var6, boolean var8);

   public static final native void DecisionVisitor_visitScheduleOrPostpone(long var0, DecisionVisitor var2, long var3, IntervalVar var5, long var6);

   public static final native void DecisionVisitor_visitScheduleOrPostponeSwigExplicitDecisionVisitor(long var0, DecisionVisitor var2, long var3, IntervalVar var5, long var6);

   public static final native void DecisionVisitor_visitScheduleOrExpedite(long var0, DecisionVisitor var2, long var3, IntervalVar var5, long var6);

   public static final native void DecisionVisitor_visitScheduleOrExpediteSwigExplicitDecisionVisitor(long var0, DecisionVisitor var2, long var3, IntervalVar var5, long var6);

   public static final native void DecisionVisitor_visitRankFirstInterval(long var0, DecisionVisitor var2, long var3, SequenceVar var5, int var6);

   public static final native void DecisionVisitor_visitRankFirstIntervalSwigExplicitDecisionVisitor(long var0, DecisionVisitor var2, long var3, SequenceVar var5, int var6);

   public static final native void DecisionVisitor_visitRankLastInterval(long var0, DecisionVisitor var2, long var3, SequenceVar var5, int var6);

   public static final native void DecisionVisitor_visitRankLastIntervalSwigExplicitDecisionVisitor(long var0, DecisionVisitor var2, long var3, SequenceVar var5, int var6);

   public static final native void DecisionVisitor_visitUnknownDecision(long var0, DecisionVisitor var2);

   public static final native void DecisionVisitor_visitUnknownDecisionSwigExplicitDecisionVisitor(long var0, DecisionVisitor var2);

   public static final native void DecisionVisitor_director_connect(DecisionVisitor var0, long var1, boolean var3, boolean var4);

   public static final native void DecisionVisitor_change_ownership(DecisionVisitor var0, long var1, boolean var3);

   public static final native long new_DecisionBuilder();

   public static final native void delete_DecisionBuilder(long var0);

   public static final native long DecisionBuilder_nextWrap(long var0, DecisionBuilder var2, long var3, Solver var5);

   public static final native String DecisionBuilder_toString(long var0, DecisionBuilder var2);

   public static final native String DecisionBuilder_toStringSwigExplicitDecisionBuilder(long var0, DecisionBuilder var2);

   public static final native void DecisionBuilder_director_connect(DecisionBuilder var0, long var1, boolean var3, boolean var4);

   public static final native void DecisionBuilder_change_ownership(DecisionBuilder var0, long var1, boolean var3);

   public static final native void delete_Demon(long var0);

   public static final native void Demon_run(long var0, Demon var2, long var3, Solver var5);

   public static final native int Demon_priority(long var0, Demon var2);

   public static final native String Demon_toString(long var0, Demon var2);

   public static final native void Demon_inhibit(long var0, Demon var2, long var3, Solver var5);

   public static final native void Demon_desinhibit(long var0, Demon var2, long var3, Solver var5);

   public static final native String ModelVisitor_kAbs_get();

   public static final native String ModelVisitor_kAbsEqual_get();

   public static final native String ModelVisitor_kAllDifferent_get();

   public static final native String ModelVisitor_kAllowedAssignments_get();

   public static final native String ModelVisitor_kAtMost_get();

   public static final native String ModelVisitor_kIndexOf_get();

   public static final native String ModelVisitor_kBetween_get();

   public static final native String ModelVisitor_kConditionalExpr_get();

   public static final native String ModelVisitor_kCircuit_get();

   public static final native String ModelVisitor_kConvexPiecewise_get();

   public static final native String ModelVisitor_kCountEqual_get();

   public static final native String ModelVisitor_kCover_get();

   public static final native String ModelVisitor_kCumulative_get();

   public static final native String ModelVisitor_kDeviation_get();

   public static final native String ModelVisitor_kDifference_get();

   public static final native String ModelVisitor_kDisjunctive_get();

   public static final native String ModelVisitor_kDistribute_get();

   public static final native String ModelVisitor_kDivide_get();

   public static final native String ModelVisitor_kDurationExpr_get();

   public static final native String ModelVisitor_kElement_get();

   public static final native String ModelVisitor_kElementEqual_get();

   public static final native String ModelVisitor_kEndExpr_get();

   public static final native String ModelVisitor_kEquality_get();

   public static final native String ModelVisitor_kFalseConstraint_get();

   public static final native String ModelVisitor_kGlobalCardinality_get();

   public static final native String ModelVisitor_kGreater_get();

   public static final native String ModelVisitor_kGreaterOrEqual_get();

   public static final native String ModelVisitor_kIntegerVariable_get();

   public static final native String ModelVisitor_kIntervalBinaryRelation_get();

   public static final native String ModelVisitor_kIntervalDisjunction_get();

   public static final native String ModelVisitor_kIntervalUnaryRelation_get();

   public static final native String ModelVisitor_kIntervalVariable_get();

   public static final native String ModelVisitor_kInversePermutation_get();

   public static final native String ModelVisitor_kIsBetween_get();

   public static final native String ModelVisitor_kIsDifferent_get();

   public static final native String ModelVisitor_kIsEqual_get();

   public static final native String ModelVisitor_kIsGreater_get();

   public static final native String ModelVisitor_kIsGreaterOrEqual_get();

   public static final native String ModelVisitor_kIsLess_get();

   public static final native String ModelVisitor_kIsLessOrEqual_get();

   public static final native String ModelVisitor_kIsMember_get();

   public static final native String ModelVisitor_kLess_get();

   public static final native String ModelVisitor_kLessOrEqual_get();

   public static final native String ModelVisitor_kLexLess_get();

   public static final native String ModelVisitor_kLinkExprVar_get();

   public static final native String ModelVisitor_kMapDomain_get();

   public static final native String ModelVisitor_kMax_get();

   public static final native String ModelVisitor_kMaxEqual_get();

   public static final native String ModelVisitor_kMember_get();

   public static final native String ModelVisitor_kMin_get();

   public static final native String ModelVisitor_kMinEqual_get();

   public static final native String ModelVisitor_kModulo_get();

   public static final native String ModelVisitor_kNoCycle_get();

   public static final native String ModelVisitor_kNonEqual_get();

   public static final native String ModelVisitor_kNotBetween_get();

   public static final native String ModelVisitor_kNotMember_get();

   public static final native String ModelVisitor_kNullIntersect_get();

   public static final native String ModelVisitor_kOpposite_get();

   public static final native String ModelVisitor_kPack_get();

   public static final native String ModelVisitor_kPathCumul_get();

   public static final native String ModelVisitor_kDelayedPathCumul_get();

   public static final native String ModelVisitor_kPerformedExpr_get();

   public static final native String ModelVisitor_kPower_get();

   public static final native String ModelVisitor_kProduct_get();

   public static final native String ModelVisitor_kScalProd_get();

   public static final native String ModelVisitor_kScalProdEqual_get();

   public static final native String ModelVisitor_kScalProdGreaterOrEqual_get();

   public static final native String ModelVisitor_kScalProdLessOrEqual_get();

   public static final native String ModelVisitor_kSemiContinuous_get();

   public static final native String ModelVisitor_kSequenceVariable_get();

   public static final native String ModelVisitor_kSortingConstraint_get();

   public static final native String ModelVisitor_kSquare_get();

   public static final native String ModelVisitor_kStartExpr_get();

   public static final native String ModelVisitor_kSum_get();

   public static final native String ModelVisitor_kSumEqual_get();

   public static final native String ModelVisitor_kSumGreaterOrEqual_get();

   public static final native String ModelVisitor_kSumLessOrEqual_get();

   public static final native String ModelVisitor_kTrace_get();

   public static final native String ModelVisitor_kTransition_get();

   public static final native String ModelVisitor_kTrueConstraint_get();

   public static final native String ModelVisitor_kVarBoundWatcher_get();

   public static final native String ModelVisitor_kVarValueWatcher_get();

   public static final native String ModelVisitor_kCountAssignedItemsExtension_get();

   public static final native String ModelVisitor_kCountUsedBinsExtension_get();

   public static final native String ModelVisitor_kInt64ToBoolExtension_get();

   public static final native String ModelVisitor_kInt64ToInt64Extension_get();

   public static final native String ModelVisitor_kObjectiveExtension_get();

   public static final native String ModelVisitor_kSearchLimitExtension_get();

   public static final native String ModelVisitor_kUsageEqualVariableExtension_get();

   public static final native String ModelVisitor_kUsageLessConstantExtension_get();

   public static final native String ModelVisitor_kVariableGroupExtension_get();

   public static final native String ModelVisitor_kVariableUsageLessConstantExtension_get();

   public static final native String ModelVisitor_kWeightedSumOfAssignedEqualVariableExtension_get();

   public static final native String ModelVisitor_kActiveArgument_get();

   public static final native String ModelVisitor_kAssumePathsArgument_get();

   public static final native String ModelVisitor_kBranchesLimitArgument_get();

   public static final native String ModelVisitor_kCapacityArgument_get();

   public static final native String ModelVisitor_kCardsArgument_get();

   public static final native String ModelVisitor_kCoefficientsArgument_get();

   public static final native String ModelVisitor_kCountArgument_get();

   public static final native String ModelVisitor_kCumulativeArgument_get();

   public static final native String ModelVisitor_kCumulsArgument_get();

   public static final native String ModelVisitor_kDemandsArgument_get();

   public static final native String ModelVisitor_kDurationMaxArgument_get();

   public static final native String ModelVisitor_kDurationMinArgument_get();

   public static final native String ModelVisitor_kEarlyCostArgument_get();

   public static final native String ModelVisitor_kEarlyDateArgument_get();

   public static final native String ModelVisitor_kEndMaxArgument_get();

   public static final native String ModelVisitor_kEndMinArgument_get();

   public static final native String ModelVisitor_kEndsArgument_get();

   public static final native String ModelVisitor_kExpressionArgument_get();

   public static final native String ModelVisitor_kFailuresLimitArgument_get();

   public static final native String ModelVisitor_kFinalStatesArgument_get();

   public static final native String ModelVisitor_kFixedChargeArgument_get();

   public static final native String ModelVisitor_kIndex2Argument_get();

   public static final native String ModelVisitor_kIndexArgument_get();

   public static final native String ModelVisitor_kInitialState_get();

   public static final native String ModelVisitor_kIntervalArgument_get();

   public static final native String ModelVisitor_kIntervalsArgument_get();

   public static final native String ModelVisitor_kLateCostArgument_get();

   public static final native String ModelVisitor_kLateDateArgument_get();

   public static final native String ModelVisitor_kLeftArgument_get();

   public static final native String ModelVisitor_kMaxArgument_get();

   public static final native String ModelVisitor_kMaximizeArgument_get();

   public static final native String ModelVisitor_kMinArgument_get();

   public static final native String ModelVisitor_kModuloArgument_get();

   public static final native String ModelVisitor_kNextsArgument_get();

   public static final native String ModelVisitor_kOptionalArgument_get();

   public static final native String ModelVisitor_kPartialArgument_get();

   public static final native String ModelVisitor_kPositionXArgument_get();

   public static final native String ModelVisitor_kPositionYArgument_get();

   public static final native String ModelVisitor_kRangeArgument_get();

   public static final native String ModelVisitor_kRelationArgument_get();

   public static final native String ModelVisitor_kRightArgument_get();

   public static final native String ModelVisitor_kSequenceArgument_get();

   public static final native String ModelVisitor_kSequencesArgument_get();

   public static final native String ModelVisitor_kSizeArgument_get();

   public static final native String ModelVisitor_kSizeXArgument_get();

   public static final native String ModelVisitor_kSizeYArgument_get();

   public static final native String ModelVisitor_kSmartTimeCheckArgument_get();

   public static final native String ModelVisitor_kSolutionLimitArgument_get();

   public static final native String ModelVisitor_kStartMaxArgument_get();

   public static final native String ModelVisitor_kStartMinArgument_get();

   public static final native String ModelVisitor_kStartsArgument_get();

   public static final native String ModelVisitor_kStepArgument_get();

   public static final native String ModelVisitor_kTargetArgument_get();

   public static final native String ModelVisitor_kTimeLimitArgument_get();

   public static final native String ModelVisitor_kTransitsArgument_get();

   public static final native String ModelVisitor_kTuplesArgument_get();

   public static final native String ModelVisitor_kValueArgument_get();

   public static final native String ModelVisitor_kValuesArgument_get();

   public static final native String ModelVisitor_kVariableArgument_get();

   public static final native String ModelVisitor_kVarsArgument_get();

   public static final native String ModelVisitor_kEvaluatorArgument_get();

   public static final native String ModelVisitor_kMirrorOperation_get();

   public static final native String ModelVisitor_kRelaxedMaxOperation_get();

   public static final native String ModelVisitor_kRelaxedMinOperation_get();

   public static final native String ModelVisitor_kSumOperation_get();

   public static final native String ModelVisitor_kDifferenceOperation_get();

   public static final native String ModelVisitor_kProductOperation_get();

   public static final native String ModelVisitor_kStartSyncOnStartOperation_get();

   public static final native String ModelVisitor_kStartSyncOnEndOperation_get();

   public static final native String ModelVisitor_kTraceOperation_get();

   public static final native void delete_ModelVisitor(long var0);

   public static final native void ModelVisitor_beginVisitModel(long var0, ModelVisitor var2, String var3);

   public static final native void ModelVisitor_endVisitModel(long var0, ModelVisitor var2, String var3);

   public static final native void ModelVisitor_beginVisitConstraint(long var0, ModelVisitor var2, String var3, long var4, Constraint var6);

   public static final native void ModelVisitor_endVisitConstraint(long var0, ModelVisitor var2, String var3, long var4, Constraint var6);

   public static final native void ModelVisitor_beginVisitExtension(long var0, ModelVisitor var2, String var3);

   public static final native void ModelVisitor_endVisitExtension(long var0, ModelVisitor var2, String var3);

   public static final native void ModelVisitor_beginVisitIntegerExpression(long var0, ModelVisitor var2, String var3, long var4, IntExpr var6);

   public static final native void ModelVisitor_endVisitIntegerExpression(long var0, ModelVisitor var2, String var3, long var4, IntExpr var6);

   public static final native void ModelVisitor_visitIntegerVariable__SWIG_0(long var0, ModelVisitor var2, long var3, IntVar var5, long var6, IntExpr var8);

   public static final native void ModelVisitor_visitIntegerVariable__SWIG_1(long var0, ModelVisitor var2, long var3, IntVar var5, String var6, long var7, long var9, IntVar var11);

   public static final native void ModelVisitor_visitIntervalVariable(long var0, ModelVisitor var2, long var3, IntervalVar var5, String var6, long var7, long var9, IntervalVar var11);

   public static final native void ModelVisitor_visitSequenceVariable(long var0, ModelVisitor var2, long var3, SequenceVar var5);

   public static final native void ModelVisitor_visitIntegerArgument(long var0, ModelVisitor var2, String var3, long var4);

   public static final native void ModelVisitor_visitIntegerArrayArgument(long var0, ModelVisitor var2, String var3, long[] var4);

   public static final native void ModelVisitor_visitIntegerMatrixArgument(long var0, ModelVisitor var2, String var3, long var4, IntTupleSet var6);

   public static final native void ModelVisitor_visitIntegerExpressionArgument(long var0, ModelVisitor var2, String var3, long var4, IntExpr var6);

   public static final native void ModelVisitor_visitIntegerVariableArrayArgument(long var0, ModelVisitor var2, String var3, IntVar[] var4);

   public static final native void ModelVisitor_visitIntervalArgument(long var0, ModelVisitor var2, String var3, long var4, IntervalVar var6);

   public static final native void ModelVisitor_visitIntervalArrayArgument(long var0, ModelVisitor var2, String var3, IntervalVar[] var4);

   public static final native void ModelVisitor_visitSequenceArgument(long var0, ModelVisitor var2, String var3, long var4, SequenceVar var6);

   public static final native void ModelVisitor_visitSequenceArrayArgument(long var0, ModelVisitor var2, String var3, SequenceVar[] var4);

   public static final native long new_ModelVisitor();

   public static final native void delete_Constraint(long var0);

   public static final native void Constraint_post(long var0, Constraint var2);

   public static final native void Constraint_initialPropagate(long var0, Constraint var2);

   public static final native String Constraint_toString(long var0, Constraint var2);

   public static final native void Constraint_postAndPropagate(long var0, Constraint var2);

   public static final native void Constraint_accept(long var0, Constraint var2, long var3, ModelVisitor var5);

   public static final native boolean Constraint_isCastConstraint(long var0, Constraint var2);

   public static final native long Constraint_var(long var0, Constraint var2);

   public static final native void delete_CastConstraint(long var0);

   public static final native long CastConstraint_target_var(long var0, CastConstraint var2);

   public static final native int SearchMonitor_kNoProgress_get();

   public static final native long new_SearchMonitor(long var0, Solver var2);

   public static final native void delete_SearchMonitor(long var0);

   public static final native void SearchMonitor_enterSearch(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_enterSearchSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_restartSearch(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_restartSearchSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_exitSearch(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_exitSearchSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_beginNextDecision(long var0, SearchMonitor var2, long var3, DecisionBuilder var5);

   public static final native void SearchMonitor_beginNextDecisionSwigExplicitSearchMonitor(long var0, SearchMonitor var2, long var3, DecisionBuilder var5);

   public static final native void SearchMonitor_endNextDecision(long var0, SearchMonitor var2, long var3, DecisionBuilder var5, long var6, Decision var8);

   public static final native void SearchMonitor_endNextDecisionSwigExplicitSearchMonitor(long var0, SearchMonitor var2, long var3, DecisionBuilder var5, long var6, Decision var8);

   public static final native void SearchMonitor_applyDecision(long var0, SearchMonitor var2, long var3, Decision var5);

   public static final native void SearchMonitor_applyDecisionSwigExplicitSearchMonitor(long var0, SearchMonitor var2, long var3, Decision var5);

   public static final native void SearchMonitor_refuteDecision(long var0, SearchMonitor var2, long var3, Decision var5);

   public static final native void SearchMonitor_refuteDecisionSwigExplicitSearchMonitor(long var0, SearchMonitor var2, long var3, Decision var5);

   public static final native void SearchMonitor_afterDecision(long var0, SearchMonitor var2, long var3, Decision var5, boolean var6);

   public static final native void SearchMonitor_afterDecisionSwigExplicitSearchMonitor(long var0, SearchMonitor var2, long var3, Decision var5, boolean var6);

   public static final native void SearchMonitor_beginFail(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_beginFailSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_endFail(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_endFailSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_beginInitialPropagation(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_beginInitialPropagationSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_endInitialPropagation(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_endInitialPropagationSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native boolean SearchMonitor_acceptSolution(long var0, SearchMonitor var2);

   public static final native boolean SearchMonitor_acceptSolutionSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native boolean SearchMonitor_atSolution(long var0, SearchMonitor var2);

   public static final native boolean SearchMonitor_atSolutionSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_noMoreSolutions(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_noMoreSolutionsSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native boolean SearchMonitor_localOptimum(long var0, SearchMonitor var2);

   public static final native boolean SearchMonitor_localOptimumSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native boolean SearchMonitor_acceptDelta(long var0, SearchMonitor var2, long var3, Assignment var5, long var6, Assignment var8);

   public static final native boolean SearchMonitor_acceptDeltaSwigExplicitSearchMonitor(long var0, SearchMonitor var2, long var3, Assignment var5, long var6, Assignment var8);

   public static final native void SearchMonitor_acceptNeighbor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_acceptNeighborSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_AcceptUncheckedNeighbor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_AcceptUncheckedNeighborSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native boolean SearchMonitor_IsUncheckedSolutionLimitReached(long var0, SearchMonitor var2);

   public static final native boolean SearchMonitor_IsUncheckedSolutionLimitReachedSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native long SearchMonitor_solver(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_periodicCheck(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_periodicCheckSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native int SearchMonitor_progressPercent(long var0, SearchMonitor var2);

   public static final native int SearchMonitor_progressPercentSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_accept(long var0, SearchMonitor var2, long var3, ModelVisitor var5);

   public static final native void SearchMonitor_acceptSwigExplicitSearchMonitor(long var0, SearchMonitor var2, long var3, ModelVisitor var5);

   public static final native void SearchMonitor_install(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_installSwigExplicitSearchMonitor(long var0, SearchMonitor var2);

   public static final native void SearchMonitor_director_connect(SearchMonitor var0, long var1, boolean var3, boolean var4);

   public static final native void SearchMonitor_change_ownership(SearchMonitor var0, long var1, boolean var3);

   public static final native void delete_IntExpr(long var0);

   public static final native long IntExpr_min(long var0, IntExpr var2);

   public static final native void IntExpr_setMin(long var0, IntExpr var2, long var3);

   public static final native long IntExpr_max(long var0, IntExpr var2);

   public static final native void IntExpr_setMax(long var0, IntExpr var2, long var3);

   public static final native void IntExpr_range(long var0, IntExpr var2, long[] var3, long[] var4);

   public static final native void IntExpr_setRange(long var0, IntExpr var2, long var3, long var5);

   public static final native void IntExpr_setValue(long var0, IntExpr var2, long var3);

   public static final native boolean IntExpr_bound(long var0, IntExpr var2);

   public static final native boolean IntExpr_isVar(long var0, IntExpr var2);

   public static final native long IntExpr_var(long var0, IntExpr var2);

   public static final native long IntExpr_varWithName(long var0, IntExpr var2, String var3);

   public static final native void IntExpr_whenRange__SWIG_0(long var0, IntExpr var2, long var3, Demon var5);

   public static final native void IntExpr_whenRange__SWIG_1(long var0, IntExpr var2, Runnable var3);

   public static final native void IntExpr_accept(long var0, IntExpr var2, long var3, ModelVisitor var5);

   public static final native void delete_IntVarIterator(long var0);

   public static final native void IntVarIterator_init(long var0, IntVarIterator var2);

   public static final native boolean IntVarIterator_ok(long var0, IntVarIterator var2);

   public static final native long IntVarIterator_value(long var0, IntVarIterator var2);

   public static final native void IntVarIterator_next(long var0, IntVarIterator var2);

   public static final native String IntVarIterator_toString(long var0, IntVarIterator var2);

   public static final native void delete_IntVar(long var0);

   public static final native boolean IntVar_isVar(long var0, IntVar var2);

   public static final native long IntVar_var(long var0, IntVar var2);

   public static final native long IntVar_value(long var0, IntVar var2);

   public static final native void IntVar_removeValue(long var0, IntVar var2, long var3);

   public static final native void IntVar_removeInterval(long var0, IntVar var2, long var3, long var5);

   public static final native void IntVar_removeValues(long var0, IntVar var2, long[] var3);

   public static final native void IntVar_setValue(long var0, IntVar var2, long[] var3);

   public static final native void IntVar_whenBound__SWIG_0(long var0, IntVar var2, long var3, Demon var5);

   public static final native void IntVar_whenBound__SWIG_1(long var0, IntVar var2, Runnable var3);

   public static final native void IntVar_whenDomain__SWIG_0(long var0, IntVar var2, long var3, Demon var5);

   public static final native void IntVar_whenDomain__SWIG_1(long var0, IntVar var2, Runnable var3);

   public static final native BigInteger IntVar_size(long var0, IntVar var2);

   public static final native boolean IntVar_contains(long var0, IntVar var2, long var3);

   public static final native long IntVar_makeHoleIterator(long var0, IntVar var2, boolean var3);

   public static final native long IntVar_makeDomainIterator(long var0, IntVar var2, boolean var3);

   public static final native long IntVar_oldMin(long var0, IntVar var2);

   public static final native long IntVar_oldMax(long var0, IntVar var2);

   public static final native int IntVar_varType(long var0, IntVar var2);

   public static final native void IntVar_accept(long var0, IntVar var2, long var3, ModelVisitor var5);

   public static final native long IntVar_isEqual(long var0, IntVar var2, long var3);

   public static final native long IntVar_isDifferent(long var0, IntVar var2, long var3);

   public static final native long IntVar_isGreaterOrEqual(long var0, IntVar var2, long var3);

   public static final native long IntVar_isLessOrEqual(long var0, IntVar var2, long var3);

   public static final native int IntVar_index(long var0, IntVar var2);

   public static final native long new_SolutionCollector__SWIG_0(long var0, Solver var2, long var3, Assignment var5);

   public static final native long new_SolutionCollector__SWIG_1(long var0, Solver var2);

   public static final native void delete_SolutionCollector(long var0);

   public static final native String SolutionCollector_toString(long var0, SolutionCollector var2);

   public static final native void SolutionCollector_add__SWIG_0(long var0, SolutionCollector var2, long var3, IntVar var5);

   public static final native void SolutionCollector_add__SWIG_1(long var0, SolutionCollector var2, IntVar[] var3);

   public static final native void SolutionCollector_add__SWIG_2(long var0, SolutionCollector var2, long var3, IntervalVar var5);

   public static final native void SolutionCollector_add__SWIG_3(long var0, SolutionCollector var2, IntervalVar[] var3);

   public static final native void SolutionCollector_add__SWIG_4(long var0, SolutionCollector var2, long var3, SequenceVar var5);

   public static final native void SolutionCollector_add__SWIG_5(long var0, SolutionCollector var2, SequenceVar[] var3);

   public static final native void SolutionCollector_addObjective(long var0, SolutionCollector var2, long var3, IntVar var5);

   public static final native void SolutionCollector_enterSearch(long var0, SolutionCollector var2);

   public static final native int SolutionCollector_solutionCount(long var0, SolutionCollector var2);

   public static final native long SolutionCollector_solution(long var0, SolutionCollector var2, int var3);

   public static final native long SolutionCollector_wallTime(long var0, SolutionCollector var2, int var3);

   public static final native long SolutionCollector_branches(long var0, SolutionCollector var2, int var3);

   public static final native long SolutionCollector_failures(long var0, SolutionCollector var2, int var3);

   public static final native long SolutionCollector_objectiveValue(long var0, SolutionCollector var2, int var3);

   public static final native long SolutionCollector_value(long var0, SolutionCollector var2, int var3, long var4, IntVar var6);

   public static final native long SolutionCollector_startValue(long var0, SolutionCollector var2, int var3, long var4, IntervalVar var6);

   public static final native long SolutionCollector_endValue(long var0, SolutionCollector var2, int var3, long var4, IntervalVar var6);

   public static final native long SolutionCollector_durationValue(long var0, SolutionCollector var2, int var3, long var4, IntervalVar var6);

   public static final native long SolutionCollector_performedValue(long var0, SolutionCollector var2, int var3, long var4, IntervalVar var6);

   public static final native int[] SolutionCollector_forwardSequence(long var0, SolutionCollector var2, int var3, long var4, SequenceVar var6);

   public static final native int[] SolutionCollector_backwardSequence(long var0, SolutionCollector var2, int var3, long var4, SequenceVar var6);

   public static final native int[] SolutionCollector_unperformed(long var0, SolutionCollector var2, int var3, long var4, SequenceVar var6);

   public static final native long new_OptimizeVar(long var0, Solver var2, boolean var3, long var4, IntVar var6, long var7);

   public static final native void delete_OptimizeVar(long var0);

   public static final native long OptimizeVar_best(long var0, OptimizeVar var2);

   public static final native long OptimizeVar_var(long var0, OptimizeVar var2);

   public static final native boolean OptimizeVar_acceptDelta(long var0, OptimizeVar var2, long var3, Assignment var5, long var6, Assignment var8);

   public static final native void OptimizeVar_enterSearch(long var0, OptimizeVar var2);

   public static final native void OptimizeVar_beginNextDecision(long var0, OptimizeVar var2, long var3, DecisionBuilder var5);

   public static final native void OptimizeVar_refuteDecision(long var0, OptimizeVar var2, long var3, Decision var5);

   public static final native boolean OptimizeVar_atSolution(long var0, OptimizeVar var2);

   public static final native boolean OptimizeVar_acceptSolution(long var0, OptimizeVar var2);

   public static final native String OptimizeVar_print(long var0, OptimizeVar var2);

   public static final native String OptimizeVar_toString(long var0, OptimizeVar var2);

   public static final native void OptimizeVar_accept(long var0, OptimizeVar var2, long var3, ModelVisitor var5);

   public static final native void OptimizeVar_applyBound(long var0, OptimizeVar var2);

   public static final native void delete_SearchLimit(long var0);

   public static final native boolean SearchLimit_crossed(long var0, SearchLimit var2);

   public static final native boolean SearchLimit_check(long var0, SearchLimit var2);

   public static final native void SearchLimit_init(long var0, SearchLimit var2);

   public static final native void SearchLimit_copy(long var0, SearchLimit var2, long var3, SearchLimit var5);

   public static final native long SearchLimit_makeClone(long var0, SearchLimit var2);

   public static final native void SearchLimit_enterSearch(long var0, SearchLimit var2);

   public static final native void SearchLimit_beginNextDecision(long var0, SearchLimit var2, long var3, DecisionBuilder var5);

   public static final native void SearchLimit_periodicCheck(long var0, SearchLimit var2);

   public static final native void SearchLimit_refuteDecision(long var0, SearchLimit var2, long var3, Decision var5);

   public static final native String SearchLimit_toString(long var0, SearchLimit var2);

   public static final native long new_RegularLimit(long var0, Solver var2, long var3, long var5, long var7, long var9, boolean var11, boolean var12);

   public static final native void delete_RegularLimit(long var0);

   public static final native void RegularLimit_copy(long var0, RegularLimit var2, long var3, SearchLimit var5);

   public static final native long RegularLimit_makeClone(long var0, RegularLimit var2);

   public static final native long RegularLimit_MakeIdenticalClone(long var0, RegularLimit var2);

   public static final native boolean RegularLimit_check(long var0, RegularLimit var2);

   public static final native void RegularLimit_init(long var0, RegularLimit var2);

   public static final native void RegularLimit_exitSearch(long var0, RegularLimit var2);

   public static final native void RegularLimit_UpdateLimits(long var0, RegularLimit var2, long var3, long var5, long var7, long var9);

   public static final native long RegularLimit_duration_limit(long var0, RegularLimit var2);

   public static final native long RegularLimit_wall_time(long var0, RegularLimit var2);

   public static final native long RegularLimit_branches(long var0, RegularLimit var2);

   public static final native long RegularLimit_failures(long var0, RegularLimit var2);

   public static final native long RegularLimit_solutions(long var0, RegularLimit var2);

   public static final native boolean RegularLimit_IsUncheckedSolutionLimitReached(long var0, RegularLimit var2);

   public static final native int RegularLimit_progressPercent(long var0, RegularLimit var2);

   public static final native String RegularLimit_toString(long var0, RegularLimit var2);

   public static final native long RegularLimit_AbsoluteSolverDeadline(long var0, RegularLimit var2);

   public static final native void RegularLimit_accept(long var0, RegularLimit var2, long var3, ModelVisitor var5);

   public static final native long IntervalVar_kMinValidValue_get();

   public static final native long IntervalVar_kMaxValidValue_get();

   public static final native void delete_IntervalVar(long var0);

   public static final native long IntervalVar_startMin(long var0, IntervalVar var2);

   public static final native long IntervalVar_startMax(long var0, IntervalVar var2);

   public static final native void IntervalVar_setStartMin(long var0, IntervalVar var2, long var3);

   public static final native void IntervalVar_setStartMax(long var0, IntervalVar var2, long var3);

   public static final native void IntervalVar_setStartRange(long var0, IntervalVar var2, long var3, long var5);

   public static final native long IntervalVar_oldStartMin(long var0, IntervalVar var2);

   public static final native long IntervalVar_oldStartMax(long var0, IntervalVar var2);

   public static final native void IntervalVar_whenStartRange__SWIG_0(long var0, IntervalVar var2, long var3, Demon var5);

   public static final native void IntervalVar_whenStartRange__SWIG_1(long var0, IntervalVar var2, Runnable var3);

   public static final native void IntervalVar_whenStartBound__SWIG_0(long var0, IntervalVar var2, long var3, Demon var5);

   public static final native void IntervalVar_whenStartBound__SWIG_1(long var0, IntervalVar var2, Runnable var3);

   public static final native long IntervalVar_durationMin(long var0, IntervalVar var2);

   public static final native long IntervalVar_durationMax(long var0, IntervalVar var2);

   public static final native void IntervalVar_setDurationMin(long var0, IntervalVar var2, long var3);

   public static final native void IntervalVar_setDurationMax(long var0, IntervalVar var2, long var3);

   public static final native void IntervalVar_setDurationRange(long var0, IntervalVar var2, long var3, long var5);

   public static final native long IntervalVar_oldDurationMin(long var0, IntervalVar var2);

   public static final native long IntervalVar_oldDurationMax(long var0, IntervalVar var2);

   public static final native void IntervalVar_whenDurationRange__SWIG_0(long var0, IntervalVar var2, long var3, Demon var5);

   public static final native void IntervalVar_whenDurationRange__SWIG_1(long var0, IntervalVar var2, Runnable var3);

   public static final native void IntervalVar_whenDurationBound__SWIG_0(long var0, IntervalVar var2, long var3, Demon var5);

   public static final native void IntervalVar_whenDurationBound__SWIG_1(long var0, IntervalVar var2, Runnable var3);

   public static final native long IntervalVar_endMin(long var0, IntervalVar var2);

   public static final native long IntervalVar_endMax(long var0, IntervalVar var2);

   public static final native void IntervalVar_setEndMin(long var0, IntervalVar var2, long var3);

   public static final native void IntervalVar_setEndMax(long var0, IntervalVar var2, long var3);

   public static final native void IntervalVar_setEndRange(long var0, IntervalVar var2, long var3, long var5);

   public static final native long IntervalVar_oldEndMin(long var0, IntervalVar var2);

   public static final native long IntervalVar_oldEndMax(long var0, IntervalVar var2);

   public static final native void IntervalVar_whenEndRange__SWIG_0(long var0, IntervalVar var2, long var3, Demon var5);

   public static final native void IntervalVar_whenEndRange__SWIG_1(long var0, IntervalVar var2, Runnable var3);

   public static final native void IntervalVar_whenEndBound__SWIG_0(long var0, IntervalVar var2, long var3, Demon var5);

   public static final native void IntervalVar_whenEndBound__SWIG_1(long var0, IntervalVar var2, Runnable var3);

   public static final native boolean IntervalVar_mustBePerformed(long var0, IntervalVar var2);

   public static final native boolean IntervalVar_mayBePerformed(long var0, IntervalVar var2);

   public static final native boolean IntervalVar_cannotBePerformed(long var0, IntervalVar var2);

   public static final native boolean IntervalVar_isPerformedBound(long var0, IntervalVar var2);

   public static final native void IntervalVar_setPerformed(long var0, IntervalVar var2, boolean var3);

   public static final native boolean IntervalVar_wasPerformedBound(long var0, IntervalVar var2);

   public static final native void IntervalVar_whenPerformedBound__SWIG_0(long var0, IntervalVar var2, long var3, Demon var5);

   public static final native void IntervalVar_whenPerformedBound__SWIG_1(long var0, IntervalVar var2, Runnable var3);

   public static final native void IntervalVar_whenAnything__SWIG_0(long var0, IntervalVar var2, long var3, Demon var5);

   public static final native void IntervalVar_whenAnything__SWIG_1(long var0, IntervalVar var2, Runnable var3);

   public static final native long IntervalVar_startExpr(long var0, IntervalVar var2);

   public static final native long IntervalVar_durationExpr(long var0, IntervalVar var2);

   public static final native long IntervalVar_endExpr(long var0, IntervalVar var2);

   public static final native long IntervalVar_performedExpr(long var0, IntervalVar var2);

   public static final native long IntervalVar_safeStartExpr(long var0, IntervalVar var2, long var3);

   public static final native long IntervalVar_safeDurationExpr(long var0, IntervalVar var2, long var3);

   public static final native long IntervalVar_safeEndExpr(long var0, IntervalVar var2, long var3);

   public static final native void IntervalVar_accept(long var0, IntervalVar var2, long var3, ModelVisitor var5);

   public static final native long new_SequenceVar(long var0, Solver var2, IntervalVar[] var3, IntVar[] var4, String var5);

   public static final native void delete_SequenceVar(long var0);

   public static final native String SequenceVar_toString(long var0, SequenceVar var2);

   public static final native void SequenceVar_rankFirst(long var0, SequenceVar var2, int var3);

   public static final native void SequenceVar_rankNotFirst(long var0, SequenceVar var2, int var3);

   public static final native void SequenceVar_rankLast(long var0, SequenceVar var2, int var3);

   public static final native void SequenceVar_rankNotLast(long var0, SequenceVar var2, int var3);

   public static final native void SequenceVar_rankSequence(long var0, SequenceVar var2, int[] var3, int[] var4, int[] var5);

   public static final native long SequenceVar_interval(long var0, SequenceVar var2, int var3);

   public static final native long SequenceVar_next(long var0, SequenceVar var2, int var3);

   public static final native long SequenceVar_size(long var0, SequenceVar var2);

   public static final native void SequenceVar_accept(long var0, SequenceVar var2, long var3, ModelVisitor var5);

   public static final native long new_AssignmentElement();

   public static final native void AssignmentElement_activate(long var0, AssignmentElement var2);

   public static final native void AssignmentElement_deactivate(long var0, AssignmentElement var2);

   public static final native boolean AssignmentElement_activated(long var0, AssignmentElement var2);

   public static final native void delete_AssignmentElement(long var0);

   public static final native long new_IntVarElement__SWIG_0();

   public static final native long new_IntVarElement__SWIG_1(long var0, IntVar var2);

   public static final native void IntVarElement_reset(long var0, IntVarElement var2, long var3, IntVar var5);

   public static final native long IntVarElement_clone(long var0, IntVarElement var2);

   public static final native void IntVarElement_copy(long var0, IntVarElement var2, long var3, IntVarElement var5);

   public static final native long IntVarElement_var(long var0, IntVarElement var2);

   public static final native void IntVarElement_store(long var0, IntVarElement var2);

   public static final native void IntVarElement_restore(long var0, IntVarElement var2);

   public static final native long IntVarElement_min(long var0, IntVarElement var2);

   public static final native void IntVarElement_setMin(long var0, IntVarElement var2, long var3);

   public static final native long IntVarElement_max(long var0, IntVarElement var2);

   public static final native void IntVarElement_setMax(long var0, IntVarElement var2, long var3);

   public static final native long IntVarElement_value(long var0, IntVarElement var2);

   public static final native boolean IntVarElement_bound(long var0, IntVarElement var2);

   public static final native void IntVarElement_setRange(long var0, IntVarElement var2, long var3, long var5);

   public static final native void IntVarElement_setValue(long var0, IntVarElement var2, long var3);

   public static final native String IntVarElement_toString(long var0, IntVarElement var2);

   public static final native void delete_IntVarElement(long var0);

   public static final native long new_IntervalVarElement__SWIG_0();

   public static final native long new_IntervalVarElement__SWIG_1(long var0, IntervalVar var2);

   public static final native void IntervalVarElement_reset(long var0, IntervalVarElement var2, long var3, IntervalVar var5);

   public static final native long IntervalVarElement_clone(long var0, IntervalVarElement var2);

   public static final native void IntervalVarElement_copy(long var0, IntervalVarElement var2, long var3, IntervalVarElement var5);

   public static final native long IntervalVarElement_var(long var0, IntervalVarElement var2);

   public static final native void IntervalVarElement_store(long var0, IntervalVarElement var2);

   public static final native void IntervalVarElement_restore(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_startMin(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_startMax(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_startValue(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_durationMin(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_durationMax(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_durationValue(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_endMin(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_endMax(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_endValue(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_performedMin(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_performedMax(long var0, IntervalVarElement var2);

   public static final native long IntervalVarElement_performedValue(long var0, IntervalVarElement var2);

   public static final native void IntervalVarElement_setStartMin(long var0, IntervalVarElement var2, long var3);

   public static final native void IntervalVarElement_setStartMax(long var0, IntervalVarElement var2, long var3);

   public static final native void IntervalVarElement_setStartRange(long var0, IntervalVarElement var2, long var3, long var5);

   public static final native void IntervalVarElement_setStartValue(long var0, IntervalVarElement var2, long var3);

   public static final native void IntervalVarElement_setDurationMin(long var0, IntervalVarElement var2, long var3);

   public static final native void IntervalVarElement_setDurationMax(long var0, IntervalVarElement var2, long var3);

   public static final native void IntervalVarElement_setDurationRange(long var0, IntervalVarElement var2, long var3, long var5);

   public static final native void IntervalVarElement_setDurationValue(long var0, IntervalVarElement var2, long var3);

   public static final native void IntervalVarElement_setEndMin(long var0, IntervalVarElement var2, long var3);

   public static final native void IntervalVarElement_setEndMax(long var0, IntervalVarElement var2, long var3);

   public static final native void IntervalVarElement_setEndRange(long var0, IntervalVarElement var2, long var3, long var5);

   public static final native void IntervalVarElement_setEndValue(long var0, IntervalVarElement var2, long var3);

   public static final native void IntervalVarElement_setPerformedMin(long var0, IntervalVarElement var2, long var3);

   public static final native void IntervalVarElement_setPerformedMax(long var0, IntervalVarElement var2, long var3);

   public static final native void IntervalVarElement_setPerformedRange(long var0, IntervalVarElement var2, long var3, long var5);

   public static final native void IntervalVarElement_setPerformedValue(long var0, IntervalVarElement var2, long var3);

   public static final native boolean IntervalVarElement_bound(long var0, IntervalVarElement var2);

   public static final native String IntervalVarElement_toString(long var0, IntervalVarElement var2);

   public static final native void delete_IntervalVarElement(long var0);

   public static final native long new_SequenceVarElement__SWIG_0();

   public static final native long new_SequenceVarElement__SWIG_1(long var0, SequenceVar var2);

   public static final native void SequenceVarElement_reset(long var0, SequenceVarElement var2, long var3, SequenceVar var5);

   public static final native long SequenceVarElement_clone(long var0, SequenceVarElement var2);

   public static final native void SequenceVarElement_copy(long var0, SequenceVarElement var2, long var3, SequenceVarElement var5);

   public static final native long SequenceVarElement_var(long var0, SequenceVarElement var2);

   public static final native void SequenceVarElement_store(long var0, SequenceVarElement var2);

   public static final native void SequenceVarElement_restore(long var0, SequenceVarElement var2);

   public static final native int[] SequenceVarElement_forwardSequence(long var0, SequenceVarElement var2);

   public static final native int[] SequenceVarElement_backwardSequence(long var0, SequenceVarElement var2);

   public static final native int[] SequenceVarElement_unperformed(long var0, SequenceVarElement var2);

   public static final native void SequenceVarElement_setSequence(long var0, SequenceVarElement var2, int[] var3, int[] var4, int[] var5);

   public static final native void SequenceVarElement_setForwardSequence(long var0, SequenceVarElement var2, int[] var3);

   public static final native void SequenceVarElement_setBackwardSequence(long var0, SequenceVarElement var2, int[] var3);

   public static final native void SequenceVarElement_setUnperformed(long var0, SequenceVarElement var2, int[] var3);

   public static final native boolean SequenceVarElement_bound(long var0, SequenceVarElement var2);

   public static final native String SequenceVarElement_toString(long var0, SequenceVarElement var2);

   public static final native void delete_SequenceVarElement(long var0);

   public static final native long new_Assignment__SWIG_0(long var0, Solver var2);

   public static final native long new_Assignment__SWIG_1(long var0, Assignment var2);

   public static final native void delete_Assignment(long var0);

   public static final native void Assignment_clear(long var0, Assignment var2);

   public static final native boolean Assignment_empty(long var0, Assignment var2);

   public static final native int Assignment_size(long var0, Assignment var2);

   public static final native int Assignment_numIntVars(long var0, Assignment var2);

   public static final native int Assignment_numIntervalVars(long var0, Assignment var2);

   public static final native int Assignment_numSequenceVars(long var0, Assignment var2);

   public static final native void Assignment_store(long var0, Assignment var2);

   public static final native void Assignment_restore(long var0, Assignment var2);

   public static final native boolean Assignment_load__SWIG_0(long var0, Assignment var2, String var3);

   public static final native void Assignment_load__SWIG_1(long var0, Assignment var2, long var3);

   public static final native boolean Assignment_save__SWIG_0(long var0, Assignment var2, String var3);

   public static final native void Assignment_save__SWIG_1(long var0, Assignment var2, long var3);

   public static final native void Assignment_addObjective(long var0, Assignment var2, long var3, IntVar var5);

   public static final native void Assignment_ClearObjective(long var0, Assignment var2);

   public static final native long Assignment_objective(long var0, Assignment var2);

   public static final native boolean Assignment_hasObjective(long var0, Assignment var2);

   public static final native long Assignment_objectiveMin(long var0, Assignment var2);

   public static final native long Assignment_objectiveMax(long var0, Assignment var2);

   public static final native long Assignment_objectiveValue(long var0, Assignment var2);

   public static final native boolean Assignment_objectiveBound(long var0, Assignment var2);

   public static final native void Assignment_setObjectiveMin(long var0, Assignment var2, long var3);

   public static final native void Assignment_setObjectiveMax(long var0, Assignment var2, long var3);

   public static final native void Assignment_setObjectiveValue(long var0, Assignment var2, long var3);

   public static final native void Assignment_setObjectiveRange(long var0, Assignment var2, long var3, long var5);

   public static final native long Assignment_add__SWIG_0(long var0, Assignment var2, long var3, IntVar var5);

   public static final native void Assignment_add__SWIG_1(long var0, Assignment var2, IntVar[] var3);

   public static final native long Assignment_fastAdd__SWIG_0(long var0, Assignment var2, long var3, IntVar var5);

   public static final native long Assignment_min(long var0, Assignment var2, long var3, IntVar var5);

   public static final native long Assignment_max(long var0, Assignment var2, long var3, IntVar var5);

   public static final native long Assignment_value(long var0, Assignment var2, long var3, IntVar var5);

   public static final native boolean Assignment_bound(long var0, Assignment var2, long var3, IntVar var5);

   public static final native void Assignment_setMin(long var0, Assignment var2, long var3, IntVar var5, long var6);

   public static final native void Assignment_setMax(long var0, Assignment var2, long var3, IntVar var5, long var6);

   public static final native void Assignment_setRange(long var0, Assignment var2, long var3, IntVar var5, long var6, long var8);

   public static final native void Assignment_setValue(long var0, Assignment var2, long var3, IntVar var5, long var6);

   public static final native long Assignment_add__SWIG_2(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native void Assignment_add__SWIG_3(long var0, Assignment var2, IntervalVar[] var3);

   public static final native long Assignment_fastAdd__SWIG_1(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_startMin(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_startMax(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_startValue(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_durationMin(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_durationMax(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_durationValue(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_endMin(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_endMax(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_endValue(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_performedMin(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_performedMax(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native long Assignment_performedValue(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native void Assignment_setStartMin(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native void Assignment_setStartMax(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native void Assignment_setStartRange(long var0, Assignment var2, long var3, IntervalVar var5, long var6, long var8);

   public static final native void Assignment_setStartValue(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native void Assignment_setDurationMin(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native void Assignment_setDurationMax(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native void Assignment_setDurationRange(long var0, Assignment var2, long var3, IntervalVar var5, long var6, long var8);

   public static final native void Assignment_setDurationValue(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native void Assignment_setEndMin(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native void Assignment_setEndMax(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native void Assignment_setEndRange(long var0, Assignment var2, long var3, IntervalVar var5, long var6, long var8);

   public static final native void Assignment_setEndValue(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native void Assignment_setPerformedMin(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native void Assignment_setPerformedMax(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native void Assignment_setPerformedRange(long var0, Assignment var2, long var3, IntervalVar var5, long var6, long var8);

   public static final native void Assignment_setPerformedValue(long var0, Assignment var2, long var3, IntervalVar var5, long var6);

   public static final native long Assignment_add__SWIG_4(long var0, Assignment var2, long var3, SequenceVar var5);

   public static final native void Assignment_add__SWIG_5(long var0, Assignment var2, SequenceVar[] var3);

   public static final native long Assignment_fastAdd__SWIG_2(long var0, Assignment var2, long var3, SequenceVar var5);

   public static final native int[] Assignment_forwardSequence(long var0, Assignment var2, long var3, SequenceVar var5);

   public static final native int[] Assignment_backwardSequence(long var0, Assignment var2, long var3, SequenceVar var5);

   public static final native int[] Assignment_unperformed(long var0, Assignment var2, long var3, SequenceVar var5);

   public static final native void Assignment_setSequence(long var0, Assignment var2, long var3, SequenceVar var5, int[] var6, int[] var7, int[] var8);

   public static final native void Assignment_setForwardSequence(long var0, Assignment var2, long var3, SequenceVar var5, int[] var6);

   public static final native void Assignment_setBackwardSequence(long var0, Assignment var2, long var3, SequenceVar var5, int[] var6);

   public static final native void Assignment_setUnperformed(long var0, Assignment var2, long var3, SequenceVar var5, int[] var6);

   public static final native void Assignment_activate__SWIG_0(long var0, Assignment var2, long var3, IntVar var5);

   public static final native void Assignment_deactivate__SWIG_0(long var0, Assignment var2, long var3, IntVar var5);

   public static final native boolean Assignment_activated__SWIG_0(long var0, Assignment var2, long var3, IntVar var5);

   public static final native void Assignment_activate__SWIG_1(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native void Assignment_deactivate__SWIG_1(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native boolean Assignment_activated__SWIG_1(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native void Assignment_activate__SWIG_2(long var0, Assignment var2, long var3, SequenceVar var5);

   public static final native void Assignment_deactivate__SWIG_2(long var0, Assignment var2, long var3, SequenceVar var5);

   public static final native boolean Assignment_activated__SWIG_2(long var0, Assignment var2, long var3, SequenceVar var5);

   public static final native void Assignment_activateObjective(long var0, Assignment var2);

   public static final native void Assignment_deactivateObjective(long var0, Assignment var2);

   public static final native boolean Assignment_activatedObjective(long var0, Assignment var2);

   public static final native String Assignment_toString(long var0, Assignment var2);

   public static final native boolean Assignment_AreAllElementsBound(long var0, Assignment var2);

   public static final native boolean Assignment_contains__SWIG_0(long var0, Assignment var2, long var3, IntVar var5);

   public static final native boolean Assignment_contains__SWIG_1(long var0, Assignment var2, long var3, IntervalVar var5);

   public static final native boolean Assignment_contains__SWIG_2(long var0, Assignment var2, long var3, SequenceVar var5);

   public static final native void Assignment_copyIntersection(long var0, Assignment var2, long var3, Assignment var5);

   public static final native void Assignment_copy(long var0, Assignment var2, long var3, Assignment var5);

   public static final native long Assignment_intVarContainer(long var0, Assignment var2);

   public static final native long Assignment_mutableIntVarContainer(long var0, Assignment var2);

   public static final native long Assignment_intervalVarContainer(long var0, Assignment var2);

   public static final native long Assignment_mutableIntervalVarContainer(long var0, Assignment var2);

   public static final native long Assignment_sequenceVarContainer(long var0, Assignment var2);

   public static final native long Assignment_mutableSequenceVarContainer(long var0, Assignment var2);

   public static final native void setAssignmentFromAssignment(long var0, Assignment var2, IntVar[] var3, long var4, Assignment var6, IntVar[] var7);

   public static final native long new_Pack(long var0, Solver var2, IntVar[] var3, int var4);

   public static final native void delete_Pack(long var0);

   public static final native void Pack_addWeightedSumLessOrEqualConstantDimension__SWIG_0(long var0, Pack var2, long[] var3, long[] var4);

   public static final native void Pack_addWeightedSumLessOrEqualConstantDimension__SWIG_1(long var0, Pack var2, LongUnaryOperator var3, long[] var4);

   public static final native void Pack_addWeightedSumLessOrEqualConstantDimension__SWIG_2(long var0, Pack var2, LongBinaryOperator var3, long[] var4);

   public static final native void Pack_addWeightedSumEqualVarDimension__SWIG_0(long var0, Pack var2, long[] var3, IntVar[] var4);

   public static final native void Pack_addWeightedSumEqualVarDimension__SWIG_1(long var0, Pack var2, LongBinaryOperator var3, IntVar[] var4);

   public static final native void Pack_addSumVariableWeightsLessOrEqualConstantDimension(long var0, Pack var2, IntVar[] var3, long[] var4);

   public static final native void Pack_addWeightedSumOfAssignedDimension(long var0, Pack var2, long[] var3, long var4, IntVar var6);

   public static final native void Pack_addCountUsedBinDimension(long var0, Pack var2, long var3, IntVar var5);

   public static final native void Pack_addCountAssignedItemsDimension(long var0, Pack var2, long var3, IntVar var5);

   public static final native void Pack_post(long var0, Pack var2);

   public static final native void Pack_clearAll(long var0, Pack var2);

   public static final native void Pack_propagateDelayed(long var0, Pack var2);

   public static final native void Pack_initialPropagate(long var0, Pack var2);

   public static final native void Pack_propagate(long var0, Pack var2);

   public static final native void Pack_oneDomain(long var0, Pack var2, int var3);

   public static final native String Pack_toString(long var0, Pack var2);

   public static final native boolean Pack_isUndecided(long var0, Pack var2, int var3, int var4);

   public static final native void Pack_setImpossible(long var0, Pack var2, int var3, int var4);

   public static final native void Pack_assign(long var0, Pack var2, int var3, int var4);

   public static final native boolean Pack_isAssignedStatusKnown(long var0, Pack var2, int var3);

   public static final native boolean Pack_isPossible(long var0, Pack var2, int var3, int var4);

   public static final native long Pack_assignVar(long var0, Pack var2, int var3, int var4);

   public static final native void Pack_setAssigned(long var0, Pack var2, int var3);

   public static final native void Pack_setUnassigned(long var0, Pack var2, int var3);

   public static final native void Pack_removeAllPossibleFromBin(long var0, Pack var2, int var3);

   public static final native void Pack_assignAllPossibleToBin(long var0, Pack var2, int var3);

   public static final native void Pack_assignFirstPossibleToBin(long var0, Pack var2, int var3);

   public static final native void Pack_assignAllRemainingItems(long var0, Pack var2);

   public static final native void Pack_unassignAllRemainingItems(long var0, Pack var2);

   public static final native void Pack_accept(long var0, Pack var2, long var3, ModelVisitor var5);

   public static final native void delete_DisjunctiveConstraint(long var0);

   public static final native long DisjunctiveConstraint_makeSequenceVar(long var0, DisjunctiveConstraint var2);

   public static final native void DisjunctiveConstraint_setTransitionTime(long var0, DisjunctiveConstraint var2, LongBinaryOperator var3);

   public static final native long DisjunctiveConstraint_transitionTime(long var0, DisjunctiveConstraint var2, int var3, int var4);

   public static final native void delete_SolutionPool(long var0);

   public static final native void SolutionPool_initialize(long var0, SolutionPool var2, long var3, Assignment var5);

   public static final native void SolutionPool_registerNewSolution(long var0, SolutionPool var2, long var3, Assignment var5);

   public static final native void SolutionPool_getNextSolution(long var0, SolutionPool var2, long var3, Assignment var5);

   public static final native boolean SolutionPool_syncNeeded(long var0, SolutionPool var2, long var3, Assignment var5);

   public static final native void delete_BaseIntExpr(long var0);

   public static final native long BaseIntExpr_var(long var0, BaseIntExpr var2);

   public static final native long BaseIntExpr_castToVar(long var0, BaseIntExpr var2);

   public static final native int UNSPECIFIED_get();

   public static final native int DOMAIN_INT_VAR_get();

   public static final native int BOOLEAN_VAR_get();

   public static final native int CONST_VAR_get();

   public static final native int VAR_ADD_CST_get();

   public static final native int VAR_TIMES_CST_get();

   public static final native int CST_SUB_VAR_get();

   public static final native int OPP_VAR_get();

   public static final native int TRACE_VAR_get();

   public static final native long new_LocalSearchOperator();

   public static final native void delete_LocalSearchOperator(long var0);

   public static final native boolean LocalSearchOperator_nextNeighbor(long var0, LocalSearchOperator var2, long var3, Assignment var5, long var6, Assignment var8);

   public static final native void LocalSearchOperator_start(long var0, LocalSearchOperator var2, long var3, Assignment var5);

   public static final native void LocalSearchOperator_reset(long var0, LocalSearchOperator var2);

   public static final native void LocalSearchOperator_resetSwigExplicitLocalSearchOperator(long var0, LocalSearchOperator var2);

   public static final native boolean LocalSearchOperator_HasFragments(long var0, LocalSearchOperator var2);

   public static final native boolean LocalSearchOperator_HasFragmentsSwigExplicitLocalSearchOperator(long var0, LocalSearchOperator var2);

   public static final native boolean LocalSearchOperator_HoldsDelta(long var0, LocalSearchOperator var2);

   public static final native boolean LocalSearchOperator_HoldsDeltaSwigExplicitLocalSearchOperator(long var0, LocalSearchOperator var2);

   public static final native void LocalSearchOperator_director_connect(LocalSearchOperator var0, long var1, boolean var3, boolean var4);

   public static final native void LocalSearchOperator_change_ownership(LocalSearchOperator var0, long var1, boolean var3);

   public static final native void IntVarLocalSearchHandler_addToAssignment(long var0, IntVarLocalSearchHandler var2, long var3, IntVar var5, long var6, boolean var8, long var9, long var11, long var13, Assignment var15);

   public static final native boolean IntVarLocalSearchHandler_valueFromAssignent(long var0, IntVarLocalSearchHandler var2, long var3, Assignment var5, long var6, IntVar var8, long var9, long[] var11);

   public static final native void IntVarLocalSearchHandler_onRevertChanges(long var0, IntVarLocalSearchHandler var2, long var3);

   public static final native void IntVarLocalSearchHandler_onAddVars(long var0, IntVarLocalSearchHandler var2);

   public static final native long new_IntVarLocalSearchHandler();

   public static final native void delete_IntVarLocalSearchHandler(long var0);

   public static final native void delete_IntVarLocalSearchOperatorTemplate(long var0);

   public static final native boolean IntVarLocalSearchOperatorTemplate_HoldsDelta(long var0, IntVarLocalSearchOperatorTemplate var2);

   public static final native boolean IntVarLocalSearchOperatorTemplate_isIncremental(long var0, IntVarLocalSearchOperatorTemplate var2);

   public static final native int IntVarLocalSearchOperatorTemplate_size(long var0, IntVarLocalSearchOperatorTemplate var2);

   public static final native long IntVarLocalSearchOperatorTemplate_value(long var0, IntVarLocalSearchOperatorTemplate var2, long var3);

   public static final native long IntVarLocalSearchOperatorTemplate_var(long var0, IntVarLocalSearchOperatorTemplate var2, long var3);

   public static final native long IntVarLocalSearchOperatorTemplate_oldValue(long var0, IntVarLocalSearchOperatorTemplate var2, long var3);

   public static final native void IntVarLocalSearchOperatorTemplate_setValue(long var0, IntVarLocalSearchOperatorTemplate var2, long var3, long var5);

   public static final native boolean IntVarLocalSearchOperatorTemplate_activated(long var0, IntVarLocalSearchOperatorTemplate var2, long var3);

   public static final native void IntVarLocalSearchOperatorTemplate_activate(long var0, IntVarLocalSearchOperatorTemplate var2, long var3);

   public static final native void IntVarLocalSearchOperatorTemplate_deactivate(long var0, IntVarLocalSearchOperatorTemplate var2, long var3);

   public static final native void IntVarLocalSearchOperatorTemplate_addVars(long var0, IntVarLocalSearchOperatorTemplate var2, IntVar[] var3);

   public static final native void IntVarLocalSearchOperatorTemplate_onStart(long var0, IntVarLocalSearchOperatorTemplate var2);

   public static final native long new_IntVarLocalSearchOperator__SWIG_0();

   public static final native long new_IntVarLocalSearchOperator__SWIG_1(IntVar[] var0);

   public static final native void delete_IntVarLocalSearchOperator(long var0);

   public static final native boolean IntVarLocalSearchOperator_oneNeighbor(long var0, IntVarLocalSearchOperator var2);

   public static final native boolean IntVarLocalSearchOperator_oneNeighborSwigExplicitIntVarLocalSearchOperator(long var0, IntVarLocalSearchOperator var2);

   public static final native void IntVarLocalSearchOperator_director_connect(IntVarLocalSearchOperator var0, long var1, boolean var3, boolean var4);

   public static final native void IntVarLocalSearchOperator_change_ownership(IntVarLocalSearchOperator var0, long var1, boolean var3);

   public static final native long new_SequenceVarLocalSearchHandler__SWIG_0();

   public static final native long new_SequenceVarLocalSearchHandler__SWIG_1(long var0, SequenceVarLocalSearchHandler var2);

   public static final native long new_SequenceVarLocalSearchHandler__SWIG_2(long var0, SequenceVarLocalSearchOperator var2);

   public static final native void SequenceVarLocalSearchHandler_addToAssignment(long var0, SequenceVarLocalSearchHandler var2, long var3, SequenceVar var5, int[] var6, boolean var7, long var8, long var10, long var12, Assignment var14);

   public static final native boolean SequenceVarLocalSearchHandler_valueFromAssignent(long var0, SequenceVarLocalSearchHandler var2, long var3, Assignment var5, long var6, SequenceVar var8, long var9, long var11);

   public static final native void SequenceVarLocalSearchHandler_onRevertChanges(long var0, SequenceVarLocalSearchHandler var2, long var3);

   public static final native void SequenceVarLocalSearchHandler_onAddVars(long var0, SequenceVarLocalSearchHandler var2);

   public static final native void delete_SequenceVarLocalSearchHandler(long var0);

   public static final native void delete_SequenceVarLocalSearchOperatorTemplate(long var0);

   public static final native boolean SequenceVarLocalSearchOperatorTemplate_HoldsDelta(long var0, SequenceVarLocalSearchOperatorTemplate var2);

   public static final native boolean SequenceVarLocalSearchOperatorTemplate_isIncremental(long var0, SequenceVarLocalSearchOperatorTemplate var2);

   public static final native int SequenceVarLocalSearchOperatorTemplate_size(long var0, SequenceVarLocalSearchOperatorTemplate var2);

   public static final native int[] SequenceVarLocalSearchOperatorTemplate_value(long var0, SequenceVarLocalSearchOperatorTemplate var2, long var3);

   public static final native long SequenceVarLocalSearchOperatorTemplate_var(long var0, SequenceVarLocalSearchOperatorTemplate var2, long var3);

   public static final native int[] SequenceVarLocalSearchOperatorTemplate_oldValue(long var0, SequenceVarLocalSearchOperatorTemplate var2, long var3);

   public static final native void SequenceVarLocalSearchOperatorTemplate_setValue(long var0, SequenceVarLocalSearchOperatorTemplate var2, long var3, int[] var5);

   public static final native boolean SequenceVarLocalSearchOperatorTemplate_activated(long var0, SequenceVarLocalSearchOperatorTemplate var2, long var3);

   public static final native void SequenceVarLocalSearchOperatorTemplate_activate(long var0, SequenceVarLocalSearchOperatorTemplate var2, long var3);

   public static final native void SequenceVarLocalSearchOperatorTemplate_deactivate(long var0, SequenceVarLocalSearchOperatorTemplate var2, long var3);

   public static final native void SequenceVarLocalSearchOperatorTemplate_addVars(long var0, SequenceVarLocalSearchOperatorTemplate var2, SequenceVar[] var3);

   public static final native void SequenceVarLocalSearchOperatorTemplate_onStart(long var0, SequenceVarLocalSearchOperatorTemplate var2);

   public static final native long new_SequenceVarLocalSearchOperator__SWIG_0();

   public static final native long new_SequenceVarLocalSearchOperator__SWIG_1(SequenceVar[] var0);

   public static final native void delete_SequenceVarLocalSearchOperator(long var0);

   public static final native void SequenceVarLocalSearchOperator_director_connect(SequenceVarLocalSearchOperator var0, long var1, boolean var3, boolean var4);

   public static final native void SequenceVarLocalSearchOperator_change_ownership(SequenceVarLocalSearchOperator var0, long var1, boolean var3);

   public static final native long new_BaseLns(IntVar[] var0);

   public static final native void delete_BaseLns(long var0);

   public static final native void BaseLns_initFragments(long var0, BaseLns var2);

   public static final native void BaseLns_initFragmentsSwigExplicitBaseLns(long var0, BaseLns var2);

   public static final native boolean BaseLns_nextFragment(long var0, BaseLns var2);

   public static final native void BaseLns_appendToFragment(long var0, BaseLns var2, int var3);

   public static final native int BaseLns_fragmentSize(long var0, BaseLns var2);

   public static final native boolean BaseLns_HasFragments(long var0, BaseLns var2);

   public static final native boolean BaseLns_HasFragmentsSwigExplicitBaseLns(long var0, BaseLns var2);

   public static final native void BaseLns_director_connect(BaseLns var0, long var1, boolean var3, boolean var4);

   public static final native void BaseLns_change_ownership(BaseLns var0, long var1, boolean var3);

   public static final native long new_ChangeValue(IntVar[] var0);

   public static final native void delete_ChangeValue(long var0);

   public static final native long ChangeValue_modifyValue(long var0, ChangeValue var2, long var3, long var5);

   public static final native boolean ChangeValue_oneNeighbor(long var0, ChangeValue var2);

   public static final native boolean ChangeValue_oneNeighborSwigExplicitChangeValue(long var0, ChangeValue var2);

   public static final native void ChangeValue_director_connect(ChangeValue var0, long var1, boolean var3, boolean var4);

   public static final native void ChangeValue_change_ownership(ChangeValue var0, long var1, boolean var3);

   public static final native long new_PathOperator(IntVar[] var0, IntVar[] var1, int var2, boolean var3, LongToIntFunction var4);

   public static final native void delete_PathOperator(long var0);

   public static final native boolean PathOperator_neighbor(long var0, PathOperator var2);

   public static final native void PathOperator_reset(long var0, PathOperator var2);

   public static final native void PathOperator_resetSwigExplicitPathOperator(long var0, PathOperator var2);

   public static final native boolean PathOperator_oneNeighbor(long var0, PathOperator var2);

   public static final native boolean PathOperator_oneNeighborSwigExplicitPathOperator(long var0, PathOperator var2);

   public static final native boolean PathOperator_restartAtPathStartOnSynchronize(long var0, PathOperator var2);

   public static final native boolean PathOperator_restartAtPathStartOnSynchronizeSwigExplicitPathOperator(long var0, PathOperator var2);

   public static final native boolean PathOperator_onSamePathAsPreviousBase(long var0, PathOperator var2, long var3);

   public static final native boolean PathOperator_onSamePathAsPreviousBaseSwigExplicitPathOperator(long var0, PathOperator var2, long var3);

   public static final native long PathOperator_getBaseNodeRestartPosition(long var0, PathOperator var2, int var3);

   public static final native long PathOperator_getBaseNodeRestartPositionSwigExplicitPathOperator(long var0, PathOperator var2, int var3);

   public static final native void PathOperator_setNextBaseToIncrement(long var0, PathOperator var2, long var3);

   public static final native void PathOperator_setNextBaseToIncrementSwigExplicitPathOperator(long var0, PathOperator var2, long var3);

   public static final native boolean PathOperator_initPosition(long var0, PathOperator var2);

   public static final native boolean PathOperator_initPositionSwigExplicitPathOperator(long var0, PathOperator var2);

   public static final native void PathOperator_director_connect(PathOperator var0, long var1, boolean var3, boolean var4);

   public static final native void PathOperator_change_ownership(PathOperator var0, long var1, boolean var3);

   public static final native void delete_PathWithPreviousNodesOperator(long var0);

   public static final native boolean PathWithPreviousNodesOperator_isPathStart(long var0, PathWithPreviousNodesOperator var2, long var3);

   public static final native long PathWithPreviousNodesOperator_prev(long var0, PathWithPreviousNodesOperator var2, long var3);

   public static final native String PathWithPreviousNodesOperator_toString(long var0, PathWithPreviousNodesOperator var2);

   public static final native void LocalSearchFilter_Relax(long var0, LocalSearchFilter var2, long var3, Assignment var5, long var6, Assignment var8);

   public static final native void LocalSearchFilter_RelaxSwigExplicitLocalSearchFilter(long var0, LocalSearchFilter var2, long var3, Assignment var5, long var6, Assignment var8);

   public static final native boolean LocalSearchFilter_accept(long var0, LocalSearchFilter var2, long var3, Assignment var5, long var6, Assignment var8, long var9, long var11);

   public static final native boolean LocalSearchFilter_isIncremental(long var0, LocalSearchFilter var2);

   public static final native boolean LocalSearchFilter_isIncrementalSwigExplicitLocalSearchFilter(long var0, LocalSearchFilter var2);

   public static final native void LocalSearchFilter_synchronize(long var0, LocalSearchFilter var2, long var3, Assignment var5, long var6, Assignment var8);

   public static final native void LocalSearchFilter_Revert(long var0, LocalSearchFilter var2);

   public static final native void LocalSearchFilter_RevertSwigExplicitLocalSearchFilter(long var0, LocalSearchFilter var2);

   public static final native long LocalSearchFilter_getSynchronizedObjectiveValue(long var0, LocalSearchFilter var2);

   public static final native long LocalSearchFilter_getSynchronizedObjectiveValueSwigExplicitLocalSearchFilter(long var0, LocalSearchFilter var2);

   public static final native long LocalSearchFilter_getAcceptedObjectiveValue(long var0, LocalSearchFilter var2);

   public static final native long LocalSearchFilter_getAcceptedObjectiveValueSwigExplicitLocalSearchFilter(long var0, LocalSearchFilter var2);

   public static final native long new_LocalSearchFilter();

   public static final native void delete_LocalSearchFilter(long var0);

   public static final native void LocalSearchFilter_director_connect(LocalSearchFilter var0, long var1, boolean var3, boolean var4);

   public static final native void LocalSearchFilter_change_ownership(LocalSearchFilter var0, long var1, boolean var3);

   public static final native long new_IntVarLocalSearchFilter(IntVar[] var0);

   public static final native void delete_IntVarLocalSearchFilter(long var0);

   public static final native void IntVarLocalSearchFilter_synchronize(long var0, IntVarLocalSearchFilter var2, long var3, Assignment var5, long var6, Assignment var8);

   public static final native void IntVarLocalSearchFilter_addVars(long var0, IntVarLocalSearchFilter var2, IntVar[] var3);

   public static final native int IntVarLocalSearchFilter_size(long var0, IntVarLocalSearchFilter var2);

   public static final native long IntVarLocalSearchFilter_var(long var0, IntVarLocalSearchFilter var2, int var3);

   public static final native long IntVarLocalSearchFilter_value(long var0, IntVarLocalSearchFilter var2, int var3);

   public static final native void IntVarLocalSearchFilter_onSynchronize(long var0, IntVarLocalSearchFilter var2, long var3, Assignment var5);

   public static final native void IntVarLocalSearchFilter_onSynchronizeSwigExplicitIntVarLocalSearchFilter(long var0, IntVarLocalSearchFilter var2, long var3, Assignment var5);

   public static final native int IntVarLocalSearchFilter_index(long var0, IntVarLocalSearchFilter var2, long var3, IntVar var5);

   public static final native void IntVarLocalSearchFilter_director_connect(IntVarLocalSearchFilter var0, long var1, boolean var3, boolean var4);

   public static final native void IntVarLocalSearchFilter_change_ownership(IntVarLocalSearchFilter var0, long var1, boolean var3);

   public static final native void delete_PropagationMonitor(long var0);

   public static final native String PropagationMonitor_toString(long var0, PropagationMonitor var2);

   public static final native void PropagationMonitor_beginConstraintInitialPropagation(long var0, PropagationMonitor var2, long var3, Constraint var5);

   public static final native void PropagationMonitor_endConstraintInitialPropagation(long var0, PropagationMonitor var2, long var3, Constraint var5);

   public static final native void PropagationMonitor_beginNestedConstraintInitialPropagation(long var0, PropagationMonitor var2, long var3, Constraint var5, long var6, Constraint var8);

   public static final native void PropagationMonitor_endNestedConstraintInitialPropagation(long var0, PropagationMonitor var2, long var3, Constraint var5, long var6, Constraint var8);

   public static final native void PropagationMonitor_registerDemon(long var0, PropagationMonitor var2, long var3, Demon var5);

   public static final native void PropagationMonitor_beginDemonRun(long var0, PropagationMonitor var2, long var3, Demon var5);

   public static final native void PropagationMonitor_endDemonRun(long var0, PropagationMonitor var2, long var3, Demon var5);

   public static final native void PropagationMonitor_startProcessingIntegerVariable(long var0, PropagationMonitor var2, long var3, IntVar var5);

   public static final native void PropagationMonitor_endProcessingIntegerVariable(long var0, PropagationMonitor var2, long var3, IntVar var5);

   public static final native void PropagationMonitor_pushContext(long var0, PropagationMonitor var2, String var3);

   public static final native void PropagationMonitor_popContext(long var0, PropagationMonitor var2);

   public static final native void PropagationMonitor_setMin__SWIG_0(long var0, PropagationMonitor var2, long var3, IntExpr var5, long var6);

   public static final native void PropagationMonitor_setMax__SWIG_0(long var0, PropagationMonitor var2, long var3, IntExpr var5, long var6);

   public static final native void PropagationMonitor_setRange__SWIG_0(long var0, PropagationMonitor var2, long var3, IntExpr var5, long var6, long var8);

   public static final native void PropagationMonitor_setMin__SWIG_1(long var0, PropagationMonitor var2, long var3, IntVar var5, long var6);

   public static final native void PropagationMonitor_setMax__SWIG_1(long var0, PropagationMonitor var2, long var3, IntVar var5, long var6);

   public static final native void PropagationMonitor_setRange__SWIG_1(long var0, PropagationMonitor var2, long var3, IntVar var5, long var6, long var8);

   public static final native void PropagationMonitor_removeValue(long var0, PropagationMonitor var2, long var3, IntVar var5, long var6);

   public static final native void PropagationMonitor_setValue__SWIG_0(long var0, PropagationMonitor var2, long var3, IntVar var5, long var6);

   public static final native void PropagationMonitor_removeInterval(long var0, PropagationMonitor var2, long var3, IntVar var5, long var6, long var8);

   public static final native void PropagationMonitor_setValue__SWIG_1(long var0, PropagationMonitor var2, long var3, IntVar var5, long[] var6);

   public static final native void PropagationMonitor_removeValues(long var0, PropagationMonitor var2, long var3, IntVar var5, long[] var6);

   public static final native void PropagationMonitor_setStartMin(long var0, PropagationMonitor var2, long var3, IntervalVar var5, long var6);

   public static final native void PropagationMonitor_setStartMax(long var0, PropagationMonitor var2, long var3, IntervalVar var5, long var6);

   public static final native void PropagationMonitor_setStartRange(long var0, PropagationMonitor var2, long var3, IntervalVar var5, long var6, long var8);

   public static final native void PropagationMonitor_setEndMin(long var0, PropagationMonitor var2, long var3, IntervalVar var5, long var6);

   public static final native void PropagationMonitor_setEndMax(long var0, PropagationMonitor var2, long var3, IntervalVar var5, long var6);

   public static final native void PropagationMonitor_setEndRange(long var0, PropagationMonitor var2, long var3, IntervalVar var5, long var6, long var8);

   public static final native void PropagationMonitor_setDurationMin(long var0, PropagationMonitor var2, long var3, IntervalVar var5, long var6);

   public static final native void PropagationMonitor_setDurationMax(long var0, PropagationMonitor var2, long var3, IntervalVar var5, long var6);

   public static final native void PropagationMonitor_setDurationRange(long var0, PropagationMonitor var2, long var3, IntervalVar var5, long var6, long var8);

   public static final native void PropagationMonitor_setPerformed(long var0, PropagationMonitor var2, long var3, IntervalVar var5, boolean var6);

   public static final native void PropagationMonitor_rankFirst(long var0, PropagationMonitor var2, long var3, SequenceVar var5, int var6);

   public static final native void PropagationMonitor_rankNotFirst(long var0, PropagationMonitor var2, long var3, SequenceVar var5, int var6);

   public static final native void PropagationMonitor_rankLast(long var0, PropagationMonitor var2, long var3, SequenceVar var5, int var6);

   public static final native void PropagationMonitor_rankNotLast(long var0, PropagationMonitor var2, long var3, SequenceVar var5, int var6);

   public static final native void PropagationMonitor_rankSequence(long var0, PropagationMonitor var2, long var3, SequenceVar var5, int[] var6, int[] var7, int[] var8);

   public static final native void PropagationMonitor_install(long var0, PropagationMonitor var2);

   public static final native void delete_LocalSearchMonitor(long var0);

   public static final native String LocalSearchMonitor_toString(long var0, LocalSearchMonitor var2);

   public static final native void LocalSearchMonitor_beginOperatorStart(long var0, LocalSearchMonitor var2);

   public static final native void LocalSearchMonitor_endOperatorStart(long var0, LocalSearchMonitor var2);

   public static final native void LocalSearchMonitor_beginMakeNextNeighbor(long var0, LocalSearchMonitor var2, long var3, LocalSearchOperator var5);

   public static final native void LocalSearchMonitor_endMakeNextNeighbor(long var0, LocalSearchMonitor var2, long var3, LocalSearchOperator var5, boolean var6, long var7, Assignment var9, long var10, Assignment var12);

   public static final native void LocalSearchMonitor_beginFilterNeighbor(long var0, LocalSearchMonitor var2, long var3, LocalSearchOperator var5);

   public static final native void LocalSearchMonitor_endFilterNeighbor(long var0, LocalSearchMonitor var2, long var3, LocalSearchOperator var5, boolean var6);

   public static final native void LocalSearchMonitor_beginAcceptNeighbor(long var0, LocalSearchMonitor var2, long var3, LocalSearchOperator var5);

   public static final native void LocalSearchMonitor_endAcceptNeighbor(long var0, LocalSearchMonitor var2, long var3, LocalSearchOperator var5, boolean var6);

   public static final native void LocalSearchMonitor_beginFiltering(long var0, LocalSearchMonitor var2, long var3, LocalSearchFilter var5);

   public static final native void LocalSearchMonitor_endFiltering(long var0, LocalSearchMonitor var2, long var3, LocalSearchFilter var5, boolean var6);

   public static final native void LocalSearchMonitor_install(long var0, LocalSearchMonitor var2);

   public static final native int BooleanVar_kUnboundBooleanVarValue_get();

   public static final native void delete_BooleanVar(long var0);

   public static final native long BooleanVar_min(long var0, BooleanVar var2);

   public static final native void BooleanVar_setMin(long var0, BooleanVar var2, long var3);

   public static final native long BooleanVar_max(long var0, BooleanVar var2);

   public static final native void BooleanVar_setMax(long var0, BooleanVar var2, long var3);

   public static final native void BooleanVar_setRange(long var0, BooleanVar var2, long var3, long var5);

   public static final native boolean BooleanVar_bound(long var0, BooleanVar var2);

   public static final native long BooleanVar_value(long var0, BooleanVar var2);

   public static final native void BooleanVar_removeValue(long var0, BooleanVar var2, long var3);

   public static final native void BooleanVar_removeInterval(long var0, BooleanVar var2, long var3, long var5);

   public static final native void BooleanVar_whenBound(long var0, BooleanVar var2, long var3, Demon var5);

   public static final native void BooleanVar_whenRange(long var0, BooleanVar var2, long var3, Demon var5);

   public static final native void BooleanVar_whenDomain(long var0, BooleanVar var2, long var3, Demon var5);

   public static final native BigInteger BooleanVar_size(long var0, BooleanVar var2);

   public static final native boolean BooleanVar_contains(long var0, BooleanVar var2, long var3);

   public static final native long BooleanVar_makeHoleIterator(long var0, BooleanVar var2, boolean var3);

   public static final native long BooleanVar_makeDomainIterator(long var0, BooleanVar var2, boolean var3);

   public static final native String BooleanVar_toString(long var0, BooleanVar var2);

   public static final native int BooleanVar_varType(long var0, BooleanVar var2);

   public static final native long BooleanVar_isEqual(long var0, BooleanVar var2, long var3);

   public static final native long BooleanVar_isDifferent(long var0, BooleanVar var2, long var3);

   public static final native long BooleanVar_isGreaterOrEqual(long var0, BooleanVar var2, long var3);

   public static final native long BooleanVar_isLessOrEqual(long var0, BooleanVar var2, long var3);

   public static final native void BooleanVar_restoreValue(long var0, BooleanVar var2);

   public static final native String BooleanVar_baseName(long var0, BooleanVar var2);

   public static final native int BooleanVar_rawValue(long var0, BooleanVar var2);

   public static final native long new_SymmetryBreaker();

   public static final native void delete_SymmetryBreaker(long var0);

   public static final native void SymmetryBreaker_addIntegerVariableEqualValueClause(long var0, SymmetryBreaker var2, long var3, IntVar var5, long var6);

   public static final native void SymmetryBreaker_addIntegerVariableGreaterOrEqualValueClause(long var0, SymmetryBreaker var2, long var3, IntVar var5, long var6);

   public static final native void SymmetryBreaker_addIntegerVariableLessOrEqualValueClause(long var0, SymmetryBreaker var2, long var3, IntVar var5, long var6);

   public static final native void SymmetryBreaker_director_connect(SymmetryBreaker var0, long var1, boolean var3, boolean var4);

   public static final native void SymmetryBreaker_change_ownership(SymmetryBreaker var0, long var1, boolean var3);

   public static final native long new_SearchLog(long var0, Solver var2, long var3, OptimizeVar var5, long var6, IntVar var8, double var9, double var11, Supplier var13, int var14);

   public static final native void delete_SearchLog(long var0);

   public static final native void SearchLog_enterSearch(long var0, SearchLog var2);

   public static final native void SearchLog_exitSearch(long var0, SearchLog var2);

   public static final native boolean SearchLog_atSolution(long var0, SearchLog var2);

   public static final native void SearchLog_beginFail(long var0, SearchLog var2);

   public static final native void SearchLog_noMoreSolutions(long var0, SearchLog var2);

   public static final native void SearchLog_AcceptUncheckedNeighbor(long var0, SearchLog var2);

   public static final native void SearchLog_applyDecision(long var0, SearchLog var2, long var3, Decision var5);

   public static final native void SearchLog_refuteDecision(long var0, SearchLog var2, long var3, Decision var5);

   public static final native void SearchLog_outputDecision(long var0, SearchLog var2);

   public static final native void SearchLog_maintain(long var0, SearchLog var2);

   public static final native void SearchLog_beginInitialPropagation(long var0, SearchLog var2);

   public static final native void SearchLog_endInitialPropagation(long var0, SearchLog var2);

   public static final native String SearchLog_toString(long var0, SearchLog var2);

   public static final native int ModelCache_VOID_FALSE_CONSTRAINT_get();

   public static final native int ModelCache_VOID_TRUE_CONSTRAINT_get();

   public static final native int ModelCache_VOID_CONSTRAINT_MAX_get();

   public static final native int ModelCache_VAR_CONSTANT_EQUALITY_get();

   public static final native int ModelCache_VAR_CONSTANT_GREATER_OR_EQUAL_get();

   public static final native int ModelCache_VAR_CONSTANT_LESS_OR_EQUAL_get();

   public static final native int ModelCache_VAR_CONSTANT_NON_EQUALITY_get();

   public static final native int ModelCache_VAR_CONSTANT_CONSTRAINT_MAX_get();

   public static final native int ModelCache_VAR_CONSTANT_CONSTANT_BETWEEN_get();

   public static final native int ModelCache_VAR_CONSTANT_CONSTANT_CONSTRAINT_MAX_get();

   public static final native int ModelCache_EXPR_EXPR_EQUALITY_get();

   public static final native int ModelCache_EXPR_EXPR_GREATER_get();

   public static final native int ModelCache_EXPR_EXPR_GREATER_OR_EQUAL_get();

   public static final native int ModelCache_EXPR_EXPR_LESS_get();

   public static final native int ModelCache_EXPR_EXPR_LESS_OR_EQUAL_get();

   public static final native int ModelCache_EXPR_EXPR_NON_EQUALITY_get();

   public static final native int ModelCache_EXPR_EXPR_CONSTRAINT_MAX_get();

   public static final native int ModelCache_EXPR_OPPOSITE_get();

   public static final native int ModelCache_EXPR_ABS_get();

   public static final native int ModelCache_EXPR_SQUARE_get();

   public static final native int ModelCache_EXPR_EXPRESSION_MAX_get();

   public static final native int ModelCache_EXPR_EXPR_DIFFERENCE_get();

   public static final native int ModelCache_EXPR_EXPR_PROD_get();

   public static final native int ModelCache_EXPR_EXPR_DIV_get();

   public static final native int ModelCache_EXPR_EXPR_MAX_get();

   public static final native int ModelCache_EXPR_EXPR_MIN_get();

   public static final native int ModelCache_EXPR_EXPR_SUM_get();

   public static final native int ModelCache_EXPR_EXPR_IS_LESS_get();

   public static final native int ModelCache_EXPR_EXPR_IS_LESS_OR_EQUAL_get();

   public static final native int ModelCache_EXPR_EXPR_IS_EQUAL_get();

   public static final native int ModelCache_EXPR_EXPR_IS_NOT_EQUAL_get();

   public static final native int ModelCache_EXPR_EXPR_EXPRESSION_MAX_get();

   public static final native int ModelCache_EXPR_EXPR_CONSTANT_CONDITIONAL_get();

   public static final native int ModelCache_EXPR_EXPR_CONSTANT_EXPRESSION_MAX_get();

   public static final native int ModelCache_EXPR_CONSTANT_DIFFERENCE_get();

   public static final native int ModelCache_EXPR_CONSTANT_DIVIDE_get();

   public static final native int ModelCache_EXPR_CONSTANT_PROD_get();

   public static final native int ModelCache_EXPR_CONSTANT_MAX_get();

   public static final native int ModelCache_EXPR_CONSTANT_MIN_get();

   public static final native int ModelCache_EXPR_CONSTANT_SUM_get();

   public static final native int ModelCache_EXPR_CONSTANT_IS_EQUAL_get();

   public static final native int ModelCache_EXPR_CONSTANT_IS_NOT_EQUAL_get();

   public static final native int ModelCache_EXPR_CONSTANT_IS_GREATER_OR_EQUAL_get();

   public static final native int ModelCache_EXPR_CONSTANT_IS_LESS_OR_EQUAL_get();

   public static final native int ModelCache_EXPR_CONSTANT_EXPRESSION_MAX_get();

   public static final native int ModelCache_VAR_CONSTANT_CONSTANT_SEMI_CONTINUOUS_get();

   public static final native int ModelCache_VAR_CONSTANT_CONSTANT_EXPRESSION_MAX_get();

   public static final native int ModelCache_VAR_CONSTANT_ARRAY_ELEMENT_get();

   public static final native int ModelCache_VAR_CONSTANT_ARRAY_EXPRESSION_MAX_get();

   public static final native int ModelCache_VAR_ARRAY_CONSTANT_ARRAY_SCAL_PROD_get();

   public static final native int ModelCache_VAR_ARRAY_CONSTANT_ARRAY_EXPRESSION_MAX_get();

   public static final native int ModelCache_VAR_ARRAY_MAX_get();

   public static final native int ModelCache_VAR_ARRAY_MIN_get();

   public static final native int ModelCache_VAR_ARRAY_SUM_get();

   public static final native int ModelCache_VAR_ARRAY_EXPRESSION_MAX_get();

   public static final native int ModelCache_VAR_ARRAY_CONSTANT_INDEX_get();

   public static final native int ModelCache_VAR_ARRAY_CONSTANT_EXPRESSION_MAX_get();

   public static final native void delete_ModelCache(long var0);

   public static final native void ModelCache_clear(long var0, ModelCache var2);

   public static final native long ModelCache_findVoidConstraint(long var0, ModelCache var2, int var3);

   public static final native void ModelCache_insertVoidConstraint(long var0, ModelCache var2, long var3, Constraint var5, int var6);

   public static final native long ModelCache_findVarConstantConstraint(long var0, ModelCache var2, long var3, IntVar var5, long var6, int var8);

   public static final native void ModelCache_insertVarConstantConstraint(long var0, ModelCache var2, long var3, Constraint var5, long var6, IntVar var8, long var9, int var11);

   public static final native long ModelCache_findVarConstantConstantConstraint(long var0, ModelCache var2, long var3, IntVar var5, long var6, long var8, int var10);

   public static final native void ModelCache_insertVarConstantConstantConstraint(long var0, ModelCache var2, long var3, Constraint var5, long var6, IntVar var8, long var9, long var11, int var13);

   public static final native long ModelCache_findExprExprConstraint(long var0, ModelCache var2, long var3, IntExpr var5, long var6, IntExpr var8, int var9);

   public static final native void ModelCache_insertExprExprConstraint(long var0, ModelCache var2, long var3, Constraint var5, long var6, IntExpr var8, long var9, IntExpr var11, int var12);

   public static final native long ModelCache_findExprExpression(long var0, ModelCache var2, long var3, IntExpr var5, int var6);

   public static final native void ModelCache_insertExprExpression(long var0, ModelCache var2, long var3, IntExpr var5, long var6, IntExpr var8, int var9);

   public static final native long ModelCache_findExprConstantExpression(long var0, ModelCache var2, long var3, IntExpr var5, long var6, int var8);

   public static final native void ModelCache_insertExprConstantExpression(long var0, ModelCache var2, long var3, IntExpr var5, long var6, IntExpr var8, long var9, int var11);

   public static final native long ModelCache_findExprExprExpression(long var0, ModelCache var2, long var3, IntExpr var5, long var6, IntExpr var8, int var9);

   public static final native void ModelCache_insertExprExprExpression(long var0, ModelCache var2, long var3, IntExpr var5, long var6, IntExpr var8, long var9, IntExpr var11, int var12);

   public static final native long ModelCache_findExprExprConstantExpression(long var0, ModelCache var2, long var3, IntExpr var5, long var6, IntExpr var8, long var9, int var11);

   public static final native void ModelCache_insertExprExprConstantExpression(long var0, ModelCache var2, long var3, IntExpr var5, long var6, IntExpr var8, long var9, IntExpr var11, long var12, int var14);

   public static final native long ModelCache_findVarConstantConstantExpression(long var0, ModelCache var2, long var3, IntVar var5, long var6, long var8, int var10);

   public static final native void ModelCache_insertVarConstantConstantExpression(long var0, ModelCache var2, long var3, IntExpr var5, long var6, IntVar var8, long var9, long var11, int var13);

   public static final native long ModelCache_findVarConstantArrayExpression(long var0, ModelCache var2, long var3, IntVar var5, long[] var6, int var7);

   public static final native void ModelCache_insertVarConstantArrayExpression(long var0, ModelCache var2, long var3, IntExpr var5, long var6, IntVar var8, long[] var9, int var10);

   public static final native long ModelCache_findVarArrayExpression(long var0, ModelCache var2, IntVar[] var3, int var4);

   public static final native void ModelCache_insertVarArrayExpression(long var0, ModelCache var2, long var3, IntExpr var5, IntVar[] var6, int var7);

   public static final native long ModelCache_findVarArrayConstantArrayExpression(long var0, ModelCache var2, IntVar[] var3, long[] var4, int var5);

   public static final native void ModelCache_insertVarArrayConstantArrayExpression(long var0, ModelCache var2, long var3, IntExpr var5, IntVar[] var6, long[] var7, int var8);

   public static final native long ModelCache_findVarArrayConstantExpression(long var0, ModelCache var2, IntVar[] var3, long var4, int var6);

   public static final native void ModelCache_insertVarArrayConstantExpression(long var0, ModelCache var2, long var3, IntExpr var5, IntVar[] var6, long var7, int var9);

   public static final native long ModelCache_solver(long var0, ModelCache var2);

   public static final native long new_RevPartialSequence__SWIG_0(int[] var0);

   public static final native long new_RevPartialSequence__SWIG_1(int var0);

   public static final native void delete_RevPartialSequence(long var0);

   public static final native int RevPartialSequence_numFirstRanked(long var0, RevPartialSequence var2);

   public static final native int RevPartialSequence_numLastRanked(long var0, RevPartialSequence var2);

   public static final native int RevPartialSequence_size(long var0, RevPartialSequence var2);

   public static final native void RevPartialSequence_rankFirst(long var0, RevPartialSequence var2, long var3, Solver var5, int var6);

   public static final native void RevPartialSequence_rankLast(long var0, RevPartialSequence var2, long var3, Solver var5, int var6);

   public static final native boolean RevPartialSequence_isRanked(long var0, RevPartialSequence var2, int var3);

   public static final native String RevPartialSequence_toString(long var0, RevPartialSequence var2);

   public static final native boolean areAllBound(IntVar[] var0);

   public static final native boolean areAllBooleans(IntVar[] var0);

   public static final native boolean areAllBoundTo(IntVar[] var0, long var1);

   public static final native long maxVarArray(IntVar[] var0);

   public static final native long minVarArray(IntVar[] var0);

   public static final native long posIntDivUp(long var0, long var2);

   public static final native long posIntDivDown(long var0, long var2);

   public static final native long new_LocalSearchPhaseParameters();

   public static final native void delete_LocalSearchPhaseParameters(long var0);

   public static final native long new_RevInteger(int var0);

   public static final native int RevInteger_value(long var0, RevInteger var2);

   public static final native void RevInteger_setValue(long var0, RevInteger var2, long var3, Solver var5, int var6);

   public static final native void delete_RevInteger(long var0);

   public static final native long new_RevLong(long var0);

   public static final native long RevLong_value(long var0, RevLong var2);

   public static final native void RevLong_setValue(long var0, RevLong var2, long var3, Solver var5, long var6);

   public static final native void delete_RevLong(long var0);

   public static final native long new_RevBool(boolean var0);

   public static final native boolean RevBool_value(long var0, RevBool var2);

   public static final native void RevBool_setValue(long var0, RevBool var2, long var3, Solver var5, boolean var6);

   public static final native void delete_RevBool(long var0);

   public static final native long new_AssignmentIntContainer();

   public static final native long AssignmentIntContainer_add(long var0, AssignmentIntContainer var2, long var3, IntVar var5);

   public static final native long AssignmentIntContainer_fastAdd(long var0, AssignmentIntContainer var2, long var3, IntVar var5);

   public static final native long AssignmentIntContainer_addAtPosition(long var0, AssignmentIntContainer var2, long var3, IntVar var5, int var6);

   public static final native void AssignmentIntContainer_clear(long var0, AssignmentIntContainer var2);

   public static final native void AssignmentIntContainer_resize(long var0, AssignmentIntContainer var2, long var3);

   public static final native boolean AssignmentIntContainer_empty(long var0, AssignmentIntContainer var2);

   public static final native void AssignmentIntContainer_copyIntersection(long var0, AssignmentIntContainer var2, long var3, AssignmentIntContainer var5);

   public static final native void AssignmentIntContainer_copy(long var0, AssignmentIntContainer var2, long var3, AssignmentIntContainer var5);

   public static final native boolean AssignmentIntContainer_contains(long var0, AssignmentIntContainer var2, long var3, IntVar var5);

   public static final native long AssignmentIntContainer_mutableElement__SWIG_0(long var0, AssignmentIntContainer var2, long var3, IntVar var5);

   public static final native long AssignmentIntContainer_element__SWIG_0(long var0, AssignmentIntContainer var2, long var3, IntVar var5);

   public static final native long AssignmentIntContainer_mutableElement__SWIG_1(long var0, AssignmentIntContainer var2, int var3);

   public static final native long AssignmentIntContainer_element__SWIG_1(long var0, AssignmentIntContainer var2, int var3);

   public static final native int AssignmentIntContainer_size(long var0, AssignmentIntContainer var2);

   public static final native void AssignmentIntContainer_store(long var0, AssignmentIntContainer var2);

   public static final native void AssignmentIntContainer_restore(long var0, AssignmentIntContainer var2);

   public static final native boolean AssignmentIntContainer_AreAllElementsBound(long var0, AssignmentIntContainer var2);

   public static final native void delete_AssignmentIntContainer(long var0);

   public static final native long new_AssignmentIntervalContainer();

   public static final native long AssignmentIntervalContainer_add(long var0, AssignmentIntervalContainer var2, long var3, IntervalVar var5);

   public static final native long AssignmentIntervalContainer_fastAdd(long var0, AssignmentIntervalContainer var2, long var3, IntervalVar var5);

   public static final native long AssignmentIntervalContainer_addAtPosition(long var0, AssignmentIntervalContainer var2, long var3, IntervalVar var5, int var6);

   public static final native void AssignmentIntervalContainer_clear(long var0, AssignmentIntervalContainer var2);

   public static final native void AssignmentIntervalContainer_resize(long var0, AssignmentIntervalContainer var2, long var3);

   public static final native boolean AssignmentIntervalContainer_empty(long var0, AssignmentIntervalContainer var2);

   public static final native void AssignmentIntervalContainer_copyIntersection(long var0, AssignmentIntervalContainer var2, long var3, AssignmentIntervalContainer var5);

   public static final native void AssignmentIntervalContainer_copy(long var0, AssignmentIntervalContainer var2, long var3, AssignmentIntervalContainer var5);

   public static final native boolean AssignmentIntervalContainer_contains(long var0, AssignmentIntervalContainer var2, long var3, IntervalVar var5);

   public static final native long AssignmentIntervalContainer_mutableElement__SWIG_0(long var0, AssignmentIntervalContainer var2, long var3, IntervalVar var5);

   public static final native long AssignmentIntervalContainer_element__SWIG_0(long var0, AssignmentIntervalContainer var2, long var3, IntervalVar var5);

   public static final native long AssignmentIntervalContainer_mutableElement__SWIG_1(long var0, AssignmentIntervalContainer var2, int var3);

   public static final native long AssignmentIntervalContainer_element__SWIG_1(long var0, AssignmentIntervalContainer var2, int var3);

   public static final native int AssignmentIntervalContainer_size(long var0, AssignmentIntervalContainer var2);

   public static final native void AssignmentIntervalContainer_store(long var0, AssignmentIntervalContainer var2);

   public static final native void AssignmentIntervalContainer_restore(long var0, AssignmentIntervalContainer var2);

   public static final native boolean AssignmentIntervalContainer_AreAllElementsBound(long var0, AssignmentIntervalContainer var2);

   public static final native void delete_AssignmentIntervalContainer(long var0);

   public static final native long new_AssignmentSequenceContainer();

   public static final native long AssignmentSequenceContainer_add(long var0, AssignmentSequenceContainer var2, long var3, SequenceVar var5);

   public static final native long AssignmentSequenceContainer_fastAdd(long var0, AssignmentSequenceContainer var2, long var3, SequenceVar var5);

   public static final native long AssignmentSequenceContainer_addAtPosition(long var0, AssignmentSequenceContainer var2, long var3, SequenceVar var5, int var6);

   public static final native void AssignmentSequenceContainer_clear(long var0, AssignmentSequenceContainer var2);

   public static final native void AssignmentSequenceContainer_resize(long var0, AssignmentSequenceContainer var2, long var3);

   public static final native boolean AssignmentSequenceContainer_empty(long var0, AssignmentSequenceContainer var2);

   public static final native void AssignmentSequenceContainer_copyIntersection(long var0, AssignmentSequenceContainer var2, long var3, AssignmentSequenceContainer var5);

   public static final native void AssignmentSequenceContainer_copy(long var0, AssignmentSequenceContainer var2, long var3, AssignmentSequenceContainer var5);

   public static final native boolean AssignmentSequenceContainer_contains(long var0, AssignmentSequenceContainer var2, long var3, SequenceVar var5);

   public static final native long AssignmentSequenceContainer_mutableElement__SWIG_0(long var0, AssignmentSequenceContainer var2, long var3, SequenceVar var5);

   public static final native long AssignmentSequenceContainer_element__SWIG_0(long var0, AssignmentSequenceContainer var2, long var3, SequenceVar var5);

   public static final native long AssignmentSequenceContainer_mutableElement__SWIG_1(long var0, AssignmentSequenceContainer var2, int var3);

   public static final native long AssignmentSequenceContainer_element__SWIG_1(long var0, AssignmentSequenceContainer var2, int var3);

   public static final native int AssignmentSequenceContainer_size(long var0, AssignmentSequenceContainer var2);

   public static final native void AssignmentSequenceContainer_store(long var0, AssignmentSequenceContainer var2);

   public static final native void AssignmentSequenceContainer_restore(long var0, AssignmentSequenceContainer var2);

   public static final native boolean AssignmentSequenceContainer_AreAllElementsBound(long var0, AssignmentSequenceContainer var2);

   public static final native void delete_AssignmentSequenceContainer(long var0);

   public static final native long new_RoutingIndexManager__SWIG_0(int var0, int var1, int var2);

   public static final native long new_RoutingIndexManager__SWIG_1(int var0, int var1, int[] var2, int[] var3);

   public static final native void delete_RoutingIndexManager(long var0);

   public static final native int RoutingIndexManager_getNumberOfNodes(long var0, RoutingIndexManager var2);

   public static final native int RoutingIndexManager_getNumberOfVehicles(long var0, RoutingIndexManager var2);

   public static final native int RoutingIndexManager_getNumberOfIndices(long var0, RoutingIndexManager var2);

   public static final native long RoutingIndexManager_nodeToIndex(long var0, RoutingIndexManager var2, int var3);

   public static final native long[] RoutingIndexManager_nodesToIndices(long var0, RoutingIndexManager var2, int[] var3);

   public static final native int RoutingIndexManager_indexToNode(long var0, RoutingIndexManager var2, long var3);

   public static final native byte[] defaultRoutingModelParameters();

   public static final native byte[] defaultRoutingSearchParameters();

   public static final native String findErrorInRoutingSearchParameters(byte[] var0);

   public static final native int RoutingModel_ROUTING_NOT_SOLVED_get();

   public static final native int RoutingModel_ROUTING_SUCCESS_get();

   public static final native int RoutingModel_ROUTING_FAIL_get();

   public static final native int RoutingModel_ROUTING_FAIL_TIMEOUT_get();

   public static final native int RoutingModel_ROUTING_INVALID_get();

   public static final native int RoutingModel_PICKUP_AND_DELIVERY_NO_ORDER_get();

   public static final native int RoutingModel_PICKUP_AND_DELIVERY_LIFO_get();

   public static final native int RoutingModel_PICKUP_AND_DELIVERY_FIFO_get();

   public static final native long RoutingModel_kNoPenalty_get();

   public static final native int RoutingModel_kNoDisjunction_get();

   public static final native int RoutingModel_kNoDimension_get();

   public static final native long new_RoutingModel__SWIG_0(long var0, RoutingIndexManager var2);

   public static final native long new_RoutingModel__SWIG_1(long var0, RoutingIndexManager var2, byte[] var3);

   public static final native void delete_RoutingModel(long var0);

   public static final native int RoutingModel_registerUnaryTransitCallback(long var0, RoutingModel var2, LongUnaryOperator var3);

   public static final native int RoutingModel_RegisterPositiveUnaryTransitCallback(long var0, RoutingModel var2, LongUnaryOperator var3);

   public static final native int RoutingModel_registerTransitCallback(long var0, RoutingModel var2, LongBinaryOperator var3);

   public static final native int RoutingModel_registerPositiveTransitCallback(long var0, RoutingModel var2, LongBinaryOperator var3);

   public static final native boolean RoutingModel_addDimension(long var0, RoutingModel var2, int var3, long var4, long var6, boolean var8, String var9);

   public static final native boolean RoutingModel_addDimensionWithVehicleTransits(long var0, RoutingModel var2, int[] var3, long var4, long var6, boolean var8, String var9);

   public static final native boolean RoutingModel_addDimensionWithVehicleCapacity(long var0, RoutingModel var2, int var3, long var4, long[] var6, boolean var7, String var8);

   public static final native boolean RoutingModel_addDimensionWithVehicleTransitAndCapacity(long var0, RoutingModel var2, int[] var3, long var4, long[] var6, boolean var7, String var8);

   public static final native boolean RoutingModel_addConstantDimensionWithSlack(long var0, RoutingModel var2, long var3, long var5, long var7, boolean var9, String var10);

   public static final native boolean RoutingModel_addConstantDimension(long var0, RoutingModel var2, long var3, long var5, boolean var7, String var8);

   public static final native boolean RoutingModel_addVectorDimension(long var0, RoutingModel var2, long[] var3, long var4, boolean var6, String var7);

   public static final native long RoutingModel_MakePathSpansAndTotalSlacks(long var0, RoutingModel var2, long var3, RoutingDimension var5, IntVar[] var6, IntVar[] var7);

   public static final native long RoutingModel_GetGlobalDimensionCumulOptimizers(long var0, RoutingModel var2);

   public static final native long RoutingModel_GetLocalDimensionCumulOptimizers(long var0, RoutingModel var2);

   public static final native long RoutingModel_GetMutableGlobalCumulOptimizer(long var0, RoutingModel var2, long var3, RoutingDimension var5);

   public static final native long RoutingModel_GetMutableLocalCumulOptimizer(long var0, RoutingModel var2, long var3, RoutingDimension var5);

   public static final native boolean RoutingModel_hasDimension(long var0, RoutingModel var2, String var3);

   public static final native long RoutingModel_getDimensionOrDie(long var0, RoutingModel var2, String var3);

   public static final native long RoutingModel_getMutableDimension(long var0, RoutingModel var2, String var3);

   public static final native void RoutingModel_setPrimaryConstrainedDimension(long var0, RoutingModel var2, String var3);

   public static final native String RoutingModel_getPrimaryConstrainedDimension(long var0, RoutingModel var2);

   public static final native int RoutingModel_addDisjunction__SWIG_0(long var0, RoutingModel var2, long[] var3, long var4, long var6);

   public static final native int RoutingModel_addDisjunction__SWIG_1(long var0, RoutingModel var2, long[] var3, long var4);

   public static final native int RoutingModel_addDisjunction__SWIG_2(long var0, RoutingModel var2, long[] var3);

   public static final native int[] RoutingModel_getDisjunctionIndices__SWIG_0(long var0, RoutingModel var2, long var3);

   public static final native long[] RoutingModel_getDisjunctionIndices__SWIG_1(long var0, RoutingModel var2, int var3);

   public static final native long RoutingModel_getDisjunctionPenalty(long var0, RoutingModel var2, int var3);

   public static final native long RoutingModel_getDisjunctionMaxCardinality(long var0, RoutingModel var2, int var3);

   public static final native int RoutingModel_getNumberOfDisjunctions(long var0, RoutingModel var2);

   public static final native void RoutingModel_ignoreDisjunctionsAlreadyForcedToZero(long var0, RoutingModel var2);

   public static final native void RoutingModel_addSoftSameVehicleConstraint(long var0, RoutingModel var2, long[] var3, long var4);

   public static final native void RoutingModel_setAllowedVehiclesForIndex(long var0, RoutingModel var2, int[] var3, long var4);

   public static final native boolean RoutingModel_isVehicleAllowedForIndex(long var0, RoutingModel var2, int var3, long var4);

   public static final native void RoutingModel_addPickupAndDelivery(long var0, RoutingModel var2, long var3, long var5);

   public static final native void RoutingModel_addPickupAndDeliverySets(long var0, RoutingModel var2, int var3, int var4);

   public static final native void RoutingModel_setPickupAndDeliveryPolicyOfAllVehicles(long var0, RoutingModel var2, int var3);

   public static final native void RoutingModel_setPickupAndDeliveryPolicyOfVehicle(long var0, RoutingModel var2, int var3, int var4);

   public static final native int RoutingModel_getPickupAndDeliveryPolicyOfVehicle(long var0, RoutingModel var2, int var3);

   public static final native int RoutingModel_getNumOfSingletonNodes(long var0, RoutingModel var2);

   public static final native void RoutingModel_setVisitType(long var0, RoutingModel var2, long var3, int var5);

   public static final native int RoutingModel_getVisitType(long var0, RoutingModel var2, long var3);

   public static final native int RoutingModel_getNumberOfVisitTypes(long var0, RoutingModel var2);

   public static final native long RoutingModel_unperformedPenalty(long var0, RoutingModel var2, long var3);

   public static final native long RoutingModel_unperformedPenaltyOrValue(long var0, RoutingModel var2, long var3, long var5);

   public static final native long RoutingModel_getDepot(long var0, RoutingModel var2);

   public static final native void RoutingModel_setArcCostEvaluatorOfAllVehicles(long var0, RoutingModel var2, int var3);

   public static final native void RoutingModel_setArcCostEvaluatorOfVehicle(long var0, RoutingModel var2, int var3, int var4);

   public static final native void RoutingModel_setFixedCostOfAllVehicles(long var0, RoutingModel var2, long var3);

   public static final native void RoutingModel_setFixedCostOfVehicle(long var0, RoutingModel var2, long var3, int var5);

   public static final native long RoutingModel_getFixedCostOfVehicle(long var0, RoutingModel var2, int var3);

   public static final native void RoutingModel_setAmortizedCostFactorsOfAllVehicles(long var0, RoutingModel var2, long var3, long var5);

   public static final native void RoutingModel_setAmortizedCostFactorsOfVehicle(long var0, RoutingModel var2, long var3, long var5, int var7);

   public static final native long[] RoutingModel_getAmortizedLinearCostFactorOfVehicles(long var0, RoutingModel var2);

   public static final native long[] RoutingModel_getAmortizedQuadraticCostFactorOfVehicles(long var0, RoutingModel var2);

   public static final native void RoutingModel_ConsiderEmptyRouteCostsForVehicle(long var0, RoutingModel var2, boolean var3, int var4);

   public static final native boolean RoutingModel_AreEmptyRouteCostsConsideredForVehicle(long var0, RoutingModel var2, int var3);

   public static final native void RoutingModel_setFirstSolutionEvaluator(long var0, RoutingModel var2, LongBinaryOperator var3);

   public static final native void RoutingModel_addLocalSearchOperator(long var0, RoutingModel var2, long var3, LocalSearchOperator var5);

   public static final native void RoutingModel_addSearchMonitor(long var0, RoutingModel var2, long var3, SearchMonitor var5);

   public static final native void RoutingModel_addAtSolutionCallback(long var0, RoutingModel var2, Runnable var3);

   public static final native void RoutingModel_addVariableMinimizedByFinalizer(long var0, RoutingModel var2, long var3, IntVar var5);

   public static final native void RoutingModel_addVariableMaximizedByFinalizer(long var0, RoutingModel var2, long var3, IntVar var5);

   public static final native void RoutingModel_AddWeightedVariableMinimizedByFinalizer(long var0, RoutingModel var2, long var3, IntVar var5, long var6);

   public static final native void RoutingModel_AddVariableTargetToFinalizer(long var0, RoutingModel var2, long var3, IntVar var5, long var6);

   public static final native void RoutingModel_closeModel(long var0, RoutingModel var2);

   public static final native void RoutingModel_closeModelWithParameters(long var0, RoutingModel var2, byte[] var3);

   public static final native long RoutingModel_solve__SWIG_0(long var0, RoutingModel var2, long var3, Assignment var5);

   public static final native long RoutingModel_solve__SWIG_1(long var0, RoutingModel var2);

   public static final native long RoutingModel_solveWithParameters(long var0, RoutingModel var2, byte[] var3);

   public static final native long RoutingModel_solveFromAssignmentWithParameters(long var0, RoutingModel var2, long var3, Assignment var5, byte[] var6);

   public static final native void RoutingModel_setAssignmentFromOtherModelAssignment(long var0, RoutingModel var2, long var3, Assignment var5, long var6, RoutingModel var8, long var9, Assignment var11);

   public static final native long RoutingModel_computeLowerBound(long var0, RoutingModel var2);

   public static final native int RoutingModel_status(long var0, RoutingModel var2);

   public static final native long RoutingModel_applyLocks(long var0, RoutingModel var2, long[] var3);

   public static final native boolean RoutingModel_applyLocksToAllVehicles(long var0, RoutingModel var2, long[][] var3, boolean var4);

   public static final native long RoutingModel_preAssignment(long var0, RoutingModel var2);

   public static final native long RoutingModel_mutablePreAssignment(long var0, RoutingModel var2);

   public static final native boolean RoutingModel_writeAssignment(long var0, RoutingModel var2, String var3);

   public static final native long RoutingModel_readAssignment(long var0, RoutingModel var2, String var3);

   public static final native long RoutingModel_restoreAssignment(long var0, RoutingModel var2, long var3, Assignment var5);

   public static final native long RoutingModel_readAssignmentFromRoutes(long var0, RoutingModel var2, long[][] var3, boolean var4);

   public static final native boolean RoutingModel_routesToAssignment(long var0, RoutingModel var2, long[][] var3, boolean var4, boolean var5, long var6, Assignment var8);

   public static final native void RoutingModel_assignmentToRoutes(long var0, RoutingModel var2, long var3, Assignment var5, long[][] var6);

   public static final native long RoutingModel_compactAssignment(long var0, RoutingModel var2, long var3, Assignment var5);

   public static final native long RoutingModel_compactAndCheckAssignment(long var0, RoutingModel var2, long var3, Assignment var5);

   public static final native void RoutingModel_addToAssignment(long var0, RoutingModel var2, long var3, IntVar var5);

   public static final native void RoutingModel_addIntervalToAssignment(long var0, RoutingModel var2, long var3, IntervalVar var5);

   public static final native long RoutingModel_PackCumulsOfOptimizerDimensionsFromAssignment(long var0, RoutingModel var2, long var3, Assignment var5, long var6);

   public static final native void RoutingModel_addLocalSearchFilter(long var0, RoutingModel var2, long var3, LocalSearchFilter var5);

   public static final native long RoutingModel_start(long var0, RoutingModel var2, int var3);

   public static final native long RoutingModel_end(long var0, RoutingModel var2, int var3);

   public static final native boolean RoutingModel_isStart(long var0, RoutingModel var2, long var3);

   public static final native boolean RoutingModel_isEnd(long var0, RoutingModel var2, long var3);

   public static final native int RoutingModel_VehicleIndex(long var0, RoutingModel var2, int var3);

   public static final native long RoutingModel_next(long var0, RoutingModel var2, long var3, Assignment var5, long var6);

   public static final native boolean RoutingModel_isVehicleUsed(long var0, RoutingModel var2, long var3, Assignment var5, int var6);

   public static final native IntVar[] RoutingModel_nexts(long var0, RoutingModel var2);

   public static final native IntVar[] RoutingModel_vehicleVars(long var0, RoutingModel var2);

   public static final native long RoutingModel_nextVar(long var0, RoutingModel var2, long var3);

   public static final native long RoutingModel_activeVar(long var0, RoutingModel var2, long var3);

   public static final native long RoutingModel_VehicleCostsConsideredVar(long var0, RoutingModel var2, int var3);

   public static final native long RoutingModel_vehicleVar(long var0, RoutingModel var2, long var3);

   public static final native long RoutingModel_costVar(long var0, RoutingModel var2);

   public static final native long RoutingModel_getArcCostForVehicle(long var0, RoutingModel var2, long var3, long var5, long var7);

   public static final native boolean RoutingModel_costsAreHomogeneousAcrossVehicles(long var0, RoutingModel var2);

   public static final native long RoutingModel_getHomogeneousCost(long var0, RoutingModel var2, long var3, long var5);

   public static final native long RoutingModel_getArcCostForFirstSolution(long var0, RoutingModel var2, long var3, long var5);

   public static final native long RoutingModel_getArcCostForClass(long var0, RoutingModel var2, long var3, long var5, long var7);

   public static final native int RoutingModel_getCostClassIndexOfVehicle(long var0, RoutingModel var2, long var3);

   public static final native boolean RoutingModel_hasVehicleWithCostClassIndex(long var0, RoutingModel var2, int var3);

   public static final native int RoutingModel_getCostClassesCount(long var0, RoutingModel var2);

   public static final native int RoutingModel_getNonZeroCostClassesCount(long var0, RoutingModel var2);

   public static final native int RoutingModel_getVehicleClassIndexOfVehicle(long var0, RoutingModel var2, long var3);

   public static final native int RoutingModel_getVehicleClassesCount(long var0, RoutingModel var2);

   public static final native int[] RoutingModel_getSameVehicleIndicesOfIndex(long var0, RoutingModel var2, int var3);

   public static final native boolean RoutingModel_arcIsMoreConstrainedThanArc(long var0, RoutingModel var2, long var3, long var5, long var7);

   public static final native String RoutingModel_debugOutputAssignment(long var0, RoutingModel var2, long var3, Assignment var5, String var6);

   public static final native long RoutingModel_solver(long var0, RoutingModel var2);

   public static final native boolean RoutingModel_checkLimit(long var0, RoutingModel var2);

   public static final native long RoutingModel_RemainingTime(long var0, RoutingModel var2);

   public static final native int RoutingModel_nodes(long var0, RoutingModel var2);

   public static final native int RoutingModel_vehicles(long var0, RoutingModel var2);

   public static final native long RoutingModel_size(long var0, RoutingModel var2);

   public static final native long RoutingModel_getNumberOfDecisionsInFirstSolution(long var0, RoutingModel var2, byte[] var3);

   public static final native long RoutingModel_getNumberOfRejectsInFirstSolution(long var0, RoutingModel var2, byte[] var3);

   public static final native boolean RoutingModel_isMatchingModel(long var0, RoutingModel var2);

   public static final native long RoutingModel_makeGuidedSlackFinalizer(long var0, RoutingModel var2, long var3, RoutingDimension var5, LongUnaryOperator var6);

   public static final native long RoutingModel_makeSelfDependentDimensionFinalizer(long var0, RoutingModel var2, long var3, RoutingDimension var5);

   public static final native void RoutingModel_addMatrixDimension(long var0, RoutingModel var2, long[][] var3, long var4, boolean var6, String var7);

   public static final native String RoutingModelVisitor_kLightElement_get();

   public static final native String RoutingModelVisitor_kLightElement2_get();

   public static final native String RoutingModelVisitor_kRemoveValues_get();

   public static final native long new_RoutingModelVisitor();

   public static final native void delete_RoutingModelVisitor(long var0);

   public static final native long new_GlobalVehicleBreaksConstraint(long var0, RoutingDimension var2);

   public static final native String GlobalVehicleBreaksConstraint_toString(long var0, GlobalVehicleBreaksConstraint var2);

   public static final native void GlobalVehicleBreaksConstraint_post(long var0, GlobalVehicleBreaksConstraint var2);

   public static final native void GlobalVehicleBreaksConstraint_initialPropagate(long var0, GlobalVehicleBreaksConstraint var2);

   public static final native void delete_GlobalVehicleBreaksConstraint(long var0);

   public static final native void delete_TypeRegulationsChecker(long var0);

   public static final native boolean TypeRegulationsChecker_CheckVehicle(long var0, TypeRegulationsChecker var2, int var3, long var4);

   public static final native long new_TypeIncompatibilityChecker(long var0, RoutingModel var2, boolean var3);

   public static final native void delete_TypeIncompatibilityChecker(long var0);

   public static final native long new_TypeRequirementChecker(long var0, RoutingModel var2);

   public static final native void delete_TypeRequirementChecker(long var0);

   public static final native long new_TypeRegulationsConstraint(long var0, RoutingModel var2);

   public static final native void TypeRegulationsConstraint_post(long var0, TypeRegulationsConstraint var2);

   public static final native void TypeRegulationsConstraint_initialPropagate(long var0, TypeRegulationsConstraint var2);

   public static final native void delete_TypeRegulationsConstraint(long var0);

   public static final native void delete_RoutingDimension(long var0);

   public static final native long RoutingDimension_model(long var0, RoutingDimension var2);

   public static final native long RoutingDimension_getTransitValue(long var0, RoutingDimension var2, long var3, long var5, long var7);

   public static final native long RoutingDimension_getTransitValueFromClass(long var0, RoutingDimension var2, long var3, long var5, long var7);

   public static final native long RoutingDimension_cumulVar(long var0, RoutingDimension var2, long var3);

   public static final native long RoutingDimension_transitVar(long var0, RoutingDimension var2, long var3);

   public static final native long RoutingDimension_fixedTransitVar(long var0, RoutingDimension var2, long var3);

   public static final native long RoutingDimension_slackVar(long var0, RoutingDimension var2, long var3);

   public static final native IntVar[] RoutingDimension_cumuls(long var0, RoutingDimension var2);

   public static final native IntVar[] RoutingDimension_fixed_transits(long var0, RoutingDimension var2);

   public static final native IntVar[] RoutingDimension_transits(long var0, RoutingDimension var2);

   public static final native IntVar[] RoutingDimension_slacks(long var0, RoutingDimension var2);

   public static final native void RoutingDimension_setSpanUpperBoundForVehicle(long var0, RoutingDimension var2, long var3, int var5);

   public static final native void RoutingDimension_setSpanCostCoefficientForVehicle(long var0, RoutingDimension var2, long var3, int var5);

   public static final native void RoutingDimension_setSpanCostCoefficientForAllVehicles(long var0, RoutingDimension var2, long var3);

   public static final native void RoutingDimension_setGlobalSpanCostCoefficient(long var0, RoutingDimension var2, long var3);

   public static final native void RoutingDimension_setCumulVarSoftUpperBound(long var0, RoutingDimension var2, long var3, long var5, long var7);

   public static final native boolean RoutingDimension_hasCumulVarSoftUpperBound(long var0, RoutingDimension var2, long var3);

   public static final native long RoutingDimension_getCumulVarSoftUpperBound(long var0, RoutingDimension var2, long var3);

   public static final native long RoutingDimension_getCumulVarSoftUpperBoundCoefficient(long var0, RoutingDimension var2, long var3);

   public static final native void RoutingDimension_setCumulVarSoftLowerBound(long var0, RoutingDimension var2, long var3, long var5, long var7);

   public static final native boolean RoutingDimension_hasCumulVarSoftLowerBound(long var0, RoutingDimension var2, long var3);

   public static final native long RoutingDimension_getCumulVarSoftLowerBound(long var0, RoutingDimension var2, long var3);

   public static final native long RoutingDimension_getCumulVarSoftLowerBoundCoefficient(long var0, RoutingDimension var2, long var3);

   public static final native void RoutingDimension_setBreakIntervalsOfVehicle__SWIG_0(long var0, RoutingDimension var2, IntervalVar[] var3, int var4, int var5, int var6);

   public static final native void RoutingDimension_setBreakIntervalsOfVehicle__SWIG_1(long var0, RoutingDimension var2, IntervalVar[] var3, int var4, long[] var5);

   public static final native void RoutingDimension_SetBreakDistanceDurationOfVehicle(long var0, RoutingDimension var2, long var3, long var5, int var7);

   public static final native void RoutingDimension_InitializeBreaks(long var0, RoutingDimension var2);

   public static final native boolean RoutingDimension_HasBreakConstraints(long var0, RoutingDimension var2);

   public static final native void RoutingDimension_setBreakIntervalsOfVehicle__SWIG_2(long var0, RoutingDimension var2, IntervalVar[] var3, int var4, long[] var5, LongBinaryOperator var6);

   public static final native IntervalVar[] RoutingDimension_getBreakIntervalsOfVehicle(long var0, RoutingDimension var2, int var3);

   public static final native long RoutingDimension_GetBreakDistanceDurationOfVehicle(long var0, RoutingDimension var2, int var3);

   public static final native int RoutingDimension_GetPreTravelEvaluatorOfVehicle(long var0, RoutingDimension var2, int var3);

   public static final native int RoutingDimension_GetPostTravelEvaluatorOfVehicle(long var0, RoutingDimension var2, int var3);

   public static final native long RoutingDimension_base_dimension(long var0, RoutingDimension var2);

   public static final native long RoutingDimension_shortestTransitionSlack(long var0, RoutingDimension var2, long var3);

   public static final native String RoutingDimension_name(long var0, RoutingDimension var2);

   public static final native void RoutingDimension_setPickupToDeliveryLimitFunctionForPair(long var0, RoutingDimension var2, IntIntToLongFunction var3, int var4);

   public static final native boolean RoutingDimension_hasPickupToDeliveryLimits(long var0, RoutingDimension var2);

   public static final native void RoutingDimension_addNodePrecedence(long var0, RoutingDimension var2, long var3, long var5, long var7);

   public static final native long RoutingDimension_getSpanUpperBoundForVehicle(long var0, RoutingDimension var2, int var3);

   public static final native long RoutingDimension_getSpanCostCoefficientForVehicle(long var0, RoutingDimension var2, int var3);

   public static final native long RoutingDimension_getGlobalSpanCostCoefficient(long var0, RoutingDimension var2);

   public static final native long RoutingDimension_GetGlobalOptimizerOffset(long var0, RoutingDimension var2);

   public static final native long RoutingDimension_GetLocalOptimizerOffsetForVehicle(long var0, RoutingDimension var2, int var3);

   public static final native long makeSetValuesFromTargets(long var0, Solver var2, IntVar[] var3, long[] var4);

   public static final native void delete_IntVarFilteredDecisionBuilder(long var0);

   public static final native long IntVarFilteredDecisionBuilder_nextWrap(long var0, IntVarFilteredDecisionBuilder var2, long var3, Solver var5);

   public static final native boolean IntVarFilteredDecisionBuilder_buildSolution(long var0, IntVarFilteredDecisionBuilder var2);

   public static final native long IntVarFilteredDecisionBuilder_number_of_decisions(long var0, IntVarFilteredDecisionBuilder var2);

   public static final native long IntVarFilteredDecisionBuilder_number_of_rejects(long var0, IntVarFilteredDecisionBuilder var2);

   public static final native void delete_RoutingFilteredDecisionBuilder(long var0);

   public static final native long RoutingFilteredDecisionBuilder_model(long var0, RoutingFilteredDecisionBuilder var2);

   public static final native int RoutingFilteredDecisionBuilder_getStartChainEnd(long var0, RoutingFilteredDecisionBuilder var2, int var3);

   public static final native int RoutingFilteredDecisionBuilder_getEndChainStart(long var0, RoutingFilteredDecisionBuilder var2, int var3);

   public static final native void RoutingFilteredDecisionBuilder_makeDisjunctionNodesUnperformed(long var0, RoutingFilteredDecisionBuilder var2, long var3);

   public static final native void RoutingFilteredDecisionBuilder_makeUnassignedNodesUnperformed(long var0, RoutingFilteredDecisionBuilder var2);

   public static final native void delete_CheapestInsertionFilteredDecisionBuilder(long var0);

   public static final native void delete_GlobalCheapestInsertionFilteredDecisionBuilder(long var0);

   public static final native boolean GlobalCheapestInsertionFilteredDecisionBuilder_buildSolution(long var0, GlobalCheapestInsertionFilteredDecisionBuilder var2);

   public static final native String GlobalCheapestInsertionFilteredDecisionBuilder_toString(long var0, GlobalCheapestInsertionFilteredDecisionBuilder var2);

   public static final native void delete_LocalCheapestInsertionFilteredDecisionBuilder(long var0);

   public static final native boolean LocalCheapestInsertionFilteredDecisionBuilder_buildSolution(long var0, LocalCheapestInsertionFilteredDecisionBuilder var2);

   public static final native String LocalCheapestInsertionFilteredDecisionBuilder_toString(long var0, LocalCheapestInsertionFilteredDecisionBuilder var2);

   public static final native void delete_CheapestAdditionFilteredDecisionBuilder(long var0);

   public static final native boolean CheapestAdditionFilteredDecisionBuilder_buildSolution(long var0, CheapestAdditionFilteredDecisionBuilder var2);

   public static final native void delete_EvaluatorCheapestAdditionFilteredDecisionBuilder(long var0);

   public static final native String EvaluatorCheapestAdditionFilteredDecisionBuilder_toString(long var0, EvaluatorCheapestAdditionFilteredDecisionBuilder var2);

   public static final native void delete_ComparatorCheapestAdditionFilteredDecisionBuilder(long var0);

   public static final native String ComparatorCheapestAdditionFilteredDecisionBuilder_toString(long var0, ComparatorCheapestAdditionFilteredDecisionBuilder var2);

   public static final native void SavingsFilteredDecisionBuilder_SavingsParameters_neighbors_ratio_set(long var0, SavingsFilteredDecisionBuilder.SavingsParameters var2, double var3);

   public static final native double SavingsFilteredDecisionBuilder_SavingsParameters_neighbors_ratio_get(long var0, SavingsFilteredDecisionBuilder.SavingsParameters var2);

   public static final native void SavingsFilteredDecisionBuilder_SavingsParameters_max_memory_usage_bytes_set(long var0, SavingsFilteredDecisionBuilder.SavingsParameters var2, double var3);

   public static final native double SavingsFilteredDecisionBuilder_SavingsParameters_max_memory_usage_bytes_get(long var0, SavingsFilteredDecisionBuilder.SavingsParameters var2);

   public static final native void SavingsFilteredDecisionBuilder_SavingsParameters_add_reverse_arcs_set(long var0, SavingsFilteredDecisionBuilder.SavingsParameters var2, boolean var3);

   public static final native boolean SavingsFilteredDecisionBuilder_SavingsParameters_add_reverse_arcs_get(long var0, SavingsFilteredDecisionBuilder.SavingsParameters var2);

   public static final native void SavingsFilteredDecisionBuilder_SavingsParameters_arc_coefficient_set(long var0, SavingsFilteredDecisionBuilder.SavingsParameters var2, double var3);

   public static final native double SavingsFilteredDecisionBuilder_SavingsParameters_arc_coefficient_get(long var0, SavingsFilteredDecisionBuilder.SavingsParameters var2);

   public static final native long new_SavingsFilteredDecisionBuilder_SavingsParameters();

   public static final native void delete_SavingsFilteredDecisionBuilder_SavingsParameters(long var0);

   public static final native void delete_SavingsFilteredDecisionBuilder(long var0);

   public static final native boolean SavingsFilteredDecisionBuilder_buildSolution(long var0, SavingsFilteredDecisionBuilder var2);

   public static final native void delete_SequentialSavingsFilteredDecisionBuilder(long var0);

   public static final native String SequentialSavingsFilteredDecisionBuilder_toString(long var0, SequentialSavingsFilteredDecisionBuilder var2);

   public static final native void delete_ParallelSavingsFilteredDecisionBuilder(long var0);

   public static final native String ParallelSavingsFilteredDecisionBuilder_toString(long var0, ParallelSavingsFilteredDecisionBuilder var2);

   public static final native void delete_ChristofidesFilteredDecisionBuilder(long var0);

   public static final native boolean ChristofidesFilteredDecisionBuilder_buildSolution(long var0, ChristofidesFilteredDecisionBuilder var2);

   public static final native String ChristofidesFilteredDecisionBuilder_toString(long var0, ChristofidesFilteredDecisionBuilder var2);

   public static final native boolean SolveModelWithSat(long var0, RoutingModel var2, byte[] var3, long var4, Assignment var6, long var7, Assignment var9);

   public static final native void delete_BasePathFilter(long var0);

   public static final native boolean BasePathFilter_accept(long var0, BasePathFilter var2, long var3, Assignment var5, long var6, Assignment var8, long var9, long var11);

   public static final native void BasePathFilter_onSynchronize(long var0, BasePathFilter var2, long var3, Assignment var5);

   public static final native long new_CPFeasibilityFilter(long var0, RoutingModel var2);

   public static final native void delete_CPFeasibilityFilter(long var0);

   public static final native String CPFeasibilityFilter_toString(long var0, CPFeasibilityFilter var2);

   public static final native boolean CPFeasibilityFilter_accept(long var0, CPFeasibilityFilter var2, long var3, Assignment var5, long var6, Assignment var8, long var9, long var11);

   public static final native void CPFeasibilityFilter_onSynchronize(long var0, CPFeasibilityFilter var2, long var3, Assignment var5);

   public static final native long PropagationBaseObject_SWIGUpcast(long var0);

   public static final native long Decision_SWIGUpcast(long var0);

   public static final native long DecisionVisitor_SWIGUpcast(long var0);

   public static final native long DecisionBuilder_SWIGUpcast(long var0);

   public static final native long Demon_SWIGUpcast(long var0);

   public static final native long ModelVisitor_SWIGUpcast(long var0);

   public static final native long Constraint_SWIGUpcast(long var0);

   public static final native long CastConstraint_SWIGUpcast(long var0);

   public static final native long SearchMonitor_SWIGUpcast(long var0);

   public static final native long IntExpr_SWIGUpcast(long var0);

   public static final native long IntVarIterator_SWIGUpcast(long var0);

   public static final native long IntVar_SWIGUpcast(long var0);

   public static final native long SolutionCollector_SWIGUpcast(long var0);

   public static final native long OptimizeVar_SWIGUpcast(long var0);

   public static final native long SearchLimit_SWIGUpcast(long var0);

   public static final native long RegularLimit_SWIGUpcast(long var0);

   public static final native long IntervalVar_SWIGUpcast(long var0);

   public static final native long SequenceVar_SWIGUpcast(long var0);

   public static final native long IntVarElement_SWIGUpcast(long var0);

   public static final native long IntervalVarElement_SWIGUpcast(long var0);

   public static final native long SequenceVarElement_SWIGUpcast(long var0);

   public static final native long Assignment_SWIGUpcast(long var0);

   public static final native long Pack_SWIGUpcast(long var0);

   public static final native long DisjunctiveConstraint_SWIGUpcast(long var0);

   public static final native long SolutionPool_SWIGUpcast(long var0);

   public static final native long BaseIntExpr_SWIGUpcast(long var0);

   public static final native long LocalSearchOperator_SWIGUpcast(long var0);

   public static final native long IntVarLocalSearchOperatorTemplate_SWIGUpcast(long var0);

   public static final native long IntVarLocalSearchOperator_SWIGUpcast(long var0);

   public static final native long SequenceVarLocalSearchOperatorTemplate_SWIGUpcast(long var0);

   public static final native long SequenceVarLocalSearchOperator_SWIGUpcast(long var0);

   public static final native long BaseLns_SWIGUpcast(long var0);

   public static final native long ChangeValue_SWIGUpcast(long var0);

   public static final native long PathOperator_SWIGUpcast(long var0);

   public static final native long PathWithPreviousNodesOperator_SWIGUpcast(long var0);

   public static final native long LocalSearchFilter_SWIGUpcast(long var0);

   public static final native long IntVarLocalSearchFilter_SWIGUpcast(long var0);

   public static final native long PropagationMonitor_SWIGUpcast(long var0);

   public static final native long LocalSearchMonitor_SWIGUpcast(long var0);

   public static final native long BooleanVar_SWIGUpcast(long var0);

   public static final native long SymmetryBreaker_SWIGUpcast(long var0);

   public static final native long SearchLog_SWIGUpcast(long var0);

   public static final native long RoutingModelVisitor_SWIGUpcast(long var0);

   public static final native long GlobalVehicleBreaksConstraint_SWIGUpcast(long var0);

   public static final native long TypeIncompatibilityChecker_SWIGUpcast(long var0);

   public static final native long TypeRequirementChecker_SWIGUpcast(long var0);

   public static final native long TypeRegulationsConstraint_SWIGUpcast(long var0);

   public static final native long IntVarFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long RoutingFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long CheapestInsertionFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long GlobalCheapestInsertionFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long LocalCheapestInsertionFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long CheapestAdditionFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long EvaluatorCheapestAdditionFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long ComparatorCheapestAdditionFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long SavingsFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long SequentialSavingsFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long ParallelSavingsFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long ChristofidesFilteredDecisionBuilder_SWIGUpcast(long var0);

   public static final native long BasePathFilter_SWIGUpcast(long var0);

   public static final native long CPFeasibilityFilter_SWIGUpcast(long var0);

   public static String SwigDirector_Decision_toString(Decision var0) {
      return var0.toString();
   }

   public static void SwigDirector_Decision_apply(Decision var0, long var1) {
      var0.apply(var1 == 0L ? null : new Solver(var1, false));
   }

   public static void SwigDirector_Decision_refute(Decision var0, long var1) {
      var0.refute(var1 == 0L ? null : new Solver(var1, false));
   }

   public static void SwigDirector_Decision_accept(Decision var0, long var1) {
      var0.accept(var1 == 0L ? null : new DecisionVisitor(var1, false));
   }

   public static String SwigDirector_DecisionVisitor_toString(DecisionVisitor var0) {
      return var0.toString();
   }

   public static void SwigDirector_DecisionVisitor_visitSetVariableValue(DecisionVisitor var0, long var1, long var3) {
      var0.visitSetVariableValue(var1 == 0L ? null : new IntVar(var1, false), var3);
   }

   public static void SwigDirector_DecisionVisitor_visitSplitVariableDomain(DecisionVisitor var0, long var1, long var3, boolean var5) {
      var0.visitSplitVariableDomain(var1 == 0L ? null : new IntVar(var1, false), var3, var5);
   }

   public static void SwigDirector_DecisionVisitor_visitScheduleOrPostpone(DecisionVisitor var0, long var1, long var3) {
      var0.visitScheduleOrPostpone(var1 == 0L ? null : new IntervalVar(var1, false), var3);
   }

   public static void SwigDirector_DecisionVisitor_visitScheduleOrExpedite(DecisionVisitor var0, long var1, long var3) {
      var0.visitScheduleOrExpedite(var1 == 0L ? null : new IntervalVar(var1, false), var3);
   }

   public static void SwigDirector_DecisionVisitor_visitRankFirstInterval(DecisionVisitor var0, long var1, int var3) {
      var0.visitRankFirstInterval(var1 == 0L ? null : new SequenceVar(var1, false), var3);
   }

   public static void SwigDirector_DecisionVisitor_visitRankLastInterval(DecisionVisitor var0, long var1, int var3) {
      var0.visitRankLastInterval(var1 == 0L ? null : new SequenceVar(var1, false), var3);
   }

   public static void SwigDirector_DecisionVisitor_visitUnknownDecision(DecisionVisitor var0) {
      var0.visitUnknownDecision();
   }

   public static String SwigDirector_DecisionBuilder_toString(DecisionBuilder var0) {
      return var0.toString();
   }

   public static long SwigDirector_DecisionBuilder_nextWrap(DecisionBuilder var0, long var1) {
      return Decision.getCPtr(var0.nextWrap(var1 == 0L ? null : new Solver(var1, false)));
   }

   public static String SwigDirector_SearchMonitor_toString(SearchMonitor var0) {
      return var0.toString();
   }

   public static void SwigDirector_SearchMonitor_enterSearch(SearchMonitor var0) {
      var0.enterSearch();
   }

   public static void SwigDirector_SearchMonitor_restartSearch(SearchMonitor var0) {
      var0.restartSearch();
   }

   public static void SwigDirector_SearchMonitor_exitSearch(SearchMonitor var0) {
      var0.exitSearch();
   }

   public static void SwigDirector_SearchMonitor_beginNextDecision(SearchMonitor var0, long var1) {
      var0.beginNextDecision(var1 == 0L ? null : new DecisionBuilder(var1, false));
   }

   public static void SwigDirector_SearchMonitor_endNextDecision(SearchMonitor var0, long var1, long var3) {
      var0.endNextDecision(var1 == 0L ? null : new DecisionBuilder(var1, false), var3 == 0L ? null : new Decision(var3, false));
   }

   public static void SwigDirector_SearchMonitor_applyDecision(SearchMonitor var0, long var1) {
      var0.applyDecision(var1 == 0L ? null : new Decision(var1, false));
   }

   public static void SwigDirector_SearchMonitor_refuteDecision(SearchMonitor var0, long var1) {
      var0.refuteDecision(var1 == 0L ? null : new Decision(var1, false));
   }

   public static void SwigDirector_SearchMonitor_afterDecision(SearchMonitor var0, long var1, boolean var3) {
      var0.afterDecision(var1 == 0L ? null : new Decision(var1, false), var3);
   }

   public static void SwigDirector_SearchMonitor_beginFail(SearchMonitor var0) {
      var0.beginFail();
   }

   public static void SwigDirector_SearchMonitor_endFail(SearchMonitor var0) {
      var0.endFail();
   }

   public static void SwigDirector_SearchMonitor_beginInitialPropagation(SearchMonitor var0) {
      var0.beginInitialPropagation();
   }

   public static void SwigDirector_SearchMonitor_endInitialPropagation(SearchMonitor var0) {
      var0.endInitialPropagation();
   }

   public static boolean SwigDirector_SearchMonitor_acceptSolution(SearchMonitor var0) {
      return var0.acceptSolution();
   }

   public static boolean SwigDirector_SearchMonitor_atSolution(SearchMonitor var0) {
      return var0.atSolution();
   }

   public static void SwigDirector_SearchMonitor_noMoreSolutions(SearchMonitor var0) {
      var0.noMoreSolutions();
   }

   public static boolean SwigDirector_SearchMonitor_localOptimum(SearchMonitor var0) {
      return var0.localOptimum();
   }

   public static boolean SwigDirector_SearchMonitor_acceptDelta(SearchMonitor var0, long var1, long var3) {
      return var0.acceptDelta(var1 == 0L ? null : new Assignment(var1, false), var3 == 0L ? null : new Assignment(var3, false));
   }

   public static void SwigDirector_SearchMonitor_acceptNeighbor(SearchMonitor var0) {
      var0.acceptNeighbor();
   }

   public static void SwigDirector_SearchMonitor_AcceptUncheckedNeighbor(SearchMonitor var0) {
      var0.AcceptUncheckedNeighbor();
   }

   public static boolean SwigDirector_SearchMonitor_IsUncheckedSolutionLimitReached(SearchMonitor var0) {
      return var0.IsUncheckedSolutionLimitReached();
   }

   public static void SwigDirector_SearchMonitor_periodicCheck(SearchMonitor var0) {
      var0.periodicCheck();
   }

   public static int SwigDirector_SearchMonitor_progressPercent(SearchMonitor var0) {
      return var0.progressPercent();
   }

   public static void SwigDirector_SearchMonitor_accept(SearchMonitor var0, long var1) {
      var0.accept(var1 == 0L ? null : new ModelVisitor(var1, false));
   }

   public static void SwigDirector_SearchMonitor_install(SearchMonitor var0) {
      var0.install();
   }

   public static String SwigDirector_LocalSearchOperator_toString(LocalSearchOperator var0) {
      return var0.toString();
   }

   public static boolean SwigDirector_LocalSearchOperator_nextNeighbor(LocalSearchOperator var0, long var1, long var3) {
      return var0.nextNeighbor(var1 == 0L ? null : new Assignment(var1, false), var3 == 0L ? null : new Assignment(var3, false));
   }

   public static void SwigDirector_LocalSearchOperator_start(LocalSearchOperator var0, long var1) {
      var0.start(var1 == 0L ? null : new Assignment(var1, false));
   }

   public static void SwigDirector_LocalSearchOperator_reset(LocalSearchOperator var0) {
      var0.reset();
   }

   public static boolean SwigDirector_LocalSearchOperator_HasFragments(LocalSearchOperator var0) {
      return var0.HasFragments();
   }

   public static boolean SwigDirector_LocalSearchOperator_HoldsDelta(LocalSearchOperator var0) {
      return var0.HoldsDelta();
   }

   public static String SwigDirector_IntVarLocalSearchOperator_toString(IntVarLocalSearchOperator var0) {
      return var0.toString();
   }

   public static void SwigDirector_IntVarLocalSearchOperator_reset(IntVarLocalSearchOperator var0) {
      var0.reset();
   }

   public static boolean SwigDirector_IntVarLocalSearchOperator_HasFragments(IntVarLocalSearchOperator var0) {
      return var0.HasFragments();
   }

   public static boolean SwigDirector_IntVarLocalSearchOperator_HoldsDelta(IntVarLocalSearchOperator var0) {
      return var0.HoldsDelta();
   }

   public static boolean SwigDirector_IntVarLocalSearchOperator_isIncremental(IntVarLocalSearchOperator var0) {
      return var0.isIncremental();
   }

   public static void SwigDirector_IntVarLocalSearchOperator_onStart(IntVarLocalSearchOperator var0) {
      var0.onStart();
   }

   public static boolean SwigDirector_IntVarLocalSearchOperator_oneNeighbor(IntVarLocalSearchOperator var0) {
      return var0.oneNeighbor();
   }

   public static String SwigDirector_SequenceVarLocalSearchOperator_toString(SequenceVarLocalSearchOperator var0) {
      return var0.toString();
   }

   public static boolean SwigDirector_SequenceVarLocalSearchOperator_nextNeighbor(SequenceVarLocalSearchOperator var0, long var1, long var3) {
      return var0.nextNeighbor(var1 == 0L ? null : new Assignment(var1, false), var3 == 0L ? null : new Assignment(var3, false));
   }

   public static void SwigDirector_SequenceVarLocalSearchOperator_reset(SequenceVarLocalSearchOperator var0) {
      var0.reset();
   }

   public static boolean SwigDirector_SequenceVarLocalSearchOperator_HasFragments(SequenceVarLocalSearchOperator var0) {
      return var0.HasFragments();
   }

   public static boolean SwigDirector_SequenceVarLocalSearchOperator_HoldsDelta(SequenceVarLocalSearchOperator var0) {
      return var0.HoldsDelta();
   }

   public static boolean SwigDirector_SequenceVarLocalSearchOperator_isIncremental(SequenceVarLocalSearchOperator var0) {
      return var0.isIncremental();
   }

   public static void SwigDirector_SequenceVarLocalSearchOperator_onStart(SequenceVarLocalSearchOperator var0) {
      var0.onStart();
   }

   public static String SwigDirector_BaseLns_toString(BaseLns var0) {
      return var0.toString();
   }

   public static void SwigDirector_BaseLns_reset(BaseLns var0) {
      var0.reset();
   }

   public static boolean SwigDirector_BaseLns_HasFragments(BaseLns var0) {
      return var0.HasFragments();
   }

   public static boolean SwigDirector_BaseLns_HoldsDelta(BaseLns var0) {
      return var0.HoldsDelta();
   }

   public static boolean SwigDirector_BaseLns_isIncremental(BaseLns var0) {
      return var0.isIncremental();
   }

   public static void SwigDirector_BaseLns_initFragments(BaseLns var0) {
      var0.initFragments();
   }

   public static boolean SwigDirector_BaseLns_nextFragment(BaseLns var0) {
      return var0.nextFragment();
   }

   public static String SwigDirector_ChangeValue_toString(ChangeValue var0) {
      return var0.toString();
   }

   public static void SwigDirector_ChangeValue_reset(ChangeValue var0) {
      var0.reset();
   }

   public static boolean SwigDirector_ChangeValue_HasFragments(ChangeValue var0) {
      return var0.HasFragments();
   }

   public static boolean SwigDirector_ChangeValue_HoldsDelta(ChangeValue var0) {
      return var0.HoldsDelta();
   }

   public static boolean SwigDirector_ChangeValue_isIncremental(ChangeValue var0) {
      return var0.isIncremental();
   }

   public static void SwigDirector_ChangeValue_onStart(ChangeValue var0) {
      var0.onStart();
   }

   public static boolean SwigDirector_ChangeValue_oneNeighbor(ChangeValue var0) {
      return var0.oneNeighbor();
   }

   public static long SwigDirector_ChangeValue_modifyValue(ChangeValue var0, long var1, long var3) {
      return var0.modifyValue(var1, var3);
   }

   public static String SwigDirector_PathOperator_toString(PathOperator var0) {
      return var0.toString();
   }

   public static void SwigDirector_PathOperator_reset(PathOperator var0) {
      var0.reset();
   }

   public static boolean SwigDirector_PathOperator_HasFragments(PathOperator var0) {
      return var0.HasFragments();
   }

   public static boolean SwigDirector_PathOperator_HoldsDelta(PathOperator var0) {
      return var0.HoldsDelta();
   }

   public static boolean SwigDirector_PathOperator_isIncremental(PathOperator var0) {
      return var0.isIncremental();
   }

   public static void SwigDirector_PathOperator_onStart(PathOperator var0) {
      var0.onStart();
   }

   public static boolean SwigDirector_PathOperator_oneNeighbor(PathOperator var0) {
      return var0.oneNeighbor();
   }

   public static boolean SwigDirector_PathOperator_neighbor(PathOperator var0) {
      return var0.neighbor();
   }

   public static boolean SwigDirector_PathOperator_restartAtPathStartOnSynchronize(PathOperator var0) {
      return var0.restartAtPathStartOnSynchronize();
   }

   public static boolean SwigDirector_PathOperator_onSamePathAsPreviousBase(PathOperator var0, long var1) {
      return var0.onSamePathAsPreviousBase(var1);
   }

   public static long SwigDirector_PathOperator_getBaseNodeRestartPosition(PathOperator var0, int var1) {
      return var0.getBaseNodeRestartPosition(var1);
   }

   public static void SwigDirector_PathOperator_setNextBaseToIncrement(PathOperator var0, long var1) {
      var0.setNextBaseToIncrement(var1);
   }

   public static boolean SwigDirector_PathOperator_initPosition(PathOperator var0) {
      return var0.initPosition();
   }

   public static String SwigDirector_LocalSearchFilter_toString(LocalSearchFilter var0) {
      return var0.toString();
   }

   public static void SwigDirector_LocalSearchFilter_Relax(LocalSearchFilter var0, long var1, long var3) {
      var0.Relax(var1 == 0L ? null : new Assignment(var1, false), var3 == 0L ? null : new Assignment(var3, false));
   }

   public static boolean SwigDirector_LocalSearchFilter_accept(LocalSearchFilter var0, long var1, long var3, long var5, long var7) {
      return var0.accept(var1 == 0L ? null : new Assignment(var1, false), var3 == 0L ? null : new Assignment(var3, false), var5, var7);
   }

   public static boolean SwigDirector_LocalSearchFilter_isIncremental(LocalSearchFilter var0) {
      return var0.isIncremental();
   }

   public static void SwigDirector_LocalSearchFilter_synchronize(LocalSearchFilter var0, long var1, long var3) {
      var0.synchronize(var1 == 0L ? null : new Assignment(var1, false), var3 == 0L ? null : new Assignment(var3, false));
   }

   public static void SwigDirector_LocalSearchFilter_Revert(LocalSearchFilter var0) {
      var0.Revert();
   }

   public static long SwigDirector_LocalSearchFilter_getSynchronizedObjectiveValue(LocalSearchFilter var0) {
      return var0.getSynchronizedObjectiveValue();
   }

   public static long SwigDirector_LocalSearchFilter_getAcceptedObjectiveValue(LocalSearchFilter var0) {
      return var0.getAcceptedObjectiveValue();
   }

   public static String SwigDirector_IntVarLocalSearchFilter_toString(IntVarLocalSearchFilter var0) {
      return var0.toString();
   }

   public static void SwigDirector_IntVarLocalSearchFilter_Relax(IntVarLocalSearchFilter var0, long var1, long var3) {
      var0.Relax(var1 == 0L ? null : new Assignment(var1, false), var3 == 0L ? null : new Assignment(var3, false));
   }

   public static boolean SwigDirector_IntVarLocalSearchFilter_accept(IntVarLocalSearchFilter var0, long var1, long var3, long var5, long var7) {
      return var0.accept(var1 == 0L ? null : new Assignment(var1, false), var3 == 0L ? null : new Assignment(var3, false), var5, var7);
   }

   public static boolean SwigDirector_IntVarLocalSearchFilter_isIncremental(IntVarLocalSearchFilter var0) {
      return var0.isIncremental();
   }

   public static void SwigDirector_IntVarLocalSearchFilter_Revert(IntVarLocalSearchFilter var0) {
      var0.Revert();
   }

   public static long SwigDirector_IntVarLocalSearchFilter_getSynchronizedObjectiveValue(IntVarLocalSearchFilter var0) {
      return var0.getSynchronizedObjectiveValue();
   }

   public static long SwigDirector_IntVarLocalSearchFilter_getAcceptedObjectiveValue(IntVarLocalSearchFilter var0) {
      return var0.getAcceptedObjectiveValue();
   }

   public static void SwigDirector_IntVarLocalSearchFilter_onSynchronize(IntVarLocalSearchFilter var0, long var1) {
      var0.onSynchronize(var1 == 0L ? null : new Assignment(var1, false));
   }

   public static String SwigDirector_SymmetryBreaker_toString(SymmetryBreaker var0) {
      return var0.toString();
   }

   public static void SwigDirector_SymmetryBreaker_visitSetVariableValue(SymmetryBreaker var0, long var1, long var3) {
      var0.visitSetVariableValue(var1 == 0L ? null : new IntVar(var1, false), var3);
   }

   public static void SwigDirector_SymmetryBreaker_visitSplitVariableDomain(SymmetryBreaker var0, long var1, long var3, boolean var5) {
      var0.visitSplitVariableDomain(var1 == 0L ? null : new IntVar(var1, false), var3, var5);
   }

   public static void SwigDirector_SymmetryBreaker_visitScheduleOrPostpone(SymmetryBreaker var0, long var1, long var3) {
      var0.visitScheduleOrPostpone(var1 == 0L ? null : new IntervalVar(var1, false), var3);
   }

   public static void SwigDirector_SymmetryBreaker_visitScheduleOrExpedite(SymmetryBreaker var0, long var1, long var3) {
      var0.visitScheduleOrExpedite(var1 == 0L ? null : new IntervalVar(var1, false), var3);
   }

   public static void SwigDirector_SymmetryBreaker_visitRankFirstInterval(SymmetryBreaker var0, long var1, int var3) {
      var0.visitRankFirstInterval(var1 == 0L ? null : new SequenceVar(var1, false), var3);
   }

   public static void SwigDirector_SymmetryBreaker_visitRankLastInterval(SymmetryBreaker var0, long var1, int var3) {
      var0.visitRankLastInterval(var1 == 0L ? null : new SequenceVar(var1, false), var3);
   }

   public static void SwigDirector_SymmetryBreaker_visitUnknownDecision(SymmetryBreaker var0) {
      var0.visitUnknownDecision();
   }

   private static final native void swig_module_init();

   static {
      swig_module_init();
   }
}
