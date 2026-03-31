class DynamicArray {
    private int[] arr;
    private int capacity;
    private int length;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(this.length + 1 > this.capacity)
        {
            resize();
        }
        this.arr[length] = n; 
        this.length++;
    }

    public int popback() {
        return this.arr[this.length-- - 1];
    }

    private void resize() {
        int[] newArr = new int[this.arr.length*2];
        for(int i = 0; i < arr.length; i++)
        {
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
        this.capacity = this.capacity * 2;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
