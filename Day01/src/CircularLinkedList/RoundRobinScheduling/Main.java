package CircularLinkedList.RoundRobinScheduling;

public class Main {
    public static void main(String[]args){
    RoundRobinScheduler rr = new RoundRobinScheduler();

    // Adding processes
        rr.addProcess(1, 15, 7);
       rr.addProcess(2, 17, 5);
        rr.addProcess(3, 9, 3);

    // Display initial processes
        rr.displayProcesses();

    // Simulate Round-Robin Scheduling with a time quantum of 4
        rr.simulateRoundRobin(4);
    }
}
