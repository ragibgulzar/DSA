class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int key = nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        List<Integer>[] list = new List[nums.length+1];
        for(int n: map.keySet()){
            int freq = map.get(n);
            if(list[freq]==null){
                list[freq] = new ArrayList<>();
            }
            list[freq].add(n);
        }
        int[] ans = new int[k];
        int idx = 0;
        for(int i = list.length-1; i >=0&& idx<k; i--){
            if(list[i]!=null){
                for(int num : list[i]){
                    ans[idx++] =num;
                    if(idx==k) break;
                }
            }
        }
        return ans;
    }
}