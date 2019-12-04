package com.google.ortools.sat;

public final class NotBooleanVariable implements Literal {
   private final IntVar boolVar;

   public NotBooleanVariable(IntVar var1) {
      this.boolVar = var1;
   }

   public int getIndex() {
      return -this.boolVar.getIndex() - 1;
   }

   public Literal not() {
      return this.boolVar;
   }

   public String getShortString() {
      return "not(" + this.boolVar.getShortString() + ")";
   }
}
