package com.google.protobuf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class CodedInputStream {
   private static final int DEFAULT_BUFFER_SIZE = 4096;
   private static final int DEFAULT_RECURSION_LIMIT = 100;
   private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
   int recursionDepth;
   int recursionLimit;
   int sizeLimit;
   CodedInputStreamReader wrapper;
   private boolean shouldDiscardUnknownFields;

   public static CodedInputStream newInstance(InputStream var0) {
      return newInstance(var0, 4096);
   }

   public static CodedInputStream newInstance(InputStream var0, int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("bufferSize must be > 0");
      } else {
         return (CodedInputStream)(var0 == null ? newInstance(Internal.EMPTY_BYTE_ARRAY) : new CodedInputStream.StreamDecoder(var0, var1));
      }
   }

   public static CodedInputStream newInstance(Iterable var0) {
      return !CodedInputStream.UnsafeDirectNioDecoder.isSupported() ? newInstance((InputStream)(new IterableByteBufferInputStream(var0))) : newInstance(var0, false);
   }

   static CodedInputStream newInstance(Iterable var0, boolean var1) {
      int var2 = 0;
      int var3 = 0;
      Iterator var4 = var0.iterator();

      while(var4.hasNext()) {
         ByteBuffer var5 = (ByteBuffer)var4.next();
         var3 += var5.remaining();
         if (var5.hasArray()) {
            var2 |= 1;
         } else if (var5.isDirect()) {
            var2 |= 2;
         } else {
            var2 |= 4;
         }
      }

      if (var2 == 2) {
         return new CodedInputStream.IterableDirectByteBufferDecoder(var0, var3, var1);
      } else {
         return newInstance((InputStream)(new IterableByteBufferInputStream(var0)));
      }
   }

   public static CodedInputStream newInstance(byte[] var0) {
      return newInstance(var0, 0, var0.length);
   }

   public static CodedInputStream newInstance(byte[] var0, int var1, int var2) {
      return newInstance(var0, var1, var2, false);
   }

   static CodedInputStream newInstance(byte[] var0, int var1, int var2, boolean var3) {
      CodedInputStream.ArrayDecoder var4 = new CodedInputStream.ArrayDecoder(var0, var1, var2, var3);

      try {
         var4.pushLimit(var2);
         return var4;
      } catch (InvalidProtocolBufferException var6) {
         throw new IllegalArgumentException(var6);
      }
   }

   public static CodedInputStream newInstance(ByteBuffer var0) {
      return newInstance(var0, false);
   }

   static CodedInputStream newInstance(ByteBuffer var0, boolean var1) {
      if (var0.hasArray()) {
         return newInstance(var0.array(), var0.arrayOffset() + var0.position(), var0.remaining(), var1);
      } else if (var0.isDirect() && CodedInputStream.UnsafeDirectNioDecoder.isSupported()) {
         return new CodedInputStream.UnsafeDirectNioDecoder(var0, var1);
      } else {
         byte[] var2 = new byte[var0.remaining()];
         var0.duplicate().get(var2);
         return newInstance(var2, 0, var2.length, true);
      }
   }

   private CodedInputStream() {
      this.recursionLimit = 100;
      this.sizeLimit = Integer.MAX_VALUE;
      this.shouldDiscardUnknownFields = false;
   }

   public abstract int readTag() throws IOException;

   public abstract void checkLastTagWas(int var1) throws InvalidProtocolBufferException;

   public abstract int getLastTag();

   public abstract boolean skipField(int var1) throws IOException;

   /** @deprecated */
   @Deprecated
   public abstract boolean skipField(int var1, CodedOutputStream var2) throws IOException;

   public abstract void skipMessage() throws IOException;

   public abstract void skipMessage(CodedOutputStream var1) throws IOException;

   public abstract double readDouble() throws IOException;

   public abstract float readFloat() throws IOException;

   public abstract long readUInt64() throws IOException;

   public abstract long readInt64() throws IOException;

   public abstract int readInt32() throws IOException;

   public abstract long readFixed64() throws IOException;

   public abstract int readFixed32() throws IOException;

   public abstract boolean readBool() throws IOException;

   public abstract String readString() throws IOException;

   public abstract String readStringRequireUtf8() throws IOException;

   public abstract void readGroup(int var1, MessageLite.Builder var2, ExtensionRegistryLite var3) throws IOException;

   public abstract MessageLite readGroup(int var1, Parser var2, ExtensionRegistryLite var3) throws IOException;

   /** @deprecated */
   @Deprecated
   public abstract void readUnknownGroup(int var1, MessageLite.Builder var2) throws IOException;

   public abstract void readMessage(MessageLite.Builder var1, ExtensionRegistryLite var2) throws IOException;

   public abstract MessageLite readMessage(Parser var1, ExtensionRegistryLite var2) throws IOException;

   public abstract ByteString readBytes() throws IOException;

   public abstract byte[] readByteArray() throws IOException;

   public abstract ByteBuffer readByteBuffer() throws IOException;

   public abstract int readUInt32() throws IOException;

   public abstract int readEnum() throws IOException;

   public abstract int readSFixed32() throws IOException;

   public abstract long readSFixed64() throws IOException;

   public abstract int readSInt32() throws IOException;

   public abstract long readSInt64() throws IOException;

   public abstract int readRawVarint32() throws IOException;

   public abstract long readRawVarint64() throws IOException;

   abstract long readRawVarint64SlowPath() throws IOException;

   public abstract int readRawLittleEndian32() throws IOException;

   public abstract long readRawLittleEndian64() throws IOException;

   public abstract void enableAliasing(boolean var1);

   public final int setRecursionLimit(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Recursion limit cannot be negative: " + var1);
      } else {
         int var2 = this.recursionLimit;
         this.recursionLimit = var1;
         return var2;
      }
   }

   public final int setSizeLimit(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Size limit cannot be negative: " + var1);
      } else {
         int var2 = this.sizeLimit;
         this.sizeLimit = var1;
         return var2;
      }
   }

   final void discardUnknownFields() {
      this.shouldDiscardUnknownFields = true;
   }

   final void unsetDiscardUnknownFields() {
      this.shouldDiscardUnknownFields = false;
   }

   final boolean shouldDiscardUnknownFields() {
      return this.shouldDiscardUnknownFields;
   }

   public abstract void resetSizeCounter();

   public abstract int pushLimit(int var1) throws InvalidProtocolBufferException;

   public abstract void popLimit(int var1);

   public abstract int getBytesUntilLimit();

   public abstract boolean isAtEnd() throws IOException;

   public abstract int getTotalBytesRead();

   public abstract byte readRawByte() throws IOException;

   public abstract byte[] readRawBytes(int var1) throws IOException;

   public abstract void skipRawBytes(int var1) throws IOException;

   public static int decodeZigZag32(int var0) {
      return var0 >>> 1 ^ -(var0 & 1);
   }

   public static long decodeZigZag64(long var0) {
      return var0 >>> 1 ^ -(var0 & 1L);
   }

   public static int readRawVarint32(int var0, InputStream var1) throws IOException {
      if ((var0 & 128) == 0) {
         return var0;
      } else {
         int var2 = var0 & 127;

         int var3;
         int var4;
         for(var3 = 7; var3 < 32; var3 += 7) {
            var4 = var1.read();
            if (var4 == -1) {
               throw InvalidProtocolBufferException.truncatedMessage();
            }

            var2 |= (var4 & 127) << var3;
            if ((var4 & 128) == 0) {
               return var2;
            }
         }

         while(var3 < 64) {
            var4 = var1.read();
            if (var4 == -1) {
               throw InvalidProtocolBufferException.truncatedMessage();
            }

            if ((var4 & 128) == 0) {
               return var2;
            }

            var3 += 7;
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }
   }

   static int readRawVarint32(InputStream var0) throws IOException {
      int var1 = var0.read();
      if (var1 == -1) {
         throw InvalidProtocolBufferException.truncatedMessage();
      } else {
         return readRawVarint32(var1, var0);
      }
   }

   // $FF: synthetic method
   CodedInputStream(Object var1) {
      this();
   }

   private static final class IterableDirectByteBufferDecoder extends CodedInputStream {
      private Iterable input;
      private Iterator iterator;
      private ByteBuffer currentByteBuffer;
      private boolean immutable;
      private boolean enableAliasing;
      private int totalBufferSize;
      private int bufferSizeAfterCurrentLimit;
      private int currentLimit;
      private int lastTag;
      private int totalBytesRead;
      private int startOffset;
      private long currentByteBufferPos;
      private long currentByteBufferStartPos;
      private long currentAddress;
      private long currentByteBufferLimit;

      private IterableDirectByteBufferDecoder(Iterable var1, int var2, boolean var3) {
         super(null);
         this.currentLimit = Integer.MAX_VALUE;
         this.totalBufferSize = var2;
         this.input = var1;
         this.iterator = this.input.iterator();
         this.immutable = var3;
         this.startOffset = this.totalBytesRead = 0;
         if (var2 == 0) {
            this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = 0L;
            this.currentByteBufferStartPos = 0L;
            this.currentByteBufferLimit = 0L;
            this.currentAddress = 0L;
         } else {
            this.tryGetNextByteBuffer();
         }

      }

      private void getNextByteBuffer() throws InvalidProtocolBufferException {
         if (!this.iterator.hasNext()) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } else {
            this.tryGetNextByteBuffer();
         }
      }

      private void tryGetNextByteBuffer() {
         this.currentByteBuffer = (ByteBuffer)this.iterator.next();
         this.totalBytesRead += (int)(this.currentByteBufferPos - this.currentByteBufferStartPos);
         this.currentByteBufferPos = (long)this.currentByteBuffer.position();
         this.currentByteBufferStartPos = this.currentByteBufferPos;
         this.currentByteBufferLimit = (long)this.currentByteBuffer.limit();
         this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
         this.currentByteBufferPos += this.currentAddress;
         this.currentByteBufferStartPos += this.currentAddress;
         this.currentByteBufferLimit += this.currentAddress;
      }

      public int readTag() throws IOException {
         if (this.isAtEnd()) {
            this.lastTag = 0;
            return 0;
         } else {
            this.lastTag = this.readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) == 0) {
               throw InvalidProtocolBufferException.invalidTag();
            } else {
               return this.lastTag;
            }
         }
      }

      public void checkLastTagWas(int var1) throws InvalidProtocolBufferException {
         if (this.lastTag != var1) {
            throw InvalidProtocolBufferException.invalidEndTag();
         }
      }

      public int getLastTag() {
         return this.lastTag;
      }

      public boolean skipField(int var1) throws IOException {
         switch(WireFormat.getTagWireType(var1)) {
         case 0:
            this.skipRawVarint();
            return true;
         case 1:
            this.skipRawBytes(8);
            return true;
         case 2:
            this.skipRawBytes(this.readRawVarint32());
            return true;
         case 3:
            this.skipMessage();
            this.checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4));
            return true;
         case 4:
            return false;
         case 5:
            this.skipRawBytes(4);
            return true;
         default:
            throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      public boolean skipField(int var1, CodedOutputStream var2) throws IOException {
         int var3;
         long var6;
         switch(WireFormat.getTagWireType(var1)) {
         case 0:
            var6 = this.readInt64();
            var2.writeRawVarint32(var1);
            var2.writeUInt64NoTag(var6);
            return true;
         case 1:
            var6 = this.readRawLittleEndian64();
            var2.writeRawVarint32(var1);
            var2.writeFixed64NoTag(var6);
            return true;
         case 2:
            ByteString var5 = this.readBytes();
            var2.writeRawVarint32(var1);
            var2.writeBytesNoTag(var5);
            return true;
         case 3:
            var2.writeRawVarint32(var1);
            this.skipMessage(var2);
            var3 = WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4);
            this.checkLastTagWas(var3);
            var2.writeRawVarint32(var3);
            return true;
         case 4:
            return false;
         case 5:
            var3 = this.readRawLittleEndian32();
            var2.writeRawVarint32(var1);
            var2.writeFixed32NoTag(var3);
            return true;
         default:
            throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      public void skipMessage() throws IOException {
         int var1;
         do {
            var1 = this.readTag();
         } while(var1 != 0 && this.skipField(var1));

      }

      public void skipMessage(CodedOutputStream var1) throws IOException {
         int var2;
         do {
            var2 = this.readTag();
         } while(var2 != 0 && this.skipField(var2, var1));

      }

      public double readDouble() throws IOException {
         return Double.longBitsToDouble(this.readRawLittleEndian64());
      }

      public float readFloat() throws IOException {
         return Float.intBitsToFloat(this.readRawLittleEndian32());
      }

      public long readUInt64() throws IOException {
         return this.readRawVarint64();
      }

      public long readInt64() throws IOException {
         return this.readRawVarint64();
      }

      public int readInt32() throws IOException {
         return this.readRawVarint32();
      }

      public long readFixed64() throws IOException {
         return this.readRawLittleEndian64();
      }

      public int readFixed32() throws IOException {
         return this.readRawLittleEndian32();
      }

      public boolean readBool() throws IOException {
         return this.readRawVarint64() != 0L;
      }

      public String readString() throws IOException {
         int var1 = this.readRawVarint32();
         byte[] var2;
         String var3;
         if (var1 > 0 && (long)var1 <= this.currentByteBufferLimit - this.currentByteBufferPos) {
            var2 = new byte[var1];
            UnsafeUtil.copyMemory(this.currentByteBufferPos, var2, 0L, (long)var1);
            var3 = new String(var2, Internal.UTF_8);
            this.currentByteBufferPos += (long)var1;
            return var3;
         } else if (var1 > 0 && var1 <= this.remaining()) {
            var2 = new byte[var1];
            this.readRawBytesTo(var2, 0, var1);
            var3 = new String(var2, Internal.UTF_8);
            return var3;
         } else if (var1 == 0) {
            return "";
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public String readStringRequireUtf8() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && (long)var1 <= this.currentByteBufferLimit - this.currentByteBufferPos) {
            int var4 = (int)(this.currentByteBufferPos - this.currentByteBufferStartPos);
            String var3 = Utf8.decodeUtf8(this.currentByteBuffer, var4, var1);
            this.currentByteBufferPos += (long)var1;
            return var3;
         } else if (var1 >= 0 && var1 <= this.remaining()) {
            byte[] var2 = new byte[var1];
            this.readRawBytesTo(var2, 0, var1);
            return Utf8.decodeUtf8((byte[])var2, 0, var1);
         } else if (var1 == 0) {
            return "";
         } else if (var1 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public void readGroup(int var1, MessageLite.Builder var2, ExtensionRegistryLite var3) throws IOException {
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            ++this.recursionDepth;
            var2.mergeFrom((CodedInputStream)this, var3);
            this.checkLastTagWas(WireFormat.makeTag(var1, 4));
            --this.recursionDepth;
         }
      }

      public MessageLite readGroup(int var1, Parser var2, ExtensionRegistryLite var3) throws IOException {
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            ++this.recursionDepth;
            MessageLite var4 = (MessageLite)var2.parsePartialFrom((CodedInputStream)this, var3);
            this.checkLastTagWas(WireFormat.makeTag(var1, 4));
            --this.recursionDepth;
            return var4;
         }
      }

      /** @deprecated */
      @Deprecated
      public void readUnknownGroup(int var1, MessageLite.Builder var2) throws IOException {
         this.readGroup(var1, var2, ExtensionRegistryLite.getEmptyRegistry());
      }

      public void readMessage(MessageLite.Builder var1, ExtensionRegistryLite var2) throws IOException {
         int var3 = this.readRawVarint32();
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            int var4 = this.pushLimit(var3);
            ++this.recursionDepth;
            var1.mergeFrom((CodedInputStream)this, var2);
            this.checkLastTagWas(0);
            --this.recursionDepth;
            this.popLimit(var4);
         }
      }

      public MessageLite readMessage(Parser var1, ExtensionRegistryLite var2) throws IOException {
         int var3 = this.readRawVarint32();
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            int var4 = this.pushLimit(var3);
            ++this.recursionDepth;
            MessageLite var5 = (MessageLite)var1.parsePartialFrom((CodedInputStream)this, var2);
            this.checkLastTagWas(0);
            --this.recursionDepth;
            this.popLimit(var4);
            return var5;
         }
      }

      public ByteString readBytes() throws IOException {
         int var1 = this.readRawVarint32();
         byte[] var2;
         if (var1 > 0 && (long)var1 <= this.currentByteBufferLimit - this.currentByteBufferPos) {
            if (this.immutable && this.enableAliasing) {
               int var4 = (int)(this.currentByteBufferPos - this.currentAddress);
               ByteString var3 = ByteString.wrap(this.slice(var4, var4 + var1));
               this.currentByteBufferPos += (long)var1;
               return var3;
            } else {
               var2 = new byte[var1];
               UnsafeUtil.copyMemory(this.currentByteBufferPos, var2, 0L, (long)var1);
               this.currentByteBufferPos += (long)var1;
               return ByteString.wrap(var2);
            }
         } else if (var1 > 0 && var1 <= this.remaining()) {
            var2 = new byte[var1];
            this.readRawBytesTo(var2, 0, var1);
            return ByteString.wrap(var2);
         } else if (var1 == 0) {
            return ByteString.EMPTY;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public byte[] readByteArray() throws IOException {
         return this.readRawBytes(this.readRawVarint32());
      }

      public ByteBuffer readByteBuffer() throws IOException {
         int var1 = this.readRawVarint32();
         byte[] var2;
         if (var1 > 0 && (long)var1 <= this.currentRemaining()) {
            if (!this.immutable && this.enableAliasing) {
               this.currentByteBufferPos += (long)var1;
               return this.slice((int)(this.currentByteBufferPos - this.currentAddress - (long)var1), (int)(this.currentByteBufferPos - this.currentAddress));
            } else {
               var2 = new byte[var1];
               UnsafeUtil.copyMemory(this.currentByteBufferPos, var2, 0L, (long)var1);
               this.currentByteBufferPos += (long)var1;
               return ByteBuffer.wrap(var2);
            }
         } else if (var1 > 0 && var1 <= this.remaining()) {
            var2 = new byte[var1];
            this.readRawBytesTo(var2, 0, var1);
            return ByteBuffer.wrap(var2);
         } else if (var1 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public int readUInt32() throws IOException {
         return this.readRawVarint32();
      }

      public int readEnum() throws IOException {
         return this.readRawVarint32();
      }

      public int readSFixed32() throws IOException {
         return this.readRawLittleEndian32();
      }

      public long readSFixed64() throws IOException {
         return this.readRawLittleEndian64();
      }

      public int readSInt32() throws IOException {
         return decodeZigZag32(this.readRawVarint32());
      }

      public long readSInt64() throws IOException {
         return decodeZigZag64(this.readRawVarint64());
      }

      public int readRawVarint32() throws IOException {
         long var1;
         int var5;
         label47: {
            var1 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != this.currentByteBufferPos) {
               byte var3;
               if ((var3 = UnsafeUtil.getByte(var1++)) >= 0) {
                  ++this.currentByteBufferPos;
                  return var3;
               }

               if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10L) {
                  if ((var5 = var3 ^ UnsafeUtil.getByte(var1++) << 7) < 0) {
                     var5 ^= -128;
                     break label47;
                  }

                  if ((var5 ^= UnsafeUtil.getByte(var1++) << 14) >= 0) {
                     var5 ^= 16256;
                     break label47;
                  }

                  if ((var5 ^= UnsafeUtil.getByte(var1++) << 21) < 0) {
                     var5 ^= -2080896;
                     break label47;
                  }

                  byte var4 = UnsafeUtil.getByte(var1++);
                  var5 ^= var4 << 28;
                  var5 ^= 266354560;
                  if (var4 >= 0 || UnsafeUtil.getByte(var1++) >= 0 || UnsafeUtil.getByte(var1++) >= 0 || UnsafeUtil.getByte(var1++) >= 0 || UnsafeUtil.getByte(var1++) >= 0 || UnsafeUtil.getByte(var1++) >= 0) {
                     break label47;
                  }
               }
            }

            return (int)this.readRawVarint64SlowPath();
         }

         this.currentByteBufferPos = var1;
         return var5;
      }

      public long readRawVarint64() throws IOException {
         long var1;
         long var3;
         label51: {
            var1 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != this.currentByteBufferPos) {
               byte var5;
               if ((var5 = UnsafeUtil.getByte(var1++)) >= 0) {
                  ++this.currentByteBufferPos;
                  return (long)var5;
               }

               if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10L) {
                  int var6;
                  if ((var6 = var5 ^ UnsafeUtil.getByte(var1++) << 7) < 0) {
                     var3 = (long)(var6 ^ -128);
                     break label51;
                  }

                  if ((var6 ^= UnsafeUtil.getByte(var1++) << 14) >= 0) {
                     var3 = (long)(var6 ^ 16256);
                     break label51;
                  }

                  if ((var6 ^= UnsafeUtil.getByte(var1++) << 21) < 0) {
                     var3 = (long)(var6 ^ -2080896);
                     break label51;
                  }

                  if ((var3 = (long)var6 ^ (long)UnsafeUtil.getByte(var1++) << 28) >= 0L) {
                     var3 ^= 266354560L;
                     break label51;
                  }

                  if ((var3 ^= (long)UnsafeUtil.getByte(var1++) << 35) < 0L) {
                     var3 ^= -34093383808L;
                     break label51;
                  }

                  if ((var3 ^= (long)UnsafeUtil.getByte(var1++) << 42) >= 0L) {
                     var3 ^= 4363953127296L;
                     break label51;
                  }

                  if ((var3 ^= (long)UnsafeUtil.getByte(var1++) << 49) < 0L) {
                     var3 ^= -558586000294016L;
                     break label51;
                  }

                  var3 ^= (long)UnsafeUtil.getByte(var1++) << 56;
                  var3 ^= 71499008037633920L;
                  if (var3 >= 0L || (long)UnsafeUtil.getByte(var1++) >= 0L) {
                     break label51;
                  }
               }
            }

            return this.readRawVarint64SlowPath();
         }

         this.currentByteBufferPos = var1;
         return var3;
      }

      long readRawVarint64SlowPath() throws IOException {
         long var1 = 0L;

         for(int var3 = 0; var3 < 64; var3 += 7) {
            byte var4 = this.readRawByte();
            var1 |= (long)(var4 & 127) << var3;
            if ((var4 & 128) == 0) {
               return var1;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      public int readRawLittleEndian32() throws IOException {
         if (this.currentRemaining() >= 4L) {
            long var1 = this.currentByteBufferPos;
            this.currentByteBufferPos += 4L;
            return UnsafeUtil.getByte(var1) & 255 | (UnsafeUtil.getByte(var1 + 1L) & 255) << 8 | (UnsafeUtil.getByte(var1 + 2L) & 255) << 16 | (UnsafeUtil.getByte(var1 + 3L) & 255) << 24;
         } else {
            return this.readRawByte() & 255 | (this.readRawByte() & 255) << 8 | (this.readRawByte() & 255) << 16 | (this.readRawByte() & 255) << 24;
         }
      }

      public long readRawLittleEndian64() throws IOException {
         if (this.currentRemaining() >= 8L) {
            long var1 = this.currentByteBufferPos;
            this.currentByteBufferPos += 8L;
            return (long)UnsafeUtil.getByte(var1) & 255L | ((long)UnsafeUtil.getByte(var1 + 1L) & 255L) << 8 | ((long)UnsafeUtil.getByte(var1 + 2L) & 255L) << 16 | ((long)UnsafeUtil.getByte(var1 + 3L) & 255L) << 24 | ((long)UnsafeUtil.getByte(var1 + 4L) & 255L) << 32 | ((long)UnsafeUtil.getByte(var1 + 5L) & 255L) << 40 | ((long)UnsafeUtil.getByte(var1 + 6L) & 255L) << 48 | ((long)UnsafeUtil.getByte(var1 + 7L) & 255L) << 56;
         } else {
            return (long)this.readRawByte() & 255L | ((long)this.readRawByte() & 255L) << 8 | ((long)this.readRawByte() & 255L) << 16 | ((long)this.readRawByte() & 255L) << 24 | ((long)this.readRawByte() & 255L) << 32 | ((long)this.readRawByte() & 255L) << 40 | ((long)this.readRawByte() & 255L) << 48 | ((long)this.readRawByte() & 255L) << 56;
         }
      }

      public void enableAliasing(boolean var1) {
         this.enableAliasing = var1;
      }

      public void resetSizeCounter() {
         this.startOffset = (int)((long)this.totalBytesRead + this.currentByteBufferPos - this.currentByteBufferStartPos);
      }

      public int pushLimit(int var1) throws InvalidProtocolBufferException {
         if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            var1 += this.getTotalBytesRead();
            int var2 = this.currentLimit;
            if (var1 > var2) {
               throw InvalidProtocolBufferException.truncatedMessage();
            } else {
               this.currentLimit = var1;
               this.recomputeBufferSizeAfterLimit();
               return var2;
            }
         }
      }

      private void recomputeBufferSizeAfterLimit() {
         this.totalBufferSize += this.bufferSizeAfterCurrentLimit;
         int var1 = this.totalBufferSize - this.startOffset;
         if (var1 > this.currentLimit) {
            this.bufferSizeAfterCurrentLimit = var1 - this.currentLimit;
            this.totalBufferSize -= this.bufferSizeAfterCurrentLimit;
         } else {
            this.bufferSizeAfterCurrentLimit = 0;
         }

      }

      public void popLimit(int var1) {
         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
      }

      public int getBytesUntilLimit() {
         return this.currentLimit == Integer.MAX_VALUE ? -1 : this.currentLimit - this.getTotalBytesRead();
      }

      public boolean isAtEnd() throws IOException {
         return (long)this.totalBytesRead + this.currentByteBufferPos - this.currentByteBufferStartPos == (long)this.totalBufferSize;
      }

      public int getTotalBytesRead() {
         return (int)((long)(this.totalBytesRead - this.startOffset) + this.currentByteBufferPos - this.currentByteBufferStartPos);
      }

      public byte readRawByte() throws IOException {
         if (this.currentRemaining() == 0L) {
            this.getNextByteBuffer();
         }

         return UnsafeUtil.getByte((long)(this.currentByteBufferPos++));
      }

      public byte[] readRawBytes(int var1) throws IOException {
         byte[] var2;
         if (var1 >= 0 && (long)var1 <= this.currentRemaining()) {
            var2 = new byte[var1];
            UnsafeUtil.copyMemory(this.currentByteBufferPos, var2, 0L, (long)var1);
            this.currentByteBufferPos += (long)var1;
            return var2;
         } else if (var1 >= 0 && var1 <= this.remaining()) {
            var2 = new byte[var1];
            this.readRawBytesTo(var2, 0, var1);
            return var2;
         } else if (var1 <= 0) {
            if (var1 == 0) {
               return Internal.EMPTY_BYTE_ARRAY;
            } else {
               throw InvalidProtocolBufferException.negativeSize();
            }
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      private void readRawBytesTo(byte[] var1, int var2, int var3) throws IOException {
         if (var3 >= 0 && var3 <= this.remaining()) {
            int var5;
            for(int var4 = var3; var4 > 0; this.currentByteBufferPos += (long)var5) {
               if (this.currentRemaining() == 0L) {
                  this.getNextByteBuffer();
               }

               var5 = Math.min(var4, (int)this.currentRemaining());
               UnsafeUtil.copyMemory(this.currentByteBufferPos, var1, (long)(var3 - var4 + var2), (long)var5);
               var4 -= var5;
            }

         } else if (var3 <= 0) {
            if (var3 != 0) {
               throw InvalidProtocolBufferException.negativeSize();
            }
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public void skipRawBytes(int var1) throws IOException {
         if (var1 >= 0 && (long)var1 <= (long)(this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos + this.currentByteBufferStartPos) {
            int var3;
            for(int var2 = var1; var2 > 0; this.currentByteBufferPos += (long)var3) {
               if (this.currentRemaining() == 0L) {
                  this.getNextByteBuffer();
               }

               var3 = Math.min(var2, (int)this.currentRemaining());
               var2 -= var3;
            }

         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      private void skipRawVarint() throws IOException {
         for(int var1 = 0; var1 < 10; ++var1) {
            if (this.readRawByte() >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      private int remaining() {
         return (int)((long)(this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos + this.currentByteBufferStartPos);
      }

      private long currentRemaining() {
         return this.currentByteBufferLimit - this.currentByteBufferPos;
      }

      private ByteBuffer slice(int var1, int var2) throws IOException {
         int var3 = this.currentByteBuffer.position();
         int var4 = this.currentByteBuffer.limit();

         ByteBuffer var5;
         try {
            this.currentByteBuffer.position(var1);
            this.currentByteBuffer.limit(var2);
            var5 = this.currentByteBuffer.slice();
         } catch (IllegalArgumentException var9) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } finally {
            this.currentByteBuffer.position(var3);
            this.currentByteBuffer.limit(var4);
         }

         return var5;
      }

      // $FF: synthetic method
      IterableDirectByteBufferDecoder(Iterable var1, int var2, boolean var3, Object var4) {
         this(var1, var2, var3);
      }
   }

   private static final class StreamDecoder extends CodedInputStream {
      private final InputStream input;
      private final byte[] buffer;
      private int bufferSize;
      private int bufferSizeAfterLimit;
      private int pos;
      private int lastTag;
      private int totalBytesRetired;
      private int currentLimit;
      private CodedInputStream.StreamDecoder.RefillCallback refillCallback;

      private StreamDecoder(InputStream var1, int var2) {
         super(null);
         this.currentLimit = Integer.MAX_VALUE;
         this.refillCallback = null;
         Internal.checkNotNull(var1, "input");
         this.input = var1;
         this.buffer = new byte[var2];
         this.bufferSize = 0;
         this.pos = 0;
         this.totalBytesRetired = 0;
      }

      public int readTag() throws IOException {
         if (this.isAtEnd()) {
            this.lastTag = 0;
            return 0;
         } else {
            this.lastTag = this.readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) == 0) {
               throw InvalidProtocolBufferException.invalidTag();
            } else {
               return this.lastTag;
            }
         }
      }

      public void checkLastTagWas(int var1) throws InvalidProtocolBufferException {
         if (this.lastTag != var1) {
            throw InvalidProtocolBufferException.invalidEndTag();
         }
      }

      public int getLastTag() {
         return this.lastTag;
      }

      public boolean skipField(int var1) throws IOException {
         switch(WireFormat.getTagWireType(var1)) {
         case 0:
            this.skipRawVarint();
            return true;
         case 1:
            this.skipRawBytes(8);
            return true;
         case 2:
            this.skipRawBytes(this.readRawVarint32());
            return true;
         case 3:
            this.skipMessage();
            this.checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4));
            return true;
         case 4:
            return false;
         case 5:
            this.skipRawBytes(4);
            return true;
         default:
            throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      public boolean skipField(int var1, CodedOutputStream var2) throws IOException {
         int var3;
         long var6;
         switch(WireFormat.getTagWireType(var1)) {
         case 0:
            var6 = this.readInt64();
            var2.writeRawVarint32(var1);
            var2.writeUInt64NoTag(var6);
            return true;
         case 1:
            var6 = this.readRawLittleEndian64();
            var2.writeRawVarint32(var1);
            var2.writeFixed64NoTag(var6);
            return true;
         case 2:
            ByteString var5 = this.readBytes();
            var2.writeRawVarint32(var1);
            var2.writeBytesNoTag(var5);
            return true;
         case 3:
            var2.writeRawVarint32(var1);
            this.skipMessage(var2);
            var3 = WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4);
            this.checkLastTagWas(var3);
            var2.writeRawVarint32(var3);
            return true;
         case 4:
            return false;
         case 5:
            var3 = this.readRawLittleEndian32();
            var2.writeRawVarint32(var1);
            var2.writeFixed32NoTag(var3);
            return true;
         default:
            throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      public void skipMessage() throws IOException {
         int var1;
         do {
            var1 = this.readTag();
         } while(var1 != 0 && this.skipField(var1));

      }

      public void skipMessage(CodedOutputStream var1) throws IOException {
         int var2;
         do {
            var2 = this.readTag();
         } while(var2 != 0 && this.skipField(var2, var1));

      }

      public double readDouble() throws IOException {
         return Double.longBitsToDouble(this.readRawLittleEndian64());
      }

      public float readFloat() throws IOException {
         return Float.intBitsToFloat(this.readRawLittleEndian32());
      }

      public long readUInt64() throws IOException {
         return this.readRawVarint64();
      }

      public long readInt64() throws IOException {
         return this.readRawVarint64();
      }

      public int readInt32() throws IOException {
         return this.readRawVarint32();
      }

      public long readFixed64() throws IOException {
         return this.readRawLittleEndian64();
      }

      public int readFixed32() throws IOException {
         return this.readRawLittleEndian32();
      }

      public boolean readBool() throws IOException {
         return this.readRawVarint64() != 0L;
      }

      public String readString() throws IOException {
         int var1 = this.readRawVarint32();
         String var2;
         if (var1 > 0 && var1 <= this.bufferSize - this.pos) {
            var2 = new String(this.buffer, this.pos, var1, Internal.UTF_8);
            this.pos += var1;
            return var2;
         } else if (var1 == 0) {
            return "";
         } else if (var1 <= this.bufferSize) {
            this.refillBuffer(var1);
            var2 = new String(this.buffer, this.pos, var1, Internal.UTF_8);
            this.pos += var1;
            return var2;
         } else {
            return new String(this.readRawBytesSlowPath(var1, false), Internal.UTF_8);
         }
      }

      public String readStringRequireUtf8() throws IOException {
         int var1 = this.readRawVarint32();
         int var3 = this.pos;
         byte[] var2;
         int var4;
         if (var1 <= this.bufferSize - var3 && var1 > 0) {
            var2 = this.buffer;
            this.pos = var3 + var1;
            var4 = var3;
         } else {
            if (var1 == 0) {
               return "";
            }

            if (var1 <= this.bufferSize) {
               this.refillBuffer(var1);
               var2 = this.buffer;
               var4 = 0;
               this.pos = var4 + var1;
            } else {
               var2 = this.readRawBytesSlowPath(var1, false);
               var4 = 0;
            }
         }

         return Utf8.decodeUtf8(var2, var4, var1);
      }

      public void readGroup(int var1, MessageLite.Builder var2, ExtensionRegistryLite var3) throws IOException {
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            ++this.recursionDepth;
            var2.mergeFrom((CodedInputStream)this, var3);
            this.checkLastTagWas(WireFormat.makeTag(var1, 4));
            --this.recursionDepth;
         }
      }

      public MessageLite readGroup(int var1, Parser var2, ExtensionRegistryLite var3) throws IOException {
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            ++this.recursionDepth;
            MessageLite var4 = (MessageLite)var2.parsePartialFrom((CodedInputStream)this, var3);
            this.checkLastTagWas(WireFormat.makeTag(var1, 4));
            --this.recursionDepth;
            return var4;
         }
      }

      /** @deprecated */
      @Deprecated
      public void readUnknownGroup(int var1, MessageLite.Builder var2) throws IOException {
         this.readGroup(var1, var2, ExtensionRegistryLite.getEmptyRegistry());
      }

      public void readMessage(MessageLite.Builder var1, ExtensionRegistryLite var2) throws IOException {
         int var3 = this.readRawVarint32();
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            int var4 = this.pushLimit(var3);
            ++this.recursionDepth;
            var1.mergeFrom((CodedInputStream)this, var2);
            this.checkLastTagWas(0);
            --this.recursionDepth;
            this.popLimit(var4);
         }
      }

      public MessageLite readMessage(Parser var1, ExtensionRegistryLite var2) throws IOException {
         int var3 = this.readRawVarint32();
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            int var4 = this.pushLimit(var3);
            ++this.recursionDepth;
            MessageLite var5 = (MessageLite)var1.parsePartialFrom((CodedInputStream)this, var2);
            this.checkLastTagWas(0);
            --this.recursionDepth;
            this.popLimit(var4);
            return var5;
         }
      }

      public ByteString readBytes() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 <= this.bufferSize - this.pos && var1 > 0) {
            ByteString var2 = ByteString.copyFrom(this.buffer, this.pos, var1);
            this.pos += var1;
            return var2;
         } else {
            return var1 == 0 ? ByteString.EMPTY : this.readBytesSlowPath(var1);
         }
      }

      public byte[] readByteArray() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 <= this.bufferSize - this.pos && var1 > 0) {
            byte[] var2 = Arrays.copyOfRange(this.buffer, this.pos, this.pos + var1);
            this.pos += var1;
            return var2;
         } else {
            return this.readRawBytesSlowPath(var1, false);
         }
      }

      public ByteBuffer readByteBuffer() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 <= this.bufferSize - this.pos && var1 > 0) {
            ByteBuffer var2 = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, this.pos, this.pos + var1));
            this.pos += var1;
            return var2;
         } else {
            return var1 == 0 ? Internal.EMPTY_BYTE_BUFFER : ByteBuffer.wrap(this.readRawBytesSlowPath(var1, true));
         }
      }

      public int readUInt32() throws IOException {
         return this.readRawVarint32();
      }

      public int readEnum() throws IOException {
         return this.readRawVarint32();
      }

      public int readSFixed32() throws IOException {
         return this.readRawLittleEndian32();
      }

      public long readSFixed64() throws IOException {
         return this.readRawLittleEndian64();
      }

      public int readSInt32() throws IOException {
         return decodeZigZag32(this.readRawVarint32());
      }

      public long readSInt64() throws IOException {
         return decodeZigZag64(this.readRawVarint64());
      }

      public int readRawVarint32() throws IOException {
         int var1;
         int var5;
         label47: {
            var1 = this.pos;
            if (this.bufferSize != var1) {
               byte[] var2 = this.buffer;
               byte var3;
               if ((var3 = var2[var1++]) >= 0) {
                  this.pos = var1;
                  return var3;
               }

               if (this.bufferSize - var1 >= 9) {
                  if ((var5 = var3 ^ var2[var1++] << 7) < 0) {
                     var5 ^= -128;
                     break label47;
                  }

                  if ((var5 ^= var2[var1++] << 14) >= 0) {
                     var5 ^= 16256;
                     break label47;
                  }

                  if ((var5 ^= var2[var1++] << 21) < 0) {
                     var5 ^= -2080896;
                     break label47;
                  }

                  byte var4 = var2[var1++];
                  var5 ^= var4 << 28;
                  var5 ^= 266354560;
                  if (var4 >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0) {
                     break label47;
                  }
               }
            }

            return (int)this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var5;
      }

      private void skipRawVarint() throws IOException {
         if (this.bufferSize - this.pos >= 10) {
            this.skipRawVarintFastPath();
         } else {
            this.skipRawVarintSlowPath();
         }

      }

      private void skipRawVarintFastPath() throws IOException {
         for(int var1 = 0; var1 < 10; ++var1) {
            if (this.buffer[this.pos++] >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      private void skipRawVarintSlowPath() throws IOException {
         for(int var1 = 0; var1 < 10; ++var1) {
            if (this.readRawByte() >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      public long readRawVarint64() throws IOException {
         int var1;
         long var3;
         label51: {
            var1 = this.pos;
            if (this.bufferSize != var1) {
               byte[] var2 = this.buffer;
               byte var5;
               if ((var5 = var2[var1++]) >= 0) {
                  this.pos = var1;
                  return (long)var5;
               }

               if (this.bufferSize - var1 >= 9) {
                  int var6;
                  if ((var6 = var5 ^ var2[var1++] << 7) < 0) {
                     var3 = (long)(var6 ^ -128);
                     break label51;
                  }

                  if ((var6 ^= var2[var1++] << 14) >= 0) {
                     var3 = (long)(var6 ^ 16256);
                     break label51;
                  }

                  if ((var6 ^= var2[var1++] << 21) < 0) {
                     var3 = (long)(var6 ^ -2080896);
                     break label51;
                  }

                  if ((var3 = (long)var6 ^ (long)var2[var1++] << 28) >= 0L) {
                     var3 ^= 266354560L;
                     break label51;
                  }

                  if ((var3 ^= (long)var2[var1++] << 35) < 0L) {
                     var3 ^= -34093383808L;
                     break label51;
                  }

                  if ((var3 ^= (long)var2[var1++] << 42) >= 0L) {
                     var3 ^= 4363953127296L;
                     break label51;
                  }

                  if ((var3 ^= (long)var2[var1++] << 49) < 0L) {
                     var3 ^= -558586000294016L;
                     break label51;
                  }

                  var3 ^= (long)var2[var1++] << 56;
                  var3 ^= 71499008037633920L;
                  if (var3 >= 0L || (long)var2[var1++] >= 0L) {
                     break label51;
                  }
               }
            }

            return this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var3;
      }

      long readRawVarint64SlowPath() throws IOException {
         long var1 = 0L;

         for(int var3 = 0; var3 < 64; var3 += 7) {
            byte var4 = this.readRawByte();
            var1 |= (long)(var4 & 127) << var3;
            if ((var4 & 128) == 0) {
               return var1;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      public int readRawLittleEndian32() throws IOException {
         int var1 = this.pos;
         if (this.bufferSize - var1 < 4) {
            this.refillBuffer(4);
            var1 = this.pos;
         }

         byte[] var2 = this.buffer;
         this.pos = var1 + 4;
         return var2[var1] & 255 | (var2[var1 + 1] & 255) << 8 | (var2[var1 + 2] & 255) << 16 | (var2[var1 + 3] & 255) << 24;
      }

      public long readRawLittleEndian64() throws IOException {
         int var1 = this.pos;
         if (this.bufferSize - var1 < 8) {
            this.refillBuffer(8);
            var1 = this.pos;
         }

         byte[] var2 = this.buffer;
         this.pos = var1 + 8;
         return (long)var2[var1] & 255L | ((long)var2[var1 + 1] & 255L) << 8 | ((long)var2[var1 + 2] & 255L) << 16 | ((long)var2[var1 + 3] & 255L) << 24 | ((long)var2[var1 + 4] & 255L) << 32 | ((long)var2[var1 + 5] & 255L) << 40 | ((long)var2[var1 + 6] & 255L) << 48 | ((long)var2[var1 + 7] & 255L) << 56;
      }

      public void enableAliasing(boolean var1) {
      }

      public void resetSizeCounter() {
         this.totalBytesRetired = -this.pos;
      }

      public int pushLimit(int var1) throws InvalidProtocolBufferException {
         if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            var1 += this.totalBytesRetired + this.pos;
            int var2 = this.currentLimit;
            if (var1 > var2) {
               throw InvalidProtocolBufferException.truncatedMessage();
            } else {
               this.currentLimit = var1;
               this.recomputeBufferSizeAfterLimit();
               return var2;
            }
         }
      }

      private void recomputeBufferSizeAfterLimit() {
         this.bufferSize += this.bufferSizeAfterLimit;
         int var1 = this.totalBytesRetired + this.bufferSize;
         if (var1 > this.currentLimit) {
            this.bufferSizeAfterLimit = var1 - this.currentLimit;
            this.bufferSize -= this.bufferSizeAfterLimit;
         } else {
            this.bufferSizeAfterLimit = 0;
         }

      }

      public void popLimit(int var1) {
         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
      }

      public int getBytesUntilLimit() {
         if (this.currentLimit == Integer.MAX_VALUE) {
            return -1;
         } else {
            int var1 = this.totalBytesRetired + this.pos;
            return this.currentLimit - var1;
         }
      }

      public boolean isAtEnd() throws IOException {
         return this.pos == this.bufferSize && !this.tryRefillBuffer(1);
      }

      public int getTotalBytesRead() {
         return this.totalBytesRetired + this.pos;
      }

      private void refillBuffer(int var1) throws IOException {
         if (!this.tryRefillBuffer(var1)) {
            if (var1 > this.sizeLimit - this.totalBytesRetired - this.pos) {
               throw InvalidProtocolBufferException.sizeLimitExceeded();
            } else {
               throw InvalidProtocolBufferException.truncatedMessage();
            }
         }
      }

      private boolean tryRefillBuffer(int var1) throws IOException {
         if (this.pos + var1 <= this.bufferSize) {
            throw new IllegalStateException("refillBuffer() called when " + var1 + " bytes were already available in buffer");
         } else if (var1 > this.sizeLimit - this.totalBytesRetired - this.pos) {
            return false;
         } else if (this.totalBytesRetired + this.pos + var1 > this.currentLimit) {
            return false;
         } else {
            if (this.refillCallback != null) {
               this.refillCallback.onRefill();
            }

            int var2 = this.pos;
            if (var2 > 0) {
               if (this.bufferSize > var2) {
                  System.arraycopy(this.buffer, var2, this.buffer, 0, this.bufferSize - var2);
               }

               this.totalBytesRetired += var2;
               this.bufferSize -= var2;
               this.pos = 0;
            }

            int var3 = this.input.read(this.buffer, this.bufferSize, Math.min(this.buffer.length - this.bufferSize, this.sizeLimit - this.totalBytesRetired - this.bufferSize));
            if (var3 != 0 && var3 >= -1 && var3 <= this.buffer.length) {
               if (var3 > 0) {
                  this.bufferSize += var3;
                  this.recomputeBufferSizeAfterLimit();
                  return this.bufferSize >= var1 ? true : this.tryRefillBuffer(var1);
               } else {
                  return false;
               }
            } else {
               throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + var3 + "\nThe InputStream implementation is buggy.");
            }
         }
      }

      public byte readRawByte() throws IOException {
         if (this.pos == this.bufferSize) {
            this.refillBuffer(1);
         }

         return this.buffer[this.pos++];
      }

      public byte[] readRawBytes(int var1) throws IOException {
         int var2 = this.pos;
         if (var1 <= this.bufferSize - var2 && var1 > 0) {
            this.pos = var2 + var1;
            return Arrays.copyOfRange(this.buffer, var2, var2 + var1);
         } else {
            return this.readRawBytesSlowPath(var1, false);
         }
      }

      private byte[] readRawBytesSlowPath(int var1, boolean var2) throws IOException {
         byte[] var3 = this.readRawBytesSlowPathOneChunk(var1);
         if (var3 != null) {
            return var2 ? (byte[])var3.clone() : var3;
         } else {
            int var4 = this.pos;
            int var5 = this.bufferSize - this.pos;
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            int var6 = var1 - var5;
            List var7 = this.readRawBytesSlowPathRemainingChunks(var6);
            byte[] var8 = new byte[var1];
            System.arraycopy(this.buffer, var4, var8, 0, var5);
            int var9 = var5;

            byte[] var11;
            for(Iterator var10 = var7.iterator(); var10.hasNext(); var9 += var11.length) {
               var11 = (byte[])var10.next();
               System.arraycopy(var11, 0, var8, var9, var11.length);
            }

            return var8;
         }
      }

      private byte[] readRawBytesSlowPathOneChunk(int var1) throws IOException {
         if (var1 == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            int var2 = this.totalBytesRetired + this.pos + var1;
            if (var2 - this.sizeLimit > 0) {
               throw InvalidProtocolBufferException.sizeLimitExceeded();
            } else if (var2 > this.currentLimit) {
               this.skipRawBytes(this.currentLimit - this.totalBytesRetired - this.pos);
               throw InvalidProtocolBufferException.truncatedMessage();
            } else {
               int var3 = this.bufferSize - this.pos;
               int var4 = var1 - var3;
               if (var4 >= 4096 && var4 > this.input.available()) {
                  return null;
               } else {
                  byte[] var5 = new byte[var1];
                  System.arraycopy(this.buffer, this.pos, var5, 0, var3);
                  this.totalBytesRetired += this.bufferSize;
                  this.pos = 0;
                  this.bufferSize = 0;

                  int var7;
                  for(int var6 = var3; var6 < var5.length; var6 += var7) {
                     var7 = this.input.read(var5, var6, var1 - var6);
                     if (var7 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                     }

                     this.totalBytesRetired += var7;
                  }

                  return var5;
               }
            }
         }
      }

      private List readRawBytesSlowPathRemainingChunks(int var1) throws IOException {
         ArrayList var2 = new ArrayList();

         while(var1 > 0) {
            byte[] var3 = new byte[Math.min(var1, 4096)];

            int var5;
            for(int var4 = 0; var4 < var3.length; var4 += var5) {
               var5 = this.input.read(var3, var4, var3.length - var4);
               if (var5 == -1) {
                  throw InvalidProtocolBufferException.truncatedMessage();
               }

               this.totalBytesRetired += var5;
            }

            var1 -= var3.length;
            var2.add(var3);
         }

         return var2;
      }

      private ByteString readBytesSlowPath(int var1) throws IOException {
         byte[] var2 = this.readRawBytesSlowPathOneChunk(var1);
         if (var2 != null) {
            return ByteString.copyFrom(var2);
         } else {
            int var3 = this.pos;
            int var4 = this.bufferSize - this.pos;
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            int var5 = var1 - var4;
            List var6 = this.readRawBytesSlowPathRemainingChunks(var5);
            byte[] var7 = new byte[var1];
            System.arraycopy(this.buffer, var3, var7, 0, var4);
            int var8 = var4;

            byte[] var10;
            for(Iterator var9 = var6.iterator(); var9.hasNext(); var8 += var10.length) {
               var10 = (byte[])var9.next();
               System.arraycopy(var10, 0, var7, var8, var10.length);
            }

            return ByteString.wrap(var7);
         }
      }

      public void skipRawBytes(int var1) throws IOException {
         if (var1 <= this.bufferSize - this.pos && var1 >= 0) {
            this.pos += var1;
         } else {
            this.skipRawBytesSlowPath(var1);
         }

      }

      private void skipRawBytesSlowPath(int var1) throws IOException {
         if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else if (this.totalBytesRetired + this.pos + var1 > this.currentLimit) {
            this.skipRawBytes(this.currentLimit - this.totalBytesRetired - this.pos);
            throw InvalidProtocolBufferException.truncatedMessage();
         } else {
            int var2 = 0;
            int var3;
            if (this.refillCallback == null) {
               this.totalBytesRetired += this.pos;
               var2 = this.bufferSize - this.pos;
               this.bufferSize = 0;
               this.pos = 0;

               try {
                  while(var2 < var1) {
                     var3 = var1 - var2;
                     long var4 = this.input.skip((long)var3);
                     if (var4 < 0L || var4 > (long)var3) {
                        throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + var4 + "\nThe InputStream implementation is buggy.");
                     }

                     if (var4 == 0L) {
                        break;
                     }

                     var2 += (int)var4;
                  }
               } finally {
                  this.totalBytesRetired += var2;
                  this.recomputeBufferSizeAfterLimit();
               }
            }

            if (var2 < var1) {
               var3 = this.bufferSize - this.pos;
               this.pos = this.bufferSize;
               this.refillBuffer(1);

               while(var1 - var3 > this.bufferSize) {
                  var3 += this.bufferSize;
                  this.pos = this.bufferSize;
                  this.refillBuffer(1);
               }

               this.pos = var1 - var3;
            }

         }
      }

      // $FF: synthetic method
      StreamDecoder(InputStream var1, int var2, Object var3) {
         this(var1, var2);
      }

      private interface RefillCallback {
         void onRefill();
      }

      private class SkippedDataSink implements CodedInputStream.StreamDecoder.RefillCallback {
         private int lastPos;
         private ByteArrayOutputStream byteArrayStream;

         private SkippedDataSink() {
            this.lastPos = StreamDecoder.this.pos;
         }

         public void onRefill() {
            if (this.byteArrayStream == null) {
               this.byteArrayStream = new ByteArrayOutputStream();
            }

            this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
            this.lastPos = 0;
         }

         ByteBuffer getSkippedData() {
            if (this.byteArrayStream == null) {
               return ByteBuffer.wrap(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
            } else {
               this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos);
               return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }
         }
      }
   }

   private static final class UnsafeDirectNioDecoder extends CodedInputStream {
      private final ByteBuffer buffer;
      private final boolean immutable;
      private final long address;
      private long limit;
      private long pos;
      private long startPos;
      private int bufferSizeAfterLimit;
      private int lastTag;
      private boolean enableAliasing;
      private int currentLimit;

      static boolean isSupported() {
         return UnsafeUtil.hasUnsafeByteBufferOperations();
      }

      private UnsafeDirectNioDecoder(ByteBuffer var1, boolean var2) {
         super(null);
         this.currentLimit = Integer.MAX_VALUE;
         this.buffer = var1;
         this.address = UnsafeUtil.addressOffset(var1);
         this.limit = this.address + (long)var1.limit();
         this.pos = this.address + (long)var1.position();
         this.startPos = this.pos;
         this.immutable = var2;
      }

      public int readTag() throws IOException {
         if (this.isAtEnd()) {
            this.lastTag = 0;
            return 0;
         } else {
            this.lastTag = this.readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) == 0) {
               throw InvalidProtocolBufferException.invalidTag();
            } else {
               return this.lastTag;
            }
         }
      }

      public void checkLastTagWas(int var1) throws InvalidProtocolBufferException {
         if (this.lastTag != var1) {
            throw InvalidProtocolBufferException.invalidEndTag();
         }
      }

      public int getLastTag() {
         return this.lastTag;
      }

      public boolean skipField(int var1) throws IOException {
         switch(WireFormat.getTagWireType(var1)) {
         case 0:
            this.skipRawVarint();
            return true;
         case 1:
            this.skipRawBytes(8);
            return true;
         case 2:
            this.skipRawBytes(this.readRawVarint32());
            return true;
         case 3:
            this.skipMessage();
            this.checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4));
            return true;
         case 4:
            return false;
         case 5:
            this.skipRawBytes(4);
            return true;
         default:
            throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      public boolean skipField(int var1, CodedOutputStream var2) throws IOException {
         int var3;
         long var6;
         switch(WireFormat.getTagWireType(var1)) {
         case 0:
            var6 = this.readInt64();
            var2.writeRawVarint32(var1);
            var2.writeUInt64NoTag(var6);
            return true;
         case 1:
            var6 = this.readRawLittleEndian64();
            var2.writeRawVarint32(var1);
            var2.writeFixed64NoTag(var6);
            return true;
         case 2:
            ByteString var5 = this.readBytes();
            var2.writeRawVarint32(var1);
            var2.writeBytesNoTag(var5);
            return true;
         case 3:
            var2.writeRawVarint32(var1);
            this.skipMessage(var2);
            var3 = WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4);
            this.checkLastTagWas(var3);
            var2.writeRawVarint32(var3);
            return true;
         case 4:
            return false;
         case 5:
            var3 = this.readRawLittleEndian32();
            var2.writeRawVarint32(var1);
            var2.writeFixed32NoTag(var3);
            return true;
         default:
            throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      public void skipMessage() throws IOException {
         int var1;
         do {
            var1 = this.readTag();
         } while(var1 != 0 && this.skipField(var1));

      }

      public void skipMessage(CodedOutputStream var1) throws IOException {
         int var2;
         do {
            var2 = this.readTag();
         } while(var2 != 0 && this.skipField(var2, var1));

      }

      public double readDouble() throws IOException {
         return Double.longBitsToDouble(this.readRawLittleEndian64());
      }

      public float readFloat() throws IOException {
         return Float.intBitsToFloat(this.readRawLittleEndian32());
      }

      public long readUInt64() throws IOException {
         return this.readRawVarint64();
      }

      public long readInt64() throws IOException {
         return this.readRawVarint64();
      }

      public int readInt32() throws IOException {
         return this.readRawVarint32();
      }

      public long readFixed64() throws IOException {
         return this.readRawLittleEndian64();
      }

      public int readFixed32() throws IOException {
         return this.readRawLittleEndian32();
      }

      public boolean readBool() throws IOException {
         return this.readRawVarint64() != 0L;
      }

      public String readString() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.remaining()) {
            byte[] var2 = new byte[var1];
            UnsafeUtil.copyMemory(this.pos, var2, 0L, (long)var1);
            String var3 = new String(var2, Internal.UTF_8);
            this.pos += (long)var1;
            return var3;
         } else if (var1 == 0) {
            return "";
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public String readStringRequireUtf8() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.remaining()) {
            int var2 = this.bufferPos(this.pos);
            String var3 = Utf8.decodeUtf8(this.buffer, var2, var1);
            this.pos += (long)var1;
            return var3;
         } else if (var1 == 0) {
            return "";
         } else if (var1 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public void readGroup(int var1, MessageLite.Builder var2, ExtensionRegistryLite var3) throws IOException {
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            ++this.recursionDepth;
            var2.mergeFrom((CodedInputStream)this, var3);
            this.checkLastTagWas(WireFormat.makeTag(var1, 4));
            --this.recursionDepth;
         }
      }

      public MessageLite readGroup(int var1, Parser var2, ExtensionRegistryLite var3) throws IOException {
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            ++this.recursionDepth;
            MessageLite var4 = (MessageLite)var2.parsePartialFrom((CodedInputStream)this, var3);
            this.checkLastTagWas(WireFormat.makeTag(var1, 4));
            --this.recursionDepth;
            return var4;
         }
      }

      /** @deprecated */
      @Deprecated
      public void readUnknownGroup(int var1, MessageLite.Builder var2) throws IOException {
         this.readGroup(var1, var2, ExtensionRegistryLite.getEmptyRegistry());
      }

      public void readMessage(MessageLite.Builder var1, ExtensionRegistryLite var2) throws IOException {
         int var3 = this.readRawVarint32();
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            int var4 = this.pushLimit(var3);
            ++this.recursionDepth;
            var1.mergeFrom((CodedInputStream)this, var2);
            this.checkLastTagWas(0);
            --this.recursionDepth;
            this.popLimit(var4);
         }
      }

      public MessageLite readMessage(Parser var1, ExtensionRegistryLite var2) throws IOException {
         int var3 = this.readRawVarint32();
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            int var4 = this.pushLimit(var3);
            ++this.recursionDepth;
            MessageLite var5 = (MessageLite)var1.parsePartialFrom((CodedInputStream)this, var2);
            this.checkLastTagWas(0);
            --this.recursionDepth;
            this.popLimit(var4);
            return var5;
         }
      }

      public ByteString readBytes() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.remaining()) {
            if (this.immutable && this.enableAliasing) {
               ByteBuffer var3 = this.slice(this.pos, this.pos + (long)var1);
               this.pos += (long)var1;
               return ByteString.wrap(var3);
            } else {
               byte[] var2 = new byte[var1];
               UnsafeUtil.copyMemory(this.pos, var2, 0L, (long)var1);
               this.pos += (long)var1;
               return ByteString.wrap(var2);
            }
         } else if (var1 == 0) {
            return ByteString.EMPTY;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public byte[] readByteArray() throws IOException {
         return this.readRawBytes(this.readRawVarint32());
      }

      public ByteBuffer readByteBuffer() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.remaining()) {
            if (!this.immutable && this.enableAliasing) {
               ByteBuffer var3 = this.slice(this.pos, this.pos + (long)var1);
               this.pos += (long)var1;
               return var3;
            } else {
               byte[] var2 = new byte[var1];
               UnsafeUtil.copyMemory(this.pos, var2, 0L, (long)var1);
               this.pos += (long)var1;
               return ByteBuffer.wrap(var2);
            }
         } else if (var1 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public int readUInt32() throws IOException {
         return this.readRawVarint32();
      }

      public int readEnum() throws IOException {
         return this.readRawVarint32();
      }

      public int readSFixed32() throws IOException {
         return this.readRawLittleEndian32();
      }

      public long readSFixed64() throws IOException {
         return this.readRawLittleEndian64();
      }

      public int readSInt32() throws IOException {
         return decodeZigZag32(this.readRawVarint32());
      }

      public long readSInt64() throws IOException {
         return decodeZigZag64(this.readRawVarint64());
      }

      public int readRawVarint32() throws IOException {
         long var1;
         int var5;
         label47: {
            var1 = this.pos;
            if (this.limit != var1) {
               byte var3;
               if ((var3 = UnsafeUtil.getByte(var1++)) >= 0) {
                  this.pos = var1;
                  return var3;
               }

               if (this.limit - var1 >= 9L) {
                  if ((var5 = var3 ^ UnsafeUtil.getByte(var1++) << 7) < 0) {
                     var5 ^= -128;
                     break label47;
                  }

                  if ((var5 ^= UnsafeUtil.getByte(var1++) << 14) >= 0) {
                     var5 ^= 16256;
                     break label47;
                  }

                  if ((var5 ^= UnsafeUtil.getByte(var1++) << 21) < 0) {
                     var5 ^= -2080896;
                     break label47;
                  }

                  byte var4 = UnsafeUtil.getByte(var1++);
                  var5 ^= var4 << 28;
                  var5 ^= 266354560;
                  if (var4 >= 0 || UnsafeUtil.getByte(var1++) >= 0 || UnsafeUtil.getByte(var1++) >= 0 || UnsafeUtil.getByte(var1++) >= 0 || UnsafeUtil.getByte(var1++) >= 0 || UnsafeUtil.getByte(var1++) >= 0) {
                     break label47;
                  }
               }
            }

            return (int)this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var5;
      }

      private void skipRawVarint() throws IOException {
         if (this.remaining() >= 10) {
            this.skipRawVarintFastPath();
         } else {
            this.skipRawVarintSlowPath();
         }

      }

      private void skipRawVarintFastPath() throws IOException {
         for(int var1 = 0; var1 < 10; ++var1) {
            if (UnsafeUtil.getByte((long)(this.pos++)) >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      private void skipRawVarintSlowPath() throws IOException {
         for(int var1 = 0; var1 < 10; ++var1) {
            if (this.readRawByte() >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      public long readRawVarint64() throws IOException {
         long var1;
         long var3;
         label51: {
            var1 = this.pos;
            if (this.limit != var1) {
               byte var5;
               if ((var5 = UnsafeUtil.getByte(var1++)) >= 0) {
                  this.pos = var1;
                  return (long)var5;
               }

               if (this.limit - var1 >= 9L) {
                  int var6;
                  if ((var6 = var5 ^ UnsafeUtil.getByte(var1++) << 7) < 0) {
                     var3 = (long)(var6 ^ -128);
                     break label51;
                  }

                  if ((var6 ^= UnsafeUtil.getByte(var1++) << 14) >= 0) {
                     var3 = (long)(var6 ^ 16256);
                     break label51;
                  }

                  if ((var6 ^= UnsafeUtil.getByte(var1++) << 21) < 0) {
                     var3 = (long)(var6 ^ -2080896);
                     break label51;
                  }

                  if ((var3 = (long)var6 ^ (long)UnsafeUtil.getByte(var1++) << 28) >= 0L) {
                     var3 ^= 266354560L;
                     break label51;
                  }

                  if ((var3 ^= (long)UnsafeUtil.getByte(var1++) << 35) < 0L) {
                     var3 ^= -34093383808L;
                     break label51;
                  }

                  if ((var3 ^= (long)UnsafeUtil.getByte(var1++) << 42) >= 0L) {
                     var3 ^= 4363953127296L;
                     break label51;
                  }

                  if ((var3 ^= (long)UnsafeUtil.getByte(var1++) << 49) < 0L) {
                     var3 ^= -558586000294016L;
                     break label51;
                  }

                  var3 ^= (long)UnsafeUtil.getByte(var1++) << 56;
                  var3 ^= 71499008037633920L;
                  if (var3 >= 0L || (long)UnsafeUtil.getByte(var1++) >= 0L) {
                     break label51;
                  }
               }
            }

            return this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var3;
      }

      long readRawVarint64SlowPath() throws IOException {
         long var1 = 0L;

         for(int var3 = 0; var3 < 64; var3 += 7) {
            byte var4 = this.readRawByte();
            var1 |= (long)(var4 & 127) << var3;
            if ((var4 & 128) == 0) {
               return var1;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      public int readRawLittleEndian32() throws IOException {
         long var1 = this.pos;
         if (this.limit - var1 < 4L) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } else {
            this.pos = var1 + 4L;
            return UnsafeUtil.getByte(var1) & 255 | (UnsafeUtil.getByte(var1 + 1L) & 255) << 8 | (UnsafeUtil.getByte(var1 + 2L) & 255) << 16 | (UnsafeUtil.getByte(var1 + 3L) & 255) << 24;
         }
      }

      public long readRawLittleEndian64() throws IOException {
         long var1 = this.pos;
         if (this.limit - var1 < 8L) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } else {
            this.pos = var1 + 8L;
            return (long)UnsafeUtil.getByte(var1) & 255L | ((long)UnsafeUtil.getByte(var1 + 1L) & 255L) << 8 | ((long)UnsafeUtil.getByte(var1 + 2L) & 255L) << 16 | ((long)UnsafeUtil.getByte(var1 + 3L) & 255L) << 24 | ((long)UnsafeUtil.getByte(var1 + 4L) & 255L) << 32 | ((long)UnsafeUtil.getByte(var1 + 5L) & 255L) << 40 | ((long)UnsafeUtil.getByte(var1 + 6L) & 255L) << 48 | ((long)UnsafeUtil.getByte(var1 + 7L) & 255L) << 56;
         }
      }

      public void enableAliasing(boolean var1) {
         this.enableAliasing = var1;
      }

      public void resetSizeCounter() {
         this.startPos = this.pos;
      }

      public int pushLimit(int var1) throws InvalidProtocolBufferException {
         if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            var1 += this.getTotalBytesRead();
            int var2 = this.currentLimit;
            if (var1 > var2) {
               throw InvalidProtocolBufferException.truncatedMessage();
            } else {
               this.currentLimit = var1;
               this.recomputeBufferSizeAfterLimit();
               return var2;
            }
         }
      }

      public void popLimit(int var1) {
         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
      }

      public int getBytesUntilLimit() {
         return this.currentLimit == Integer.MAX_VALUE ? -1 : this.currentLimit - this.getTotalBytesRead();
      }

      public boolean isAtEnd() throws IOException {
         return this.pos == this.limit;
      }

      public int getTotalBytesRead() {
         return (int)(this.pos - this.startPos);
      }

      public byte readRawByte() throws IOException {
         if (this.pos == this.limit) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } else {
            return UnsafeUtil.getByte((long)(this.pos++));
         }
      }

      public byte[] readRawBytes(int var1) throws IOException {
         if (var1 >= 0 && var1 <= this.remaining()) {
            byte[] var2 = new byte[var1];
            this.slice(this.pos, this.pos + (long)var1).get(var2);
            this.pos += (long)var1;
            return var2;
         } else if (var1 <= 0) {
            if (var1 == 0) {
               return Internal.EMPTY_BYTE_ARRAY;
            } else {
               throw InvalidProtocolBufferException.negativeSize();
            }
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public void skipRawBytes(int var1) throws IOException {
         if (var1 >= 0 && var1 <= this.remaining()) {
            this.pos += (long)var1;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      private void recomputeBufferSizeAfterLimit() {
         this.limit += (long)this.bufferSizeAfterLimit;
         int var1 = (int)(this.limit - this.startPos);
         if (var1 > this.currentLimit) {
            this.bufferSizeAfterLimit = var1 - this.currentLimit;
            this.limit -= (long)this.bufferSizeAfterLimit;
         } else {
            this.bufferSizeAfterLimit = 0;
         }

      }

      private int remaining() {
         return (int)(this.limit - this.pos);
      }

      private int bufferPos(long var1) {
         return (int)(var1 - this.address);
      }

      private ByteBuffer slice(long var1, long var3) throws IOException {
         int var5 = this.buffer.position();
         int var6 = this.buffer.limit();

         ByteBuffer var7;
         try {
            this.buffer.position(this.bufferPos(var1));
            this.buffer.limit(this.bufferPos(var3));
            var7 = this.buffer.slice();
         } catch (IllegalArgumentException var11) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } finally {
            this.buffer.position(var5);
            this.buffer.limit(var6);
         }

         return var7;
      }

      // $FF: synthetic method
      UnsafeDirectNioDecoder(ByteBuffer var1, boolean var2, Object var3) {
         this(var1, var2);
      }
   }

   private static final class ArrayDecoder extends CodedInputStream {
      private final byte[] buffer;
      private final boolean immutable;
      private int limit;
      private int bufferSizeAfterLimit;
      private int pos;
      private int startPos;
      private int lastTag;
      private boolean enableAliasing;
      private int currentLimit;

      private ArrayDecoder(byte[] var1, int var2, int var3, boolean var4) {
         super(null);
         this.currentLimit = Integer.MAX_VALUE;
         this.buffer = var1;
         this.limit = var2 + var3;
         this.pos = var2;
         this.startPos = this.pos;
         this.immutable = var4;
      }

      public int readTag() throws IOException {
         if (this.isAtEnd()) {
            this.lastTag = 0;
            return 0;
         } else {
            this.lastTag = this.readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) == 0) {
               throw InvalidProtocolBufferException.invalidTag();
            } else {
               return this.lastTag;
            }
         }
      }

      public void checkLastTagWas(int var1) throws InvalidProtocolBufferException {
         if (this.lastTag != var1) {
            throw InvalidProtocolBufferException.invalidEndTag();
         }
      }

      public int getLastTag() {
         return this.lastTag;
      }

      public boolean skipField(int var1) throws IOException {
         switch(WireFormat.getTagWireType(var1)) {
         case 0:
            this.skipRawVarint();
            return true;
         case 1:
            this.skipRawBytes(8);
            return true;
         case 2:
            this.skipRawBytes(this.readRawVarint32());
            return true;
         case 3:
            this.skipMessage();
            this.checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4));
            return true;
         case 4:
            return false;
         case 5:
            this.skipRawBytes(4);
            return true;
         default:
            throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      public boolean skipField(int var1, CodedOutputStream var2) throws IOException {
         int var3;
         long var6;
         switch(WireFormat.getTagWireType(var1)) {
         case 0:
            var6 = this.readInt64();
            var2.writeRawVarint32(var1);
            var2.writeUInt64NoTag(var6);
            return true;
         case 1:
            var6 = this.readRawLittleEndian64();
            var2.writeRawVarint32(var1);
            var2.writeFixed64NoTag(var6);
            return true;
         case 2:
            ByteString var5 = this.readBytes();
            var2.writeRawVarint32(var1);
            var2.writeBytesNoTag(var5);
            return true;
         case 3:
            var2.writeRawVarint32(var1);
            this.skipMessage(var2);
            var3 = WireFormat.makeTag(WireFormat.getTagFieldNumber(var1), 4);
            this.checkLastTagWas(var3);
            var2.writeRawVarint32(var3);
            return true;
         case 4:
            return false;
         case 5:
            var3 = this.readRawLittleEndian32();
            var2.writeRawVarint32(var1);
            var2.writeFixed32NoTag(var3);
            return true;
         default:
            throw InvalidProtocolBufferException.invalidWireType();
         }
      }

      public void skipMessage() throws IOException {
         int var1;
         do {
            var1 = this.readTag();
         } while(var1 != 0 && this.skipField(var1));

      }

      public void skipMessage(CodedOutputStream var1) throws IOException {
         int var2;
         do {
            var2 = this.readTag();
         } while(var2 != 0 && this.skipField(var2, var1));

      }

      public double readDouble() throws IOException {
         return Double.longBitsToDouble(this.readRawLittleEndian64());
      }

      public float readFloat() throws IOException {
         return Float.intBitsToFloat(this.readRawLittleEndian32());
      }

      public long readUInt64() throws IOException {
         return this.readRawVarint64();
      }

      public long readInt64() throws IOException {
         return this.readRawVarint64();
      }

      public int readInt32() throws IOException {
         return this.readRawVarint32();
      }

      public long readFixed64() throws IOException {
         return this.readRawLittleEndian64();
      }

      public int readFixed32() throws IOException {
         return this.readRawLittleEndian32();
      }

      public boolean readBool() throws IOException {
         return this.readRawVarint64() != 0L;
      }

      public String readString() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.limit - this.pos) {
            String var2 = new String(this.buffer, this.pos, var1, Internal.UTF_8);
            this.pos += var1;
            return var2;
         } else if (var1 == 0) {
            return "";
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public String readStringRequireUtf8() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.limit - this.pos) {
            String var2 = Utf8.decodeUtf8(this.buffer, this.pos, var1);
            this.pos += var1;
            return var2;
         } else if (var1 == 0) {
            return "";
         } else if (var1 <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public void readGroup(int var1, MessageLite.Builder var2, ExtensionRegistryLite var3) throws IOException {
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            ++this.recursionDepth;
            var2.mergeFrom((CodedInputStream)this, var3);
            this.checkLastTagWas(WireFormat.makeTag(var1, 4));
            --this.recursionDepth;
         }
      }

      public MessageLite readGroup(int var1, Parser var2, ExtensionRegistryLite var3) throws IOException {
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            ++this.recursionDepth;
            MessageLite var4 = (MessageLite)var2.parsePartialFrom((CodedInputStream)this, var3);
            this.checkLastTagWas(WireFormat.makeTag(var1, 4));
            --this.recursionDepth;
            return var4;
         }
      }

      /** @deprecated */
      @Deprecated
      public void readUnknownGroup(int var1, MessageLite.Builder var2) throws IOException {
         this.readGroup(var1, var2, ExtensionRegistryLite.getEmptyRegistry());
      }

      public void readMessage(MessageLite.Builder var1, ExtensionRegistryLite var2) throws IOException {
         int var3 = this.readRawVarint32();
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            int var4 = this.pushLimit(var3);
            ++this.recursionDepth;
            var1.mergeFrom((CodedInputStream)this, var2);
            this.checkLastTagWas(0);
            --this.recursionDepth;
            this.popLimit(var4);
         }
      }

      public MessageLite readMessage(Parser var1, ExtensionRegistryLite var2) throws IOException {
         int var3 = this.readRawVarint32();
         if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
         } else {
            int var4 = this.pushLimit(var3);
            ++this.recursionDepth;
            MessageLite var5 = (MessageLite)var1.parsePartialFrom((CodedInputStream)this, var2);
            this.checkLastTagWas(0);
            --this.recursionDepth;
            this.popLimit(var4);
            return var5;
         }
      }

      public ByteString readBytes() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.limit - this.pos) {
            ByteString var2 = this.immutable && this.enableAliasing ? ByteString.wrap(this.buffer, this.pos, var1) : ByteString.copyFrom(this.buffer, this.pos, var1);
            this.pos += var1;
            return var2;
         } else {
            return var1 == 0 ? ByteString.EMPTY : ByteString.wrap(this.readRawBytes(var1));
         }
      }

      public byte[] readByteArray() throws IOException {
         int var1 = this.readRawVarint32();
         return this.readRawBytes(var1);
      }

      public ByteBuffer readByteBuffer() throws IOException {
         int var1 = this.readRawVarint32();
         if (var1 > 0 && var1 <= this.limit - this.pos) {
            ByteBuffer var2 = !this.immutable && this.enableAliasing ? ByteBuffer.wrap(this.buffer, this.pos, var1).slice() : ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, this.pos, this.pos + var1));
            this.pos += var1;
            return var2;
         } else if (var1 == 0) {
            return Internal.EMPTY_BYTE_BUFFER;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public int readUInt32() throws IOException {
         return this.readRawVarint32();
      }

      public int readEnum() throws IOException {
         return this.readRawVarint32();
      }

      public int readSFixed32() throws IOException {
         return this.readRawLittleEndian32();
      }

      public long readSFixed64() throws IOException {
         return this.readRawLittleEndian64();
      }

      public int readSInt32() throws IOException {
         return decodeZigZag32(this.readRawVarint32());
      }

      public long readSInt64() throws IOException {
         return decodeZigZag64(this.readRawVarint64());
      }

      public int readRawVarint32() throws IOException {
         int var1;
         int var5;
         label47: {
            var1 = this.pos;
            if (this.limit != var1) {
               byte[] var2 = this.buffer;
               byte var3;
               if ((var3 = var2[var1++]) >= 0) {
                  this.pos = var1;
                  return var3;
               }

               if (this.limit - var1 >= 9) {
                  if ((var5 = var3 ^ var2[var1++] << 7) < 0) {
                     var5 ^= -128;
                     break label47;
                  }

                  if ((var5 ^= var2[var1++] << 14) >= 0) {
                     var5 ^= 16256;
                     break label47;
                  }

                  if ((var5 ^= var2[var1++] << 21) < 0) {
                     var5 ^= -2080896;
                     break label47;
                  }

                  byte var4 = var2[var1++];
                  var5 ^= var4 << 28;
                  var5 ^= 266354560;
                  if (var4 >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0 || var2[var1++] >= 0) {
                     break label47;
                  }
               }
            }

            return (int)this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var5;
      }

      private void skipRawVarint() throws IOException {
         if (this.limit - this.pos >= 10) {
            this.skipRawVarintFastPath();
         } else {
            this.skipRawVarintSlowPath();
         }

      }

      private void skipRawVarintFastPath() throws IOException {
         for(int var1 = 0; var1 < 10; ++var1) {
            if (this.buffer[this.pos++] >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      private void skipRawVarintSlowPath() throws IOException {
         for(int var1 = 0; var1 < 10; ++var1) {
            if (this.readRawByte() >= 0) {
               return;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      public long readRawVarint64() throws IOException {
         int var1;
         long var3;
         label51: {
            var1 = this.pos;
            if (this.limit != var1) {
               byte[] var2 = this.buffer;
               byte var5;
               if ((var5 = var2[var1++]) >= 0) {
                  this.pos = var1;
                  return (long)var5;
               }

               if (this.limit - var1 >= 9) {
                  int var6;
                  if ((var6 = var5 ^ var2[var1++] << 7) < 0) {
                     var3 = (long)(var6 ^ -128);
                     break label51;
                  }

                  if ((var6 ^= var2[var1++] << 14) >= 0) {
                     var3 = (long)(var6 ^ 16256);
                     break label51;
                  }

                  if ((var6 ^= var2[var1++] << 21) < 0) {
                     var3 = (long)(var6 ^ -2080896);
                     break label51;
                  }

                  if ((var3 = (long)var6 ^ (long)var2[var1++] << 28) >= 0L) {
                     var3 ^= 266354560L;
                     break label51;
                  }

                  if ((var3 ^= (long)var2[var1++] << 35) < 0L) {
                     var3 ^= -34093383808L;
                     break label51;
                  }

                  if ((var3 ^= (long)var2[var1++] << 42) >= 0L) {
                     var3 ^= 4363953127296L;
                     break label51;
                  }

                  if ((var3 ^= (long)var2[var1++] << 49) < 0L) {
                     var3 ^= -558586000294016L;
                     break label51;
                  }

                  var3 ^= (long)var2[var1++] << 56;
                  var3 ^= 71499008037633920L;
                  if (var3 >= 0L || (long)var2[var1++] >= 0L) {
                     break label51;
                  }
               }
            }

            return this.readRawVarint64SlowPath();
         }

         this.pos = var1;
         return var3;
      }

      long readRawVarint64SlowPath() throws IOException {
         long var1 = 0L;

         for(int var3 = 0; var3 < 64; var3 += 7) {
            byte var4 = this.readRawByte();
            var1 |= (long)(var4 & 127) << var3;
            if ((var4 & 128) == 0) {
               return var1;
            }
         }

         throw InvalidProtocolBufferException.malformedVarint();
      }

      public int readRawLittleEndian32() throws IOException {
         int var1 = this.pos;
         if (this.limit - var1 < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } else {
            byte[] var2 = this.buffer;
            this.pos = var1 + 4;
            return var2[var1] & 255 | (var2[var1 + 1] & 255) << 8 | (var2[var1 + 2] & 255) << 16 | (var2[var1 + 3] & 255) << 24;
         }
      }

      public long readRawLittleEndian64() throws IOException {
         int var1 = this.pos;
         if (this.limit - var1 < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } else {
            byte[] var2 = this.buffer;
            this.pos = var1 + 8;
            return (long)var2[var1] & 255L | ((long)var2[var1 + 1] & 255L) << 8 | ((long)var2[var1 + 2] & 255L) << 16 | ((long)var2[var1 + 3] & 255L) << 24 | ((long)var2[var1 + 4] & 255L) << 32 | ((long)var2[var1 + 5] & 255L) << 40 | ((long)var2[var1 + 6] & 255L) << 48 | ((long)var2[var1 + 7] & 255L) << 56;
         }
      }

      public void enableAliasing(boolean var1) {
         this.enableAliasing = var1;
      }

      public void resetSizeCounter() {
         this.startPos = this.pos;
      }

      public int pushLimit(int var1) throws InvalidProtocolBufferException {
         if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            var1 += this.getTotalBytesRead();
            int var2 = this.currentLimit;
            if (var1 > var2) {
               throw InvalidProtocolBufferException.truncatedMessage();
            } else {
               this.currentLimit = var1;
               this.recomputeBufferSizeAfterLimit();
               return var2;
            }
         }
      }

      private void recomputeBufferSizeAfterLimit() {
         this.limit += this.bufferSizeAfterLimit;
         int var1 = this.limit - this.startPos;
         if (var1 > this.currentLimit) {
            this.bufferSizeAfterLimit = var1 - this.currentLimit;
            this.limit -= this.bufferSizeAfterLimit;
         } else {
            this.bufferSizeAfterLimit = 0;
         }

      }

      public void popLimit(int var1) {
         this.currentLimit = var1;
         this.recomputeBufferSizeAfterLimit();
      }

      public int getBytesUntilLimit() {
         return this.currentLimit == Integer.MAX_VALUE ? -1 : this.currentLimit - this.getTotalBytesRead();
      }

      public boolean isAtEnd() throws IOException {
         return this.pos == this.limit;
      }

      public int getTotalBytesRead() {
         return this.pos - this.startPos;
      }

      public byte readRawByte() throws IOException {
         if (this.pos == this.limit) {
            throw InvalidProtocolBufferException.truncatedMessage();
         } else {
            return this.buffer[this.pos++];
         }
      }

      public byte[] readRawBytes(int var1) throws IOException {
         if (var1 > 0 && var1 <= this.limit - this.pos) {
            int var2 = this.pos;
            this.pos += var1;
            return Arrays.copyOfRange(this.buffer, var2, this.pos);
         } else if (var1 <= 0) {
            if (var1 == 0) {
               return Internal.EMPTY_BYTE_ARRAY;
            } else {
               throw InvalidProtocolBufferException.negativeSize();
            }
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      public void skipRawBytes(int var1) throws IOException {
         if (var1 >= 0 && var1 <= this.limit - this.pos) {
            this.pos += var1;
         } else if (var1 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
         } else {
            throw InvalidProtocolBufferException.truncatedMessage();
         }
      }

      // $FF: synthetic method
      ArrayDecoder(byte[] var1, int var2, int var3, boolean var4, Object var5) {
         this(var1, var2, var3, var4);
      }
   }
}
