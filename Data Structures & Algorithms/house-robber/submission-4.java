class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int rob(int[] nums) {
        return dfs(0,nums);
    }
    public int dfs(int i, int[] nums)
    {
        if(i > nums.length-1)
        {
            return 0;
        }
        if(map.containsKey(i))
        {
            return map.get(i);
        }
        int x = Math.max((nums[i] + dfs(i+2,nums)),dfs(i+1,nums));
        map.put(i,x);
        return x;
    }
}
