//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//public class UserInterface 
//{
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name=sc.nextLine();
//		
//		System.out.println("Enter your ID");
//		String id=sc.nextLine();
//		
//		if(isValidId(id)==false) {
//			System.out.println(id+" is an Invalid ID");
//			return;
//		}
//		
//		System.out.println("Hi "+name+" your seat number is "+Integer.parseInt(id.substring(3, 6))+
//				" and the event starts at "+Integer.parseInt(id.substring(6, 8)+" "+id.substring(8)));
//		
//	}
//	
//	public static boolean isValidId(String id) {
//		if(id.length()!=10) {
//			return false;
//		}
//		if(!id.startsWith("SPC")) {
//			return false;
//		}
//		for(int i=3;i<6;i++) {
//			if(!Character.isDigit(id.charAt(i))) {
//				return false;
//			}
//		}
//		for(int i=6;i<8;i++) {
//			if(Character.isDigit(id.charAt(i))) {
//				if(Integer.parseInt(id.substring(6, 8))<1 && Integer.parseInt(id.substring(6, 8))>12) {
//					return false;
//				}
//			}else {
//				return false;
//			}
//		}
//		if(!(id.substring(8).equals("AM")) && !(id.substring(8).equals("PM"))) {
//			return false;
//		}
////		try {
////			String PatternRegex="[SPC]{3}[0-9]{3}[1-9]{2}[AM/PM]{2}";
////			Pattern pattern=Pattern.compile(PatternRegex);
////			Matcher matcher=pattern.matcher(id);
////			return matcher.matches();
////		}catch(Exception e) {
////			return false;
////		}
//		return true;
//	}
//}
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your ID");
        String id = sc.nextLine();

        if (!isValidId(id)) {
            System.out.println(id + " is an Invalid ID");
            return;
        }

        System.out.println("Hi " + name + " your seat number is " + Integer.parseInt(id.substring(3, 6)) +
                " and the event starts at " + Integer.parseInt(id.substring(6, 8)) + id.substring(8));
    }

    public static boolean isValidId(String id) {
        if (id.length() != 10) {
            return false;
        }
        if (!id.startsWith("SPC")) {
            return false;
        }
        for (int i = 3; i < 6; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }
        try {
            int time = Integer.parseInt(id.substring(6, 8));
            if (time <=0 || time > 12) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        if (!(id.substring(8).equals("AM")) && !(id.endsWith("PM"))) {
            return false;
        }
        return true;
    }
}