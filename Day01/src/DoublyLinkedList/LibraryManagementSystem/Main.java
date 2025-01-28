package DoublyLinkedList.LibraryManagementSystem;

public class Main {
    public static void main(String[] args)
    {
        // Create a new LibraryManagementSystem object
        LibraryLinkedList library = new LibraryLinkedList();
        // Add books to the library
        library.addBookAtBeginning("The Land of God", "DR Lodhi", "Educational", 7, true);
        library.addBookAtEnd("YesterDay is Not Comming", "Deepraj", "Mythology", 2, true);
        library.addBookAtPosition("The Wall of Leader's", "Yogesh", "Histrological", 3, true, 2);
        library.addBookAtPosition("Love is Myth", "Aryan chaurasia", "Romance", 4, true, 1);
        // Display the books in the library
        library.displayBooksForward();
        System.out.println("The number of  books: " + library.countBooks());
        // Search for a book by Book id
        library.removeBookByID(3);
        // Display the books in the library
        library.displayBooksForward();
        // Search for a book by author
        System.out.println("Total books: " + library.countBooks());
        // Update the availability of a book
        library.updateBookAvailability(2, false);
        // Display the books in the library
        library.displayBooksForward();
        // Display the books in the library in reverse order
        System.out.println("Total books: " + library.countBooks());
    }
}
