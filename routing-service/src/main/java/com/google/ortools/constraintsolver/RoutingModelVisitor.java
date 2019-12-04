package com.google.ortools.constraintsolver;

public class RoutingModelVisitor extends BaseObject {
   private transient long swigCPtr;

   protected RoutingModelVisitor(long var1, boolean var3) {
      super(mainJNI.RoutingModelVisitor_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(RoutingModelVisitor var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_RoutingModelVisitor(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public static String getKLightElement() {
      return mainJNI.RoutingModelVisitor_kLightElement_get();
   }

   public static String getKLightElement2() {
      return mainJNI.RoutingModelVisitor_kLightElement2_get();
   }

   public static String getKRemoveValues() {
      return mainJNI.RoutingModelVisitor_kRemoveValues_get();
   }

   public RoutingModelVisitor() {
      this(mainJNI.new_RoutingModelVisitor(), true);
   }
}
