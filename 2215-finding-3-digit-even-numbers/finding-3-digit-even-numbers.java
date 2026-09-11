class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if (digits[i] == 0) continue;
            for(int j = 0; j < n; j++){
                if(i==j) continue;
                for(int k = 0; k < n; k++){
                    if(k==i|| k==j) continue;
                    if (digits[k] % 2 != 0) continue;
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k]*1;
                    set.add(num); 
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}