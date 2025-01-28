package CircularLinkedList.TicketReservationSystem;

 class Ticket {
     int ticketID;
     String customerName;
     String movieName;
     String seatNumber;
     String bookingTime;
     Ticket next;
     //Constructor for Ticket Class
     public Ticket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
         this.ticketID = ticketID;
         this.customerName = customerName;
         this.movieName = movieName;
         this.seatNumber = seatNumber;
         this.bookingTime = bookingTime;
         this.next = null;
     }
}
