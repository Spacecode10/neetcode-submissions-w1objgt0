class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0; i < stones.length; i++)
        {
            heap.add(-stones[i]);
        }
        while(heap.size() > 1)
        {
            int s1 = -heap.poll();
            int s2 = -heap.poll();
            if(s1 != s2)
            {
                heap.add(-(s1-s2));
            }
        }
        heap.add(0);
        return -heap.peek();
    }
}
