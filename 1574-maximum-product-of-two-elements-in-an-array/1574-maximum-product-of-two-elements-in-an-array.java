class Solution {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        int n=nums.length;
        int result=0;
        if(n<2)
        {
            return 0;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]>largest)
            {
                seclargest=largest;
                largest=nums[i];
            }
            else if(nums[i]>seclargest && nums[i]<=largest)
            {
                seclargest=nums[i];
            }
        
        }
        result=(seclargest-1)*(largest-1);
        return result;
    

        
    }
}