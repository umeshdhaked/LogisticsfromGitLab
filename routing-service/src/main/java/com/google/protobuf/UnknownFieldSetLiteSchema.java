package com.google.protobuf;

import java.io.IOException;

class UnknownFieldSetLiteSchema extends UnknownFieldSchema {
   boolean shouldDiscardUnknownFields(Reader var1) {
      return false;
   }

   @Override
   void addVarint(Object var1, int var2, long var3) {

   }

   @Override
   void addFixed32(Object var1, int var2, int var3) {

   }

   @Override
   void addFixed64(Object var1, int var2, long var3) {

   }

   @Override
   void addLengthDelimited(Object var1, int var2, ByteString var3) {

   }

   @Override
   void addGroup(Object var1, int var2, Object var3) {

   }

   UnknownFieldSetLite newBuilder() {
      return UnknownFieldSetLite.newInstance();
   }

   @Override
   Object toImmutable(Object var1) {
      return null;
   }

   @Override
   void setToMessage(Object var1, Object var2) {

   }

   void addVarint(UnknownFieldSetLite var1, int var2, long var3) {
      var1.storeField(WireFormat.makeTag(var2, 0), var3);
   }

   void addFixed32(UnknownFieldSetLite var1, int var2, int var3) {
      var1.storeField(WireFormat.makeTag(var2, 5), var3);
   }

   void addFixed64(UnknownFieldSetLite var1, int var2, long var3) {
      var1.storeField(WireFormat.makeTag(var2, 1), var3);
   }

   void addLengthDelimited(UnknownFieldSetLite var1, int var2, ByteString var3) {
      var1.storeField(WireFormat.makeTag(var2, 2), var3);
   }

   void addGroup(UnknownFieldSetLite var1, int var2, UnknownFieldSetLite var3) {
      var1.storeField(WireFormat.makeTag(var2, 3), var3);
   }

   UnknownFieldSetLite toImmutable(UnknownFieldSetLite var1) {
      var1.makeImmutable();
      return var1;
   }

   void setToMessage(Object var1, UnknownFieldSetLite var2) {
      ((GeneratedMessageLite)var1).unknownFields = var2;
   }

   UnknownFieldSetLite getFromMessage(Object var1) {
      return ((GeneratedMessageLite)var1).unknownFields;
   }

   UnknownFieldSetLite getBuilderFromMessage(Object var1) {
      UnknownFieldSetLite var2 = this.getFromMessage(var1);
      if (var2 == UnknownFieldSetLite.getDefaultInstance()) {
         var2 = UnknownFieldSetLite.newInstance();
         this.setToMessage(var1, var2);
      }

      return var2;
   }

   @Override
   void setBuilderToMessage(Object var1, Object var2) {

   }

   void setBuilderToMessage(Object var1, UnknownFieldSetLite var2) {
      this.setToMessage(var1, var2);
   }

   void makeImmutable(Object var1) {
      this.getFromMessage(var1).makeImmutable();
   }

   @Override
   void writeTo(Object var1, Writer var2) throws IOException {

   }

   @Override
   void writeAsMessageSetTo(Object var1, Writer var2) throws IOException {

   }

   @Override
   Object merge(Object var1, Object var2) {
      return null;
   }

   @Override
   int getSerializedSizeAsMessageSet(Object var1) {
      return 0;
   }

   @Override
   int getSerializedSize(Object var1) {
      return 0;
   }

   void writeTo(UnknownFieldSetLite var1, Writer var2) throws IOException {
      var1.writeTo(var2);
   }

   void writeAsMessageSetTo(UnknownFieldSetLite var1, Writer var2) throws IOException {
      var1.writeAsMessageSetTo(var2);
   }

   UnknownFieldSetLite merge(UnknownFieldSetLite var1, UnknownFieldSetLite var2) {
      return var2.equals(UnknownFieldSetLite.getDefaultInstance()) ? var1 : UnknownFieldSetLite.mutableCopyOf(var1, var2);
   }

   int getSerializedSize(UnknownFieldSetLite var1) {
      return var1.getSerializedSize();
   }

   int getSerializedSizeAsMessageSet(UnknownFieldSetLite var1) {
      return var1.getSerializedSizeAsMessageSet();
   }
}
