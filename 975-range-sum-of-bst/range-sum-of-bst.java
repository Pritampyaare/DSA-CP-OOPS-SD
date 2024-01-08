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
        if(r==null) return 0;
        return rangeSumBST(r.left, l, h)+rangeSumBST(r.right, l, h)+((r.val>=l&&r.val<=h)==true ? r.val:0);
    }
    // public void rangeSumBSTS(TreeNode root, int low, int high){
    //     if(root==null) return;
    //     if(root.val>=low && root.val<=high) sum += root.val;
    //     rangeSumBST(root.left, low, high);
    //     rangeSumBST(root.right, low, high);
    //     return;
    // }
}