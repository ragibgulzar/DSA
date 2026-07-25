class Solution {
    public int maxProduct(int n) {
        int largest = 0;
        int secondLargest = 0;
        while(n>0){
            int last = n % 10;
            if(last>largest){
                secondLargest = largest;
                largest = last;
            } else if(last> secondLargest){
                secondLargest = last;
            }
            n /= 10;
        }
        return largest*secondLargest;
    }
}