class Solution {
    class Pair{
        int val,frq;
        public Pair(int val ,int frq){
            this.val=val;
            this.frq=frq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            return a.frq-b.frq;
        });
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int i:m.keySet()){
            pq.add(new Pair(i,m.get(i)));
            if(pq.size()>k)pq.poll();

        }
        int []ans=new int[k];
        for(int i=0;i<k;i++){
            int val=pq.poll().val;
            ans[i]=val;
        }
        return ans;
    }
}
