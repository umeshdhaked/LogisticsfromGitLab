package com.google.ortools.sat;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface CpModelProtoOrBuilder extends MessageOrBuilder {
   String getName();

   ByteString getNameBytes();

   List getVariablesList();

   IntegerVariableProto getVariables(int var1);

   int getVariablesCount();

   List getVariablesOrBuilderList();

   IntegerVariableProtoOrBuilder getVariablesOrBuilder(int var1);

   List getConstraintsList();

   ConstraintProto getConstraints(int var1);

   int getConstraintsCount();

   List getConstraintsOrBuilderList();

   ConstraintProtoOrBuilder getConstraintsOrBuilder(int var1);

   boolean hasObjective();

   CpObjectiveProto getObjective();

   CpObjectiveProtoOrBuilder getObjectiveOrBuilder();

   List getSearchStrategyList();

   DecisionStrategyProto getSearchStrategy(int var1);

   int getSearchStrategyCount();

   List getSearchStrategyOrBuilderList();

   DecisionStrategyProtoOrBuilder getSearchStrategyOrBuilder(int var1);

   boolean hasSolutionHint();

   PartialVariableAssignment getSolutionHint();

   PartialVariableAssignmentOrBuilder getSolutionHintOrBuilder();
}
