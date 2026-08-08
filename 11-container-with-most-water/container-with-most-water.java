class Solution {
    public int maxArea(int[] height) {
        int n = height.length - 1;

        int left = 0;
        int right = n;
        int max = 0;
        while(left < right){
            int minHeight = Math.min(height[left], height[right]);
            int base = right - left;
            int area = minHeight * base;
            max = Math.max(max, area);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max;
    }
}