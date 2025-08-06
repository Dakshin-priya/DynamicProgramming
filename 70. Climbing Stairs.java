import java.util.Arrays;

class Solution {
    // Top‑Down DP with memoization
    private int climbTopDown(int n, int[] dp) {
        if (dp[n] != -1)             // already computed
            return dp[n];
        if (n <= 2) {                // base cases: 1 way for 1 stair, 2 ways for 2 stairs
            dp[n] = n;
            return n;
        }
        // compute and store
        dp[n] = climbTopDown(n - 1, dp) + climbTopDown(n - 2, dp);
        return dp[n];
    }

    public int climbStairsTopDown(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climbTopDown(n, dp);
    }

    // Bottom‑Up DP (iterative)
    public int climbStairsBottomUp(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1; 
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    // You can choose one of the above methods in your entry point:
    public int climbStairs(int n) {
        // return climbStairsTopDown(n);
        return climbStairsBottomUp(n);
    }
}
