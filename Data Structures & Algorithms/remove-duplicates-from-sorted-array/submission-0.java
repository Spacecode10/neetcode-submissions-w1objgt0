class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 0 ; i < nums.length - 1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                k++;
            }
        }
        if(k == nums.length)
        {
            return k;
        }
        int[] actual = new int[nums.length - k];
        int i = 0;
        int index = 1;
        actual[0] = nums[0];
        for(int j = i + 1 ; j < nums.length; j++)
        {
            if(nums[i] != nums[j])
            {
                actual[index] = nums[j];
                i = j;
                index++;
            }
        }
        for(int j = 0; j < actual.length; j++)
        {
            nums[j] = actual[j];
        }
        return nums.length - k;
    }
}