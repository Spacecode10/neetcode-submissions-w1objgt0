class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((p1,p2) -> 
        {
            int d1 = p1[0] * p1[0] + p1[1] * p1[1];
            int d2 = p2[0] * p2[0] + p2[1] * p2[1];
            return d2 - d1;
        });
        for(int i = 0; i < points.length; i++)
        {
            heap.add(points[i]);
            if(heap.size() > k)
            {
                heap.poll();
            }
        }
        int[][] res = new int[k][2];
       int i = 0;
        while (!heap.isEmpty()) {
            res[i++] = heap.poll();
        }
        return res;
    }
}
