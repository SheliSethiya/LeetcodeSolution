class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st = 1;
        int end = 0;
        for(int pile : piles){
            end = Math.max(end, pile);
        }
        int ans = end;
        while(st <= end){
            int mid = st + (end - st) / 2;
            long hours = 0;
            for(int pile : piles){
                hours += (pile - 1L) / mid + 1;
            }
            if(hours <= h){
                ans = mid;
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return ans;
    }
}
    
