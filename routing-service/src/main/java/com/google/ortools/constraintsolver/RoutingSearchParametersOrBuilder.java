package com.google.ortools.constraintsolver;

import com.google.ortools.util.OptionalBoolean;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;

public interface RoutingSearchParametersOrBuilder extends MessageOrBuilder {
   int getFirstSolutionStrategyValue();

   FirstSolutionStrategy.Value getFirstSolutionStrategy();

   boolean getUseUnfilteredFirstSolutionStrategy();

   double getSavingsNeighborsRatio();

   double getSavingsMaxMemoryUsageBytes();

   boolean getSavingsAddReverseArcs();

   double getSavingsArcCoefficient();

   boolean getSavingsParallelRoutes();

   double getCheapestInsertionFarthestSeedsRatio();

   double getCheapestInsertionNeighborsRatio();

   boolean hasLocalSearchOperators();

   RoutingSearchParameters.LocalSearchNeighborhoodOperators getLocalSearchOperators();

   RoutingSearchParameters.LocalSearchNeighborhoodOperatorsOrBuilder getLocalSearchOperatorsOrBuilder();

   int getRelocateExpensiveChainNumArcsToConsider();

   int getLocalSearchMetaheuristicValue();

   LocalSearchMetaheuristic.Value getLocalSearchMetaheuristic();

   double getGuidedLocalSearchLambdaCoefficient();

   boolean getUseDepthFirstSearch();

   int getUseCpValue();

   OptionalBoolean getUseCp();

   int getUseCpSatValue();

   OptionalBoolean getUseCpSat();

   double getOptimizationStep();

   int getNumberOfSolutionsToCollect();

   long getSolutionLimit();

   boolean hasTimeLimit();

   Duration getTimeLimit();

   DurationOrBuilder getTimeLimitOrBuilder();

   boolean hasLnsTimeLimit();

   Duration getLnsTimeLimit();

   DurationOrBuilder getLnsTimeLimitOrBuilder();

   boolean getUseFullPropagation();

   boolean getLogSearch();

   double getLogCostScalingFactor();

   double getLogCostOffset();
}
