package com.google.ortools.linearsolver;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface MPSolutionResponseOrBuilder extends MessageOrBuilder {
   boolean hasStatus();

   MPSolverResponseStatus getStatus();

   boolean hasStatusStr();

   String getStatusStr();

   ByteString getStatusStrBytes();

   boolean hasObjectiveValue();

   double getObjectiveValue();

   boolean hasBestObjectiveBound();

   double getBestObjectiveBound();

   List getVariableValueList();

   int getVariableValueCount();

   double getVariableValue(int var1);

   List getDualValueList();

   int getDualValueCount();

   double getDualValue(int var1);

   List getReducedCostList();

   int getReducedCostCount();

   double getReducedCost(int var1);
}
