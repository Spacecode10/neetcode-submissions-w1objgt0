class Solution {
    public void dfs(int[] p, int[] up, List<List<Integer>> ans) {
        if (up.length == 0) {
            List<Integer> intList = new ArrayList<Integer>(p.length);
            for (int i : p) {
                intList.add(i);
            }
            ans.add(intList);
            return;
        }
        int first = up[0];
        int[] newP = new int[p.length+1];
        for (int i = 0; i < p.length; i++) {
            newP[i] = p[i];
        }
        newP[newP.length-1] = first;
        dfs(newP,Arrays.copyOfRange(up,1,up.length),ans);
        dfs(p,Arrays.copyOfRange(up,1,up.length),ans);                                                             
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        dfs(new int[0], nums, ans);

        return ans;
    }
}
