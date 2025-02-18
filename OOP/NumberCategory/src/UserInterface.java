import java.util.Scanner;
public class UserInterface{

	public static NumberCategory checkAmicable() {
		return (number1, number2) -> {
            int sum1 = 0, sum2 = 0;
            for (int i = 1; i < number1; i++) {
                if (number1 % i == 0) {
                    sum1 += i;
                }
            }
            for (int i = 1; i < number2; i++) {
                if (number2 % i == 0) {
                    sum2 += i;
                }
            }
            return sum1 == number2 && sum2 == number1;
        };
	}
	
	public static NumberCategory checkPalindrome() {
		return (number1, number2) -> {
            int product = number1 * number2;
            String str = Integer.toString(product);
            String reversedStr = new StringBuilder(str).reverse().toString();
            return str.equals(reversedStr);
        };
		
	}

 public static void main(String [] args)
    {
	 Scanner sc = new Scanner(System.in);
     int number1 = sc.nextInt();
     int number2 = sc.nextInt();

     NumberCategory amicableCheck = checkAmicable();
     NumberCategory palindromeCheck = checkPalindrome();

     if (amicableCheck.checkNumberCategory(number1, number2)) {
         System.out.println(number1 + " and " + number2 + " are amicable numbers");
     } else {
         System.out.println(number1 + " and " + number2 + " are not amicable numbers");
     }

     if (palindromeCheck.checkNumberCategory(number1, number2)) {
         System.out.println("Their Product " + (number1 * number2) + " do produces a Palindrome");
     } else {
         System.out.println("Their Product " + (number1 * number2) + " does not produce a Palindrome");
     }
 }


    
}