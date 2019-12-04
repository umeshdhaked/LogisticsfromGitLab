package com.google.ortools.constraintsolver;

public class ModelCache {
   private transient long swigCPtr;
   protected transient boolean swigCMemOwn;
   public static final int VOID_FALSE_CONSTRAINT = mainJNI.ModelCache_VOID_FALSE_CONSTRAINT_get();
   public static final int VOID_TRUE_CONSTRAINT = mainJNI.ModelCache_VOID_TRUE_CONSTRAINT_get();
   public static final int VOID_CONSTRAINT_MAX = mainJNI.ModelCache_VOID_CONSTRAINT_MAX_get();
   public static final int VAR_CONSTANT_EQUALITY = mainJNI.ModelCache_VAR_CONSTANT_EQUALITY_get();
   public static final int VAR_CONSTANT_GREATER_OR_EQUAL = mainJNI.ModelCache_VAR_CONSTANT_GREATER_OR_EQUAL_get();
   public static final int VAR_CONSTANT_LESS_OR_EQUAL = mainJNI.ModelCache_VAR_CONSTANT_LESS_OR_EQUAL_get();
   public static final int VAR_CONSTANT_NON_EQUALITY = mainJNI.ModelCache_VAR_CONSTANT_NON_EQUALITY_get();
   public static final int VAR_CONSTANT_CONSTRAINT_MAX = mainJNI.ModelCache_VAR_CONSTANT_CONSTRAINT_MAX_get();
   public static final int VAR_CONSTANT_CONSTANT_BETWEEN = mainJNI.ModelCache_VAR_CONSTANT_CONSTANT_BETWEEN_get();
   public static final int VAR_CONSTANT_CONSTANT_CONSTRAINT_MAX = mainJNI.ModelCache_VAR_CONSTANT_CONSTANT_CONSTRAINT_MAX_get();
   public static final int EXPR_EXPR_EQUALITY = mainJNI.ModelCache_EXPR_EXPR_EQUALITY_get();
   public static final int EXPR_EXPR_GREATER = mainJNI.ModelCache_EXPR_EXPR_GREATER_get();
   public static final int EXPR_EXPR_GREATER_OR_EQUAL = mainJNI.ModelCache_EXPR_EXPR_GREATER_OR_EQUAL_get();
   public static final int EXPR_EXPR_LESS = mainJNI.ModelCache_EXPR_EXPR_LESS_get();
   public static final int EXPR_EXPR_LESS_OR_EQUAL = mainJNI.ModelCache_EXPR_EXPR_LESS_OR_EQUAL_get();
   public static final int EXPR_EXPR_NON_EQUALITY = mainJNI.ModelCache_EXPR_EXPR_NON_EQUALITY_get();
   public static final int EXPR_EXPR_CONSTRAINT_MAX = mainJNI.ModelCache_EXPR_EXPR_CONSTRAINT_MAX_get();
   public static final int EXPR_OPPOSITE = mainJNI.ModelCache_EXPR_OPPOSITE_get();
   public static final int EXPR_ABS = mainJNI.ModelCache_EXPR_ABS_get();
   public static final int EXPR_SQUARE = mainJNI.ModelCache_EXPR_SQUARE_get();
   public static final int EXPR_EXPRESSION_MAX = mainJNI.ModelCache_EXPR_EXPRESSION_MAX_get();
   public static final int EXPR_EXPR_DIFFERENCE = mainJNI.ModelCache_EXPR_EXPR_DIFFERENCE_get();
   public static final int EXPR_EXPR_PROD = mainJNI.ModelCache_EXPR_EXPR_PROD_get();
   public static final int EXPR_EXPR_DIV = mainJNI.ModelCache_EXPR_EXPR_DIV_get();
   public static final int EXPR_EXPR_MAX = mainJNI.ModelCache_EXPR_EXPR_MAX_get();
   public static final int EXPR_EXPR_MIN = mainJNI.ModelCache_EXPR_EXPR_MIN_get();
   public static final int EXPR_EXPR_SUM = mainJNI.ModelCache_EXPR_EXPR_SUM_get();
   public static final int EXPR_EXPR_IS_LESS = mainJNI.ModelCache_EXPR_EXPR_IS_LESS_get();
   public static final int EXPR_EXPR_IS_LESS_OR_EQUAL = mainJNI.ModelCache_EXPR_EXPR_IS_LESS_OR_EQUAL_get();
   public static final int EXPR_EXPR_IS_EQUAL = mainJNI.ModelCache_EXPR_EXPR_IS_EQUAL_get();
   public static final int EXPR_EXPR_IS_NOT_EQUAL = mainJNI.ModelCache_EXPR_EXPR_IS_NOT_EQUAL_get();
   public static final int EXPR_EXPR_EXPRESSION_MAX = mainJNI.ModelCache_EXPR_EXPR_EXPRESSION_MAX_get();
   public static final int EXPR_EXPR_CONSTANT_CONDITIONAL = mainJNI.ModelCache_EXPR_EXPR_CONSTANT_CONDITIONAL_get();
   public static final int EXPR_EXPR_CONSTANT_EXPRESSION_MAX = mainJNI.ModelCache_EXPR_EXPR_CONSTANT_EXPRESSION_MAX_get();
   public static final int EXPR_CONSTANT_DIFFERENCE = mainJNI.ModelCache_EXPR_CONSTANT_DIFFERENCE_get();
   public static final int EXPR_CONSTANT_DIVIDE = mainJNI.ModelCache_EXPR_CONSTANT_DIVIDE_get();
   public static final int EXPR_CONSTANT_PROD = mainJNI.ModelCache_EXPR_CONSTANT_PROD_get();
   public static final int EXPR_CONSTANT_MAX = mainJNI.ModelCache_EXPR_CONSTANT_MAX_get();
   public static final int EXPR_CONSTANT_MIN = mainJNI.ModelCache_EXPR_CONSTANT_MIN_get();
   public static final int EXPR_CONSTANT_SUM = mainJNI.ModelCache_EXPR_CONSTANT_SUM_get();
   public static final int EXPR_CONSTANT_IS_EQUAL = mainJNI.ModelCache_EXPR_CONSTANT_IS_EQUAL_get();
   public static final int EXPR_CONSTANT_IS_NOT_EQUAL = mainJNI.ModelCache_EXPR_CONSTANT_IS_NOT_EQUAL_get();
   public static final int EXPR_CONSTANT_IS_GREATER_OR_EQUAL = mainJNI.ModelCache_EXPR_CONSTANT_IS_GREATER_OR_EQUAL_get();
   public static final int EXPR_CONSTANT_IS_LESS_OR_EQUAL = mainJNI.ModelCache_EXPR_CONSTANT_IS_LESS_OR_EQUAL_get();
   public static final int EXPR_CONSTANT_EXPRESSION_MAX = mainJNI.ModelCache_EXPR_CONSTANT_EXPRESSION_MAX_get();
   public static final int VAR_CONSTANT_CONSTANT_SEMI_CONTINUOUS = mainJNI.ModelCache_VAR_CONSTANT_CONSTANT_SEMI_CONTINUOUS_get();
   public static final int VAR_CONSTANT_CONSTANT_EXPRESSION_MAX = mainJNI.ModelCache_VAR_CONSTANT_CONSTANT_EXPRESSION_MAX_get();
   public static final int VAR_CONSTANT_ARRAY_ELEMENT = mainJNI.ModelCache_VAR_CONSTANT_ARRAY_ELEMENT_get();
   public static final int VAR_CONSTANT_ARRAY_EXPRESSION_MAX = mainJNI.ModelCache_VAR_CONSTANT_ARRAY_EXPRESSION_MAX_get();
   public static final int VAR_ARRAY_CONSTANT_ARRAY_SCAL_PROD = mainJNI.ModelCache_VAR_ARRAY_CONSTANT_ARRAY_SCAL_PROD_get();
   public static final int VAR_ARRAY_CONSTANT_ARRAY_EXPRESSION_MAX = mainJNI.ModelCache_VAR_ARRAY_CONSTANT_ARRAY_EXPRESSION_MAX_get();
   public static final int VAR_ARRAY_MAX = mainJNI.ModelCache_VAR_ARRAY_MAX_get();
   public static final int VAR_ARRAY_MIN = mainJNI.ModelCache_VAR_ARRAY_MIN_get();
   public static final int VAR_ARRAY_SUM = mainJNI.ModelCache_VAR_ARRAY_SUM_get();
   public static final int VAR_ARRAY_EXPRESSION_MAX = mainJNI.ModelCache_VAR_ARRAY_EXPRESSION_MAX_get();
   public static final int VAR_ARRAY_CONSTANT_INDEX = mainJNI.ModelCache_VAR_ARRAY_CONSTANT_INDEX_get();
   public static final int VAR_ARRAY_CONSTANT_EXPRESSION_MAX = mainJNI.ModelCache_VAR_ARRAY_CONSTANT_EXPRESSION_MAX_get();

   protected ModelCache(long var1, boolean var3) {
      this.swigCMemOwn = var3;
      this.swigCPtr = var1;
   }

   protected static long getCPtr(ModelCache var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_ModelCache(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

   }

   public void clear() {
      mainJNI.ModelCache_clear(this.swigCPtr, this);
   }

   public Constraint findVoidConstraint(int var1) {
      long var2 = mainJNI.ModelCache_findVoidConstraint(this.swigCPtr, this, var1);
      return var2 == 0L ? null : new Constraint(var2, false);
   }

   public void insertVoidConstraint(Constraint var1, int var2) {
      mainJNI.ModelCache_insertVoidConstraint(this.swigCPtr, this, Constraint.getCPtr(var1), var1, var2);
   }

   public Constraint findVarConstantConstraint(IntVar var1, long var2, int var4) {
      long var5 = mainJNI.ModelCache_findVarConstantConstraint(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var4);
      return var5 == 0L ? null : new Constraint(var5, false);
   }

   public void insertVarConstantConstraint(Constraint var1, IntVar var2, long var3, int var5) {
      mainJNI.ModelCache_insertVarConstantConstraint(this.swigCPtr, this, Constraint.getCPtr(var1), var1, IntVar.getCPtr(var2), var2, var3, var5);
   }

   public Constraint findVarConstantConstantConstraint(IntVar var1, long var2, long var4, int var6) {
      long var7 = mainJNI.ModelCache_findVarConstantConstantConstraint(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var4, var6);
      return var7 == 0L ? null : new Constraint(var7, false);
   }

   public void insertVarConstantConstantConstraint(Constraint var1, IntVar var2, long var3, long var5, int var7) {
      mainJNI.ModelCache_insertVarConstantConstantConstraint(this.swigCPtr, this, Constraint.getCPtr(var1), var1, IntVar.getCPtr(var2), var2, var3, var5, var7);
   }

   public Constraint findExprExprConstraint(IntExpr var1, IntExpr var2, int var3) {
      long var4 = mainJNI.ModelCache_findExprExprConstraint(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, var3);
      return var4 == 0L ? null : new Constraint(var4, false);
   }

   public void insertExprExprConstraint(Constraint var1, IntExpr var2, IntExpr var3, int var4) {
      mainJNI.ModelCache_insertExprExprConstraint(this.swigCPtr, this, Constraint.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, IntExpr.getCPtr(var3), var3, var4);
   }

   public IntExpr findExprExpression(IntExpr var1, int var2) {
      long var3 = mainJNI.ModelCache_findExprExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public void insertExprExpression(IntExpr var1, IntExpr var2, int var3) {
      mainJNI.ModelCache_insertExprExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, var3);
   }

   public IntExpr findExprConstantExpression(IntExpr var1, long var2, int var4) {
      long var5 = mainJNI.ModelCache_findExprConstantExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var4);
      return var5 == 0L ? null : new IntExpr(var5, false);
   }

   public void insertExprConstantExpression(IntExpr var1, IntExpr var2, long var3, int var5) {
      mainJNI.ModelCache_insertExprConstantExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, var3, var5);
   }

   public IntExpr findExprExprExpression(IntExpr var1, IntExpr var2, int var3) {
      long var4 = mainJNI.ModelCache_findExprExprExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, var3);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public void insertExprExprExpression(IntExpr var1, IntExpr var2, IntExpr var3, int var4) {
      mainJNI.ModelCache_insertExprExprExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, IntExpr.getCPtr(var3), var3, var4);
   }

   public IntExpr findExprExprConstantExpression(IntExpr var1, IntExpr var2, long var3, int var5) {
      long var6 = mainJNI.ModelCache_findExprExprConstantExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, var3, var5);
      return var6 == 0L ? null : new IntExpr(var6, false);
   }

   public void insertExprExprConstantExpression(IntExpr var1, IntExpr var2, IntExpr var3, long var4, int var6) {
      mainJNI.ModelCache_insertExprExprConstantExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntExpr.getCPtr(var2), var2, IntExpr.getCPtr(var3), var3, var4, var6);
   }

   public IntExpr findVarConstantConstantExpression(IntVar var1, long var2, long var4, int var6) {
      long var7 = mainJNI.ModelCache_findVarConstantConstantExpression(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var4, var6);
      return var7 == 0L ? null : new IntExpr(var7, false);
   }

   public void insertVarConstantConstantExpression(IntExpr var1, IntVar var2, long var3, long var5, int var7) {
      mainJNI.ModelCache_insertVarConstantConstantExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntVar.getCPtr(var2), var2, var3, var5, var7);
   }

   public IntExpr findVarConstantArrayExpression(IntVar var1, long[] var2, int var3) {
      long var4 = mainJNI.ModelCache_findVarConstantArrayExpression(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var3);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public void insertVarConstantArrayExpression(IntExpr var1, IntVar var2, long[] var3, int var4) {
      mainJNI.ModelCache_insertVarConstantArrayExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, IntVar.getCPtr(var2), var2, var3, var4);
   }

   public IntExpr findVarArrayExpression(IntVar[] var1, int var2) {
      long var3 = mainJNI.ModelCache_findVarArrayExpression(this.swigCPtr, this, var1, var2);
      return var3 == 0L ? null : new IntExpr(var3, false);
   }

   public void insertVarArrayExpression(IntExpr var1, IntVar[] var2, int var3) {
      mainJNI.ModelCache_insertVarArrayExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var3);
   }

   public IntExpr findVarArrayConstantArrayExpression(IntVar[] var1, long[] var2, int var3) {
      long var4 = mainJNI.ModelCache_findVarArrayConstantArrayExpression(this.swigCPtr, this, var1, var2, var3);
      return var4 == 0L ? null : new IntExpr(var4, false);
   }

   public void insertVarArrayConstantArrayExpression(IntExpr var1, IntVar[] var2, long[] var3, int var4) {
      mainJNI.ModelCache_insertVarArrayConstantArrayExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var3, var4);
   }

   public IntExpr findVarArrayConstantExpression(IntVar[] var1, long var2, int var4) {
      long var5 = mainJNI.ModelCache_findVarArrayConstantExpression(this.swigCPtr, this, var1, var2, var4);
      return var5 == 0L ? null : new IntExpr(var5, false);
   }

   public void insertVarArrayConstantExpression(IntExpr var1, IntVar[] var2, long var3, int var5) {
      mainJNI.ModelCache_insertVarArrayConstantExpression(this.swigCPtr, this, IntExpr.getCPtr(var1), var1, var2, var3, var5);
   }

   public Solver solver() {
      long var1 = mainJNI.ModelCache_solver(this.swigCPtr, this);
      return var1 == 0L ? null : new Solver(var1, false);
   }
}
