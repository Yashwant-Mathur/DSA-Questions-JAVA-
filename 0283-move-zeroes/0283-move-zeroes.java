class Solution {
    public void moveZeroes(int[] nums) {
        int index=0; 
        //if nums of  i!=0 shifting loop 
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
           while (index < nums.length) {
            nums[index++] = 0;
        }
        
         for (int num : nums) {
            System.out.print(num + " ");
        }
        
    }
}