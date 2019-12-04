package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ElementConstraintProtoOrBuilder extends MessageOrBuilder {
   int getIndex();

   int getTarget();

   List getVarsList();

   int getVarsCount();

   int getVars(int var1);
}
