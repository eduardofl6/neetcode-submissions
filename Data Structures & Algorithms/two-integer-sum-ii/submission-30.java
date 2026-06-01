class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){
            int remain = target - numbers[i];
            System.out.println("i:" + i + "|" + remain);

            if(map.containsKey(remain) && remain != numbers[i]){
                int smallerpos = ((map.get(remain) > numbers[i]) ? i : map.get(remain)) + 1;
                int biggerpos = ((map.get(remain) > numbers[i]) ? map.get(remain) : i) + 1;

                if(smallerpos > biggerpos){
                    int swap = smallerpos;
                    smallerpos = biggerpos;
                    biggerpos = swap;
                }

                System.out.println("Map.Key:" + remain + "|Index:" + map.get(remain) +
                "|Numbers[i]:" + numbers[i] + "|i:" + i + "|(map.get(remain) > numbers[i]:" + (map.get(remain) > numbers[i])
                + "|Smaller Pos:" + smallerpos + "|BiggerPos:" + biggerpos);
                return new int[]{smallerpos, biggerpos};
            }

            map.putIfAbsent(numbers[i], i);
        }

        return new int[]{-1,-1};
    }
}
