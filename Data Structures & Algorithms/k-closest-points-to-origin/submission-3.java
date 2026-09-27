

class Comp implements Comparator<int[]> {
    public int compare(int[] c1, int[] c2) {
        // Changed double to int
        int l1 = (c1[0]) * (c1[0]) + (c1[1]) * (c1[1]);
        int l2 = (c2[0]) * (c2[0]) + (c2[1]) * (c2[1]);
        return l1 - l2;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comp());
        for(int[] itr : points) {
            heap.add(itr);
        }
        ArrayList<int[]> ans = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            ans.add(heap.remove());
        }
        // Fixed return statement to correctly return a 2D array
        return ans.toArray(new int[ans.size()][]);
    }
}