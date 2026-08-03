class Solution {
    int n;
    int[] dp;
    public String stoneGameIII(int[] stoneValue) {
        n = stoneValue.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        int diff = count(stoneValue,0);
        if(diff>0) return "Alice";
        else if(diff < 0) return "Bob";
        return "Tie";
    }
    private int count(int[] stoneValue, int i){
        if(i==n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

    
        dp[i] = (stoneValue[i]-count(stoneValue,i+1));
        if(i + 1 < n)
        dp[i] = Math.max(dp[i], stoneValue[i]+stoneValue[i+1]-count(stoneValue,i+2));
        if(i+2 < n)
        dp[i] = Math.max(dp[i], stoneValue[i]+stoneValue[i+1]+stoneValue[i+2]-count(stoneValue,i+3));

        return dp[i];
    }
}