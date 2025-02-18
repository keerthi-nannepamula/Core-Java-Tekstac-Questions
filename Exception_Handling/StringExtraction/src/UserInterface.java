import java.util.Scanner;

public class UserInterface {
	
	public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String");
       String sentence=sc.nextLine();
       System.out.println("Enter First Index");
       int index1=sc.nextInt();
       System.out.println("Enter Second Index");
       int index2=sc.nextInt();
       String x=extractString(sentence, index1, index2);
       System.out.println(x);
    }
	
	@SuppressWarnings("finally")
	public static String extractString(String sentence,int number1,int number2)
    {
		String print ="";
        try {
        	if(number1<0 || number1>sentence.length()) {
        		throw new StringIndexOutOfBoundsException("Invalid index position.");
        	}else if(number2<0 || number1>sentence.length()){
        		throw new StringIndexOutOfBoundsException("Invalid index position.");
        	}else {
        		String result=sentence.substring(number1,number2);
            	print="The output string is "+result+".";
            	return print;
        	}        	
        }catch(StringIndexOutOfBoundsException e) {
        	print="Invalid index position.";
        	return e.getMessage();
        }finally {
        	return print+"Thanks for using the application.";
        }
    }

}
