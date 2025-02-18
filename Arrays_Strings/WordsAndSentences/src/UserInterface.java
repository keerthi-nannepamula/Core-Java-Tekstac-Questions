import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sentence");		
		String sentence=sc.nextLine();
		
		System.out.println("Enter the word");
		String word=sc.nextLine();
		
		String[] bits=sentence.split(" ");
		
		if(isPresent(bits,word)) {
			System.out.println(word+" is present in the sentence");
		}else {
			System.out.println(word+" is not present in the sentence");
		}
	}
	
	public static boolean isPresent(String[] splitarray,String word) {
		for(int i=0;i<splitarray.length;i++) {
			if(splitarray[i].equals(word)) {
				return true;
			}
		}
		return false;
	}
	
}	
