package com.google.ortools.constraintsolver;

import com.google.ortools.util.OptionalBooleanOuterClass;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class RoutingParameters {
   static final Descriptor internal_static_operations_research_RoutingSearchParameters_descriptor;
   static final FieldAccessorTable internal_static_operations_research_RoutingSearchParameters_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_RoutingSearchParameters_LocalSearchNeighborhoodOperators_descriptor;
   static final FieldAccessorTable internal_static_operations_research_RoutingSearchParameters_LocalSearchNeighborhoodOperators_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_RoutingModelParameters_descriptor;
   static final FieldAccessorTable internal_static_operations_research_RoutingModelParameters_fieldAccessorTable;
   private static FileDescriptor descriptor;

   private RoutingParameters() {
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
      String[] var0 = new String[]{"\n2ortools/constraint_solver/routing_parameters.proto\u0012\u0013operations_research\u001a\u001egoogle/protobuf/duration.proto\u001a-ortools/constraint_solver/routing_enums.proto\u001a1ortools/constraint_solver/solver_parameters.proto\u001a#ortools/util/optional_boolean.proto\"Õ\u0016\n\u0017RoutingSearchParameters\u0012Q\n\u0017first_solution_strategy\u0018\u0001 \u0001(\u000e20.operations_research.FirstSolutionStrategy.Value\u0012.\n&use_unfiltered_first_solution_strategy\u0018\u0002 \u0001(\b\u0012\u001f\n\u0017savings_neighbors_ratio\u0018\u000e \u0001(\u0001\u0012&\n\u001esavings_max_memory_usage_bytes\u0018\u0017 \u0001(\u0001\u0012 \n\u0018savings_add_reverse_arcs\u0018\u000f \u0001(\b\u0012\u001f\n\u0017savings_arc_coefficient\u0018\u0012 \u0001(\u0001\u0012\u001f\n\u0017savings_parallel_routes\u0018\u0013 \u0001(\b\u0012/\n'cheapest_insertion_farthest_seeds_ratio\u0018\u0010 \u0001(\u0001\u0012*\n\"cheapest_insertion_neighbors_ratio\u0018\u0015 \u0001(\u0001\u0012m\n\u0016local_search_operators\u0018\u0003 \u0001(\u000b2M.operations_research.RoutingSearchParameters.LocalSearchNeighborhoodOperators\u00125\n-relocate_expensive_chain_num_arcs_to_consider\u0018\u0014 \u0001(\u0005\u0012W\n\u001alocal_search_metaheuristic\u0018\u0004 \u0001(\u000e23.operations_research.LocalSearchMetaheuristic.Value\u0012.\n&guided_local_search_lambda_coefficient\u0018\u0005 \u0001(\u0001\u0012\u001e\n\u0016use_depth_first_search\u0018\u0006 \u0001(\b\u00124\n\u0006use_cp\u0018\u001c \u0001(\u000e2$.operations_research.OptionalBoolean\u00128\n\nuse_cp_sat\u0018\u001b \u0001(\u000e2$.operations_research.OptionalBoolean\u0012\u0019\n\u0011optimization_step\u0018\u0007 \u0001(\u0001\u0012&\n\u001enumber_of_solutions_to_collect\u0018\u0011 \u0001(\u0005\u0012\u0016\n\u000esolution_limit\u0018\b \u0001(\u0003\u0012-\n\ntime_limit\u0018\t \u0001(\u000b2\u0019.google.protobuf.Duration\u00121\n\u000elns_time_limit\u0018\n \u0001(\u000b2\u0019.google.protobuf.Duration\u0012\u001c\n\u0014use_full_propagation\u0018\u000b \u0001(\b\u0012\u0012\n\nlog_search\u0018\r \u0001(\b\u0012\u001f\n\u0017log_cost_scaling_factor\u0018\u0016 \u0001(\u0001\u0012\u0017\n\u000flog_cost_offset\u0018\u001d \u0001(\u0001\u001aÄ\r\n LocalSearchNeighborhoodOperators\u0012:\n\fuse_relocate\u0018\u0001 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012?\n\u0011use_relocate_pair\u0018\u0002 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012E\n\u0017use_light_relocate_pair\u0018\u0018 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012D\n\u0016use_relocate_neighbors\u0018\u0003 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012B\n\u0014use_relocate_subtrip\u0018\u0019 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012:\n\fuse_exchange\u0018\u0004 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012?\n\u0011use_exchange_pair\u0018\u0016 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012B\n\u0014use_exchange_subtrip\u0018\u001a \u0001(\u000e2$.operations_research.OptionalBoolean\u00127\n\tuse_cross\u0018\u0005 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012@\n\u0012use_cross_exchange\u0018\u0006 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012J\n\u001cuse_relocate_expensive_chain\u0018\u0017 \u0001(\u000e2$.operations_research.OptionalBoolean\u00129\n\u000buse_two_opt\u0018\u0007 \u0001(\u000e2$.operations_research.OptionalBoolean\u00128\n\nuse_or_opt\u0018\b \u0001(\u000e2$.operations_research.OptionalBoolean\u0012?\n\u0011use_lin_kernighan\u0018\t \u0001(\u000e2$.operations_research.OptionalBoolean\u00129\n\u000buse_tsp_opt\u0018\n \u0001(\u000e2$.operations_research.OptionalBoolean\u0012=\n\u000fuse_make_active\u0018\u000b \u0001(\u000e2$.operations_research.OptionalBoolean\u0012J\n\u001cuse_relocate_and_make_active\u0018\u0015 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012?\n\u0011use_make_inactive\u0018\f \u0001(\u000e2$.operations_research.OptionalBoolean\u0012E\n\u0017use_make_chain_inactive\u0018\r \u0001(\u000e2$.operations_research.OptionalBoolean\u0012=\n\u000fuse_swap_active\u0018\u000e \u0001(\u000e2$.operations_research.OptionalBoolean\u0012F\n\u0018use_extended_swap_active\u0018\u000f \u0001(\u000e2$.operations_research.OptionalBoolean\u0012G\n\u0019use_node_pair_swap_active\u0018\u0014 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012:\n\fuse_path_lns\u0018\u0010 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012?\n\u0011use_full_path_lns\u0018\u0011 \u0001(\u000e2$.operations_research.OptionalBoolean\u00129\n\u000buse_tsp_lns\u0018\u0012 \u0001(\u000e2$.operations_research.OptionalBoolean\u0012>\n\u0010use_inactive_lns\u0018\u0013 \u0001(\u000e2$.operations_research.OptionalBoolean\"¨\u0001\n\u0016RoutingModelParameters\u0012J\n\u0011solver_parameters\u0018\u0001 \u0001(\u000b2/.operations_research.ConstraintSolverParameters\u0012!\n\u0019reduce_vehicle_cost_model\u0018\u0002 \u0001(\b\u0012\u001f\n\u0017max_callback_cache_size\u0018\u0003 \u0001(\u0005BI\n#com.google.ortools.constraintsolverP\u0001ª\u0002\u001fGoogle.OrTools.ConstraintSolverb\u0006proto3"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(var0, new FileDescriptor[]{DurationProto.getDescriptor(), RoutingEnums.getDescriptor(), SolverParameters.getDescriptor(), OptionalBooleanOuterClass.getDescriptor()});
      internal_static_operations_research_RoutingSearchParameters_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_operations_research_RoutingSearchParameters_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_RoutingSearchParameters_descriptor, new String[]{"FirstSolutionStrategy", "UseUnfilteredFirstSolutionStrategy", "SavingsNeighborsRatio", "SavingsMaxMemoryUsageBytes", "SavingsAddReverseArcs", "SavingsArcCoefficient", "SavingsParallelRoutes", "CheapestInsertionFarthestSeedsRatio", "CheapestInsertionNeighborsRatio", "LocalSearchOperators", "RelocateExpensiveChainNumArcsToConsider", "LocalSearchMetaheuristic", "GuidedLocalSearchLambdaCoefficient", "UseDepthFirstSearch", "UseCp", "UseCpSat", "OptimizationStep", "NumberOfSolutionsToCollect", "SolutionLimit", "TimeLimit", "LnsTimeLimit", "UseFullPropagation", "LogSearch", "LogCostScalingFactor", "LogCostOffset"});
      internal_static_operations_research_RoutingSearchParameters_LocalSearchNeighborhoodOperators_descriptor = (Descriptor)internal_static_operations_research_RoutingSearchParameters_descriptor.getNestedTypes().get(0);
      internal_static_operations_research_RoutingSearchParameters_LocalSearchNeighborhoodOperators_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_RoutingSearchParameters_LocalSearchNeighborhoodOperators_descriptor, new String[]{"UseRelocate", "UseRelocatePair", "UseLightRelocatePair", "UseRelocateNeighbors", "UseRelocateSubtrip", "UseExchange", "UseExchangePair", "UseExchangeSubtrip", "UseCross", "UseCrossExchange", "UseRelocateExpensiveChain", "UseTwoOpt", "UseOrOpt", "UseLinKernighan", "UseTspOpt", "UseMakeActive", "UseRelocateAndMakeActive", "UseMakeInactive", "UseMakeChainInactive", "UseSwapActive", "UseExtendedSwapActive", "UseNodePairSwapActive", "UsePathLns", "UseFullPathLns", "UseTspLns", "UseInactiveLns"});
      internal_static_operations_research_RoutingModelParameters_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_operations_research_RoutingModelParameters_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_RoutingModelParameters_descriptor, new String[]{"SolverParameters", "ReduceVehicleCostModel", "MaxCallbackCacheSize"});
      DurationProto.getDescriptor();
      RoutingEnums.getDescriptor();
      SolverParameters.getDescriptor();
      OptionalBooleanOuterClass.getDescriptor();
   }
}
