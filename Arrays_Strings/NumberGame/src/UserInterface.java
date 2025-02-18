import java.util.Arrays;
import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of chances");
       int chances=sc.nextInt();
       if(chances<1 || chances>5) {
    	   System.out.println("Your chance "+chances+" is out of range(1-5)");
    	   return;
       }
       System.out.println("Enter the numbers");
       int[] nums=new int[chances*2];
       for(int i=0;i<nums.length;i++) {
    	   int j=sc.nextInt();
    	   if(j>0 && j<10) {
    		   nums[i]=j;
    	   }else {
    		   System.out.println(j+" is an invalid number");
    		   return;
    	   }
       }
       int sum=0;
		for(int a:nums) {
			sum+=a;
		}
       if(isprime(nums)) {
    	   System.out.println("The sum "+sum+" is a prime number.You won the game");
       }else {
    	   System.out.println("The sum "+sum+" is not a prime number.Better luck next time");
       }
    }

	private static boolean isprime(int[] nums) {
		int sum=0;
		for(int a:nums) {
			sum+=a;
		}
		for(int i=2;i<=Math.sqrt(sum);i++) {
			if(sum<=1) {
				return false;
			}
			if(sum%i==0) {
				return false;
			}
		}
		return true;
	}
}