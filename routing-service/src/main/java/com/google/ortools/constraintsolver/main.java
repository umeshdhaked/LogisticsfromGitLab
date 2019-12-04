package com.google.ortools.constraintsolver;

import com.google.protobuf.InvalidProtocolBufferException;

public class main implements mainConstants {
   public static long zero() {
      return mainJNI.zero();
   }

   public static long One() {
      return mainJNI.One();
   }

   public static void setAssignmentFromAssignment(Assignment var0, IntVar[] var1, Assignment var2, IntVar[] var3) {
      mainJNI.setAssignmentFromAssignment(Assignment.getCPtr(var0), var0, var1, Assignment.getCPtr(var2), var2, var3);
   }

   public static boolean areAllBound(IntVar[] var0) {
      return mainJNI.areAllBound(var0);
   }

   public static boolean areAllBooleans(IntVar[] var0) {
      return mainJNI.areAllBooleans(var0);
   }

   public static boolean areAllBoundTo(IntVar[] var0, long var1) {
      return mainJNI.areAllBoundTo(var0, var1);
   }

   public static long maxVarArray(IntVar[] var0) {
      return mainJNI.maxVarArray(var0);
   }

   public static long minVarArray(IntVar[] var0) {
      return mainJNI.minVarArray(var0);
   }

   public static long posIntDivUp(long var0, long var2) {
      return mainJNI.posIntDivUp(var0, var2);
   }

   public static long posIntDivDown(long var0, long var2) {
      return mainJNI.posIntDivDown(var0, var2);
   }

   public static RoutingModelParameters defaultRoutingModelParameters() {
      byte[] var0 = mainJNI.defaultRoutingModelParameters();
      if (var0 != null && var0.length != 0) {
         try {
            return RoutingModelParameters.parseFrom(var0);
         } catch (InvalidProtocolBufferException var2) {
            throw new RuntimeException("Unable to parse com.google.ortools.constraintsolver.RoutingModelParameters protocol message.");
         }
      } else {
         return null;
      }
   }

   public static RoutingSearchParameters defaultRoutingSearchParameters() {
      byte[] var0 = mainJNI.defaultRoutingSearchParameters();
      if (var0 != null && var0.length != 0) {
         try {
            return RoutingSearchParameters.parseFrom(var0);
         } catch (InvalidProtocolBufferException var2) {
            throw new RuntimeException("Unable to parse com.google.ortools.constraintsolver.RoutingSearchParameters protocol message.");
         }
      } else {
         return null;
      }
   }

   public static String findErrorInRoutingSearchParameters(RoutingSearchParameters var0) {
      return mainJNI.findErrorInRoutingSearchParameters(var0.toByteArray());
   }

   public static DecisionBuilder makeSetValuesFromTargets(Solver var0, IntVar[] var1, long[] var2) {
      long var3 = mainJNI.makeSetValuesFromTargets(Solver.getCPtr(var0), var0, var1, var2);
      return var3 == 0L ? null : new DecisionBuilder(var3, false);
   }

   public static boolean SolveModelWithSat(RoutingModel var0, RoutingSearchParameters var1, Assignment var2, Assignment var3) {
      return mainJNI.SolveModelWithSat(RoutingModel.getCPtr(var0), var0, var1.toByteArray(), Assignment.getCPtr(var2), var2, Assignment.getCPtr(var3), var3);
   }
}
