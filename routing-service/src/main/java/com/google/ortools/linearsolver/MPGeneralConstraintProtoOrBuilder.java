package com.google.ortools.linearsolver;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface MPGeneralConstraintProtoOrBuilder extends MessageOrBuilder {
   boolean hasName();

   String getName();

   ByteString getNameBytes();

   boolean hasIndicatorConstraint();

   MPIndicatorConstraint getIndicatorConstraint();

   MPIndicatorConstraintOrBuilder getIndicatorConstraintOrBuilder();

   boolean hasSosConstraint();

   MPSosConstraint getSosConstraint();

   MPSosConstraintOrBuilder getSosConstraintOrBuilder();

   boolean hasQuadraticConstraint();

   MPQuadraticConstraint getQuadraticConstraint();

   MPQuadraticConstraintOrBuilder getQuadraticConstraintOrBuilder();

   boolean hasAbsConstraint();

   MPAbsConstraint getAbsConstraint();

   MPAbsConstraintOrBuilder getAbsConstraintOrBuilder();

   boolean hasAndConstraint();

   MPArrayConstraint getAndConstraint();

   MPArrayConstraintOrBuilder getAndConstraintOrBuilder();

   boolean hasOrConstraint();

   MPArrayConstraint getOrConstraint();

   MPArrayConstraintOrBuilder getOrConstraintOrBuilder();

   boolean hasMinConstraint();

   MPArrayWithConstantConstraint getMinConstraint();

   MPArrayWithConstantConstraintOrBuilder getMinConstraintOrBuilder();

   boolean hasMaxConstraint();

   MPArrayWithConstantConstraint getMaxConstraint();

   MPArrayWithConstantConstraintOrBuilder getMaxConstraintOrBuilder();

   MPGeneralConstraintProto.GeneralConstraintCase getGeneralConstraintCase();
}
