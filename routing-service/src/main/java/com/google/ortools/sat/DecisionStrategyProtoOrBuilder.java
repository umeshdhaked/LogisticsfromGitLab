package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface DecisionStrategyProtoOrBuilder extends MessageOrBuilder {
   List getVariablesList();

   int getVariablesCount();

   int getVariables(int var1);

   int getVariableSelectionStrategyValue();

   DecisionStrategyProto.VariableSelectionStrategy getVariableSelectionStrategy();

   int getDomainReductionStrategyValue();

   DecisionStrategyProto.DomainReductionStrategy getDomainReductionStrategy();

   List getTransformationsList();

   DecisionStrategyProto.AffineTransformation getTransformations(int var1);

   int getTransformationsCount();

   List getTransformationsOrBuilderList();

   DecisionStrategyProto.AffineTransformationOrBuilder getTransformationsOrBuilder(int var1);
}
