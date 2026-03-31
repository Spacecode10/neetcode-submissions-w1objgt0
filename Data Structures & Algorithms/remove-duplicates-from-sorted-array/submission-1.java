class Solution {
    public int removeDuplicates(int[] nums) {
        int unique=1;
        int[] temp=new int[nums.length];
        temp[0]=nums[0];
        int j=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                unique++;
                temp[j++]=nums[i+1];
            }
        }
        for(int i=0;i<unique;i++)
        {
            nums[i]=temp[i];
        }
       
        return unique;
    }
}