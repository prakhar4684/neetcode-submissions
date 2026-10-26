class Solution {
    public int maxArea(int[] ht) {
        int n=ht.length;
       int i=0,j=ht.length-1;
       int ans=0;
       while(i<j){
            int h=Math.min(ht[i],ht[j]);
            if( ht[i]<ht[j]){
                i++;
            }
            else{
                j--;
            }
            ans=Math.max(ans,(j-i+1)*h);
       }
       return ans;

    }
}
