class Solution {
    public int removeElement(int[] nums, int val) {
        int idx=0;
        int []a=new int[nums.length];
        for(int i:nums){
            if(i!=val){
                a[idx++]=i;
            }
        }
        for(int i=0;i<idx;i++){
            nums[i]=a[i];
        }
        return idx; 
    }
}