import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println(n+" is a negative number");
		}else {
			int hl=n+9;
			int sum=0;
			for(int i=n;i<=hl;i++) {
				sum=sum+i;
			}
			System.out.println("The sum of ten numbers is "+sum);
		}
	}
}
