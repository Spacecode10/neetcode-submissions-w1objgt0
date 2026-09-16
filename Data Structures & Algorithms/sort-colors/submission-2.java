class Solution {
    public void sortColors(int[] nums) {
        int[] cnt = new int[3];
        for(int i = 0; i < nums.length; i++)
        {
            cnt[nums[i]]++;
        }
        int j = 0;
        for(int i = 0; i < cnt.length; i++)
        {
            while(cnt[i] > 0)
            {
                nums[j++] = i;
                cnt[i]--;
            }
        }
    }
}