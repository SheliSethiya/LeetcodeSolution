class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0 ;
        for(int x:s){
            if(i<g.length && x>=g[i]){
                i++;
            }
        }
        return i;
    }
}