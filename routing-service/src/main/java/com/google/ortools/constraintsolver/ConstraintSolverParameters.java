package com.google.ortools.constraintsolver;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.EnumDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.Internal.EnumLiteMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ConstraintSolverParameters extends GeneratedMessageV3 implements ConstraintSolverParametersOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int COMPRESS_TRAIL_FIELD_NUMBER = 1;
   private int compressTrail_;
   public static final int TRAIL_BLOCK_SIZE_FIELD_NUMBER = 2;
   private int trailBlockSize_;
   public static final int ARRAY_SPLIT_SIZE_FIELD_NUMBER = 3;
   private int arraySplitSize_;
   public static final int STORE_NAMES_FIELD_NUMBER = 4;
   private boolean storeNames_;
   public static final int NAME_CAST_VARIABLES_FIELD_NUMBER = 5;
   private boolean nameCastVariables_;
   public static final int NAME_ALL_VARIABLES_FIELD_NUMBER = 6;
   private boolean nameAllVariables_;
   public static final int PROFILE_PROPAGATION_FIELD_NUMBER = 7;
   private boolean profilePropagation_;
   public static final int PROFILE_FILE_FIELD_NUMBER = 8;
   private volatile Object profileFile_;
   public static final int PROFILE_LOCAL_SEARCH_FIELD_NUMBER = 16;
   private boolean profileLocalSearch_;
   public static final int PRINT_LOCAL_SEARCH_PROFILE_FIELD_NUMBER = 17;
   private boolean printLocalSearchProfile_;
   public static final int TRACE_PROPAGATION_FIELD_NUMBER = 9;
   private boolean tracePropagation_;
   public static final int TRACE_SEARCH_FIELD_NUMBER = 10;
   private boolean traceSearch_;
   public static final int PRINT_MODEL_FIELD_NUMBER = 11;
   private boolean printModel_;
   public static final int PRINT_MODEL_STATS_FIELD_NUMBER = 12;
   private boolean printModelStats_;
   public static final int PRINT_ADDED_CONSTRAINTS_FIELD_NUMBER = 13;
   private boolean printAddedConstraints_;
   public static final int DISABLE_SOLVE_FIELD_NUMBER = 15;
   private boolean disableSolve_;
   public static final int USE_SMALL_TABLE_FIELD_NUMBER = 101;
   private boolean useSmallTable_;
   public static final int USE_CUMULATIVE_EDGE_FINDER_FIELD_NUMBER = 105;
   private boolean useCumulativeEdgeFinder_;
   public static final int USE_CUMULATIVE_TIME_TABLE_FIELD_NUMBER = 106;
   private boolean useCumulativeTimeTable_;
   public static final int USE_CUMULATIVE_TIME_TABLE_SYNC_FIELD_NUMBER = 112;
   private boolean useCumulativeTimeTableSync_;
   public static final int USE_SEQUENCE_HIGH_DEMAND_TASKS_FIELD_NUMBER = 107;
   private boolean useSequenceHighDemandTasks_;
   public static final int USE_ALL_POSSIBLE_DISJUNCTIONS_FIELD_NUMBER = 108;
   private boolean useAllPossibleDisjunctions_;
   public static final int MAX_EDGE_FINDER_SIZE_FIELD_NUMBER = 109;
   private int maxEdgeFinderSize_;
   public static final int DIFFN_USE_CUMULATIVE_FIELD_NUMBER = 110;
   private boolean diffnUseCumulative_;
   public static final int USE_ELEMENT_RMQ_FIELD_NUMBER = 111;
   private boolean useElementRmq_;
   public static final int SKIP_LOCALLY_OPTIMAL_PATHS_FIELD_NUMBER = 113;
   private boolean skipLocallyOptimalPaths_;
   public static final int CHECK_SOLUTION_PERIOD_FIELD_NUMBER = 114;
   private int checkSolutionPeriod_;
   private byte memoizedIsInitialized;
   private static final ConstraintSolverParameters DEFAULT_INSTANCE = new ConstraintSolverParameters();
   private static final Parser PARSER = new AbstractParser() {
      public ConstraintSolverParameters parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new ConstraintSolverParameters(var1, var2);
      }
   };

   private ConstraintSolverParameters(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.memoizedIsInitialized = -1;
   }

   private ConstraintSolverParameters() {
      this.memoizedIsInitialized = -1;
      this.compressTrail_ = 0;
      this.profileFile_ = "";
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new ConstraintSolverParameters();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private ConstraintSolverParameters(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         com.google.protobuf.UnknownFieldSet.Builder var3 = UnknownFieldSet.newBuilder();

         try {
            boolean var4 = false;

            while(!var4) {
               int var5 = var1.readTag();
               switch(var5) {
               case 0:
                  var4 = true;
                  break;
               case 8:
                  int var14 = var1.readEnum();
                  this.compressTrail_ = var14;
                  break;
               case 16:
                  this.trailBlockSize_ = var1.readInt32();
                  break;
               case 24:
                  this.arraySplitSize_ = var1.readInt32();
                  break;
               case 32:
                  this.storeNames_ = var1.readBool();
                  break;
               case 40:
                  this.nameCastVariables_ = var1.readBool();
                  break;
               case 48:
                  this.nameAllVariables_ = var1.readBool();
                  break;
               case 56:
                  this.profilePropagation_ = var1.readBool();
                  break;
               case 66:
                  String var6 = var1.readStringRequireUtf8();
                  this.profileFile_ = var6;
                  break;
               case 72:
                  this.tracePropagation_ = var1.readBool();
                  break;
               case 80:
                  this.traceSearch_ = var1.readBool();
                  break;
               case 88:
                  this.printModel_ = var1.readBool();
                  break;
               case 96:
                  this.printModelStats_ = var1.readBool();
                  break;
               case 104:
                  this.printAddedConstraints_ = var1.readBool();
                  break;
               case 120:
                  this.disableSolve_ = var1.readBool();
                  break;
               case 128:
                  this.profileLocalSearch_ = var1.readBool();
                  break;
               case 136:
                  this.printLocalSearchProfile_ = var1.readBool();
                  break;
               case 808:
                  this.useSmallTable_ = var1.readBool();
                  break;
               case 840:
                  this.useCumulativeEdgeFinder_ = var1.readBool();
                  break;
               case 848:
                  this.useCumulativeTimeTable_ = var1.readBool();
                  break;
               case 856:
                  this.useSequenceHighDemandTasks_ = var1.readBool();
                  break;
               case 864:
                  this.useAllPossibleDisjunctions_ = var1.readBool();
                  break;
               case 872:
                  this.maxEdgeFinderSize_ = var1.readInt32();
                  break;
               case 880:
                  this.diffnUseCumulative_ = var1.readBool();
                  break;
               case 888:
                  this.useElementRmq_ = var1.readBool();
                  break;
               case 896:
                  this.useCumulativeTimeTableSync_ = var1.readBool();
                  break;
               case 904:
                  this.skipLocallyOptimalPaths_ = var1.readBool();
                  break;
               case 912:
                  this.checkSolutionPeriod_ = var1.readInt32();
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
      return SolverParameters.internal_static_operations_research_ConstraintSolverParameters_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return SolverParameters.internal_static_operations_research_ConstraintSolverParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(ConstraintSolverParameters.class, ConstraintSolverParameters.Builder.class);
   }

   public int getCompressTrailValue() {
      return this.compressTrail_;
   }

   public ConstraintSolverParameters.TrailCompression getCompressTrail() {
      ConstraintSolverParameters.TrailCompression var1 = ConstraintSolverParameters.TrailCompression.valueOf(this.compressTrail_);
      return var1 == null ? ConstraintSolverParameters.TrailCompression.UNRECOGNIZED : var1;
   }

   public int getTrailBlockSize() {
      return this.trailBlockSize_;
   }

   public int getArraySplitSize() {
      return this.arraySplitSize_;
   }

   public boolean getStoreNames() {
      return this.storeNames_;
   }

   public boolean getNameCastVariables() {
      return this.nameCastVariables_;
   }

   public boolean getNameAllVariables() {
      return this.nameAllVariables_;
   }

   public boolean getProfilePropagation() {
      return this.profilePropagation_;
   }

   public String getProfileFile() {
      Object var1 = this.profileFile_;
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.profileFile_ = var3;
         return var3;
      }
   }

   public ByteString getProfileFileBytes() {
      Object var1 = this.profileFile_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.profileFile_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   public boolean getProfileLocalSearch() {
      return this.profileLocalSearch_;
   }

   public boolean getPrintLocalSearchProfile() {
      return this.printLocalSearchProfile_;
   }

   public boolean getTracePropagation() {
      return this.tracePropagation_;
   }

   public boolean getTraceSearch() {
      return this.traceSearch_;
   }

   public boolean getPrintModel() {
      return this.printModel_;
   }

   public boolean getPrintModelStats() {
      return this.printModelStats_;
   }

   public boolean getPrintAddedConstraints() {
      return this.printAddedConstraints_;
   }

   public boolean getDisableSolve() {
      return this.disableSolve_;
   }

   public boolean getUseSmallTable() {
      return this.useSmallTable_;
   }

   public boolean getUseCumulativeEdgeFinder() {
      return this.useCumulativeEdgeFinder_;
   }

   public boolean getUseCumulativeTimeTable() {
      return this.useCumulativeTimeTable_;
   }

   public boolean getUseCumulativeTimeTableSync() {
      return this.useCumulativeTimeTableSync_;
   }

   public boolean getUseSequenceHighDemandTasks() {
      return this.useSequenceHighDemandTasks_;
   }

   public boolean getUseAllPossibleDisjunctions() {
      return this.useAllPossibleDisjunctions_;
   }

   public int getMaxEdgeFinderSize() {
      return this.maxEdgeFinderSize_;
   }

   public boolean getDiffnUseCumulative() {
      return this.diffnUseCumulative_;
   }

   public boolean getUseElementRmq() {
      return this.useElementRmq_;
   }

   public boolean getSkipLocallyOptimalPaths() {
      return this.skipLocallyOptimalPaths_;
   }

   public int getCheckSolutionPeriod() {
      return this.checkSolutionPeriod_;
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
      if (this.compressTrail_ != ConstraintSolverParameters.TrailCompression.NO_COMPRESSION.getNumber()) {
         var1.writeEnum(1, this.compressTrail_);
      }

      if (this.trailBlockSize_ != 0) {
         var1.writeInt32(2, this.trailBlockSize_);
      }

      if (this.arraySplitSize_ != 0) {
         var1.writeInt32(3, this.arraySplitSize_);
      }

      if (this.storeNames_) {
         var1.writeBool(4, this.storeNames_);
      }

      if (this.nameCastVariables_) {
         var1.writeBool(5, this.nameCastVariables_);
      }

      if (this.nameAllVariables_) {
         var1.writeBool(6, this.nameAllVariables_);
      }

      if (this.profilePropagation_) {
         var1.writeBool(7, this.profilePropagation_);
      }

      if (!this.getProfileFileBytes().isEmpty()) {
         GeneratedMessageV3.writeString(var1, 8, this.profileFile_);
      }

      if (this.tracePropagation_) {
         var1.writeBool(9, this.tracePropagation_);
      }

      if (this.traceSearch_) {
         var1.writeBool(10, this.traceSearch_);
      }

      if (this.printModel_) {
         var1.writeBool(11, this.printModel_);
      }

      if (this.printModelStats_) {
         var1.writeBool(12, this.printModelStats_);
      }

      if (this.printAddedConstraints_) {
         var1.writeBool(13, this.printAddedConstraints_);
      }

      if (this.disableSolve_) {
         var1.writeBool(15, this.disableSolve_);
      }

      if (this.profileLocalSearch_) {
         var1.writeBool(16, this.profileLocalSearch_);
      }

      if (this.printLocalSearchProfile_) {
         var1.writeBool(17, this.printLocalSearchProfile_);
      }

      if (this.useSmallTable_) {
         var1.writeBool(101, this.useSmallTable_);
      }

      if (this.useCumulativeEdgeFinder_) {
         var1.writeBool(105, this.useCumulativeEdgeFinder_);
      }

      if (this.useCumulativeTimeTable_) {
         var1.writeBool(106, this.useCumulativeTimeTable_);
      }

      if (this.useSequenceHighDemandTasks_) {
         var1.writeBool(107, this.useSequenceHighDemandTasks_);
      }

      if (this.useAllPossibleDisjunctions_) {
         var1.writeBool(108, this.useAllPossibleDisjunctions_);
      }

      if (this.maxEdgeFinderSize_ != 0) {
         var1.writeInt32(109, this.maxEdgeFinderSize_);
      }

      if (this.diffnUseCumulative_) {
         var1.writeBool(110, this.diffnUseCumulative_);
      }

      if (this.useElementRmq_) {
         var1.writeBool(111, this.useElementRmq_);
      }

      if (this.useCumulativeTimeTableSync_) {
         var1.writeBool(112, this.useCumulativeTimeTableSync_);
      }

      if (this.skipLocallyOptimalPaths_) {
         var1.writeBool(113, this.skipLocallyOptimalPaths_);
      }

      if (this.checkSolutionPeriod_ != 0) {
         var1.writeInt32(114, this.checkSolutionPeriod_);
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (this.compressTrail_ != ConstraintSolverParameters.TrailCompression.NO_COMPRESSION.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(1, this.compressTrail_);
         }

         if (this.trailBlockSize_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(2, this.trailBlockSize_);
         }

         if (this.arraySplitSize_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(3, this.arraySplitSize_);
         }

         if (this.storeNames_) {
            var1 += CodedOutputStream.computeBoolSize(4, this.storeNames_);
         }

         if (this.nameCastVariables_) {
            var1 += CodedOutputStream.computeBoolSize(5, this.nameCastVariables_);
         }

         if (this.nameAllVariables_) {
            var1 += CodedOutputStream.computeBoolSize(6, this.nameAllVariables_);
         }

         if (this.profilePropagation_) {
            var1 += CodedOutputStream.computeBoolSize(7, this.profilePropagation_);
         }

         if (!this.getProfileFileBytes().isEmpty()) {
            var1 += GeneratedMessageV3.computeStringSize(8, this.profileFile_);
         }

         if (this.tracePropagation_) {
            var1 += CodedOutputStream.computeBoolSize(9, this.tracePropagation_);
         }

         if (this.traceSearch_) {
            var1 += CodedOutputStream.computeBoolSize(10, this.traceSearch_);
         }

         if (this.printModel_) {
            var1 += CodedOutputStream.computeBoolSize(11, this.printModel_);
         }

         if (this.printModelStats_) {
            var1 += CodedOutputStream.computeBoolSize(12, this.printModelStats_);
         }

         if (this.printAddedConstraints_) {
            var1 += CodedOutputStream.computeBoolSize(13, this.printAddedConstraints_);
         }

         if (this.disableSolve_) {
            var1 += CodedOutputStream.computeBoolSize(15, this.disableSolve_);
         }

         if (this.profileLocalSearch_) {
            var1 += CodedOutputStream.computeBoolSize(16, this.profileLocalSearch_);
         }

         if (this.printLocalSearchProfile_) {
            var1 += CodedOutputStream.computeBoolSize(17, this.printLocalSearchProfile_);
         }

         if (this.useSmallTable_) {
            var1 += CodedOutputStream.computeBoolSize(101, this.useSmallTable_);
         }

         if (this.useCumulativeEdgeFinder_) {
            var1 += CodedOutputStream.computeBoolSize(105, this.useCumulativeEdgeFinder_);
         }

         if (this.useCumulativeTimeTable_) {
            var1 += CodedOutputStream.computeBoolSize(106, this.useCumulativeTimeTable_);
         }

         if (this.useSequenceHighDemandTasks_) {
            var1 += CodedOutputStream.computeBoolSize(107, this.useSequenceHighDemandTasks_);
         }

         if (this.useAllPossibleDisjunctions_) {
            var1 += CodedOutputStream.computeBoolSize(108, this.useAllPossibleDisjunctions_);
         }

         if (this.maxEdgeFinderSize_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(109, this.maxEdgeFinderSize_);
         }

         if (this.diffnUseCumulative_) {
            var1 += CodedOutputStream.computeBoolSize(110, this.diffnUseCumulative_);
         }

         if (this.useElementRmq_) {
            var1 += CodedOutputStream.computeBoolSize(111, this.useElementRmq_);
         }

         if (this.useCumulativeTimeTableSync_) {
            var1 += CodedOutputStream.computeBoolSize(112, this.useCumulativeTimeTableSync_);
         }

         if (this.skipLocallyOptimalPaths_) {
            var1 += CodedOutputStream.computeBoolSize(113, this.skipLocallyOptimalPaths_);
         }

         if (this.checkSolutionPeriod_ != 0) {
            var1 += CodedOutputStream.computeInt32Size(114, this.checkSolutionPeriod_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConstraintSolverParameters)) {
         return super.equals(var1);
      } else {
         ConstraintSolverParameters var2 = (ConstraintSolverParameters)var1;
         if (this.compressTrail_ != var2.compressTrail_) {
            return false;
         } else if (this.getTrailBlockSize() != var2.getTrailBlockSize()) {
            return false;
         } else if (this.getArraySplitSize() != var2.getArraySplitSize()) {
            return false;
         } else if (this.getStoreNames() != var2.getStoreNames()) {
            return false;
         } else if (this.getNameCastVariables() != var2.getNameCastVariables()) {
            return false;
         } else if (this.getNameAllVariables() != var2.getNameAllVariables()) {
            return false;
         } else if (this.getProfilePropagation() != var2.getProfilePropagation()) {
            return false;
         } else if (!this.getProfileFile().equals(var2.getProfileFile())) {
            return false;
         } else if (this.getProfileLocalSearch() != var2.getProfileLocalSearch()) {
            return false;
         } else if (this.getPrintLocalSearchProfile() != var2.getPrintLocalSearchProfile()) {
            return false;
         } else if (this.getTracePropagation() != var2.getTracePropagation()) {
            return false;
         } else if (this.getTraceSearch() != var2.getTraceSearch()) {
            return false;
         } else if (this.getPrintModel() != var2.getPrintModel()) {
            return false;
         } else if (this.getPrintModelStats() != var2.getPrintModelStats()) {
            return false;
         } else if (this.getPrintAddedConstraints() != var2.getPrintAddedConstraints()) {
            return false;
         } else if (this.getDisableSolve() != var2.getDisableSolve()) {
            return false;
         } else if (this.getUseSmallTable() != var2.getUseSmallTable()) {
            return false;
         } else if (this.getUseCumulativeEdgeFinder() != var2.getUseCumulativeEdgeFinder()) {
            return false;
         } else if (this.getUseCumulativeTimeTable() != var2.getUseCumulativeTimeTable()) {
            return false;
         } else if (this.getUseCumulativeTimeTableSync() != var2.getUseCumulativeTimeTableSync()) {
            return false;
         } else if (this.getUseSequenceHighDemandTasks() != var2.getUseSequenceHighDemandTasks()) {
            return false;
         } else if (this.getUseAllPossibleDisjunctions() != var2.getUseAllPossibleDisjunctions()) {
            return false;
         } else if (this.getMaxEdgeFinderSize() != var2.getMaxEdgeFinderSize()) {
            return false;
         } else if (this.getDiffnUseCumulative() != var2.getDiffnUseCumulative()) {
            return false;
         } else if (this.getUseElementRmq() != var2.getUseElementRmq()) {
            return false;
         } else if (this.getSkipLocallyOptimalPaths() != var2.getSkipLocallyOptimalPaths()) {
            return false;
         } else if (this.getCheckSolutionPeriod() != var2.getCheckSolutionPeriod()) {
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
         var2 = 53 * var2 + this.compressTrail_;
         var2 = 37 * var2 + 2;
         var2 = 53 * var2 + this.getTrailBlockSize();
         var2 = 37 * var2 + 3;
         var2 = 53 * var2 + this.getArraySplitSize();
         var2 = 37 * var2 + 4;
         var2 = 53 * var2 + Internal.hashBoolean(this.getStoreNames());
         var2 = 37 * var2 + 5;
         var2 = 53 * var2 + Internal.hashBoolean(this.getNameCastVariables());
         var2 = 37 * var2 + 6;
         var2 = 53 * var2 + Internal.hashBoolean(this.getNameAllVariables());
         var2 = 37 * var2 + 7;
         var2 = 53 * var2 + Internal.hashBoolean(this.getProfilePropagation());
         var2 = 37 * var2 + 8;
         var2 = 53 * var2 + this.getProfileFile().hashCode();
         var2 = 37 * var2 + 16;
         var2 = 53 * var2 + Internal.hashBoolean(this.getProfileLocalSearch());
         var2 = 37 * var2 + 17;
         var2 = 53 * var2 + Internal.hashBoolean(this.getPrintLocalSearchProfile());
         var2 = 37 * var2 + 9;
         var2 = 53 * var2 + Internal.hashBoolean(this.getTracePropagation());
         var2 = 37 * var2 + 10;
         var2 = 53 * var2 + Internal.hashBoolean(this.getTraceSearch());
         var2 = 37 * var2 + 11;
         var2 = 53 * var2 + Internal.hashBoolean(this.getPrintModel());
         var2 = 37 * var2 + 12;
         var2 = 53 * var2 + Internal.hashBoolean(this.getPrintModelStats());
         var2 = 37 * var2 + 13;
         var2 = 53 * var2 + Internal.hashBoolean(this.getPrintAddedConstraints());
         var2 = 37 * var2 + 15;
         var2 = 53 * var2 + Internal.hashBoolean(this.getDisableSolve());
         var2 = 37 * var2 + 101;
         var2 = 53 * var2 + Internal.hashBoolean(this.getUseSmallTable());
         var2 = 37 * var2 + 105;
         var2 = 53 * var2 + Internal.hashBoolean(this.getUseCumulativeEdgeFinder());
         var2 = 37 * var2 + 106;
         var2 = 53 * var2 + Internal.hashBoolean(this.getUseCumulativeTimeTable());
         var2 = 37 * var2 + 112;
         var2 = 53 * var2 + Internal.hashBoolean(this.getUseCumulativeTimeTableSync());
         var2 = 37 * var2 + 107;
         var2 = 53 * var2 + Internal.hashBoolean(this.getUseSequenceHighDemandTasks());
         var2 = 37 * var2 + 108;
         var2 = 53 * var2 + Internal.hashBoolean(this.getUseAllPossibleDisjunctions());
         var2 = 37 * var2 + 109;
         var2 = 53 * var2 + this.getMaxEdgeFinderSize();
         var2 = 37 * var2 + 110;
         var2 = 53 * var2 + Internal.hashBoolean(this.getDiffnUseCumulative());
         var2 = 37 * var2 + 111;
         var2 = 53 * var2 + Internal.hashBoolean(this.getUseElementRmq());
         var2 = 37 * var2 + 113;
         var2 = 53 * var2 + Internal.hashBoolean(this.getSkipLocallyOptimalPaths());
         var2 = 37 * var2 + 114;
         var2 = 53 * var2 + this.getCheckSolutionPeriod();
         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static ConstraintSolverParameters parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (ConstraintSolverParameters)PARSER.parseFrom(var0);
   }

   public static ConstraintSolverParameters parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ConstraintSolverParameters)PARSER.parseFrom(var0, var1);
   }

   public static ConstraintSolverParameters parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (ConstraintSolverParameters)PARSER.parseFrom(var0);
   }

   public static ConstraintSolverParameters parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ConstraintSolverParameters)PARSER.parseFrom(var0, var1);
   }

   public static ConstraintSolverParameters parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (ConstraintSolverParameters)PARSER.parseFrom(var0);
   }

   public static ConstraintSolverParameters parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ConstraintSolverParameters)PARSER.parseFrom(var0, var1);
   }

   public static ConstraintSolverParameters parseFrom(InputStream var0) throws IOException {
      return (ConstraintSolverParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConstraintSolverParameters parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ConstraintSolverParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConstraintSolverParameters parseDelimitedFrom(InputStream var0) throws IOException {
      return (ConstraintSolverParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConstraintSolverParameters parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ConstraintSolverParameters)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConstraintSolverParameters parseFrom(CodedInputStream var0) throws IOException {
      return (ConstraintSolverParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConstraintSolverParameters parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ConstraintSolverParameters)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConstraintSolverParameters.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConstraintSolverParameters.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConstraintSolverParameters.Builder newBuilder(ConstraintSolverParameters var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConstraintSolverParameters.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConstraintSolverParameters.Builder() : (new ConstraintSolverParameters.Builder()).mergeFrom(this);
   }

   protected ConstraintSolverParameters.Builder newBuilderForType(BuilderParent var1) {
      ConstraintSolverParameters.Builder var2 = new ConstraintSolverParameters.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static ConstraintSolverParameters getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public ConstraintSolverParameters getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   ConstraintSolverParameters(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   ConstraintSolverParameters(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements ConstraintSolverParametersOrBuilder {
      private int compressTrail_;
      private int trailBlockSize_;
      private int arraySplitSize_;
      private boolean storeNames_;
      private boolean nameCastVariables_;
      private boolean nameAllVariables_;
      private boolean profilePropagation_;
      private Object profileFile_;
      private boolean profileLocalSearch_;
      private boolean printLocalSearchProfile_;
      private boolean tracePropagation_;
      private boolean traceSearch_;
      private boolean printModel_;
      private boolean printModelStats_;
      private boolean printAddedConstraints_;
      private boolean disableSolve_;
      private boolean useSmallTable_;
      private boolean useCumulativeEdgeFinder_;
      private boolean useCumulativeTimeTable_;
      private boolean useCumulativeTimeTableSync_;
      private boolean useSequenceHighDemandTasks_;
      private boolean useAllPossibleDisjunctions_;
      private int maxEdgeFinderSize_;
      private boolean diffnUseCumulative_;
      private boolean useElementRmq_;
      private boolean skipLocallyOptimalPaths_;
      private int checkSolutionPeriod_;

      public static final Descriptor getDescriptor() {
         return SolverParameters.internal_static_operations_research_ConstraintSolverParameters_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return SolverParameters.internal_static_operations_research_ConstraintSolverParameters_fieldAccessorTable.ensureFieldAccessorsInitialized(ConstraintSolverParameters.class, ConstraintSolverParameters.Builder.class);
      }

      private Builder() {
         this.compressTrail_ = 0;
         this.profileFile_ = "";
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.compressTrail_ = 0;
         this.profileFile_ = "";
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConstraintSolverParameters.alwaysUseFieldBuilders) {
         }

      }

      public ConstraintSolverParameters.Builder clear() {
         super.clear();
         this.compressTrail_ = 0;
         this.trailBlockSize_ = 0;
         this.arraySplitSize_ = 0;
         this.storeNames_ = false;
         this.nameCastVariables_ = false;
         this.nameAllVariables_ = false;
         this.profilePropagation_ = false;
         this.profileFile_ = "";
         this.profileLocalSearch_ = false;
         this.printLocalSearchProfile_ = false;
         this.tracePropagation_ = false;
         this.traceSearch_ = false;
         this.printModel_ = false;
         this.printModelStats_ = false;
         this.printAddedConstraints_ = false;
         this.disableSolve_ = false;
         this.useSmallTable_ = false;
         this.useCumulativeEdgeFinder_ = false;
         this.useCumulativeTimeTable_ = false;
         this.useCumulativeTimeTableSync_ = false;
         this.useSequenceHighDemandTasks_ = false;
         this.useAllPossibleDisjunctions_ = false;
         this.maxEdgeFinderSize_ = 0;
         this.diffnUseCumulative_ = false;
         this.useElementRmq_ = false;
         this.skipLocallyOptimalPaths_ = false;
         this.checkSolutionPeriod_ = 0;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return SolverParameters.internal_static_operations_research_ConstraintSolverParameters_descriptor;
      }

      public ConstraintSolverParameters getDefaultInstanceForType() {
         return ConstraintSolverParameters.getDefaultInstance();
      }

      public ConstraintSolverParameters build() {
         ConstraintSolverParameters var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConstraintSolverParameters buildPartial() {
         ConstraintSolverParameters var1 = new ConstraintSolverParameters(this);
         var1.compressTrail_ = this.compressTrail_;
         var1.trailBlockSize_ = this.trailBlockSize_;
         var1.arraySplitSize_ = this.arraySplitSize_;
         var1.storeNames_ = this.storeNames_;
         var1.nameCastVariables_ = this.nameCastVariables_;
         var1.nameAllVariables_ = this.nameAllVariables_;
         var1.profilePropagation_ = this.profilePropagation_;
         var1.profileFile_ = this.profileFile_;
         var1.profileLocalSearch_ = this.profileLocalSearch_;
         var1.printLocalSearchProfile_ = this.printLocalSearchProfile_;
         var1.tracePropagation_ = this.tracePropagation_;
         var1.traceSearch_ = this.traceSearch_;
         var1.printModel_ = this.printModel_;
         var1.printModelStats_ = this.printModelStats_;
         var1.printAddedConstraints_ = this.printAddedConstraints_;
         var1.disableSolve_ = this.disableSolve_;
         var1.useSmallTable_ = this.useSmallTable_;
         var1.useCumulativeEdgeFinder_ = this.useCumulativeEdgeFinder_;
         var1.useCumulativeTimeTable_ = this.useCumulativeTimeTable_;
         var1.useCumulativeTimeTableSync_ = this.useCumulativeTimeTableSync_;
         var1.useSequenceHighDemandTasks_ = this.useSequenceHighDemandTasks_;
         var1.useAllPossibleDisjunctions_ = this.useAllPossibleDisjunctions_;
         var1.maxEdgeFinderSize_ = this.maxEdgeFinderSize_;
         var1.diffnUseCumulative_ = this.diffnUseCumulative_;
         var1.useElementRmq_ = this.useElementRmq_;
         var1.skipLocallyOptimalPaths_ = this.skipLocallyOptimalPaths_;
         var1.checkSolutionPeriod_ = this.checkSolutionPeriod_;
         this.onBuilt();
         return var1;
      }

      public ConstraintSolverParameters.Builder clone() {
         return (ConstraintSolverParameters.Builder)super.clone();
      }

      public ConstraintSolverParameters.Builder setField(FieldDescriptor var1, Object var2) {
         return (ConstraintSolverParameters.Builder)super.setField(var1, var2);
      }

      public ConstraintSolverParameters.Builder clearField(FieldDescriptor var1) {
         return (ConstraintSolverParameters.Builder)super.clearField(var1);
      }

      public ConstraintSolverParameters.Builder clearOneof(OneofDescriptor var1) {
         return (ConstraintSolverParameters.Builder)super.clearOneof(var1);
      }

      public ConstraintSolverParameters.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (ConstraintSolverParameters.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConstraintSolverParameters.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (ConstraintSolverParameters.Builder)super.addRepeatedField(var1, var2);
      }

      public ConstraintSolverParameters.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConstraintSolverParameters) {
            return this.mergeFrom((ConstraintSolverParameters)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public ConstraintSolverParameters.Builder mergeFrom(ConstraintSolverParameters var1) {
         if (var1 == ConstraintSolverParameters.getDefaultInstance()) {
            return this;
         } else {
            if (var1.compressTrail_ != 0) {
               this.setCompressTrailValue(var1.getCompressTrailValue());
            }

            if (var1.getTrailBlockSize() != 0) {
               this.setTrailBlockSize(var1.getTrailBlockSize());
            }

            if (var1.getArraySplitSize() != 0) {
               this.setArraySplitSize(var1.getArraySplitSize());
            }

            if (var1.getStoreNames()) {
               this.setStoreNames(var1.getStoreNames());
            }

            if (var1.getNameCastVariables()) {
               this.setNameCastVariables(var1.getNameCastVariables());
            }

            if (var1.getNameAllVariables()) {
               this.setNameAllVariables(var1.getNameAllVariables());
            }

            if (var1.getProfilePropagation()) {
               this.setProfilePropagation(var1.getProfilePropagation());
            }

            if (!var1.getProfileFile().isEmpty()) {
               this.profileFile_ = var1.profileFile_;
               this.onChanged();
            }

            if (var1.getProfileLocalSearch()) {
               this.setProfileLocalSearch(var1.getProfileLocalSearch());
            }

            if (var1.getPrintLocalSearchProfile()) {
               this.setPrintLocalSearchProfile(var1.getPrintLocalSearchProfile());
            }

            if (var1.getTracePropagation()) {
               this.setTracePropagation(var1.getTracePropagation());
            }

            if (var1.getTraceSearch()) {
               this.setTraceSearch(var1.getTraceSearch());
            }

            if (var1.getPrintModel()) {
               this.setPrintModel(var1.getPrintModel());
            }

            if (var1.getPrintModelStats()) {
               this.setPrintModelStats(var1.getPrintModelStats());
            }

            if (var1.getPrintAddedConstraints()) {
               this.setPrintAddedConstraints(var1.getPrintAddedConstraints());
            }

            if (var1.getDisableSolve()) {
               this.setDisableSolve(var1.getDisableSolve());
            }

            if (var1.getUseSmallTable()) {
               this.setUseSmallTable(var1.getUseSmallTable());
            }

            if (var1.getUseCumulativeEdgeFinder()) {
               this.setUseCumulativeEdgeFinder(var1.getUseCumulativeEdgeFinder());
            }

            if (var1.getUseCumulativeTimeTable()) {
               this.setUseCumulativeTimeTable(var1.getUseCumulativeTimeTable());
            }

            if (var1.getUseCumulativeTimeTableSync()) {
               this.setUseCumulativeTimeTableSync(var1.getUseCumulativeTimeTableSync());
            }

            if (var1.getUseSequenceHighDemandTasks()) {
               this.setUseSequenceHighDemandTasks(var1.getUseSequenceHighDemandTasks());
            }

            if (var1.getUseAllPossibleDisjunctions()) {
               this.setUseAllPossibleDisjunctions(var1.getUseAllPossibleDisjunctions());
            }

            if (var1.getMaxEdgeFinderSize() != 0) {
               this.setMaxEdgeFinderSize(var1.getMaxEdgeFinderSize());
            }

            if (var1.getDiffnUseCumulative()) {
               this.setDiffnUseCumulative(var1.getDiffnUseCumulative());
            }

            if (var1.getUseElementRmq()) {
               this.setUseElementRmq(var1.getUseElementRmq());
            }

            if (var1.getSkipLocallyOptimalPaths()) {
               this.setSkipLocallyOptimalPaths(var1.getSkipLocallyOptimalPaths());
            }

            if (var1.getCheckSolutionPeriod() != 0) {
               this.setCheckSolutionPeriod(var1.getCheckSolutionPeriod());
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public ConstraintSolverParameters.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         ConstraintSolverParameters var3 = null;

         try {
            var3 = (ConstraintSolverParameters)ConstraintSolverParameters.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (ConstraintSolverParameters)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public int getCompressTrailValue() {
         return this.compressTrail_;
      }

      public ConstraintSolverParameters.Builder setCompressTrailValue(int var1) {
         this.compressTrail_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.TrailCompression getCompressTrail() {
         ConstraintSolverParameters.TrailCompression var1 = ConstraintSolverParameters.TrailCompression.valueOf(this.compressTrail_);
         return var1 == null ? ConstraintSolverParameters.TrailCompression.UNRECOGNIZED : var1;
      }

      public ConstraintSolverParameters.Builder setCompressTrail(ConstraintSolverParameters.TrailCompression var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.compressTrail_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public ConstraintSolverParameters.Builder clearCompressTrail() {
         this.compressTrail_ = 0;
         this.onChanged();
         return this;
      }

      public int getTrailBlockSize() {
         return this.trailBlockSize_;
      }

      public ConstraintSolverParameters.Builder setTrailBlockSize(int var1) {
         this.trailBlockSize_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearTrailBlockSize() {
         this.trailBlockSize_ = 0;
         this.onChanged();
         return this;
      }

      public int getArraySplitSize() {
         return this.arraySplitSize_;
      }

      public ConstraintSolverParameters.Builder setArraySplitSize(int var1) {
         this.arraySplitSize_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearArraySplitSize() {
         this.arraySplitSize_ = 0;
         this.onChanged();
         return this;
      }

      public boolean getStoreNames() {
         return this.storeNames_;
      }

      public ConstraintSolverParameters.Builder setStoreNames(boolean var1) {
         this.storeNames_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearStoreNames() {
         this.storeNames_ = false;
         this.onChanged();
         return this;
      }

      public boolean getNameCastVariables() {
         return this.nameCastVariables_;
      }

      public ConstraintSolverParameters.Builder setNameCastVariables(boolean var1) {
         this.nameCastVariables_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearNameCastVariables() {
         this.nameCastVariables_ = false;
         this.onChanged();
         return this;
      }

      public boolean getNameAllVariables() {
         return this.nameAllVariables_;
      }

      public ConstraintSolverParameters.Builder setNameAllVariables(boolean var1) {
         this.nameAllVariables_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearNameAllVariables() {
         this.nameAllVariables_ = false;
         this.onChanged();
         return this;
      }

      public boolean getProfilePropagation() {
         return this.profilePropagation_;
      }

      public ConstraintSolverParameters.Builder setProfilePropagation(boolean var1) {
         this.profilePropagation_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearProfilePropagation() {
         this.profilePropagation_ = false;
         this.onChanged();
         return this;
      }

      public String getProfileFile() {
         Object var1 = this.profileFile_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.profileFile_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      public ByteString getProfileFileBytes() {
         Object var1 = this.profileFile_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.profileFile_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ConstraintSolverParameters.Builder setProfileFile(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.profileFile_ = var1;
            this.onChanged();
            return this;
         }
      }

      public ConstraintSolverParameters.Builder clearProfileFile() {
         this.profileFile_ = ConstraintSolverParameters.getDefaultInstance().getProfileFile();
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder setProfileFileBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            ConstraintSolverParameters.checkByteStringIsUtf8(var1);
            this.profileFile_ = var1;
            this.onChanged();
            return this;
         }
      }

      public boolean getProfileLocalSearch() {
         return this.profileLocalSearch_;
      }

      public ConstraintSolverParameters.Builder setProfileLocalSearch(boolean var1) {
         this.profileLocalSearch_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearProfileLocalSearch() {
         this.profileLocalSearch_ = false;
         this.onChanged();
         return this;
      }

      public boolean getPrintLocalSearchProfile() {
         return this.printLocalSearchProfile_;
      }

      public ConstraintSolverParameters.Builder setPrintLocalSearchProfile(boolean var1) {
         this.printLocalSearchProfile_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearPrintLocalSearchProfile() {
         this.printLocalSearchProfile_ = false;
         this.onChanged();
         return this;
      }

      public boolean getTracePropagation() {
         return this.tracePropagation_;
      }

      public ConstraintSolverParameters.Builder setTracePropagation(boolean var1) {
         this.tracePropagation_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearTracePropagation() {
         this.tracePropagation_ = false;
         this.onChanged();
         return this;
      }

      public boolean getTraceSearch() {
         return this.traceSearch_;
      }

      public ConstraintSolverParameters.Builder setTraceSearch(boolean var1) {
         this.traceSearch_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearTraceSearch() {
         this.traceSearch_ = false;
         this.onChanged();
         return this;
      }

      public boolean getPrintModel() {
         return this.printModel_;
      }

      public ConstraintSolverParameters.Builder setPrintModel(boolean var1) {
         this.printModel_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearPrintModel() {
         this.printModel_ = false;
         this.onChanged();
         return this;
      }

      public boolean getPrintModelStats() {
         return this.printModelStats_;
      }

      public ConstraintSolverParameters.Builder setPrintModelStats(boolean var1) {
         this.printModelStats_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearPrintModelStats() {
         this.printModelStats_ = false;
         this.onChanged();
         return this;
      }

      public boolean getPrintAddedConstraints() {
         return this.printAddedConstraints_;
      }

      public ConstraintSolverParameters.Builder setPrintAddedConstraints(boolean var1) {
         this.printAddedConstraints_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearPrintAddedConstraints() {
         this.printAddedConstraints_ = false;
         this.onChanged();
         return this;
      }

      public boolean getDisableSolve() {
         return this.disableSolve_;
      }

      public ConstraintSolverParameters.Builder setDisableSolve(boolean var1) {
         this.disableSolve_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearDisableSolve() {
         this.disableSolve_ = false;
         this.onChanged();
         return this;
      }

      public boolean getUseSmallTable() {
         return this.useSmallTable_;
      }

      public ConstraintSolverParameters.Builder setUseSmallTable(boolean var1) {
         this.useSmallTable_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearUseSmallTable() {
         this.useSmallTable_ = false;
         this.onChanged();
         return this;
      }

      public boolean getUseCumulativeEdgeFinder() {
         return this.useCumulativeEdgeFinder_;
      }

      public ConstraintSolverParameters.Builder setUseCumulativeEdgeFinder(boolean var1) {
         this.useCumulativeEdgeFinder_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearUseCumulativeEdgeFinder() {
         this.useCumulativeEdgeFinder_ = false;
         this.onChanged();
         return this;
      }

      public boolean getUseCumulativeTimeTable() {
         return this.useCumulativeTimeTable_;
      }

      public ConstraintSolverParameters.Builder setUseCumulativeTimeTable(boolean var1) {
         this.useCumulativeTimeTable_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearUseCumulativeTimeTable() {
         this.useCumulativeTimeTable_ = false;
         this.onChanged();
         return this;
      }

      public boolean getUseCumulativeTimeTableSync() {
         return this.useCumulativeTimeTableSync_;
      }

      public ConstraintSolverParameters.Builder setUseCumulativeTimeTableSync(boolean var1) {
         this.useCumulativeTimeTableSync_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearUseCumulativeTimeTableSync() {
         this.useCumulativeTimeTableSync_ = false;
         this.onChanged();
         return this;
      }

      public boolean getUseSequenceHighDemandTasks() {
         return this.useSequenceHighDemandTasks_;
      }

      public ConstraintSolverParameters.Builder setUseSequenceHighDemandTasks(boolean var1) {
         this.useSequenceHighDemandTasks_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearUseSequenceHighDemandTasks() {
         this.useSequenceHighDemandTasks_ = false;
         this.onChanged();
         return this;
      }

      public boolean getUseAllPossibleDisjunctions() {
         return this.useAllPossibleDisjunctions_;
      }

      public ConstraintSolverParameters.Builder setUseAllPossibleDisjunctions(boolean var1) {
         this.useAllPossibleDisjunctions_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearUseAllPossibleDisjunctions() {
         this.useAllPossibleDisjunctions_ = false;
         this.onChanged();
         return this;
      }

      public int getMaxEdgeFinderSize() {
         return this.maxEdgeFinderSize_;
      }

      public ConstraintSolverParameters.Builder setMaxEdgeFinderSize(int var1) {
         this.maxEdgeFinderSize_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearMaxEdgeFinderSize() {
         this.maxEdgeFinderSize_ = 0;
         this.onChanged();
         return this;
      }

      public boolean getDiffnUseCumulative() {
         return this.diffnUseCumulative_;
      }

      public ConstraintSolverParameters.Builder setDiffnUseCumulative(boolean var1) {
         this.diffnUseCumulative_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearDiffnUseCumulative() {
         this.diffnUseCumulative_ = false;
         this.onChanged();
         return this;
      }

      public boolean getUseElementRmq() {
         return this.useElementRmq_;
      }

      public ConstraintSolverParameters.Builder setUseElementRmq(boolean var1) {
         this.useElementRmq_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearUseElementRmq() {
         this.useElementRmq_ = false;
         this.onChanged();
         return this;
      }

      public boolean getSkipLocallyOptimalPaths() {
         return this.skipLocallyOptimalPaths_;
      }

      public ConstraintSolverParameters.Builder setSkipLocallyOptimalPaths(boolean var1) {
         this.skipLocallyOptimalPaths_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearSkipLocallyOptimalPaths() {
         this.skipLocallyOptimalPaths_ = false;
         this.onChanged();
         return this;
      }

      public int getCheckSolutionPeriod() {
         return this.checkSolutionPeriod_;
      }

      public ConstraintSolverParameters.Builder setCheckSolutionPeriod(int var1) {
         this.checkSolutionPeriod_ = var1;
         this.onChanged();
         return this;
      }

      public ConstraintSolverParameters.Builder clearCheckSolutionPeriod() {
         this.checkSolutionPeriod_ = 0;
         this.onChanged();
         return this;
      }

      public final ConstraintSolverParameters.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConstraintSolverParameters.Builder)super.setUnknownFields(var1);
      }

      public final ConstraintSolverParameters.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConstraintSolverParameters.Builder)super.mergeUnknownFields(var1);
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

   public static enum TrailCompression implements ProtocolMessageEnum {
      NO_COMPRESSION(0),
      COMPRESS_WITH_ZLIB(1),
      UNRECOGNIZED(-1);

      public static final int NO_COMPRESSION_VALUE = 0;
      public static final int COMPRESS_WITH_ZLIB_VALUE = 1;
      private static final EnumLiteMap internalValueMap = new EnumLiteMap() {
         public ConstraintSolverParameters.TrailCompression findValueByNumber(int var1) {
            return ConstraintSolverParameters.TrailCompression.forNumber(var1);
         }
      };
      private static final ConstraintSolverParameters.TrailCompression[] VALUES = values();
      private final int value;

      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      /** @deprecated */
      @Deprecated
      public static ConstraintSolverParameters.TrailCompression valueOf(int var0) {
         return forNumber(var0);
      }

      public static ConstraintSolverParameters.TrailCompression forNumber(int var0) {
         switch(var0) {
         case 0:
            return NO_COMPRESSION;
         case 1:
            return COMPRESS_WITH_ZLIB;
         default:
            return null;
         }
      }

      public static EnumLiteMap internalGetValueMap() {
         return internalValueMap;
      }

      public final EnumValueDescriptor getValueDescriptor() {
         return (EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final EnumDescriptor getDescriptor() {
         return (EnumDescriptor)ConstraintSolverParameters.getDescriptor().getEnumTypes().get(0);
      }

      public static ConstraintSolverParameters.TrailCompression valueOf(EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      private TrailCompression(int var3) {
         this.value = var3;
      }
   }
}
