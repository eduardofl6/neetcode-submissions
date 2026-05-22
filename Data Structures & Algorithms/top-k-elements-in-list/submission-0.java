class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] top = new int[k];

        for(int i = 0; i < nums.length; i++){
            int val = 1;
            
            if(hash.containsKey(nums[i])){
                val = hash.get(nums[i]) + 1;
                hash.remove(nums[i]);
            }
                            
            hash.putIfAbsent(nums[i], val);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hash.entrySet());

        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        return list.stream().limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
}
