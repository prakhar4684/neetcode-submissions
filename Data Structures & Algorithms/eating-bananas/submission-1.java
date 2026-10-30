class Solution {
    long p(int []p,int k){
        long c=0;
        for(int i:p){
                c+=i/k;
                if(i%k!=0)c++;

        }
        return c;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int i=1,j=0;
        for(int k:piles)j=Math.max(k,j);
        while(i<=j){
                int k=i+(j-i)/2;
                long v=p(piles,k);
                if(v<=h){
                    j=k-1;
                }
                else i=k+1;
        }
        return i;
    }
}
