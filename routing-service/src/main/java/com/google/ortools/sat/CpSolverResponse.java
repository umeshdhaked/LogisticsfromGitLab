package com.google.ortools.sat;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.Internal.LongList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CpSolverResponse extends GeneratedMessageV3 implements CpSolverResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_;
   public static final int SOLUTION_FIELD_NUMBER = 2;
   private LongList solution_;
   private int solutionMemoizedSerializedSize;
   public static final int OBJECTIVE_VALUE_FIELD_NUMBER = 3;
   private double objectiveValue_;
   public static final int BEST_OBJECTIVE_BOUND_FIELD_NUMBER = 4;
   private double bestObjectiveBound_;
   public static final int SOLUTION_LOWER_BOUNDS_FIELD_NUMBER = 18;
   private LongList solutionLowerBounds_;
   private int solutionLowerBoundsMemoizedSerializedSize;
   public static final int SOLUTION_UPPER_BOUNDS_FIELD_NUMBER = 19;
   private LongList solutionUpperBounds_;
   private int solutionUpperBoundsMemoizedSerializedSize;
   public static final int TIGHTENED_VARIABLES_FIELD_NUMBER = 21;
   private List tightenedVariables_;
   public static final int ALL_SOLUTIONS_WERE_FOUND_FIELD_NUMBER = 5;
   private boolean allSolutionsWereFound_;
   public static final int NUM_BOOLEANS_FIELD_NUMBER = 10;
   private long numBooleans_;
   public static final int NUM_CONFLICTS_FIELD_NUMBER = 11;
   private long numConflicts_;
   public static final int NUM_BRANCHES_FIELD_NUMBER = 12;
   private long numBranches_;
   public static final int NUM_BINARY_PROPAGATIONS_FIELD_NUMBER = 13;
   private long numBinaryPropagations_;
   public static final int NUM_INTEGER_PROPAGATIONS_FIELD_NUMBER = 14;
   private long numIntegerPropagations_;
   public static final int WALL_TIME_FIELD_NUMBER = 15;
   private double wallTime_;
   public static final int USER_TIME_FIELD_NUMBER = 16;
   private double userTime_;
   public static final int DETERMINISTIC_TIME_FIELD_NUMBER = 17;
   private double deterministicTime_;
   public static final int PRIMAL_INTEGRAL_FIELD_NUMBER = 22;
   private double primalIntegral_;
   public static final int SOLUTION_INFO_FIELD_NUMBER = 20;
   private volatile Object solutionInfo_;
   private byte memoizedIsInitialized;
   private static final CpSolverResponse DEFAULT_INSTANCE = new CpSolverResponse();
   private static final Parser PARSER = new AbstractParser() {
      public CpSolverResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new CpSolverResponse(var1, var2);
      }
   };

   private CpSolverResponse(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.solutionMemoizedSerializedSize = -1;
      this.solutionLowerBoundsMemoizedSerializedSize = -1;
      this.solutionUpperBoundsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private CpSolverResponse() {
      this.solutionMemoizedSerializedSize = -1;
      this.solutionLowerBoundsMemoizedSerializedSize = -1;
      this.solutionUpperBoundsMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.status_ = 0;
      this.solution_ = emptyLongList();
      this.solutionLowerBounds_ = emptyLongList();
      this.solutionUpperBounds_ = emptyLongList();
      this.tightenedVariables_ = Collections.emptyList();
      this.solutionInfo_ = "";
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new CpSolverResponse();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private CpSolverResponse(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         int var3 = 0;
         com.google.protobuf.UnknownFieldSet.Builder var4 = UnknownFieldSet.newBuilder();

         try {
            boolean var5 = false;

            while(true) {
               while(!var5) {
                  int var6 = var1.readTag();
                  int var16;
                  int var8;
                  switch(var6) {
                  case 0:
                     var5 = true;
                     continue;
                  case 8:
                     var16 = var1.readEnum();
                     this.status_ = var16;
                     continue;
                  case 16:
                     if ((var3 & 1) == 0) {
                        this.solution_ = newLongList();
                        var3 |= 1;
                     }

                     this.solution_.addLong(var1.readInt64());
                     continue;
                  case 18:
                     var16 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var16);
                     if ((var3 & 1) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.solution_ = newLongList();
                        var3 |= 1;
                     }
                     break;
                  case 25:
                     this.objectiveValue_ = var1.readDouble();
                     continue;
                  case 33:
                     this.bestObjectiveBound_ = var1.readDouble();
                     continue;
                  case 40:
                     this.allSolutionsWereFound_ = var1.readBool();
                     continue;
                  case 80:
                     this.numBooleans_ = var1.readInt64();
                     continue;
                  case 88:
                     this.numConflicts_ = var1.readInt64();
                     continue;
                  case 96:
                     this.numBranches_ = var1.readInt64();
                     continue;
                  case 104:
                     this.numBinaryPropagations_ = var1.readInt64();
                     continue;
                  case 112:
                     this.numIntegerPropagations_ = var1.readInt64();
                     continue;
                  case 121:
                     this.wallTime_ = var1.readDouble();
                     continue;
                  case 129:
                     this.userTime_ = var1.readDouble();
                     continue;
                  case 137:
                     this.deterministicTime_ = var1.readDouble();
                     continue;
                  case 144:
                     if ((var3 & 2) == 0) {
                        this.solutionLowerBounds_ = newLongList();
                        var3 |= 2;
                     }

                     this.solutionLowerBounds_.addLong(var1.readInt64());
                     continue;
                  case 146:
                     var16 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var16);
                     if ((var3 & 2) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.solutionLowerBounds_ = newLongList();
                        var3 |= 2;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.solutionLowerBounds_.addLong(var1.readInt64());
                     }

                     var1.popLimit(var8);
                     continue;
                  case 152:
                     if ((var3 & 4) == 0) {
                        this.solutionUpperBounds_ = newLongList();
                        var3 |= 4;
                     }

                     this.solutionUpperBounds_.addLong(var1.readInt64());
                     continue;
                  case 154:
                     var16 = var1.readRawVarint32();
                     var8 = var1.pushLimit(var16);
                     if ((var3 & 4) == 0 && var1.getBytesUntilLimit() > 0) {
                        this.solutionUpperBounds_ = newLongList();
                        var3 |= 4;
                     }

                     while(var1.getBytesUntilLimit() > 0) {
                        this.solutionUpperBounds_.addLong(var1.readInt64());
                     }

                     var1.popLimit(var8);
                     continue;
                  case 162:
                     String var7 = var1.readStringRequireUtf8();
                     this.solutionInfo_ = var7;
                     continue;
                  case 170:
                     if ((var3 & 8) == 0) {
                        this.tightenedVariables_ = new ArrayList();
                        var3 |= 8;
                     }

                     this.tightenedVariables_.add(var1.readMessage(IntegerVariableProto.parser(), var2));
                     continue;
                  case 177:
                     this.primalIntegral_ = var1.readDouble();
                     continue;
                  default:
                     if (!this.parseUnknownField(var1, var4, var2, var6)) {
                        var5 = true;
                     }
                     continue;
                  }

                  while(var1.getBytesUntilLimit() > 0) {
                     this.solution_.addLong(var1.readInt64());
                  }

                  var1.popLimit(var8);
               }

               return;
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            if ((var3 & 1) != 0) {
               this.solution_.makeImmutable();
            }

            if ((var3 & 2) != 0) {
               this.solutionLowerBounds_.makeImmutable();
            }

            if ((var3 & 4) != 0) {
               this.solutionUpperBounds_.makeImmutable();
            }

            if ((var3 & 8) != 0) {
               this.tightenedVariables_ = Collections.unmodifiableList(this.tightenedVariables_);
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }
      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_CpSolverResponse_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_CpSolverResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CpSolverResponse.class, CpSolverResponse.Builder.class);
   }

   public int getStatusValue() {
      return this.status_;
   }

   public CpSolverStatus getStatus() {
      CpSolverStatus var1 = CpSolverStatus.valueOf(this.status_);
      return var1 == null ? CpSolverStatus.UNRECOGNIZED : var1;
   }

   public List getSolutionList() {
      return this.solution_;
   }

   public int getSolutionCount() {
      return this.solution_.size();
   }

   public long getSolution(int var1) {
      return this.solution_.getLong(var1);
   }

   public double getObjectiveValue() {
      return this.objectiveValue_;
   }

   public double getBestObjectiveBound() {
      return this.bestObjectiveBound_;
   }

   public List getSolutionLowerBoundsList() {
      return this.solutionLowerBounds_;
   }

   public int getSolutionLowerBoundsCount() {
      return this.solutionLowerBounds_.size();
   }

   public long getSolutionLowerBounds(int var1) {
      return this.solutionLowerBounds_.getLong(var1);
   }

   public List getSolutionUpperBoundsList() {
      return this.solutionUpperBounds_;
   }

   public int getSolutionUpperBoundsCount() {
      return this.solutionUpperBounds_.size();
   }

   public long getSolutionUpperBounds(int var1) {
      return this.solutionUpperBounds_.getLong(var1);
   }

   public List getTightenedVariablesList() {
      return this.tightenedVariables_;
   }

   public List getTightenedVariablesOrBuilderList() {
      return this.tightenedVariables_;
   }

   public int getTightenedVariablesCount() {
      return this.tightenedVariables_.size();
   }

   public IntegerVariableProto getTightenedVariables(int var1) {
      return (IntegerVariableProto)this.tightenedVariables_.get(var1);
   }

   public IntegerVariableProtoOrBuilder getTightenedVariablesOrBuilder(int var1) {
      return (IntegerVariableProtoOrBuilder)this.tightenedVariables_.get(var1);
   }

   public boolean getAllSolutionsWereFound() {
      return this.allSolutionsWereFound_;
   }

   public long getNumBooleans() {
      return this.numBooleans_;
   }

   public long getNumConflicts() {
      return this.numConflicts_;
   }

   public long getNumBranches() {
      return this.numBranches_;
   }

   public long getNumBinaryPropagations() {
      return this.numBinaryPropagations_;
   }

   public long getNumIntegerPropagations() {
      return this.numIntegerPropagations_;
   }

   public double getWallTime() {
      return this.wallTime_;
   }

   public double getUserTime() {
      return this.userTime_;
   }

   public double getDeterministicTime() {
      return this.deterministicTime_;
   }

   public double getPrimalIntegral() {
      return this.primalIntegral_;
   }

   public String getSolutionInfo() {
      Object var1 = this.solutionInfo_;
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.solutionInfo_ = var3;
         return var3;
      }
   }

   public ByteString getSolutionInfoBytes() {
      Object var1 = this.solutionInfo_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.solutionInfo_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      this.getSerializedSize();
      if (this.status_ != CpSolverStatus.UNKNOWN.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      if (this.getSolutionList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.solutionMemoizedSerializedSize);
      }

      int var2;
      for(var2 = 0; var2 < this.solution_.size(); ++var2) {
         var1.writeInt64NoTag(this.solution_.getLong(var2));
      }

      if (this.objectiveValue_ != 0.0D) {
         var1.writeDouble(3, this.objectiveValue_);
      }

      if (this.bestObjectiveBound_ != 0.0D) {
         var1.writeDouble(4, this.bestObjectiveBound_);
      }

      if (this.allSolutionsWereFound_) {
         var1.writeBool(5, this.allSolutionsWereFound_);
      }

      if (this.numBooleans_ != 0L) {
         var1.writeInt64(10, this.numBooleans_);
      }

      if (this.numConflicts_ != 0L) {
         var1.writeInt64(11, this.numConflicts_);
      }

      if (this.numBranches_ != 0L) {
         var1.writeInt64(12, this.numBranches_);
      }

      if (this.numBinaryPropagations_ != 0L) {
         var1.writeInt64(13, this.numBinaryPropagations_);
      }

      if (this.numIntegerPropagations_ != 0L) {
         var1.writeInt64(14, this.numIntegerPropagations_);
      }

      if (this.wallTime_ != 0.0D) {
         var1.writeDouble(15, this.wallTime_);
      }

      if (this.userTime_ != 0.0D) {
         var1.writeDouble(16, this.userTime_);
      }

      if (this.deterministicTime_ != 0.0D) {
         var1.writeDouble(17, this.deterministicTime_);
      }

      if (this.getSolutionLowerBoundsList().size() > 0) {
         var1.writeUInt32NoTag(146);
         var1.writeUInt32NoTag(this.solutionLowerBoundsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.solutionLowerBounds_.size(); ++var2) {
         var1.writeInt64NoTag(this.solutionLowerBounds_.getLong(var2));
      }

      if (this.getSolutionUpperBoundsList().size() > 0) {
         var1.writeUInt32NoTag(154);
         var1.writeUInt32NoTag(this.solutionUpperBoundsMemoizedSerializedSize);
      }

      for(var2 = 0; var2 < this.solutionUpperBounds_.size(); ++var2) {
         var1.writeInt64NoTag(this.solutionUpperBounds_.getLong(var2));
      }

      if (!this.getSolutionInfoBytes().isEmpty()) {
         GeneratedMessageV3.writeString(var1, 20, this.solutionInfo_);
      }

      for(var2 = 0; var2 < this.tightenedVariables_.size(); ++var2) {
         var1.writeMessage(21, (MessageLite)this.tightenedVariables_.get(var2));
      }

      if (this.primalIntegral_ != 0.0D) {
         var1.writeDouble(22, this.primalIntegral_);
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (this.status_ != CpSolverStatus.UNKNOWN.getNumber()) {
            var1 += CodedOutputStream.computeEnumSize(1, this.status_);
         }

         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < this.solution_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.solution_.getLong(var3));
         }

         var1 += var2;
         if (!this.getSolutionList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.solutionMemoizedSerializedSize = var2;
         if (this.objectiveValue_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(3, this.objectiveValue_);
         }

         if (this.bestObjectiveBound_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(4, this.bestObjectiveBound_);
         }

         if (this.allSolutionsWereFound_) {
            var1 += CodedOutputStream.computeBoolSize(5, this.allSolutionsWereFound_);
         }

         if (this.numBooleans_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(10, this.numBooleans_);
         }

         if (this.numConflicts_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(11, this.numConflicts_);
         }

         if (this.numBranches_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(12, this.numBranches_);
         }

         if (this.numBinaryPropagations_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(13, this.numBinaryPropagations_);
         }

         if (this.numIntegerPropagations_ != 0L) {
            var1 += CodedOutputStream.computeInt64Size(14, this.numIntegerPropagations_);
         }

         if (this.wallTime_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(15, this.wallTime_);
         }

         if (this.userTime_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(16, this.userTime_);
         }

         if (this.deterministicTime_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(17, this.deterministicTime_);
         }

         var2 = 0;

         for(var3 = 0; var3 < this.solutionLowerBounds_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.solutionLowerBounds_.getLong(var3));
         }

         var1 += var2;
         if (!this.getSolutionLowerBoundsList().isEmpty()) {
            var1 += 2;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.solutionLowerBoundsMemoizedSerializedSize = var2;
         var2 = 0;

         for(var3 = 0; var3 < this.solutionUpperBounds_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt64SizeNoTag(this.solutionUpperBounds_.getLong(var3));
         }

         var1 += var2;
         if (!this.getSolutionUpperBoundsList().isEmpty()) {
            var1 += 2;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.solutionUpperBoundsMemoizedSerializedSize = var2;
         if (!this.getSolutionInfoBytes().isEmpty()) {
            var1 += GeneratedMessageV3.computeStringSize(20, this.solutionInfo_);
         }

         for(var2 = 0; var2 < this.tightenedVariables_.size(); ++var2) {
            var1 += CodedOutputStream.computeMessageSize(21, (MessageLite)this.tightenedVariables_.get(var2));
         }

         if (this.primalIntegral_ != 0.0D) {
            var1 += CodedOutputStream.computeDoubleSize(22, this.primalIntegral_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CpSolverResponse)) {
         return super.equals(var1);
      } else {
         CpSolverResponse var2 = (CpSolverResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else if (!this.getSolutionList().equals(var2.getSolutionList())) {
            return false;
         } else if (Double.doubleToLongBits(this.getObjectiveValue()) != Double.doubleToLongBits(var2.getObjectiveValue())) {
            return false;
         } else if (Double.doubleToLongBits(this.getBestObjectiveBound()) != Double.doubleToLongBits(var2.getBestObjectiveBound())) {
            return false;
         } else if (!this.getSolutionLowerBoundsList().equals(var2.getSolutionLowerBoundsList())) {
            return false;
         } else if (!this.getSolutionUpperBoundsList().equals(var2.getSolutionUpperBoundsList())) {
            return false;
         } else if (!this.getTightenedVariablesList().equals(var2.getTightenedVariablesList())) {
            return false;
         } else if (this.getAllSolutionsWereFound() != var2.getAllSolutionsWereFound()) {
            return false;
         } else if (this.getNumBooleans() != var2.getNumBooleans()) {
            return false;
         } else if (this.getNumConflicts() != var2.getNumConflicts()) {
            return false;
         } else if (this.getNumBranches() != var2.getNumBranches()) {
            return false;
         } else if (this.getNumBinaryPropagations() != var2.getNumBinaryPropagations()) {
            return false;
         } else if (this.getNumIntegerPropagations() != var2.getNumIntegerPropagations()) {
            return false;
         } else if (Double.doubleToLongBits(this.getWallTime()) != Double.doubleToLongBits(var2.getWallTime())) {
            return false;
         } else if (Double.doubleToLongBits(this.getUserTime()) != Double.doubleToLongBits(var2.getUserTime())) {
            return false;
         } else if (Double.doubleToLongBits(this.getDeterministicTime()) != Double.doubleToLongBits(var2.getDeterministicTime())) {
            return false;
         } else if (Double.doubleToLongBits(this.getPrimalIntegral()) != Double.doubleToLongBits(var2.getPrimalIntegral())) {
            return false;
         } else if (!this.getSolutionInfo().equals(var2.getSolutionInfo())) {
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
         var2 = 53 * var2 + this.status_;
         if (this.getSolutionCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getSolutionList().hashCode();
         }

         var2 = 37 * var2 + 3;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getObjectiveValue()));
         var2 = 37 * var2 + 4;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getBestObjectiveBound()));
         if (this.getSolutionLowerBoundsCount() > 0) {
            var2 = 37 * var2 + 18;
            var2 = 53 * var2 + this.getSolutionLowerBoundsList().hashCode();
         }

         if (this.getSolutionUpperBoundsCount() > 0) {
            var2 = 37 * var2 + 19;
            var2 = 53 * var2 + this.getSolutionUpperBoundsList().hashCode();
         }

         if (this.getTightenedVariablesCount() > 0) {
            var2 = 37 * var2 + 21;
            var2 = 53 * var2 + this.getTightenedVariablesList().hashCode();
         }

         var2 = 37 * var2 + 5;
         var2 = 53 * var2 + Internal.hashBoolean(this.getAllSolutionsWereFound());
         var2 = 37 * var2 + 10;
         var2 = 53 * var2 + Internal.hashLong(this.getNumBooleans());
         var2 = 37 * var2 + 11;
         var2 = 53 * var2 + Internal.hashLong(this.getNumConflicts());
         var2 = 37 * var2 + 12;
         var2 = 53 * var2 + Internal.hashLong(this.getNumBranches());
         var2 = 37 * var2 + 13;
         var2 = 53 * var2 + Internal.hashLong(this.getNumBinaryPropagations());
         var2 = 37 * var2 + 14;
         var2 = 53 * var2 + Internal.hashLong(this.getNumIntegerPropagations());
         var2 = 37 * var2 + 15;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getWallTime()));
         var2 = 37 * var2 + 16;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getUserTime()));
         var2 = 37 * var2 + 17;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getDeterministicTime()));
         var2 = 37 * var2 + 22;
         var2 = 53 * var2 + Internal.hashLong(Double.doubleToLongBits(this.getPrimalIntegral()));
         var2 = 37 * var2 + 20;
         var2 = 53 * var2 + this.getSolutionInfo().hashCode();
         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static CpSolverResponse parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (CpSolverResponse)PARSER.parseFrom(var0);
   }

   public static CpSolverResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CpSolverResponse)PARSER.parseFrom(var0, var1);
   }

   public static CpSolverResponse parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (CpSolverResponse)PARSER.parseFrom(var0);
   }

   public static CpSolverResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CpSolverResponse)PARSER.parseFrom(var0, var1);
   }

   public static CpSolverResponse parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (CpSolverResponse)PARSER.parseFrom(var0);
   }

   public static CpSolverResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (CpSolverResponse)PARSER.parseFrom(var0, var1);
   }

   public static CpSolverResponse parseFrom(InputStream var0) throws IOException {
      return (CpSolverResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CpSolverResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CpSolverResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CpSolverResponse parseDelimitedFrom(InputStream var0) throws IOException {
      return (CpSolverResponse)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CpSolverResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CpSolverResponse)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CpSolverResponse parseFrom(CodedInputStream var0) throws IOException {
      return (CpSolverResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CpSolverResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (CpSolverResponse)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CpSolverResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CpSolverResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CpSolverResponse.Builder newBuilder(CpSolverResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CpSolverResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CpSolverResponse.Builder() : (new CpSolverResponse.Builder()).mergeFrom(this);
   }

   protected CpSolverResponse.Builder newBuilderForType(BuilderParent var1) {
      CpSolverResponse.Builder var2 = new CpSolverResponse.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static CpSolverResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public CpSolverResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   CpSolverResponse(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   CpSolverResponse(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements CpSolverResponseOrBuilder {
      private int bitField0_;
      private int status_;
      private LongList solution_;
      private double objectiveValue_;
      private double bestObjectiveBound_;
      private LongList solutionLowerBounds_;
      private LongList solutionUpperBounds_;
      private List tightenedVariables_;
      private RepeatedFieldBuilderV3 tightenedVariablesBuilder_;
      private boolean allSolutionsWereFound_;
      private long numBooleans_;
      private long numConflicts_;
      private long numBranches_;
      private long numBinaryPropagations_;
      private long numIntegerPropagations_;
      private double wallTime_;
      private double userTime_;
      private double deterministicTime_;
      private double primalIntegral_;
      private Object solutionInfo_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_CpSolverResponse_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_CpSolverResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CpSolverResponse.class, CpSolverResponse.Builder.class);
      }

      private Builder() {
         this.status_ = 0;
         this.solution_ = CpSolverResponse.emptyLongList();
         this.solutionLowerBounds_ = CpSolverResponse.emptyLongList();
         this.solutionUpperBounds_ = CpSolverResponse.emptyLongList();
         this.tightenedVariables_ = Collections.emptyList();
         this.solutionInfo_ = "";
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.status_ = 0;
         this.solution_ = CpSolverResponse.emptyLongList();
         this.solutionLowerBounds_ = CpSolverResponse.emptyLongList();
         this.solutionUpperBounds_ = CpSolverResponse.emptyLongList();
         this.tightenedVariables_ = Collections.emptyList();
         this.solutionInfo_ = "";
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (CpSolverResponse.alwaysUseFieldBuilders) {
            this.getTightenedVariablesFieldBuilder();
         }

      }

      public CpSolverResponse.Builder clear() {
         super.clear();
         this.status_ = 0;
         this.solution_ = CpSolverResponse.emptyLongList();
         this.bitField0_ &= -2;
         this.objectiveValue_ = 0.0D;
         this.bestObjectiveBound_ = 0.0D;
         this.solutionLowerBounds_ = CpSolverResponse.emptyLongList();
         this.bitField0_ &= -3;
         this.solutionUpperBounds_ = CpSolverResponse.emptyLongList();
         this.bitField0_ &= -5;
         if (this.tightenedVariablesBuilder_ == null) {
            this.tightenedVariables_ = Collections.emptyList();
            this.bitField0_ &= -9;
         } else {
            this.tightenedVariablesBuilder_.clear();
         }

         this.allSolutionsWereFound_ = false;
         this.numBooleans_ = 0L;
         this.numConflicts_ = 0L;
         this.numBranches_ = 0L;
         this.numBinaryPropagations_ = 0L;
         this.numIntegerPropagations_ = 0L;
         this.wallTime_ = 0.0D;
         this.userTime_ = 0.0D;
         this.deterministicTime_ = 0.0D;
         this.primalIntegral_ = 0.0D;
         this.solutionInfo_ = "";
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_CpSolverResponse_descriptor;
      }

      public CpSolverResponse getDefaultInstanceForType() {
         return CpSolverResponse.getDefaultInstance();
      }

      public CpSolverResponse build() {
         CpSolverResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CpSolverResponse buildPartial() {
         CpSolverResponse var1 = new CpSolverResponse(this);
         int var2 = this.bitField0_;
         var1.status_ = this.status_;
         if ((this.bitField0_ & 1) != 0) {
            this.solution_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.solution_ = this.solution_;
         var1.objectiveValue_ = this.objectiveValue_;
         var1.bestObjectiveBound_ = this.bestObjectiveBound_;
         if ((this.bitField0_ & 2) != 0) {
            this.solutionLowerBounds_.makeImmutable();
            this.bitField0_ &= -3;
         }

         var1.solutionLowerBounds_ = this.solutionLowerBounds_;
         if ((this.bitField0_ & 4) != 0) {
            this.solutionUpperBounds_.makeImmutable();
            this.bitField0_ &= -5;
         }

         var1.solutionUpperBounds_ = this.solutionUpperBounds_;
         if (this.tightenedVariablesBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.tightenedVariables_ = Collections.unmodifiableList(this.tightenedVariables_);
               this.bitField0_ &= -9;
            }

            var1.tightenedVariables_ = this.tightenedVariables_;
         } else {
            var1.tightenedVariables_ = this.tightenedVariablesBuilder_.build();
         }

         var1.allSolutionsWereFound_ = this.allSolutionsWereFound_;
         var1.numBooleans_ = this.numBooleans_;
         var1.numConflicts_ = this.numConflicts_;
         var1.numBranches_ = this.numBranches_;
         var1.numBinaryPropagations_ = this.numBinaryPropagations_;
         var1.numIntegerPropagations_ = this.numIntegerPropagations_;
         var1.wallTime_ = this.wallTime_;
         var1.userTime_ = this.userTime_;
         var1.deterministicTime_ = this.deterministicTime_;
         var1.primalIntegral_ = this.primalIntegral_;
         var1.solutionInfo_ = this.solutionInfo_;
         this.onBuilt();
         return var1;
      }

      public CpSolverResponse.Builder clone() {
         return (CpSolverResponse.Builder)super.clone();
      }

      public CpSolverResponse.Builder setField(FieldDescriptor var1, Object var2) {
         return (CpSolverResponse.Builder)super.setField(var1, var2);
      }

      public CpSolverResponse.Builder clearField(FieldDescriptor var1) {
         return (CpSolverResponse.Builder)super.clearField(var1);
      }

      public CpSolverResponse.Builder clearOneof(OneofDescriptor var1) {
         return (CpSolverResponse.Builder)super.clearOneof(var1);
      }

      public CpSolverResponse.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (CpSolverResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CpSolverResponse.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (CpSolverResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public CpSolverResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof CpSolverResponse) {
            return this.mergeFrom((CpSolverResponse)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public CpSolverResponse.Builder mergeFrom(CpSolverResponse var1) {
         if (var1 == CpSolverResponse.getDefaultInstance()) {
            return this;
         } else {
            if (var1.status_ != 0) {
               this.setStatusValue(var1.getStatusValue());
            }

            if (!var1.solution_.isEmpty()) {
               if (this.solution_.isEmpty()) {
                  this.solution_ = var1.solution_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureSolutionIsMutable();
                  this.solution_.addAll(var1.solution_);
               }

               this.onChanged();
            }

            if (var1.getObjectiveValue() != 0.0D) {
               this.setObjectiveValue(var1.getObjectiveValue());
            }

            if (var1.getBestObjectiveBound() != 0.0D) {
               this.setBestObjectiveBound(var1.getBestObjectiveBound());
            }

            if (!var1.solutionLowerBounds_.isEmpty()) {
               if (this.solutionLowerBounds_.isEmpty()) {
                  this.solutionLowerBounds_ = var1.solutionLowerBounds_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureSolutionLowerBoundsIsMutable();
                  this.solutionLowerBounds_.addAll(var1.solutionLowerBounds_);
               }

               this.onChanged();
            }

            if (!var1.solutionUpperBounds_.isEmpty()) {
               if (this.solutionUpperBounds_.isEmpty()) {
                  this.solutionUpperBounds_ = var1.solutionUpperBounds_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureSolutionUpperBoundsIsMutable();
                  this.solutionUpperBounds_.addAll(var1.solutionUpperBounds_);
               }

               this.onChanged();
            }

            if (this.tightenedVariablesBuilder_ == null) {
               if (!var1.tightenedVariables_.isEmpty()) {
                  if (this.tightenedVariables_.isEmpty()) {
                     this.tightenedVariables_ = var1.tightenedVariables_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureTightenedVariablesIsMutable();
                     this.tightenedVariables_.addAll(var1.tightenedVariables_);
                  }

                  this.onChanged();
               }
            } else if (!var1.tightenedVariables_.isEmpty()) {
               if (this.tightenedVariablesBuilder_.isEmpty()) {
                  this.tightenedVariablesBuilder_.dispose();
                  this.tightenedVariablesBuilder_ = null;
                  this.tightenedVariables_ = var1.tightenedVariables_;
                  this.bitField0_ &= -9;
                  this.tightenedVariablesBuilder_ = CpSolverResponse.alwaysUseFieldBuilders ? this.getTightenedVariablesFieldBuilder() : null;
               } else {
                  this.tightenedVariablesBuilder_.addAllMessages(var1.tightenedVariables_);
               }
            }

            if (var1.getAllSolutionsWereFound()) {
               this.setAllSolutionsWereFound(var1.getAllSolutionsWereFound());
            }

            if (var1.getNumBooleans() != 0L) {
               this.setNumBooleans(var1.getNumBooleans());
            }

            if (var1.getNumConflicts() != 0L) {
               this.setNumConflicts(var1.getNumConflicts());
            }

            if (var1.getNumBranches() != 0L) {
               this.setNumBranches(var1.getNumBranches());
            }

            if (var1.getNumBinaryPropagations() != 0L) {
               this.setNumBinaryPropagations(var1.getNumBinaryPropagations());
            }

            if (var1.getNumIntegerPropagations() != 0L) {
               this.setNumIntegerPropagations(var1.getNumIntegerPropagations());
            }

            if (var1.getWallTime() != 0.0D) {
               this.setWallTime(var1.getWallTime());
            }

            if (var1.getUserTime() != 0.0D) {
               this.setUserTime(var1.getUserTime());
            }

            if (var1.getDeterministicTime() != 0.0D) {
               this.setDeterministicTime(var1.getDeterministicTime());
            }

            if (var1.getPrimalIntegral() != 0.0D) {
               this.setPrimalIntegral(var1.getPrimalIntegral());
            }

            if (!var1.getSolutionInfo().isEmpty()) {
               this.solutionInfo_ = var1.solutionInfo_;
               this.onChanged();
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public CpSolverResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         CpSolverResponse var3 = null;

         try {
            var3 = (CpSolverResponse)CpSolverResponse.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (CpSolverResponse)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public int getStatusValue() {
         return this.status_;
      }

      public CpSolverResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverStatus getStatus() {
         CpSolverStatus var1 = CpSolverStatus.valueOf(this.status_);
         return var1 == null ? CpSolverStatus.UNRECOGNIZED : var1;
      }

      public CpSolverResponse.Builder setStatus(CpSolverStatus var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.status_ = var1.getNumber();
            this.onChanged();
            return this;
         }
      }

      public CpSolverResponse.Builder clearStatus() {
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureSolutionIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.solution_ = CpSolverResponse.mutableCopy(this.solution_);
            this.bitField0_ |= 1;
         }

      }

      public List getSolutionList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.solution_) : this.solution_);
      }

      public int getSolutionCount() {
         return this.solution_.size();
      }

      public long getSolution(int var1) {
         return this.solution_.getLong(var1);
      }

      public CpSolverResponse.Builder setSolution(int var1, long var2) {
         this.ensureSolutionIsMutable();
         this.solution_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder addSolution(long var1) {
         this.ensureSolutionIsMutable();
         this.solution_.addLong(var1);
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder addAllSolution(Iterable var1) {
         this.ensureSolutionIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.solution_);
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearSolution() {
         this.solution_ = CpSolverResponse.emptyLongList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public double getObjectiveValue() {
         return this.objectiveValue_;
      }

      public CpSolverResponse.Builder setObjectiveValue(double var1) {
         this.objectiveValue_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearObjectiveValue() {
         this.objectiveValue_ = 0.0D;
         this.onChanged();
         return this;
      }

      public double getBestObjectiveBound() {
         return this.bestObjectiveBound_;
      }

      public CpSolverResponse.Builder setBestObjectiveBound(double var1) {
         this.bestObjectiveBound_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearBestObjectiveBound() {
         this.bestObjectiveBound_ = 0.0D;
         this.onChanged();
         return this;
      }

      private void ensureSolutionLowerBoundsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.solutionLowerBounds_ = CpSolverResponse.mutableCopy(this.solutionLowerBounds_);
            this.bitField0_ |= 2;
         }

      }

      public List getSolutionLowerBoundsList() {
         return (List)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.solutionLowerBounds_) : this.solutionLowerBounds_);
      }

      public int getSolutionLowerBoundsCount() {
         return this.solutionLowerBounds_.size();
      }

      public long getSolutionLowerBounds(int var1) {
         return this.solutionLowerBounds_.getLong(var1);
      }

      public CpSolverResponse.Builder setSolutionLowerBounds(int var1, long var2) {
         this.ensureSolutionLowerBoundsIsMutable();
         this.solutionLowerBounds_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder addSolutionLowerBounds(long var1) {
         this.ensureSolutionLowerBoundsIsMutable();
         this.solutionLowerBounds_.addLong(var1);
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder addAllSolutionLowerBounds(Iterable var1) {
         this.ensureSolutionLowerBoundsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.solutionLowerBounds_);
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearSolutionLowerBounds() {
         this.solutionLowerBounds_ = CpSolverResponse.emptyLongList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      private void ensureSolutionUpperBoundsIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.solutionUpperBounds_ = CpSolverResponse.mutableCopy(this.solutionUpperBounds_);
            this.bitField0_ |= 4;
         }

      }

      public List getSolutionUpperBoundsList() {
         return (List)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.solutionUpperBounds_) : this.solutionUpperBounds_);
      }

      public int getSolutionUpperBoundsCount() {
         return this.solutionUpperBounds_.size();
      }

      public long getSolutionUpperBounds(int var1) {
         return this.solutionUpperBounds_.getLong(var1);
      }

      public CpSolverResponse.Builder setSolutionUpperBounds(int var1, long var2) {
         this.ensureSolutionUpperBoundsIsMutable();
         this.solutionUpperBounds_.setLong(var1, var2);
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder addSolutionUpperBounds(long var1) {
         this.ensureSolutionUpperBoundsIsMutable();
         this.solutionUpperBounds_.addLong(var1);
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder addAllSolutionUpperBounds(Iterable var1) {
         this.ensureSolutionUpperBoundsIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.solutionUpperBounds_);
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearSolutionUpperBounds() {
         this.solutionUpperBounds_ = CpSolverResponse.emptyLongList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      private void ensureTightenedVariablesIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.tightenedVariables_ = new ArrayList(this.tightenedVariables_);
            this.bitField0_ |= 8;
         }

      }

      public List getTightenedVariablesList() {
         return this.tightenedVariablesBuilder_ == null ? Collections.unmodifiableList(this.tightenedVariables_) : this.tightenedVariablesBuilder_.getMessageList();
      }

      public int getTightenedVariablesCount() {
         return this.tightenedVariablesBuilder_ == null ? this.tightenedVariables_.size() : this.tightenedVariablesBuilder_.getCount();
      }

      public IntegerVariableProto getTightenedVariables(int var1) {
         return this.tightenedVariablesBuilder_ == null ? (IntegerVariableProto)this.tightenedVariables_.get(var1) : (IntegerVariableProto)this.tightenedVariablesBuilder_.getMessage(var1);
      }

      public CpSolverResponse.Builder setTightenedVariables(int var1, IntegerVariableProto var2) {
         if (this.tightenedVariablesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTightenedVariablesIsMutable();
            this.tightenedVariables_.set(var1, var2);
            this.onChanged();
         } else {
            this.tightenedVariablesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public CpSolverResponse.Builder setTightenedVariables(int var1, IntegerVariableProto.Builder var2) {
         if (this.tightenedVariablesBuilder_ == null) {
            this.ensureTightenedVariablesIsMutable();
            this.tightenedVariables_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.tightenedVariablesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public CpSolverResponse.Builder addTightenedVariables(IntegerVariableProto var1) {
         if (this.tightenedVariablesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureTightenedVariablesIsMutable();
            this.tightenedVariables_.add(var1);
            this.onChanged();
         } else {
            this.tightenedVariablesBuilder_.addMessage(var1);
         }

         return this;
      }

      public CpSolverResponse.Builder addTightenedVariables(int var1, IntegerVariableProto var2) {
         if (this.tightenedVariablesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTightenedVariablesIsMutable();
            this.tightenedVariables_.add(var1, var2);
            this.onChanged();
         } else {
            this.tightenedVariablesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public CpSolverResponse.Builder addTightenedVariables(IntegerVariableProto.Builder var1) {
         if (this.tightenedVariablesBuilder_ == null) {
            this.ensureTightenedVariablesIsMutable();
            this.tightenedVariables_.add(var1.build());
            this.onChanged();
         } else {
            this.tightenedVariablesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public CpSolverResponse.Builder addTightenedVariables(int var1, IntegerVariableProto.Builder var2) {
         if (this.tightenedVariablesBuilder_ == null) {
            this.ensureTightenedVariablesIsMutable();
            this.tightenedVariables_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.tightenedVariablesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public CpSolverResponse.Builder addAllTightenedVariables(Iterable var1) {
         if (this.tightenedVariablesBuilder_ == null) {
            this.ensureTightenedVariablesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.tightenedVariables_);
            this.onChanged();
         } else {
            this.tightenedVariablesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public CpSolverResponse.Builder clearTightenedVariables() {
         if (this.tightenedVariablesBuilder_ == null) {
            this.tightenedVariables_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.tightenedVariablesBuilder_.clear();
         }

         return this;
      }

      public CpSolverResponse.Builder removeTightenedVariables(int var1) {
         if (this.tightenedVariablesBuilder_ == null) {
            this.ensureTightenedVariablesIsMutable();
            this.tightenedVariables_.remove(var1);
            this.onChanged();
         } else {
            this.tightenedVariablesBuilder_.remove(var1);
         }

         return this;
      }

      public IntegerVariableProto.Builder getTightenedVariablesBuilder(int var1) {
         return (IntegerVariableProto.Builder)this.getTightenedVariablesFieldBuilder().getBuilder(var1);
      }

      public IntegerVariableProtoOrBuilder getTightenedVariablesOrBuilder(int var1) {
         return this.tightenedVariablesBuilder_ == null ? (IntegerVariableProtoOrBuilder)this.tightenedVariables_.get(var1) : (IntegerVariableProtoOrBuilder)this.tightenedVariablesBuilder_.getMessageOrBuilder(var1);
      }

      public List getTightenedVariablesOrBuilderList() {
         return this.tightenedVariablesBuilder_ != null ? this.tightenedVariablesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tightenedVariables_);
      }

      public IntegerVariableProto.Builder addTightenedVariablesBuilder() {
         return (IntegerVariableProto.Builder)this.getTightenedVariablesFieldBuilder().addBuilder(IntegerVariableProto.getDefaultInstance());
      }

      public IntegerVariableProto.Builder addTightenedVariablesBuilder(int var1) {
         return (IntegerVariableProto.Builder)this.getTightenedVariablesFieldBuilder().addBuilder(var1, IntegerVariableProto.getDefaultInstance());
      }

      public List getTightenedVariablesBuilderList() {
         return this.getTightenedVariablesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3 getTightenedVariablesFieldBuilder() {
         if (this.tightenedVariablesBuilder_ == null) {
            this.tightenedVariablesBuilder_ = new RepeatedFieldBuilderV3(this.tightenedVariables_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
            this.tightenedVariables_ = null;
         }

         return this.tightenedVariablesBuilder_;
      }

      public boolean getAllSolutionsWereFound() {
         return this.allSolutionsWereFound_;
      }

      public CpSolverResponse.Builder setAllSolutionsWereFound(boolean var1) {
         this.allSolutionsWereFound_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearAllSolutionsWereFound() {
         this.allSolutionsWereFound_ = false;
         this.onChanged();
         return this;
      }

      public long getNumBooleans() {
         return this.numBooleans_;
      }

      public CpSolverResponse.Builder setNumBooleans(long var1) {
         this.numBooleans_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearNumBooleans() {
         this.numBooleans_ = 0L;
         this.onChanged();
         return this;
      }

      public long getNumConflicts() {
         return this.numConflicts_;
      }

      public CpSolverResponse.Builder setNumConflicts(long var1) {
         this.numConflicts_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearNumConflicts() {
         this.numConflicts_ = 0L;
         this.onChanged();
         return this;
      }

      public long getNumBranches() {
         return this.numBranches_;
      }

      public CpSolverResponse.Builder setNumBranches(long var1) {
         this.numBranches_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearNumBranches() {
         this.numBranches_ = 0L;
         this.onChanged();
         return this;
      }

      public long getNumBinaryPropagations() {
         return this.numBinaryPropagations_;
      }

      public CpSolverResponse.Builder setNumBinaryPropagations(long var1) {
         this.numBinaryPropagations_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearNumBinaryPropagations() {
         this.numBinaryPropagations_ = 0L;
         this.onChanged();
         return this;
      }

      public long getNumIntegerPropagations() {
         return this.numIntegerPropagations_;
      }

      public CpSolverResponse.Builder setNumIntegerPropagations(long var1) {
         this.numIntegerPropagations_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearNumIntegerPropagations() {
         this.numIntegerPropagations_ = 0L;
         this.onChanged();
         return this;
      }

      public double getWallTime() {
         return this.wallTime_;
      }

      public CpSolverResponse.Builder setWallTime(double var1) {
         this.wallTime_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearWallTime() {
         this.wallTime_ = 0.0D;
         this.onChanged();
         return this;
      }

      public double getUserTime() {
         return this.userTime_;
      }

      public CpSolverResponse.Builder setUserTime(double var1) {
         this.userTime_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearUserTime() {
         this.userTime_ = 0.0D;
         this.onChanged();
         return this;
      }

      public double getDeterministicTime() {
         return this.deterministicTime_;
      }

      public CpSolverResponse.Builder setDeterministicTime(double var1) {
         this.deterministicTime_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearDeterministicTime() {
         this.deterministicTime_ = 0.0D;
         this.onChanged();
         return this;
      }

      public double getPrimalIntegral() {
         return this.primalIntegral_;
      }

      public CpSolverResponse.Builder setPrimalIntegral(double var1) {
         this.primalIntegral_ = var1;
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder clearPrimalIntegral() {
         this.primalIntegral_ = 0.0D;
         this.onChanged();
         return this;
      }

      public String getSolutionInfo() {
         Object var1 = this.solutionInfo_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.solutionInfo_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      public ByteString getSolutionInfoBytes() {
         Object var1 = this.solutionInfo_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.solutionInfo_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public CpSolverResponse.Builder setSolutionInfo(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.solutionInfo_ = var1;
            this.onChanged();
            return this;
         }
      }

      public CpSolverResponse.Builder clearSolutionInfo() {
         this.solutionInfo_ = CpSolverResponse.getDefaultInstance().getSolutionInfo();
         this.onChanged();
         return this;
      }

      public CpSolverResponse.Builder setSolutionInfoBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            CpSolverResponse.checkByteStringIsUtf8(var1);
            this.solutionInfo_ = var1;
            this.onChanged();
            return this;
         }
      }

      public final CpSolverResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CpSolverResponse.Builder)super.setUnknownFields(var1);
      }

      public final CpSolverResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CpSolverResponse.Builder)super.mergeUnknownFields(var1);
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
