import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		Products pdt=new Products();
		int ch=0;
		do {
			System.out.println("1.Add\n2.Display\n3.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			sc.nextLine();
			if(ch==1) {
				System.out.println("Enter the product");
				String product=sc.nextLine();
				pdt.addProductToList(product);
			}else if(ch==2) {
				if(pdt.getProductList().isEmpty()) {
					System.out.println("The list is empty");
				}else {
					pdt.sortProductList();
				}
			}else if(ch==3) {
				System.out.println("Thank you for using the application");
				return;
			}
			
		}while(ch!=3);
	}
}
