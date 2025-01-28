package DoublyLinkedList.LibraryManagementSystem;

 class LibraryLinkedList {
     private Book head;
     private Book tail;
     private int count;
     // Constructor for LibraryLinkedList class
     public LibraryLinkedList() {
         this.head = null;
         this.tail = null;
         this.count = 0;
     }
     // Add a book to the beginning of the linked list
     public void addBookAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
         Book newBook = new Book(title, author, genre, bookID, isAvailable);
         if (head == null) {
             head = tail = newBook;
         } else {
             newBook.next = head;
             head.prev = newBook;
             head = newBook;
         }
         count++;
     }
     // Add a book to the end of the linked list
     public void addBookAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
         Book newBook = new Book(title, author, genre, bookID, isAvailable);
         if (tail == null) {
             head = tail = newBook;
         } else {
             tail.next = newBook;
             newBook.prev = tail;
             tail = newBook;
         }
         count++;
     }
     // Add a book at a specific position in the linked list
     public void addBookAtPosition(String title, String author, String genre, int bookID, boolean isAvailable, int position) {
         if (position < 1 || position > count + 1) {
             System.out.println("Invalid position!");
             return;
         }
         if (position == 1) {
             addBookAtBeginning(title, author, genre, bookID, isAvailable);
             return;
         }
         if (position == count + 1) {
             addBookAtEnd(title, author, genre, bookID, isAvailable);
             return;
         }
         Book newBook = new Book(title, author, genre, bookID, isAvailable);
         Book current = head;
         for (int i = 1; i < position - 1; i++) {
             current = current.next;
         }
         newBook.next = current.next;
         newBook.prev = current;
         current.next.prev = newBook;
         current.next = newBook;
         count++;
     }
     //  Remove a book by bookID
     public void removeBookByID(int bookID) {
         if (head == null) {
             System.out.println("Library is empty!");
             return;
         }
         Book current = head;
         while (current != null && current.bookID != bookID) {
             current = current.next;
         }
         if (current == null) {
             System.out.println("Book not found!");
             return;
         }
         if (current == head) {
             head = head.next;
             if (head != null) {
                 head.prev = null;
             }
         } else if (current == tail) {
             tail = tail.prev;
             if (tail != null) {
                 tail.next = null;
             }
         } else {
             current.prev.next = current.next;
             current.next.prev = current.prev;
         }
         count--;
     }
     // Search for a book by title
     public Book searchBookByTitle(String title) {
         Book current = head;
         while (current != null) {
             if (current.title.equalsIgnoreCase(title)) {
                 return current;
             }
             current = current.next;
         }
         return null;
     }
     // Search for a book by author
     public Book searchBookByAuthor(String author) {
         Book current = head;
         while (current != null) {
             if (current.author.equalsIgnoreCase(author)) {
                 return current;
             }
             current = current.next;
         }
         return null;
     }
     // Update the availability of a book
     public void updateBookAvailability(int bookID, boolean isAvailable) {
         Book current = head;
         while (current != null) {
             if (current.bookID == bookID) {
                 current.isAvailable = isAvailable;
                 return;
             }
             current = current.next;
         }
         System.out.println("Book not found!");
     }
     // Display the books in the library
     public void displayBooksForward() {
         Book current = head;
         while (current != null) {
             System.out.println(current.title + " by " + current.author + " - " + (current.isAvailable ? "Available" : "Not Available"));
             current = current.next;
         }
     }
     // Display the books in the library in reverse order
     public void displayBooksReverse() {
         Book current = tail;
         while (current != null) {
             System.out.println(current.title + " by " + current.author + " - " + (current.isAvailable ? "Available" : "Not Available"));
             current = current.prev;
         }
     }

     // Count the number of books in the library
     public int countBooks() {
         return count;
     }
}
