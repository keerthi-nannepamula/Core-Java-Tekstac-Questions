import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the sentence");
	    String input=sc.nextLine();
	    
	    if(!input.matches("^[a-zA-Z ]+$")) {
	    	System.out.println("Invalid Sentence");
	    }else {
	    	String[] words=input.split(" ");
	    	int wordcount=words.length;
	    	System.out.println("Word Count: "+wordcount);
	    	if(wordcount%2!=0) {
	    		StringBuilder reversedSentence = new StringBuilder();
	            for (String word : words) {
	                reversedSentence.append(new StringBuilder(word).reverse().toString()).append(" ");
	            }
	            System.out.println(reversedSentence.toString().trim()); 
	        }else if(wordcount%2==0) {
	        	List<String> wordList = Arrays.asList(words); 
	            Collections.reverse(wordList); 
	            System.out.println(String.join(" ", wordList));
	    	}
	    }
	}
}
