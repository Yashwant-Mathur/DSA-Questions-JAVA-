// Same question - 1746. Maximum Subarray Sum After One Operation
class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int prevWithDeleted = 0;//tracks the maximum sum where one deletion has occurred
        int prevNotDeleted = nums[0]; //tracks the maximum sum where no deletions have occurred
        int finalMax = nums[0];
        for(int i = 1;i<n;i++){
            prevWithDeleted = Math.max(prevNotDeleted, prevWithDeleted + nums[i]);
            prevNotDeleted = Math.max(prevNotDeleted + nums[i], nums[i]);
            int currMax = Math.max(prevNotDeleted, prevWithDeleted);
            finalMax = Math.max(finalMax, currMax);
        }
        return finalMax;
    }
}