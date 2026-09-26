class Solution {

    private int sum(List<Integer> nums)
    {
        int sum = 0;

        for(int i = 0; i < nums.size(); i++)
        {
            sum = sum + nums.get(i);
        }

        return sum;
    }

    public void dfs(
        int[] nums,
        int target,
        int index,
        List<Integer> d1,
        List<List<Integer>> ans)
    {
        int sum = sum(d1);

        if(sum == target)
        {
            ans.add(new ArrayList<>(d1));
            return;
        }

        if(sum > target)
        {
            return;
        }

        for(int i = index; i < nums.length; i++)
        {
            d1.add(nums[i]);

            dfs(nums, target, i, d1, ans);

            d1.remove(d1.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target)
    {
        List<List<Integer>> ans = new ArrayList<>();

        dfs(nums, target, 0, new ArrayList<>(), ans);

        return ans;
    }
}