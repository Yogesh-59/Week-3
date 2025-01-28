package CircularLinkedList.RoundRobinScheduling;

 class Process {
     int processID;
     int burstTime;
     int priority;
     Process next;

     Process(int processID, int burstTime, int priority) {
         this.processID = processID;
         this.burstTime = burstTime;
         this.priority = priority;
         this.next = null;
     }
}
