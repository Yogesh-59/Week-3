package DoublyLinkedList.LibraryManagementSystem;

 class Book {
     String title;
     String author;
     String genre;
     int bookID;
     boolean isAvailable;
     Book next;
     Book prev;
     // Constructor for Book class
     public Book(String title, String author, String genre, int bookID, boolean isAvailable) {
         this.title = title;
         this.author = author;
         this.genre = genre;
         this.bookID = bookID;
         this.isAvailable = isAvailable;
         this.next = null;
         this.prev = null;
     }
}
