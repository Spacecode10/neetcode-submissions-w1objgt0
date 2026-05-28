class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            int count = map.getOrDefault(num,0);
            if(count > 0)
            {
                return true;
            }
            count++;
            map.put(num,count);
        }
        return false;
    }
}