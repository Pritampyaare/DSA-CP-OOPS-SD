class Solution:
    def reverseWords(self, s: str) -> str:
        list = s.split()
        list.reverse()
        ans = " ".join(list)
        return ans
        