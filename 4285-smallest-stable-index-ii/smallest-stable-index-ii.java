class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int[] suffixMin = new int[nums.length];
         suffixMin[suffixMin.length-1]= nums[nums.length-1];
         for(int i = suffixMin.length-2; i >= 0; i--){
            suffixMin[i] = Math.min(nums[i],suffixMin[i+1]);
         }
         int prefixMax = nums[0];
         
        for(int i = 0; i < nums.length; i++){
            prefixMax = Math.max(prefixMax, nums[i]);
            if(prefixMax - suffixMin[i] <= k ){
                return i;
            }
        }
        return -1;
    }
}