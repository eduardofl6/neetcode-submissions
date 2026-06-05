class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int[] subar = new int [nums.length];     

        for(int i = 0; i < subar.length; i++){
            subar[i] = 101;
        }

        for(int i = 0, v = 0; i < nums.length; i++){
            if(nums[i] != val){
                subar[v++] = nums[i];
                count++;
            }
        }
        
        for(int i = 0; i < subar.length; i++){
            nums[i] = (subar[i] == 101 ? val : subar[i]);
        }   


    return count;
    }
}