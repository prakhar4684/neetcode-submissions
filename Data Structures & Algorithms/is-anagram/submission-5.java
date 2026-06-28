class Solution {
    public boolean isAnagram(String s, String t) {
        int []a=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            a[ch-'a']+=1;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            a[ch-'a']-=1;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=0)return false;
        }
        return true;

    }
}
