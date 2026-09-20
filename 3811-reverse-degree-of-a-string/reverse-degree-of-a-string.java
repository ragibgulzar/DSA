class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int i = 1;
        for(char c : s.toCharArray()){
            int index = c - 'a' + 1;
            int revIndex = 27 - index;
            sum += (i * revIndex);
            i++;
        }

        return sum;
    }
}