import java.util.Map;
import java.util.Scanner;

public class UserInterface{
    public static void main(String args[]) {
	   Scanner scanner = new Scanner(System.in);
	   CakeOrder cakeOrder = new CakeOrder();

       System.out.println("Enter number of cake orders to be added");
       int numberOfOrders = scanner.nextInt();
       scanner.nextLine(); // Consume the newline character

       System.out.println("Enter the cake order details (Order Id: CakeCost)");
       for (int i = 0; i < numberOfOrders; i++) {
           String[] details = scanner.nextLine().split(":");
           String orderId = details[0];
           double cakeCost = Double.parseDouble(details[1]);
           cakeOrder.addOrderDetails(orderId, cakeCost);
       }

       System.out.println("Enter the cost to search the cake orders");
       double searchCost = scanner.nextDouble();

       Map<String, Double> filteredOrders = cakeOrder.findOrdersAboveSpecifiedCost(searchCost);
       if (filteredOrders.isEmpty()) {
           System.out.println("No cake orders found");
       } else {
           System.out.println("Cake Orders above the specified cost");
           filteredOrders.forEach((orderId, cost) -> 
               System.out.println("Order ID: " + orderId + ", Cake Cost: " + cost));
       }

       scanner.close();
	}
}