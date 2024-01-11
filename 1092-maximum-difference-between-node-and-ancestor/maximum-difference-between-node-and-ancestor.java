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
class Pair{
    int min;
    int max;
    Pair(int min, int max){
        this.min = min;
        this.max = max;
    }
}
class Solution {
    int maxDiff = 0;
    public int maxAncestorDiff(TreeNode root) {
        helper(root);
        int ans = maxDiff;
        maxDiff = 0;
        return ans;
    }
    public Pair helper(TreeNode root){
        if(root.left==null && root.right==null) return new Pair(root.val, root.val);
        if(root.left==null){
            Pair right = helper(root.right);
            int min = right.min, max = right.max;
            maxDiff = Math.max(maxDiff, Math.abs(root.val-min));
            maxDiff = Math.max(maxDiff, Math.abs(root.val-max));
            min = Math.min(min, root.val);
            max = Math.max(max, root.val);
            return new Pair(min, max);
        }
        if(root.right==null){
            Pair left = helper(root.left);
            int min = left.min, max = left.max;
            maxDiff = Math.max(maxDiff, Math.abs(root.val-min));
            maxDiff = Math.max(maxDiff, Math.abs(root.val-max));
            min = Math.min(min, root.val);
            max = Math.max(max, root.val);
            return new Pair(min, max);
        }
        Pair left = helper(root.left);
        Pair right = helper(root.right);
        int min = Math.min(left.min, right.min);
        int max = Math.max(left.max, right.max);
        maxDiff = Math.max(maxDiff, Math.abs(root.val-min));
        maxDiff = Math.max(maxDiff, Math.abs(root.val-max));
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        return new Pair(min, max);
    }
}