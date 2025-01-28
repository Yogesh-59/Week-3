package DoublyLinkedList.MovieManagementSystem;

public class Main {
    public static void main(String[]args){
        // Creating a new movie list
        MovieList movieList = new MovieList();
        movieList.addMovieAtBeginning("Animal", "Sanjay raddy Banga", 2024, 8.6);// Adding movies to the list
        movieList.addMovieAtEnd("Lucky Bhaskar", "Director" + "Venky Atluri", 2024, 9.0);// Adding movies to the list
        movieList.addMovieAtPosition("Infinity War", "\n" + "Director", 2018, 9.8, 1);//  Adding movies to the list
        // Displaying movies in forward and backward order
        System.out.println("Movies in forward order:");
        movieList.displayMoviesForward();
        // Displaying movies in forward and backward order
        System.out.println("\nMovies in backward order:");
        movieList.displayMoviesBackward();
        // Searching for movies by rating and director
        System.out.println("\nSearching for movies by Skumar:");
        movieList.searchMovieByDirector("Skumar");
        // Searching for movies by rating and director
        System.out.println("\nUpdating rating for Aavesham:");
        movieList.updateMovieRating("Aavesham", 7.8);
        movieList.displayMoviesForward();
        // Removing a movie from the list
        System.out.println("\nRemoving Pushpa:");
        movieList.removeMovieByTitle("Pushpa");
        // Displaying movies in forward order after removing a movie
        movieList.displayMoviesForward();
    }
}
