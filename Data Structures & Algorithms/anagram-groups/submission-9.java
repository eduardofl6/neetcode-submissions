class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, ArrayList<String>> hash = new HashMap();
        String word;
        char[] wray;

        for(String s : strs){
            wray = s.toCharArray();
            Arrays.sort(wray);
            word = new String(wray);

            if(!(hash.containsKey(word))){
                hash.put(word, new ArrayList<String>());
            }
            
            hash.get(word).add(s);
        }

        Set<String> keys = hash.keySet();

        for(String s : keys){
            list.add(hash.get(s));
        }


        return list;
    }
}