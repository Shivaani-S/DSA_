class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));

        int ans=0,last=Integer.MIN_VALUE;

        for(int[] p:pairs){
            if(p[0]>last){
                ans++;
                last=p[1];
            }
        }

        return ans;
    }
}