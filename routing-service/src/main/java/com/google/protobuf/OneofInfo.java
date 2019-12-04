package com.google.protobuf;

import java.lang.reflect.Field;

final class OneofInfo {
   private final int id;
   private final Field caseField;
   private final Field valueField;

   public OneofInfo(int var1, Field var2, Field var3) {
      this.id = var1;
      this.caseField = var2;
      this.valueField = var3;
   }

   public int getId() {
      return this.id;
   }

   public Field getCaseField() {
      return this.caseField;
   }

   public Field getValueField() {
      return this.valueField;
   }
}
