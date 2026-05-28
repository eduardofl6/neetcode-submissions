class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] fw = new int[nums.length];
        int[] bw = new int[nums.length];
        int[] result = new int[nums.length];
        fw[0] = nums[0];
        bw[nums.length - 1] = nums[nums.length-1];

        for(int i = 1, j = nums.length-2; i < nums.length; i++, j--){
            fw[i] = nums[i];
            bw[j] = nums[j];
            
            fw[i] *= fw[i-1];
            bw[j] *= bw[j+1];
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                result[i] = bw[1];
            }else if (i == nums.length - 1){
                result[i] = fw[nums.length - 2];
            }else{
                result[i] = bw[i+1] * fw[i-1];
            }
        }
        return result;
    }
}  
