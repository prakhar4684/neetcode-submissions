class Solution {
    void r(int i,int j,int []nums){
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        r(0,n-1,nums);
        r(0,k-1,nums);
        r(k,n-1,nums);
    }
}