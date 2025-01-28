package SinglyLinkedList;

public class StudentLinkedList {
    private Student head;

    // Add a student at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, char grade) {
        Student newNode = new Student(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add a student at the end
    public void addAtEnd(int rollNumber, String name, int age, char grade) {
        Student newNode = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add a student at a specific position (zero-indexed)
    public void addAtPosition(int rollNumber, String name, int age, char grade, int position) {
        if (position == 0) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }

        Student newNode = new Student(rollNumber, name, age, grade);
        Student temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds. Adding at the end.");
            addAtEnd(rollNumber, name, age, grade);
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Delete a student by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty. No record to delete.");
            return;
        }

        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Record deleted.");
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Record not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Record deleted.");
        }
    }

    // Search for a student by Roll Number
    public void searchByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Record Found: Roll Number: " + temp.rollNumber + ", Name: " + temp.name +
                        ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found.");
    }

    // Display all student records
    public void displayAll() {
        if (head == null) {
            System.out.println("No records to display.");
            return;
        }
        Student temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name +
                    ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    // Update a student's grade by Roll Number
    public void updateGrade(int rollNumber, char newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll Number: " + rollNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found.");
    }
}
