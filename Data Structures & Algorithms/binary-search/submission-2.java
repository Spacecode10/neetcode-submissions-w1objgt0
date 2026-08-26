class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        return binary(nums,l,r,target);
    }
    private int binary(int[] nums, int l, int r, int target)
    {
        
        if(l > r)
        {
            return -1;
        }
        int m = (l + r)/2;
        if(l == r && r == m)
        {
            if(nums[m] != target)
            {
                return -1;
            }
        }
        if(nums[m] == target)
        {
            return m;
        }
        else if(nums[m] > target)
        {
            return binary(nums, l, m,target);
        }
        else
        {
            return binary(nums,m+1,r,target);
        }
    }
}
