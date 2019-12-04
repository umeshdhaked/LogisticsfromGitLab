package com.google.ortools.constraintsolver;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SolverParameters {
   static final Descriptor internal_static_operations_research_ConstraintSolverParameters_descriptor;
   static final FieldAccessorTable internal_static_operations_research_ConstraintSolverParameters_fieldAccessorTable;
   private static FileDescriptor descriptor;

   private SolverParameters() {
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
      String[] var0 = new String[]{"\n1ortools/constraint_solver/solver_parameters.proto\u0012\u0013operations_research\"Í\u0007\n\u001aConstraintSolverParameters\u0012X\n\u000ecompress_trail\u0018\u0001 \u0001(\u000e2@.operations_research.ConstraintSolverParameters.TrailCompression\u0012\u0018\n\u0010trail_block_size\u0018\u0002 \u0001(\u0005\u0012\u0018\n\u0010array_split_size\u0018\u0003 \u0001(\u0005\u0012\u0013\n\u000bstore_names\u0018\u0004 \u0001(\b\u0012\u001b\n\u0013name_cast_variables\u0018\u0005 \u0001(\b\u0012\u001a\n\u0012name_all_variables\u0018\u0006 \u0001(\b\u0012\u001b\n\u0013profile_propagation\u0018\u0007 \u0001(\b\u0012\u0014\n\fprofile_file\u0018\b \u0001(\t\u0012\u001c\n\u0014profile_local_search\u0018\u0010 \u0001(\b\u0012\"\n\u001aprint_local_search_profile\u0018\u0011 \u0001(\b\u0012\u0019\n\u0011trace_propagation\u0018\t \u0001(\b\u0012\u0014\n\ftrace_search\u0018\n \u0001(\b\u0012\u0013\n\u000bprint_model\u0018\u000b \u0001(\b\u0012\u0019\n\u0011print_model_stats\u0018\f \u0001(\b\u0012\u001f\n\u0017print_added_constraints\u0018\r \u0001(\b\u0012\u0015\n\rdisable_solve\u0018\u000f \u0001(\b\u0012\u0017\n\u000fuse_small_table\u0018e \u0001(\b\u0012\"\n\u001ause_cumulative_edge_finder\u0018i \u0001(\b\u0012!\n\u0019use_cumulative_time_table\u0018j \u0001(\b\u0012&\n\u001euse_cumulative_time_table_sync\u0018p \u0001(\b\u0012&\n\u001euse_sequence_high_demand_tasks\u0018k \u0001(\b\u0012%\n\u001duse_all_possible_disjunctions\u0018l \u0001(\b\u0012\u001c\n\u0014max_edge_finder_size\u0018m \u0001(\u0005\u0012\u001c\n\u0014diffn_use_cumulative\u0018n \u0001(\b\u0012\u0017\n\u000fuse_element_rmq\u0018o \u0001(\b\u0012\"\n\u001askip_locally_optimal_paths\u0018q \u0001(\b\u0012\u001d\n\u0015check_solution_period\u0018r \u0001(\u0005\">\n\u0010TrailCompression\u0012\u0012\n\u000eNO_COMPRESSION\u0010\u0000\u0012\u0016\n\u0012COMPRESS_WITH_ZLIB\u0010\u0001J\u0004\bd\u0010eJ\u0004\bf\u0010gJ\u0004\bg\u0010hJ\u0004\bh\u0010iBI\n#com.google.ortools.constraintsolverP\u0001ª\u0002\u001fGoogle.OrTools.ConstraintSolverb\u0006proto3"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(var0, new FileDescriptor[0]);
      internal_static_operations_research_ConstraintSolverParameters_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_operations_research_ConstraintSolverParameters_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_ConstraintSolverParameters_descriptor, new String[]{"CompressTrail", "TrailBlockSize", "ArraySplitSize", "StoreNames", "NameCastVariables", "NameAllVariables", "ProfilePropagation", "ProfileFile", "ProfileLocalSearch", "PrintLocalSearchProfile", "TracePropagation", "TraceSearch", "PrintModel", "PrintModelStats", "PrintAddedConstraints", "DisableSolve", "UseSmallTable", "UseCumulativeEdgeFinder", "UseCumulativeTimeTable", "UseCumulativeTimeTableSync", "UseSequenceHighDemandTasks", "UseAllPossibleDisjunctions", "MaxEdgeFinderSize", "DiffnUseCumulative", "UseElementRmq", "SkipLocallyOptimalPaths", "CheckSolutionPeriod"});
   }
}
