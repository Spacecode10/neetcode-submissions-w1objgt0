class Solution {
    class ArrInt implements Comparable<ArrInt> {

        int[] arr;

        ArrInt(int[] arr) {
            this.arr = arr;
        }

        @Override
        public int compareTo(ArrInt other) {

            int d1 = this.arr[0] * this.arr[0]
                   + this.arr[1] * this.arr[1];

            int d2 = other.arr[0] * other.arr[0]
                   + other.arr[1] * other.arr[1];

            return Integer.compare(d1, d2);
        }
    }
    
    public int[][] kClosest(int[][] points, int k) 
    {
        PriorityQueue<ArrInt> pq = new PriorityQueue<>();
        for(int i = 0; i < points.length; i++)
        {
            pq.add(new ArrInt(points[i]));  // Distance = 5  // Distance = 1.41
        }
        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++)
        {
            res[i] = pq.poll().arr;
        }
        return res;

    }
}
