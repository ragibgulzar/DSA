class Solution {
    public int smallestNumber(int n, int t) {
        int num = n;
        while(num>=n){
            int product = 1;
            int num2 = num;
            while(num2>0){
                int last = num2%10;
                product *= last;
                num2 /= 10;
            }
            if(product%t==0){
                return num;
            }

            num++;
        }
        return -1;
    }
}