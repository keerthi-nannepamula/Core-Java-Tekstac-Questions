import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class UserInterface
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alex points");
		int alex=sc.nextInt();
		if(alex<0 || alex>50) {
			System.out.println(alex+" is an invalid number");
			return;
		}
		
		System.out.println("Enter Nikil points");
		int nikil=sc.nextInt();
		if(nikil<0 || nikil>50) {
			System.out.println(nikil+" is an invalid number");
			return;
		}
		System.out.println("Enter Sam points");
		int sam=sc.nextInt();
		if(sam<0 || sam>50) {
			System.out.println(sam+" is an invalid number");
			return;
		}
			
		sc.close();
		
		if(alex==nikil || nikil==sam || alex==sam) {
				System.out.println("The game is a tie");
		}else {
			int highest=Math.max(alex, Math.max(nikil, sam));
			String name="";
			if(highest==alex) {
				name="Alex";
			}else if(highest==nikil) {
				name="Nikil";
			}else if(highest==sam) {
				name="Sam";
			}
			System.out.println(name+" scored "+highest+" points and won the game");
		}
    }
}
