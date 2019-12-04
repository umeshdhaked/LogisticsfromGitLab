package com.google.ortools.constraintsolver;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ConstraintSolverParametersOrBuilder extends MessageOrBuilder {
   int getCompressTrailValue();

   ConstraintSolverParameters.TrailCompression getCompressTrail();

   int getTrailBlockSize();

   int getArraySplitSize();

   boolean getStoreNames();

   boolean getNameCastVariables();

   boolean getNameAllVariables();

   boolean getProfilePropagation();

   String getProfileFile();

   ByteString getProfileFileBytes();

   boolean getProfileLocalSearch();

   boolean getPrintLocalSearchProfile();

   boolean getTracePropagation();

   boolean getTraceSearch();

   boolean getPrintModel();

   boolean getPrintModelStats();

   boolean getPrintAddedConstraints();

   boolean getDisableSolve();

   boolean getUseSmallTable();

   boolean getUseCumulativeEdgeFinder();

   boolean getUseCumulativeTimeTable();

   boolean getUseCumulativeTimeTableSync();

   boolean getUseSequenceHighDemandTasks();

   boolean getUseAllPossibleDisjunctions();

   int getMaxEdgeFinderSize();

   boolean getDiffnUseCumulative();

   boolean getUseElementRmq();

   boolean getSkipLocallyOptimalPaths();

   int getCheckSolutionPeriod();
}
