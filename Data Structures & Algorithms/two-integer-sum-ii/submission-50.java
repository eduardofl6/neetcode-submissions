class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int remain = target - numbers[i];

            if(map.containsKey(remain) && remain != numbers[i]){
                int smallerpos = ((map.get(remain) > numbers[i]) ? i : map.get(remain)) + 1;
                int biggerpos = ((map.get(remain) > numbers[i]) ? map.get(remain) : i) + 1;

                if(smallerpos > biggerpos){
                    int swap = smallerpos;
                    smallerpos = biggerpos;
                    biggerpos = swap;
                }

                return new int[]{smallerpos, biggerpos};
            }

            map.putIfAbsent(numbers[i], i);
        }

        return new int[]{-1,-1};
    }
}
