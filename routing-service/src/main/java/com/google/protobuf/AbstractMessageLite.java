package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractMessageLite implements MessageLite {
   protected int memoizedHashCode = 0;

   public ByteString toByteString() {
      try {
         ByteString.CodedBuilder var1 = ByteString.newCodedBuilder(this.getSerializedSize());
         this.writeTo(var1.getCodedOutput());
         return var1.build();
      } catch (IOException var2) {
         throw new RuntimeException(this.getSerializingExceptionMessage("ByteString"), var2);
      }
   }

   public byte[] toByteArray() {
      try {
         byte[] var1 = new byte[this.getSerializedSize()];
         CodedOutputStream var2 = CodedOutputStream.newInstance(var1);
         this.writeTo(var2);
         var2.checkNoSpaceLeft();
         return var1;
      } catch (IOException var3) {
         throw new RuntimeException(this.getSerializingExceptionMessage("byte array"), var3);
      }
   }

   public void writeTo(OutputStream var1) throws IOException {
      int var2 = CodedOutputStream.computePreferredBufferSize(this.getSerializedSize());
      CodedOutputStream var3 = CodedOutputStream.newInstance(var1, var2);
      this.writeTo(var3);
      var3.flush();
   }

   public void writeDelimitedTo(OutputStream var1) throws IOException {
      int var2 = this.getSerializedSize();
      int var3 = CodedOutputStream.computePreferredBufferSize(CodedOutputStream.computeRawVarint32Size(var2) + var2);
      CodedOutputStream var4 = CodedOutputStream.newInstance(var1, var3);
      var4.writeRawVarint32(var2);
      this.writeTo(var4);
      var4.flush();
   }

   int getMemoizedSerializedSize() {
      throw new UnsupportedOperationException();
   }

   void setMemoizedSerializedSize(int var1) {
      throw new UnsupportedOperationException();
   }

   int getSerializedSize(Schema var1) {
      int var2 = this.getMemoizedSerializedSize();
      if (var2 == -1) {
         var2 = var1.getSerializedSize(this);
         this.setMemoizedSerializedSize(var2);
      }

      return var2;
   }

   UninitializedMessageException newUninitializedMessageException() {
      return new UninitializedMessageException(this);
   }

   private String getSerializingExceptionMessage(String var1) {
      return "Serializing " + this.getClass().getName() + " to a " + var1 + " threw an IOException (should never happen).";
   }

   protected static void checkByteStringIsUtf8(ByteString var0) throws IllegalArgumentException {
      if (!var0.isValidUtf8()) {
         throw new IllegalArgumentException("Byte string is not UTF-8.");
      }
   }

   /** @deprecated */
   @Deprecated
   protected static void addAll(Iterable var0, Collection var1) {
      AbstractMessageLite.Builder.addAll(var0, (List)var1);
   }

   protected static void addAll(Iterable var0, List var1) {
      AbstractMessageLite.Builder.addAll(var0, var1);
   }

   public abstract static class Builder implements MessageLite.Builder {
      public abstract AbstractMessageLite.Builder clone();

      public AbstractMessageLite.Builder mergeFrom(CodedInputStream var1) throws IOException {
         return this.mergeFrom(var1, ExtensionRegistryLite.getEmptyRegistry());
      }

      public abstract AbstractMessageLite.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws IOException;

      public AbstractMessageLite.Builder mergeFrom(ByteString var1) throws InvalidProtocolBufferException {
         try {
            CodedInputStream var2 = var1.newCodedInput();
            this.mergeFrom(var2);
            var2.checkLastTagWas(0);
            return this;
         } catch (InvalidProtocolBufferException var3) {
            throw var3;
         } catch (IOException var4) {
            throw new RuntimeException(this.getReadingExceptionMessage("ByteString"), var4);
         }
      }

      public AbstractMessageLite.Builder mergeFrom(ByteString var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         try {
            CodedInputStream var3 = var1.newCodedInput();
            this.mergeFrom(var3, var2);
            var3.checkLastTagWas(0);
            return this;
         } catch (InvalidProtocolBufferException var4) {
            throw var4;
         } catch (IOException var5) {
            throw new RuntimeException(this.getReadingExceptionMessage("ByteString"), var5);
         }
      }

      public AbstractMessageLite.Builder mergeFrom(byte[] var1) throws InvalidProtocolBufferException {
         return this.mergeFrom(var1, 0, var1.length);
      }

      public AbstractMessageLite.Builder mergeFrom(byte[] var1, int var2, int var3) throws InvalidProtocolBufferException {
         try {
            CodedInputStream var4 = CodedInputStream.newInstance(var1, var2, var3);
            this.mergeFrom(var4);
            var4.checkLastTagWas(0);
            return this;
         } catch (InvalidProtocolBufferException var5) {
            throw var5;
         } catch (IOException var6) {
            throw new RuntimeException(this.getReadingExceptionMessage("byte array"), var6);
         }
      }

      public AbstractMessageLite.Builder mergeFrom(byte[] var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
         return this.mergeFrom(var1, 0, var1.length, var2);
      }

      public AbstractMessageLite.Builder mergeFrom(byte[] var1, int var2, int var3, ExtensionRegistryLite var4) throws InvalidProtocolBufferException {
         try {
            CodedInputStream var5 = CodedInputStream.newInstance(var1, var2, var3);
            this.mergeFrom(var5, var4);
            var5.checkLastTagWas(0);
            return this;
         } catch (InvalidProtocolBufferException var6) {
            throw var6;
         } catch (IOException var7) {
            throw new RuntimeException(this.getReadingExceptionMessage("byte array"), var7);
         }
      }

      public AbstractMessageLite.Builder mergeFrom(InputStream var1) throws IOException {
         CodedInputStream var2 = CodedInputStream.newInstance(var1);
         this.mergeFrom(var2);
         var2.checkLastTagWas(0);
         return this;
      }

      public AbstractMessageLite.Builder mergeFrom(InputStream var1, ExtensionRegistryLite var2) throws IOException {
         CodedInputStream var3 = CodedInputStream.newInstance(var1);
         this.mergeFrom(var3, var2);
         var3.checkLastTagWas(0);
         return this;
      }

      public boolean mergeDelimitedFrom(InputStream var1, ExtensionRegistryLite var2) throws IOException {
         int var3 = var1.read();
         if (var3 == -1) {
            return false;
         } else {
            int var4 = CodedInputStream.readRawVarint32(var3, var1);
            AbstractMessageLite.Builder.LimitedInputStream var5 = new AbstractMessageLite.Builder.LimitedInputStream(var1, var4);
            this.mergeFrom((InputStream)var5, var2);
            return true;
         }
      }

      public boolean mergeDelimitedFrom(InputStream var1) throws IOException {
         return this.mergeDelimitedFrom(var1, ExtensionRegistryLite.getEmptyRegistry());
      }

      public AbstractMessageLite.Builder mergeFrom(MessageLite var1) {
         if (!this.getDefaultInstanceForType().getClass().isInstance(var1)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
         } else {
            return this.internalMergeFrom((AbstractMessageLite)var1);
         }
      }

      protected abstract AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite var1);

      private String getReadingExceptionMessage(String var1) {
         return "Reading " + this.getClass().getName() + " from a " + var1 + " threw an IOException (should never happen).";
      }

      private static void addAllCheckingNulls(Iterable var0, List var1) {
         if (var1 instanceof ArrayList && var0 instanceof Collection) {
            ((ArrayList)var1).ensureCapacity(var1.size() + ((Collection)var0).size());
         }

         int var2 = var1.size();
         Iterator var3 = var0.iterator();

         while(var3.hasNext()) {
            Object var4 = var3.next();
            if (var4 == null) {
               String var5 = "Element at index " + (var1.size() - var2) + " is null.";

               for(int var6 = var1.size() - 1; var6 >= var2; --var6) {
                  var1.remove(var6);
               }

               throw new NullPointerException(var5);
            }

            var1.add(var4);
         }

      }

      protected static UninitializedMessageException newUninitializedMessageException(MessageLite var0) {
         return new UninitializedMessageException(var0);
      }

      /** @deprecated */
      @Deprecated
      protected static void addAll(Iterable var0, Collection var1) {
         addAll(var0, (List)var1);
      }

      protected static void addAll(Iterable var0, List var1) {
         Internal.checkNotNull(var0);
         if (var0 instanceof LazyStringList) {
            List var2 = ((LazyStringList)var0).getUnderlyingElements();
            LazyStringList var3 = (LazyStringList)var1;
            int var4 = var1.size();
            Iterator var5 = var2.iterator();

            while(var5.hasNext()) {
               Object var6 = var5.next();
               if (var6 == null) {
                  String var7 = "Element at index " + (var3.size() - var4) + " is null.";

                  for(int var8 = var3.size() - 1; var8 >= var4; --var8) {
                     var3.remove(var8);
                  }

                  throw new NullPointerException(var7);
               }

               if (var6 instanceof ByteString) {
                  var3.add((ByteString)var6);
               } else {
                  var3.add((Object)((String)var6));
               }
            }
         } else if (var0 instanceof PrimitiveNonBoxingCollection) {
            var1.addAll((Collection)var0);
         } else {
            addAllCheckingNulls(var0, var1);
         }

      }

      static final class LimitedInputStream extends FilterInputStream {
         private int limit;

         LimitedInputStream(InputStream var1, int var2) {
            super(var1);
            this.limit = var2;
         }

         public int available() throws IOException {
            return Math.min(super.available(), this.limit);
         }

         public int read() throws IOException {
            if (this.limit <= 0) {
               return -1;
            } else {
               int var1 = super.read();
               if (var1 >= 0) {
                  --this.limit;
               }

               return var1;
            }
         }

         public int read(byte[] var1, int var2, int var3) throws IOException {
            if (this.limit <= 0) {
               return -1;
            } else {
               var3 = Math.min(var3, this.limit);
               int var4 = super.read(var1, var2, var3);
               if (var4 >= 0) {
                  this.limit -= var4;
               }

               return var4;
            }
         }

         public long skip(long var1) throws IOException {
            long var3 = super.skip(Math.min(var1, (long)this.limit));
            if (var3 >= 0L) {
               this.limit = (int)((long)this.limit - var3);
            }

            return var3;
         }
      }
   }

   public interface InternalOneOfEnum {
      int getNumber();
   }
}
