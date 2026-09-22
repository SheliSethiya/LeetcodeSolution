class Solution {
    public int hammingWeight(int n) {
        // int count = 0;

        // while (n > 0) {
        //     int rem = n % 2;

        //     if (rem == 1) {
        //         count++;
        //     }

        //     n /= 2;
        // }

        // return count;

       
        int count=0;
        for(int i=0;i<32;i++){
            if((n&1)==1){
                count++;
            }
            n>>=1;
        }
        return count;
    

    }
}