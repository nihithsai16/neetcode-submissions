class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.strip()
        k = -1
        for i in range (len(s)):
            if(s[i]==' ' and i<(len(s))-1):
                k=i     
        return len(s[k+1:len(s)])