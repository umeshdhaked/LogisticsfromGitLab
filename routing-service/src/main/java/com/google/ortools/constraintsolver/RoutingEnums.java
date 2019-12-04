package com.google.ortools.constraintsolver;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class RoutingEnums {
   static final Descriptor internal_static_operations_research_FirstSolutionStrategy_descriptor;
   static final FieldAccessorTable internal_static_operations_research_FirstSolutionStrategy_fieldAccessorTable;
   static final Descriptor internal_static_operations_research_LocalSearchMetaheuristic_descriptor;
   static final FieldAccessorTable internal_static_operations_research_LocalSearchMetaheuristic_fieldAccessorTable;
   private static FileDescriptor descriptor;

   private RoutingEnums() {
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
      String[] var0 = new String[]{"\n-ortools/constraint_solver/routing_enums.proto\u0012\u0013operations_research\"\u008c\u0003\n\u0015FirstSolutionStrategy\"ò\u0002\n\u0005Value\u0012\t\n\u0005UNSET\u0010\u0000\u0012\r\n\tAUTOMATIC\u0010\u000f\u0012\u0015\n\u0011PATH_CHEAPEST_ARC\u0010\u0003\u0012\u001d\n\u0019PATH_MOST_CONSTRAINED_ARC\u0010\u0004\u0012\u0016\n\u0012EVALUATOR_STRATEGY\u0010\u0005\u0012\u000b\n\u0007SAVINGS\u0010\n\u0012\t\n\u0005SWEEP\u0010\u000b\u0012\u0010\n\fCHRISTOFIDES\u0010\r\u0012\u0013\n\u000fALL_UNPERFORMED\u0010\u0006\u0012\u0012\n\u000eBEST_INSERTION\u0010\u0007\u0012\u001f\n\u001bPARALLEL_CHEAPEST_INSERTION\u0010\b\u0012!\n\u001dSEQUENTIAL_CHEAPEST_INSERTION\u0010\u000e\u0012\u001c\n\u0018LOCAL_CHEAPEST_INSERTION\u0010\t\u0012\u0017\n\u0013GLOBAL_CHEAPEST_ARC\u0010\u0001\u0012\u0016\n\u0012LOCAL_CHEAPEST_ARC\u0010\u0002\u0012\u001b\n\u0017FIRST_UNBOUND_MIN_VALUE\u0010\f\"®\u0001\n\u0018LocalSearchMetaheuristic\"\u0091\u0001\n\u0005Value\u0012\t\n\u0005UNSET\u0010\u0000\u0012\r\n\tAUTOMATIC\u0010\u0006\u0012\u0012\n\u000eGREEDY_DESCENT\u0010\u0001\u0012\u0017\n\u0013GUIDED_LOCAL_SEARCH\u0010\u0002\u0012\u0017\n\u0013SIMULATED_ANNEALING\u0010\u0003\u0012\u000f\n\u000bTABU_SEARCH\u0010\u0004\u0012\u0017\n\u0013GENERIC_TABU_SEARCH\u0010\u0005BI\n#com.google.ortools.constraintsolverP\u0001ª\u0002\u001fGoogle.OrTools.ConstraintSolverb\u0006proto3"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(var0, new FileDescriptor[0]);
      internal_static_operations_research_FirstSolutionStrategy_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_operations_research_FirstSolutionStrategy_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_FirstSolutionStrategy_descriptor, new String[0]);
      internal_static_operations_research_LocalSearchMetaheuristic_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_operations_research_LocalSearchMetaheuristic_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_LocalSearchMetaheuristic_descriptor, new String[0]);
   }
}
