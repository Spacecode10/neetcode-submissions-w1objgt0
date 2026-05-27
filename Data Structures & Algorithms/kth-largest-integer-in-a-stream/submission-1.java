class KthLargest {
    PriorityQueue<Integer> q;
    int size = 0;
    public KthLargest(int k, int[] nums) {
        // initilize min heap of size k
        // add k largest elements from nums into min heap.
        // now root or first element is kth largest element because it's smallest from the heap.
        q = new PriorityQueue<>();
        size = k;
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
            if (q.size() > k) {
                q.poll();
            }
        }
    }

    public int add(int val) {
        // if adding an element to the heap exceeds the heap size of k, remove the smallest element
        // and
        //  add the val into heap, then return the smallest(root) from the heap.
        this.q.add(val);
        if (q.size() > size) {
            q.poll();
        }
        return q.peek();
    }
}
