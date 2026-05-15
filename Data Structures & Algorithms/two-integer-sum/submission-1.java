class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int val = 0;

        for(int i = 0; i < nums.length; i++){
            val = target - nums[i];
            if(hash.containsKey(val)){
                return new int[]{hash.get(val), i};
            }

            hash.put(nums[i], i);
        }
        return new int[]{};
    }
}
