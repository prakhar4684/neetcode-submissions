class Solution {
    public int numRescueBoats(int[] p, int l) {
        int n=p.length,i=0,j=n-1;
        int sum=0,ans=0;
        Arrays.sort(p);
        while(i<=j){
            sum=p[i]+p[j];
            if(sum<=l){
                i++;
                j--;
            }else j--;
                ans++;
        }
        return ans;
    }
}