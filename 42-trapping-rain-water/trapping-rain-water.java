class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] =  height[0];
        for(int i = 1; i < n; i++){
            int prev = leftMax[i-1];
            int max = Math.max(prev, height[i]);
            leftMax[i] = max;
        }
        rightMax[n-1] = height[n-1]; 
        for(int i = n-2; i >= 0; i--){
            int prev = rightMax[i+1];
            int max = Math.max(prev, height[i]);
            rightMax[i] = max;
        }

        int ans = 0;
        for(int i = 1; i < n - 1; i++){
            int left = leftMax[i];
            int right = rightMax[i];
            int water = Math.min(leftMax[i], rightMax[i]) - height[i];
            ans += water;
        }
        return ans;
    }

}