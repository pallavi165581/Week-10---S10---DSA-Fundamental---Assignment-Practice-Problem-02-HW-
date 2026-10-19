import java.util.Scanner;

// Problem 6 - Class Attendance Tracker
// Single-pass: count present days and longest unbroken streak of present days.
// Time: O(n), Space: O(1)
public class ClassAttendanceTracker {

    static int[] attendanceSummary(int[] days) {
        int present = 0;
        int longestStreak = 0;
        int currentStreak = 0;

        for (int d : days) {
            if (d == 1) {
                present++;
                currentStreak++;
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }
        return new int[]{present, longestStreak};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] days = new int[n];
        String[] parts = sc.nextLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            days[i] = Integer.parseInt(parts[i]);
        }

        int[] result = attendanceSummary(days);
        System.out.println("Present: " + result[0] + ", Longest streak: " + result[1]);
        sc.close();
    }
}
