class Solution {

    public void dfs(
        List<Integer> current,
        int[] nums,
        List<List<Integer>> res,
        int target,
        int start
    ) {

        if (target == 0) {
            res.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < nums.length; i++) {

            current.add(nums[i]);

            // i instead of i+1 because reuse is allowed
            dfs(current, nums, res, target - nums[i], i);

            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();

        dfs(new ArrayList<>(), nums, res, target, 0);

        return res;
    }
}