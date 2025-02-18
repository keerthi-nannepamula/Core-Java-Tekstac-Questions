import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		int day=sc.nextInt();

		if(day>0 && day<=30) {
			System.out.printf("Number of eggs in %dth day is %d",day,pell(day));
		}else {
			System.out.println(day+" is invalid day");
		}
	}
	public static int pell(int n) {
		if(n<=2 && n>=0)
			return n;
		return 2*pell(n-1)+pell(n-2);
	}
}
