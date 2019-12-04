package com.google.ortools.constraintsolver;

import com.google.protobuf.MessageOrBuilder;

public interface RegularLimitParametersOrBuilder extends MessageOrBuilder {
   long getTime();

   long getBranches();

   long getFailures();

   long getSolutions();

   boolean getSmartTimeCheck();

   boolean getCumulative();
}
