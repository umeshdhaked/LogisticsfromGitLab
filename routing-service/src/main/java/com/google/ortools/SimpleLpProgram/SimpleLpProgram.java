import com.google.ortools.linearsolver.MPConstraint;
import com.google.ortools.linearsolver.MPObjective;
import com.google.ortools.linearsolver.MPSolver;
import com.google.ortools.linearsolver.MPVariable;
import com.google.ortools.linearsolver.MPSolver.OptimizationProblemType;

public class SimpleLpProgram {
   public static void main(String[] var0) throws Exception {
      MPSolver var1 = new MPSolver("SimpleLpProgram", OptimizationProblemType.GLOP_LINEAR_PROGRAMMING);
      MPVariable var2 = var1.makeNumVar(0.0D, 1.0D, "x");
      MPVariable var3 = var1.makeNumVar(0.0D, 2.0D, "y");
      System.out.println("Number of variables = " + var1.numVariables());
      MPConstraint var4 = var1.makeConstraint(0.0D, 2.0D, "ct");
      var4.setCoefficient(var2, 1.0D);
      var4.setCoefficient(var3, 1.0D);
      System.out.println("Number of constraints = " + var1.numConstraints());
      MPObjective var5 = var1.objective();
      var5.setCoefficient(var2, 3.0D);
      var5.setCoefficient(var3, 1.0D);
      var5.setMaximization();
      var1.solve();
      System.out.println("Solution:");
      System.out.println("Objective value = " + var5.value());
      System.out.println("x = " + var2.solutionValue());
      System.out.println("y = " + var3.solutionValue());
   }

   static {
      System.loadLibrary("jniortools");
   }
}
