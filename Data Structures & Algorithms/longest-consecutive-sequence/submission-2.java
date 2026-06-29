class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Set<Integer>s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int []a=new int[s.size()];
        int t=0;
        for(int i:s){
            a[t++]=i;
        }
        Arrays.sort(a);
        int ans=1,curr=1;
        for(int i=1;i<a.length;i++){
            if(a[i-1]+1==a[i])curr++;
            else{
                ans=Math.max(ans,curr);
                curr=1;
            }
            ans=Math.max(ans,curr);
        }
        return ans;
    }
}
