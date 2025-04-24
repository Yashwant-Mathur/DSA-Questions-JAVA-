class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Memoization array: null = not computed yet
        Boolean[] memo = new Boolean[s.length()];
        return rec(s, 0, wordDict, memo);
    }

    private boolean rec(String s, int indx, List<String> wordDict, Boolean[] memo) {
        if (indx == s.length()) {
            return true;
        }

        if (memo[indx] != null) {
            return memo[indx];
        }

        for (int i = indx + 1; i <= s.length(); i++) {
            String sub = s.substring(indx, i);
            if (wordDict.contains(sub) && rec(s, i, wordDict, memo)) {
                memo[indx] = true;
                return true;
            }
        }

        memo[indx] = false;
        return false;
    }
}
