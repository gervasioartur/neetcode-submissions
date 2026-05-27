class DynamicArray {
    private int[] vector;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length =  0;
        this.vector = new int[this.capacity];
    }

    public int get(int i) {
        return vector[i];
    }

    public void set(int i, int n) {
        vector[i] = n;
    }

    public void pushback(int n) {
        if(length == capacity) resize();
        vector[length] = n;
        length++;
    }

    public int popback() {
       if(length > 0) length--;
       return vector[length];
    }

    private void resize() {
       capacity *=2;
       int[] newVector = new int[capacity];
        for (int i = 0; i < length; i++) {
            newVector[i] = vector[i];
        }
        vector = newVector;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
         return capacity;
    }
}
