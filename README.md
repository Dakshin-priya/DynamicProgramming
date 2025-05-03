# DynamicProgramming

## Approach: Dynamic Programming

### Top‑Down (Memoization)

- Recursively compute helper(n) but store already‑computed values in dp[n].

- Before each recursive call, check if (dp[n] != -1) return dp[n]; to avoid duplicate work.

### Bottom‑Up (Iterative)

- Create an array dp[0…n].

- Initialize dp[1]=1, dp[2]=2.

- Loop for i from 3 to n:

- dp[i] = dp[i-1] + dp[i-2];

### Complexity:

- Time: O(n)

- Space: O(n) (can optimize to O(1) by keeping only the last two values)
