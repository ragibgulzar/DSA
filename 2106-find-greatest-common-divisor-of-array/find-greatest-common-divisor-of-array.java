class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length-1];

        int gcd = smallest;
        while(gcd>0){
            if((smallest%gcd==0)&&(largest%gcd==0)){
                break;
            }
            gcd--;
        }
        return gcd;
    }
}