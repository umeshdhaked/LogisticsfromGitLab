package com.google.ortools.sat;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface InverseConstraintProtoOrBuilder extends MessageOrBuilder {
   List getFDirectList();

   int getFDirectCount();

   int getFDirect(int var1);

   List getFInverseList();

   int getFInverseCount();

   int getFInverse(int var1);
}
