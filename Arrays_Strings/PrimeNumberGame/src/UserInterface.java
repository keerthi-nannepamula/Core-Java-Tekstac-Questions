import java.util.Scanner;

public class UserInterface {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of first array");
	    int f_size=sc.nextInt();
	    if(f_size<=0){
	    	System.out.println(f_size+" is an invalid array size");
	    	return;
	    }
	    
		System.out.println("Enter the array elements");
	    int f_arr[]=new int[f_size];
	    for(int i=0;i<f_arr.length;i++) {
	    	f_arr[i]=sc.nextInt();
	    	if(f_arr[i]<0) {
	    		System.out.println(f_arr[i]+" is an invalid input");
	    		return;
	    	}
	    }
	    
	    System.out.println("Enter the size of second array");
	    int s_size=sc.nextInt();
	    
	    if(s_size<=0){
	    	System.out.println(s_size+" is an invalid array size");
	    	return;
	    }
	    
	    if(f_size!=s_size) {
	    	System.out.println("Both array size is different");
	    	return;
	    }
	    
	    System.out.println("Enter the array elements");
	    int s_arr[]=new int[s_size];
	    for(int i=0;i<s_arr.length;i++) {
	    	s_arr[i]=sc.nextInt();
	    	if(s_arr[i]<=0) {
	    		System.out.println(s_arr[i]+" is an invalid input");
	    		return;
	    	}
	    }
	    
	    int result[]=new int[f_size];
	    for(int i=0;i<f_size;i++) {
	    	result[i]=(f_arr[i]+s_arr[i]);
	    }
	    
	    int sum=0;
	    for(int i=0;i<result.length;i++) {
	    	int v=result[i]%10;
	    	sum+=v;
	    }
	    
	    boolean isprime=true;
	    if(sum<2) {
	    	isprime=false;
	    }else {
	    	for(int i=2;i<=Math.sqrt(sum);i++) {
	    		if(sum%i==0)
	    			isprime=false;
	    	}
	    }

		if (isprime) {
            System.out.println(sum + " is a prime number");
        } else {
            System.out.println(sum + " is not a prime number");
        }
  	}
}
