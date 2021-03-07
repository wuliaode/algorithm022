//32. 最长有效括号

class Solution {
    public int longestValidParentheses(String s) {
        char[] str = s.toCharArray();
        int[] dp = new int[str.length];
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i] == '(') dp[i] = 0;
            else if(i > 0) {
                if(str[i - 1] == '(') dp[i] = i - 2 >= 0? dp[i - 2] + 2 : 2;
                else if(i - dp[i - 1] - 1 >= 0 && str[i - dp[i - 1] - 1] == '(') dp[i] = i - dp[i - 1] - 2 >= 0 ? dp[i - 1] + 2 + dp[i - dp[i - 1] - 2] : dp[i - 1] + 2;
            }else dp[i] = 0;
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
