class Solution {
    public int climbStairs(int n) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        return dfs(n,map);    
    }
    public int dfs(int n, HashMap<Integer,Integer> map)
    {
        if(n <= 3)
        {
            return n;
        }
        if(map.containsKey(n))
        {
            return map.get(n);
        }
        int x = dfs(n-2,map) + dfs(n-1,map);
        map.put(n,x);
        return x;
    }
}
