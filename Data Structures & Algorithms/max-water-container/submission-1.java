class Solution {
    public int maxArea(int[] ht) {
        int i=0,j=ht.length-1,ans=0;
        while(i<j){
             int w=j-i;
             int h=Math.min(ht[i],ht[j]);
             ans=Math.max(ans,w*h);
            if(ht[i]<ht[j]){
                i++;
            }
            else{
                j--;
            }
           
        }
        return ans;
    }
}
