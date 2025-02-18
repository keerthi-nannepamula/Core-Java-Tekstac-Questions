import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Country cc = new Country();
        int ch = 0;
        do {
            System.out.println("1.Add\n2.Search\n3.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (ch == 1) {
                System.out.println("Enter the country name");
                String country = sc.nextLine();
                System.out.println("Enter the capital name");
                String capital = sc.nextLine();
                cc.add(country, capital);
            } else if (ch == 2) {
            	if (cc.getCountryMap().isEmpty()) {
            	    System.out.println("The map is empty");
            	} else {
            	    System.out.println("Enter the country name");
            	    String country = sc.nextLine();
            	    String result = cc.search(country);
            	    System.out.println(result);
            	}
            } else if (ch == 3) {
                System.out.println("Thank you for using the application");
                return;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (ch != 3);
    }
}
