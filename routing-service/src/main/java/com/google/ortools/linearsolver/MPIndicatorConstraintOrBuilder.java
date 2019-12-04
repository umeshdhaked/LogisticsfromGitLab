package com.google.ortools.linearsolver;

import com.google.protobuf.MessageOrBuilder;

public interface MPIndicatorConstraintOrBuilder extends MessageOrBuilder {
   boolean hasVarIndex();

   int getVarIndex();

   boolean hasVarValue();

   int getVarValue();

   boolean hasConstraint();

   MPConstraintProto getConstraint();

   MPConstraintProtoOrBuilder getConstraintOrBuilder();
}
