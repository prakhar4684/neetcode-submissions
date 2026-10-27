class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0;
        int mx=0,ans=0,n=s.length();
        int []seen=new int[26];
        while(j<n){
            char ch=s.charAt(j);
            seen[ch-'A']++;
            mx=Math.max(mx,seen[ch-'A']);
            while((j-i+1)-mx>k){
                char r=s.charAt(i);
                seen[r-'A']--;
                mx=0;
                for(int f:seen)mx=Math.max(f,mx);
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
