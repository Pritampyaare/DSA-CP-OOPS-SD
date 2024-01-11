class Solution:
    def maxAncestorDiff(self, r: Optional[TreeNode]) -> int:
        return (f:=lambda n,a,b:max(f(n.left,a:=min(a,n.val),b:=max(b,n.val)),f(n.right,a,b)) if n else b-a)(r,r.val,r.val)