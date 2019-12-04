package com.google.ortools.linearsolver;

import com.google.ortools.util.OptionalBoolean;
import com.google.protobuf.MessageOrBuilder;

public interface MPSolverCommonParametersOrBuilder extends MessageOrBuilder {
   boolean hasRelativeMipGap();

   OptionalDouble getRelativeMipGap();

   OptionalDoubleOrBuilder getRelativeMipGapOrBuilder();

   boolean hasPrimalTolerance();

   OptionalDouble getPrimalTolerance();

   OptionalDoubleOrBuilder getPrimalToleranceOrBuilder();

   boolean hasDualTolerance();

   OptionalDouble getDualTolerance();

   OptionalDoubleOrBuilder getDualToleranceOrBuilder();

   boolean hasLpAlgorithm();

   MPSolverCommonParameters.LPAlgorithmValues getLpAlgorithm();

   boolean hasPresolve();

   OptionalBoolean getPresolve();

   boolean hasScaling();

   OptionalBoolean getScaling();
}
