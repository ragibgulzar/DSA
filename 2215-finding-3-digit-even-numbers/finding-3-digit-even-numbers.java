class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int n = digits.length;
        int[] freq = new int[10];
        for(int num : digits){
            freq[num]++;
        }

        for(int i = 1; i < 10; i++){
            if(freq[i]==0) continue;
            freq[i]--;
            
            for(int j = 0; j < 10; j++){
                if(freq[j]==0) continue;
                freq[j]--;

                for(int k = 0; k <=8; k +=2){
                    if(freq[k]==0) continue;
                    freq[k]--;
                    int num = i * 100 + j * 10 + k;
                    result.add(num);
                    freq[k]++;

                }
                freq[j]++;
            }
            freq[i]++;
        }
        int[] resArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArr[i] = result.get(i);
        }

        return resArr;
    }
}