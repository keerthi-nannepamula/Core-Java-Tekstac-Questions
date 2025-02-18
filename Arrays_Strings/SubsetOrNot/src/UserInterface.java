import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first array size");
       int f_size=sc.nextInt();
       if(f_size<=0) {
    	   System.out.println(f_size+" is an invalid array size");
       }else {
    	   int[] f_array=new int[f_size];
    	   System.out.println("Enter the numbers");
           for(int i=0;i<f_size;i++) {
        	   f_array[i]=sc.nextInt();
           }
           System.out.println("Enter the second array size");
           int s_size=sc.nextInt();
           if(s_size<=0) {
        	   System.out.println(s_size+" is an invalid array size");
           }else if(s_size>f_size){
        	   System.out.println(s_size+" is an invalid size as it is greater than first array size "+f_size);
           }else {
        	   int s_array[]=new int[s_size];
        	   System.out.println("Enter the numbers");
        	   for(int i=0;i<s_size;i++) {
        		   s_array[i]=sc.nextInt();
        	   }
        	   
    		    if(isSubset(f_array,s_array)==true) {
    		    	System.out.println("Array2 of size "+s_size+" is a subset of array1");
    		    }else {
    		    	System.out.println("Array2 of size "+s_size+" is not a subset of array1");
    		    }
           }
       }
       
    }
    
    public static boolean isSubset(int a[],int b[]) {
    	Arrays.sort(a);
    	Arrays.sort(b);
    	HashSet<Integer> f_set=new HashSet<Integer>();
 	   for(int num:a) {
 		   f_set.add(num);
 	   }
 	   
 	   for(int num:b) {
 		   if(!f_set.contains(num)){
 			   return false;
 		   }
 	   }
 	  return true;
    }
}