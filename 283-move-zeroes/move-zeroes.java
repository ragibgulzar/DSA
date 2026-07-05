class Solution {
    public void moveZeroes(int[] nums) {
        int slow = -1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                slow = i;
                break;
            }
        }
        if(slow == -1) return;
        for(int fast = slow+1; fast < nums.length; fast++ ){
            if(nums[fast]!=0 ){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }
}