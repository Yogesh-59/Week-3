package CircularLinkedList.TaskScheduler;
import java.util.*;
class CircularLinkedList {
    private Task head = null;
    private Task tail = null;
    private Task current = null;
    // Method to add task at beginning of the list
    public void addTaskAtBeginning(int taskId, String taskName, int priority, Date dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }
    // Method to add task at end of the list
    public void addTaskAtEnd(int taskId, String taskName, int priority, Date dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }
    // Method to add task at specific position in the list
    public void addTaskAtPosition(int taskId, String taskName, int priority, Date dueDate, int position) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (position == 0) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
            if (temp == head) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
        }
        newTask.next = temp.next;
        temp.next = newTask;
        if (temp == tail) {
            tail = newTask;
        }
    }
    // Method to remove task by task id
    public void removeTaskById(int taskId) {
        if (head == null) return;
        if (head.taskId == taskId) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }
        Task temp = head;
        while (temp.next != head && temp.next.taskId != taskId) {
            temp = temp.next;
        }
        if (temp.next.taskId == taskId) {
            if (temp.next == tail) {
                tail = temp;
            }
            temp.next = temp.next.next;
        }
    }
    // Method to remove task by priority
    public Task viewCurrentTask() {
        if (current == null) {
            current = head;
        }
        return current;
    }
    // Method to move to next task
    public void moveToNextTask() {
        if (current != null) {
            current = current.next;
        }
    }
    // Method to display all tasks
    public void displayAllTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
    // Method to search task by task id
    public Task searchTaskByPriority(int priority) {
        if (head == null) return null;
        Task temp = head;
        do {
            if (temp.priority == priority) {
                return temp;
            }
            temp = temp.next;
        } while (temp != head);
        return null;
    }
}
