class Solution {
    public int countDigits(int num) {
    int n=num,c=0;
    while(n>0){
        int d=n%10; 
        if(d!=0&&num%d==0)c++;
        n/=10;
    }
    return c;

    //return (int) String.valueOf(num).chars().filter(d -> d != '0' && num % (d - '0') == 0).count();
}
}//num = 1248  "1248" '1','2','4','8' '4'-'0'