package com.google.ortools.linearsolver;

public final class MPModelExportOptions {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;

   protected MPModelExportOptions(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(MPModelExportOptions var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            main_research_linear_solverJNI.delete_MPModelExportOptions(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public MPModelExportOptions() {
      this(main_research_linear_solverJNI.new_MPModelExportOptions(), true);
   }

   public void setObfuscate(boolean var1) {
      main_research_linear_solverJNI.MPModelExportOptions_Obfuscate_set(this.swigCPtr, this, var1);
   }

   public boolean getObfuscate() {
      return main_research_linear_solverJNI.MPModelExportOptions_Obfuscate_get(this.swigCPtr, this);
   }

   public void setLogInvalidNames(boolean var1) {
      main_research_linear_solverJNI.MPModelExportOptions_LogInvalidNames_set(this.swigCPtr, this, var1);
   }

   public boolean getLogInvalidNames() {
      return main_research_linear_solverJNI.MPModelExportOptions_LogInvalidNames_get(this.swigCPtr, this);
   }

   public void setShowUnusedVariables(boolean var1) {
      main_research_linear_solverJNI.MPModelExportOptions_ShowUnusedVariables_set(this.swigCPtr, this, var1);
   }

   public boolean getShowUnusedVariables() {
      return main_research_linear_solverJNI.MPModelExportOptions_ShowUnusedVariables_get(this.swigCPtr, this);
   }

   public void setMaxLineLength(int var1) {
      main_research_linear_solverJNI.MPModelExportOptions_MaxLineLength_set(this.swigCPtr, this, var1);
   }

   public int getMaxLineLength() {
      return main_research_linear_solverJNI.MPModelExportOptions_MaxLineLength_get(this.swigCPtr, this);
   }
}
