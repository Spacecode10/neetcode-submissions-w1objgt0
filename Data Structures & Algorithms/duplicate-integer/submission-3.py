class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        s_num=set(nums)
        if len(nums)==len(s_num):
            return False
        else:
            return True
        