import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first string");
       String s1=sc.nextLine();
       
       System.out.println("Enter the second string");
       String s2=sc.nextLine();
       if(!isValidAlpha(s1) && !isValidAlpha(s2)) {
    	   System.out.println(s1+" and "+s2+" contains invalid symbols");
       }else if(s1.length()!=s2.length()) {
    	   System.out.println("Length of the strings "+s1+" and "+s2+" does not match");
       }else if(!isValidAlpha(s1)) {
    	   System.out.println(s1+" contains invalid symbols");
       }else if(!isValidAlpha(s2)) {
    	   System.out.println(s2+" contains invalid symbols");
       }else {
    	   
    	   char[] chars = s1.toCharArray(); 
    	    for (int i = 0; i < s1.length(); i++) {
    	        if (chars[i] == '!') {
    	            chars[i] = s2.charAt(i); 
    	        }
    	    }
    	    System.out.println(new String(chars)); 
       }
       
    }
    
    public static boolean isValidAlpha(String s) {
    	boolean flag=true;
    	for(char c:s.toCharArray()) {
    		if(!Character.isLetter(c) && c!='!' && c!=' ') {
    			flag=false;
    		}
    	}
    	return flag;
    }
}
