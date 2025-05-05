import java.util.Arrays;

class Solution {
    int M = 1000000007;
    int[] t = new int[1001];

    int solve(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (t[n] != -1) {
            return t[n];
        }
        if (n == 3) {
            return 5;
        }
        return t[n] = (int)((2L * solve(n - 1) % M + solve(n - 3) % M) % M);
    }

    public int numTilings(int n) {
        Arrays.fill(t, -1);
        return solve(n);
    }
}
