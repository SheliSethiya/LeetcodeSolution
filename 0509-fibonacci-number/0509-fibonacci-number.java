class Solution {
    public int fib(int n) {
        int fib0=0;
        int fib1=1;
        int fib=0;
        for(int i=0;i<n;i++){
            fib =fib0+fib1;
            fib0=fib1;
            fib1=fib;
        }
        return fib0;
    }
}