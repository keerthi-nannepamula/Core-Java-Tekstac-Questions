import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car cc = new Car();
        int ch = 0;
        do {
            System.out.println("1.Add car\n2.Search by name\n3.Search by count\n4.Total\n5.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (ch == 1) {
                System.out.println("Enter the car name");
                String name = sc.nextLine();
                System.out.println("Enter no of cars sold");
                int no = sc.nextInt();
                cc.addCar(name, no);
            } else if (ch == 2) {
                if (cc.getCarMap().isEmpty()) {
                    System.out.println("The map is empty");
                } else {
                    System.out.println("Enter the car name");
                    String name = sc.nextLine();
                    int result = cc.carByName(name);
                    if (result == -1) {
                        System.out.println("Car not found");
                    } else {
                        System.out.println(result);
                    }
                }
            } else if (ch == 3) {
                if (cc.getCarMap().isEmpty()) {
                    System.out.println("The map is empty");
                } else {
                    System.out.println("Enter the count");
                    int count = sc.nextInt();
                    List<String> result = cc.carByCount(count);
                    if (result == null) {
                        System.out.println("No cars found");
                    } else {
                        result.forEach(System.out::println);
                    }
                }
            } else if (ch == 4) {
                if (cc.getCarMap().isEmpty()) {
                    System.out.println("The map is empty");
                } else {
                    System.out.println(cc.totalCarsSold());
                }
            } else if (ch == 5) {
                System.out.println("Thank you for using the application");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (ch != 5);
    }
}