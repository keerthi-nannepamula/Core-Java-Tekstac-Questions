import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height in cm");
		float h=sc.nextFloat();
		double height=h/30.48;
		System.out.printf("Height in feet is %.2f feet",height);
	}

}
