import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the total number of PIN numbers");  
       int nopins=sc.nextInt();
       if(nopins<=0) {
    	   System.out.println(nopins +" is an invalid number");
       }else {
    	   String[] num=new String[nopins];
    	   System.out.println("Enter the PIN numbers");
    	   sc.nextLine();
    	   for(int i=0;i<num.length;i++) {
    		   String x=sc.nextLine();
    		   if(x.length()!=4) {
    			   System.out.println(x+" is an invalid PIN number");
    		   }else {
    			   num[i]=x;
    		   }
       	   }
    	   int count=0;
    	   boolean validFound = false;
    	   for(String a:num) {
    		  if(a!=null && validpin(a)) {
    			  if(!validFound) {
    				  System.out.println("Valid PIN numbers are");
    				  validFound=true;
    			  }
    			  System.out.println(a);
    		  }else {
    			  count++;
    		  }
    	   }
    	   if(count==nopins) {
    		   System.out.println("All these "+nopins+" numbers are not a valid PIN number");
    	   }
       }  
    }

	private static boolean validpin(String a) {
        
        int first = Character.getNumericValue(a.charAt(0));
        int second = Character.getNumericValue(a.charAt(1));
        int third = Character.getNumericValue(a.charAt(2));
        int fourth = Character.getNumericValue(a.charAt(3));
        
        return first % 2 != 0 && second % 2 == 0 && isprime(third) && iscomposite(fourth);
	}

	private static boolean iscomposite(int numericValue) {
		boolean flag=false;
		if(numericValue<=1)
			flag=false;
		for(int i=2;i<=Math.sqrt(numericValue);i++) {
			if(numericValue%i==0) {
				flag=true;
			}
		}
		return flag;
	}

	private static boolean isprime(int numericValue) {
		boolean flag=true;
		if(numericValue<=1)
			flag=false;
		for(int i=2;i<=Math.sqrt(numericValue);i++) {
			if(numericValue%i==0) {
				flag=false;
			}
		}
		return flag;
	}
}