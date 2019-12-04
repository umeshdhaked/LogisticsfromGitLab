package com.google.ortools.sat;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface SatParametersOrBuilder extends MessageOrBuilder {
   boolean hasPreferredVariableOrder();

   SatParameters.VariableOrder getPreferredVariableOrder();

   boolean hasInitialPolarity();

   SatParameters.Polarity getInitialPolarity();

   boolean hasUsePhaseSaving();

   boolean getUsePhaseSaving();

   boolean hasRandomPolarityRatio();

   double getRandomPolarityRatio();

   boolean hasRandomBranchesRatio();

   double getRandomBranchesRatio();

   boolean hasUseErwaHeuristic();

   boolean getUseErwaHeuristic();

   boolean hasInitialVariablesActivity();

   double getInitialVariablesActivity();

   boolean hasAlsoBumpVariablesInConflictReasons();

   boolean getAlsoBumpVariablesInConflictReasons();

   boolean hasMinimizationAlgorithm();

   SatParameters.ConflictMinimizationAlgorithm getMinimizationAlgorithm();

   boolean hasBinaryMinimizationAlgorithm();

   SatParameters.BinaryMinizationAlgorithm getBinaryMinimizationAlgorithm();

   boolean hasSubsumptionDuringConflictAnalysis();

   boolean getSubsumptionDuringConflictAnalysis();

   boolean hasClauseCleanupPeriod();

   int getClauseCleanupPeriod();

   boolean hasClauseCleanupTarget();

   int getClauseCleanupTarget();

   boolean hasClauseCleanupProtection();

   SatParameters.ClauseProtection getClauseCleanupProtection();

   boolean hasClauseCleanupLbdBound();

   int getClauseCleanupLbdBound();

   boolean hasClauseCleanupOrdering();

   SatParameters.ClauseOrdering getClauseCleanupOrdering();

   boolean hasPbCleanupIncrement();

   int getPbCleanupIncrement();

   boolean hasPbCleanupRatio();

   double getPbCleanupRatio();

   boolean hasMinimizeWithPropagationRestartPeriod();

   int getMinimizeWithPropagationRestartPeriod();

   boolean hasMinimizeWithPropagationNumDecisions();

   int getMinimizeWithPropagationNumDecisions();

   boolean hasVariableActivityDecay();

   double getVariableActivityDecay();

   boolean hasMaxVariableActivityValue();

   double getMaxVariableActivityValue();

   boolean hasGlucoseMaxDecay();

   double getGlucoseMaxDecay();

   boolean hasGlucoseDecayIncrement();

   double getGlucoseDecayIncrement();

   boolean hasGlucoseDecayIncrementPeriod();

   int getGlucoseDecayIncrementPeriod();

   boolean hasClauseActivityDecay();

   double getClauseActivityDecay();

   boolean hasMaxClauseActivityValue();

   double getMaxClauseActivityValue();

   List getRestartAlgorithmsList();

   int getRestartAlgorithmsCount();

   SatParameters.RestartAlgorithm getRestartAlgorithms(int var1);

   boolean hasDefaultRestartAlgorithms();

   String getDefaultRestartAlgorithms();

   ByteString getDefaultRestartAlgorithmsBytes();

   boolean hasRestartPeriod();

   int getRestartPeriod();

   boolean hasRestartRunningWindowSize();

   int getRestartRunningWindowSize();

   boolean hasRestartDlAverageRatio();

   double getRestartDlAverageRatio();

   boolean hasRestartLbdAverageRatio();

   double getRestartLbdAverageRatio();

   boolean hasUseBlockingRestart();

   boolean getUseBlockingRestart();

   boolean hasBlockingRestartWindowSize();

   int getBlockingRestartWindowSize();

   boolean hasBlockingRestartMultiplier();

   double getBlockingRestartMultiplier();

   boolean hasNumConflictsBeforeStrategyChanges();

   int getNumConflictsBeforeStrategyChanges();

   boolean hasStrategyChangeIncreaseRatio();

   double getStrategyChangeIncreaseRatio();

   boolean hasMaxTimeInSeconds();

   double getMaxTimeInSeconds();

   boolean hasMaxDeterministicTime();

   double getMaxDeterministicTime();

   boolean hasMaxNumberOfConflicts();

   long getMaxNumberOfConflicts();

   boolean hasMaxMemoryInMb();

   long getMaxMemoryInMb();

   boolean hasTreatBinaryClausesSeparately();

   boolean getTreatBinaryClausesSeparately();

   boolean hasRandomSeed();

   int getRandomSeed();

   boolean hasLogSearchProgress();

   boolean getLogSearchProgress();

   boolean hasUsePbResolution();

   boolean getUsePbResolution();

   boolean hasMinimizeReductionDuringPbResolution();

   boolean getMinimizeReductionDuringPbResolution();

   boolean hasCountAssumptionLevelsInLbd();

   boolean getCountAssumptionLevelsInLbd();

   boolean hasPresolveBveThreshold();

   int getPresolveBveThreshold();

   boolean hasPresolveBveClauseWeight();

   int getPresolveBveClauseWeight();

   boolean hasPresolveProbingDeterministicTimeLimit();

   double getPresolveProbingDeterministicTimeLimit();

   boolean hasPresolveBlockedClause();

   boolean getPresolveBlockedClause();

   boolean hasPresolveUseBva();

   boolean getPresolveUseBva();

   boolean hasPresolveBvaThreshold();

   int getPresolveBvaThreshold();

   boolean hasMaxPresolveIterations();

   int getMaxPresolveIterations();

   boolean hasCpModelPresolve();

   boolean getCpModelPresolve();

   boolean hasCpModelProbingLevel();

   int getCpModelProbingLevel();

   boolean hasCpModelUseSatPresolve();

   boolean getCpModelUseSatPresolve();

   boolean hasExpandElementConstraints();

   boolean getExpandElementConstraints();

   boolean hasExpandAutomatonConstraints();

   boolean getExpandAutomatonConstraints();

   boolean hasMergeNoOverlapWorkLimit();

   double getMergeNoOverlapWorkLimit();

   boolean hasMergeAtMostOneWorkLimit();

   double getMergeAtMostOneWorkLimit();

   boolean hasPresolveSubstitutionLevel();

   int getPresolveSubstitutionLevel();

   boolean hasUseOptimizationHints();

   boolean getUseOptimizationHints();

   boolean hasMinimizeCore();

   boolean getMinimizeCore();

   boolean hasFindMultipleCores();

   boolean getFindMultipleCores();

   boolean hasCoverOptimization();

   boolean getCoverOptimization();

   boolean hasMaxSatAssumptionOrder();

   SatParameters.MaxSatAssumptionOrder getMaxSatAssumptionOrder();

   boolean hasMaxSatReverseAssumptionOrder();

   boolean getMaxSatReverseAssumptionOrder();

   boolean hasMaxSatStratification();

   SatParameters.MaxSatStratificationAlgorithm getMaxSatStratification();

   boolean hasUsePrecedencesInDisjunctiveConstraint();

   boolean getUsePrecedencesInDisjunctiveConstraint();

   boolean hasUseOverloadCheckerInCumulativeConstraint();

   boolean getUseOverloadCheckerInCumulativeConstraint();

   boolean hasUseTimetableEdgeFindingInCumulativeConstraint();

   boolean getUseTimetableEdgeFindingInCumulativeConstraint();

   boolean hasUseDisjunctiveConstraintInCumulativeConstraint();

   boolean getUseDisjunctiveConstraintInCumulativeConstraint();

   boolean hasLinearizationLevel();

   int getLinearizationLevel();

   boolean hasBooleanEncodingLevel();

   int getBooleanEncodingLevel();

   boolean hasMaxNumCuts();

   int getMaxNumCuts();

   boolean hasOnlyAddCutsAtLevelZero();

   boolean getOnlyAddCutsAtLevelZero();

   boolean hasAddKnapsackCuts();

   boolean getAddKnapsackCuts();

   boolean hasAddCgCuts();

   boolean getAddCgCuts();

   boolean hasAddMirCuts();

   boolean getAddMirCuts();

   boolean hasMaxAllDiffCutSize();

   int getMaxAllDiffCutSize();

   boolean hasUseMirRounding();

   boolean getUseMirRounding();

   boolean hasMaxIntegerRoundingScaling();

   int getMaxIntegerRoundingScaling();

   boolean hasAddLpConstraintsLazily();

   boolean getAddLpConstraintsLazily();

   boolean hasMinOrthogonalityForLpConstraints();

   double getMinOrthogonalityForLpConstraints();

   boolean hasMaxInactiveCount();

   long getMaxInactiveCount();

   boolean hasConstraintRemovalBatchSize();

   long getConstraintRemovalBatchSize();

   boolean hasSearchBranching();

   SatParameters.SearchBranching getSearchBranching();

   boolean hasExploitIntegerLpSolution();

   boolean getExploitIntegerLpSolution();

   boolean hasExploitAllLpSolution();

   boolean getExploitAllLpSolution();

   boolean hasExploitBestSolution();

   boolean getExploitBestSolution();

   boolean hasExploitObjective();

   boolean getExploitObjective();

   boolean hasProbingPeriodAtRoot();

   long getProbingPeriodAtRoot();

   boolean hasPseudoCostReliabilityThreshold();

   long getPseudoCostReliabilityThreshold();

   boolean hasOptimizeWithCore();

   boolean getOptimizeWithCore();

   boolean hasBinarySearchNumConflicts();

   int getBinarySearchNumConflicts();

   boolean hasOptimizeWithMaxHs();

   boolean getOptimizeWithMaxHs();

   boolean hasEnumerateAllSolutions();

   boolean getEnumerateAllSolutions();

   boolean hasFillTightenedDomainsInResponse();

   boolean getFillTightenedDomainsInResponse();

   boolean hasInstantiateAllVariables();

   boolean getInstantiateAllVariables();

   boolean hasAutoDetectGreaterThanAtLeastOneOf();

   boolean getAutoDetectGreaterThanAtLeastOneOf();

   boolean hasStopAfterFirstSolution();

   boolean getStopAfterFirstSolution();

   boolean hasNumSearchWorkers();

   int getNumSearchWorkers();

   boolean hasInterleaveSearch();

   boolean getInterleaveSearch();

   boolean hasReduceMemoryUsageInInterleaveMode();

   boolean getReduceMemoryUsageInInterleaveMode();

   boolean hasDeterministicParallelSearch();

   boolean getDeterministicParallelSearch();

   boolean hasShareObjectiveBounds();

   boolean getShareObjectiveBounds();

   boolean hasShareLevelZeroBounds();

   boolean getShareLevelZeroBounds();

   boolean hasUseLnsOnly();

   boolean getUseLnsOnly();

   boolean hasLnsFocusOnDecisionVariables();

   boolean getLnsFocusOnDecisionVariables();

   boolean hasUseRinsLns();

   boolean getUseRinsLns();

   boolean hasDiversifyLnsParams();

   boolean getDiversifyLnsParams();

   boolean hasRandomizeSearch();

   boolean getRandomizeSearch();

   boolean hasSearchRandomizationTolerance();

   long getSearchRandomizationTolerance();

   boolean hasUseOptionalVariables();

   boolean getUseOptionalVariables();

   boolean hasUseExactLpReason();

   boolean getUseExactLpReason();

   boolean hasUseBranchingInLp();

   boolean getUseBranchingInLp();

   boolean hasUseCombinedNoOverlap();

   boolean getUseCombinedNoOverlap();

   boolean hasCatchSigintSignal();

   boolean getCatchSigintSignal();

   boolean hasUseImpliedBounds();

   boolean getUseImpliedBounds();

   boolean hasMipMaxBound();

   double getMipMaxBound();

   boolean hasMipVarScaling();

   double getMipVarScaling();

   boolean hasMipWantedPrecision();

   double getMipWantedPrecision();

   boolean hasMipMaxActivityExponent();

   int getMipMaxActivityExponent();

   boolean hasMipCheckPrecision();

   double getMipCheckPrecision();
}
