class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
          if(nums[i]!=0)
          {  
            if(left !=i){
            nums[left]=nums[i];
            nums[i]=0;
            }left++;
          }
        }
    }
}