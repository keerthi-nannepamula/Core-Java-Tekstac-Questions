import java.util.Arrays;
import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the city name");
       String place=sc.next();
       
       String[] choices= {"Chennai", "Coimbatore", "Erode", "Karur", "Madurai", "Hyderabad", "Salem", "Bangalore", "Delhi", "Agra"};
       if(isBusAvaiable(place,choices)) {
    	   System.out.println("Bus for "+place+" is available");
       }else {
    	   System.out.println("Bus for "+place.toString()+" is not available");
       }
       
    }
    public String toString(String choices[]) {
 	   return choices.toString();
    }

    
    static boolean isBusAvaiable(String place,String city[]) {
    	for(int i=0;i<city.length;i++) {
     	   if(place.equalsIgnoreCase(city[i])) {
     		   return true;
     	   }
        }
    	return false;
    }
    
}