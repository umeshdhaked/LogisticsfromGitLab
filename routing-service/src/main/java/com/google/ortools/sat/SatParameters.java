package com.google.ortools.sat;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.ListAdapter;
import com.google.protobuf.Internal.ListAdapter.Converter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class SatParameters extends GeneratedMessageV3 implements SatParametersOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int bitField1_;
   private int bitField2_;
   private int bitField3_;
   public static final int PREFERRED_VARIABLE_ORDER_FIELD_NUMBER = 1;
   private int preferredVariableOrder_;
   public static final int INITIAL_POLARITY_FIELD_NUMBER = 2;
   private int initialPolarity_;
   public static final int USE_PHASE_SAVING_FIELD_NUMBER = 44;
   private boolean usePhaseSaving_;
   public static final int RANDOM_POLARITY_RATIO_FIELD_NUMBER = 45;
   private double randomPolarityRatio_;
   public static final int RANDOM_BRANCHES_RATIO_FIELD_NUMBER = 32;
   private double randomBranchesRatio_;
   public static final int USE_ERWA_HEURISTIC_FIELD_NUMBER = 75;
   private boolean useErwaHeuristic_;
   public static final int INITIAL_VARIABLES_ACTIVITY_FIELD_NUMBER = 76;
   private double initialVariablesActivity_;
   public static final int ALSO_BUMP_VARIABLES_IN_CONFLICT_REASONS_FIELD_NUMBER = 77;
   private boolean alsoBumpVariablesInConflictReasons_;
   public static final int MINIMIZATION_ALGORITHM_FIELD_NUMBER = 4;
   private int minimizationAlgorithm_;
   public static final int BINARY_MINIMIZATION_ALGORITHM_FIELD_NUMBER = 34;
   private int binaryMinimizationAlgorithm_;
   public static final int SUBSUMPTION_DURING_CONFLICT_ANALYSIS_FIELD_NUMBER = 56;
   private boolean subsumptionDuringConflictAnalysis_;
   public static final int CLAUSE_CLEANUP_PERIOD_FIELD_NUMBER = 11;
   private int clauseCleanupPeriod_;
   public static final int CLAUSE_CLEANUP_TARGET_FIELD_NUMBER = 13;
   private int clauseCleanupTarget_;
   public static final int CLAUSE_CLEANUP_PROTECTION_FIELD_NUMBER = 58;
   private int clauseCleanupProtection_;
   public static final int CLAUSE_CLEANUP_LBD_BOUND_FIELD_NUMBER = 59;
   private int clauseCleanupLbdBound_;
   public static final int CLAUSE_CLEANUP_ORDERING_FIELD_NUMBER = 60;
   private int clauseCleanupOrdering_;
   public static final int PB_CLEANUP_INCREMENT_FIELD_NUMBER = 46;
   private int pbCleanupIncrement_;
   public static final int PB_CLEANUP_RATIO_FIELD_NUMBER = 47;
   private double pbCleanupRatio_;
   public static final int MINIMIZE_WITH_PROPAGATION_RESTART_PERIOD_FIELD_NUMBER = 96;
   private int minimizeWithPropagationRestartPeriod_;
   public static final int MINIMIZE_WITH_PROPAGATION_NUM_DECISIONS_FIELD_NUMBER = 97;
   private int minimizeWithPropagationNumDecisions_;
   public static final int VARIABLE_ACTIVITY_DECAY_FIELD_NUMBER = 15;
   private double variableActivityDecay_;
   public static final int MAX_VARIABLE_ACTIVITY_VALUE_FIELD_NUMBER = 16;
   private double maxVariableActivityValue_;
   public static final int GLUCOSE_MAX_DECAY_FIELD_NUMBER = 22;
   private double glucoseMaxDecay_;
   public static final int GLUCOSE_DECAY_INCREMENT_FIELD_NUMBER = 23;
   private double glucoseDecayIncrement_;
   public static final int GLUCOSE_DECAY_INCREMENT_PERIOD_FIELD_NUMBER = 24;
   private int glucoseDecayIncrementPeriod_;
   public static final int CLAUSE_ACTIVITY_DECAY_FIELD_NUMBER = 17;
   private double clauseActivityDecay_;
   public static final int MAX_CLAUSE_ACTIVITY_VALUE_FIELD_NUMBER = 18;
   private double maxClauseActivityValue_;
   public static final int RESTART_ALGORITHMS_FIELD_NUMBER = 61;
   private List restartAlgorithms_;
   private static final Converter restartAlgorithms_converter_ = new Converter() {
      @Override
      public Object convert(Object var1) {
         return null;
      }

      public SatParameters.RestartAlgorithm convert(Integer var1) {
         SatParameters.RestartAlgorithm var2 = SatParameters.RestartAlgorithm.valueOf(var1);
         return var2 == null ? SatParameters.RestartAlgorithm.NO_RESTART : var2;
      }
   };
   public static final int DEFAULT_RESTART_ALGORITHMS_FIELD_NUMBER = 70;
   private volatile Object defaultRestartAlgorithms_;
   public static final int RESTART_PERIOD_FIELD_NUMBER = 30;
   private int restartPeriod_;
   public static final int RESTART_RUNNING_WINDOW_SIZE_FIELD_NUMBER = 62;
   private int restartRunningWindowSize_;
   public static final int RESTART_DL_AVERAGE_RATIO_FIELD_NUMBER = 63;
   private double restartDlAverageRatio_;
   public static final int RESTART_LBD_AVERAGE_RATIO_FIELD_NUMBER = 71;
   private double restartLbdAverageRatio_;
   public static final int USE_BLOCKING_RESTART_FIELD_NUMBER = 64;
   private boolean useBlockingRestart_;
   public static final int BLOCKING_RESTART_WINDOW_SIZE_FIELD_NUMBER = 65;
   private int blockingRestartWindowSize_;
   public static final int BLOCKING_RESTART_MULTIPLIER_FIELD_NUMBER = 66;
   private double blockingRestartMultiplier_;
   public static final int NUM_CONFLICTS_BEFORE_STRATEGY_CHANGES_FIELD_NUMBER = 68;
   private int numConflictsBeforeStrategyChanges_;
   public static final int STRATEGY_CHANGE_INCREASE_RATIO_FIELD_NUMBER = 69;
   private double strategyChangeIncreaseRatio_;
   public static final int MAX_TIME_IN_SECONDS_FIELD_NUMBER = 36;
   private double maxTimeInSeconds_;
   public static final int MAX_DETERMINISTIC_TIME_FIELD_NUMBER = 67;
   private double maxDeterministicTime_;
   public static final int MAX_NUMBER_OF_CONFLICTS_FIELD_NUMBER = 37;
   private long maxNumberOfConflicts_;
   public static final int MAX_MEMORY_IN_MB_FIELD_NUMBER = 40;
   private long maxMemoryInMb_;
   public static final int TREAT_BINARY_CLAUSES_SEPARATELY_FIELD_NUMBER = 33;
   private boolean treatBinaryClausesSeparately_;
   public static final int RANDOM_SEED_FIELD_NUMBER = 31;
   private int randomSeed_;
   public static final int LOG_SEARCH_PROGRESS_FIELD_NUMBER = 41;
   private boolean logSearchProgress_;
   public static final int USE_PB_RESOLUTION_FIELD_NUMBER = 43;
   private boolean usePbResolution_;
   public static final int MINIMIZE_REDUCTION_DURING_PB_RESOLUTION_FIELD_NUMBER = 48;
   private boolean minimizeReductionDuringPbResolution_;
   public static final int COUNT_ASSUMPTION_LEVELS_IN_LBD_FIELD_NUMBER = 49;
   private boolean countAssumptionLevelsInLbd_;
   public static final int PRESOLVE_BVE_THRESHOLD_FIELD_NUMBER = 54;
   private int presolveBveThreshold_;
   public static final int PRESOLVE_BVE_CLAUSE_WEIGHT_FIELD_NUMBER = 55;
   private int presolveBveClauseWeight_;
   public static final int PRESOLVE_PROBING_DETERMINISTIC_TIME_LIMIT_FIELD_NUMBER = 57;
   private double presolveProbingDeterministicTimeLimit_;
   public static final int PRESOLVE_BLOCKED_CLAUSE_FIELD_NUMBER = 88;
   private boolean presolveBlockedClause_;
   public static final int PRESOLVE_USE_BVA_FIELD_NUMBER = 72;
   private boolean presolveUseBva_;
   public static final int PRESOLVE_BVA_THRESHOLD_FIELD_NUMBER = 73;
   private int presolveBvaThreshold_;
   public static final int MAX_PRESOLVE_ITERATIONS_FIELD_NUMBER = 138;
   private int maxPresolveIterations_;
   public static final int CP_MODEL_PRESOLVE_FIELD_NUMBER = 86;
   private boolean cpModelPresolve_;
   public static final int CP_MODEL_PROBING_LEVEL_FIELD_NUMBER = 110;
   private int cpModelProbingLevel_;
   public static final int CP_MODEL_USE_SAT_PRESOLVE_FIELD_NUMBER = 93;
   private boolean cpModelUseSatPresolve_;
   public static final int EXPAND_ELEMENT_CONSTRAINTS_FIELD_NUMBER = 140;
   private boolean expandElementConstraints_;
   public static final int EXPAND_AUTOMATON_CONSTRAINTS_FIELD_NUMBER = 143;
   private boolean expandAutomatonConstraints_;
   public static final int MERGE_NO_OVERLAP_WORK_LIMIT_FIELD_NUMBER = 145;
   private double mergeNoOverlapWorkLimit_;
   public static final int MERGE_AT_MOST_ONE_WORK_LIMIT_FIELD_NUMBER = 146;
   private double mergeAtMostOneWorkLimit_;
   public static final int PRESOLVE_SUBSTITUTION_LEVEL_FIELD_NUMBER = 147;
   private int presolveSubstitutionLevel_;
   public static final int USE_OPTIMIZATION_HINTS_FIELD_NUMBER = 35;
   private boolean useOptimizationHints_;
   public static final int MINIMIZE_CORE_FIELD_NUMBER = 50;
   private boolean minimizeCore_;
   public static final int FIND_MULTIPLE_CORES_FIELD_NUMBER = 84;
   private boolean findMultipleCores_;
   public static final int COVER_OPTIMIZATION_FIELD_NUMBER = 89;
   private boolean coverOptimization_;
   public static final int MAX_SAT_ASSUMPTION_ORDER_FIELD_NUMBER = 51;
   private int maxSatAssumptionOrder_;
   public static final int MAX_SAT_REVERSE_ASSUMPTION_ORDER_FIELD_NUMBER = 52;
   private boolean maxSatReverseAssumptionOrder_;
   public static final int MAX_SAT_STRATIFICATION_FIELD_NUMBER = 53;
   private int maxSatStratification_;
   public static final int USE_PRECEDENCES_IN_DISJUNCTIVE_CONSTRAINT_FIELD_NUMBER = 74;
   private boolean usePrecedencesInDisjunctiveConstraint_;
   public static final int USE_OVERLOAD_CHECKER_IN_CUMULATIVE_CONSTRAINT_FIELD_NUMBER = 78;
   private boolean useOverloadCheckerInCumulativeConstraint_;
   public static final int USE_TIMETABLE_EDGE_FINDING_IN_CUMULATIVE_CONSTRAINT_FIELD_NUMBER = 79;
   private boolean useTimetableEdgeFindingInCumulativeConstraint_;
   public static final int USE_DISJUNCTIVE_CONSTRAINT_IN_CUMULATIVE_CONSTRAINT_FIELD_NUMBER = 80;
   private boolean useDisjunctiveConstraintInCumulativeConstraint_;
   public static final int LINEARIZATION_LEVEL_FIELD_NUMBER = 90;
   private int linearizationLevel_;
   public static final int BOOLEAN_ENCODING_LEVEL_FIELD_NUMBER = 107;
   private int booleanEncodingLevel_;
   public static final int MAX_NUM_CUTS_FIELD_NUMBER = 91;
   private int maxNumCuts_;
   public static final int ONLY_ADD_CUTS_AT_LEVEL_ZERO_FIELD_NUMBER = 92;
   private boolean onlyAddCutsAtLevelZero_;
   public static final int ADD_KNAPSACK_CUTS_FIELD_NUMBER = 111;
   private boolean addKnapsackCuts_;
   public static final int ADD_CG_CUTS_FIELD_NUMBER = 117;
   private boolean addCgCuts_;
   public static final int ADD_MIR_CUTS_FIELD_NUMBER = 120;
   private boolean addMirCuts_;
   public static final int MAX_ALL_DIFF_CUT_SIZE_FIELD_NUMBER = 148;
   private int maxAllDiffCutSize_;
   public static final int USE_MIR_ROUNDING_FIELD_NUMBER = 118;
   private boolean useMirRounding_;
   public static final int MAX_INTEGER_ROUNDING_SCALING_FIELD_NUMBER = 119;
   private int maxIntegerRoundingScaling_;
   public static final int ADD_LP_CONSTRAINTS_LAZILY_FIELD_NUMBER = 112;
   private boolean addLpConstraintsLazily_;
   public static final int MIN_ORTHOGONALITY_FOR_LP_CONSTRAINTS_FIELD_NUMBER = 115;
   private double minOrthogonalityForLpConstraints_;
   public static final int MAX_INACTIVE_COUNT_FIELD_NUMBER = 121;
   private long maxInactiveCount_;
   public static final int CONSTRAINT_REMOVAL_BATCH_SIZE_FIELD_NUMBER = 122;
   private long constraintRemovalBatchSize_;
   public static final int SEARCH_BRANCHING_FIELD_NUMBER = 82;
   private int searchBranching_;
   public static final int EXPLOIT_INTEGER_LP_SOLUTION_FIELD_NUMBER = 94;
   private boolean exploitIntegerLpSolution_;
   public static final int EXPLOIT_ALL_LP_SOLUTION_FIELD_NUMBER = 116;
   private boolean exploitAllLpSolution_;
   public static final int EXPLOIT_BEST_SOLUTION_FIELD_NUMBER = 130;
   private boolean exploitBestSolution_;
   public static final int EXPLOIT_OBJECTIVE_FIELD_NUMBER = 131;
   private boolean exploitObjective_;
   public static final int PROBING_PERIOD_AT_ROOT_FIELD_NUMBER = 142;
   private long probingPeriodAtRoot_;
   public static final int PSEUDO_COST_RELIABILITY_THRESHOLD_FIELD_NUMBER = 123;
   private long pseudoCostReliabilityThreshold_;
   public static final int OPTIMIZE_WITH_CORE_FIELD_NUMBER = 83;
   private boolean optimizeWithCore_;
   public static final int BINARY_SEARCH_NUM_CONFLICTS_FIELD_NUMBER = 99;
   private int binarySearchNumConflicts_;
   public static final int OPTIMIZE_WITH_MAX_HS_FIELD_NUMBER = 85;
   private boolean optimizeWithMaxHs_;
   public static final int ENUMERATE_ALL_SOLUTIONS_FIELD_NUMBER = 87;
   private boolean enumerateAllSolutions_;
   public static final int FILL_TIGHTENED_DOMAINS_IN_RESPONSE_FIELD_NUMBER = 132;
   private boolean fillTightenedDomainsInResponse_;
   public static final int INSTANTIATE_ALL_VARIABLES_FIELD_NUMBER = 106;
   private boolean instantiateAllVariables_;
   public static final int AUTO_DETECT_GREATER_THAN_AT_LEAST_ONE_OF_FIELD_NUMBER = 95;
   private boolean autoDetectGreaterThanAtLeastOneOf_;
   public static final int STOP_AFTER_FIRST_SOLUTION_FIELD_NUMBER = 98;
   private boolean stopAfterFirstSolution_;
   public static final int NUM_SEARCH_WORKERS_FIELD_NUMBER = 100;
   private int numSearchWorkers_;
   public static final int INTERLEAVE_SEARCH_FIELD_NUMBER = 136;
   private boolean interleaveSearch_;
   public static final int REDUCE_MEMORY_USAGE_IN_INTERLEAVE_MODE_FIELD_NUMBER = 141;
   private boolean reduceMemoryUsageInInterleaveMode_;
   public static final int DETERMINISTIC_PARALLEL_SEARCH_FIELD_NUMBER = 134;
   private boolean deterministicParallelSearch_;
   public static final int SHARE_OBJECTIVE_BOUNDS_FIELD_NUMBER = 113;
   private boolean shareObjectiveBounds_;
   public static final int SHARE_LEVEL_ZERO_BOUNDS_FIELD_NUMBER = 114;
   private boolean shareLevelZeroBounds_;
   public static final int USE_LNS_ONLY_FIELD_NUMBER = 101;
   private boolean useLnsOnly_;
   public static final int LNS_FOCUS_ON_DECISION_VARIABLES_FIELD_NUMBER = 105;
   private boolean lnsFocusOnDecisionVariables_;
   public static final int USE_RINS_LNS_FIELD_NUMBER = 129;
   private boolean useRinsLns_;
   public static final int DIVERSIFY_LNS_PARAMS_FIELD_NUMBER = 137;
   private boolean diversifyLnsParams_;
   public static final int RANDOMIZE_SEARCH_FIELD_NUMBER = 103;
   private boolean randomizeSearch_;
   public static final int SEARCH_RANDOMIZATION_TOLERANCE_FIELD_NUMBER = 104;
   private long searchRandomizationTolerance_;
   public static final int USE_OPTIONAL_VARIABLES_FIELD_NUMBER = 108;
   private boolean useOptionalVariables_;
   public static final int USE_EXACT_LP_REASON_FIELD_NUMBER = 109;
   private boolean useExactLpReason_;
   public static final int USE_BRANCHING_IN_LP_FIELD_NUMBER = 139;
   private boolean useBranchingInLp_;
   public static final int USE_COMBINED_NO_OVERLAP_FIELD_NUMBER = 133;
   private boolean useCombinedNoOverlap_;
   public static final int CATCH_SIGINT_SIGNAL_FIELD_NUMBER = 135;
   private boolean catchSigintSignal_;
   public static final int USE_IMPLIED_BOUNDS_FIELD_NUMBER = 144;
   private boolean useImpliedBounds_;
   public static final int MIP_MAX_BOUND_FIELD_NUMBER = 124;
   private double mipMaxBound_;
   public static final int MIP_VAR_SCALING_FIELD_NUMBER = 125;
   private double mipVarScaling_;
   public static final int MIP_WANTED_PRECISION_FIELD_NUMBER = 126;
   private double mipWantedPrecision_;
   public static final int MIP_MAX_ACTIVITY_EXPONENT_FIELD_NUMBER = 127;
   private int mipMaxActivityExponent_;
   public static final int MIP_CHECK_PRECISION_FIELD_NUMBER = 128;
   private double mipCheckPrecision_;
   private byte memoizedIsInitialized;
   private static final SatParameters DEFAULT_INSTANCE = new SatParameters();
   /** @deprecated */
   @Deprecated
   public static final Parser PARSER = new AbstractParser() {
      public SatParameters parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new SatParameters(var1, var2);
      }
   };

   private SatParameters(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private SatParameters() {
      this.memoizedIsInitialized = -1;
      this.preferredVariableOrder_ = 0;
      this.initialPolarity_ = 1;
      this.usePhaseSaving_ = true;
      this.minimizationAlgorithm_ = 2;
      this.binaryMinimizationAlgorithm_ = 1;
      this.subsumptionDuringConflictAnalysis_ = true;
      this.clauseCleanupPeriod_ = 10000;
      this.clauseCleanupTarget_ = 10000;
      this.clauseCleanupProtection_ = 0;
      this.clauseCleanupLbdBound_ = 5;
      this.clauseCleanupOrdering_ = 0;
      this.pbCleanupIncrement_ = 200;
      this.pbCleanupRatio_ = 0.5D;
      this.minimizeWithPropagationRestartPeriod_ = 10;
      this.minimizeWithPropagationNumDecisions_ = 1000;
      this.variableActivityDecay_ = 0.8D;
      this.maxVariableActivityValue_ = 1.0E100D;
      this.glucoseMaxDecay_ = 0.95D;
      this.glucoseDecayIncrement_ = 0.01D;
      this.glucoseDecayIncrementPeriod_ = 5000;
      this.clauseActivityDecay_ = 0.999D;
      this.maxClauseActivityValue_ = 1.0E20D;
      this.restartAlgorithms_ = Collections.emptyList();
      this.defaultRestartAlgorithms_ = "LUBY_RESTART,LBD_MOVING_AVERAGE_RESTART,DL_MOVING_AVERAGE_RESTART";
      this.restartPeriod_ = 50;
      this.restartRunningWindowSize_ = 50;
      this.restartDlAverageRatio_ = 1.0D;
      this.restartLbdAverageRatio_ = 1.0D;
      this.blockingRestartWindowSize_ = 5000;
      this.blockingRestartMultiplier_ = 1.4D;
      this.maxTimeInSeconds_ = Double.POSITIVE_INFINITY;
      this.maxDeterministicTime_ = Double.POSITIVE_INFINITY;
      this.maxNumberOfConflicts_ = Long.MAX_VALUE;
      this.maxMemoryInMb_ = 10000L;
      this.treatBinaryClausesSeparately_ = true;
      this.randomSeed_ = 1;
      this.countAssumptionLevelsInLbd_ = true;
      this.presolveBveThreshold_ = 500;
      this.presolveBveClauseWeight_ = 3;
      this.presolveProbingDeterministicTimeLimit_ = 30.0D;
      this.presolveBlockedClause_ = true;
      this.presolveUseBva_ = true;
      this.presolveBvaThreshold_ = 1;
      this.maxPresolveIterations_ = 3;
      this.cpModelPresolve_ = true;
      this.cpModelProbingLevel_ = 2;
      this.cpModelUseSatPresolve_ = true;
      this.expandElementConstraints_ = true;
      this.expandAutomatonConstraints_ = true;
      this.mergeNoOverlapWorkLimit_ = 1.0E12D;
      this.mergeAtMostOneWorkLimit_ = 1.0E8D;
      this.useOptimizationHints_ = true;
      this.minimizeCore_ = true;
      this.findMultipleCores_ = true;
      this.coverOptimization_ = true;
      this.maxSatAssumptionOrder_ = 0;
      this.maxSatStratification_ = 1;
      this.usePrecedencesInDisjunctiveConstraint_ = true;
      this.useDisjunctiveConstraintInCumulativeConstraint_ = true;
      this.linearizationLevel_ = 1;
      this.booleanEncodingLevel_ = 1;
      this.maxNumCuts_ = 5000;
      this.addMirCuts_ = true;
      this.maxAllDiffCutSize_ = 7;
      this.useMirRounding_ = true;
      this.maxIntegerRoundingScaling_ = 600;
      this.addLpConstraintsLazily_ = true;
      this.maxInactiveCount_ = 1000L;
      this.constraintRemovalBatchSize_ = 100L;
      this.searchBranching_ = 0;
      this.exploitIntegerLpSolution_ = true;
      this.exploitAllLpSolution_ = true;
      this.exploitObjective_ = true;
      this.pseudoCostReliabilityThreshold_ = 100L;
      this.binarySearchNumConflicts_ = -1;
      this.instantiateAllVariables_ = true;
      this.autoDetectGreaterThanAtLeastOneOf_ = true;
      this.numSearchWorkers_ = 1;
      this.reduceMemoryUsageInInterleaveMode_ = true;
      this.shareObjectiveBounds_ = true;
      this.shareLevelZeroBounds_ = true;
      this.useRinsLns_ = true;
      this.useOptionalVariables_ = true;
      this.useExactLpReason_ = true;
      this.catchSigintSignal_ = true;
      this.mipMaxBound_ = 1.0E7D;
      this.mipVarScaling_ = 1.0D;
      this.mipWantedPrecision_ = 1.0E-6D;
      this.mipMaxActivityExponent_ = 53;
      this.mipCheckPrecision_ = 1.0E-4D;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new SatParameters();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private SatParameters(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         int var3 = 0;
         boolean var4 = false;
         boolean var5 = false;
         boolean var6 = false;
         com.google.protobuf.UnknownFieldSet.Builder var7 = UnknownFieldSet.newBuilder();

         try {
            boolean var8 = false;

            while(!var8) {
               int var9 = var1.readTag();
               int var10;
               switch(var9) {
               case 0:
                  var8 = true;
                  break;
               case 8:
                  var10 = var1.readEnum();
                  SatParameters.VariableOrder var31 = SatParameters.VariableOrder.valueOf(var10);
                  if (var31 == null) {
                     var7.mergeVarintField(1, var10);
                  } else {
                     this.bitField0_ |= 1;
                     this.preferredVariableOrder_ = var10;
                  }
                  break;
               case 16:
                  var10 = var1.readEnum();
                  SatParameters.Polarity var30 = SatParameters.Polarity.valueOf(var10);
                  if (var30 == null) {
                     var7.mergeVarintField(2, var10);
                  } else {
                     this.bitField0_ |= 2;
                     this.initialPolarity_ = var10;
                  }
                  break;
               case 32:
                  var10 = var1.readEnum();
                  SatParameters.ConflictMinimizationAlgorithm var29 = SatParameters.ConflictMinimizationAlgorithm.valueOf(var10);
                  if (var29 == null) {
                     var7.mergeVarintField(4, var10);
                  } else {
                     this.bitField0_ |= 256;
                     this.minimizationAlgorithm_ = var10;
                  }
                  break;
               case 88:
                  this.bitField0_ |= 2048;
                  this.clauseCleanupPeriod_ = var1.readInt32();
                  break;
               case 104:
                  this.bitField0_ |= 4096;
                  this.clauseCleanupTarget_ = var1.readInt32();
                  break;
               case 121:
                  this.bitField0_ |= 1048576;
                  this.variableActivityDecay_ = var1.readDouble();
                  break;
               case 129:
                  this.bitField0_ |= 2097152;
                  this.maxVariableActivityValue_ = var1.readDouble();
                  break;
               case 137:
                  this.bitField0_ |= 33554432;
                  this.clauseActivityDecay_ = var1.readDouble();
                  break;
               case 145:
                  this.bitField0_ |= 67108864;
                  this.maxClauseActivityValue_ = var1.readDouble();
                  break;
               case 177:
                  this.bitField0_ |= 4194304;
                  this.glucoseMaxDecay_ = var1.readDouble();
                  break;
               case 185:
                  this.bitField0_ |= 8388608;
                  this.glucoseDecayIncrement_ = var1.readDouble();
                  break;
               case 192:
                  this.bitField0_ |= 16777216;
                  this.glucoseDecayIncrementPeriod_ = var1.readInt32();
                  break;
               case 240:
                  this.bitField0_ |= 268435456;
                  this.restartPeriod_ = var1.readInt32();
                  break;
               case 248:
                  this.bitField1_ |= 1024;
                  this.randomSeed_ = var1.readInt32();
                  break;
               case 257:
                  this.bitField0_ |= 16;
                  this.randomBranchesRatio_ = var1.readDouble();
                  break;
               case 264:
                  this.bitField1_ |= 512;
                  this.treatBinaryClausesSeparately_ = var1.readBool();
                  break;
               case 272:
                  var10 = var1.readEnum();
                  SatParameters.BinaryMinizationAlgorithm var28 = SatParameters.BinaryMinizationAlgorithm.valueOf(var10);
                  if (var28 == null) {
                     var7.mergeVarintField(34, var10);
                  } else {
                     this.bitField0_ |= 512;
                     this.binaryMinimizationAlgorithm_ = var10;
                  }
                  break;
               case 280:
                  this.bitField1_ |= 1073741824;
                  this.useOptimizationHints_ = var1.readBool();
                  break;
               case 289:
                  this.bitField1_ |= 32;
                  this.maxTimeInSeconds_ = var1.readDouble();
                  break;
               case 296:
                  this.bitField1_ |= 128;
                  this.maxNumberOfConflicts_ = var1.readInt64();
                  break;
               case 320:
                  this.bitField1_ |= 256;
                  this.maxMemoryInMb_ = var1.readInt64();
                  break;
               case 328:
                  this.bitField1_ |= 2048;
                  this.logSearchProgress_ = var1.readBool();
                  break;
               case 344:
                  this.bitField1_ |= 4096;
                  this.usePbResolution_ = var1.readBool();
                  break;
               case 352:
                  this.bitField0_ |= 4;
                  this.usePhaseSaving_ = var1.readBool();
                  break;
               case 361:
                  this.bitField0_ |= 8;
                  this.randomPolarityRatio_ = var1.readDouble();
                  break;
               case 368:
                  this.bitField0_ |= 65536;
                  this.pbCleanupIncrement_ = var1.readInt32();
                  break;
               case 377:
                  this.bitField0_ |= 131072;
                  this.pbCleanupRatio_ = var1.readDouble();
                  break;
               case 384:
                  this.bitField1_ |= 8192;
                  this.minimizeReductionDuringPbResolution_ = var1.readBool();
                  break;
               case 392:
                  this.bitField1_ |= 16384;
                  this.countAssumptionLevelsInLbd_ = var1.readBool();
                  break;
               case 400:
                  this.bitField1_ |= Integer.MIN_VALUE;
                  this.minimizeCore_ = var1.readBool();
                  break;
               case 408:
                  var10 = var1.readEnum();
                  SatParameters.MaxSatAssumptionOrder var27 = SatParameters.MaxSatAssumptionOrder.valueOf(var10);
                  if (var27 == null) {
                     var7.mergeVarintField(51, var10);
                  } else {
                     this.bitField2_ |= 4;
                     this.maxSatAssumptionOrder_ = var10;
                  }
                  break;
               case 416:
                  this.bitField2_ |= 8;
                  this.maxSatReverseAssumptionOrder_ = var1.readBool();
                  break;
               case 424:
                  var10 = var1.readEnum();
                  SatParameters.MaxSatStratificationAlgorithm var26 = SatParameters.MaxSatStratificationAlgorithm.valueOf(var10);
                  if (var26 == null) {
                     var7.mergeVarintField(53, var10);
                  } else {
                     this.bitField2_ |= 16;
                     this.maxSatStratification_ = var10;
                  }
                  break;
               case 432:
                  this.bitField1_ |= 32768;
                  this.presolveBveThreshold_ = var1.readInt32();
                  break;
               case 440:
                  this.bitField1_ |= 65536;
                  this.presolveBveClauseWeight_ = var1.readInt32();
                  break;
               case 448:
                  this.bitField0_ |= 1024;
                  this.subsumptionDuringConflictAnalysis_ = var1.readBool();
                  break;
               case 457:
                  this.bitField1_ |= 131072;
                  this.presolveProbingDeterministicTimeLimit_ = var1.readDouble();
                  break;
               case 464:
                  var10 = var1.readEnum();
                  SatParameters.ClauseProtection var25 = SatParameters.ClauseProtection.valueOf(var10);
                  if (var25 == null) {
                     var7.mergeVarintField(58, var10);
                  } else {
                     this.bitField0_ |= 8192;
                     this.clauseCleanupProtection_ = var10;
                  }
                  break;
               case 472:
                  this.bitField0_ |= 16384;
                  this.clauseCleanupLbdBound_ = var1.readInt32();
                  break;
               case 480:
                  var10 = var1.readEnum();
                  SatParameters.ClauseOrdering var24 = SatParameters.ClauseOrdering.valueOf(var10);
                  if (var24 == null) {
                     var7.mergeVarintField(60, var10);
                  } else {
                     this.bitField0_ |= 32768;
                     this.clauseCleanupOrdering_ = var10;
                  }
                  break;
               case 488:
                  var10 = var1.readEnum();
                  SatParameters.RestartAlgorithm var23 = SatParameters.RestartAlgorithm.valueOf(var10);
                  if (var23 == null) {
                     var7.mergeVarintField(61, var10);
                  } else {
                     if ((var3 & 134217728) == 0) {
                        this.restartAlgorithms_ = new ArrayList();
                        var3 |= 134217728;
                     }

                     this.restartAlgorithms_.add(var10);
                  }
                  break;
               case 490:
                  var10 = var1.readRawVarint32();
                  int var22 = var1.pushLimit(var10);

                  while(var1.getBytesUntilLimit() > 0) {
                     int var12 = var1.readEnum();
                     SatParameters.RestartAlgorithm var13 = SatParameters.RestartAlgorithm.valueOf(var12);
                     if (var13 == null) {
                        var7.mergeVarintField(61, var12);
                     } else {
                        if ((var3 & 134217728) == 0) {
                           this.restartAlgorithms_ = new ArrayList();
                           var3 |= 134217728;
                        }

                        this.restartAlgorithms_.add(var12);
                     }
                  }

                  var1.popLimit(var22);
                  break;
               case 496:
                  this.bitField0_ |= 536870912;
                  this.restartRunningWindowSize_ = var1.readInt32();
                  break;
               case 505:
                  this.bitField0_ |= 1073741824;
                  this.restartDlAverageRatio_ = var1.readDouble();
                  break;
               case 512:
                  this.bitField1_ |= 1;
                  this.useBlockingRestart_ = var1.readBool();
                  break;
               case 520:
                  this.bitField1_ |= 2;
                  this.blockingRestartWindowSize_ = var1.readInt32();
                  break;
               case 529:
                  this.bitField1_ |= 4;
                  this.blockingRestartMultiplier_ = var1.readDouble();
                  break;
               case 537:
                  this.bitField1_ |= 64;
                  this.maxDeterministicTime_ = var1.readDouble();
                  break;
               case 544:
                  this.bitField1_ |= 8;
                  this.numConflictsBeforeStrategyChanges_ = var1.readInt32();
                  break;
               case 553:
                  this.bitField1_ |= 16;
                  this.strategyChangeIncreaseRatio_ = var1.readDouble();
                  break;
               case 562:
                  ByteString var21 = var1.readBytes();
                  this.bitField0_ |= 134217728;
                  this.defaultRestartAlgorithms_ = var21;
                  break;
               case 569:
                  this.bitField0_ |= Integer.MIN_VALUE;
                  this.restartLbdAverageRatio_ = var1.readDouble();
                  break;
               case 576:
                  this.bitField1_ |= 524288;
                  this.presolveUseBva_ = var1.readBool();
                  break;
               case 584:
                  this.bitField1_ |= 1048576;
                  this.presolveBvaThreshold_ = var1.readInt32();
                  break;
               case 592:
                  this.bitField2_ |= 32;
                  this.usePrecedencesInDisjunctiveConstraint_ = var1.readBool();
                  break;
               case 600:
                  this.bitField0_ |= 32;
                  this.useErwaHeuristic_ = var1.readBool();
                  break;
               case 609:
                  this.bitField0_ |= 64;
                  this.initialVariablesActivity_ = var1.readDouble();
                  break;
               case 616:
                  this.bitField0_ |= 128;
                  this.alsoBumpVariablesInConflictReasons_ = var1.readBool();
                  break;
               case 624:
                  this.bitField2_ |= 64;
                  this.useOverloadCheckerInCumulativeConstraint_ = var1.readBool();
                  break;
               case 632:
                  this.bitField2_ |= 128;
                  this.useTimetableEdgeFindingInCumulativeConstraint_ = var1.readBool();
                  break;
               case 640:
                  this.bitField2_ |= 256;
                  this.useDisjunctiveConstraintInCumulativeConstraint_ = var1.readBool();
                  break;
               case 656:
                  var10 = var1.readEnum();
                  SatParameters.SearchBranching var11 = SatParameters.SearchBranching.valueOf(var10);
                  if (var11 == null) {
                     var7.mergeVarintField(82, var10);
                  } else {
                     this.bitField2_ |= 8388608;
                     this.searchBranching_ = var10;
                  }
                  break;
               case 664:
                  this.bitField2_ |= 1073741824;
                  this.optimizeWithCore_ = var1.readBool();
                  break;
               case 672:
                  this.bitField2_ |= 1;
                  this.findMultipleCores_ = var1.readBool();
                  break;
               case 680:
                  this.bitField3_ |= 1;
                  this.optimizeWithMaxHs_ = var1.readBool();
                  break;
               case 688:
                  this.bitField1_ |= 4194304;
                  this.cpModelPresolve_ = var1.readBool();
                  break;
               case 696:
                  this.bitField3_ |= 2;
                  this.enumerateAllSolutions_ = var1.readBool();
                  break;
               case 704:
                  this.bitField1_ |= 262144;
                  this.presolveBlockedClause_ = var1.readBool();
                  break;
               case 712:
                  this.bitField2_ |= 2;
                  this.coverOptimization_ = var1.readBool();
                  break;
               case 720:
                  this.bitField2_ |= 512;
                  this.linearizationLevel_ = var1.readInt32();
                  break;
               case 728:
                  this.bitField2_ |= 2048;
                  this.maxNumCuts_ = var1.readInt32();
                  break;
               case 736:
                  this.bitField2_ |= 4096;
                  this.onlyAddCutsAtLevelZero_ = var1.readBool();
                  break;
               case 744:
                  this.bitField1_ |= 16777216;
                  this.cpModelUseSatPresolve_ = var1.readBool();
                  break;
               case 752:
                  this.bitField2_ |= 16777216;
                  this.exploitIntegerLpSolution_ = var1.readBool();
                  break;
               case 760:
                  this.bitField3_ |= 16;
                  this.autoDetectGreaterThanAtLeastOneOf_ = var1.readBool();
                  break;
               case 768:
                  this.bitField0_ |= 262144;
                  this.minimizeWithPropagationRestartPeriod_ = var1.readInt32();
                  break;
               case 776:
                  this.bitField0_ |= 524288;
                  this.minimizeWithPropagationNumDecisions_ = var1.readInt32();
                  break;
               case 784:
                  this.bitField3_ |= 32;
                  this.stopAfterFirstSolution_ = var1.readBool();
                  break;
               case 792:
                  this.bitField2_ |= Integer.MIN_VALUE;
                  this.binarySearchNumConflicts_ = var1.readInt32();
                  break;
               case 800:
                  this.bitField3_ |= 64;
                  this.numSearchWorkers_ = var1.readInt32();
                  break;
               case 808:
                  this.bitField3_ |= 4096;
                  this.useLnsOnly_ = var1.readBool();
                  break;
               case 824:
                  this.bitField3_ |= 65536;
                  this.randomizeSearch_ = var1.readBool();
                  break;
               case 832:
                  this.bitField3_ |= 131072;
                  this.searchRandomizationTolerance_ = var1.readInt64();
                  break;
               case 840:
                  this.bitField3_ |= 8192;
                  this.lnsFocusOnDecisionVariables_ = var1.readBool();
                  break;
               case 848:
                  this.bitField3_ |= 8;
                  this.instantiateAllVariables_ = var1.readBool();
                  break;
               case 856:
                  this.bitField2_ |= 1024;
                  this.booleanEncodingLevel_ = var1.readInt32();
                  break;
               case 864:
                  this.bitField3_ |= 262144;
                  this.useOptionalVariables_ = var1.readBool();
                  break;
               case 872:
                  this.bitField3_ |= 524288;
                  this.useExactLpReason_ = var1.readBool();
                  break;
               case 880:
                  this.bitField1_ |= 8388608;
                  this.cpModelProbingLevel_ = var1.readInt32();
                  break;
               case 888:
                  this.bitField2_ |= 8192;
                  this.addKnapsackCuts_ = var1.readBool();
                  break;
               case 896:
                  this.bitField2_ |= 524288;
                  this.addLpConstraintsLazily_ = var1.readBool();
                  break;
               case 904:
                  this.bitField3_ |= 1024;
                  this.shareObjectiveBounds_ = var1.readBool();
                  break;
               case 912:
                  this.bitField3_ |= 2048;
                  this.shareLevelZeroBounds_ = var1.readBool();
                  break;
               case 921:
                  this.bitField2_ |= 1048576;
                  this.minOrthogonalityForLpConstraints_ = var1.readDouble();
                  break;
               case 928:
                  this.bitField2_ |= 33554432;
                  this.exploitAllLpSolution_ = var1.readBool();
                  break;
               case 936:
                  this.bitField2_ |= 16384;
                  this.addCgCuts_ = var1.readBool();
                  break;
               case 944:
                  this.bitField2_ |= 131072;
                  this.useMirRounding_ = var1.readBool();
                  break;
               case 952:
                  this.bitField2_ |= 262144;
                  this.maxIntegerRoundingScaling_ = var1.readInt32();
                  break;
               case 960:
                  this.bitField2_ |= 32768;
                  this.addMirCuts_ = var1.readBool();
                  break;
               case 968:
                  this.bitField2_ |= 2097152;
                  this.maxInactiveCount_ = var1.readInt64();
                  break;
               case 976:
                  this.bitField2_ |= 4194304;
                  this.constraintRemovalBatchSize_ = var1.readInt64();
                  break;
               case 984:
                  this.bitField2_ |= 536870912;
                  this.pseudoCostReliabilityThreshold_ = var1.readInt64();
                  break;
               case 993:
                  this.bitField3_ |= 16777216;
                  this.mipMaxBound_ = var1.readDouble();
                  break;
               case 1001:
                  this.bitField3_ |= 33554432;
                  this.mipVarScaling_ = var1.readDouble();
                  break;
               case 1009:
                  this.bitField3_ |= 67108864;
                  this.mipWantedPrecision_ = var1.readDouble();
                  break;
               case 1016:
                  this.bitField3_ |= 134217728;
                  this.mipMaxActivityExponent_ = var1.readInt32();
                  break;
               case 1025:
                  this.bitField3_ |= 268435456;
                  this.mipCheckPrecision_ = var1.readDouble();
                  break;
               case 1032:
                  this.bitField3_ |= 16384;
                  this.useRinsLns_ = var1.readBool();
                  break;
               case 1040:
                  this.bitField2_ |= 67108864;
                  this.exploitBestSolution_ = var1.readBool();
                  break;
               case 1048:
                  this.bitField2_ |= 134217728;
                  this.exploitObjective_ = var1.readBool();
                  break;
               case 1056:
                  this.bitField3_ |= 4;
                  this.fillTightenedDomainsInResponse_ = var1.readBool();
                  break;
               case 1064:
                  this.bitField3_ |= 2097152;
                  this.useCombinedNoOverlap_ = var1.readBool();
                  break;
               case 1072:
                  this.bitField3_ |= 512;
                  this.deterministicParallelSearch_ = var1.readBool();
                  break;
               case 1080:
                  this.bitField3_ |= 4194304;
                  this.catchSigintSignal_ = var1.readBool();
                  break;
               case 1088:
                  this.bitField3_ |= 128;
                  this.interleaveSearch_ = var1.readBool();
                  break;
               case 1096:
                  this.bitField3_ |= 32768;
                  this.diversifyLnsParams_ = var1.readBool();
                  break;
               case 1104:
                  this.bitField1_ |= 2097152;
                  this.maxPresolveIterations_ = var1.readInt32();
                  break;
               case 1112:
                  this.bitField3_ |= 1048576;
                  this.useBranchingInLp_ = var1.readBool();
                  break;
               case 1120:
                  this.bitField1_ |= 33554432;
                  this.expandElementConstraints_ = var1.readBool();
                  break;
               case 1128:
                  this.bitField3_ |= 256;
                  this.reduceMemoryUsageInInterleaveMode_ = var1.readBool();
                  break;
               case 1136:
                  this.bitField2_ |= 268435456;
                  this.probingPeriodAtRoot_ = var1.readInt64();
                  break;
               case 1144:
                  this.bitField1_ |= 67108864;
                  this.expandAutomatonConstraints_ = var1.readBool();
                  break;
               case 1152:
                  this.bitField3_ |= 8388608;
                  this.useImpliedBounds_ = var1.readBool();
                  break;
               case 1161:
                  this.bitField1_ |= 134217728;
                  this.mergeNoOverlapWorkLimit_ = var1.readDouble();
                  break;
               case 1169:
                  this.bitField1_ |= 268435456;
                  this.mergeAtMostOneWorkLimit_ = var1.readDouble();
                  break;
               case 1176:
                  this.bitField1_ |= 536870912;
                  this.presolveSubstitutionLevel_ = var1.readInt32();
                  break;
               case 1184:
                  this.bitField2_ |= 65536;
                  this.maxAllDiffCutSize_ = var1.readInt32();
                  break;
               default:
                  if (!this.parseUnknownField(var1, var7, var2, var9)) {
                     var8 = true;
                  }
               }
            }
         } catch (InvalidProtocolBufferException var18) {
            throw var18.setUnfinishedMessage(this);
         } catch (IOException var19) {
            throw (new InvalidProtocolBufferException(var19)).setUnfinishedMessage(this);
         } finally {
            if ((var3 & 134217728) != 0) {
               this.restartAlgorithms_ = Collections.unmodifiableList(this.restartAlgorithms_);
            }

            this.unknownFields = var7.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return SatParametersOuterClass.internal_static_operations_research_sat_SatParameters_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SatParametersOuterClass.internal_static_operations_research_sat_SatParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(SatParameters.class, SatParameters.Builder.class);
   }

   public boolean hasPreferredVariableOrder() {
      return (this.bitField0_ & 1) != 0;
   }

   public SatParameters.VariableOrder getPreferredVariableOrder() {
      SatParameters.VariableOrder var1 = SatParameters.VariableOrder.valueOf(this.preferredVariableOrder_);
      return var1 == null ? SatParameters.VariableOrder.IN_ORDER : var1;
   }

   public boolean hasInitialPolarity() {
      return (this.bitField0_ & 2) != 0;
   }

   public SatParameters.Polarity getInitialPolarity() {
      SatParameters.Polarity var1 = SatParameters.Polarity.valueOf(this.initialPolarity_);
      return var1 == null ? SatParameters.Polarity.POLARITY_FALSE : var1;
   }

   public boolean hasUsePhaseSaving() {
      return (this.bitField0_ & 4) != 0;
   }

   public boolean getUsePhaseSaving() {
      return this.usePhaseSaving_;
   }

   public boolean hasRandomPolarityRatio() {
      return (this.bitField0_ & 8) != 0;
   }

   public double getRandomPolarityRatio() {
      return this.randomPolarityRatio_;
   }

   public boolean hasRandomBranchesRatio() {
      return (this.bitField0_ & 16) != 0;
   }

   public double getRandomBranchesRatio() {
      return this.randomBranchesRatio_;
   }

   public boolean hasUseErwaHeuristic() {
      return (this.bitField0_ & 32) != 0;
   }

   public boolean getUseErwaHeuristic() {
      return this.useErwaHeuristic_;
   }

   public boolean hasInitialVariablesActivity() {
      return (this.bitField0_ & 64) != 0;
   }

   public double getInitialVariablesActivity() {
      return this.initialVariablesActivity_;
   }

   public boolean hasAlsoBumpVariablesInConflictReasons() {
      return (this.bitField0_ & 128) != 0;
   }

   public boolean getAlsoBumpVariablesInConflictReasons() {
      return this.alsoBumpVariablesInConflictReasons_;
   }

   public boolean hasMinimizationAlgorithm() {
      return (this.bitField0_ & 256) != 0;
   }

   public SatParameters.ConflictMinimizationAlgorithm getMinimizationAlgorithm() {
      SatParameters.ConflictMinimizationAlgorithm var1 = SatParameters.ConflictMinimizationAlgorithm.valueOf(this.minimizationAlgorithm_);
      return var1 == null ? SatParameters.ConflictMinimizationAlgorithm.RECURSIVE : var1;
   }

   public boolean hasBinaryMinimizationAlgorithm() {
      return (this.bitField0_ & 512) != 0;
   }

   public SatParameters.BinaryMinizationAlgorithm getBinaryMinimizationAlgorithm() {
      SatParameters.BinaryMinizationAlgorithm var1 = SatParameters.BinaryMinizationAlgorithm.valueOf(this.binaryMinimizationAlgorithm_);
      return var1 == null ? SatParameters.BinaryMinizationAlgorithm.BINARY_MINIMIZATION_FIRST : var1;
   }

   public boolean hasSubsumptionDuringConflictAnalysis() {
      return (this.bitField0_ & 1024) != 0;
   }

   public boolean getSubsumptionDuringConflictAnalysis() {
      return this.subsumptionDuringConflictAnalysis_;
   }

   public boolean hasClauseCleanupPeriod() {
      return (this.bitField0_ & 2048) != 0;
   }

   public int getClauseCleanupPeriod() {
      return this.clauseCleanupPeriod_;
   }

   public boolean hasClauseCleanupTarget() {
      return (this.bitField0_ & 4096) != 0;
   }

   public int getClauseCleanupTarget() {
      return this.clauseCleanupTarget_;
   }

   public boolean hasClauseCleanupProtection() {
      return (this.bitField0_ & 8192) != 0;
   }

   public SatParameters.ClauseProtection getClauseCleanupProtection() {
      SatParameters.ClauseProtection var1 = SatParameters.ClauseProtection.valueOf(this.clauseCleanupProtection_);
      return var1 == null ? SatParameters.ClauseProtection.PROTECTION_NONE : var1;
   }

   public boolean hasClauseCleanupLbdBound() {
      return (this.bitField0_ & 16384) != 0;
   }

   public int getClauseCleanupLbdBound() {
      return this.clauseCleanupLbdBound_;
   }

   public boolean hasClauseCleanupOrdering() {
      return (this.bitField0_ & '耀') != 0;
   }

   public SatParameters.ClauseOrdering getClauseCleanupOrdering() {
      SatParameters.ClauseOrdering var1 = SatParameters.ClauseOrdering.valueOf(this.clauseCleanupOrdering_);
      return var1 == null ? SatParameters.ClauseOrdering.CLAUSE_ACTIVITY : var1;
   }

   public boolean hasPbCleanupIncrement() {
      return (this.bitField0_ & 65536) != 0;
   }

   public int getPbCleanupIncrement() {
      return this.pbCleanupIncrement_;
   }

   public boolean hasPbCleanupRatio() {
      return (this.bitField0_ & 131072) != 0;
   }

   public double getPbCleanupRatio() {
      return this.pbCleanupRatio_;
   }

   public boolean hasMinimizeWithPropagationRestartPeriod() {
      return (this.bitField0_ & 262144) != 0;
   }

   public int getMinimizeWithPropagationRestartPeriod() {
      return this.minimizeWithPropagationRestartPeriod_;
   }

   public boolean hasMinimizeWithPropagationNumDecisions() {
      return (this.bitField0_ & 524288) != 0;
   }

   public int getMinimizeWithPropagationNumDecisions() {
      return this.minimizeWithPropagationNumDecisions_;
   }

   public boolean hasVariableActivityDecay() {
      return (this.bitField0_ & 1048576) != 0;
   }

   public double getVariableActivityDecay() {
      return this.variableActivityDecay_;
   }

   public boolean hasMaxVariableActivityValue() {
      return (this.bitField0_ & 2097152) != 0;
   }

   public double getMaxVariableActivityValue() {
      return this.maxVariableActivityValue_;
   }

   public boolean hasGlucoseMaxDecay() {
      return (this.bitField0_ & 4194304) != 0;
   }

   public double getGlucoseMaxDecay() {
      return this.glucoseMaxDecay_;
   }

   public boolean hasGlucoseDecayIncrement() {
      return (this.bitField0_ & 8388608) != 0;
   }

   public double getGlucoseDecayIncrement() {
      return this.glucoseDecayIncrement_;
   }

   public boolean hasGlucoseDecayIncrementPeriod() {
      return (this.bitField0_ & 16777216) != 0;
   }

   public int getGlucoseDecayIncrementPeriod() {
      return this.glucoseDecayIncrementPeriod_;
   }

   public boolean hasClauseActivityDecay() {
      return (this.bitField0_ & 33554432) != 0;
   }

   public double getClauseActivityDecay() {
      return this.clauseActivityDecay_;
   }

   public boolean hasMaxClauseActivityValue() {
      return (this.bitField0_ & 67108864) != 0;
   }

   public double getMaxClauseActivityValue() {
      return this.maxClauseActivityValue_;
   }

   public List getRestartAlgorithmsList() {
      return new ListAdapter(this.restartAlgorithms_, restartAlgorithms_converter_);
   }

   public int getRestartAlgorithmsCount() {
      return this.restartAlgorithms_.size();
   }

   public SatParameters.RestartAlgorithm getRestartAlgorithms(int var1) {
      return (SatParameters.RestartAlgorithm)restartAlgorithms_converter_.convert(this.restartAlgorithms_.get(var1));
   }

   public boolean hasDefaultRestartAlgorithms() {
      return (this.bitField0_ & 134217728) != 0;
   }

   public String getDefaultRestartAlgorithms() {
      Object var1 = this.defaultRestartAlgorithms_;
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         if (var2.isValidUtf8()) {
            this.defaultRestartAlgorithms_ = var3;
         }

         return var3;
      }
   }

   public ByteString getDefaultRestartAlgorithmsBytes() {
      Object var1 = this.defaultRestartAlgorithms_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.defaultRestartAlgorithms_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   public boolean hasRestartPeriod() {
      return (this.bitField0_ & 268435456) != 0;
   }

   public int getRestartPeriod() {
      return this.restartPeriod_;
   }

   public boolean hasRestartRunningWindowSize() {
      return (this.bitField0_ & 536870912) != 0;
   }

   public int getRestartRunningWindowSize() {
      return this.restartRunningWindowSize_;
   }

   public boolean hasRestartDlAverageRatio() {
      return (this.bitField0_ & 1073741824) != 0;
   }

   public double getRestartDlAverageRatio() {
      return this.restartDlAverageRatio_;
   }

   public boolean hasRestartLbdAverageRatio() {
      return (this.bitField0_ & Integer.MIN_VALUE) != 0;
   }

   public double getRestartLbdAverageRatio() {
      return this.restartLbdAverageRatio_;
   }

   public boolean hasUseBlockingRestart() {
      return (this.bitField1_ & 1) != 0;
   }

   public boolean getUseBlockingRestart() {
      return this.useBlockingRestart_;
   }

   public boolean hasBlockingRestartWindowSize() {
      return (this.bitField1_ & 2) != 0;
   }

   public int getBlockingRestartWindowSize() {
      return this.blockingRestartWindowSize_;
   }

   public boolean hasBlockingRestartMultiplier() {
      return (this.bitField1_ & 4) != 0;
   }

   public double getBlockingRestartMultiplier() {
      return this.blockingRestartMultiplier_;
   }

   public boolean hasNumConflictsBeforeStrategyChanges() {
      return (this.bitField1_ & 8) != 0;
   }

   public int getNumConflictsBeforeStrategyChanges() {
      return this.numConflictsBeforeStrategyChanges_;
   }

   public boolean hasStrategyChangeIncreaseRatio() {
      return (this.bitField1_ & 16) != 0;
   }

   public double getStrategyChangeIncreaseRatio() {
      return this.strategyChangeIncreaseRatio_;
   }

   public boolean hasMaxTimeInSeconds() {
      return (this.bitField1_ & 32) != 0;
   }

   public double getMaxTimeInSeconds() {
      return this.maxTimeInSeconds_;
   }

   public boolean hasMaxDeterministicTime() {
      return (this.bitField1_ & 64) != 0;
   }

   public double getMaxDeterministicTime() {
      return this.maxDeterministicTime_;
   }

   public boolean hasMaxNumberOfConflicts() {
      return (this.bitField1_ & 128) != 0;
   }

   public long getMaxNumberOfConflicts() {
      return this.maxNumberOfConflicts_;
   }

   public boolean hasMaxMemoryInMb() {
      return (this.bitField1_ & 256) != 0;
   }

   public long getMaxMemoryInMb() {
      return this.maxMemoryInMb_;
   }

   public boolean hasTreatBinaryClausesSeparately() {
      return (this.bitField1_ & 512) != 0;
   }

   public boolean getTreatBinaryClausesSeparately() {
      return this.treatBinaryClausesSeparately_;
   }

   public boolean hasRandomSeed() {
      return (this.bitField1_ & 1024) != 0;
   }

   public int getRandomSeed() {
      return this.randomSeed_;
   }

   public boolean hasLogSearchProgress() {
      return (this.bitField1_ & 2048) != 0;
   }

   public boolean getLogSearchProgress() {
      return this.logSearchProgress_;
   }

   public boolean hasUsePbResolution() {
      return (this.bitField1_ & 4096) != 0;
   }

   public boolean getUsePbResolution() {
      return this.usePbResolution_;
   }

   public boolean hasMinimizeReductionDuringPbResolution() {
      return (this.bitField1_ & 8192) != 0;
   }

   public boolean getMinimizeReductionDuringPbResolution() {
      return this.minimizeReductionDuringPbResolution_;
   }

   public boolean hasCountAssumptionLevelsInLbd() {
      return (this.bitField1_ & 16384) != 0;
   }

   public boolean getCountAssumptionLevelsInLbd() {
      return this.countAssumptionLevelsInLbd_;
   }

   public boolean hasPresolveBveThreshold() {
      return (this.bitField1_ & '耀') != 0;
   }

   public int getPresolveBveThreshold() {
      return this.presolveBveThreshold_;
   }

   public boolean hasPresolveBveClauseWeight() {
      return (this.bitField1_ & 65536) != 0;
   }

   public int getPresolveBveClauseWeight() {
      return this.presolveBveClauseWeight_;
   }

   public boolean hasPresolveProbingDeterministicTimeLimit() {
      return (this.bitField1_ & 131072) != 0;
   }

   public double getPresolveProbingDeterministicTimeLimit() {
      return this.presolveProbingDeterministicTimeLimit_;
   }

   public boolean hasPresolveBlockedClause() {
      return (this.bitField1_ & 262144) != 0;
   }

   public boolean getPresolveBlockedClause() {
      return this.presolveBlockedClause_;
   }

   public boolean hasPresolveUseBva() {
      return (this.bitField1_ & 524288) != 0;
   }

   public boolean getPresolveUseBva() {
      return this.presolveUseBva_;
   }

   public boolean hasPresolveBvaThreshold() {
      return (this.bitField1_ & 1048576) != 0;
   }

   public int getPresolveBvaThreshold() {
      return this.presolveBvaThreshold_;
   }

   public boolean hasMaxPresolveIterations() {
      return (this.bitField1_ & 2097152) != 0;
   }

   public int getMaxPresolveIterations() {
      return this.maxPresolveIterations_;
   }

   public boolean hasCpModelPresolve() {
      return (this.bitField1_ & 4194304) != 0;
   }

   public boolean getCpModelPresolve() {
      return this.cpModelPresolve_;
   }

   public boolean hasCpModelProbingLevel() {
      return (this.bitField1_ & 8388608) != 0;
   }

   public int getCpModelProbingLevel() {
      return this.cpModelProbingLevel_;
   }

   public boolean hasCpModelUseSatPresolve() {
      return (this.bitField1_ & 16777216) != 0;
   }

   public boolean getCpModelUseSatPresolve() {
      return this.cpModelUseSatPresolve_;
   }

   public boolean hasExpandElementConstraints() {
      return (this.bitField1_ & 33554432) != 0;
   }

   public boolean getExpandElementConstraints() {
      return this.expandElementConstraints_;
   }

   public boolean hasExpandAutomatonConstraints() {
      return (this.bitField1_ & 67108864) != 0;
   }

   public boolean getExpandAutomatonConstraints() {
      return this.expandAutomatonConstraints_;
   }

   public boolean hasMergeNoOverlapWorkLimit() {
      return (this.bitField1_ & 134217728) != 0;
   }

   public double getMergeNoOverlapWorkLimit() {
      return this.mergeNoOverlapWorkLimit_;
   }

   public boolean hasMergeAtMostOneWorkLimit() {
      return (this.bitField1_ & 268435456) != 0;
   }

   public double getMergeAtMostOneWorkLimit() {
      return this.mergeAtMostOneWorkLimit_;
   }

   public boolean hasPresolveSubstitutionLevel() {
      return (this.bitField1_ & 536870912) != 0;
   }

   public int getPresolveSubstitutionLevel() {
      return this.presolveSubstitutionLevel_;
   }

   public boolean hasUseOptimizationHints() {
      return (this.bitField1_ & 1073741824) != 0;
   }

   public boolean getUseOptimizationHints() {
      return this.useOptimizationHints_;
   }

   public boolean hasMinimizeCore() {
      return (this.bitField1_ & Integer.MIN_VALUE) != 0;
   }

   public boolean getMinimizeCore() {
      return this.minimizeCore_;
   }

   public boolean hasFindMultipleCores() {
      return (this.bitField2_ & 1) != 0;
   }

   public boolean getFindMultipleCores() {
      return this.findMultipleCores_;
   }

   public boolean hasCoverOptimization() {
      return (this.bitField2_ & 2) != 0;
   }

   public boolean getCoverOptimization() {
      return this.coverOptimization_;
   }

   public boolean hasMaxSatAssumptionOrder() {
      return (this.bitField2_ & 4) != 0;
   }

   public SatParameters.MaxSatAssumptionOrder getMaxSatAssumptionOrder() {
      SatParameters.MaxSatAssumptionOrder var1 = SatParameters.MaxSatAssumptionOrder.valueOf(this.maxSatAssumptionOrder_);
      return var1 == null ? SatParameters.MaxSatAssumptionOrder.DEFAULT_ASSUMPTION_ORDER : var1;
   }

   public boolean hasMaxSatReverseAssumptionOrder() {
      return (this.bitField2_ & 8) != 0;
   }

   public boolean getMaxSatReverseAssumptionOrder() {
      return this.maxSatReverseAssumptionOrder_;
   }

   public boolean hasMaxSatStratification() {
      return (this.bitField2_ & 16) != 0;
   }

   public SatParameters.MaxSatStratificationAlgorithm getMaxSatStratification() {
      SatParameters.MaxSatStratificationAlgorithm var1 = SatParameters.MaxSatStratificationAlgorithm.valueOf(this.maxSatStratification_);
      return var1 == null ? SatParameters.MaxSatStratificationAlgorithm.STRATIFICATION_DESCENT : var1;
   }

   public boolean hasUsePrecedencesInDisjunctiveConstraint() {
      return (this.bitField2_ & 32) != 0;
   }

   public boolean getUsePrecedencesInDisjunctiveConstraint() {
      return this.usePrecedencesInDisjunctiveConstraint_;
   }

   public boolean hasUseOverloadCheckerInCumulativeConstraint() {
      return (this.bitField2_ & 64) != 0;
   }

   public boolean getUseOverloadCheckerInCumulativeConstraint() {
      return this.useOverloadCheckerInCumulativeConstraint_;
   }

   public boolean hasUseTimetableEdgeFindingInCumulativeConstraint() {
      return (this.bitField2_ & 128) != 0;
   }

   public boolean getUseTimetableEdgeFindingInCumulativeConstraint() {
      return this.useTimetableEdgeFindingInCumulativeConstraint_;
   }

   public boolean hasUseDisjunctiveConstraintInCumulativeConstraint() {
      return (this.bitField2_ & 256) != 0;
   }

   public boolean getUseDisjunctiveConstraintInCumulativeConstraint() {
      return this.useDisjunctiveConstraintInCumulativeConstraint_;
   }

   public boolean hasLinearizationLevel() {
      return (this.bitField2_ & 512) != 0;
   }

   public int getLinearizationLevel() {
      return this.linearizationLevel_;
   }

   public boolean hasBooleanEncodingLevel() {
      return (this.bitField2_ & 1024) != 0;
   }

   public int getBooleanEncodingLevel() {
      return this.booleanEncodingLevel_;
   }

   public boolean hasMaxNumCuts() {
      return (this.bitField2_ & 2048) != 0;
   }

   public int getMaxNumCuts() {
      return this.maxNumCuts_;
   }

   public boolean hasOnlyAddCutsAtLevelZero() {
      return (this.bitField2_ & 4096) != 0;
   }

   public boolean getOnlyAddCutsAtLevelZero() {
      return this.onlyAddCutsAtLevelZero_;
   }

   public boolean hasAddKnapsackCuts() {
      return (this.bitField2_ & 8192) != 0;
   }

   public boolean getAddKnapsackCuts() {
      return this.addKnapsackCuts_;
   }

   public boolean hasAddCgCuts() {
      return (this.bitField2_ & 16384) != 0;
   }

   public boolean getAddCgCuts() {
      return this.addCgCuts_;
   }

   public boolean hasAddMirCuts() {
      return (this.bitField2_ & '耀') != 0;
   }

   public boolean getAddMirCuts() {
      return this.addMirCuts_;
   }

   public boolean hasMaxAllDiffCutSize() {
      return (this.bitField2_ & 65536) != 0;
   }

   public int getMaxAllDiffCutSize() {
      return this.maxAllDiffCutSize_;
   }

   public boolean hasUseMirRounding() {
      return (this.bitField2_ & 131072) != 0;
   }

   public boolean getUseMirRounding() {
      return this.useMirRounding_;
   }

   public boolean hasMaxIntegerRoundingScaling() {
      return (this.bitField2_ & 262144) != 0;
   }

   public int getMaxIntegerRoundingScaling() {
      return this.maxIntegerRoundingScaling_;
   }

   public boolean hasAddLpConstraintsLazily() {
      return (this.bitField2_ & 524288) != 0;
   }

   public boolean getAddLpConstraintsLazily() {
      return this.addLpConstraintsLazily_;
   }

   public boolean hasMinOrthogonalityForLpConstraints() {
      return (this.bitField2_ & 1048576) != 0;
   }

   public double getMinOrthogonalityForLpConstraints() {
      return this.minOrthogonalityForLpConstraints_;
   }

   public boolean hasMaxInactiveCount() {
      return (this.bitField2_ & 2097152) != 0;
   }

   public long getMaxInactiveCount() {
      return this.maxInactiveCount_;
   }

   public boolean hasConstraintRemovalBatchSize() {
      return (this.bitField2_ & 4194304) != 0;
   }

   public long getConstraintRemovalBatchSize() {
      return this.constraintRemovalBatchSize_;
   }

   public boolean hasSearchBranching() {
      return (this.bitField2_ & 8388608) != 0;
   }

   public SatParameters.SearchBranching getSearchBranching() {
      SatParameters.SearchBranching var1 = SatParameters.SearchBranching.valueOf(this.searchBranching_);
      return var1 == null ? SatParameters.SearchBranching.AUTOMATIC_SEARCH : var1;
   }

   public boolean hasExploitIntegerLpSolution() {
      return (this.bitField2_ & 16777216) != 0;
   }

   public boolean getExploitIntegerLpSolution() {
      return this.exploitIntegerLpSolution_;
   }

   public boolean hasExploitAllLpSolution() {
      return (this.bitField2_ & 33554432) != 0;
   }

   public boolean getExploitAllLpSolution() {
      return this.exploitAllLpSolution_;
   }

   public boolean hasExploitBestSolution() {
      return (this.bitField2_ & 67108864) != 0;
   }

   public boolean getExploitBestSolution() {
      return this.exploitBestSolution_;
   }

   public boolean hasExploitObjective() {
      return (this.bitField2_ & 134217728) != 0;
   }

   public boolean getExploitObjective() {
      return this.exploitObjective_;
   }

   public boolean hasProbingPeriodAtRoot() {
      return (this.bitField2_ & 268435456) != 0;
   }

   public long getProbingPeriodAtRoot() {
      return this.probingPeriodAtRoot_;
   }

   public boolean hasPseudoCostReliabilityThreshold() {
      return (this.bitField2_ & 536870912) != 0;
   }

   public long getPseudoCostReliabilityThreshold() {
      return this.pseudoCostReliabilityThreshold_;
   }

   public boolean hasOptimizeWithCore() {
      return (this.bitField2_ & 1073741824) != 0;
   }

   public boolean getOptimizeWithCore() {
      return this.optimizeWithCore_;
   }

   public boolean hasBinarySearchNumConflicts() {
      return (this.bitField2_ & Integer.MIN_VALUE) != 0;
   }

   public int getBinarySearchNumConflicts() {
      return this.binarySearchNumConflicts_;
   }

   public boolean hasOptimizeWithMaxHs() {
      return (this.bitField3_ & 1) != 0;
   }

   public boolean getOptimizeWithMaxHs() {
      return this.optimizeWithMaxHs_;
   }

   public boolean hasEnumerateAllSolutions() {
      return (this.bitField3_ & 2) != 0;
   }

   public boolean getEnumerateAllSolutions() {
      return this.enumerateAllSolutions_;
   }

   public boolean hasFillTightenedDomainsInResponse() {
      return (this.bitField3_ & 4) != 0;
   }

   public boolean getFillTightenedDomainsInResponse() {
      return this.fillTightenedDomainsInResponse_;
   }

   public boolean hasInstantiateAllVariables() {
      return (this.bitField3_ & 8) != 0;
   }

   public boolean getInstantiateAllVariables() {
      return this.instantiateAllVariables_;
   }

   public boolean hasAutoDetectGreaterThanAtLeastOneOf() {
      return (this.bitField3_ & 16) != 0;
   }

   public boolean getAutoDetectGreaterThanAtLeastOneOf() {
      return this.autoDetectGreaterThanAtLeastOneOf_;
   }

   public boolean hasStopAfterFirstSolution() {
      return (this.bitField3_ & 32) != 0;
   }

   public boolean getStopAfterFirstSolution() {
      return this.stopAfterFirstSolution_;
   }

   public boolean hasNumSearchWorkers() {
      return (this.bitField3_ & 64) != 0;
   }

   public int getNumSearchWorkers() {
      return this.numSearchWorkers_;
   }

   public boolean hasInterleaveSearch() {
      return (this.bitField3_ & 128) != 0;
   }

   public boolean getInterleaveSearch() {
      return this.interleaveSearch_;
   }

   public boolean hasReduceMemoryUsageInInterleaveMode() {
      return (this.bitField3_ & 256) != 0;
   }

   public boolean getReduceMemoryUsageInInterleaveMode() {
      return this.reduceMemoryUsageInInterleaveMode_;
   }

   public boolean hasDeterministicParallelSearch() {
      return (this.bitField3_ & 512) != 0;
   }

   public boolean getDeterministicParallelSearch() {
      return this.deterministicParallelSearch_;
   }

   public boolean hasShareObjectiveBounds() {
      return (this.bitField3_ & 1024) != 0;
   }

   public boolean getShareObjectiveBounds() {
      return this.shareObjectiveBounds_;
   }

   public boolean hasShareLevelZeroBounds() {
      return (this.bitField3_ & 2048) != 0;
   }

   public boolean getShareLevelZeroBounds() {
      return this.shareLevelZeroBounds_;
   }

   public boolean hasUseLnsOnly() {
      return (this.bitField3_ & 4096) != 0;
   }

   public boolean getUseLnsOnly() {
      return this.useLnsOnly_;
   }

   public boolean hasLnsFocusOnDecisionVariables() {
      return (this.bitField3_ & 8192) != 0;
   }

   public boolean getLnsFocusOnDecisionVariables() {
      return this.lnsFocusOnDecisionVariables_;
   }

   public boolean hasUseRinsLns() {
      return (this.bitField3_ & 16384) != 0;
   }

   public boolean getUseRinsLns() {
      return this.useRinsLns_;
   }

   public boolean hasDiversifyLnsParams() {
      return (this.bitField3_ & '耀') != 0;
   }

   public boolean getDiversifyLnsParams() {
      return this.diversifyLnsParams_;
   }

   public boolean hasRandomizeSearch() {
      return (this.bitField3_ & 65536) != 0;
   }

   public boolean getRandomizeSearch() {
      return this.randomizeSearch_;
   }

   public boolean hasSearchRandomizationTolerance() {
      return (this.bitField3_ & 131072) != 0;
   }

   public long getSearchRandomizationTolerance() {
      return this.searchRandomizationTolerance_;
   }

   public boolean hasUseOptionalVariables() {
      return (this.bitField3_ & 262144) != 0;
   }

   public boolean getUseOptionalVariables() {
      return this.useOptionalVariables_;
   }

   public boolean hasUseExactLpReason() {
      return (this.bitField3_ & 524288) != 0;
   }

   public boolean getUseExactLpReason() {
      return this.useExactLpReason_;
   }

   public boolean hasUseBranchingInLp() {
      return (this.bitField3_ & 1048576) != 0;
   }

   public boolean getUseBranchingInLp() {
      return this.useBranchingInLp_;
   }

   public boolean hasUseCombinedNoOverlap() {
      return (this.bitField3_ & 2097152) != 0;
   }

   public boolean getUseCombinedNoOverlap() {
      return this.useCombinedNoOverlap_;
   }

   public boolean hasCatchSigintSignal() {
      return (this.bitField3_ & 4194304) != 0;
   }

   public boolean getCatchSigintSignal() {
      return this.catchSigintSignal_;
   }

   public boolean hasUseImpliedBounds() {
      return (this.bitField3_ & 8388608) != 0;
   }

   public boolean getUseImpliedBounds() {
      return this.useImpliedBounds_;
   }

   public boolean hasMipMaxBound() {
      return (this.bitField3_ & 16777216) != 0;
   }

   public double getMipMaxBound() {
      return this.mipMaxBound_;
   }

   public boolean hasMipVarScaling() {
      return (this.bitField3_ & 33554432) != 0;
   }

   public double getMipVarScaling() {
      return this.mipVarScaling_;
   }

   public boolean hasMipWantedPrecision() {
      return (this.bitField3_ & 67108864) != 0;
   }

   public double getMipWantedPrecision() {
      return this.mipWantedPrecision_;
   }

   public boolean hasMipMaxActivityExponent() {
      return (this.bitField3_ & 134217728) != 0;
   }

   public int getMipMaxActivityExponent() {
      return this.mipMaxActivityExponent_;
   }

   public boolean hasMipCheckPrecision() {
      return (this.bitField3_ & 268435456) != 0;
   }

   public double getMipCheckPrecision() {
      return this.mipCheckPrecision_;
   }

   public final boolean isInitialized() {
      byte var1 = this.memoizedIsInitialized;
      if (var1 == 1) {
         return true;
      } else if (var1 == 0) {
         return false;
      } else {
         this.memoizedIsInitialized = 1;
         return true;
      }
   }

   public void writeTo(CodedOutputStream var1) throws IOException {
      if ((this.bitField0_ & 1) != 0) {
         var1.writeEnum(1, this.preferredVariableOrder_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeEnum(2, this.initialPolarity_);
      }

      if ((this.bitField0_ & 256) != 0) {
         var1.writeEnum(4, this.minimizationAlgorithm_);
      }

      if ((this.bitField0_ & 2048) != 0) {
         var1.writeInt32(11, this.clauseCleanupPeriod_);
      }

      if ((this.bitField0_ & 4096) != 0) {
         var1.writeInt32(13, this.clauseCleanupTarget_);
      }

      if ((this.bitField0_ & 1048576) != 0) {
         var1.writeDouble(15, this.variableActivityDecay_);
      }

      if ((this.bitField0_ & 2097152) != 0) {
         var1.writeDouble(16, this.maxVariableActivityValue_);
      }

      if ((this.bitField0_ & 33554432) != 0) {
         var1.writeDouble(17, this.clauseActivityDecay_);
      }

      if ((this.bitField0_ & 67108864) != 0) {
         var1.writeDouble(18, this.maxClauseActivityValue_);
      }

      if ((this.bitField0_ & 4194304) != 0) {
         var1.writeDouble(22, this.glucoseMaxDecay_);
      }

      if ((this.bitField0_ & 8388608) != 0) {
         var1.writeDouble(23, this.glucoseDecayIncrement_);
      }

      if ((this.bitField0_ & 16777216) != 0) {
         var1.writeInt32(24, this.glucoseDecayIncrementPeriod_);
      }

      if ((this.bitField0_ & 268435456) != 0) {
         var1.writeInt32(30, this.restartPeriod_);
      }

      if ((this.bitField1_ & 1024) != 0) {
         var1.writeInt32(31, this.randomSeed_);
      }

      if ((this.bitField0_ & 16) != 0) {
         var1.writeDouble(32, this.randomBranchesRatio_);
      }

      if ((this.bitField1_ & 512) != 0) {
         var1.writeBool(33, this.treatBinaryClausesSeparately_);
      }

      if ((this.bitField0_ & 512) != 0) {
         var1.writeEnum(34, this.binaryMinimizationAlgorithm_);
      }

      if ((this.bitField1_ & 1073741824) != 0) {
         var1.writeBool(35, this.useOptimizationHints_);
      }

      if ((this.bitField1_ & 32) != 0) {
         var1.writeDouble(36, this.maxTimeInSeconds_);
      }

      if ((this.bitField1_ & 128) != 0) {
         var1.writeInt64(37, this.maxNumberOfConflicts_);
      }

      if ((this.bitField1_ & 256) != 0) {
         var1.writeInt64(40, this.maxMemoryInMb_);
      }

      if ((this.bitField1_ & 2048) != 0) {
         var1.writeBool(41, this.logSearchProgress_);
      }

      if ((this.bitField1_ & 4096) != 0) {
         var1.writeBool(43, this.usePbResolution_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeBool(44, this.usePhaseSaving_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeDouble(45, this.randomPolarityRatio_);
      }

      if ((this.bitField0_ & 65536) != 0) {
         var1.writeInt32(46, this.pbCleanupIncrement_);
      }

      if ((this.bitField0_ & 131072) != 0) {
         var1.writeDouble(47, this.pbCleanupRatio_);
      }

      if ((this.bitField1_ & 8192) != 0) {
         var1.writeBool(48, this.minimizeReductionDuringPbResolution_);
      }

      if ((this.bitField1_ & 16384) != 0) {
         var1.writeBool(49, this.countAssumptionLevelsInLbd_);
      }

      if ((this.bitField1_ & Integer.MIN_VALUE) != 0) {
         var1.writeBool(50, this.minimizeCore_);
      }

      if ((this.bitField2_ & 4) != 0) {
         var1.writeEnum(51, this.maxSatAssumptionOrder_);
      }

      if ((this.bitField2_ & 8) != 0) {
         var1.writeBool(52, this.maxSatReverseAssumptionOrder_);
      }

      if ((this.bitField2_ & 16) != 0) {
         var1.writeEnum(53, this.maxSatStratification_);
      }

      if ((this.bitField1_ & '耀') != 0) {
         var1.writeInt32(54, this.presolveBveThreshold_);
      }

      if ((this.bitField1_ & 65536) != 0) {
         var1.writeInt32(55, this.presolveBveClauseWeight_);
      }

      if ((this.bitField0_ & 1024) != 0) {
         var1.writeBool(56, this.subsumptionDuringConflictAnalysis_);
      }

      if ((this.bitField1_ & 131072) != 0) {
         var1.writeDouble(57, this.presolveProbingDeterministicTimeLimit_);
      }

      if ((this.bitField0_ & 8192) != 0) {
         var1.writeEnum(58, this.clauseCleanupProtection_);
      }

      if ((this.bitField0_ & 16384) != 0) {
         var1.writeInt32(59, this.clauseCleanupLbdBound_);
      }

      if ((this.bitField0_ & '耀') != 0) {
         var1.writeEnum(60, this.clauseCleanupOrdering_);
      }

      for(int var2 = 0; var2 < this.restartAlgorithms_.size(); ++var2) {
         var1.writeEnum(61, (Integer)this.restartAlgorithms_.get(var2));
      }

      if ((this.bitField0_ & 536870912) != 0) {
         var1.writeInt32(62, this.restartRunningWindowSize_);
      }

      if ((this.bitField0_ & 1073741824) != 0) {
         var1.writeDouble(63, this.restartDlAverageRatio_);
      }

      if ((this.bitField1_ & 1) != 0) {
         var1.writeBool(64, this.useBlockingRestart_);
      }

      if ((this.bitField1_ & 2) != 0) {
         var1.writeInt32(65, this.blockingRestartWindowSize_);
      }

      if ((this.bitField1_ & 4) != 0) {
         var1.writeDouble(66, this.blockingRestartMultiplier_);
      }

      if ((this.bitField1_ & 64) != 0) {
         var1.writeDouble(67, this.maxDeterministicTime_);
      }

      if ((this.bitField1_ & 8) != 0) {
         var1.writeInt32(68, this.numConflictsBeforeStrategyChanges_);
      }

      if ((this.bitField1_ & 16) != 0) {
         var1.writeDouble(69, this.strategyChangeIncreaseRatio_);
      }

      if ((this.bitField0_ & 134217728) != 0) {
         GeneratedMessageV3.writeString(var1, 70, this.defaultRestartAlgorithms_);
      }

      if ((this.bitField0_ & Integer.MIN_VALUE) != 0) {
         var1.writeDouble(71, this.restartLbdAverageRatio_);
      }

      if ((this.bitField1_ & 524288) != 0) {
         var1.writeBool(72, this.presolveUseBva_);
      }

      if ((this.bitField1_ & 1048576) != 0) {
         var1.writeInt32(73, this.presolveBvaThreshold_);
      }

      if ((this.bitField2_ & 32) != 0) {
         var1.writeBool(74, this.usePrecedencesInDisjunctiveConstraint_);
      }

      if ((this.bitField0_ & 32) != 0) {
         var1.writeBool(75, this.useErwaHeuristic_);
      }

      if ((this.bitField0_ & 64) != 0) {
         var1.writeDouble(76, this.initialVariablesActivity_);
      }

      if ((this.bitField0_ & 128) != 0) {
         var1.writeBool(77, this.alsoBumpVariablesInConflictReasons_);
      }

      if ((this.bitField2_ & 64) != 0) {
         var1.writeBool(78, this.useOverloadCheckerInCumulativeConstraint_);
      }

      if ((this.bitField2_ & 128) != 0) {
         var1.writeBool(79, this.useTimetableEdgeFindingInCumulativeConstraint_);
      }

      if ((this.bitField2_ & 256) != 0) {
         var1.writeBool(80, this.useDisjunctiveConstraintInCumulativeConstraint_);
      }

      if ((this.bitField2_ & 8388608) != 0) {
         var1.writeEnum(82, this.searchBranching_);
      }

      if ((this.bitField2_ & 1073741824) != 0) {
         var1.writeBool(83, this.optimizeWithCore_);
      }

      if ((this.bitField2_ & 1) != 0) {
         var1.writeBool(84, this.findMultipleCores_);
      }

      if ((this.bitField3_ & 1) != 0) {
         var1.writeBool(85, this.optimizeWithMaxHs_);
      }

      if ((this.bitField1_ & 4194304) != 0) {
         var1.writeBool(86, this.cpModelPresolve_);
      }

      if ((this.bitField3_ & 2) != 0) {
         var1.writeBool(87, this.enumerateAllSolutions_);
      }

      if ((this.bitField1_ & 262144) != 0) {
         var1.writeBool(88, this.presolveBlockedClause_);
      }

      if ((this.bitField2_ & 2) != 0) {
         var1.writeBool(89, this.coverOptimization_);
      }

      if ((this.bitField2_ & 512) != 0) {
         var1.writeInt32(90, this.linearizationLevel_);
      }

      if ((this.bitField2_ & 2048) != 0) {
         var1.writeInt32(91, this.maxNumCuts_);
      }

      if ((this.bitField2_ & 4096) != 0) {
         var1.writeBool(92, this.onlyAddCutsAtLevelZero_);
      }

      if ((this.bitField1_ & 16777216) != 0) {
         var1.writeBool(93, this.cpModelUseSatPresolve_);
      }

      if ((this.bitField2_ & 16777216) != 0) {
         var1.writeBool(94, this.exploitIntegerLpSolution_);
      }

      if ((this.bitField3_ & 16) != 0) {
         var1.writeBool(95, this.autoDetectGreaterThanAtLeastOneOf_);
      }

      if ((this.bitField0_ & 262144) != 0) {
         var1.writeInt32(96, this.minimizeWithPropagationRestartPeriod_);
      }

      if ((this.bitField0_ & 524288) != 0) {
         var1.writeInt32(97, this.minimizeWithPropagationNumDecisions_);
      }

      if ((this.bitField3_ & 32) != 0) {
         var1.writeBool(98, this.stopAfterFirstSolution_);
      }

      if ((this.bitField2_ & Integer.MIN_VALUE) != 0) {
         var1.writeInt32(99, this.binarySearchNumConflicts_);
      }

      if ((this.bitField3_ & 64) != 0) {
         var1.writeInt32(100, this.numSearchWorkers_);
      }

      if ((this.bitField3_ & 4096) != 0) {
         var1.writeBool(101, this.useLnsOnly_);
      }

      if ((this.bitField3_ & 65536) != 0) {
         var1.writeBool(103, this.randomizeSearch_);
      }

      if ((this.bitField3_ & 131072) != 0) {
         var1.writeInt64(104, this.searchRandomizationTolerance_);
      }

      if ((this.bitField3_ & 8192) != 0) {
         var1.writeBool(105, this.lnsFocusOnDecisionVariables_);
      }

      if ((this.bitField3_ & 8) != 0) {
         var1.writeBool(106, this.instantiateAllVariables_);
      }

      if ((this.bitField2_ & 1024) != 0) {
         var1.writeInt32(107, this.booleanEncodingLevel_);
      }

      if ((this.bitField3_ & 262144) != 0) {
         var1.writeBool(108, this.useOptionalVariables_);
      }

      if ((this.bitField3_ & 524288) != 0) {
         var1.writeBool(109, this.useExactLpReason_);
      }

      if ((this.bitField1_ & 8388608) != 0) {
         var1.writeInt32(110, this.cpModelProbingLevel_);
      }

      if ((this.bitField2_ & 8192) != 0) {
         var1.writeBool(111, this.addKnapsackCuts_);
      }

      if ((this.bitField2_ & 524288) != 0) {
         var1.writeBool(112, this.addLpConstraintsLazily_);
      }

      if ((this.bitField3_ & 1024) != 0) {
         var1.writeBool(113, this.shareObjectiveBounds_);
      }

      if ((this.bitField3_ & 2048) != 0) {
         var1.writeBool(114, this.shareLevelZeroBounds_);
      }

      if ((this.bitField2_ & 1048576) != 0) {
         var1.writeDouble(115, this.minOrthogonalityForLpConstraints_);
      }

      if ((this.bitField2_ & 33554432) != 0) {
         var1.writeBool(116, this.exploitAllLpSolution_);
      }

      if ((this.bitField2_ & 16384) != 0) {
         var1.writeBool(117, this.addCgCuts_);
      }

      if ((this.bitField2_ & 131072) != 0) {
         var1.writeBool(118, this.useMirRounding_);
      }

      if ((this.bitField2_ & 262144) != 0) {
         var1.writeInt32(119, this.maxIntegerRoundingScaling_);
      }

      if ((this.bitField2_ & '耀') != 0) {
         var1.writeBool(120, this.addMirCuts_);
      }

      if ((this.bitField2_ & 2097152) != 0) {
         var1.writeInt64(121, this.maxInactiveCount_);
      }

      if ((this.bitField2_ & 4194304) != 0) {
         var1.writeInt64(122, this.constraintRemovalBatchSize_);
      }

      if ((this.bitField2_ & 536870912) != 0) {
         var1.writeInt64(123, this.pseudoCostReliabilityThreshold_);
      }

      if ((this.bitField3_ & 16777216) != 0) {
         var1.writeDouble(124, this.mipMaxBound_);
      }

      if ((this.bitField3_ & 33554432) != 0) {
         var1.writeDouble(125, this.mipVarScaling_);
      }

      if ((this.bitField3_ & 67108864) != 0) {
         var1.writeDouble(126, this.mipWantedPrecision_);
      }

      if ((this.bitField3_ & 134217728) != 0) {
         var1.writeInt32(127, this.mipMaxActivityExponent_);
      }

      if ((this.bitField3_ & 268435456) != 0) {
         var1.writeDouble(128, this.mipCheckPrecision_);
      }

      if ((this.bitField3_ & 16384) != 0) {
         var1.writeBool(129, this.useRinsLns_);
      }

      if ((this.bitField2_ & 67108864) != 0) {
         var1.writeBool(130, this.exploitBestSolution_);
      }

      if ((this.bitField2_ & 134217728) != 0) {
         var1.writeBool(131, this.exploitObjective_);
      }

      if ((this.bitField3_ & 4) != 0) {
         var1.writeBool(132, this.fillTightenedDomainsInResponse_);
      }

      if ((this.bitField3_ & 2097152) != 0) {
         var1.writeBool(133, this.useCombinedNoOverlap_);
      }

      if ((this.bitField3_ & 512) != 0) {
         var1.writeBool(134, this.deterministicParallelSearch_);
      }

      if ((this.bitField3_ & 4194304) != 0) {
         var1.writeBool(135, this.catchSigintSignal_);
      }

      if ((this.bitField3_ & 128) != 0) {
         var1.writeBool(136, this.interleaveSearch_);
      }

      if ((this.bitField3_ & '耀') != 0) {
         var1.writeBool(137, this.diversifyLnsParams_);
      }

      if ((this.bitField1_ & 2097152) != 0) {
         var1.writeInt32(138, this.maxPresolveIterations_);
      }

      if ((this.bitField3_ & 1048576) != 0) {
         var1.writeBool(139, this.useBranchingInLp_);
      }

      if ((this.bitField1_ & 33554432) != 0) {
         var1.writeBool(140, this.expandElementConstraints_);
      }

      if ((this.bitField3_ & 256) != 0) {
         var1.writeBool(141, this.reduceMemoryUsageInInterleaveMode_);
      }

      if ((this.bitField2_ & 268435456) != 0) {
         var1.writeInt64(142, this.probingPeriodAtRoot_);
      }

      if ((this.bitField1_ & 67108864) != 0) {
         var1.writeBool(143, this.expandAutomatonConstraints_);
      }

      if ((this.bitField3_ & 8388608) != 0) {
         var1.writeBool(144, this.useImpliedBounds_);
      }

      if ((this.bitField1_ & 134217728) != 0) {
         var1.writeDouble(145, this.mergeNoOverlapWorkLimit_);
      }

      if ((this.bitField1_ & 268435456) != 0) {
         var1.writeDouble(146, this.mergeAtMostOneWorkLimit_);
      }

      if ((this.bitField1_ & 536870912) != 0) {
         var1.writeInt32(147, this.presolveSubstitutionLevel_);
      }

      if ((this.bitField2_ & 65536) != 0) {
         var1.writeInt32(148, this.maxAllDiffCutSize_);
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if ((this.bitField0_ & 1) != 0) {
            var1 += CodedOutputStream.computeEnumSize(1, this.preferredVariableOrder_);
         }

         if ((this.bitField0_ & 2) != 0) {
            var1 += CodedOutputStream.computeEnumSize(2, this.initialPolarity_);
         }

         if ((this.bitField0_ & 256) != 0) {
            var1 += CodedOutputStream.computeEnumSize(4, this.minimizationAlgorithm_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            var1 += CodedOutputStream.computeInt32Size(11, this.clauseCleanupPeriod_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            var1 += CodedOutputStream.computeInt32Size(13, this.clauseCleanupTarget_);
         }

         if ((this.bitField0_ & 1048576) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(15, this.variableActivityDecay_);
         }

         if ((this.bitField0_ & 2097152) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(16, this.maxVariableActivityValue_);
         }

         if ((this.bitField0_ & 33554432) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(17, this.clauseActivityDecay_);
         }

         if ((this.bitField0_ & 67108864) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(18, this.maxClauseActivityValue_);
         }

         if ((this.bitField0_ & 4194304) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(22, this.glucoseMaxDecay_);
         }

         if ((this.bitField0_ & 8388608) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(23, this.glucoseDecayIncrement_);
         }

         if ((this.bitField0_ & 16777216) != 0) {
            var1 += CodedOutputStream.computeInt32Size(24, this.glucoseDecayIncrementPeriod_);
         }

         if ((this.bitField0_ & 268435456) != 0) {
            var1 += CodedOutputStream.computeInt32Size(30, this.restartPeriod_);
         }

         if ((this.bitField1_ & 1024) != 0) {
            var1 += CodedOutputStream.computeInt32Size(31, this.randomSeed_);
         }

         if ((this.bitField0_ & 16) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(32, this.randomBranchesRatio_);
         }

         if ((this.bitField1_ & 512) != 0) {
            var1 += CodedOutputStream.computeBoolSize(33, this.treatBinaryClausesSeparately_);
         }

         if ((this.bitField0_ & 512) != 0) {
            var1 += CodedOutputStream.computeEnumSize(34, this.binaryMinimizationAlgorithm_);
         }

         if ((this.bitField1_ & 1073741824) != 0) {
            var1 += CodedOutputStream.computeBoolSize(35, this.useOptimizationHints_);
         }

         if ((this.bitField1_ & 32) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(36, this.maxTimeInSeconds_);
         }

         if ((this.bitField1_ & 128) != 0) {
            var1 += CodedOutputStream.computeInt64Size(37, this.maxNumberOfConflicts_);
         }

         if ((this.bitField1_ & 256) != 0) {
            var1 += CodedOutputStream.computeInt64Size(40, this.maxMemoryInMb_);
         }

         if ((this.bitField1_ & 2048) != 0) {
            var1 += CodedOutputStream.computeBoolSize(41, this.logSearchProgress_);
         }

         if ((this.bitField1_ & 4096) != 0) {
            var1 += CodedOutputStream.computeBoolSize(43, this.usePbResolution_);
         }

         if ((this.bitField0_ & 4) != 0) {
            var1 += CodedOutputStream.computeBoolSize(44, this.usePhaseSaving_);
         }

         if ((this.bitField0_ & 8) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(45, this.randomPolarityRatio_);
         }

         if ((this.bitField0_ & 65536) != 0) {
            var1 += CodedOutputStream.computeInt32Size(46, this.pbCleanupIncrement_);
         }

         if ((this.bitField0_ & 131072) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(47, this.pbCleanupRatio_);
         }

         if ((this.bitField1_ & 8192) != 0) {
            var1 += CodedOutputStream.computeBoolSize(48, this.minimizeReductionDuringPbResolution_);
         }

         if ((this.bitField1_ & 16384) != 0) {
            var1 += CodedOutputStream.computeBoolSize(49, this.countAssumptionLevelsInLbd_);
         }

         if ((this.bitField1_ & Integer.MIN_VALUE) != 0) {
            var1 += CodedOutputStream.computeBoolSize(50, this.minimizeCore_);
         }

         if ((this.bitField2_ & 4) != 0) {
            var1 += CodedOutputStream.computeEnumSize(51, this.maxSatAssumptionOrder_);
         }

         if ((this.bitField2_ & 8) != 0) {
            var1 += CodedOutputStream.computeBoolSize(52, this.maxSatReverseAssumptionOrder_);
         }

         if ((this.bitField2_ & 16) != 0) {
            var1 += CodedOutputStream.computeEnumSize(53, this.maxSatStratification_);
         }

         if ((this.bitField1_ & '耀') != 0) {
            var1 += CodedOutputStream.computeInt32Size(54, this.presolveBveThreshold_);
         }

         if ((this.bitField1_ & 65536) != 0) {
            var1 += CodedOutputStream.computeInt32Size(55, this.presolveBveClauseWeight_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            var1 += CodedOutputStream.computeBoolSize(56, this.subsumptionDuringConflictAnalysis_);
         }

         if ((this.bitField1_ & 131072) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(57, this.presolveProbingDeterministicTimeLimit_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            var1 += CodedOutputStream.computeEnumSize(58, this.clauseCleanupProtection_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            var1 += CodedOutputStream.computeInt32Size(59, this.clauseCleanupLbdBound_);
         }

         if ((this.bitField0_ & '耀') != 0) {
            var1 += CodedOutputStream.computeEnumSize(60, this.clauseCleanupOrdering_);
         }

         int var2 = 0;

         for(int var3 = 0; var3 < this.restartAlgorithms_.size(); ++var3) {
            var2 += CodedOutputStream.computeEnumSizeNoTag((Integer)this.restartAlgorithms_.get(var3));
         }

         var1 += var2;
         var1 += 2 * this.restartAlgorithms_.size();
         if ((this.bitField0_ & 536870912) != 0) {
            var1 += CodedOutputStream.computeInt32Size(62, this.restartRunningWindowSize_);
         }

         if ((this.bitField0_ & 1073741824) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(63, this.restartDlAverageRatio_);
         }

         if ((this.bitField1_ & 1) != 0) {
            var1 += CodedOutputStream.computeBoolSize(64, this.useBlockingRestart_);
         }

         if ((this.bitField1_ & 2) != 0) {
            var1 += CodedOutputStream.computeInt32Size(65, this.blockingRestartWindowSize_);
         }

         if ((this.bitField1_ & 4) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(66, this.blockingRestartMultiplier_);
         }

         if ((this.bitField1_ & 64) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(67, this.maxDeterministicTime_);
         }

         if ((this.bitField1_ & 8) != 0) {
            var1 += CodedOutputStream.computeInt32Size(68, this.numConflictsBeforeStrategyChanges_);
         }

         if ((this.bitField1_ & 16) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(69, this.strategyChangeIncreaseRatio_);
         }

         if ((this.bitField0_ & 134217728) != 0) {
            var1 += GeneratedMessageV3.computeStringSize(70, this.defaultRestartAlgorithms_);
         }

         if ((this.bitField0_ & Integer.MIN_VALUE) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(71, this.restartLbdAverageRatio_);
         }

         if ((this.bitField1_ & 524288) != 0) {
            var1 += CodedOutputStream.computeBoolSize(72, this.presolveUseBva_);
         }

         if ((this.bitField1_ & 1048576) != 0) {
            var1 += CodedOutputStream.computeInt32Size(73, this.presolveBvaThreshold_);
         }

         if ((this.bitField2_ & 32) != 0) {
            var1 += CodedOutputStream.computeBoolSize(74, this.usePrecedencesInDisjunctiveConstraint_);
         }

         if ((this.bitField0_ & 32) != 0) {
            var1 += CodedOutputStream.computeBoolSize(75, this.useErwaHeuristic_);
         }

         if ((this.bitField0_ & 64) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(76, this.initialVariablesActivity_);
         }

         if ((this.bitField0_ & 128) != 0) {
            var1 += CodedOutputStream.computeBoolSize(77, this.alsoBumpVariablesInConflictReasons_);
         }

         if ((this.bitField2_ & 64) != 0) {
            var1 += CodedOutputStream.computeBoolSize(78, this.useOverloadCheckerInCumulativeConstraint_);
         }

         if ((this.bitField2_ & 128) != 0) {
            var1 += CodedOutputStream.computeBoolSize(79, this.useTimetableEdgeFindingInCumulativeConstraint_);
         }

         if ((this.bitField2_ & 256) != 0) {
            var1 += CodedOutputStream.computeBoolSize(80, this.useDisjunctiveConstraintInCumulativeConstraint_);
         }

         if ((this.bitField2_ & 8388608) != 0) {
            var1 += CodedOutputStream.computeEnumSize(82, this.searchBranching_);
         }

         if ((this.bitField2_ & 1073741824) != 0) {
            var1 += CodedOutputStream.computeBoolSize(83, this.optimizeWithCore_);
         }

         if ((this.bitField2_ & 1) != 0) {
            var1 += CodedOutputStream.computeBoolSize(84, this.findMultipleCores_);
         }

         if ((this.bitField3_ & 1) != 0) {
            var1 += CodedOutputStream.computeBoolSize(85, this.optimizeWithMaxHs_);
         }

         if ((this.bitField1_ & 4194304) != 0) {
            var1 += CodedOutputStream.computeBoolSize(86, this.cpModelPresolve_);
         }

         if ((this.bitField3_ & 2) != 0) {
            var1 += CodedOutputStream.computeBoolSize(87, this.enumerateAllSolutions_);
         }

         if ((this.bitField1_ & 262144) != 0) {
            var1 += CodedOutputStream.computeBoolSize(88, this.presolveBlockedClause_);
         }

         if ((this.bitField2_ & 2) != 0) {
            var1 += CodedOutputStream.computeBoolSize(89, this.coverOptimization_);
         }

         if ((this.bitField2_ & 512) != 0) {
            var1 += CodedOutputStream.computeInt32Size(90, this.linearizationLevel_);
         }

         if ((this.bitField2_ & 2048) != 0) {
            var1 += CodedOutputStream.computeInt32Size(91, this.maxNumCuts_);
         }

         if ((this.bitField2_ & 4096) != 0) {
            var1 += CodedOutputStream.computeBoolSize(92, this.onlyAddCutsAtLevelZero_);
         }

         if ((this.bitField1_ & 16777216) != 0) {
            var1 += CodedOutputStream.computeBoolSize(93, this.cpModelUseSatPresolve_);
         }

         if ((this.bitField2_ & 16777216) != 0) {
            var1 += CodedOutputStream.computeBoolSize(94, this.exploitIntegerLpSolution_);
         }

         if ((this.bitField3_ & 16) != 0) {
            var1 += CodedOutputStream.computeBoolSize(95, this.autoDetectGreaterThanAtLeastOneOf_);
         }

         if ((this.bitField0_ & 262144) != 0) {
            var1 += CodedOutputStream.computeInt32Size(96, this.minimizeWithPropagationRestartPeriod_);
         }

         if ((this.bitField0_ & 524288) != 0) {
            var1 += CodedOutputStream.computeInt32Size(97, this.minimizeWithPropagationNumDecisions_);
         }

         if ((this.bitField3_ & 32) != 0) {
            var1 += CodedOutputStream.computeBoolSize(98, this.stopAfterFirstSolution_);
         }

         if ((this.bitField2_ & Integer.MIN_VALUE) != 0) {
            var1 += CodedOutputStream.computeInt32Size(99, this.binarySearchNumConflicts_);
         }

         if ((this.bitField3_ & 64) != 0) {
            var1 += CodedOutputStream.computeInt32Size(100, this.numSearchWorkers_);
         }

         if ((this.bitField3_ & 4096) != 0) {
            var1 += CodedOutputStream.computeBoolSize(101, this.useLnsOnly_);
         }

         if ((this.bitField3_ & 65536) != 0) {
            var1 += CodedOutputStream.computeBoolSize(103, this.randomizeSearch_);
         }

         if ((this.bitField3_ & 131072) != 0) {
            var1 += CodedOutputStream.computeInt64Size(104, this.searchRandomizationTolerance_);
         }

         if ((this.bitField3_ & 8192) != 0) {
            var1 += CodedOutputStream.computeBoolSize(105, this.lnsFocusOnDecisionVariables_);
         }

         if ((this.bitField3_ & 8) != 0) {
            var1 += CodedOutputStream.computeBoolSize(106, this.instantiateAllVariables_);
         }

         if ((this.bitField2_ & 1024) != 0) {
            var1 += CodedOutputStream.computeInt32Size(107, this.booleanEncodingLevel_);
         }

         if ((this.bitField3_ & 262144) != 0) {
            var1 += CodedOutputStream.computeBoolSize(108, this.useOptionalVariables_);
         }

         if ((this.bitField3_ & 524288) != 0) {
            var1 += CodedOutputStream.computeBoolSize(109, this.useExactLpReason_);
         }

         if ((this.bitField1_ & 8388608) != 0) {
            var1 += CodedOutputStream.computeInt32Size(110, this.cpModelProbingLevel_);
         }

         if ((this.bitField2_ & 8192) != 0) {
            var1 += CodedOutputStream.computeBoolSize(111, this.addKnapsackCuts_);
         }

         if ((this.bitField2_ & 524288) != 0) {
            var1 += CodedOutputStream.computeBoolSize(112, this.addLpConstraintsLazily_);
         }

         if ((this.bitField3_ & 1024) != 0) {
            var1 += CodedOutputStream.computeBoolSize(113, this.shareObjectiveBounds_);
         }

         if ((this.bitField3_ & 2048) != 0) {
            var1 += CodedOutputStream.computeBoolSize(114, this.shareLevelZeroBounds_);
         }

         if ((this.bitField2_ & 1048576) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(115, this.minOrthogonalityForLpConstraints_);
         }

         if ((this.bitField2_ & 33554432) != 0) {
            var1 += CodedOutputStream.computeBoolSize(116, this.exploitAllLpSolution_);
         }

         if ((this.bitField2_ & 16384) != 0) {
            var1 += CodedOutputStream.computeBoolSize(117, this.addCgCuts_);
         }

         if ((this.bitField2_ & 131072) != 0) {
            var1 += CodedOutputStream.computeBoolSize(118, this.useMirRounding_);
         }

         if ((this.bitField2_ & 262144) != 0) {
            var1 += CodedOutputStream.computeInt32Size(119, this.maxIntegerRoundingScaling_);
         }

         if ((this.bitField2_ & '耀') != 0) {
            var1 += CodedOutputStream.computeBoolSize(120, this.addMirCuts_);
         }

         if ((this.bitField2_ & 2097152) != 0) {
            var1 += CodedOutputStream.computeInt64Size(121, this.maxInactiveCount_);
         }

         if ((this.bitField2_ & 4194304) != 0) {
            var1 += CodedOutputStream.computeInt64Size(122, this.constraintRemovalBatchSize_);
         }

         if ((this.bitField2_ & 536870912) != 0) {
            var1 += CodedOutputStream.computeInt64Size(123, this.pseudoCostReliabilityThreshold_);
         }

         if ((this.bitField3_ & 16777216) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(124, this.mipMaxBound_);
         }

         if ((this.bitField3_ & 33554432) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(125, this.mipVarScaling_);
         }

         if ((this.bitField3_ & 67108864) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(126, this.mipWantedPrecision_);
         }

         if ((this.bitField3_ & 134217728) != 0) {
            var1 += CodedOutputStream.computeInt32Size(127, this.mipMaxActivityExponent_);
         }

         if ((this.bitField3_ & 268435456) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(128, this.mipCheckPrecision_);
         }

         if ((this.bitField3_ & 16384) != 0) {
            var1 += CodedOutputStream.computeBoolSize(129, this.useRinsLns_);
         }

         if ((this.bitField2_ & 67108864) != 0) {
            var1 += CodedOutputStream.computeBoolSize(130, this.exploitBestSolution_);
         }

         if ((this.bitField2_ & 134217728) != 0) {
            var1 += CodedOutputStream.computeBoolSize(131, this.exploitObjective_);
         }

         if ((this.bitField3_ & 4) != 0) {
            var1 += CodedOutputStream.computeBoolSize(132, this.fillTightenedDomainsInResponse_);
         }

         if ((this.bitField3_ & 2097152) != 0) {
            var1 += CodedOutputStream.computeBoolSize(133, this.useCombinedNoOverlap_);
         }

         if ((this.bitField3_ & 512) != 0) {
            var1 += CodedOutputStream.computeBoolSize(134, this.deterministicParallelSearch_);
         }

         if ((this.bitField3_ & 4194304) != 0) {
            var1 += CodedOutputStream.computeBoolSize(135, this.catchSigintSignal_);
         }

         if ((this.bitField3_ & 128) != 0) {
            var1 += CodedOutputStream.computeBoolSize(136, this.interleaveSearch_);
         }

         if ((this.bitField3_ & '耀') != 0) {
            var1 += CodedOutputStream.computeBoolSize(137, this.diversifyLnsParams_);
         }

         if ((this.bitField1_ & 2097152) != 0) {
            var1 += CodedOutputStream.computeInt32Size(138, this.maxPresolveIterations_);
         }

         if ((this.bitField3_ & 1048576) != 0) {
            var1 += CodedOutputStream.computeBoolSize(139, this.useBranchingInLp_);
         }

         if ((this.bitField1_ & 33554432) != 0) {
            var1 += CodedOutputStream.computeBoolSize(140, this.expandElementConstraints_);
         }

         if ((this.bitField3_ & 256) != 0) {
            var1 += CodedOutputStream.computeBoolSize(141, this.reduceMemoryUsageInInterleaveMode_);
         }

         if ((this.bitField2_ & 268435456) != 0) {
            var1 += CodedOutputStream.computeInt64Size(142, this.probingPeriodAtRoot_);
         }

         if ((this.bitField1_ & 67108864) != 0) {
            var1 += CodedOutputStream.computeBoolSize(143, this.expandAutomatonConstraints_);
         }

         if ((this.bitField3_ & 8388608) != 0) {
            var1 += CodedOutputStream.computeBoolSize(144, this.useImpliedBounds_);
         }

         if ((this.bitField1_ & 134217728) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(145, this.mergeNoOverlapWorkLimit_);
         }

         if ((this.bitField1_ & 268435456) != 0) {
            var1 += CodedOutputStream.computeDoubleSize(146, this.mergeAtMostOneWorkLimit_);
         }

         if ((this.bitField1_ & 536870912) != 0) {
            var1 += CodedOutputStream.computeInt32Size(147, this.presolveSubstitutionLevel_);
         }

         if ((this.bitField2_ & 65536) != 0) {
            var1 += CodedOutputStream.computeInt32Size(148, this.maxAllDiffCutSize_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SatParameters)) {
         return super.equals(var1);
      } else {
         SatParameters var2 = (SatParameters)var1;
         if (this.hasPreferredVariableOrder() != var2.hasPreferredVariableOrder()) {
            return false;
         } else if (this.hasPreferredVariableOrder() && this.preferredVariableOrder_ != var2.preferredVariableOrder_) {
            return false;
         } else if (this.hasInitialPolarity() != var2.hasInitialPolarity()) {
            return false;
         } else if (this.hasInitialPolarity() && this.initialPolarity_ != var2.initialPolarity_) {
            return false;
         } else if (this.hasUsePhaseSaving() != var2.hasUsePhaseSaving()) {
            return false;
         } else if (this.hasUsePhaseSaving() && this.getUsePhaseSaving() != var2.getUsePhaseSaving()) {
            return false;
         } else if (this.hasRandomPolarityRatio() != var2.hasRandomPolarityRatio()) {
            return false;
         } else if (this.hasRandomPolarityRatio() && Double.doubleToLongBits(this.getRandomPolarityRatio()) != Double.doubleToLongBits(var2.getRandomPolarityRatio())) {
            return false;
         } else if (this.hasRandomBranchesRatio() != var2.hasRandomBranchesRatio()) {
            return false;
         } else if (this.hasRandomBranchesRatio() && Double.doubleToLongBits(this.getRandomBranchesRatio()) != Double.doubleToLongBits(var2.getRandomBranchesRatio())) {
            return false;
         } else if (this.hasUseErwaHeuristic() != var2.hasUseErwaHeuristic()) {
            return false;
         } else if (this.hasUseErwaHeuristic() && this.getUseErwaHeuristic() != var2.getUseErwaHeuristic()) {
            return false;
         } else if (this.hasInitialVariablesActivity() != var2.hasInitialVariablesActivity()) {
            return false;
         } else if (this.hasInitialVariablesActivity() && Double.doubleToLongBits(this.getInitialVariablesActivity()) != Double.doubleToLongBits(var2.getInitialVariablesActivity())) {
            return false;
         } else if (this.hasAlsoBumpVariablesInConflictReasons() != var2.hasAlsoBumpVariablesInConflictReasons()) {
            return false;
         } else if (this.hasAlsoBumpVariablesInConflictReasons() && this.getAlsoBumpVariablesInConflictReasons() != var2.getAlsoBumpVariablesInConflictReasons()) {
            return false;
         } else if (this.hasMinimizationAlgorithm() != var2.hasMinimizationAlgorithm()) {
            return false;
         } else if (this.hasMinimizationAlgorithm() && this.minimizationAlgorithm_ != var2.minimizationAlgorithm_) {
            return false;
         } else if (this.hasBinaryMinimizationAlgorithm() != var2.hasBinaryMinimizationAlgorithm()) {
            return false;
         } else if (this.hasBinaryMinimizationAlgorithm() && this.binaryMinimizationAlgorithm_ != var2.binaryMinimizationAlgorithm_) {
            return false;
         } else if (this.hasSubsumptionDuringConflictAnalysis() != var2.hasSubsumptionDuringConflictAnalysis()) {
            return false;
         } else if (this.hasSubsumptionDuringConflictAnalysis() && this.getSubsumptionDuringConflictAnalysis() != var2.getSubsumptionDuringConflictAnalysis()) {
            return false;
         } else if (this.hasClauseCleanupPeriod() != var2.hasClauseCleanupPeriod()) {
            return false;
         } else if (this.hasClauseCleanupPeriod() && this.getClauseCleanupPeriod() != var2.getClauseCleanupPeriod()) {
            return false;
         } else if (this.hasClauseCleanupTarget() != var2.hasClauseCleanupTarget()) {
            return false;
         } else if (this.hasClauseCleanupTarget() && this.getClauseCleanupTarget() != var2.getClauseCleanupTarget()) {
            return false;
         } else if (this.hasClauseCleanupProtection() != var2.hasClauseCleanupProtection()) {
            return false;
         } else if (this.hasClauseCleanupProtection() && this.clauseCleanupProtection_ != var2.clauseCleanupProtection_) {
            return false;
         } else if (this.hasClauseCleanupLbdBound() != var2.hasClauseCleanupLbdBound()) {
            return false;
         } else if (this.hasClauseCleanupLbdBound() && this.getClauseCleanupLbdBound() != var2.getClauseCleanupLbdBound()) {
            return false;
         } else if (this.hasClauseCleanupOrdering() != var2.hasClauseCleanupOrdering()) {
            return false;
         } else if (this.hasClauseCleanupOrdering() && this.clauseCleanupOrdering_ != var2.clauseCleanupOrdering_) {
            return false;
         } else if (this.hasPbCleanupIncrement() != var2.hasPbCleanupIncrement()) {
            return false;
         } else if (this.hasPbCleanupIncrement() && this.getPbCleanupIncrement() != var2.getPbCleanupIncrement()) {
            return false;
         } else if (this.hasPbCleanupRatio() != var2.hasPbCleanupRatio()) {
            return false;
         } else if (this.hasPbCleanupRatio() && Double.doubleToLongBits(this.getPbCleanupRatio()) != Double.doubleToLongBits(var2.getPbCleanupRatio())) {
            return false;
         } else if (this.hasMinimizeWithPropagationRestartPeriod() != var2.hasMinimizeWithPropagationRestartPeriod()) {
            return false;
         } else if (this.hasMinimizeWithPropagationRestartPeriod() && this.getMinimizeWithPropagationRestartPeriod() != var2.getMinimizeWithPropagationRestartPeriod()) {
            return false;
         } else if (this.hasMinimizeWithPropagationNumDecisions() != var2.hasMinimizeWithPropagationNumDecisions()) {
            return false;
         } else if (this.hasMinimizeWithPropagationNumDecisions() && this.getMinimizeWithPropagationNumDecisions() != var2.getMinimizeWithPropagationNumDecisions()) {
            return false;
         } else if (this.hasVariableActivityDecay() != var2.hasVariableActivityDecay()) {
            return false;
         } else if (this.hasVariableActivityDecay() && Double.doubleToLongBits(this.getVariableActivityDecay()) != Double.doubleToLongBits(var2.getVariableActivityDecay())) {
            return false;
         } else if (this.hasMaxVariableActivityValue() != var2.hasMaxVariableActivityValue()) {
            return false;
         } else if (this.hasMaxVariableActivityValue() && Double.doubleToLongBits(this.getMaxVariableActivityValue()) != Double.doubleToLongBits(var2.getMaxVariableActivityValue())) {
            return false;
         } else if (this.hasGlucoseMaxDecay() != var2.hasGlucoseMaxDecay()) {
            return false;
         } else if (this.hasGlucoseMaxDecay() && Double.doubleToLongBits(this.getGlucoseMaxDecay()) != Double.doubleToLongBits(var2.getGlucoseMaxDecay())) {
            return false;
         } else if (this.hasGlucoseDecayIncrement() != var2.hasGlucoseDecayIncrement()) {
            return false;
         } else if (this.hasGlucoseDecayIncrement() && Double.doubleToLongBits(this.getGlucoseDecayIncrement()) != Double.doubleToLongBits(var2.getGlucoseDecayIncrement())) {
            return false;
         } else if (this.hasGlucoseDecayIncrementPeriod() != var2.hasGlucoseDecayIncrementPeriod()) {
            return false;
         } else if (this.hasGlucoseDecayIncrementPeriod() && this.getGlucoseDecayIncrementPeriod() != var2.getGlucoseDecayIncrementPeriod()) {
            return false;
         } else if (this.hasClauseActivityDecay() != var2.hasClauseActivityDecay()) {
            return false;
         } else if (this.hasClauseActivityDecay() && Double.doubleToLongBits(this.getClauseActivityDecay()) != Double.doubleToLongBits(var2.getClauseActivityDecay())) {
            return false;
         } else if (this.hasMaxClauseActivityValue() != var2.hasMaxClauseActivityValue()) {
            return false;
         } else if (this.hasMaxClauseActivityValue() && Double.doubleToLongBits(this.getMaxClauseActivityValue()) != Double.doubleToLongBits(var2.getMaxClauseActivityValue())) {
            return false;
         } else if (!this.restartAlgorithms_.equals(var2.restartAlgorithms_)) {
            return false;
         } else if (this.hasDefaultRestartAlgorithms() != var2.hasDefaultRestartAlgorithms()) {
            return false;
         } else if (this.hasDefaultRestartAlgorithms() && !this.getDefaultRestartAlgorithms().equals(var2.getDefaultRestartAlgorithms())) {
            return false;
         } else if (this.hasRestartPeriod() != var2.hasRestartPeriod()) {
            return false;
         } else if (this.hasRestartPeriod() && this.getRestartPeriod() != var2.getRestartPeriod()) {
            return false;
         } else if (this.hasRestartRunningWindowSize() != var2.hasRestartRunningWindowSize()) {
            return false;
         } else if (this.hasRestartRunningWindowSize() && this.getRestartRunningWindowSize() != var2.getRestartRunningWindowSize()) {
            return false;
         } else if (this.hasRestartDlAverageRatio() != var2.hasRestartDlAverageRatio()) {
            return false;
         } else if (this.hasRestartDlAverageRatio() && Double.doubleToLongBits(this.getRestartDlAverageRatio()) != Double.doubleToLongBits(var2.getRestartDlAverageRatio())) {
            return false;
         } else if (this.hasRestartLbdAverageRatio() != var2.hasRestartLbdAverageRatio()) {
            return false;
         } else if (this.hasRestartLbdAverageRatio() && Double.doubleToLongBits(this.getRestartLbdAverageRatio()) != Double.doubleToLongBits(var2.getRestartLbdAverageRatio())) {
            return false;
         } else if (this.hasUseBlockingRestart() != var2.hasUseBlockingRestart()) {
            return false;
         } else if (this.hasUseBlockingRestart() && this.getUseBlockingRestart() != var2.getUseBlockingRestart()) {
            return false;
         } else if (this.hasBlockingRestartWindowSize() != var2.hasBlockingRestartWindowSize()) {
            return false;
         } else if (this.hasBlockingRestartWindowSize() && this.getBlockingRestartWindowSize() != var2.getBlockingRestartWindowSize()) {
            return false;
         } else if (this.hasBlockingRestartMultiplier() != var2.hasBlockingRestartMultiplier()) {
            return false;
         } else if (this.hasBlockingRestartMultiplier() && Double.doubleToLongBits(this.getBlockingRestartMultiplier()) != Double.doubleToLongBits(var2.getBlockingRestartMultiplier())) {
            return false;
         } else if (this.hasNumConflictsBeforeStrategyChanges() != var2.hasNumConflictsBeforeStrategyChanges()) {
            return false;
         } else if (this.hasNumConflictsBeforeStrategyChanges() && this.getNumConflictsBeforeStrategyChanges() != var2.getNumConflictsBeforeStrategyChanges()) {
            return false;
         } else if (this.hasStrategyChangeIncreaseRatio() != var2.hasStrategyChangeIncreaseRatio()) {
            return false;
         } else if (this.hasStrategyChangeIncreaseRatio() && Double.doubleToLongBits(this.getStrategyChangeIncreaseRatio()) != Double.doubleToLongBits(var2.getStrategyChangeIncreaseRatio())) {
            return false;
         } else if (this.hasMaxTimeInSeconds() != var2.hasMaxTimeInSeconds()) {
            return false;
         } else if (this.hasMaxTimeInSeconds() && Double.doubleToLongBits(this.getMaxTimeInSeconds()) != Double.doubleToLongBits(var2.getMaxTimeInSeconds())) {
            return false;
         } else if (this.hasMaxDeterministicTime() != var2.hasMaxDeterministicTime()) {
            return false;
         } else if (this.hasMaxDeterministicTime() && Double.doubleToLongBits(this.getMaxDeterministicTime()) != Double.doubleToLongBits(var2.getMaxDeterministicTime())) {
            return false;
         } else if (this.hasMaxNumberOfConflicts() != var2.hasMaxNumberOfConflicts()) {
            return false;
         } else if (this.hasMaxNumberOfConflicts() && this.getMaxNumberOfConflicts() != var2.getMaxNumberOfConflicts()) {
            return false;
         } else if (this.hasMaxMemoryInMb() != var2.hasMaxMemoryInMb()) {
            return false;
         } else if (this.hasMaxMemoryInMb() && this.getMaxMemoryInMb() != var2.getMaxMemoryInMb()) {
            return false;
         } else if (this.hasTreatBinaryClausesSeparately() != var2.hasTreatBinaryClausesSeparately()) {
            return false;
         } else if (this.hasTreatBinaryClausesSeparately() && this.getTreatBinaryClausesSeparately() != var2.getTreatBinaryClausesSeparately()) {
            return false;
         } else if (this.hasRandomSeed() != var2.hasRandomSeed()) {
            return false;
         } else if (this.hasRandomSeed() && this.getRandomSeed() != var2.getRandomSeed()) {
            return false;
         } else if (this.hasLogSearchProgress() != var2.hasLogSearchProgress()) {
            return false;
         } else if (this.hasLogSearchProgress() && this.getLogSearchProgress() != var2.getLogSearchProgress()) {
            return false;
         } else if (this.hasUsePbResolution() != var2.hasUsePbResolution()) {
            return false;
         } else if (this.hasUsePbResolution() && this.getUsePbResolution() != var2.getUsePbResolution()) {
            return false;
         } else if (this.hasMinimizeReductionDuringPbResolution() != var2.hasMinimizeReductionDuringPbResolution()) {
            return false;
         } else if (this.hasMinimizeReductionDuringPbResolution() && this.getMinimizeReductionDuringPbResolution() != var2.getMinimizeReductionDuringPbResolution()) {
            return false;
         } else if (this.hasCountAssumptionLevelsInLbd() != var2.hasCountAssumptionLevelsInLbd()) {
            return false;
         } else if (this.hasCountAssumptionLevelsInLbd() && this.getCountAssumptionLevelsInLbd() != var2.getCountAssumptionLevelsInLbd()) {
            return false;
         } else if (this.hasPresolveBveThreshold() != var2.hasPresolveBveThreshold()) {
            return false;
         } else if (this.hasPresolveBveThreshold() && this.getPresolveBveThreshold() != var2.getPresolveBveThreshold()) {
            return false;
         } else if (this.hasPresolveBveClauseWeight() != var2.hasPresolveBveClauseWeight()) {
            return false;
         } else if (this.hasPresolveBveClauseWeight() && this.getPresolveBveClauseWeight() != var2.getPresolveBveClauseWeight()) {
            return false;
         } else if (this.hasPresolveProbingDeterministicTimeLimit() != var2.hasPresolveProbingDeterministicTimeLimit()) {
            return false;
         } else if (this.hasPresolveProbingDeterministicTimeLimit() && Double.doubleToLongBits(this.getPresolveProbingDeterministicTimeLimit()) != Double.doubleToLongBits(var2.getPresolveProbingDeterministicTimeLimit())) {
            return false;
         } else if (this.hasPresolveBlockedClause() != var2.hasPresolveBlockedClause()) {
            return false;
         } else if (this.hasPresolveBlockedClause() && this.getPresolveBlockedClause() != var2.getPresolveBlockedClause()) {
            return false;
         } else if (this.hasPresolveUseBva() != var2.hasPresolveUseBva()) {
            return false;
         } else if (this.hasPresolveUseBva() && this.getPresolveUseBva() != var2.getPresolveUseBva()) {
            return false;
         } else if (this.hasPresolveBvaThreshold() != var2.hasPresolveBvaThreshold()) {
            return false;
         } else if (this.hasPresolveBvaThreshold() && this.getPresolveBvaThreshold() != var2.getPresolveBvaThreshold()) {
            return false;
         } else if (this.hasMaxPresolveIterations() != var2.hasMaxPresolveIterations()) {
            return false;
         } else if (this.hasMaxPresolveIterations() && this.getMaxPresolveIterations() != var2.getMaxPresolveIterations()) {
            return false;
         } else if (this.hasCpModelPresolve() != var2.hasCpModelPresolve()) {
            return false;
         } else if (this.hasCpModelPresolve() && this.getCpModelPresolve() != var2.getCpModelPresolve()) {
            return false;
         } else if (this.hasCpModelProbingLevel() != var2.hasCpModelProbingLevel()) {
            return false;
         } else if (this.hasCpModelProbingLevel() && this.getCpModelProbingLevel() != var2.getCpModelProbingLevel()) {
            return false;
         } else if (this.hasCpModelUseSatPresolve() != var2.hasCpModelUseSatPresolve()) {
            return false;
         } else if (this.hasCpModelUseSatPresolve() && this.getCpModelUseSatPresolve() != var2.getCpModelUseSatPresolve()) {
            return false;
         } else if (this.hasExpandElementConstraints() != var2.hasExpandElementConstraints()) {
            return false;
         } else if (this.hasExpandElementConstraints() && this.getExpandElementConstraints() != var2.getExpandElementConstraints()) {
            return false;
         } else if (this.hasExpandAutomatonConstraints() != var2.hasExpandAutomatonConstraints()) {
            return false;
         } else if (this.hasExpandAutomatonConstraints() && this.getExpandAutomatonConstraints() != var2.getExpandAutomatonConstraints()) {
            return false;
         } else if (this.hasMergeNoOverlapWorkLimit() != var2.hasMergeNoOverlapWorkLimit()) {
            return false;
         } else if (this.hasMergeNoOverlapWorkLimit() && Double.doubleToLongBits(this.getMergeNoOverlapWorkLimit()) != Double.doubleToLongBits(var2.getMergeNoOverlapWorkLimit())) {
            return false;
         } else if (this.hasMergeAtMostOneWorkLimit() != var2.hasMergeAtMostOneWorkLimit()) {
            return false;
         } else if (this.hasMergeAtMostOneWorkLimit() && Double.doubleToLongBits(this.getMergeAtMostOneWorkLimit()) != Double.doubleToLongBits(var2.getMergeAtMostOneWorkLimit())) {
            return false;
         } else if (this.hasPresolveSubstitutionLevel() != var2.hasPresolveSubstitutionLevel()) {
            return false;
         } else if (this.hasPresolveSubstitutionLevel() && this.getPresolveSubstitutionLevel() != var2.getPresolveSubstitutionLevel()) {
            return false;
         } else if (this.hasUseOptimizationHints() != var2.hasUseOptimizationHints()) {
            return false;
         } else if (this.hasUseOptimizationHints() && this.getUseOptimizationHints() != var2.getUseOptimizationHints()) {
            return false;
         } else if (this.hasMinimizeCore() != var2.hasMinimizeCore()) {
            return false;
         } else if (this.hasMinimizeCore() && this.getMinimizeCore() != var2.getMinimizeCore()) {
            return false;
         } else if (this.hasFindMultipleCores() != var2.hasFindMultipleCores()) {
            return false;
         } else if (this.hasFindMultipleCores() && this.getFindMultipleCores() != var2.getFindMultipleCores()) {
            return false;
         } else if (this.hasCoverOptimization() != var2.hasCoverOptimization()) {
            return false;
         } else if (this.hasCoverOptimization() && this.getCoverOptimization() != var2.getCoverOptimization()) {
            return false;
         } else if (this.hasMaxSatAssumptionOrder() != var2.hasMaxSatAssumptionOrder()) {
            return false;
         } else if (this.hasMaxSatAssumptionOrder() && this.maxSatAssumptionOrder_ != var2.maxSatAssumptionOrder_) {
            return false;
         } else if (this.hasMaxSatReverseAssumptionOrder() != var2.hasMaxSatReverseAssumptionOrder()) {
            return false;
         } else if (this.hasMaxSatReverseAssumptionOrder() && this.getMaxSatReverseAssumptionOrder() != var2.getMaxSatReverseAssumptionOrder()) {
            return false;
         } else if (this.hasMaxSatStratification() != var2.hasMaxSatStratification()) {
            return false;
         } else if (this.hasMaxSatStratification() && this.maxSatStratification_ != var2.maxSatStratification_) {
            return false;
         } else if (this.hasUsePrecedencesInDisjunctiveConstraint() != var2.hasUsePrecedencesInDisjunctiveConstraint()) {
            return false;
         } else if (this.hasUsePrecedencesInDisjunctiveConstraint() && this.getUsePrecedencesInDisjunctiveConstraint() != var2.getUsePrecedencesInDisjunctiveConstraint()) {
            return false;
         } else if (this.hasUseOverloadCheckerInCumulativeConstraint() != var2.hasUseOverloadCheckerInCumulativeConstraint()) {
            return false;
         } else if (this.hasUseOverloadCheckerInCumulativeConstraint() && this.getUseOverloadCheckerInCumulativeConstraint() != var2.getUseOverloadCheckerInCumulativeConstraint()) {
            return false;
         } else if (this.hasUseTimetableEdgeFindingInCumulativeConstraint() != var2.hasUseTimetableEdgeFindingInCumulativeConstraint()) {
            return false;
         } else if (this.hasUseTimetableEdgeFindingInCumulativeConstraint() && this.getUseTimetableEdgeFindingInCumulativeConstraint() != var2.getUseTimetableEdgeFindingInCumulativeConstraint()) {
            return false;
         } else if (this.hasUseDisjunctiveConstraintInCumulativeConstraint() != var2.hasUseDisjunctiveConstraintInCumulativeConstraint()) {
            return false;
         } else if (this.hasUseDisjunctiveConstraintInCumulativeConstraint() && this.getUseDisjunctiveConstraintInCumulativeConstraint() != var2.getUseDisjunctiveConstraintInCumulativeConstraint()) {
            return false;
         } else if (this.hasLinearizationLevel() != var2.hasLinearizationLevel()) {
            return false;
         } else if (this.hasLinearizationLevel() && this.getLinearizationLevel() != var2.getLinearizationLevel()) {
            return false;
         } else if (this.hasBooleanEncodingLevel() != var2.hasBooleanEncodingLevel()) {
            return false;
         } else if (this.hasBooleanEncodingLevel() && this.getBooleanEncodingLevel() != var2.getBooleanEncodingLevel()) {
            return false;
         } else if (this.hasMaxNumCuts() != var2.hasMaxNumCuts()) {
            return false;
         } else if (this.hasMaxNumCuts() && this.getMaxNumCuts() != var2.getMaxNumCuts()) {
            return false;
         } else if (this.hasOnlyAddCutsAtLevelZero() != var2.hasOnlyAddCutsAtLevelZero()) {
            return false;
         } else if (this.hasOnlyAddCutsAtLevelZero() && this.getOnlyAddCutsAtLevelZero() != var2.getOnlyAddCutsAtLevelZero()) {
            return false;
         } else if (this.hasAddKnapsackCuts() != var2.hasAddKnapsackCuts()) {
            return false;
         } else if (this.hasAddKnapsackCuts() && this.getAddKnapsackCuts() != var2.getAddKnapsackCuts()) {
            return false;
         } else if (this.hasAddCgCuts() != var2.hasAddCgCuts()) {
            return false;
         } else if (this.hasAddCgCuts() && this.getAddCgCuts() != var2.getAddCgCuts()) {
            return false;
         } else if (this.hasAddMirCuts() != var2.hasAddMirCuts()) {
            return false;
         } else if (this.hasAddMirCuts() && this.getAddMirCuts() != var2.getAddMirCuts()) {
            return false;
         } else if (this.hasMaxAllDiffCutSize() != var2.hasMaxAllDiffCutSize()) {
            return false;
         } else if (this.hasMaxAllDiffCutSize() && this.getMaxAllDiffCutSize() != var2.getMaxAllDiffCutSize()) {
            return false;
         } else if (this.hasUseMirRounding() != var2.hasUseMirRounding()) {
            return false;
         } else if (this.hasUseMirRounding() && this.getUseMirRounding() != var2.getUseMirRounding()) {
            return false;
         } else if (this.hasMaxIntegerRoundingScaling() != var2.hasMaxIntegerRoundingScaling()) {
            return false;
         } else if (this.hasMaxIntegerRoundingScaling() && this.getMaxIntegerRoundingScaling() != var2.getMaxIntegerRoundingScaling()) {
            return false;
         } else if (this.hasAddLpConstraintsLazily() != var2.hasAddLpConstraintsLazily()) {
            return false;
         } else if (this.hasAddLpConstraintsLazily() && this.getAddLpConstraintsLazily() != var2.getAddLpConstraintsLazily()) {
            return false;
         } else if (this.hasMinOrthogonalityForLpConstraints() != var2.hasMinOrthogonalityForLpConstraints()) {
            return false;
         } else if (this.hasMinOrthogonalityForLpConstraints() && Double.doubleToLongBits(this.getMinOrthogonalityForLpConstraints()) != Double.doubleToLongBits(var2.getMinOrthogonalityForLpConstraints())) {
            return false;
         } else if (this.hasMaxInactiveCount() != var2.hasMaxInactiveCount()) {
            return false;
         } else if (this.hasMaxInactiveCount() && this.getMaxInactiveCount() != var2.getMaxInactiveCount()) {
            return false;
         } else if (this.hasConstraintRemovalBatchSize() != var2.hasConstraintRemovalBatchSize()) {
            return false;
         } else if (this.hasConstraintRemovalBatchSize() && this.getConstraintRemovalBatchSize() != var2.getConstraintRemovalBatchSize()) {
            return false;
         } else if (this.hasSearchBranching() != var2.hasSearchBranching()) {
            return false;
         } else if (this.hasSearchBranching() && this.searchBranching_ != var2.searchBranching_) {
            return false;
         } else if (this.hasExploitIntegerLpSolution() != var2.hasExploitIntegerLpSolution()) {
            return false;
         } else if (this.hasExploitIntegerLpSolution() && this.getExploitIntegerLpSolution() != var2.getExploitIntegerLpSolution()) {
            return false;
         } else if (this.hasExploitAllLpSolution() != var2.hasExploitAllLpSolution()) {
            return false;
         } else if (this.hasExploitAllLpSolution() && this.getExploitAllLpSolution() != var2.getExploitAllLpSolution()) {
            return false;
         } else if (this.hasExploitBestSolution() != var2.hasExploitBestSolution()) {
            return false;
         } else if (this.hasExploitBestSolution() && this.getExploitBestSolution() != var2.getExploitBestSolution()) {
            return false;
         } else if (this.hasExploitObjective() != var2.hasExploitObjective()) {
            return false;
         } else if (this.hasExploitObjective() && this.getExploitObjective() != var2.getExploitObjective()) {
            return false;
         } else if (this.hasProbingPeriodAtRoot() != var2.hasProbingPeriodAtRoot()) {
            return false;
         } else if (this.hasProbingPeriodAtRoot() && this.getProbingPeriodAtRoot() != var2.getProbingPeriodAtRoot()) {
            return false;
         } else if (this.hasPseudoCostReliabilityThreshold() != var2.hasPseudoCostReliabilityThreshold()) {
            return false;
         } else if (this.hasPseudoCostReliabilityThreshold() && this.getPseudoCostReliabilityThreshold() != var2.getPseudoCostReliabilityThreshold()) {
            return false;
         } else if (this.hasOptimizeWithCore() != var2.hasOptimizeWithCore()) {
            return false;
         } else if (this.hasOptimizeWithCore() && this.getOptimizeWithCore() != var2.getOptimizeWithCore()) {
            return false;
         } else if (this.hasBinarySearchNumConflicts() != var2.hasBinarySearchNumConflicts()) {
            return false;
         } else if (this.hasBinarySearchNumConflicts() && this.getBinarySearchNumConflicts() != var2.getBinarySearchNumConflicts()) {
            return false;
         } else if (this.hasOptimizeWithMaxHs() != var2.hasOptimizeWithMaxHs()) {
            return false;
         } else if (this.hasOptimizeWithMaxHs() && this.getOptimizeWithMaxHs() != var2.getOptimizeWithMaxHs()) {
            return false;
         } else if (this.hasEnumerateAllSolutions() != var2.hasEnumerateAllSolutions()) {
            return false;
         } else if (this.hasEnumerateAllSolutions() && this.getEnumerateAllSolutions() != var2.getEnumerateAllSolutions()) {
            return false;
         } else if (this.hasFillTightenedDomainsInResponse() != var2.hasFillTightenedDomainsInResponse()) {
            return false;
         } else if (this.hasFillTightenedDomainsInResponse() && this.getFillTightenedDomainsInResponse() != var2.getFillTightenedDomainsInResponse()) {
            return false;
         } else if (this.hasInstantiateAllVariables() != var2.hasInstantiateAllVariables()) {
            return false;
         } else if (this.hasInstantiateAllVariables() && this.getInstantiateAllVariables() != var2.getInstantiateAllVariables()) {
            return false;
         } else if (this.hasAutoDetectGreaterThanAtLeastOneOf() != var2.hasAutoDetectGreaterThanAtLeastOneOf()) {
            return false;
         } else if (this.hasAutoDetectGreaterThanAtLeastOneOf() && this.getAutoDetectGreaterThanAtLeastOneOf() != var2.getAutoDetectGreaterThanAtLeastOneOf()) {
            return false;
         } else if (this.hasStopAfterFirstSolution() != var2.hasStopAfterFirstSolution()) {
            return false;
         } else if (this.hasStopAfterFirstSolution() && this.getStopAfterFirstSolution() != var2.getStopAfterFirstSolution()) {
            return false;
         } else if (this.hasNumSearchWorkers() != var2.hasNumSearchWorkers()) {
            return false;
         } else if (this.hasNumSearchWorkers() && this.getNumSearchWorkers() != var2.getNumSearchWorkers()) {
            return false;
         } else if (this.hasInterleaveSearch() != var2.hasInterleaveSearch()) {
            return false;
         } else if (this.hasInterleaveSearch() && this.getInterleaveSearch() != var2.getInterleaveSearch()) {
            return false;
         } else if (this.hasReduceMemoryUsageInInterleaveMode() != var2.hasReduceMemoryUsageInInterleaveMode()) {
            return false;
         } else if (this.hasReduceMemoryUsageInInterleaveMode() && this.getReduceMemoryUsageInInterleaveMode() != var2.getReduceMemoryUsageInInterleaveMode()) {
            return false;
         } else if (this.hasDeterministicParallelSearch() != var2.hasDeterministicParallelSearch()) {
            return false;
         } else if (this.hasDeterministicParallelSearch() && this.getDeterministicParallelSearch() != var2.getDeterministicParallelSearch()) {
            return false;
         } else if (this.hasShareObjectiveBounds() != var2.hasShareObjectiveBounds()) {
            return false;
         } else if (this.hasShareObjectiveBounds() && this.getShareObjectiveBounds() != var2.getShareObjectiveBounds()) {
            return false;
         } else if (this.hasShareLevelZeroBounds() != var2.hasShareLevelZeroBounds()) {
            return false;
         } else if (this.hasShareLevelZeroBounds() && this.getShareLevelZeroBounds() != var2.getShareLevelZeroBounds()) {
            return false;
         } else if (this.hasUseLnsOnly() != var2.hasUseLnsOnly()) {
            return false;
         } else if (this.hasUseLnsOnly() && this.getUseLnsOnly() != var2.getUseLnsOnly()) {
            return false;
         } else if (this.hasLnsFocusOnDecisionVariables() != var2.hasLnsFocusOnDecisionVariables()) {
            return false;
         } else if (this.hasLnsFocusOnDecisionVariables() && this.getLnsFocusOnDecisionVariables() != var2.getLnsFocusOnDecisionVariables()) {
            return false;
         } else if (this.hasUseRinsLns() != var2.hasUseRinsLns()) {
            return false;
         } else if (this.hasUseRinsLns() && this.getUseRinsLns() != var2.getUseRinsLns()) {
            return false;
         } else if (this.hasDiversifyLnsParams() != var2.hasDiversifyLnsParams()) {
            return false;
         } else if (this.hasDiversifyLnsParams() && this.getDiversifyLnsParams() != var2.getDiversifyLnsParams()) {
            return false;
         } else if (this.hasRandomizeSearch() != var2.hasRandomizeSearch()) {
            return false;
         } else if (this.hasRandomizeSearch() && this.getRandomizeSearch() != var2.getRandomizeSearch()) {
            return false;
         } else if (this.hasSearchRandomizationTolerance() != var2.hasSearchRandomizationTolerance()) {
            return false;
         } else if (this.hasSearchRandomizationTolerance() && this.getSearchRandomizationTolerance() != var2.getSearchRandomizationTolerance()) {
            return false;
         } else if (this.hasUseOptionalVariables() != var2.hasUseOptionalVariables()) {
            return false;
         } else if (this.hasUseOptionalVariables() && this.getUseOptionalVariables() != var2.getUseOptionalVariables()) {
            return false;
         } else if (this.hasUseExactLpReason() != var2.hasUseExactLpReason()) {
            return false;
         } else if (this.hasUseExactLpReason() && this.getUseExactLpReason() != var2.getUseExactLpReason()) {
            return false;
         } else if (this.hasUseBranchingInLp() != var2.hasUseBranchingInLp()) {
            return false;
         } else if (this.hasUseBranchingInLp() && this.getUseBranchingInLp() != var2.getUseBranchingInLp()) {
            return false;
         } else if (this.hasUseCombinedNoOverlap() != var2.hasUseCombinedNoOverlap()) {
            return false;
         } else if (this.hasUseCombinedNoOverlap() && this.getUseCombinedNoOverlap() != var2.getUseCombinedNoOverlap()) {
            return false;
         } else if (this.hasCatchSigintSignal() != var2.hasCatchSigintSignal()) {
            return false;
         } else if (this.hasCatchSigintSignal() && this.getCatchSigintSignal() != var2.getCatchSigintSignal()) {
            return false;
         } else if (this.hasUseImpliedBounds() != var2.hasUseImpliedBounds()) {
            return false;
         } else if (this.hasUseImpliedBounds() && this.getUseImpliedBounds() != var2.getUseImpliedBounds()) {
            return false;
         } else if (this.hasMipMaxBound() != var2.hasMipMaxBound()) {
            return false;
         } else if (this.hasMipMaxBound() && Double.doubleToLongBits(this.getMipMaxBound()) != Double.doubleToLongBits(var2.getMipMaxBound())) {
            return false;
         } else if (this.hasMipVarScaling() != var2.hasMipVarScaling()) {
            return false;
         } else if (this.hasMipVarScaling() && Double.doubleToLongBits(this.getMipVarScaling()) != Double.doubleToLongBits(var2.getMipVarScaling())) {
            return false;
         } else if (this.hasMipWantedPrecision() != var2.hasMipWantedPrecision()) {
            return false;
         } else if (this.hasMipWantedPrecision() && Double.doubleToLongBits(this.getMipWantedPrecision()) != Double.doubleToLongBits(var2.getMipWantedPrecision())) {
            return false;
         } else if (this.hasMipMaxActivityExponent() != var2.hasMipMaxActivityExponent()) {
            return false;
         } else if (this.hasMipMaxActivityExponent() && this.getMipMaxActivityExponent() != var2.getMipMaxActivityExponent()) {
            return false;
         } else if (this.hasMipCheckPrecision() != var2.hasMipCheckPrecision()) {
            return false;
         } else if (this.hasMipCheckPrecision() && Double.doubleToLongBits(this.getMipCheckPrecision()) != Double.doubleToLongBits(var2.getMipCheckPrecision())) {
            return false;
         } else {
            return this.unknownFields.equals(var2.unknownFields);
         }
      }
   }

   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      } else {
         byte var1 = 41;
         int var2 = 19 * var1 + getDescriptor().hashCode();
         if (this.hasPreferredVariableOrder()) {
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.preferredVariableOrder_;
         }

         if (this.hasInitialPolarity()) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.initialPolarity_;
         }

         if (this.hasUsePhaseSaving()) {
            var2 = 37 * var2 + 44;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUsePhaseSaving());
         }

         if (this.hasRandomPolarityRatio()) {
            var2 = 37 * var2 + 45;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getRandomPolarityRatio()));
         }

         if (this.hasRandomBranchesRatio()) {
            var2 = 37 * var2 + 32;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getRandomBranchesRatio()));
         }

         if (this.hasUseErwaHeuristic()) {
            var2 = 37 * var2 + 75;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseErwaHeuristic());
         }

         if (this.hasInitialVariablesActivity()) {
            var2 = 37 * var2 + 76;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getInitialVariablesActivity()));
         }

         if (this.hasAlsoBumpVariablesInConflictReasons()) {
            var2 = 37 * var2 + 77;
            var2 = 53 * var2 + Internal.hashBoolean(this.getAlsoBumpVariablesInConflictReasons());
         }

         if (this.hasMinimizationAlgorithm()) {
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.minimizationAlgorithm_;
         }

         if (this.hasBinaryMinimizationAlgorithm()) {
            var2 = 37 * var2 + 34;
            var2 = 53 * var2 + this.binaryMinimizationAlgorithm_;
         }

         if (this.hasSubsumptionDuringConflictAnalysis()) {
            var2 = 37 * var2 + 56;
            var2 = 53 * var2 + Internal.hashBoolean(this.getSubsumptionDuringConflictAnalysis());
         }

         if (this.hasClauseCleanupPeriod()) {
            var2 = 37 * var2 + 11;
            var2 = 53 * var2 + this.getClauseCleanupPeriod();
         }

         if (this.hasClauseCleanupTarget()) {
            var2 = 37 * var2 + 13;
            var2 = 53 * var2 + this.getClauseCleanupTarget();
         }

         if (this.hasClauseCleanupProtection()) {
            var2 = 37 * var2 + 58;
            var2 = 53 * var2 + this.clauseCleanupProtection_;
         }

         if (this.hasClauseCleanupLbdBound()) {
            var2 = 37 * var2 + 59;
            var2 = 53 * var2 + this.getClauseCleanupLbdBound();
         }

         if (this.hasClauseCleanupOrdering()) {
            var2 = 37 * var2 + 60;
            var2 = 53 * var2 + this.clauseCleanupOrdering_;
         }

         if (this.hasPbCleanupIncrement()) {
            var2 = 37 * var2 + 46;
            var2 = 53 * var2 + this.getPbCleanupIncrement();
         }

         if (this.hasPbCleanupRatio()) {
            var2 = 37 * var2 + 47;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getPbCleanupRatio()));
         }

         if (this.hasMinimizeWithPropagationRestartPeriod()) {
            var2 = 37 * var2 + 96;
            var2 = 53 * var2 + this.getMinimizeWithPropagationRestartPeriod();
         }

         if (this.hasMinimizeWithPropagationNumDecisions()) {
            var2 = 37 * var2 + 97;
            var2 = 53 * var2 + this.getMinimizeWithPropagationNumDecisions();
         }

         if (this.hasVariableActivityDecay()) {
            var2 = 37 * var2 + 15;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getVariableActivityDecay()));
         }

         if (this.hasMaxVariableActivityValue()) {
            var2 = 37 * var2 + 16;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getMaxVariableActivityValue()));
         }

         if (this.hasGlucoseMaxDecay()) {
            var2 = 37 * var2 + 22;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getGlucoseMaxDecay()));
         }

         if (this.hasGlucoseDecayIncrement()) {
            var2 = 37 * var2 + 23;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getGlucoseDecayIncrement()));
         }

         if (this.hasGlucoseDecayIncrementPeriod()) {
            var2 = 37 * var2 + 24;
            var2 = 53 * var2 + this.getGlucoseDecayIncrementPeriod();
         }

         if (this.hasClauseActivityDecay()) {
            var2 = 37 * var2 + 17;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getClauseActivityDecay()));
         }

         if (this.hasMaxClauseActivityValue()) {
            var2 = 37 * var2 + 18;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getMaxClauseActivityValue()));
         }

         if (this.getRestartAlgorithmsCount() > 0) {
            var2 = 37 * var2 + 61;
            var2 = 53 * var2 + this.restartAlgorithms_.hashCode();
         }

         if (this.hasDefaultRestartAlgorithms()) {
            var2 = 37 * var2 + 70;
            var2 = 53 * var2 + this.getDefaultRestartAlgorithms().hashCode();
         }

         if (this.hasRestartPeriod()) {
            var2 = 37 * var2 + 30;
            var2 = 53 * var2 + this.getRestartPeriod();
         }

         if (this.hasRestartRunningWindowSize()) {
            var2 = 37 * var2 + 62;
            var2 = 53 * var2 + this.getRestartRunningWindowSize();
         }

         if (this.hasRestartDlAverageRatio()) {
            var2 = 37 * var2 + 63;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getRestartDlAverageRatio()));
         }

         if (this.hasRestartLbdAverageRatio()) {
            var2 = 37 * var2 + 71;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getRestartLbdAverageRatio()));
         }

         if (this.hasUseBlockingRestart()) {
            var2 = 37 * var2 + 64;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseBlockingRestart());
         }

         if (this.hasBlockingRestartWindowSize()) {
            var2 = 37 * var2 + 65;
            var2 = 53 * var2 + this.getBlockingRestartWindowSize();
         }

         if (this.hasBlockingRestartMultiplier()) {
            var2 = 37 * var2 + 66;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getBlockingRestartMultiplier()));
         }

         if (this.hasNumConflictsBeforeStrategyChanges()) {
            var2 = 37 * var2 + 68;
            var2 = 53 * var2 + this.getNumConflictsBeforeStrategyChanges();
         }

         if (this.hasStrategyChangeIncreaseRatio()) {
            var2 = 37 * var2 + 69;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getStrategyChangeIncreaseRatio()));
         }

         if (this.hasMaxTimeInSeconds()) {
            var2 = 37 * var2 + 36;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getMaxTimeInSeconds()));
         }

         if (this.hasMaxDeterministicTime()) {
            var2 = 37 * var2 + 67;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getMaxDeterministicTime()));
         }

         if (this.hasMaxNumberOfConflicts()) {
            var2 = 37 * var2 + 37;
            var2 = 53 * var2 + Internal.hashLong(this.getMaxNumberOfConflicts());
         }

         if (this.hasMaxMemoryInMb()) {
            var2 = 37 * var2 + 40;
            var2 = 53 * var2 + Internal.hashLong(this.getMaxMemoryInMb());
         }

         if (this.hasTreatBinaryClausesSeparately()) {
            var2 = 37 * var2 + 33;
            var2 = 53 * var2 + Internal.hashBoolean(this.getTreatBinaryClausesSeparately());
         }

         if (this.hasRandomSeed()) {
            var2 = 37 * var2 + 31;
            var2 = 53 * var2 + this.getRandomSeed();
         }

         if (this.hasLogSearchProgress()) {
            var2 = 37 * var2 + 41;
            var2 = 53 * var2 + Internal.hashBoolean(this.getLogSearchProgress());
         }

         if (this.hasUsePbResolution()) {
            var2 = 37 * var2 + 43;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUsePbResolution());
         }

         if (this.hasMinimizeReductionDuringPbResolution()) {
            var2 = 37 * var2 + 48;
            var2 = 53 * var2 + Internal.hashBoolean(this.getMinimizeReductionDuringPbResolution());
         }

         if (this.hasCountAssumptionLevelsInLbd()) {
            var2 = 37 * var2 + 49;
            var2 = 53 * var2 + Internal.hashBoolean(this.getCountAssumptionLevelsInLbd());
         }

         if (this.hasPresolveBveThreshold()) {
            var2 = 37 * var2 + 54;
            var2 = 53 * var2 + this.getPresolveBveThreshold();
         }

         if (this.hasPresolveBveClauseWeight()) {
            var2 = 37 * var2 + 55;
            var2 = 53 * var2 + this.getPresolveBveClauseWeight();
         }

         if (this.hasPresolveProbingDeterministicTimeLimit()) {
            var2 = 37 * var2 + 57;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getPresolveProbingDeterministicTimeLimit()));
         }

         if (this.hasPresolveBlockedClause()) {
            var2 = 37 * var2 + 88;
            var2 = 53 * var2 + Internal.hashBoolean(this.getPresolveBlockedClause());
         }

         if (this.hasPresolveUseBva()) {
            var2 = 37 * var2 + 72;
            var2 = 53 * var2 + Internal.hashBoolean(this.getPresolveUseBva());
         }

         if (this.hasPresolveBvaThreshold()) {
            var2 = 37 * var2 + 73;
            var2 = 53 * var2 + this.getPresolveBvaThreshold();
         }

         if (this.hasMaxPresolveIterations()) {
            var2 = 37 * var2 + 138;
            var2 = 53 * var2 + this.getMaxPresolveIterations();
         }

         if (this.hasCpModelPresolve()) {
            var2 = 37 * var2 + 86;
            var2 = 53 * var2 + Internal.hashBoolean(this.getCpModelPresolve());
         }

         if (this.hasCpModelProbingLevel()) {
            var2 = 37 * var2 + 110;
            var2 = 53 * var2 + this.getCpModelProbingLevel();
         }

         if (this.hasCpModelUseSatPresolve()) {
            var2 = 37 * var2 + 93;
            var2 = 53 * var2 + Internal.hashBoolean(this.getCpModelUseSatPresolve());
         }

         if (this.hasExpandElementConstraints()) {
            var2 = 37 * var2 + 140;
            var2 = 53 * var2 + Internal.hashBoolean(this.getExpandElementConstraints());
         }

         if (this.hasExpandAutomatonConstraints()) {
            var2 = 37 * var2 + 143;
            var2 = 53 * var2 + Internal.hashBoolean(this.getExpandAutomatonConstraints());
         }

         if (this.hasMergeNoOverlapWorkLimit()) {
            var2 = 37 * var2 + 145;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getMergeNoOverlapWorkLimit()));
         }

         if (this.hasMergeAtMostOneWorkLimit()) {
            var2 = 37 * var2 + 146;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getMergeAtMostOneWorkLimit()));
         }

         if (this.hasPresolveSubstitutionLevel()) {
            var2 = 37 * var2 + 147;
            var2 = 53 * var2 + this.getPresolveSubstitutionLevel();
         }

         if (this.hasUseOptimizationHints()) {
            var2 = 37 * var2 + 35;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseOptimizationHints());
         }

         if (this.hasMinimizeCore()) {
            var2 = 37 * var2 + 50;
            var2 = 53 * var2 + Internal.hashBoolean(this.getMinimizeCore());
         }

         if (this.hasFindMultipleCores()) {
            var2 = 37 * var2 + 84;
            var2 = 53 * var2 + Internal.hashBoolean(this.getFindMultipleCores());
         }

         if (this.hasCoverOptimization()) {
            var2 = 37 * var2 + 89;
            var2 = 53 * var2 + Internal.hashBoolean(this.getCoverOptimization());
         }

         if (this.hasMaxSatAssumptionOrder()) {
            var2 = 37 * var2 + 51;
            var2 = 53 * var2 + this.maxSatAssumptionOrder_;
         }

         if (this.hasMaxSatReverseAssumptionOrder()) {
            var2 = 37 * var2 + 52;
            var2 = 53 * var2 + Internal.hashBoolean(this.getMaxSatReverseAssumptionOrder());
         }

         if (this.hasMaxSatStratification()) {
            var2 = 37 * var2 + 53;
            var2 = 53 * var2 + this.maxSatStratification_;
         }

         if (this.hasUsePrecedencesInDisjunctiveConstraint()) {
            var2 = 37 * var2 + 74;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUsePrecedencesInDisjunctiveConstraint());
         }

         if (this.hasUseOverloadCheckerInCumulativeConstraint()) {
            var2 = 37 * var2 + 78;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseOverloadCheckerInCumulativeConstraint());
         }

         if (this.hasUseTimetableEdgeFindingInCumulativeConstraint()) {
            var2 = 37 * var2 + 79;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseTimetableEdgeFindingInCumulativeConstraint());
         }

         if (this.hasUseDisjunctiveConstraintInCumulativeConstraint()) {
            var2 = 37 * var2 + 80;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseDisjunctiveConstraintInCumulativeConstraint());
         }

         if (this.hasLinearizationLevel()) {
            var2 = 37 * var2 + 90;
            var2 = 53 * var2 + this.getLinearizationLevel();
         }

         if (this.hasBooleanEncodingLevel()) {
            var2 = 37 * var2 + 107;
            var2 = 53 * var2 + this.getBooleanEncodingLevel();
         }

         if (this.hasMaxNumCuts()) {
            var2 = 37 * var2 + 91;
            var2 = 53 * var2 + this.getMaxNumCuts();
         }

         if (this.hasOnlyAddCutsAtLevelZero()) {
            var2 = 37 * var2 + 92;
            var2 = 53 * var2 + Internal.hashBoolean(this.getOnlyAddCutsAtLevelZero());
         }

         if (this.hasAddKnapsackCuts()) {
            var2 = 37 * var2 + 111;
            var2 = 53 * var2 + Internal.hashBoolean(this.getAddKnapsackCuts());
         }

         if (this.hasAddCgCuts()) {
            var2 = 37 * var2 + 117;
            var2 = 53 * var2 + Internal.hashBoolean(this.getAddCgCuts());
         }

         if (this.hasAddMirCuts()) {
            var2 = 37 * var2 + 120;
            var2 = 53 * var2 + Internal.hashBoolean(this.getAddMirCuts());
         }

         if (this.hasMaxAllDiffCutSize()) {
            var2 = 37 * var2 + 148;
            var2 = 53 * var2 + this.getMaxAllDiffCutSize();
         }

         if (this.hasUseMirRounding()) {
            var2 = 37 * var2 + 118;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseMirRounding());
         }

         if (this.hasMaxIntegerRoundingScaling()) {
            var2 = 37 * var2 + 119;
            var2 = 53 * var2 + this.getMaxIntegerRoundingScaling();
         }

         if (this.hasAddLpConstraintsLazily()) {
            var2 = 37 * var2 + 112;
            var2 = 53 * var2 + Internal.hashBoolean(this.getAddLpConstraintsLazily());
         }

         if (this.hasMinOrthogonalityForLpConstraints()) {
            var2 = 37 * var2 + 115;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getMinOrthogonalityForLpConstraints()));
         }

         if (this.hasMaxInactiveCount()) {
            var2 = 37 * var2 + 121;
            var2 = 53 * var2 + Internal.hashLong(this.getMaxInactiveCount());
         }

         if (this.hasConstraintRemovalBatchSize()) {
            var2 = 37 * var2 + 122;
            var2 = 53 * var2 + Internal.hashLong(this.getConstraintRemovalBatchSize());
         }

         if (this.hasSearchBranching()) {
            var2 = 37 * var2 + 82;
            var2 = 53 * var2 + this.searchBranching_;
         }

         if (this.hasExploitIntegerLpSolution()) {
            var2 = 37 * var2 + 94;
            var2 = 53 * var2 + Internal.hashBoolean(this.getExploitIntegerLpSolution());
         }

         if (this.hasExploitAllLpSolution()) {
            var2 = 37 * var2 + 116;
            var2 = 53 * var2 + Internal.hashBoolean(this.getExploitAllLpSolution());
         }

         if (this.hasExploitBestSolution()) {
            var2 = 37 * var2 + 130;
            var2 = 53 * var2 + Internal.hashBoolean(this.getExploitBestSolution());
         }

         if (this.hasExploitObjective()) {
            var2 = 37 * var2 + 131;
            var2 = 53 * var2 + Internal.hashBoolean(this.getExploitObjective());
         }

         if (this.hasProbingPeriodAtRoot()) {
            var2 = 37 * var2 + 142;
            var2 = 53 * var2 + Internal.hashLong(this.getProbingPeriodAtRoot());
         }

         if (this.hasPseudoCostReliabilityThreshold()) {
            var2 = 37 * var2 + 123;
            var2 = 53 * var2 + Internal.hashLong(this.getPseudoCostReliabilityThreshold());
         }

         if (this.hasOptimizeWithCore()) {
            var2 = 37 * var2 + 83;
            var2 = 53 * var2 + Internal.hashBoolean(this.getOptimizeWithCore());
         }

         if (this.hasBinarySearchNumConflicts()) {
            var2 = 37 * var2 + 99;
            var2 = 53 * var2 + this.getBinarySearchNumConflicts();
         }

         if (this.hasOptimizeWithMaxHs()) {
            var2 = 37 * var2 + 85;
            var2 = 53 * var2 + Internal.hashBoolean(this.getOptimizeWithMaxHs());
         }

         if (this.hasEnumerateAllSolutions()) {
            var2 = 37 * var2 + 87;
            var2 = 53 * var2 + Internal.hashBoolean(this.getEnumerateAllSolutions());
         }

         if (this.hasFillTightenedDomainsInResponse()) {
            var2 = 37 * var2 + 132;
            var2 = 53 * var2 + Internal.hashBoolean(this.getFillTightenedDomainsInResponse());
         }

         if (this.hasInstantiateAllVariables()) {
            var2 = 37 * var2 + 106;
            var2 = 53 * var2 + Internal.hashBoolean(this.getInstantiateAllVariables());
         }

         if (this.hasAutoDetectGreaterThanAtLeastOneOf()) {
            var2 = 37 * var2 + 95;
            var2 = 53 * var2 + Internal.hashBoolean(this.getAutoDetectGreaterThanAtLeastOneOf());
         }

         if (this.hasStopAfterFirstSolution()) {
            var2 = 37 * var2 + 98;
            var2 = 53 * var2 + Internal.hashBoolean(this.getStopAfterFirstSolution());
         }

         if (this.hasNumSearchWorkers()) {
            var2 = 37 * var2 + 100;
            var2 = 53 * var2 + this.getNumSearchWorkers();
         }

         if (this.hasInterleaveSearch()) {
            var2 = 37 * var2 + 136;
            var2 = 53 * var2 + Internal.hashBoolean(this.getInterleaveSearch());
         }

         if (this.hasReduceMemoryUsageInInterleaveMode()) {
            var2 = 37 * var2 + 141;
            var2 = 53 * var2 + Internal.hashBoolean(this.getReduceMemoryUsageInInterleaveMode());
         }

         if (this.hasDeterministicParallelSearch()) {
            var2 = 37 * var2 + 134;
            var2 = 53 * var2 + Internal.hashBoolean(this.getDeterministicParallelSearch());
         }

         if (this.hasShareObjectiveBounds()) {
            var2 = 37 * var2 + 113;
            var2 = 53 * var2 + Internal.hashBoolean(this.getShareObjectiveBounds());
         }

         if (this.hasShareLevelZeroBounds()) {
            var2 = 37 * var2 + 114;
            var2 = 53 * var2 + Internal.hashBoolean(this.getShareLevelZeroBounds());
         }

         if (this.hasUseLnsOnly()) {
            var2 = 37 * var2 + 101;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseLnsOnly());
         }

         if (this.hasLnsFocusOnDecisionVariables()) {
            var2 = 37 * var2 + 105;
            var2 = 53 * var2 + Internal.hashBoolean(this.getLnsFocusOnDecisionVariables());
         }

         if (this.hasUseRinsLns()) {
            var2 = 37 * var2 + 129;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseRinsLns());
         }

         if (this.hasDiversifyLnsParams()) {
            var2 = 37 * var2 + 137;
            var2 = 53 * var2 + Internal.hashBoolean(this.getDiversifyLnsParams());
         }

         if (this.hasRandomizeSearch()) {
            var2 = 37 * var2 + 103;
            var2 = 53 * var2 + Internal.hashBoolean(this.getRandomizeSearch());
         }

         if (this.hasSearchRandomizationTolerance()) {
            var2 = 37 * var2 + 104;
            var2 = 53 * var2 + Internal.hashLong(this.getSearchRandomizationTolerance());
         }

         if (this.hasUseOptionalVariables()) {
            var2 = 37 * var2 + 108;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseOptionalVariables());
         }

         if (this.hasUseExactLpReason()) {
            var2 = 37 * var2 + 109;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseExactLpReason());
         }

         if (this.hasUseBranchingInLp()) {
            var2 = 37 * var2 + 139;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseBranchingInLp());
         }

         if (this.hasUseCombinedNoOverlap()) {
            var2 = 37 * var2 + 133;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseCombinedNoOverlap());
         }

         if (this.hasCatchSigintSignal()) {
            var2 = 37 * var2 + 135;
            var2 = 53 * var2 + Internal.hashBoolean(this.getCatchSigintSignal());
         }

         if (this.hasUseImpliedBounds()) {
            var2 = 37 * var2 + 144;
            var2 = 53 * var2 + Internal.hashBoolean(this.getUseImpliedBounds());
         }

         if (this.hasMipMaxBound()) {
            var2 = 37 * var2 + 124;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getMipMaxBound()));
         }

         if (this.hasMipVarScaling()) {
            var2 = 37 * var2 + 125;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getMipVarScaling()));
         }

         if (this.hasMipWantedPrecision()) {
            var2 = 37 * var2 + 126;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getMipWantedPrecision()));
         }

         if (this.hasMipMaxActivityExponent()) {
            var2 = 37 * var2 + 127;
            var2 = 53 * var2 + this.getMipMaxActivityExponent();
         }

         if (this.hasMipCheckPrecision()) {
            var2 = 37 * var2 + 128;
            var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getMipCheckPrecision()));
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static SatParameters parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (SatParameters)PARSER.parseFrom(var0);
   }

   public static SatParameters parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (SatParameters)PARSER.parseFrom(var0, var1);
   }

   public static SatParameters parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (SatParameters)PARSER.parseFrom(var0);
   }

   public static SatParameters parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (SatParameters)PARSER.parseFrom(var0, var1);
   }

   public static SatParameters parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (SatParameters)PARSER.parseFrom(var0);
   }

   public static SatParameters parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (SatParameters)PARSER.parseFrom(var0, var1);
   }

   public static SatParameters parseFrom(InputStream var0) throws IOException {
      return (SatParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SatParameters parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (SatParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SatParameters parseDelimitedFrom(InputStream var0) throws IOException {
      return (SatParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SatParameters parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (SatParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SatParameters parseFrom(CodedInputStream var0) throws IOException {
      return (SatParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SatParameters parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (SatParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SatParameters.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SatParameters.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SatParameters.Builder newBuilder(SatParameters var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SatParameters.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SatParameters.Builder() : (new SatParameters.Builder()).mergeFrom(this);
   }

   protected SatParameters.Builder newBuilderForType(BuilderParent var1) {
      SatParameters.Builder var2 = new SatParameters.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static SatParameters getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public SatParameters getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   SatParameters(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   SatParameters(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements SatParametersOrBuilder {
      private int bitField0_;
      private int bitField1_;
      private int bitField2_;
      private int bitField3_;
      private int preferredVariableOrder_;
      private int initialPolarity_;
      private boolean usePhaseSaving_;
      private double randomPolarityRatio_;
      private double randomBranchesRatio_;
      private boolean useErwaHeuristic_;
      private double initialVariablesActivity_;
      private boolean alsoBumpVariablesInConflictReasons_;
      private int minimizationAlgorithm_;
      private int binaryMinimizationAlgorithm_;
      private boolean subsumptionDuringConflictAnalysis_;
      private int clauseCleanupPeriod_;
      private int clauseCleanupTarget_;
      private int clauseCleanupProtection_;
      private int clauseCleanupLbdBound_;
      private int clauseCleanupOrdering_;
      private int pbCleanupIncrement_;
      private double pbCleanupRatio_;
      private int minimizeWithPropagationRestartPeriod_;
      private int minimizeWithPropagationNumDecisions_;
      private double variableActivityDecay_;
      private double maxVariableActivityValue_;
      private double glucoseMaxDecay_;
      private double glucoseDecayIncrement_;
      private int glucoseDecayIncrementPeriod_;
      private double clauseActivityDecay_;
      private double maxClauseActivityValue_;
      private List restartAlgorithms_;
      private Object defaultRestartAlgorithms_;
      private int restartPeriod_;
      private int restartRunningWindowSize_;
      private double restartDlAverageRatio_;
      private double restartLbdAverageRatio_;
      private boolean useBlockingRestart_;
      private int blockingRestartWindowSize_;
      private double blockingRestartMultiplier_;
      private int numConflictsBeforeStrategyChanges_;
      private double strategyChangeIncreaseRatio_;
      private double maxTimeInSeconds_;
      private double maxDeterministicTime_;
      private long maxNumberOfConflicts_;
      private long maxMemoryInMb_;
      private boolean treatBinaryClausesSeparately_;
      private int randomSeed_;
      private boolean logSearchProgress_;
      private boolean usePbResolution_;
      private boolean minimizeReductionDuringPbResolution_;
      private boolean countAssumptionLevelsInLbd_;
      private int presolveBveThreshold_;
      private int presolveBveClauseWeight_;
      private double presolveProbingDeterministicTimeLimit_;
      private boolean presolveBlockedClause_;
      private boolean presolveUseBva_;
      private int presolveBvaThreshold_;
      private int maxPresolveIterations_;
      private boolean cpModelPresolve_;
      private int cpModelProbingLevel_;
      private boolean cpModelUseSatPresolve_;
      private boolean expandElementConstraints_;
      private boolean expandAutomatonConstraints_;
      private double mergeNoOverlapWorkLimit_;
      private double mergeAtMostOneWorkLimit_;
      private int presolveSubstitutionLevel_;
      private boolean useOptimizationHints_;
      private boolean minimizeCore_;
      private boolean findMultipleCores_;
      private boolean coverOptimization_;
      private int maxSatAssumptionOrder_;
      private boolean maxSatReverseAssumptionOrder_;
      private int maxSatStratification_;
      private boolean usePrecedencesInDisjunctiveConstraint_;
      private boolean useOverloadCheckerInCumulativeConstraint_;
      private boolean useTimetableEdgeFindingInCumulativeConstraint_;
      private boolean useDisjunctiveConstraintInCumulativeConstraint_;
      private int linearizationLevel_;
      private int booleanEncodingLevel_;
      private int maxNumCuts_;
      private boolean onlyAddCutsAtLevelZero_;
      private boolean addKnapsackCuts_;
      private boolean addCgCuts_;
      private boolean addMirCuts_;
      private int maxAllDiffCutSize_;
      private boolean useMirRounding_;
      private int maxIntegerRoundingScaling_;
      private boolean addLpConstraintsLazily_;
      private double minOrthogonalityForLpConstraints_;
      private long maxInactiveCount_;
      private long constraintRemovalBatchSize_;
      private int searchBranching_;
      private boolean exploitIntegerLpSolution_;
      private boolean exploitAllLpSolution_;
      private boolean exploitBestSolution_;
      private boolean exploitObjective_;
      private long probingPeriodAtRoot_;
      private long pseudoCostReliabilityThreshold_;
      private boolean optimizeWithCore_;
      private int binarySearchNumConflicts_;
      private boolean optimizeWithMaxHs_;
      private boolean enumerateAllSolutions_;
      private boolean fillTightenedDomainsInResponse_;
      private boolean instantiateAllVariables_;
      private boolean autoDetectGreaterThanAtLeastOneOf_;
      private boolean stopAfterFirstSolution_;
      private int numSearchWorkers_;
      private boolean interleaveSearch_;
      private boolean reduceMemoryUsageInInterleaveMode_;
      private boolean deterministicParallelSearch_;
      private boolean shareObjectiveBounds_;
      private boolean shareLevelZeroBounds_;
      private boolean useLnsOnly_;
      private boolean lnsFocusOnDecisionVariables_;
      private boolean useRinsLns_;
      private boolean diversifyLnsParams_;
      private boolean randomizeSearch_;
      private long searchRandomizationTolerance_;
      private boolean useOptionalVariables_;
      private boolean useExactLpReason_;
      private boolean useBranchingInLp_;
      private boolean useCombinedNoOverlap_;
      private boolean catchSigintSignal_;
      private boolean useImpliedBounds_;
      private double mipMaxBound_;
      private double mipVarScaling_;
      private double mipWantedPrecision_;
      private int mipMaxActivityExponent_;
      private double mipCheckPrecision_;

      public static final Descriptor getDescriptor() {
         return SatParametersOuterClass.internal_static_operations_research_sat_SatParameters_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return SatParametersOuterClass.internal_static_operations_research_sat_SatParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(SatParameters.class, SatParameters.Builder.class);
      }

      private Builder() {
         this.preferredVariableOrder_ = 0;
         this.initialPolarity_ = 1;
         this.usePhaseSaving_ = true;
         this.minimizationAlgorithm_ = 2;
         this.binaryMinimizationAlgorithm_ = 1;
         this.subsumptionDuringConflictAnalysis_ = true;
         this.clauseCleanupPeriod_ = 10000;
         this.clauseCleanupTarget_ = 10000;
         this.clauseCleanupProtection_ = 0;
         this.clauseCleanupLbdBound_ = 5;
         this.clauseCleanupOrdering_ = 0;
         this.pbCleanupIncrement_ = 200;
         this.pbCleanupRatio_ = 0.5D;
         this.minimizeWithPropagationRestartPeriod_ = 10;
         this.minimizeWithPropagationNumDecisions_ = 1000;
         this.variableActivityDecay_ = 0.8D;
         this.maxVariableActivityValue_ = 1.0E100D;
         this.glucoseMaxDecay_ = 0.95D;
         this.glucoseDecayIncrement_ = 0.01D;
         this.glucoseDecayIncrementPeriod_ = 5000;
         this.clauseActivityDecay_ = 0.999D;
         this.maxClauseActivityValue_ = 1.0E20D;
         this.restartAlgorithms_ = Collections.emptyList();
         this.defaultRestartAlgorithms_ = "LUBY_RESTART,LBD_MOVING_AVERAGE_RESTART,DL_MOVING_AVERAGE_RESTART";
         this.restartPeriod_ = 50;
         this.restartRunningWindowSize_ = 50;
         this.restartDlAverageRatio_ = 1.0D;
         this.restartLbdAverageRatio_ = 1.0D;
         this.blockingRestartWindowSize_ = 5000;
         this.blockingRestartMultiplier_ = 1.4D;
         this.maxTimeInSeconds_ = Double.POSITIVE_INFINITY;
         this.maxDeterministicTime_ = Double.POSITIVE_INFINITY;
         this.maxNumberOfConflicts_ = Long.MAX_VALUE;
         this.maxMemoryInMb_ = 10000L;
         this.treatBinaryClausesSeparately_ = true;
         this.randomSeed_ = 1;
         this.countAssumptionLevelsInLbd_ = true;
         this.presolveBveThreshold_ = 500;
         this.presolveBveClauseWeight_ = 3;
         this.presolveProbingDeterministicTimeLimit_ = 30.0D;
         this.presolveBlockedClause_ = true;
         this.presolveUseBva_ = true;
         this.presolveBvaThreshold_ = 1;
         this.maxPresolveIterations_ = 3;
         this.cpModelPresolve_ = true;
         this.cpModelProbingLevel_ = 2;
         this.cpModelUseSatPresolve_ = true;
         this.expandElementConstraints_ = true;
         this.expandAutomatonConstraints_ = true;
         this.mergeNoOverlapWorkLimit_ = 1.0E12D;
         this.mergeAtMostOneWorkLimit_ = 1.0E8D;
         this.useOptimizationHints_ = true;
         this.minimizeCore_ = true;
         this.findMultipleCores_ = true;
         this.coverOptimization_ = true;
         this.maxSatAssumptionOrder_ = 0;
         this.maxSatStratification_ = 1;
         this.usePrecedencesInDisjunctiveConstraint_ = true;
         this.useDisjunctiveConstraintInCumulativeConstraint_ = true;
         this.linearizationLevel_ = 1;
         this.booleanEncodingLevel_ = 1;
         this.maxNumCuts_ = 5000;
         this.addMirCuts_ = true;
         this.maxAllDiffCutSize_ = 7;
         this.useMirRounding_ = true;
         this.maxIntegerRoundingScaling_ = 600;
         this.addLpConstraintsLazily_ = true;
         this.maxInactiveCount_ = 1000L;
         this.constraintRemovalBatchSize_ = 100L;
         this.searchBranching_ = 0;
         this.exploitIntegerLpSolution_ = true;
         this.exploitAllLpSolution_ = true;
         this.exploitObjective_ = true;
         this.pseudoCostReliabilityThreshold_ = 100L;
         this.binarySearchNumConflicts_ = -1;
         this.instantiateAllVariables_ = true;
         this.autoDetectGreaterThanAtLeastOneOf_ = true;
         this.numSearchWorkers_ = 1;
         this.reduceMemoryUsageInInterleaveMode_ = true;
         this.shareObjectiveBounds_ = true;
         this.shareLevelZeroBounds_ = true;
         this.useRinsLns_ = true;
         this.useOptionalVariables_ = true;
         this.useExactLpReason_ = true;
         this.catchSigintSignal_ = true;
         this.mipMaxBound_ = 1.0E7D;
         this.mipVarScaling_ = 1.0D;
         this.mipWantedPrecision_ = 1.0E-6D;
         this.mipMaxActivityExponent_ = 53;
         this.mipCheckPrecision_ = 1.0E-4D;
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.preferredVariableOrder_ = 0;
         this.initialPolarity_ = 1;
         this.usePhaseSaving_ = true;
         this.minimizationAlgorithm_ = 2;
         this.binaryMinimizationAlgorithm_ = 1;
         this.subsumptionDuringConflictAnalysis_ = true;
         this.clauseCleanupPeriod_ = 10000;
         this.clauseCleanupTarget_ = 10000;
         this.clauseCleanupProtection_ = 0;
         this.clauseCleanupLbdBound_ = 5;
         this.clauseCleanupOrdering_ = 0;
         this.pbCleanupIncrement_ = 200;
         this.pbCleanupRatio_ = 0.5D;
         this.minimizeWithPropagationRestartPeriod_ = 10;
         this.minimizeWithPropagationNumDecisions_ = 1000;
         this.variableActivityDecay_ = 0.8D;
         this.maxVariableActivityValue_ = 1.0E100D;
         this.glucoseMaxDecay_ = 0.95D;
         this.glucoseDecayIncrement_ = 0.01D;
         this.glucoseDecayIncrementPeriod_ = 5000;
         this.clauseActivityDecay_ = 0.999D;
         this.maxClauseActivityValue_ = 1.0E20D;
         this.restartAlgorithms_ = Collections.emptyList();
         this.defaultRestartAlgorithms_ = "LUBY_RESTART,LBD_MOVING_AVERAGE_RESTART,DL_MOVING_AVERAGE_RESTART";
         this.restartPeriod_ = 50;
         this.restartRunningWindowSize_ = 50;
         this.restartDlAverageRatio_ = 1.0D;
         this.restartLbdAverageRatio_ = 1.0D;
         this.blockingRestartWindowSize_ = 5000;
         this.blockingRestartMultiplier_ = 1.4D;
         this.maxTimeInSeconds_ = Double.POSITIVE_INFINITY;
         this.maxDeterministicTime_ = Double.POSITIVE_INFINITY;
         this.maxNumberOfConflicts_ = Long.MAX_VALUE;
         this.maxMemoryInMb_ = 10000L;
         this.treatBinaryClausesSeparately_ = true;
         this.randomSeed_ = 1;
         this.countAssumptionLevelsInLbd_ = true;
         this.presolveBveThreshold_ = 500;
         this.presolveBveClauseWeight_ = 3;
         this.presolveProbingDeterministicTimeLimit_ = 30.0D;
         this.presolveBlockedClause_ = true;
         this.presolveUseBva_ = true;
         this.presolveBvaThreshold_ = 1;
         this.maxPresolveIterations_ = 3;
         this.cpModelPresolve_ = true;
         this.cpModelProbingLevel_ = 2;
         this.cpModelUseSatPresolve_ = true;
         this.expandElementConstraints_ = true;
         this.expandAutomatonConstraints_ = true;
         this.mergeNoOverlapWorkLimit_ = 1.0E12D;
         this.mergeAtMostOneWorkLimit_ = 1.0E8D;
         this.useOptimizationHints_ = true;
         this.minimizeCore_ = true;
         this.findMultipleCores_ = true;
         this.coverOptimization_ = true;
         this.maxSatAssumptionOrder_ = 0;
         this.maxSatStratification_ = 1;
         this.usePrecedencesInDisjunctiveConstraint_ = true;
         this.useDisjunctiveConstraintInCumulativeConstraint_ = true;
         this.linearizationLevel_ = 1;
         this.booleanEncodingLevel_ = 1;
         this.maxNumCuts_ = 5000;
         this.addMirCuts_ = true;
         this.maxAllDiffCutSize_ = 7;
         this.useMirRounding_ = true;
         this.maxIntegerRoundingScaling_ = 600;
         this.addLpConstraintsLazily_ = true;
         this.maxInactiveCount_ = 1000L;
         this.constraintRemovalBatchSize_ = 100L;
         this.searchBranching_ = 0;
         this.exploitIntegerLpSolution_ = true;
         this.exploitAllLpSolution_ = true;
         this.exploitObjective_ = true;
         this.pseudoCostReliabilityThreshold_ = 100L;
         this.binarySearchNumConflicts_ = -1;
         this.instantiateAllVariables_ = true;
         this.autoDetectGreaterThanAtLeastOneOf_ = true;
         this.numSearchWorkers_ = 1;
         this.reduceMemoryUsageInInterleaveMode_ = true;
         this.shareObjectiveBounds_ = true;
         this.shareLevelZeroBounds_ = true;
         this.useRinsLns_ = true;
         this.useOptionalVariables_ = true;
         this.useExactLpReason_ = true;
         this.catchSigintSignal_ = true;
         this.mipMaxBound_ = 1.0E7D;
         this.mipVarScaling_ = 1.0D;
         this.mipWantedPrecision_ = 1.0E-6D;
         this.mipMaxActivityExponent_ = 53;
         this.mipCheckPrecision_ = 1.0E-4D;
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SatParameters.alwaysUseFieldBuilders) {
         }

      }

      public SatParameters.Builder clear() {
         super.clear();
         this.preferredVariableOrder_ = 0;
         this.bitField0_ &= -2;
         this.initialPolarity_ = 1;
         this.bitField0_ &= -3;
         this.usePhaseSaving_ = true;
         this.bitField0_ &= -5;
         this.randomPolarityRatio_ = 0.0D;
         this.bitField0_ &= -9;
         this.randomBranchesRatio_ = 0.0D;
         this.bitField0_ &= -17;
         this.useErwaHeuristic_ = false;
         this.bitField0_ &= -33;
         this.initialVariablesActivity_ = 0.0D;
         this.bitField0_ &= -65;
         this.alsoBumpVariablesInConflictReasons_ = false;
         this.bitField0_ &= -129;
         this.minimizationAlgorithm_ = 2;
         this.bitField0_ &= -257;
         this.binaryMinimizationAlgorithm_ = 1;
         this.bitField0_ &= -513;
         this.subsumptionDuringConflictAnalysis_ = true;
         this.bitField0_ &= -1025;
         this.clauseCleanupPeriod_ = 10000;
         this.bitField0_ &= -2049;
         this.clauseCleanupTarget_ = 10000;
         this.bitField0_ &= -4097;
         this.clauseCleanupProtection_ = 0;
         this.bitField0_ &= -8193;
         this.clauseCleanupLbdBound_ = 5;
         this.bitField0_ &= -16385;
         this.clauseCleanupOrdering_ = 0;
         this.bitField0_ &= -32769;
         this.pbCleanupIncrement_ = 200;
         this.bitField0_ &= -65537;
         this.pbCleanupRatio_ = 0.5D;
         this.bitField0_ &= -131073;
         this.minimizeWithPropagationRestartPeriod_ = 10;
         this.bitField0_ &= -262145;
         this.minimizeWithPropagationNumDecisions_ = 1000;
         this.bitField0_ &= -524289;
         this.variableActivityDecay_ = 0.8D;
         this.bitField0_ &= -1048577;
         this.maxVariableActivityValue_ = 1.0E100D;
         this.bitField0_ &= -2097153;
         this.glucoseMaxDecay_ = 0.95D;
         this.bitField0_ &= -4194305;
         this.glucoseDecayIncrement_ = 0.01D;
         this.bitField0_ &= -8388609;
         this.glucoseDecayIncrementPeriod_ = 5000;
         this.bitField0_ &= -16777217;
         this.clauseActivityDecay_ = 0.999D;
         this.bitField0_ &= -33554433;
         this.maxClauseActivityValue_ = 1.0E20D;
         this.bitField0_ &= -67108865;
         this.restartAlgorithms_ = Collections.emptyList();
         this.bitField0_ &= -134217729;
         this.defaultRestartAlgorithms_ = "LUBY_RESTART,LBD_MOVING_AVERAGE_RESTART,DL_MOVING_AVERAGE_RESTART";
         this.bitField0_ &= -268435457;
         this.restartPeriod_ = 50;
         this.bitField0_ &= -536870913;
         this.restartRunningWindowSize_ = 50;
         this.bitField0_ &= -1073741825;
         this.restartDlAverageRatio_ = 1.0D;
         this.bitField0_ &= Integer.MAX_VALUE;
         this.restartLbdAverageRatio_ = 1.0D;
         this.bitField1_ &= -2;
         this.useBlockingRestart_ = false;
         this.bitField1_ &= -3;
         this.blockingRestartWindowSize_ = 5000;
         this.bitField1_ &= -5;
         this.blockingRestartMultiplier_ = 1.4D;
         this.bitField1_ &= -9;
         this.numConflictsBeforeStrategyChanges_ = 0;
         this.bitField1_ &= -17;
         this.strategyChangeIncreaseRatio_ = 0.0D;
         this.bitField1_ &= -33;
         this.maxTimeInSeconds_ = Double.POSITIVE_INFINITY;
         this.bitField1_ &= -65;
         this.maxDeterministicTime_ = Double.POSITIVE_INFINITY;
         this.bitField1_ &= -129;
         this.maxNumberOfConflicts_ = Long.MAX_VALUE;
         this.bitField1_ &= -257;
         this.maxMemoryInMb_ = 10000L;
         this.bitField1_ &= -513;
         this.treatBinaryClausesSeparately_ = true;
         this.bitField1_ &= -1025;
         this.randomSeed_ = 1;
         this.bitField1_ &= -2049;
         this.logSearchProgress_ = false;
         this.bitField1_ &= -4097;
         this.usePbResolution_ = false;
         this.bitField1_ &= -8193;
         this.minimizeReductionDuringPbResolution_ = false;
         this.bitField1_ &= -16385;
         this.countAssumptionLevelsInLbd_ = true;
         this.bitField1_ &= -32769;
         this.presolveBveThreshold_ = 500;
         this.bitField1_ &= -65537;
         this.presolveBveClauseWeight_ = 3;
         this.bitField1_ &= -131073;
         this.presolveProbingDeterministicTimeLimit_ = 30.0D;
         this.bitField1_ &= -262145;
         this.presolveBlockedClause_ = true;
         this.bitField1_ &= -524289;
         this.presolveUseBva_ = true;
         this.bitField1_ &= -1048577;
         this.presolveBvaThreshold_ = 1;
         this.bitField1_ &= -2097153;
         this.maxPresolveIterations_ = 3;
         this.bitField1_ &= -4194305;
         this.cpModelPresolve_ = true;
         this.bitField1_ &= -8388609;
         this.cpModelProbingLevel_ = 2;
         this.bitField1_ &= -16777217;
         this.cpModelUseSatPresolve_ = true;
         this.bitField1_ &= -33554433;
         this.expandElementConstraints_ = true;
         this.bitField1_ &= -67108865;
         this.expandAutomatonConstraints_ = true;
         this.bitField1_ &= -134217729;
         this.mergeNoOverlapWorkLimit_ = 1.0E12D;
         this.bitField1_ &= -268435457;
         this.mergeAtMostOneWorkLimit_ = 1.0E8D;
         this.bitField1_ &= -536870913;
         this.presolveSubstitutionLevel_ = 0;
         this.bitField1_ &= -1073741825;
         this.useOptimizationHints_ = true;
         this.bitField1_ &= Integer.MAX_VALUE;
         this.minimizeCore_ = true;
         this.bitField2_ &= -2;
         this.findMultipleCores_ = true;
         this.bitField2_ &= -3;
         this.coverOptimization_ = true;
         this.bitField2_ &= -5;
         this.maxSatAssumptionOrder_ = 0;
         this.bitField2_ &= -9;
         this.maxSatReverseAssumptionOrder_ = false;
         this.bitField2_ &= -17;
         this.maxSatStratification_ = 1;
         this.bitField2_ &= -33;
         this.usePrecedencesInDisjunctiveConstraint_ = true;
         this.bitField2_ &= -65;
         this.useOverloadCheckerInCumulativeConstraint_ = false;
         this.bitField2_ &= -129;
         this.useTimetableEdgeFindingInCumulativeConstraint_ = false;
         this.bitField2_ &= -257;
         this.useDisjunctiveConstraintInCumulativeConstraint_ = true;
         this.bitField2_ &= -513;
         this.linearizationLevel_ = 1;
         this.bitField2_ &= -1025;
         this.booleanEncodingLevel_ = 1;
         this.bitField2_ &= -2049;
         this.maxNumCuts_ = 5000;
         this.bitField2_ &= -4097;
         this.onlyAddCutsAtLevelZero_ = false;
         this.bitField2_ &= -8193;
         this.addKnapsackCuts_ = false;
         this.bitField2_ &= -16385;
         this.addCgCuts_ = false;
         this.bitField2_ &= -32769;
         this.addMirCuts_ = true;
         this.bitField2_ &= -65537;
         this.maxAllDiffCutSize_ = 7;
         this.bitField2_ &= -131073;
         this.useMirRounding_ = true;
         this.bitField2_ &= -262145;
         this.maxIntegerRoundingScaling_ = 600;
         this.bitField2_ &= -524289;
         this.addLpConstraintsLazily_ = true;
         this.bitField2_ &= -1048577;
         this.minOrthogonalityForLpConstraints_ = 0.0D;
         this.bitField2_ &= -2097153;
         this.maxInactiveCount_ = 1000L;
         this.bitField2_ &= -4194305;
         this.constraintRemovalBatchSize_ = 100L;
         this.bitField2_ &= -8388609;
         this.searchBranching_ = 0;
         this.bitField2_ &= -16777217;
         this.exploitIntegerLpSolution_ = true;
         this.bitField2_ &= -33554433;
         this.exploitAllLpSolution_ = true;
         this.bitField2_ &= -67108865;
         this.exploitBestSolution_ = false;
         this.bitField2_ &= -134217729;
         this.exploitObjective_ = true;
         this.bitField2_ &= -268435457;
         this.probingPeriodAtRoot_ = 0L;
         this.bitField2_ &= -536870913;
         this.pseudoCostReliabilityThreshold_ = 100L;
         this.bitField2_ &= -1073741825;
         this.optimizeWithCore_ = false;
         this.bitField2_ &= Integer.MAX_VALUE;
         this.binarySearchNumConflicts_ = -1;
         this.bitField3_ &= -2;
         this.optimizeWithMaxHs_ = false;
         this.bitField3_ &= -3;
         this.enumerateAllSolutions_ = false;
         this.bitField3_ &= -5;
         this.fillTightenedDomainsInResponse_ = false;
         this.bitField3_ &= -9;
         this.instantiateAllVariables_ = true;
         this.bitField3_ &= -17;
         this.autoDetectGreaterThanAtLeastOneOf_ = true;
         this.bitField3_ &= -33;
         this.stopAfterFirstSolution_ = false;
         this.bitField3_ &= -65;
         this.numSearchWorkers_ = 1;
         this.bitField3_ &= -129;
         this.interleaveSearch_ = false;
         this.bitField3_ &= -257;
         this.reduceMemoryUsageInInterleaveMode_ = true;
         this.bitField3_ &= -513;
         this.deterministicParallelSearch_ = false;
         this.bitField3_ &= -1025;
         this.shareObjectiveBounds_ = true;
         this.bitField3_ &= -2049;
         this.shareLevelZeroBounds_ = true;
         this.bitField3_ &= -4097;
         this.useLnsOnly_ = false;
         this.bitField3_ &= -8193;
         this.lnsFocusOnDecisionVariables_ = false;
         this.bitField3_ &= -16385;
         this.useRinsLns_ = true;
         this.bitField3_ &= -32769;
         this.diversifyLnsParams_ = false;
         this.bitField3_ &= -65537;
         this.randomizeSearch_ = false;
         this.bitField3_ &= -131073;
         this.searchRandomizationTolerance_ = 0L;
         this.bitField3_ &= -262145;
         this.useOptionalVariables_ = true;
         this.bitField3_ &= -524289;
         this.useExactLpReason_ = true;
         this.bitField3_ &= -1048577;
         this.useBranchingInLp_ = false;
         this.bitField3_ &= -2097153;
         this.useCombinedNoOverlap_ = false;
         this.bitField3_ &= -4194305;
         this.catchSigintSignal_ = true;
         this.bitField3_ &= -8388609;
         this.useImpliedBounds_ = false;
         this.bitField3_ &= -16777217;
         this.mipMaxBound_ = 1.0E7D;
         this.bitField3_ &= -33554433;
         this.mipVarScaling_ = 1.0D;
         this.bitField3_ &= -67108865;
         this.mipWantedPrecision_ = 1.0E-6D;
         this.bitField3_ &= -134217729;
         this.mipMaxActivityExponent_ = 53;
         this.bitField3_ &= -268435457;
         this.mipCheckPrecision_ = 1.0E-4D;
         this.bitField3_ &= -536870913;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return SatParametersOuterClass.internal_static_operations_research_sat_SatParameters_descriptor;
      }

      public SatParameters getDefaultInstanceForType() {
         return SatParameters.getDefaultInstance();
      }

      public SatParameters build() {
         SatParameters var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SatParameters buildPartial() {
         SatParameters var1 = new SatParameters(this);
         int var2 = this.bitField0_;
         int var3 = this.bitField1_;
         int var4 = this.bitField2_;
         int var5 = this.bitField3_;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         if ((var2 & 1) != 0) {
            var6 |= 1;
         }

         var1.preferredVariableOrder_ = this.preferredVariableOrder_;
         if ((var2 & 2) != 0) {
            var6 |= 2;
         }

         var1.initialPolarity_ = this.initialPolarity_;
         if ((var2 & 4) != 0) {
            var6 |= 4;
         }

         var1.usePhaseSaving_ = this.usePhaseSaving_;
         if ((var2 & 8) != 0) {
            var1.randomPolarityRatio_ = this.randomPolarityRatio_;
            var6 |= 8;
         }

         if ((var2 & 16) != 0) {
            var1.randomBranchesRatio_ = this.randomBranchesRatio_;
            var6 |= 16;
         }

         if ((var2 & 32) != 0) {
            var1.useErwaHeuristic_ = this.useErwaHeuristic_;
            var6 |= 32;
         }

         if ((var2 & 64) != 0) {
            var1.initialVariablesActivity_ = this.initialVariablesActivity_;
            var6 |= 64;
         }

         if ((var2 & 128) != 0) {
            var1.alsoBumpVariablesInConflictReasons_ = this.alsoBumpVariablesInConflictReasons_;
            var6 |= 128;
         }

         if ((var2 & 256) != 0) {
            var6 |= 256;
         }

         var1.minimizationAlgorithm_ = this.minimizationAlgorithm_;
         if ((var2 & 512) != 0) {
            var6 |= 512;
         }

         var1.binaryMinimizationAlgorithm_ = this.binaryMinimizationAlgorithm_;
         if ((var2 & 1024) != 0) {
            var6 |= 1024;
         }

         var1.subsumptionDuringConflictAnalysis_ = this.subsumptionDuringConflictAnalysis_;
         if ((var2 & 2048) != 0) {
            var6 |= 2048;
         }

         var1.clauseCleanupPeriod_ = this.clauseCleanupPeriod_;
         if ((var2 & 4096) != 0) {
            var6 |= 4096;
         }

         var1.clauseCleanupTarget_ = this.clauseCleanupTarget_;
         if ((var2 & 8192) != 0) {
            var6 |= 8192;
         }

         var1.clauseCleanupProtection_ = this.clauseCleanupProtection_;
         if ((var2 & 16384) != 0) {
            var6 |= 16384;
         }

         var1.clauseCleanupLbdBound_ = this.clauseCleanupLbdBound_;
         if ((var2 & '耀') != 0) {
            var6 |= 32768;
         }

         var1.clauseCleanupOrdering_ = this.clauseCleanupOrdering_;
         if ((var2 & 65536) != 0) {
            var6 |= 65536;
         }

         var1.pbCleanupIncrement_ = this.pbCleanupIncrement_;
         if ((var2 & 131072) != 0) {
            var6 |= 131072;
         }

         var1.pbCleanupRatio_ = this.pbCleanupRatio_;
         if ((var2 & 262144) != 0) {
            var6 |= 262144;
         }

         var1.minimizeWithPropagationRestartPeriod_ = this.minimizeWithPropagationRestartPeriod_;
         if ((var2 & 524288) != 0) {
            var6 |= 524288;
         }

         var1.minimizeWithPropagationNumDecisions_ = this.minimizeWithPropagationNumDecisions_;
         if ((var2 & 1048576) != 0) {
            var6 |= 1048576;
         }

         var1.variableActivityDecay_ = this.variableActivityDecay_;
         if ((var2 & 2097152) != 0) {
            var6 |= 2097152;
         }

         var1.maxVariableActivityValue_ = this.maxVariableActivityValue_;
         if ((var2 & 4194304) != 0) {
            var6 |= 4194304;
         }

         var1.glucoseMaxDecay_ = this.glucoseMaxDecay_;
         if ((var2 & 8388608) != 0) {
            var6 |= 8388608;
         }

         var1.glucoseDecayIncrement_ = this.glucoseDecayIncrement_;
         if ((var2 & 16777216) != 0) {
            var6 |= 16777216;
         }

         var1.glucoseDecayIncrementPeriod_ = this.glucoseDecayIncrementPeriod_;
         if ((var2 & 33554432) != 0) {
            var6 |= 33554432;
         }

         var1.clauseActivityDecay_ = this.clauseActivityDecay_;
         if ((var2 & 67108864) != 0) {
            var6 |= 67108864;
         }

         var1.maxClauseActivityValue_ = this.maxClauseActivityValue_;
         if ((this.bitField0_ & 134217728) != 0) {
            this.restartAlgorithms_ = Collections.unmodifiableList(this.restartAlgorithms_);
            this.bitField0_ &= -134217729;
         }

         var1.restartAlgorithms_ = this.restartAlgorithms_;
         if ((var2 & 268435456) != 0) {
            var6 |= 134217728;
         }

         var1.defaultRestartAlgorithms_ = this.defaultRestartAlgorithms_;
         if ((var2 & 536870912) != 0) {
            var6 |= 268435456;
         }

         var1.restartPeriod_ = this.restartPeriod_;
         if ((var2 & 1073741824) != 0) {
            var6 |= 536870912;
         }

         var1.restartRunningWindowSize_ = this.restartRunningWindowSize_;
         if ((var2 & Integer.MIN_VALUE) != 0) {
            var6 |= 1073741824;
         }

         var1.restartDlAverageRatio_ = this.restartDlAverageRatio_;
         if ((var3 & 1) != 0) {
            var6 |= Integer.MIN_VALUE;
         }

         var1.restartLbdAverageRatio_ = this.restartLbdAverageRatio_;
         if ((var3 & 2) != 0) {
            var1.useBlockingRestart_ = this.useBlockingRestart_;
            var7 |= 1;
         }

         if ((var3 & 4) != 0) {
            var7 |= 2;
         }

         var1.blockingRestartWindowSize_ = this.blockingRestartWindowSize_;
         if ((var3 & 8) != 0) {
            var7 |= 4;
         }

         var1.blockingRestartMultiplier_ = this.blockingRestartMultiplier_;
         if ((var3 & 16) != 0) {
            var1.numConflictsBeforeStrategyChanges_ = this.numConflictsBeforeStrategyChanges_;
            var7 |= 8;
         }

         if ((var3 & 32) != 0) {
            var1.strategyChangeIncreaseRatio_ = this.strategyChangeIncreaseRatio_;
            var7 |= 16;
         }

         if ((var3 & 64) != 0) {
            var7 |= 32;
         }

         var1.maxTimeInSeconds_ = this.maxTimeInSeconds_;
         if ((var3 & 128) != 0) {
            var7 |= 64;
         }

         var1.maxDeterministicTime_ = this.maxDeterministicTime_;
         if ((var3 & 256) != 0) {
            var7 |= 128;
         }

         var1.maxNumberOfConflicts_ = this.maxNumberOfConflicts_;
         if ((var3 & 512) != 0) {
            var7 |= 256;
         }

         var1.maxMemoryInMb_ = this.maxMemoryInMb_;
         if ((var3 & 1024) != 0) {
            var7 |= 512;
         }

         var1.treatBinaryClausesSeparately_ = this.treatBinaryClausesSeparately_;
         if ((var3 & 2048) != 0) {
            var7 |= 1024;
         }

         var1.randomSeed_ = this.randomSeed_;
         if ((var3 & 4096) != 0) {
            var1.logSearchProgress_ = this.logSearchProgress_;
            var7 |= 2048;
         }

         if ((var3 & 8192) != 0) {
            var1.usePbResolution_ = this.usePbResolution_;
            var7 |= 4096;
         }

         if ((var3 & 16384) != 0) {
            var1.minimizeReductionDuringPbResolution_ = this.minimizeReductionDuringPbResolution_;
            var7 |= 8192;
         }

         if ((var3 & '耀') != 0) {
            var7 |= 16384;
         }

         var1.countAssumptionLevelsInLbd_ = this.countAssumptionLevelsInLbd_;
         if ((var3 & 65536) != 0) {
            var7 |= 32768;
         }

         var1.presolveBveThreshold_ = this.presolveBveThreshold_;
         if ((var3 & 131072) != 0) {
            var7 |= 65536;
         }

         var1.presolveBveClauseWeight_ = this.presolveBveClauseWeight_;
         if ((var3 & 262144) != 0) {
            var7 |= 131072;
         }

         var1.presolveProbingDeterministicTimeLimit_ = this.presolveProbingDeterministicTimeLimit_;
         if ((var3 & 524288) != 0) {
            var7 |= 262144;
         }

         var1.presolveBlockedClause_ = this.presolveBlockedClause_;
         if ((var3 & 1048576) != 0) {
            var7 |= 524288;
         }

         var1.presolveUseBva_ = this.presolveUseBva_;
         if ((var3 & 2097152) != 0) {
            var7 |= 1048576;
         }

         var1.presolveBvaThreshold_ = this.presolveBvaThreshold_;
         if ((var3 & 4194304) != 0) {
            var7 |= 2097152;
         }

         var1.maxPresolveIterations_ = this.maxPresolveIterations_;
         if ((var3 & 8388608) != 0) {
            var7 |= 4194304;
         }

         var1.cpModelPresolve_ = this.cpModelPresolve_;
         if ((var3 & 16777216) != 0) {
            var7 |= 8388608;
         }

         var1.cpModelProbingLevel_ = this.cpModelProbingLevel_;
         if ((var3 & 33554432) != 0) {
            var7 |= 16777216;
         }

         var1.cpModelUseSatPresolve_ = this.cpModelUseSatPresolve_;
         if ((var3 & 67108864) != 0) {
            var7 |= 33554432;
         }

         var1.expandElementConstraints_ = this.expandElementConstraints_;
         if ((var3 & 134217728) != 0) {
            var7 |= 67108864;
         }

         var1.expandAutomatonConstraints_ = this.expandAutomatonConstraints_;
         if ((var3 & 268435456) != 0) {
            var7 |= 134217728;
         }

         var1.mergeNoOverlapWorkLimit_ = this.mergeNoOverlapWorkLimit_;
         if ((var3 & 536870912) != 0) {
            var7 |= 268435456;
         }

         var1.mergeAtMostOneWorkLimit_ = this.mergeAtMostOneWorkLimit_;
         if ((var3 & 1073741824) != 0) {
            var1.presolveSubstitutionLevel_ = this.presolveSubstitutionLevel_;
            var7 |= 536870912;
         }

         if ((var3 & Integer.MIN_VALUE) != 0) {
            var7 |= 1073741824;
         }

         var1.useOptimizationHints_ = this.useOptimizationHints_;
         if ((var4 & 1) != 0) {
            var7 |= Integer.MIN_VALUE;
         }

         var1.minimizeCore_ = this.minimizeCore_;
         if ((var4 & 2) != 0) {
            var8 |= 1;
         }

         var1.findMultipleCores_ = this.findMultipleCores_;
         if ((var4 & 4) != 0) {
            var8 |= 2;
         }

         var1.coverOptimization_ = this.coverOptimization_;
         if ((var4 & 8) != 0) {
            var8 |= 4;
         }

         var1.maxSatAssumptionOrder_ = this.maxSatAssumptionOrder_;
         if ((var4 & 16) != 0) {
            var1.maxSatReverseAssumptionOrder_ = this.maxSatReverseAssumptionOrder_;
            var8 |= 8;
         }

         if ((var4 & 32) != 0) {
            var8 |= 16;
         }

         var1.maxSatStratification_ = this.maxSatStratification_;
         if ((var4 & 64) != 0) {
            var8 |= 32;
         }

         var1.usePrecedencesInDisjunctiveConstraint_ = this.usePrecedencesInDisjunctiveConstraint_;
         if ((var4 & 128) != 0) {
            var1.useOverloadCheckerInCumulativeConstraint_ = this.useOverloadCheckerInCumulativeConstraint_;
            var8 |= 64;
         }

         if ((var4 & 256) != 0) {
            var1.useTimetableEdgeFindingInCumulativeConstraint_ = this.useTimetableEdgeFindingInCumulativeConstraint_;
            var8 |= 128;
         }

         if ((var4 & 512) != 0) {
            var8 |= 256;
         }

         var1.useDisjunctiveConstraintInCumulativeConstraint_ = this.useDisjunctiveConstraintInCumulativeConstraint_;
         if ((var4 & 1024) != 0) {
            var8 |= 512;
         }

         var1.linearizationLevel_ = this.linearizationLevel_;
         if ((var4 & 2048) != 0) {
            var8 |= 1024;
         }

         var1.booleanEncodingLevel_ = this.booleanEncodingLevel_;
         if ((var4 & 4096) != 0) {
            var8 |= 2048;
         }

         var1.maxNumCuts_ = this.maxNumCuts_;
         if ((var4 & 8192) != 0) {
            var1.onlyAddCutsAtLevelZero_ = this.onlyAddCutsAtLevelZero_;
            var8 |= 4096;
         }

         if ((var4 & 16384) != 0) {
            var1.addKnapsackCuts_ = this.addKnapsackCuts_;
            var8 |= 8192;
         }

         if ((var4 & '耀') != 0) {
            var1.addCgCuts_ = this.addCgCuts_;
            var8 |= 16384;
         }

         if ((var4 & 65536) != 0) {
            var8 |= 32768;
         }

         var1.addMirCuts_ = this.addMirCuts_;
         if ((var4 & 131072) != 0) {
            var8 |= 65536;
         }

         var1.maxAllDiffCutSize_ = this.maxAllDiffCutSize_;
         if ((var4 & 262144) != 0) {
            var8 |= 131072;
         }

         var1.useMirRounding_ = this.useMirRounding_;
         if ((var4 & 524288) != 0) {
            var8 |= 262144;
         }

         var1.maxIntegerRoundingScaling_ = this.maxIntegerRoundingScaling_;
         if ((var4 & 1048576) != 0) {
            var8 |= 524288;
         }

         var1.addLpConstraintsLazily_ = this.addLpConstraintsLazily_;
         if ((var4 & 2097152) != 0) {
            var1.minOrthogonalityForLpConstraints_ = this.minOrthogonalityForLpConstraints_;
            var8 |= 1048576;
         }

         if ((var4 & 4194304) != 0) {
            var8 |= 2097152;
         }

         var1.maxInactiveCount_ = this.maxInactiveCount_;
         if ((var4 & 8388608) != 0) {
            var8 |= 4194304;
         }

         var1.constraintRemovalBatchSize_ = this.constraintRemovalBatchSize_;
         if ((var4 & 16777216) != 0) {
            var8 |= 8388608;
         }

         var1.searchBranching_ = this.searchBranching_;
         if ((var4 & 33554432) != 0) {
            var8 |= 16777216;
         }

         var1.exploitIntegerLpSolution_ = this.exploitIntegerLpSolution_;
         if ((var4 & 67108864) != 0) {
            var8 |= 33554432;
         }

         var1.exploitAllLpSolution_ = this.exploitAllLpSolution_;
         if ((var4 & 134217728) != 0) {
            var1.exploitBestSolution_ = this.exploitBestSolution_;
            var8 |= 67108864;
         }

         if ((var4 & 268435456) != 0) {
            var8 |= 134217728;
         }

         var1.exploitObjective_ = this.exploitObjective_;
         if ((var4 & 536870912) != 0) {
            var1.probingPeriodAtRoot_ = this.probingPeriodAtRoot_;
            var8 |= 268435456;
         }

         if ((var4 & 1073741824) != 0) {
            var8 |= 536870912;
         }

         var1.pseudoCostReliabilityThreshold_ = this.pseudoCostReliabilityThreshold_;
         if ((var4 & Integer.MIN_VALUE) != 0) {
            var1.optimizeWithCore_ = this.optimizeWithCore_;
            var8 |= 1073741824;
         }

         if ((var5 & 1) != 0) {
            var8 |= Integer.MIN_VALUE;
         }

         var1.binarySearchNumConflicts_ = this.binarySearchNumConflicts_;
         if ((var5 & 2) != 0) {
            var1.optimizeWithMaxHs_ = this.optimizeWithMaxHs_;
            var9 |= 1;
         }

         if ((var5 & 4) != 0) {
            var1.enumerateAllSolutions_ = this.enumerateAllSolutions_;
            var9 |= 2;
         }

         if ((var5 & 8) != 0) {
            var1.fillTightenedDomainsInResponse_ = this.fillTightenedDomainsInResponse_;
            var9 |= 4;
         }

         if ((var5 & 16) != 0) {
            var9 |= 8;
         }

         var1.instantiateAllVariables_ = this.instantiateAllVariables_;
         if ((var5 & 32) != 0) {
            var9 |= 16;
         }

         var1.autoDetectGreaterThanAtLeastOneOf_ = this.autoDetectGreaterThanAtLeastOneOf_;
         if ((var5 & 64) != 0) {
            var1.stopAfterFirstSolution_ = this.stopAfterFirstSolution_;
            var9 |= 32;
         }

         if ((var5 & 128) != 0) {
            var9 |= 64;
         }

         var1.numSearchWorkers_ = this.numSearchWorkers_;
         if ((var5 & 256) != 0) {
            var1.interleaveSearch_ = this.interleaveSearch_;
            var9 |= 128;
         }

         if ((var5 & 512) != 0) {
            var9 |= 256;
         }

         var1.reduceMemoryUsageInInterleaveMode_ = this.reduceMemoryUsageInInterleaveMode_;
         if ((var5 & 1024) != 0) {
            var1.deterministicParallelSearch_ = this.deterministicParallelSearch_;
            var9 |= 512;
         }

         if ((var5 & 2048) != 0) {
            var9 |= 1024;
         }

         var1.shareObjectiveBounds_ = this.shareObjectiveBounds_;
         if ((var5 & 4096) != 0) {
            var9 |= 2048;
         }

         var1.shareLevelZeroBounds_ = this.shareLevelZeroBounds_;
         if ((var5 & 8192) != 0) {
            var1.useLnsOnly_ = this.useLnsOnly_;
            var9 |= 4096;
         }

         if ((var5 & 16384) != 0) {
            var1.lnsFocusOnDecisionVariables_ = this.lnsFocusOnDecisionVariables_;
            var9 |= 8192;
         }

         if ((var5 & '耀') != 0) {
            var9 |= 16384;
         }

         var1.useRinsLns_ = this.useRinsLns_;
         if ((var5 & 65536) != 0) {
            var1.diversifyLnsParams_ = this.diversifyLnsParams_;
            var9 |= 32768;
         }

         if ((var5 & 131072) != 0) {
            var1.randomizeSearch_ = this.randomizeSearch_;
            var9 |= 65536;
         }

         if ((var5 & 262144) != 0) {
            var1.searchRandomizationTolerance_ = this.searchRandomizationTolerance_;
            var9 |= 131072;
         }

         if ((var5 & 524288) != 0) {
            var9 |= 262144;
         }

         var1.useOptionalVariables_ = this.useOptionalVariables_;
         if ((var5 & 1048576) != 0) {
            var9 |= 524288;
         }

         var1.useExactLpReason_ = this.useExactLpReason_;
         if ((var5 & 2097152) != 0) {
            var1.useBranchingInLp_ = this.useBranchingInLp_;
            var9 |= 1048576;
         }

         if ((var5 & 4194304) != 0) {
            var1.useCombinedNoOverlap_ = this.useCombinedNoOverlap_;
            var9 |= 2097152;
         }

         if ((var5 & 8388608) != 0) {
            var9 |= 4194304;
         }

         var1.catchSigintSignal_ = this.catchSigintSignal_;
         if ((var5 & 16777216) != 0) {
            var1.useImpliedBounds_ = this.useImpliedBounds_;
            var9 |= 8388608;
         }

         if ((var5 & 33554432) != 0) {
            var9 |= 16777216;
         }

         var1.mipMaxBound_ = this.mipMaxBound_;
         if ((var5 & 67108864) != 0) {
            var9 |= 33554432;
         }

         var1.mipVarScaling_ = this.mipVarScaling_;
         if ((var5 & 134217728) != 0) {
            var9 |= 67108864;
         }

         var1.mipWantedPrecision_ = this.mipWantedPrecision_;
         if ((var5 & 268435456) != 0) {
            var9 |= 134217728;
         }

         var1.mipMaxActivityExponent_ = this.mipMaxActivityExponent_;
         if ((var5 & 536870912) != 0) {
            var9 |= 268435456;
         }

         var1.mipCheckPrecision_ = this.mipCheckPrecision_;
         var1.bitField0_ = var6;
         var1.bitField1_ = var7;
         var1.bitField2_ = var8;
         var1.bitField3_ = var9;
         this.onBuilt();
         return var1;
      }

      public SatParameters.Builder clone() {
         return (SatParameters.Builder)super.clone();
      }

      public SatParameters.Builder setField(FieldDescriptor var1, Object var2) {
         return (SatParameters.Builder)super.setField(var1, var2);
      }

      public SatParameters.Builder clearField(FieldDescriptor var1) {
         return (SatParameters.Builder)super.clearField(var1);
      }

      public SatParameters.Builder clearOneof(OneofDescriptor var1) {
         return (SatParameters.Builder)super.clearOneof(var1);
      }

      public SatParameters.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (SatParameters.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SatParameters.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (SatParameters.Builder)super.addRepeatedField(var1, var2);
      }

      public SatParameters.Builder mergeFrom(Message var1) {
         if (var1 instanceof SatParameters) {
            return this.mergeFrom((SatParameters)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public SatParameters.Builder mergeFrom(SatParameters var1) {
         if (var1 == SatParameters.getDefaultInstance()) {
            return this;
         } else {
            if (var1.hasPreferredVariableOrder()) {
               this.setPreferredVariableOrder(var1.getPreferredVariableOrder());
            }

            if (var1.hasInitialPolarity()) {
               this.setInitialPolarity(var1.getInitialPolarity());
            }

            if (var1.hasUsePhaseSaving()) {
               this.setUsePhaseSaving(var1.getUsePhaseSaving());
            }

            if (var1.hasRandomPolarityRatio()) {
               this.setRandomPolarityRatio(var1.getRandomPolarityRatio());
            }

            if (var1.hasRandomBranchesRatio()) {
               this.setRandomBranchesRatio(var1.getRandomBranchesRatio());
            }

            if (var1.hasUseErwaHeuristic()) {
               this.setUseErwaHeuristic(var1.getUseErwaHeuristic());
            }

            if (var1.hasInitialVariablesActivity()) {
               this.setInitialVariablesActivity(var1.getInitialVariablesActivity());
            }

            if (var1.hasAlsoBumpVariablesInConflictReasons()) {
               this.setAlsoBumpVariablesInConflictReasons(var1.getAlsoBumpVariablesInConflictReasons());
            }

            if (var1.hasMinimizationAlgorithm()) {
               this.setMinimizationAlgorithm(var1.getMinimizationAlgorithm());
            }

            if (var1.hasBinaryMinimizationAlgorithm()) {
               this.setBinaryMinimizationAlgorithm(var1.getBinaryMinimizationAlgorithm());
            }

            if (var1.hasSubsumptionDuringConflictAnalysis()) {
               this.setSubsumptionDuringConflictAnalysis(var1.getSubsumptionDuringConflictAnalysis());
            }

            if (var1.hasClauseCleanupPeriod()) {
               this.setClauseCleanupPeriod(var1.getClauseCleanupPeriod());
            }

            if (var1.hasClauseCleanupTarget()) {
               this.setClauseCleanupTarget(var1.getClauseCleanupTarget());
            }

            if (var1.hasClauseCleanupProtection()) {
               this.setClauseCleanupProtection(var1.getClauseCleanupProtection());
            }

            if (var1.hasClauseCleanupLbdBound()) {
               this.setClauseCleanupLbdBound(var1.getClauseCleanupLbdBound());
            }

            if (var1.hasClauseCleanupOrdering()) {
               this.setClauseCleanupOrdering(var1.getClauseCleanupOrdering());
            }

            if (var1.hasPbCleanupIncrement()) {
               this.setPbCleanupIncrement(var1.getPbCleanupIncrement());
            }

            if (var1.hasPbCleanupRatio()) {
               this.setPbCleanupRatio(var1.getPbCleanupRatio());
            }

            if (var1.hasMinimizeWithPropagationRestartPeriod()) {
               this.setMinimizeWithPropagationRestartPeriod(var1.getMinimizeWithPropagationRestartPeriod());
            }

            if (var1.hasMinimizeWithPropagationNumDecisions()) {
               this.setMinimizeWithPropagationNumDecisions(var1.getMinimizeWithPropagationNumDecisions());
            }

            if (var1.hasVariableActivityDecay()) {
               this.setVariableActivityDecay(var1.getVariableActivityDecay());
            }

            if (var1.hasMaxVariableActivityValue()) {
               this.setMaxVariableActivityValue(var1.getMaxVariableActivityValue());
            }

            if (var1.hasGlucoseMaxDecay()) {
               this.setGlucoseMaxDecay(var1.getGlucoseMaxDecay());
            }

            if (var1.hasGlucoseDecayIncrement()) {
               this.setGlucoseDecayIncrement(var1.getGlucoseDecayIncrement());
            }

            if (var1.hasGlucoseDecayIncrementPeriod()) {
               this.setGlucoseDecayIncrementPeriod(var1.getGlucoseDecayIncrementPeriod());
            }

            if (var1.hasClauseActivityDecay()) {
               this.setClauseActivityDecay(var1.getClauseActivityDecay());
            }

            if (var1.hasMaxClauseActivityValue()) {
               this.setMaxClauseActivityValue(var1.getMaxClauseActivityValue());
            }

            if (!var1.restartAlgorithms_.isEmpty()) {
               if (this.restartAlgorithms_.isEmpty()) {
                  this.restartAlgorithms_ = var1.restartAlgorithms_;
                  this.bitField0_ &= -134217729;
               } else {
                  this.ensureRestartAlgorithmsIsMutable();
                  this.restartAlgorithms_.addAll(var1.restartAlgorithms_);
               }

               this.onChanged();
            }

            if (var1.hasDefaultRestartAlgorithms()) {
               this.bitField0_ |= 268435456;
               this.defaultRestartAlgorithms_ = var1.defaultRestartAlgorithms_;
               this.onChanged();
            }

            if (var1.hasRestartPeriod()) {
               this.setRestartPeriod(var1.getRestartPeriod());
            }

            if (var1.hasRestartRunningWindowSize()) {
               this.setRestartRunningWindowSize(var1.getRestartRunningWindowSize());
            }

            if (var1.hasRestartDlAverageRatio()) {
               this.setRestartDlAverageRatio(var1.getRestartDlAverageRatio());
            }

            if (var1.hasRestartLbdAverageRatio()) {
               this.setRestartLbdAverageRatio(var1.getRestartLbdAverageRatio());
            }

            if (var1.hasUseBlockingRestart()) {
               this.setUseBlockingRestart(var1.getUseBlockingRestart());
            }

            if (var1.hasBlockingRestartWindowSize()) {
               this.setBlockingRestartWindowSize(var1.getBlockingRestartWindowSize());
            }

            if (var1.hasBlockingRestartMultiplier()) {
               this.setBlockingRestartMultiplier(var1.getBlockingRestartMultiplier());
            }

            if (var1.hasNumConflictsBeforeStrategyChanges()) {
               this.setNumConflictsBeforeStrategyChanges(var1.getNumConflictsBeforeStrategyChanges());
            }

            if (var1.hasStrategyChangeIncreaseRatio()) {
               this.setStrategyChangeIncreaseRatio(var1.getStrategyChangeIncreaseRatio());
            }

            if (var1.hasMaxTimeInSeconds()) {
               this.setMaxTimeInSeconds(var1.getMaxTimeInSeconds());
            }

            if (var1.hasMaxDeterministicTime()) {
               this.setMaxDeterministicTime(var1.getMaxDeterministicTime());
            }

            if (var1.hasMaxNumberOfConflicts()) {
               this.setMaxNumberOfConflicts(var1.getMaxNumberOfConflicts());
            }

            if (var1.hasMaxMemoryInMb()) {
               this.setMaxMemoryInMb(var1.getMaxMemoryInMb());
            }

            if (var1.hasTreatBinaryClausesSeparately()) {
               this.setTreatBinaryClausesSeparately(var1.getTreatBinaryClausesSeparately());
            }

            if (var1.hasRandomSeed()) {
               this.setRandomSeed(var1.getRandomSeed());
            }

            if (var1.hasLogSearchProgress()) {
               this.setLogSearchProgress(var1.getLogSearchProgress());
            }

            if (var1.hasUsePbResolution()) {
               this.setUsePbResolution(var1.getUsePbResolution());
            }

            if (var1.hasMinimizeReductionDuringPbResolution()) {
               this.setMinimizeReductionDuringPbResolution(var1.getMinimizeReductionDuringPbResolution());
            }

            if (var1.hasCountAssumptionLevelsInLbd()) {
               this.setCountAssumptionLevelsInLbd(var1.getCountAssumptionLevelsInLbd());
            }

            if (var1.hasPresolveBveThreshold()) {
               this.setPresolveBveThreshold(var1.getPresolveBveThreshold());
            }

            if (var1.hasPresolveBveClauseWeight()) {
               this.setPresolveBveClauseWeight(var1.getPresolveBveClauseWeight());
            }

            if (var1.hasPresolveProbingDeterministicTimeLimit()) {
               this.setPresolveProbingDeterministicTimeLimit(var1.getPresolveProbingDeterministicTimeLimit());
            }

            if (var1.hasPresolveBlockedClause()) {
               this.setPresolveBlockedClause(var1.getPresolveBlockedClause());
            }

            if (var1.hasPresolveUseBva()) {
               this.setPresolveUseBva(var1.getPresolveUseBva());
            }

            if (var1.hasPresolveBvaThreshold()) {
               this.setPresolveBvaThreshold(var1.getPresolveBvaThreshold());
            }

            if (var1.hasMaxPresolveIterations()) {
               this.setMaxPresolveIterations(var1.getMaxPresolveIterations());
            }

            if (var1.hasCpModelPresolve()) {
               this.setCpModelPresolve(var1.getCpModelPresolve());
            }

            if (var1.hasCpModelProbingLevel()) {
               this.setCpModelProbingLevel(var1.getCpModelProbingLevel());
            }

            if (var1.hasCpModelUseSatPresolve()) {
               this.setCpModelUseSatPresolve(var1.getCpModelUseSatPresolve());
            }

            if (var1.hasExpandElementConstraints()) {
               this.setExpandElementConstraints(var1.getExpandElementConstraints());
            }

            if (var1.hasExpandAutomatonConstraints()) {
               this.setExpandAutomatonConstraints(var1.getExpandAutomatonConstraints());
            }

            if (var1.hasMergeNoOverlapWorkLimit()) {
               this.setMergeNoOverlapWorkLimit(var1.getMergeNoOverlapWorkLimit());
            }

            if (var1.hasMergeAtMostOneWorkLimit()) {
               this.setMergeAtMostOneWorkLimit(var1.getMergeAtMostOneWorkLimit());
            }

            if (var1.hasPresolveSubstitutionLevel()) {
               this.setPresolveSubstitutionLevel(var1.getPresolveSubstitutionLevel());
            }

            if (var1.hasUseOptimizationHints()) {
               this.setUseOptimizationHints(var1.getUseOptimizationHints());
            }

            if (var1.hasMinimizeCore()) {
               this.setMinimizeCore(var1.getMinimizeCore());
            }

            if (var1.hasFindMultipleCores()) {
               this.setFindMultipleCores(var1.getFindMultipleCores());
            }

            if (var1.hasCoverOptimization()) {
               this.setCoverOptimization(var1.getCoverOptimization());
            }

            if (var1.hasMaxSatAssumptionOrder()) {
               this.setMaxSatAssumptionOrder(var1.getMaxSatAssumptionOrder());
            }

            if (var1.hasMaxSatReverseAssumptionOrder()) {
               this.setMaxSatReverseAssumptionOrder(var1.getMaxSatReverseAssumptionOrder());
            }

            if (var1.hasMaxSatStratification()) {
               this.setMaxSatStratification(var1.getMaxSatStratification());
            }

            if (var1.hasUsePrecedencesInDisjunctiveConstraint()) {
               this.setUsePrecedencesInDisjunctiveConstraint(var1.getUsePrecedencesInDisjunctiveConstraint());
            }

            if (var1.hasUseOverloadCheckerInCumulativeConstraint()) {
               this.setUseOverloadCheckerInCumulativeConstraint(var1.getUseOverloadCheckerInCumulativeConstraint());
            }

            if (var1.hasUseTimetableEdgeFindingInCumulativeConstraint()) {
               this.setUseTimetableEdgeFindingInCumulativeConstraint(var1.getUseTimetableEdgeFindingInCumulativeConstraint());
            }

            if (var1.hasUseDisjunctiveConstraintInCumulativeConstraint()) {
               this.setUseDisjunctiveConstraintInCumulativeConstraint(var1.getUseDisjunctiveConstraintInCumulativeConstraint());
            }

            if (var1.hasLinearizationLevel()) {
               this.setLinearizationLevel(var1.getLinearizationLevel());
            }

            if (var1.hasBooleanEncodingLevel()) {
               this.setBooleanEncodingLevel(var1.getBooleanEncodingLevel());
            }

            if (var1.hasMaxNumCuts()) {
               this.setMaxNumCuts(var1.getMaxNumCuts());
            }

            if (var1.hasOnlyAddCutsAtLevelZero()) {
               this.setOnlyAddCutsAtLevelZero(var1.getOnlyAddCutsAtLevelZero());
            }

            if (var1.hasAddKnapsackCuts()) {
               this.setAddKnapsackCuts(var1.getAddKnapsackCuts());
            }

            if (var1.hasAddCgCuts()) {
               this.setAddCgCuts(var1.getAddCgCuts());
            }

            if (var1.hasAddMirCuts()) {
               this.setAddMirCuts(var1.getAddMirCuts());
            }

            if (var1.hasMaxAllDiffCutSize()) {
               this.setMaxAllDiffCutSize(var1.getMaxAllDiffCutSize());
            }

            if (var1.hasUseMirRounding()) {
               this.setUseMirRounding(var1.getUseMirRounding());
            }

            if (var1.hasMaxIntegerRoundingScaling()) {
               this.setMaxIntegerRoundingScaling(var1.getMaxIntegerRoundingScaling());
            }

            if (var1.hasAddLpConstraintsLazily()) {
               this.setAddLpConstraintsLazily(var1.getAddLpConstraintsLazily());
            }

            if (var1.hasMinOrthogonalityForLpConstraints()) {
               this.setMinOrthogonalityForLpConstraints(var1.getMinOrthogonalityForLpConstraints());
            }

            if (var1.hasMaxInactiveCount()) {
               this.setMaxInactiveCount(var1.getMaxInactiveCount());
            }

            if (var1.hasConstraintRemovalBatchSize()) {
               this.setConstraintRemovalBatchSize(var1.getConstraintRemovalBatchSize());
            }

            if (var1.hasSearchBranching()) {
               this.setSearchBranching(var1.getSearchBranching());
            }

            if (var1.hasExploitIntegerLpSolution()) {
               this.setExploitIntegerLpSolution(var1.getExploitIntegerLpSolution());
            }

            if (var1.hasExploitAllLpSolution()) {
               this.setExploitAllLpSolution(var1.getExploitAllLpSolution());
            }

            if (var1.hasExploitBestSolution()) {
               this.setExploitBestSolution(var1.getExploitBestSolution());
            }

            if (var1.hasExploitObjective()) {
               this.setExploitObjective(var1.getExploitObjective());
            }

            if (var1.hasProbingPeriodAtRoot()) {
               this.setProbingPeriodAtRoot(var1.getProbingPeriodAtRoot());
            }

            if (var1.hasPseudoCostReliabilityThreshold()) {
               this.setPseudoCostReliabilityThreshold(var1.getPseudoCostReliabilityThreshold());
            }

            if (var1.hasOptimizeWithCore()) {
               this.setOptimizeWithCore(var1.getOptimizeWithCore());
            }

            if (var1.hasBinarySearchNumConflicts()) {
               this.setBinarySearchNumConflicts(var1.getBinarySearchNumConflicts());
            }

            if (var1.hasOptimizeWithMaxHs()) {
               this.setOptimizeWithMaxHs(var1.getOptimizeWithMaxHs());
            }

            if (var1.hasEnumerateAllSolutions()) {
               this.setEnumerateAllSolutions(var1.getEnumerateAllSolutions());
            }

            if (var1.hasFillTightenedDomainsInResponse()) {
               this.setFillTightenedDomainsInResponse(var1.getFillTightenedDomainsInResponse());
            }

            if (var1.hasInstantiateAllVariables()) {
               this.setInstantiateAllVariables(var1.getInstantiateAllVariables());
            }

            if (var1.hasAutoDetectGreaterThanAtLeastOneOf()) {
               this.setAutoDetectGreaterThanAtLeastOneOf(var1.getAutoDetectGreaterThanAtLeastOneOf());
            }

            if (var1.hasStopAfterFirstSolution()) {
               this.setStopAfterFirstSolution(var1.getStopAfterFirstSolution());
            }

            if (var1.hasNumSearchWorkers()) {
               this.setNumSearchWorkers(var1.getNumSearchWorkers());
            }

            if (var1.hasInterleaveSearch()) {
               this.setInterleaveSearch(var1.getInterleaveSearch());
            }

            if (var1.hasReduceMemoryUsageInInterleaveMode()) {
               this.setReduceMemoryUsageInInterleaveMode(var1.getReduceMemoryUsageInInterleaveMode());
            }

            if (var1.hasDeterministicParallelSearch()) {
               this.setDeterministicParallelSearch(var1.getDeterministicParallelSearch());
            }

            if (var1.hasShareObjectiveBounds()) {
               this.setShareObjectiveBounds(var1.getShareObjectiveBounds());
            }

            if (var1.hasShareLevelZeroBounds()) {
               this.setShareLevelZeroBounds(var1.getShareLevelZeroBounds());
            }

            if (var1.hasUseLnsOnly()) {
               this.setUseLnsOnly(var1.getUseLnsOnly());
            }

            if (var1.hasLnsFocusOnDecisionVariables()) {
               this.setLnsFocusOnDecisionVariables(var1.getLnsFocusOnDecisionVariables());
            }

            if (var1.hasUseRinsLns()) {
               this.setUseRinsLns(var1.getUseRinsLns());
            }

            if (var1.hasDiversifyLnsParams()) {
               this.setDiversifyLnsParams(var1.getDiversifyLnsParams());
            }

            if (var1.hasRandomizeSearch()) {
               this.setRandomizeSearch(var1.getRandomizeSearch());
            }

            if (var1.hasSearchRandomizationTolerance()) {
               this.setSearchRandomizationTolerance(var1.getSearchRandomizationTolerance());
            }

            if (var1.hasUseOptionalVariables()) {
               this.setUseOptionalVariables(var1.getUseOptionalVariables());
            }

            if (var1.hasUseExactLpReason()) {
               this.setUseExactLpReason(var1.getUseExactLpReason());
            }

            if (var1.hasUseBranchingInLp()) {
               this.setUseBranchingInLp(var1.getUseBranchingInLp());
            }

            if (var1.hasUseCombinedNoOverlap()) {
               this.setUseCombinedNoOverlap(var1.getUseCombinedNoOverlap());
            }

            if (var1.hasCatchSigintSignal()) {
               this.setCatchSigintSignal(var1.getCatchSigintSignal());
            }

            if (var1.hasUseImpliedBounds()) {
               this.setUseImpliedBounds(var1.getUseImpliedBounds());
            }

            if (var1.hasMipMaxBound()) {
               this.setMipMaxBound(var1.getMipMaxBound());
            }

            if (var1.hasMipVarScaling()) {
               this.setMipVarScaling(var1.getMipVarScaling());
            }

            if (var1.hasMipWantedPrecision()) {
               this.setMipWantedPrecision(var1.getMipWantedPrecision());
            }

            if (var1.hasMipMaxActivityExponent()) {
               this.setMipMaxActivityExponent(var1.getMipMaxActivityExponent());
            }

            if (var1.hasMipCheckPrecision()) {
               this.setMipCheckPrecision(var1.getMipCheckPrecision());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public SatParameters.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         SatParameters var3 = null;

         try {
            var3 = (SatParameters)SatParameters.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (SatParameters)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public boolean hasPreferredVariableOrder() {
         return (this.bitField0_ & 1) != 0;
      }

      public SatParameters.VariableOrder getPreferredVariableOrder() {
         SatParameters.VariableOrder var1 = SatParameters.VariableOrder.valueOf(this.preferredVariableOrder_);
         return var1 == null ? SatParameters.VariableOrder.IN_ORDER : var1;
      }

      public SatParameters.Builder setPreferredVariableOrder(SatParameters.VariableOrder var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 1;
            this.preferredVariableOrder_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder clearPreferredVariableOrder() {
         this.bitField0_ &= -2;
         this.preferredVariableOrder_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasInitialPolarity() {
         return (this.bitField0_ & 2) != 0;
      }

      public SatParameters.Polarity getInitialPolarity() {
         SatParameters.Polarity var1 = SatParameters.Polarity.valueOf(this.initialPolarity_);
         return var1 == null ? SatParameters.Polarity.POLARITY_FALSE : var1;
      }

      public SatParameters.Builder setInitialPolarity(SatParameters.Polarity var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 2;
            this.initialPolarity_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder clearInitialPolarity() {
         this.bitField0_ &= -3;
         this.initialPolarity_ = 1;
         this.onChanged();
         return this;
      }

      public boolean hasUsePhaseSaving() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getUsePhaseSaving() {
         return this.usePhaseSaving_;
      }

      public SatParameters.Builder setUsePhaseSaving(boolean var1) {
         this.bitField0_ |= 4;
         this.usePhaseSaving_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUsePhaseSaving() {
         this.bitField0_ &= -5;
         this.usePhaseSaving_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasRandomPolarityRatio() {
         return (this.bitField0_ & 8) != 0;
      }

      public double getRandomPolarityRatio() {
         return this.randomPolarityRatio_;
      }

      public SatParameters.Builder setRandomPolarityRatio(double var1) {
         this.bitField0_ |= 8;
         this.randomPolarityRatio_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearRandomPolarityRatio() {
         this.bitField0_ &= -9;
         this.randomPolarityRatio_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean hasRandomBranchesRatio() {
         return (this.bitField0_ & 16) != 0;
      }

      public double getRandomBranchesRatio() {
         return this.randomBranchesRatio_;
      }

      public SatParameters.Builder setRandomBranchesRatio(double var1) {
         this.bitField0_ |= 16;
         this.randomBranchesRatio_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearRandomBranchesRatio() {
         this.bitField0_ &= -17;
         this.randomBranchesRatio_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean hasUseErwaHeuristic() {
         return (this.bitField0_ & 32) != 0;
      }

      public boolean getUseErwaHeuristic() {
         return this.useErwaHeuristic_;
      }

      public SatParameters.Builder setUseErwaHeuristic(boolean var1) {
         this.bitField0_ |= 32;
         this.useErwaHeuristic_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseErwaHeuristic() {
         this.bitField0_ &= -33;
         this.useErwaHeuristic_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasInitialVariablesActivity() {
         return (this.bitField0_ & 64) != 0;
      }

      public double getInitialVariablesActivity() {
         return this.initialVariablesActivity_;
      }

      public SatParameters.Builder setInitialVariablesActivity(double var1) {
         this.bitField0_ |= 64;
         this.initialVariablesActivity_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearInitialVariablesActivity() {
         this.bitField0_ &= -65;
         this.initialVariablesActivity_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean hasAlsoBumpVariablesInConflictReasons() {
         return (this.bitField0_ & 128) != 0;
      }

      public boolean getAlsoBumpVariablesInConflictReasons() {
         return this.alsoBumpVariablesInConflictReasons_;
      }

      public SatParameters.Builder setAlsoBumpVariablesInConflictReasons(boolean var1) {
         this.bitField0_ |= 128;
         this.alsoBumpVariablesInConflictReasons_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearAlsoBumpVariablesInConflictReasons() {
         this.bitField0_ &= -129;
         this.alsoBumpVariablesInConflictReasons_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasMinimizationAlgorithm() {
         return (this.bitField0_ & 256) != 0;
      }

      public SatParameters.ConflictMinimizationAlgorithm getMinimizationAlgorithm() {
         SatParameters.ConflictMinimizationAlgorithm var1 = SatParameters.ConflictMinimizationAlgorithm.valueOf(this.minimizationAlgorithm_);
         return var1 == null ? SatParameters.ConflictMinimizationAlgorithm.RECURSIVE : var1;
      }

      public SatParameters.Builder setMinimizationAlgorithm(SatParameters.ConflictMinimizationAlgorithm var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 256;
            this.minimizationAlgorithm_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder clearMinimizationAlgorithm() {
         this.bitField0_ &= -257;
         this.minimizationAlgorithm_ = 2;
         this.onChanged();
         return this;
      }

      public boolean hasBinaryMinimizationAlgorithm() {
         return (this.bitField0_ & 512) != 0;
      }

      public SatParameters.BinaryMinizationAlgorithm getBinaryMinimizationAlgorithm() {
         SatParameters.BinaryMinizationAlgorithm var1 = SatParameters.BinaryMinizationAlgorithm.valueOf(this.binaryMinimizationAlgorithm_);
         return var1 == null ? SatParameters.BinaryMinizationAlgorithm.BINARY_MINIMIZATION_FIRST : var1;
      }

      public SatParameters.Builder setBinaryMinimizationAlgorithm(SatParameters.BinaryMinizationAlgorithm var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 512;
            this.binaryMinimizationAlgorithm_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder clearBinaryMinimizationAlgorithm() {
         this.bitField0_ &= -513;
         this.binaryMinimizationAlgorithm_ = 1;
         this.onChanged();
         return this;
      }

      public boolean hasSubsumptionDuringConflictAnalysis() {
         return (this.bitField0_ & 1024) != 0;
      }

      public boolean getSubsumptionDuringConflictAnalysis() {
         return this.subsumptionDuringConflictAnalysis_;
      }

      public SatParameters.Builder setSubsumptionDuringConflictAnalysis(boolean var1) {
         this.bitField0_ |= 1024;
         this.subsumptionDuringConflictAnalysis_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearSubsumptionDuringConflictAnalysis() {
         this.bitField0_ &= -1025;
         this.subsumptionDuringConflictAnalysis_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasClauseCleanupPeriod() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getClauseCleanupPeriod() {
         return this.clauseCleanupPeriod_;
      }

      public SatParameters.Builder setClauseCleanupPeriod(int var1) {
         this.bitField0_ |= 2048;
         this.clauseCleanupPeriod_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearClauseCleanupPeriod() {
         this.bitField0_ &= -2049;
         this.clauseCleanupPeriod_ = 10000;
         this.onChanged();
         return this;
      }

      public boolean hasClauseCleanupTarget() {
         return (this.bitField0_ & 4096) != 0;
      }

      public int getClauseCleanupTarget() {
         return this.clauseCleanupTarget_;
      }

      public SatParameters.Builder setClauseCleanupTarget(int var1) {
         this.bitField0_ |= 4096;
         this.clauseCleanupTarget_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearClauseCleanupTarget() {
         this.bitField0_ &= -4097;
         this.clauseCleanupTarget_ = 10000;
         this.onChanged();
         return this;
      }

      public boolean hasClauseCleanupProtection() {
         return (this.bitField0_ & 8192) != 0;
      }

      public SatParameters.ClauseProtection getClauseCleanupProtection() {
         SatParameters.ClauseProtection var1 = SatParameters.ClauseProtection.valueOf(this.clauseCleanupProtection_);
         return var1 == null ? SatParameters.ClauseProtection.PROTECTION_NONE : var1;
      }

      public SatParameters.Builder setClauseCleanupProtection(SatParameters.ClauseProtection var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 8192;
            this.clauseCleanupProtection_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder clearClauseCleanupProtection() {
         this.bitField0_ &= -8193;
         this.clauseCleanupProtection_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasClauseCleanupLbdBound() {
         return (this.bitField0_ & 16384) != 0;
      }

      public int getClauseCleanupLbdBound() {
         return this.clauseCleanupLbdBound_;
      }

      public SatParameters.Builder setClauseCleanupLbdBound(int var1) {
         this.bitField0_ |= 16384;
         this.clauseCleanupLbdBound_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearClauseCleanupLbdBound() {
         this.bitField0_ &= -16385;
         this.clauseCleanupLbdBound_ = 5;
         this.onChanged();
         return this;
      }

      public boolean hasClauseCleanupOrdering() {
         return (this.bitField0_ & '耀') != 0;
      }

      public SatParameters.ClauseOrdering getClauseCleanupOrdering() {
         SatParameters.ClauseOrdering var1 = SatParameters.ClauseOrdering.valueOf(this.clauseCleanupOrdering_);
         return var1 == null ? SatParameters.ClauseOrdering.CLAUSE_ACTIVITY : var1;
      }

      public SatParameters.Builder setClauseCleanupOrdering(SatParameters.ClauseOrdering var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 32768;
            this.clauseCleanupOrdering_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder clearClauseCleanupOrdering() {
         this.bitField0_ &= -32769;
         this.clauseCleanupOrdering_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasPbCleanupIncrement() {
         return (this.bitField0_ & 65536) != 0;
      }

      public int getPbCleanupIncrement() {
         return this.pbCleanupIncrement_;
      }

      public SatParameters.Builder setPbCleanupIncrement(int var1) {
         this.bitField0_ |= 65536;
         this.pbCleanupIncrement_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearPbCleanupIncrement() {
         this.bitField0_ &= -65537;
         this.pbCleanupIncrement_ = 200;
         this.onChanged();
         return this;
      }

      public boolean hasPbCleanupRatio() {
         return (this.bitField0_ & 131072) != 0;
      }

      public double getPbCleanupRatio() {
         return this.pbCleanupRatio_;
      }

      public SatParameters.Builder setPbCleanupRatio(double var1) {
         this.bitField0_ |= 131072;
         this.pbCleanupRatio_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearPbCleanupRatio() {
         this.bitField0_ &= -131073;
         this.pbCleanupRatio_ = 0.5D;
         this.onChanged();
         return this;
      }

      public boolean hasMinimizeWithPropagationRestartPeriod() {
         return (this.bitField0_ & 262144) != 0;
      }

      public int getMinimizeWithPropagationRestartPeriod() {
         return this.minimizeWithPropagationRestartPeriod_;
      }

      public SatParameters.Builder setMinimizeWithPropagationRestartPeriod(int var1) {
         this.bitField0_ |= 262144;
         this.minimizeWithPropagationRestartPeriod_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMinimizeWithPropagationRestartPeriod() {
         this.bitField0_ &= -262145;
         this.minimizeWithPropagationRestartPeriod_ = 10;
         this.onChanged();
         return this;
      }

      public boolean hasMinimizeWithPropagationNumDecisions() {
         return (this.bitField0_ & 524288) != 0;
      }

      public int getMinimizeWithPropagationNumDecisions() {
         return this.minimizeWithPropagationNumDecisions_;
      }

      public SatParameters.Builder setMinimizeWithPropagationNumDecisions(int var1) {
         this.bitField0_ |= 524288;
         this.minimizeWithPropagationNumDecisions_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMinimizeWithPropagationNumDecisions() {
         this.bitField0_ &= -524289;
         this.minimizeWithPropagationNumDecisions_ = 1000;
         this.onChanged();
         return this;
      }

      public boolean hasVariableActivityDecay() {
         return (this.bitField0_ & 1048576) != 0;
      }

      public double getVariableActivityDecay() {
         return this.variableActivityDecay_;
      }

      public SatParameters.Builder setVariableActivityDecay(double var1) {
         this.bitField0_ |= 1048576;
         this.variableActivityDecay_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearVariableActivityDecay() {
         this.bitField0_ &= -1048577;
         this.variableActivityDecay_ = 0.8D;
         this.onChanged();
         return this;
      }

      public boolean hasMaxVariableActivityValue() {
         return (this.bitField0_ & 2097152) != 0;
      }

      public double getMaxVariableActivityValue() {
         return this.maxVariableActivityValue_;
      }

      public SatParameters.Builder setMaxVariableActivityValue(double var1) {
         this.bitField0_ |= 2097152;
         this.maxVariableActivityValue_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxVariableActivityValue() {
         this.bitField0_ &= -2097153;
         this.maxVariableActivityValue_ = 1.0E100D;
         this.onChanged();
         return this;
      }

      public boolean hasGlucoseMaxDecay() {
         return (this.bitField0_ & 4194304) != 0;
      }

      public double getGlucoseMaxDecay() {
         return this.glucoseMaxDecay_;
      }

      public SatParameters.Builder setGlucoseMaxDecay(double var1) {
         this.bitField0_ |= 4194304;
         this.glucoseMaxDecay_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearGlucoseMaxDecay() {
         this.bitField0_ &= -4194305;
         this.glucoseMaxDecay_ = 0.95D;
         this.onChanged();
         return this;
      }

      public boolean hasGlucoseDecayIncrement() {
         return (this.bitField0_ & 8388608) != 0;
      }

      public double getGlucoseDecayIncrement() {
         return this.glucoseDecayIncrement_;
      }

      public SatParameters.Builder setGlucoseDecayIncrement(double var1) {
         this.bitField0_ |= 8388608;
         this.glucoseDecayIncrement_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearGlucoseDecayIncrement() {
         this.bitField0_ &= -8388609;
         this.glucoseDecayIncrement_ = 0.01D;
         this.onChanged();
         return this;
      }

      public boolean hasGlucoseDecayIncrementPeriod() {
         return (this.bitField0_ & 16777216) != 0;
      }

      public int getGlucoseDecayIncrementPeriod() {
         return this.glucoseDecayIncrementPeriod_;
      }

      public SatParameters.Builder setGlucoseDecayIncrementPeriod(int var1) {
         this.bitField0_ |= 16777216;
         this.glucoseDecayIncrementPeriod_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearGlucoseDecayIncrementPeriod() {
         this.bitField0_ &= -16777217;
         this.glucoseDecayIncrementPeriod_ = 5000;
         this.onChanged();
         return this;
      }

      public boolean hasClauseActivityDecay() {
         return (this.bitField0_ & 33554432) != 0;
      }

      public double getClauseActivityDecay() {
         return this.clauseActivityDecay_;
      }

      public SatParameters.Builder setClauseActivityDecay(double var1) {
         this.bitField0_ |= 33554432;
         this.clauseActivityDecay_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearClauseActivityDecay() {
         this.bitField0_ &= -33554433;
         this.clauseActivityDecay_ = 0.999D;
         this.onChanged();
         return this;
      }

      public boolean hasMaxClauseActivityValue() {
         return (this.bitField0_ & 67108864) != 0;
      }

      public double getMaxClauseActivityValue() {
         return this.maxClauseActivityValue_;
      }

      public SatParameters.Builder setMaxClauseActivityValue(double var1) {
         this.bitField0_ |= 67108864;
         this.maxClauseActivityValue_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxClauseActivityValue() {
         this.bitField0_ &= -67108865;
         this.maxClauseActivityValue_ = 1.0E20D;
         this.onChanged();
         return this;
      }

      private void ensureRestartAlgorithmsIsMutable() {
         if ((this.bitField0_ & 134217728) == 0) {
            this.restartAlgorithms_ = new ArrayList(this.restartAlgorithms_);
            this.bitField0_ |= 134217728;
         }

      }

      public List getRestartAlgorithmsList() {
         return new ListAdapter(this.restartAlgorithms_, SatParameters.restartAlgorithms_converter_);
      }

      public int getRestartAlgorithmsCount() {
         return this.restartAlgorithms_.size();
      }

      public SatParameters.RestartAlgorithm getRestartAlgorithms(int var1) {
         return (SatParameters.RestartAlgorithm)SatParameters.restartAlgorithms_converter_.convert(this.restartAlgorithms_.get(var1));
      }

      public SatParameters.Builder setRestartAlgorithms(int var1, SatParameters.RestartAlgorithm var2) {
         if (var2 == null) {
            throw new NullPointerException();
         } else {
            this.ensureRestartAlgorithmsIsMutable();
            this.restartAlgorithms_.set(var1, var2.getNumber());
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder addRestartAlgorithms(SatParameters.RestartAlgorithm var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.ensureRestartAlgorithmsIsMutable();
            this.restartAlgorithms_.add(var1.getNumber());
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder addAllRestartAlgorithms(Iterable var1) {
         this.ensureRestartAlgorithmsIsMutable();
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            SatParameters.RestartAlgorithm var3 = (SatParameters.RestartAlgorithm)var2.next();
            this.restartAlgorithms_.add(var3.getNumber());
         }

         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearRestartAlgorithms() {
         this.restartAlgorithms_ = Collections.emptyList();
         this.bitField0_ &= -134217729;
         this.onChanged();
         return this;
      }

      public boolean hasDefaultRestartAlgorithms() {
         return (this.bitField0_ & 268435456) != 0;
      }

      public String getDefaultRestartAlgorithms() {
         Object var1 = this.defaultRestartAlgorithms_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (var2.isValidUtf8()) {
               this.defaultRestartAlgorithms_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      public ByteString getDefaultRestartAlgorithmsBytes() {
         Object var1 = this.defaultRestartAlgorithms_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.defaultRestartAlgorithms_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public SatParameters.Builder setDefaultRestartAlgorithms(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 268435456;
            this.defaultRestartAlgorithms_ = var1;
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder clearDefaultRestartAlgorithms() {
         this.bitField0_ &= -268435457;
         this.defaultRestartAlgorithms_ = SatParameters.getDefaultInstance().getDefaultRestartAlgorithms();
         this.onChanged();
         return this;
      }

      public SatParameters.Builder setDefaultRestartAlgorithmsBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField0_ |= 268435456;
            this.defaultRestartAlgorithms_ = var1;
            this.onChanged();
            return this;
         }
      }

      public boolean hasRestartPeriod() {
         return (this.bitField0_ & 536870912) != 0;
      }

      public int getRestartPeriod() {
         return this.restartPeriod_;
      }

      public SatParameters.Builder setRestartPeriod(int var1) {
         this.bitField0_ |= 536870912;
         this.restartPeriod_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearRestartPeriod() {
         this.bitField0_ &= -536870913;
         this.restartPeriod_ = 50;
         this.onChanged();
         return this;
      }

      public boolean hasRestartRunningWindowSize() {
         return (this.bitField0_ & 1073741824) != 0;
      }

      public int getRestartRunningWindowSize() {
         return this.restartRunningWindowSize_;
      }

      public SatParameters.Builder setRestartRunningWindowSize(int var1) {
         this.bitField0_ |= 1073741824;
         this.restartRunningWindowSize_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearRestartRunningWindowSize() {
         this.bitField0_ &= -1073741825;
         this.restartRunningWindowSize_ = 50;
         this.onChanged();
         return this;
      }

      public boolean hasRestartDlAverageRatio() {
         return (this.bitField0_ & Integer.MIN_VALUE) != 0;
      }

      public double getRestartDlAverageRatio() {
         return this.restartDlAverageRatio_;
      }

      public SatParameters.Builder setRestartDlAverageRatio(double var1) {
         this.bitField0_ |= Integer.MIN_VALUE;
         this.restartDlAverageRatio_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearRestartDlAverageRatio() {
         this.bitField0_ &= Integer.MAX_VALUE;
         this.restartDlAverageRatio_ = 1.0D;
         this.onChanged();
         return this;
      }

      public boolean hasRestartLbdAverageRatio() {
         return (this.bitField1_ & 1) != 0;
      }

      public double getRestartLbdAverageRatio() {
         return this.restartLbdAverageRatio_;
      }

      public SatParameters.Builder setRestartLbdAverageRatio(double var1) {
         this.bitField1_ |= 1;
         this.restartLbdAverageRatio_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearRestartLbdAverageRatio() {
         this.bitField1_ &= -2;
         this.restartLbdAverageRatio_ = 1.0D;
         this.onChanged();
         return this;
      }

      public boolean hasUseBlockingRestart() {
         return (this.bitField1_ & 2) != 0;
      }

      public boolean getUseBlockingRestart() {
         return this.useBlockingRestart_;
      }

      public SatParameters.Builder setUseBlockingRestart(boolean var1) {
         this.bitField1_ |= 2;
         this.useBlockingRestart_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseBlockingRestart() {
         this.bitField1_ &= -3;
         this.useBlockingRestart_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasBlockingRestartWindowSize() {
         return (this.bitField1_ & 4) != 0;
      }

      public int getBlockingRestartWindowSize() {
         return this.blockingRestartWindowSize_;
      }

      public SatParameters.Builder setBlockingRestartWindowSize(int var1) {
         this.bitField1_ |= 4;
         this.blockingRestartWindowSize_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearBlockingRestartWindowSize() {
         this.bitField1_ &= -5;
         this.blockingRestartWindowSize_ = 5000;
         this.onChanged();
         return this;
      }

      public boolean hasBlockingRestartMultiplier() {
         return (this.bitField1_ & 8) != 0;
      }

      public double getBlockingRestartMultiplier() {
         return this.blockingRestartMultiplier_;
      }

      public SatParameters.Builder setBlockingRestartMultiplier(double var1) {
         this.bitField1_ |= 8;
         this.blockingRestartMultiplier_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearBlockingRestartMultiplier() {
         this.bitField1_ &= -9;
         this.blockingRestartMultiplier_ = 1.4D;
         this.onChanged();
         return this;
      }

      public boolean hasNumConflictsBeforeStrategyChanges() {
         return (this.bitField1_ & 16) != 0;
      }

      public int getNumConflictsBeforeStrategyChanges() {
         return this.numConflictsBeforeStrategyChanges_;
      }

      public SatParameters.Builder setNumConflictsBeforeStrategyChanges(int var1) {
         this.bitField1_ |= 16;
         this.numConflictsBeforeStrategyChanges_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearNumConflictsBeforeStrategyChanges() {
         this.bitField1_ &= -17;
         this.numConflictsBeforeStrategyChanges_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasStrategyChangeIncreaseRatio() {
         return (this.bitField1_ & 32) != 0;
      }

      public double getStrategyChangeIncreaseRatio() {
         return this.strategyChangeIncreaseRatio_;
      }

      public SatParameters.Builder setStrategyChangeIncreaseRatio(double var1) {
         this.bitField1_ |= 32;
         this.strategyChangeIncreaseRatio_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearStrategyChangeIncreaseRatio() {
         this.bitField1_ &= -33;
         this.strategyChangeIncreaseRatio_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean hasMaxTimeInSeconds() {
         return (this.bitField1_ & 64) != 0;
      }

      public double getMaxTimeInSeconds() {
         return this.maxTimeInSeconds_;
      }

      public SatParameters.Builder setMaxTimeInSeconds(double var1) {
         this.bitField1_ |= 64;
         this.maxTimeInSeconds_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxTimeInSeconds() {
         this.bitField1_ &= -65;
         this.maxTimeInSeconds_ = Double.POSITIVE_INFINITY;
         this.onChanged();
         return this;
      }

      public boolean hasMaxDeterministicTime() {
         return (this.bitField1_ & 128) != 0;
      }

      public double getMaxDeterministicTime() {
         return this.maxDeterministicTime_;
      }

      public SatParameters.Builder setMaxDeterministicTime(double var1) {
         this.bitField1_ |= 128;
         this.maxDeterministicTime_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxDeterministicTime() {
         this.bitField1_ &= -129;
         this.maxDeterministicTime_ = Double.POSITIVE_INFINITY;
         this.onChanged();
         return this;
      }

      public boolean hasMaxNumberOfConflicts() {
         return (this.bitField1_ & 256) != 0;
      }

      public long getMaxNumberOfConflicts() {
         return this.maxNumberOfConflicts_;
      }

      public SatParameters.Builder setMaxNumberOfConflicts(long var1) {
         this.bitField1_ |= 256;
         this.maxNumberOfConflicts_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxNumberOfConflicts() {
         this.bitField1_ &= -257;
         this.maxNumberOfConflicts_ = Long.MAX_VALUE;
         this.onChanged();
         return this;
      }

      public boolean hasMaxMemoryInMb() {
         return (this.bitField1_ & 512) != 0;
      }

      public long getMaxMemoryInMb() {
         return this.maxMemoryInMb_;
      }

      public SatParameters.Builder setMaxMemoryInMb(long var1) {
         this.bitField1_ |= 512;
         this.maxMemoryInMb_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxMemoryInMb() {
         this.bitField1_ &= -513;
         this.maxMemoryInMb_ = 10000L;
         this.onChanged();
         return this;
      }

      public boolean hasTreatBinaryClausesSeparately() {
         return (this.bitField1_ & 1024) != 0;
      }

      public boolean getTreatBinaryClausesSeparately() {
         return this.treatBinaryClausesSeparately_;
      }

      public SatParameters.Builder setTreatBinaryClausesSeparately(boolean var1) {
         this.bitField1_ |= 1024;
         this.treatBinaryClausesSeparately_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearTreatBinaryClausesSeparately() {
         this.bitField1_ &= -1025;
         this.treatBinaryClausesSeparately_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasRandomSeed() {
         return (this.bitField1_ & 2048) != 0;
      }

      public int getRandomSeed() {
         return this.randomSeed_;
      }

      public SatParameters.Builder setRandomSeed(int var1) {
         this.bitField1_ |= 2048;
         this.randomSeed_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearRandomSeed() {
         this.bitField1_ &= -2049;
         this.randomSeed_ = 1;
         this.onChanged();
         return this;
      }

      public boolean hasLogSearchProgress() {
         return (this.bitField1_ & 4096) != 0;
      }

      public boolean getLogSearchProgress() {
         return this.logSearchProgress_;
      }

      public SatParameters.Builder setLogSearchProgress(boolean var1) {
         this.bitField1_ |= 4096;
         this.logSearchProgress_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearLogSearchProgress() {
         this.bitField1_ &= -4097;
         this.logSearchProgress_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasUsePbResolution() {
         return (this.bitField1_ & 8192) != 0;
      }

      public boolean getUsePbResolution() {
         return this.usePbResolution_;
      }

      public SatParameters.Builder setUsePbResolution(boolean var1) {
         this.bitField1_ |= 8192;
         this.usePbResolution_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUsePbResolution() {
         this.bitField1_ &= -8193;
         this.usePbResolution_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasMinimizeReductionDuringPbResolution() {
         return (this.bitField1_ & 16384) != 0;
      }

      public boolean getMinimizeReductionDuringPbResolution() {
         return this.minimizeReductionDuringPbResolution_;
      }

      public SatParameters.Builder setMinimizeReductionDuringPbResolution(boolean var1) {
         this.bitField1_ |= 16384;
         this.minimizeReductionDuringPbResolution_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMinimizeReductionDuringPbResolution() {
         this.bitField1_ &= -16385;
         this.minimizeReductionDuringPbResolution_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasCountAssumptionLevelsInLbd() {
         return (this.bitField1_ & '耀') != 0;
      }

      public boolean getCountAssumptionLevelsInLbd() {
         return this.countAssumptionLevelsInLbd_;
      }

      public SatParameters.Builder setCountAssumptionLevelsInLbd(boolean var1) {
         this.bitField1_ |= 32768;
         this.countAssumptionLevelsInLbd_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearCountAssumptionLevelsInLbd() {
         this.bitField1_ &= -32769;
         this.countAssumptionLevelsInLbd_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasPresolveBveThreshold() {
         return (this.bitField1_ & 65536) != 0;
      }

      public int getPresolveBveThreshold() {
         return this.presolveBveThreshold_;
      }

      public SatParameters.Builder setPresolveBveThreshold(int var1) {
         this.bitField1_ |= 65536;
         this.presolveBveThreshold_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearPresolveBveThreshold() {
         this.bitField1_ &= -65537;
         this.presolveBveThreshold_ = 500;
         this.onChanged();
         return this;
      }

      public boolean hasPresolveBveClauseWeight() {
         return (this.bitField1_ & 131072) != 0;
      }

      public int getPresolveBveClauseWeight() {
         return this.presolveBveClauseWeight_;
      }

      public SatParameters.Builder setPresolveBveClauseWeight(int var1) {
         this.bitField1_ |= 131072;
         this.presolveBveClauseWeight_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearPresolveBveClauseWeight() {
         this.bitField1_ &= -131073;
         this.presolveBveClauseWeight_ = 3;
         this.onChanged();
         return this;
      }

      public boolean hasPresolveProbingDeterministicTimeLimit() {
         return (this.bitField1_ & 262144) != 0;
      }

      public double getPresolveProbingDeterministicTimeLimit() {
         return this.presolveProbingDeterministicTimeLimit_;
      }

      public SatParameters.Builder setPresolveProbingDeterministicTimeLimit(double var1) {
         this.bitField1_ |= 262144;
         this.presolveProbingDeterministicTimeLimit_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearPresolveProbingDeterministicTimeLimit() {
         this.bitField1_ &= -262145;
         this.presolveProbingDeterministicTimeLimit_ = 30.0D;
         this.onChanged();
         return this;
      }

      public boolean hasPresolveBlockedClause() {
         return (this.bitField1_ & 524288) != 0;
      }

      public boolean getPresolveBlockedClause() {
         return this.presolveBlockedClause_;
      }

      public SatParameters.Builder setPresolveBlockedClause(boolean var1) {
         this.bitField1_ |= 524288;
         this.presolveBlockedClause_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearPresolveBlockedClause() {
         this.bitField1_ &= -524289;
         this.presolveBlockedClause_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasPresolveUseBva() {
         return (this.bitField1_ & 1048576) != 0;
      }

      public boolean getPresolveUseBva() {
         return this.presolveUseBva_;
      }

      public SatParameters.Builder setPresolveUseBva(boolean var1) {
         this.bitField1_ |= 1048576;
         this.presolveUseBva_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearPresolveUseBva() {
         this.bitField1_ &= -1048577;
         this.presolveUseBva_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasPresolveBvaThreshold() {
         return (this.bitField1_ & 2097152) != 0;
      }

      public int getPresolveBvaThreshold() {
         return this.presolveBvaThreshold_;
      }

      public SatParameters.Builder setPresolveBvaThreshold(int var1) {
         this.bitField1_ |= 2097152;
         this.presolveBvaThreshold_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearPresolveBvaThreshold() {
         this.bitField1_ &= -2097153;
         this.presolveBvaThreshold_ = 1;
         this.onChanged();
         return this;
      }

      public boolean hasMaxPresolveIterations() {
         return (this.bitField1_ & 4194304) != 0;
      }

      public int getMaxPresolveIterations() {
         return this.maxPresolveIterations_;
      }

      public SatParameters.Builder setMaxPresolveIterations(int var1) {
         this.bitField1_ |= 4194304;
         this.maxPresolveIterations_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxPresolveIterations() {
         this.bitField1_ &= -4194305;
         this.maxPresolveIterations_ = 3;
         this.onChanged();
         return this;
      }

      public boolean hasCpModelPresolve() {
         return (this.bitField1_ & 8388608) != 0;
      }

      public boolean getCpModelPresolve() {
         return this.cpModelPresolve_;
      }

      public SatParameters.Builder setCpModelPresolve(boolean var1) {
         this.bitField1_ |= 8388608;
         this.cpModelPresolve_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearCpModelPresolve() {
         this.bitField1_ &= -8388609;
         this.cpModelPresolve_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasCpModelProbingLevel() {
         return (this.bitField1_ & 16777216) != 0;
      }

      public int getCpModelProbingLevel() {
         return this.cpModelProbingLevel_;
      }

      public SatParameters.Builder setCpModelProbingLevel(int var1) {
         this.bitField1_ |= 16777216;
         this.cpModelProbingLevel_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearCpModelProbingLevel() {
         this.bitField1_ &= -16777217;
         this.cpModelProbingLevel_ = 2;
         this.onChanged();
         return this;
      }

      public boolean hasCpModelUseSatPresolve() {
         return (this.bitField1_ & 33554432) != 0;
      }

      public boolean getCpModelUseSatPresolve() {
         return this.cpModelUseSatPresolve_;
      }

      public SatParameters.Builder setCpModelUseSatPresolve(boolean var1) {
         this.bitField1_ |= 33554432;
         this.cpModelUseSatPresolve_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearCpModelUseSatPresolve() {
         this.bitField1_ &= -33554433;
         this.cpModelUseSatPresolve_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasExpandElementConstraints() {
         return (this.bitField1_ & 67108864) != 0;
      }

      public boolean getExpandElementConstraints() {
         return this.expandElementConstraints_;
      }

      public SatParameters.Builder setExpandElementConstraints(boolean var1) {
         this.bitField1_ |= 67108864;
         this.expandElementConstraints_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearExpandElementConstraints() {
         this.bitField1_ &= -67108865;
         this.expandElementConstraints_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasExpandAutomatonConstraints() {
         return (this.bitField1_ & 134217728) != 0;
      }

      public boolean getExpandAutomatonConstraints() {
         return this.expandAutomatonConstraints_;
      }

      public SatParameters.Builder setExpandAutomatonConstraints(boolean var1) {
         this.bitField1_ |= 134217728;
         this.expandAutomatonConstraints_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearExpandAutomatonConstraints() {
         this.bitField1_ &= -134217729;
         this.expandAutomatonConstraints_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasMergeNoOverlapWorkLimit() {
         return (this.bitField1_ & 268435456) != 0;
      }

      public double getMergeNoOverlapWorkLimit() {
         return this.mergeNoOverlapWorkLimit_;
      }

      public SatParameters.Builder setMergeNoOverlapWorkLimit(double var1) {
         this.bitField1_ |= 268435456;
         this.mergeNoOverlapWorkLimit_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMergeNoOverlapWorkLimit() {
         this.bitField1_ &= -268435457;
         this.mergeNoOverlapWorkLimit_ = 1.0E12D;
         this.onChanged();
         return this;
      }

      public boolean hasMergeAtMostOneWorkLimit() {
         return (this.bitField1_ & 536870912) != 0;
      }

      public double getMergeAtMostOneWorkLimit() {
         return this.mergeAtMostOneWorkLimit_;
      }

      public SatParameters.Builder setMergeAtMostOneWorkLimit(double var1) {
         this.bitField1_ |= 536870912;
         this.mergeAtMostOneWorkLimit_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMergeAtMostOneWorkLimit() {
         this.bitField1_ &= -536870913;
         this.mergeAtMostOneWorkLimit_ = 1.0E8D;
         this.onChanged();
         return this;
      }

      public boolean hasPresolveSubstitutionLevel() {
         return (this.bitField1_ & 1073741824) != 0;
      }

      public int getPresolveSubstitutionLevel() {
         return this.presolveSubstitutionLevel_;
      }

      public SatParameters.Builder setPresolveSubstitutionLevel(int var1) {
         this.bitField1_ |= 1073741824;
         this.presolveSubstitutionLevel_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearPresolveSubstitutionLevel() {
         this.bitField1_ &= -1073741825;
         this.presolveSubstitutionLevel_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasUseOptimizationHints() {
         return (this.bitField1_ & Integer.MIN_VALUE) != 0;
      }

      public boolean getUseOptimizationHints() {
         return this.useOptimizationHints_;
      }

      public SatParameters.Builder setUseOptimizationHints(boolean var1) {
         this.bitField1_ |= Integer.MIN_VALUE;
         this.useOptimizationHints_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseOptimizationHints() {
         this.bitField1_ &= Integer.MAX_VALUE;
         this.useOptimizationHints_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasMinimizeCore() {
         return (this.bitField2_ & 1) != 0;
      }

      public boolean getMinimizeCore() {
         return this.minimizeCore_;
      }

      public SatParameters.Builder setMinimizeCore(boolean var1) {
         this.bitField2_ |= 1;
         this.minimizeCore_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMinimizeCore() {
         this.bitField2_ &= -2;
         this.minimizeCore_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasFindMultipleCores() {
         return (this.bitField2_ & 2) != 0;
      }

      public boolean getFindMultipleCores() {
         return this.findMultipleCores_;
      }

      public SatParameters.Builder setFindMultipleCores(boolean var1) {
         this.bitField2_ |= 2;
         this.findMultipleCores_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearFindMultipleCores() {
         this.bitField2_ &= -3;
         this.findMultipleCores_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasCoverOptimization() {
         return (this.bitField2_ & 4) != 0;
      }

      public boolean getCoverOptimization() {
         return this.coverOptimization_;
      }

      public SatParameters.Builder setCoverOptimization(boolean var1) {
         this.bitField2_ |= 4;
         this.coverOptimization_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearCoverOptimization() {
         this.bitField2_ &= -5;
         this.coverOptimization_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasMaxSatAssumptionOrder() {
         return (this.bitField2_ & 8) != 0;
      }

      public SatParameters.MaxSatAssumptionOrder getMaxSatAssumptionOrder() {
         SatParameters.MaxSatAssumptionOrder var1 = SatParameters.MaxSatAssumptionOrder.valueOf(this.maxSatAssumptionOrder_);
         return var1 == null ? SatParameters.MaxSatAssumptionOrder.DEFAULT_ASSUMPTION_ORDER : var1;
      }

      public SatParameters.Builder setMaxSatAssumptionOrder(SatParameters.MaxSatAssumptionOrder var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField2_ |= 8;
            this.maxSatAssumptionOrder_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder clearMaxSatAssumptionOrder() {
         this.bitField2_ &= -9;
         this.maxSatAssumptionOrder_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasMaxSatReverseAssumptionOrder() {
         return (this.bitField2_ & 16) != 0;
      }

      public boolean getMaxSatReverseAssumptionOrder() {
         return this.maxSatReverseAssumptionOrder_;
      }

      public SatParameters.Builder setMaxSatReverseAssumptionOrder(boolean var1) {
         this.bitField2_ |= 16;
         this.maxSatReverseAssumptionOrder_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxSatReverseAssumptionOrder() {
         this.bitField2_ &= -17;
         this.maxSatReverseAssumptionOrder_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasMaxSatStratification() {
         return (this.bitField2_ & 32) != 0;
      }

      public SatParameters.MaxSatStratificationAlgorithm getMaxSatStratification() {
         SatParameters.MaxSatStratificationAlgorithm var1 = SatParameters.MaxSatStratificationAlgorithm.valueOf(this.maxSatStratification_);
         return var1 == null ? SatParameters.MaxSatStratificationAlgorithm.STRATIFICATION_DESCENT : var1;
      }

      public SatParameters.Builder setMaxSatStratification(SatParameters.MaxSatStratificationAlgorithm var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField2_ |= 32;
            this.maxSatStratification_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder clearMaxSatStratification() {
         this.bitField2_ &= -33;
         this.maxSatStratification_ = 1;
         this.onChanged();
         return this;
      }

      public boolean hasUsePrecedencesInDisjunctiveConstraint() {
         return (this.bitField2_ & 64) != 0;
      }

      public boolean getUsePrecedencesInDisjunctiveConstraint() {
         return this.usePrecedencesInDisjunctiveConstraint_;
      }

      public SatParameters.Builder setUsePrecedencesInDisjunctiveConstraint(boolean var1) {
         this.bitField2_ |= 64;
         this.usePrecedencesInDisjunctiveConstraint_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUsePrecedencesInDisjunctiveConstraint() {
         this.bitField2_ &= -65;
         this.usePrecedencesInDisjunctiveConstraint_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasUseOverloadCheckerInCumulativeConstraint() {
         return (this.bitField2_ & 128) != 0;
      }

      public boolean getUseOverloadCheckerInCumulativeConstraint() {
         return this.useOverloadCheckerInCumulativeConstraint_;
      }

      public SatParameters.Builder setUseOverloadCheckerInCumulativeConstraint(boolean var1) {
         this.bitField2_ |= 128;
         this.useOverloadCheckerInCumulativeConstraint_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseOverloadCheckerInCumulativeConstraint() {
         this.bitField2_ &= -129;
         this.useOverloadCheckerInCumulativeConstraint_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasUseTimetableEdgeFindingInCumulativeConstraint() {
         return (this.bitField2_ & 256) != 0;
      }

      public boolean getUseTimetableEdgeFindingInCumulativeConstraint() {
         return this.useTimetableEdgeFindingInCumulativeConstraint_;
      }

      public SatParameters.Builder setUseTimetableEdgeFindingInCumulativeConstraint(boolean var1) {
         this.bitField2_ |= 256;
         this.useTimetableEdgeFindingInCumulativeConstraint_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseTimetableEdgeFindingInCumulativeConstraint() {
         this.bitField2_ &= -257;
         this.useTimetableEdgeFindingInCumulativeConstraint_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasUseDisjunctiveConstraintInCumulativeConstraint() {
         return (this.bitField2_ & 512) != 0;
      }

      public boolean getUseDisjunctiveConstraintInCumulativeConstraint() {
         return this.useDisjunctiveConstraintInCumulativeConstraint_;
      }

      public SatParameters.Builder setUseDisjunctiveConstraintInCumulativeConstraint(boolean var1) {
         this.bitField2_ |= 512;
         this.useDisjunctiveConstraintInCumulativeConstraint_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseDisjunctiveConstraintInCumulativeConstraint() {
         this.bitField2_ &= -513;
         this.useDisjunctiveConstraintInCumulativeConstraint_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasLinearizationLevel() {
         return (this.bitField2_ & 1024) != 0;
      }

      public int getLinearizationLevel() {
         return this.linearizationLevel_;
      }

      public SatParameters.Builder setLinearizationLevel(int var1) {
         this.bitField2_ |= 1024;
         this.linearizationLevel_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearLinearizationLevel() {
         this.bitField2_ &= -1025;
         this.linearizationLevel_ = 1;
         this.onChanged();
         return this;
      }

      public boolean hasBooleanEncodingLevel() {
         return (this.bitField2_ & 2048) != 0;
      }

      public int getBooleanEncodingLevel() {
         return this.booleanEncodingLevel_;
      }

      public SatParameters.Builder setBooleanEncodingLevel(int var1) {
         this.bitField2_ |= 2048;
         this.booleanEncodingLevel_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearBooleanEncodingLevel() {
         this.bitField2_ &= -2049;
         this.booleanEncodingLevel_ = 1;
         this.onChanged();
         return this;
      }

      public boolean hasMaxNumCuts() {
         return (this.bitField2_ & 4096) != 0;
      }

      public int getMaxNumCuts() {
         return this.maxNumCuts_;
      }

      public SatParameters.Builder setMaxNumCuts(int var1) {
         this.bitField2_ |= 4096;
         this.maxNumCuts_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxNumCuts() {
         this.bitField2_ &= -4097;
         this.maxNumCuts_ = 5000;
         this.onChanged();
         return this;
      }

      public boolean hasOnlyAddCutsAtLevelZero() {
         return (this.bitField2_ & 8192) != 0;
      }

      public boolean getOnlyAddCutsAtLevelZero() {
         return this.onlyAddCutsAtLevelZero_;
      }

      public SatParameters.Builder setOnlyAddCutsAtLevelZero(boolean var1) {
         this.bitField2_ |= 8192;
         this.onlyAddCutsAtLevelZero_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearOnlyAddCutsAtLevelZero() {
         this.bitField2_ &= -8193;
         this.onlyAddCutsAtLevelZero_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasAddKnapsackCuts() {
         return (this.bitField2_ & 16384) != 0;
      }

      public boolean getAddKnapsackCuts() {
         return this.addKnapsackCuts_;
      }

      public SatParameters.Builder setAddKnapsackCuts(boolean var1) {
         this.bitField2_ |= 16384;
         this.addKnapsackCuts_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearAddKnapsackCuts() {
         this.bitField2_ &= -16385;
         this.addKnapsackCuts_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasAddCgCuts() {
         return (this.bitField2_ & '耀') != 0;
      }

      public boolean getAddCgCuts() {
         return this.addCgCuts_;
      }

      public SatParameters.Builder setAddCgCuts(boolean var1) {
         this.bitField2_ |= 32768;
         this.addCgCuts_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearAddCgCuts() {
         this.bitField2_ &= -32769;
         this.addCgCuts_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasAddMirCuts() {
         return (this.bitField2_ & 65536) != 0;
      }

      public boolean getAddMirCuts() {
         return this.addMirCuts_;
      }

      public SatParameters.Builder setAddMirCuts(boolean var1) {
         this.bitField2_ |= 65536;
         this.addMirCuts_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearAddMirCuts() {
         this.bitField2_ &= -65537;
         this.addMirCuts_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasMaxAllDiffCutSize() {
         return (this.bitField2_ & 131072) != 0;
      }

      public int getMaxAllDiffCutSize() {
         return this.maxAllDiffCutSize_;
      }

      public SatParameters.Builder setMaxAllDiffCutSize(int var1) {
         this.bitField2_ |= 131072;
         this.maxAllDiffCutSize_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxAllDiffCutSize() {
         this.bitField2_ &= -131073;
         this.maxAllDiffCutSize_ = 7;
         this.onChanged();
         return this;
      }

      public boolean hasUseMirRounding() {
         return (this.bitField2_ & 262144) != 0;
      }

      public boolean getUseMirRounding() {
         return this.useMirRounding_;
      }

      public SatParameters.Builder setUseMirRounding(boolean var1) {
         this.bitField2_ |= 262144;
         this.useMirRounding_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseMirRounding() {
         this.bitField2_ &= -262145;
         this.useMirRounding_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasMaxIntegerRoundingScaling() {
         return (this.bitField2_ & 524288) != 0;
      }

      public int getMaxIntegerRoundingScaling() {
         return this.maxIntegerRoundingScaling_;
      }

      public SatParameters.Builder setMaxIntegerRoundingScaling(int var1) {
         this.bitField2_ |= 524288;
         this.maxIntegerRoundingScaling_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxIntegerRoundingScaling() {
         this.bitField2_ &= -524289;
         this.maxIntegerRoundingScaling_ = 600;
         this.onChanged();
         return this;
      }

      public boolean hasAddLpConstraintsLazily() {
         return (this.bitField2_ & 1048576) != 0;
      }

      public boolean getAddLpConstraintsLazily() {
         return this.addLpConstraintsLazily_;
      }

      public SatParameters.Builder setAddLpConstraintsLazily(boolean var1) {
         this.bitField2_ |= 1048576;
         this.addLpConstraintsLazily_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearAddLpConstraintsLazily() {
         this.bitField2_ &= -1048577;
         this.addLpConstraintsLazily_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasMinOrthogonalityForLpConstraints() {
         return (this.bitField2_ & 2097152) != 0;
      }

      public double getMinOrthogonalityForLpConstraints() {
         return this.minOrthogonalityForLpConstraints_;
      }

      public SatParameters.Builder setMinOrthogonalityForLpConstraints(double var1) {
         this.bitField2_ |= 2097152;
         this.minOrthogonalityForLpConstraints_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMinOrthogonalityForLpConstraints() {
         this.bitField2_ &= -2097153;
         this.minOrthogonalityForLpConstraints_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean hasMaxInactiveCount() {
         return (this.bitField2_ & 4194304) != 0;
      }

      public long getMaxInactiveCount() {
         return this.maxInactiveCount_;
      }

      public SatParameters.Builder setMaxInactiveCount(long var1) {
         this.bitField2_ |= 4194304;
         this.maxInactiveCount_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMaxInactiveCount() {
         this.bitField2_ &= -4194305;
         this.maxInactiveCount_ = 1000L;
         this.onChanged();
         return this;
      }

      public boolean hasConstraintRemovalBatchSize() {
         return (this.bitField2_ & 8388608) != 0;
      }

      public long getConstraintRemovalBatchSize() {
         return this.constraintRemovalBatchSize_;
      }

      public SatParameters.Builder setConstraintRemovalBatchSize(long var1) {
         this.bitField2_ |= 8388608;
         this.constraintRemovalBatchSize_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearConstraintRemovalBatchSize() {
         this.bitField2_ &= -8388609;
         this.constraintRemovalBatchSize_ = 100L;
         this.onChanged();
         return this;
      }

      public boolean hasSearchBranching() {
         return (this.bitField2_ & 16777216) != 0;
      }

      public SatParameters.SearchBranching getSearchBranching() {
         SatParameters.SearchBranching var1 = SatParameters.SearchBranching.valueOf(this.searchBranching_);
         return var1 == null ? SatParameters.SearchBranching.AUTOMATIC_SEARCH : var1;
      }

      public SatParameters.Builder setSearchBranching(SatParameters.SearchBranching var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.bitField2_ |= 16777216;
            this.searchBranching_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public SatParameters.Builder clearSearchBranching() {
         this.bitField2_ &= -16777217;
         this.searchBranching_ = 0;
         this.onChanged();
         return this;
      }

      public boolean hasExploitIntegerLpSolution() {
         return (this.bitField2_ & 33554432) != 0;
      }

      public boolean getExploitIntegerLpSolution() {
         return this.exploitIntegerLpSolution_;
      }

      public SatParameters.Builder setExploitIntegerLpSolution(boolean var1) {
         this.bitField2_ |= 33554432;
         this.exploitIntegerLpSolution_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearExploitIntegerLpSolution() {
         this.bitField2_ &= -33554433;
         this.exploitIntegerLpSolution_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasExploitAllLpSolution() {
         return (this.bitField2_ & 67108864) != 0;
      }

      public boolean getExploitAllLpSolution() {
         return this.exploitAllLpSolution_;
      }

      public SatParameters.Builder setExploitAllLpSolution(boolean var1) {
         this.bitField2_ |= 67108864;
         this.exploitAllLpSolution_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearExploitAllLpSolution() {
         this.bitField2_ &= -67108865;
         this.exploitAllLpSolution_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasExploitBestSolution() {
         return (this.bitField2_ & 134217728) != 0;
      }

      public boolean getExploitBestSolution() {
         return this.exploitBestSolution_;
      }

      public SatParameters.Builder setExploitBestSolution(boolean var1) {
         this.bitField2_ |= 134217728;
         this.exploitBestSolution_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearExploitBestSolution() {
         this.bitField2_ &= -134217729;
         this.exploitBestSolution_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasExploitObjective() {
         return (this.bitField2_ & 268435456) != 0;
      }

      public boolean getExploitObjective() {
         return this.exploitObjective_;
      }

      public SatParameters.Builder setExploitObjective(boolean var1) {
         this.bitField2_ |= 268435456;
         this.exploitObjective_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearExploitObjective() {
         this.bitField2_ &= -268435457;
         this.exploitObjective_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasProbingPeriodAtRoot() {
         return (this.bitField2_ & 536870912) != 0;
      }

      public long getProbingPeriodAtRoot() {
         return this.probingPeriodAtRoot_;
      }

      public SatParameters.Builder setProbingPeriodAtRoot(long var1) {
         this.bitField2_ |= 536870912;
         this.probingPeriodAtRoot_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearProbingPeriodAtRoot() {
         this.bitField2_ &= -536870913;
         this.probingPeriodAtRoot_ = 0L;
         this.onChanged();
         return this;
      }

      public boolean hasPseudoCostReliabilityThreshold() {
         return (this.bitField2_ & 1073741824) != 0;
      }

      public long getPseudoCostReliabilityThreshold() {
         return this.pseudoCostReliabilityThreshold_;
      }

      public SatParameters.Builder setPseudoCostReliabilityThreshold(long var1) {
         this.bitField2_ |= 1073741824;
         this.pseudoCostReliabilityThreshold_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearPseudoCostReliabilityThreshold() {
         this.bitField2_ &= -1073741825;
         this.pseudoCostReliabilityThreshold_ = 100L;
         this.onChanged();
         return this;
      }

      public boolean hasOptimizeWithCore() {
         return (this.bitField2_ & Integer.MIN_VALUE) != 0;
      }

      public boolean getOptimizeWithCore() {
         return this.optimizeWithCore_;
      }

      public SatParameters.Builder setOptimizeWithCore(boolean var1) {
         this.bitField2_ |= Integer.MIN_VALUE;
         this.optimizeWithCore_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearOptimizeWithCore() {
         this.bitField2_ &= Integer.MAX_VALUE;
         this.optimizeWithCore_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasBinarySearchNumConflicts() {
         return (this.bitField3_ & 1) != 0;
      }

      public int getBinarySearchNumConflicts() {
         return this.binarySearchNumConflicts_;
      }

      public SatParameters.Builder setBinarySearchNumConflicts(int var1) {
         this.bitField3_ |= 1;
         this.binarySearchNumConflicts_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearBinarySearchNumConflicts() {
         this.bitField3_ &= -2;
         this.binarySearchNumConflicts_ = -1;
         this.onChanged();
         return this;
      }

      public boolean hasOptimizeWithMaxHs() {
         return (this.bitField3_ & 2) != 0;
      }

      public boolean getOptimizeWithMaxHs() {
         return this.optimizeWithMaxHs_;
      }

      public SatParameters.Builder setOptimizeWithMaxHs(boolean var1) {
         this.bitField3_ |= 2;
         this.optimizeWithMaxHs_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearOptimizeWithMaxHs() {
         this.bitField3_ &= -3;
         this.optimizeWithMaxHs_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasEnumerateAllSolutions() {
         return (this.bitField3_ & 4) != 0;
      }

      public boolean getEnumerateAllSolutions() {
         return this.enumerateAllSolutions_;
      }

      public SatParameters.Builder setEnumerateAllSolutions(boolean var1) {
         this.bitField3_ |= 4;
         this.enumerateAllSolutions_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearEnumerateAllSolutions() {
         this.bitField3_ &= -5;
         this.enumerateAllSolutions_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasFillTightenedDomainsInResponse() {
         return (this.bitField3_ & 8) != 0;
      }

      public boolean getFillTightenedDomainsInResponse() {
         return this.fillTightenedDomainsInResponse_;
      }

      public SatParameters.Builder setFillTightenedDomainsInResponse(boolean var1) {
         this.bitField3_ |= 8;
         this.fillTightenedDomainsInResponse_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearFillTightenedDomainsInResponse() {
         this.bitField3_ &= -9;
         this.fillTightenedDomainsInResponse_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasInstantiateAllVariables() {
         return (this.bitField3_ & 16) != 0;
      }

      public boolean getInstantiateAllVariables() {
         return this.instantiateAllVariables_;
      }

      public SatParameters.Builder setInstantiateAllVariables(boolean var1) {
         this.bitField3_ |= 16;
         this.instantiateAllVariables_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearInstantiateAllVariables() {
         this.bitField3_ &= -17;
         this.instantiateAllVariables_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasAutoDetectGreaterThanAtLeastOneOf() {
         return (this.bitField3_ & 32) != 0;
      }

      public boolean getAutoDetectGreaterThanAtLeastOneOf() {
         return this.autoDetectGreaterThanAtLeastOneOf_;
      }

      public SatParameters.Builder setAutoDetectGreaterThanAtLeastOneOf(boolean var1) {
         this.bitField3_ |= 32;
         this.autoDetectGreaterThanAtLeastOneOf_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearAutoDetectGreaterThanAtLeastOneOf() {
         this.bitField3_ &= -33;
         this.autoDetectGreaterThanAtLeastOneOf_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasStopAfterFirstSolution() {
         return (this.bitField3_ & 64) != 0;
      }

      public boolean getStopAfterFirstSolution() {
         return this.stopAfterFirstSolution_;
      }

      public SatParameters.Builder setStopAfterFirstSolution(boolean var1) {
         this.bitField3_ |= 64;
         this.stopAfterFirstSolution_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearStopAfterFirstSolution() {
         this.bitField3_ &= -65;
         this.stopAfterFirstSolution_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasNumSearchWorkers() {
         return (this.bitField3_ & 128) != 0;
      }

      public int getNumSearchWorkers() {
         return this.numSearchWorkers_;
      }

      public SatParameters.Builder setNumSearchWorkers(int var1) {
         this.bitField3_ |= 128;
         this.numSearchWorkers_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearNumSearchWorkers() {
         this.bitField3_ &= -129;
         this.numSearchWorkers_ = 1;
         this.onChanged();
         return this;
      }

      public boolean hasInterleaveSearch() {
         return (this.bitField3_ & 256) != 0;
      }

      public boolean getInterleaveSearch() {
         return this.interleaveSearch_;
      }

      public SatParameters.Builder setInterleaveSearch(boolean var1) {
         this.bitField3_ |= 256;
         this.interleaveSearch_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearInterleaveSearch() {
         this.bitField3_ &= -257;
         this.interleaveSearch_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasReduceMemoryUsageInInterleaveMode() {
         return (this.bitField3_ & 512) != 0;
      }

      public boolean getReduceMemoryUsageInInterleaveMode() {
         return this.reduceMemoryUsageInInterleaveMode_;
      }

      public SatParameters.Builder setReduceMemoryUsageInInterleaveMode(boolean var1) {
         this.bitField3_ |= 512;
         this.reduceMemoryUsageInInterleaveMode_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearReduceMemoryUsageInInterleaveMode() {
         this.bitField3_ &= -513;
         this.reduceMemoryUsageInInterleaveMode_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasDeterministicParallelSearch() {
         return (this.bitField3_ & 1024) != 0;
      }

      public boolean getDeterministicParallelSearch() {
         return this.deterministicParallelSearch_;
      }

      public SatParameters.Builder setDeterministicParallelSearch(boolean var1) {
         this.bitField3_ |= 1024;
         this.deterministicParallelSearch_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearDeterministicParallelSearch() {
         this.bitField3_ &= -1025;
         this.deterministicParallelSearch_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasShareObjectiveBounds() {
         return (this.bitField3_ & 2048) != 0;
      }

      public boolean getShareObjectiveBounds() {
         return this.shareObjectiveBounds_;
      }

      public SatParameters.Builder setShareObjectiveBounds(boolean var1) {
         this.bitField3_ |= 2048;
         this.shareObjectiveBounds_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearShareObjectiveBounds() {
         this.bitField3_ &= -2049;
         this.shareObjectiveBounds_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasShareLevelZeroBounds() {
         return (this.bitField3_ & 4096) != 0;
      }

      public boolean getShareLevelZeroBounds() {
         return this.shareLevelZeroBounds_;
      }

      public SatParameters.Builder setShareLevelZeroBounds(boolean var1) {
         this.bitField3_ |= 4096;
         this.shareLevelZeroBounds_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearShareLevelZeroBounds() {
         this.bitField3_ &= -4097;
         this.shareLevelZeroBounds_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasUseLnsOnly() {
         return (this.bitField3_ & 8192) != 0;
      }

      public boolean getUseLnsOnly() {
         return this.useLnsOnly_;
      }

      public SatParameters.Builder setUseLnsOnly(boolean var1) {
         this.bitField3_ |= 8192;
         this.useLnsOnly_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseLnsOnly() {
         this.bitField3_ &= -8193;
         this.useLnsOnly_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasLnsFocusOnDecisionVariables() {
         return (this.bitField3_ & 16384) != 0;
      }

      public boolean getLnsFocusOnDecisionVariables() {
         return this.lnsFocusOnDecisionVariables_;
      }

      public SatParameters.Builder setLnsFocusOnDecisionVariables(boolean var1) {
         this.bitField3_ |= 16384;
         this.lnsFocusOnDecisionVariables_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearLnsFocusOnDecisionVariables() {
         this.bitField3_ &= -16385;
         this.lnsFocusOnDecisionVariables_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasUseRinsLns() {
         return (this.bitField3_ & '耀') != 0;
      }

      public boolean getUseRinsLns() {
         return this.useRinsLns_;
      }

      public SatParameters.Builder setUseRinsLns(boolean var1) {
         this.bitField3_ |= 32768;
         this.useRinsLns_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseRinsLns() {
         this.bitField3_ &= -32769;
         this.useRinsLns_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasDiversifyLnsParams() {
         return (this.bitField3_ & 65536) != 0;
      }

      public boolean getDiversifyLnsParams() {
         return this.diversifyLnsParams_;
      }

      public SatParameters.Builder setDiversifyLnsParams(boolean var1) {
         this.bitField3_ |= 65536;
         this.diversifyLnsParams_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearDiversifyLnsParams() {
         this.bitField3_ &= -65537;
         this.diversifyLnsParams_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasRandomizeSearch() {
         return (this.bitField3_ & 131072) != 0;
      }

      public boolean getRandomizeSearch() {
         return this.randomizeSearch_;
      }

      public SatParameters.Builder setRandomizeSearch(boolean var1) {
         this.bitField3_ |= 131072;
         this.randomizeSearch_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearRandomizeSearch() {
         this.bitField3_ &= -131073;
         this.randomizeSearch_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasSearchRandomizationTolerance() {
         return (this.bitField3_ & 262144) != 0;
      }

      public long getSearchRandomizationTolerance() {
         return this.searchRandomizationTolerance_;
      }

      public SatParameters.Builder setSearchRandomizationTolerance(long var1) {
         this.bitField3_ |= 262144;
         this.searchRandomizationTolerance_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearSearchRandomizationTolerance() {
         this.bitField3_ &= -262145;
         this.searchRandomizationTolerance_ = 0L;
         this.onChanged();
         return this;
      }

      public boolean hasUseOptionalVariables() {
         return (this.bitField3_ & 524288) != 0;
      }

      public boolean getUseOptionalVariables() {
         return this.useOptionalVariables_;
      }

      public SatParameters.Builder setUseOptionalVariables(boolean var1) {
         this.bitField3_ |= 524288;
         this.useOptionalVariables_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseOptionalVariables() {
         this.bitField3_ &= -524289;
         this.useOptionalVariables_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasUseExactLpReason() {
         return (this.bitField3_ & 1048576) != 0;
      }

      public boolean getUseExactLpReason() {
         return this.useExactLpReason_;
      }

      public SatParameters.Builder setUseExactLpReason(boolean var1) {
         this.bitField3_ |= 1048576;
         this.useExactLpReason_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseExactLpReason() {
         this.bitField3_ &= -1048577;
         this.useExactLpReason_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasUseBranchingInLp() {
         return (this.bitField3_ & 2097152) != 0;
      }

      public boolean getUseBranchingInLp() {
         return this.useBranchingInLp_;
      }

      public SatParameters.Builder setUseBranchingInLp(boolean var1) {
         this.bitField3_ |= 2097152;
         this.useBranchingInLp_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseBranchingInLp() {
         this.bitField3_ &= -2097153;
         this.useBranchingInLp_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasUseCombinedNoOverlap() {
         return (this.bitField3_ & 4194304) != 0;
      }

      public boolean getUseCombinedNoOverlap() {
         return this.useCombinedNoOverlap_;
      }

      public SatParameters.Builder setUseCombinedNoOverlap(boolean var1) {
         this.bitField3_ |= 4194304;
         this.useCombinedNoOverlap_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseCombinedNoOverlap() {
         this.bitField3_ &= -4194305;
         this.useCombinedNoOverlap_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasCatchSigintSignal() {
         return (this.bitField3_ & 8388608) != 0;
      }

      public boolean getCatchSigintSignal() {
         return this.catchSigintSignal_;
      }

      public SatParameters.Builder setCatchSigintSignal(boolean var1) {
         this.bitField3_ |= 8388608;
         this.catchSigintSignal_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearCatchSigintSignal() {
         this.bitField3_ &= -8388609;
         this.catchSigintSignal_ = true;
         this.onChanged();
         return this;
      }

      public boolean hasUseImpliedBounds() {
         return (this.bitField3_ & 16777216) != 0;
      }

      public boolean getUseImpliedBounds() {
         return this.useImpliedBounds_;
      }

      public SatParameters.Builder setUseImpliedBounds(boolean var1) {
         this.bitField3_ |= 16777216;
         this.useImpliedBounds_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearUseImpliedBounds() {
         this.bitField3_ &= -16777217;
         this.useImpliedBounds_ = false;
         this.onChanged();
         return this;
      }

      public boolean hasMipMaxBound() {
         return (this.bitField3_ & 33554432) != 0;
      }

      public double getMipMaxBound() {
         return this.mipMaxBound_;
      }

      public SatParameters.Builder setMipMaxBound(double var1) {
         this.bitField3_ |= 33554432;
         this.mipMaxBound_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMipMaxBound() {
         this.bitField3_ &= -33554433;
         this.mipMaxBound_ = 1.0E7D;
         this.onChanged();
         return this;
      }

      public boolean hasMipVarScaling() {
         return (this.bitField3_ & 67108864) != 0;
      }

      public double getMipVarScaling() {
         return this.mipVarScaling_;
      }

      public SatParameters.Builder setMipVarScaling(double var1) {
         this.bitField3_ |= 67108864;
         this.mipVarScaling_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMipVarScaling() {
         this.bitField3_ &= -67108865;
         this.mipVarScaling_ = 1.0D;
         this.onChanged();
         return this;
      }

      public boolean hasMipWantedPrecision() {
         return (this.bitField3_ & 134217728) != 0;
      }

      public double getMipWantedPrecision() {
         return this.mipWantedPrecision_;
      }

      public SatParameters.Builder setMipWantedPrecision(double var1) {
         this.bitField3_ |= 134217728;
         this.mipWantedPrecision_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMipWantedPrecision() {
         this.bitField3_ &= -134217729;
         this.mipWantedPrecision_ = 1.0E-6D;
         this.onChanged();
         return this;
      }

      public boolean hasMipMaxActivityExponent() {
         return (this.bitField3_ & 268435456) != 0;
      }

      public int getMipMaxActivityExponent() {
         return this.mipMaxActivityExponent_;
      }

      public SatParameters.Builder setMipMaxActivityExponent(int var1) {
         this.bitField3_ |= 268435456;
         this.mipMaxActivityExponent_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMipMaxActivityExponent() {
         this.bitField3_ &= -268435457;
         this.mipMaxActivityExponent_ = 53;
         this.onChanged();
         return this;
      }

      public boolean hasMipCheckPrecision() {
         return (this.bitField3_ & 536870912) != 0;
      }

      public double getMipCheckPrecision() {
         return this.mipCheckPrecision_;
      }

      public SatParameters.Builder setMipCheckPrecision(double var1) {
         this.bitField3_ |= 536870912;
         this.mipCheckPrecision_ = var1;
         this.onChanged();
         return this;
      }

      public SatParameters.Builder clearMipCheckPrecision() {
         this.bitField3_ &= -536870913;
         this.mipCheckPrecision_ = 1.0E-4D;
         this.onChanged();
         return this;
      }

      public final SatParameters.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SatParameters.Builder)super.setUnknownFields(var1);
      }

      public final SatParameters.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SatParameters.Builder)super.mergeUnknownFields(var1);
      }

      // $FF: synthetic method
      Builder(Object var1) {
         this();
      }

      // $FF: synthetic method
      Builder(BuilderParent var1, Object var2) {
         this(var1);
      }
   }

   public static enum SearchBranching implements ProtocolMessageEnum {
      AUTOMATIC_SEARCH(0),
      FIXED_SEARCH(1),
      PORTFOLIO_SEARCH(2),
      LP_SEARCH(3),
      PSEUDO_COST_SEARCH(4),
      PORTFOLIO_WITH_QUICK_RESTART_SEARCH(5),
      HINT_SEARCH(6);

      public static final int AUTOMATIC_SEARCH_VALUE = 0;
      public static final int FIXED_SEARCH_VALUE = 1;
      public static final int PORTFOLIO_SEARCH_VALUE = 2;
      public static final int LP_SEARCH_VALUE = 3;
      public static final int PSEUDO_COST_SEARCH_VALUE = 4;
      public static final int PORTFOLIO_WITH_QUICK_RESTART_SEARCH_VALUE = 5;
      public static final int HINT_SEARCH_VALUE = 6;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public SatParameters.SearchBranching findValueByNumber(int var1) {
            return SatParameters.SearchBranching.forNumber(var1);
         }
      };
      private static final SatParameters.SearchBranching[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SatParameters.SearchBranching valueOf(int var0) {
         return forNumber(var0);
      }

      public static SatParameters.SearchBranching forNumber(int var0) {
         switch(var0) {
         case 0:
            return AUTOMATIC_SEARCH;
         case 1:
            return FIXED_SEARCH;
         case 2:
            return PORTFOLIO_SEARCH;
         case 3:
            return LP_SEARCH;
         case 4:
            return PSEUDO_COST_SEARCH;
         case 5:
            return PORTFOLIO_WITH_QUICK_RESTART_SEARCH;
         case 6:
            return HINT_SEARCH;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)SatParameters.getDescriptor().getEnumTypes().get(9);
      }

      public static SatParameters.SearchBranching valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private SearchBranching(int var3) {
         this.value = var3;
      }
   }

   public static enum MaxSatStratificationAlgorithm implements ProtocolMessageEnum {
      STRATIFICATION_NONE(0),
      STRATIFICATION_DESCENT(1),
      STRATIFICATION_ASCENT(2);

      public static final int STRATIFICATION_NONE_VALUE = 0;
      public static final int STRATIFICATION_DESCENT_VALUE = 1;
      public static final int STRATIFICATION_ASCENT_VALUE = 2;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public SatParameters.MaxSatStratificationAlgorithm findValueByNumber(int var1) {
            return SatParameters.MaxSatStratificationAlgorithm.forNumber(var1);
         }
      };
      private static final SatParameters.MaxSatStratificationAlgorithm[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SatParameters.MaxSatStratificationAlgorithm valueOf(int var0) {
         return forNumber(var0);
      }

      public static SatParameters.MaxSatStratificationAlgorithm forNumber(int var0) {
         switch(var0) {
         case 0:
            return STRATIFICATION_NONE;
         case 1:
            return STRATIFICATION_DESCENT;
         case 2:
            return STRATIFICATION_ASCENT;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)SatParameters.getDescriptor().getEnumTypes().get(8);
      }

      public static SatParameters.MaxSatStratificationAlgorithm valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private MaxSatStratificationAlgorithm(int var3) {
         this.value = var3;
      }
   }

   public static enum MaxSatAssumptionOrder implements ProtocolMessageEnum {
      DEFAULT_ASSUMPTION_ORDER(0),
      ORDER_ASSUMPTION_BY_DEPTH(1),
      ORDER_ASSUMPTION_BY_WEIGHT(2);

      public static final int DEFAULT_ASSUMPTION_ORDER_VALUE = 0;
      public static final int ORDER_ASSUMPTION_BY_DEPTH_VALUE = 1;
      public static final int ORDER_ASSUMPTION_BY_WEIGHT_VALUE = 2;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public SatParameters.MaxSatAssumptionOrder findValueByNumber(int var1) {
            return SatParameters.MaxSatAssumptionOrder.forNumber(var1);
         }
      };
      private static final SatParameters.MaxSatAssumptionOrder[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SatParameters.MaxSatAssumptionOrder valueOf(int var0) {
         return forNumber(var0);
      }

      public static SatParameters.MaxSatAssumptionOrder forNumber(int var0) {
         switch(var0) {
         case 0:
            return DEFAULT_ASSUMPTION_ORDER;
         case 1:
            return ORDER_ASSUMPTION_BY_DEPTH;
         case 2:
            return ORDER_ASSUMPTION_BY_WEIGHT;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)SatParameters.getDescriptor().getEnumTypes().get(7);
      }

      public static SatParameters.MaxSatAssumptionOrder valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private MaxSatAssumptionOrder(int var3) {
         this.value = var3;
      }
   }

   public static enum RestartAlgorithm implements ProtocolMessageEnum {
      NO_RESTART(0),
      LUBY_RESTART(1),
      DL_MOVING_AVERAGE_RESTART(2),
      LBD_MOVING_AVERAGE_RESTART(3),
      FIXED_RESTART(4);

      public static final int NO_RESTART_VALUE = 0;
      public static final int LUBY_RESTART_VALUE = 1;
      public static final int DL_MOVING_AVERAGE_RESTART_VALUE = 2;
      public static final int LBD_MOVING_AVERAGE_RESTART_VALUE = 3;
      public static final int FIXED_RESTART_VALUE = 4;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public SatParameters.RestartAlgorithm findValueByNumber(int var1) {
            return SatParameters.RestartAlgorithm.forNumber(var1);
         }
      };
      private static final SatParameters.RestartAlgorithm[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SatParameters.RestartAlgorithm valueOf(int var0) {
         return forNumber(var0);
      }

      public static SatParameters.RestartAlgorithm forNumber(int var0) {
         switch(var0) {
         case 0:
            return NO_RESTART;
         case 1:
            return LUBY_RESTART;
         case 2:
            return DL_MOVING_AVERAGE_RESTART;
         case 3:
            return LBD_MOVING_AVERAGE_RESTART;
         case 4:
            return FIXED_RESTART;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)SatParameters.getDescriptor().getEnumTypes().get(6);
      }

      public static SatParameters.RestartAlgorithm valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private RestartAlgorithm(int var3) {
         this.value = var3;
      }
   }

   public static enum ClauseOrdering implements ProtocolMessageEnum {
      CLAUSE_ACTIVITY(0),
      CLAUSE_LBD(1);

      public static final int CLAUSE_ACTIVITY_VALUE = 0;
      public static final int CLAUSE_LBD_VALUE = 1;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public SatParameters.ClauseOrdering findValueByNumber(int var1) {
            return SatParameters.ClauseOrdering.forNumber(var1);
         }
      };
      private static final SatParameters.ClauseOrdering[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SatParameters.ClauseOrdering valueOf(int var0) {
         return forNumber(var0);
      }

      public static SatParameters.ClauseOrdering forNumber(int var0) {
         switch(var0) {
         case 0:
            return CLAUSE_ACTIVITY;
         case 1:
            return CLAUSE_LBD;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)SatParameters.getDescriptor().getEnumTypes().get(5);
      }

      public static SatParameters.ClauseOrdering valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private ClauseOrdering(int var3) {
         this.value = var3;
      }
   }

   public static enum ClauseProtection implements ProtocolMessageEnum {
      PROTECTION_NONE(0),
      PROTECTION_ALWAYS(1),
      PROTECTION_LBD(2);

      public static final int PROTECTION_NONE_VALUE = 0;
      public static final int PROTECTION_ALWAYS_VALUE = 1;
      public static final int PROTECTION_LBD_VALUE = 2;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public SatParameters.ClauseProtection findValueByNumber(int var1) {
            return SatParameters.ClauseProtection.forNumber(var1);
         }
      };
      private static final SatParameters.ClauseProtection[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SatParameters.ClauseProtection valueOf(int var0) {
         return forNumber(var0);
      }

      public static SatParameters.ClauseProtection forNumber(int var0) {
         switch(var0) {
         case 0:
            return PROTECTION_NONE;
         case 1:
            return PROTECTION_ALWAYS;
         case 2:
            return PROTECTION_LBD;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)SatParameters.getDescriptor().getEnumTypes().get(4);
      }

      public static SatParameters.ClauseProtection valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private ClauseProtection(int var3) {
         this.value = var3;
      }
   }

   public static enum BinaryMinizationAlgorithm implements ProtocolMessageEnum {
      NO_BINARY_MINIMIZATION(0),
      BINARY_MINIMIZATION_FIRST(1),
      BINARY_MINIMIZATION_FIRST_WITH_TRANSITIVE_REDUCTION(4),
      BINARY_MINIMIZATION_WITH_REACHABILITY(2),
      EXPERIMENTAL_BINARY_MINIMIZATION(3);

      public static final int NO_BINARY_MINIMIZATION_VALUE = 0;
      public static final int BINARY_MINIMIZATION_FIRST_VALUE = 1;
      public static final int BINARY_MINIMIZATION_FIRST_WITH_TRANSITIVE_REDUCTION_VALUE = 4;
      public static final int BINARY_MINIMIZATION_WITH_REACHABILITY_VALUE = 2;
      public static final int EXPERIMENTAL_BINARY_MINIMIZATION_VALUE = 3;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public SatParameters.BinaryMinizationAlgorithm findValueByNumber(int var1) {
            return SatParameters.BinaryMinizationAlgorithm.forNumber(var1);
         }
      };
      private static final SatParameters.BinaryMinizationAlgorithm[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SatParameters.BinaryMinizationAlgorithm valueOf(int var0) {
         return forNumber(var0);
      }

      public static SatParameters.BinaryMinizationAlgorithm forNumber(int var0) {
         switch(var0) {
         case 0:
            return NO_BINARY_MINIMIZATION;
         case 1:
            return BINARY_MINIMIZATION_FIRST;
         case 2:
            return BINARY_MINIMIZATION_WITH_REACHABILITY;
         case 3:
            return EXPERIMENTAL_BINARY_MINIMIZATION;
         case 4:
            return BINARY_MINIMIZATION_FIRST_WITH_TRANSITIVE_REDUCTION;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)SatParameters.getDescriptor().getEnumTypes().get(3);
      }

      public static SatParameters.BinaryMinizationAlgorithm valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private BinaryMinizationAlgorithm(int var3) {
         this.value = var3;
      }
   }

   public static enum ConflictMinimizationAlgorithm implements ProtocolMessageEnum {
      NONE(0),
      SIMPLE(1),
      RECURSIVE(2),
      EXPERIMENTAL(3);

      public static final int NONE_VALUE = 0;
      public static final int SIMPLE_VALUE = 1;
      public static final int RECURSIVE_VALUE = 2;
      public static final int EXPERIMENTAL_VALUE = 3;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public SatParameters.ConflictMinimizationAlgorithm findValueByNumber(int var1) {
            return SatParameters.ConflictMinimizationAlgorithm.forNumber(var1);
         }
      };
      private static final SatParameters.ConflictMinimizationAlgorithm[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SatParameters.ConflictMinimizationAlgorithm valueOf(int var0) {
         return forNumber(var0);
      }

      public static SatParameters.ConflictMinimizationAlgorithm forNumber(int var0) {
         switch(var0) {
         case 0:
            return NONE;
         case 1:
            return SIMPLE;
         case 2:
            return RECURSIVE;
         case 3:
            return EXPERIMENTAL;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)SatParameters.getDescriptor().getEnumTypes().get(2);
      }

      public static SatParameters.ConflictMinimizationAlgorithm valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private ConflictMinimizationAlgorithm(int var3) {
         this.value = var3;
      }
   }

   public static enum Polarity implements ProtocolMessageEnum {
      POLARITY_TRUE(0),
      POLARITY_FALSE(1),
      POLARITY_RANDOM(2),
      POLARITY_WEIGHTED_SIGN(3),
      POLARITY_REVERSE_WEIGHTED_SIGN(4);

      public static final int POLARITY_TRUE_VALUE = 0;
      public static final int POLARITY_FALSE_VALUE = 1;
      public static final int POLARITY_RANDOM_VALUE = 2;
      public static final int POLARITY_WEIGHTED_SIGN_VALUE = 3;
      public static final int POLARITY_REVERSE_WEIGHTED_SIGN_VALUE = 4;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public SatParameters.Polarity findValueByNumber(int var1) {
            return SatParameters.Polarity.forNumber(var1);
         }
      };
      private static final SatParameters.Polarity[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SatParameters.Polarity valueOf(int var0) {
         return forNumber(var0);
      }

      public static SatParameters.Polarity forNumber(int var0) {
         switch(var0) {
         case 0:
            return POLARITY_TRUE;
         case 1:
            return POLARITY_FALSE;
         case 2:
            return POLARITY_RANDOM;
         case 3:
            return POLARITY_WEIGHTED_SIGN;
         case 4:
            return POLARITY_REVERSE_WEIGHTED_SIGN;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)SatParameters.getDescriptor().getEnumTypes().get(1);
      }

      public static SatParameters.Polarity valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private Polarity(int var3) {
         this.value = var3;
      }
   }

   public static enum VariableOrder implements ProtocolMessageEnum {
      IN_ORDER(0),
      IN_REVERSE_ORDER(1),
      IN_RANDOM_ORDER(2);

      public static final int IN_ORDER_VALUE = 0;
      public static final int IN_REVERSE_ORDER_VALUE = 1;
      public static final int IN_RANDOM_ORDER_VALUE = 2;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public SatParameters.VariableOrder findValueByNumber(int var1) {
            return SatParameters.VariableOrder.forNumber(var1);
         }
      };
      private static final SatParameters.VariableOrder[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SatParameters.VariableOrder valueOf(int var0) {
         return forNumber(var0);
      }

      public static SatParameters.VariableOrder forNumber(int var0) {
         switch(var0) {
         case 0:
            return IN_ORDER;
         case 1:
            return IN_REVERSE_ORDER;
         case 2:
            return IN_RANDOM_ORDER;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)SatParameters.getDescriptor().getEnumTypes().get(0);
      }

      public static SatParameters.VariableOrder valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[var0.getIndex()];
         }
      }

      private VariableOrder(int var3) {
         this.value = var3;
      }
   }
}
