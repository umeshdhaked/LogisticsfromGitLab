package com.google.ortools.constraintsolver;

@FunctionalInterface
public interface LongTernaryPredicate {
   boolean test(long var1, long var3, long var5);

   default LongTernaryPredicate negate() {
      return (var1, var3, var5) -> {
         return !this.test(var1, var3, var5);
      };
   }
}
