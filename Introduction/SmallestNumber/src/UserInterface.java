import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b) {
			if(b==c) {
				System.out.println("All numbers are equal");
			}
			else {
				int smallest=(b<c?b:c);
				System.out.println("The smallest number is "+smallest);
			}
		}else {
			int smallest=(a<b?(a<c?a:c):b);
			System.out.println("The smallest number is "+smallest);
		}
	}

}
