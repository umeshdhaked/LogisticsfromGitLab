package com.google.ortools.graph;

public class mainJNI {
   public static final native long new_MaxFlow();

   public static final native int MaxFlow_addArcWithCapacity(long var0, MaxFlow var2, int var3, int var4, long var5);

   public static final native int MaxFlow_getNumNodes(long var0, MaxFlow var2);

   public static final native int MaxFlow_getNumArcs(long var0, MaxFlow var2);

   public static final native int MaxFlow_getTail(long var0, MaxFlow var2, int var3);

   public static final native int MaxFlow_getHead(long var0, MaxFlow var2, int var3);

   public static final native long MaxFlow_getCapacity(long var0, MaxFlow var2, int var3);

   public static final native int MaxFlow_solve(long var0, MaxFlow var2, int var3, int var4);

   public static final native long MaxFlow_getOptimalFlow(long var0, MaxFlow var2);

   public static final native long MaxFlow_getFlow(long var0, MaxFlow var2, int var3);

   public static final native void MaxFlow_setArcCapacity(long var0, MaxFlow var2, int var3, long var4);

   public static final native void delete_MaxFlow(long var0);

   public static final native long new_MinCostFlowBase();

   public static final native void delete_MinCostFlowBase(long var0);

   public static final native long new_MinCostFlow();

   public static final native int MinCostFlow_addArcWithCapacityAndUnitCost(long var0, MinCostFlow var2, int var3, int var4, long var5, long var7);

   public static final native void MinCostFlow_setNodeSupply(long var0, MinCostFlow var2, int var3, long var4);

   public static final native int MinCostFlow_solve(long var0, MinCostFlow var2);

   public static final native int MinCostFlow_solveMaxFlowWithMinCost(long var0, MinCostFlow var2);

   public static final native long MinCostFlow_getOptimalCost(long var0, MinCostFlow var2);

   public static final native long MinCostFlow_getMaximumFlow(long var0, MinCostFlow var2);

   public static final native long MinCostFlow_getFlow(long var0, MinCostFlow var2, int var3);

   public static final native int MinCostFlow_getNumNodes(long var0, MinCostFlow var2);

   public static final native int MinCostFlow_getNumArcs(long var0, MinCostFlow var2);

   public static final native int MinCostFlow_getTail(long var0, MinCostFlow var2, int var3);

   public static final native int MinCostFlow_getHead(long var0, MinCostFlow var2, int var3);

   public static final native long MinCostFlow_getCapacity(long var0, MinCostFlow var2, int var3);

   public static final native long MinCostFlow_getSupply(long var0, MinCostFlow var2, int var3);

   public static final native long MinCostFlow_getUnitCost(long var0, MinCostFlow var2, int var3);

   public static final native void delete_MinCostFlow(long var0);

   public static final native long new_LinearSumAssignment();

   public static final native int LinearSumAssignment_addArcWithCost(long var0, LinearSumAssignment var2, int var3, int var4, long var5);

   public static final native int LinearSumAssignment_getNumNodes(long var0, LinearSumAssignment var2);

   public static final native int LinearSumAssignment_getNumArcs(long var0, LinearSumAssignment var2);

   public static final native int LinearSumAssignment_getLeftNode(long var0, LinearSumAssignment var2, int var3);

   public static final native int LinearSumAssignment_getRightNode(long var0, LinearSumAssignment var2, int var3);

   public static final native long LinearSumAssignment_getCost(long var0, LinearSumAssignment var2, int var3);

   public static final native int LinearSumAssignment_solve(long var0, LinearSumAssignment var2);

   public static final native long LinearSumAssignment_getOptimalCost(long var0, LinearSumAssignment var2);

   public static final native int LinearSumAssignment_getRightMate(long var0, LinearSumAssignment var2, int var3);

   public static final native long LinearSumAssignment_getAssignmentCost(long var0, LinearSumAssignment var2, int var3);

   public static final native void delete_LinearSumAssignment(long var0);

   public static final native long MinCostFlow_SWIGUpcast(long var0);
}
