package com.google.ortools.linearsolver;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.Map;

public interface MPModelDeltaProtoOrBuilder extends MessageOrBuilder {
   boolean hasBaselineModelFilePath();

   String getBaselineModelFilePath();

   ByteString getBaselineModelFilePathBytes();

   int getVariableOverridesCount();

   boolean containsVariableOverrides(int var1);

   /** @deprecated */
   @Deprecated
   Map getVariableOverrides();

   Map getVariableOverridesMap();

   MPVariableProto getVariableOverridesOrDefault(int var1, MPVariableProto var2);

   MPVariableProto getVariableOverridesOrThrow(int var1);

   int getConstraintOverridesCount();

   boolean containsConstraintOverrides(int var1);

   /** @deprecated */
   @Deprecated
   Map getConstraintOverrides();

   Map getConstraintOverridesMap();

   MPConstraintProto getConstraintOverridesOrDefault(int var1, MPConstraintProto var2);

   MPConstraintProto getConstraintOverridesOrThrow(int var1);
}
