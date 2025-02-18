import java.util.Scanner;
import java.util.regex.Pattern;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your profile code");
		String code=sc.nextLine();
		if(isvalidcode(code)) {
			System.out.println(code + " is a valid profile code whose last 3 digits are " + code.substring(5));
		}
	}

	private static boolean isvalidcode(String code) {
		boolean length=false,splchar=false,upchar=true,digits=false;
		
		if(code.length()==8) {
			length=true;
		}else {
			System.out.println(code+" does not have the specified length");
			return false;
		}
		
		if(code.startsWith("#")) {
			splchar=true;
		}else {
			System.out.println(code+" does not start with a valid special character");
			return false;
		}
		
		for (int i = 1; i < 5; i++) {
            if (!Character.isUpperCase(code.charAt(i))) {
                System.out.println(noofupchar(code) + " is an invalid number for uppercase character");
                upchar = false;
                break;
            }
        }
		
		for(int i=5;i<code.length();i++) {
			if(Character.isDigit(code.charAt(i))) {
				digits=true;
			}else {
				System.out.println( noofdig(code)+ " is an invalid number for digits");
	            digits=false;
	            break;
			}
		}
		return length && splchar && upchar && digits;
	}

	private static int noofdig(String code) {
		int count=0;
		for(int i=5;i<code.length();i++) {
			if(Character.isDigit(code.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	private static int noofupchar(String code) {
		int count=0;
		for(int i=1;i<5;i++) {
			if(Character.isUpperCase(code.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	
}