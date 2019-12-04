import com.google.ortools.sat.CpModel;
import com.google.ortools.sat.CpSolver;
import com.google.ortools.sat.CpSolverStatus;
import com.google.ortools.sat.IntVar;
import java.io.PrintStream;

public class SimpleSatProgram {
   public static void main(String[] var0) throws Exception {
      CpModel var1 = new CpModel();
      byte var2 = 3;
      IntVar var3 = var1.newIntVar(0L, (long)(var2 - 1), "x");
      IntVar var4 = var1.newIntVar(0L, (long)(var2 - 1), "y");
      IntVar var5 = var1.newIntVar(0L, (long)(var2 - 1), "z");
      var1.addDifferent(var3, var4);
      CpSolver var6 = new CpSolver();
      CpSolverStatus var7 = var6.solve(var1);
      if (var7 == CpSolverStatus.FEASIBLE) {
         PrintStream var10000 = System.out;
         long var10001 = var6.value(var3);
         var10000.println("x = " + var10001);
         var10000 = System.out;
         var10001 = var6.value(var4);
         var10000.println("y = " + var10001);
         var10000 = System.out;
         var10001 = var6.value(var5);
         var10000.println("z = " + var10001);
      }

   }

   static {
      System.loadLibrary("jniortools");
   }
}
