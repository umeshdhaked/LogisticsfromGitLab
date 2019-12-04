package com.google.ortools.sat;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface CpSolverResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   CpSolverStatus getStatus();

   List getSolutionList();

   int getSolutionCount();

   long getSolution(int var1);

   double getObjectiveValue();

   double getBestObjectiveBound();

   List getSolutionLowerBoundsList();

   int getSolutionLowerBoundsCount();

   long getSolutionLowerBounds(int var1);

   List getSolutionUpperBoundsList();

   int getSolutionUpperBoundsCount();

   long getSolutionUpperBounds(int var1);

   List getTightenedVariablesList();

   IntegerVariableProto getTightenedVariables(int var1);

   int getTightenedVariablesCount();

   List getTightenedVariablesOrBuilderList();

   IntegerVariableProtoOrBuilder getTightenedVariablesOrBuilder(int var1);

   boolean getAllSolutionsWereFound();

   long getNumBooleans();

   long getNumConflicts();

   long getNumBranches();

   long getNumBinaryPropagations();

   long getNumIntegerPropagations();

   double getWallTime();

   double getUserTime();

   double getDeterministicTime();

   double getPrimalIntegral();

   String getSolutionInfo();

   ByteString getSolutionInfoBytes();
}
