class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int[] max = new int[nums.length];
         int[] min = new int[nums.length];
         max[0]= nums[0];
         for(int i = 1; i < max.length; i++){
            max[i] = Math.max(nums[i],max[i-1]);
         }
         min[min.length-1]= nums[nums.length-1];
         for(int i = min.length-2; i >= 0; i--){
            min[i] = Math.min(nums[i],min[i+1]);
         }
        for(int i = 0; i < nums.length; i++){
            if(max[i] - min[i] <= k ){
                return i;
            }
        }
        return -1;
    }
}