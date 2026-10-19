import java.util.Scanner;
import java.util.HashSet;

// Problem 3 - Pair Sum Checker
// Given an array and a target, check whether any two distinct elements sum to target.
// Time: O(n), Space: O(n)
public class PairSumChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] parts = sc.nextLine().trim().split(" ");
        int target = Integer.parseInt(sc.nextLine().trim());

        HashSet<Integer> seen = new HashSet<>();
        boolean found = false;
        int pa = 0, pb = 0;

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(parts[i]);
            int complement = target - val;
            if (seen.contains(complement)) {
                found = true;
                pa = complement;
                pb = val;
                break;
            }
            seen.add(val);
        }

        if (found) {
            System.out.println("Pair found: " + pa + " + " + pb + " = " + target);
        } else {
            System.out.println("No pair found");
        }
        sc.close();
    }
}
