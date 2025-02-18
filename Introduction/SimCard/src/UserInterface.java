import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
       int sum_even=0;
       int sum_odd=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the phone number");
       long phone=sc.nextLong();
       int evensum=0;
       int oddsum=0;
       String p=Long.toString(phone);
       for(int i=0;i<p.length();i++) {
    	   int digit=Character.getNumericValue(p.charAt(i));
    	   if(digit%2==0) {
    		   evensum+=digit;
    	   }else {
    		   oddsum+=digit;
    	   }
       }
       if(evensum==oddsum) {
    	   System.out.println("Sum of odd and even are equal");
       }else if(evensum<oddsum) {
    	   System.out.println("Sum of odd is greater than sum of even");
       }else if(oddsum<evensum) {
    	   System.out.println("Sum of even is greater than sum of odd");
       }
    }
}