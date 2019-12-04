package com.google.ortools.constraintsolver;

public class Assignment extends PropagationBaseObject {
   private transient long swigCPtr;

   protected Assignment(long var1, boolean var3) {
      super(mainJNI.Assignment_SWIGUpcast(var1), var3);
      this.swigCPtr = var1;
   }

   protected static long getCPtr(Assignment var0) {
      return var0 == null ? 0L : var0.swigCPtr;
   }

   protected void finalize() {
      this.delete();
   }

   public synchronized void delete() {
      if (this.swigCPtr != 0L) {
         if (this.swigCMemOwn) {
            this.swigCMemOwn = false;
            mainJNI.delete_Assignment(this.swigCPtr);
         }

         this.swigCPtr = 0L;
      }

      super.delete();
   }

   public Assignment(Solver var1) {
      this(mainJNI.new_Assignment__SWIG_0(Solver.getCPtr(var1), var1), true);
   }

   public Assignment(Assignment var1) {
      this(mainJNI.new_Assignment__SWIG_1(getCPtr(var1), var1), true);
   }

   public void clear() {
      mainJNI.Assignment_clear(this.swigCPtr, this);
   }

   public boolean empty() {
      return mainJNI.Assignment_empty(this.swigCPtr, this);
   }

   public int size() {
      return mainJNI.Assignment_size(this.swigCPtr, this);
   }

   public int numIntVars() {
      return mainJNI.Assignment_numIntVars(this.swigCPtr, this);
   }

   public int numIntervalVars() {
      return mainJNI.Assignment_numIntervalVars(this.swigCPtr, this);
   }

   public int numSequenceVars() {
      return mainJNI.Assignment_numSequenceVars(this.swigCPtr, this);
   }

   public void store() {
      mainJNI.Assignment_store(this.swigCPtr, this);
   }

   public void restore() {
      mainJNI.Assignment_restore(this.swigCPtr, this);
   }

   public boolean load(String var1) {
      return mainJNI.Assignment_load__SWIG_0(this.swigCPtr, this, var1);
   }

   public void load(SWIGTYPE_p_operations_research__AssignmentProto var1) {
      mainJNI.Assignment_load__SWIG_1(this.swigCPtr, this, SWIGTYPE_p_operations_research__AssignmentProto.getCPtr(var1));
   }

   public boolean save(String var1) {
      return mainJNI.Assignment_save__SWIG_0(this.swigCPtr, this, var1);
   }

   public void save(SWIGTYPE_p_operations_research__AssignmentProto var1) {
      mainJNI.Assignment_save__SWIG_1(this.swigCPtr, this, SWIGTYPE_p_operations_research__AssignmentProto.getCPtr(var1));
   }

   public void addObjective(IntVar var1) {
      mainJNI.Assignment_addObjective(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void ClearObjective() {
      mainJNI.Assignment_ClearObjective(this.swigCPtr, this);
   }

   public IntVar objective() {
      long var1 = mainJNI.Assignment_objective(this.swigCPtr, this);
      return var1 == 0L ? null : new IntVar(var1, false);
   }

   public boolean hasObjective() {
      return mainJNI.Assignment_hasObjective(this.swigCPtr, this);
   }

   public long objectiveMin() {
      return mainJNI.Assignment_objectiveMin(this.swigCPtr, this);
   }

   public long objectiveMax() {
      return mainJNI.Assignment_objectiveMax(this.swigCPtr, this);
   }

   public long objectiveValue() {
      return mainJNI.Assignment_objectiveValue(this.swigCPtr, this);
   }

   public boolean objectiveBound() {
      return mainJNI.Assignment_objectiveBound(this.swigCPtr, this);
   }

   public void setObjectiveMin(long var1) {
      mainJNI.Assignment_setObjectiveMin(this.swigCPtr, this, var1);
   }

   public void setObjectiveMax(long var1) {
      mainJNI.Assignment_setObjectiveMax(this.swigCPtr, this, var1);
   }

   public void setObjectiveValue(long var1) {
      mainJNI.Assignment_setObjectiveValue(this.swigCPtr, this, var1);
   }

   public void setObjectiveRange(long var1, long var3) {
      mainJNI.Assignment_setObjectiveRange(this.swigCPtr, this, var1, var3);
   }

   public IntVarElement add(IntVar var1) {
      long var2 = mainJNI.Assignment_add__SWIG_0(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntVarElement(var2, false);
   }

   public void add(IntVar[] var1) {
      mainJNI.Assignment_add__SWIG_1(this.swigCPtr, this, var1);
   }

   public IntVarElement fastAdd(IntVar var1) {
      long var2 = mainJNI.Assignment_fastAdd__SWIG_0(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntVarElement(var2, false);
   }

   public long min(IntVar var1) {
      return mainJNI.Assignment_min(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public long max(IntVar var1) {
      return mainJNI.Assignment_max(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public long value(IntVar var1) {
      return mainJNI.Assignment_value(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public boolean bound(IntVar var1) {
      return mainJNI.Assignment_bound(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void setMin(IntVar var1, long var2) {
      mainJNI.Assignment_setMin(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void setMax(IntVar var1, long var2) {
      mainJNI.Assignment_setMax(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public void setRange(IntVar var1, long var2, long var4) {
      mainJNI.Assignment_setRange(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2, var4);
   }

   public void setValue(IntVar var1, long var2) {
      mainJNI.Assignment_setValue(this.swigCPtr, this, IntVar.getCPtr(var1), var1, var2);
   }

   public IntervalVarElement add(IntervalVar var1) {
      long var2 = mainJNI.Assignment_add__SWIG_2(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntervalVarElement(var2, false);
   }

   public void add(IntervalVar[] var1) {
      mainJNI.Assignment_add__SWIG_3(this.swigCPtr, this, var1);
   }

   public IntervalVarElement fastAdd(IntervalVar var1) {
      long var2 = mainJNI.Assignment_fastAdd__SWIG_1(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new IntervalVarElement(var2, false);
   }

   public long startMin(IntervalVar var1) {
      return mainJNI.Assignment_startMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public long startMax(IntervalVar var1) {
      return mainJNI.Assignment_startMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public long startValue(IntervalVar var1) {
      return mainJNI.Assignment_startValue(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public long durationMin(IntervalVar var1) {
      return mainJNI.Assignment_durationMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public long durationMax(IntervalVar var1) {
      return mainJNI.Assignment_durationMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public long durationValue(IntervalVar var1) {
      return mainJNI.Assignment_durationValue(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public long endMin(IntervalVar var1) {
      return mainJNI.Assignment_endMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public long endMax(IntervalVar var1) {
      return mainJNI.Assignment_endMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public long endValue(IntervalVar var1) {
      return mainJNI.Assignment_endValue(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public long performedMin(IntervalVar var1) {
      return mainJNI.Assignment_performedMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public long performedMax(IntervalVar var1) {
      return mainJNI.Assignment_performedMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public long performedValue(IntervalVar var1) {
      return mainJNI.Assignment_performedValue(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public void setStartMin(IntervalVar var1, long var2) {
      mainJNI.Assignment_setStartMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setStartMax(IntervalVar var1, long var2) {
      mainJNI.Assignment_setStartMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setStartRange(IntervalVar var1, long var2, long var4) {
      mainJNI.Assignment_setStartRange(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
   }

   public void setStartValue(IntervalVar var1, long var2) {
      mainJNI.Assignment_setStartValue(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setDurationMin(IntervalVar var1, long var2) {
      mainJNI.Assignment_setDurationMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setDurationMax(IntervalVar var1, long var2) {
      mainJNI.Assignment_setDurationMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setDurationRange(IntervalVar var1, long var2, long var4) {
      mainJNI.Assignment_setDurationRange(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
   }

   public void setDurationValue(IntervalVar var1, long var2) {
      mainJNI.Assignment_setDurationValue(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setEndMin(IntervalVar var1, long var2) {
      mainJNI.Assignment_setEndMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setEndMax(IntervalVar var1, long var2) {
      mainJNI.Assignment_setEndMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setEndRange(IntervalVar var1, long var2, long var4) {
      mainJNI.Assignment_setEndRange(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
   }

   public void setEndValue(IntervalVar var1, long var2) {
      mainJNI.Assignment_setEndValue(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setPerformedMin(IntervalVar var1, long var2) {
      mainJNI.Assignment_setPerformedMin(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setPerformedMax(IntervalVar var1, long var2) {
      mainJNI.Assignment_setPerformedMax(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public void setPerformedRange(IntervalVar var1, long var2, long var4) {
      mainJNI.Assignment_setPerformedRange(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2, var4);
   }

   public void setPerformedValue(IntervalVar var1, long var2) {
      mainJNI.Assignment_setPerformedValue(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1, var2);
   }

   public SequenceVarElement add(SequenceVar var1) {
      long var2 = mainJNI.Assignment_add__SWIG_4(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new SequenceVarElement(var2, false);
   }

   public void add(SequenceVar[] var1) {
      mainJNI.Assignment_add__SWIG_5(this.swigCPtr, this, var1);
   }

   public SequenceVarElement fastAdd(SequenceVar var1) {
      long var2 = mainJNI.Assignment_fastAdd__SWIG_2(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
      return var2 == 0L ? null : new SequenceVarElement(var2, false);
   }

   public int[] forwardSequence(SequenceVar var1) {
      return mainJNI.Assignment_forwardSequence(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
   }

   public int[] backwardSequence(SequenceVar var1) {
      return mainJNI.Assignment_backwardSequence(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
   }

   public int[] unperformed(SequenceVar var1) {
      return mainJNI.Assignment_unperformed(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
   }

   public void setSequence(SequenceVar var1, int[] var2, int[] var3, int[] var4) {
      mainJNI.Assignment_setSequence(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2, var3, var4);
   }

   public void setForwardSequence(SequenceVar var1, int[] var2) {
      mainJNI.Assignment_setForwardSequence(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
   }

   public void setBackwardSequence(SequenceVar var1, int[] var2) {
      mainJNI.Assignment_setBackwardSequence(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
   }

   public void setUnperformed(SequenceVar var1, int[] var2) {
      mainJNI.Assignment_setUnperformed(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1, var2);
   }

   public void activate(IntVar var1) {
      mainJNI.Assignment_activate__SWIG_0(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void deactivate(IntVar var1) {
      mainJNI.Assignment_deactivate__SWIG_0(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public boolean activated(IntVar var1) {
      return mainJNI.Assignment_activated__SWIG_0(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public void activate(IntervalVar var1) {
      mainJNI.Assignment_activate__SWIG_1(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public void deactivate(IntervalVar var1) {
      mainJNI.Assignment_deactivate__SWIG_1(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public boolean activated(IntervalVar var1) {
      return mainJNI.Assignment_activated__SWIG_1(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public void activate(SequenceVar var1) {
      mainJNI.Assignment_activate__SWIG_2(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
   }

   public void deactivate(SequenceVar var1) {
      mainJNI.Assignment_deactivate__SWIG_2(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
   }

   public boolean activated(SequenceVar var1) {
      return mainJNI.Assignment_activated__SWIG_2(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
   }

   public void activateObjective() {
      mainJNI.Assignment_activateObjective(this.swigCPtr, this);
   }

   public void deactivateObjective() {
      mainJNI.Assignment_deactivateObjective(this.swigCPtr, this);
   }

   public boolean activatedObjective() {
      return mainJNI.Assignment_activatedObjective(this.swigCPtr, this);
   }

   public String toString() {
      return mainJNI.Assignment_toString(this.swigCPtr, this);
   }

   public boolean AreAllElementsBound() {
      return mainJNI.Assignment_AreAllElementsBound(this.swigCPtr, this);
   }

   public boolean contains(IntVar var1) {
      return mainJNI.Assignment_contains__SWIG_0(this.swigCPtr, this, IntVar.getCPtr(var1), var1);
   }

   public boolean contains(IntervalVar var1) {
      return mainJNI.Assignment_contains__SWIG_1(this.swigCPtr, this, IntervalVar.getCPtr(var1), var1);
   }

   public boolean contains(SequenceVar var1) {
      return mainJNI.Assignment_contains__SWIG_2(this.swigCPtr, this, SequenceVar.getCPtr(var1), var1);
   }

   public void copyIntersection(Assignment var1) {
      mainJNI.Assignment_copyIntersection(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public void copy(Assignment var1) {
      mainJNI.Assignment_copy(this.swigCPtr, this, getCPtr(var1), var1);
   }

   public AssignmentIntContainer intVarContainer() {
      return new AssignmentIntContainer(mainJNI.Assignment_intVarContainer(this.swigCPtr, this), false);
   }

   public AssignmentIntContainer mutableIntVarContainer() {
      long var1 = mainJNI.Assignment_mutableIntVarContainer(this.swigCPtr, this);
      return var1 == 0L ? null : new AssignmentIntContainer(var1, false);
   }

   public AssignmentIntervalContainer intervalVarContainer() {
      return new AssignmentIntervalContainer(mainJNI.Assignment_intervalVarContainer(this.swigCPtr, this), false);
   }

   public AssignmentIntervalContainer mutableIntervalVarContainer() {
      long var1 = mainJNI.Assignment_mutableIntervalVarContainer(this.swigCPtr, this);
      return var1 == 0L ? null : new AssignmentIntervalContainer(var1, false);
   }

   public AssignmentSequenceContainer sequenceVarContainer() {
      return new AssignmentSequenceContainer(mainJNI.Assignment_sequenceVarContainer(this.swigCPtr, this), false);
   }

   public AssignmentSequenceContainer mutableSequenceVarContainer() {
      long var1 = mainJNI.Assignment_mutableSequenceVarContainer(this.swigCPtr, this);
      return var1 == 0L ? null : new AssignmentSequenceContainer(var1, false);
   }
}
