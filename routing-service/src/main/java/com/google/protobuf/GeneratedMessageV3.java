package com.google.protobuf;
import com.google.protobuf.*;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import  com.google.protobuf.Descriptors;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public abstract class GeneratedMessageV3 extends AbstractMessage implements Serializable {
   private static final long serialVersionUID = 1L;
   private static boolean forTestUseReflection = false;
   protected static boolean alwaysUseFieldBuilders = false;
   protected com.google.protobuf.UnknownFieldSet unknownFields;

   static void setForTestUseReflection(boolean var0) {
      forTestUseReflection = var0;
   }

   protected GeneratedMessageV3() {
      this.unknownFields = UnknownFieldSet.getDefaultInstance();
   }

   protected GeneratedMessageV3(GeneratedMessageV3.Builder var1) {
      this.unknownFields = var1.getUnknownFields();
   }

   public Parser getParserForType() {
      throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
   }

   static void enableAlwaysUseFieldBuildersForTesting() {
      setAlwaysUseFieldBuildersForTesting(true);
   }

   static void setAlwaysUseFieldBuildersForTesting(boolean var0) {
      alwaysUseFieldBuilders = var0;
   }

   protected abstract GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable();

   public Descriptors.Descriptor getDescriptorForType() {
      return this.internalGetFieldAccessorTable().descriptor;
   }

   protected void mergeFromAndMakeImmutableInternal(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
      Schema var3 = Protobuf.getInstance().schemaFor((Object)this);

      try {
         var3.mergeFrom(this, CodedInputStreamReader.forCodedInput(var1), var2);
      } catch (InvalidProtocolBufferException var5) {
         throw var5.setUnfinishedMessage(this);
      } catch (IOException var6) {
         throw (new InvalidProtocolBufferException(var6)).setUnfinishedMessage(this);
      }

      var3.makeImmutable(this);
   }

   private Map getAllFieldsMutable(boolean var1) {
      TreeMap var2 = new TreeMap();
      Descriptors.Descriptor var3 = this.internalGetFieldAccessorTable().descriptor;
      List var4 = var3.getFields();

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         Descriptors.FieldDescriptor var6 = (Descriptors.FieldDescriptor)var4.get(var5);
         Descriptors.OneofDescriptor var7 = var6.getContainingOneof();
         if (var7 != null) {
            var5 += var7.getFieldCount() - 1;
            if (!this.hasOneof(var7)) {
               continue;
            }

            var6 = this.getOneofFieldDescriptor(var7);
         } else {
            if (var6.isRepeated()) {
               List var8 = (List)this.getField(var6);
               if (!var8.isEmpty()) {
                  var2.put(var6, var8);
               }
               continue;
            }

            if (!this.hasField(var6)) {
               continue;
            }
         }

         if (var1 && var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.STRING) {
            var2.put(var6, this.getFieldRaw(var6));
         } else {
            var2.put(var6, this.getField(var6));
         }
      }

      return var2;
   }

   public boolean isInitialized() {
      Iterator var1 = this.getDescriptorForType().getFields().iterator();

      while(true) {
         while(true) {
            Descriptors.FieldDescriptor var2;
            do {
               if (!var1.hasNext()) {
                  return true;
               }

               var2 = (Descriptors.FieldDescriptor)var1.next();
               if (var2.isRequired() && !this.hasField(var2)) {
                  return false;
               }
            } while(var2.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE);

            if (var2.isRepeated()) {
               List var3 = (List)this.getField(var2);
               Iterator var4 = var3.iterator();

               while(var4.hasNext()) {
                  Message var5 = (Message)var4.next();
                  if (!var5.isInitialized()) {
                     return false;
                  }
               }
            } else if (this.hasField(var2) && !((Message)this.getField(var2)).isInitialized()) {
               return false;
            }
         }
      }
   }

   public Map getAllFields() {
      return Collections.unmodifiableMap(this.getAllFieldsMutable(false));
   }

   Map getAllFieldsRaw() {
      return Collections.unmodifiableMap(this.getAllFieldsMutable(true));
   }

   public boolean hasOneof(Descriptors.OneofDescriptor var1) {
      return this.internalGetFieldAccessorTable().getOneof(var1).has(this);
   }

   public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor var1) {
      return this.internalGetFieldAccessorTable().getOneof(var1).get(this);
   }

   public boolean hasField(Descriptors.FieldDescriptor var1) {
      return this.internalGetFieldAccessorTable().getField(var1).has(this);
   }

   public Object getField(Descriptors.FieldDescriptor var1) {
      return this.internalGetFieldAccessorTable().getField(var1).get(this);
   }

   Object getFieldRaw(Descriptors.FieldDescriptor var1) {
      return this.internalGetFieldAccessorTable().getField(var1).getRaw(this);
   }

   public int getRepeatedFieldCount(Descriptors.FieldDescriptor var1) {
      return this.internalGetFieldAccessorTable().getField(var1).getRepeatedCount(this);
   }

   public Object getRepeatedField(Descriptors.FieldDescriptor var1, int var2) {
      return this.internalGetFieldAccessorTable().getField(var1).getRepeated(this, var2);
   }

   public UnknownFieldSet getUnknownFields() {
      throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
   }

   protected boolean parseUnknownField(CodedInputStream var1, UnknownFieldSet.Builder var2, ExtensionRegistryLite var3, int var4) throws IOException {
      return var1.shouldDiscardUnknownFields() ? var1.skipField(var4) : var2.mergeFieldFrom(var4, var1);
   }

   protected boolean parseUnknownFieldProto3(CodedInputStream var1, UnknownFieldSet.Builder var2, ExtensionRegistryLite var3, int var4) throws IOException {
      return this.parseUnknownField(var1, var2, var3, var4);
   }

   protected static Message parseWithIOException(Parser var0, InputStream var1) throws IOException {
      try {
         return (Message)var0.parseFrom(var1);
      } catch (InvalidProtocolBufferException var3) {
         throw var3.unwrapIOException();
      }
   }

   protected static Message parseWithIOException(Parser var0, InputStream var1, ExtensionRegistryLite var2) throws IOException {
      try {
         return (Message)var0.parseFrom(var1, var2);
      } catch (InvalidProtocolBufferException var4) {
         throw var4.unwrapIOException();
      }
   }

   protected static Message parseWithIOException(Parser var0, CodedInputStream var1) throws IOException {
      try {
         return (Message)var0.parseFrom(var1);
      } catch (InvalidProtocolBufferException var3) {
         throw var3.unwrapIOException();
      }
   }

   protected static Message parseWithIOException(Parser var0, CodedInputStream var1, ExtensionRegistryLite var2) throws IOException {
      try {
         return (Message)var0.parseFrom(var1, var2);
      } catch (InvalidProtocolBufferException var4) {
         throw var4.unwrapIOException();
      }
   }

   protected static Message parseDelimitedWithIOException(Parser var0, InputStream var1) throws IOException {
      try {
         return (Message)var0.parseDelimitedFrom(var1);
      } catch (InvalidProtocolBufferException var3) {
         throw var3.unwrapIOException();
      }
   }

   protected static Message parseDelimitedWithIOException(Parser var0, InputStream var1, ExtensionRegistryLite var2) throws IOException {
      try {
         return (Message)var0.parseDelimitedFrom(var1, var2);
      } catch (InvalidProtocolBufferException var4) {
         throw var4.unwrapIOException();
      }
   }

   protected static boolean canUseUnsafe() {
      return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
   }

   protected static Internal.IntList emptyIntList() {
      return IntArrayList.emptyList();
   }

   protected static Internal.IntList newIntList() {
      return new IntArrayList();
   }

   protected static Internal.IntList mutableCopy(Internal.IntList var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   protected static Internal.LongList emptyLongList() {
      return LongArrayList.emptyList();
   }

   protected static Internal.LongList newLongList() {
      return new LongArrayList();
   }

   protected static Internal.LongList mutableCopy(Internal.LongList var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   protected static Internal.FloatList emptyFloatList() {
      return FloatArrayList.emptyList();
   }

   protected static Internal.FloatList newFloatList() {
      return new FloatArrayList();
   }

   protected static Internal.FloatList mutableCopy(Internal.FloatList var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   protected static Internal.DoubleList emptyDoubleList() {
      return DoubleArrayList.emptyList();
   }

   protected static Internal.DoubleList newDoubleList() {
      return new DoubleArrayList();
   }

   protected static Internal.DoubleList mutableCopy(Internal.DoubleList var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   protected static Internal.BooleanList emptyBooleanList() {
      return BooleanArrayList.emptyList();
   }

   protected static Internal.BooleanList newBooleanList() {
      return new BooleanArrayList();
   }

   protected static Internal.BooleanList mutableCopy(Internal.BooleanList var0) {
      int var1 = var0.size();
      return var0.mutableCopyWithCapacity(var1 == 0 ? 10 : var1 * 2);
   }

   public void writeTo(CodedOutputStream var1) throws IOException {
      MessageReflection.writeMessageTo(this, this.getAllFieldsRaw(), var1, false);
   }

   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      } else {
         this.memoizedSize = MessageReflection.getSerializedSize(this, this.getAllFieldsRaw());
         return this.memoizedSize;
      }
   }

   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      throw new UnsupportedOperationException("This method must be overridden by the subclass.");
   }

   protected void makeExtensionsImmutable() {
   }

   protected abstract Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1);

   protected Message.Builder newBuilderForType(final AbstractMessage.BuilderParent var1) {
      return this.newBuilderForType(new GeneratedMessageV3.BuilderParent() {
         public void markDirty() {
            var1.markDirty();
         }
      });
   }

   private static Method getMethodOrDie(Class var0, String var1, Class... var2) {
      try {
         return var0.getMethod(var1, var2);
      } catch (NoSuchMethodException var4) {
         throw new RuntimeException("Generated message class \"" + var0.getName() + "\" missing method \"" + var1 + "\".", var4);
      }
   }

   private static Object invokeOrDie(Method var0, Object var1, Object... var2) {
      try {
         return var0.invoke(var1, var2);
      } catch (IllegalAccessException var5) {
         throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", var5);
      } catch (InvocationTargetException var6) {
         Throwable var4 = var6.getCause();
         if (var4 instanceof RuntimeException) {
            throw (RuntimeException)var4;
         } else if (var4 instanceof Error) {
            throw (Error)var4;
         } else {
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", var4);
         }
      }
   }

   private static RuntimeException handleException(Throwable var0) {
      if (var0 instanceof ClassCastException) {
         throw new IllegalArgumentException(var0);
      } else if (var0 instanceof RuntimeException) {
         throw (RuntimeException)var0;
      } else if (var0 instanceof Error) {
         throw (Error)var0;
      } else {
         throw new RuntimeException("Unexpected exception thrown by generated accessor method.", var0);
      }
   }

   protected MapField internalGetMapField(int var1) {
      throw new RuntimeException("No map fields found in " + this.getClass().getName());
   }

   protected Object writeReplace() throws ObjectStreamException {
      return new GeneratedMessageLite.SerializedForm(this);
   }

   private static Extension checkNotLite(ExtensionLite var0) {
      if (var0.isLite()) {
         throw new IllegalArgumentException("Expected non-lite extension.");
      } else {
         return (Extension)var0;
      }
   }

   protected static int computeStringSize(int var0, Object var1) {
      return var1 instanceof String ? CodedOutputStream.computeStringSize(var0, (String)var1) : CodedOutputStream.computeBytesSize(var0, (ByteString)var1);
   }

   protected static int computeStringSizeNoTag(Object var0) {
      return var0 instanceof String ? CodedOutputStream.computeStringSizeNoTag((String)var0) : CodedOutputStream.computeBytesSizeNoTag((ByteString)var0);
   }

   protected static void writeString(CodedOutputStream var0, int var1, Object var2) throws IOException {
      if (var2 instanceof String) {
         var0.writeString(var1, (String)var2);
      } else {
         var0.writeBytes(var1, (ByteString)var2);
      }

   }

   protected static void writeStringNoTag(CodedOutputStream var0, Object var1) throws IOException {
      if (var1 instanceof String) {
         var0.writeStringNoTag((String)var1);
      } else {
         var0.writeBytesNoTag((ByteString)var1);
      }

   }

   protected static void serializeIntegerMapTo(CodedOutputStream var0, MapField var1, MapEntry var2, int var3) throws IOException {
      Map var4 = var1.getMap();
      if (!var0.isSerializationDeterministic()) {
         serializeMapTo(var0, var4, var2, var3);
      } else {
         int[] var5 = new int[var4.size()];
         int var6 = 0;

         int var8;
         for(Iterator var7 = var4.keySet().iterator(); var7.hasNext(); var5[var6++] = var8) {
            var8 = (Integer)var7.next();
         }

         Arrays.sort(var5);
         int[] var11 = var5;
         var8 = var5.length;

         for(int var9 = 0; var9 < var8; ++var9) {
            int var10 = var11[var9];
            var0.writeMessage(var3, var2.newBuilderForType().setKey(var10).setValue(var4.get(var10)).build());
         }

      }
   }

   protected static void serializeLongMapTo(CodedOutputStream var0, MapField var1, MapEntry var2, int var3) throws IOException {
      Map var4 = var1.getMap();
      if (!var0.isSerializationDeterministic()) {
         serializeMapTo(var0, var4, var2, var3);
      } else {
         long[] var5 = new long[var4.size()];
         int var6 = 0;

         long var8;
         for(Iterator var7 = var4.keySet().iterator(); var7.hasNext(); var5[var6++] = var8) {
            var8 = (Long)var7.next();
         }

         Arrays.sort(var5);
         long[] var12 = var5;
         int var13 = var5.length;

         for(int var9 = 0; var9 < var13; ++var9) {
            long var10 = var12[var9];
            var0.writeMessage(var3, var2.newBuilderForType().setKey(var10).setValue(var4.get(var10)).build());
         }

      }
   }

   protected static void serializeStringMapTo(CodedOutputStream var0, MapField var1, MapEntry var2, int var3) throws IOException {
      Map var4 = var1.getMap();
      if (!var0.isSerializationDeterministic()) {
         serializeMapTo(var0, var4, var2, var3);
      } else {
         String[] var5 = new String[var4.size()];
         var5 = (String[])var4.keySet().toArray(var5);
         Arrays.sort(var5);
         String[] var6 = var5;
         int var7 = var5.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6[var8];
            var0.writeMessage(var3, var2.newBuilderForType().setKey(var9).setValue(var4.get(var9)).build());
         }

      }
   }

   protected static void serializeBooleanMapTo(CodedOutputStream var0, MapField var1, MapEntry var2, int var3) throws IOException {
      Map var4 = var1.getMap();
      if (!var0.isSerializationDeterministic()) {
         serializeMapTo(var0, var4, var2, var3);
      } else {
         maybeSerializeBooleanEntryTo(var0, var4, var2, var3, false);
         maybeSerializeBooleanEntryTo(var0, var4, var2, var3, true);
      }
   }

   private static void maybeSerializeBooleanEntryTo(CodedOutputStream var0, Map var1, MapEntry var2, int var3, boolean var4) throws IOException {
      if (var1.containsKey(var4)) {
         var0.writeMessage(var3, var2.newBuilderForType().setKey(var4).setValue(var1.get(var4)).build());
      }

   }

   private static void serializeMapTo(CodedOutputStream var0, Map var1, MapEntry var2, int var3) throws IOException {
      Iterator var4 = var1.entrySet().iterator();

      while(var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         var0.writeMessage(var3, var2.newBuilderForType().setKey(var5.getKey()).setValue(var5.getValue()).build());
      }

   }

    public abstract byte[] toByteArray();

    public static final class FieldAccessorTable {
      private final Descriptor descriptor;
      private final GeneratedMessageV3.FieldAccessorTable.FieldAccessor[] fields;
      private String[] camelCaseNames;
      private final GeneratedMessageV3.FieldAccessorTable.OneofAccessor[] oneofs;
      private volatile boolean initialized;

      public FieldAccessorTable(Descriptors.Descriptor var1, String[] var2, Class var3, Class var4) {
         this(var1, var2);
         this.ensureFieldAccessorsInitialized(var3, var4);
      }

      public FieldAccessorTable(Descriptors.Descriptor var1, String[] var2) {
         this.descriptor = var1;
         this.camelCaseNames = var2;
         this.fields = new GeneratedMessageV3.FieldAccessorTable.FieldAccessor[var1.getFields().size()];
         this.oneofs = new GeneratedMessageV3.FieldAccessorTable.OneofAccessor[var1.getOneofs().size()];
         this.initialized = false;
      }

      public GeneratedMessageV3.FieldAccessorTable ensureFieldAccessorsInitialized(Class var1, Class var2) {
         if (this.initialized) {
            return this;
         } else {
            synchronized(this) {
               if (this.initialized) {
                  return this;
               } else {
                  int var4 = this.fields.length;

                  int var5;
                  for(var5 = 0; var5 < var4; ++var5) {
                     Descriptors.FieldDescriptor var6 = (Descriptors.FieldDescriptor)this.descriptor.getFields().get(var5);
                     String var7 = null;
                     if (var6.getContainingOneof() != null) {
                        var7 = this.camelCaseNames[var4 + var6.getContainingOneof().getIndex()];
                     }

                     if (var6.isRepeated()) {
                        if (var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                           if (var6.isMapField()) {
                              this.fields[var5] = new GeneratedMessageV3.FieldAccessorTable.MapFieldAccessor(var6, this.camelCaseNames[var5], var1, var2);
                           } else {
                              this.fields[var5] = new GeneratedMessageV3.FieldAccessorTable.RepeatedMessageFieldAccessor(var6, this.camelCaseNames[var5], var1, var2);
                           }
                        } else if (var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                           this.fields[var5] = new GeneratedMessageV3.FieldAccessorTable.RepeatedEnumFieldAccessor(var6, this.camelCaseNames[var5], var1, var2);
                        } else {
                           this.fields[var5] = new GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor(var6, this.camelCaseNames[var5], var1, var2);
                        }
                     } else if (var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        this.fields[var5] = new GeneratedMessageV3.FieldAccessorTable.SingularMessageFieldAccessor(var6, this.camelCaseNames[var5], var1, var2, var7);
                     } else if (var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                        this.fields[var5] = new GeneratedMessageV3.FieldAccessorTable.SingularEnumFieldAccessor(var6, this.camelCaseNames[var5], var1, var2, var7);
                     } else if (var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.STRING) {
                        this.fields[var5] = new GeneratedMessageV3.FieldAccessorTable.SingularStringFieldAccessor(var6, this.camelCaseNames[var5], var1, var2, var7);
                     } else {
                        this.fields[var5] = new GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor(var6, this.camelCaseNames[var5], var1, var2, var7);
                     }
                  }

                  var5 = this.oneofs.length;

                  for(int var10 = 0; var10 < var5; ++var10) {
                     this.oneofs[var10] = new GeneratedMessageV3.FieldAccessorTable.OneofAccessor(this.descriptor, this.camelCaseNames[var10 + var4], var1, var2);
                  }

                  this.initialized = true;
                  this.camelCaseNames = null;
                  return this;
               }
            }
         }
      }

      private GeneratedMessageV3.FieldAccessorTable.FieldAccessor getField(Descriptors.FieldDescriptor var1) {
         if (var1.getContainingType() != this.descriptor) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
         } else if (var1.isExtension()) {
            throw new IllegalArgumentException("This type does not have extensions.");
         } else {
            return this.fields[var1.getIndex()];
         }
      }

      private GeneratedMessageV3.FieldAccessorTable.OneofAccessor getOneof(Descriptors.OneofDescriptor var1) {
         if (var1.getContainingType() != this.descriptor) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
         } else {
            return this.oneofs[var1.getIndex()];
         }
      }

      private static boolean supportFieldPresence(Descriptors.FileDescriptor var0) {
         return var0.getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO2;
      }

      private static final class RepeatedMessageFieldAccessor extends GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor {
         private final Method newBuilderMethod;
         private final Method getBuilderMethodBuilder;

         RepeatedMessageFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4) {
            super(var1, var2, var3, var4);
            this.newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder");
            this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(var4, "get" + var2 + "Builder", Integer.TYPE);
         }

         private Object coerceType(Object var1) {
            return this.type.isInstance(var1) ? var1 : ((Message.Builder)GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object)null)).mergeFrom((Message)var1).build();
         }

         public void setRepeated(GeneratedMessageV3.Builder var1, int var2, Object var3) {
            super.setRepeated(var1, var2, this.coerceType(var3));
         }

         public void addRepeated(GeneratedMessageV3.Builder var1, Object var2) {
            super.addRepeated(var1, this.coerceType(var2));
         }

         public Message.Builder newBuilder() {
            return (Message.Builder)GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object)null);
         }

         public Message.Builder getRepeatedBuilder(GeneratedMessageV3.Builder var1, int var2) {
            return (Message.Builder)GeneratedMessageV3.invokeOrDie(this.getBuilderMethodBuilder, var1, var2);
         }
      }

      private static final class SingularMessageFieldAccessor extends GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor {
         private final Method newBuilderMethod;
         private final Method getBuilderMethodBuilder;

         SingularMessageFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4, String var5) {
            super(var1, var2, var3, var4, var5);
            this.newBuilderMethod = GeneratedMessageV3.getMethodOrDie(this.type, "newBuilder");
            this.getBuilderMethodBuilder = GeneratedMessageV3.getMethodOrDie(var4, "get" + var2 + "Builder");
         }

         private Object coerceType(Object var1) {
            return this.type.isInstance(var1) ? var1 : ((Message.Builder)GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object)null)).mergeFrom((Message)var1).buildPartial();
         }

         public void set(GeneratedMessageV3.Builder var1, Object var2) {
            super.set(var1, this.coerceType(var2));
         }

         public Message.Builder newBuilder() {
            return (Message.Builder)GeneratedMessageV3.invokeOrDie(this.newBuilderMethod, (Object)null);
         }

         public Message.Builder getBuilder(GeneratedMessageV3.Builder var1) {
            return (Message.Builder)GeneratedMessageV3.invokeOrDie(this.getBuilderMethodBuilder, var1);
         }
      }

      private static final class SingularStringFieldAccessor extends GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor {
         private final Method getBytesMethod;
         private final Method getBytesMethodBuilder;
         private final Method setBytesMethodBuilder;

         SingularStringFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4, String var5) {
            super(var1, var2, var3, var4, var5);
            this.getBytesMethod = GeneratedMessageV3.getMethodOrDie(var3, "get" + var2 + "Bytes");
            this.getBytesMethodBuilder = GeneratedMessageV3.getMethodOrDie(var4, "get" + var2 + "Bytes");
            this.setBytesMethodBuilder = GeneratedMessageV3.getMethodOrDie(var4, "set" + var2 + "Bytes", ByteString.class);
         }

         public Object getRaw(GeneratedMessageV3 var1) {
            return GeneratedMessageV3.invokeOrDie(this.getBytesMethod, var1);
         }

         public Object getRaw(GeneratedMessageV3.Builder var1) {
            return GeneratedMessageV3.invokeOrDie(this.getBytesMethodBuilder, var1);
         }

         public void set(GeneratedMessageV3.Builder var1, Object var2) {
            if (var2 instanceof ByteString) {
               GeneratedMessageV3.invokeOrDie(this.setBytesMethodBuilder, var1, var2);
            } else {
               super.set(var1, var2);
            }

         }
      }

      private static final class RepeatedEnumFieldAccessor extends GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor {
         private Descriptors.EnumDescriptor enumDescriptor;
         private final Method valueOfMethod;
         private final Method getValueDescriptorMethod;
         private boolean supportUnknownEnumValue;
         private Method getRepeatedValueMethod;
         private Method getRepeatedValueMethodBuilder;
         private Method setRepeatedValueMethod;
         private Method addRepeatedValueMethod;

         RepeatedEnumFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4) {
            super(var1, var2, var3, var4);
            this.enumDescriptor = var1.getEnumType();
            this.valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, "valueOf", Descriptors.EnumValueDescriptor.class);
            this.getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor");
            this.supportUnknownEnumValue = var1.getFile().supportsUnknownEnumValue();
            if (this.supportUnknownEnumValue) {
               this.getRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(var3, "get" + var2 + "Value", Integer.TYPE);
               this.getRepeatedValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(var4, "get" + var2 + "Value", Integer.TYPE);
               this.setRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(var4, "set" + var2 + "Value", Integer.TYPE, Integer.TYPE);
               this.addRepeatedValueMethod = GeneratedMessageV3.getMethodOrDie(var4, "add" + var2 + "Value", Integer.TYPE);
            }

         }

         public Object get(GeneratedMessageV3 var1) {
            ArrayList var2 = new ArrayList();
            int var3 = this.getRepeatedCount(var1);

            for(int var4 = 0; var4 < var3; ++var4) {
               var2.add(this.getRepeated(var1, var4));
            }

            return Collections.unmodifiableList(var2);
         }

         public Object get(GeneratedMessageV3.Builder var1) {
            ArrayList var2 = new ArrayList();
            int var3 = this.getRepeatedCount(var1);

            for(int var4 = 0; var4 < var3; ++var4) {
               var2.add(this.getRepeated(var1, var4));
            }

            return Collections.unmodifiableList(var2);
         }

         public Object getRepeated(GeneratedMessageV3 var1, int var2) {
            if (this.supportUnknownEnumValue) {
               int var3 = (Integer)GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethod, var1, var2);
               return this.enumDescriptor.findValueByNumberCreatingIfUnknown(var3);
            } else {
               return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(var1, var2));
            }
         }

         public Object getRepeated(GeneratedMessageV3.Builder var1, int var2) {
            if (this.supportUnknownEnumValue) {
               int var3 = (Integer)GeneratedMessageV3.invokeOrDie(this.getRepeatedValueMethodBuilder, var1, var2);
               return this.enumDescriptor.findValueByNumberCreatingIfUnknown(var3);
            } else {
               return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(var1, var2));
            }
         }

         public void setRepeated(GeneratedMessageV3.Builder var1, int var2, Object var3) {
            if (this.supportUnknownEnumValue) {
               GeneratedMessageV3.invokeOrDie(this.setRepeatedValueMethod, var1, var2, ((Descriptors.EnumValueDescriptor)var3).getNumber());
            } else {
               super.setRepeated(var1, var2, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, (Object)null, var3));
            }
         }

         public void addRepeated(GeneratedMessageV3.Builder var1, Object var2) {
            if (this.supportUnknownEnumValue) {
               GeneratedMessageV3.invokeOrDie(this.addRepeatedValueMethod, var1, ((Descriptors.EnumValueDescriptor)var2).getNumber());
            } else {
               super.addRepeated(var1, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, (Object)null, var2));
            }
         }
      }

      private static final class SingularEnumFieldAccessor extends GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor {
         private Descriptors.EnumDescriptor enumDescriptor;
         private Method valueOfMethod;
         private Method getValueDescriptorMethod;
         private boolean supportUnknownEnumValue;
         private Method getValueMethod;
         private Method getValueMethodBuilder;
         private Method setValueMethod;

         SingularEnumFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4, String var5) {
            super(var1, var2, var3, var4, var5);
            this.enumDescriptor = var1.getEnumType();
            this.valueOfMethod = GeneratedMessageV3.getMethodOrDie(this.type, "valueOf", Descriptors.EnumValueDescriptor.class);
            this.getValueDescriptorMethod = GeneratedMessageV3.getMethodOrDie(this.type, "getValueDescriptor");
            this.supportUnknownEnumValue = var1.getFile().supportsUnknownEnumValue();
            if (this.supportUnknownEnumValue) {
               this.getValueMethod = GeneratedMessageV3.getMethodOrDie(var3, "get" + var2 + "Value");
               this.getValueMethodBuilder = GeneratedMessageV3.getMethodOrDie(var4, "get" + var2 + "Value");
               this.setValueMethod = GeneratedMessageV3.getMethodOrDie(var4, "set" + var2 + "Value", Integer.TYPE);
            }

         }

         public Object get(GeneratedMessageV3 var1) {
            if (this.supportUnknownEnumValue) {
               int var2 = (Integer)GeneratedMessageV3.invokeOrDie(this.getValueMethod, var1);
               return this.enumDescriptor.findValueByNumberCreatingIfUnknown(var2);
            } else {
               return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(var1));
            }
         }

         public Object get(GeneratedMessageV3.Builder var1) {
            if (this.supportUnknownEnumValue) {
               int var2 = (Integer)GeneratedMessageV3.invokeOrDie(this.getValueMethodBuilder, var1);
               return this.enumDescriptor.findValueByNumberCreatingIfUnknown(var2);
            } else {
               return GeneratedMessageV3.invokeOrDie(this.getValueDescriptorMethod, super.get(var1));
            }
         }

         public void set(GeneratedMessageV3.Builder var1, Object var2) {
            if (this.supportUnknownEnumValue) {
               GeneratedMessageV3.invokeOrDie(this.setValueMethod, var1, ((Descriptors.EnumValueDescriptor)var2).getNumber());
            } else {
               super.set(var1, GeneratedMessageV3.invokeOrDie(this.valueOfMethod, (Object)null, var2));
            }
         }
      }

      private static class MapFieldAccessor implements GeneratedMessageV3.FieldAccessorTable.FieldAccessor {
         private final Descriptors.FieldDescriptor field;
         private final Message mapEntryMessageDefaultInstance;

         MapFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4) {
            this.field = var1;
            Method var5 = GeneratedMessageV3.getMethodOrDie(var3, "getDefaultInstance");
            MapField var6 = this.getMapField((GeneratedMessageV3)GeneratedMessageV3.invokeOrDie(var5, (Object)null));
            this.mapEntryMessageDefaultInstance = var6.getMapEntryMessageDefaultInstance();
         }

         private MapField getMapField(GeneratedMessageV3 var1) {
            return var1.internalGetMapField(this.field.getNumber());
         }

         private MapField getMapField(GeneratedMessageV3.Builder var1) {
            return var1.internalGetMapField(this.field.getNumber());
         }

         private MapField getMutableMapField(GeneratedMessageV3.Builder var1) {
            return var1.internalGetMutableMapField(this.field.getNumber());
         }

         private Message coerceType(Message var1) {
            if (var1 == null) {
               return null;
            } else {
               return this.mapEntryMessageDefaultInstance.getClass().isInstance(var1) ? var1 : this.mapEntryMessageDefaultInstance.toBuilder().mergeFrom(var1).build();
            }
         }

         public Object get(GeneratedMessageV3 var1) {
            ArrayList var2 = new ArrayList();

            for(int var3 = 0; var3 < this.getRepeatedCount(var1); ++var3) {
               var2.add(this.getRepeated(var1, var3));
            }

            return Collections.unmodifiableList(var2);
         }

         public Object get(GeneratedMessageV3.Builder var1) {
            ArrayList var2 = new ArrayList();

            for(int var3 = 0; var3 < this.getRepeatedCount(var1); ++var3) {
               var2.add(this.getRepeated(var1, var3));
            }

            return Collections.unmodifiableList(var2);
         }

         public Object getRaw(GeneratedMessageV3 var1) {
            return this.get(var1);
         }

         public Object getRaw(GeneratedMessageV3.Builder var1) {
            return this.get(var1);
         }

         public void set(GeneratedMessageV3.Builder var1, Object var2) {
            this.clear(var1);
            Iterator var3 = ((List)var2).iterator();

            while(var3.hasNext()) {
               Object var4 = var3.next();
               this.addRepeated(var1, var4);
            }

         }

         public Object getRepeated(GeneratedMessageV3 var1, int var2) {
            return this.getMapField(var1).getList().get(var2);
         }

         public Object getRepeated(GeneratedMessageV3.Builder var1, int var2) {
            return this.getMapField(var1).getList().get(var2);
         }

         public Object getRepeatedRaw(GeneratedMessageV3 var1, int var2) {
            return this.getRepeated(var1, var2);
         }

         public Object getRepeatedRaw(GeneratedMessageV3.Builder var1, int var2) {
            return this.getRepeated(var1, var2);
         }

         public void setRepeated(GeneratedMessageV3.Builder var1, int var2, Object var3) {
            this.getMutableMapField(var1).getMutableList().set(var2, this.coerceType((Message)var3));
         }

         public void addRepeated(GeneratedMessageV3.Builder var1, Object var2) {
            this.getMutableMapField(var1).getMutableList().add(this.coerceType((Message)var2));
         }

         public boolean has(GeneratedMessageV3 var1) {
            throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
         }

         public boolean has(GeneratedMessageV3.Builder var1) {
            throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
         }

         public int getRepeatedCount(GeneratedMessageV3 var1) {
            return this.getMapField(var1).getList().size();
         }

         public int getRepeatedCount(GeneratedMessageV3.Builder var1) {
            return this.getMapField(var1).getList().size();
         }

         public void clear(GeneratedMessageV3.Builder var1) {
            this.getMutableMapField(var1).getMutableList().clear();
         }

         public Message.Builder newBuilder() {
            return this.mapEntryMessageDefaultInstance.newBuilderForType();
         }

         public Message.Builder getBuilder(GeneratedMessageV3.Builder var1) {
            throw new UnsupportedOperationException("Nested builder not supported for map fields.");
         }

         public Message.Builder getRepeatedBuilder(GeneratedMessageV3.Builder var1, int var2) {
            throw new UnsupportedOperationException("Nested builder not supported for map fields.");
         }
      }

      private static class RepeatedFieldAccessor implements GeneratedMessageV3.FieldAccessorTable.FieldAccessor {
         protected final Class type;
         protected final GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker invoker;

         RepeatedFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4) {
            GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.ReflectionInvoker var5 = new GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.ReflectionInvoker(var1, var2, var3, var4);
            this.type = var5.getRepeatedMethod.getReturnType();
            this.invoker = tryGetMethodHandleInvoke(var5);
         }

         static GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker tryGetMethodHandleInvoke(GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.ReflectionInvoker var0) {
            if (GeneratedMessageV3.forTestUseReflection) {
               return var0;
            } else {
               try {
                  return new GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodHandleInvoker(var0);
               } catch (NoClassDefFoundError var2) {
                  return var0;
               } catch (IllegalAccessException var3) {
                  throw new RuntimeException(var3);
               }
            }
         }

         public Object get(GeneratedMessageV3 var1) {
            return this.invoker.get(var1);
         }

         public Object get(GeneratedMessageV3.Builder var1) {
            return this.invoker.get(var1);
         }

         public Object getRaw(GeneratedMessageV3 var1) {
            return this.get(var1);
         }

         public Object getRaw(GeneratedMessageV3.Builder var1) {
            return this.get(var1);
         }

         public void set(GeneratedMessageV3.Builder var1, Object var2) {
            this.clear(var1);
            Iterator var3 = ((List)var2).iterator();

            while(var3.hasNext()) {
               Object var4 = var3.next();
               this.addRepeated(var1, var4);
            }

         }

         public Object getRepeated(GeneratedMessageV3 var1, int var2) {
            return this.invoker.getRepeated(var1, var2);
         }

         public Object getRepeated(GeneratedMessageV3.Builder var1, int var2) {
            return this.invoker.getRepeated(var1, var2);
         }

         public Object getRepeatedRaw(GeneratedMessageV3 var1, int var2) {
            return this.getRepeated(var1, var2);
         }

         public Object getRepeatedRaw(GeneratedMessageV3.Builder var1, int var2) {
            return this.getRepeated(var1, var2);
         }

         public void setRepeated(GeneratedMessageV3.Builder var1, int var2, Object var3) {
            this.invoker.setRepeated(var1, var2, var3);
         }

         public void addRepeated(GeneratedMessageV3.Builder var1, Object var2) {
            this.invoker.addRepeated(var1, var2);
         }

         public boolean has(GeneratedMessageV3 var1) {
            throw new UnsupportedOperationException("hasField() called on a repeated field.");
         }

         public boolean has(GeneratedMessageV3.Builder var1) {
            throw new UnsupportedOperationException("hasField() called on a repeated field.");
         }

         public int getRepeatedCount(GeneratedMessageV3 var1) {
            return this.invoker.getRepeatedCount(var1);
         }

         public int getRepeatedCount(GeneratedMessageV3.Builder var1) {
            return this.invoker.getRepeatedCount(var1);
         }

         public void clear(GeneratedMessageV3.Builder var1) {
            this.invoker.clear(var1);
         }

         public Message.Builder newBuilder() {
            throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
         }

         public Message.Builder getBuilder(GeneratedMessageV3.Builder var1) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
         }

         public Message.Builder getRepeatedBuilder(GeneratedMessageV3.Builder var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
         }

         private static final class MethodHandleInvoker implements GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker {
            protected final MethodHandle getMethod;
            protected final MethodHandle getMethodBuilder;
            protected final MethodHandle getRepeatedMethod;
            protected final MethodHandle getRepeatedMethodBuilder;
            protected final MethodHandle setRepeatedMethod;
            protected final MethodHandle addRepeatedMethod;
            protected final MethodHandle getCountMethod;
            protected final MethodHandle getCountMethodBuilder;
            protected final MethodHandle clearMethod;

            MethodHandleInvoker(GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.ReflectionInvoker var1) throws IllegalAccessException {
               Lookup var2 = MethodHandles.lookup();
               this.getMethod = var2.unreflect(var1.getMethod);
               this.getMethodBuilder = var2.unreflect(var1.getMethodBuilder);
               this.getRepeatedMethod = var2.unreflect(var1.getRepeatedMethod);
               this.getRepeatedMethodBuilder = var2.unreflect(var1.getRepeatedMethodBuilder);
               this.setRepeatedMethod = var2.unreflect(var1.setRepeatedMethod);
               this.addRepeatedMethod = var2.unreflect(var1.addRepeatedMethod);
               this.getCountMethod = var2.unreflect(var1.getCountMethod);
               this.getCountMethodBuilder = var2.unreflect(var1.getCountMethodBuilder);
               this.clearMethod = var2.unreflect(var1.clearMethod);
            }

            public Object get(GeneratedMessageV3 var1) {
               try {
                  return this.getMethod.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }

            public Object get(GeneratedMessageV3.Builder var1) {
               try {
                  return this.getMethodBuilder.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }

            public Object getRepeated(GeneratedMessageV3 var1, int var2) {
               try {
                  return this.getRepeatedMethod.invoke(var1, var2);
               } catch (Throwable var4) {
                  throw GeneratedMessageV3.handleException(var4);
               }
            }

            public Object getRepeated(GeneratedMessageV3.Builder var1, int var2) {
               try {
                  return this.getRepeatedMethodBuilder.invoke(var1, var2);
               } catch (Throwable var4) {
                  throw GeneratedMessageV3.handleException(var4);
               }
            }

            public void setRepeated(GeneratedMessageV3.Builder var1, int var2, Object var3) {
               try {
                  this.setRepeatedMethod.invoke(var1, var2, var3);
               } catch (Throwable var5) {
                  throw GeneratedMessageV3.handleException(var5);
               }
            }

            public void addRepeated(GeneratedMessageV3.Builder var1, Object var2) {
               try {
                  this.addRepeatedMethod.invoke(var1, var2);
               } catch (Throwable var4) {
                  throw GeneratedMessageV3.handleException(var4);
               }
            }

            public int getRepeatedCount(GeneratedMessageV3 var1) {
               try {
                  return (int) this.getCountMethod.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }

            public int getRepeatedCount(GeneratedMessageV3.Builder var1) {
               try {
                  return (int) this.getCountMethodBuilder.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }

            public void clear(GeneratedMessageV3.Builder var1) {
               try {
                  this.clearMethod.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }
         }

         private static final class ReflectionInvoker implements GeneratedMessageV3.FieldAccessorTable.RepeatedFieldAccessor.MethodInvoker {
            protected final Method getMethod;
            protected final Method getMethodBuilder;
            protected final Method getRepeatedMethod;
            protected final Method getRepeatedMethodBuilder;
            protected final Method setRepeatedMethod;
            protected final Method addRepeatedMethod;
            protected final Method getCountMethod;
            protected final Method getCountMethodBuilder;
            protected final Method clearMethod;

            ReflectionInvoker(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4) {
               this.getMethod = GeneratedMessageV3.getMethodOrDie(var3, "get" + var2 + "List");
               this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(var4, "get" + var2 + "List");
               this.getRepeatedMethod = GeneratedMessageV3.getMethodOrDie(var3, "get" + var2, Integer.TYPE);
               this.getRepeatedMethodBuilder = GeneratedMessageV3.getMethodOrDie(var4, "get" + var2, Integer.TYPE);
               Class var5 = this.getRepeatedMethod.getReturnType();
               this.setRepeatedMethod = GeneratedMessageV3.getMethodOrDie(var4, "set" + var2, Integer.TYPE, var5);
               this.addRepeatedMethod = GeneratedMessageV3.getMethodOrDie(var4, "add" + var2, var5);
               this.getCountMethod = GeneratedMessageV3.getMethodOrDie(var3, "get" + var2 + "Count");
               this.getCountMethodBuilder = GeneratedMessageV3.getMethodOrDie(var4, "get" + var2 + "Count");
               this.clearMethod = GeneratedMessageV3.getMethodOrDie(var4, "clear" + var2);
            }

            public Object get(GeneratedMessageV3 var1) {
               return GeneratedMessageV3.invokeOrDie(this.getMethod, var1);
            }

            public Object get(GeneratedMessageV3.Builder var1) {
               return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, var1);
            }

            public Object getRepeated(GeneratedMessageV3 var1, int var2) {
               return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethod, var1, var2);
            }

            public Object getRepeated(GeneratedMessageV3.Builder var1, int var2) {
               return GeneratedMessageV3.invokeOrDie(this.getRepeatedMethodBuilder, var1, var2);
            }

            public void setRepeated(GeneratedMessageV3.Builder var1, int var2, Object var3) {
               GeneratedMessageV3.invokeOrDie(this.setRepeatedMethod, var1, var2, var3);
            }

            public void addRepeated(GeneratedMessageV3.Builder var1, Object var2) {
               GeneratedMessageV3.invokeOrDie(this.addRepeatedMethod, var1, var2);
            }

            public int getRepeatedCount(GeneratedMessageV3 var1) {
               return (Integer)GeneratedMessageV3.invokeOrDie(this.getCountMethod, var1);
            }

            public int getRepeatedCount(GeneratedMessageV3.Builder var1) {
               return (Integer)GeneratedMessageV3.invokeOrDie(this.getCountMethodBuilder, var1);
            }

            public void clear(GeneratedMessageV3.Builder var1) {
               GeneratedMessageV3.invokeOrDie(this.clearMethod, var1);
            }
         }

         interface MethodInvoker {
            Object get(GeneratedMessageV3 var1);

            Object get(GeneratedMessageV3.Builder var1);

            Object getRepeated(GeneratedMessageV3 var1, int var2);

            Object getRepeated(GeneratedMessageV3.Builder var1, int var2);

            void setRepeated(GeneratedMessageV3.Builder var1, int var2, Object var3);

            void addRepeated(GeneratedMessageV3.Builder var1, Object var2);

            int getRepeatedCount(GeneratedMessageV3 var1);

            int getRepeatedCount(GeneratedMessageV3.Builder var1);

            void clear(GeneratedMessageV3.Builder var1);
         }
      }

      private static class SingularFieldAccessor implements GeneratedMessageV3.FieldAccessorTable.FieldAccessor {
         protected final Class type;
         protected final Descriptors.FieldDescriptor field;
         protected final boolean isOneofField;
         protected final boolean hasHasMethod;
         protected final GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker invoker;

         SingularFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4, String var5) {
            this.isOneofField = var1.getContainingOneof() != null;
            this.hasHasMethod = GeneratedMessageV3.FieldAccessorTable.supportFieldPresence(var1.getFile()) || !this.isOneofField && var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE;
            GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.ReflectionInvoker var6 = new GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.ReflectionInvoker(var1, var2, var3, var4, var5, this.isOneofField, this.hasHasMethod);
            this.field = var1;
            this.type = var6.getMethod.getReturnType();
            this.invoker = tryGetMethodHandleInvoke(var6);
         }

         static GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker tryGetMethodHandleInvoke(GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.ReflectionInvoker var0) {
            if (GeneratedMessageV3.forTestUseReflection) {
               return var0;
            } else {
               try {
                  return new GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodHandleInvoker(var0);
               } catch (NoClassDefFoundError var2) {
                  return var0;
               } catch (IllegalAccessException var3) {
                  throw new RuntimeException(var3);
               }
            }
         }

         public Object get(GeneratedMessageV3 var1) {
            return this.invoker.get(var1);
         }

         public Object get(GeneratedMessageV3.Builder var1) {
            return this.invoker.get(var1);
         }

         public Object getRaw(GeneratedMessageV3 var1) {
            return this.get(var1);
         }

         public Object getRaw(GeneratedMessageV3.Builder var1) {
            return this.get(var1);
         }

         public void set(GeneratedMessageV3.Builder var1, Object var2) {
            this.invoker.set(var1, var2);
         }

         public Object getRepeated(GeneratedMessageV3 var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
         }

         public Object getRepeatedRaw(GeneratedMessageV3 var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedFieldRaw() called on a singular field.");
         }

         public Object getRepeated(GeneratedMessageV3.Builder var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
         }

         public Object getRepeatedRaw(GeneratedMessageV3.Builder var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedFieldRaw() called on a singular field.");
         }

         public void setRepeated(GeneratedMessageV3.Builder var1, int var2, Object var3) {
            throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
         }

         public void addRepeated(GeneratedMessageV3.Builder var1, Object var2) {
            throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
         }

         public boolean has(GeneratedMessageV3 var1) {
            if (!this.hasHasMethod) {
               if (this.isOneofField) {
                  return this.invoker.getOneofFieldNumber(var1) == this.field.getNumber();
               } else {
                  return !this.get(var1).equals(this.field.getDefaultValue());
               }
            } else {
               return this.invoker.has(var1);
            }
         }

         public boolean has(GeneratedMessageV3.Builder var1) {
            if (!this.hasHasMethod) {
               if (this.isOneofField) {
                  return this.invoker.getOneofFieldNumber(var1) == this.field.getNumber();
               } else {
                  return !this.get(var1).equals(this.field.getDefaultValue());
               }
            } else {
               return this.invoker.has(var1);
            }
         }

         public int getRepeatedCount(GeneratedMessageV3 var1) {
            throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
         }

         public int getRepeatedCount(GeneratedMessageV3.Builder var1) {
            throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
         }

         public void clear(GeneratedMessageV3.Builder var1) {
            this.invoker.clear(var1);
         }

         public Message.Builder newBuilder() {
            throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
         }

         public Message.Builder getBuilder(GeneratedMessageV3.Builder var1) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
         }

         public Message.Builder getRepeatedBuilder(GeneratedMessageV3.Builder var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
         }

         private static final class MethodHandleInvoker implements GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker {
            protected final MethodHandle getMethod;
            protected final MethodHandle getMethodBuilder;
            protected final MethodHandle setMethod;
            protected final MethodHandle hasMethod;
            protected final MethodHandle hasMethodBuilder;
            protected final MethodHandle clearMethod;
            protected final MethodHandle caseMethod;
            protected final MethodHandle caseMethodBuilder;

            MethodHandleInvoker(GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.ReflectionInvoker var1) throws IllegalAccessException {
               Lookup var2 = MethodHandles.publicLookup();
               this.getMethod = var2.unreflect(var1.getMethod);
               this.getMethodBuilder = var2.unreflect(var1.getMethodBuilder);
               this.setMethod = var2.unreflect(var1.setMethod);
               this.hasMethod = var1.hasMethod != null ? var2.unreflect(var1.hasMethod) : null;
               this.hasMethodBuilder = var1.hasMethodBuilder != null ? var2.unreflect(var1.hasMethodBuilder) : null;
               this.clearMethod = var2.unreflect(var1.clearMethod);
               this.caseMethod = var1.caseMethod != null ? var2.unreflect(var1.caseMethod) : null;
               this.caseMethodBuilder = var1.caseMethodBuilder != null ? var2.unreflect(var1.caseMethodBuilder) : null;
            }

            public Object get(GeneratedMessageV3 var1) {
               try {
                  return this.getMethod.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }

            public Object get(GeneratedMessageV3.Builder var1) {
               try {
                  return this.getMethodBuilder.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }

            public int getOneofFieldNumber(GeneratedMessageV3 var1) {
               try {
                  return (int) this.caseMethod.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }

            public int getOneofFieldNumber(Builder var1) {
               try {
                  return (int)this.caseMethodBuilder.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }

            public void set(GeneratedMessageV3.Builder var1, Object var2) {
               try {
                  this.setMethod.invoke(var1, var2);
               } catch (Throwable var4) {
                  throw GeneratedMessageV3.handleException(var4);
               }
            }

            public boolean has(GeneratedMessageV3 var1) {
               try {
                  return (boolean) this.hasMethod.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }

            public boolean has(GeneratedMessageV3.Builder var1) {
               try {
                  return (boolean) this.hasMethodBuilder.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }

            public void clear(GeneratedMessageV3.Builder var1) {
               try {
                  this.clearMethod.invoke(var1);
               } catch (Throwable var3) {
                  throw GeneratedMessageV3.handleException(var3);
               }
            }
         }

         private static final class ReflectionInvoker implements GeneratedMessageV3.FieldAccessorTable.SingularFieldAccessor.MethodInvoker {
            protected final Method getMethod;
            protected final Method getMethodBuilder;
            protected final Method setMethod;
            protected final Method hasMethod;
            protected final Method hasMethodBuilder;
            protected final Method clearMethod;
            protected final Method caseMethod;
            protected final Method caseMethodBuilder;

            ReflectionInvoker(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4, String var5, boolean var6, boolean var7) {
               this.getMethod = GeneratedMessageV3.getMethodOrDie(var3, "get" + var2);
               this.getMethodBuilder = GeneratedMessageV3.getMethodOrDie(var4, "get" + var2);
               Class var8 = this.getMethod.getReturnType();
               this.setMethod = GeneratedMessageV3.getMethodOrDie(var4, "set" + var2, var8);
               this.hasMethod = var7 ? GeneratedMessageV3.getMethodOrDie(var3, "has" + var2) : null;
               this.hasMethodBuilder = var7 ? GeneratedMessageV3.getMethodOrDie(var4, "has" + var2) : null;
               this.clearMethod = GeneratedMessageV3.getMethodOrDie(var4, "clear" + var2);
               this.caseMethod = var6 ? GeneratedMessageV3.getMethodOrDie(var3, "get" + var5 + "Case") : null;
               this.caseMethodBuilder = var6 ? GeneratedMessageV3.getMethodOrDie(var4, "get" + var5 + "Case") : null;
            }

            public Object get(GeneratedMessageV3 var1) {
               return GeneratedMessageV3.invokeOrDie(this.getMethod, var1);
            }

            public Object get(GeneratedMessageV3.Builder var1) {
               return GeneratedMessageV3.invokeOrDie(this.getMethodBuilder, var1);
            }

            public int getOneofFieldNumber(GeneratedMessageV3 var1) {
               return ((Internal.EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethod, var1)).getNumber();
            }

            public int getOneofFieldNumber(GeneratedMessageV3.Builder var1) {
               return ((Internal.EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, var1)).getNumber();
            }

            public void set(GeneratedMessageV3.Builder var1, Object var2) {
               GeneratedMessageV3.invokeOrDie(this.setMethod, var1, var2);
            }

            public boolean has(GeneratedMessageV3 var1) {
               return (Boolean)GeneratedMessageV3.invokeOrDie(this.hasMethod, var1);
            }

            public boolean has(GeneratedMessageV3.Builder var1) {
               return (Boolean)GeneratedMessageV3.invokeOrDie(this.hasMethodBuilder, var1);
            }

            public void clear(GeneratedMessageV3.Builder var1) {
               GeneratedMessageV3.invokeOrDie(this.clearMethod, var1);
            }
         }

         private interface MethodInvoker {
            Object get(GeneratedMessageV3 var1);

            Object get(GeneratedMessageV3.Builder var1);

            int getOneofFieldNumber(GeneratedMessageV3 var1);

            int getOneofFieldNumber(GeneratedMessageV3.Builder var1);

            void set(GeneratedMessageV3.Builder var1, Object var2);

            boolean has(GeneratedMessageV3 var1);

            boolean has(GeneratedMessageV3.Builder var1);

            void clear(GeneratedMessageV3.Builder var1);
         }
      }

      private static class OneofAccessor {
         private final Descriptors.Descriptor descriptor;
         private final Method caseMethod;
         private final Method caseMethodBuilder;
         private final Method clearMethod;

         OneofAccessor(Descriptors.Descriptor var1, String var2, Class var3, Class var4) {
            this.descriptor = var1;
            this.caseMethod = GeneratedMessageV3.getMethodOrDie(var3, "get" + var2 + "Case");
            this.caseMethodBuilder = GeneratedMessageV3.getMethodOrDie(var4, "get" + var2 + "Case");
            this.clearMethod = GeneratedMessageV3.getMethodOrDie(var4, "clear" + var2);
         }

         public boolean has(GeneratedMessageV3 var1) {
            return ((Internal.EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethod, var1)).getNumber() != 0;
         }

         public boolean has(GeneratedMessageV3.Builder var1) {
            return ((Internal.EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, var1)).getNumber() != 0;
         }

         public Descriptors.FieldDescriptor get(GeneratedMessageV3 var1) {
            int var2 = ((Internal.EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethod, var1)).getNumber();
            return var2 > 0 ? this.descriptor.findFieldByNumber(var2) : null;
         }

         public Descriptors.FieldDescriptor get(GeneratedMessageV3.Builder var1) {
            int var2 = ((Internal.EnumLite)GeneratedMessageV3.invokeOrDie(this.caseMethodBuilder, var1)).getNumber();
            return var2 > 0 ? this.descriptor.findFieldByNumber(var2) : null;
         }

         public void clear(GeneratedMessageV3.Builder var1) {
            GeneratedMessageV3.invokeOrDie(this.clearMethod, var1);
         }
      }

      private interface FieldAccessor {
         Object get(GeneratedMessageV3 var1);

         Object get(GeneratedMessageV3.Builder var1);

         Object getRaw(GeneratedMessageV3 var1);

         Object getRaw(GeneratedMessageV3.Builder var1);

         void set(GeneratedMessageV3.Builder var1, Object var2);

         Object getRepeated(GeneratedMessageV3 var1, int var2);

         Object getRepeated(GeneratedMessageV3.Builder var1, int var2);

         Object getRepeatedRaw(GeneratedMessageV3 var1, int var2);

         Object getRepeatedRaw(GeneratedMessageV3.Builder var1, int var2);

         void setRepeated(GeneratedMessageV3.Builder var1, int var2, Object var3);

         void addRepeated(GeneratedMessageV3.Builder var1, Object var2);

         boolean has(GeneratedMessageV3 var1);

         boolean has(GeneratedMessageV3.Builder var1);

         int getRepeatedCount(GeneratedMessageV3 var1);

         int getRepeatedCount(GeneratedMessageV3.Builder var1);

         void clear(GeneratedMessageV3.Builder var1);

         Message.Builder newBuilder();

         Message.Builder getBuilder(GeneratedMessageV3.Builder var1);

         Message.Builder getRepeatedBuilder(GeneratedMessageV3.Builder var1, int var2);
      }
   }

   interface ExtensionDescriptorRetriever {
      Descriptors.FieldDescriptor getDescriptor();
   }

   public abstract static class ExtendableBuilder extends GeneratedMessageV3.Builder implements GeneratedMessageV3.ExtendableMessageOrBuilder {
      private FieldSet.Builder extensions;

      protected ExtendableBuilder() {
      }

      protected ExtendableBuilder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      void internalSetExtensionSet(FieldSet var1) {
         this.extensions = FieldSet.Builder.fromFieldSet(var1);
      }

      public GeneratedMessageV3.ExtendableBuilder clear() {
         this.extensions = null;
         return (GeneratedMessageV3.ExtendableBuilder)super.clear();
      }

      private void ensureExtensionsIsMutable() {
         if (this.extensions == null) {
            this.extensions = FieldSet.newBuilder();
         }

      }

      private void verifyExtensionContainingType(Extension var1) {
         if (var1.getDescriptor().getContainingType() != this.getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + var1.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + this.getDescriptorForType().getFullName() + "\".");
         }
      }

      public final boolean hasExtension(ExtensionLite var1) {
         Extension var2 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var2);
         return this.extensions == null ? false : this.extensions.hasField(var2.getDescriptor());
      }

      public final int getExtensionCount(ExtensionLite var1) {
         Extension var2 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var2);
         Descriptors.FieldDescriptor var3 = var2.getDescriptor();
         return this.extensions == null ? 0 : this.extensions.getRepeatedFieldCount(var3);
      }

      public final Object getExtension(ExtensionLite var1) {
         Extension var2 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var2);
         Descriptors.FieldDescriptor var3 = var2.getDescriptor();
         Object var4 = this.extensions == null ? null : this.extensions.getField(var3);
         if (var4 == null) {
            if (var3.isRepeated()) {
               return Collections.emptyList();
            } else {
               return var3.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? var2.getMessageDefaultInstance() : var2.fromReflectionType(var3.getDefaultValue());
            }
         } else {
            return var2.fromReflectionType(var4);
         }
      }

      public final Object getExtension(ExtensionLite var1, int var2) {
         Extension var3 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var3);
         Descriptors.FieldDescriptor var4 = var3.getDescriptor();
         if (this.extensions == null) {
            throw new IndexOutOfBoundsException();
         } else {
            return var3.singularFromReflectionType(this.extensions.getRepeatedField(var4, var2));
         }
      }

      public final GeneratedMessageV3.ExtendableBuilder setExtension(ExtensionLite var1, Object var2) {
         Extension var3 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var3);
         this.ensureExtensionsIsMutable();
         Descriptors.FieldDescriptor var4 = var3.getDescriptor();
         this.extensions.setField(var4, var3.toReflectionType(var2));
         this.onChanged();
         return this;
      }

      public final GeneratedMessageV3.ExtendableBuilder setExtension(ExtensionLite var1, int var2, Object var3) {
         Extension var4 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var4);
         this.ensureExtensionsIsMutable();
         Descriptors.FieldDescriptor var5 = var4.getDescriptor();
         this.extensions.setRepeatedField(var5, var2, var4.singularToReflectionType(var3));
         this.onChanged();
         return this;
      }

      public final GeneratedMessageV3.ExtendableBuilder addExtension(ExtensionLite var1, Object var2) {
         Extension var3 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var3);
         this.ensureExtensionsIsMutable();
         Descriptors.FieldDescriptor var4 = var3.getDescriptor();
         this.extensions.addRepeatedField(var4, var3.singularToReflectionType(var2));
         this.onChanged();
         return this;
      }

      public final GeneratedMessageV3.ExtendableBuilder clearExtension(ExtensionLite var1) {
         Extension var2 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var2);
         this.ensureExtensionsIsMutable();
         this.extensions.clearField(var2.getDescriptor());
         this.onChanged();
         return this;
      }

      public final boolean hasExtension(Extension var1) {
         return this.hasExtension((ExtensionLite)var1);
      }

      public final boolean hasExtension(GeneratedMessage.GeneratedExtension var1) {
         return this.hasExtension((ExtensionLite)var1);
      }

      public final int getExtensionCount(Extension var1) {
         return this.getExtensionCount((ExtensionLite)var1);
      }

      public final int getExtensionCount(GeneratedMessage.GeneratedExtension var1) {
         return this.getExtensionCount((ExtensionLite)var1);
      }

      public final Object getExtension(Extension var1) {
         return this.getExtension((ExtensionLite)var1);
      }

      public final Object getExtension(GeneratedMessage.GeneratedExtension var1) {
         return this.getExtension((ExtensionLite)var1);
      }

      public final Object getExtension(Extension var1, int var2) {
         return this.getExtension((ExtensionLite)var1, var2);
      }

      public final Object getExtension(GeneratedMessage.GeneratedExtension var1, int var2) {
         return this.getExtension((ExtensionLite)var1, var2);
      }

      public final GeneratedMessageV3.ExtendableBuilder setExtension(Extension var1, Object var2) {
         return this.setExtension((ExtensionLite)var1, var2);
      }

      public GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension var1, Object var2) {
         return this.setExtension((ExtensionLite)var1, var2);
      }

      public final GeneratedMessageV3.ExtendableBuilder setExtension(Extension var1, int var2, Object var3) {
         return this.setExtension((ExtensionLite)var1, var2, var3);
      }

      public GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension var1, int var2, Object var3) {
         return this.setExtension((ExtensionLite)var1, var2, var3);
      }

      public final GeneratedMessageV3.ExtendableBuilder addExtension(Extension var1, Object var2) {
         return this.addExtension((ExtensionLite)var1, var2);
      }

      public GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension var1, Object var2) {
         return this.addExtension((ExtensionLite)var1, var2);
      }

      public final GeneratedMessageV3.ExtendableBuilder clearExtension(Extension var1) {
         return this.clearExtension((ExtensionLite)var1);
      }

      public GeneratedMessageV3.ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension var1) {
         return this.clearExtension((ExtensionLite)var1);
      }

      protected boolean extensionsAreInitialized() {
         return this.extensions == null ? true : this.extensions.isInitialized();
      }

      private FieldSet buildExtensions() {
         return this.extensions == null ? FieldSet.emptySet() : this.extensions.build();
      }

      public boolean isInitialized() {
         return super.isInitialized() && this.extensionsAreInitialized();
      }

      public Map getAllFields() {
         Map var1 = super.getAllFieldsMutable();
         if (this.extensions != null) {
            var1.putAll(this.extensions.getAllFields());
         }

         return Collections.unmodifiableMap(var1);
      }

      public Object getField(Descriptors.FieldDescriptor var1) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            Object var2 = this.extensions == null ? null : this.extensions.getField(var1);
            if (var2 == null) {
               return var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? DynamicMessage.getDefaultInstance(var1.getMessageType()) : var1.getDefaultValue();
            } else {
               return var2;
            }
         } else {
            return super.getField(var1);
         }
      }

      public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor var1) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            if (var1.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
               throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            } else {
               this.ensureExtensionsIsMutable();
               Object var2 = this.extensions.getFieldAllowBuilders(var1);
               if (var2 == null) {
                  DynamicMessage.Builder var4 = DynamicMessage.newBuilder(var1.getMessageType());
                  this.extensions.setField(var1, var4);
                  this.onChanged();
                  return var4;
               } else if (var2 instanceof Message.Builder) {
                  return (Message.Builder)var2;
               } else if (var2 instanceof Message) {
                  Message.Builder var3 = ((Message)var2).toBuilder();
                  this.extensions.setField(var1, var3);
                  this.onChanged();
                  return var3;
               } else {
                  throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
               }
            }
         } else {
            return super.getFieldBuilder(var1);
         }
      }

      public int getRepeatedFieldCount(Descriptors.FieldDescriptor var1) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            return this.extensions == null ? 0 : this.extensions.getRepeatedFieldCount(var1);
         } else {
            return super.getRepeatedFieldCount(var1);
         }
      }

      public Object getRepeatedField(Descriptors.FieldDescriptor var1, int var2) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            if (this.extensions == null) {
               throw new IndexOutOfBoundsException();
            } else {
               return this.extensions.getRepeatedField(var1, var2);
            }
         } else {
            return super.getRepeatedField(var1, var2);
         }
      }

      public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor var1, int var2) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            this.ensureExtensionsIsMutable();
            if (var1.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
               throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            } else {
               Object var3 = this.extensions.getRepeatedFieldAllowBuilders(var1, var2);
               if (var3 instanceof Message.Builder) {
                  return (Message.Builder)var3;
               } else if (var3 instanceof Message) {
                  Message.Builder var4 = ((Message)var3).toBuilder();
                  this.extensions.setRepeatedField(var1, var2, var4);
                  this.onChanged();
                  return var4;
               } else {
                  throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
               }
            }
         } else {
            return super.getRepeatedFieldBuilder(var1, var2);
         }
      }

      public boolean hasField(Descriptors.FieldDescriptor var1) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            return this.extensions == null ? false : this.extensions.hasField(var1);
         } else {
            return super.hasField(var1);
         }
      }

      public GeneratedMessageV3.ExtendableBuilder setField(Descriptors.FieldDescriptor var1, Object var2) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            this.ensureExtensionsIsMutable();
            this.extensions.setField(var1, var2);
            this.onChanged();
            return this;
         } else {
            return (GeneratedMessageV3.ExtendableBuilder)super.setField(var1, var2);
         }
      }

      public GeneratedMessageV3.ExtendableBuilder clearField(Descriptors.FieldDescriptor var1) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            this.ensureExtensionsIsMutable();
            this.extensions.clearField(var1);
            this.onChanged();
            return this;
         } else {
            return (GeneratedMessageV3.ExtendableBuilder)super.clearField(var1);
         }
      }

      public GeneratedMessageV3.ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            this.ensureExtensionsIsMutable();
            this.extensions.setRepeatedField(var1, var2, var3);
            this.onChanged();
            return this;
         } else {
            return (GeneratedMessageV3.ExtendableBuilder)super.setRepeatedField(var1, var2, var3);
         }
      }

      public GeneratedMessageV3.ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            this.ensureExtensionsIsMutable();
            this.extensions.addRepeatedField(var1, var2);
            this.onChanged();
            return this;
         } else {
            return (GeneratedMessageV3.ExtendableBuilder)super.addRepeatedField(var1, var2);
         }
      }

      public Message.Builder newBuilderForField(Descriptors.FieldDescriptor var1) {
         return (Message.Builder)(var1.isExtension() ? DynamicMessage.newBuilder(var1.getMessageType()) : super.newBuilderForField(var1));
      }

      protected final void mergeExtensionFields(GeneratedMessageV3.ExtendableMessage var1) {
         if (var1.extensions != null) {
            this.ensureExtensionsIsMutable();
            this.extensions.mergeFrom(var1.extensions);
            this.onChanged();
         }

      }

      private void verifyContainingType(Descriptors.FieldDescriptor var1) {
         if (var1.getContainingType() != this.getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
         }
      }
   }

   public abstract static class ExtendableMessage extends GeneratedMessageV3 implements GeneratedMessageV3.ExtendableMessageOrBuilder {
      private static final long serialVersionUID = 1L;
      private final FieldSet extensions;

      protected ExtendableMessage() {
         this.extensions = FieldSet.newFieldSet();
      }

      protected ExtendableMessage(GeneratedMessageV3.ExtendableBuilder var1) {
         super(var1);
         this.extensions = var1.buildExtensions();
      }

      private void verifyExtensionContainingType(Extension var1) {
         if (var1.getDescriptor().getContainingType() != this.getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + var1.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + this.getDescriptorForType().getFullName() + "\".");
         }
      }

      public final boolean hasExtension(ExtensionLite var1) {
         Extension var2 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var2);
         return this.extensions.hasField(var2.getDescriptor());
      }

      public final int getExtensionCount(ExtensionLite var1) {
         Extension var2 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var2);
         Descriptors.FieldDescriptor var3 = var2.getDescriptor();
         return this.extensions.getRepeatedFieldCount(var3);
      }

      public final Object getExtension(ExtensionLite var1) {
         Extension var2 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var2);
         Descriptors.FieldDescriptor var3 = var2.getDescriptor();
         Object var4 = this.extensions.getField(var3);
         if (var4 == null) {
            if (var3.isRepeated()) {
               return Collections.emptyList();
            } else {
               return var3.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? var2.getMessageDefaultInstance() : var2.fromReflectionType(var3.getDefaultValue());
            }
         } else {
            return var2.fromReflectionType(var4);
         }
      }

      public final Object getExtension(ExtensionLite var1, int var2) {
         Extension var3 = GeneratedMessageV3.checkNotLite(var1);
         this.verifyExtensionContainingType(var3);
         Descriptors.FieldDescriptor var4 = var3.getDescriptor();
         return var3.singularFromReflectionType(this.extensions.getRepeatedField(var4, var2));
      }

      public final boolean hasExtension(Extension var1) {
         return this.hasExtension((ExtensionLite)var1);
      }

      public final boolean hasExtension(GeneratedMessage.GeneratedExtension var1) {
         return this.hasExtension((ExtensionLite)var1);
      }

      public final int getExtensionCount(Extension var1) {
         return this.getExtensionCount((ExtensionLite)var1);
      }

      public final int getExtensionCount(GeneratedMessage.GeneratedExtension var1) {
         return this.getExtensionCount((ExtensionLite)var1);
      }

      public final Object getExtension(Extension var1) {
         return this.getExtension((ExtensionLite)var1);
      }

      public final Object getExtension(GeneratedMessage.GeneratedExtension var1) {
         return this.getExtension((ExtensionLite)var1);
      }

      public final Object getExtension(Extension var1, int var2) {
         return this.getExtension((ExtensionLite)var1, var2);
      }

      public final Object getExtension(GeneratedMessage.GeneratedExtension var1, int var2) {
         return this.getExtension((ExtensionLite)var1, var2);
      }

      protected boolean extensionsAreInitialized() {
         return this.extensions.isInitialized();
      }

      public boolean isInitialized() {
         return super.isInitialized() && this.extensionsAreInitialized();
      }

      protected boolean parseUnknownField(CodedInputStream var1, UnknownFieldSet.Builder var2, ExtensionRegistryLite var3, int var4) throws IOException {
         return MessageReflection.mergeFieldFrom(var1, var1.shouldDiscardUnknownFields() ? null : var2, var3, this.getDescriptorForType(), new MessageReflection.ExtensionAdapter(this.extensions), var4);
      }

      protected boolean parseUnknownFieldProto3(CodedInputStream var1, UnknownFieldSet.Builder var2, ExtensionRegistryLite var3, int var4) throws IOException {
         return this.parseUnknownField(var1, var2, var3, var4);
      }

      protected void makeExtensionsImmutable() {
         this.extensions.makeImmutable();
      }

      protected GeneratedMessageV3.ExtendableMessage.ExtensionWriter newExtensionWriter() {
         return new GeneratedMessageV3.ExtendableMessage.ExtensionWriter(false);
      }

      protected GeneratedMessageV3.ExtendableMessage.ExtensionWriter newMessageSetExtensionWriter() {
         return new GeneratedMessageV3.ExtendableMessage.ExtensionWriter(true);
      }

      protected int extensionsSerializedSize() {
         return this.extensions.getSerializedSize();
      }

      protected int extensionsSerializedSizeAsMessageSet() {
         return this.extensions.getMessageSetSerializedSize();
      }

      protected Map getExtensionFields() {
         return this.extensions.getAllFields();
      }

      public Map getAllFields() {
         Map var1 = super.getAllFieldsMutable(false);
         var1.putAll(this.getExtensionFields());
         return Collections.unmodifiableMap(var1);
      }

      public Map getAllFieldsRaw() {
         Map var1 = super.getAllFieldsMutable(false);
         var1.putAll(this.getExtensionFields());
         return Collections.unmodifiableMap(var1);
      }

      public boolean hasField(Descriptors.FieldDescriptor var1) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            return this.extensions.hasField(var1);
         } else {
            return super.hasField(var1);
         }
      }

      public Object getField(Descriptors.FieldDescriptor var1) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            Object var2 = this.extensions.getField(var1);
            if (var2 == null) {
               if (var1.isRepeated()) {
                  return Collections.emptyList();
               } else {
                  return var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? DynamicMessage.getDefaultInstance(var1.getMessageType()) : var1.getDefaultValue();
               }
            } else {
               return var2;
            }
         } else {
            return super.getField(var1);
         }
      }

      public int getRepeatedFieldCount(Descriptors.FieldDescriptor var1) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            return this.extensions.getRepeatedFieldCount(var1);
         } else {
            return super.getRepeatedFieldCount(var1);
         }
      }

      public Object getRepeatedField(Descriptors.FieldDescriptor var1, int var2) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            return this.extensions.getRepeatedField(var1, var2);
         } else {
            return super.getRepeatedField(var1, var2);
         }
      }

      private void verifyContainingType(Descriptors.FieldDescriptor var1) {
         if (var1.getContainingType() != this.getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
         }
      }

      protected class ExtensionWriter {
         private final Iterator iter;
         private Entry next;
         private final boolean messageSetWireFormat;

         private ExtensionWriter(boolean var2) {
            this.iter = ExtendableMessage.this.extensions.iterator();
            if (this.iter.hasNext()) {
               this.next = (Entry)this.iter.next();
            }

            this.messageSetWireFormat = var2;
         }

         public void writeUntil(int var1, CodedOutputStream var2) throws IOException {
            while(this.next != null && ((Descriptors.FieldDescriptor)this.next.getKey()).getNumber() < var1) {
               Descriptors.FieldDescriptor var3 = (Descriptors.FieldDescriptor)this.next.getKey();
               if (this.messageSetWireFormat && var3.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !var3.isRepeated()) {
                  if (this.next instanceof LazyField.LazyEntry) {
                     var2.writeRawMessageSetExtension(var3.getNumber(), ((LazyField.LazyEntry)this.next).getField().toByteString());
                  } else {
                     var2.writeMessageSetExtension(var3.getNumber(), (Message)this.next.getValue());
                  }
               } else {
                  FieldSet.writeField(var3, this.next.getValue(), var2);
               }

               if (this.iter.hasNext()) {
                  this.next = (Entry)this.iter.next();
               } else {
                  this.next = null;
               }
            }

         }

         // $FF: synthetic method
         ExtensionWriter(boolean var2, Object var3) {
            this(var2);
         }
      }
   }

   public interface ExtendableMessageOrBuilder extends MessageOrBuilder {
      Message getDefaultInstanceForType();

      boolean hasExtension(ExtensionLite var1);

      int getExtensionCount(ExtensionLite var1);

      Object getExtension(ExtensionLite var1);

      Object getExtension(ExtensionLite var1, int var2);

      boolean hasExtension(Extension var1);

      boolean hasExtension(GeneratedMessage.GeneratedExtension var1);

      int getExtensionCount(Extension var1);

      int getExtensionCount(GeneratedMessage.GeneratedExtension var1);

      Object getExtension(Extension var1);

      Object getExtension(GeneratedMessage.GeneratedExtension var1);

      Object getExtension(Extension var1, int var2);

      Object getExtension(GeneratedMessage.GeneratedExtension var1, int var2);
   }

   public abstract static class Builder extends AbstractMessage.Builder {
      private GeneratedMessageV3.BuilderParent builderParent;
      private GeneratedMessageV3.Builder.BuilderParentImpl meAsParent;
      private boolean isClean;
      private UnknownFieldSet unknownFields;

      protected Builder() {
         this((GeneratedMessageV3.BuilderParent)null);
      }

      protected Builder(GeneratedMessageV3.BuilderParent var1) {
         this.unknownFields = UnknownFieldSet.getDefaultInstance();
         this.builderParent = var1;
      }

      void dispose() {
         this.builderParent = null;
      }

      protected void onBuilt() {
         if (this.builderParent != null) {
            this.markClean();
         }

      }

      protected void markClean() {
         this.isClean = true;
      }

      protected boolean isClean() {
         return this.isClean;
      }

      public GeneratedMessageV3.Builder clone() {
         GeneratedMessageV3.Builder var1 = (GeneratedMessageV3.Builder)this.getDefaultInstanceForType().newBuilderForType();
         var1.mergeFrom(this.buildPartial());
         return var1;
      }

      public GeneratedMessageV3.Builder clear() {
         this.unknownFields = UnknownFieldSet.getDefaultInstance();
         this.onChanged();
         return this;
      }

      protected abstract GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable();

      public Descriptors.Descriptor getDescriptorForType() {
         return this.internalGetFieldAccessorTable().descriptor;
      }

      public Map getAllFields() {
         return Collections.unmodifiableMap(this.getAllFieldsMutable());
      }

      private Map getAllFieldsMutable() {
         TreeMap var1 = new TreeMap();
         Descriptors.Descriptor var2 = this.internalGetFieldAccessorTable().descriptor;
         List var3 = var2.getFields();

         for(int var4 = 0; var4 < var3.size(); ++var4) {
            Descriptors.FieldDescriptor var5 = (Descriptors.FieldDescriptor)var3.get(var4);
            Descriptors.OneofDescriptor var6 = var5.getContainingOneof();
            if (var6 != null) {
               var4 += var6.getFieldCount() - 1;
               if (!this.hasOneof(var6)) {
                  continue;
               }

               var5 = this.getOneofFieldDescriptor(var6);
            } else {
               if (var5.isRepeated()) {
                  List var7 = (List)this.getField(var5);
                  if (!var7.isEmpty()) {
                     var1.put(var5, var7);
                  }
                  continue;
               }

               if (!this.hasField(var5)) {
                  continue;
               }
            }

            var1.put(var5, this.getField(var5));
         }

         return var1;
      }

      public Message.Builder newBuilderForField(Descriptors.FieldDescriptor var1) {
         return this.internalGetFieldAccessorTable().getField(var1).newBuilder();
      }

      public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor var1) {
         return this.internalGetFieldAccessorTable().getField(var1).getBuilder(this);
      }

      public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor var1, int var2) {
         return this.internalGetFieldAccessorTable().getField(var1).getRepeatedBuilder(this, var2);
      }

      public boolean hasOneof(Descriptors.OneofDescriptor var1) {
         return this.internalGetFieldAccessorTable().getOneof(var1).has(this);
      }

      public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor var1) {
         return this.internalGetFieldAccessorTable().getOneof(var1).get(this);
      }

      public boolean hasField(Descriptors.FieldDescriptor var1) {
         return this.internalGetFieldAccessorTable().getField(var1).has(this);
      }

      public Object getField(Descriptors.FieldDescriptor var1) {
         Object var2 = this.internalGetFieldAccessorTable().getField(var1).get(this);
         return var1.isRepeated() ? Collections.unmodifiableList((List)var2) : var2;
      }

      public GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         this.internalGetFieldAccessorTable().getField(var1).set(this, var2);
         return this;
      }

      public GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor var1) {
         this.internalGetFieldAccessorTable().getField(var1).clear(this);
         return this;
      }

      public GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         this.internalGetFieldAccessorTable().getOneof(var1).clear(this);
         return this;
      }

      public int getRepeatedFieldCount(Descriptors.FieldDescriptor var1) {
         return this.internalGetFieldAccessorTable().getField(var1).getRepeatedCount(this);
      }

      public Object getRepeatedField(Descriptors.FieldDescriptor var1, int var2) {
         return this.internalGetFieldAccessorTable().getField(var1).getRepeated(this, var2);
      }

      public GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         this.internalGetFieldAccessorTable().getField(var1).setRepeated(this, var2, var3);
         return this;
      }

      public GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         this.internalGetFieldAccessorTable().getField(var1).addRepeated(this, var2);
         return this;
      }

      private GeneratedMessageV3.Builder setUnknownFieldsInternal(UnknownFieldSet var1) {
         this.unknownFields = var1;
         this.onChanged();
         return this;
      }

      public GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet var1) {
         return this.setUnknownFieldsInternal(var1);
      }

      protected GeneratedMessageV3.Builder setUnknownFieldsProto3(UnknownFieldSet var1) {
         return this.setUnknownFieldsInternal(var1);
      }

      public GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return this.setUnknownFields(UnknownFieldSet.newBuilder(this.unknownFields).mergeFrom(var1).build());
      }

      public boolean isInitialized() {
         Iterator var1 = this.getDescriptorForType().getFields().iterator();

         while(true) {
            while(true) {
               Descriptors.FieldDescriptor var2;
               do {
                  if (!var1.hasNext()) {
                     return true;
                  }

                  var2 = (Descriptors.FieldDescriptor)var1.next();
                  if (var2.isRequired() && !this.hasField(var2)) {
                     return false;
                  }
               } while(var2.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE);

               if (var2.isRepeated()) {
                  List var3 = (List)this.getField(var2);
                  Iterator var4 = var3.iterator();

                  while(var4.hasNext()) {
                     Message var5 = (Message)var4.next();
                     if (!var5.isInitialized()) {
                        return false;
                     }
                  }
               } else if (this.hasField(var2) && !((Message)this.getField(var2)).isInitialized()) {
                  return false;
               }
            }
         }
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      protected GeneratedMessageV3.BuilderParent getParentForChildren() {
         if (this.meAsParent == null) {
            this.meAsParent = new GeneratedMessageV3.Builder.BuilderParentImpl();
         }

         return this.meAsParent;
      }

      protected final void onChanged() {
         if (this.isClean && this.builderParent != null) {
            this.builderParent.markDirty();
            this.isClean = false;
         }

      }

      protected MapField internalGetMapField(int var1) {
         throw new RuntimeException("No map fields found in " + this.getClass().getName());
      }

      protected MapField internalGetMutableMapField(int var1) {
         throw new RuntimeException("No map fields found in " + this.getClass().getName());
      }

      private class BuilderParentImpl implements GeneratedMessageV3.BuilderParent {
         private BuilderParentImpl() {
         }

         public void markDirty() {
            Builder.this.onChanged();
         }

         // $FF: synthetic method
         BuilderParentImpl(Object var2) {
            this();
         }
      }
   }

   public interface BuilderParent extends AbstractMessage.BuilderParent {
   }

   public static final class UnusedPrivateParameter {
      static final GeneratedMessageV3.UnusedPrivateParameter INSTANCE = new GeneratedMessageV3.UnusedPrivateParameter();

      private UnusedPrivateParameter() {
      }
   }
}
