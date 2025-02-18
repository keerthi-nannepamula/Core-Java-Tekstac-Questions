import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date");
		String s=sc.nextLine();
		validate(s);
		
		if(validate(s)) {
			System.out.println(s+" is a valid date");
		}else {
			System.out.println(s+" is not a valid date");
		}
	}

	private static boolean validate(String s) {
		boolean flag;
		if (s == null || !s.matches("\\d{2}/\\d{2}/\\d{4}")) {
            flag= false;
		}
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
        	sdf.parse(s);
        	flag=true;
        }catch(ParseException e) {
        	flag=false;
        }
        return flag;
	}
}

