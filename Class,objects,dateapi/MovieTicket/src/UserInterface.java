import java.util.Scanner;
public class UserInterface {
	
	public static void main(String[] arg)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie name");
		String movie_name=sc.next();
		
		System.out.println("Enter no of bookings");
		int bookings=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the available tickets");
		int availableTickets=sc.nextInt();
		Ticket.setavailableTickets(availableTickets);
        sc.nextLine();
        
		for(int i=1;i<=bookings;i++) {
			Ticket t=new Ticket();
			System.out.println("Enter the ticketid");
			t.setticketid(sc.nextInt());
			System.out.println("Enter the price");
			t.setPrice(sc.nextInt());
			System.out.println("Enter the no of tickets");
			int tickets=sc.nextInt();
			
			System.out.println("Available tickets: "+Ticket.getavailableTickets());
			
			int totalAmount = t.calculateTicketCost(tickets);
            if (totalAmount == -1) {
                System.out.println("Tickets are not available");
            } else {
                System.out.println("Total amount: " + totalAmount);
                if (Ticket.getavailableTickets() == 0) {
                    System.out.println("House full");
                } else {
                    System.out.println("Available ticket after booking: " + Ticket.getavailableTickets());
                }
            }

		}
		sc.close();
    }
}

