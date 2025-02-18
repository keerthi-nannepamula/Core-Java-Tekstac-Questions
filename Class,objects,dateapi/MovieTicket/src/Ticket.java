public class Ticket
{
    private int ticketid;
    private int price;
    private static int availableTickets;
    
	public int getticketid() {
    	return ticketid;
    }
    public void setticketid(int ticketid) {
    	this.ticketid=ticketid;
    }
    
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static int getavailableTickets() {
		return availableTickets;
	}
	public static void setavailableTickets(int availableTickets) {
		Ticket.availableTickets=availableTickets;
	}
	

	public int calculateTicketCost(int nooftickets)
    {
		if(Ticket.availableTickets>=nooftickets  && availableTickets > 0) {
			int totalAmount = nooftickets * price;
            availableTickets -= nooftickets;
            return totalAmount;
		}else if (availableTickets <= 0 || availableTickets < nooftickets){
			return -1;
		}else {
			return -1;
		}
    }
	    
}
