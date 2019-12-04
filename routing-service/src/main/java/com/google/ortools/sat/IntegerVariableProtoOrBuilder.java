package com.google.ortools.sat;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface IntegerVariableProtoOrBuilder extends MessageOrBuilder {
   String getName();

   ByteString getNameBytes();

   List getDomainList();

   int getDomainCount();

   long getDomain(int var1);
}
