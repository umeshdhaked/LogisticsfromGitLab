package com.google.ortools.constraintsolver;

import java.math.BigInteger;

public class BooleanVar extends IntVar {
   private transient long swigCPtr;

   protected BooleanVar(long var1, boolean var3) {
      super(mainJNI.BooleanVar_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(BooleanVar var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_BooleanVar(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public static int getKUnboundBooleanVarValue() {
      return mainJNI.BooleanVar_kUnboundBooleanVarValue_get();
   }

   public long min() {
      return mainJNI.BooleanVar_min(this.swigCPtr, this);
   }

   public void setMin(long var1) {
      mainJNI.BooleanVar_setMin(this.swigCPtr, this, var1);
   }

   public long max() {
      return mainJNI.BooleanVar_max(this.swigCPtr, this);
   }

   public void setMax(long var1) {
      mainJNI.BooleanVar_setMax(this.swigCPtr, this, var1);
   }

   public void setRange(long var1, long var3) {
      mainJNI.BooleanVar_setRange(this.swigCPtr, this, var1, var3);
   }

   public boolean bound() {
      return mainJNI.BooleanVar_bound(this.swigCPtr, this);
   }

   public long value() {
      return mainJNI.BooleanVar_value(this.swigCPtr, this);
   }

   public void removeValue(long var1) {
      mainJNI.BooleanVar_removeValue(this.swigCPtr, this, var1);
   }

   public void removeInterval(long var1, long var3) {
      mainJNI.BooleanVar_removeInterval(this.swigCPtr, this, var1, var3);
   }

   public void whenBound(Demon var1) {
      mainJNI.BooleanVar_whenBound(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenRange(Demon var1) {
      mainJNI.BooleanVar_whenRange(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenDomain(Demon var1) {
      mainJNI.BooleanVar_whenDomain(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public BigInteger size() {
      return mainJNI.BooleanVar_size(this.swigCPtr, this);
   }

   public boolean contains(long var1) {
      return mainJNI.BooleanVar_contains(this.swigCPtr, this, var1);
   }

   public IntVarIterator makeHoleIterator(boolean var1) {
      long var2 = mainJNI.BooleanVar_makeHoleIterator(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVarIterator(var2, false);
   }

   public IntVarIterator makeDomainIterator(boolean var1) {
      long var2 = mainJNI.BooleanVar_makeDomainIterator(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVarIterator(var2, false);
   }

   public String toString() {
      return mainJNI.BooleanVar_toString(this.swigCPtr, this);
   }

   public int varType() {
      return mainJNI.BooleanVar_varType(this.swigCPtr, this);
   }

   public IntVar isEqual(long var1) {
      long var3 = mainJNI.BooleanVar_isEqual(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar isDifferent(long var1) {
      long var3 = mainJNI.BooleanVar_isDifferent(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar isGreaterOrEqual(long var1) {
      long var3 = mainJNI.BooleanVar_isGreaterOrEqual(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar isLessOrEqual(long var1) {
      long var3 = mainJNI.BooleanVar_isLessOrEqual(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public void restoreValue() {
      mainJNI.BooleanVar_restoreValue(this.swigCPtr, this);
   }

   public String baseName() {
      return mainJNI.BooleanVar_baseName(this.swigCPtr, this);
   }

   public int rawValue() {
      return mainJNI.BooleanVar_rawValue(this.swigCPtr, this);
   }
}
