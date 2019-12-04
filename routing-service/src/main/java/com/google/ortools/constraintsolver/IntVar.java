package com.google.ortools.constraintsolver;

import java.math.BigInteger;

public class IntVar extends IntExpr {
   private transient long swigCPtr;

   protected IntVar(long var1, boolean var3) {
      super(mainJNI.IntVar_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(IntVar var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_IntVar(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public boolean isVar() {
      return mainJNI.IntVar_isVar(this.swigCPtr, this);
   }

   public IntVar var() {
      long var1 = mainJNI.IntVar_var(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVar(var1, false);
   }

   public long value() {
      return mainJNI.IntVar_value(this.swigCPtr, this);
   }

   public void removeValue(long var1) {
      mainJNI.IntVar_removeValue(this.swigCPtr, this, var1);
   }

   public void removeInterval(long var1, long var3) {
      mainJNI.IntVar_removeInterval(this.swigCPtr, this, var1, var3);
   }

   public void removeValues(long[] var1) {
      mainJNI.IntVar_removeValues(this.swigCPtr, this, var1);
   }

   public void setValue(long[] var1) {
      mainJNI.IntVar_setValue(this.swigCPtr, this, var1);
   }

   public void whenBound(Demon var1) {
      mainJNI.IntVar_whenBound__SWIG_0(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenBound(Runnable var1) {
      mainJNI.IntVar_whenBound__SWIG_1(this.swigCPtr, this, var1);
   }

   public void whenDomain(Demon var1) {
      mainJNI.IntVar_whenDomain__SWIG_0(this.swigCPtr, this, Demon.getCPtr(var1), var1);
   }

   public void whenDomain(Runnable var1) {
      mainJNI.IntVar_whenDomain__SWIG_1(this.swigCPtr, this, var1);
   }

   public BigInteger size() {
      return mainJNI.IntVar_size(this.swigCPtr, this);
   }

   public boolean contains(long var1) {
      return mainJNI.IntVar_contains(this.swigCPtr, this, var1);
   }

   public IntVarIterator makeHoleIterator(boolean var1) {
      long var2 = mainJNI.IntVar_makeHoleIterator(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVarIterator(var2, false);
   }

   public IntVarIterator makeDomainIterator(boolean var1) {
      long var2 = mainJNI.IntVar_makeDomainIterator(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new IntVarIterator(var2, false);
   }

   public long oldMin() {
      return mainJNI.IntVar_oldMin(this.swigCPtr, this);
   }

   public long oldMax() {
      return mainJNI.IntVar_oldMax(this.swigCPtr, this);
   }

   public int varType() {
      return mainJNI.IntVar_varType(this.swigCPtr, this);
   }

   public void accept(ModelVisitor var1) {
      mainJNI.IntVar_accept(this.swigCPtr, this, ModelVisitor.getCPtr(var1), var1);
   }

   public IntVar isEqual(long var1) {
      long var3 = mainJNI.IntVar_isEqual(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar isDifferent(long var1) {
      long var3 = mainJNI.IntVar_isDifferent(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar isGreaterOrEqual(long var1) {
      long var3 = mainJNI.IntVar_isGreaterOrEqual(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public IntVar isLessOrEqual(long var1) {
      long var3 = mainJNI.IntVar_isLessOrEqual(this.swigCPtr, this, var1);
      return var3 == 0L ? null : new IntVar(var3, false);
   }

   public int index() {
      return mainJNI.IntVar_index(this.swigCPtr, this);
   }
}
