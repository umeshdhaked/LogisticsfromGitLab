package com.google.ortools.linearsolver;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface MPModelRequestOrBuilder extends MessageOrBuilder {
   boolean hasModel();

   MPModelProto getModel();

   MPModelProtoOrBuilder getModelOrBuilder();

   boolean hasSolverType();

   MPModelRequest.SolverType getSolverType();

   boolean hasSolverTimeLimitSeconds();

   double getSolverTimeLimitSeconds();

   boolean hasEnableInternalSolverOutput();

   boolean getEnableInternalSolverOutput();

   boolean hasSolverSpecificParameters();

   String getSolverSpecificParameters();

   ByteString getSolverSpecificParametersBytes();

   boolean hasModelDelta();

   MPModelDeltaProto getModelDelta();

   MPModelDeltaProtoOrBuilder getModelDeltaOrBuilder();
}
