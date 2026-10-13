class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans=[]
        for i in range(len(nums)):
            diff=target-nums[i]
            for j in range(i+1,len(nums)):
                if nums[j]==diff:
                    ans.append(i)
                    ans.append(j)
        return ans


        