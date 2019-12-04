package com.google.protobuf;

final class RawMessageInfo implements MessageInfo {
   private final MessageLite defaultInstance;
   private final String info;
   private final Object[] objects;
   private final int flags;

   RawMessageInfo(MessageLite var1, String var2, Object[] var3) {
      this.defaultInstance = var1;
      this.info = var2;
      this.objects = var3;
      byte var4 = 0;
      int var8 = var4 + 1;
      char var5 = var2.charAt(var4);
      if (var5 < '\ud800') {
         this.flags = var5;
      } else {
         int var6 = var5 & 8191;

         int var7;
         for(var7 = 13; (var5 = var2.charAt(var8++)) >= '\ud800'; var7 += 13) {
            var6 |= (var5 & 8191) << var7;
         }

         this.flags = var6 | var5 << var7;
      }

   }

   String getStringInfo() {
      return this.info;
   }

   Object[] getObjects() {
      return this.objects;
   }

   public MessageLite getDefaultInstance() {
      return this.defaultInstance;
   }

   public ProtoSyntax getSyntax() {
      return (this.flags & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
   }

   public boolean isMessageSetWireFormat() {
      return (this.flags & 2) == 2;
   }
}
