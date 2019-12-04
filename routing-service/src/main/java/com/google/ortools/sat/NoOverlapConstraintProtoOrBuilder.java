package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface NoOverlapConstraintProtoOrBuilder extends MessageOrBuilder {
   List getIntervalsList();

   int getIntervalsCount();

   int getIntervals(int var1);
}
