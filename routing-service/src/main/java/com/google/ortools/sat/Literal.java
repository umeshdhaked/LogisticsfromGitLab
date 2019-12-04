package com.google.ortools.sat;

public interface Literal {
   int getIndex();

   Literal not();

   String getShortString();
}
