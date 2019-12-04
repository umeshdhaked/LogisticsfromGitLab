package com.google.ortools.linearsolver;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface MPArrayWithConstantConstraintOrBuilder extends MessageOrBuilder {
   List getVarIndexList();

   int getVarIndexCount();

   int getVarIndex(int var1);

   boolean hasConstant();

   double getConstant();

   boolean hasResultantVarIndex();

   int getResultantVarIndex();
}
