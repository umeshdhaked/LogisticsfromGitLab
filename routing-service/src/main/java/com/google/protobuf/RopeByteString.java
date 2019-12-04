package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class RopeByteString extends ByteString {
   static final int[] minLengthByDepth = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
   private final int totalLength;
   private final ByteString left;
   private final ByteString right;
   private final int leftLength;
   private final int treeDepth;
   private static final long serialVersionUID = 1L;

   private RopeByteString(ByteString var1, ByteString var2) {
      this.left = var1;
      this.right = var2;
      this.leftLength = var1.size();
      this.totalLength = this.leftLength + var2.size();
      this.treeDepth = Math.max(var1.getTreeDepth(), var2.getTreeDepth()) + 1;
   }

   static ByteString concatenate(ByteString var0, ByteString var1) {
      if (var1.size() == 0) {
         return var0;
      } else if (var0.size() == 0) {
         return var1;
      } else {
         int var2 = var0.size() + var1.size();
         if (var2 < 128) {
            return concatenateBytes(var0, var1);
         } else {
            if (var0 instanceof RopeByteString) {
               RopeByteString var3 = (RopeByteString)var0;
               if (var3.right.size() + var1.size() < 128) {
                  ByteString var6 = concatenateBytes(var3.right, var1);
                  return new RopeByteString(var3.left, var6);
               }

               if (var3.left.getTreeDepth() > var3.right.getTreeDepth() && var3.getTreeDepth() > var1.getTreeDepth()) {
                  RopeByteString var4 = new RopeByteString(var3.right, var1);
                  return new RopeByteString(var3.left, var4);
               }
            }

            int var5 = Math.max(var0.getTreeDepth(), var1.getTreeDepth()) + 1;
            return (ByteString)(var2 >= minLengthByDepth[var5] ? new RopeByteString(var0, var1) : (new RopeByteString.Balancer()).balance(var0, var1));
         }
      }
   }

   private static ByteString concatenateBytes(ByteString var0, ByteString var1) {
      int var2 = var0.size();
      int var3 = var1.size();
      byte[] var4 = new byte[var2 + var3];
      var0.copyTo(var4, 0, 0, var2);
      var1.copyTo(var4, 0, var2, var3);
      return ByteString.wrap(var4);
   }

   static RopeByteString newInstanceForTest(ByteString var0, ByteString var1) {
      return new RopeByteString(var0, var1);
   }

   public byte byteAt(int var1) {
      checkIndex(var1, this.totalLength);
      return this.internalByteAt(var1);
   }

   byte internalByteAt(int var1) {
      return var1 < this.leftLength ? this.left.internalByteAt(var1) : this.right.internalByteAt(var1 - this.leftLength);
   }

   public int size() {
      return this.totalLength;
   }

   public ByteString.ByteIterator iterator() {
      return new ByteString.AbstractByteIterator() {
         final RopeByteString.PieceIterator pieces = new RopeByteString.PieceIterator(RopeByteString.this);
         ByteString.ByteIterator current = this.nextPiece();

         private ByteString.ByteIterator nextPiece() {
            return this.pieces.hasNext() ? this.pieces.next().iterator() : null;
         }

         public boolean hasNext() {
            return this.current != null;
         }

         public byte nextByte() {
            if (this.current == null) {
               throw new NoSuchElementException();
            } else {
               byte var1 = this.current.nextByte();
               if (!this.current.hasNext()) {
                  this.current = this.nextPiece();
               }

               return var1;
            }
         }
      };
   }

   protected int getTreeDepth() {
      return this.treeDepth;
   }

   protected boolean isBalanced() {
      return this.totalLength >= minLengthByDepth[this.treeDepth];
   }

   public ByteString substring(int var1, int var2) {
      int var3 = checkRange(var1, var2, this.totalLength);
      if (var3 == 0) {
         return ByteString.EMPTY;
      } else if (var3 == this.totalLength) {
         return this;
      } else if (var2 <= this.leftLength) {
         return this.left.substring(var1, var2);
      } else if (var1 >= this.leftLength) {
         return this.right.substring(var1 - this.leftLength, var2 - this.leftLength);
      } else {
         ByteString var4 = this.left.substring(var1);
         ByteString var5 = this.right.substring(0, var2 - this.leftLength);
         return new RopeByteString(var4, var5);
      }
   }

   protected void copyToInternal(byte[] var1, int var2, int var3, int var4) {
      if (var2 + var4 <= this.leftLength) {
         this.left.copyToInternal(var1, var2, var3, var4);
      } else if (var2 >= this.leftLength) {
         this.right.copyToInternal(var1, var2 - this.leftLength, var3, var4);
      } else {
         int var5 = this.leftLength - var2;
         this.left.copyToInternal(var1, var2, var3, var5);
         this.right.copyToInternal(var1, 0, var3 + var5, var4 - var5);
      }

   }

   public void copyTo(ByteBuffer var1) {
      this.left.copyTo(var1);
      this.right.copyTo(var1);
   }

   public ByteBuffer asReadOnlyByteBuffer() {
      ByteBuffer var1 = ByteBuffer.wrap(this.toByteArray());
      return var1.asReadOnlyBuffer();
   }

   public List asReadOnlyByteBufferList() {
      ArrayList var1 = new ArrayList();
      RopeByteString.PieceIterator var2 = new RopeByteString.PieceIterator(this);

      while(var2.hasNext()) {
         ByteString.LeafByteString var3 = var2.next();
         var1.add(var3.asReadOnlyByteBuffer());
      }

      return var1;
   }

   public void writeTo(OutputStream var1) throws IOException {
      this.left.writeTo(var1);
      this.right.writeTo(var1);
   }

   void writeToInternal(OutputStream var1, int var2, int var3) throws IOException {
      if (var2 + var3 <= this.leftLength) {
         this.left.writeToInternal(var1, var2, var3);
      } else if (var2 >= this.leftLength) {
         this.right.writeToInternal(var1, var2 - this.leftLength, var3);
      } else {
         int var4 = this.leftLength - var2;
         this.left.writeToInternal(var1, var2, var4);
         this.right.writeToInternal(var1, 0, var3 - var4);
      }

   }

   void writeTo(ByteOutput var1) throws IOException {
      this.left.writeTo(var1);
      this.right.writeTo(var1);
   }

   void writeToReverse(ByteOutput var1) throws IOException {
      this.right.writeToReverse(var1);
      this.left.writeToReverse(var1);
   }

   protected String toStringInternal(Charset var1) {
      return new String(this.toByteArray(), var1);
   }

   public boolean isValidUtf8() {
      int var1 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
      int var2 = this.right.partialIsValidUtf8(var1, 0, this.right.size());
      return var2 == 0;
   }

   protected int partialIsValidUtf8(int var1, int var2, int var3) {
      int var4 = var2 + var3;
      if (var4 <= this.leftLength) {
         return this.left.partialIsValidUtf8(var1, var2, var3);
      } else if (var2 >= this.leftLength) {
         return this.right.partialIsValidUtf8(var1, var2 - this.leftLength, var3);
      } else {
         int var5 = this.leftLength - var2;
         int var6 = this.left.partialIsValidUtf8(var1, var2, var5);
         return this.right.partialIsValidUtf8(var6, 0, var3 - var5);
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ByteString)) {
         return false;
      } else {
         ByteString var2 = (ByteString)var1;
         if (this.totalLength != var2.size()) {
            return false;
         } else if (this.totalLength == 0) {
            return true;
         } else {
            int var3 = this.peekCachedHashCode();
            int var4 = var2.peekCachedHashCode();
            return var3 != 0 && var4 != 0 && var3 != var4 ? false : this.equalsFragments(var2);
         }
      }
   }

   private boolean equalsFragments(ByteString var1) {
      int var2 = 0;
      RopeByteString.PieceIterator var3 = new RopeByteString.PieceIterator(this);
      ByteString.LeafByteString var4 = (ByteString.LeafByteString)var3.next();
      int var5 = 0;
      RopeByteString.PieceIterator var6 = new RopeByteString.PieceIterator(var1);
      ByteString.LeafByteString var7 = (ByteString.LeafByteString)var6.next();
      int var8 = 0;

      while(true) {
         int var9 = var4.size() - var2;
         int var10 = var7.size() - var5;
         int var11 = Math.min(var9, var10);
         boolean var12 = var2 == 0 ? var4.equalsRange(var7, var5, var11) : var7.equalsRange(var4, var2, var11);
         if (!var12) {
            return false;
         }

         var8 += var11;
         if (var8 >= this.totalLength) {
            if (var8 == this.totalLength) {
               return true;
            }

            throw new IllegalStateException();
         }

         if (var11 == var9) {
            var2 = 0;
            var4 = (ByteString.LeafByteString)var3.next();
         } else {
            var2 += var11;
         }

         if (var11 == var10) {
            var5 = 0;
            var7 = (ByteString.LeafByteString)var6.next();
         } else {
            var5 += var11;
         }
      }
   }

   protected int partialHash(int var1, int var2, int var3) {
      int var4 = var2 + var3;
      if (var4 <= this.leftLength) {
         return this.left.partialHash(var1, var2, var3);
      } else if (var2 >= this.leftLength) {
         return this.right.partialHash(var1, var2 - this.leftLength, var3);
      } else {
         int var5 = this.leftLength - var2;
         int var6 = this.left.partialHash(var1, var2, var5);
         return this.right.partialHash(var6, 0, var3 - var5);
      }
   }

   public CodedInputStream newCodedInput() {
      return CodedInputStream.newInstance((InputStream)(new RopeByteString.RopeInputStream()));
   }

   public InputStream newInput() {
      return new RopeByteString.RopeInputStream();
   }

   Object writeReplace() {
      return ByteString.wrap(this.toByteArray());
   }

   private void readObject(ObjectInputStream var1) throws IOException {
      throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
   }

   // $FF: synthetic method
   RopeByteString(ByteString var1, ByteString var2, Object var3) {
      this(var1, var2);
   }

   private class RopeInputStream extends InputStream {
      private RopeByteString.PieceIterator pieceIterator;
      private ByteString.LeafByteString currentPiece;
      private int currentPieceSize;
      private int currentPieceIndex;
      private int currentPieceOffsetInRope;
      private int mark;

      public RopeInputStream() {
         this.initialize();
      }

      public int read(byte[] var1, int var2, int var3) {
         if (var1 == null) {
            throw new NullPointerException();
         } else if (var2 >= 0 && var3 >= 0 && var3 <= var1.length - var2) {
            return this.readSkipInternal(var1, var2, var3);
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      public long skip(long var1) {
         if (var1 < 0L) {
            throw new IndexOutOfBoundsException();
         } else {
            if (var1 > 2147483647L) {
               var1 = 2147483647L;
            }

            return (long)this.readSkipInternal((byte[])null, 0, (int)var1);
         }
      }

      private int readSkipInternal(byte[] var1, int var2, int var3) {
         int var4;
         int var6;
         for(var4 = var3; var4 > 0; var4 -= var6) {
            this.advanceIfCurrentPieceFullyRead();
            if (this.currentPiece == null) {
               if (var4 == var3) {
                  return -1;
               }
               break;
            }

            int var5 = this.currentPieceSize - this.currentPieceIndex;
            var6 = Math.min(var5, var4);
            if (var1 != null) {
               this.currentPiece.copyTo(var1, this.currentPieceIndex, var2, var6);
               var2 += var6;
            }

            this.currentPieceIndex += var6;
         }

         return var3 - var4;
      }

      public int read() throws IOException {
         this.advanceIfCurrentPieceFullyRead();
         return this.currentPiece == null ? -1 : this.currentPiece.byteAt(this.currentPieceIndex++) & 255;
      }

      public int available() throws IOException {
         int var1 = this.currentPieceOffsetInRope + this.currentPieceIndex;
         return RopeByteString.this.size() - var1;
      }

      public boolean markSupported() {
         return true;
      }

      public void mark(int var1) {
         this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
      }

      public synchronized void reset() {
         this.initialize();
         this.readSkipInternal((byte[])null, 0, this.mark);
      }

      private void initialize() {
         this.pieceIterator = new RopeByteString.PieceIterator(RopeByteString.this);
         this.currentPiece = this.pieceIterator.next();
         this.currentPieceSize = this.currentPiece.size();
         this.currentPieceIndex = 0;
         this.currentPieceOffsetInRope = 0;
      }

      private void advanceIfCurrentPieceFullyRead() {
         if (this.currentPiece != null && this.currentPieceIndex == this.currentPieceSize) {
            this.currentPieceOffsetInRope += this.currentPieceSize;
            this.currentPieceIndex = 0;
            if (this.pieceIterator.hasNext()) {
               this.currentPiece = this.pieceIterator.next();
               this.currentPieceSize = this.currentPiece.size();
            } else {
               this.currentPiece = null;
               this.currentPieceSize = 0;
            }
         }

      }
   }

   private static final class PieceIterator implements Iterator {
      private final ArrayDeque breadCrumbs;
      private ByteString.LeafByteString next;

      private PieceIterator(ByteString var1) {
         if (var1 instanceof RopeByteString) {
            RopeByteString var2 = (RopeByteString)var1;
            this.breadCrumbs = new ArrayDeque(var2.getTreeDepth());
            this.breadCrumbs.push(var2);
            this.next = this.getLeafByLeft(var2.left);
         } else {
            this.breadCrumbs = null;
            this.next = (ByteString.LeafByteString)var1;
         }

      }

      private ByteString.LeafByteString getLeafByLeft(ByteString var1) {
         ByteString var2;
         RopeByteString var3;
         for(var2 = var1; var2 instanceof RopeByteString; var2 = var3.left) {
            var3 = (RopeByteString)var2;
            this.breadCrumbs.push(var3);
         }

         return (ByteString.LeafByteString)var2;
      }

      private ByteString.LeafByteString getNextNonEmptyLeaf() {
         while(true) {
            if (this.breadCrumbs != null && !this.breadCrumbs.isEmpty()) {
               ByteString.LeafByteString var1 = this.getLeafByLeft(((RopeByteString)this.breadCrumbs.pop()).right);
               if (var1.isEmpty()) {
                  continue;
               }

               return var1;
            }

            return null;
         }
      }

      public boolean hasNext() {
         return this.next != null;
      }

      public ByteString.LeafByteString next() {
         if (this.next == null) {
            throw new NoSuchElementException();
         } else {
            ByteString.LeafByteString var1 = this.next;
            this.next = this.getNextNonEmptyLeaf();
            return var1;
         }
      }

      public void remove() {
         throw new UnsupportedOperationException();
      }

      // $FF: synthetic method
      PieceIterator(ByteString var1, Object var2) {
         this(var1);
      }
   }

   private static class Balancer {
      private final ArrayDeque prefixesStack;

      private Balancer() {
         this.prefixesStack = new ArrayDeque();
      }

      private ByteString balance(ByteString var1, ByteString var2) {
         this.doBalance(var1);
         this.doBalance(var2);

         Object var3;
         ByteString var4;
         for(var3 = (ByteString)this.prefixesStack.pop(); !this.prefixesStack.isEmpty(); var3 = new RopeByteString(var4, (ByteString)var3)) {
            var4 = (ByteString)this.prefixesStack.pop();
         }

         return (ByteString)var3;
      }

      private void doBalance(ByteString var1) {
         if (var1.isBalanced()) {
            this.insert(var1);
         } else {
            if (!(var1 instanceof RopeByteString)) {
               throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + var1.getClass());
            }

            RopeByteString var2 = (RopeByteString)var1;
            this.doBalance(var2.left);
            this.doBalance(var2.right);
         }

      }

      private void insert(ByteString var1) {
         int var2 = this.getDepthBinForLength(var1.size());
         int var3 = RopeByteString.minLengthByDepth[var2 + 1];
         if (!this.prefixesStack.isEmpty() && ((ByteString)this.prefixesStack.peek()).size() < var3) {
            int var4 = RopeByteString.minLengthByDepth[var2];

            Object var5;
            ByteString var6;
            for(var5 = (ByteString)this.prefixesStack.pop(); !this.prefixesStack.isEmpty() && ((ByteString)this.prefixesStack.peek()).size() < var4; var5 = new RopeByteString(var6, (ByteString)var5)) {
               var6 = (ByteString)this.prefixesStack.pop();
            }

            RopeByteString var7;
            for(var7 = new RopeByteString((ByteString)var5, var1); !this.prefixesStack.isEmpty(); var7 = new RopeByteString(var6, var7)) {
               var2 = this.getDepthBinForLength(var7.size());
               var3 = RopeByteString.minLengthByDepth[var2 + 1];
               if (((ByteString)this.prefixesStack.peek()).size() >= var3) {
                  break;
               }

               var6 = (ByteString)this.prefixesStack.pop();
            }

            this.prefixesStack.push(var7);
         } else {
            this.prefixesStack.push(var1);
         }

      }

      private int getDepthBinForLength(int var1) {
         int var2 = Arrays.binarySearch(RopeByteString.minLengthByDepth, var1);
         if (var2 < 0) {
            int var3 = -(var2 + 1);
            var2 = var3 - 1;
         }

         return var2;
      }

      // $FF: synthetic method
      Balancer(Object var1) {
         this();
      }
   }
}
