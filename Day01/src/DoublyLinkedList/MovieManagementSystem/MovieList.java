package DoublyLinkedList.MovieManagementSystem;
class MovieList {
    private Movie head;
    private Movie tail;
    // Constructor to initialize the head and tail of the list
    public MovieList() {
        this.head = null;
        this.tail = null;
    }
    // Method to add a movie at the beginning of the list
    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }
    // Method to add a movie at the end of the list
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }
    // Method to add a movie at a specific position in the list
    public void addMovieAtPosition(String title, String director, int year, double rating, int position) {
        if (position <= 0) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            addMovieAtEnd(title, director, year, rating);
        } else {
            newMovie.next = current.next;
            newMovie.prev = current;
            current.next.prev = newMovie;
            current.next = newMovie;
        }
    }
    // Method to remove a movie from the list by title
    public void removeMovieByTitle(String title) {
        Movie current = head;
        while (current != null && !current.title.equals(title)) {
            current = current.next;
        }
        if (current == null) return;
        if (current.prev != null) current.prev.next = current.next;
        if (current.next != null) current.next.prev = current.prev;
        if (current == head) head = current.next;
        if (current == tail) tail = current.prev;
    }
    // Method to search for movies by director
    public void searchMovieByDirector(String director) {
        Movie current = head;
        while (current != null) {
            if (current.director.equals(director)) {
                System.out.println(current.title + " directed by " + director);
            }
            current = current.next;
        }
    }
    // Method to search for movies by rating
    public void searchMovieByRating(double rating) {
        Movie current = head;
        while (current != null) {
            if (current.rating == rating) {
                System.out.println(current.title + " with rating " + rating);
            }
            current = current.next;
        }
    }
    // Method to display movies in forward and backward order
    public void displayMoviesForward() {
        Movie current = head;
        while (current != null) {
            System.out.println(current.title + " (" + current.year + ") - " + current.director + " - Rating: " + current.rating);
            current = current.next;
        }
    }
    // Method to display movies in forward and backward order
    public void displayMoviesBackward() {
        Movie current = tail;
        while (current != null) {
            System.out.println(current.title + " (" + current.year + ") - " + current.director + " - Rating: " + current.rating);
            current = current.prev;
        }
    }
    // Method to update the rating of a movie
    public void updateMovieRating(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equals(title)) {
                current.rating = newRating;
                return;
            }
            current = current.next;
        }
    }
}
