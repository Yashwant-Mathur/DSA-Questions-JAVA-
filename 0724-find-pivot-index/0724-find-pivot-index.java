class Solution {
    public int pivotIndex(int[] nums) {
       int sum=0,ls=0,rs=0;
       int j=0;
       for(int i=0;i<nums.length;i++)
       {
         sum+=nums[i];
       } 
       while(j<nums.length)
       {
        rs=sum-ls-nums[j];
        if(ls==rs)
        {
            return j;
        }
        ls+=nums[j];
        j++;
       }
       return -1;
    }
}