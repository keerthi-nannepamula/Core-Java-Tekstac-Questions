import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Manufacturing Date");
		String s=sc.nextLine();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		Date d=null;
		
//		if(s==null || !(s.matches("\\d{2}/\\d{2}/\\d{4}"))) {
//			System.out.println(s+ " is not a valid date");
//			return;
//		}
		
		try {
			d=sdf.parse(s);
			System.out.println("Enter the Month");
			int month=sc.nextInt();
			Calendar c = Calendar.getInstance();  
			c.setTime(d);  
			c.add(Calendar.MONTH, month);
			Date dd=c.getTime();
			System.out.println(sdf.format(dd)+" is the expiry date");
		}catch(ParseException e) {
			System.out.println(s+ " is not a valid date");
			return;
		}finally {
			sc.close();
		}
	}

}
