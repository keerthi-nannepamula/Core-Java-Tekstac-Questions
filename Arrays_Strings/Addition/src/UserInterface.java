// Don't Change the Structure

import java.util.Scanner;

public class UserInterface 
{
	public static void main(String args[]) 
	{
		Scanner sc =new Scanner(System.in);
		
        System.out.println("Total " + addition(10, 15));

        System.out.println("Total " + addition(10, 20, 30));
        

        System.out.println("Total " + addition(10, 20, 30, 40, 50, 70));
	}
	
	
	 public static int addition(int...a) {
		 System.out.println("Number of arguments is " + a.length);
	        
	        // Calculate the sum of the arguments
	        int sum = 0;
	        for (int num : a) {
	            sum += num;
	        }
	        
	        // Return the sum
	        return sum;
	 }
	 
	 
}