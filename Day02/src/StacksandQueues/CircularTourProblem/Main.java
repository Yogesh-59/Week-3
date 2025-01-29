package StacksandQueues.CircularTourProblem;

import static StacksandQueues.CircularTourProblem.CircularTour.findStartingPoint;

public class Main {
    public static void main(String[] args) {
        // Test Case 1: Possible circular tour
        PetrolPump[] pumps1 = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3)
        };

        System.out.println("Test Case 1:");
        int result1 = findStartingPoint(pumps1);
        if (result1 != -1) {
            System.out.println("Circular tour is possible starting from pump " + result1);
        } else {
            System.out.println("No circular tour is possible");
        }

        // Test Case 2: Impossible circular tour
        PetrolPump[] pumps2 = {
                new PetrolPump(4, 6),   // Pump 0: 4 petrol, 6 distance
                new PetrolPump(6, 7),   // Pump 1: 6 petrol, 7 distance
                new PetrolPump(3, 4)    // Pump 2: 3 petrol, 4 distance
        };

        System.out.println("\nTest Case 2:");
        int result2 = findStartingPoint(pumps2);
        if (result2 != -1) {
            System.out.println("Circular tour is possible starting from pump " + result2);
        } else {
            System.out.println("No circular tour is possible");
        }
    }
}
