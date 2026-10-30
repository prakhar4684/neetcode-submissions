class Solution {
    public int search(int[] nums, int t) {
        int i=0,j=nums.length-1;
        int ans=-1;
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]==t)return m;
            else if(nums[m]<t)i=m+1;
            else j=m-1;  
        }
        return -1;
    }
}
