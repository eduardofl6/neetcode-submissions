class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String small = strs[0];

        for(String s : strs){
            if(s.length() <  small.length()){
                small = s;
            }
        }
        
        for(int i = 0; i < small.length(); i++){
            boolean fact = true;
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != small.charAt(i)){
                    fact = false;
                    break;
                }
            }
            if(i == 0 && !fact) return prefix;
            if(fact) prefix += small.charAt(i);
        }

        return prefix;
    }
}