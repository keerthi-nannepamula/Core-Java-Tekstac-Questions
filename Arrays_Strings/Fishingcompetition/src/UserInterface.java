import java.util.Scanner;

public class UserInterface 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the details");
		String input=sc.nextLine();
		
		String[] details=input.split(":");
		
		if(Integer.parseInt(details[1])<18) {
			System.out.println(details[1]+" is an invalid age");
			return;
		}
		
		if(Integer.parseInt(details[2])<0) {
			System.out.println(details[2]+" is an invalid input");
			return;
		}else if(Integer.parseInt(details[3])<0) {
			System.out.println(details[3]+" is an invalid input");
			return;
		}else if(Integer.parseInt(details[4])<0) {
			System.out.println(details[4]+" is an invalid input");
			return;
		}

		
		int big_points=Integer.parseInt(details[2])*10;
		int medium_points=Integer.parseInt(details[3])*6;
		int small_points=Integer.parseInt(details[4])*3;
		
		System.out.println(details[0]+" scored "+(big_points+medium_points+small_points)+" points");
	}
	
}	
