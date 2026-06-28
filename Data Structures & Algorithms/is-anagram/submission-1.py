class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        s=list(s)
        s.sort()
        t=list(t)
        t.sort()
        print(s,t)
        for i in range(len(s)):
            if(s[i]!=t[i]):
                return False
        return True