package com.google.ortools.linearsolver;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface MPQuadraticConstraintOrBuilder extends MessageOrBuilder {
   List getVarIndexList();

   int getVarIndexCount();

   int getVarIndex(int var1);

   List getCoefficientList();

   int getCoefficientCount();

   double getCoefficient(int var1);

   List getQvar1IndexList();

   int getQvar1IndexCount();

   int getQvar1Index(int var1);

   List getQvar2IndexList();

   int getQvar2IndexCount();

   int getQvar2Index(int var1);

   List getQcoefficientList();

   int getQcoefficientCount();

   double getQcoefficient(int var1);

   boolean hasLowerBound();

   double getLowerBound();

   boolean hasUpperBound();

   double getUpperBound();
}
