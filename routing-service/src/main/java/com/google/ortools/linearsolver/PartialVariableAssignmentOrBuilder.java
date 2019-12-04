package com.google.ortools.linearsolver;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface PartialVariableAssignmentOrBuilder extends MessageOrBuilder {
   List getVarIndexList();

   int getVarIndexCount();

   int getVarIndex(int var1);

   List getVarValueList();

   int getVarValueCount();

   double getVarValue(int var1);
}
