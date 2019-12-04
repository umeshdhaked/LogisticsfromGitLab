package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

class IterableByteBufferInputStream extends InputStream {
   private Iterator iterator;
   private ByteBuffer currentByteBuffer;
   private int dataSize;
   private int currentIndex;
   private int currentByteBufferPos;
   private boolean hasArray;
   private byte[] currentArray;
   private int currentArrayOffset;
   private long currentAddress;

   IterableByteBufferInputStream(Iterable var1) {
      this.iterator = var1.iterator();
      this.dataSize = 0;

      for(Iterator var2 = var1.iterator(); var2.hasNext(); ++this.dataSize) {
         ByteBuffer var3 = (ByteBuffer)var2.next();
      }

      this.currentIndex = -1;
      if (!this.getNextByteBuffer()) {
         this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
         this.currentIndex = 0;
         this.currentByteBufferPos = 0;
         this.currentAddress = 0L;
      }

   }

   private boolean getNextByteBuffer() {
      ++this.currentIndex;
      if (!this.iterator.hasNext()) {
         return false;
      } else {
         this.currentByteBuffer = (ByteBuffer)this.iterator.next();
         this.currentByteBufferPos = this.currentByteBuffer.position();
         if (this.currentByteBuffer.hasArray()) {
            this.hasArray = true;
            this.currentArray = this.currentByteBuffer.array();
            this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
         } else {
            this.hasArray = false;
            this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentArray = null;
         }

         return true;
      }
   }

   private void updateCurrentByteBufferPos(int var1) {
      this.currentByteBufferPos += var1;
      if (this.currentByteBufferPos == this.currentByteBuffer.limit()) {
         this.getNextByteBuffer();
      }

   }

   public int read() throws IOException {
      if (this.currentIndex == this.dataSize) {
         return -1;
      } else {
         int var1;
         if (this.hasArray) {
            var1 = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & 255;
            this.updateCurrentByteBufferPos(1);
            return var1;
         } else {
            var1 = UnsafeUtil.getByte((long)this.currentByteBufferPos + this.currentAddress) & 255;
            this.updateCurrentByteBufferPos(1);
            return var1;
         }
      }
   }

   public int read(byte[] var1, int var2, int var3) throws IOException {
      if (this.currentIndex == this.dataSize) {
         return -1;
      } else {
         int var4 = this.currentByteBuffer.limit() - this.currentByteBufferPos;
         if (var3 > var4) {
            var3 = var4;
         }

         if (this.hasArray) {
            System.arraycopy(this.currentArray, this.currentByteBufferPos + this.currentArrayOffset, var1, var2, var3);
            this.updateCurrentByteBufferPos(var3);
         } else {
            int var5 = this.currentByteBuffer.position();
            this.currentByteBuffer.position(this.currentByteBufferPos);
            this.currentByteBuffer.get(var1, var2, var3);
            this.currentByteBuffer.position(var5);
            this.updateCurrentByteBufferPos(var3);
         }

         return var3;
      }
   }
}
