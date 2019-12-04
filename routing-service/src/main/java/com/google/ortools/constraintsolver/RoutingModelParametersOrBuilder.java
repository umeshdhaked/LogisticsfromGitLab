package com.google.ortools.constraintsolver;

import com.google.protobuf.MessageOrBuilder;

public interface RoutingModelParametersOrBuilder extends MessageOrBuilder {
   boolean hasSolverParameters();

   ConstraintSolverParameters getSolverParameters();

   ConstraintSolverParametersOrBuilder getSolverParametersOrBuilder();

   boolean getReduceVehicleCostModel();

   int getMaxCallbackCacheSize();
}
