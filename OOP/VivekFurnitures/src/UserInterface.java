import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String name=sc.nextLine();
		
		System.out.println("Enter Phone Number");
		long num=sc.nextLong();
		
		System.out.println("Enter address");
		String add=sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter Bero Type");
		String type=sc.nextLine();
		
		if(type.equals("Steel Bero")) {
			System.out.println("Enter Bero Colour");
			String colour=sc.nextLine();
			
			System.out.println("Enter Bero Height");
			int height=sc.nextInt();
			
			SteelBero sb=new SteelBero(type, colour, height);
			sb.calculatePrice();
			Discount d=new Discount();
			double discount=d.calculateDiscount(sb);
			double totalPrice=sb.getPrice()-discount;
			
			System.out.printf("Amount needs to be paid %.2f",totalPrice);
		}else if(type.equals("Wooden Bero")) {
			System.out.println("Enter Bero Colour");
			String colour=sc.nextLine();
			
			System.out.println("Enter Wood Type");
			String woodtype=sc.nextLine();
			
			WoodenBero wb=new WoodenBero(type, colour, woodtype);
			wb.calculatePrice();
			Discount d=new Discount();
			double discount=d.calculateDiscount(wb);
			double totalPrice=wb.getPrice() -discount;
			
			System.out.printf("Amount needs to be paid %.2f",totalPrice);
		}else {
			System.out.println(type+" is an invalid bero type");
			return;
		}
	}

}
