import java.util.*;
public class UserInterface{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the word");
		String word=sc.nextLine();
		int l=word.length();
		System.out.println("Enter the two indices");
		int i1=sc.nextInt();
		if(i1>=l) {
			System.out.println(i1+" is greater than the word length");
			return;
		}
		
		int i2=sc.nextInt();
		
		if(i2>l) {
			System.out.println(i2+" is greater than the word length");
			return;
		}
		
		if(i1>=i2 || i1<0) {
			System.out.println("Index2 should be greater than Index1");
			return;
		}else {
//			System.out.println(word.substring(i1, i2));
			for(int i=i1;i<i2;i++) {
				System.out.print(word.charAt(i));
			}
		}
		sc.close();
	}
}
