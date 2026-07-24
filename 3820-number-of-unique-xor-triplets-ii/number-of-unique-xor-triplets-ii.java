class Solution {
    public int uniqueXorTriplets(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       int n = nums.length;
       if (n == 1) return 1;
       for(int i = 0; i <= n - 1;i++){
            for(int j = i+1; j<=n-1; j++){
                 int xor = nums[i]^nums[j];
                 set.add(xor);
            }
        }
        HashSet<Integer> ans = new HashSet<>();
        for(int xor : set){
            for(int num: nums){
                ans.add(xor^num);
            }
        }
       return ans.size();
    }
}