import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		System.out.println("Enter your PAN number");
		String pan=sc.nextLine();
		
		if(!isValidPan(pan)) {
			System.out.println(pan+" is an invalid PAN number");
			return;
		}
		
		System.out.println("Enter your E-mail ID");
		String email=sc.nextLine();
		
		if(!isValidEmail(email)) {
			System.out.println("Invalid E-mail ID");
			return;
		}
		
		System.out.println("Profile of "+name+" updated successfully");
	}
	
	public static boolean isValidPan(String p) {
		if(p.length()!=10) {
			return false;
		}
		for(int i=0;i<5;i++) {
			if(!Character.isUpperCase(p.charAt(i))) {
				return false;
			}
		}
		for(int i=5;i<9;i++) {
			if(!Character.isDigit(p.charAt(i))) {
				return false;
			}
		}
		if(!Character.isUpperCase(p.charAt(p.length()-1))){
			return false;
		}
		return true;
	}
	
	public static boolean isValidEmail(String e) {
		if(!e.endsWith("@digitec.com")) {
			return false;
		}
		String entry=e.substring(0,e.indexOf("@"));
		if(entry.length()<5 || entry.length()>10) {
			return false;
		}
		return true;
	}


}