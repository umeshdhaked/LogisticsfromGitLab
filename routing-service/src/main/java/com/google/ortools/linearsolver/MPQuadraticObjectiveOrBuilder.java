package com.google.ortools.linearsolver;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface MPQuadraticObjectiveOrBuilder extends MessageOrBuilder {
   List getQvar1IndexList();

   int getQvar1IndexCount();

   int getQvar1Index(int var1);

   List getQvar2IndexList();

   int getQvar2IndexCount();

   int getQvar2Index(int var1);

   List getCoefficientList();

   int getCoefficientCount();

   double getCoefficient(int var1);
}
