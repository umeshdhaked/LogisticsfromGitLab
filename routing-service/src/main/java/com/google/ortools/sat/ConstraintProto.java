package com.google.ortools.sat;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.AbstractMessageLite.InternalOneOfEnum;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.GeneratedMessageV3.BuilderParent;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.IntList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class ConstraintProto extends GeneratedMessageV3 implements ConstraintProtoOrBuilder {
   private static final long serialVersionUID = 0L;
   private int constraintCase_;
   private Object constraint_;
   public static final int NAME_FIELD_NUMBER = 1;
   private volatile Object name_;
   public static final int ENFORCEMENT_LITERAL_FIELD_NUMBER = 2;
   private IntList enforcementLiteral_;
   private int enforcementLiteralMemoizedSerializedSize;
   public static final int BOOL_OR_FIELD_NUMBER = 3;
   public static final int BOOL_AND_FIELD_NUMBER = 4;
   public static final int AT_MOST_ONE_FIELD_NUMBER = 26;
   public static final int BOOL_XOR_FIELD_NUMBER = 5;
   public static final int INT_DIV_FIELD_NUMBER = 7;
   public static final int INT_MOD_FIELD_NUMBER = 8;
   public static final int INT_MAX_FIELD_NUMBER = 9;
   public static final int INT_MIN_FIELD_NUMBER = 10;
   public static final int INT_PROD_FIELD_NUMBER = 11;
   public static final int LINEAR_FIELD_NUMBER = 12;
   public static final int ALL_DIFF_FIELD_NUMBER = 13;
   public static final int ELEMENT_FIELD_NUMBER = 14;
   public static final int CIRCUIT_FIELD_NUMBER = 15;
   public static final int ROUTES_FIELD_NUMBER = 23;
   public static final int CIRCUIT_COVERING_FIELD_NUMBER = 25;
   public static final int TABLE_FIELD_NUMBER = 16;
   public static final int AUTOMATON_FIELD_NUMBER = 17;
   public static final int INVERSE_FIELD_NUMBER = 18;
   public static final int RESERVOIR_FIELD_NUMBER = 24;
   public static final int INTERVAL_FIELD_NUMBER = 19;
   public static final int NO_OVERLAP_FIELD_NUMBER = 20;
   public static final int NO_OVERLAP_2D_FIELD_NUMBER = 21;
   public static final int CUMULATIVE_FIELD_NUMBER = 22;
   private byte memoizedIsInitialized;
   private static final ConstraintProto DEFAULT_INSTANCE = new ConstraintProto();
   private static final Parser PARSER = new AbstractParser() {
      public ConstraintProto parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return new ConstraintProto(var1, var2);
      }
   };

   private ConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1) {
      super(var1);
      this.constraintCase_ = 0;
      this.enforcementLiteralMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
   }

   private ConstraintProto() {
      this.constraintCase_ = 0;
      this.enforcementLiteralMemoizedSerializedSize = -1;
      this.memoizedIsInitialized = -1;
      this.name_ = "";
      this.enforcementLiteral_ = emptyIntList();
   }

   protected Object newInstance(UnusedPrivateParameter var1) {
      return new ConstraintProto();
   }

   public final UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
   }

   private ConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      this();
      if (var2 == null) {
         throw new NullPointerException();
      } else {
         boolean var3 = false;
         com.google.protobuf.UnknownFieldSet.Builder var4 = UnknownFieldSet.newBuilder();

         try {
            boolean var5 = false;

            while(!var5) {
               int var6 = var1.readTag();
               BoolArgumentProto.Builder var7;
               int var8;
               IntegerArgumentProto.Builder var30;
               switch(var6) {
               case 0:
                  var5 = true;
                  continue;
               case 10:
                  String var32 = var1.readStringRequireUtf8();
                  this.name_ = var32;
                  continue;
               case 16:
                  if (!(var3 & true)) {
                     this.enforcementLiteral_ = newIntList();
                     var3 |= true;
                  }

                  this.enforcementLiteral_.addInt(var1.readInt32());
                  continue;
               case 18:
                  int var31 = var1.readRawVarint32();
                  var8 = var1.pushLimit(var31);
                  if (!(var3 & true) && var1.getBytesUntilLimit() > 0) {
                     this.enforcementLiteral_ = newIntList();
                     var3 |= true;
                  }
                  break;
               case 26:
                  var7 = null;
                  if (this.constraintCase_ == 3) {
                     var7 = ((BoolArgumentProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(BoolArgumentProto.parser(), var2);
                  if (var7 != null) {
                     var7.mergeFrom((BoolArgumentProto)this.constraint_);
                     this.constraint_ = var7.buildPartial();
                  }

                  this.constraintCase_ = 3;
                  continue;
               case 34:
                  var7 = null;
                  if (this.constraintCase_ == 4) {
                     var7 = ((BoolArgumentProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(BoolArgumentProto.parser(), var2);
                  if (var7 != null) {
                     var7.mergeFrom((BoolArgumentProto)this.constraint_);
                     this.constraint_ = var7.buildPartial();
                  }

                  this.constraintCase_ = 4;
                  continue;
               case 42:
                  var7 = null;
                  if (this.constraintCase_ == 5) {
                     var7 = ((BoolArgumentProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(BoolArgumentProto.parser(), var2);
                  if (var7 != null) {
                     var7.mergeFrom((BoolArgumentProto)this.constraint_);
                     this.constraint_ = var7.buildPartial();
                  }

                  this.constraintCase_ = 5;
                  continue;
               case 58:
                  var30 = null;
                  if (this.constraintCase_ == 7) {
                     var30 = ((IntegerArgumentProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(IntegerArgumentProto.parser(), var2);
                  if (var30 != null) {
                     var30.mergeFrom((IntegerArgumentProto)this.constraint_);
                     this.constraint_ = var30.buildPartial();
                  }

                  this.constraintCase_ = 7;
                  continue;
               case 66:
                  var30 = null;
                  if (this.constraintCase_ == 8) {
                     var30 = ((IntegerArgumentProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(IntegerArgumentProto.parser(), var2);
                  if (var30 != null) {
                     var30.mergeFrom((IntegerArgumentProto)this.constraint_);
                     this.constraint_ = var30.buildPartial();
                  }

                  this.constraintCase_ = 8;
                  continue;
               case 74:
                  var30 = null;
                  if (this.constraintCase_ == 9) {
                     var30 = ((IntegerArgumentProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(IntegerArgumentProto.parser(), var2);
                  if (var30 != null) {
                     var30.mergeFrom((IntegerArgumentProto)this.constraint_);
                     this.constraint_ = var30.buildPartial();
                  }

                  this.constraintCase_ = 9;
                  continue;
               case 82:
                  var30 = null;
                  if (this.constraintCase_ == 10) {
                     var30 = ((IntegerArgumentProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(IntegerArgumentProto.parser(), var2);
                  if (var30 != null) {
                     var30.mergeFrom((IntegerArgumentProto)this.constraint_);
                     this.constraint_ = var30.buildPartial();
                  }

                  this.constraintCase_ = 10;
                  continue;
               case 90:
                  var30 = null;
                  if (this.constraintCase_ == 11) {
                     var30 = ((IntegerArgumentProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(IntegerArgumentProto.parser(), var2);
                  if (var30 != null) {
                     var30.mergeFrom((IntegerArgumentProto)this.constraint_);
                     this.constraint_ = var30.buildPartial();
                  }

                  this.constraintCase_ = 11;
                  continue;
               case 98:
                  LinearConstraintProto.Builder var29 = null;
                  if (this.constraintCase_ == 12) {
                     var29 = ((LinearConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(LinearConstraintProto.parser(), var2);
                  if (var29 != null) {
                     var29.mergeFrom((LinearConstraintProto)this.constraint_);
                     this.constraint_ = var29.buildPartial();
                  }

                  this.constraintCase_ = 12;
                  continue;
               case 106:
                  AllDifferentConstraintProto.Builder var28 = null;
                  if (this.constraintCase_ == 13) {
                     var28 = ((AllDifferentConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(AllDifferentConstraintProto.parser(), var2);
                  if (var28 != null) {
                     var28.mergeFrom((AllDifferentConstraintProto)this.constraint_);
                     this.constraint_ = var28.buildPartial();
                  }

                  this.constraintCase_ = 13;
                  continue;
               case 114:
                  ElementConstraintProto.Builder var27 = null;
                  if (this.constraintCase_ == 14) {
                     var27 = ((ElementConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(ElementConstraintProto.parser(), var2);
                  if (var27 != null) {
                     var27.mergeFrom((ElementConstraintProto)this.constraint_);
                     this.constraint_ = var27.buildPartial();
                  }

                  this.constraintCase_ = 14;
                  continue;
               case 122:
                  CircuitConstraintProto.Builder var26 = null;
                  if (this.constraintCase_ == 15) {
                     var26 = ((CircuitConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(CircuitConstraintProto.parser(), var2);
                  if (var26 != null) {
                     var26.mergeFrom((CircuitConstraintProto)this.constraint_);
                     this.constraint_ = var26.buildPartial();
                  }

                  this.constraintCase_ = 15;
                  continue;
               case 130:
                  TableConstraintProto.Builder var25 = null;
                  if (this.constraintCase_ == 16) {
                     var25 = ((TableConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(TableConstraintProto.parser(), var2);
                  if (var25 != null) {
                     var25.mergeFrom((TableConstraintProto)this.constraint_);
                     this.constraint_ = var25.buildPartial();
                  }

                  this.constraintCase_ = 16;
                  continue;
               case 138:
                  AutomatonConstraintProto.Builder var24 = null;
                  if (this.constraintCase_ == 17) {
                     var24 = ((AutomatonConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(AutomatonConstraintProto.parser(), var2);
                  if (var24 != null) {
                     var24.mergeFrom((AutomatonConstraintProto)this.constraint_);
                     this.constraint_ = var24.buildPartial();
                  }

                  this.constraintCase_ = 17;
                  continue;
               case 146:
                  InverseConstraintProto.Builder var23 = null;
                  if (this.constraintCase_ == 18) {
                     var23 = ((InverseConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(InverseConstraintProto.parser(), var2);
                  if (var23 != null) {
                     var23.mergeFrom((InverseConstraintProto)this.constraint_);
                     this.constraint_ = var23.buildPartial();
                  }

                  this.constraintCase_ = 18;
                  continue;
               case 154:
                  IntervalConstraintProto.Builder var22 = null;
                  if (this.constraintCase_ == 19) {
                     var22 = ((IntervalConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(IntervalConstraintProto.parser(), var2);
                  if (var22 != null) {
                     var22.mergeFrom((IntervalConstraintProto)this.constraint_);
                     this.constraint_ = var22.buildPartial();
                  }

                  this.constraintCase_ = 19;
                  continue;
               case 162:
                  NoOverlapConstraintProto.Builder var21 = null;
                  if (this.constraintCase_ == 20) {
                     var21 = ((NoOverlapConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(NoOverlapConstraintProto.parser(), var2);
                  if (var21 != null) {
                     var21.mergeFrom((NoOverlapConstraintProto)this.constraint_);
                     this.constraint_ = var21.buildPartial();
                  }

                  this.constraintCase_ = 20;
                  continue;
               case 170:
                  NoOverlap2DConstraintProto.Builder var20 = null;
                  if (this.constraintCase_ == 21) {
                     var20 = ((NoOverlap2DConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(NoOverlap2DConstraintProto.parser(), var2);
                  if (var20 != null) {
                     var20.mergeFrom((NoOverlap2DConstraintProto)this.constraint_);
                     this.constraint_ = var20.buildPartial();
                  }

                  this.constraintCase_ = 21;
                  continue;
               case 178:
                  CumulativeConstraintProto.Builder var19 = null;
                  if (this.constraintCase_ == 22) {
                     var19 = ((CumulativeConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(CumulativeConstraintProto.parser(), var2);
                  if (var19 != null) {
                     var19.mergeFrom((CumulativeConstraintProto)this.constraint_);
                     this.constraint_ = var19.buildPartial();
                  }

                  this.constraintCase_ = 22;
                  continue;
               case 186:
                  RoutesConstraintProto.Builder var18 = null;
                  if (this.constraintCase_ == 23) {
                     var18 = ((RoutesConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(RoutesConstraintProto.parser(), var2);
                  if (var18 != null) {
                     var18.mergeFrom((RoutesConstraintProto)this.constraint_);
                     this.constraint_ = var18.buildPartial();
                  }

                  this.constraintCase_ = 23;
                  continue;
               case 194:
                  ReservoirConstraintProto.Builder var17 = null;
                  if (this.constraintCase_ == 24) {
                     var17 = ((ReservoirConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(ReservoirConstraintProto.parser(), var2);
                  if (var17 != null) {
                     var17.mergeFrom((ReservoirConstraintProto)this.constraint_);
                     this.constraint_ = var17.buildPartial();
                  }

                  this.constraintCase_ = 24;
                  continue;
               case 202:
                  CircuitCoveringConstraintProto.Builder var16 = null;
                  if (this.constraintCase_ == 25) {
                     var16 = ((CircuitCoveringConstraintProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(CircuitCoveringConstraintProto.parser(), var2);
                  if (var16 != null) {
                     var16.mergeFrom((CircuitCoveringConstraintProto)this.constraint_);
                     this.constraint_ = var16.buildPartial();
                  }

                  this.constraintCase_ = 25;
                  continue;
               case 210:
                  var7 = null;
                  if (this.constraintCase_ == 26) {
                     var7 = ((BoolArgumentProto)this.constraint_).toBuilder();
                  }

                  this.constraint_ = var1.readMessage(BoolArgumentProto.parser(), var2);
                  if (var7 != null) {
                     var7.mergeFrom((BoolArgumentProto)this.constraint_);
                     this.constraint_ = var7.buildPartial();
                  }

                  this.constraintCase_ = 26;
                  continue;
               default:
                  if (!this.parseUnknownField(var1, var4, var2, var6)) {
                     var5 = true;
                  }
                  continue;
               }

               while(var1.getBytesUntilLimit() > 0) {
                  this.enforcementLiteral_.addInt(var1.readInt32());
               }

               var1.popLimit(var8);
            }
         } catch (InvalidProtocolBufferException var13) {
            throw var13.setUnfinishedMessage(this);
         } catch (IOException var14) {
            throw (new InvalidProtocolBufferException(var14)).setUnfinishedMessage(this);
         } finally {
            if (var3 & true) {
               this.enforcementLiteral_.makeImmutable();
            }

            this.unknownFields = var4.build();
            this.makeExtensionsImmutable();
         }

      }
   }

   public static final Descriptor getDescriptor() {
      return CpModelProtobuf.internal_static_operations_research_sat_ConstraintProto_descriptor;
   }

   protected FieldAccessorTable internalGetFieldAccessorTable() {
      return CpModelProtobuf.internal_static_operations_research_sat_ConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(ConstraintProto.class, ConstraintProto.Builder.class);
   }

   public ConstraintProto.ConstraintCase getConstraintCase() {
      return ConstraintProto.ConstraintCase.forNumber(this.constraintCase_);
   }

   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      } else {
         ByteString var2 = (ByteString)var1;
         String var3 = var2.toStringUtf8();
         this.name_ = var3;
         return var3;
      }
   }

   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   public List getEnforcementLiteralList() {
      return this.enforcementLiteral_;
   }

   public int getEnforcementLiteralCount() {
      return this.enforcementLiteral_.size();
   }

   public int getEnforcementLiteral(int var1) {
      return this.enforcementLiteral_.getInt(var1);
   }

   public boolean hasBoolOr() {
      return this.constraintCase_ == 3;
   }

   public BoolArgumentProto getBoolOr() {
      return this.constraintCase_ == 3 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
   }

   public BoolArgumentProtoOrBuilder getBoolOrOrBuilder() {
      return this.constraintCase_ == 3 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
   }

   public boolean hasBoolAnd() {
      return this.constraintCase_ == 4;
   }

   public BoolArgumentProto getBoolAnd() {
      return this.constraintCase_ == 4 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
   }

   public BoolArgumentProtoOrBuilder getBoolAndOrBuilder() {
      return this.constraintCase_ == 4 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
   }

   public boolean hasAtMostOne() {
      return this.constraintCase_ == 26;
   }

   public BoolArgumentProto getAtMostOne() {
      return this.constraintCase_ == 26 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
   }

   public BoolArgumentProtoOrBuilder getAtMostOneOrBuilder() {
      return this.constraintCase_ == 26 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
   }

   public boolean hasBoolXor() {
      return this.constraintCase_ == 5;
   }

   public BoolArgumentProto getBoolXor() {
      return this.constraintCase_ == 5 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
   }

   public BoolArgumentProtoOrBuilder getBoolXorOrBuilder() {
      return this.constraintCase_ == 5 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
   }

   public boolean hasIntDiv() {
      return this.constraintCase_ == 7;
   }

   public IntegerArgumentProto getIntDiv() {
      return this.constraintCase_ == 7 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
   }

   public IntegerArgumentProtoOrBuilder getIntDivOrBuilder() {
      return this.constraintCase_ == 7 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
   }

   public boolean hasIntMod() {
      return this.constraintCase_ == 8;
   }

   public IntegerArgumentProto getIntMod() {
      return this.constraintCase_ == 8 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
   }

   public IntegerArgumentProtoOrBuilder getIntModOrBuilder() {
      return this.constraintCase_ == 8 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
   }

   public boolean hasIntMax() {
      return this.constraintCase_ == 9;
   }

   public IntegerArgumentProto getIntMax() {
      return this.constraintCase_ == 9 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
   }

   public IntegerArgumentProtoOrBuilder getIntMaxOrBuilder() {
      return this.constraintCase_ == 9 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
   }

   public boolean hasIntMin() {
      return this.constraintCase_ == 10;
   }

   public IntegerArgumentProto getIntMin() {
      return this.constraintCase_ == 10 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
   }

   public IntegerArgumentProtoOrBuilder getIntMinOrBuilder() {
      return this.constraintCase_ == 10 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
   }

   public boolean hasIntProd() {
      return this.constraintCase_ == 11;
   }

   public IntegerArgumentProto getIntProd() {
      return this.constraintCase_ == 11 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
   }

   public IntegerArgumentProtoOrBuilder getIntProdOrBuilder() {
      return this.constraintCase_ == 11 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
   }

   public boolean hasLinear() {
      return this.constraintCase_ == 12;
   }

   public LinearConstraintProto getLinear() {
      return this.constraintCase_ == 12 ? (LinearConstraintProto)this.constraint_ : LinearConstraintProto.getDefaultInstance();
   }

   public LinearConstraintProtoOrBuilder getLinearOrBuilder() {
      return this.constraintCase_ == 12 ? (LinearConstraintProto)this.constraint_ : LinearConstraintProto.getDefaultInstance();
   }

   public boolean hasAllDiff() {
      return this.constraintCase_ == 13;
   }

   public AllDifferentConstraintProto getAllDiff() {
      return this.constraintCase_ == 13 ? (AllDifferentConstraintProto)this.constraint_ : AllDifferentConstraintProto.getDefaultInstance();
   }

   public AllDifferentConstraintProtoOrBuilder getAllDiffOrBuilder() {
      return this.constraintCase_ == 13 ? (AllDifferentConstraintProto)this.constraint_ : AllDifferentConstraintProto.getDefaultInstance();
   }

   public boolean hasElement() {
      return this.constraintCase_ == 14;
   }

   public ElementConstraintProto getElement() {
      return this.constraintCase_ == 14 ? (ElementConstraintProto)this.constraint_ : ElementConstraintProto.getDefaultInstance();
   }

   public ElementConstraintProtoOrBuilder getElementOrBuilder() {
      return this.constraintCase_ == 14 ? (ElementConstraintProto)this.constraint_ : ElementConstraintProto.getDefaultInstance();
   }

   public boolean hasCircuit() {
      return this.constraintCase_ == 15;
   }

   public CircuitConstraintProto getCircuit() {
      return this.constraintCase_ == 15 ? (CircuitConstraintProto)this.constraint_ : CircuitConstraintProto.getDefaultInstance();
   }

   public CircuitConstraintProtoOrBuilder getCircuitOrBuilder() {
      return this.constraintCase_ == 15 ? (CircuitConstraintProto)this.constraint_ : CircuitConstraintProto.getDefaultInstance();
   }

   public boolean hasRoutes() {
      return this.constraintCase_ == 23;
   }

   public RoutesConstraintProto getRoutes() {
      return this.constraintCase_ == 23 ? (RoutesConstraintProto)this.constraint_ : RoutesConstraintProto.getDefaultInstance();
   }

   public RoutesConstraintProtoOrBuilder getRoutesOrBuilder() {
      return this.constraintCase_ == 23 ? (RoutesConstraintProto)this.constraint_ : RoutesConstraintProto.getDefaultInstance();
   }

   public boolean hasCircuitCovering() {
      return this.constraintCase_ == 25;
   }

   public CircuitCoveringConstraintProto getCircuitCovering() {
      return this.constraintCase_ == 25 ? (CircuitCoveringConstraintProto)this.constraint_ : CircuitCoveringConstraintProto.getDefaultInstance();
   }

   public CircuitCoveringConstraintProtoOrBuilder getCircuitCoveringOrBuilder() {
      return this.constraintCase_ == 25 ? (CircuitCoveringConstraintProto)this.constraint_ : CircuitCoveringConstraintProto.getDefaultInstance();
   }

   public boolean hasTable() {
      return this.constraintCase_ == 16;
   }

   public TableConstraintProto getTable() {
      return this.constraintCase_ == 16 ? (TableConstraintProto)this.constraint_ : TableConstraintProto.getDefaultInstance();
   }

   public TableConstraintProtoOrBuilder getTableOrBuilder() {
      return this.constraintCase_ == 16 ? (TableConstraintProto)this.constraint_ : TableConstraintProto.getDefaultInstance();
   }

   public boolean hasAutomaton() {
      return this.constraintCase_ == 17;
   }

   public AutomatonConstraintProto getAutomaton() {
      return this.constraintCase_ == 17 ? (AutomatonConstraintProto)this.constraint_ : AutomatonConstraintProto.getDefaultInstance();
   }

   public AutomatonConstraintProtoOrBuilder getAutomatonOrBuilder() {
      return this.constraintCase_ == 17 ? (AutomatonConstraintProto)this.constraint_ : AutomatonConstraintProto.getDefaultInstance();
   }

   public boolean hasInverse() {
      return this.constraintCase_ == 18;
   }

   public InverseConstraintProto getInverse() {
      return this.constraintCase_ == 18 ? (InverseConstraintProto)this.constraint_ : InverseConstraintProto.getDefaultInstance();
   }

   public InverseConstraintProtoOrBuilder getInverseOrBuilder() {
      return this.constraintCase_ == 18 ? (InverseConstraintProto)this.constraint_ : InverseConstraintProto.getDefaultInstance();
   }

   public boolean hasReservoir() {
      return this.constraintCase_ == 24;
   }

   public ReservoirConstraintProto getReservoir() {
      return this.constraintCase_ == 24 ? (ReservoirConstraintProto)this.constraint_ : ReservoirConstraintProto.getDefaultInstance();
   }

   public ReservoirConstraintProtoOrBuilder getReservoirOrBuilder() {
      return this.constraintCase_ == 24 ? (ReservoirConstraintProto)this.constraint_ : ReservoirConstraintProto.getDefaultInstance();
   }

   public boolean hasInterval() {
      return this.constraintCase_ == 19;
   }

   public IntervalConstraintProto getInterval() {
      return this.constraintCase_ == 19 ? (IntervalConstraintProto)this.constraint_ : IntervalConstraintProto.getDefaultInstance();
   }

   public IntervalConstraintProtoOrBuilder getIntervalOrBuilder() {
      return this.constraintCase_ == 19 ? (IntervalConstraintProto)this.constraint_ : IntervalConstraintProto.getDefaultInstance();
   }

   public boolean hasNoOverlap() {
      return this.constraintCase_ == 20;
   }

   public NoOverlapConstraintProto getNoOverlap() {
      return this.constraintCase_ == 20 ? (NoOverlapConstraintProto)this.constraint_ : NoOverlapConstraintProto.getDefaultInstance();
   }

   public NoOverlapConstraintProtoOrBuilder getNoOverlapOrBuilder() {
      return this.constraintCase_ == 20 ? (NoOverlapConstraintProto)this.constraint_ : NoOverlapConstraintProto.getDefaultInstance();
   }

   public boolean hasNoOverlap2D() {
      return this.constraintCase_ == 21;
   }

   public NoOverlap2DConstraintProto getNoOverlap2D() {
      return this.constraintCase_ == 21 ? (NoOverlap2DConstraintProto)this.constraint_ : NoOverlap2DConstraintProto.getDefaultInstance();
   }

   public NoOverlap2DConstraintProtoOrBuilder getNoOverlap2DOrBuilder() {
      return this.constraintCase_ == 21 ? (NoOverlap2DConstraintProto)this.constraint_ : NoOverlap2DConstraintProto.getDefaultInstance();
   }

   public boolean hasCumulative() {
      return this.constraintCase_ == 22;
   }

   public CumulativeConstraintProto getCumulative() {
      return this.constraintCase_ == 22 ? (CumulativeConstraintProto)this.constraint_ : CumulativeConstraintProto.getDefaultInstance();
   }

   public CumulativeConstraintProtoOrBuilder getCumulativeOrBuilder() {
      return this.constraintCase_ == 22 ? (CumulativeConstraintProto)this.constraint_ : CumulativeConstraintProto.getDefaultInstance();
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
      if (!this.getNameBytes().isEmpty()) {
         GeneratedMessageV3.writeString(var1, 1, this.name_);
      }

      if (this.getEnforcementLiteralList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.enforcementLiteralMemoizedSerializedSize);
      }

      for(int var2 = 0; var2 < this.enforcementLiteral_.size(); ++var2) {
         var1.writeInt32NoTag(this.enforcementLiteral_.getInt(var2));
      }

      if (this.constraintCase_ == 3) {
         var1.writeMessage(3, (BoolArgumentProto)this.constraint_);
      }

      if (this.constraintCase_ == 4) {
         var1.writeMessage(4, (BoolArgumentProto)this.constraint_);
      }

      if (this.constraintCase_ == 5) {
         var1.writeMessage(5, (BoolArgumentProto)this.constraint_);
      }

      if (this.constraintCase_ == 7) {
         var1.writeMessage(7, (IntegerArgumentProto)this.constraint_);
      }

      if (this.constraintCase_ == 8) {
         var1.writeMessage(8, (IntegerArgumentProto)this.constraint_);
      }

      if (this.constraintCase_ == 9) {
         var1.writeMessage(9, (IntegerArgumentProto)this.constraint_);
      }

      if (this.constraintCase_ == 10) {
         var1.writeMessage(10, (IntegerArgumentProto)this.constraint_);
      }

      if (this.constraintCase_ == 11) {
         var1.writeMessage(11, (IntegerArgumentProto)this.constraint_);
      }

      if (this.constraintCase_ == 12) {
         var1.writeMessage(12, (LinearConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 13) {
         var1.writeMessage(13, (AllDifferentConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 14) {
         var1.writeMessage(14, (ElementConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 15) {
         var1.writeMessage(15, (CircuitConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 16) {
         var1.writeMessage(16, (TableConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 17) {
         var1.writeMessage(17, (AutomatonConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 18) {
         var1.writeMessage(18, (InverseConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 19) {
         var1.writeMessage(19, (IntervalConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 20) {
         var1.writeMessage(20, (NoOverlapConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 21) {
         var1.writeMessage(21, (NoOverlap2DConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 22) {
         var1.writeMessage(22, (CumulativeConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 23) {
         var1.writeMessage(23, (RoutesConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 24) {
         var1.writeMessage(24, (ReservoirConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 25) {
         var1.writeMessage(25, (CircuitCoveringConstraintProto)this.constraint_);
      }

      if (this.constraintCase_ == 26) {
         var1.writeMessage(26, (BoolArgumentProto)this.constraint_);
      }

      this.unknownFields.writeTo(var1);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         var1 = 0;
         if (!this.getNameBytes().isEmpty()) {
            var1 += GeneratedMessageV3.computeStringSize(1, this.name_);
         }

         int var2 = 0;

         for(int var3 = 0; var3 < this.enforcementLiteral_.size(); ++var3) {
            var2 += CodedOutputStream.computeInt32SizeNoTag(this.enforcementLiteral_.getInt(var3));
         }

         var1 += var2;
         if (!this.getEnforcementLiteralList().isEmpty()) {
            ++var1;
            var1 += CodedOutputStream.computeInt32SizeNoTag(var2);
         }

         this.enforcementLiteralMemoizedSerializedSize = var2;
         if (this.constraintCase_ == 3) {
            var1 += CodedOutputStream.computeMessageSize(3, (BoolArgumentProto)this.constraint_);
         }

         if (this.constraintCase_ == 4) {
            var1 += CodedOutputStream.computeMessageSize(4, (BoolArgumentProto)this.constraint_);
         }

         if (this.constraintCase_ == 5) {
            var1 += CodedOutputStream.computeMessageSize(5, (BoolArgumentProto)this.constraint_);
         }

         if (this.constraintCase_ == 7) {
            var1 += CodedOutputStream.computeMessageSize(7, (IntegerArgumentProto)this.constraint_);
         }

         if (this.constraintCase_ == 8) {
            var1 += CodedOutputStream.computeMessageSize(8, (IntegerArgumentProto)this.constraint_);
         }

         if (this.constraintCase_ == 9) {
            var1 += CodedOutputStream.computeMessageSize(9, (IntegerArgumentProto)this.constraint_);
         }

         if (this.constraintCase_ == 10) {
            var1 += CodedOutputStream.computeMessageSize(10, (IntegerArgumentProto)this.constraint_);
         }

         if (this.constraintCase_ == 11) {
            var1 += CodedOutputStream.computeMessageSize(11, (IntegerArgumentProto)this.constraint_);
         }

         if (this.constraintCase_ == 12) {
            var1 += CodedOutputStream.computeMessageSize(12, (LinearConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 13) {
            var1 += CodedOutputStream.computeMessageSize(13, (AllDifferentConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 14) {
            var1 += CodedOutputStream.computeMessageSize(14, (ElementConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 15) {
            var1 += CodedOutputStream.computeMessageSize(15, (CircuitConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 16) {
            var1 += CodedOutputStream.computeMessageSize(16, (TableConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 17) {
            var1 += CodedOutputStream.computeMessageSize(17, (AutomatonConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 18) {
            var1 += CodedOutputStream.computeMessageSize(18, (InverseConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 19) {
            var1 += CodedOutputStream.computeMessageSize(19, (IntervalConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 20) {
            var1 += CodedOutputStream.computeMessageSize(20, (NoOverlapConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 21) {
            var1 += CodedOutputStream.computeMessageSize(21, (NoOverlap2DConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 22) {
            var1 += CodedOutputStream.computeMessageSize(22, (CumulativeConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 23) {
            var1 += CodedOutputStream.computeMessageSize(23, (RoutesConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 24) {
            var1 += CodedOutputStream.computeMessageSize(24, (ReservoirConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 25) {
            var1 += CodedOutputStream.computeMessageSize(25, (CircuitCoveringConstraintProto)this.constraint_);
         }

         if (this.constraintCase_ == 26) {
            var1 += CodedOutputStream.computeMessageSize(26, (BoolArgumentProto)this.constraint_);
         }

         var1 += this.unknownFields.getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConstraintProto)) {
         return super.equals(var1);
      } else {
         ConstraintProto var2 = (ConstraintProto)var1;
         if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getEnforcementLiteralList().equals(var2.getEnforcementLiteralList())) {
            return false;
         } else if (!this.getConstraintCase().equals(var2.getConstraintCase())) {
            return false;
         } else {
            switch(this.constraintCase_) {
            case 0:
            case 1:
            case 2:
            case 6:
            default:
               break;
            case 3:
               if (!this.getBoolOr().equals(var2.getBoolOr())) {
                  return false;
               }
               break;
            case 4:
               if (!this.getBoolAnd().equals(var2.getBoolAnd())) {
                  return false;
               }
               break;
            case 5:
               if (!this.getBoolXor().equals(var2.getBoolXor())) {
                  return false;
               }
               break;
            case 7:
               if (!this.getIntDiv().equals(var2.getIntDiv())) {
                  return false;
               }
               break;
            case 8:
               if (!this.getIntMod().equals(var2.getIntMod())) {
                  return false;
               }
               break;
            case 9:
               if (!this.getIntMax().equals(var2.getIntMax())) {
                  return false;
               }
               break;
            case 10:
               if (!this.getIntMin().equals(var2.getIntMin())) {
                  return false;
               }
               break;
            case 11:
               if (!this.getIntProd().equals(var2.getIntProd())) {
                  return false;
               }
               break;
            case 12:
               if (!this.getLinear().equals(var2.getLinear())) {
                  return false;
               }
               break;
            case 13:
               if (!this.getAllDiff().equals(var2.getAllDiff())) {
                  return false;
               }
               break;
            case 14:
               if (!this.getElement().equals(var2.getElement())) {
                  return false;
               }
               break;
            case 15:
               if (!this.getCircuit().equals(var2.getCircuit())) {
                  return false;
               }
               break;
            case 16:
               if (!this.getTable().equals(var2.getTable())) {
                  return false;
               }
               break;
            case 17:
               if (!this.getAutomaton().equals(var2.getAutomaton())) {
                  return false;
               }
               break;
            case 18:
               if (!this.getInverse().equals(var2.getInverse())) {
                  return false;
               }
               break;
            case 19:
               if (!this.getInterval().equals(var2.getInterval())) {
                  return false;
               }
               break;
            case 20:
               if (!this.getNoOverlap().equals(var2.getNoOverlap())) {
                  return false;
               }
               break;
            case 21:
               if (!this.getNoOverlap2D().equals(var2.getNoOverlap2D())) {
                  return false;
               }
               break;
            case 22:
               if (!this.getCumulative().equals(var2.getCumulative())) {
                  return false;
               }
               break;
            case 23:
               if (!this.getRoutes().equals(var2.getRoutes())) {
                  return false;
               }
               break;
            case 24:
               if (!this.getReservoir().equals(var2.getReservoir())) {
                  return false;
               }
               break;
            case 25:
               if (!this.getCircuitCovering().equals(var2.getCircuitCovering())) {
                  return false;
               }
               break;
            case 26:
               if (!this.getAtMostOne().equals(var2.getAtMostOne())) {
                  return false;
               }
            }

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
         var2 = 53 * var2 + this.getName().hashCode();
         if (this.getEnforcementLiteralCount() > 0) {
            var2 = 37 * var2 + 2;
            var2 = 53 * var2 + this.getEnforcementLiteralList().hashCode();
         }

         switch(this.constraintCase_) {
         case 0:
         case 1:
         case 2:
         case 6:
         default:
            break;
         case 3:
            var2 = 37 * var2 + 3;
            var2 = 53 * var2 + this.getBoolOr().hashCode();
            break;
         case 4:
            var2 = 37 * var2 + 4;
            var2 = 53 * var2 + this.getBoolAnd().hashCode();
            break;
         case 5:
            var2 = 37 * var2 + 5;
            var2 = 53 * var2 + this.getBoolXor().hashCode();
            break;
         case 7:
            var2 = 37 * var2 + 7;
            var2 = 53 * var2 + this.getIntDiv().hashCode();
            break;
         case 8:
            var2 = 37 * var2 + 8;
            var2 = 53 * var2 + this.getIntMod().hashCode();
            break;
         case 9:
            var2 = 37 * var2 + 9;
            var2 = 53 * var2 + this.getIntMax().hashCode();
            break;
         case 10:
            var2 = 37 * var2 + 10;
            var2 = 53 * var2 + this.getIntMin().hashCode();
            break;
         case 11:
            var2 = 37 * var2 + 11;
            var2 = 53 * var2 + this.getIntProd().hashCode();
            break;
         case 12:
            var2 = 37 * var2 + 12;
            var2 = 53 * var2 + this.getLinear().hashCode();
            break;
         case 13:
            var2 = 37 * var2 + 13;
            var2 = 53 * var2 + this.getAllDiff().hashCode();
            break;
         case 14:
            var2 = 37 * var2 + 14;
            var2 = 53 * var2 + this.getElement().hashCode();
            break;
         case 15:
            var2 = 37 * var2 + 15;
            var2 = 53 * var2 + this.getCircuit().hashCode();
            break;
         case 16:
            var2 = 37 * var2 + 16;
            var2 = 53 * var2 + this.getTable().hashCode();
            break;
         case 17:
            var2 = 37 * var2 + 17;
            var2 = 53 * var2 + this.getAutomaton().hashCode();
            break;
         case 18:
            var2 = 37 * var2 + 18;
            var2 = 53 * var2 + this.getInverse().hashCode();
            break;
         case 19:
            var2 = 37 * var2 + 19;
            var2 = 53 * var2 + this.getInterval().hashCode();
            break;
         case 20:
            var2 = 37 * var2 + 20;
            var2 = 53 * var2 + this.getNoOverlap().hashCode();
            break;
         case 21:
            var2 = 37 * var2 + 21;
            var2 = 53 * var2 + this.getNoOverlap2D().hashCode();
            break;
         case 22:
            var2 = 37 * var2 + 22;
            var2 = 53 * var2 + this.getCumulative().hashCode();
            break;
         case 23:
            var2 = 37 * var2 + 23;
            var2 = 53 * var2 + this.getRoutes().hashCode();
            break;
         case 24:
            var2 = 37 * var2 + 24;
            var2 = 53 * var2 + this.getReservoir().hashCode();
            break;
         case 25:
            var2 = 37 * var2 + 25;
            var2 = 53 * var2 + this.getCircuitCovering().hashCode();
            break;
         case 26:
            var2 = 37 * var2 + 26;
            var2 = 53 * var2 + this.getAtMostOne().hashCode();
         }

         var2 = 29 * var2 + this.unknownFields.hashCode();
         this.memoizedHashCode = var2;
         return var2;
      }
   }

   public static ConstraintProto parseFrom(ByteBuffer var0) throws InvalidProtocolBufferException {
      return (ConstraintProto)PARSER.parseFrom(var0);
   }

   public static ConstraintProto parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static ConstraintProto parseFrom(ByteString var0) throws InvalidProtocolBufferException {
      return (ConstraintProto)PARSER.parseFrom(var0);
   }

   public static ConstraintProto parseFrom(ByteString var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static ConstraintProto parseFrom(byte[] var0) throws InvalidProtocolBufferException {
      return (ConstraintProto)PARSER.parseFrom(var0);
   }

   public static ConstraintProto parseFrom(byte[] var0, ExtensionRegistryLite var1) throws InvalidProtocolBufferException {
      return (ConstraintProto)PARSER.parseFrom(var0, var1);
   }

   public static ConstraintProto parseFrom(InputStream var0) throws IOException {
      return (ConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConstraintProto parseFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConstraintProto parseDelimitedFrom(InputStream var0) throws IOException {
      return (ConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConstraintProto parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ConstraintProto)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConstraintProto parseFrom(CodedInputStream var0) throws IOException {
      return (ConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConstraintProto parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) throws IOException {
      return (ConstraintProto)GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConstraintProto.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConstraintProto.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConstraintProto.Builder newBuilder(ConstraintProto var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConstraintProto.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConstraintProto.Builder() : (new ConstraintProto.Builder()).mergeFrom(this);
   }

   protected ConstraintProto.Builder newBuilderForType(BuilderParent var1) {
      ConstraintProto.Builder var2 = new ConstraintProto.Builder(var1);
      return var2;
   }

   @Override
   public byte[] toByteArray() {
      return new byte[0];
   }

   public static ConstraintProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser parser() {
      return PARSER;
   }

   public Parser getParserForType() {
      return PARSER;
   }

   public ConstraintProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   // $FF: synthetic method
   ConstraintProto(com.google.protobuf.GeneratedMessageV3.Builder var1, Object var2) {
      this(var1);
   }

   // $FF: synthetic method
   ConstraintProto(CodedInputStream var1, ExtensionRegistryLite var2, Object var3) throws InvalidProtocolBufferException {
      this(var1, var2);
   }

   public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder implements ConstraintProtoOrBuilder {
      private int constraintCase_;
      private Object constraint_;
      private int bitField0_;
      private Object name_;
      private IntList enforcementLiteral_;
      private SingleFieldBuilderV3 boolOrBuilder_;
      private SingleFieldBuilderV3 boolAndBuilder_;
      private SingleFieldBuilderV3 atMostOneBuilder_;
      private SingleFieldBuilderV3 boolXorBuilder_;
      private SingleFieldBuilderV3 intDivBuilder_;
      private SingleFieldBuilderV3 intModBuilder_;
      private SingleFieldBuilderV3 intMaxBuilder_;
      private SingleFieldBuilderV3 intMinBuilder_;
      private SingleFieldBuilderV3 intProdBuilder_;
      private SingleFieldBuilderV3 linearBuilder_;
      private SingleFieldBuilderV3 allDiffBuilder_;
      private SingleFieldBuilderV3 elementBuilder_;
      private SingleFieldBuilderV3 circuitBuilder_;
      private SingleFieldBuilderV3 routesBuilder_;
      private SingleFieldBuilderV3 circuitCoveringBuilder_;
      private SingleFieldBuilderV3 tableBuilder_;
      private SingleFieldBuilderV3 automatonBuilder_;
      private SingleFieldBuilderV3 inverseBuilder_;
      private SingleFieldBuilderV3 reservoirBuilder_;
      private SingleFieldBuilderV3 intervalBuilder_;
      private SingleFieldBuilderV3 noOverlapBuilder_;
      private SingleFieldBuilderV3 noOverlap2DBuilder_;
      private SingleFieldBuilderV3 cumulativeBuilder_;

      public static final Descriptor getDescriptor() {
         return CpModelProtobuf.internal_static_operations_research_sat_ConstraintProto_descriptor;
      }

      protected FieldAccessorTable internalGetFieldAccessorTable() {
         return CpModelProtobuf.internal_static_operations_research_sat_ConstraintProto_fieldAccessorTable.ensureFieldAccessorsInitialized(ConstraintProto.class, ConstraintProto.Builder.class);
      }

      private Builder() {
         this.constraintCase_ = 0;
         this.name_ = "";
         this.enforcementLiteral_ = ConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private Builder(BuilderParent var1) {
         super(var1);
         this.constraintCase_ = 0;
         this.name_ = "";
         this.enforcementLiteral_ = ConstraintProto.emptyIntList();
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConstraintProto.alwaysUseFieldBuilders) {
         }

      }

      public ConstraintProto.Builder clear() {
         super.clear();
         this.name_ = "";
         this.enforcementLiteral_ = ConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.constraintCase_ = 0;
         this.constraint_ = null;
         return this;
      }

      public Descriptor getDescriptorForType() {
         return CpModelProtobuf.internal_static_operations_research_sat_ConstraintProto_descriptor;
      }

      public ConstraintProto getDefaultInstanceForType() {
         return ConstraintProto.getDefaultInstance();
      }

      public ConstraintProto build() {
         ConstraintProto var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConstraintProto buildPartial() {
         ConstraintProto var1 = new ConstraintProto(this);
         int var2 = this.bitField0_;
         var1.name_ = this.name_;
         if ((this.bitField0_ & 1) != 0) {
            this.enforcementLiteral_.makeImmutable();
            this.bitField0_ &= -2;
         }

         var1.enforcementLiteral_ = this.enforcementLiteral_;
         if (this.constraintCase_ == 3) {
            if (this.boolOrBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.boolOrBuilder_.build();
            }
         }

         if (this.constraintCase_ == 4) {
            if (this.boolAndBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.boolAndBuilder_.build();
            }
         }

         if (this.constraintCase_ == 26) {
            if (this.atMostOneBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.atMostOneBuilder_.build();
            }
         }

         if (this.constraintCase_ == 5) {
            if (this.boolXorBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.boolXorBuilder_.build();
            }
         }

         if (this.constraintCase_ == 7) {
            if (this.intDivBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.intDivBuilder_.build();
            }
         }

         if (this.constraintCase_ == 8) {
            if (this.intModBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.intModBuilder_.build();
            }
         }

         if (this.constraintCase_ == 9) {
            if (this.intMaxBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.intMaxBuilder_.build();
            }
         }

         if (this.constraintCase_ == 10) {
            if (this.intMinBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.intMinBuilder_.build();
            }
         }

         if (this.constraintCase_ == 11) {
            if (this.intProdBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.intProdBuilder_.build();
            }
         }

         if (this.constraintCase_ == 12) {
            if (this.linearBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.linearBuilder_.build();
            }
         }

         if (this.constraintCase_ == 13) {
            if (this.allDiffBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.allDiffBuilder_.build();
            }
         }

         if (this.constraintCase_ == 14) {
            if (this.elementBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.elementBuilder_.build();
            }
         }

         if (this.constraintCase_ == 15) {
            if (this.circuitBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.circuitBuilder_.build();
            }
         }

         if (this.constraintCase_ == 23) {
            if (this.routesBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.routesBuilder_.build();
            }
         }

         if (this.constraintCase_ == 25) {
            if (this.circuitCoveringBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.circuitCoveringBuilder_.build();
            }
         }

         if (this.constraintCase_ == 16) {
            if (this.tableBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.tableBuilder_.build();
            }
         }

         if (this.constraintCase_ == 17) {
            if (this.automatonBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.automatonBuilder_.build();
            }
         }

         if (this.constraintCase_ == 18) {
            if (this.inverseBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.inverseBuilder_.build();
            }
         }

         if (this.constraintCase_ == 24) {
            if (this.reservoirBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.reservoirBuilder_.build();
            }
         }

         if (this.constraintCase_ == 19) {
            if (this.intervalBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.intervalBuilder_.build();
            }
         }

         if (this.constraintCase_ == 20) {
            if (this.noOverlapBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.noOverlapBuilder_.build();
            }
         }

         if (this.constraintCase_ == 21) {
            if (this.noOverlap2DBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.noOverlap2DBuilder_.build();
            }
         }

         if (this.constraintCase_ == 22) {
            if (this.cumulativeBuilder_ == null) {
               var1.constraint_ = this.constraint_;
            } else {
               var1.constraint_ = this.cumulativeBuilder_.build();
            }
         }

         var1.constraintCase_ = this.constraintCase_;
         this.onBuilt();
         return var1;
      }

      public ConstraintProto.Builder clone() {
         return (ConstraintProto.Builder)super.clone();
      }

      public ConstraintProto.Builder setField(FieldDescriptor var1, Object var2) {
         return (ConstraintProto.Builder)super.setField(var1, var2);
      }

      public ConstraintProto.Builder clearField(FieldDescriptor var1) {
         return (ConstraintProto.Builder)super.clearField(var1);
      }

      public ConstraintProto.Builder clearOneof(OneofDescriptor var1) {
         return (ConstraintProto.Builder)super.clearOneof(var1);
      }

      public ConstraintProto.Builder setRepeatedField(FieldDescriptor var1, int var2, Object var3) {
         return (ConstraintProto.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConstraintProto.Builder addRepeatedField(FieldDescriptor var1, Object var2) {
         return (ConstraintProto.Builder)super.addRepeatedField(var1, var2);
      }

      public ConstraintProto.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConstraintProto) {
            return this.mergeFrom((ConstraintProto)var1);
         } else {
            super.mergeFrom(var1);
            return this;
         }
      }

      public ConstraintProto.Builder mergeFrom(ConstraintProto var1) {
         if (var1 == ConstraintProto.getDefaultInstance()) {
            return this;
         } else {
            if (!var1.getName().isEmpty()) {
               this.name_ = var1.name_;
               this.onChanged();
            }

            if (!var1.enforcementLiteral_.isEmpty()) {
               if (this.enforcementLiteral_.isEmpty()) {
                  this.enforcementLiteral_ = var1.enforcementLiteral_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureEnforcementLiteralIsMutable();
                  this.enforcementLiteral_.addAll(var1.enforcementLiteral_);
               }

               this.onChanged();
            }

            switch(var1.getConstraintCase()) {
            case BOOL_OR:
               this.mergeBoolOr(var1.getBoolOr());
               break;
            case BOOL_AND:
               this.mergeBoolAnd(var1.getBoolAnd());
               break;
            case AT_MOST_ONE:
               this.mergeAtMostOne(var1.getAtMostOne());
               break;
            case BOOL_XOR:
               this.mergeBoolXor(var1.getBoolXor());
               break;
            case INT_DIV:
               this.mergeIntDiv(var1.getIntDiv());
               break;
            case INT_MOD:
               this.mergeIntMod(var1.getIntMod());
               break;
            case INT_MAX:
               this.mergeIntMax(var1.getIntMax());
               break;
            case INT_MIN:
               this.mergeIntMin(var1.getIntMin());
               break;
            case INT_PROD:
               this.mergeIntProd(var1.getIntProd());
               break;
            case LINEAR:
               this.mergeLinear(var1.getLinear());
               break;
            case ALL_DIFF:
               this.mergeAllDiff(var1.getAllDiff());
               break;
            case ELEMENT:
               this.mergeElement(var1.getElement());
               break;
            case CIRCUIT:
               this.mergeCircuit(var1.getCircuit());
               break;
            case ROUTES:
               this.mergeRoutes(var1.getRoutes());
               break;
            case CIRCUIT_COVERING:
               this.mergeCircuitCovering(var1.getCircuitCovering());
               break;
            case TABLE:
               this.mergeTable(var1.getTable());
               break;
            case AUTOMATON:
               this.mergeAutomaton(var1.getAutomaton());
               break;
            case INVERSE:
               this.mergeInverse(var1.getInverse());
               break;
            case RESERVOIR:
               this.mergeReservoir(var1.getReservoir());
               break;
            case INTERVAL:
               this.mergeInterval(var1.getInterval());
               break;
            case NO_OVERLAP:
               this.mergeNoOverlap(var1.getNoOverlap());
               break;
            case NO_OVERLAP_2D:
               this.mergeNoOverlap2D(var1.getNoOverlap2D());
               break;
            case CUMULATIVE:
               this.mergeCumulative(var1.getCumulative());
            case CONSTRAINT_NOT_SET:
            }

            this.mergeUnknownFields(var1.unknownFields);
            this.onChanged();
            return this;
         }
      }

      public final boolean isInitialized() {
         return true;
      }

      public ConstraintProto.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
         ConstraintProto var3 = null;

         try {
            var3 = (ConstraintProto)ConstraintProto.PARSER.parsePartialFrom(var1, var2);
         } catch (InvalidProtocolBufferException var8) {
            var3 = (ConstraintProto)var8.getUnfinishedMessage();
            throw var8.unwrapIOException();
         } finally {
            if (var3 != null) {
               this.mergeFrom(var3);
            }

         }

         return this;
      }

      public ConstraintProto.ConstraintCase getConstraintCase() {
         return ConstraintProto.ConstraintCase.forNumber(this.constraintCase_);
      }

      public ConstraintProto.Builder clearConstraint() {
         this.constraintCase_ = 0;
         this.constraint_ = null;
         this.onChanged();
         return this;
      }

      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ConstraintProto.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      public ConstraintProto.Builder clearName() {
         this.name_ = ConstraintProto.getDefaultInstance().getName();
         this.onChanged();
         return this;
      }

      public ConstraintProto.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         } else {
            ConstraintProto.checkByteStringIsUtf8(var1);
            this.name_ = var1;
            this.onChanged();
            return this;
         }
      }

      private void ensureEnforcementLiteralIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.enforcementLiteral_ = ConstraintProto.mutableCopy(this.enforcementLiteral_);
            this.bitField0_ |= 1;
         }

      }

      public List getEnforcementLiteralList() {
         return (List)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.enforcementLiteral_) : this.enforcementLiteral_);
      }

      public int getEnforcementLiteralCount() {
         return this.enforcementLiteral_.size();
      }

      public int getEnforcementLiteral(int var1) {
         return this.enforcementLiteral_.getInt(var1);
      }

      public ConstraintProto.Builder setEnforcementLiteral(int var1, int var2) {
         this.ensureEnforcementLiteralIsMutable();
         this.enforcementLiteral_.setInt(var1, var2);
         this.onChanged();
         return this;
      }

      public ConstraintProto.Builder addEnforcementLiteral(int var1) {
         this.ensureEnforcementLiteralIsMutable();
         this.enforcementLiteral_.addInt(var1);
         this.onChanged();
         return this;
      }

      public ConstraintProto.Builder addAllEnforcementLiteral(Iterable var1) {
         this.ensureEnforcementLiteralIsMutable();
         com.google.protobuf.AbstractMessageLite.Builder.addAll(var1, this.enforcementLiteral_);
         this.onChanged();
         return this;
      }

      public ConstraintProto.Builder clearEnforcementLiteral() {
         this.enforcementLiteral_ = ConstraintProto.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public boolean hasBoolOr() {
         return this.constraintCase_ == 3;
      }

      public BoolArgumentProto getBoolOr() {
         if (this.boolOrBuilder_ == null) {
            return this.constraintCase_ == 3 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 3 ? (BoolArgumentProto)this.boolOrBuilder_.getMessage() : BoolArgumentProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setBoolOr(BoolArgumentProto var1) {
         if (this.boolOrBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.boolOrBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 3;
         return this;
      }

      public ConstraintProto.Builder setBoolOr(BoolArgumentProto.Builder var1) {
         if (this.boolOrBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.boolOrBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 3;
         return this;
      }

      public ConstraintProto.Builder mergeBoolOr(BoolArgumentProto var1) {
         if (this.boolOrBuilder_ == null) {
            if (this.constraintCase_ == 3 && this.constraint_ != BoolArgumentProto.getDefaultInstance()) {
               this.constraint_ = BoolArgumentProto.newBuilder((BoolArgumentProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 3) {
               this.boolOrBuilder_.mergeFrom(var1);
            }

            this.boolOrBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 3;
         return this;
      }

      public ConstraintProto.Builder clearBoolOr() {
         if (this.boolOrBuilder_ == null) {
            if (this.constraintCase_ == 3) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 3) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.boolOrBuilder_.clear();
         }

         return this;
      }

      public BoolArgumentProto.Builder getBoolOrBuilder() {
         return (BoolArgumentProto.Builder)this.getBoolOrFieldBuilder().getBuilder();
      }

      public BoolArgumentProtoOrBuilder getBoolOrOrBuilder() {
         if (this.constraintCase_ == 3 && this.boolOrBuilder_ != null) {
            return (BoolArgumentProtoOrBuilder)this.boolOrBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 3 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getBoolOrFieldBuilder() {
         if (this.boolOrBuilder_ == null) {
            if (this.constraintCase_ != 3) {
               this.constraint_ = BoolArgumentProto.getDefaultInstance();
            }

            this.boolOrBuilder_ = new SingleFieldBuilderV3((BoolArgumentProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 3;
         this.onChanged();
         return this.boolOrBuilder_;
      }

      public boolean hasBoolAnd() {
         return this.constraintCase_ == 4;
      }

      public BoolArgumentProto getBoolAnd() {
         if (this.boolAndBuilder_ == null) {
            return this.constraintCase_ == 4 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 4 ? (BoolArgumentProto)this.boolAndBuilder_.getMessage() : BoolArgumentProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setBoolAnd(BoolArgumentProto var1) {
         if (this.boolAndBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.boolAndBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 4;
         return this;
      }

      public ConstraintProto.Builder setBoolAnd(BoolArgumentProto.Builder var1) {
         if (this.boolAndBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.boolAndBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 4;
         return this;
      }

      public ConstraintProto.Builder mergeBoolAnd(BoolArgumentProto var1) {
         if (this.boolAndBuilder_ == null) {
            if (this.constraintCase_ == 4 && this.constraint_ != BoolArgumentProto.getDefaultInstance()) {
               this.constraint_ = BoolArgumentProto.newBuilder((BoolArgumentProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 4) {
               this.boolAndBuilder_.mergeFrom(var1);
            }

            this.boolAndBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 4;
         return this;
      }

      public ConstraintProto.Builder clearBoolAnd() {
         if (this.boolAndBuilder_ == null) {
            if (this.constraintCase_ == 4) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 4) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.boolAndBuilder_.clear();
         }

         return this;
      }

      public BoolArgumentProto.Builder getBoolAndBuilder() {
         return (BoolArgumentProto.Builder)this.getBoolAndFieldBuilder().getBuilder();
      }

      public BoolArgumentProtoOrBuilder getBoolAndOrBuilder() {
         if (this.constraintCase_ == 4 && this.boolAndBuilder_ != null) {
            return (BoolArgumentProtoOrBuilder)this.boolAndBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 4 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getBoolAndFieldBuilder() {
         if (this.boolAndBuilder_ == null) {
            if (this.constraintCase_ != 4) {
               this.constraint_ = BoolArgumentProto.getDefaultInstance();
            }

            this.boolAndBuilder_ = new SingleFieldBuilderV3((BoolArgumentProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 4;
         this.onChanged();
         return this.boolAndBuilder_;
      }

      public boolean hasAtMostOne() {
         return this.constraintCase_ == 26;
      }

      public BoolArgumentProto getAtMostOne() {
         if (this.atMostOneBuilder_ == null) {
            return this.constraintCase_ == 26 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 26 ? (BoolArgumentProto)this.atMostOneBuilder_.getMessage() : BoolArgumentProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setAtMostOne(BoolArgumentProto var1) {
         if (this.atMostOneBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.atMostOneBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 26;
         return this;
      }

      public ConstraintProto.Builder setAtMostOne(BoolArgumentProto.Builder var1) {
         if (this.atMostOneBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.atMostOneBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 26;
         return this;
      }

      public ConstraintProto.Builder mergeAtMostOne(BoolArgumentProto var1) {
         if (this.atMostOneBuilder_ == null) {
            if (this.constraintCase_ == 26 && this.constraint_ != BoolArgumentProto.getDefaultInstance()) {
               this.constraint_ = BoolArgumentProto.newBuilder((BoolArgumentProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 26) {
               this.atMostOneBuilder_.mergeFrom(var1);
            }

            this.atMostOneBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 26;
         return this;
      }

      public ConstraintProto.Builder clearAtMostOne() {
         if (this.atMostOneBuilder_ == null) {
            if (this.constraintCase_ == 26) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 26) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.atMostOneBuilder_.clear();
         }

         return this;
      }

      public BoolArgumentProto.Builder getAtMostOneBuilder() {
         return (BoolArgumentProto.Builder)this.getAtMostOneFieldBuilder().getBuilder();
      }

      public BoolArgumentProtoOrBuilder getAtMostOneOrBuilder() {
         if (this.constraintCase_ == 26 && this.atMostOneBuilder_ != null) {
            return (BoolArgumentProtoOrBuilder)this.atMostOneBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 26 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getAtMostOneFieldBuilder() {
         if (this.atMostOneBuilder_ == null) {
            if (this.constraintCase_ != 26) {
               this.constraint_ = BoolArgumentProto.getDefaultInstance();
            }

            this.atMostOneBuilder_ = new SingleFieldBuilderV3((BoolArgumentProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 26;
         this.onChanged();
         return this.atMostOneBuilder_;
      }

      public boolean hasBoolXor() {
         return this.constraintCase_ == 5;
      }

      public BoolArgumentProto getBoolXor() {
         if (this.boolXorBuilder_ == null) {
            return this.constraintCase_ == 5 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 5 ? (BoolArgumentProto)this.boolXorBuilder_.getMessage() : BoolArgumentProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setBoolXor(BoolArgumentProto var1) {
         if (this.boolXorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.boolXorBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 5;
         return this;
      }

      public ConstraintProto.Builder setBoolXor(BoolArgumentProto.Builder var1) {
         if (this.boolXorBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.boolXorBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 5;
         return this;
      }

      public ConstraintProto.Builder mergeBoolXor(BoolArgumentProto var1) {
         if (this.boolXorBuilder_ == null) {
            if (this.constraintCase_ == 5 && this.constraint_ != BoolArgumentProto.getDefaultInstance()) {
               this.constraint_ = BoolArgumentProto.newBuilder((BoolArgumentProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 5) {
               this.boolXorBuilder_.mergeFrom(var1);
            }

            this.boolXorBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 5;
         return this;
      }

      public ConstraintProto.Builder clearBoolXor() {
         if (this.boolXorBuilder_ == null) {
            if (this.constraintCase_ == 5) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 5) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.boolXorBuilder_.clear();
         }

         return this;
      }

      public BoolArgumentProto.Builder getBoolXorBuilder() {
         return (BoolArgumentProto.Builder)this.getBoolXorFieldBuilder().getBuilder();
      }

      public BoolArgumentProtoOrBuilder getBoolXorOrBuilder() {
         if (this.constraintCase_ == 5 && this.boolXorBuilder_ != null) {
            return (BoolArgumentProtoOrBuilder)this.boolXorBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 5 ? (BoolArgumentProto)this.constraint_ : BoolArgumentProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getBoolXorFieldBuilder() {
         if (this.boolXorBuilder_ == null) {
            if (this.constraintCase_ != 5) {
               this.constraint_ = BoolArgumentProto.getDefaultInstance();
            }

            this.boolXorBuilder_ = new SingleFieldBuilderV3((BoolArgumentProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 5;
         this.onChanged();
         return this.boolXorBuilder_;
      }

      public boolean hasIntDiv() {
         return this.constraintCase_ == 7;
      }

      public IntegerArgumentProto getIntDiv() {
         if (this.intDivBuilder_ == null) {
            return this.constraintCase_ == 7 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 7 ? (IntegerArgumentProto)this.intDivBuilder_.getMessage() : IntegerArgumentProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setIntDiv(IntegerArgumentProto var1) {
         if (this.intDivBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.intDivBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 7;
         return this;
      }

      public ConstraintProto.Builder setIntDiv(IntegerArgumentProto.Builder var1) {
         if (this.intDivBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.intDivBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 7;
         return this;
      }

      public ConstraintProto.Builder mergeIntDiv(IntegerArgumentProto var1) {
         if (this.intDivBuilder_ == null) {
            if (this.constraintCase_ == 7 && this.constraint_ != IntegerArgumentProto.getDefaultInstance()) {
               this.constraint_ = IntegerArgumentProto.newBuilder((IntegerArgumentProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 7) {
               this.intDivBuilder_.mergeFrom(var1);
            }

            this.intDivBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 7;
         return this;
      }

      public ConstraintProto.Builder clearIntDiv() {
         if (this.intDivBuilder_ == null) {
            if (this.constraintCase_ == 7) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 7) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.intDivBuilder_.clear();
         }

         return this;
      }

      public IntegerArgumentProto.Builder getIntDivBuilder() {
         return (IntegerArgumentProto.Builder)this.getIntDivFieldBuilder().getBuilder();
      }

      public IntegerArgumentProtoOrBuilder getIntDivOrBuilder() {
         if (this.constraintCase_ == 7 && this.intDivBuilder_ != null) {
            return (IntegerArgumentProtoOrBuilder)this.intDivBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 7 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getIntDivFieldBuilder() {
         if (this.intDivBuilder_ == null) {
            if (this.constraintCase_ != 7) {
               this.constraint_ = IntegerArgumentProto.getDefaultInstance();
            }

            this.intDivBuilder_ = new SingleFieldBuilderV3((IntegerArgumentProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 7;
         this.onChanged();
         return this.intDivBuilder_;
      }

      public boolean hasIntMod() {
         return this.constraintCase_ == 8;
      }

      public IntegerArgumentProto getIntMod() {
         if (this.intModBuilder_ == null) {
            return this.constraintCase_ == 8 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 8 ? (IntegerArgumentProto)this.intModBuilder_.getMessage() : IntegerArgumentProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setIntMod(IntegerArgumentProto var1) {
         if (this.intModBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.intModBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 8;
         return this;
      }

      public ConstraintProto.Builder setIntMod(IntegerArgumentProto.Builder var1) {
         if (this.intModBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.intModBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 8;
         return this;
      }

      public ConstraintProto.Builder mergeIntMod(IntegerArgumentProto var1) {
         if (this.intModBuilder_ == null) {
            if (this.constraintCase_ == 8 && this.constraint_ != IntegerArgumentProto.getDefaultInstance()) {
               this.constraint_ = IntegerArgumentProto.newBuilder((IntegerArgumentProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 8) {
               this.intModBuilder_.mergeFrom(var1);
            }

            this.intModBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 8;
         return this;
      }

      public ConstraintProto.Builder clearIntMod() {
         if (this.intModBuilder_ == null) {
            if (this.constraintCase_ == 8) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 8) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.intModBuilder_.clear();
         }

         return this;
      }

      public IntegerArgumentProto.Builder getIntModBuilder() {
         return (IntegerArgumentProto.Builder)this.getIntModFieldBuilder().getBuilder();
      }

      public IntegerArgumentProtoOrBuilder getIntModOrBuilder() {
         if (this.constraintCase_ == 8 && this.intModBuilder_ != null) {
            return (IntegerArgumentProtoOrBuilder)this.intModBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 8 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getIntModFieldBuilder() {
         if (this.intModBuilder_ == null) {
            if (this.constraintCase_ != 8) {
               this.constraint_ = IntegerArgumentProto.getDefaultInstance();
            }

            this.intModBuilder_ = new SingleFieldBuilderV3((IntegerArgumentProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 8;
         this.onChanged();
         return this.intModBuilder_;
      }

      public boolean hasIntMax() {
         return this.constraintCase_ == 9;
      }

      public IntegerArgumentProto getIntMax() {
         if (this.intMaxBuilder_ == null) {
            return this.constraintCase_ == 9 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 9 ? (IntegerArgumentProto)this.intMaxBuilder_.getMessage() : IntegerArgumentProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setIntMax(IntegerArgumentProto var1) {
         if (this.intMaxBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.intMaxBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 9;
         return this;
      }

      public ConstraintProto.Builder setIntMax(IntegerArgumentProto.Builder var1) {
         if (this.intMaxBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.intMaxBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 9;
         return this;
      }

      public ConstraintProto.Builder mergeIntMax(IntegerArgumentProto var1) {
         if (this.intMaxBuilder_ == null) {
            if (this.constraintCase_ == 9 && this.constraint_ != IntegerArgumentProto.getDefaultInstance()) {
               this.constraint_ = IntegerArgumentProto.newBuilder((IntegerArgumentProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 9) {
               this.intMaxBuilder_.mergeFrom(var1);
            }

            this.intMaxBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 9;
         return this;
      }

      public ConstraintProto.Builder clearIntMax() {
         if (this.intMaxBuilder_ == null) {
            if (this.constraintCase_ == 9) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 9) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.intMaxBuilder_.clear();
         }

         return this;
      }

      public IntegerArgumentProto.Builder getIntMaxBuilder() {
         return (IntegerArgumentProto.Builder)this.getIntMaxFieldBuilder().getBuilder();
      }

      public IntegerArgumentProtoOrBuilder getIntMaxOrBuilder() {
         if (this.constraintCase_ == 9 && this.intMaxBuilder_ != null) {
            return (IntegerArgumentProtoOrBuilder)this.intMaxBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 9 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getIntMaxFieldBuilder() {
         if (this.intMaxBuilder_ == null) {
            if (this.constraintCase_ != 9) {
               this.constraint_ = IntegerArgumentProto.getDefaultInstance();
            }

            this.intMaxBuilder_ = new SingleFieldBuilderV3((IntegerArgumentProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 9;
         this.onChanged();
         return this.intMaxBuilder_;
      }

      public boolean hasIntMin() {
         return this.constraintCase_ == 10;
      }

      public IntegerArgumentProto getIntMin() {
         if (this.intMinBuilder_ == null) {
            return this.constraintCase_ == 10 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 10 ? (IntegerArgumentProto)this.intMinBuilder_.getMessage() : IntegerArgumentProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setIntMin(IntegerArgumentProto var1) {
         if (this.intMinBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.intMinBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 10;
         return this;
      }

      public ConstraintProto.Builder setIntMin(IntegerArgumentProto.Builder var1) {
         if (this.intMinBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.intMinBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 10;
         return this;
      }

      public ConstraintProto.Builder mergeIntMin(IntegerArgumentProto var1) {
         if (this.intMinBuilder_ == null) {
            if (this.constraintCase_ == 10 && this.constraint_ != IntegerArgumentProto.getDefaultInstance()) {
               this.constraint_ = IntegerArgumentProto.newBuilder((IntegerArgumentProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 10) {
               this.intMinBuilder_.mergeFrom(var1);
            }

            this.intMinBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 10;
         return this;
      }

      public ConstraintProto.Builder clearIntMin() {
         if (this.intMinBuilder_ == null) {
            if (this.constraintCase_ == 10) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 10) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.intMinBuilder_.clear();
         }

         return this;
      }

      public IntegerArgumentProto.Builder getIntMinBuilder() {
         return (IntegerArgumentProto.Builder)this.getIntMinFieldBuilder().getBuilder();
      }

      public IntegerArgumentProtoOrBuilder getIntMinOrBuilder() {
         if (this.constraintCase_ == 10 && this.intMinBuilder_ != null) {
            return (IntegerArgumentProtoOrBuilder)this.intMinBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 10 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getIntMinFieldBuilder() {
         if (this.intMinBuilder_ == null) {
            if (this.constraintCase_ != 10) {
               this.constraint_ = IntegerArgumentProto.getDefaultInstance();
            }

            this.intMinBuilder_ = new SingleFieldBuilderV3((IntegerArgumentProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 10;
         this.onChanged();
         return this.intMinBuilder_;
      }

      public boolean hasIntProd() {
         return this.constraintCase_ == 11;
      }

      public IntegerArgumentProto getIntProd() {
         if (this.intProdBuilder_ == null) {
            return this.constraintCase_ == 11 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 11 ? (IntegerArgumentProto)this.intProdBuilder_.getMessage() : IntegerArgumentProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setIntProd(IntegerArgumentProto var1) {
         if (this.intProdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.intProdBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 11;
         return this;
      }

      public ConstraintProto.Builder setIntProd(IntegerArgumentProto.Builder var1) {
         if (this.intProdBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.intProdBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 11;
         return this;
      }

      public ConstraintProto.Builder mergeIntProd(IntegerArgumentProto var1) {
         if (this.intProdBuilder_ == null) {
            if (this.constraintCase_ == 11 && this.constraint_ != IntegerArgumentProto.getDefaultInstance()) {
               this.constraint_ = IntegerArgumentProto.newBuilder((IntegerArgumentProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 11) {
               this.intProdBuilder_.mergeFrom(var1);
            }

            this.intProdBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 11;
         return this;
      }

      public ConstraintProto.Builder clearIntProd() {
         if (this.intProdBuilder_ == null) {
            if (this.constraintCase_ == 11) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 11) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.intProdBuilder_.clear();
         }

         return this;
      }

      public IntegerArgumentProto.Builder getIntProdBuilder() {
         return (IntegerArgumentProto.Builder)this.getIntProdFieldBuilder().getBuilder();
      }

      public IntegerArgumentProtoOrBuilder getIntProdOrBuilder() {
         if (this.constraintCase_ == 11 && this.intProdBuilder_ != null) {
            return (IntegerArgumentProtoOrBuilder)this.intProdBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 11 ? (IntegerArgumentProto)this.constraint_ : IntegerArgumentProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getIntProdFieldBuilder() {
         if (this.intProdBuilder_ == null) {
            if (this.constraintCase_ != 11) {
               this.constraint_ = IntegerArgumentProto.getDefaultInstance();
            }

            this.intProdBuilder_ = new SingleFieldBuilderV3((IntegerArgumentProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 11;
         this.onChanged();
         return this.intProdBuilder_;
      }

      public boolean hasLinear() {
         return this.constraintCase_ == 12;
      }

      public LinearConstraintProto getLinear() {
         if (this.linearBuilder_ == null) {
            return this.constraintCase_ == 12 ? (LinearConstraintProto)this.constraint_ : LinearConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 12 ? (LinearConstraintProto)this.linearBuilder_.getMessage() : LinearConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setLinear(LinearConstraintProto var1) {
         if (this.linearBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.linearBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 12;
         return this;
      }

      public ConstraintProto.Builder setLinear(LinearConstraintProto.Builder var1) {
         if (this.linearBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.linearBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 12;
         return this;
      }

      public ConstraintProto.Builder mergeLinear(LinearConstraintProto var1) {
         if (this.linearBuilder_ == null) {
            if (this.constraintCase_ == 12 && this.constraint_ != LinearConstraintProto.getDefaultInstance()) {
               this.constraint_ = LinearConstraintProto.newBuilder((LinearConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 12) {
               this.linearBuilder_.mergeFrom(var1);
            }

            this.linearBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 12;
         return this;
      }

      public ConstraintProto.Builder clearLinear() {
         if (this.linearBuilder_ == null) {
            if (this.constraintCase_ == 12) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 12) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.linearBuilder_.clear();
         }

         return this;
      }

      public LinearConstraintProto.Builder getLinearBuilder() {
         return (LinearConstraintProto.Builder)this.getLinearFieldBuilder().getBuilder();
      }

      public LinearConstraintProtoOrBuilder getLinearOrBuilder() {
         if (this.constraintCase_ == 12 && this.linearBuilder_ != null) {
            return (LinearConstraintProtoOrBuilder)this.linearBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 12 ? (LinearConstraintProto)this.constraint_ : LinearConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getLinearFieldBuilder() {
         if (this.linearBuilder_ == null) {
            if (this.constraintCase_ != 12) {
               this.constraint_ = LinearConstraintProto.getDefaultInstance();
            }

            this.linearBuilder_ = new SingleFieldBuilderV3((LinearConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 12;
         this.onChanged();
         return this.linearBuilder_;
      }

      public boolean hasAllDiff() {
         return this.constraintCase_ == 13;
      }

      public AllDifferentConstraintProto getAllDiff() {
         if (this.allDiffBuilder_ == null) {
            return this.constraintCase_ == 13 ? (AllDifferentConstraintProto)this.constraint_ : AllDifferentConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 13 ? (AllDifferentConstraintProto)this.allDiffBuilder_.getMessage() : AllDifferentConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setAllDiff(AllDifferentConstraintProto var1) {
         if (this.allDiffBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.allDiffBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 13;
         return this;
      }

      public ConstraintProto.Builder setAllDiff(AllDifferentConstraintProto.Builder var1) {
         if (this.allDiffBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.allDiffBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 13;
         return this;
      }

      public ConstraintProto.Builder mergeAllDiff(AllDifferentConstraintProto var1) {
         if (this.allDiffBuilder_ == null) {
            if (this.constraintCase_ == 13 && this.constraint_ != AllDifferentConstraintProto.getDefaultInstance()) {
               this.constraint_ = AllDifferentConstraintProto.newBuilder((AllDifferentConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 13) {
               this.allDiffBuilder_.mergeFrom(var1);
            }

            this.allDiffBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 13;
         return this;
      }

      public ConstraintProto.Builder clearAllDiff() {
         if (this.allDiffBuilder_ == null) {
            if (this.constraintCase_ == 13) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 13) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.allDiffBuilder_.clear();
         }

         return this;
      }

      public AllDifferentConstraintProto.Builder getAllDiffBuilder() {
         return (AllDifferentConstraintProto.Builder)this.getAllDiffFieldBuilder().getBuilder();
      }

      public AllDifferentConstraintProtoOrBuilder getAllDiffOrBuilder() {
         if (this.constraintCase_ == 13 && this.allDiffBuilder_ != null) {
            return (AllDifferentConstraintProtoOrBuilder)this.allDiffBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 13 ? (AllDifferentConstraintProto)this.constraint_ : AllDifferentConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getAllDiffFieldBuilder() {
         if (this.allDiffBuilder_ == null) {
            if (this.constraintCase_ != 13) {
               this.constraint_ = AllDifferentConstraintProto.getDefaultInstance();
            }

            this.allDiffBuilder_ = new SingleFieldBuilderV3((AllDifferentConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 13;
         this.onChanged();
         return this.allDiffBuilder_;
      }

      public boolean hasElement() {
         return this.constraintCase_ == 14;
      }

      public ElementConstraintProto getElement() {
         if (this.elementBuilder_ == null) {
            return this.constraintCase_ == 14 ? (ElementConstraintProto)this.constraint_ : ElementConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 14 ? (ElementConstraintProto)this.elementBuilder_.getMessage() : ElementConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setElement(ElementConstraintProto var1) {
         if (this.elementBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.elementBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 14;
         return this;
      }

      public ConstraintProto.Builder setElement(ElementConstraintProto.Builder var1) {
         if (this.elementBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.elementBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 14;
         return this;
      }

      public ConstraintProto.Builder mergeElement(ElementConstraintProto var1) {
         if (this.elementBuilder_ == null) {
            if (this.constraintCase_ == 14 && this.constraint_ != ElementConstraintProto.getDefaultInstance()) {
               this.constraint_ = ElementConstraintProto.newBuilder((ElementConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 14) {
               this.elementBuilder_.mergeFrom(var1);
            }

            this.elementBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 14;
         return this;
      }

      public ConstraintProto.Builder clearElement() {
         if (this.elementBuilder_ == null) {
            if (this.constraintCase_ == 14) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 14) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.elementBuilder_.clear();
         }

         return this;
      }

      public ElementConstraintProto.Builder getElementBuilder() {
         return (ElementConstraintProto.Builder)this.getElementFieldBuilder().getBuilder();
      }

      public ElementConstraintProtoOrBuilder getElementOrBuilder() {
         if (this.constraintCase_ == 14 && this.elementBuilder_ != null) {
            return (ElementConstraintProtoOrBuilder)this.elementBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 14 ? (ElementConstraintProto)this.constraint_ : ElementConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getElementFieldBuilder() {
         if (this.elementBuilder_ == null) {
            if (this.constraintCase_ != 14) {
               this.constraint_ = ElementConstraintProto.getDefaultInstance();
            }

            this.elementBuilder_ = new SingleFieldBuilderV3((ElementConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 14;
         this.onChanged();
         return this.elementBuilder_;
      }

      public boolean hasCircuit() {
         return this.constraintCase_ == 15;
      }

      public CircuitConstraintProto getCircuit() {
         if (this.circuitBuilder_ == null) {
            return this.constraintCase_ == 15 ? (CircuitConstraintProto)this.constraint_ : CircuitConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 15 ? (CircuitConstraintProto)this.circuitBuilder_.getMessage() : CircuitConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setCircuit(CircuitConstraintProto var1) {
         if (this.circuitBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.circuitBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 15;
         return this;
      }

      public ConstraintProto.Builder setCircuit(CircuitConstraintProto.Builder var1) {
         if (this.circuitBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.circuitBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 15;
         return this;
      }

      public ConstraintProto.Builder mergeCircuit(CircuitConstraintProto var1) {
         if (this.circuitBuilder_ == null) {
            if (this.constraintCase_ == 15 && this.constraint_ != CircuitConstraintProto.getDefaultInstance()) {
               this.constraint_ = CircuitConstraintProto.newBuilder((CircuitConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 15) {
               this.circuitBuilder_.mergeFrom(var1);
            }

            this.circuitBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 15;
         return this;
      }

      public ConstraintProto.Builder clearCircuit() {
         if (this.circuitBuilder_ == null) {
            if (this.constraintCase_ == 15) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 15) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.circuitBuilder_.clear();
         }

         return this;
      }

      public CircuitConstraintProto.Builder getCircuitBuilder() {
         return (CircuitConstraintProto.Builder)this.getCircuitFieldBuilder().getBuilder();
      }

      public CircuitConstraintProtoOrBuilder getCircuitOrBuilder() {
         if (this.constraintCase_ == 15 && this.circuitBuilder_ != null) {
            return (CircuitConstraintProtoOrBuilder)this.circuitBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 15 ? (CircuitConstraintProto)this.constraint_ : CircuitConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getCircuitFieldBuilder() {
         if (this.circuitBuilder_ == null) {
            if (this.constraintCase_ != 15) {
               this.constraint_ = CircuitConstraintProto.getDefaultInstance();
            }

            this.circuitBuilder_ = new SingleFieldBuilderV3((CircuitConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 15;
         this.onChanged();
         return this.circuitBuilder_;
      }

      public boolean hasRoutes() {
         return this.constraintCase_ == 23;
      }

      public RoutesConstraintProto getRoutes() {
         if (this.routesBuilder_ == null) {
            return this.constraintCase_ == 23 ? (RoutesConstraintProto)this.constraint_ : RoutesConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 23 ? (RoutesConstraintProto)this.routesBuilder_.getMessage() : RoutesConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setRoutes(RoutesConstraintProto var1) {
         if (this.routesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.routesBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 23;
         return this;
      }

      public ConstraintProto.Builder setRoutes(RoutesConstraintProto.Builder var1) {
         if (this.routesBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.routesBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 23;
         return this;
      }

      public ConstraintProto.Builder mergeRoutes(RoutesConstraintProto var1) {
         if (this.routesBuilder_ == null) {
            if (this.constraintCase_ == 23 && this.constraint_ != RoutesConstraintProto.getDefaultInstance()) {
               this.constraint_ = RoutesConstraintProto.newBuilder((RoutesConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 23) {
               this.routesBuilder_.mergeFrom(var1);
            }

            this.routesBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 23;
         return this;
      }

      public ConstraintProto.Builder clearRoutes() {
         if (this.routesBuilder_ == null) {
            if (this.constraintCase_ == 23) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 23) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.routesBuilder_.clear();
         }

         return this;
      }

      public RoutesConstraintProto.Builder getRoutesBuilder() {
         return (RoutesConstraintProto.Builder)this.getRoutesFieldBuilder().getBuilder();
      }

      public RoutesConstraintProtoOrBuilder getRoutesOrBuilder() {
         if (this.constraintCase_ == 23 && this.routesBuilder_ != null) {
            return (RoutesConstraintProtoOrBuilder)this.routesBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 23 ? (RoutesConstraintProto)this.constraint_ : RoutesConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getRoutesFieldBuilder() {
         if (this.routesBuilder_ == null) {
            if (this.constraintCase_ != 23) {
               this.constraint_ = RoutesConstraintProto.getDefaultInstance();
            }

            this.routesBuilder_ = new SingleFieldBuilderV3((RoutesConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 23;
         this.onChanged();
         return this.routesBuilder_;
      }

      public boolean hasCircuitCovering() {
         return this.constraintCase_ == 25;
      }

      public CircuitCoveringConstraintProto getCircuitCovering() {
         if (this.circuitCoveringBuilder_ == null) {
            return this.constraintCase_ == 25 ? (CircuitCoveringConstraintProto)this.constraint_ : CircuitCoveringConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 25 ? (CircuitCoveringConstraintProto)this.circuitCoveringBuilder_.getMessage() : CircuitCoveringConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setCircuitCovering(CircuitCoveringConstraintProto var1) {
         if (this.circuitCoveringBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.circuitCoveringBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 25;
         return this;
      }

      public ConstraintProto.Builder setCircuitCovering(CircuitCoveringConstraintProto.Builder var1) {
         if (this.circuitCoveringBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.circuitCoveringBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 25;
         return this;
      }

      public ConstraintProto.Builder mergeCircuitCovering(CircuitCoveringConstraintProto var1) {
         if (this.circuitCoveringBuilder_ == null) {
            if (this.constraintCase_ == 25 && this.constraint_ != CircuitCoveringConstraintProto.getDefaultInstance()) {
               this.constraint_ = CircuitCoveringConstraintProto.newBuilder((CircuitCoveringConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 25) {
               this.circuitCoveringBuilder_.mergeFrom(var1);
            }

            this.circuitCoveringBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 25;
         return this;
      }

      public ConstraintProto.Builder clearCircuitCovering() {
         if (this.circuitCoveringBuilder_ == null) {
            if (this.constraintCase_ == 25) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 25) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.circuitCoveringBuilder_.clear();
         }

         return this;
      }

      public CircuitCoveringConstraintProto.Builder getCircuitCoveringBuilder() {
         return (CircuitCoveringConstraintProto.Builder)this.getCircuitCoveringFieldBuilder().getBuilder();
      }

      public CircuitCoveringConstraintProtoOrBuilder getCircuitCoveringOrBuilder() {
         if (this.constraintCase_ == 25 && this.circuitCoveringBuilder_ != null) {
            return (CircuitCoveringConstraintProtoOrBuilder)this.circuitCoveringBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 25 ? (CircuitCoveringConstraintProto)this.constraint_ : CircuitCoveringConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getCircuitCoveringFieldBuilder() {
         if (this.circuitCoveringBuilder_ == null) {
            if (this.constraintCase_ != 25) {
               this.constraint_ = CircuitCoveringConstraintProto.getDefaultInstance();
            }

            this.circuitCoveringBuilder_ = new SingleFieldBuilderV3((CircuitCoveringConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 25;
         this.onChanged();
         return this.circuitCoveringBuilder_;
      }

      public boolean hasTable() {
         return this.constraintCase_ == 16;
      }

      public TableConstraintProto getTable() {
         if (this.tableBuilder_ == null) {
            return this.constraintCase_ == 16 ? (TableConstraintProto)this.constraint_ : TableConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 16 ? (TableConstraintProto)this.tableBuilder_.getMessage() : TableConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setTable(TableConstraintProto var1) {
         if (this.tableBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.tableBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 16;
         return this;
      }

      public ConstraintProto.Builder setTable(TableConstraintProto.Builder var1) {
         if (this.tableBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.tableBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 16;
         return this;
      }

      public ConstraintProto.Builder mergeTable(TableConstraintProto var1) {
         if (this.tableBuilder_ == null) {
            if (this.constraintCase_ == 16 && this.constraint_ != TableConstraintProto.getDefaultInstance()) {
               this.constraint_ = TableConstraintProto.newBuilder((TableConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 16) {
               this.tableBuilder_.mergeFrom(var1);
            }

            this.tableBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 16;
         return this;
      }

      public ConstraintProto.Builder clearTable() {
         if (this.tableBuilder_ == null) {
            if (this.constraintCase_ == 16) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 16) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.tableBuilder_.clear();
         }

         return this;
      }

      public TableConstraintProto.Builder getTableBuilder() {
         return (TableConstraintProto.Builder)this.getTableFieldBuilder().getBuilder();
      }

      public TableConstraintProtoOrBuilder getTableOrBuilder() {
         if (this.constraintCase_ == 16 && this.tableBuilder_ != null) {
            return (TableConstraintProtoOrBuilder)this.tableBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 16 ? (TableConstraintProto)this.constraint_ : TableConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getTableFieldBuilder() {
         if (this.tableBuilder_ == null) {
            if (this.constraintCase_ != 16) {
               this.constraint_ = TableConstraintProto.getDefaultInstance();
            }

            this.tableBuilder_ = new SingleFieldBuilderV3((TableConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 16;
         this.onChanged();
         return this.tableBuilder_;
      }

      public boolean hasAutomaton() {
         return this.constraintCase_ == 17;
      }

      public AutomatonConstraintProto getAutomaton() {
         if (this.automatonBuilder_ == null) {
            return this.constraintCase_ == 17 ? (AutomatonConstraintProto)this.constraint_ : AutomatonConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 17 ? (AutomatonConstraintProto)this.automatonBuilder_.getMessage() : AutomatonConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setAutomaton(AutomatonConstraintProto var1) {
         if (this.automatonBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.automatonBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 17;
         return this;
      }

      public ConstraintProto.Builder setAutomaton(AutomatonConstraintProto.Builder var1) {
         if (this.automatonBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.automatonBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 17;
         return this;
      }

      public ConstraintProto.Builder mergeAutomaton(AutomatonConstraintProto var1) {
         if (this.automatonBuilder_ == null) {
            if (this.constraintCase_ == 17 && this.constraint_ != AutomatonConstraintProto.getDefaultInstance()) {
               this.constraint_ = AutomatonConstraintProto.newBuilder((AutomatonConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 17) {
               this.automatonBuilder_.mergeFrom(var1);
            }

            this.automatonBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 17;
         return this;
      }

      public ConstraintProto.Builder clearAutomaton() {
         if (this.automatonBuilder_ == null) {
            if (this.constraintCase_ == 17) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 17) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.automatonBuilder_.clear();
         }

         return this;
      }

      public AutomatonConstraintProto.Builder getAutomatonBuilder() {
         return (AutomatonConstraintProto.Builder)this.getAutomatonFieldBuilder().getBuilder();
      }

      public AutomatonConstraintProtoOrBuilder getAutomatonOrBuilder() {
         if (this.constraintCase_ == 17 && this.automatonBuilder_ != null) {
            return (AutomatonConstraintProtoOrBuilder)this.automatonBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 17 ? (AutomatonConstraintProto)this.constraint_ : AutomatonConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getAutomatonFieldBuilder() {
         if (this.automatonBuilder_ == null) {
            if (this.constraintCase_ != 17) {
               this.constraint_ = AutomatonConstraintProto.getDefaultInstance();
            }

            this.automatonBuilder_ = new SingleFieldBuilderV3((AutomatonConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 17;
         this.onChanged();
         return this.automatonBuilder_;
      }

      public boolean hasInverse() {
         return this.constraintCase_ == 18;
      }

      public InverseConstraintProto getInverse() {
         if (this.inverseBuilder_ == null) {
            return this.constraintCase_ == 18 ? (InverseConstraintProto)this.constraint_ : InverseConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 18 ? (InverseConstraintProto)this.inverseBuilder_.getMessage() : InverseConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setInverse(InverseConstraintProto var1) {
         if (this.inverseBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.inverseBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 18;
         return this;
      }

      public ConstraintProto.Builder setInverse(InverseConstraintProto.Builder var1) {
         if (this.inverseBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.inverseBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 18;
         return this;
      }

      public ConstraintProto.Builder mergeInverse(InverseConstraintProto var1) {
         if (this.inverseBuilder_ == null) {
            if (this.constraintCase_ == 18 && this.constraint_ != InverseConstraintProto.getDefaultInstance()) {
               this.constraint_ = InverseConstraintProto.newBuilder((InverseConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 18) {
               this.inverseBuilder_.mergeFrom(var1);
            }

            this.inverseBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 18;
         return this;
      }

      public ConstraintProto.Builder clearInverse() {
         if (this.inverseBuilder_ == null) {
            if (this.constraintCase_ == 18) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 18) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.inverseBuilder_.clear();
         }

         return this;
      }

      public InverseConstraintProto.Builder getInverseBuilder() {
         return (InverseConstraintProto.Builder)this.getInverseFieldBuilder().getBuilder();
      }

      public InverseConstraintProtoOrBuilder getInverseOrBuilder() {
         if (this.constraintCase_ == 18 && this.inverseBuilder_ != null) {
            return (InverseConstraintProtoOrBuilder)this.inverseBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 18 ? (InverseConstraintProto)this.constraint_ : InverseConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getInverseFieldBuilder() {
         if (this.inverseBuilder_ == null) {
            if (this.constraintCase_ != 18) {
               this.constraint_ = InverseConstraintProto.getDefaultInstance();
            }

            this.inverseBuilder_ = new SingleFieldBuilderV3((InverseConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 18;
         this.onChanged();
         return this.inverseBuilder_;
      }

      public boolean hasReservoir() {
         return this.constraintCase_ == 24;
      }

      public ReservoirConstraintProto getReservoir() {
         if (this.reservoirBuilder_ == null) {
            return this.constraintCase_ == 24 ? (ReservoirConstraintProto)this.constraint_ : ReservoirConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 24 ? (ReservoirConstraintProto)this.reservoirBuilder_.getMessage() : ReservoirConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setReservoir(ReservoirConstraintProto var1) {
         if (this.reservoirBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.reservoirBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 24;
         return this;
      }

      public ConstraintProto.Builder setReservoir(ReservoirConstraintProto.Builder var1) {
         if (this.reservoirBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.reservoirBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 24;
         return this;
      }

      public ConstraintProto.Builder mergeReservoir(ReservoirConstraintProto var1) {
         if (this.reservoirBuilder_ == null) {
            if (this.constraintCase_ == 24 && this.constraint_ != ReservoirConstraintProto.getDefaultInstance()) {
               this.constraint_ = ReservoirConstraintProto.newBuilder((ReservoirConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 24) {
               this.reservoirBuilder_.mergeFrom(var1);
            }

            this.reservoirBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 24;
         return this;
      }

      public ConstraintProto.Builder clearReservoir() {
         if (this.reservoirBuilder_ == null) {
            if (this.constraintCase_ == 24) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 24) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.reservoirBuilder_.clear();
         }

         return this;
      }

      public ReservoirConstraintProto.Builder getReservoirBuilder() {
         return (ReservoirConstraintProto.Builder)this.getReservoirFieldBuilder().getBuilder();
      }

      public ReservoirConstraintProtoOrBuilder getReservoirOrBuilder() {
         if (this.constraintCase_ == 24 && this.reservoirBuilder_ != null) {
            return (ReservoirConstraintProtoOrBuilder)this.reservoirBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 24 ? (ReservoirConstraintProto)this.constraint_ : ReservoirConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getReservoirFieldBuilder() {
         if (this.reservoirBuilder_ == null) {
            if (this.constraintCase_ != 24) {
               this.constraint_ = ReservoirConstraintProto.getDefaultInstance();
            }

            this.reservoirBuilder_ = new SingleFieldBuilderV3((ReservoirConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 24;
         this.onChanged();
         return this.reservoirBuilder_;
      }

      public boolean hasInterval() {
         return this.constraintCase_ == 19;
      }

      public IntervalConstraintProto getInterval() {
         if (this.intervalBuilder_ == null) {
            return this.constraintCase_ == 19 ? (IntervalConstraintProto)this.constraint_ : IntervalConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 19 ? (IntervalConstraintProto)this.intervalBuilder_.getMessage() : IntervalConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setInterval(IntervalConstraintProto var1) {
         if (this.intervalBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.intervalBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 19;
         return this;
      }

      public ConstraintProto.Builder setInterval(IntervalConstraintProto.Builder var1) {
         if (this.intervalBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.intervalBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 19;
         return this;
      }

      public ConstraintProto.Builder mergeInterval(IntervalConstraintProto var1) {
         if (this.intervalBuilder_ == null) {
            if (this.constraintCase_ == 19 && this.constraint_ != IntervalConstraintProto.getDefaultInstance()) {
               this.constraint_ = IntervalConstraintProto.newBuilder((IntervalConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 19) {
               this.intervalBuilder_.mergeFrom(var1);
            }

            this.intervalBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 19;
         return this;
      }

      public ConstraintProto.Builder clearInterval() {
         if (this.intervalBuilder_ == null) {
            if (this.constraintCase_ == 19) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 19) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.intervalBuilder_.clear();
         }

         return this;
      }

      public IntervalConstraintProto.Builder getIntervalBuilder() {
         return (IntervalConstraintProto.Builder)this.getIntervalFieldBuilder().getBuilder();
      }

      public IntervalConstraintProtoOrBuilder getIntervalOrBuilder() {
         if (this.constraintCase_ == 19 && this.intervalBuilder_ != null) {
            return (IntervalConstraintProtoOrBuilder)this.intervalBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 19 ? (IntervalConstraintProto)this.constraint_ : IntervalConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getIntervalFieldBuilder() {
         if (this.intervalBuilder_ == null) {
            if (this.constraintCase_ != 19) {
               this.constraint_ = IntervalConstraintProto.getDefaultInstance();
            }

            this.intervalBuilder_ = new SingleFieldBuilderV3((IntervalConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 19;
         this.onChanged();
         return this.intervalBuilder_;
      }

      public boolean hasNoOverlap() {
         return this.constraintCase_ == 20;
      }

      public NoOverlapConstraintProto getNoOverlap() {
         if (this.noOverlapBuilder_ == null) {
            return this.constraintCase_ == 20 ? (NoOverlapConstraintProto)this.constraint_ : NoOverlapConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 20 ? (NoOverlapConstraintProto)this.noOverlapBuilder_.getMessage() : NoOverlapConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setNoOverlap(NoOverlapConstraintProto var1) {
         if (this.noOverlapBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.noOverlapBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 20;
         return this;
      }

      public ConstraintProto.Builder setNoOverlap(NoOverlapConstraintProto.Builder var1) {
         if (this.noOverlapBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.noOverlapBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 20;
         return this;
      }

      public ConstraintProto.Builder mergeNoOverlap(NoOverlapConstraintProto var1) {
         if (this.noOverlapBuilder_ == null) {
            if (this.constraintCase_ == 20 && this.constraint_ != NoOverlapConstraintProto.getDefaultInstance()) {
               this.constraint_ = NoOverlapConstraintProto.newBuilder((NoOverlapConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 20) {
               this.noOverlapBuilder_.mergeFrom(var1);
            }

            this.noOverlapBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 20;
         return this;
      }

      public ConstraintProto.Builder clearNoOverlap() {
         if (this.noOverlapBuilder_ == null) {
            if (this.constraintCase_ == 20) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 20) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.noOverlapBuilder_.clear();
         }

         return this;
      }

      public NoOverlapConstraintProto.Builder getNoOverlapBuilder() {
         return (NoOverlapConstraintProto.Builder)this.getNoOverlapFieldBuilder().getBuilder();
      }

      public NoOverlapConstraintProtoOrBuilder getNoOverlapOrBuilder() {
         if (this.constraintCase_ == 20 && this.noOverlapBuilder_ != null) {
            return (NoOverlapConstraintProtoOrBuilder)this.noOverlapBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 20 ? (NoOverlapConstraintProto)this.constraint_ : NoOverlapConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getNoOverlapFieldBuilder() {
         if (this.noOverlapBuilder_ == null) {
            if (this.constraintCase_ != 20) {
               this.constraint_ = NoOverlapConstraintProto.getDefaultInstance();
            }

            this.noOverlapBuilder_ = new SingleFieldBuilderV3((NoOverlapConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 20;
         this.onChanged();
         return this.noOverlapBuilder_;
      }

      public boolean hasNoOverlap2D() {
         return this.constraintCase_ == 21;
      }

      public NoOverlap2DConstraintProto getNoOverlap2D() {
         if (this.noOverlap2DBuilder_ == null) {
            return this.constraintCase_ == 21 ? (NoOverlap2DConstraintProto)this.constraint_ : NoOverlap2DConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 21 ? (NoOverlap2DConstraintProto)this.noOverlap2DBuilder_.getMessage() : NoOverlap2DConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setNoOverlap2D(NoOverlap2DConstraintProto var1) {
         if (this.noOverlap2DBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.noOverlap2DBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 21;
         return this;
      }

      public ConstraintProto.Builder setNoOverlap2D(NoOverlap2DConstraintProto.Builder var1) {
         if (this.noOverlap2DBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.noOverlap2DBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 21;
         return this;
      }

      public ConstraintProto.Builder mergeNoOverlap2D(NoOverlap2DConstraintProto var1) {
         if (this.noOverlap2DBuilder_ == null) {
            if (this.constraintCase_ == 21 && this.constraint_ != NoOverlap2DConstraintProto.getDefaultInstance()) {
               this.constraint_ = NoOverlap2DConstraintProto.newBuilder((NoOverlap2DConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 21) {
               this.noOverlap2DBuilder_.mergeFrom(var1);
            }

            this.noOverlap2DBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 21;
         return this;
      }

      public ConstraintProto.Builder clearNoOverlap2D() {
         if (this.noOverlap2DBuilder_ == null) {
            if (this.constraintCase_ == 21) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 21) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.noOverlap2DBuilder_.clear();
         }

         return this;
      }

      public NoOverlap2DConstraintProto.Builder getNoOverlap2DBuilder() {
         return (NoOverlap2DConstraintProto.Builder)this.getNoOverlap2DFieldBuilder().getBuilder();
      }

      public NoOverlap2DConstraintProtoOrBuilder getNoOverlap2DOrBuilder() {
         if (this.constraintCase_ == 21 && this.noOverlap2DBuilder_ != null) {
            return (NoOverlap2DConstraintProtoOrBuilder)this.noOverlap2DBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 21 ? (NoOverlap2DConstraintProto)this.constraint_ : NoOverlap2DConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getNoOverlap2DFieldBuilder() {
         if (this.noOverlap2DBuilder_ == null) {
            if (this.constraintCase_ != 21) {
               this.constraint_ = NoOverlap2DConstraintProto.getDefaultInstance();
            }

            this.noOverlap2DBuilder_ = new SingleFieldBuilderV3((NoOverlap2DConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 21;
         this.onChanged();
         return this.noOverlap2DBuilder_;
      }

      public boolean hasCumulative() {
         return this.constraintCase_ == 22;
      }

      public CumulativeConstraintProto getCumulative() {
         if (this.cumulativeBuilder_ == null) {
            return this.constraintCase_ == 22 ? (CumulativeConstraintProto)this.constraint_ : CumulativeConstraintProto.getDefaultInstance();
         } else {
            return this.constraintCase_ == 22 ? (CumulativeConstraintProto)this.cumulativeBuilder_.getMessage() : CumulativeConstraintProto.getDefaultInstance();
         }
      }

      public ConstraintProto.Builder setCumulative(CumulativeConstraintProto var1) {
         if (this.cumulativeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.constraint_ = var1;
            this.onChanged();
         } else {
            this.cumulativeBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 22;
         return this;
      }

      public ConstraintProto.Builder setCumulative(CumulativeConstraintProto.Builder var1) {
         if (this.cumulativeBuilder_ == null) {
            this.constraint_ = var1.build();
            this.onChanged();
         } else {
            this.cumulativeBuilder_.setMessage(var1.build());
         }

         this.constraintCase_ = 22;
         return this;
      }

      public ConstraintProto.Builder mergeCumulative(CumulativeConstraintProto var1) {
         if (this.cumulativeBuilder_ == null) {
            if (this.constraintCase_ == 22 && this.constraint_ != CumulativeConstraintProto.getDefaultInstance()) {
               this.constraint_ = CumulativeConstraintProto.newBuilder((CumulativeConstraintProto)this.constraint_).mergeFrom(var1).buildPartial();
            } else {
               this.constraint_ = var1;
            }

            this.onChanged();
         } else {
            if (this.constraintCase_ == 22) {
               this.cumulativeBuilder_.mergeFrom(var1);
            }

            this.cumulativeBuilder_.setMessage(var1);
         }

         this.constraintCase_ = 22;
         return this;
      }

      public ConstraintProto.Builder clearCumulative() {
         if (this.cumulativeBuilder_ == null) {
            if (this.constraintCase_ == 22) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
               this.onChanged();
            }
         } else {
            if (this.constraintCase_ == 22) {
               this.constraintCase_ = 0;
               this.constraint_ = null;
            }

            this.cumulativeBuilder_.clear();
         }

         return this;
      }

      public CumulativeConstraintProto.Builder getCumulativeBuilder() {
         return (CumulativeConstraintProto.Builder)this.getCumulativeFieldBuilder().getBuilder();
      }

      public CumulativeConstraintProtoOrBuilder getCumulativeOrBuilder() {
         if (this.constraintCase_ == 22 && this.cumulativeBuilder_ != null) {
            return (CumulativeConstraintProtoOrBuilder)this.cumulativeBuilder_.getMessageOrBuilder();
         } else {
            return this.constraintCase_ == 22 ? (CumulativeConstraintProto)this.constraint_ : CumulativeConstraintProto.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3 getCumulativeFieldBuilder() {
         if (this.cumulativeBuilder_ == null) {
            if (this.constraintCase_ != 22) {
               this.constraint_ = CumulativeConstraintProto.getDefaultInstance();
            }

            this.cumulativeBuilder_ = new SingleFieldBuilderV3((CumulativeConstraintProto)this.constraint_, this.getParentForChildren(), this.isClean());
            this.constraint_ = null;
         }

         this.constraintCase_ = 22;
         this.onChanged();
         return this.cumulativeBuilder_;
      }

      public final ConstraintProto.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConstraintProto.Builder)super.setUnknownFields(var1);
      }

      public final ConstraintProto.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConstraintProto.Builder)super.mergeUnknownFields(var1);
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

   public static enum ConstraintCase implements EnumLite, InternalOneOfEnum {
      BOOL_OR(3),
      BOOL_AND(4),
      AT_MOST_ONE(26),
      BOOL_XOR(5),
      INT_DIV(7),
      INT_MOD(8),
      INT_MAX(9),
      INT_MIN(10),
      INT_PROD(11),
      LINEAR(12),
      ALL_DIFF(13),
      ELEMENT(14),
      CIRCUIT(15),
      ROUTES(23),
      CIRCUIT_COVERING(25),
      TABLE(16),
      AUTOMATON(17),
      INVERSE(18),
      RESERVOIR(24),
      INTERVAL(19),
      NO_OVERLAP(20),
      NO_OVERLAP_2D(21),
      CUMULATIVE(22),
      CONSTRAINT_NOT_SET(0);

      private final int value;

      private ConstraintCase(int var3) {
         this.value = var3;
      }

      /** @deprecated */
      @Deprecated
      public static ConstraintProto.ConstraintCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static ConstraintProto.ConstraintCase forNumber(int var0) {
         switch(var0) {
         case 0:
            return CONSTRAINT_NOT_SET;
         case 1:
         case 2:
         case 6:
         default:
            return null;
         case 3:
            return BOOL_OR;
         case 4:
            return BOOL_AND;
         case 5:
            return BOOL_XOR;
         case 7:
            return INT_DIV;
         case 8:
            return INT_MOD;
         case 9:
            return INT_MAX;
         case 10:
            return INT_MIN;
         case 11:
            return INT_PROD;
         case 12:
            return LINEAR;
         case 13:
            return ALL_DIFF;
         case 14:
            return ELEMENT;
         case 15:
            return CIRCUIT;
         case 16:
            return TABLE;
         case 17:
            return AUTOMATON;
         case 18:
            return INVERSE;
         case 19:
            return INTERVAL;
         case 20:
            return NO_OVERLAP;
         case 21:
            return NO_OVERLAP_2D;
         case 22:
            return CUMULATIVE;
         case 23:
            return ROUTES;
         case 24:
            return RESERVOIR;
         case 25:
            return CIRCUIT_COVERING;
         case 26:
            return AT_MOST_ONE;
         }
      }

      public int getNumber() {
         return this.value;
      }
   }
}
