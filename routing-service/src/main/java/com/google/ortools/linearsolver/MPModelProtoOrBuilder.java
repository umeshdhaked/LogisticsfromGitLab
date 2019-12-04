package com.google.ortools.linearsolver;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface MPModelProtoOrBuilder extends MessageOrBuilder {
   List getVariableList();

   MPVariableProto getVariable(int var1);

   int getVariableCount();

   List getVariableOrBuilderList();

   MPVariableProtoOrBuilder getVariableOrBuilder(int var1);

   List getConstraintList();

   MPConstraintProto getConstraint(int var1);

   int getConstraintCount();

   List getConstraintOrBuilderList();

   MPConstraintProtoOrBuilder getConstraintOrBuilder(int var1);

   List getGeneralConstraintList();

   MPGeneralConstraintProto getGeneralConstraint(int var1);

   int getGeneralConstraintCount();

   List getGeneralConstraintOrBuilderList();

   MPGeneralConstraintProtoOrBuilder getGeneralConstraintOrBuilder(int var1);

   boolean hasMaximize();

   boolean getMaximize();

   boolean hasObjectiveOffset();

   double getObjectiveOffset();

   boolean hasQuadraticObjective();

   MPQuadraticObjective getQuadraticObjective();

   MPQuadraticObjectiveOrBuilder getQuadraticObjectiveOrBuilder();

   boolean hasName();

   String getName();

   ByteString getNameBytes();

   boolean hasSolutionHint();

   PartialVariableAssignment getSolutionHint();

   PartialVariableAssignmentOrBuilder getSolutionHintOrBuilder();
}
