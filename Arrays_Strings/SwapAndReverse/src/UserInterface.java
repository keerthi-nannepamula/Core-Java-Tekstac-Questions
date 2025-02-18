import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the sentence");
		String sentence=sc.nextLine();
		
		String[] words=sentence.split(" ");
		
		if(words.length<=2) {
			System.out.println("Invalid Length");
			return;
		}else if(!onlyalphaspace(sentence)) {
			System.out.println(sentence+" is an invalid sentence");
		}else {
			String result = swapAndReverse(words);
            System.out.println(result);
		}
	}
	
	public static boolean onlyalphaspace(String s) {
		for (char c : s.toCharArray()) {
	        if (!Character.isLetter(c) && c != ' ') {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static String swapAndReverse(String[] words) {
        // Swap the first and last words
        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;
        
//        for(int i=1;i<words.length-1;i++) {
//        	String y=words[words.length-1-i];
//        	String x=new StringBuilder().reverse().toString();
//        	words[words.length-1-i]=x;
//        }
        for (int i = 1; i < words.length - 1; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        
        // Swap the reversed middle words
        for (int i = 1; i < (words.length - 1) / 2; i++) {
            temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        return String.join(" ", words);
    }
}	
