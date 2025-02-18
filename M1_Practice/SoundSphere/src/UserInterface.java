import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Earphone> earphoneList = new ArrayList<>();

        System.out.println("Enter the number of earphones");
        int numberOfEarphones = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the earphone details");
        for (int i = 0; i < numberOfEarphones; i++) {
            String[] details = sc.nextLine().split(":");
            String brandName = details[0];
            LocalDate releaseDate = LocalDate.parse(details[1]);
            double price = Double.parseDouble(details[2]);
            double rating = Double.parseDouble(details[3]);
            earphoneList.add(new Earphone(brandName, releaseDate, price, rating));
        }

        EarphoneUtil earphoneUtil = new EarphoneUtil();

        System.out.println("Enter the brand name");
        String brandName = sc.nextLine();
        Stream<Earphone> brandStream = earphoneUtil.getEarphonesByBrandName(earphoneList.stream(), brandName);
        List<Earphone> brandEarphones = brandStream.collect(Collectors.toList());
        if (brandEarphones.isEmpty()) {
            System.out.println("No earphones found for the brand " + brandName);
        } else {
            System.out.println("Earphones by brand " + brandName + " are");
            brandEarphones.forEach(System.out::println);
        }

        System.out.println("Enter the minimum and maximum price range");
        double minimumPrice = sc.nextDouble();
        double maximumPrice = sc.nextDouble();
        List<Earphone> priceRangeEarphones = earphoneUtil.getEarphonesWithinPriceRange(earphoneList.stream(), minimumPrice, maximumPrice);
        if (priceRangeEarphones.isEmpty()) {
            System.out.println("No earphones found within the price range " + minimumPrice + " to " + maximumPrice);
        } else {
            System.out.println("Earphones within the price range " + minimumPrice + " to " + maximumPrice + " are");
            priceRangeEarphones.forEach(System.out::println);
        }

        sc.close();
    }
}
