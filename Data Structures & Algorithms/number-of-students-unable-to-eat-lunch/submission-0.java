class Solution {
    public int countStudents(int[] stud, int[] sand) {
        int res = stud.length;
        int[] cnt = new int[2];

        for (int i = 0; i < stud.length; i++){
            cnt[stud[i]]++;
        }

        for(int i = 0; i < stud.length; i++)
        {
            if (cnt[sand[i]] > 0) {
                res--;
                cnt[sand[i]]--;
            } else {
                break;
            }
        }
        return res;
    }
}