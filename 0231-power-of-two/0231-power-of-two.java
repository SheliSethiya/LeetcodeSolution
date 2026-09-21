class Solution {
    public boolean isPowerOfTwo(int n) {
        // if (n <= 0) {
        //     return false;
        // }

        // while (n % 2 == 0) {
        //     n = n / 2;
        // }

        // return n == 1;

        if(n<=0){
            return false;
        }
        return ((n & n-1)==0); // (2^n & 2^n-1=0)--> property
    }
}