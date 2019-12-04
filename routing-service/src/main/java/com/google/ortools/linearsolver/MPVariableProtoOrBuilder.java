package com.google.ortools.linearsolver;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface MPVariableProtoOrBuilder extends MessageOrBuilder {
   boolean hasLowerBound();

   double getLowerBound();

   boolean hasUpperBound();

   double getUpperBound();

   boolean hasObjectiveCoefficient();

   double getObjectiveCoefficient();

   boolean hasIsInteger();

   boolean getIsInteger();

   boolean hasName();

   String getName();

   ByteString getNameBytes();

   boolean hasBranchingPriority();

   int getBranchingPriority();
}
