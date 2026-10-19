import java.util.Scanner;

// Problem 2 - Second Largest Finder
// Find the second largest distinct value in an array in a single pass.
// Time: O(n), Space: O(1)
public class SecondLargestFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] parts = sc.nextLine().trim().split(" ");

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(parts[i]);
            if (val > first) {
                second = first;
                first = val;
            } else if (val > second && val != first) {
                second = val;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest");
        } else {
            System.out.println("Second largest: " + second);
        }
        sc.close();
    }
}
