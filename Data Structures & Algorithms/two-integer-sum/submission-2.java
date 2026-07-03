class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            int entry = map.getOrDefault(target - nums[i],-1);
            if(entry == -1)
            {
                map.put(nums[i],i);
            }
            else
            {
                res[0] = entry;
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
