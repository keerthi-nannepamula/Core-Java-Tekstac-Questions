import java.util.Scanner;
public class UserInterface {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the customer details");
    	String input=sc.next();
    	
    	String[] details=new String[4];
    	
    	for(int i=0;i<details.length;i++) {
    		details=input.split(":");
    	}
    	
    	if(Integer.parseInt(details[1])<0) {
    	System.out.println("Invalid input for number of adults");	
    	}else if(Integer.parseInt(details[2])<0) {
    		System.out.println("Invalid input for number of children");
    	}else if(Integer.parseInt(details[3])<=0) {
    		System.out.println("Invalid input for number of days");
    	}else {
    		int cost_day=(Integer.parseInt(details[1])*1000)+(Integer.parseInt(details[2])*650);
    		int total_cost=cost_day*Integer.parseInt(details[3]);
    		System.out.println(details[0]+" your booking is confirmed and the total cost is "+total_cost);
    	}
    }

}
