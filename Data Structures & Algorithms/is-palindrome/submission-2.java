class Solution {
    public boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]", "");
       char[] array = s.toLowerCase().toCharArray();
       int size = array.length;

       int middlepos = ((array.length % 2 == 1 ) ? (array.length + 1) / 2 : -1);

       for(int i = 0; i < size; i++){
        if(array[i] != array[(size - 1) - i] && i != middlepos){
            return false;
        }
       } 

       return true;
    }
}
