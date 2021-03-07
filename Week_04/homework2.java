//55. 跳跃游戏
class Solution {
    public boolean canJump(int[] nums) {
       
        int minFlag = nums.length-1;
        for (int i = nums.length - 2; i >= 1; i--) {
           
            if(i+nums[i]>=minFlag){
                minFlag = i;
            }
        }
        
        if(nums[0]>=minFlag) {
            return true;
        }
        return false;
    }
}
