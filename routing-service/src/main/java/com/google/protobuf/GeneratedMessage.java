package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public abstract class GeneratedMessage extends AbstractMessage implements Serializable {
   private static final long serialVersionUID = 1L;
   protected static boolean alwaysUseFieldBuilders = false;
   protected UnknownFieldSet unknownFields;

   protected GeneratedMessage() {
      this.unknownFields = UnknownFieldSet.getDefaultInstance();
   }

   protected GeneratedMessage(GeneratedMessage.Builder var1) {
      this.unknownFields = var1.getUnknownFields();
   }

   public Parser getParserForType() {
      throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
   }

   static void enableAlwaysUseFieldBuildersForTesting() {
      alwaysUseFieldBuilders = true;
   }

   protected abstract GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable();

   public Descriptors.Descriptor getDescriptorForType() {
      return this.internalGetFieldAccessorTable().descriptor;
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
      return var2.mergeFieldFrom(var4, var1);
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

   protected void makeExtensionsImmutable() {
   }

   protected abstract Message.Builder newBuilderForType(GeneratedMessage.BuilderParent var1);

   protected Message.Builder newBuilderForType(final AbstractMessage.BuilderParent var1) {
      return this.newBuilderForType(new GeneratedMessage.BuilderParent() {
         public void markDirty() {
            var1.markDirty();
         }
      });
   }

   public static GeneratedMessage.GeneratedExtension newMessageScopedGeneratedExtension(final Message var0, final int var1, Class var2, Message var3) {
      return new GeneratedMessage.GeneratedExtension(new GeneratedMessage.CachedDescriptorRetriever() {
         public Descriptors.FieldDescriptor loadDescriptor() {
            return (Descriptors.FieldDescriptor)var0.getDescriptorForType().getExtensions().get(var1);
         }
      }, var2, var3, Extension.ExtensionType.IMMUTABLE);
   }

   public static GeneratedMessage.GeneratedExtension newFileScopedGeneratedExtension(Class var0, Message var1) {
      return new GeneratedMessage.GeneratedExtension((GeneratedMessage.ExtensionDescriptorRetriever)null, var0, var1, Extension.ExtensionType.IMMUTABLE);
   }

   public static GeneratedMessage.GeneratedExtension newMessageScopedGeneratedExtension(final Message var0, final String var1, Class var2, Message var3) {
      return new GeneratedMessage.GeneratedExtension(new GeneratedMessage.CachedDescriptorRetriever() {
         protected Descriptors.FieldDescriptor loadDescriptor() {
            return var0.getDescriptorForType().findFieldByName(var1);
         }
      }, var2, var3, Extension.ExtensionType.MUTABLE);
   }

   public static GeneratedMessage.GeneratedExtension newFileScopedGeneratedExtension(final Class var0, Message var1, final String var2, final String var3) {
      return new GeneratedMessage.GeneratedExtension(new GeneratedMessage.CachedDescriptorRetriever() {
         protected Descriptors.FieldDescriptor loadDescriptor() {
            try {
               Class var1 = var0.getClassLoader().loadClass(var2);
               Descriptors.FileDescriptor var2x = (Descriptors.FileDescriptor)var1.getField("descriptor").get((Object)null);
               return var2x.findExtensionByName(var3);
            } catch (Exception var3x) {
               throw new RuntimeException("Cannot load descriptors: " + var2 + " is not a valid descriptor class name", var3x);
            }
         }
      }, var0, var1, Extension.ExtensionType.MUTABLE);
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

   public static final class FieldAccessorTable {
      private final Descriptors.Descriptor descriptor;
      private final GeneratedMessage.FieldAccessorTable.FieldAccessor[] fields;
      private String[] camelCaseNames;
      private final GeneratedMessage.FieldAccessorTable.OneofAccessor[] oneofs;
      private volatile boolean initialized;

      public FieldAccessorTable(Descriptors.Descriptor var1, String[] var2, Class var3, Class var4) {
         this(var1, var2);
         this.ensureFieldAccessorsInitialized(var3, var4);
      }

      public FieldAccessorTable(Descriptors.Descriptor var1, String[] var2) {
         this.descriptor = var1;
         this.camelCaseNames = var2;
         this.fields = new GeneratedMessage.FieldAccessorTable.FieldAccessor[var1.getFields().size()];
         this.oneofs = new GeneratedMessage.FieldAccessorTable.OneofAccessor[var1.getOneofs().size()];
         this.initialized = false;
      }

      private boolean isMapFieldEnabled(Descriptors.FieldDescriptor var1) {
         boolean var2 = true;
         return var2;
      }

      public GeneratedMessage.FieldAccessorTable ensureFieldAccessorsInitialized(Class var1, Class var2) {
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
                           if (var6.isMapField() && this.isMapFieldEnabled(var6)) {
                              this.fields[var5] = new GeneratedMessage.FieldAccessorTable.MapFieldAccessor(var6, this.camelCaseNames[var5], var1, var2);
                           } else {
                              this.fields[var5] = new GeneratedMessage.FieldAccessorTable.RepeatedMessageFieldAccessor(var6, this.camelCaseNames[var5], var1, var2);
                           }
                        } else if (var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                           this.fields[var5] = new GeneratedMessage.FieldAccessorTable.RepeatedEnumFieldAccessor(var6, this.camelCaseNames[var5], var1, var2);
                        } else {
                           this.fields[var5] = new GeneratedMessage.FieldAccessorTable.RepeatedFieldAccessor(var6, this.camelCaseNames[var5], var1, var2);
                        }
                     } else if (var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        this.fields[var5] = new GeneratedMessage.FieldAccessorTable.SingularMessageFieldAccessor(var6, this.camelCaseNames[var5], var1, var2, var7);
                     } else if (var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.ENUM) {
                        this.fields[var5] = new GeneratedMessage.FieldAccessorTable.SingularEnumFieldAccessor(var6, this.camelCaseNames[var5], var1, var2, var7);
                     } else if (var6.getJavaType() == Descriptors.FieldDescriptor.JavaType.STRING) {
                        this.fields[var5] = new GeneratedMessage.FieldAccessorTable.SingularStringFieldAccessor(var6, this.camelCaseNames[var5], var1, var2, var7);
                     } else {
                        this.fields[var5] = new GeneratedMessage.FieldAccessorTable.SingularFieldAccessor(var6, this.camelCaseNames[var5], var1, var2, var7);
                     }
                  }

                  var5 = this.oneofs.length;

                  for(int var10 = 0; var10 < var5; ++var10) {
                     this.oneofs[var10] = new GeneratedMessage.FieldAccessorTable.OneofAccessor(this.descriptor, this.camelCaseNames[var10 + var4], var1, var2);
                  }

                  this.initialized = true;
                  this.camelCaseNames = null;
                  return this;
               }
            }
         }
      }

      private GeneratedMessage.FieldAccessorTable.FieldAccessor getField(Descriptors.FieldDescriptor var1) {
         if (var1.getContainingType() != this.descriptor) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
         } else if (var1.isExtension()) {
            throw new IllegalArgumentException("This type does not have extensions.");
         } else {
            return this.fields[var1.getIndex()];
         }
      }

      private GeneratedMessage.FieldAccessorTable.OneofAccessor getOneof(Descriptors.OneofDescriptor var1) {
         if (var1.getContainingType() != this.descriptor) {
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
         } else {
            return this.oneofs[var1.getIndex()];
         }
      }

      private static boolean supportFieldPresence(Descriptors.FileDescriptor var0) {
         return var0.getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO2;
      }

      private static final class RepeatedMessageFieldAccessor extends GeneratedMessage.FieldAccessorTable.RepeatedFieldAccessor {
         private final Method newBuilderMethod;
         private final Method getBuilderMethodBuilder;

         RepeatedMessageFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4) {
            super(var1, var2, var3, var4);
            this.newBuilderMethod = GeneratedMessage.getMethodOrDie(this.type, "newBuilder");
            this.getBuilderMethodBuilder = GeneratedMessage.getMethodOrDie(var4, "get" + var2 + "Builder", Integer.TYPE);
         }

         private Object coerceType(Object var1) {
            return this.type.isInstance(var1) ? var1 : ((Message.Builder)GeneratedMessage.invokeOrDie(this.newBuilderMethod, (Object)null)).mergeFrom((Message)var1).build();
         }

         public void setRepeated(GeneratedMessage.Builder var1, int var2, Object var3) {
            super.setRepeated(var1, var2, this.coerceType(var3));
         }

         public void addRepeated(GeneratedMessage.Builder var1, Object var2) {
            super.addRepeated(var1, this.coerceType(var2));
         }

         public Message.Builder newBuilder() {
            return (Message.Builder)GeneratedMessage.invokeOrDie(this.newBuilderMethod, (Object)null);
         }

         public Message.Builder getRepeatedBuilder(GeneratedMessage.Builder var1, int var2) {
            return (Message.Builder)GeneratedMessage.invokeOrDie(this.getBuilderMethodBuilder, var1, var2);
         }
      }

      private static final class SingularMessageFieldAccessor extends GeneratedMessage.FieldAccessorTable.SingularFieldAccessor {
         private final Method newBuilderMethod;
         private final Method getBuilderMethodBuilder;

         SingularMessageFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4, String var5) {
            super(var1, var2, var3, var4, var5);
            this.newBuilderMethod = GeneratedMessage.getMethodOrDie(this.type, "newBuilder");
            this.getBuilderMethodBuilder = GeneratedMessage.getMethodOrDie(var4, "get" + var2 + "Builder");
         }

         private Object coerceType(Object var1) {
            return this.type.isInstance(var1) ? var1 : ((Message.Builder)GeneratedMessage.invokeOrDie(this.newBuilderMethod, (Object)null)).mergeFrom((Message)var1).buildPartial();
         }

         public void set(GeneratedMessage.Builder var1, Object var2) {
            super.set(var1, this.coerceType(var2));
         }

         public Message.Builder newBuilder() {
            return (Message.Builder)GeneratedMessage.invokeOrDie(this.newBuilderMethod, (Object)null);
         }

         public Message.Builder getBuilder(GeneratedMessage.Builder var1) {
            return (Message.Builder)GeneratedMessage.invokeOrDie(this.getBuilderMethodBuilder, var1);
         }
      }

      private static final class SingularStringFieldAccessor extends GeneratedMessage.FieldAccessorTable.SingularFieldAccessor {
         private final Method getBytesMethod;
         private final Method getBytesMethodBuilder;
         private final Method setBytesMethodBuilder;

         SingularStringFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4, String var5) {
            super(var1, var2, var3, var4, var5);
            this.getBytesMethod = GeneratedMessage.getMethodOrDie(var3, "get" + var2 + "Bytes");
            this.getBytesMethodBuilder = GeneratedMessage.getMethodOrDie(var4, "get" + var2 + "Bytes");
            this.setBytesMethodBuilder = GeneratedMessage.getMethodOrDie(var4, "set" + var2 + "Bytes", ByteString.class);
         }

         public Object getRaw(GeneratedMessage var1) {
            return GeneratedMessage.invokeOrDie(this.getBytesMethod, var1);
         }

         public Object getRaw(GeneratedMessage.Builder var1) {
            return GeneratedMessage.invokeOrDie(this.getBytesMethodBuilder, var1);
         }

         public void set(GeneratedMessage.Builder var1, Object var2) {
            if (var2 instanceof ByteString) {
               GeneratedMessage.invokeOrDie(this.setBytesMethodBuilder, var1, var2);
            } else {
               super.set(var1, var2);
            }

         }
      }

      private static final class RepeatedEnumFieldAccessor extends GeneratedMessage.FieldAccessorTable.RepeatedFieldAccessor {
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
            this.valueOfMethod = GeneratedMessage.getMethodOrDie(this.type, "valueOf", Descriptors.EnumValueDescriptor.class);
            this.getValueDescriptorMethod = GeneratedMessage.getMethodOrDie(this.type, "getValueDescriptor");
            this.supportUnknownEnumValue = var1.getFile().supportsUnknownEnumValue();
            if (this.supportUnknownEnumValue) {
               this.getRepeatedValueMethod = GeneratedMessage.getMethodOrDie(var3, "get" + var2 + "Value", Integer.TYPE);
               this.getRepeatedValueMethodBuilder = GeneratedMessage.getMethodOrDie(var4, "get" + var2 + "Value", Integer.TYPE);
               this.setRepeatedValueMethod = GeneratedMessage.getMethodOrDie(var4, "set" + var2 + "Value", Integer.TYPE, Integer.TYPE);
               this.addRepeatedValueMethod = GeneratedMessage.getMethodOrDie(var4, "add" + var2 + "Value", Integer.TYPE);
            }

         }

         public Object get(GeneratedMessage var1) {
            ArrayList var2 = new ArrayList();
            int var3 = this.getRepeatedCount(var1);

            for(int var4 = 0; var4 < var3; ++var4) {
               var2.add(this.getRepeated(var1, var4));
            }

            return Collections.unmodifiableList(var2);
         }

         public Object get(GeneratedMessage.Builder var1) {
            ArrayList var2 = new ArrayList();
            int var3 = this.getRepeatedCount(var1);

            for(int var4 = 0; var4 < var3; ++var4) {
               var2.add(this.getRepeated(var1, var4));
            }

            return Collections.unmodifiableList(var2);
         }

         public Object getRepeated(GeneratedMessage var1, int var2) {
            if (this.supportUnknownEnumValue) {
               int var3 = (Integer)GeneratedMessage.invokeOrDie(this.getRepeatedValueMethod, var1, var2);
               return this.enumDescriptor.findValueByNumberCreatingIfUnknown(var3);
            } else {
               return GeneratedMessage.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(var1, var2));
            }
         }

         public Object getRepeated(GeneratedMessage.Builder var1, int var2) {
            if (this.supportUnknownEnumValue) {
               int var3 = (Integer)GeneratedMessage.invokeOrDie(this.getRepeatedValueMethodBuilder, var1, var2);
               return this.enumDescriptor.findValueByNumberCreatingIfUnknown(var3);
            } else {
               return GeneratedMessage.invokeOrDie(this.getValueDescriptorMethod, super.getRepeated(var1, var2));
            }
         }

         public void setRepeated(GeneratedMessage.Builder var1, int var2, Object var3) {
            if (this.supportUnknownEnumValue) {
               GeneratedMessage.invokeOrDie(this.setRepeatedValueMethod, var1, var2, ((Descriptors.EnumValueDescriptor)var3).getNumber());
            } else {
               super.setRepeated(var1, var2, GeneratedMessage.invokeOrDie(this.valueOfMethod, (Object)null, var3));
            }
         }

         public void addRepeated(GeneratedMessage.Builder var1, Object var2) {
            if (this.supportUnknownEnumValue) {
               GeneratedMessage.invokeOrDie(this.addRepeatedValueMethod, var1, ((Descriptors.EnumValueDescriptor)var2).getNumber());
            } else {
               super.addRepeated(var1, GeneratedMessage.invokeOrDie(this.valueOfMethod, (Object)null, var2));
            }
         }
      }

      private static final class SingularEnumFieldAccessor extends GeneratedMessage.FieldAccessorTable.SingularFieldAccessor {
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
            this.valueOfMethod = GeneratedMessage.getMethodOrDie(this.type, "valueOf", Descriptors.EnumValueDescriptor.class);
            this.getValueDescriptorMethod = GeneratedMessage.getMethodOrDie(this.type, "getValueDescriptor");
            this.supportUnknownEnumValue = var1.getFile().supportsUnknownEnumValue();
            if (this.supportUnknownEnumValue) {
               this.getValueMethod = GeneratedMessage.getMethodOrDie(var3, "get" + var2 + "Value");
               this.getValueMethodBuilder = GeneratedMessage.getMethodOrDie(var4, "get" + var2 + "Value");
               this.setValueMethod = GeneratedMessage.getMethodOrDie(var4, "set" + var2 + "Value", Integer.TYPE);
            }

         }

         public Object get(GeneratedMessage var1) {
            if (this.supportUnknownEnumValue) {
               int var2 = (Integer)GeneratedMessage.invokeOrDie(this.getValueMethod, var1);
               return this.enumDescriptor.findValueByNumberCreatingIfUnknown(var2);
            } else {
               return GeneratedMessage.invokeOrDie(this.getValueDescriptorMethod, super.get(var1));
            }
         }

         public Object get(GeneratedMessage.Builder var1) {
            if (this.supportUnknownEnumValue) {
               int var2 = (Integer)GeneratedMessage.invokeOrDie(this.getValueMethodBuilder, var1);
               return this.enumDescriptor.findValueByNumberCreatingIfUnknown(var2);
            } else {
               return GeneratedMessage.invokeOrDie(this.getValueDescriptorMethod, super.get(var1));
            }
         }

         public void set(GeneratedMessage.Builder var1, Object var2) {
            if (this.supportUnknownEnumValue) {
               GeneratedMessage.invokeOrDie(this.setValueMethod, var1, ((Descriptors.EnumValueDescriptor)var2).getNumber());
            } else {
               super.set(var1, GeneratedMessage.invokeOrDie(this.valueOfMethod, (Object)null, var2));
            }
         }
      }

      private static class MapFieldAccessor implements GeneratedMessage.FieldAccessorTable.FieldAccessor {
         private final Descriptors.FieldDescriptor field;
         private final Message mapEntryMessageDefaultInstance;

         MapFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4) {
            this.field = var1;
            Method var5 = GeneratedMessage.getMethodOrDie(var3, "getDefaultInstance");
            MapField var6 = this.getMapField((GeneratedMessage)GeneratedMessage.invokeOrDie(var5, (Object)null));
            this.mapEntryMessageDefaultInstance = var6.getMapEntryMessageDefaultInstance();
         }

         private MapField getMapField(GeneratedMessage var1) {
            return var1.internalGetMapField(this.field.getNumber());
         }

         private MapField getMapField(GeneratedMessage.Builder var1) {
            return var1.internalGetMapField(this.field.getNumber());
         }

         private MapField getMutableMapField(GeneratedMessage.Builder var1) {
            return var1.internalGetMutableMapField(this.field.getNumber());
         }

         public Object get(GeneratedMessage var1) {
            ArrayList var2 = new ArrayList();

            for(int var3 = 0; var3 < this.getRepeatedCount(var1); ++var3) {
               var2.add(this.getRepeated(var1, var3));
            }

            return Collections.unmodifiableList(var2);
         }

         public Object get(GeneratedMessage.Builder var1) {
            ArrayList var2 = new ArrayList();

            for(int var3 = 0; var3 < this.getRepeatedCount(var1); ++var3) {
               var2.add(this.getRepeated(var1, var3));
            }

            return Collections.unmodifiableList(var2);
         }

         public Object getRaw(GeneratedMessage var1) {
            return this.get(var1);
         }

         public Object getRaw(GeneratedMessage.Builder var1) {
            return this.get(var1);
         }

         public void set(GeneratedMessage.Builder var1, Object var2) {
            this.clear(var1);
            Iterator var3 = ((List)var2).iterator();

            while(var3.hasNext()) {
               Object var4 = var3.next();
               this.addRepeated(var1, var4);
            }

         }

         public Object getRepeated(GeneratedMessage var1, int var2) {
            return this.getMapField(var1).getList().get(var2);
         }

         public Object getRepeated(GeneratedMessage.Builder var1, int var2) {
            return this.getMapField(var1).getList().get(var2);
         }

         public Object getRepeatedRaw(GeneratedMessage var1, int var2) {
            return this.getRepeated(var1, var2);
         }

         public Object getRepeatedRaw(GeneratedMessage.Builder var1, int var2) {
            return this.getRepeated(var1, var2);
         }

         public void setRepeated(GeneratedMessage.Builder var1, int var2, Object var3) {
            this.getMutableMapField(var1).getMutableList().set(var2, (Message)var3);
         }

         public void addRepeated(GeneratedMessage.Builder var1, Object var2) {
            this.getMutableMapField(var1).getMutableList().add((Message)var2);
         }

         public boolean has(GeneratedMessage var1) {
            throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
         }

         public boolean has(GeneratedMessage.Builder var1) {
            throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
         }

         public int getRepeatedCount(GeneratedMessage var1) {
            return this.getMapField(var1).getList().size();
         }

         public int getRepeatedCount(GeneratedMessage.Builder var1) {
            return this.getMapField(var1).getList().size();
         }

         public void clear(GeneratedMessage.Builder var1) {
            this.getMutableMapField(var1).getMutableList().clear();
         }

         public Message.Builder newBuilder() {
            return this.mapEntryMessageDefaultInstance.newBuilderForType();
         }

         public Message.Builder getBuilder(GeneratedMessage.Builder var1) {
            throw new UnsupportedOperationException("Nested builder not supported for map fields.");
         }

         public Message.Builder getRepeatedBuilder(GeneratedMessage.Builder var1, int var2) {
            throw new UnsupportedOperationException("Nested builder not supported for map fields.");
         }
      }

      private static class RepeatedFieldAccessor implements GeneratedMessage.FieldAccessorTable.FieldAccessor {
         protected final Class type;
         protected final Method getMethod;
         protected final Method getMethodBuilder;
         protected final Method getRepeatedMethod;
         protected final Method getRepeatedMethodBuilder;
         protected final Method setRepeatedMethod;
         protected final Method addRepeatedMethod;
         protected final Method getCountMethod;
         protected final Method getCountMethodBuilder;
         protected final Method clearMethod;

         RepeatedFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4) {
            this.getMethod = GeneratedMessage.getMethodOrDie(var3, "get" + var2 + "List");
            this.getMethodBuilder = GeneratedMessage.getMethodOrDie(var4, "get" + var2 + "List");
            this.getRepeatedMethod = GeneratedMessage.getMethodOrDie(var3, "get" + var2, Integer.TYPE);
            this.getRepeatedMethodBuilder = GeneratedMessage.getMethodOrDie(var4, "get" + var2, Integer.TYPE);
            this.type = this.getRepeatedMethod.getReturnType();
            this.setRepeatedMethod = GeneratedMessage.getMethodOrDie(var4, "set" + var2, Integer.TYPE, this.type);
            this.addRepeatedMethod = GeneratedMessage.getMethodOrDie(var4, "add" + var2, this.type);
            this.getCountMethod = GeneratedMessage.getMethodOrDie(var3, "get" + var2 + "Count");
            this.getCountMethodBuilder = GeneratedMessage.getMethodOrDie(var4, "get" + var2 + "Count");
            this.clearMethod = GeneratedMessage.getMethodOrDie(var4, "clear" + var2);
         }

         public Object get(GeneratedMessage var1) {
            return GeneratedMessage.invokeOrDie(this.getMethod, var1);
         }

         public Object get(GeneratedMessage.Builder var1) {
            return GeneratedMessage.invokeOrDie(this.getMethodBuilder, var1);
         }

         public Object getRaw(GeneratedMessage var1) {
            return this.get(var1);
         }

         public Object getRaw(GeneratedMessage.Builder var1) {
            return this.get(var1);
         }

         public void set(GeneratedMessage.Builder var1, Object var2) {
            this.clear(var1);
            Iterator var3 = ((List)var2).iterator();

            while(var3.hasNext()) {
               Object var4 = var3.next();
               this.addRepeated(var1, var4);
            }

         }

         public Object getRepeated(GeneratedMessage var1, int var2) {
            return GeneratedMessage.invokeOrDie(this.getRepeatedMethod, var1, var2);
         }

         public Object getRepeated(GeneratedMessage.Builder var1, int var2) {
            return GeneratedMessage.invokeOrDie(this.getRepeatedMethodBuilder, var1, var2);
         }

         public Object getRepeatedRaw(GeneratedMessage var1, int var2) {
            return this.getRepeated(var1, var2);
         }

         public Object getRepeatedRaw(GeneratedMessage.Builder var1, int var2) {
            return this.getRepeated(var1, var2);
         }

         public void setRepeated(GeneratedMessage.Builder var1, int var2, Object var3) {
            GeneratedMessage.invokeOrDie(this.setRepeatedMethod, var1, var2, var3);
         }

         public void addRepeated(GeneratedMessage.Builder var1, Object var2) {
            GeneratedMessage.invokeOrDie(this.addRepeatedMethod, var1, var2);
         }

         public boolean has(GeneratedMessage var1) {
            throw new UnsupportedOperationException("hasField() called on a repeated field.");
         }

         public boolean has(GeneratedMessage.Builder var1) {
            throw new UnsupportedOperationException("hasField() called on a repeated field.");
         }

         public int getRepeatedCount(GeneratedMessage var1) {
            return (Integer)GeneratedMessage.invokeOrDie(this.getCountMethod, var1);
         }

         public int getRepeatedCount(GeneratedMessage.Builder var1) {
            return (Integer)GeneratedMessage.invokeOrDie(this.getCountMethodBuilder, var1);
         }

         public void clear(GeneratedMessage.Builder var1) {
            GeneratedMessage.invokeOrDie(this.clearMethod, var1);
         }

         public Message.Builder newBuilder() {
            throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
         }

         public Message.Builder getBuilder(GeneratedMessage.Builder var1) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
         }

         public Message.Builder getRepeatedBuilder(GeneratedMessage.Builder var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
         }
      }

      private static class SingularFieldAccessor implements GeneratedMessage.FieldAccessorTable.FieldAccessor {
         protected final Class type;
         protected final Method getMethod;
         protected final Method getMethodBuilder;
         protected final Method setMethod;
         protected final Method hasMethod;
         protected final Method hasMethodBuilder;
         protected final Method clearMethod;
         protected final Method caseMethod;
         protected final Method caseMethodBuilder;
         protected final Descriptors.FieldDescriptor field;
         protected final boolean isOneofField;
         protected final boolean hasHasMethod;

         SingularFieldAccessor(Descriptors.FieldDescriptor var1, String var2, Class var3, Class var4, String var5) {
            this.field = var1;
            this.isOneofField = var1.getContainingOneof() != null;
            this.hasHasMethod = GeneratedMessage.FieldAccessorTable.supportFieldPresence(var1.getFile()) || !this.isOneofField && var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE;
            this.getMethod = GeneratedMessage.getMethodOrDie(var3, "get" + var2);
            this.getMethodBuilder = GeneratedMessage.getMethodOrDie(var4, "get" + var2);
            this.type = this.getMethod.getReturnType();
            this.setMethod = GeneratedMessage.getMethodOrDie(var4, "set" + var2, this.type);
            this.hasMethod = this.hasHasMethod ? GeneratedMessage.getMethodOrDie(var3, "has" + var2) : null;
            this.hasMethodBuilder = this.hasHasMethod ? GeneratedMessage.getMethodOrDie(var4, "has" + var2) : null;
            this.clearMethod = GeneratedMessage.getMethodOrDie(var4, "clear" + var2);
            this.caseMethod = this.isOneofField ? GeneratedMessage.getMethodOrDie(var3, "get" + var5 + "Case") : null;
            this.caseMethodBuilder = this.isOneofField ? GeneratedMessage.getMethodOrDie(var4, "get" + var5 + "Case") : null;
         }

         private int getOneofFieldNumber(GeneratedMessage var1) {
            return ((Internal.EnumLite)GeneratedMessage.invokeOrDie(this.caseMethod, var1)).getNumber();
         }

         private int getOneofFieldNumber(GeneratedMessage.Builder var1) {
            return ((Internal.EnumLite)GeneratedMessage.invokeOrDie(this.caseMethodBuilder, var1)).getNumber();
         }

         public Object get(GeneratedMessage var1) {
            return GeneratedMessage.invokeOrDie(this.getMethod, var1);
         }

         public Object get(GeneratedMessage.Builder var1) {
            return GeneratedMessage.invokeOrDie(this.getMethodBuilder, var1);
         }

         public Object getRaw(GeneratedMessage var1) {
            return this.get(var1);
         }

         public Object getRaw(GeneratedMessage.Builder var1) {
            return this.get(var1);
         }

         public void set(GeneratedMessage.Builder var1, Object var2) {
            GeneratedMessage.invokeOrDie(this.setMethod, var1, var2);
         }

         public Object getRepeated(GeneratedMessage var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
         }

         public Object getRepeatedRaw(GeneratedMessage var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedFieldRaw() called on a singular field.");
         }

         public Object getRepeated(GeneratedMessage.Builder var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
         }

         public Object getRepeatedRaw(GeneratedMessage.Builder var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedFieldRaw() called on a singular field.");
         }

         public void setRepeated(GeneratedMessage.Builder var1, int var2, Object var3) {
            throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
         }

         public void addRepeated(GeneratedMessage.Builder var1, Object var2) {
            throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
         }

         public boolean has(GeneratedMessage var1) {
            if (!this.hasHasMethod) {
               if (this.isOneofField) {
                  return this.getOneofFieldNumber(var1) == this.field.getNumber();
               } else {
                  return !this.get(var1).equals(this.field.getDefaultValue());
               }
            } else {
               return (Boolean)GeneratedMessage.invokeOrDie(this.hasMethod, var1);
            }
         }

         public boolean has(GeneratedMessage.Builder var1) {
            if (!this.hasHasMethod) {
               if (this.isOneofField) {
                  return this.getOneofFieldNumber(var1) == this.field.getNumber();
               } else {
                  return !this.get(var1).equals(this.field.getDefaultValue());
               }
            } else {
               return (Boolean)GeneratedMessage.invokeOrDie(this.hasMethodBuilder, var1);
            }
         }

         public int getRepeatedCount(GeneratedMessage var1) {
            throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
         }

         public int getRepeatedCount(GeneratedMessage.Builder var1) {
            throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
         }

         public void clear(GeneratedMessage.Builder var1) {
            GeneratedMessage.invokeOrDie(this.clearMethod, var1);
         }

         public Message.Builder newBuilder() {
            throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
         }

         public Message.Builder getBuilder(GeneratedMessage.Builder var1) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
         }

         public Message.Builder getRepeatedBuilder(GeneratedMessage.Builder var1, int var2) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
         }
      }

      private static class OneofAccessor {
         private final Descriptors.Descriptor descriptor;
         private final Method caseMethod;
         private final Method caseMethodBuilder;
         private final Method clearMethod;

         OneofAccessor(Descriptors.Descriptor var1, String var2, Class var3, Class var4) {
            this.descriptor = var1;
            this.caseMethod = GeneratedMessage.getMethodOrDie(var3, "get" + var2 + "Case");
            this.caseMethodBuilder = GeneratedMessage.getMethodOrDie(var4, "get" + var2 + "Case");
            this.clearMethod = GeneratedMessage.getMethodOrDie(var4, "clear" + var2);
         }

         public boolean has(GeneratedMessage var1) {
            return ((Internal.EnumLite)GeneratedMessage.invokeOrDie(this.caseMethod, var1)).getNumber() != 0;
         }

         public boolean has(GeneratedMessage.Builder var1) {
            return ((Internal.EnumLite)GeneratedMessage.invokeOrDie(this.caseMethodBuilder, var1)).getNumber() != 0;
         }

         public Descriptors.FieldDescriptor get(GeneratedMessage var1) {
            int var2 = ((Internal.EnumLite)GeneratedMessage.invokeOrDie(this.caseMethod, var1)).getNumber();
            return var2 > 0 ? this.descriptor.findFieldByNumber(var2) : null;
         }

         public Descriptors.FieldDescriptor get(GeneratedMessage.Builder var1) {
            int var2 = ((Internal.EnumLite)GeneratedMessage.invokeOrDie(this.caseMethodBuilder, var1)).getNumber();
            return var2 > 0 ? this.descriptor.findFieldByNumber(var2) : null;
         }

         public void clear(GeneratedMessage.Builder var1) {
            GeneratedMessage.invokeOrDie(this.clearMethod, var1);
         }
      }

      private interface FieldAccessor {
         Object get(GeneratedMessage var1);

         Object get(GeneratedMessage.Builder var1);

         Object getRaw(GeneratedMessage var1);

         Object getRaw(GeneratedMessage.Builder var1);

         void set(GeneratedMessage.Builder var1, Object var2);

         Object getRepeated(GeneratedMessage var1, int var2);

         Object getRepeated(GeneratedMessage.Builder var1, int var2);

         Object getRepeatedRaw(GeneratedMessage var1, int var2);

         Object getRepeatedRaw(GeneratedMessage.Builder var1, int var2);

         void setRepeated(GeneratedMessage.Builder var1, int var2, Object var3);

         void addRepeated(GeneratedMessage.Builder var1, Object var2);

         boolean has(GeneratedMessage var1);

         boolean has(GeneratedMessage.Builder var1);

         int getRepeatedCount(GeneratedMessage var1);

         int getRepeatedCount(GeneratedMessage.Builder var1);

         void clear(GeneratedMessage.Builder var1);

         Message.Builder newBuilder();

         Message.Builder getBuilder(GeneratedMessage.Builder var1);

         Message.Builder getRepeatedBuilder(GeneratedMessage.Builder var1, int var2);
      }
   }

   public static class GeneratedExtension extends Extension {
      private GeneratedMessage.ExtensionDescriptorRetriever descriptorRetriever;
      private final Class singularType;
      private final Message messageDefaultInstance;
      private final Method enumValueOf;
      private final Method enumGetValueDescriptor;
      private final Extension.ExtensionType extensionType;

      GeneratedExtension(GeneratedMessage.ExtensionDescriptorRetriever var1, Class var2, Message var3, Extension.ExtensionType var4) {
         if (Message.class.isAssignableFrom(var2) && !var2.isInstance(var3)) {
            throw new IllegalArgumentException("Bad messageDefaultInstance for " + var2.getName());
         } else {
            this.descriptorRetriever = var1;
            this.singularType = var2;
            this.messageDefaultInstance = var3;
            if (ProtocolMessageEnum.class.isAssignableFrom(var2)) {
               this.enumValueOf = GeneratedMessage.getMethodOrDie(var2, "valueOf", Descriptors.EnumValueDescriptor.class);
               this.enumGetValueDescriptor = GeneratedMessage.getMethodOrDie(var2, "getValueDescriptor");
            } else {
               this.enumValueOf = null;
               this.enumGetValueDescriptor = null;
            }

            this.extensionType = var4;
         }
      }

      public void internalInit(final Descriptors.FieldDescriptor var1) {
         if (this.descriptorRetriever != null) {
            throw new IllegalStateException("Already initialized.");
         } else {
            this.descriptorRetriever = new GeneratedMessage.ExtensionDescriptorRetriever() {
               public Descriptors.FieldDescriptor getDescriptor() {
                  return var1;
               }
            };
         }
      }

      public Descriptors.FieldDescriptor getDescriptor() {
         if (this.descriptorRetriever == null) {
            throw new IllegalStateException("getDescriptor() called before internalInit()");
         } else {
            return this.descriptorRetriever.getDescriptor();
         }
      }

      public Message getMessageDefaultInstance() {
         return this.messageDefaultInstance;
      }

      protected Extension.ExtensionType getExtensionType() {
         return this.extensionType;
      }

      protected Object fromReflectionType(Object var1) {
         Descriptors.FieldDescriptor var2 = this.getDescriptor();
         if (!var2.isRepeated()) {
            return this.singularFromReflectionType(var1);
         } else if (var2.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE && var2.getJavaType() != Descriptors.FieldDescriptor.JavaType.ENUM) {
            return var1;
         } else {
            ArrayList var3 = new ArrayList();
            Iterator var4 = ((List)var1).iterator();

            while(var4.hasNext()) {
               Object var5 = var4.next();
               var3.add(this.singularFromReflectionType(var5));
            }

            return var3;
         }
      }

      protected Object singularFromReflectionType(Object var1) {
         Descriptors.FieldDescriptor var2 = this.getDescriptor();
         switch(var2.getJavaType()) {
         case MESSAGE:
            if (this.singularType.isInstance(var1)) {
               return var1;
            }

            return this.messageDefaultInstance.newBuilderForType().mergeFrom((Message)var1).build();
         case ENUM:
            return GeneratedMessage.invokeOrDie(this.enumValueOf, (Object)null, (Descriptors.EnumValueDescriptor)var1);
         default:
            return var1;
         }
      }

      protected Object toReflectionType(Object var1) {
         Descriptors.FieldDescriptor var2 = this.getDescriptor();
         if (!var2.isRepeated()) {
            return this.singularToReflectionType(var1);
         } else if (var2.getJavaType() != Descriptors.FieldDescriptor.JavaType.ENUM) {
            return var1;
         } else {
            ArrayList var3 = new ArrayList();
            Iterator var4 = ((List)var1).iterator();

            while(var4.hasNext()) {
               Object var5 = var4.next();
               var3.add(this.singularToReflectionType(var5));
            }

            return var3;
         }
      }

      protected Object singularToReflectionType(Object var1) {
         Descriptors.FieldDescriptor var2 = this.getDescriptor();
         switch(var2.getJavaType()) {
         case ENUM:
            return GeneratedMessage.invokeOrDie(this.enumGetValueDescriptor, var1);
         default:
            return var1;
         }
      }

      public int getNumber() {
         return this.getDescriptor().getNumber();
      }

      public WireFormat.FieldType getLiteType() {
         return this.getDescriptor().getLiteType();
      }

      public boolean isRepeated() {
         return this.getDescriptor().isRepeated();
      }

      public Object getDefaultValue() {
         if (this.isRepeated()) {
            return Collections.emptyList();
         } else {
            return this.getDescriptor().getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? this.messageDefaultInstance : this.singularFromReflectionType(this.getDescriptor().getDefaultValue());
         }
      }
   }

   private abstract static class CachedDescriptorRetriever implements GeneratedMessage.ExtensionDescriptorRetriever {
      private volatile Descriptors.FieldDescriptor descriptor;

      private CachedDescriptorRetriever() {
      }

      protected abstract Descriptors.FieldDescriptor loadDescriptor();

      public Descriptors.FieldDescriptor getDescriptor() {
         if (this.descriptor == null) {
            synchronized(this) {
               if (this.descriptor == null) {
                  this.descriptor = this.loadDescriptor();
               }
            }
         }

         return this.descriptor;
      }

      // $FF: synthetic method
      CachedDescriptorRetriever(Object var1) {
         this();
      }
   }

   interface ExtensionDescriptorRetriever {
      Descriptors.FieldDescriptor getDescriptor();
   }

   public abstract static class ExtendableBuilder extends GeneratedMessage.Builder implements GeneratedMessage.ExtendableMessageOrBuilder {
      private FieldSet extensions = FieldSet.emptySet();

      protected ExtendableBuilder() {
      }

      protected ExtendableBuilder(GeneratedMessage.BuilderParent var1) {
         super(var1);
      }

      void internalSetExtensionSet(FieldSet var1) {
         this.extensions = var1;
      }

      public GeneratedMessage.ExtendableBuilder clear() {
         this.extensions = FieldSet.emptySet();
         return (GeneratedMessage.ExtendableBuilder)super.clear();
      }

      public GeneratedMessage.ExtendableBuilder clone() {
         return (GeneratedMessage.ExtendableBuilder)super.clone();
      }

      private void ensureExtensionsIsMutable() {
         if (this.extensions.isImmutable()) {
            this.extensions = this.extensions.clone();
         }

      }

      private void verifyExtensionContainingType(Extension var1) {
         if (var1.getDescriptor().getContainingType() != this.getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + var1.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + this.getDescriptorForType().getFullName() + "\".");
         }
      }

      public final boolean hasExtension(ExtensionLite var1) {
         Extension var2 = GeneratedMessage.checkNotLite(var1);
         this.verifyExtensionContainingType(var2);
         return this.extensions.hasField(var2.getDescriptor());
      }

      public final int getExtensionCount(ExtensionLite var1) {
         Extension var2 = GeneratedMessage.checkNotLite(var1);
         this.verifyExtensionContainingType(var2);
         Descriptors.FieldDescriptor var3 = var2.getDescriptor();
         return this.extensions.getRepeatedFieldCount(var3);
      }

      public final Object getExtension(ExtensionLite var1) {
         Extension var2 = GeneratedMessage.checkNotLite(var1);
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
         Extension var3 = GeneratedMessage.checkNotLite(var1);
         this.verifyExtensionContainingType(var3);
         Descriptors.FieldDescriptor var4 = var3.getDescriptor();
         return var3.singularFromReflectionType(this.extensions.getRepeatedField(var4, var2));
      }

      public final GeneratedMessage.ExtendableBuilder setExtension(ExtensionLite var1, Object var2) {
         Extension var3 = GeneratedMessage.checkNotLite(var1);
         this.verifyExtensionContainingType(var3);
         this.ensureExtensionsIsMutable();
         Descriptors.FieldDescriptor var4 = var3.getDescriptor();
         this.extensions.setField(var4, var3.toReflectionType(var2));
         this.onChanged();
         return this;
      }

      public final GeneratedMessage.ExtendableBuilder setExtension(ExtensionLite var1, int var2, Object var3) {
         Extension var4 = GeneratedMessage.checkNotLite(var1);
         this.verifyExtensionContainingType(var4);
         this.ensureExtensionsIsMutable();
         Descriptors.FieldDescriptor var5 = var4.getDescriptor();
         this.extensions.setRepeatedField(var5, var2, var4.singularToReflectionType(var3));
         this.onChanged();
         return this;
      }

      public final GeneratedMessage.ExtendableBuilder addExtension(ExtensionLite var1, Object var2) {
         Extension var3 = GeneratedMessage.checkNotLite(var1);
         this.verifyExtensionContainingType(var3);
         this.ensureExtensionsIsMutable();
         Descriptors.FieldDescriptor var4 = var3.getDescriptor();
         this.extensions.addRepeatedField(var4, var3.singularToReflectionType(var2));
         this.onChanged();
         return this;
      }

      public final GeneratedMessage.ExtendableBuilder clearExtension(ExtensionLite var1) {
         Extension var2 = GeneratedMessage.checkNotLite(var1);
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

      public final GeneratedMessage.ExtendableBuilder setExtension(Extension var1, Object var2) {
         return this.setExtension((ExtensionLite)var1, var2);
      }

      public GeneratedMessage.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension var1, Object var2) {
         return this.setExtension((ExtensionLite)var1, var2);
      }

      public final GeneratedMessage.ExtendableBuilder setExtension(Extension var1, int var2, Object var3) {
         return this.setExtension((ExtensionLite)var1, var2, var3);
      }

      public GeneratedMessage.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension var1, int var2, Object var3) {
         return this.setExtension((ExtensionLite)var1, var2, var3);
      }

      public final GeneratedMessage.ExtendableBuilder addExtension(Extension var1, Object var2) {
         return this.addExtension((ExtensionLite)var1, var2);
      }

      public GeneratedMessage.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension var1, Object var2) {
         return this.addExtension((ExtensionLite)var1, var2);
      }

      public final GeneratedMessage.ExtendableBuilder clearExtension(Extension var1) {
         return this.clearExtension((ExtensionLite)var1);
      }

      public GeneratedMessage.ExtendableBuilder clearExtension(GeneratedMessage.GeneratedExtension var1) {
         return this.clearExtension((ExtensionLite)var1);
      }

      protected boolean extensionsAreInitialized() {
         return this.extensions.isInitialized();
      }

      private FieldSet buildExtensions() {
         this.extensions.makeImmutable();
         return this.extensions;
      }

      public boolean isInitialized() {
         return super.isInitialized() && this.extensionsAreInitialized();
      }

      protected boolean parseUnknownField(CodedInputStream var1, UnknownFieldSet.Builder var2, ExtensionRegistryLite var3, int var4) throws IOException {
         return MessageReflection.mergeFieldFrom(var1, var2, var3, this.getDescriptorForType(), new MessageReflection.BuilderAdapter(this), var4);
      }

      public Map getAllFields() {
         Map var1 = super.getAllFieldsMutable();
         var1.putAll(this.extensions.getAllFields());
         return Collections.unmodifiableMap(var1);
      }

      public Object getField(Descriptors.FieldDescriptor var1) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            Object var2 = this.extensions.getField(var1);
            if (var2 == null) {
               return var1.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? DynamicMessage.getDefaultInstance(var1.getMessageType()) : var1.getDefaultValue();
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

      public boolean hasField(Descriptors.FieldDescriptor var1) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            return this.extensions.hasField(var1);
         } else {
            return super.hasField(var1);
         }
      }

      public GeneratedMessage.ExtendableBuilder setField(Descriptors.FieldDescriptor var1, Object var2) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            this.ensureExtensionsIsMutable();
            this.extensions.setField(var1, var2);
            this.onChanged();
            return this;
         } else {
            return (GeneratedMessage.ExtendableBuilder)super.setField(var1, var2);
         }
      }

      public GeneratedMessage.ExtendableBuilder clearField(Descriptors.FieldDescriptor var1) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            this.ensureExtensionsIsMutable();
            this.extensions.clearField(var1);
            this.onChanged();
            return this;
         } else {
            return (GeneratedMessage.ExtendableBuilder)super.clearField(var1);
         }
      }

      public GeneratedMessage.ExtendableBuilder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            this.ensureExtensionsIsMutable();
            this.extensions.setRepeatedField(var1, var2, var3);
            this.onChanged();
            return this;
         } else {
            return (GeneratedMessage.ExtendableBuilder)super.setRepeatedField(var1, var2, var3);
         }
      }

      public GeneratedMessage.ExtendableBuilder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         if (var1.isExtension()) {
            this.verifyContainingType(var1);
            this.ensureExtensionsIsMutable();
            this.extensions.addRepeatedField(var1, var2);
            this.onChanged();
            return this;
         } else {
            return (GeneratedMessage.ExtendableBuilder)super.addRepeatedField(var1, var2);
         }
      }

      protected final void mergeExtensionFields(GeneratedMessage.ExtendableMessage var1) {
         this.ensureExtensionsIsMutable();
         this.extensions.mergeFrom(var1.extensions);
         this.onChanged();
      }

      private void verifyContainingType(Descriptors.FieldDescriptor var1) {
         if (var1.getContainingType() != this.getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
         }
      }
   }

   public abstract static class ExtendableMessage extends GeneratedMessage implements GeneratedMessage.ExtendableMessageOrBuilder {
      private static final long serialVersionUID = 1L;
      private final FieldSet extensions;

      protected ExtendableMessage() {
         this.extensions = FieldSet.newFieldSet();
      }

      protected ExtendableMessage(GeneratedMessage.ExtendableBuilder var1) {
         super(var1);
         this.extensions = var1.buildExtensions();
      }

      private void verifyExtensionContainingType(Extension var1) {
         if (var1.getDescriptor().getContainingType() != this.getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + var1.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + this.getDescriptorForType().getFullName() + "\".");
         }
      }

      public final boolean hasExtension(ExtensionLite var1) {
         Extension var2 = GeneratedMessage.checkNotLite(var1);
         this.verifyExtensionContainingType(var2);
         return this.extensions.hasField(var2.getDescriptor());
      }

      public final int getExtensionCount(ExtensionLite var1) {
         Extension var2 = GeneratedMessage.checkNotLite(var1);
         this.verifyExtensionContainingType(var2);
         Descriptors.FieldDescriptor var3 = var2.getDescriptor();
         return this.extensions.getRepeatedFieldCount(var3);
      }

      public final Object getExtension(ExtensionLite var1) {
         Extension var2 = GeneratedMessage.checkNotLite(var1);
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
         Extension var3 = GeneratedMessage.checkNotLite(var1);
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
         return MessageReflection.mergeFieldFrom(var1, var2, var3, this.getDescriptorForType(), new MessageReflection.ExtensionAdapter(this.extensions), var4);
      }

      protected void makeExtensionsImmutable() {
         this.extensions.makeImmutable();
      }

      protected GeneratedMessage.ExtendableMessage.ExtensionWriter newExtensionWriter() {
         return new GeneratedMessage.ExtendableMessage.ExtensionWriter(false);
      }

      protected GeneratedMessage.ExtendableMessage.ExtensionWriter newMessageSetExtensionWriter() {
         return new GeneratedMessage.ExtendableMessage.ExtensionWriter(true);
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
      private GeneratedMessage.BuilderParent builderParent;
      private GeneratedMessage.Builder.BuilderParentImpl meAsParent;
      private boolean isClean;
      private UnknownFieldSet unknownFields;

      protected Builder() {
         this((GeneratedMessage.BuilderParent)null);
      }

      protected Builder(GeneratedMessage.BuilderParent var1) {
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

      public GeneratedMessage.Builder clone() {
         GeneratedMessage.Builder var1 = (GeneratedMessage.Builder)this.getDefaultInstanceForType().newBuilderForType();
         var1.mergeFrom(this.buildPartial());
         return var1;
      }

      public GeneratedMessage.Builder clear() {
         this.unknownFields = UnknownFieldSet.getDefaultInstance();
         this.onChanged();
         return this;
      }

      protected abstract GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable();

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

      public GeneratedMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         this.internalGetFieldAccessorTable().getField(var1).set(this, var2);
         return this;
      }

      public GeneratedMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         this.internalGetFieldAccessorTable().getField(var1).clear(this);
         return this;
      }

      public GeneratedMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         this.internalGetFieldAccessorTable().getOneof(var1).clear(this);
         return this;
      }

      public int getRepeatedFieldCount(Descriptors.FieldDescriptor var1) {
         return this.internalGetFieldAccessorTable().getField(var1).getRepeatedCount(this);
      }

      public Object getRepeatedField(Descriptors.FieldDescriptor var1, int var2) {
         return this.internalGetFieldAccessorTable().getField(var1).getRepeated(this, var2);
      }

      public GeneratedMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         this.internalGetFieldAccessorTable().getField(var1).setRepeated(this, var2, var3);
         return this;
      }

      public GeneratedMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         this.internalGetFieldAccessorTable().getField(var1).addRepeated(this, var2);
         return this;
      }

      public GeneratedMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         this.unknownFields = var1;
         this.onChanged();
         return this;
      }

      public GeneratedMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         this.unknownFields = UnknownFieldSet.newBuilder(this.unknownFields).mergeFrom(var1).build();
         this.onChanged();
         return this;
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

      protected boolean parseUnknownField(CodedInputStream var1, UnknownFieldSet.Builder var2, ExtensionRegistryLite var3, int var4) throws IOException {
         return var2.mergeFieldFrom(var4, var1);
      }

      protected GeneratedMessage.BuilderParent getParentForChildren() {
         if (this.meAsParent == null) {
            this.meAsParent = new GeneratedMessage.Builder.BuilderParentImpl();
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

      private class BuilderParentImpl implements GeneratedMessage.BuilderParent {
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

   protected interface BuilderParent extends AbstractMessage.BuilderParent {
   }
}
