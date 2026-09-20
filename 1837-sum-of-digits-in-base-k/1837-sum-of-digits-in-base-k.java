class Solution {
    public int sumBase(int n, int k) {
        int ans=0;
        while(n!=0){
            int rem=n%k;
            n/=k;
            ans+=rem;

        }
        return ans;
        
    }
}