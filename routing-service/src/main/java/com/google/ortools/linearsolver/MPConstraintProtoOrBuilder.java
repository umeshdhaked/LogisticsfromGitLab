package com.google.ortools.linearsolver;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface MPConstraintProtoOrBuilder extends MessageOrBuilder {
   List getVarIndexList();

   int getVarIndexCount();

   int getVarIndex(int var1);

   List getCoefficientList();

   int getCoefficientCount();

   double getCoefficient(int var1);

   boolean hasLowerBound();

   double getLowerBound();

   boolean hasUpperBound();

   double getUpperBound();

   boolean hasName();

   String getName();

   ByteString getNameBytes();

   boolean hasIsLazy();

   boolean getIsLazy();
}
