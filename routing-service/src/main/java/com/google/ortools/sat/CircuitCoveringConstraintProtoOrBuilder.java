package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface CircuitCoveringConstraintProtoOrBuilder extends MessageOrBuilder {
   List getNextsList();

   int getNextsCount();

   int getNexts(int var1);

   List getDistinguishedNodesList();

   int getDistinguishedNodesCount();

   long getDistinguishedNodes(int var1);
}
