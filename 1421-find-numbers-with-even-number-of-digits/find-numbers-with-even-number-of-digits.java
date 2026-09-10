class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int n : nums){
            //int total = (int)(Math.log10(n))+1;
            int total =0;
            while(n>0){
                total++;
                n /= 10;
            }
            if(total%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}