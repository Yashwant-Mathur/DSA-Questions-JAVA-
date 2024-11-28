class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int midest=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        { 
            if(nums[i]==target)
            {
                midest=Math.min(midest,Math.abs(i-start));
            }

        }
        return midest;
        
    }
}