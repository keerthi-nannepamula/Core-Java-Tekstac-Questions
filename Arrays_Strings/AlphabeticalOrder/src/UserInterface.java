import java.util.Arrays;
import java.util.Scanner;
public class UserInterface
{
	public static void main(String[] args)
	{
        
	       Scanner sc=new Scanner(System.in);
	       
	       System.out.println("Enter the sentence");
	       String sentence=sc.nextLine();
	       
	       char[] chars=sentence.toCharArray();
	       for(char c:chars) {
	    	   if(!Character.isLowerCase(c) && !Character.isSpace(c)) {
	    		   System.out.println(sentence+" is an invalid input");
	    		   return;
	    	   }
	       }
	       
	       String[] word=sentence.split(" ");
	       String ss="";
	       for(int i=0;i<word.length;i++) {
	    	   char[] x=word[i].toCharArray();
	    	   Arrays.sort(x);
	    	   ss += new String(x)+" ";
	       }
	    
    	   System.out.print(ss);
	}

}
