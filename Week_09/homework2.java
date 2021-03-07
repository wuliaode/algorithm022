//300. 最长递增子序列

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums==null || nums.length==0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        for(int i=0;i<dp.length;++i) {
            dp[i] = 1;
        }
        for(int i=0;i<nums.length;++i) {
            for(int j=0;j<i;++j) {
               
                if(nums[i]>nums[j]) {
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }

        return Arrays.stream(dp).max().getAsInt();
    }
}
