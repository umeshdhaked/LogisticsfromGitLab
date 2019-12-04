package com.google.protobuf;

public final class DiscardUnknownFieldsParser {
   public static final Parser wrap(final Parser var0) {
      return new AbstractParser() {
         public Message parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) throws InvalidProtocolBufferException {
            Message var3;
            try {
               var1.discardUnknownFields();
               var3 = (Message)var0.parsePartialFrom(var1, var2);
            } finally {
               var1.unsetDiscardUnknownFields();
            }

            return var3;
         }
      };
   }

   private DiscardUnknownFieldsParser() {
   }
}
