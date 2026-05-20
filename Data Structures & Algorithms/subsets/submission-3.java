class Solution {
    public List<List<Integer>> dfs(int[] p, int[] up) {
        if (up.length == 0) {
            List<Integer> intList = new ArrayList<Integer>(p.length);
            for (int i : p) {
                intList.add(i);
            }
            List<List<Integer>> res = new ArrayList<>();
            res.add(intList);
            return res;
        }
        int first = up[0];
        int[] newP = new int[p.length+1];
        for (int i = 0; i < p.length; i++) {
            newP[i] = p[i];
        }
        newP[newP.length-1] = first;
        List<List<Integer>> left = dfs(newP,Arrays.copyOfRange(up,1,up.length));
        List<List<Integer>> right = dfs(p,Arrays.copyOfRange(up,1,up.length));  
        left.addAll(right);
        return left;                                                           
    }
    public List<List<Integer>> subsets(int[] nums) {
       return dfs(new int[0], nums);
    }
}
