import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        if(size<1 || size>5) {
        	System.out.println(size+" is an invalid array size");
        }else {
        	int[] nums=new int[size];
        	System.out.println("Enter the numbers");
        	
        	for(int i=0;i<size;i++) {
        		int v=sc.nextInt();
        		if(v<=0 || v>=100) {
        			System.out.println(v+" is an invalid input");
        		}else {
        			nums[i]=v;
        		}
        	}
     
            if (foundPrimeSum(nums)==false) {
                System.out.println("The " + size + " numbers are not sum of prime numbers");
                return;
            }

            sc.close();
        	
        }
    }
    private static boolean foundPrimeSum(int[] nums) {
    	boolean PrimeSum = false;
    	boolean x=false;
    	for (int a : nums) {
            if (isprime(a) && consecutiveprime(a)) {
            	if(!x) {
            		System.out.println("The sum of prime numbers is");
            		x=true;
            	}
                System.out.println(a);
                PrimeSum=true;
            }
        }
    	return PrimeSum;
    }

	private static boolean consecutiveprime(int a) {
		int sum=0;
		for(int i=2;sum<a;i++) {
			if(UserInterface.isprime(i)) {
				sum+=i;
			}
		}
		if(sum==a)
			return true;
		return false;
	}

	private static boolean isprime(int a) {
		if(a<=1)
			return false;
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0)
				return false;
		}
		return true;
	}
    
    
}
