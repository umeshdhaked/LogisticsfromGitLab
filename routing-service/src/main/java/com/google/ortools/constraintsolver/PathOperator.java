package com.google.ortools.constraintsolver;

import java.util.function.LongToIntFunction;

public class PathOperator extends IntVarLocalSearchOperator {
   private transient long swigCPtr;

   protected PathOperator(long var1, boolean var3) {
      super(mainJNI.PathOperator_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(PathOperator var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_PathOperator(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   protected void swigDirectorDisconnect() {
      this.swigCMemOwn = false;
      this.delete();
   }

   public void swigReleaseOwnership() {
      this.swigCMemOwn = false;
      mainJNI.PathOperator_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.PathOperator_change_ownership(this, this.swigCPtr, true);
   }

   public PathOperator(IntVar[] var1, IntVar[] var2, int var3, boolean var4, LongToIntFunction var5) {
      this(mainJNI.new_PathOperator(var1, var2, var3, var4, var5), true);
      mainJNI.PathOperator_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }

   public boolean neighbor() {
      return mainJNI.PathOperator_neighbor(this.swigCPtr, this);
   }

   public void reset() {
      if (this.getClass() == PathOperator.class) {
         mainJNI.PathOperator_reset(this.swigCPtr, this);
      } else {
         mainJNI.PathOperator_resetSwigExplicitPathOperator(this.swigCPtr, this);
      }

   }

   protected boolean oneNeighbor() {
      return this.getClass() == PathOperator.class ? mainJNI.PathOperator_oneNeighbor(this.swigCPtr, this) : mainJNI.PathOperator_oneNeighborSwigExplicitPathOperator(this.swigCPtr, this);
   }

   protected boolean restartAtPathStartOnSynchronize() {
      return this.getClass() == PathOperator.class ? mainJNI.PathOperator_restartAtPathStartOnSynchronize(this.swigCPtr, this) : mainJNI.PathOperator_restartAtPathStartOnSynchronizeSwigExplicitPathOperator(this.swigCPtr, this);
   }

   protected boolean onSamePathAsPreviousBase(long var1) {
      return this.getClass() == PathOperator.class ? mainJNI.PathOperator_onSamePathAsPreviousBase(this.swigCPtr, this, var1) : mainJNI.PathOperator_onSamePathAsPreviousBaseSwigExplicitPathOperator(this.swigCPtr, this, var1);
   }

   protected long getBaseNodeRestartPosition(int var1) {
      return this.getClass() == PathOperator.class ? mainJNI.PathOperator_getBaseNodeRestartPosition(this.swigCPtr, this, var1) : mainJNI.PathOperator_getBaseNodeRestartPositionSwigExplicitPathOperator(this.swigCPtr, this, var1);
   }

   protected void setNextBaseToIncrement(long var1) {
      if (this.getClass() == PathOperator.class) {
         mainJNI.PathOperator_setNextBaseToIncrement(this.swigCPtr, this, var1);
      } else {
         mainJNI.PathOperator_setNextBaseToIncrementSwigExplicitPathOperator(this.swigCPtr, this, var1);
      }

   }

   protected boolean initPosition() {
      return this.getClass() == PathOperator.class ? mainJNI.PathOperator_initPosition(this.swigCPtr, this) : mainJNI.PathOperator_initPositionSwigExplicitPathOperator(this.swigCPtr, this);
   }
}
