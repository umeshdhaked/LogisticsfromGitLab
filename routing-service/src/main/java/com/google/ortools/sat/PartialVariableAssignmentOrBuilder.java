package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface PartialVariableAssignmentOrBuilder extends MessageOrBuilder {
   List getVarsList();

   int getVarsCount();

   int getVars(int var1);

   List getValuesList();

   int getValuesCount();

   long getValues(int var1);
}
