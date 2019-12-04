package com.google.ortools.sat;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum CpSolverStatus implements ProtocolMessageEnum {
   UNKNOWN(0),
   MODEL_INVALID(1),
   FEASIBLE(2),
   INFEASIBLE(3),
   OPTIMAL(4),
   UNRECOGNIZED(-1);

   public static final int UNKNOWN_VALUE = 0;
   public static final int MODEL_INVALID_VALUE = 1;
   public static final int FEASIBLE_VALUE = 2;
   public static final int INFEASIBLE_VALUE = 3;
   public static final int OPTIMAL_VALUE = 4;
   private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
      public CpSolverStatus findValueByNumber(int var1) {
         return CpSolverStatus.forNumber(var1);
      }
   };
   private static final CpSolverStatus[] VALUES = values();
   private final int value;

   public final int getNumber() {
      if (this == UNRECOGNIZED) {
         throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
      } else {
         return this.value;
      }
   }

   /** @deprecated */
   @Deprecated
   public static CpSolverStatus valueOf(int var0) {
      return forNumber(var0);
   }

   public static CpSolverStatus forNumber(int var0) {
      switch(var0) {
      case 0:
         return UNKNOWN;
      case 1:
         return MODEL_INVALID;
      case 2:
         return FEASIBLE;
      case 3:
         return INFEASIBLE;
      case 4:
         return OPTIMAL;
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
      return (EnumDescriptor)CpModelProtobuf.getDescriptor().getEnumTypes().get(0);
   }

   public static CpSolverStatus valueOf(EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   private CpSolverStatus(int var3) {
      this.value = var3;
   }
}
