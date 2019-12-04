package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ReservoirConstraintProtoOrBuilder extends MessageOrBuilder {
   long getMinLevel();

   long getMaxLevel();

   List getTimesList();

   int getTimesCount();

   int getTimes(int var1);

   List getDemandsList();

   int getDemandsCount();

   long getDemands(int var1);

   List getActivesList();

   int getActivesCount();

   int getActives(int var1);
}
