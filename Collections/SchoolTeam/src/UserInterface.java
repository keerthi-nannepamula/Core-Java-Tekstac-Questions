import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ClassHouseFormation stud=new ClassHouseFormation();
		
		System.out.println("Enter the number of students");
		int num=sc.nextInt();
		if(num<=0) {
			System.out.println("Invalid input");
		}else {
			System.out.println("Enter the details");
			for(int i=0;i<=num;i++) {
				String details=sc.nextLine();
				stud.addName(details);
			}
			HashSet<String> teams=stud.formTeam();
			for(String s:teams) {
				System.out.println(s);
			}
		}
	}
}