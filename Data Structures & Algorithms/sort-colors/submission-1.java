class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for(int i = 0; i < nums.length; i++)
        {
            arr[nums[i]]++;
        }
        int i = 0;
        int j = 0;
        while(true)
        {
            if(i > 2 || j >= nums.length)
            {
                break;
            }
            if(arr[i] > 0)
            {
                nums[j++] = i;
                arr[i]--;
            }
            else
            {
                i++;
            }
        }
    }
}