import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		
		System.out.println("Enter the number of rooms you needed");
		int rooms=sc.nextInt();
		
		int price=500;
		
		if(rooms<=0) {
			while(rooms<=0) {
				System.out.println("Please enter a valid number");
				rooms=sc.nextInt();
			}
			System.out.println("Enter the phone number");
			long phone=sc.nextLong();
			System.out.printf("Pay Rs. %d for booking",500*rooms);
			System.out.println();
			System.out.println("Your booking has been confirmed");
		}else if(rooms>0){
			System.out.println("Enter the phone number");
			long phone=sc.nextLong();
			System.out.printf("Pay Rs. %d for booking",500*rooms);
			System.out.println();
			System.out.println("Your booking has been confirmed");
		}
	}
}