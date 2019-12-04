package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface AutomatonConstraintProtoOrBuilder extends MessageOrBuilder {
   long getStartingState();

   List getFinalStatesList();

   int getFinalStatesCount();

   long getFinalStates(int var1);

   List getTransitionTailList();

   int getTransitionTailCount();

   long getTransitionTail(int var1);

   List getTransitionHeadList();

   int getTransitionHeadCount();

   long getTransitionHead(int var1);

   List getTransitionLabelList();

   int getTransitionLabelCount();

   long getTransitionLabel(int var1);

   List getVarsList();

   int getVarsCount();

   int getVars(int var1);
}
