package com.google.ortools.util;

import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Internal.EnumLiteMap;

public enum OptionalBoolean implements ProtocolMessageEnum {
   BOOL_UNSPECIFIED(0),
   BOOL_FALSE(2),
   BOOL_TRUE(3),
   UNRECOGNIZED(-1);

   public static final int BOOL_UNSPECIFIED_VALUE = 0;
   public static final int BOOL_FALSE_VALUE = 2;
   public static final int BOOL_TRUE_VALUE = 3;
   private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
      public OptionalBoolean findValueByNumber(int var1) {
         return OptionalBoolean.forNumber(var1);
      }
   };
   private static final OptionalBoolean[] VALUES = values();
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
   public static OptionalBoolean valueOf(int var0) {
      return forNumber(var0);
   }

   public static OptionalBoolean forNumber(int var0) {
      switch(var0) {
      case 0:
         return BOOL_UNSPECIFIED;
      case 1:
      default:
         return null;
      case 2:
         return BOOL_FALSE;
      case 3:
         return BOOL_TRUE;
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
      return (EnumDescriptor)OptionalBooleanOuterClass.getDescriptor().getEnumTypes().get(0);
   }

   public static OptionalBoolean valueOf(EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   private OptionalBoolean(int var3) {
      this.value = var3;
   }
}
