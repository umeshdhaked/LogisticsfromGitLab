package com.google.ortools.constraintsolver;

@FunctionalInterface
public interface LongTernaryOperator {
   long applyAsLong(long var1, long var3, long var5);
}
