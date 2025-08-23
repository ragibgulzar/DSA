class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search (nums, target, false);
        }
        
        return ans;
    }

    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int left = 0;
        int right = nums.length -1;

        while(left<=right){
            int mid = left +(right - left) / 2;
            if(nums[mid] >target){
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid  + 1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return ans;
    }
}