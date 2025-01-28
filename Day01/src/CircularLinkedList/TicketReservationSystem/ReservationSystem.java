package CircularLinkedList.TicketReservationSystem;

 class ReservationSystem {
     private Ticket last;
     //Constructor for Reservation System class
     public ReservationSystem() {
         last = null;
     }
     //Function to add Ticket
     public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
         Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
         if (last == null) {
             last = newTicket;
             last.next = last;
         } else {
             newTicket.next = last.next;
             last.next = newTicket;
             last = newTicket;
         }
     }
     //Function to remove ticket
     public void removeTicket(int ticketID) {
         if (last == null) {
             System.out.println("No tickets to remove.");
             return;
         }

         Ticket current = last.next;
         Ticket previous = last;
         do {
             if (current.ticketID == ticketID) {
                 if (current == last.next && current == last) {
                     last = null;
                 } else {
                     previous.next = current.next;
                     if (current == last) {
                         last = previous;
                     }
                 }
                 System.out.println("Ticket removed: " + ticketID);
                 return;
             }
             previous = current;
             current = current.next;
         } while (current != last.next);

         System.out.println("Ticket ID not found: " + ticketID);
     }
     //function to display ticket
     public void displayTickets() {
         if (last == null) {
             System.out.println("No tickets to display.");
             return;
         }

         Ticket current = last.next;
         do {
             System.out.println("Ticket ID: " + current.ticketID + ", Customer Name: " + current.customerName +
                     ", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber +
                     ", Booking Time: " + current.bookingTime);
             current = current.next;
         } while (current != last.next);
     }
     //Function to search ticket
     public void searchTicket(String searchTerm) {
         if (last == null) {
             System.out.println("No tickets to search.");
             return;
         }

         Ticket current = last.next;
         boolean found = false;
         do {
             if (current.customerName.equalsIgnoreCase(searchTerm) || current.movieName.equalsIgnoreCase(searchTerm)) {
                 System.out.println("Ticket ID: " + current.ticketID + ", Customer Name: " + current.customerName +
                         ", Movie Name: " + current.movieName + ", Seat Number: " + current.seatNumber +
                         ", Booking Time: " + current.bookingTime);
                 found = true;
             }
             current = current.next;
         } while (current != last.next);

         if (!found) {
             System.out.println("No tickets found for search term: " + searchTerm);
         }
     }
     //Function to get total number of ticket
     public int totalTickets() {
         if (last == null) {
             return 0;
         }

         int count = 0;
         Ticket current = last.next;
         do {
             count++;
             current = current.next;
         } while (current != last.next);

         return count;
     }
}
