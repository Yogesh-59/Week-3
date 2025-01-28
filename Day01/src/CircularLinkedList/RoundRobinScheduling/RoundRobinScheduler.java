package CircularLinkedList.RoundRobinScheduling;

 class RoundRobinScheduler {
     private Process head = null;
     private Process tail = null;

     // adding a new process at the end of the circular list
     public void addProcess(int processID, int burstTime, int priority) {
         Process newProcess = new Process(processID, burstTime, priority);
         if (head == null) {
             head = newProcess;
             tail = newProcess;
             tail.next = head;
         } else {
             tail.next = newProcess;
             tail = newProcess;
             tail.next = head; // Maintain circular link
         }
     }

     // remove by process id
     public void removeProcess(int processID) {
         if (head == null) return;

         Process current = head;
         Process prev = null;

         do {
             if (current.processID == processID) {
                 if (current == head) {
                     // check If it's the only process in the list
                     if (head == tail) {
                         head = null;
                         tail = null;
                     } else {
                         head = head.next;
                         tail.next = head;
                     }
                 } else {
                     prev.next = current.next;
                     if (current == tail) {
                         tail = prev;
                     }
                 }
                 System.out.println("Process " + processID + " removed after execution.");
                 return;
             }
             prev = current;
             current = current.next;
         } while (current != head);
     }

     // Simulate Round-Robin Scheduling
     public void simulateRoundRobin(int timeQuantum) {
         if (head == null) {
             System.out.println("No processes to schedule.");
             return;
         }

         int totalTime = 0;
         int waitingTime = 0;
         int turnAroundTime = 0;
         int processCount = 0;

         System.out.println("Starting Round-Robin Scheduling:");
         Process current = head;

         while (head != null) {
             // Process execution
             System.out.println("Executing Process " + current.processID + " with Burst Time " + current.burstTime);
             if (current.burstTime <= timeQuantum) {
                 totalTime += current.burstTime;
                 turnAroundTime += totalTime;
                 removeProcess(current.processID);
                 current = head;
                 // Start from the head again
             } else {
                 current.burstTime -= timeQuantum;
                 totalTime += timeQuantum;
                 System.out.println("Process " + current.processID + " remaining Burst Time: " + current.burstTime);
                 current = current.next;
             }

             // Display the current list of processes
             displayProcesses();
         }

         // Calculate average waiting and turnaround time
         processCount = turnAroundTime / totalTime;
         waitingTime = turnAroundTime - totalTime;
         System.out.println("Average Waiting Time: " + (waitingTime / processCount));
         System.out.println("Average Turnaround Time: " + (turnAroundTime / processCount));
     }

     // Display the list of processes
     public void displayProcesses() {
         if (head == null) {
             System.out.println("No processes in the queue.");
             return;
         }

         Process current = head;
         System.out.print("Current Processes in Queue: ");
         do {
             System.out.print("[ID: " + current.processID + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority + "] -> ");
             current = current.next;
         } while (current != head);
         System.out.println("(Back to Start)");
     }
}
