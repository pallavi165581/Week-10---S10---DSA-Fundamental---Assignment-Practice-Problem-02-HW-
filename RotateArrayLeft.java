import java.util.Scanner;

// Problem 4 - Rotate Array Left
// Rotate an array left by k positions using the reversal algorithm.
// Time: O(n), Space: O(1)
public class RotateArrayLeft {

    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int tmp = arr[l]; arr[l] = arr[r]; arr[r] = tmp;
            l++; r--;
        }
    }

    static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] parts = sc.nextLine().trim().split(" ");
        int k = Integer.parseInt(sc.nextLine().trim());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(parts[i]);

        rotateLeft(arr, k);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(" ");
            sb.append(arr[i]);
        }
        System.out.println(sb);
        sc.close();
    }
}
