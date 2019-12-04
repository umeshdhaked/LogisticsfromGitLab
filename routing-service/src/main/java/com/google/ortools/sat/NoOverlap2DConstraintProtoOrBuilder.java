package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface NoOverlap2DConstraintProtoOrBuilder extends MessageOrBuilder {
   List getXIntervalsList();

   int getXIntervalsCount();

   int getXIntervals(int var1);

   List getYIntervalsList();

   int getYIntervalsCount();

   int getYIntervals(int var1);

   boolean getBoxesWithNullAreaCanOverlap();
}
