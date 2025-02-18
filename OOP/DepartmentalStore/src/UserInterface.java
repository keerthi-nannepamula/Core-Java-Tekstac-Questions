import java.util.Scanner;

public class UserInterface {

		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the customer name");
		String name=sc.nextLine();
		
		System.out.println("Enter the phone number");
		String num=sc.nextLine();
		
		System.out.println("Enter the street name");
		String street=sc.nextLine();
		
		System.out.println("Enter the bill amount");
		double bamt=sc.nextDouble();
		
		System.out.println("Enter the distance");
		int dist=sc.nextInt();
		
		CustomerDetails cd=new CustomerDetails(name, num, street, bamt, dist);
		cd.getDetails();
	}
}
