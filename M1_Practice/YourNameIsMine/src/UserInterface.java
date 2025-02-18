import java.util.HashSet;
import java.util.Scanner;
 
public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the man name");
        String man=sc.nextLine();
        System.out.println("Enter the woman name");
        String woman=sc.nextLine();
        
        if(!man.matches("^[a-zA-Z ]+$")) {
        	System.out.println(man+"is an invalid name");
        	return;
        }else if(!woman.matches("^[a-zA-Z ]+$")) {
        	System.out.println(woman+"is an invalid name");
        	return;
        }else if(!man.matches("^[a-zA-Z ]+$") && !woman.matches("^[a-zA-Z ]+$")) {
        	System.out.println("Both "+man+" and "+woman+" are inalid names");
        	return;
        }
        
        if(isSubsequence(man, woman)) {
        	System.out.println(man+" and "+woman+" are made for each other");
        	System.out.println("Compatibility Value is "+ getcompatibility(man,woman));
        }else {
        	System.out.println(man+" and "+woman+" are not made for each other");
        	return;
        }
    }
    
    public static boolean isSubsequence(String s1,String s2) {
    	   int i=0;
    	   int j=0;
    	   while(i<s1.length() && j<s2.length()) {
    		   if(s1.charAt(i)==s2.charAt(j)) {
    			   i++;
    		   }
    		   j++;
    	   }
    	   return i==s1.length();
    }
    
    public static int getcompatibility(String s1,String s2) {
    	HashSet<Character> s11=new HashSet<Character>();
    	for(int i=0;i<s1.length();i++) {
    		s11.add(s1.charAt(i));
    	}
    	
    	HashSet<Character> s22=new HashSet<Character>();
    	for(int i=0;i<s2.length();i++) {
    		s22.add(s2.charAt(i));
    	}
    	s22.removeAll(s11);
    	return s22.size();
    	
    }
}

