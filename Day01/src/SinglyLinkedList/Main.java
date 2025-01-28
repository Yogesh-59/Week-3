package SinglyLinkedList;
import java.util.*;
public class Main {
    public static void main(String[]args){
        StudentLinkedList records = new StudentLinkedList();

        // Adding student records
        records.addAtBeginning(49, "Deepraj", 20, 'A');
        records.addAtEnd(32, "Aryan", 20, 'A');
        records.addAtPosition(43, "Bipin", 21, 'a', 5);

        // Display all records
        records.displayAll();

        // Search for a student
        records.searchByRollNumber(49);

        // Update a student's grade
        records.updateGrade(32, 'B');

        // Delete a student
        records.deleteByRollNumber(43);

        // Display updated records
        records.displayAll();
    }
}
