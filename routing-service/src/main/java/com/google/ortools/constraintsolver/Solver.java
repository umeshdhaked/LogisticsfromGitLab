package com.google.ortools.constraintsolver;

import com.google.protobuf.InvalidProtocolBufferException;
import java.math.BigInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.Supplier;

public class Solver {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;
   public static final int kNumPriorities = mainJNI.Solver_kNumPriorities_get();
   public static final int INT_VAR_DEFAULT = mainJNI.Solver_INT_VAR_DEFAULT_get();
   public static final int INT_VAR_SIMPLE = mainJNI.Solver_INT_VAR_SIMPLE_get();
   public static final int CHOOSE_FIRST_UNBOUND = mainJNI.Solver_CHOOSE_FIRST_UNBOUND_get();
   public static final int CHOOSE_RANDOM = mainJNI.Solver_CHOOSE_RANDOM_get();
   public static final int CHOOSE_MIN_SIZE_LOWEST_MIN = mainJNI.Solver_CHOOSE_MIN_SIZE_LOWEST_MIN_get();
   public static final int CHOOSE_MIN_SIZE_HIGHEST_MIN = mainJNI.Solver_CHOOSE_MIN_SIZE_HIGHEST_MIN_get();
   public static final int CHOOSE_MIN_SIZE_LOWEST_MAX = mainJNI.Solver_CHOOSE_MIN_SIZE_LOWEST_MAX_get();
   public static final int CHOOSE_MIN_SIZE_HIGHEST_MAX = mainJNI.Solver_CHOOSE_MIN_SIZE_HIGHEST_MAX_get();
   public static final int CHOOSE_LOWEST_MIN = mainJNI.Solver_CHOOSE_LOWEST_MIN_get();
   public static final int CHOOSE_HIGHEST_MAX = mainJNI.Solver_CHOOSE_HIGHEST_MAX_get();
   public static final int CHOOSE_MIN_SIZE = mainJNI.Solver_CHOOSE_MIN_SIZE_get();
   public static final int CHOOSE_MAX_SIZE = mainJNI.Solver_CHOOSE_MAX_SIZE_get();
   public static final int CHOOSE_MAX_REGRET_ON_MIN = mainJNI.Solver_CHOOSE_MAX_REGRET_ON_MIN_get();
   public static final int CHOOSE_PATH = mainJNI.Solver_CHOOSE_PATH_get();
   public static final int INT_VALUE_DEFAULT = mainJNI.Solver_INT_VALUE_DEFAULT_get();
   public static final int INT_VALUE_SIMPLE = mainJNI.Solver_INT_VALUE_SIMPLE_get();
   public static final int ASSIGN_MIN_VALUE = mainJNI.Solver_ASSIGN_MIN_VALUE_get();
   public static final int ASSIGN_MAX_VALUE = mainJNI.Solver_ASSIGN_MAX_VALUE_get();
   public static final int ASSIGN_RANDOM_VALUE = mainJNI.Solver_ASSIGN_RANDOM_VALUE_get();
   public static final int ASSIGN_CENTER_VALUE = mainJNI.Solver_ASSIGN_CENTER_VALUE_get();
   public static final int SPLIT_LOWER_HALF = mainJNI.Solver_SPLIT_LOWER_HALF_get();
   public static final int SPLIT_UPPER_HALF = mainJNI.Solver_SPLIT_UPPER_HALF_get();
   public static final int CHOOSE_STATIC_GLOBAL_BEST = mainJNI.Solver_CHOOSE_STATIC_GLOBAL_BEST_get();
   public static final int CHOOSE_DYNAMIC_GLOBAL_BEST = mainJNI.Solver_CHOOSE_DYNAMIC_GLOBAL_BEST_get();
   public static final int SEQUENCE_DEFAULT = mainJNI.Solver_SEQUENCE_DEFAULT_get();
   public static final int SEQUENCE_SIMPLE = mainJNI.Solver_SEQUENCE_SIMPLE_get();
   public static final int CHOOSE_MIN_SLACK_RANK_FORWARD = mainJNI.Solver_CHOOSE_MIN_SLACK_RANK_FORWARD_get();
   public static final int CHOOSE_RANDOM_RANK_FORWARD = mainJNI.Solver_CHOOSE_RANDOM_RANK_FORWARD_get();
   public static final int INTERVAL_DEFAULT = mainJNI.Solver_INTERVAL_DEFAULT_get();
   public static final int INTERVAL_SIMPLE = mainJNI.Solver_INTERVAL_SIMPLE_get();
   public static final int INTERVAL_SET_TIMES_FORWARD = mainJNI.Solver_INTERVAL_SET_TIMES_FORWARD_get();
   public static final int INTERVAL_SET_TIMES_BACKWARD = mainJNI.Solver_INTERVAL_SET_TIMES_BACKWARD_get();
   public static final int TWOOPT = mainJNI.Solver_TWOOPT_get();
   public static final int OROPT = mainJNI.Solver_OROPT_get();
   public static final int RELOCATE = mainJNI.Solver_RELOCATE_get();
   public static final int EXCHANGE = mainJNI.Solver_EXCHANGE_get();
   public static final int CROSS = mainJNI.Solver_CROSS_get();
   public static final int MAKEACTIVE = mainJNI.Solver_MAKEACTIVE_get();
   public static final int MAKEINACTIVE = mainJNI.Solver_MAKEINACTIVE_get();
   public static final int MAKECHAININACTIVE = mainJNI.Solver_MAKECHAININACTIVE_get();
   public static final int SWAPACTIVE = mainJNI.Solver_SWAPACTIVE_get();
   public static final int EXTENDEDSWAPACTIVE = mainJNI.Solver_EXTENDEDSWAPACTIVE_get();
   public static final int PATHLNS = mainJNI.Solver_PATHLNS_get();
   public static final int FULLPATHLNS = mainJNI.Solver_FULLPATHLNS_get();
   public static final int UNACTIVELNS = mainJNI.Solver_UNACTIVELNS_get();
   public static final int INCREMENT = mainJNI.Solver_INCREMENT_get();
   public static final int DECREMENT = mainJNI.Solver_DECREMENT_get();
   public static final int SIMPLELNS = mainJNI.Solver_SIMPLELNS_get();
   public static final int LK = mainJNI.Solver_LK_get();
   public static final int TSPOPT = mainJNI.Solver_TSPOPT_get();
   public static final int TSPLNS = mainJNI.Solver_TSPLNS_get();
   public static final int GE = mainJNI.Solver_GE_get();
   public static final int LE = mainJNI.Solver_LE_get();
   public static final int EQ = mainJNI.Solver_EQ_get();
   public static final int DELAYED_PRIORITY = mainJNI.Solver_DELAYED_PRIORITY_get();
   public static final int VAR_PRIORITY = mainJNI.Solver_VAR_PRIORITY_get();
   public static final int NORMAL_PRIORITY = mainJNI.Solver_NORMAL_PRIORITY_get();
   public static final int ENDS_AFTER_END = mainJNI.Solver_ENDS_AFTER_END_get();
   public static final int ENDS_AFTER_START = mainJNI.Solver_ENDS_AFTER_START_get();
   public static final int ENDS_AT_END = mainJNI.Solver_ENDS_AT_END_get();
   public static final int ENDS_AT_START = mainJNI.Solver_ENDS_AT_START_get();
   public static final int STARTS_AFTER_END = mainJNI.Solver_STARTS_AFTER_END_get();
   public static final int STARTS_AFTER_START = mainJNI.Solver_STARTS_AFTER_START_get();
   public static final int STARTS_AT_END = mainJNI.Solver_STARTS_AT_END_get();
   public static final int STARTS_AT_START = mainJNI.Solver_STARTS_AT_START_get();
   public static final int STAYS_IN_SYNC = mainJNI.Solver_STAYS_IN_SYNC_get();
   public static final int ENDS_AFTER = mainJNI.Solver_ENDS_AFTER_get();
   public static final int ENDS_AT = mainJNI.Solver_ENDS_AT_get();
   public static final int ENDS_BEFORE = mainJNI.Solver_ENDS_BEFORE_get();
   public static final int STARTS_AFTER = mainJNI.Solver_STARTS_AFTER_get();
   public static final int STARTS_AT = mainJNI.Solver_STARTS_AT_get();
   public static final int STARTS_BEFORE = mainJNI.Solver_STARTS_BEFORE_get();
   public static final int CROSS_DATE = mainJNI.Solver_CROSS_DATE_get();
   public static final int AVOID_DATE = mainJNI.Solver_AVOID_DATE_get();
   public static final int NO_CHANGE = mainJNI.Solver_NO_CHANGE_get();
   public static final int KEEP_LEFT = mainJNI.Solver_KEEP_LEFT_get();
   public static final int KEEP_RIGHT = mainJNI.Solver_KEEP_RIGHT_get();
   public static final int KILL_BOTH = mainJNI.Solver_KILL_BOTH_get();
   public static final int SWITCH_BRANCHES = mainJNI.Solver_SWITCH_BRANCHES_get();
   public static final int SENTINEL = mainJNI.Solver_SENTINEL_get();
   public static final int SIMPLE_MARKER = mainJNI.Solver_SIMPLE_MARKER_get();
   public static final int CHOICE_POINT = mainJNI.Solver_CHOICE_POINT_get();
   public static final int REVERSIBLE_ACTION = mainJNI.Solver_REVERSIBLE_ACTION_get();
   public static final int OUTSIDE_SEARCH = mainJNI.Solver_OUTSIDE_SEARCH_get();
   public static final int IN_ROOT_NODE = mainJNI.Solver_IN_ROOT_NODE_get();
   public static final int IN_SEARCH = mainJNI.Solver_IN_SEARCH_get();
   public static final int AT_SOLUTION = mainJNI.Solver_AT_SOLUTION_get();
   public static final int NO_MORE_SOLUTIONS = mainJNI.Solver_NO_MORE_SOLUTIONS_get();
   public static final int PROBLEM_INFEASIBLE = mainJNI.Solver_PROBLEM_INFEASIBLE_get();
   public static final int NOT_SET = mainJNI.Solver_NOT_SET_get();
   public static final int MAXIMIZATION = mainJNI.Solver_MAXIMIZATION_get();
   public static final int MINIMIZATION = mainJNI.Solver_MINIMIZATION_get();

   protected Solver(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(Solver var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_Solver(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public IntVar[] makeIntVarArray(int var1, long var2, long var4) {
      IntVar[] var6 = new IntVar[var1];

      for(int var7 = 0; var7 < var1; ++var7) {
         var6[var7] = this.makeIntVar(var2, var4);
      }

      return var6;
   }

   public IntVar[] makeIntVarArray(int var1, long var2, long var4, String var6) {
      IntVar[] var7 = new IntVar[var1];

      for(int var8 = 0; var8 < var1; ++var8) {
         String var9 = var6 + var8;
         var7[var8] = this.makeIntVar(var2, var4, var9);
      }

      return var7;
   }

   public IntVar[] makeBoolVarArray(int var1) {
      IntVar[] var2 = new IntVar[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = this.makeBoolVar();
      }

      return var2;
   }

   public IntVar[] makeBoolVarArray(int var1, String var2) {
      IntVar[] var3 = new IntVar[var1];

      for(int var4 = 0; var4 < var1; ++var4) {
         String var5 = var2 + var4;
         var3[var4] = this.makeBoolVar(var5);
      }

      return var3;
   }

   public IntervalVar[] makeFixedDurationIntervalVarArray(int var1, long var2, long var4, long var6, boolean var8) {
      IntervalVar[] var9 = new IntervalVar[var1];

      for(int var10 = 0; var10 < var1; ++var10) {
         var9[var10] = this.makeFixedDurationIntervalVar(var2, var4, var6, var8, "");
      }

      return var9;
   }

   public IntervalVar[] makeFixedDurationIntervalVarArray(int var1, long var2, long var4, long var6, boolean var8, String var9) {
      IntervalVar[] var10 = new IntervalVar[var1];

      for(int var11 = 0; var11 < var1; ++var11) {
         var10[var11] = this.makeFixedDurationIntervalVar(var2, var4, var6, var8, var9 + var11);
      }

      return var10;
   }

   public Solver(String var1) {
      this(mainJNI.new_Solver__SWIG_0(var1), true);
   }

   public Solver(String var1, ConstraintSolverParameters var2) {
      this(mainJNI.new_Solver__SWIG_1(var1, var2.toByteArray()), true);
   }

   public ConstraintSolverParameters parameters() {
      byte[] var1 = mainJNI.Solver_parameters(this.swigCPtr, this);
      if (var1 != null && var1.length != 0) {
         try {
            return ConstraintSolverParameters.parseFrom(var1);
         } catch (InvalidProtocolBufferException var3) {
            throw new RuntimeException("Unable to parse com.google.ortools.constraintsolver.ConstraintSolverParameters protocol message.");
         }
      } else {
         return null;
      }
   }

   public static ConstraintSolverParameters defaultSolverParameters() {
      byte[] var0 = mainJNI.Solver_defaultSolverParameters();
      if (var0 != null && var0.length != 0) {
         try {
            return ConstraintSolverParameters.parseFrom(var0);
         } catch (InvalidProtocolBufferException var2) {
            throw new RuntimeException("Unable to parse com.google.ortools.constraintsolver.ConstraintSolverParameters protocol message.");
         }
      } else {
         return null;
      }
   }

   public void addConstraint(Constraint var1) {
      mainJNI.Solver_addConstraint(this.swigCPtr, this, Constraint.getCPtr(var1), var1);
   }

   public void addCastConstraint(CastConstraint var1, IntVar var2, IntExpr var3) {
      mainJNI.Solver_addCastConstraint(this.swigCPtr, this, CastConstraint.getCPtr(var1), var1, IntVar.getCPtr(var2), var2, IntExpr.getCPtr(var3), var3);
   }

   public boolean solve(DecisionBuilder var1, SearchMonitor[] var2) {
      return mainJNI.Solver_solve__SWIG_0(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, var2);
   }

   public boolean solve(DecisionBuilder var1) {
      return mainJNI.Solver_solve__SWIG_1(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1);
   }

   public boolean solve(DecisionBuilder var1, SearchMonitor var2) {
      return mainJNI.Solver_solve__SWIG_2(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2);
   }

   public boolean solve(DecisionBuilder var1, SearchMonitor var2, SearchMonitor var3) {
      return mainJNI.Solver_solve__SWIG_3(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2, SearchMonitor.getCPtr(var3), var3);
   }

   public boolean solve(DecisionBuilder var1, SearchMonitor var2, SearchMonitor var3, SearchMonitor var4) {
      return mainJNI.Solver_solve__SWIG_4(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2, SearchMonitor.getCPtr(var3), var3, SearchMonitor.getCPtr(var4), var4);
   }

   public boolean solve(DecisionBuilder var1, SearchMonitor var2, SearchMonitor var3, SearchMonitor var4, SearchMonitor var5) {
      return mainJNI.Solver_solve__SWIG_5(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2, SearchMonitor.getCPtr(var3), var3, SearchMonitor.getCPtr(var4), var4, SearchMonitor.getCPtr(var5), var5);
   }

   public void newSearch(DecisionBuilder var1, SearchMonitor[] var2) {
      mainJNI.Solver_newSearch__SWIG_0(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, var2);
   }

   public void newSearch(DecisionBuilder var1) {
      mainJNI.Solver_newSearch__SWIG_1(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1);
   }

   public void newSearch(DecisionBuilder var1, SearchMonitor var2) {
      mainJNI.Solver_newSearch__SWIG_2(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2);
   }

   public void newSearch(DecisionBuilder var1, SearchMonitor var2, SearchMonitor var3) {
      mainJNI.Solver_newSearch__SWIG_3(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2, SearchMonitor.getCPtr(var3), var3);
   }

   public void newSearch(DecisionBuilder var1, SearchMonitor var2, SearchMonitor var3, SearchMonitor var4) {
      mainJNI.Solver_newSearch__SWIG_4(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2, SearchMonitor.getCPtr(var3), var3, SearchMonitor.getCPtr(var4), var4);
   }

   public void newSearch(DecisionBuilder var1, SearchMonitor var2, SearchMonitor var3, SearchMonitor var4, SearchMonitor var5) {
      mainJNI.Solver_newSearch__SWIG_5(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2, SearchMonitor.getCPtr(var3), var3, SearchMonitor.getCPtr(var4), var4, SearchMonitor.getCPtr(var5), var5);
   }

   public boolean nextSolution() {
      return mainJNI.Solver_nextSolution(this.swigCPtr, this);
   }

   public void restartSearch() {
      mainJNI.Solver_restartSearch(this.swigCPtr, this);
   }

   public void endSearch() {
      mainJNI.Solver_endSearch(this.swigCPtr, this);
   }

   public boolean solveAndCommit(DecisionBuilder var1, SearchMonitor[] var2) {
      return mainJNI.Solver_solveAndCommit__SWIG_0(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, var2);
   }

   public boolean solveAndCommit(DecisionBuilder var1) {
      return mainJNI.Solver_solveAndCommit__SWIG_1(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1);
   }

   public boolean solveAndCommit(DecisionBuilder var1, SearchMonitor var2) {
      return mainJNI.Solver_solveAndCommit__SWIG_2(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2);
   }

   public boolean solveAndCommit(DecisionBuilder var1, SearchMonitor var2, SearchMonitor var3) {
      return mainJNI.Solver_solveAndCommit__SWIG_3(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2, SearchMonitor.getCPtr(var3), var3);
   }

   public boolean solveAndCommit(DecisionBuilder var1, SearchMonitor var2, SearchMonitor var3, SearchMonitor var4) {
      return mainJNI.Solver_solveAndCommit__SWIG_4(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2, SearchMonitor.getCPtr(var3), var3, SearchMonitor.getCPtr(var4), var4);
   }

   public boolean checkAssignment(Assignment var1) {
      return mainJNI.Solver_checkAssignment(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
   }

   public boolean checkConstraint(Constraint var1) {
      return mainJNI.Solver_checkConstraint(this.swigCPtr, this, Constraint.getCPtr(var1), var1);
   }

   public int state() {
      return mainJNI.Solver_state(this.swigCPtr, this);
   }

   public void fail() {
      mainJNI.Solver_fail(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.Solver_toString(this.swigCPtr, this);
   }

   public static long memoryUsage() {
      return mainJNI.Solver_memoryUsage();
   }

   public SWIGTYPE_p_absl__Time Now() {
      return new SWIGTYPE_p_absl__Time(mainJNI.Solver_Now(this.swigCPtr, this), true);
   }

   public long wallTime() {
      return mainJNI.Solver_wallTime(this.swigCPtr, this);
   }

   public long branches() {
      return mainJNI.Solver_branches(this.swigCPtr, this);
   }

   public long solutions() {
      return mainJNI.Solver_solutions(this.swigCPtr, this);
   }

   public long unchecked_solutions() {
      return mainJNI.Solver_unchecked_solutions(this.swigCPtr, this);
   }

   public long demon_runs(int var1) {
      return mainJNI.Solver_demon_runs(this.swigCPtr, this, var1);
   }

   public long failures() {
      return mainJNI.Solver_failures(this.swigCPtr, this);
   }

   public long neighbors() {
      return mainJNI.Solver_neighbors(this.swigCPtr, this);
   }

   public long filteredNeighbors() {
      return mainJNI.Solver_filteredNeighbors(this.swigCPtr, this);
   }

   public long acceptedNeighbors() {
      return mainJNI.Solver_acceptedNeighbors(this.swigCPtr, this);
   }

   public BigInteger stamp() {
      return mainJNI.Solver_stamp(this.swigCPtr, this);
   }

   public BigInteger fail_stamp() {
      return mainJNI.Solver_fail_stamp(this.swigCPtr, this);
   }

   public int optimization_direction() {
      return mainJNI.Solver_optimization_direction(this.swigCPtr, this);
   }

   public void set_optimization_direction(int var1) {
      mainJNI.Solver_set_optimization_direction(this.swigCPtr, this, var1);
   }

   public IntVar makeIntVar(long var1, long var3, String var5) {
      long var6 = mainJNI.Solver_makeIntVar__SWIG_0(this.swigCPtr, this, var1, var3, var5);
      return var6 == 0L ? null : new IntVar(var6, false);
   }

   public IntVar makeIntVar(long[] var1, String var2) {
      long var3 = mainJNI.Solver_makeIntVar__SWIG_1(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar makeIntVar(int[] var1, String var2) {
      long var3 = mainJNI.Solver_makeIntVar__SWIG_2(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar makeIntVar(long var1, long var3) {
      long var5 = mainJNI.Solver_makeIntVar__SWIG_3(this.swigCPtr, this, var1, var3);
      return var5 == 0L ? null : new IntVar(var5, false);
   }

   public IntVar makeIntVar(long[] var1) {
      long var2 = mainJNI.Solver_makeIntVar__SWIG_4(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVar(var2, false);
   }

   public IntVar makeIntVar(int[] var1) {
      long var2 = mainJNI.Solver_makeIntVar__SWIG_5(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVar(var2, false);
   }

   public IntVar makeBoolVar(String var1) {
      long var2 = mainJNI.Solver_makeBoolVar__SWIG_0(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVar(var2, false);
   }

   public IntVar makeBoolVar() {
      long var1 = mainJNI.Solver_makeBoolVar__SWIG_1(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVar(var1, false);
   }

   public IntVar makeIntConst(long var1, String var3) {
      long var4 = mainJNI.Solver_makeIntConst__SWIG_0(this.swigCPtr, this, var1, var3);
      return var4 == 0L ? null : new IntVar(var4, false);
   }

   public IntVar makeIntConst(long var1) {
      long var3 = mainJNI.Solver_makeIntConst__SWIG_1(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntExpr makeSum(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeSum__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeSum(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeSum__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public IntExpr makeSum(IntVar[] var1) {
      long var2 = mainJNI.Solver_makeSum__SWIG_2(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntExpr(var2, false);
   }

   public IntExpr makeScalProd(IntVar[] var1, long[] var2) {
      long var3 = mainJNI.Solver_makeScalProd__SWIG_0(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeScalProd(IntVar[] var1, int[] var2) {
      long var3 = mainJNI.Solver_makeScalProd__SWIG_1(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeDifference(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeDifference__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeDifference(long var1, IntExpr var3) {
      long var4 = mainJNI.Solver_makeDifference__SWIG_1(this.swigCPtr, this, var1, IntExpr.getCPtr(var3), var3);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public IntExpr makeOpposite(IntExpr var1) {
      long var2 = mainJNI.Solver_makeOpposite(this.swigCPtr, this, IntExpr.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntExpr(var2, false);
   }

   public IntExpr makeProd(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeProd__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeProd(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeProd__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public IntExpr makeDiv(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeDiv__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public IntExpr makeDiv(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeDiv__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeAbs(IntExpr var1) {
      long var2 = mainJNI.Solver_makeAbs(this.swigCPtr, this, IntExpr.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntExpr(var2, false);
   }

   public IntExpr makeSquare(IntExpr var1) {
      long var2 = mainJNI.Solver_makeSquare(this.swigCPtr, this, IntExpr.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntExpr(var2, false);
   }

   public IntExpr makePower(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makePower(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public IntExpr makeElement(long[] var1, IntVar var2) {
      long var3 = mainJNI.Solver_makeElement__SWIG_0(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeElement(int[] var1, IntVar var2) {
      long var3 = mainJNI.Solver_makeElement__SWIG_1(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeElement(LongUnaryOperator var1, IntVar var2) {
      long var3 = mainJNI.Solver_makeElement__SWIG_2(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeMonotonicElement(LongUnaryOperator var1, boolean var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeMonotonicElement(this.swigCPtr, this, var1, var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public IntExpr makeElement(LongBinaryOperator var1, IntVar var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeElement__SWIG_3(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public IntExpr makeElement(IntVar[] var1, IntVar var2) {
      long var3 = mainJNI.Solver_makeElement__SWIG_4(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeIndexExpression(IntVar[] var1, long var2) {
      long var4 = mainJNI.Solver_makeIndexExpression(this.swigCPtr, this, var1, var2);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public Constraint makeIfThenElseCt(IntVar var1, IntExpr var2, IntExpr var3, IntVar var4) {
      long var5 = mainJNI.Solver_makeIfThenElseCt(this.swigCPtr, this, IntVar.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, IntExpr.getCPtr(var3), var3, IntVar.getCPtr(var4), var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public IntExpr makeMin(IntVar[] var1) {
      long var2 = mainJNI.Solver_makeMin__SWIG_0(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntExpr(var2, false);
   }

   public IntExpr makeMin(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeMin__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeMin(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeMin__SWIG_2(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public IntExpr makeMin(IntExpr var1, int var2) {
      long var3 = mainJNI.Solver_makeMin__SWIG_3(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeMax(IntVar[] var1) {
      long var2 = mainJNI.Solver_makeMax__SWIG_0(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntExpr(var2, false);
   }

   public IntExpr makeMax(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeMax__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeMax(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeMax__SWIG_2(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public IntExpr makeMax(IntExpr var1, int var2) {
      long var3 = mainJNI.Solver_makeMax__SWIG_3(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeConvexPiecewiseExpr(IntExpr var1, long var2, long var4, long var6, long var8) {
      long var10 = mainJNI.Solver_makeConvexPiecewiseExpr(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var4, var6, var8);
      return var10 == 0L ? null : new IntExpr(var10, false);
   }

   public IntExpr makeSemiContinuousExpr(IntExpr var1, long var2, long var4) {
      long var6 = mainJNI.Solver_makeSemiContinuousExpr(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var4);
      return var6 == 0L ? null : new IntExpr(var6, false);
   }

   public IntExpr makeModulo(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeModulo__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public IntExpr makeModulo(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeModulo__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public IntExpr makeConditionalExpression(IntVar var1, IntExpr var2, long var3) {
      long var5 = mainJNI.Solver_makeConditionalExpression(this.swigCPtr, this, IntVar.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, var3);
      return var5 == 0L ? null : new IntExpr(var5, false);
   }

   public Constraint makeTrueConstraint() {
      long var1 = mainJNI.Solver_makeTrueConstraint(this.swigCPtr, this);
      return var1 == 0L ? null : new Constraint(var1, false);
   }

   public Constraint makeFalseConstraint() {
      long var1 = mainJNI.Solver_makeFalseConstraint__SWIG_0(this.swigCPtr, this);
      return var1 == 0L ? null : new Constraint(var1, false);
   }

   public Constraint makeFalseConstraint(String var1) {
      long var2 = mainJNI.Solver_makeFalseConstraint__SWIG_1(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new Constraint(var2, false);
   }

   public Constraint makeIsEqualCstCt(IntExpr var1, long var2, IntVar var4) {
      long var5 = mainJNI.Solver_makeIsEqualCstCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, IntVar.getCPtr(var4), var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public IntVar makeIsEqualCstVar(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeIsEqualCstVar(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntVar(var4, false);
   }

   public Constraint makeIsEqualVar(IntExpr var1, IntExpr var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeIsEqualVar__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public IntVar makeIsEqualVar(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeIsEqualVar__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public Constraint makeEquality(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeEquality__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeEquality(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeEquality__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeEquality(IntExpr var1, int var2) {
      long var3 = mainJNI.Solver_makeEquality__SWIG_2(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeIsDifferentCstCt(IntExpr var1, long var2, IntVar var4) {
      long var5 = mainJNI.Solver_makeIsDifferentCstCt__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, IntVar.getCPtr(var4), var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public IntVar makeIsDifferentCstVar(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeIsDifferentCstVar__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntVar(var4, false);
   }

   public IntVar makeIsDifferentCstVar(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeIsDifferentCstVar__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public Constraint makeIsDifferentCstCt(IntExpr var1, IntExpr var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeIsDifferentCstCt__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeNonEquality(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeNonEquality__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeNonEquality(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeNonEquality__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeNonEquality(IntExpr var1, int var2) {
      long var3 = mainJNI.Solver_makeNonEquality__SWIG_2(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeIsLessOrEqualCstCt(IntExpr var1, long var2, IntVar var4) {
      long var5 = mainJNI.Solver_makeIsLessOrEqualCstCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, IntVar.getCPtr(var4), var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public IntVar makeIsLessOrEqualCstVar(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeIsLessOrEqualCstVar(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntVar(var4, false);
   }

   public IntVar makeIsLessOrEqualVar(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeIsLessOrEqualVar(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public Constraint makeIsLessOrEqualCt(IntExpr var1, IntExpr var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeIsLessOrEqualCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeLessOrEqual(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeLessOrEqual__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeLessOrEqual(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeLessOrEqual__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeLessOrEqual(IntExpr var1, int var2) {
      long var3 = mainJNI.Solver_makeLessOrEqual__SWIG_2(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeIsGreaterOrEqualCstCt(IntExpr var1, long var2, IntVar var4) {
      long var5 = mainJNI.Solver_makeIsGreaterOrEqualCstCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, IntVar.getCPtr(var4), var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public IntVar makeIsGreaterOrEqualCstVar(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeIsGreaterOrEqualCstVar(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntVar(var4, false);
   }

   public IntVar makeIsGreaterOrEqualVar(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeIsGreaterOrEqualVar(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public Constraint makeIsGreaterOrEqualCt(IntExpr var1, IntExpr var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeIsGreaterOrEqualCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeGreaterOrEqual(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeGreaterOrEqual__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeGreaterOrEqual(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeGreaterOrEqual__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeGreaterOrEqual(IntExpr var1, int var2) {
      long var3 = mainJNI.Solver_makeGreaterOrEqual__SWIG_2(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeIsGreaterCstCt(IntExpr var1, long var2, IntVar var4) {
      long var5 = mainJNI.Solver_makeIsGreaterCstCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, IntVar.getCPtr(var4), var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public IntVar makeIsGreaterCstVar(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeIsGreaterCstVar(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntVar(var4, false);
   }

   public IntVar makeIsGreaterVar(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeIsGreaterVar(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public Constraint makeIsGreaterCt(IntExpr var1, IntExpr var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeIsGreaterCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeGreater(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeGreater__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeGreater(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeGreater__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeGreater(IntExpr var1, int var2) {
      long var3 = mainJNI.Solver_makeGreater__SWIG_2(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeIsLessCstCt(IntExpr var1, long var2, IntVar var4) {
      long var5 = mainJNI.Solver_makeIsLessCstCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, IntVar.getCPtr(var4), var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public IntVar makeIsLessCstVar(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeIsLessCstVar(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new IntVar(var4, false);
   }

   public IntVar makeIsLessVar(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeIsLessVar(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public Constraint makeIsLessCt(IntExpr var1, IntExpr var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeIsLessCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeLess(IntExpr var1, IntExpr var2) {
      long var3 = mainJNI.Solver_makeLess__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeLess(IntExpr var1, long var2) {
      long var4 = mainJNI.Solver_makeLess__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeLess(IntExpr var1, int var2) {
      long var3 = mainJNI.Solver_makeLess__SWIG_2(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeSumLessOrEqual(IntVar[] var1, long var2) {
      long var4 = mainJNI.Solver_makeSumLessOrEqual(this.swigCPtr, this, var1, var2);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeSumGreaterOrEqual(IntVar[] var1, long var2) {
      long var4 = mainJNI.Solver_makeSumGreaterOrEqual(this.swigCPtr, this, var1, var2);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeSumEquality(IntVar[] var1, long var2) {
      long var4 = mainJNI.Solver_makeSumEquality__SWIG_0(this.swigCPtr, this, var1, var2);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeSumEquality(IntVar[] var1, IntVar var2) {
      long var3 = mainJNI.Solver_makeSumEquality__SWIG_1(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeScalProdEquality(IntVar[] var1, long[] var2, long var3) {
      long var5 = mainJNI.Solver_makeScalProdEquality__SWIG_0(this.swigCPtr, this, var1, var2, var3);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeScalProdEquality(IntVar[] var1, int[] var2, long var3) {
      long var5 = mainJNI.Solver_makeScalProdEquality__SWIG_1(this.swigCPtr, this, var1, var2, var3);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeScalProdEquality(IntVar[] var1, long[] var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeScalProdEquality__SWIG_2(this.swigCPtr, this, var1, var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeScalProdEquality(IntVar[] var1, int[] var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeScalProdEquality__SWIG_3(this.swigCPtr, this, var1, var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeScalProdGreaterOrEqual(IntVar[] var1, long[] var2, long var3) {
      long var5 = mainJNI.Solver_makeScalProdGreaterOrEqual__SWIG_0(this.swigCPtr, this, var1, var2, var3);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeScalProdGreaterOrEqual(IntVar[] var1, int[] var2, long var3) {
      long var5 = mainJNI.Solver_makeScalProdGreaterOrEqual__SWIG_1(this.swigCPtr, this, var1, var2, var3);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeScalProdLessOrEqual(IntVar[] var1, long[] var2, long var3) {
      long var5 = mainJNI.Solver_makeScalProdLessOrEqual__SWIG_0(this.swigCPtr, this, var1, var2, var3);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeScalProdLessOrEqual(IntVar[] var1, int[] var2, long var3) {
      long var5 = mainJNI.Solver_makeScalProdLessOrEqual__SWIG_1(this.swigCPtr, this, var1, var2, var3);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeMinEquality(IntVar[] var1, IntVar var2) {
      long var3 = mainJNI.Solver_makeMinEquality(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeMaxEquality(IntVar[] var1, IntVar var2) {
      long var3 = mainJNI.Solver_makeMaxEquality(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeElementEquality(long[] var1, IntVar var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeElementEquality__SWIG_0(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeElementEquality(int[] var1, IntVar var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeElementEquality__SWIG_1(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeElementEquality(IntVar[] var1, IntVar var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeElementEquality__SWIG_2(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeElementEquality(IntVar[] var1, IntVar var2, long var3) {
      long var5 = mainJNI.Solver_makeElementEquality__SWIG_3(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, var3);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeAbsEquality(IntVar var1, IntVar var2) {
      long var3 = mainJNI.Solver_makeAbsEquality(this.swigCPtr, this, IntVar.getCPtr(var1), var1, IntVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeIndexOfConstraint(IntVar[] var1, IntVar var2, long var3) {
      long var5 = mainJNI.Solver_makeIndexOfConstraint(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, var3);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Demon makeConstraintInitialPropagateCallback(Constraint var1) {
      long var2 = mainJNI.Solver_makeConstraintInitialPropagateCallback(this.swigCPtr, this, Constraint.getCPtr(var1), var1);
      return var2 == 0L ? null : new Demon(var2, false);
   }

   public Demon makeDelayedConstraintInitialPropagateCallback(Constraint var1) {
      long var2 = mainJNI.Solver_makeDelayedConstraintInitialPropagateCallback(this.swigCPtr, this, Constraint.getCPtr(var1), var1);
      return var2 == 0L ? null : new Demon(var2, false);
   }

   public Demon makeClosureDemon(Runnable var1) {
      long var2 = mainJNI.Solver_makeClosureDemon(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new Demon(var2, false);
   }

   public Constraint makeBetweenCt(IntExpr var1, long var2, long var4) {
      long var6 = mainJNI.Solver_makeBetweenCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var4);
      return var6 == 0L ? null : new Constraint(var6, false);
   }

   public Constraint makeNotBetweenCt(IntExpr var1, long var2, long var4) {
      long var6 = mainJNI.Solver_makeNotBetweenCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var4);
      return var6 == 0L ? null : new Constraint(var6, false);
   }

   public Constraint makeIsBetweenCt(IntExpr var1, long var2, long var4, IntVar var6) {
      long var7 = mainJNI.Solver_makeIsBetweenCt(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var4, IntVar.getCPtr(var6), var6);
      return var7 == 0L ? null : new Constraint(var7, false);
   }

   public IntVar makeIsBetweenVar(IntExpr var1, long var2, long var4) {
      long var6 = mainJNI.Solver_makeIsBetweenVar(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var4);
      return var6 == 0L ? null : new IntVar(var6, false);
   }

   public Constraint makeMemberCt(IntExpr var1, long[] var2) {
      long var3 = mainJNI.Solver_makeMemberCt__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeMemberCt(IntExpr var1, int[] var2) {
      long var3 = mainJNI.Solver_makeMemberCt__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeNotMemberCt(IntExpr var1, long[] var2) {
      long var3 = mainJNI.Solver_makeNotMemberCt__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeNotMemberCt(IntExpr var1, int[] var2) {
      long var3 = mainJNI.Solver_makeNotMemberCt__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeNotMemberCt(IntExpr var1, long[] var2, long[] var3) {
      long var4 = mainJNI.Solver_makeNotMemberCt__SWIG_2(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeNotMemberCt(IntExpr var1, int[] var2, int[] var3) {
      long var4 = mainJNI.Solver_makeNotMemberCt__SWIG_3(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeIsMemberCt(IntExpr var1, long[] var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeIsMemberCt__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeIsMemberCt(IntExpr var1, int[] var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeIsMemberCt__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public IntVar makeIsMemberVar(IntExpr var1, long[] var2) {
      long var3 = mainJNI.Solver_makeIsMemberVar__SWIG_0(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar makeIsMemberVar(IntExpr var1, int[] var2) {
      long var3 = mainJNI.Solver_makeIsMemberVar__SWIG_1(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public Constraint makeCount(IntVar[] var1, long var2, long var4) {
      long var6 = mainJNI.Solver_makeCount__SWIG_0(this.swigCPtr, this, var1, var2, var4);
      return var6 == 0L ? null : new Constraint(var6, false);
   }

   public Constraint makeCount(IntVar[] var1, long var2, IntVar var4) {
      long var5 = mainJNI.Solver_makeCount__SWIG_1(this.swigCPtr, this, var1, var2, IntVar.getCPtr(var4), var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeDistribute(IntVar[] var1, long[] var2, IntVar[] var3) {
      long var4 = mainJNI.Solver_makeDistribute__SWIG_0(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeDistribute(IntVar[] var1, int[] var2, IntVar[] var3) {
      long var4 = mainJNI.Solver_makeDistribute__SWIG_1(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeDistribute(IntVar[] var1, IntVar[] var2) {
      long var3 = mainJNI.Solver_makeDistribute__SWIG_2(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeDistribute(IntVar[] var1, long var2, long var4, long var6) {
      long var8 = mainJNI.Solver_makeDistribute__SWIG_3(this.swigCPtr, this, var1, var2, var4, var6);
      return var8 == 0L ? null : new Constraint(var8, false);
   }

   public Constraint makeDistribute(IntVar[] var1, long[] var2, long[] var3) {
      long var4 = mainJNI.Solver_makeDistribute__SWIG_4(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeDistribute(IntVar[] var1, int[] var2, int[] var3) {
      long var4 = mainJNI.Solver_makeDistribute__SWIG_5(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeDistribute(IntVar[] var1, long[] var2, long[] var3, long[] var4) {
      long var5 = mainJNI.Solver_makeDistribute__SWIG_6(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeDistribute(IntVar[] var1, int[] var2, int[] var3, int[] var4) {
      long var5 = mainJNI.Solver_makeDistribute__SWIG_7(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeDeviation(IntVar[] var1, IntVar var2, long var3) {
      long var5 = mainJNI.Solver_makeDeviation(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, var3);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeAllDifferent(IntVar[] var1) {
      long var2 = mainJNI.Solver_makeAllDifferent__SWIG_0(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new Constraint(var2, false);
   }

   public Constraint makeAllDifferent(IntVar[] var1, boolean var2) {
      long var3 = mainJNI.Solver_makeAllDifferent__SWIG_1(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeAllDifferentExcept(IntVar[] var1, long var2) {
      long var4 = mainJNI.Solver_makeAllDifferentExcept(this.swigCPtr, this, var1, var2);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeSortingConstraint(IntVar[] var1, IntVar[] var2) {
      long var3 = mainJNI.Solver_makeSortingConstraint(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeLexicalLess(IntVar[] var1, IntVar[] var2) {
      long var3 = mainJNI.Solver_makeLexicalLess(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeLexicalLessOrEqual(IntVar[] var1, IntVar[] var2) {
      long var3 = mainJNI.Solver_makeLexicalLessOrEqual(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeInversePermutationConstraint(IntVar[] var1, IntVar[] var2) {
      long var3 = mainJNI.Solver_makeInversePermutationConstraint(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeIndexOfFirstMaxValueConstraint(IntVar var1, IntVar[] var2) {
      long var3 = mainJNI.Solver_makeIndexOfFirstMaxValueConstraint(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeIndexOfFirstMinValueConstraint(IntVar var1, IntVar[] var2) {
      long var3 = mainJNI.Solver_makeIndexOfFirstMinValueConstraint(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeNullIntersect(IntVar[] var1, IntVar[] var2) {
      long var3 = mainJNI.Solver_makeNullIntersect(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeNullIntersectExcept(IntVar[] var1, IntVar[] var2, long var3) {
      long var5 = mainJNI.Solver_makeNullIntersectExcept(this.swigCPtr, this, var1, var2, var3);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeNoCycle(IntVar[] var1, IntVar[] var2, LongPredicate var3) {
      long var4 = mainJNI.Solver_makeNoCycle__SWIG_0(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeNoCycle(IntVar[] var1, IntVar[] var2) {
      long var3 = mainJNI.Solver_makeNoCycle__SWIG_1(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeNoCycle(IntVar[] var1, IntVar[] var2, LongPredicate var3, boolean var4) {
      long var5 = mainJNI.Solver_makeNoCycle__SWIG_2(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeCircuit(IntVar[] var1) {
      long var2 = mainJNI.Solver_makeCircuit(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new Constraint(var2, false);
   }

   public Constraint makeSubCircuit(IntVar[] var1) {
      long var2 = mainJNI.Solver_makeSubCircuit(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new Constraint(var2, false);
   }

   public Constraint makePathCumul(IntVar[] var1, IntVar[] var2, IntVar[] var3, IntVar[] var4) {
      long var5 = mainJNI.Solver_makePathCumul__SWIG_0(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeDelayedPathCumul(IntVar[] var1, IntVar[] var2, IntVar[] var3, IntVar[] var4) {
      long var5 = mainJNI.Solver_makeDelayedPathCumul(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makePathCumul(IntVar[] var1, IntVar[] var2, IntVar[] var3, LongBinaryOperator var4) {
      long var5 = mainJNI.Solver_makePathCumul__SWIG_1(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makePathCumul(IntVar[] var1, IntVar[] var2, IntVar[] var3, IntVar[] var4, LongBinaryOperator var5) {
      long var6 = mainJNI.Solver_makePathCumul__SWIG_2(this.swigCPtr, this, var1, var2, var3, var4, var5);
      return var6 == 0L ? null : new Constraint(var6, false);
   }

   public Constraint makePathConnected(IntVar[] var1, long[] var2, long[] var3, IntVar[] var4) {
      long var5 = mainJNI.Solver_makePathConnected(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeMapDomain(IntVar var1, IntVar[] var2) {
      long var3 = mainJNI.Solver_makeMapDomain(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeAllowedAssignment(IntVar[] var1, IntTupleSet var2) {
      long var3 = mainJNI.Solver_makeAllowedAssignment(this.swigCPtr, this, var1, IntTupleSet.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeTransitionConstraint(IntVar[] var1, IntTupleSet var2, long var3, long[] var5) {
      long var6 = mainJNI.Solver_makeTransitionConstraint__SWIG_0(this.swigCPtr, this, var1, IntTupleSet.getCPtr(var2), var2, var3, var5);
      return var6 == 0L ? null : new Constraint(var6, false);
   }

   public Constraint makeTransitionConstraint(IntVar[] var1, IntTupleSet var2, long var3, int[] var5) {
      long var6 = mainJNI.Solver_makeTransitionConstraint__SWIG_1(this.swigCPtr, this, var1, IntTupleSet.getCPtr(var2), var2, var3, var5);
      return var6 == 0L ? null : new Constraint(var6, false);
   }

   public Constraint makeNonOverlappingBoxesConstraint(IntVar[] var1, IntVar[] var2, IntVar[] var3, IntVar[] var4) {
      long var5 = mainJNI.Solver_makeNonOverlappingBoxesConstraint__SWIG_0(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeNonOverlappingBoxesConstraint(IntVar[] var1, IntVar[] var2, long[] var3, long[] var4) {
      long var5 = mainJNI.Solver_makeNonOverlappingBoxesConstraint__SWIG_1(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeNonOverlappingBoxesConstraint(IntVar[] var1, IntVar[] var2, int[] var3, int[] var4) {
      long var5 = mainJNI.Solver_makeNonOverlappingBoxesConstraint__SWIG_2(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeNonOverlappingNonStrictBoxesConstraint(IntVar[] var1, IntVar[] var2, IntVar[] var3, IntVar[] var4) {
      long var5 = mainJNI.Solver_makeNonOverlappingNonStrictBoxesConstraint__SWIG_0(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeNonOverlappingNonStrictBoxesConstraint(IntVar[] var1, IntVar[] var2, long[] var3, long[] var4) {
      long var5 = mainJNI.Solver_makeNonOverlappingNonStrictBoxesConstraint__SWIG_1(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeNonOverlappingNonStrictBoxesConstraint(IntVar[] var1, IntVar[] var2, int[] var3, int[] var4) {
      long var5 = mainJNI.Solver_makeNonOverlappingNonStrictBoxesConstraint__SWIG_2(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Pack makePack(IntVar[] var1, int var2) {
      long var3 = mainJNI.Solver_makePack(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Pack(var3, false);
   }

   public IntervalVar makeFixedDurationIntervalVar(long var1, long var3, long var5, boolean var7, String var8) {
      long var9 = mainJNI.Solver_makeFixedDurationIntervalVar__SWIG_0(this.swigCPtr, this, var1, var3, var5, var7, var8);
      return var9 == 0L ? null : new IntervalVar(var9, false);
   }

   public IntervalVar makeFixedDurationIntervalVar(IntVar var1, long var2, String var4) {
      long var5 = mainJNI.Solver_makeFixedDurationIntervalVar__SWIG_1(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var4);
      return var5 == 0L ? null : new IntervalVar(var5, false);
   }

   public IntervalVar makeFixedDurationIntervalVar(IntVar var1, long var2, IntVar var4, String var5) {
      long var6 = mainJNI.Solver_makeFixedDurationIntervalVar__SWIG_2(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, IntVar.getCPtr(var4), var4, var5);
      return var6 == 0L ? null : new IntervalVar(var6, false);
   }

   public IntervalVar makeFixedInterval(long var1, long var3, String var5) {
      long var6 = mainJNI.Solver_makeFixedInterval(this.swigCPtr, this, var1, var3, var5);
      return var6 == 0L ? null : new IntervalVar(var6, false);
   }

   public IntervalVar makeIntervalVar(long var1, long var3, long var5, long var7, long var9, long var11, boolean var13, String var14) {
      long var15 = mainJNI.Solver_makeIntervalVar(this.swigCPtr, this, var1, var3, var5, var7, var9, var11, var13, var14);
      return var15 == 0L ? null : new IntervalVar(var15, false);
   }

   public IntervalVar makeMirrorInterval(IntervalVar var1) {
      long var2 = mainJNI.Solver_makeMirrorInterval(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntervalVar(var2, false);
   }

   public IntervalVar makeFixedDurationStartSyncedOnStartIntervalVar(IntervalVar var1, long var2, long var4) {
      long var6 = mainJNI.Solver_makeFixedDurationStartSyncedOnStartIntervalVar(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
      return var6 == 0L ? null : new IntervalVar(var6, false);
   }

   public IntervalVar makeFixedDurationStartSyncedOnEndIntervalVar(IntervalVar var1, long var2, long var4) {
      long var6 = mainJNI.Solver_makeFixedDurationStartSyncedOnEndIntervalVar(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
      return var6 == 0L ? null : new IntervalVar(var6, false);
   }

   public IntervalVar makeFixedDurationEndSyncedOnStartIntervalVar(IntervalVar var1, long var2, long var4) {
      long var6 = mainJNI.Solver_makeFixedDurationEndSyncedOnStartIntervalVar(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
      return var6 == 0L ? null : new IntervalVar(var6, false);
   }

   public IntervalVar makeFixedDurationEndSyncedOnEndIntervalVar(IntervalVar var1, long var2, long var4) {
      long var6 = mainJNI.Solver_makeFixedDurationEndSyncedOnEndIntervalVar(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
      return var6 == 0L ? null : new IntervalVar(var6, false);
   }

   public IntervalVar makeIntervalRelaxedMin(IntervalVar var1) {
      long var2 = mainJNI.Solver_makeIntervalRelaxedMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntervalVar(var2, false);
   }

   public IntervalVar makeIntervalRelaxedMax(IntervalVar var1) {
      long var2 = mainJNI.Solver_makeIntervalRelaxedMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntervalVar(var2, false);
   }

   public Constraint makeIntervalVarRelation(IntervalVar var1, int var2, long var3) {
      long var5 = mainJNI.Solver_makeIntervalVarRelation__SWIG_0(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var3);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeIntervalVarRelation(IntervalVar var1, int var2, IntervalVar var3) {
      long var4 = mainJNI.Solver_makeIntervalVarRelation__SWIG_1(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, IntervalVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeIntervalVarRelationWithDelay(IntervalVar var1, int var2, IntervalVar var3, long var4) {
      long var6 = mainJNI.Solver_makeIntervalVarRelationWithDelay(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, IntervalVar.getCPtr(var3), var3, var4);
      return var6 == 0L ? null : new Constraint(var6, false);
   }

   public Constraint makeTemporalDisjunction(IntervalVar var1, IntervalVar var2, IntVar var3) {
      long var4 = mainJNI.Solver_makeTemporalDisjunction__SWIG_0(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, IntervalVar.getCPtr(var2), var2, IntVar.getCPtr(var3), var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public Constraint makeTemporalDisjunction(IntervalVar var1, IntervalVar var2) {
      long var3 = mainJNI.Solver_makeTemporalDisjunction__SWIG_1(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, IntervalVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public DisjunctiveConstraint makeDisjunctiveConstraint(IntervalVar[] var1, String var2) {
      long var3 = mainJNI.Solver_makeDisjunctiveConstraint(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new DisjunctiveConstraint(var3, false);
   }

   public DisjunctiveConstraint makeStrictDisjunctiveConstraint(IntervalVar[] var1, String var2) {
      long var3 = mainJNI.Solver_makeStrictDisjunctiveConstraint(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new DisjunctiveConstraint(var3, false);
   }

   public Constraint makeCumulative(IntervalVar[] var1, long[] var2, long var3, String var5) {
      long var6 = mainJNI.Solver_makeCumulative__SWIG_0(this.swigCPtr, this, var1, var2, var3, var5);
      return var6 == 0L ? null : new Constraint(var6, false);
   }

   public Constraint makeCumulative(IntervalVar[] var1, int[] var2, long var3, String var5) {
      long var6 = mainJNI.Solver_makeCumulative__SWIG_1(this.swigCPtr, this, var1, var2, var3, var5);
      return var6 == 0L ? null : new Constraint(var6, false);
   }

   public Constraint makeCumulative(IntervalVar[] var1, long[] var2, IntVar var3, String var4) {
      long var5 = mainJNI.Solver_makeCumulative__SWIG_2(this.swigCPtr, this, var1, var2, IntVar.getCPtr(var3), var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeCumulative(IntervalVar[] var1, int[] var2, IntVar var3, String var4) {
      long var5 = mainJNI.Solver_makeCumulative__SWIG_3(this.swigCPtr, this, var1, var2, IntVar.getCPtr(var3), var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeCumulative(IntervalVar[] var1, IntVar[] var2, long var3, String var5) {
      long var6 = mainJNI.Solver_makeCumulative__SWIG_4(this.swigCPtr, this, var1, var2, var3, var5);
      return var6 == 0L ? null : new Constraint(var6, false);
   }

   public Constraint makeCumulative(IntervalVar[] var1, IntVar[] var2, IntVar var3, String var4) {
      long var5 = mainJNI.Solver_makeCumulative__SWIG_5(this.swigCPtr, this, var1, var2, IntVar.getCPtr(var3), var3, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public Constraint makeCover(IntervalVar[] var1, IntervalVar var2) {
      long var3 = mainJNI.Solver_makeCover(this.swigCPtr, this, var1, IntervalVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Constraint makeEquality(IntervalVar var1, IntervalVar var2) {
      long var3 = mainJNI.Solver_makeEquality__SWIG_3(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, IntervalVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new Constraint(var3, false);
   }

   public Assignment makeAssignment() {
      long var1 = mainJNI.Solver_makeAssignment__SWIG_0(this.swigCPtr, this);
      return var1 == 0L ? null : new Assignment(var1, false);
   }

   public Assignment makeAssignment(Assignment var1) {
      long var2 = mainJNI.Solver_makeAssignment__SWIG_1(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      return var2 == 0L ? null : new Assignment(var2, false);
   }

   public SolutionCollector makeFirstSolutionCollector(Assignment var1) {
      long var2 = mainJNI.Solver_makeFirstSolutionCollector__SWIG_0(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      return var2 == 0L ? null : new SolutionCollector(var2, false);
   }

   public SolutionCollector makeFirstSolutionCollector() {
      long var1 = mainJNI.Solver_makeFirstSolutionCollector__SWIG_1(this.swigCPtr, this);
      return var1 == 0L ? null : new SolutionCollector(var1, false);
   }

   public SolutionCollector makeLastSolutionCollector(Assignment var1) {
      long var2 = mainJNI.Solver_makeLastSolutionCollector__SWIG_0(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      return var2 == 0L ? null : new SolutionCollector(var2, false);
   }

   public SolutionCollector makeLastSolutionCollector() {
      long var1 = mainJNI.Solver_makeLastSolutionCollector__SWIG_1(this.swigCPtr, this);
      return var1 == 0L ? null : new SolutionCollector(var1, false);
   }

   public SolutionCollector makeBestValueSolutionCollector(Assignment var1, boolean var2) {
      long var3 = mainJNI.Solver_makeBestValueSolutionCollector__SWIG_0(this.swigCPtr, this, Assignment.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new SolutionCollector(var3, false);
   }

   public SolutionCollector makeBestValueSolutionCollector(boolean var1) {
      long var2 = mainJNI.Solver_makeBestValueSolutionCollector__SWIG_1(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new SolutionCollector(var2, false);
   }

   public SolutionCollector makeNBestValueSolutionCollector(Assignment var1, int var2, boolean var3) {
      long var4 = mainJNI.Solver_makeNBestValueSolutionCollector__SWIG_0(this.swigCPtr, this, Assignment.getCPtr(var1), var1, var2, var3);
      return var4 == 0L ? null : new SolutionCollector(var4, false);
   }

   public SolutionCollector makeNBestValueSolutionCollector(int var1, boolean var2) {
      long var3 = mainJNI.Solver_makeNBestValueSolutionCollector__SWIG_1(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new SolutionCollector(var3, false);
   }

   public SolutionCollector makeAllSolutionCollector(Assignment var1) {
      long var2 = mainJNI.Solver_makeAllSolutionCollector__SWIG_0(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      return var2 == 0L ? null : new SolutionCollector(var2, false);
   }

   public SolutionCollector makeAllSolutionCollector() {
      long var1 = mainJNI.Solver_makeAllSolutionCollector__SWIG_1(this.swigCPtr, this);
      return var1 == 0L ? null : new SolutionCollector(var1, false);
   }

   public OptimizeVar makeMinimize(IntVar var1, long var2) {
      long var4 = mainJNI.Solver_makeMinimize(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new OptimizeVar(var4, false);
   }

   public OptimizeVar makeMaximize(IntVar var1, long var2) {
      long var4 = mainJNI.Solver_makeMaximize(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new OptimizeVar(var4, false);
   }

   public OptimizeVar makeOptimize(boolean var1, IntVar var2, long var3) {
      long var5 = mainJNI.Solver_makeOptimize(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, var3);
      return var5 == 0L ? null : new OptimizeVar(var5, false);
   }

   public OptimizeVar makeWeightedMinimize(IntVar[] var1, long[] var2, long var3) {
      long var5 = mainJNI.Solver_makeWeightedMinimize__SWIG_0(this.swigCPtr, this, var1, var2, var3);
      return var5 == 0L ? null : new OptimizeVar(var5, false);
   }

   public OptimizeVar makeWeightedMinimize(IntVar[] var1, int[] var2, long var3) {
      long var5 = mainJNI.Solver_makeWeightedMinimize__SWIG_1(this.swigCPtr, this, var1, var2, var3);
      return var5 == 0L ? null : new OptimizeVar(var5, false);
   }

   public OptimizeVar makeWeightedMaximize(IntVar[] var1, long[] var2, long var3) {
      long var5 = mainJNI.Solver_makeWeightedMaximize__SWIG_0(this.swigCPtr, this, var1, var2, var3);
      return var5 == 0L ? null : new OptimizeVar(var5, false);
   }

   public OptimizeVar makeWeightedMaximize(IntVar[] var1, int[] var2, long var3) {
      long var5 = mainJNI.Solver_makeWeightedMaximize__SWIG_1(this.swigCPtr, this, var1, var2, var3);
      return var5 == 0L ? null : new OptimizeVar(var5, false);
   }

   public OptimizeVar makeWeightedOptimize(boolean var1, IntVar[] var2, long[] var3, long var4) {
      long var6 = mainJNI.Solver_makeWeightedOptimize__SWIG_0(this.swigCPtr, this, var1, var2, var3, var4);
      return var6 == 0L ? null : new OptimizeVar(var6, false);
   }

   public OptimizeVar makeWeightedOptimize(boolean var1, IntVar[] var2, int[] var3, long var4) {
      long var6 = mainJNI.Solver_makeWeightedOptimize__SWIG_1(this.swigCPtr, this, var1, var2, var3, var4);
      return var6 == 0L ? null : new OptimizeVar(var6, false);
   }

   public SearchMonitor makeTabuSearch(boolean var1, IntVar var2, long var3, IntVar[] var5, long var6, long var8, double var10) {
      long var12 = mainJNI.Solver_makeTabuSearch(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, var3, var5, var6, var8, var10);
      return var12 == 0L ? null : new SearchMonitor(var12, false);
   }

   public SearchMonitor makeGenericTabuSearch(boolean var1, IntVar var2, long var3, IntVar[] var5, long var6) {
      long var8 = mainJNI.Solver_makeGenericTabuSearch(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, var3, var5, var6);
      return var8 == 0L ? null : new SearchMonitor(var8, false);
   }

   public SearchMonitor makeSimulatedAnnealing(boolean var1, IntVar var2, long var3, long var5) {
      long var7 = mainJNI.Solver_makeSimulatedAnnealing(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, var3, var5);
      return var7 == 0L ? null : new SearchMonitor(var7, false);
   }

   public SearchMonitor makeGuidedLocalSearch(boolean var1, IntVar var2, LongBinaryOperator var3, long var4, IntVar[] var6, double var7) {
      long var9 = mainJNI.Solver_makeGuidedLocalSearch__SWIG_0(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, var3, var4, var6, var7);
      return var9 == 0L ? null : new SearchMonitor(var9, false);
   }

   public SearchMonitor makeGuidedLocalSearch(boolean var1, IntVar var2, LongTernaryOperator var3, long var4, IntVar[] var6, IntVar[] var7, double var8) {
      long var10 = mainJNI.Solver_makeGuidedLocalSearch__SWIG_1(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, var3, var4, var6, var7, var8);
      return var10 == 0L ? null : new SearchMonitor(var10, false);
   }

   public SearchMonitor makeLubyRestart(int var1) {
      long var2 = mainJNI.Solver_makeLubyRestart(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new SearchMonitor(var2, false);
   }

   public SearchMonitor makeConstantRestart(int var1) {
      long var2 = mainJNI.Solver_makeConstantRestart(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new SearchMonitor(var2, false);
   }

   public RegularLimit makeTimeLimit(long var1) {
      long var3 = mainJNI.Solver_makeTimeLimit(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new RegularLimit(var3, false);
   }

   public RegularLimit makeBranchesLimit(long var1) {
      long var3 = mainJNI.Solver_makeBranchesLimit(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new RegularLimit(var3, false);
   }

   public RegularLimit makeFailuresLimit(long var1) {
      long var3 = mainJNI.Solver_makeFailuresLimit(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new RegularLimit(var3, false);
   }

   public RegularLimit makeSolutionsLimit(long var1) {
      long var3 = mainJNI.Solver_makeSolutionsLimit(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new RegularLimit(var3, false);
   }

   public RegularLimit makeLimit(long var1, long var3, long var5, long var7) {
      long var9 = mainJNI.Solver_makeLimit__SWIG_0(this.swigCPtr, this, var1, var3, var5, var7);
      return var9 == 0L ? null : new RegularLimit(var9, false);
   }

   public RegularLimit makeLimit(long var1, long var3, long var5, long var7, boolean var9) {
      long var10 = mainJNI.Solver_makeLimit__SWIG_1(this.swigCPtr, this, var1, var3, var5, var7, var9);
      return var10 == 0L ? null : new RegularLimit(var10, false);
   }

   public RegularLimit makeLimit(long var1, long var3, long var5, long var7, boolean var9, boolean var10) {
      long var11 = mainJNI.Solver_makeLimit__SWIG_2(this.swigCPtr, this, var1, var3, var5, var7, var9, var10);
      return var11 == 0L ? null : new RegularLimit(var11, false);
   }

   public RegularLimit makeLimit(RegularLimitParameters var1) {
      long var2 = mainJNI.Solver_makeLimit__SWIG_3(this.swigCPtr, this, var1.toByteArray());
      return var2 == 0L ? null : new RegularLimit(var2, false);
   }

   public RegularLimitParameters makeDefaultRegularLimitParameters() {
      byte[] var1 = mainJNI.Solver_makeDefaultRegularLimitParameters(this.swigCPtr, this);
      if (var1 != null && var1.length != 0) {
         try {
            return RegularLimitParameters.parseFrom(var1);
         } catch (InvalidProtocolBufferException var3) {
            throw new RuntimeException("Unable to parse com.google.ortools.constraintsolver.RegularLimitParameters protocol message.");
         }
      } else {
         return null;
      }
   }

   public SearchLimit makeLimit(SearchLimit var1, SearchLimit var2) {
      long var3 = mainJNI.Solver_makeLimit__SWIG_4(this.swigCPtr, this, SearchLimit.getCPtr(var1), var1, SearchLimit.getCPtr(var2), var2);
      return var3 == 0L ? null : new SearchLimit(var3, false);
   }

   public SearchLimit makeCustomLimit(BooleanSupplier var1) {
      long var2 = mainJNI.Solver_makeCustomLimit(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new SearchLimit(var2, false);
   }

   public SearchMonitor makeSearchLog(int var1) {
      long var2 = mainJNI.Solver_makeSearchLog__SWIG_0(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new SearchMonitor(var2, false);
   }

   public SearchMonitor makeSearchLog(int var1, IntVar var2) {
      long var3 = mainJNI.Solver_makeSearchLog__SWIG_1(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new SearchMonitor(var3, false);
   }

   public SearchMonitor makeSearchLog(int var1, Supplier var2) {
      long var3 = mainJNI.Solver_makeSearchLog__SWIG_2(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new SearchMonitor(var3, false);
   }

   public SearchMonitor makeSearchLog(int var1, IntVar var2, Supplier var3) {
      long var4 = mainJNI.Solver_makeSearchLog__SWIG_3(this.swigCPtr, this, var1, IntVar.getCPtr(var2), var2, var3);
      return var4 == 0L ? null : new SearchMonitor(var4, false);
   }

   public SearchMonitor makeSearchLog(int var1, OptimizeVar var2) {
      long var3 = mainJNI.Solver_makeSearchLog__SWIG_4(this.swigCPtr, this, var1, OptimizeVar.getCPtr(var2), var2);
      return var3 == 0L ? null : new SearchMonitor(var3, false);
   }

   public SearchMonitor makeSearchLog(int var1, OptimizeVar var2, Supplier var3) {
      long var4 = mainJNI.Solver_makeSearchLog__SWIG_5(this.swigCPtr, this, var1, OptimizeVar.getCPtr(var2), var2, var3);
      return var4 == 0L ? null : new SearchMonitor(var4, false);
   }

   public SearchMonitor makeSearchTrace(String var1) {
      long var2 = mainJNI.Solver_makeSearchTrace(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new SearchMonitor(var2, false);
   }

   public SearchMonitor makeEnterSearchCallback(Runnable var1) {
      long var2 = mainJNI.Solver_makeEnterSearchCallback(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new SearchMonitor(var2, false);
   }

   public SearchMonitor makeExitSearchCallback(Runnable var1) {
      long var2 = mainJNI.Solver_makeExitSearchCallback(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new SearchMonitor(var2, false);
   }

   public SearchMonitor makeAtSolutionCallback(Runnable var1) {
      long var2 = mainJNI.Solver_makeAtSolutionCallback(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new SearchMonitor(var2, false);
   }

   public ModelVisitor makePrintModelVisitor() {
      long var1 = mainJNI.Solver_makePrintModelVisitor(this.swigCPtr, this);
      return var1 == 0L ? null : new ModelVisitor(var1, false);
   }

   public ModelVisitor makeStatisticsModelVisitor() {
      long var1 = mainJNI.Solver_makeStatisticsModelVisitor(this.swigCPtr, this);
      return var1 == 0L ? null : new ModelVisitor(var1, false);
   }

   public SearchMonitor makeSymmetryManager(SymmetryBreaker[] var1) {
      long var2 = mainJNI.Solver_makeSymmetryManager__SWIG_0(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new SearchMonitor(var2, false);
   }

   public SearchMonitor makeSymmetryManager(SymmetryBreaker var1) {
      long var2 = mainJNI.Solver_makeSymmetryManager__SWIG_1(this.swigCPtr, this, SymmetryBreaker.getCPtr(var1), var1);
      return var2 == 0L ? null : new SearchMonitor(var2, false);
   }

   public SearchMonitor makeSymmetryManager(SymmetryBreaker var1, SymmetryBreaker var2) {
      long var3 = mainJNI.Solver_makeSymmetryManager__SWIG_2(this.swigCPtr, this, SymmetryBreaker.getCPtr(var1), var1, SymmetryBreaker.getCPtr(var2), var2);
      return var3 == 0L ? null : new SearchMonitor(var3, false);
   }

   public SearchMonitor makeSymmetryManager(SymmetryBreaker var1, SymmetryBreaker var2, SymmetryBreaker var3) {
      long var4 = mainJNI.Solver_makeSymmetryManager__SWIG_3(this.swigCPtr, this, SymmetryBreaker.getCPtr(var1), var1, SymmetryBreaker.getCPtr(var2), var2, SymmetryBreaker.getCPtr(var3), var3);
      return var4 == 0L ? null : new SearchMonitor(var4, false);
   }

   public SearchMonitor makeSymmetryManager(SymmetryBreaker var1, SymmetryBreaker var2, SymmetryBreaker var3, SymmetryBreaker var4) {
      long var5 = mainJNI.Solver_makeSymmetryManager__SWIG_4(this.swigCPtr, this, SymmetryBreaker.getCPtr(var1), var1, SymmetryBreaker.getCPtr(var2), var2, SymmetryBreaker.getCPtr(var3), var3, SymmetryBreaker.getCPtr(var4), var4);
      return var5 == 0L ? null : new SearchMonitor(var5, false);
   }

   public Decision makeAssignVariableValue(IntVar var1, long var2) {
      long var4 = mainJNI.Solver_makeAssignVariableValue(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new Decision(var4, false);
   }

   public Decision makeVariableLessOrEqualValue(IntVar var1, long var2) {
      long var4 = mainJNI.Solver_makeVariableLessOrEqualValue(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new Decision(var4, false);
   }

   public Decision makeVariableGreaterOrEqualValue(IntVar var1, long var2) {
      long var4 = mainJNI.Solver_makeVariableGreaterOrEqualValue(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new Decision(var4, false);
   }

   public Decision makeSplitVariableDomain(IntVar var1, long var2, boolean var4) {
      long var5 = mainJNI.Solver_makeSplitVariableDomain(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var4);
      return var5 == 0L ? null : new Decision(var5, false);
   }

   public Decision makeAssignVariableValueOrFail(IntVar var1, long var2) {
      long var4 = mainJNI.Solver_makeAssignVariableValueOrFail(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new Decision(var4, false);
   }

   public Decision MakeAssignVariableValueOrDoNothing(IntVar var1, long var2) {
      long var4 = mainJNI.Solver_MakeAssignVariableValueOrDoNothing(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new Decision(var4, false);
   }

   public Decision makeAssignVariablesValues(IntVar[] var1, long[] var2) {
      long var3 = mainJNI.Solver_makeAssignVariablesValues(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Decision(var3, false);
   }

   public Decision makeFailDecision() {
      long var1 = mainJNI.Solver_makeFailDecision(this.swigCPtr, this);
      return var1 == 0L ? null : new Decision(var1, false);
   }

   public Decision makeDecision(Consumer var1, Consumer var2) {
      long var3 = mainJNI.Solver_makeDecision(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new Decision(var3, false);
   }

   public DecisionBuilder compose(DecisionBuilder var1, DecisionBuilder var2) {
      long var3 = mainJNI.Solver_compose__SWIG_0(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, DecisionBuilder.getCPtr(var2), var2);
      return var3 == 0L ? null : new DecisionBuilder(var3, false);
   }

   public DecisionBuilder compose(DecisionBuilder var1, DecisionBuilder var2, DecisionBuilder var3) {
      long var4 = mainJNI.Solver_compose__SWIG_1(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, DecisionBuilder.getCPtr(var2), var2, DecisionBuilder.getCPtr(var3), var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder compose(DecisionBuilder var1, DecisionBuilder var2, DecisionBuilder var3, DecisionBuilder var4) {
      long var5 = mainJNI.Solver_compose__SWIG_2(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, DecisionBuilder.getCPtr(var2), var2, DecisionBuilder.getCPtr(var3), var3, DecisionBuilder.getCPtr(var4), var4);
      return var5 == 0L ? null : new DecisionBuilder(var5, false);
   }

   public DecisionBuilder compose(DecisionBuilder[] var1) {
      long var2 = mainJNI.Solver_compose__SWIG_3(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new DecisionBuilder(var2, false);
   }

   public DecisionBuilder tryDecisions(DecisionBuilder var1, DecisionBuilder var2) {
      long var3 = mainJNI.Solver_tryDecisions__SWIG_0(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, DecisionBuilder.getCPtr(var2), var2);
      return var3 == 0L ? null : new DecisionBuilder(var3, false);
   }

   public DecisionBuilder tryDecisions(DecisionBuilder var1, DecisionBuilder var2, DecisionBuilder var3) {
      long var4 = mainJNI.Solver_tryDecisions__SWIG_1(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, DecisionBuilder.getCPtr(var2), var2, DecisionBuilder.getCPtr(var3), var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder tryDecisions(DecisionBuilder var1, DecisionBuilder var2, DecisionBuilder var3, DecisionBuilder var4) {
      long var5 = mainJNI.Solver_tryDecisions__SWIG_2(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, DecisionBuilder.getCPtr(var2), var2, DecisionBuilder.getCPtr(var3), var3, DecisionBuilder.getCPtr(var4), var4);
      return var5 == 0L ? null : new DecisionBuilder(var5, false);
   }

   public DecisionBuilder tryDecisions(DecisionBuilder[] var1) {
      long var2 = mainJNI.Solver_tryDecisions__SWIG_3(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new DecisionBuilder(var2, false);
   }

   public DecisionBuilder makePhase(IntVar[] var1, int var2, int var3) {
      long var4 = mainJNI.Solver_makePhase__SWIG_0(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder makePhase(IntVar[] var1, LongUnaryOperator var2, int var3) {
      long var4 = mainJNI.Solver_makePhase__SWIG_1(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder makePhase(IntVar[] var1, int var2, LongBinaryOperator var3) {
      long var4 = mainJNI.Solver_makePhase__SWIG_2(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder makePhase(IntVar[] var1, int var2, LongTernaryPredicate var3) {
      long var4 = mainJNI.Solver_makePhase__SWIG_3(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder makePhase(IntVar[] var1, LongUnaryOperator var2, LongBinaryOperator var3) {
      long var4 = mainJNI.Solver_makePhase__SWIG_4(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder makePhase(IntVar[] var1, int var2, LongBinaryOperator var3, LongUnaryOperator var4) {
      long var5 = mainJNI.Solver_makePhase__SWIG_5(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new DecisionBuilder(var5, false);
   }

   public DecisionBuilder makePhase(IntVar[] var1, LongUnaryOperator var2, LongBinaryOperator var3, LongUnaryOperator var4) {
      long var5 = mainJNI.Solver_makePhase__SWIG_6(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new DecisionBuilder(var5, false);
   }

   public DecisionBuilder makeDefaultPhase(IntVar[] var1) {
      long var2 = mainJNI.Solver_makeDefaultPhase__SWIG_0(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new DecisionBuilder(var2, false);
   }

   public DecisionBuilder makeDefaultPhase(IntVar[] var1, DefaultPhaseParameters var2) {
      long var3 = mainJNI.Solver_makeDefaultPhase__SWIG_1(this.swigCPtr, this, var1, DefaultPhaseParameters.getCPtr(var2), var2);
      return var3 == 0L ? null : new DecisionBuilder(var3, false);
   }

   public DecisionBuilder makePhase(IntVar var1, int var2, int var3) {
      long var4 = mainJNI.Solver_makePhase__SWIG_7(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder makePhase(IntVar var1, IntVar var2, int var3, int var4) {
      long var5 = mainJNI.Solver_makePhase__SWIG_8(this.swigCPtr, this, IntVar.getCPtr(var1), var1, IntVar.getCPtr(var2), var2, var3, var4);
      return var5 == 0L ? null : new DecisionBuilder(var5, false);
   }

   public DecisionBuilder makePhase(IntVar var1, IntVar var2, IntVar var3, int var4, int var5) {
      long var6 = mainJNI.Solver_makePhase__SWIG_9(this.swigCPtr, this, IntVar.getCPtr(var1), var1, IntVar.getCPtr(var2), var2, IntVar.getCPtr(var3), var3, var4, var5);
      return var6 == 0L ? null : new DecisionBuilder(var6, false);
   }

   public DecisionBuilder makePhase(IntVar var1, IntVar var2, IntVar var3, IntVar var4, int var5, int var6) {
      long var7 = mainJNI.Solver_makePhase__SWIG_10(this.swigCPtr, this, IntVar.getCPtr(var1), var1, IntVar.getCPtr(var2), var2, IntVar.getCPtr(var3), var3, IntVar.getCPtr(var4), var4, var5, var6);
      return var7 == 0L ? null : new DecisionBuilder(var7, false);
   }

   public Decision makeScheduleOrPostpone(IntervalVar var1, long var2, long[] var4) {
      long var5 = mainJNI.Solver_makeScheduleOrPostpone(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
      return var5 == 0L ? null : new Decision(var5, false);
   }

   public Decision makeScheduleOrExpedite(IntervalVar var1, long var2, long[] var4) {
      long var5 = mainJNI.Solver_makeScheduleOrExpedite(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
      return var5 == 0L ? null : new Decision(var5, false);
   }

   public Decision makeRankFirstInterval(SequenceVar var1, int var2) {
      long var3 = mainJNI.Solver_makeRankFirstInterval(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Decision(var3, false);
   }

   public Decision makeRankLastInterval(SequenceVar var1, int var2) {
      long var3 = mainJNI.Solver_makeRankLastInterval(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new Decision(var3, false);
   }

   public DecisionBuilder makePhase(IntVar[] var1, LongBinaryOperator var2, int var3) {
      long var4 = mainJNI.Solver_makePhase__SWIG_11(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder makePhase(IntVar[] var1, LongBinaryOperator var2, LongUnaryOperator var3, int var4) {
      long var5 = mainJNI.Solver_makePhase__SWIG_12(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new DecisionBuilder(var5, false);
   }

   public DecisionBuilder makePhase(IntervalVar[] var1, int var2) {
      long var3 = mainJNI.Solver_makePhase__SWIG_13(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new DecisionBuilder(var3, false);
   }

   public DecisionBuilder makePhase(SequenceVar[] var1, int var2) {
      long var3 = mainJNI.Solver_makePhase__SWIG_14(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new DecisionBuilder(var3, false);
   }

   public DecisionBuilder makeDecisionBuilderFromAssignment(Assignment var1, DecisionBuilder var2, IntVar[] var3) {
      long var4 = mainJNI.Solver_makeDecisionBuilderFromAssignment(this.swigCPtr, this, Assignment.getCPtr(var1), var1, DecisionBuilder.getCPtr(var2), var2, var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder makeConstraintAdder(Constraint var1) {
      long var2 = mainJNI.Solver_makeConstraintAdder(this.swigCPtr, this, Constraint.getCPtr(var1), var1);
      return var2 == 0L ? null : new DecisionBuilder(var2, false);
   }

   public DecisionBuilder makeSolveOnce(DecisionBuilder var1) {
      long var2 = mainJNI.Solver_makeSolveOnce__SWIG_0(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1);
      return var2 == 0L ? null : new DecisionBuilder(var2, false);
   }

   public DecisionBuilder makeSolveOnce(DecisionBuilder var1, SearchMonitor var2) {
      long var3 = mainJNI.Solver_makeSolveOnce__SWIG_1(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2);
      return var3 == 0L ? null : new DecisionBuilder(var3, false);
   }

   public DecisionBuilder makeSolveOnce(DecisionBuilder var1, SearchMonitor var2, SearchMonitor var3) {
      long var4 = mainJNI.Solver_makeSolveOnce__SWIG_2(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2, SearchMonitor.getCPtr(var3), var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder makeSolveOnce(DecisionBuilder var1, SearchMonitor var2, SearchMonitor var3, SearchMonitor var4) {
      long var5 = mainJNI.Solver_makeSolveOnce__SWIG_3(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2, SearchMonitor.getCPtr(var3), var3, SearchMonitor.getCPtr(var4), var4);
      return var5 == 0L ? null : new DecisionBuilder(var5, false);
   }

   public DecisionBuilder makeSolveOnce(DecisionBuilder var1, SearchMonitor var2, SearchMonitor var3, SearchMonitor var4, SearchMonitor var5) {
      long var6 = mainJNI.Solver_makeSolveOnce__SWIG_4(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, SearchMonitor.getCPtr(var2), var2, SearchMonitor.getCPtr(var3), var3, SearchMonitor.getCPtr(var4), var4, SearchMonitor.getCPtr(var5), var5);
      return var6 == 0L ? null : new DecisionBuilder(var6, false);
   }

   public DecisionBuilder makeSolveOnce(DecisionBuilder var1, SearchMonitor[] var2) {
      long var3 = mainJNI.Solver_makeSolveOnce__SWIG_5(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new DecisionBuilder(var3, false);
   }

   public DecisionBuilder makeNestedOptimize(DecisionBuilder var1, Assignment var2, boolean var3, long var4) {
      long var6 = mainJNI.Solver_makeNestedOptimize__SWIG_0(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, Assignment.getCPtr(var2), var2, var3, var4);
      return var6 == 0L ? null : new DecisionBuilder(var6, false);
   }

   public DecisionBuilder makeNestedOptimize(DecisionBuilder var1, Assignment var2, boolean var3, long var4, SearchMonitor var6) {
      long var7 = mainJNI.Solver_makeNestedOptimize__SWIG_1(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, Assignment.getCPtr(var2), var2, var3, var4, SearchMonitor.getCPtr(var6), var6);
      return var7 == 0L ? null : new DecisionBuilder(var7, false);
   }

   public DecisionBuilder makeNestedOptimize(DecisionBuilder var1, Assignment var2, boolean var3, long var4, SearchMonitor var6, SearchMonitor var7) {
      long var8 = mainJNI.Solver_makeNestedOptimize__SWIG_2(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, Assignment.getCPtr(var2), var2, var3, var4, SearchMonitor.getCPtr(var6), var6, SearchMonitor.getCPtr(var7), var7);
      return var8 == 0L ? null : new DecisionBuilder(var8, false);
   }

   public DecisionBuilder makeNestedOptimize(DecisionBuilder var1, Assignment var2, boolean var3, long var4, SearchMonitor var6, SearchMonitor var7, SearchMonitor var8) {
      long var9 = mainJNI.Solver_makeNestedOptimize__SWIG_3(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, Assignment.getCPtr(var2), var2, var3, var4, SearchMonitor.getCPtr(var6), var6, SearchMonitor.getCPtr(var7), var7, SearchMonitor.getCPtr(var8), var8);
      return var9 == 0L ? null : new DecisionBuilder(var9, false);
   }

   public DecisionBuilder makeNestedOptimize(DecisionBuilder var1, Assignment var2, boolean var3, long var4, SearchMonitor var6, SearchMonitor var7, SearchMonitor var8, SearchMonitor var9) {
      long var10 = mainJNI.Solver_makeNestedOptimize__SWIG_4(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, Assignment.getCPtr(var2), var2, var3, var4, SearchMonitor.getCPtr(var6), var6, SearchMonitor.getCPtr(var7), var7, SearchMonitor.getCPtr(var8), var8, SearchMonitor.getCPtr(var9), var9);
      return var10 == 0L ? null : new DecisionBuilder(var10, false);
   }

   public DecisionBuilder makeNestedOptimize(DecisionBuilder var1, Assignment var2, boolean var3, long var4, SearchMonitor[] var6) {
      long var7 = mainJNI.Solver_makeNestedOptimize__SWIG_5(this.swigCPtr, this, DecisionBuilder.getCPtr(var1), var1, Assignment.getCPtr(var2), var2, var3, var4, var6);
      return var7 == 0L ? null : new DecisionBuilder(var7, false);
   }

   public DecisionBuilder makeRestoreAssignment(Assignment var1) {
      long var2 = mainJNI.Solver_makeRestoreAssignment(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      return var2 == 0L ? null : new DecisionBuilder(var2, false);
   }

   public DecisionBuilder makeStoreAssignment(Assignment var1) {
      long var2 = mainJNI.Solver_makeStoreAssignment(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      return var2 == 0L ? null : new DecisionBuilder(var2, false);
   }

   public LocalSearchOperator makeOperator(IntVar[] var1, int var2) {
      long var3 = mainJNI.Solver_makeOperator__SWIG_0(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new LocalSearchOperator(var3, false);
   }

   public LocalSearchOperator makeOperator(IntVar[] var1, IntVar[] var2, int var3) {
      long var4 = mainJNI.Solver_makeOperator__SWIG_1(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new LocalSearchOperator(var4, false);
   }

   public LocalSearchOperator makeOperator(IntVar[] var1, LongTernaryOperator var2, int var3) {
      long var4 = mainJNI.Solver_makeOperator__SWIG_2(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new LocalSearchOperator(var4, false);
   }

   public LocalSearchOperator makeOperator(IntVar[] var1, IntVar[] var2, LongTernaryOperator var3, int var4) {
      long var5 = mainJNI.Solver_makeOperator__SWIG_3(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new LocalSearchOperator(var5, false);
   }

   public LocalSearchOperator makeRandomLnsOperator(IntVar[] var1, int var2) {
      long var3 = mainJNI.Solver_makeRandomLnsOperator__SWIG_0(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new LocalSearchOperator(var3, false);
   }

   public LocalSearchOperator makeRandomLnsOperator(IntVar[] var1, int var2, int var3) {
      long var4 = mainJNI.Solver_makeRandomLnsOperator__SWIG_1(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new LocalSearchOperator(var4, false);
   }

   public LocalSearchOperator makeMoveTowardTargetOperator(Assignment var1) {
      long var2 = mainJNI.Solver_makeMoveTowardTargetOperator__SWIG_0(this.swigCPtr, this, Assignment.getCPtr(var1), var1);
      return var2 == 0L ? null : new LocalSearchOperator(var2, false);
   }

   public LocalSearchOperator makeMoveTowardTargetOperator(IntVar[] var1, long[] var2) {
      long var3 = mainJNI.Solver_makeMoveTowardTargetOperator__SWIG_1(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new LocalSearchOperator(var3, false);
   }

   public LocalSearchOperator concatenateOperators(LocalSearchOperator[] var1) {
      long var2 = mainJNI.Solver_concatenateOperators__SWIG_0(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new LocalSearchOperator(var2, false);
   }

   public LocalSearchOperator concatenateOperators(LocalSearchOperator[] var1, boolean var2) {
      long var3 = mainJNI.Solver_concatenateOperators__SWIG_1(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new LocalSearchOperator(var3, false);
   }

   public LocalSearchOperator concatenateOperators(LocalSearchOperator[] var1, IntIntToLongFunction var2) {
      long var3 = mainJNI.Solver_concatenateOperators__SWIG_2(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new LocalSearchOperator(var3, false);
   }

   public LocalSearchOperator randomConcatenateOperators(LocalSearchOperator[] var1) {
      long var2 = mainJNI.Solver_randomConcatenateOperators__SWIG_0(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new LocalSearchOperator(var2, false);
   }

   public LocalSearchOperator randomConcatenateOperators(LocalSearchOperator[] var1, int var2) {
      long var3 = mainJNI.Solver_randomConcatenateOperators__SWIG_1(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new LocalSearchOperator(var3, false);
   }

   public LocalSearchOperator makeNeighborhoodLimit(LocalSearchOperator var1, long var2) {
      long var4 = mainJNI.Solver_makeNeighborhoodLimit(this.swigCPtr, this, LocalSearchOperator.getCPtr(var1), var1, var2);
      return var4 == 0L ? null : new LocalSearchOperator(var4, false);
   }

   public DecisionBuilder makeLocalSearchPhase(Assignment var1, LocalSearchPhaseParameters var2) {
      long var3 = mainJNI.Solver_makeLocalSearchPhase__SWIG_0(this.swigCPtr, this, Assignment.getCPtr(var1), var1, LocalSearchPhaseParameters.getCPtr(var2), var2);
      return var3 == 0L ? null : new DecisionBuilder(var3, false);
   }

   public DecisionBuilder makeLocalSearchPhase(IntVar[] var1, DecisionBuilder var2, LocalSearchPhaseParameters var3) {
      long var4 = mainJNI.Solver_makeLocalSearchPhase__SWIG_1(this.swigCPtr, this, var1, DecisionBuilder.getCPtr(var2), var2, LocalSearchPhaseParameters.getCPtr(var3), var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public DecisionBuilder makeLocalSearchPhase(IntVar[] var1, DecisionBuilder var2, DecisionBuilder var3, LocalSearchPhaseParameters var4) {
      long var5 = mainJNI.Solver_makeLocalSearchPhase__SWIG_2(this.swigCPtr, this, var1, DecisionBuilder.getCPtr(var2), var2, DecisionBuilder.getCPtr(var3), var3, LocalSearchPhaseParameters.getCPtr(var4), var4);
      return var5 == 0L ? null : new DecisionBuilder(var5, false);
   }

   public DecisionBuilder makeLocalSearchPhase(SequenceVar[] var1, DecisionBuilder var2, LocalSearchPhaseParameters var3) {
      long var4 = mainJNI.Solver_makeLocalSearchPhase__SWIG_3(this.swigCPtr, this, var1, DecisionBuilder.getCPtr(var2), var2, LocalSearchPhaseParameters.getCPtr(var3), var3);
      return var4 == 0L ? null : new DecisionBuilder(var4, false);
   }

   public SolutionPool makeDefaultSolutionPool() {
      long var1 = mainJNI.Solver_makeDefaultSolutionPool(this.swigCPtr, this);
      return var1 == 0L ? null : new SolutionPool(var1, false);
   }

   public LocalSearchPhaseParameters makeLocalSearchPhaseParameters(IntVar var1, LocalSearchOperator var2, DecisionBuilder var3) {
      long var4 = mainJNI.Solver_makeLocalSearchPhaseParameters__SWIG_0(this.swigCPtr, this, IntVar.getCPtr(var1), var1, LocalSearchOperator.getCPtr(var2), var2, DecisionBuilder.getCPtr(var3), var3);
      return var4 == 0L ? null : new LocalSearchPhaseParameters(var4, false);
   }

   public LocalSearchPhaseParameters makeLocalSearchPhaseParameters(IntVar var1, LocalSearchOperator var2, DecisionBuilder var3, RegularLimit var4) {
      long var5 = mainJNI.Solver_makeLocalSearchPhaseParameters__SWIG_1(this.swigCPtr, this, IntVar.getCPtr(var1), var1, LocalSearchOperator.getCPtr(var2), var2, DecisionBuilder.getCPtr(var3), var3, RegularLimit.getCPtr(var4), var4);
      return var5 == 0L ? null : new LocalSearchPhaseParameters(var5, false);
   }

   public LocalSearchPhaseParameters makeLocalSearchPhaseParameters(IntVar var1, LocalSearchOperator var2, DecisionBuilder var3, RegularLimit var4, LocalSearchFilter[] var5) {
      long var6 = mainJNI.Solver_makeLocalSearchPhaseParameters__SWIG_2(this.swigCPtr, this, IntVar.getCPtr(var1), var1, LocalSearchOperator.getCPtr(var2), var2, DecisionBuilder.getCPtr(var3), var3, RegularLimit.getCPtr(var4), var4, var5);
      return var6 == 0L ? null : new LocalSearchPhaseParameters(var6, false);
   }

   public LocalSearchPhaseParameters makeLocalSearchPhaseParameters(IntVar var1, SolutionPool var2, LocalSearchOperator var3, DecisionBuilder var4) {
      long var5 = mainJNI.Solver_makeLocalSearchPhaseParameters__SWIG_3(this.swigCPtr, this, IntVar.getCPtr(var1), var1, SolutionPool.getCPtr(var2), var2, LocalSearchOperator.getCPtr(var3), var3, DecisionBuilder.getCPtr(var4), var4);
      return var5 == 0L ? null : new LocalSearchPhaseParameters(var5, false);
   }

   public LocalSearchPhaseParameters makeLocalSearchPhaseParameters(IntVar var1, SolutionPool var2, LocalSearchOperator var3, DecisionBuilder var4, RegularLimit var5) {
      long var6 = mainJNI.Solver_makeLocalSearchPhaseParameters__SWIG_4(this.swigCPtr, this, IntVar.getCPtr(var1), var1, SolutionPool.getCPtr(var2), var2, LocalSearchOperator.getCPtr(var3), var3, DecisionBuilder.getCPtr(var4), var4, RegularLimit.getCPtr(var5), var5);
      return var6 == 0L ? null : new LocalSearchPhaseParameters(var6, false);
   }

   public LocalSearchPhaseParameters makeLocalSearchPhaseParameters(IntVar var1, SolutionPool var2, LocalSearchOperator var3, DecisionBuilder var4, RegularLimit var5, LocalSearchFilter[] var6) {
      long var7 = mainJNI.Solver_makeLocalSearchPhaseParameters__SWIG_5(this.swigCPtr, this, IntVar.getCPtr(var1), var1, SolutionPool.getCPtr(var2), var2, LocalSearchOperator.getCPtr(var3), var3, DecisionBuilder.getCPtr(var4), var4, RegularLimit.getCPtr(var5), var5, var6);
      return var7 == 0L ? null : new LocalSearchPhaseParameters(var7, false);
   }

   public LocalSearchFilter MakeAcceptFilter() {
      long var1 = mainJNI.Solver_MakeAcceptFilter(this.swigCPtr, this);
      return var1 == 0L ? null : new LocalSearchFilter(var1, false);
   }

   public LocalSearchFilter MakeRejectFilter() {
      long var1 = mainJNI.Solver_MakeRejectFilter(this.swigCPtr, this);
      return var1 == 0L ? null : new LocalSearchFilter(var1, false);
   }

   public LocalSearchFilter makeVariableDomainFilter() {
      long var1 = mainJNI.Solver_makeVariableDomainFilter(this.swigCPtr, this);
      return var1 == 0L ? null : new LocalSearchFilter(var1, false);
   }

   public IntVarLocalSearchFilter makeSumObjectiveFilter(IntVar[] var1, LongBinaryOperator var2, int var3) {
      long var4 = mainJNI.Solver_makeSumObjectiveFilter__SWIG_0(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new IntVarLocalSearchFilter(var4, false);
   }

   public IntVarLocalSearchFilter makeSumObjectiveFilter(IntVar[] var1, IntVar[] var2, LongTernaryOperator var3, int var4) {
      long var5 = mainJNI.Solver_makeSumObjectiveFilter__SWIG_1(this.swigCPtr, this, var1, var2, var3, var4);
      return var5 == 0L ? null : new IntVarLocalSearchFilter(var5, false);
   }

   public void topPeriodicCheck() {
      mainJNI.Solver_topPeriodicCheck(this.swigCPtr, this);
   }

   public int topProgressPercent() {
      return mainJNI.Solver_topProgressPercent(this.swigCPtr, this);
   }

   public void pushState() {
      mainJNI.Solver_pushState(this.swigCPtr, this);
   }

   public void popState() {
      mainJNI.Solver_popState(this.swigCPtr, this);
   }

   public int searchDepth() {
      return mainJNI.Solver_searchDepth(this.swigCPtr, this);
   }

   public int searchLeftDepth() {
      return mainJNI.Solver_searchLeftDepth(this.swigCPtr, this);
   }

   public int solveDepth() {
      return mainJNI.Solver_solveDepth(this.swigCPtr, this);
   }

   public long rand64(long var1) {
      return mainJNI.Solver_rand64(this.swigCPtr, this, var1);
   }

   public int rand32(int var1) {
      return mainJNI.Solver_rand32(this.swigCPtr, this, var1);
   }

   public void reSeed(int var1) {
      mainJNI.Solver_reSeed(this.swigCPtr, this, var1);
   }

   public void exportProfilingOverview(String var1) {
      mainJNI.Solver_exportProfilingOverview(this.swigCPtr, this, var1);
   }

   public String localSearchProfile() {
      return mainJNI.Solver_localSearchProfile(this.swigCPtr, this);
   }

   public boolean currentlyInSolve() {
      return mainJNI.Solver_currentlyInSolve(this.swigCPtr, this);
   }

   public int constraints() {
      return mainJNI.Solver_constraints(this.swigCPtr, this);
   }

   public void accept(ModelVisitor var1) {
      mainJNI.Solver_accept(this.swigCPtr, this, ModelVisitor.getCPtr(var1), var1);
   }

   public Decision balancing_decision() {
      long var1 = mainJNI.Solver_balancing_decision(this.swigCPtr, this);
      return var1 == 0L ? null : new Decision(var1, false);
   }

   public void clear_fail_intercept() {
      mainJNI.Solver_clear_fail_intercept(this.swigCPtr, this);
   }

   public void SetUseFastLocalSearch(boolean var1) {
      mainJNI.Solver_SetUseFastLocalSearch(this.swigCPtr, this, var1);
   }

   public boolean UseFastLocalSearch() {
      return mainJNI.Solver_UseFastLocalSearch(this.swigCPtr, this);
   }

   public boolean hasName(PropagationBaseObject var1) {
      return mainJNI.Solver_hasName(this.swigCPtr, this, PropagationBaseObject.getCPtr(var1), var1);
   }

   public Demon registerDemon(Demon var1) {
      long var2 = mainJNI.Solver_registerDemon(this.swigCPtr, this, Demon.getCPtr(var1), var1);
      return var2 == 0L ? null : new Demon(var2, false);
   }

   public IntExpr registerIntExpr(IntExpr var1) {
      long var2 = mainJNI.Solver_registerIntExpr(this.swigCPtr, this, IntExpr.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntExpr(var2, false);
   }

   public IntVar registerIntVar(IntVar var1) {
      long var2 = mainJNI.Solver_registerIntVar(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntVar(var2, false);
   }

   public IntervalVar registerIntervalVar(IntervalVar var1) {
      long var2 = mainJNI.Solver_registerIntervalVar(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntervalVar(var2, false);
   }

   public ModelCache cache() {
      long var1 = mainJNI.Solver_cache(this.swigCPtr, this);
      return var1 == 0L ? null : new ModelCache(var1, false);
   }

   public boolean instrumentsDemons() {
      return mainJNI.Solver_instrumentsDemons(this.swigCPtr, this);
   }

   public boolean isProfilingEnabled() {
      return mainJNI.Solver_isProfilingEnabled(this.swigCPtr, this);
   }

   public boolean isLocalSearchProfilingEnabled() {
      return mainJNI.Solver_isLocalSearchProfilingEnabled(this.swigCPtr, this);
   }

   public boolean instrumentsVariables() {
      return mainJNI.Solver_instrumentsVariables(this.swigCPtr, this);
   }

   public boolean nameAllVariables() {
      return mainJNI.Solver_nameAllVariables(this.swigCPtr, this);
   }

   public String model_name() {
      return mainJNI.Solver_model_name(this.swigCPtr, this);
   }

   public PropagationMonitor getPropagationMonitor() {
      long var1 = mainJNI.Solver_getPropagationMonitor(this.swigCPtr, this);
      return var1 == 0L ? null : new PropagationMonitor(var1, false);
   }

   public void addPropagationMonitor(PropagationMonitor var1) {
      mainJNI.Solver_addPropagationMonitor(this.swigCPtr, this, PropagationMonitor.getCPtr(var1), var1);
   }

   public LocalSearchMonitor getLocalSearchMonitor() {
      long var1 = mainJNI.Solver_getLocalSearchMonitor(this.swigCPtr, this);
      return var1 == 0L ? null : new LocalSearchMonitor(var1, false);
   }

   public void addLocalSearchMonitor(LocalSearchMonitor var1) {
      mainJNI.Solver_addLocalSearchMonitor(this.swigCPtr, this, LocalSearchMonitor.getCPtr(var1), var1);
   }

   public Assignment GetOrCreateLocalSearchState() {
      long var1 = mainJNI.Solver_GetOrCreateLocalSearchState(this.swigCPtr, this);
      return var1 == 0L ? null : new Assignment(var1, false);
   }

   public void ClearLocalSearchState() {
      mainJNI.Solver_ClearLocalSearchState(this.swigCPtr, this);
   }

   public void setTmp_vector_(long[] var1) {
      mainJNI.Solver_tmp_vector__set(this.swigCPtr, this, var1);
   }

   public long[] getTmp_vector_() {
      return mainJNI.Solver_tmp_vector__get(this.swigCPtr, this);
   }

   public IntExpr castExpression(IntVar var1) {
      long var2 = mainJNI.Solver_castExpression(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntExpr(var2, false);
   }

   public void finishCurrentSearch() {
      mainJNI.Solver_finishCurrentSearch(this.swigCPtr, this);
   }

   public void restartCurrentSearch() {
      mainJNI.Solver_restartCurrentSearch(this.swigCPtr, this);
   }

   public void shouldFail() {
      mainJNI.Solver_shouldFail(this.swigCPtr, this);
   }

   public void checkFail() {
      mainJNI.Solver_checkFail(this.swigCPtr, this);
   }

   public static class IntegerCastInfo {
      private transient long swigCPtr;
      protected transient boolean swigCMemOwn;

      protected IntegerCastInfo(long var1, boolean var3) {
         this.swigCMemOwn = var3;
         this.swigCPtr = var1;
      }

      protected static long getCPtr(Solver.IntegerCastInfo var0) {
         return var0 == null ? 0L : var0.swigCPtr;
      }

      protected void finalize() {
         this.delete();
      }

      public synchronized void delete() {
         if (this.swigCPtr != 0L) {
            if (this.swigCMemOwn) {
               this.swigCMemOwn = false;
               mainJNI.delete_Solver_IntegerCastInfo(this.swigCPtr);
            }

            this.swigCPtr = 0L;
         }

      }

      public IntegerCastInfo() {
         this(mainJNI.new_Solver_IntegerCastInfo__SWIG_0(), true);
      }

      public IntegerCastInfo(IntVar var1, IntExpr var2, Constraint var3) {
         this(mainJNI.new_Solver_IntegerCastInfo__SWIG_1(IntVar.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, Constraint.getCPtr(var3), var3), true);
      }

      public void setVariable(IntVar var1) {
         mainJNI.Solver_IntegerCastInfo_variable_set(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
      }

      public IntVar getVariable() {
         long var1 = mainJNI.Solver_IntegerCastInfo_variable_get(this.swigCPtr, this);
         return var1 == 0L ? null : new IntVar(var1, false);
      }

      public void setExpression(IntExpr var1) {
         mainJNI.Solver_IntegerCastInfo_expression_set(this.swigCPtr, this, IntExpr.getCPtr(var1), var1);
      }

      public IntExpr getExpression() {
         long var1 = mainJNI.Solver_IntegerCastInfo_expression_get(this.swigCPtr, this);
         return var1 == 0L ? null : new IntExpr(var1, false);
      }

      public void setMaintainer(Constraint var1) {
         mainJNI.Solver_IntegerCastInfo_maintainer_set(this.swigCPtr, this, Constraint.getCPtr(var1), var1);
      }

      public Constraint getMaintainer() {
         long var1 = mainJNI.Solver_IntegerCastInfo_maintainer_get(this.swigCPtr, this);
         return var1 == 0L ? null : new Constraint(var1, false);
      }
   }

   public static class FailException extends Exception {
      public FailException() {
      }

      public FailException(String var1) {
         super(var1);
      }
   }
}
