class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        Set<List<Integer>> set = new HashSet<>();
        
        for(int i = 0; i < n-2; i++){
            Set<Integer> temp = new HashSet<>();
            for(int j = i + 1; j < n; j++){
                int needed = -(nums[i]+nums[j]);
                if(temp.contains(needed)){
                    List<Integer> list = Arrays.asList(nums[i],nums[j],needed);
                    Collections.sort(list);
                    if(set.add(list)){
                        ans.add(list);
                    }
                }
                temp.add(nums[j]);

            }
        }


        return ans;
    }
}