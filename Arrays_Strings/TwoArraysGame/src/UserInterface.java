import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size for the first array");
      int fsize=sc.nextInt();
      if(fsize<=0) {
    	  System.out.println(fsize+" is an invalid array size");
      }else {
    	  int[] farray=new int[fsize];
          System.out.println("Enter the elements for the first array");
          for(int i=0;i<fsize;i++) {
        	  farray[i]=sc.nextInt();
          }
          
          System.out.println("Enter the size for the second array");
          int ssize=sc.nextInt();
          if(ssize<=0) {
        	  System.out.println(ssize+" is an invalid array size");
          }else {
        	  int[] sarray=new int[fsize];
              System.out.println("Enter the elements for the second array");
              for(int i=0;i<ssize;i++) {
            	  sarray[i]=sc.nextInt();
              }
              
              if(fsize!=ssize) {
            	  System.out.println("Both array size are not the same");
              }else {
            	  int[] result=new int[fsize];
            	  for(int i=0;i<fsize;i=i+2) {
            		  result[i]=farray[i]+sarray[i];
            	  }
            	  for(int i=1;i<fsize;i=i+2) {
            		  result[i]=farray[i]-sarray[i];
            	  }
            	  
            	  System.out.println("The elements of the third array");
            	  for(int a:result) {
            		  System.out.println(a);
            	  }
              }
          }
      }
    }
}
