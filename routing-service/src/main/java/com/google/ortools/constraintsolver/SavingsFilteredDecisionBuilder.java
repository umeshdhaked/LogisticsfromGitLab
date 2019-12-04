package com.google.ortools.constraintsolver;

public class SavingsFilteredDecisionBuilder extends RoutingFilteredDecisionBuilder {
   private transient long swigCPtr;

   protected SavingsFilteredDecisionBuilder(long var1, boolean var3) {
      super(mainJNI.SavingsFilteredDecisionBuilder_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(SavingsFilteredDecisionBuilder var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_SavingsFilteredDecisionBuilder(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public boolean buildSolution() {
      return mainJNI.SavingsFilteredDecisionBuilder_buildSolution(this.swigCPtr, this);
   }

   public static class SavingsParameters {
      private transient long swigCPtr;
      protected transient boolean swigCMemOwn;

      protected SavingsParameters(long var1, boolean var3) {
         this.swigCMemOwn = var3;
         this.swigCPtr = var1;
      }

      protected static long getCPtr(SavingsFilteredDecisionBuilder.SavingsParameters var0) {
         return var0 == null ? 0L : var0.swigCPtr;
      }

      protected void finalize() {
         this.delete();
      }

      public synchronized void delete() {
         if (this.swigCPtr != 0L) {
            if (this.swigCMemOwn) {
               this.swigCMemOwn = false;
               mainJNI.delete_SavingsFilteredDecisionBuilder_SavingsParameters(this.swigCPtr);
            }

            this.swigCPtr = 0L;
         }

      }

      public void setNeighbors_ratio(double var1) {
         mainJNI.SavingsFilteredDecisionBuilder_SavingsParameters_neighbors_ratio_set(this.swigCPtr, this, var1);
      }

      public double getNeighbors_ratio() {
         return mainJNI.SavingsFilteredDecisionBuilder_SavingsParameters_neighbors_ratio_get(this.swigCPtr, this);
      }

      public void setMax_memory_usage_bytes(double var1) {
         mainJNI.SavingsFilteredDecisionBuilder_SavingsParameters_max_memory_usage_bytes_set(this.swigCPtr, this, var1);
      }

      public double getMax_memory_usage_bytes() {
         return mainJNI.SavingsFilteredDecisionBuilder_SavingsParameters_max_memory_usage_bytes_get(this.swigCPtr, this);
      }

      public void setAdd_reverse_arcs(boolean var1) {
         mainJNI.SavingsFilteredDecisionBuilder_SavingsParameters_add_reverse_arcs_set(this.swigCPtr, this, var1);
      }

      public boolean getAdd_reverse_arcs() {
         return mainJNI.SavingsFilteredDecisionBuilder_SavingsParameters_add_reverse_arcs_get(this.swigCPtr, this);
      }

      public void setArc_coefficient(double var1) {
         mainJNI.SavingsFilteredDecisionBuilder_SavingsParameters_arc_coefficient_set(this.swigCPtr, this, var1);
      }

      public double getArc_coefficient() {
         return mainJNI.SavingsFilteredDecisionBuilder_SavingsParameters_arc_coefficient_get(this.swigCPtr, this);
      }

      public SavingsParameters() {
         this(mainJNI.new_SavingsFilteredDecisionBuilder_SavingsParameters(), true);
      }
   }
}
