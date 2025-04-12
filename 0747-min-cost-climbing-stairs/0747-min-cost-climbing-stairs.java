import java.util.Arrays;

class Solution {
    int[] memo;
    int[] cost;
    // memozization
    public int dp(int i) {
        if (i >= cost.length) {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        memo[i] = Math.min(dp(i + 1), dp(i + 2)) + cost[i];
        return memo[i];
    }

    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        int n = cost.length;
        memo = new int[n];
        Arrays.fill(memo, -1);

        return Math.min(dp(0), dp(1));
    }
}
