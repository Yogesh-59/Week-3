package CircularLinkedList.TicketReservationSystem;

public class Main {
    public static void main(String[] args) {
        //Creating the object of Reservation System
        ReservationSystem system = new ReservationSystem();
        //Adding the details in reservation system object
        system.addTicket(1, "Yogesh", "Animal", "A11", "10:00 PM");
        system.addTicket(2, "Durgesh", "The EndGame", "D02", "11:00 AM");
        system.addTicket(3, "Deepraj", "Kalki", "A03", "12:00 PM");
        //Displaying the tickets
        System.out.println("All tickets:");
        system.displayTickets();
        //Searching the ticket
        System.out.println("\nSearching for tickets by customer name 'Yogesh':");
        system.searchTicket("Yogesh");
        //Getting total number of ticket and printing the same
        System.out.println("\nTotal number of tickets: " + system.totalTickets());
        //Removing ticket with the ticket id
        System.out.println("\nRemoving ticket with ID 2:");
        system.removeTicket(2);
        //Displaying tickets after rmoval
        System.out.println("\nAll tickets after removal:");
        system.displayTickets();
        //Displaying total number of ticket after the removal of ticket
        System.out.println("\nTotal number of tickets after removal: " + system.totalTickets());
    }
}
