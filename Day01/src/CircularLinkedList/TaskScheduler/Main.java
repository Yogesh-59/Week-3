package CircularLinkedList.TaskScheduler;
import java.util.*;
public class Main {
    public static void main(String [] args) {
        // Creating circular linked list object
        CircularLinkedList cll = new CircularLinkedList();
        cll.addTaskAtEnd(11, "Task 1", 1, new Date());
        cll.addTaskAtEnd(12, "Task 2", 2, new Date());
        cll.addTaskAtEnd(13, "Task 3", 3, new Date());
        cll.addTaskAtEnd(14, "Task 4", 4, new Date());
        cll.addTaskAtEnd(15, "Task 5", 5, new Date());
        // Displaying all tasks
        cll.displayAllTasks();
        // Searching task by priority
        System.out.println("Current Task: " + cll.viewCurrentTask().taskName);
        // Moving to next task
        cll.moveToNextTask();
        // Displaying current task
        System.out.println("Current Task: " + cll.viewCurrentTask().taskName);
        // Moving to next task
        cll.moveToNextTask();
        // Displaying current task
        System.out.println("Current Task: " + cll.viewCurrentTask().taskName);
        // Moving to next task
        cll.moveToNextTask();
        // Displaying current task
        System.out.println("Current Task: " + cll.viewCurrentTask().taskName);
        // Moving to next task
        cll.moveToNextTask();
        // Displaying current task
        System.out.println("Current Task: " + cll.viewCurrentTask().taskName);
    }
}
