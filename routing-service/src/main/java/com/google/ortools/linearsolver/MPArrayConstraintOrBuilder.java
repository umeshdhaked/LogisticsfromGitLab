package com.google.ortools.linearsolver;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface MPArrayConstraintOrBuilder extends MessageOrBuilder {
   List getVarIndexList();

   int getVarIndexCount();

   int getVarIndex(int var1);

   boolean hasResultantVarIndex();

   int getResultantVarIndex();
}
