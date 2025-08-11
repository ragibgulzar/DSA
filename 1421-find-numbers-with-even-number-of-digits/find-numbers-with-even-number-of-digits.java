class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;

        for(int i = 0; i < nums.length; i++){
            int digCnt = 0;
            while(nums[i]>0){
                digCnt++;
                nums[i] /= 10;
                
            }
            if(digCnt%2==0){
                cnt++;
            }
        }

        return cnt;
    }
}