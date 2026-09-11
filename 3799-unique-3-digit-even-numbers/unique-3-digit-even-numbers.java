class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        int count = 0;
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
                    if(num%2==0) count++;
                    freq[k]++;

                }
                freq[j]++;
            }
            freq[i]++;
        }

        return count;
    }
}