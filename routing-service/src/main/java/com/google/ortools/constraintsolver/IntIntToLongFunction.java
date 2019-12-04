package com.google.ortools.constraintsolver;

@FunctionalInterface
public interface IntIntToLongFunction {
   long applyAsLong(int var1, int var2);
}
