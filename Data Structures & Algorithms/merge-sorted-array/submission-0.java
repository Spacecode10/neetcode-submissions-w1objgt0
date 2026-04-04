class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        int i = 0, j = 0, itr = 0;

        int[] res = new int[length];

        while(i < m && j < n) {
            if(nums1[i] > nums2[j]) {
                res[itr++] = nums2[j++];
            } else {
                res[itr++] = nums1[i++];
            }
        }

        while(i < m) {
            res[itr++] = nums1[i++];
        }

        while(j < n) {
            res[itr++] = nums2[j++];
        }

        for(int k = 0; k < length; k++) {
            nums1[k] = res[k];
        }
    }
}