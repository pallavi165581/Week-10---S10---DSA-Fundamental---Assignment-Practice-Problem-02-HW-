import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

// Problem 5 - Frequency Counter
// Count how many times each number appears in the array (insertion order).
// Time: O(n), Space: O(n)
public class FrequencyCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] parts = sc.nextLine().trim().split(" ");

        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(parts[i]);
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        sc.close();
    }
}
