package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;

public interface IntervalConstraintProtoOrBuilder extends MessageOrBuilder {
   int getStart();

   int getEnd();

   int getSize();
}
