package com.google.protobuf;

final class ProtobufLists {
   private ProtobufLists() {
   }

   public static Internal.ProtobufList emptyProtobufList() {
      return ProtobufArrayList.emptyList();
   }

   public static Internal.ProtobufList mutableCopy(Internal.ProtobufList var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   public static Internal.BooleanList emptyBooleanList() {
      return BooleanArrayList.emptyList();
   }

   public static Internal.BooleanList newBooleanList() {
      return new BooleanArrayList();
   }

   public static Internal.IntList emptyIntList() {
      return IntArrayList.emptyList();
   }

   public static Internal.IntList newIntList() {
      return new IntArrayList();
   }

   public static Internal.LongList emptyLongList() {
      return LongArrayList.emptyList();
   }

   public static Internal.LongList newLongList() {
      return new LongArrayList();
   }

   public static Internal.FloatList emptyFloatList() {
      return FloatArrayList.emptyList();
   }

   public static Internal.FloatList newFloatList() {
      return new FloatArrayList();
   }

   public static Internal.DoubleList emptyDoubleList() {
      return DoubleArrayList.emptyList();
   }

   public static Internal.DoubleList newDoubleList() {
      return new DoubleArrayList();
   }
}
