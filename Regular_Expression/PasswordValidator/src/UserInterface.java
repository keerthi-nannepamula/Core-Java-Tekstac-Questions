import java.util.Scanner;
public class UserInterface
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Generate your password");
		String pword=sc.nextLine();
		
		if(isValidPassword(pword)==true) {
			 int count_l = 0, count_u = 0, count_s = 0, count_d = 0;
	            for (int i = 0; i < pword.length(); i++) {
	                char ch = pword.charAt(i);
	                if (Character.isLowerCase(ch)) {
	                    count_l++;
	                } else if (Character.isUpperCase(ch)) {
	                    count_u++;
	                } else if (Character.isDigit(ch)) {
	                    count_d++;
	                } else if ("@$*#".indexOf(ch) >= 0) {
	                    count_s++;
	                }
	            }
			System.out.println("The generated password "+pword+" is valid and has "+
			count_l+" lowercase alphabet "+count_u+" uppercase alphabet "+
					count_s +" special character "+count_d +" digit");
		}else {
			System.out.println(pword+" is an invalid password");
		}
	}
	
	public static boolean isValidPassword(String p) {

		if (p.length() < 6 || p.length() > 12) {
            return false;
        }

        boolean hasUpper = false, hasLower = false, hasSpecial = false;
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if ("@$*#".indexOf(ch) >= 0) {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasSpecial;
	}
}