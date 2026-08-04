class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int key = nums[i];
            map.put(key,map.getOrDefault(key,0)+1);
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));

        for(int n : map.keySet()){
            queue.offer(n);

            if(queue.size()>k){
                queue.poll();
            }
        }
        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = queue.poll();
        }
        return ans;
    }
}