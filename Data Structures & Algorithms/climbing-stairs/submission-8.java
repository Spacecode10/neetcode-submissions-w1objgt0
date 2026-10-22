class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) 
    {
        if(n == 2)
        {
            return 2;
        }
        if(n == 1)
        {
            return 1;
        }
        if(map.containsKey(n))
        {
            return map.get(n);
        }
        
            int x = climbStairs(n-1) + climbStairs(n-2);
            map.put(n,x);
            return x;
         
    }
}
