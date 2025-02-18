import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ticket Id");
		String ticket=sc.next();
		System.out.println("Enter the unlucky code");
		int unlucky=sc.nextInt();
		sc.close();
		int count=0;
		String unluckys=Integer.toString(unlucky);
		for (int i=0;i<ticket.length();i++) {
			if(unluckys.charAt(0) ==ticket.charAt(i)) {
				count++;
			}
		}
		if(count==0) {
			System.out.printf(ticket+" is lucky ticket");
		}else if(count<3) {
			System.out.println(ticket+ " is partially lucky");
		}else if(count>=3) {
			System.out.printf(ticket+" is unlucky ticket");
		}
	}
}