class MyHashSet {
    int[] array;

    public MyHashSet() {
        array = new int[1000001];
    }
    
    public void add(int key) {
            array[key] = 1;
    }
    
    public void remove(int key) {
            array[key] = 0;
    }
    
    public boolean contains(int key) {
        return (array[key] == 0)  ? false  : true; 
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */