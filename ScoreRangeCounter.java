import java.util.Scanner;

// Problem 1 - Score Range Counter
// Given an array of student scores, count how many fall in each grade band:
//   A: 90-100, B: 75-89, C: 60-74, D: 40-59, F: 0-39
// Time: O(n), Space: O(1)
public class ScoreRangeCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int a = 0, b = 0, c = 0, d = 0, f = 0;

        String[] parts = sc.nextLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            int score = Integer.parseInt(parts[i]);
            if      (score >= 90) a++;
            else if (score >= 75) b++;
            else if (score >= 60) c++;
            else if (score >= 40) d++;
            else                  f++;
        }

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("F: " + f);
        sc.close();
    }
}
