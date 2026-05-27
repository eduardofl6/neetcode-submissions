class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result = 1;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(i, i == 0 ? 1 : nums[0]);
        }

        for(int i = 1; i < nums.length; i++){
            int currentIndex = i;
            map.replaceAll((key, value) -> key.equals(currentIndex) ? value : value * nums[currentIndex]);
        }


        return map.values().stream().mapToInt(Integer::intValue).toArray();
    }
}  
