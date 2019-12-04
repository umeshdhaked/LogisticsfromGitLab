import com.google.ortools.constraintsolver.Assignment;
import com.google.ortools.constraintsolver.RoutingIndexManager;
import com.google.ortools.constraintsolver.RoutingModel;
import com.google.ortools.constraintsolver.RoutingSearchParameters;
import com.google.ortools.constraintsolver.main;
import com.google.ortools.constraintsolver.FirstSolutionStrategy.Value;
import java.util.Objects;
import java.util.function.LongBinaryOperator;
import java.util.logging.Logger;

public class Tsp {
   private static final Logger logger;

   static void printSolution(Tsp.DataModel var0, RoutingModel var1, RoutingIndexManager var2, Assignment var3) {
      logger.info("Objective : " + var3.objectiveValue());
      logger.info("Route for Vehicle 0:");
      long var4 = 0L;
      String var6 = "";

      long var9;
      for(long var7 = var1.start(0); !var1.isEnd(var7); var4 += var1.getArcCostForVehicle(var9, var7, 0L)) {
         var6 = var6 + var2.indexToNode(var7) + " -> ";
         var9 = var7;
         var7 = var3.value(var1.nextVar(var7));
      }

      var6 = var6 + var2.indexToNode(var1.end(0));
      logger.info(var6);
      logger.info("Distance of the route: " + var4 + "m");
   }

   public static void main(String[] var0) throws Exception {
      Tsp.DataModel var1 = new Tsp.DataModel();
      int var10002 = var1.locations.length;
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var1);
      RoutingIndexManager var2 = new RoutingIndexManager(var10002, 1, 0);
      RoutingModel var3 = new RoutingModel(var2);
      int var4 = var3.registerTransitCallback(new Tsp.ManhattanDistance(var1, var2));
      var3.setArcCostEvaluatorOfAllVehicles(var4);
      RoutingSearchParameters var5 = main.defaultRoutingSearchParameters().toBuilder().setFirstSolutionStrategy(Value.PATH_CHEAPEST_ARC).build();
      Assignment var6 = var3.solveWithParameters(var5);
      printSolution(var1, var3, var2, var6);
   }

   static {
      System.loadLibrary("jniortools");
      logger = Logger.getLogger(Tsp.class.getName());
   }

   static class ManhattanDistance implements LongBinaryOperator {
      private final long[][] distanceMatrix;
      private final RoutingIndexManager indexManager;

      public ManhattanDistance(Tsp.DataModel var1, RoutingIndexManager var2) {
         this.distanceMatrix = new long[var1.locations.length][var1.locations.length];
         this.indexManager = var2;

         for(int var3 = 0; var3 < var1.locations.length; ++var3) {
            for(int var4 = 0; var4 < var1.locations.length; ++var4) {
               if (var3 == var4) {
                  this.distanceMatrix[var3][var4] = 0L;
               } else {
                  this.distanceMatrix[var3][var4] = (long)Math.abs(var1.locations[var4][0] - var1.locations[var3][0]) + (long)Math.abs(var1.locations[var4][1] - var1.locations[var3][1]);
               }
            }
         }

      }

      public long applyAsLong(long var1, long var3) {
         int var5 = this.indexManager.indexToNode(var1);
         int var6 = this.indexManager.indexToNode(var3);
         return this.distanceMatrix[var5][var6];
      }
   }

   static class DataModel {
      public final int[][] locations = new int[][]{{4, 4}, {2, 0}, {8, 0}, {0, 1}, {1, 1}, {5, 2}, {7, 2}, {3, 3}, {6, 3}, {5, 5}, {8, 5}, {1, 6}, {2, 6}, {3, 7}, {6, 7}, {0, 8}, {7, 8}};
      public final int vehicleNumber = 1;
      public final int depot = 0;

      public DataModel() {
         int[][] var1 = this.locations;
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            int[] var4 = var1[var3];
            var4[0] *= 114;
            var4[1] *= 80;
         }

      }
   }
}
