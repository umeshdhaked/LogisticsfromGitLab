package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RepeatedFieldBuilderV3 implements AbstractMessage.BuilderParent {
   private AbstractMessage.BuilderParent parent;
   private List messages;
   private boolean isMessagesListMutable;
   private List builders;
   private boolean isClean;
   private RepeatedFieldBuilderV3.MessageExternalList externalMessageList;
   private RepeatedFieldBuilderV3.BuilderExternalList externalBuilderList;
   private RepeatedFieldBuilderV3.MessageOrBuilderExternalList externalMessageOrBuilderList;

   public RepeatedFieldBuilderV3(List var1, boolean var2, AbstractMessage.BuilderParent var3, boolean var4) {
      this.messages = var1;
      this.isMessagesListMutable = var2;
      this.parent = var3;
      this.isClean = var4;
   }

   public void dispose() {
      this.parent = null;
   }

   private void ensureMutableMessageList() {
      if (!this.isMessagesListMutable) {
         this.messages = new ArrayList(this.messages);
         this.isMessagesListMutable = true;
      }

   }

   private void ensureBuilders() {
      if (this.builders == null) {
         this.builders = new ArrayList(this.messages.size());

         for(int var1 = 0; var1 < this.messages.size(); ++var1) {
            this.builders.add((Object)null);
         }
      }

   }

   public int getCount() {
      return this.messages.size();
   }

   public boolean isEmpty() {
      return this.messages.isEmpty();
   }

   public AbstractMessage getMessage(int var1) {
      return this.getMessage(var1, false);
   }

   private AbstractMessage getMessage(int var1, boolean var2) {
      if (this.builders == null) {
         return (AbstractMessage)this.messages.get(var1);
      } else {
         SingleFieldBuilderV3 var3 = (SingleFieldBuilderV3)this.builders.get(var1);
         if (var3 == null) {
            return (AbstractMessage)this.messages.get(var1);
         } else {
            return var2 ? var3.build() : var3.getMessage();
         }
      }
   }

   public AbstractMessage.Builder getBuilder(int var1) {
      this.ensureBuilders();
      SingleFieldBuilderV3 var2 = (SingleFieldBuilderV3)this.builders.get(var1);
      if (var2 == null) {
         AbstractMessage var3 = (AbstractMessage)this.messages.get(var1);
         var2 = new SingleFieldBuilderV3(var3, this, this.isClean);
         this.builders.set(var1, var2);
      }

      return var2.getBuilder();
   }

   public MessageOrBuilder getMessageOrBuilder(int var1) {
      if (this.builders == null) {
         return (MessageOrBuilder)this.messages.get(var1);
      } else {
         SingleFieldBuilderV3 var2 = (SingleFieldBuilderV3)this.builders.get(var1);
         return var2 == null ? (MessageOrBuilder)this.messages.get(var1) : var2.getMessageOrBuilder();
      }
   }

   public RepeatedFieldBuilderV3 setMessage(int var1, AbstractMessage var2) {
      Internal.checkNotNull(var2);
      this.ensureMutableMessageList();
      this.messages.set(var1, var2);
      if (this.builders != null) {
         SingleFieldBuilderV3 var3 = (SingleFieldBuilderV3)this.builders.set(var1, (Object)null);
         if (var3 != null) {
            var3.dispose();
         }
      }

      this.onChanged();
      this.incrementModCounts();
      return this;
   }

   public RepeatedFieldBuilderV3 addMessage(AbstractMessage var1) {
      Internal.checkNotNull(var1);
      this.ensureMutableMessageList();
      this.messages.add(var1);
      if (this.builders != null) {
         this.builders.add((Object)null);
      }

      this.onChanged();
      this.incrementModCounts();
      return this;
   }

   public RepeatedFieldBuilderV3 addMessage(int var1, AbstractMessage var2) {
      Internal.checkNotNull(var2);
      this.ensureMutableMessageList();
      this.messages.add(var1, var2);
      if (this.builders != null) {
         this.builders.add(var1, (Object)null);
      }

      this.onChanged();
      this.incrementModCounts();
      return this;
   }

   public RepeatedFieldBuilderV3 addAllMessages(Iterable var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         AbstractMessage var3 = (AbstractMessage)var2.next();
         Internal.checkNotNull(var3);
      }

      int var5 = -1;
      if (var1 instanceof Collection) {
         Collection var6 = (Collection)var1;
         if (var6.size() == 0) {
            return this;
         }

         var5 = var6.size();
      }

      this.ensureMutableMessageList();
      if (var5 >= 0 && this.messages instanceof ArrayList) {
         ((ArrayList)this.messages).ensureCapacity(this.messages.size() + var5);
      }

      Iterator var7 = var1.iterator();

      while(var7.hasNext()) {
         AbstractMessage var4 = (AbstractMessage)var7.next();
         this.addMessage(var4);
      }

      this.onChanged();
      this.incrementModCounts();
      return this;
   }

   public AbstractMessage.Builder addBuilder(AbstractMessage var1) {
      this.ensureMutableMessageList();
      this.ensureBuilders();
      SingleFieldBuilderV3 var2 = new SingleFieldBuilderV3(var1, this, this.isClean);
      this.messages.add((Object)null);
      this.builders.add(var2);
      this.onChanged();
      this.incrementModCounts();
      return var2.getBuilder();
   }

   public AbstractMessage.Builder addBuilder(int var1, AbstractMessage var2) {
      this.ensureMutableMessageList();
      this.ensureBuilders();
      SingleFieldBuilderV3 var3 = new SingleFieldBuilderV3(var2, this, this.isClean);
      this.messages.add(var1, (Object)null);
      this.builders.add(var1, var3);
      this.onChanged();
      this.incrementModCounts();
      return var3.getBuilder();
   }

   public void remove(int var1) {
      this.ensureMutableMessageList();
      this.messages.remove(var1);
      if (this.builders != null) {
         SingleFieldBuilderV3 var2 = (SingleFieldBuilderV3)this.builders.remove(var1);
         if (var2 != null) {
            var2.dispose();
         }
      }

      this.onChanged();
      this.incrementModCounts();
   }

   public void clear() {
      this.messages = Collections.emptyList();
      this.isMessagesListMutable = false;
      if (this.builders != null) {
         Iterator var1 = this.builders.iterator();

         while(var1.hasNext()) {
            SingleFieldBuilderV3 var2 = (SingleFieldBuilderV3)var1.next();
            if (var2 != null) {
               var2.dispose();
            }
         }

         this.builders = null;
      }

      this.onChanged();
      this.incrementModCounts();
   }

   public List build() {
      this.isClean = true;
      if (!this.isMessagesListMutable && this.builders == null) {
         return this.messages;
      } else {
         boolean var1 = true;
         int var2;
         if (!this.isMessagesListMutable) {
            for(var2 = 0; var2 < this.messages.size(); ++var2) {
               Message var3 = (Message)this.messages.get(var2);
               SingleFieldBuilderV3 var4 = (SingleFieldBuilderV3)this.builders.get(var2);
               if (var4 != null && var4.build() != var3) {
                  var1 = false;
                  break;
               }
            }

            if (var1) {
               return this.messages;
            }
         }

         this.ensureMutableMessageList();

         for(var2 = 0; var2 < this.messages.size(); ++var2) {
            this.messages.set(var2, this.getMessage(var2, true));
         }

         this.messages = Collections.unmodifiableList(this.messages);
         this.isMessagesListMutable = false;
         return this.messages;
      }
   }

   public List getMessageList() {
      if (this.externalMessageList == null) {
         this.externalMessageList = new RepeatedFieldBuilderV3.MessageExternalList(this);
      }

      return this.externalMessageList;
   }

   public List getBuilderList() {
      if (this.externalBuilderList == null) {
         this.externalBuilderList = new RepeatedFieldBuilderV3.BuilderExternalList(this);
      }

      return this.externalBuilderList;
   }

   public List getMessageOrBuilderList() {
      if (this.externalMessageOrBuilderList == null) {
         this.externalMessageOrBuilderList = new RepeatedFieldBuilderV3.MessageOrBuilderExternalList(this);
      }

      return this.externalMessageOrBuilderList;
   }

   private void onChanged() {
      if (this.isClean && this.parent != null) {
         this.parent.markDirty();
         this.isClean = false;
      }

   }

   public void markDirty() {
      this.onChanged();
   }

   private void incrementModCounts() {
      if (this.externalMessageList != null) {
         this.externalMessageList.incrementModCount();
      }

      if (this.externalBuilderList != null) {
         this.externalBuilderList.incrementModCount();
      }

      if (this.externalMessageOrBuilderList != null) {
         this.externalMessageOrBuilderList.incrementModCount();
      }

   }

   private static class MessageOrBuilderExternalList extends AbstractList implements List {
      RepeatedFieldBuilderV3 builder;

      MessageOrBuilderExternalList(RepeatedFieldBuilderV3 var1) {
         this.builder = var1;
      }

      public int size() {
         return this.builder.getCount();
      }

      public MessageOrBuilder get(int var1) {
         return this.builder.getMessageOrBuilder(var1);
      }

      void incrementModCount() {
         ++this.modCount;
      }
   }

   private static class BuilderExternalList extends AbstractList implements List {
      RepeatedFieldBuilderV3 builder;

      BuilderExternalList(RepeatedFieldBuilderV3 var1) {
         this.builder = var1;
      }

      public int size() {
         return this.builder.getCount();
      }

      public AbstractMessage.Builder get(int var1) {
         return this.builder.getBuilder(var1);
      }

      void incrementModCount() {
         ++this.modCount;
      }
   }

   private static class MessageExternalList extends AbstractList implements List {
      RepeatedFieldBuilderV3 builder;

      MessageExternalList(RepeatedFieldBuilderV3 var1) {
         this.builder = var1;
      }

      public int size() {
         return this.builder.getCount();
      }

      public AbstractMessage get(int var1) {
         return this.builder.getMessage(var1);
      }

      void incrementModCount() {
         ++this.modCount;
      }
   }
}
