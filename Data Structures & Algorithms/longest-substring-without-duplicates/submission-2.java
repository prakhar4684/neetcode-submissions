class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,ans=0;
        Set<Character>set=new HashSet<>();
        while(j<s.length()){
            char ch=s.charAt(j);
            if(set.contains(ch)){
                
                while(s.charAt(i)!=ch){
                    set.remove(s.charAt(i));
                    i++;}
                i++;
                    }
            ans=Math.max(ans,j-i+1);
            System.out.println(ans);
            set.add(ch);
            j++;
        }
        return ans;
    }
}
