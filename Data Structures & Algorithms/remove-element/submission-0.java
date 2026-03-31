class Solution {
    public int removeElement(int[] nums, int val) {
       int i = 0;
       for(int p = 0; p < nums.length; p++)
       {
            if(nums[p] != val)
            {
                nums[i++] = nums[p];
            }
       }
       return i; 
    }
}