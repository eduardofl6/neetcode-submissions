class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.putIfAbsent(nums[i], 0);

            int val = map.get(nums[i]);
            map.remove(nums[i]);
            map.put(nums[i], val+1);
        }

        int majority = -1000000001;
        map.put(majority, -1);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > map.get(majority)){
                majority = entry.getKey();
            }
        }


        return majority;

    }
}