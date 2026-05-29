class LRUCache {
    private LinkedHashMap<Integer, Integer> map;
    private int capacity = -1;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true);
    }
    
    public int get(int key) {
        return this.map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) 
    {
        if (!map.containsKey(key) && map.size() == capacity)
        {
            int oldestKey = map.keySet().iterator().next();
            map.remove(oldestKey);
        }
        this.map.put(key, value);
    }
}