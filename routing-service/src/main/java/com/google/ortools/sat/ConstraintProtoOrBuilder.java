package com.google.ortools.sat;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ConstraintProtoOrBuilder extends MessageOrBuilder {
   String getName();

   ByteString getNameBytes();

   List getEnforcementLiteralList();

   int getEnforcementLiteralCount();

   int getEnforcementLiteral(int var1);

   boolean hasBoolOr();

   BoolArgumentProto getBoolOr();

   BoolArgumentProtoOrBuilder getBoolOrOrBuilder();

   boolean hasBoolAnd();

   BoolArgumentProto getBoolAnd();

   BoolArgumentProtoOrBuilder getBoolAndOrBuilder();

   boolean hasAtMostOne();

   BoolArgumentProto getAtMostOne();

   BoolArgumentProtoOrBuilder getAtMostOneOrBuilder();

   boolean hasBoolXor();

   BoolArgumentProto getBoolXor();

   BoolArgumentProtoOrBuilder getBoolXorOrBuilder();

   boolean hasIntDiv();

   IntegerArgumentProto getIntDiv();

   IntegerArgumentProtoOrBuilder getIntDivOrBuilder();

   boolean hasIntMod();

   IntegerArgumentProto getIntMod();

   IntegerArgumentProtoOrBuilder getIntModOrBuilder();

   boolean hasIntMax();

   IntegerArgumentProto getIntMax();

   IntegerArgumentProtoOrBuilder getIntMaxOrBuilder();

   boolean hasIntMin();

   IntegerArgumentProto getIntMin();

   IntegerArgumentProtoOrBuilder getIntMinOrBuilder();

   boolean hasIntProd();

   IntegerArgumentProto getIntProd();

   IntegerArgumentProtoOrBuilder getIntProdOrBuilder();

   boolean hasLinear();

   LinearConstraintProto getLinear();

   LinearConstraintProtoOrBuilder getLinearOrBuilder();

   boolean hasAllDiff();

   AllDifferentConstraintProto getAllDiff();

   AllDifferentConstraintProtoOrBuilder getAllDiffOrBuilder();

   boolean hasElement();

   ElementConstraintProto getElement();

   ElementConstraintProtoOrBuilder getElementOrBuilder();

   boolean hasCircuit();

   CircuitConstraintProto getCircuit();

   CircuitConstraintProtoOrBuilder getCircuitOrBuilder();

   boolean hasRoutes();

   RoutesConstraintProto getRoutes();

   RoutesConstraintProtoOrBuilder getRoutesOrBuilder();

   boolean hasCircuitCovering();

   CircuitCoveringConstraintProto getCircuitCovering();

   CircuitCoveringConstraintProtoOrBuilder getCircuitCoveringOrBuilder();

   boolean hasTable();

   TableConstraintProto getTable();

   TableConstraintProtoOrBuilder getTableOrBuilder();

   boolean hasAutomaton();

   AutomatonConstraintProto getAutomaton();

   AutomatonConstraintProtoOrBuilder getAutomatonOrBuilder();

   boolean hasInverse();

   InverseConstraintProto getInverse();

   InverseConstraintProtoOrBuilder getInverseOrBuilder();

   boolean hasReservoir();

   ReservoirConstraintProto getReservoir();

   ReservoirConstraintProtoOrBuilder getReservoirOrBuilder();

   boolean hasInterval();

   IntervalConstraintProto getInterval();

   IntervalConstraintProtoOrBuilder getIntervalOrBuilder();

   boolean hasNoOverlap();

   NoOverlapConstraintProto getNoOverlap();

   NoOverlapConstraintProtoOrBuilder getNoOverlapOrBuilder();

   boolean hasNoOverlap2D();

   NoOverlap2DConstraintProto getNoOverlap2D();

   NoOverlap2DConstraintProtoOrBuilder getNoOverlap2DOrBuilder();

   boolean hasCumulative();

   CumulativeConstraintProto getCumulative();

   CumulativeConstraintProtoOrBuilder getCumulativeOrBuilder();

   ConstraintProto.ConstraintCase getConstraintCase();
}
