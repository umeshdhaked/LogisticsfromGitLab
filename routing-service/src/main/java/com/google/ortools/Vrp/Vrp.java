import com.google.ortools.constraintsolver.Assignment;
import com.google.ortools.constraintsolver.RoutingIndexManager;
import com.google.ortools.constraintsolver.RoutingModel;
import com.google.ortools.constraintsolver.RoutingSearchParameters;
import com.google.ortools.constraintsolver.main;
import com.google.ortools.constraintsolver.FirstSolutionStrategy.Value;
import java.util.Objects;
import java.util.logging.Logger;

public class Vrp {
   private static final Logger logger;

   static void printSolution(Vrp.DataModel var0, RoutingModel var1, RoutingIndexManager var2, Assignment var3) {
      logger.info("Objective : " + var3.objectiveValue());
      long var4 = 0L;
      int var6 = 0;

      while(true) {
         Objects.requireNonNull(var0);
         if (var6 >= 4) {
            logger.info("Total Distance of all routes: " + var4 + "m");
            return;
         }

         logger.info("Route for Vehicle " + var6 + ":");
         long var7 = 0L;
         String var9 = "";

         long var12;
         for(long var10 = var1.start(var6); !var1.isEnd(var10); var7 += var1.getArcCostForVehicle(var12, var10, (long)var6)) {
            var9 = var9 + var2.indexToNode(var10) + " -> ";
            var12 = var10;
            var10 = var3.value(var1.nextVar(var10));
         }

         var9 = var9 + var2.indexToNode(var1.end(var6));
         logger.info(var9);
         logger.info("Distance of the route: " + var7 + "m");
         var4 += var7;
         ++var6;
      }
   }

   public static void main(String[] var0) throws Exception {
      Vrp.DataModel var1 = new Vrp.DataModel();
      int var10002 = var1.distanceMatrix.length;
      Objects.requireNonNull(var1);
      Objects.requireNonNull(var1);
      RoutingIndexManager var2 = new RoutingIndexManager(var10002, 4, 0);
      RoutingModel var3 = new RoutingModel(var2);
      int var4 = var3.registerTransitCallback((var2x, var4x) -> {
         int var6 = var2.indexToNode(var2x);
         int var7 = var2.indexToNode(var4x);
         return var1.distanceMatrix[var6][var7];
      });
      var3.setArcCostEvaluatorOfAllVehicles(var4);
      RoutingSearchParameters var5 = main.defaultRoutingSearchParameters().toBuilder().setFirstSolutionStrategy(Value.PATH_CHEAPEST_ARC).build();
      Assignment var6 = var3.solveWithParameters(var5);
      printSolution(var1, var3, var2, var6);
   }

   static {
      System.loadLibrary("jniortools");
      logger = Logger.getLogger(Vrp.class.getName());
   }

   static class DataModel {
      public final long[][] distanceMatrix = new long[][]{{0L, 548L, 776L, 696L, 582L, 274L, 502L, 194L, 308L, 194L, 536L, 502L, 388L, 354L, 468L, 776L, 662L}, {548L, 0L, 684L, 308L, 194L, 502L, 730L, 354L, 696L, 742L, 1084L, 594L, 480L, 674L, 1016L, 868L, 1210L}, {776L, 684L, 0L, 992L, 878L, 502L, 274L, 810L, 468L, 742L, 400L, 1278L, 1164L, 1130L, 788L, 1552L, 754L}, {696L, 308L, 992L, 0L, 114L, 650L, 878L, 502L, 844L, 890L, 1232L, 514L, 628L, 822L, 1164L, 560L, 1358L}, {582L, 194L, 878L, 114L, 0L, 536L, 764L, 388L, 730L, 776L, 1118L, 400L, 514L, 708L, 1050L, 674L, 1244L}, {274L, 502L, 502L, 650L, 536L, 0L, 228L, 308L, 194L, 240L, 582L, 776L, 662L, 628L, 514L, 1050L, 708L}, {502L, 730L, 274L, 878L, 764L, 228L, 0L, 536L, 194L, 468L, 354L, 1004L, 890L, 856L, 514L, 1278L, 480L}, {194L, 354L, 810L, 502L, 388L, 308L, 536L, 0L, 342L, 388L, 730L, 468L, 354L, 320L, 662L, 742L, 856L}, {308L, 696L, 468L, 844L, 730L, 194L, 194L, 342L, 0L, 274L, 388L, 810L, 696L, 662L, 320L, 1084L, 514L}, {194L, 742L, 742L, 890L, 776L, 240L, 468L, 388L, 274L, 0L, 342L, 536L, 422L, 388L, 274L, 810L, 468L}, {536L, 1084L, 400L, 1232L, 1118L, 582L, 354L, 730L, 388L, 342L, 0L, 878L, 764L, 730L, 388L, 1152L, 354L}, {502L, 594L, 1278L, 514L, 400L, 776L, 1004L, 468L, 810L, 536L, 878L, 0L, 114L, 308L, 650L, 274L, 844L}, {388L, 480L, 1164L, 628L, 514L, 662L, 890L, 354L, 696L, 422L, 764L, 114L, 0L, 194L, 536L, 388L, 730L}, {354L, 674L, 1130L, 822L, 708L, 628L, 856L, 320L, 662L, 388L, 730L, 308L, 194L, 0L, 342L, 422L, 536L}, {468L, 1016L, 788L, 1164L, 1050L, 514L, 514L, 662L, 320L, 274L, 388L, 650L, 536L, 342L, 0L, 764L, 194L}, {776L, 868L, 1552L, 560L, 674L, 1050L, 1278L, 742L, 1084L, 810L, 1152L, 274L, 388L, 422L, 764L, 0L, 798L}, {662L, 1210L, 754L, 1358L, 1244L, 708L, 480L, 856L, 514L, 468L, 354L, 844L, 730L, 536L, 194L, 798L, 0L}};
      public final int vehicleNumber = 4;
      public final int depot = 0;
   }
}
