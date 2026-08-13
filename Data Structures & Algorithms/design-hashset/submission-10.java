class MyHashSet {
    HashSet<Integer> set;

    public MyHashSet() {
        set = new HashSet<Integer>();
    }
    
    public void add(int key) {
        set.add(new Integer(key));
    }
    
    public void remove(int key) {
        set.remove(new Integer(key));
    }
    
    public boolean contains(int key) {
        return set.contains(new Integer(key));
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */