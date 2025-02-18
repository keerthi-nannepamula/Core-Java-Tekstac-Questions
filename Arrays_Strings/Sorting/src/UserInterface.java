import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the products count");
		int count=sc.nextInt();
		if(count<=0) {
			System.out.println("Invalid count");
		}else {
			System.out.println("Enter Product details");
			List<Product> prod=new ArrayList<>();
			for(int i=0;i<count;i++) {
				String[] details = sc.next().split(":");
	            int productId = Integer.parseInt(details[0]);
	            String productName = details[1];
	            double price = Double.parseDouble(details[2]);
	            prod.add(new Product(productId, productName, price));
				
			}
			
			System.out.println("1.Sort By Id\n"+ "2.Sort By Price");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				Collections.sort(prod,new SortById());
				System.out.println("After Sorting By Id");
				for (Product product : prod) {
		            System.out.println(product);
		        }
				break;
			case 2:
				Collections.sort(prod,new SortByPrice());
				System.out.println("After Sorting By Price");
				for (Product product : prod) {
		            System.out.println(product);
		        }
				break;
			default:
				System.out.println("Invalid choice");
				return;
			}
		}
	}

}
