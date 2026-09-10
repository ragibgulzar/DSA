class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int n : nums){
            if(((int)(Math.log10(n))+1)%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}