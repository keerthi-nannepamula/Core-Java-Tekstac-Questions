import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println(size + " is an invalid array size");
        } else if (size % 2 != 0) {
            System.out.println(size + " is an odd number. Please enter even number");
        } else {
            System.out.println("Enter the numbers");
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();

            Arrays.sort(arr);

            int[] sums = new int[size / 2];
            for (int i = 0; i < size / 2; i++) {
                sums[i] = arr[i] + arr[size - 1 - i];
            }

            int maxSum = Arrays.stream(sums).max().orElseThrow();
            System.out.println("The maximum number is " + maxSum);
        }
    }
}