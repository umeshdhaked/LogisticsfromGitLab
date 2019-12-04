package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface CumulativeConstraintProtoOrBuilder extends MessageOrBuilder {
   int getCapacity();

   List getIntervalsList();

   int getIntervalsCount();

   int getIntervals(int var1);

   List getDemandsList();

   int getDemandsCount();

   int getDemands(int var1);
}
