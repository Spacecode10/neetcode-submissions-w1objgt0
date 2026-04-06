class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int r = piles[piles.length - 1];
        int l = 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = checkMid(piles, h, m);
            if (res == 0 || res == -1) {
    r = m - 1;
}
            else {
                l = m+1 ;
            }
        }
        return l;
    }

    private static int checkMid(int[] piles, int h, int m) {
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            if (m >= piles[i]) {
                count++;
            } else {
                int mod = piles[i] % m;
                int temp = piles[i] / m;
                if (mod == 0) {
                    count = count + temp;
                } else {
                    count = count + temp + 1;
                }

            }

        }
        if (count < h) {
            return -1;
        } else if (count > h) {
            return 1;
        }
        return 0;
    }
}
