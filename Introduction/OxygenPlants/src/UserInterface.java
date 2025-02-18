import java.util.Scanner;

public class UserInterface {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the length of the room(in m)");
    	int l=sc.nextInt();
    	if(l<=0) {
    		System.out.println("Invalid length");
    		return;
    	}
    	
    	System.out.println("Enter the breadth of the room(in m)");
    	int b=sc.nextInt();
    	if(b<=0) {
    		System.out.println("Invalid breadth");
    		return;
    	}
    	
    	System.out.println("Enter the plant area of a single plant(in cm2)");
    	int pa=sc.nextInt();
    	if(pa<=0) {
    		System.out.println("Invalid plant area");
    		return;
    	}
    	
    	double pam2=pa/10000.0;
    	double floorarea=l*b;
    	int totalplants= (int) (floorarea/pam2);
    	totalplants = (totalplants / 10) * 10;
    	double tpo=totalplants*0.9;
    	System.out.println("Total number of plants is "+Math.round(totalplants));
    	System.out.printf("Total oxygen production is %.2f litres", tpo);
    	
    }
}
