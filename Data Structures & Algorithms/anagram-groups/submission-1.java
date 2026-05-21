class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hash = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] wordary = strs[i].toCharArray();
            Arrays.sort(wordary);
            String str = new String(wordary);

            hash.putIfAbsent(str, new ArrayList<String>());
            hash.get(str).add(strs[i]);
        }

        return new ArrayList<>(hash.values());
    }

}