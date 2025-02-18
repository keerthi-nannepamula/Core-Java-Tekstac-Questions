import java.util.Scanner;

public class UserInterface 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the training id");
		String tid=sc.nextLine();
		
		if(tid.length()!=9) {
			System.out.println(tid+" is an invalid training id");
			return;
		}
		char[] c=tid.toCharArray();
				
		if (!tid.startsWith("2021")) {
            System.out.println(tid.substring(0, 4) + " is an invalid year");
            return;
        }
		
		String teamcode=tid.substring(4, 6);
		String tc="";
		switch(teamcode) {
		case "01":
			tc="LP";
			break;
		case "02":
			tc="TA";
			break;
		case "03":
			tc="CT";
			break;
		case "04":
			tc="PT";
			break;
		case "05":
			tc="TT";
			break;
		default:
			System.out.println(teamcode+" is an invalid team code");
			return;
		}
		
		String roll=tid.substring(6);
		if(Integer.parseInt(roll)<1 || Integer.parseInt(roll)>999) {
			System.out.println(roll+" is an invalid roll number");
			return;
		}
		
		String id="SIET"+tc+roll;
		System.out.println("Employee Id: "+id);
		
	}
	
}	
