import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date of joining");
		String s=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=null;
		try {
			d1=sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar c1=Calendar.getInstance();
		c1.setTime(d1);
		
		Calendar c2=Calendar.getInstance();
		c2.set(2020, Calendar.DECEMBER, 15);
		Date d2=null;
		
		
		int exp=c2.get(Calendar.YEAR)-c1.get(Calendar.YEAR);
		System.out.println(exp+" years of experience");
	}

}
