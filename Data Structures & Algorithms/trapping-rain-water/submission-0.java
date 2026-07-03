class Solution {
    public int trap(int[] ht) {
        int n=ht.length;
        int []lftMax=new int[n];
        int []rgtMax=new int[n];
        lftMax[0]=ht[0];
        rgtMax[n-1]=ht[n-1];

        for(int i=1;i<n;i++){
            lftMax[i]=Math.max(lftMax[i-1],ht[i]);
        }
        for(int i=n-2;i>=0;i--){
            rgtMax[i]=Math.max(rgtMax[i+1],ht[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(lftMax[i],rgtMax[i])-ht[i];
        }
        return ans;
    }
}
