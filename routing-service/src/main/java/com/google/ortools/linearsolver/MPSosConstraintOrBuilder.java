package com.google.ortools.linearsolver;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface MPSosConstraintOrBuilder extends MessageOrBuilder {
   boolean hasType();

   MPSosConstraint.Type getType();

   List getVarIndexList();

   int getVarIndexCount();

   int getVarIndex(int var1);

   List getWeightList();

   int getWeightCount();

   double getWeight(int var1);
}
