class Solution {
    public int numberOfSteps(int num) {
        // int count=0;
        // while(num!=0){
        //     if(num%2==0){
        //         num/=2;
        //     }   
        //     else{
        //         num--;
        //     }     
        //     count++;
        // }
        // return count;

        return num == 0 ? 0 : Integer.toBinaryString(num).length() - 1 + Integer.bitCount(num);
        //num=14 1110 4-1 3+3 6
    }
}