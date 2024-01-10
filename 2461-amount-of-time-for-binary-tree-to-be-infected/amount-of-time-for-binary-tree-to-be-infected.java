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
    TreeNode parent;
    TreeNode curr;

    Pair(TreeNode parent, TreeNode curr){
        this.parent = parent;
        this.curr = curr;
    }
 }
class Solution {
    int maxTime = 0;
    public int amountOfTime(TreeNode root, int start) {
        getTime(root, start);
        return maxTime;
    }
    public int getTime(TreeNode root, int start){
        if(root==null) return -1;
        if(root.val == start){
            int time = maxDepth(root)-1;
            maxTime = Math.max(time, maxTime);
            return 1;
        }
        int left = getTime(root.left, start);
        if(left>=0){
            int time = maxDepth(root.right)+left;
            maxTime = Math.max(time, maxTime);
            return 1+left;
        }
        int right = getTime(root.right, start);
        if(right>=0){
            int time = maxDepth(root.left)+right;
            maxTime = Math.max(time, maxTime);
            return 1+right;
        }
        return -1;
    }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        int left = 1+maxDepth(root.left);
        int right = 1+maxDepth(root.right);
        return Math.max(left, right);
    }
}