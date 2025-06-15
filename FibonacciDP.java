import java.util.Arrays;
public class FibonacciDP {

    // Bottom‑Up DP approach (iterative)
    public static int fibonacciBottomUp(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // Top‑Down DP approach (recursive + memoization)
    public static int fibonacciTopDown(int n, int[] dp) {
        if (n <= 1) {
            dp[n] = n;
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fibonacciTopDown(n - 1, dp) + fibonacciTopDown(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;

        // Bottom‑Up
        System.out.println("Bottom‑Up: " + fibonacciBottomUp(n));

        // Top‑Down
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Top‑Down: " + fibonacciTopDown(n, dp));
    }
}
