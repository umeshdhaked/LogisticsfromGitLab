package com.google.ortools.linearsolver;

import com.google.protobuf.MessageOrBuilder;

public interface MPAbsConstraintOrBuilder extends MessageOrBuilder {
   boolean hasVarIndex();

   int getVarIndex();

   boolean hasResultantVarIndex();

   int getResultantVarIndex();
}
