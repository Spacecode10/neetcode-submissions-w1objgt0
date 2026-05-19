class Solution {

    public List<List<Integer>> dfs(List<Integer> p, List<Integer> up)
    {
        if (up.isEmpty())
        {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>(p));
            return res;
        }

        int current = up.get(0);

        List<Integer> remaining = new ArrayList<>(up);
        remaining.remove(0);

        // INCLUDE current
        p.add(current);
        List<List<Integer>> left = dfs(p, remaining);

        // BACKTRACK
        p.remove(p.size() - 1);

        // EXCLUDE current
        List<List<Integer>> right = dfs(p, remaining);

        // combine results
        left.addAll(right);

        return left;
    }

    public List<List<Integer>> subsets(int[] nums)
    {
        List<Integer> up = new ArrayList<>();

        for (int num : nums)
        {
            up.add(num);
        }

        return dfs(new ArrayList<>(), up);
    }
}