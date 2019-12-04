package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface CpObjectiveProtoOrBuilder extends MessageOrBuilder {
   List getVarsList();

   int getVarsCount();

   int getVars(int var1);

   List getCoeffsList();

   int getCoeffsCount();

   long getCoeffs(int var1);

   double getOffset();

   double getScalingFactor();

   List getDomainList();

   int getDomainCount();

   long getDomain(int var1);
}
