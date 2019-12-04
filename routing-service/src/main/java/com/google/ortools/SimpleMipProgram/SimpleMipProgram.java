import com.google.ortools.linearsolver.MPConstraint;
import com.google.ortools.linearsolver.MPObjective;
import com.google.ortools.linearsolver.MPSolver;
import com.google.ortools.linearsolver.MPVariable;
import com.google.ortools.linearsolver.MPSolver.OptimizationProblemType;
import com.google.ortools.linearsolver.MPSolver.ResultStatus;

public class SimpleMipProgram {
   public static void main(String[] var0) throws Exception {
      MPSolver var1 = new MPSolver("SimpleMipProgram", OptimizationProblemType.CBC_MIXED_INTEGER_PROGRAMMING);
      double var2 = Double.POSITIVE_INFINITY;
      MPVariable var4 = var1.makeIntVar(0.0D, var2, "x");
      MPVariable var5 = var1.makeIntVar(0.0D, var2, "y");
      System.out.println("Number of variables = " + var1.numVariables());
      MPConstraint var6 = var1.makeConstraint(-var2, 17.5D, "c0");
      var6.setCoefficient(var4, 1.0D);
      var6.setCoefficient(var5, 7.0D);
      MPConstraint var7 = var1.makeConstraint(-var2, 3.5D, "c1");
      var7.setCoefficient(var4, 1.0D);
      var7.setCoefficient(var5, 0.0D);
      System.out.println("Number of constraints = " + var1.numConstraints());
      MPObjective var8 = var1.objective();
      var8.setCoefficient(var4, 1.0D);
      var8.setCoefficient(var5, 10.0D);
      var8.setMaximization();
      ResultStatus var9 = var1.solve();
      if (var9 != ResultStatus.OPTIMAL) {
         System.err.println("The problem does not have an optimal solution!");
      } else if (!var1.verifySolution(1.0E-7D, true)) {
         System.err.println("The solution returned by the solver violated the problem constraints by at least 1e-7");
      } else {
         System.out.println("Solution:");
         System.out.println("Objective value = " + var8.value());
         System.out.println("x = " + var4.solutionValue());
         System.out.println("y = " + var5.solutionValue());
         System.out.println("\nAdvanced usage:");
         System.out.println("Problem solved in " + var1.wallTime() + " milliseconds");
         System.out.println("Problem solved in " + var1.iterations() + " iterations");
         System.out.println("Problem solved in " + var1.nodes() + " branch-and-bound nodes");
      }
   }

   static {
      System.loadLibrary("jniortools");
   }
}
