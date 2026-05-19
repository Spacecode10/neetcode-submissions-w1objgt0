class Solution {

    public List<List<Integer>> dfs(List<Integer> p, int[] nums, int target, int index)
    {
        int currentSum = sum(p);

        if(currentSum == target)
        {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>(p));
            return res;
        }

        if(currentSum > target)
        {
            return new ArrayList<>();
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = index; i < nums.length; i++)
        {
            p.add(nums[i]);

            ans.addAll(dfs(p, nums, target, i));

            p.remove(p.size() - 1);
        }

        return ans;
    }

    public List<List<Integer>> combinationSum(int[] nums, int target)
    {
        return dfs(new ArrayList<>(), nums, target, 0);
    }

    private int sum(List<Integer> arr)
    {
        int sum = 0;

        for(int i = 0; i < arr.size(); i++)
        {
            sum += arr.get(i);
        }

        return sum;
    }
}