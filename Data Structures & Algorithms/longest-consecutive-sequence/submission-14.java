class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
   //         System.out.print(nums[i] + "|");
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!(map.containsKey(nums[i]))){
                 //System.out.print(nums[i] + "|");
                
                int count = 1;
                if(map.containsKey(nums[i] - 1)) count = map.get(nums[i] - 1) + 1;
                map.put(nums[i], count);

            }
        }

        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max) max = entry.getValue();
        }


        return max;
    }
}
