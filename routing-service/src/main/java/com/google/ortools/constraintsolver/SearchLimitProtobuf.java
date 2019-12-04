package com.google.ortools.constraintsolver;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;

public final class SearchLimitProtobuf {
   static final Descriptor internal_static_operations_research_RegularLimitParameters_descriptor;
   static final FieldAccessorTable internal_static_operations_research_RegularLimitParameters_fieldAccessorTable;
   private static FileDescriptor descriptor;

   private SearchLimitProtobuf() {
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
      String[] var0 = new String[]{"\n,ortools/constraint_solver/search_limit.proto\u0012\u0013operations_research\"\u008b\u0001\n\u0016RegularLimitParameters\u0012\f\n\u0004time\u0018\u0001 \u0001(\u0003\u0012\u0010\n\bbranches\u0018\u0002 \u0001(\u0003\u0012\u0010\n\bfailures\u0018\u0003 \u0001(\u0003\u0012\u0011\n\tsolutions\u0018\u0004 \u0001(\u0003\u0012\u0018\n\u0010smart_time_check\u0018\u0005 \u0001(\b\u0012\u0012\n\ncumulative\u0018\u0006 \u0001(\bB^\n#com.google.ortools.constraintsolverB\u0013SearchLimitProtobufP\u0001ª\u0002\u001fGoogle.OrTools.ConstraintSolverb\u0006proto3"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(var0, new FileDescriptor[0]);
      internal_static_operations_research_RegularLimitParameters_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_operations_research_RegularLimitParameters_fieldAccessorTable = new FieldAccessorTable(internal_static_operations_research_RegularLimitParameters_descriptor, new String[]{"Time", "Branches", "Failures", "Solutions", "SmartTimeCheck", "Cumulative"});
   }
}
