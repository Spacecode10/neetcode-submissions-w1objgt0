class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < stones.length; i++)
        {
            heap.add(stones[i]);
        }
        while(heap.size() > 1)
        {
            int t1 = heap.remove();
            int t2 = heap.remove();
            heap.add(t1 - t2);
        }
        return heap.peek();
    }
}
