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

    public int rangeSumBST(TreeNode r, int l, int h) {
        return r==null ? 0 : rangeSumBST(r.left, l, h)+rangeSumBST(r.right, l, h)+((r.val>=l&&r.val<=h) ? r.val:0);
    }
}