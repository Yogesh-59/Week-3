package StacksandQueues.CircularTourProblem;

 class CircularTour {
     public static int findStartingPoint(PetrolPump[] pumps) {
         // Edge case: if no pumps exist
         if (pumps.length == 0) {
             return -1;
         }
         // Starting poin
         int start = 0;
         // Overall surplus petrol
         int totalSurplus = 0;
         // Current surplus petrol
         int currentSurplus = 0;

         // Loop through all petrol pumps
         for (int i = 0; i < pumps.length; i++) {
             // Add the current pump's surplus/deficit
             currentSurplus += pumps[i].petrol - pumps[i].distance;
             totalSurplus += pumps[i].petrol - pumps[i].distance;

             // If we can't reach the next pump negative surplus
             if (currentSurplus < 0) {
                 // Try starting from the next pump
                 start = i + 1;
                 // Reset current surplus
                 currentSurplus = 0;
             }
         }

         // If total surplus is negative, no solution exists
         // Otherwise, 'start' is our answer
         return totalSurplus >= 0 ? start : -1;
     }
}
