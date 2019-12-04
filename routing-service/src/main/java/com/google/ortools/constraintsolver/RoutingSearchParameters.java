package com.google.ortools.constraintsolver;

import com.google.ortools.util.OptionalBoolean;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class RoutingSearchParameters extends GeneratedMessageV3 implements RoutingSearchParametersOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int FIRST_SOLUTION_STRATEGY_FIELD_NUMBER = 1;
   private int firstSolutionStrategy_;
   public static final int USE_UNFILTERED_FIRST_SOLUTION_STRATEGY_FIELD_NUMBER = 2;
   private boolean useUnfilteredFirstSolutionStrategy_;
   public static final int SAVINGS_NEIGHBORS_RATIO_FIELD_NUMBER = 14;
   private double savingsNeighborsRatio_;
   public static final int SAVINGS_MAX_MEMORY_USAGE_BYTES_FIELD_NUMBER = 23;
   private double savingsMaxMemoryUsageBytes_;
   public static final int SAVINGS_ADD_REVERSE_ARCS_FIELD_NUMBER = 15;
   private boolean savingsAddReverseArcs_;
   public static final int SAVINGS_ARC_COEFFICIENT_FIELD_NUMBER = 18;
   private double savingsArcCoefficient_;
   public static final int SAVINGS_PARALLEL_ROUTES_FIELD_NUMBER = 19;
   private boolean savingsParallelRoutes_;
   public static final int CHEAPEST_INSERTION_FARTHEST_SEEDS_RATIO_FIELD_NUMBER = 16;
   private double cheapestInsertionFarthestSeedsRatio_;
   public static final int CHEAPEST_INSERTION_NEIGHBORS_RATIO_FIELD_NUMBER = 21;
   private double cheapestInsertionNeighborsRatio_;
   public static final int LOCAL_SEARCH_OPERATORS_FIELD_NUMBER = 3;
   private RoutingSearchParameters.LocalSearchNeighborhoodOperators localSearchOperators_;
   public static final int RELOCATE_EXPENSIVE_CHAIN_NUM_ARCS_TO_CONSIDER_FIELD_NUMBER = 20;
   private int relocateExpensiveChainNumArcsToConsider_;
   public static final int LOCAL_SEARCH_METAHEURISTIC_FIELD_NUMBER = 4;
   private int localSearchMetaheuristic_;
   public static final int GUIDED_LOCAL_SEARCH_LAMBDA_COEFFICIENT_FIELD_NUMBER = 5;
   private double guidedLocalSearchLambdaCoefficient_;
   public static final int USE_DEPTH_FIRST_SEARCH_FIELD_NUMBER = 6;
   private boolean useDepthFirstSearch_;
   public static final int USE_CP_FIELD_NUMBER = 28;
   private int useCp_;
   public static final int USE_CP_SAT_FIELD_NUMBER = 27;
   private int useCpSat_;
   public static final int OPTIMIZATION_STEP_FIELD_NUMBER = 7;
   private double optimizationStep_;
   public static final int NUMBER_OF_SOLUTIONS_TO_COLLECT_FIELD_NUMBER = 17;
   private int numberOfSolutionsToCollect_;
   public static final int SOLUTION_LIMIT_FIELD_NUMBER = 8;
   private long solutionLimit_;
   public static final int TIME_LIMIT_FIELD_NUMBER = 9;
   private Duration timeLimit_;
   public static final int LNS_TIME_LIMIT_FIELD_NUMBER = 10;
   private Duration lnsTimeLimit_;
   public static final int USE_FULL_PROPAGATION_FIELD_NUMBER = 11;
   private boolean useFullPropagation_;
   public static final int LOG_SEARCH_FIELD_NUMBER = 13;
   private boolean logSearch_;
   public static final int LOG_COST_SCALING_FACTOR_FIELD_NUMBER = 22;
   private double logCostScalingFactor_;
   public static final int LOG_COST_OFFSET_FIELD_NUMBER = 29;
   private double logCostOffset_;
   private byte memoizedIsInitialized;
   private static final RoutingSearchParameters DEFAULT_INSTANCE = new RoutingSearchParameters();
   private static final Parser PARSER = new AbstractParser() {
      public RoutingSearchParameters parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new RoutingSearchParameters(var1, var2);
      }
   };

   private RoutingSearchParameters(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private RoutingSearchParameters() {
      this.memoizedIsInitialized = -1;
      this.firstSolutionStrategy_ = 0;
      this.localSearchMetaheuristic_ = 0;
      this.useCp_ = 0;
      this.useCpSat_ = 0;
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new RoutingSearchParameters();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private RoutingSearchParameters(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         com.google.protobuf.UnknownFieldSet.Builder var3 = UnknownFieldSet.newBuilder();

         try {
            boolean var4 = false;

            while(!var4) {
               int var5 = var1.readTag();
               int var6;
               com.google.protobuf.Duration.Builder var14;
               switch(var5) {
               case 0:
                  var4 = true;
                  break;
               case 8:
                  var6 = var1.readEnum();
                  this.firstSolutionStrategy_ = var6;
                  break;
               case 16:
                  this.useUnfilteredFirstSolutionStrategy_ = var1.readBool();
                  break;
               case 26:
                  RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder var15 = null;
                  if (this.localSearchOperators_ != null) {
                     var15 = this.localSearchOperators_.toBuilder();
                  }

                  this.localSearchOperators_ = (RoutingSearchParameters.LocalSearchNeighborhoodOperators)var1.readMessage(RoutingSearchParameters.LocalSearchNeighborhoodOperators.parser(), var2);
                  if (var15 != null) {
                     var15.mergeFrom(this.localSearchOperators_);
                     this.localSearchOperators_ = var15.buildPartial();
                  }
                  break;
               case 32:
                  var6 = var1.readEnum();
                  this.localSearchMetaheuristic_ = var6;
                  break;
               case 41:
                  this.guidedLocalSearchLambdaCoefficient_ = var1.readDouble();
                  break;
               case 48:
                  this.useDepthFirstSearch_ = var1.readBool();
                  break;
               case 57:
                  this.optimizationStep_ = var1.readDouble();
                  break;
               case 64:
                  this.solutionLimit_ = var1.readInt64();
                  break;
               case 74:
                  var14 = null;
                  if (this.timeLimit_ != null) {
                     var14 = this.timeLimit_.toBuilder();
                  }

                  this.timeLimit_ = (Duration)var1.readMessage(Duration.parser(), var2);
                  if (var14 != null) {
                     var14.mergeFrom(this.timeLimit_);
                     this.timeLimit_ = var14.buildPartial();
                  }
                  break;
               case 82:
                  var14 = null;
                  if (this.lnsTimeLimit_ != null) {
                     var14 = this.lnsTimeLimit_.toBuilder();
                  }

                  this.lnsTimeLimit_ = (Duration)var1.readMessage(Duration.parser(), var2);
                  if (var14 != null) {
                     var14.mergeFrom(this.lnsTimeLimit_);
                     this.lnsTimeLimit_ = var14.buildPartial();
                  }
                  break;
               case 88:
                  this.useFullPropagation_ = var1.readBool();
                  break;
               case 104:
                  this.logSearch_ = var1.readBool();
                  break;
               case 113:
                  this.savingsNeighborsRatio_ = var1.readDouble();
                  break;
               case 120:
                  this.savingsAddReverseArcs_ = var1.readBool();
                  break;
               case 129:
                  this.cheapestInsertionFarthestSeedsRatio_ = var1.readDouble();
                  break;
               case 136:
                  this.numberOfSolutionsToCollect_ = var1.readInt32();
                  break;
               case 145:
                  this.savingsArcCoefficient_ = var1.readDouble();
                  break;
               case 152:
                  this.savingsParallelRoutes_ = var1.readBool();
                  break;
               case 160:
                  this.relocateExpensiveChainNumArcsToConsider_ = var1.readInt32();
                  break;
               case 169:
                  this.cheapestInsertionNeighborsRatio_ = var1.readDouble();
                  break;
               case 177:
                  this.logCostScalingFactor_ = var1.readDouble();
                  break;
               case 185:
                  this.savingsMaxMemoryUsageBytes_ = var1.readDouble();
                  break;
               case 216:
                  var6 = var1.readEnum();
                  this.useCpSat_ = var6;
                  break;
               case 224:
                  var6 = var1.readEnum();
                  this.useCp_ = var6;
                  break;
               case 233:
                  this.logCostOffset_ = var1.readDouble();
                  break;
               default:
                  if (!this.parseUnknownField(var1, var3, var2, var5)) {
                     var4 = true;
                  }
               }
            }
         } catch (InvalidProtocolBufferException var11) {
            throw var11.setUnfinishedMessage(this);
         } catch (IOException var12) {
            throw (new InvalidProtocolBufferException(var12)).setUnfinishedMessage(this);
         } finally {
            this.unknownFields = var3.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return RoutingParameters.internal_static_operations_research_RoutingSearchParameters_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return RoutingParameters.internal_static_operations_research_RoutingSearchParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutingSearchParameters.class, RoutingSearchParameters.Builder.class);
   }

   public int getFirstSolutionStrategyValue() {
      return this.firstSolutionStrategy_;
   }

   public FirstSolutionStrategy.Value getFirstSolutionStrategy() {
      FirstSolutionStrategy.Value var1 = FirstSolutionStrategy.Value.valueOf(this.firstSolutionStrategy_);
      return var1 == null ? FirstSolutionStrategy.Value.UNRECOGNIZED : var1;
   }

   public boolean getUseUnfilteredFirstSolutionStrategy() {
      return this.useUnfilteredFirstSolutionStrategy_;
   }

   public double getSavingsNeighborsRatio() {
      return this.savingsNeighborsRatio_;
   }

   public double getSavingsMaxMemoryUsageBytes() {
      return this.savingsMaxMemoryUsageBytes_;
   }

   public boolean getSavingsAddReverseArcs() {
      return this.savingsAddReverseArcs_;
   }

   public double getSavingsArcCoefficient() {
      return this.savingsArcCoefficient_;
   }

   public boolean getSavingsParallelRoutes() {
      return this.savingsParallelRoutes_;
   }

   public double getCheapestInsertionFarthestSeedsRatio() {
      return this.cheapestInsertionFarthestSeedsRatio_;
   }

   public double getCheapestInsertionNeighborsRatio() {
      return this.cheapestInsertionNeighborsRatio_;
   }

   public boolean hasLocalSearchOperators() {
      return this.localSearchOperators_ != null;
   }

   public RoutingSearchParameters.LocalSearchNeighborhoodOperators getLocalSearchOperators() {
      return this.localSearchOperators_ == null ? RoutingSearchParameters.LocalSearchNeighborhoodOperators.getDefaultInstance() : this.localSearchOperators_;
   }

   public RoutingSearchParameters.LocalSearchNeighborhoodOperatorsOrBuilder getLocalSearchOperatorsOrBuilder() {
      return this.getLocalSearchOperators();
   }

   public int getRelocateExpensiveChainNumArcsToConsider() {
      return this.relocateExpensiveChainNumArcsToConsider_;
   }

   public int getLocalSearchMetaheuristicValue() {
      return this.localSearchMetaheuristic_;
   }

   public LocalSearchMetaheuristic.Value getLocalSearchMetaheuristic() {
      LocalSearchMetaheuristic.Value var1 = LocalSearchMetaheuristic.Value.valueOf(this.localSearchMetaheuristic_);
      return var1 == null ? LocalSearchMetaheuristic.Value.UNRECOGNIZED : var1;
   }

   public double getGuidedLocalSearchLambdaCoefficient() {
      return this.guidedLocalSearchLambdaCoefficient_;
   }

   public boolean getUseDepthFirstSearch() {
      return this.useDepthFirstSearch_;
   }

   public int getUseCpValue() {
      return this.useCp_;
   }

   public OptionalBoolean getUseCp() {
      OptionalBoolean var1 = OptionalBoolean.valueOf(this.useCp_);
      return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
   }

   public int getUseCpSatValue() {
      return this.useCpSat_;
   }

   public OptionalBoolean getUseCpSat() {
      OptionalBoolean var1 = OptionalBoolean.valueOf(this.useCpSat_);
      return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
   }

   public double getOptimizationStep() {
      return this.optimizationStep_;
   }

   public int getNumberOfSolutionsToCollect() {
      return this.numberOfSolutionsToCollect_;
   }

   public long getSolutionLimit() {
      return this.solutionLimit_;
   }

   public boolean hasTimeLimit() {
      return this.timeLimit_ != null;
   }

   public Duration getTimeLimit() {
      return this.timeLimit_ == null ? Duration.getDefaultInstance() : this.timeLimit_;
   }

   public DurationOrBuilder getTimeLimitOrBuilder() {
      return this.getTimeLimit();
   }

   public boolean hasLnsTimeLimit() {
      return this.lnsTimeLimit_ != null;
   }

   public Duration getLnsTimeLimit() {
      return this.lnsTimeLimit_ == null ? Duration.getDefaultInstance() : this.lnsTimeLimit_;
   }

   public DurationOrBuilder getLnsTimeLimitOrBuilder() {
      return this.getLnsTimeLimit();
   }

   public boolean getUseFullPropagation() {
      return this.useFullPropagation_;
   }

   public boolean getLogSearch() {
      return this.logSearch_;
   }

   public double getLogCostScalingFactor() {
      return this.logCostScalingFactor_;
   }

   public double getLogCostOffset() {
      return this.logCostOffset_;
   }

   public final boolean isInitialized() {
      byte var1 = this.memoizedIsInitialized;
      if (var1 == 1) {
         return true;
      } else if (var1 == 0) {
         return false;
      } else {
         this.memoizedIsInitialized = 1;
         return true;
      }
   }

   public void writeTo(CodedOutputStream var1) throws IOException {
      if (this.firstSolutionStrategy_ != FirstSolutionStrategy.Value.UNSET.getNumber()) {
         var1.writeEnum(1, this.firstSolutionStrategy_);
      }

      if (this.useUnfilteredFirstSolutionStrategy_) {
         var1.writeBool(2, this.useUnfilteredFirstSolutionStrategy_);
      }

      if (this.localSearchOperators_ != null) {
         var1.writeMessage(3, this.getLocalSearchOperators());
      }

      if (this.localSearchMetaheuristic_ != LocalSearchMetaheuristic.Value.UNSET.getNumber()) {
         var1.writeEnum(4, this.localSearchMetaheuristic_);
      }

      if (this.guidedLocalSearchLambdaCoefficient_ != 0.0D) {
         var1.writeDouble(5, this.guidedLocalSearchLambdaCoefficient_);
      }

      if (this.useDepthFirstSearch_) {
         var1.writeBool(6, this.useDepthFirstSearch_);
      }

      if (this.optimizationStep_ != 0.0D) {
         var1.writeDouble(7, this.optimizationStep_);
      }

      if (this.solutionLimit_ != 0L) {
         var1.writeInt64(8, this.solutionLimit_);
      }

      if (this.timeLimit_ != null) {
         var1.writeMessage(9, this.getTimeLimit());
      }

      if (this.lnsTimeLimit_ != null) {
         var1.writeMessage(10, this.getLnsTimeLimit());
      }

      if (this.useFullPropagation_) {
         var1.writeBool(11, this.useFullPropagation_);
      }

      if (this.logSearch_) {
         var1.writeBool(13, this.logSearch_);
      }

      if (this.savingsNeighborsRatio_ != 0.0D) {
         var1.writeDouble(14, this.savingsNeighborsRatio_);
      }

      if (this.savingsAddReverseArcs_) {
         var1.writeBool(15, this.savingsAddReverseArcs_);
      }

      if (this.cheapestInsertionFarthestSeedsRatio_ != 0.0D) {
         var1.writeDouble(16, this.cheapestInsertionFarthestSeedsRatio_);
      }

      if (this.numberOfSolutionsToCollect_ != 0) {
         var1.writeInt32(17, this.numberOfSolutionsToCollect_);
      }

      if (this.savingsArcCoefficient_ != 0.0D) {
         var1.writeDouble(18, this.savingsArcCoefficient_);
      }

      if (this.savingsParallelRoutes_) {
         var1.writeBool(19, this.savingsParallelRoutes_);
      }

      if (this.relocateExpensiveChainNumArcsToConsider_ != 0) {
         var1.writeInt32(20, this.relocateExpensiveChainNumArcsToConsider_);
      }

      if (this.cheapestInsertionNeighborsRatio_ != 0.0D) {
         var1.writeDouble(21, this.cheapestInsertionNeighborsRatio_);
      }

      if (this.logCostScalingFactor_ != 0.0D) {
         var1.writeDouble(22, this.logCostScalingFactor_);
      }

      if (this.savingsMaxMemoryUsageBytes_ != 0.0D) {
         var1.writeDouble(23, this.savingsMaxMemoryUsageBytes_);
      }

      if (this.useCpSat_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
         var1.writeEnum(27, this.useCpSat_);
      }

      if (this.useCp_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
         var1.writeEnum(28, this.useCp_);
      }

      if (this.logCostOffset_ != 0.0D) {
         var1.writeDouble(29, this.logCostOffset_);
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (this.firstSolutionStrategy_ != FirstSolutionStrategy.Value.UNSET.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(1, this.firstSolutionStrategy_);
         }

         if (this.useUnfilteredFirstSolutionStrategy_) {
            var1 += CodedOutputStream.computeBoolSize(2, this.useUnfilteredFirstSolutionStrategy_);
         }

         if (this.localSearchOperators_ != null) {
            var1 += CodedOutputStream.computeMessageSize(3, this.getLocalSearchOperators());
         }

         if (this.localSearchMetaheuristic_ != LocalSearchMetaheuristic.Value.UNSET.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(4, this.localSearchMetaheuristic_);
         }

         if (this.guidedLocalSearchLambdaCoefficient_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(5, this.guidedLocalSearchLambdaCoefficient_);
         }

         if (this.useDepthFirstSearch_) {
            var1 += CodedOutputStream.computeBoolSize(6, this.useDepthFirstSearch_);
         }

         if (this.optimizationStep_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(7, this.optimizationStep_);
         }

         if (this.solutionLimit_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(8, this.solutionLimit_);
         }

         if (this.timeLimit_ != null) {
            var1 += CodedOutputStream.computeMessageSize(9, this.getTimeLimit());
         }

         if (this.lnsTimeLimit_ != null) {
            var1 += CodedOutputStream.computeMessageSize(10, this.getLnsTimeLimit());
         }

         if (this.useFullPropagation_) {
            var1 += CodedOutputStream.computeBoolSize(11, this.useFullPropagation_);
         }

         if (this.logSearch_) {
            var1 += CodedOutputStream.computeBoolSize(13, this.logSearch_);
         }

         if (this.savingsNeighborsRatio_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(14, this.savingsNeighborsRatio_);
         }

         if (this.savingsAddReverseArcs_) {
            var1 += CodedOutputStream.computeBoolSize(15, this.savingsAddReverseArcs_);
         }

         if (this.cheapestInsertionFarthestSeedsRatio_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(16, this.cheapestInsertionFarthestSeedsRatio_);
         }

         if (this.numberOfSolutionsToCollect_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(17, this.numberOfSolutionsToCollect_);
         }

         if (this.savingsArcCoefficient_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(18, this.savingsArcCoefficient_);
         }

         if (this.savingsParallelRoutes_) {
            var1 += CodedOutputStream.computeBoolSize(19, this.savingsParallelRoutes_);
         }

         if (this.relocateExpensiveChainNumArcsToConsider_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(20, this.relocateExpensiveChainNumArcsToConsider_);
         }

         if (this.cheapestInsertionNeighborsRatio_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(21, this.cheapestInsertionNeighborsRatio_);
         }

         if (this.logCostScalingFactor_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(22, this.logCostScalingFactor_);
         }

         if (this.savingsMaxMemoryUsageBytes_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(23, this.savingsMaxMemoryUsageBytes_);
         }

         if (this.useCpSat_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(27, this.useCpSat_);
         }

         if (this.useCp_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(28, this.useCp_);
         }

         if (this.logCostOffset_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(29, this.logCostOffset_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RoutingSearchParameters)) {
         return super.equals(var1);
      } else {
         RoutingSearchParameters var2 = (RoutingSearchParameters)var1;
         if (this.firstSolutionStrategy_ != var2.firstSolutionStrategy_) {
            return false;
         } else if (this.getUseUnfilteredFirstSolutionStrategy() != var2.getUseUnfilteredFirstSolutionStrategy()) {
            return false;
         } else if (Double.doubleToLongBits(this.getSavingsNeighborsRatio()) != Double.doubleToLongBits(var2.getSavingsNeighborsRatio())) {
            return false;
         } else if (Double.doubleToLongBits(this.getSavingsMaxMemoryUsageBytes()) != Double.doubleToLongBits(var2.getSavingsMaxMemoryUsageBytes())) {
            return false;
         } else if (this.getSavingsAddReverseArcs() != var2.getSavingsAddReverseArcs()) {
            return false;
         } else if (Double.doubleToLongBits(this.getSavingsArcCoefficient()) != Double.doubleToLongBits(var2.getSavingsArcCoefficient())) {
            return false;
         } else if (this.getSavingsParallelRoutes() != var2.getSavingsParallelRoutes()) {
            return false;
         } else if (Double.doubleToLongBits(this.getCheapestInsertionFarthestSeedsRatio()) != Double.doubleToLongBits(var2.getCheapestInsertionFarthestSeedsRatio())) {
            return false;
         } else if (Double.doubleToLongBits(this.getCheapestInsertionNeighborsRatio()) != Double.doubleToLongBits(var2.getCheapestInsertionNeighborsRatio())) {
            return false;
         } else if (this.hasLocalSearchOperators() != var2.hasLocalSearchOperators()) {
            return false;
         } else if (this.hasLocalSearchOperators() && !this.getLocalSearchOperators().equals(var2.getLocalSearchOperators())) {
            return false;
         } else if (this.getRelocateExpensiveChainNumArcsToConsider() != var2.getRelocateExpensiveChainNumArcsToConsider()) {
            return false;
         } else if (this.localSearchMetaheuristic_ != var2.localSearchMetaheuristic_) {
            return false;
         } else if (Double.doubleToLongBits(this.getGuidedLocalSearchLambdaCoefficient()) != Double.doubleToLongBits(var2.getGuidedLocalSearchLambdaCoefficient())) {
            return false;
         } else if (this.getUseDepthFirstSearch() != var2.getUseDepthFirstSearch()) {
            return false;
         } else if (this.useCp_ != var2.useCp_) {
            return false;
         } else if (this.useCpSat_ != var2.useCpSat_) {
            return false;
         } else if (Double.doubleToLongBits(this.getOptimizationStep()) != Double.doubleToLongBits(var2.getOptimizationStep())) {
            return false;
         } else if (this.getNumberOfSolutionsToCollect() != var2.getNumberOfSolutionsToCollect()) {
            return false;
         } else if (this.getSolutionLimit() != var2.getSolutionLimit()) {
            return false;
         } else if (this.hasTimeLimit() != var2.hasTimeLimit()) {
            return false;
         } else if (this.hasTimeLimit() && !this.getTimeLimit().equals(var2.getTimeLimit())) {
            return false;
         } else if (this.hasLnsTimeLimit() != var2.hasLnsTimeLimit()) {
            return false;
         } else if (this.hasLnsTimeLimit() && !this.getLnsTimeLimit().equals(var2.getLnsTimeLimit())) {
            return false;
         } else if (this.getUseFullPropagation() != var2.getUseFullPropagation()) {
            return false;
         } else if (this.getLogSearch() != var2.getLogSearch()) {
            return false;
         } else if (Double.doubleToLongBits(this.getLogCostScalingFactor()) != Double.doubleToLongBits(var2.getLogCostScalingFactor())) {
            return false;
         } else if (Double.doubleToLongBits(this.getLogCostOffset()) != Double.doubleToLongBits(var2.getLogCostOffset())) {
            return false;
         } else {
            return this.unknownFields.equals(var2.unknownFields);
         }
      }
   }

   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      } else {
         byte var1 = 41;
         int var2 = 19 * var1 + getDescriptor().hashCode();
         var2 = 37 * var2 + 1;
         var2 = 53 * var2 + this.firstSolutionStrategy_;
         var2 = 37 * var2 + 2;
         var2 = 53 * var2 + Internal.hashBoolean(this.getUseUnfilteredFirstSolutionStrategy());
         var2 = 37 * var2 + 14;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getSavingsNeighborsRatio()));
         var2 = 37 * var2 + 23;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getSavingsMaxMemoryUsageBytes()));
         var2 = 37 * var2 + 15;
         var2 = 53 * var2 + Internal.hashBoolean(this.getSavingsAddReverseArcs());
         var2 = 37 * var2 + 18;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getSavingsArcCoefficient()));
         var2 = 37 * var2 + 19;
         var2 = 53 * var2 + Internal.hashBoolean(this.getSavingsParallelRoutes());
         var2 = 37 * var2 + 16;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getCheapestInsertionFarthestSeedsRatio()));
         var2 = 37 * var2 + 21;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getCheapestInsertionNeighborsRatio()));
         if (this.hasLocalSearchOperators()) {
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getLocalSearchOperators().hashCode();
         }

         var2 = 37 * var2 + 20;
         var2 = 53 * var2 + this.getRelocateExpensiveChainNumArcsToConsider();
         var2 = 37 * var2 + 4;
         var2 = 53 * var2 + this.localSearchMetaheuristic_;
         var2 = 37 * var2 + 5;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getGuidedLocalSearchLambdaCoefficient()));
         var2 = 37 * var2 + 6;
         var2 = 53 * var2 + Internal.hashBoolean(this.getUseDepthFirstSearch());
         var2 = 37 * var2 + 28;
         var2 = 53 * var2 + this.useCp_;
         var2 = 37 * var2 + 27;
         var2 = 53 * var2 + this.useCpSat_;
         var2 = 37 * var2 + 7;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getOptimizationStep()));
         var2 = 37 * var2 + 17;
         var2 = 53 * var2 + this.getNumberOfSolutionsToCollect();
         var2 = 37 * var2 + 8;
         var2 = 53 * var2 + Internal.hashLong(this.getSolutionLimit());
         if (this.hasTimeLimit()) {
            var2 = 37 * var2 + 9;
            var2 = 53 * var2 + this.getTimeLimit().hashCode();
         }

         if (this.hasLnsTimeLimit()) {
            var2 = 37 * var2 + 10;
            var2 = 53 * var2 + this.getLnsTimeLimit().hashCode();
         }

         var2 = 37 * var2 + 11;
         var2 = 53 * var2 + Internal.hashBoolean(this.getUseFullPropagation());
         var2 = 37 * var2 + 13;
         var2 = 53 * var2 + Internal.hashBoolean(this.getLogSearch());
         var2 = 37 * var2 + 22;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getLogCostScalingFactor()));
         var2 = 37 * var2 + 29;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getLogCostOffset()));
         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static RoutingSearchParameters parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (RoutingSearchParameters)PARSER.parseFrom(var0);
   }

   public static RoutingSearchParameters parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RoutingSearchParameters)PARSER.parseFrom(var0, var1);
   }

   public static RoutingSearchParameters parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (RoutingSearchParameters)PARSER.parseFrom(var0);
   }

   public static RoutingSearchParameters parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RoutingSearchParameters)PARSER.parseFrom(var0, var1);
   }

   public static RoutingSearchParameters parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (RoutingSearchParameters)PARSER.parseFrom(var0);
   }

   public static RoutingSearchParameters parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (RoutingSearchParameters)PARSER.parseFrom(var0, var1);
   }

   public static RoutingSearchParameters parseFrom(InputStream var0) throws IOException {
      return (RoutingSearchParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RoutingSearchParameters parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RoutingSearchParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RoutingSearchParameters parseDelimitedFrom(InputStream var0) throws IOException {
      return (RoutingSearchParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RoutingSearchParameters parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RoutingSearchParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RoutingSearchParameters parseFrom(CodedInputStream var0) throws IOException {
      return (RoutingSearchParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RoutingSearchParameters parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (RoutingSearchParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RoutingSearchParameters.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RoutingSearchParameters.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RoutingSearchParameters.Builder newBuilder(RoutingSearchParameters var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RoutingSearchParameters.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RoutingSearchParameters.Builder() : (new RoutingSearchParameters.Builder()).mergeFrom(this);
   }

   protected RoutingSearchParameters.Builder newBuilderForType(BuilderParent var1) {
      RoutingSearchParameters.Builder var2 = new RoutingSearchParameters.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static RoutingSearchParameters getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public RoutingSearchParameters getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   @Override
   public List findInitializationErrors() {
      return null;
   }

   @Override
   public String getInitializationErrorString() {
      return null;
   }

   // $FF: synthetic method
   RoutingSearchParameters(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   RoutingSearchParameters(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements RoutingSearchParametersOrBuilder {
      private int firstSolutionStrategy_;
      private boolean useUnfilteredFirstSolutionStrategy_;
      private double savingsNeighborsRatio_;
      private double savingsMaxMemoryUsageBytes_;
      private boolean savingsAddReverseArcs_;
      private double savingsArcCoefficient_;
      private boolean savingsParallelRoutes_;
      private double cheapestInsertionFarthestSeedsRatio_;
      private double cheapestInsertionNeighborsRatio_;
      private RoutingSearchParameters.LocalSearchNeighborhoodOperators localSearchOperators_;
      private SingleFieldBuilderV3 localSearchOperatorsBuilder_;
      private int relocateExpensiveChainNumArcsToConsider_;
      private int localSearchMetaheuristic_;
      private double guidedLocalSearchLambdaCoefficient_;
      private boolean useDepthFirstSearch_;
      private int useCp_;
      private int useCpSat_;
      private double optimizationStep_;
      private int numberOfSolutionsToCollect_;
      private long solutionLimit_;
      private Duration timeLimit_;
      private SingleFieldBuilderV3 timeLimitBuilder_;
      private Duration lnsTimeLimit_;
      private SingleFieldBuilderV3 lnsTimeLimitBuilder_;
      private boolean useFullPropagation_;
      private boolean logSearch_;
      private double logCostScalingFactor_;
      private double logCostOffset_;

      public static final Descriptor getDescriptor() {
         return RoutingParameters.internal_static_operations_research_RoutingSearchParameters_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return RoutingParameters.internal_static_operations_research_RoutingSearchParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutingSearchParameters.class, RoutingSearchParameters.Builder.class);
      }

      private Builder() {
         this.firstSolutionStrategy_ = 0;
         this.localSearchMetaheuristic_ = 0;
         this.useCp_ = 0;
         this.useCpSat_ = 0;
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.firstSolutionStrategy_ = 0;
         this.localSearchMetaheuristic_ = 0;
         this.useCp_ = 0;
         this.useCpSat_ = 0;
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RoutingSearchParameters.alwaysUseFieldBuilders) {
         }

      }

      public RoutingSearchParameters.Builder clear() {
         super.clear();
         this.firstSolutionStrategy_ = 0;
         this.useUnfilteredFirstSolutionStrategy_ = false;
         this.savingsNeighborsRatio_ = 0.0D;
         this.savingsMaxMemoryUsageBytes_ = 0.0D;
         this.savingsAddReverseArcs_ = false;
         this.savingsArcCoefficient_ = 0.0D;
         this.savingsParallelRoutes_ = false;
         this.cheapestInsertionFarthestSeedsRatio_ = 0.0D;
         this.cheapestInsertionNeighborsRatio_ = 0.0D;
         if (this.localSearchOperatorsBuilder_ == null) {
            this.localSearchOperators_ = null;
         } else {
            this.localSearchOperators_ = null;
            this.localSearchOperatorsBuilder_ = null;
         }

         this.relocateExpensiveChainNumArcsToConsider_ = 0;
         this.localSearchMetaheuristic_ = 0;
         this.guidedLocalSearchLambdaCoefficient_ = 0.0D;
         this.useDepthFirstSearch_ = false;
         this.useCp_ = 0;
         this.useCpSat_ = 0;
         this.optimizationStep_ = 0.0D;
         this.numberOfSolutionsToCollect_ = 0;
         this.solutionLimit_ = 0L;
         if (this.timeLimitBuilder_ == null) {
            this.timeLimit_ = null;
         } else {
            this.timeLimit_ = null;
            this.timeLimitBuilder_ = null;
         }

         if (this.lnsTimeLimitBuilder_ == null) {
            this.lnsTimeLimit_ = null;
         } else {
            this.lnsTimeLimit_ = null;
            this.lnsTimeLimitBuilder_ = null;
         }

         this.useFullPropagation_ = false;
         this.logSearch_ = false;
         this.logCostScalingFactor_ = 0.0D;
         this.logCostOffset_ = 0.0D;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return RoutingParameters.internal_static_operations_research_RoutingSearchParameters_descriptor;
      }

      public RoutingSearchParameters getDefaultInstanceForType() {
         return RoutingSearchParameters.getDefaultInstance();
      }

      public RoutingSearchParameters build() {
         RoutingSearchParameters var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RoutingSearchParameters buildPartial() {
         RoutingSearchParameters var1 = new RoutingSearchParameters(this);
         var1.firstSolutionStrategy_ = this.firstSolutionStrategy_;
         var1.useUnfilteredFirstSolutionStrategy_ = this.useUnfilteredFirstSolutionStrategy_;
         var1.savingsNeighborsRatio_ = this.savingsNeighborsRatio_;
         var1.savingsMaxMemoryUsageBytes_ = this.savingsMaxMemoryUsageBytes_;
         var1.savingsAddReverseArcs_ = this.savingsAddReverseArcs_;
         var1.savingsArcCoefficient_ = this.savingsArcCoefficient_;
         var1.savingsParallelRoutes_ = this.savingsParallelRoutes_;
         var1.cheapestInsertionFarthestSeedsRatio_ = this.cheapestInsertionFarthestSeedsRatio_;
         var1.cheapestInsertionNeighborsRatio_ = this.cheapestInsertionNeighborsRatio_;
         if (this.localSearchOperatorsBuilder_ == null) {
            var1.localSearchOperators_ = this.localSearchOperators_;
         } else {
            var1.localSearchOperators_ = (RoutingSearchParameters.LocalSearchNeighborhoodOperators)this.localSearchOperatorsBuilder_.build();
         }

         var1.relocateExpensiveChainNumArcsToConsider_ = this.relocateExpensiveChainNumArcsToConsider_;
         var1.localSearchMetaheuristic_ = this.localSearchMetaheuristic_;
         var1.guidedLocalSearchLambdaCoefficient_ = this.guidedLocalSearchLambdaCoefficient_;
         var1.useDepthFirstSearch_ = this.useDepthFirstSearch_;
         var1.useCp_ = this.useCp_;
         var1.useCpSat_ = this.useCpSat_;
         var1.optimizationStep_ = this.optimizationStep_;
         var1.numberOfSolutionsToCollect_ = this.numberOfSolutionsToCollect_;
         var1.solutionLimit_ = this.solutionLimit_;
         if (this.timeLimitBuilder_ == null) {
            var1.timeLimit_ = this.timeLimit_;
         } else {
            var1.timeLimit_ = (Duration)this.timeLimitBuilder_.build();
         }

         if (this.lnsTimeLimitBuilder_ == null) {
            var1.lnsTimeLimit_ = this.lnsTimeLimit_;
         } else {
            var1.lnsTimeLimit_ = (Duration)this.lnsTimeLimitBuilder_.build();
         }

         var1.useFullPropagation_ = this.useFullPropagation_;
         var1.logSearch_ = this.logSearch_;
         var1.logCostScalingFactor_ = this.logCostScalingFactor_;
         var1.logCostOffset_ = this.logCostOffset_;
         this.onBuilt();
         return var1;
      }

      public RoutingSearchParameters.Builder clone() {
         return (RoutingSearchParameters.Builder)super.clone();
      }

      public RoutingSearchParameters.Builder setField(FieldDescriptor var1, Object var2) {
         return (RoutingSearchParameters.Builder)super.setField(var1, var2);
      }

      public RoutingSearchParameters.Builder clearField(FieldDescriptor var1) {
         return (RoutingSearchParameters.Builder)super.clearField(var1);
      }

      public RoutingSearchParameters.Builder clearOneof(OneofDescriptor var1) {
         return (RoutingSearchParameters.Builder)super.clearOneof(var1);
      }

      public RoutingSearchParameters.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (RoutingSearchParameters.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RoutingSearchParameters.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (RoutingSearchParameters.Builder)super.addRepeatedField(var1, var2);
      }

      public RoutingSearchParameters.Builder mergeFrom(Message var1) {
         if (var1 instanceof RoutingSearchParameters) {
            return this.mergeFrom((RoutingSearchParameters)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public RoutingSearchParameters.Builder mergeFrom(RoutingSearchParameters var1) {
         if (var1 == RoutingSearchParameters.getDefaultInstance()) {
            return this;
         } else {
            if (var1.firstSolutionStrategy_ != 0) {
               this.setFirstSolutionStrategyValue(var1.getFirstSolutionStrategyValue());
            }

            if (var1.getUseUnfilteredFirstSolutionStrategy()) {
               this.setUseUnfilteredFirstSolutionStrategy(var1.getUseUnfilteredFirstSolutionStrategy());
            }

            if (var1.getSavingsNeighborsRatio() != 0.0D) {
               this.setSavingsNeighborsRatio(var1.getSavingsNeighborsRatio());
            }

            if (var1.getSavingsMaxMemoryUsageBytes() != 0.0D) {
               this.setSavingsMaxMemoryUsageBytes(var1.getSavingsMaxMemoryUsageBytes());
            }

            if (var1.getSavingsAddReverseArcs()) {
               this.setSavingsAddReverseArcs(var1.getSavingsAddReverseArcs());
            }

            if (var1.getSavingsArcCoefficient() != 0.0D) {
               this.setSavingsArcCoefficient(var1.getSavingsArcCoefficient());
            }

            if (var1.getSavingsParallelRoutes()) {
               this.setSavingsParallelRoutes(var1.getSavingsParallelRoutes());
            }

            if (var1.getCheapestInsertionFarthestSeedsRatio() != 0.0D) {
               this.setCheapestInsertionFarthestSeedsRatio(var1.getCheapestInsertionFarthestSeedsRatio());
            }

            if (var1.getCheapestInsertionNeighborsRatio() != 0.0D) {
               this.setCheapestInsertionNeighborsRatio(var1.getCheapestInsertionNeighborsRatio());
            }

            if (var1.hasLocalSearchOperators()) {
               this.mergeLocalSearchOperators(var1.getLocalSearchOperators());
            }

            if (var1.getRelocateExpensiveChainNumArcsToConsider() != 0) {
               this.setRelocateExpensiveChainNumArcsToConsider(var1.getRelocateExpensiveChainNumArcsToConsider());
            }

            if (var1.localSearchMetaheuristic_ != 0) {
               this.setLocalSearchMetaheuristicValue(var1.getLocalSearchMetaheuristicValue());
            }

            if (var1.getGuidedLocalSearchLambdaCoefficient() != 0.0D) {
               this.setGuidedLocalSearchLambdaCoefficient(var1.getGuidedLocalSearchLambdaCoefficient());
            }

            if (var1.getUseDepthFirstSearch()) {
               this.setUseDepthFirstSearch(var1.getUseDepthFirstSearch());
            }

            if (var1.useCp_ != 0) {
               this.setUseCpValue(var1.getUseCpValue());
            }

            if (var1.useCpSat_ != 0) {
               this.setUseCpSatValue(var1.getUseCpSatValue());
            }

            if (var1.getOptimizationStep() != 0.0D) {
               this.setOptimizationStep(var1.getOptimizationStep());
            }

            if (var1.getNumberOfSolutionsToCollect() != 0) {
               this.setNumberOfSolutionsToCollect(var1.getNumberOfSolutionsToCollect());
            }

            if (var1.getSolutionLimit() != 0L) {
               this.setSolutionLimit(var1.getSolutionLimit());
            }

            if (var1.hasTimeLimit()) {
               this.mergeTimeLimit(var1.getTimeLimit());
            }

            if (var1.hasLnsTimeLimit()) {
               this.mergeLnsTimeLimit(var1.getLnsTimeLimit());
            }

            if (var1.getUseFullPropagation()) {
               this.setUseFullPropagation(var1.getUseFullPropagation());
            }

            if (var1.getLogSearch()) {
               this.setLogSearch(var1.getLogSearch());
            }

            if (var1.getLogCostScalingFactor() != 0.0D) {
               this.setLogCostScalingFactor(var1.getLogCostScalingFactor());
            }

            if (var1.getLogCostOffset() != 0.0D) {
               this.setLogCostOffset(var1.getLogCostOffset());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public RoutingSearchParameters.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         RoutingSearchParameters var3 = null;

         try {
            var3 = (RoutingSearchParameters)RoutingSearchParameters.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (RoutingSearchParameters)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public int getFirstSolutionStrategyValue() {
         return this.firstSolutionStrategy_;
      }

      public RoutingSearchParameters.Builder setFirstSolutionStrategyValue(int var1) {
         this.firstSolutionStrategy_ = var1;
         this.onChanged();
         return this;
      }

      public FirstSolutionStrategy.Value getFirstSolutionStrategy() {
         FirstSolutionStrategy.Value var1 = FirstSolutionStrategy.Value.valueOf(this.firstSolutionStrategy_);
         return var1 == null ? FirstSolutionStrategy.Value.UNRECOGNIZED : var1;
      }

      public RoutingSearchParameters.Builder setFirstSolutionStrategy(FirstSolutionStrategy.Value var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.firstSolutionStrategy_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public RoutingSearchParameters.Builder clearFirstSolutionStrategy() {
         this.firstSolutionStrategy_ = 0;
         this.onChanged();
         return this;
      }

      public boolean getUseUnfilteredFirstSolutionStrategy() {
         return this.useUnfilteredFirstSolutionStrategy_;
      }

      public RoutingSearchParameters.Builder setUseUnfilteredFirstSolutionStrategy(boolean var1) {
         this.useUnfilteredFirstSolutionStrategy_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearUseUnfilteredFirstSolutionStrategy() {
         this.useUnfilteredFirstSolutionStrategy_ = false;
         this.onChanged();
         return this;
      }

      public double getSavingsNeighborsRatio() {
         return this.savingsNeighborsRatio_;
      }

      public RoutingSearchParameters.Builder setSavingsNeighborsRatio(double var1) {
         this.savingsNeighborsRatio_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearSavingsNeighborsRatio() {
         this.savingsNeighborsRatio_ = 0.0D;
         this.onChanged();
         return this;
      }

      public double getSavingsMaxMemoryUsageBytes() {
         return this.savingsMaxMemoryUsageBytes_;
      }

      public RoutingSearchParameters.Builder setSavingsMaxMemoryUsageBytes(double var1) {
         this.savingsMaxMemoryUsageBytes_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearSavingsMaxMemoryUsageBytes() {
         this.savingsMaxMemoryUsageBytes_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean getSavingsAddReverseArcs() {
         return this.savingsAddReverseArcs_;
      }

      public RoutingSearchParameters.Builder setSavingsAddReverseArcs(boolean var1) {
         this.savingsAddReverseArcs_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearSavingsAddReverseArcs() {
         this.savingsAddReverseArcs_ = false;
         this.onChanged();
         return this;
      }

      public double getSavingsArcCoefficient() {
         return this.savingsArcCoefficient_;
      }

      public RoutingSearchParameters.Builder setSavingsArcCoefficient(double var1) {
         this.savingsArcCoefficient_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearSavingsArcCoefficient() {
         this.savingsArcCoefficient_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean getSavingsParallelRoutes() {
         return this.savingsParallelRoutes_;
      }

      public RoutingSearchParameters.Builder setSavingsParallelRoutes(boolean var1) {
         this.savingsParallelRoutes_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearSavingsParallelRoutes() {
         this.savingsParallelRoutes_ = false;
         this.onChanged();
         return this;
      }

      public double getCheapestInsertionFarthestSeedsRatio() {
         return this.cheapestInsertionFarthestSeedsRatio_;
      }

      public RoutingSearchParameters.Builder setCheapestInsertionFarthestSeedsRatio(double var1) {
         this.cheapestInsertionFarthestSeedsRatio_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearCheapestInsertionFarthestSeedsRatio() {
         this.cheapestInsertionFarthestSeedsRatio_ = 0.0D;
         this.onChanged();
         return this;
      }

      public double getCheapestInsertionNeighborsRatio() {
         return this.cheapestInsertionNeighborsRatio_;
      }

      public RoutingSearchParameters.Builder setCheapestInsertionNeighborsRatio(double var1) {
         this.cheapestInsertionNeighborsRatio_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearCheapestInsertionNeighborsRatio() {
         this.cheapestInsertionNeighborsRatio_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean hasLocalSearchOperators() {
         return this.localSearchOperatorsBuilder_ != null || this.localSearchOperators_ != null;
      }

      public RoutingSearchParameters.LocalSearchNeighborhoodOperators getLocalSearchOperators() {
         if (this.localSearchOperatorsBuilder_ == null) {
            return this.localSearchOperators_ == null ? RoutingSearchParameters.LocalSearchNeighborhoodOperators.getDefaultInstance() : this.localSearchOperators_;
         } else {
            return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)this.localSearchOperatorsBuilder_.getMessage();
         }
      }

      public RoutingSearchParameters.Builder setLocalSearchOperators(RoutingSearchParameters.LocalSearchNeighborhoodOperators var1) {
         if (this.localSearchOperatorsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.localSearchOperators_ = var1;
            this.onChanged();
         } else {
            this.localSearchOperatorsBuilder_.setMessage(var1);
         }

         return this;
      }

      public RoutingSearchParameters.Builder setLocalSearchOperators(RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder var1) {
         if (this.localSearchOperatorsBuilder_ == null) {
            this.localSearchOperators_ = var1.build();
            this.onChanged();
         } else {
            this.localSearchOperatorsBuilder_.setMessage(var1.build());
         }

         return this;
      }

      public RoutingSearchParameters.Builder mergeLocalSearchOperators(RoutingSearchParameters.LocalSearchNeighborhoodOperators var1) {
         if (this.localSearchOperatorsBuilder_ == null) {
            if (this.localSearchOperators_ != null) {
               this.localSearchOperators_ = RoutingSearchParameters.LocalSearchNeighborhoodOperators.newBuilder(this.localSearchOperators_).mergeFrom(var1).buildPartial();
            } else {
               this.localSearchOperators_ = var1;
            }

            this.onChanged();
         } else {
            this.localSearchOperatorsBuilder_.mergeFrom(var1);
         }

         return this;
      }

      public RoutingSearchParameters.Builder clearLocalSearchOperators() {
         if (this.localSearchOperatorsBuilder_ == null) {
            this.localSearchOperators_ = null;
            this.onChanged();
         } else {
            this.localSearchOperators_ = null;
            this.localSearchOperatorsBuilder_ = null;
         }

         return this;
      }

      public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder getLocalSearchOperatorsBuilder() {
         this.onChanged();
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder)this.getLocalSearchOperatorsFieldBuilder().getBuilder();
      }

      public RoutingSearchParameters.LocalSearchNeighborhoodOperatorsOrBuilder getLocalSearchOperatorsOrBuilder() {
         if (this.localSearchOperatorsBuilder_ != null) {
            return (RoutingSearchParameters.LocalSearchNeighborhoodOperatorsOrBuilder)this.localSearchOperatorsBuilder_.getMessageOrBuilder();
         } else {
            return this.localSearchOperators_ == null ? RoutingSearchParameters.LocalSearchNeighborhoodOperators.getDefaultInstance() : this.localSearchOperators_;
         }
      }

      private SingleFieldBuilderV3 getLocalSearchOperatorsFieldBuilder() {
         if (this.localSearchOperatorsBuilder_ == null) {
            this.localSearchOperatorsBuilder_ = new SingleFieldBuilderV3(this.getLocalSearchOperators(), this.getParentForChildren(), this.isClean());
            this.localSearchOperators_ = null;
         }

         return this.localSearchOperatorsBuilder_;
      }

      public int getRelocateExpensiveChainNumArcsToConsider() {
         return this.relocateExpensiveChainNumArcsToConsider_;
      }

      public RoutingSearchParameters.Builder setRelocateExpensiveChainNumArcsToConsider(int var1) {
         this.relocateExpensiveChainNumArcsToConsider_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearRelocateExpensiveChainNumArcsToConsider() {
         this.relocateExpensiveChainNumArcsToConsider_ = 0;
         this.onChanged();
         return this;
      }

      public int getLocalSearchMetaheuristicValue() {
         return this.localSearchMetaheuristic_;
      }

      public RoutingSearchParameters.Builder setLocalSearchMetaheuristicValue(int var1) {
         this.localSearchMetaheuristic_ = var1;
         this.onChanged();
         return this;
      }

      public LocalSearchMetaheuristic.Value getLocalSearchMetaheuristic() {
         LocalSearchMetaheuristic.Value var1 = LocalSearchMetaheuristic.Value.valueOf(this.localSearchMetaheuristic_);
         return var1 == null ? LocalSearchMetaheuristic.Value.UNRECOGNIZED : var1;
      }

      public RoutingSearchParameters.Builder setLocalSearchMetaheuristic(LocalSearchMetaheuristic.Value var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.localSearchMetaheuristic_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public RoutingSearchParameters.Builder clearLocalSearchMetaheuristic() {
         this.localSearchMetaheuristic_ = 0;
         this.onChanged();
         return this;
      }

      public double getGuidedLocalSearchLambdaCoefficient() {
         return this.guidedLocalSearchLambdaCoefficient_;
      }

      public RoutingSearchParameters.Builder setGuidedLocalSearchLambdaCoefficient(double var1) {
         this.guidedLocalSearchLambdaCoefficient_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearGuidedLocalSearchLambdaCoefficient() {
         this.guidedLocalSearchLambdaCoefficient_ = 0.0D;
         this.onChanged();
         return this;
      }

      public boolean getUseDepthFirstSearch() {
         return this.useDepthFirstSearch_;
      }

      public RoutingSearchParameters.Builder setUseDepthFirstSearch(boolean var1) {
         this.useDepthFirstSearch_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearUseDepthFirstSearch() {
         this.useDepthFirstSearch_ = false;
         this.onChanged();
         return this;
      }

      public int getUseCpValue() {
         return this.useCp_;
      }

      public RoutingSearchParameters.Builder setUseCpValue(int var1) {
         this.useCp_ = var1;
         this.onChanged();
         return this;
      }

      public OptionalBoolean getUseCp() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useCp_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public RoutingSearchParameters.Builder setUseCp(OptionalBoolean var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.useCp_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public RoutingSearchParameters.Builder clearUseCp() {
         this.useCp_ = 0;
         this.onChanged();
         return this;
      }

      public int getUseCpSatValue() {
         return this.useCpSat_;
      }

      public RoutingSearchParameters.Builder setUseCpSatValue(int var1) {
         this.useCpSat_ = var1;
         this.onChanged();
         return this;
      }

      public OptionalBoolean getUseCpSat() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useCpSat_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public RoutingSearchParameters.Builder setUseCpSat(OptionalBoolean var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.useCpSat_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public RoutingSearchParameters.Builder clearUseCpSat() {
         this.useCpSat_ = 0;
         this.onChanged();
         return this;
      }

      public double getOptimizationStep() {
         return this.optimizationStep_;
      }

      public RoutingSearchParameters.Builder setOptimizationStep(double var1) {
         this.optimizationStep_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearOptimizationStep() {
         this.optimizationStep_ = 0.0D;
         this.onChanged();
         return this;
      }

      public int getNumberOfSolutionsToCollect() {
         return this.numberOfSolutionsToCollect_;
      }

      public RoutingSearchParameters.Builder setNumberOfSolutionsToCollect(int var1) {
         this.numberOfSolutionsToCollect_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearNumberOfSolutionsToCollect() {
         this.numberOfSolutionsToCollect_ = 0;
         this.onChanged();
         return this;
      }

      public long getSolutionLimit() {
         return this.solutionLimit_;
      }

      public RoutingSearchParameters.Builder setSolutionLimit(long var1) {
         this.solutionLimit_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearSolutionLimit() {
         this.solutionLimit_ = 0L;
         this.onChanged();
         return this;
      }

      public boolean hasTimeLimit() {
         return this.timeLimitBuilder_ != null || this.timeLimit_ != null;
      }

      public Duration getTimeLimit() {
         if (this.timeLimitBuilder_ == null) {
            return this.timeLimit_ == null ? Duration.getDefaultInstance() : this.timeLimit_;
         } else {
            return (Duration)this.timeLimitBuilder_.getMessage();
         }
      }

      public RoutingSearchParameters.Builder setTimeLimit(Duration var1) {
         if (this.timeLimitBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.timeLimit_ = var1;
            this.onChanged();
         } else {
            this.timeLimitBuilder_.setMessage(var1);
         }

         return this;
      }

      public RoutingSearchParameters.Builder setTimeLimit(com.google.protobuf.Duration.Builder var1) {
         if (this.timeLimitBuilder_ == null) {
            this.timeLimit_ = var1.build();
            this.onChanged();
         } else {
            this.timeLimitBuilder_.setMessage(var1.build());
         }

         return this;
      }

      public RoutingSearchParameters.Builder mergeTimeLimit(Duration var1) {
         if (this.timeLimitBuilder_ == null) {
            if (this.timeLimit_ != null) {
               this.timeLimit_ = Duration.newBuilder(this.timeLimit_).mergeFrom(var1).buildPartial();
            } else {
               this.timeLimit_ = var1;
            }

            this.onChanged();
         } else {
            this.timeLimitBuilder_.mergeFrom(var1);
         }

         return this;
      }

      public RoutingSearchParameters.Builder clearTimeLimit() {
         if (this.timeLimitBuilder_ == null) {
            this.timeLimit_ = null;
            this.onChanged();
         } else {
            this.timeLimit_ = null;
            this.timeLimitBuilder_ = null;
         }

         return this;
      }

      public com.google.protobuf.Duration.Builder getTimeLimitBuilder() {
         this.onChanged();
         return (com.google.protobuf.Duration.Builder)this.getTimeLimitFieldBuilder().getBuilder();
      }

      public DurationOrBuilder getTimeLimitOrBuilder() {
         if (this.timeLimitBuilder_ != null) {
            return (DurationOrBuilder)this.timeLimitBuilder_.getMessageOrBuilder();
         } else {
            return this.timeLimit_ == null ? Duration.getDefaultInstance() : this.timeLimit_;
         }
      }

      private SingleFieldBuilderV3 getTimeLimitFieldBuilder() {
         if (this.timeLimitBuilder_ == null) {
            this.timeLimitBuilder_ = new SingleFieldBuilderV3(this.getTimeLimit(), this.getParentForChildren(), this.isClean());
            this.timeLimit_ = null;
         }

         return this.timeLimitBuilder_;
      }

      public boolean hasLnsTimeLimit() {
         return this.lnsTimeLimitBuilder_ != null || this.lnsTimeLimit_ != null;
      }

      public Duration getLnsTimeLimit() {
         if (this.lnsTimeLimitBuilder_ == null) {
            return this.lnsTimeLimit_ == null ? Duration.getDefaultInstance() : this.lnsTimeLimit_;
         } else {
            return (Duration)this.lnsTimeLimitBuilder_.getMessage();
         }
      }

      public RoutingSearchParameters.Builder setLnsTimeLimit(Duration var1) {
         if (this.lnsTimeLimitBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.lnsTimeLimit_ = var1;
            this.onChanged();
         } else {
            this.lnsTimeLimitBuilder_.setMessage(var1);
         }

         return this;
      }

      public RoutingSearchParameters.Builder setLnsTimeLimit(com.google.protobuf.Duration.Builder var1) {
         if (this.lnsTimeLimitBuilder_ == null) {
            this.lnsTimeLimit_ = var1.build();
            this.onChanged();
         } else {
            this.lnsTimeLimitBuilder_.setMessage(var1.build());
         }

         return this;
      }

      public RoutingSearchParameters.Builder mergeLnsTimeLimit(Duration var1) {
         if (this.lnsTimeLimitBuilder_ == null) {
            if (this.lnsTimeLimit_ != null) {
               this.lnsTimeLimit_ = Duration.newBuilder(this.lnsTimeLimit_).mergeFrom(var1).buildPartial();
            } else {
               this.lnsTimeLimit_ = var1;
            }

            this.onChanged();
         } else {
            this.lnsTimeLimitBuilder_.mergeFrom(var1);
         }

         return this;
      }

      public RoutingSearchParameters.Builder clearLnsTimeLimit() {
         if (this.lnsTimeLimitBuilder_ == null) {
            this.lnsTimeLimit_ = null;
            this.onChanged();
         } else {
            this.lnsTimeLimit_ = null;
            this.lnsTimeLimitBuilder_ = null;
         }

         return this;
      }

      public com.google.protobuf.Duration.Builder getLnsTimeLimitBuilder() {
         this.onChanged();
         return (com.google.protobuf.Duration.Builder)this.getLnsTimeLimitFieldBuilder().getBuilder();
      }

      public DurationOrBuilder getLnsTimeLimitOrBuilder() {
         if (this.lnsTimeLimitBuilder_ != null) {
            return (DurationOrBuilder)this.lnsTimeLimitBuilder_.getMessageOrBuilder();
         } else {
            return this.lnsTimeLimit_ == null ? Duration.getDefaultInstance() : this.lnsTimeLimit_;
         }
      }

      private SingleFieldBuilderV3 getLnsTimeLimitFieldBuilder() {
         if (this.lnsTimeLimitBuilder_ == null) {
            this.lnsTimeLimitBuilder_ = new SingleFieldBuilderV3(this.getLnsTimeLimit(), this.getParentForChildren(), this.isClean());
            this.lnsTimeLimit_ = null;
         }

         return this.lnsTimeLimitBuilder_;
      }

      public boolean getUseFullPropagation() {
         return this.useFullPropagation_;
      }

      public RoutingSearchParameters.Builder setUseFullPropagation(boolean var1) {
         this.useFullPropagation_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearUseFullPropagation() {
         this.useFullPropagation_ = false;
         this.onChanged();
         return this;
      }

      public boolean getLogSearch() {
         return this.logSearch_;
      }

      public RoutingSearchParameters.Builder setLogSearch(boolean var1) {
         this.logSearch_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearLogSearch() {
         this.logSearch_ = false;
         this.onChanged();
         return this;
      }

      public double getLogCostScalingFactor() {
         return this.logCostScalingFactor_;
      }

      public RoutingSearchParameters.Builder setLogCostScalingFactor(double var1) {
         this.logCostScalingFactor_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearLogCostScalingFactor() {
         this.logCostScalingFactor_ = 0.0D;
         this.onChanged();
         return this;
      }

      public double getLogCostOffset() {
         return this.logCostOffset_;
      }

      public RoutingSearchParameters.Builder setLogCostOffset(double var1) {
         this.logCostOffset_ = var1;
         this.onChanged();
         return this;
      }

      public RoutingSearchParameters.Builder clearLogCostOffset() {
         this.logCostOffset_ = 0.0D;
         this.onChanged();
         return this;
      }

      public final RoutingSearchParameters.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RoutingSearchParameters.Builder)super.setUnknownFields(var1);
      }

      public final RoutingSearchParameters.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RoutingSearchParameters.Builder)super.mergeUnknownFields(var1);
      }

      // $FF: synthetic method
      Builder(Object var1) {
         this();
      }

      // $FF: synthetic method
      Builder(BuilderParent var1, Object var2) {
         this(var1);
      }
   }

   public static final class LocalSearchNeighborhoodOperators extends GeneratedMessageV3 implements RoutingSearchParameters.LocalSearchNeighborhoodOperatorsOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int USE_RELOCATE_FIELD_NUMBER = 1;
      private int useRelocate_;
      public static final int USE_RELOCATE_PAIR_FIELD_NUMBER = 2;
      private int useRelocatePair_;
      public static final int USE_LIGHT_RELOCATE_PAIR_FIELD_NUMBER = 24;
      private int useLightRelocatePair_;
      public static final int USE_RELOCATE_NEIGHBORS_FIELD_NUMBER = 3;
      private int useRelocateNeighbors_;
      public static final int USE_RELOCATE_SUBTRIP_FIELD_NUMBER = 25;
      private int useRelocateSubtrip_;
      public static final int USE_EXCHANGE_FIELD_NUMBER = 4;
      private int useExchange_;
      public static final int USE_EXCHANGE_PAIR_FIELD_NUMBER = 22;
      private int useExchangePair_;
      public static final int USE_EXCHANGE_SUBTRIP_FIELD_NUMBER = 26;
      private int useExchangeSubtrip_;
      public static final int USE_CROSS_FIELD_NUMBER = 5;
      private int useCross_;
      public static final int USE_CROSS_EXCHANGE_FIELD_NUMBER = 6;
      private int useCrossExchange_;
      public static final int USE_RELOCATE_EXPENSIVE_CHAIN_FIELD_NUMBER = 23;
      private int useRelocateExpensiveChain_;
      public static final int USE_TWO_OPT_FIELD_NUMBER = 7;
      private int useTwoOpt_;
      public static final int USE_OR_OPT_FIELD_NUMBER = 8;
      private int useOrOpt_;
      public static final int USE_LIN_KERNIGHAN_FIELD_NUMBER = 9;
      private int useLinKernighan_;
      public static final int USE_TSP_OPT_FIELD_NUMBER = 10;
      private int useTspOpt_;
      public static final int USE_MAKE_ACTIVE_FIELD_NUMBER = 11;
      private int useMakeActive_;
      public static final int USE_RELOCATE_AND_MAKE_ACTIVE_FIELD_NUMBER = 21;
      private int useRelocateAndMakeActive_;
      public static final int USE_MAKE_INACTIVE_FIELD_NUMBER = 12;
      private int useMakeInactive_;
      public static final int USE_MAKE_CHAIN_INACTIVE_FIELD_NUMBER = 13;
      private int useMakeChainInactive_;
      public static final int USE_SWAP_ACTIVE_FIELD_NUMBER = 14;
      private int useSwapActive_;
      public static final int USE_EXTENDED_SWAP_ACTIVE_FIELD_NUMBER = 15;
      private int useExtendedSwapActive_;
      public static final int USE_NODE_PAIR_SWAP_ACTIVE_FIELD_NUMBER = 20;
      private int useNodePairSwapActive_;
      public static final int USE_PATH_LNS_FIELD_NUMBER = 16;
      private int usePathLns_;
      public static final int USE_FULL_PATH_LNS_FIELD_NUMBER = 17;
      private int useFullPathLns_;
      public static final int USE_TSP_LNS_FIELD_NUMBER = 18;
      private int useTspLns_;
      public static final int USE_INACTIVE_LNS_FIELD_NUMBER = 19;
      private int useInactiveLns_;
      private byte memoizedIsInitialized;
      private static final RoutingSearchParameters.LocalSearchNeighborhoodOperators DEFAULT_INSTANCE = new RoutingSearchParameters.LocalSearchNeighborhoodOperators();
      private static final Parser PARSER = new AbstractParser() {
         public RoutingSearchParameters.LocalSearchNeighborhoodOperators parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
            return new RoutingSearchParameters.LocalSearchNeighborhoodOperators(var1, var2);
         }
      };

      private LocalSearchNeighborhoodOperators(com.google.protobuf.GeneratedMessageV3.Builder var1) {
         super(var1);
         this.memoizedIsInitialized = -1;
      }

      private LocalSearchNeighborhoodOperators() {
         this.memoizedIsInitialized = -1;
         this.useRelocate_ = 0;
         this.useRelocatePair_ = 0;
         this.useLightRelocatePair_ = 0;
         this.useRelocateNeighbors_ = 0;
         this.useRelocateSubtrip_ = 0;
         this.useExchange_ = 0;
         this.useExchangePair_ = 0;
         this.useExchangeSubtrip_ = 0;
         this.useCross_ = 0;
         this.useCrossExchange_ = 0;
         this.useRelocateExpensiveChain_ = 0;
         this.useTwoOpt_ = 0;
         this.useOrOpt_ = 0;
         this.useLinKernighan_ = 0;
         this.useTspOpt_ = 0;
         this.useMakeActive_ = 0;
         this.useRelocateAndMakeActive_ = 0;
         this.useMakeInactive_ = 0;
         this.useMakeChainInactive_ = 0;
         this.useSwapActive_ = 0;
         this.useExtendedSwapActive_ = 0;
         this.useNodePairSwapActive_ = 0;
         this.usePathLns_ = 0;
         this.useFullPathLns_ = 0;
         this.useTspLns_ = 0;
         this.useInactiveLns_ = 0;
      }

      protected Object newInstance(UnusedPrivateParameter var1) {
         return new RoutingSearchParameters.LocalSearchNeighborhoodOperators();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private LocalSearchNeighborhoodOperators(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         this();
         if (var2 == null) {
            throw new NullPointerException();
         } else {
            com.google.protobuf.UnknownFieldSet.Builder var3 = UnknownFieldSet.newBuilder();

            try {
               boolean var4 = false;

               while(!var4) {
                  int var5 = var1.readTag();
                  int var6;
                  switch(var5) {
                  case 0:
                     var4 = true;
                     break;
                  case 8:
                     var6 = var1.readEnum();
                     this.useRelocate_ = var6;
                     break;
                  case 16:
                     var6 = var1.readEnum();
                     this.useRelocatePair_ = var6;
                     break;
                  case 24:
                     var6 = var1.readEnum();
                     this.useRelocateNeighbors_ = var6;
                     break;
                  case 32:
                     var6 = var1.readEnum();
                     this.useExchange_ = var6;
                     break;
                  case 40:
                     var6 = var1.readEnum();
                     this.useCross_ = var6;
                     break;
                  case 48:
                     var6 = var1.readEnum();
                     this.useCrossExchange_ = var6;
                     break;
                  case 56:
                     var6 = var1.readEnum();
                     this.useTwoOpt_ = var6;
                     break;
                  case 64:
                     var6 = var1.readEnum();
                     this.useOrOpt_ = var6;
                     break;
                  case 72:
                     var6 = var1.readEnum();
                     this.useLinKernighan_ = var6;
                     break;
                  case 80:
                     var6 = var1.readEnum();
                     this.useTspOpt_ = var6;
                     break;
                  case 88:
                     var6 = var1.readEnum();
                     this.useMakeActive_ = var6;
                     break;
                  case 96:
                     var6 = var1.readEnum();
                     this.useMakeInactive_ = var6;
                     break;
                  case 104:
                     var6 = var1.readEnum();
                     this.useMakeChainInactive_ = var6;
                     break;
                  case 112:
                     var6 = var1.readEnum();
                     this.useSwapActive_ = var6;
                     break;
                  case 120:
                     var6 = var1.readEnum();
                     this.useExtendedSwapActive_ = var6;
                     break;
                  case 128:
                     var6 = var1.readEnum();
                     this.usePathLns_ = var6;
                     break;
                  case 136:
                     var6 = var1.readEnum();
                     this.useFullPathLns_ = var6;
                     break;
                  case 144:
                     var6 = var1.readEnum();
                     this.useTspLns_ = var6;
                     break;
                  case 152:
                     var6 = var1.readEnum();
                     this.useInactiveLns_ = var6;
                     break;
                  case 160:
                     var6 = var1.readEnum();
                     this.useNodePairSwapActive_ = var6;
                     break;
                  case 168:
                     var6 = var1.readEnum();
                     this.useRelocateAndMakeActive_ = var6;
                     break;
                  case 176:
                     var6 = var1.readEnum();
                     this.useExchangePair_ = var6;
                     break;
                  case 184:
                     var6 = var1.readEnum();
                     this.useRelocateExpensiveChain_ = var6;
                     break;
                  case 192:
                     var6 = var1.readEnum();
                     this.useLightRelocatePair_ = var6;
                     break;
                  case 200:
                     var6 = var1.readEnum();
                     this.useRelocateSubtrip_ = var6;
                     break;
                  case 208:
                     var6 = var1.readEnum();
                     this.useExchangeSubtrip_ = var6;
                     break;
                  default:
                     if (!this.parseUnknownField(var1, var3, var2, var5)) {
                        var4 = true;
                     }
                  }
               }
            } catch (InvalidProtocolBufferException var11) {
               throw var11.setUnfinishedMessage(this);
            } catch (IOException var12) {
               throw (new InvalidProtocolBufferException(var12)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = var3.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptor getDescriptor() {
         return RoutingParameters.internal_static_operations_research_RoutingSearchParameters_LocalSearchNeighborhoodOperators_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return RoutingParameters.internal_static_operations_research_RoutingSearchParameters_LocalSearchNeighborhoodOperators_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutingSearchParameters.LocalSearchNeighborhoodOperators.class, RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder.class);
      }

      public int getUseRelocateValue() {
         return this.useRelocate_;
      }

      public OptionalBoolean getUseRelocate() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocate_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseRelocatePairValue() {
         return this.useRelocatePair_;
      }

      public OptionalBoolean getUseRelocatePair() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocatePair_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseLightRelocatePairValue() {
         return this.useLightRelocatePair_;
      }

      public OptionalBoolean getUseLightRelocatePair() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useLightRelocatePair_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseRelocateNeighborsValue() {
         return this.useRelocateNeighbors_;
      }

      public OptionalBoolean getUseRelocateNeighbors() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocateNeighbors_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseRelocateSubtripValue() {
         return this.useRelocateSubtrip_;
      }

      public OptionalBoolean getUseRelocateSubtrip() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocateSubtrip_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseExchangeValue() {
         return this.useExchange_;
      }

      public OptionalBoolean getUseExchange() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useExchange_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseExchangePairValue() {
         return this.useExchangePair_;
      }

      public OptionalBoolean getUseExchangePair() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useExchangePair_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseExchangeSubtripValue() {
         return this.useExchangeSubtrip_;
      }

      public OptionalBoolean getUseExchangeSubtrip() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useExchangeSubtrip_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseCrossValue() {
         return this.useCross_;
      }

      public OptionalBoolean getUseCross() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useCross_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseCrossExchangeValue() {
         return this.useCrossExchange_;
      }

      public OptionalBoolean getUseCrossExchange() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useCrossExchange_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseRelocateExpensiveChainValue() {
         return this.useRelocateExpensiveChain_;
      }

      public OptionalBoolean getUseRelocateExpensiveChain() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocateExpensiveChain_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseTwoOptValue() {
         return this.useTwoOpt_;
      }

      public OptionalBoolean getUseTwoOpt() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useTwoOpt_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseOrOptValue() {
         return this.useOrOpt_;
      }

      public OptionalBoolean getUseOrOpt() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useOrOpt_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseLinKernighanValue() {
         return this.useLinKernighan_;
      }

      public OptionalBoolean getUseLinKernighan() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useLinKernighan_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseTspOptValue() {
         return this.useTspOpt_;
      }

      public OptionalBoolean getUseTspOpt() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useTspOpt_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseMakeActiveValue() {
         return this.useMakeActive_;
      }

      public OptionalBoolean getUseMakeActive() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useMakeActive_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseRelocateAndMakeActiveValue() {
         return this.useRelocateAndMakeActive_;
      }

      public OptionalBoolean getUseRelocateAndMakeActive() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocateAndMakeActive_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseMakeInactiveValue() {
         return this.useMakeInactive_;
      }

      public OptionalBoolean getUseMakeInactive() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useMakeInactive_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseMakeChainInactiveValue() {
         return this.useMakeChainInactive_;
      }

      public OptionalBoolean getUseMakeChainInactive() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useMakeChainInactive_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseSwapActiveValue() {
         return this.useSwapActive_;
      }

      public OptionalBoolean getUseSwapActive() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useSwapActive_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseExtendedSwapActiveValue() {
         return this.useExtendedSwapActive_;
      }

      public OptionalBoolean getUseExtendedSwapActive() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useExtendedSwapActive_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseNodePairSwapActiveValue() {
         return this.useNodePairSwapActive_;
      }

      public OptionalBoolean getUseNodePairSwapActive() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useNodePairSwapActive_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUsePathLnsValue() {
         return this.usePathLns_;
      }

      public OptionalBoolean getUsePathLns() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.usePathLns_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseFullPathLnsValue() {
         return this.useFullPathLns_;
      }

      public OptionalBoolean getUseFullPathLns() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useFullPathLns_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseTspLnsValue() {
         return this.useTspLns_;
      }

      public OptionalBoolean getUseTspLns() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useTspLns_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public int getUseInactiveLnsValue() {
         return this.useInactiveLns_;
      }

      public OptionalBoolean getUseInactiveLns() {
         OptionalBoolean var1 = OptionalBoolean.valueOf(this.useInactiveLns_);
         return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
      }

      public final boolean isInitialized() {
         byte var1 = this.memoizedIsInitialized;
         if (var1 == 1) {
            return true;
         } else if (var1 == 0) {
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream var1) throws IOException {
         if (this.useRelocate_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(1, this.useRelocate_);
         }

         if (this.useRelocatePair_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(2, this.useRelocatePair_);
         }

         if (this.useRelocateNeighbors_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(3, this.useRelocateNeighbors_);
         }

         if (this.useExchange_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(4, this.useExchange_);
         }

         if (this.useCross_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(5, this.useCross_);
         }

         if (this.useCrossExchange_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(6, this.useCrossExchange_);
         }

         if (this.useTwoOpt_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(7, this.useTwoOpt_);
         }

         if (this.useOrOpt_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(8, this.useOrOpt_);
         }

         if (this.useLinKernighan_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(9, this.useLinKernighan_);
         }

         if (this.useTspOpt_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(10, this.useTspOpt_);
         }

         if (this.useMakeActive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(11, this.useMakeActive_);
         }

         if (this.useMakeInactive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(12, this.useMakeInactive_);
         }

         if (this.useMakeChainInactive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(13, this.useMakeChainInactive_);
         }

         if (this.useSwapActive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(14, this.useSwapActive_);
         }

         if (this.useExtendedSwapActive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(15, this.useExtendedSwapActive_);
         }

         if (this.usePathLns_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(16, this.usePathLns_);
         }

         if (this.useFullPathLns_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(17, this.useFullPathLns_);
         }

         if (this.useTspLns_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(18, this.useTspLns_);
         }

         if (this.useInactiveLns_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(19, this.useInactiveLns_);
         }

         if (this.useNodePairSwapActive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(20, this.useNodePairSwapActive_);
         }

         if (this.useRelocateAndMakeActive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(21, this.useRelocateAndMakeActive_);
         }

         if (this.useExchangePair_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(22, this.useExchangePair_);
         }

         if (this.useRelocateExpensiveChain_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(23, this.useRelocateExpensiveChain_);
         }

         if (this.useLightRelocatePair_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(24, this.useLightRelocatePair_);
         }

         if (this.useRelocateSubtrip_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(25, this.useRelocateSubtrip_);
         }

         if (this.useExchangeSubtrip_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
            var1.writeEnum(26, this.useExchangeSubtrip_);
         }

         this.unknownFields.writeTo(var1);
      }

      public int getSerializedSize() {
         int var1 = this.memoizedSize;
         if (var1 != -1) {
            return var1;
         } else {
            var1 = 0;
            if (this.useRelocate_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(1, this.useRelocate_);
            }

            if (this.useRelocatePair_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(2, this.useRelocatePair_);
            }

            if (this.useRelocateNeighbors_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(3, this.useRelocateNeighbors_);
            }

            if (this.useExchange_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(4, this.useExchange_);
            }

            if (this.useCross_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(5, this.useCross_);
            }

            if (this.useCrossExchange_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(6, this.useCrossExchange_);
            }

            if (this.useTwoOpt_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(7, this.useTwoOpt_);
            }

            if (this.useOrOpt_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(8, this.useOrOpt_);
            }

            if (this.useLinKernighan_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(9, this.useLinKernighan_);
            }

            if (this.useTspOpt_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(10, this.useTspOpt_);
            }

            if (this.useMakeActive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(11, this.useMakeActive_);
            }

            if (this.useMakeInactive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(12, this.useMakeInactive_);
            }

            if (this.useMakeChainInactive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(13, this.useMakeChainInactive_);
            }

            if (this.useSwapActive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(14, this.useSwapActive_);
            }

            if (this.useExtendedSwapActive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(15, this.useExtendedSwapActive_);
            }

            if (this.usePathLns_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(16, this.usePathLns_);
            }

            if (this.useFullPathLns_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(17, this.useFullPathLns_);
            }

            if (this.useTspLns_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(18, this.useTspLns_);
            }

            if (this.useInactiveLns_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(19, this.useInactiveLns_);
            }

            if (this.useNodePairSwapActive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(20, this.useNodePairSwapActive_);
            }

            if (this.useRelocateAndMakeActive_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(21, this.useRelocateAndMakeActive_);
            }

            if (this.useExchangePair_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(22, this.useExchangePair_);
            }

            if (this.useRelocateExpensiveChain_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(23, this.useRelocateExpensiveChain_);
            }

            if (this.useLightRelocatePair_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(24, this.useLightRelocatePair_);
            }

            if (this.useRelocateSubtrip_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(25, this.useRelocateSubtrip_);
            }

            if (this.useExchangeSubtrip_ != OptionalBoolean.BOOL_UNSPECIFIED.getNumber()) {
               var1 += CodedOutputStream.computeEnumSize(26, this.useExchangeSubtrip_);
            }

            var1 += this.unknownFields.getSerializedSize();
            this.memoizedSize = var1;
            return var1;
         }
      }

      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof RoutingSearchParameters.LocalSearchNeighborhoodOperators)) {
            return super.equals(var1);
         } else {
            RoutingSearchParameters.LocalSearchNeighborhoodOperators var2 = (RoutingSearchParameters.LocalSearchNeighborhoodOperators)var1;
            if (this.useRelocate_ != var2.useRelocate_) {
               return false;
            } else if (this.useRelocatePair_ != var2.useRelocatePair_) {
               return false;
            } else if (this.useLightRelocatePair_ != var2.useLightRelocatePair_) {
               return false;
            } else if (this.useRelocateNeighbors_ != var2.useRelocateNeighbors_) {
               return false;
            } else if (this.useRelocateSubtrip_ != var2.useRelocateSubtrip_) {
               return false;
            } else if (this.useExchange_ != var2.useExchange_) {
               return false;
            } else if (this.useExchangePair_ != var2.useExchangePair_) {
               return false;
            } else if (this.useExchangeSubtrip_ != var2.useExchangeSubtrip_) {
               return false;
            } else if (this.useCross_ != var2.useCross_) {
               return false;
            } else if (this.useCrossExchange_ != var2.useCrossExchange_) {
               return false;
            } else if (this.useRelocateExpensiveChain_ != var2.useRelocateExpensiveChain_) {
               return false;
            } else if (this.useTwoOpt_ != var2.useTwoOpt_) {
               return false;
            } else if (this.useOrOpt_ != var2.useOrOpt_) {
               return false;
            } else if (this.useLinKernighan_ != var2.useLinKernighan_) {
               return false;
            } else if (this.useTspOpt_ != var2.useTspOpt_) {
               return false;
            } else if (this.useMakeActive_ != var2.useMakeActive_) {
               return false;
            } else if (this.useRelocateAndMakeActive_ != var2.useRelocateAndMakeActive_) {
               return false;
            } else if (this.useMakeInactive_ != var2.useMakeInactive_) {
               return false;
            } else if (this.useMakeChainInactive_ != var2.useMakeChainInactive_) {
               return false;
            } else if (this.useSwapActive_ != var2.useSwapActive_) {
               return false;
            } else if (this.useExtendedSwapActive_ != var2.useExtendedSwapActive_) {
               return false;
            } else if (this.useNodePairSwapActive_ != var2.useNodePairSwapActive_) {
               return false;
            } else if (this.usePathLns_ != var2.usePathLns_) {
               return false;
            } else if (this.useFullPathLns_ != var2.useFullPathLns_) {
               return false;
            } else if (this.useTspLns_ != var2.useTspLns_) {
               return false;
            } else if (this.useInactiveLns_ != var2.useInactiveLns_) {
               return false;
            } else {
               return this.unknownFields.equals(var2.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            byte var1 = 41;
            int var2 = 19 * var1 + getDescriptor().hashCode();
            var2 = 37 * var2 + 1;
            var2 = 53 * var2 + this.useRelocate_;
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.useRelocatePair_;
            var2 = 37 * var2 + 24;
            var2 = 53 * var2 + this.useLightRelocatePair_;
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.useRelocateNeighbors_;
            var2 = 37 * var2 + 25;
            var2 = 53 * var2 + this.useRelocateSubtrip_;
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.useExchange_;
            var2 = 37 * var2 + 22;
            var2 = 53 * var2 + this.useExchangePair_;
            var2 = 37 * var2 + 26;
            var2 = 53 * var2 + this.useExchangeSubtrip_;
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.useCross_;
            var2 = 37 * var2 + 6;
            var2 = 53 * var2 + this.useCrossExchange_;
            var2 = 37 * var2 + 23;
            var2 = 53 * var2 + this.useRelocateExpensiveChain_;
            var2 = 37 * var2 + 7;
            var2 = 53 * var2 + this.useTwoOpt_;
            var2 = 37 * var2 + 8;
            var2 = 53 * var2 + this.useOrOpt_;
            var2 = 37 * var2 + 9;
            var2 = 53 * var2 + this.useLinKernighan_;
            var2 = 37 * var2 + 10;
            var2 = 53 * var2 + this.useTspOpt_;
            var2 = 37 * var2 + 11;
            var2 = 53 * var2 + this.useMakeActive_;
            var2 = 37 * var2 + 21;
            var2 = 53 * var2 + this.useRelocateAndMakeActive_;
            var2 = 37 * var2 + 12;
            var2 = 53 * var2 + this.useMakeInactive_;
            var2 = 37 * var2 + 13;
            var2 = 53 * var2 + this.useMakeChainInactive_;
            var2 = 37 * var2 + 14;
            var2 = 53 * var2 + this.useSwapActive_;
            var2 = 37 * var2 + 15;
            var2 = 53 * var2 + this.useExtendedSwapActive_;
            var2 = 37 * var2 + 20;
            var2 = 53 * var2 + this.useNodePairSwapActive_;
            var2 = 37 * var2 + 16;
            var2 = 53 * var2 + this.usePathLns_;
            var2 = 37 * var2 + 17;
            var2 = 53 * var2 + this.useFullPathLns_;
            var2 = 37 * var2 + 18;
            var2 = 53 * var2 + this.useTspLns_;
            var2 = 37 * var2 + 19;
            var2 = 53 * var2 + this.useInactiveLns_;
            var2 = 29 * var2 + this.unknownFields.hashCode();
            this.memoizedHashCode = var2;
            return var2;
         }
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)PARSER.parseFrom(var0);
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)PARSER.parseFrom(var0, var1);
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseFrom(ByteString var0) throws InvalidProtocolBufferException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)PARSER.parseFrom(var0);
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)PARSER.parseFrom(var0, var1);
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseFrom(byte[] var0) throws InvalidProtocolBufferException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)PARSER.parseFrom(var0);
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)PARSER.parseFrom(var0, var1);
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseFrom(InputStream var0) throws IOException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseDelimitedFrom(InputStream var0) throws IOException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseFrom(CodedInputStream var0) throws IOException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
         return (RoutingSearchParameters.LocalSearchNeighborhoodOperators)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder newBuilderForType() {
         return newBuilder();
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder newBuilder(RoutingSearchParameters.LocalSearchNeighborhoodOperators var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder() : (new RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder()).mergeFrom(this);
      }

      protected RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder newBuilderForType(BuilderParent var1) {
         RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder var2 = new RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder(var1);
         return var2;
      }

      @Override
      public byte[] toByteArray() {
         return new byte[0];
      }

      public static RoutingSearchParameters.LocalSearchNeighborhoodOperators getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser parser() {
         return PARSER;
      }

      public Parser getParserForType() {
         return PARSER;
      }

      public RoutingSearchParameters.LocalSearchNeighborhoodOperators getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      // $FF: synthetic method
      LocalSearchNeighborhoodOperators(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
         this(var1);
      }

      // $FF: synthetic method
      LocalSearchNeighborhoodOperators(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
         this(var1, var2);
      }

      public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements RoutingSearchParameters.LocalSearchNeighborhoodOperatorsOrBuilder {
         private int useRelocate_;
         private int useRelocatePair_;
         private int useLightRelocatePair_;
         private int useRelocateNeighbors_;
         private int useRelocateSubtrip_;
         private int useExchange_;
         private int useExchangePair_;
         private int useExchangeSubtrip_;
         private int useCross_;
         private int useCrossExchange_;
         private int useRelocateExpensiveChain_;
         private int useTwoOpt_;
         private int useOrOpt_;
         private int useLinKernighan_;
         private int useTspOpt_;
         private int useMakeActive_;
         private int useRelocateAndMakeActive_;
         private int useMakeInactive_;
         private int useMakeChainInactive_;
         private int useSwapActive_;
         private int useExtendedSwapActive_;
         private int useNodePairSwapActive_;
         private int usePathLns_;
         private int useFullPathLns_;
         private int useTspLns_;
         private int useInactiveLns_;

         public static final Descriptor getDescriptor() {
            return RoutingParameters.internal_static_operations_research_RoutingSearchParameters_LocalSearchNeighborhoodOperators_descriptor;
         }

         protected FieldAccessorTable internalGetFieldAccessorTable() {
            return RoutingParameters.internal_static_operations_research_RoutingSearchParameters_LocalSearchNeighborhoodOperators_fieldAccessorTable.ensureFieldAccessorsInitialized(RoutingSearchParameters.LocalSearchNeighborhoodOperators.class, RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder.class);
         }

         private Builder() {
            this.useRelocate_ = 0;
            this.useRelocatePair_ = 0;
            this.useLightRelocatePair_ = 0;
            this.useRelocateNeighbors_ = 0;
            this.useRelocateSubtrip_ = 0;
            this.useExchange_ = 0;
            this.useExchangePair_ = 0;
            this.useExchangeSubtrip_ = 0;
            this.useCross_ = 0;
            this.useCrossExchange_ = 0;
            this.useRelocateExpensiveChain_ = 0;
            this.useTwoOpt_ = 0;
            this.useOrOpt_ = 0;
            this.useLinKernighan_ = 0;
            this.useTspOpt_ = 0;
            this.useMakeActive_ = 0;
            this.useRelocateAndMakeActive_ = 0;
            this.useMakeInactive_ = 0;
            this.useMakeChainInactive_ = 0;
            this.useSwapActive_ = 0;
            this.useExtendedSwapActive_ = 0;
            this.useNodePairSwapActive_ = 0;
            this.usePathLns_ = 0;
            this.useFullPathLns_ = 0;
            this.useTspLns_ = 0;
            this.useInactiveLns_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(BuilderParent var1) {
            super(var1);
            this.useRelocate_ = 0;
            this.useRelocatePair_ = 0;
            this.useLightRelocatePair_ = 0;
            this.useRelocateNeighbors_ = 0;
            this.useRelocateSubtrip_ = 0;
            this.useExchange_ = 0;
            this.useExchangePair_ = 0;
            this.useExchangeSubtrip_ = 0;
            this.useCross_ = 0;
            this.useCrossExchange_ = 0;
            this.useRelocateExpensiveChain_ = 0;
            this.useTwoOpt_ = 0;
            this.useOrOpt_ = 0;
            this.useLinKernighan_ = 0;
            this.useTspOpt_ = 0;
            this.useMakeActive_ = 0;
            this.useRelocateAndMakeActive_ = 0;
            this.useMakeInactive_ = 0;
            this.useMakeChainInactive_ = 0;
            this.useSwapActive_ = 0;
            this.useExtendedSwapActive_ = 0;
            this.useNodePairSwapActive_ = 0;
            this.usePathLns_ = 0;
            this.useFullPathLns_ = 0;
            this.useTspLns_ = 0;
            this.useInactiveLns_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (RoutingSearchParameters.LocalSearchNeighborhoodOperators.alwaysUseFieldBuilders) {
            }

         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clear() {
            super.clear();
            this.useRelocate_ = 0;
            this.useRelocatePair_ = 0;
            this.useLightRelocatePair_ = 0;
            this.useRelocateNeighbors_ = 0;
            this.useRelocateSubtrip_ = 0;
            this.useExchange_ = 0;
            this.useExchangePair_ = 0;
            this.useExchangeSubtrip_ = 0;
            this.useCross_ = 0;
            this.useCrossExchange_ = 0;
            this.useRelocateExpensiveChain_ = 0;
            this.useTwoOpt_ = 0;
            this.useOrOpt_ = 0;
            this.useLinKernighan_ = 0;
            this.useTspOpt_ = 0;
            this.useMakeActive_ = 0;
            this.useRelocateAndMakeActive_ = 0;
            this.useMakeInactive_ = 0;
            this.useMakeChainInactive_ = 0;
            this.useSwapActive_ = 0;
            this.useExtendedSwapActive_ = 0;
            this.useNodePairSwapActive_ = 0;
            this.usePathLns_ = 0;
            this.useFullPathLns_ = 0;
            this.useTspLns_ = 0;
            this.useInactiveLns_ = 0;
            return this;
         }

         public Descriptor getDescriptorForType() {
            return RoutingParameters.internal_static_operations_research_RoutingSearchParameters_LocalSearchNeighborhoodOperators_descriptor;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators getDefaultInstanceForType() {
            return RoutingSearchParameters.LocalSearchNeighborhoodOperators.getDefaultInstance();
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators build() {
            RoutingSearchParameters.LocalSearchNeighborhoodOperators var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators buildPartial() {
            RoutingSearchParameters.LocalSearchNeighborhoodOperators var1 = new RoutingSearchParameters.LocalSearchNeighborhoodOperators(this);
            var1.useRelocate_ = this.useRelocate_;
            var1.useRelocatePair_ = this.useRelocatePair_;
            var1.useLightRelocatePair_ = this.useLightRelocatePair_;
            var1.useRelocateNeighbors_ = this.useRelocateNeighbors_;
            var1.useRelocateSubtrip_ = this.useRelocateSubtrip_;
            var1.useExchange_ = this.useExchange_;
            var1.useExchangePair_ = this.useExchangePair_;
            var1.useExchangeSubtrip_ = this.useExchangeSubtrip_;
            var1.useCross_ = this.useCross_;
            var1.useCrossExchange_ = this.useCrossExchange_;
            var1.useRelocateExpensiveChain_ = this.useRelocateExpensiveChain_;
            var1.useTwoOpt_ = this.useTwoOpt_;
            var1.useOrOpt_ = this.useOrOpt_;
            var1.useLinKernighan_ = this.useLinKernighan_;
            var1.useTspOpt_ = this.useTspOpt_;
            var1.useMakeActive_ = this.useMakeActive_;
            var1.useRelocateAndMakeActive_ = this.useRelocateAndMakeActive_;
            var1.useMakeInactive_ = this.useMakeInactive_;
            var1.useMakeChainInactive_ = this.useMakeChainInactive_;
            var1.useSwapActive_ = this.useSwapActive_;
            var1.useExtendedSwapActive_ = this.useExtendedSwapActive_;
            var1.useNodePairSwapActive_ = this.useNodePairSwapActive_;
            var1.usePathLns_ = this.usePathLns_;
            var1.useFullPathLns_ = this.useFullPathLns_;
            var1.useTspLns_ = this.useTspLns_;
            var1.useInactiveLns_ = this.useInactiveLns_;
            this.onBuilt();
            return var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clone() {
            return (RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder)super.clone();
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setField(FieldDescriptor var1, Object var2) {
            return (RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder)super.setField(var1, var2);
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearField(FieldDescriptor var1) {
            return (RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder)super.clearField(var1);
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearOneof(OneofDescriptor var1) {
            return (RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder)super.clearOneof(var1);
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
            return (RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
            return (RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder)super.addRepeatedField(var1, var2);
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder mergeFrom(Message var1) {
            if (var1 instanceof RoutingSearchParameters.LocalSearchNeighborhoodOperators) {
               return this.mergeFrom((RoutingSearchParameters.LocalSearchNeighborhoodOperators)var1);
            } else {
               super.mergeFrom(var1);
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder mergeFrom(RoutingSearchParameters.LocalSearchNeighborhoodOperators var1) {
            if (var1 == RoutingSearchParameters.LocalSearchNeighborhoodOperators.getDefaultInstance()) {
               return this;
            } else {
               if (var1.useRelocate_ != 0) {
                  this.setUseRelocateValue(var1.getUseRelocateValue());
               }

               if (var1.useRelocatePair_ != 0) {
                  this.setUseRelocatePairValue(var1.getUseRelocatePairValue());
               }

               if (var1.useLightRelocatePair_ != 0) {
                  this.setUseLightRelocatePairValue(var1.getUseLightRelocatePairValue());
               }

               if (var1.useRelocateNeighbors_ != 0) {
                  this.setUseRelocateNeighborsValue(var1.getUseRelocateNeighborsValue());
               }

               if (var1.useRelocateSubtrip_ != 0) {
                  this.setUseRelocateSubtripValue(var1.getUseRelocateSubtripValue());
               }

               if (var1.useExchange_ != 0) {
                  this.setUseExchangeValue(var1.getUseExchangeValue());
               }

               if (var1.useExchangePair_ != 0) {
                  this.setUseExchangePairValue(var1.getUseExchangePairValue());
               }

               if (var1.useExchangeSubtrip_ != 0) {
                  this.setUseExchangeSubtripValue(var1.getUseExchangeSubtripValue());
               }

               if (var1.useCross_ != 0) {
                  this.setUseCrossValue(var1.getUseCrossValue());
               }

               if (var1.useCrossExchange_ != 0) {
                  this.setUseCrossExchangeValue(var1.getUseCrossExchangeValue());
               }

               if (var1.useRelocateExpensiveChain_ != 0) {
                  this.setUseRelocateExpensiveChainValue(var1.getUseRelocateExpensiveChainValue());
               }

               if (var1.useTwoOpt_ != 0) {
                  this.setUseTwoOptValue(var1.getUseTwoOptValue());
               }

               if (var1.useOrOpt_ != 0) {
                  this.setUseOrOptValue(var1.getUseOrOptValue());
               }

               if (var1.useLinKernighan_ != 0) {
                  this.setUseLinKernighanValue(var1.getUseLinKernighanValue());
               }

               if (var1.useTspOpt_ != 0) {
                  this.setUseTspOptValue(var1.getUseTspOptValue());
               }

               if (var1.useMakeActive_ != 0) {
                  this.setUseMakeActiveValue(var1.getUseMakeActiveValue());
               }

               if (var1.useRelocateAndMakeActive_ != 0) {
                  this.setUseRelocateAndMakeActiveValue(var1.getUseRelocateAndMakeActiveValue());
               }

               if (var1.useMakeInactive_ != 0) {
                  this.setUseMakeInactiveValue(var1.getUseMakeInactiveValue());
               }

               if (var1.useMakeChainInactive_ != 0) {
                  this.setUseMakeChainInactiveValue(var1.getUseMakeChainInactiveValue());
               }

               if (var1.useSwapActive_ != 0) {
                  this.setUseSwapActiveValue(var1.getUseSwapActiveValue());
               }

               if (var1.useExtendedSwapActive_ != 0) {
                  this.setUseExtendedSwapActiveValue(var1.getUseExtendedSwapActiveValue());
               }

               if (var1.useNodePairSwapActive_ != 0) {
                  this.setUseNodePairSwapActiveValue(var1.getUseNodePairSwapActiveValue());
               }

               if (var1.usePathLns_ != 0) {
                  this.setUsePathLnsValue(var1.getUsePathLnsValue());
               }

               if (var1.useFullPathLns_ != 0) {
                  this.setUseFullPathLnsValue(var1.getUseFullPathLnsValue());
               }

               if (var1.useTspLns_ != 0) {
                  this.setUseTspLnsValue(var1.getUseTspLnsValue());
               }

               if (var1.useInactiveLns_ != 0) {
                  this.setUseInactiveLnsValue(var1.getUseInactiveLnsValue());
               }

               this.mergeUnknownFields(var1.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return true;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
            RoutingSearchParameters.LocalSearchNeighborhoodOperators var3 = null;

            try {
               var3 = (RoutingSearchParameters.LocalSearchNeighborhoodOperators)RoutingSearchParameters.LocalSearchNeighborhoodOperators.PARSER.parsePartialFrom(var1, var2);
            } catch (InvalidProtocolBufferException var8) {
               var3 = (RoutingSearchParameters.LocalSearchNeighborhoodOperators)var8.getUnfinishedMessage();
               throw var8.unwrapIOException();
            } finally {
               if (var3 != null) {
                  this.mergeFrom(var3);
               }

            }

            return this;
         }

         public int getUseRelocateValue() {
            return this.useRelocate_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocateValue(int var1) {
            this.useRelocate_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseRelocate() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocate_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocate(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useRelocate_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseRelocate() {
            this.useRelocate_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseRelocatePairValue() {
            return this.useRelocatePair_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocatePairValue(int var1) {
            this.useRelocatePair_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseRelocatePair() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocatePair_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocatePair(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useRelocatePair_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseRelocatePair() {
            this.useRelocatePair_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseLightRelocatePairValue() {
            return this.useLightRelocatePair_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseLightRelocatePairValue(int var1) {
            this.useLightRelocatePair_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseLightRelocatePair() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useLightRelocatePair_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseLightRelocatePair(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useLightRelocatePair_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseLightRelocatePair() {
            this.useLightRelocatePair_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseRelocateNeighborsValue() {
            return this.useRelocateNeighbors_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocateNeighborsValue(int var1) {
            this.useRelocateNeighbors_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseRelocateNeighbors() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocateNeighbors_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocateNeighbors(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useRelocateNeighbors_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseRelocateNeighbors() {
            this.useRelocateNeighbors_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseRelocateSubtripValue() {
            return this.useRelocateSubtrip_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocateSubtripValue(int var1) {
            this.useRelocateSubtrip_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseRelocateSubtrip() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocateSubtrip_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocateSubtrip(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useRelocateSubtrip_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseRelocateSubtrip() {
            this.useRelocateSubtrip_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseExchangeValue() {
            return this.useExchange_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseExchangeValue(int var1) {
            this.useExchange_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseExchange() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useExchange_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseExchange(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useExchange_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseExchange() {
            this.useExchange_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseExchangePairValue() {
            return this.useExchangePair_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseExchangePairValue(int var1) {
            this.useExchangePair_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseExchangePair() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useExchangePair_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseExchangePair(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useExchangePair_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseExchangePair() {
            this.useExchangePair_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseExchangeSubtripValue() {
            return this.useExchangeSubtrip_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseExchangeSubtripValue(int var1) {
            this.useExchangeSubtrip_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseExchangeSubtrip() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useExchangeSubtrip_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseExchangeSubtrip(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useExchangeSubtrip_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseExchangeSubtrip() {
            this.useExchangeSubtrip_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseCrossValue() {
            return this.useCross_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseCrossValue(int var1) {
            this.useCross_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseCross() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useCross_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseCross(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useCross_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseCross() {
            this.useCross_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseCrossExchangeValue() {
            return this.useCrossExchange_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseCrossExchangeValue(int var1) {
            this.useCrossExchange_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseCrossExchange() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useCrossExchange_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseCrossExchange(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useCrossExchange_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseCrossExchange() {
            this.useCrossExchange_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseRelocateExpensiveChainValue() {
            return this.useRelocateExpensiveChain_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocateExpensiveChainValue(int var1) {
            this.useRelocateExpensiveChain_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseRelocateExpensiveChain() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocateExpensiveChain_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocateExpensiveChain(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useRelocateExpensiveChain_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseRelocateExpensiveChain() {
            this.useRelocateExpensiveChain_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseTwoOptValue() {
            return this.useTwoOpt_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseTwoOptValue(int var1) {
            this.useTwoOpt_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseTwoOpt() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useTwoOpt_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseTwoOpt(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useTwoOpt_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseTwoOpt() {
            this.useTwoOpt_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseOrOptValue() {
            return this.useOrOpt_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseOrOptValue(int var1) {
            this.useOrOpt_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseOrOpt() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useOrOpt_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseOrOpt(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useOrOpt_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseOrOpt() {
            this.useOrOpt_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseLinKernighanValue() {
            return this.useLinKernighan_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseLinKernighanValue(int var1) {
            this.useLinKernighan_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseLinKernighan() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useLinKernighan_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseLinKernighan(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useLinKernighan_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseLinKernighan() {
            this.useLinKernighan_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseTspOptValue() {
            return this.useTspOpt_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseTspOptValue(int var1) {
            this.useTspOpt_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseTspOpt() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useTspOpt_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseTspOpt(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useTspOpt_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseTspOpt() {
            this.useTspOpt_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseMakeActiveValue() {
            return this.useMakeActive_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseMakeActiveValue(int var1) {
            this.useMakeActive_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseMakeActive() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useMakeActive_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseMakeActive(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useMakeActive_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseMakeActive() {
            this.useMakeActive_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseRelocateAndMakeActiveValue() {
            return this.useRelocateAndMakeActive_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocateAndMakeActiveValue(int var1) {
            this.useRelocateAndMakeActive_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseRelocateAndMakeActive() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useRelocateAndMakeActive_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseRelocateAndMakeActive(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useRelocateAndMakeActive_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseRelocateAndMakeActive() {
            this.useRelocateAndMakeActive_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseMakeInactiveValue() {
            return this.useMakeInactive_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseMakeInactiveValue(int var1) {
            this.useMakeInactive_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseMakeInactive() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useMakeInactive_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseMakeInactive(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useMakeInactive_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseMakeInactive() {
            this.useMakeInactive_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseMakeChainInactiveValue() {
            return this.useMakeChainInactive_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseMakeChainInactiveValue(int var1) {
            this.useMakeChainInactive_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseMakeChainInactive() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useMakeChainInactive_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseMakeChainInactive(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useMakeChainInactive_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseMakeChainInactive() {
            this.useMakeChainInactive_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseSwapActiveValue() {
            return this.useSwapActive_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseSwapActiveValue(int var1) {
            this.useSwapActive_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseSwapActive() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useSwapActive_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseSwapActive(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useSwapActive_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseSwapActive() {
            this.useSwapActive_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseExtendedSwapActiveValue() {
            return this.useExtendedSwapActive_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseExtendedSwapActiveValue(int var1) {
            this.useExtendedSwapActive_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseExtendedSwapActive() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useExtendedSwapActive_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseExtendedSwapActive(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useExtendedSwapActive_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseExtendedSwapActive() {
            this.useExtendedSwapActive_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseNodePairSwapActiveValue() {
            return this.useNodePairSwapActive_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseNodePairSwapActiveValue(int var1) {
            this.useNodePairSwapActive_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseNodePairSwapActive() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useNodePairSwapActive_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseNodePairSwapActive(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useNodePairSwapActive_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseNodePairSwapActive() {
            this.useNodePairSwapActive_ = 0;
            this.onChanged();
            return this;
         }

         public int getUsePathLnsValue() {
            return this.usePathLns_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUsePathLnsValue(int var1) {
            this.usePathLns_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUsePathLns() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.usePathLns_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUsePathLns(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.usePathLns_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUsePathLns() {
            this.usePathLns_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseFullPathLnsValue() {
            return this.useFullPathLns_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseFullPathLnsValue(int var1) {
            this.useFullPathLns_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseFullPathLns() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useFullPathLns_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseFullPathLns(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useFullPathLns_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseFullPathLns() {
            this.useFullPathLns_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseTspLnsValue() {
            return this.useTspLns_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseTspLnsValue(int var1) {
            this.useTspLns_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseTspLns() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useTspLns_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseTspLns(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useTspLns_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseTspLns() {
            this.useTspLns_ = 0;
            this.onChanged();
            return this;
         }

         public int getUseInactiveLnsValue() {
            return this.useInactiveLns_;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseInactiveLnsValue(int var1) {
            this.useInactiveLns_ = var1;
            this.onChanged();
            return this;
         }

         public OptionalBoolean getUseInactiveLns() {
            OptionalBoolean var1 = OptionalBoolean.valueOf(this.useInactiveLns_);
            return var1 == null ? OptionalBoolean.UNRECOGNIZED : var1;
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUseInactiveLns(OptionalBoolean var1) {
            if (var1 == null) {
               throw new NullPointerException();
            } else {
               this.useInactiveLns_ = var1.getNumber();
               this.onChanged();
               return this;
            }
         }

         public RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder clearUseInactiveLns() {
            this.useInactiveLns_ = 0;
            this.onChanged();
            return this;
         }

         public final RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder setUnknownFields(UnknownFieldSet var1) {
            return (RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder)super.setUnknownFields(var1);
         }

         public final RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (RoutingSearchParameters.LocalSearchNeighborhoodOperators.Builder)super.mergeUnknownFields(var1);
         }

         // $FF: synthetic method
         Builder(Object var1) {
            this();
         }

         // $FF: synthetic method
         Builder(BuilderParent var1, Object var2) {
            this(var1);
         }
      }
   }

   public interface LocalSearchNeighborhoodOperatorsOrBuilder extends MessageOrBuilder {
      int getUseRelocateValue();

      OptionalBoolean getUseRelocate();

      int getUseRelocatePairValue();

      OptionalBoolean getUseRelocatePair();

      int getUseLightRelocatePairValue();

      OptionalBoolean getUseLightRelocatePair();

      int getUseRelocateNeighborsValue();

      OptionalBoolean getUseRelocateNeighbors();

      int getUseRelocateSubtripValue();

      OptionalBoolean getUseRelocateSubtrip();

      int getUseExchangeValue();

      OptionalBoolean getUseExchange();

      int getUseExchangePairValue();

      OptionalBoolean getUseExchangePair();

      int getUseExchangeSubtripValue();

      OptionalBoolean getUseExchangeSubtrip();

      int getUseCrossValue();

      OptionalBoolean getUseCross();

      int getUseCrossExchangeValue();

      OptionalBoolean getUseCrossExchange();

      int getUseRelocateExpensiveChainValue();

      OptionalBoolean getUseRelocateExpensiveChain();

      int getUseTwoOptValue();

      OptionalBoolean getUseTwoOpt();

      int getUseOrOptValue();

      OptionalBoolean getUseOrOpt();

      int getUseLinKernighanValue();

      OptionalBoolean getUseLinKernighan();

      int getUseTspOptValue();

      OptionalBoolean getUseTspOpt();

      int getUseMakeActiveValue();

      OptionalBoolean getUseMakeActive();

      int getUseRelocateAndMakeActiveValue();

      OptionalBoolean getUseRelocateAndMakeActive();

      int getUseMakeInactiveValue();

      OptionalBoolean getUseMakeInactive();

      int getUseMakeChainInactiveValue();

      OptionalBoolean getUseMakeChainInactive();

      int getUseSwapActiveValue();

      OptionalBoolean getUseSwapActive();

      int getUseExtendedSwapActiveValue();

      OptionalBoolean getUseExtendedSwapActive();

      int getUseNodePairSwapActiveValue();

      OptionalBoolean getUseNodePairSwapActive();

      int getUsePathLnsValue();

      OptionalBoolean getUsePathLns();

      int getUseFullPathLnsValue();

      OptionalBoolean getUseFullPathLns();

      int getUseTspLnsValue();

      OptionalBoolean getUseTspLns();

      int getUseInactiveLnsValue();

      OptionalBoolean getUseInactiveLns();
   }
}
