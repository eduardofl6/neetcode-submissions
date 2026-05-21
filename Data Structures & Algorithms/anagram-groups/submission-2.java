class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        Map<String, List<String>> anagrams = new HashMap<>();
        for(int i = 0; i< strs.length; i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);

            anagrams.putIfAbsent(str,new ArrayList<>());
            anagrams.get(str).add(strs[i]);

        }
        
        return new ArrayList<>(anagrams.values());
    }

}