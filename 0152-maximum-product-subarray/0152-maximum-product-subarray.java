class Solution {
    public int maxProduct(int[] nums) {
        int ch1=0;
        int ch2=0;
        int n=nums.length;
        int maxpos=nums[0];
        int minpos=nums[0];
        int maxres=nums[0];
        for(int i =1;i<n;i++)
        {
            ch1=maxpos*nums[i];
            ch2=minpos*nums[i];
            maxpos=Math.max(Math.max(nums[i],ch1),ch2);
            minpos=Math.min(Math.min(nums[i],ch1),ch2);
            maxres=Math.max(Math.max(maxres,maxpos),minpos);


        }
        return maxres;
    }
}