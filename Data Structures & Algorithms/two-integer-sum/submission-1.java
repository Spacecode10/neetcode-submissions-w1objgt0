class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            map.put(target - nums[i],i);
        }
        int[] res = new int[2];    
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]) && map.get(nums[i]) != i)
            {
                int index = map.get(nums[i]);
                res[0] = Math.min(i, index);
                res[1] = Math.max(i, index);
                return res;
            }
        }
        return res;
    }
}
