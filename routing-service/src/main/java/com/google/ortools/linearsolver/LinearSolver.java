package com.google.ortools.linearsolver;

import com.google.ortools.util.OptionalBooleanOuterClass;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class LinearSolver {
   static final Descriptor internal_static_operations_research_MPVariableProto_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPVariableProto_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPConstraintProto_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPConstraintProto_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPGeneralConstraintProto_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPGeneralConstraintProto_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPIndicatorConstraint_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPIndicatorConstraint_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPSosConstraint_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPSosConstraint_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPQuadraticConstraint_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPQuadraticConstraint_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPAbsConstraint_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPAbsConstraint_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPArrayConstraint_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPArrayConstraint_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPArrayWithConstantConstraint_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPArrayWithConstantConstraint_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPQuadraticObjective_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPQuadraticObjective_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_PartialVariableAssignment_descriptor;
   static final FieldAccessorTable internal_static_operations_research_PartialVariableAssignment_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPModelProto_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPModelProto_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_OptionalDouble_descriptor;
   static final FieldAccessorTable internal_static_operations_research_OptionalDouble_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPSolverCommonParameters_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPSolverCommonParameters_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPModelDeltaProto_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPModelDeltaProto_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPModelDeltaProto_VariableOverridesEntry_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPModelDeltaProto_VariableOverridesEntry_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPModelDeltaProto_ConstraintOverridesEntry_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPModelDeltaProto_ConstraintOverridesEntry_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPModelRequest_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPModelRequest_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_MPSolutionResponse_descriptor;
   static final FieldAccessorTable internal_static_operations_research_MPSolutionResponse_fieldAccessorTable;
   private static FileDescriptor descriptor;

   private LinearSolver() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{"\n)ortools/linear_solver/linear_solver.proto\u0012\u0013operations_research\u001a#ortools/util/optional_boolean.proto\"²\u0001\n\u000fMPVariableProto\u0012\u0019\n\u000blower_bound\u0018\u0001 \u0001(\u0001:\u0004-inf\u0012\u0018\n\u000bupper_bound\u0018\u0002 \u0001(\u0001:\u0003inf\u0012 \n\u0015objective_coefficient\u0018\u0003 \u0001(\u0001:\u00010\u0012\u0019\n\nis_integer\u0018\u0004 \u0001(\b:\u0005false\u0012\u000e\n\u0004name\u0018\u0005 \u0001(\t:\u0000\u0012\u001d\n\u0012branching_priority\u0018\u0006 \u0001(\u0005:\u00010\" \u0001\n\u0011MPConstraintProto\u0012\u0015\n\tvar_index\u0018\u0006 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0017\n\u000bcoefficient\u0018\u0007 \u0003(\u0001B\u0002\u0010\u0001\u0012\u0019\n\u000blower_bound\u0018\u0002 \u0001(\u0001:\u0004-inf\u0012\u0018\n\u000bupper_bound\u0018\u0003 \u0001(\u0001:\u0003inf\u0012\u000e\n\u0004name\u0018\u0004 \u0001(\t:\u0000\u0012\u0016\n\u0007is_lazy\u0018\u0005 \u0001(\b:\u0005false\"÷\u0004\n\u0018MPGeneralConstraintProto\u0012\u000e\n\u0004name\u0018\u0001 \u0001(\t:\u0000\u0012J\n\u0014indicator_constraint\u0018\u0002 \u0001(\u000b2*.operations_research.MPIndicatorConstraintH\u0000\u0012>\n\u000esos_constraint\u0018\u0003 \u0001(\u000b2$.operations_research.MPSosConstraintH\u0000\u0012J\n\u0014quadratic_constraint\u0018\u0004 \u0001(\u000b2*.operations_research.MPQuadraticConstraintH\u0000\u0012>\n\u000eabs_constraint\u0018\u0005 \u0001(\u000b2$.operations_research.MPAbsConstraintH\u0000\u0012@\n\u000eand_constraint\u0018\u0006 \u0001(\u000b2&.operations_research.MPArrayConstraintH\u0000\u0012?\n\ror_constraint\u0018\u0007 \u0001(\u000b2&.operations_research.MPArrayConstraintH\u0000\u0012L\n\u000emin_constraint\u0018\b \u0001(\u000b22.operations_research.MPArrayWithConstantConstraintH\u0000\u0012L\n\u000emax_constraint\u0018\t \u0001(\u000b22.operations_research.MPArrayWithConstantConstraintH\u0000B\u0014\n\u0012general_constraint\"y\n\u0015MPIndicatorConstraint\u0012\u0011\n\tvar_index\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tvar_value\u0018\u0002 \u0001(\u0005\u0012:\n\nconstraint\u0018\u0003 \u0001(\u000b2&.operations_research.MPConstraintProto\"\u009f\u0001\n\u000fMPSosConstraint\u0012E\n\u0004type\u0018\u0001 \u0001(\u000e2).operations_research.MPSosConstraint.Type:\fSOS1_DEFAULT\u0012\u0011\n\tvar_index\u0018\u0002 \u0003(\u0005\u0012\u000e\n\u0006weight\u0018\u0003 \u0003(\u0001\"\"\n\u0004Type\u0012\u0010\n\fSOS1_DEFAULT\u0010\u0000\u0012\b\n\u0004SOS2\u0010\u0001\"´\u0001\n\u0015MPQuadraticConstraint\u0012\u0011\n\tvar_index\u0018\u0001 \u0003(\u0005\u0012\u0013\n\u000bcoefficient\u0018\u0002 \u0003(\u0001\u0012\u0013\n\u000bqvar1_index\u0018\u0003 \u0003(\u0005\u0012\u0013\n\u000bqvar2_index\u0018\u0004 \u0003(\u0005\u0012\u0014\n\fqcoefficient\u0018\u0005 \u0003(\u0001\u0012\u0019\n\u000blower_bound\u0018\u0006 \u0001(\u0001:\u0004-inf\u0012\u0018\n\u000bupper_bound\u0018\u0007 \u0001(\u0001:\u0003inf\"A\n\u000fMPAbsConstraint\u0012\u0011\n\tvar_index\u0018\u0001 \u0001(\u0005\u0012\u001b\n\u0013resultant_var_index\u0018\u0002 \u0001(\u0005\"C\n\u0011MPArrayConstraint\u0012\u0011\n\tvar_index\u0018\u0001 \u0003(\u0005\u0012\u001b\n\u0013resultant_var_index\u0018\u0002 \u0001(\u0005\"a\n\u001dMPArrayWithConstantConstraint\u0012\u0011\n\tvar_index\u0018\u0001 \u0003(\u0005\u0012\u0010\n\bconstant\u0018\u0002 \u0001(\u0001\u0012\u001b\n\u0013resultant_var_index\u0018\u0003 \u0001(\u0005\"U\n\u0014MPQuadraticObjective\u0012\u0013\n\u000bqvar1_index\u0018\u0001 \u0003(\u0005\u0012\u0013\n\u000bqvar2_index\u0018\u0002 \u0003(\u0005\u0012\u0013\n\u000bcoefficient\u0018\u0003 \u0003(\u0001\"I\n\u0019PartialVariableAssignment\u0012\u0015\n\tvar_index\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0015\n\tvar_value\u0018\u0002 \u0003(\u0001B\u0002\u0010\u0001\"¢\u0003\n\fMPModelProto\u00126\n\bvariable\u0018\u0003 \u0003(\u000b2$.operations_research.MPVariableProto\u0012:\n\nconstraint\u0018\u0004 \u0003(\u000b2&.operations_research.MPConstraintProto\u0012I\n\u0012general_constraint\u0018\u0007 \u0003(\u000b2-.operations_research.MPGeneralConstraintProto\u0012\u0017\n\bmaximize\u0018\u0001 \u0001(\b:\u0005false\u0012\u001b\n\u0010objective_offset\u0018\u0002 \u0001(\u0001:\u00010\u0012F\n\u0013quadratic_objective\u0018\b \u0001(\u000b2).operations_research.MPQuadraticObjective\u0012\u000e\n\u0004name\u0018\u0005 \u0001(\t:\u0000\u0012E\n\rsolution_hint\u0018\u0006 \u0001(\u000b2..operations_research.PartialVariableAssignment\"\u001f\n\u000eOptionalDouble\u0012\r\n\u0005value\u0018\u0001 \u0001(\u0001\"½\u0004\n\u0018MPSolverCommonParameters\u0012=\n\u0010relative_mip_gap\u0018\u0001 \u0001(\u000b2#.operations_research.OptionalDouble\u0012=\n\u0010primal_tolerance\u0018\u0002 \u0001(\u000b2#.operations_research.OptionalDouble\u0012;\n\u000edual_tolerance\u0018\u0003 \u0001(\u000b2#.operations_research.OptionalDouble\u0012j\n\flp_algorithm\u0018\u0004 \u0001(\u000e2?.operations_research.MPSolverCommonParameters.LPAlgorithmValues:\u0013LP_ALGO_UNSPECIFIED\u0012H\n\bpresolve\u0018\u0005 \u0001(\u000e2$.operations_research.OptionalBoolean:\u0010BOOL_UNSPECIFIED\u0012G\n\u0007scaling\u0018\u0007 \u0001(\u000e2$.operations_research.OptionalBoolean:\u0010BOOL_UNSPECIFIED\"g\n\u0011LPAlgorithmValues\u0012\u0017\n\u0013LP_ALGO_UNSPECIFIED\u0010\u0000\u0012\u0010\n\fLP_ALGO_DUAL\u0010\u0001\u0012\u0012\n\u000eLP_ALGO_PRIMAL\u0010\u0002\u0012\u0013\n\u000fLP_ALGO_BARRIER\u0010\u0003\"³\u0003\n\u0011MPModelDeltaProto\u0012 \n\u0018baseline_model_file_path\u0018\u0001 \u0001(\t\u0012Y\n\u0012variable_overrides\u0018\u0002 \u0003(\u000b2=.operations_research.MPModelDeltaProto.VariableOverridesEntry\u0012]\n\u0014constraint_overrides\u0018\u0003 \u0003(\u000b2?.operations_research.MPModelDeltaProto.ConstraintOverridesEntry\u001a^\n\u0016VariableOverridesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u00123\n\u0005value\u0018\u0002 \u0001(\u000b2$.operations_research.MPVariableProto:\u00028\u0001\u001ab\n\u0018ConstraintOverridesEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u00125\n\u0005value\u0018\u0002 \u0001(\u000b2&.operations_research.MPConstraintProto:\u00028\u0001\"¸\u0006\n\u000eMPModelRequest\u00120\n\u0005model\u0018\u0001 \u0001(\u000b2!.operations_research.MPModelProto\u0012C\n\u000bsolver_type\u0018\u0002 \u0001(\u000e2..operations_research.MPModelRequest.SolverType\u0012!\n\u0019solver_time_limit_seconds\u0018\u0003 \u0001(\u0001\u0012,\n\u001denable_internal_solver_output\u0018\u0004 \u0001(\b:\u0005false\u0012\"\n\u001asolver_specific_parameters\u0018\u0005 \u0001(\t\u0012;\n\u000bmodel_delta\u0018\b \u0001(\u000b2&.operations_research.MPModelDeltaProto\"ü\u0003\n\nSolverType\u0012\u001b\n\u0017GLOP_LINEAR_PROGRAMMING\u0010\u0002\u0012\u001a\n\u0016CLP_LINEAR_PROGRAMMING\u0010\u0000\u0012\u001b\n\u0017GLPK_LINEAR_PROGRAMMING\u0010\u0001\u0012\u001d\n\u0019GUROBI_LINEAR_PROGRAMMING\u0010\u0006\u0012\u001d\n\u0019XPRESS_LINEAR_PROGRAMMING\u0010e\u0012\u001c\n\u0018CPLEX_LINEAR_PROGRAMMING\u0010\n\u0012\"\n\u001eSCIP_MIXED_INTEGER_PROGRAMMING\u0010\u0003\u0012\"\n\u001eGLPK_MIXED_INTEGER_PROGRAMMING\u0010\u0004\u0012!\n\u001dCBC_MIXED_INTEGER_PROGRAMMING\u0010\u0005\u0012$\n GUROBI_MIXED_INTEGER_PROGRAMMING\u0010\u0007\u0012$\n XPRESS_MIXED_INTEGER_PROGRAMMING\u0010f\u0012#\n\u001fCPLEX_MIXED_INTEGER_PROGRAMMING\u0010\u000b\u0012\u001b\n\u0017BOP_INTEGER_PROGRAMMING\u0010\f\u0012\u001b\n\u0017SAT_INTEGER_PROGRAMMING\u0010\u000e\u0012&\n\"KNAPSACK_MIXED_INTEGER_PROGRAMMING\u0010\r\"\u0083\u0002\n\u0012MPSolutionResponse\u0012T\n\u0006status\u0018\u0001 \u0001(\u000e2+.operations_research.MPSolverResponseStatus:\u0017MPSOLVER_UNKNOWN_STATUS\u0012\u0012\n\nstatus_str\u0018\u0007 \u0001(\t\u0012\u0017\n\u000fobjective_value\u0018\u0002 \u0001(\u0001\u0012\u001c\n\u0014best_objective_bound\u0018\u0005 \u0001(\u0001\u0012\u001a\n\u000evariable_value\u0018\u0003 \u0003(\u0001B\u0002\u0010\u0001\u0012\u0016\n\ndual_value\u0018\u0004 \u0003(\u0001B\u0002\u0010\u0001\u0012\u0018\n\freduced_cost\u0018\u0006 \u0003(\u0001B\u0002\u0010\u0001*ú\u0002\n\u0016MPSolverResponseStatus\u0012\u0014\n\u0010MPSOLVER_OPTIMAL\u0010\u0000\u0012\u0015\n\u0011MPSOLVER_FEASIBLE\u0010\u0001\u0012\u0017\n\u0013MPSOLVER_INFEASIBLE\u0010\u0002\u0012\u0016\n\u0012MPSOLVER_UNBOUNDED\u0010\u0003\u0012\u0015\n\u0011MPSOLVER_ABNORMAL\u0010\u0004\u0012\u0017\n\u0013MPSOLVER_NOT_SOLVED\u0010\u0006\u0012\u001b\n\u0017MPSOLVER_MODEL_IS_VALID\u0010a\u0012\u001b\n\u0017MPSOLVER_UNKNOWN_STATUS\u0010c\u0012\u001a\n\u0016MPSOLVER_MODEL_INVALID\u0010\u0005\u0012(\n$MPSOLVER_MODEL_INVALID_SOLUTION_HINT\u0010T\u0012,\n(MPSOLVER_MODEL_INVALID_SOLVER_PARAMETERS\u0010U\u0012$\n MPSOLVER_SOLVER_TYPE_UNAVAILABLE\u0010\u0007B#\n\u001fcom.google.ortools.linearsolverP\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(var0, new FileDescriptor[]{OptionalBooleanOuterClass.getDescriptor()});
      internal_static_operations_research_MPVariableProto_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_operations_research_MPVariableProto_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPVariableProto_descriptor, new String[]{"LowerBound", "UpperBound", "ObjectiveCoefficient", "IsInteger", "Name", "BranchingPriority"});
      internal_static_operations_research_MPConstraintProto_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_operations_research_MPConstraintProto_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPConstraintProto_descriptor, new String[]{"VarIndex", "Coefficient", "LowerBound", "UpperBound", "Name", "IsLazy"});
      internal_static_operations_research_MPGeneralConstraintProto_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_operations_research_MPGeneralConstraintProto_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPGeneralConstraintProto_descriptor, new String[]{"Name", "IndicatorConstraint", "SosConstraint", "QuadraticConstraint", "AbsConstraint", "AndConstraint", "OrConstraint", "MinConstraint", "MaxConstraint", "GeneralConstraint"});
      internal_static_operations_research_MPIndicatorConstraint_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_operations_research_MPIndicatorConstraint_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPIndicatorConstraint_descriptor, new String[]{"VarIndex", "VarValue", "Constraint"});
      internal_static_operations_research_MPSosConstraint_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_operations_research_MPSosConstraint_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPSosConstraint_descriptor, new String[]{"Type", "VarIndex", "Weight"});
      internal_static_operations_research_MPQuadraticConstraint_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_operations_research_MPQuadraticConstraint_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPQuadraticConstraint_descriptor, new String[]{"VarIndex", "Coefficient", "Qvar1Index", "Qvar2Index", "Qcoefficient", "LowerBound", "UpperBound"});
      internal_static_operations_research_MPAbsConstraint_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_operations_research_MPAbsConstraint_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPAbsConstraint_descriptor, new String[]{"VarIndex", "ResultantVarIndex"});
      internal_static_operations_research_MPArrayConstraint_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_operations_research_MPArrayConstraint_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPArrayConstraint_descriptor, new String[]{"VarIndex", "ResultantVarIndex"});
      internal_static_operations_research_MPArrayWithConstantConstraint_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_operations_research_MPArrayWithConstantConstraint_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPArrayWithConstantConstraint_descriptor, new String[]{"VarIndex", "Constant", "ResultantVarIndex"});
      internal_static_operations_research_MPQuadraticObjective_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_operations_research_MPQuadraticObjective_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPQuadraticObjective_descriptor, new String[]{"Qvar1Index", "Qvar2Index", "Coefficient"});
      internal_static_operations_research_PartialVariableAssignment_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_operations_research_PartialVariableAssignment_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_PartialVariableAssignment_descriptor, new String[]{"VarIndex", "VarValue"});
      internal_static_operations_research_MPModelProto_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_operations_research_MPModelProto_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPModelProto_descriptor, new String[]{"Variable", "Constraint", "GeneralConstraint", "Maximize", "ObjectiveOffset", "QuadraticObjective", "Name", "SolutionHint"});
      internal_static_operations_research_OptionalDouble_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_operations_research_OptionalDouble_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_OptionalDouble_descriptor, new String[]{"Value"});
      internal_static_operations_research_MPSolverCommonParameters_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_operations_research_MPSolverCommonParameters_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPSolverCommonParameters_descriptor, new String[]{"RelativeMipGap", "PrimalTolerance", "DualTolerance", "LpAlgorithm", "Presolve", "Scaling"});
      internal_static_operations_research_MPModelDeltaProto_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_operations_research_MPModelDeltaProto_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPModelDeltaProto_descriptor, new String[]{"BaselineModelFilePath", "VariableOverrides", "ConstraintOverrides"});
      internal_static_operations_research_MPModelDeltaProto_VariableOverridesEntry_descriptor = (Descriptor)internal_static_operations_research_MPModelDeltaProto_descriptor.getNestedTypes().get(0);
      internal_static_operations_research_MPModelDeltaProto_VariableOverridesEntry_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPModelDeltaProto_VariableOverridesEntry_descriptor, new String[]{"Key", "Value"});
      internal_static_operations_research_MPModelDeltaProto_ConstraintOverridesEntry_descriptor = (Descriptor)internal_static_operations_research_MPModelDeltaProto_descriptor.getNestedTypes().get(1);
      internal_static_operations_research_MPModelDeltaProto_ConstraintOverridesEntry_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPModelDeltaProto_ConstraintOverridesEntry_descriptor, new String[]{"Key", "Value"});
      internal_static_operations_research_MPModelRequest_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_operations_research_MPModelRequest_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPModelRequest_descriptor, new String[]{"Model", "SolverType", "SolverTimeLimitSeconds", "EnableInternalSolverOutput", "SolverSpecificParameters", "ModelDelta"});
      internal_static_operations_research_MPSolutionResponse_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_operations_research_MPSolutionResponse_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_MPSolutionResponse_descriptor, new String[]{"Status", "StatusStr", "ObjectiveValue", "BestObjectiveBound", "VariableValue", "DualValue", "ReducedCost"});
      OptionalBooleanOuterClass.getDescriptor();
   }
}
