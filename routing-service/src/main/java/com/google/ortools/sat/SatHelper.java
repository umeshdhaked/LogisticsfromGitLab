package com.google.ortools.sat;

import com.google.protobuf.InvalidProtocolBufferException;

public class SatHelper {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected SatHelper(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SatHelper var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SatHelper(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public static CpSolverResponse solve(CpModelProto var0) {
      byte[] var1 = mainJNI.SatHelper_solve(var0.toByteArray());
      if (var1 != null && var1.length != 0) {
         try {
            return CpSolverResponse.parseFrom(var1);
         } catch (InvalidProtocolBufferException var3) {
            throw new RuntimeException("Unable to parse com.google.ortools.sat.CpSolverResponse protocol message.");
         }
      } else {
         return null;
      }
   }

   public static CpSolverResponse solveWithParameters(CpModelProto var0, SatParameters var1) {
      byte[] var2 = mainJNI.SatHelper_solveWithParameters(var0.toByteArray(), var1.toByteArray());
      if (var2 != null && var2.length != 0) {
         try {
            return CpSolverResponse.parseFrom(var2);
         } catch (InvalidProtocolBufferException var4) {
            throw new RuntimeException("Unable to parse com.google.ortools.sat.CpSolverResponse protocol message.");
         }
      } else {
         return null;
      }
   }

   public static CpSolverResponse solveWithParametersAndSolutionCallback(CpModelProto var0, SatParameters var1, SolutionCallback var2) {
      byte[] var3 = mainJNI.SatHelper_solveWithParametersAndSolutionCallback(var0.toByteArray(), var1.toByteArray(), SolutionCallback.getCPtr(var2), var2);
      if (var3 != null && var3.length != 0) {
         try {
            return CpSolverResponse.parseFrom(var3);
         } catch (InvalidProtocolBufferException var5) {
            throw new RuntimeException("Unable to parse com.google.ortools.sat.CpSolverResponse protocol message.");
         }
      } else {
         return null;
      }
   }

   public static String modelStats(CpModelProto var0) {
      return mainJNI.SatHelper_modelStats(var0.toByteArray());
   }

   public static String solverResponseStats(CpSolverResponse var0) {
      return mainJNI.SatHelper_solverResponseStats(var0.toByteArray());
   }

   public static String validateModel(CpModelProto var0) {
      return mainJNI.SatHelper_validateModel(var0.toByteArray());
   }

   public SatHelper() {
      this(mainJNI.new_SatHelper(), true);
   }
}
