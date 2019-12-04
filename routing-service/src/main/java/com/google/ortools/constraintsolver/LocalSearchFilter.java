package com.google.ortools.constraintsolver;

public class LocalSearchFilter extends BaseObject {
   private transient long swigCPtr;

   protected LocalSearchFilter(long var1, boolean var3) {
      super(mainJNI.LocalSearchFilter_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(LocalSearchFilter var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_LocalSearchFilter(this.swigCPtr);
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
      mainJNI.LocalSearchFilter_change_ownership(this, this.swigCPtr, false);
   }

   public void swigTakeOwnership() {
      this.swigCMemOwn = true;
      mainJNI.LocalSearchFilter_change_ownership(this, this.swigCPtr, true);
   }

   public void Relax(Assignment var1, Assignment var2) {
      if (this.getClass() == LocalSearchFilter.class) {
         mainJNI.LocalSearchFilter_Relax(this.swigCPtr, this, Assignment.getCPtr(var1), var1, Assignment.getCPtr(var2), var2);
      } else {
         mainJNI.LocalSearchFilter_RelaxSwigExplicitLocalSearchFilter(this.swigCPtr, this, Assignment.getCPtr(var1), var1, Assignment.getCPtr(var2), var2);
      }

   }

   public boolean accept(Assignment var1, Assignment var2, long var3, long var5) {
      return mainJNI.LocalSearchFilter_accept(this.swigCPtr, this, Assignment.getCPtr(var1), var1, Assignment.getCPtr(var2), var2, var3, var5);
   }

   public boolean isIncremental() {
      return this.getClass() == LocalSearchFilter.class ? mainJNI.LocalSearchFilter_isIncremental(this.swigCPtr, this) : mainJNI.LocalSearchFilter_isIncrementalSwigExplicitLocalSearchFilter(this.swigCPtr, this);
   }

   public void synchronize(Assignment var1, Assignment var2) {
      mainJNI.LocalSearchFilter_synchronize(this.swigCPtr, this, Assignment.getCPtr(var1), var1, Assignment.getCPtr(var2), var2);
   }

   public void Revert() {
      if (this.getClass() == LocalSearchFilter.class) {
         mainJNI.LocalSearchFilter_Revert(this.swigCPtr, this);
      } else {
         mainJNI.LocalSearchFilter_RevertSwigExplicitLocalSearchFilter(this.swigCPtr, this);
      }

   }

   public long getSynchronizedObjectiveValue() {
      return this.getClass() == LocalSearchFilter.class ? mainJNI.LocalSearchFilter_getSynchronizedObjectiveValue(this.swigCPtr, this) : mainJNI.LocalSearchFilter_getSynchronizedObjectiveValueSwigExplicitLocalSearchFilter(this.swigCPtr, this);
   }

   public long getAcceptedObjectiveValue() {
      return this.getClass() == LocalSearchFilter.class ? mainJNI.LocalSearchFilter_getAcceptedObjectiveValue(this.swigCPtr, this) : mainJNI.LocalSearchFilter_getAcceptedObjectiveValueSwigExplicitLocalSearchFilter(this.swigCPtr, this);
   }

   public LocalSearchFilter() {
      this(mainJNI.new_LocalSearchFilter(), true);
      mainJNI.LocalSearchFilter_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
   }
}
