package com.google.protobuf;

public final class RpcUtil {
   private RpcUtil() {
   }

   public static RpcCallback specializeCallback(RpcCallback var0) {
      return var0;
   }

   public static RpcCallback generalizeCallback(final RpcCallback var0, final Class var1, final Message var2) {
      return new RpcCallback() {
         @Override
         public void run(Object var1) {

         }

         public void run(Message var1x) {
            Message var2x;
            try {
               var2x = (Message)var1.cast(var1x);
            } catch (ClassCastException var4) {
               var2x = RpcUtil.copyAsType(var2, var1x);
            }

            var0.run(var2x);
         }
      };
   }

   private static Message copyAsType(Message var0, Message var1) {
      return var0.newBuilderForType().mergeFrom(var1).build();
   }

   public static RpcCallback newOneTimeCallback(final RpcCallback var0) {
      return new RpcCallback() {
         private boolean alreadyCalled = false;

         public void run(Object var1) {
            synchronized(this) {
               if (this.alreadyCalled) {
                  throw new RpcUtil.AlreadyCalledException();
               }

               this.alreadyCalled = true;
            }

            var0.run(var1);
         }
      };
   }

   public static final class AlreadyCalledException extends RuntimeException {
      private static final long serialVersionUID = 5469741279507848266L;

      public AlreadyCalledException() {
         super("This RpcCallback was already called and cannot be called multiple times.");
      }
   }
}
