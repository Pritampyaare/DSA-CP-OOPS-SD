/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>(), s2 = new Stack<>();
        s1.push(root1); s2.push(root2);
        while(s1.size()>0 && s2.size()>0){
            if(dfs(s1)!=dfs(s2)) return false;
        }
        return s1.empty()&&s2.empty();
    }
    public int dfs(Stack<TreeNode> stk){
        while(true){
            TreeNode node = stk.pop();
            if(node.left!=null) stk.push(node.left);
            if(node.right!=null) stk.push(node.right);
            if(node.left==null && node.right==null) return node.val;
        }
    }
}