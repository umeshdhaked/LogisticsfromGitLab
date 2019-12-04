package com.google.ortools.linearsolver;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum MPSolverResponseStatus implements ProtocolMessageEnum {
   MPSOLVER_OPTIMAL(0),
   MPSOLVER_FEASIBLE(1),
   MPSOLVER_INFEASIBLE(2),
   MPSOLVER_UNBOUNDED(3),
   MPSOLVER_ABNORMAL(4),
   MPSOLVER_NOT_SOLVED(6),
   MPSOLVER_MODEL_IS_VALID(97),
   MPSOLVER_UNKNOWN_STATUS(99),
   MPSOLVER_MODEL_INVALID(5),
   MPSOLVER_MODEL_INVALID_SOLUTION_HINT(84),
   MPSOLVER_MODEL_INVALID_SOLVER_PARAMETERS(85),
   MPSOLVER_SOLVER_TYPE_UNAVAILABLE(7);

   public static final int MPSOLVER_OPTIMAL_VALUE = 0;
   public static final int MPSOLVER_FEASIBLE_VALUE = 1;
   public static final int MPSOLVER_INFEASIBLE_VALUE = 2;
   public static final int MPSOLVER_UNBOUNDED_VALUE = 3;
   public static final int MPSOLVER_ABNORMAL_VALUE = 4;
   public static final int MPSOLVER_NOT_SOLVED_VALUE = 6;
   public static final int MPSOLVER_MODEL_IS_VALID_VALUE = 97;
   public static final int MPSOLVER_UNKNOWN_STATUS_VALUE = 99;
   public static final int MPSOLVER_MODEL_INVALID_VALUE = 5;
   public static final int MPSOLVER_MODEL_INVALID_SOLUTION_HINT_VALUE = 84;
   public static final int MPSOLVER_MODEL_INVALID_SOLVER_PARAMETERS_VALUE = 85;
   public static final int MPSOLVER_SOLVER_TYPE_UNAVAILABLE_VALUE = 7;
   private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
      public MPSolverResponseStatus findValueByNumber(int var1) {
         return MPSolverResponseStatus.forNumber(var1);
      }
   };
   private static final MPSolverResponseStatus[] VALUES = values();
   private final int value;

   public final int getNumber() {
      return this.value;
   }

   /** @deprecated */
   @Deprecated
   public static MPSolverResponseStatus valueOf(int var0) {
      return forNumber(var0);
   }

   public static MPSolverResponseStatus forNumber(int var0) {
      switch(var0) {
      case 0:
         return MPSOLVER_OPTIMAL;
      case 1:
         return MPSOLVER_FEASIBLE;
      case 2:
         return MPSOLVER_INFEASIBLE;
      case 3:
         return MPSOLVER_UNBOUNDED;
      case 4:
         return MPSOLVER_ABNORMAL;
      case 5:
         return MPSOLVER_MODEL_INVALID;
      case 6:
         return MPSOLVER_NOT_SOLVED;
      case 7:
         return MPSOLVER_SOLVER_TYPE_UNAVAILABLE;
      case 84:
         return MPSOLVER_MODEL_INVALID_SOLUTION_HINT;
      case 85:
         return MPSOLVER_MODEL_INVALID_SOLVER_PARAMETERS;
      case 97:
         return MPSOLVER_MODEL_IS_VALID;
      case 99:
         return MPSOLVER_UNKNOWN_STATUS;
      default:
         return null;
      }
   }

   public static EnumLiteMap internalGetValueMap() {
      return internalValueMap;
   }

   public final EnumValueDescriptor getValueDescriptor() {
      return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
   }

   public final EnumDescriptor getDescriptorForType() {
      return getDescriptor();
   }

   public static final EnumDescriptor getDescriptor() {
      return (EnumDescriptor)LinearSolver.getDescriptor().getEnumTypes().get(0);
   }

   public static MPSolverResponseStatus valueOf(EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return VALUES[var0.getIndex()];
      }
   }

   private MPSolverResponseStatus(int var3) {
      this.value = var3;
   }
}
