package CircularLinkedList.TaskScheduler;
import java.util.*;
 class Task {
     int taskId;
     String taskName;
     int priority;
     Date dueDate;
     Task next;
     // Constructor to initialize task
     public Task(int taskId, String taskName, int priority, Date dueDate) {
         this.taskId = taskId;
         this.taskName = taskName;
         this.priority = priority;
         this.dueDate = dueDate;
         this.next = null;
     }
}
