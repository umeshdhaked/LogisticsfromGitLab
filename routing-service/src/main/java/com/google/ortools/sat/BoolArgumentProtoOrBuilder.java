package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface BoolArgumentProtoOrBuilder extends MessageOrBuilder {
   List getLiteralsList();

   int getLiteralsCount();

   int getLiterals(int var1);
}
