import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tablet> tabletList = new ArrayList<>();

        System.out.println("Enter the number of tablets");
        int numberOfTablets = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the tablet details");
        for (int i = 0; i < numberOfTablets; i++) {
            String[] details = sc.nextLine().split(":");
            String name = details[0];
            String brand = details[1];
            LocalDate expiryDate = LocalDate.parse(details[2]);
            int mg = Integer.parseInt(details[3]);
            double pricePerTablet = Double.parseDouble(details[4]);
            tabletList.add(new Tablet(name, brand, expiryDate, mg, pricePerTablet));
        }

        TabletUtil tabletUtil = new TabletUtil();

        System.out.println("Enter the brand name");
        String brand = sc.nextLine();
        List<Tablet> brandTablets = tabletUtil.retrieveTabletsByBrand(tabletList.stream(), brand);
        if (brandTablets.isEmpty()) {
            System.out.println("No tablets found for the brand " + brand);
        } else {
            System.out.println("Tablets by brand " + brand + " are");
            brandTablets.forEach(System.out::println);
        }

        System.out.println("Enter the minimum mg");
        int mg = sc.nextInt();
        List<String> tabletsAboveMg = tabletUtil.getTabletsAboveMg(tabletList.stream(), mg);
        if (tabletsAboveMg.isEmpty()) {
            System.out.println("No tablets found with a minimum mg of " + mg);
        } else {
            System.out.println("Tablets with a minimum mg of " + mg + " are");
            tabletsAboveMg.forEach(System.out::println);
        }

        sc.close();
    }
}
