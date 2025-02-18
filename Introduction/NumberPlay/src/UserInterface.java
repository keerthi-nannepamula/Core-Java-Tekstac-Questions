import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String number=Integer.toString(n);
        if(n<10) {
        	System.out.println("Invalid number");
        }else if(n>50) {
        	for(int i=0;i<number.length();i++) {
        		for(int j=1;j<=i+1;j++) {
        			System.out.println(Math.subtractExact(number.charAt(i), number.charAt(j)));
        			System.exit(0);
        		}
        	}
        }else if(n<=50 && n>=10){
        	int x=0;
        	while(n!=0) {
        		int i=n%10;
        		x=-x-i;
        		n=n/10;
        	}
        	System.out.println(x);
        }
    }
}