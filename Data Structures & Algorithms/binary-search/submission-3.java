class Solution {

    public int search(int[] nums, int target) {
        return binary(nums, 0, nums.length - 1, target);
    }

    private int binary(int[] nums, int l, int r, int target) {

        if (l > r) {
            return -1;
        }

        int m = l + (r - l) / 2;

        if (nums[m] == target) {
            return m;
        }

        if (nums[m] > target) {
            return binary(nums, l, m - 1, target);
        }

        return binary(nums, m + 1, r, target);
    }
}