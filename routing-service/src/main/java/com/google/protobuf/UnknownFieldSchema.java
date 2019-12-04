package com.google.protobuf;

import java.io.IOException;

abstract class UnknownFieldSchema {
   abstract boolean shouldDiscardUnknownFields(Reader var1);

   abstract void addVarint(Object var1, int var2, long var3);

   abstract void addFixed32(Object var1, int var2, int var3);

   abstract void addFixed64(Object var1, int var2, long var3);

   abstract void addLengthDelimited(Object var1, int var2, ByteString var3);

   abstract void addGroup(Object var1, int var2, Object var3);

   abstract Object newBuilder();

   abstract Object toImmutable(Object var1);

   abstract void setToMessage(Object var1, Object var2);

   abstract Object getFromMessage(Object var1);

   abstract Object getBuilderFromMessage(Object var1);

   abstract void setBuilderToMessage(Object var1, Object var2);

   abstract void makeImmutable(Object var1);

   final boolean mergeOneFieldFrom(Object var1, Reader var2) throws IOException {
      int var3 = var2.getTag();
      int var4 = WireFormat.getTagFieldNumber(var3);
      switch(WireFormat.getTagWireType(var3)) {
      case 0:
         this.addVarint(var1, var4, var2.readInt64());
         return true;
      case 1:
         this.addFixed64(var1, var4, var2.readFixed64());
         return true;
      case 2:
         this.addLengthDelimited(var1, var4, var2.readBytes());
         return true;
      case 3:
         Object var5 = this.newBuilder();
         int var6 = WireFormat.makeTag(var4, 4);
         this.mergeFrom(var5, var2);
         if (var6 != var2.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
         }

         this.addGroup(var1, var4, this.toImmutable(var5));
         return true;
      case 4:
         return false;
      case 5:
         this.addFixed32(var1, var4, var2.readFixed32());
         return true;
      default:
         throw InvalidProtocolBufferException.invalidWireType();
      }
   }

   final void mergeFrom(Object var1, Reader var2) throws IOException {
      while(var2.getFieldNumber() != Integer.MAX_VALUE && this.mergeOneFieldFrom(var1, var2)) {
      }

   }

   abstract void writeTo(Object var1, Writer var2) throws IOException;

   abstract void writeAsMessageSetTo(Object var1, Writer var2) throws IOException;

   abstract Object merge(Object var1, Object var2);

   abstract int getSerializedSizeAsMessageSet(Object var1);

   abstract int getSerializedSize(Object var1);
}
