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
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] freq = new int[10];
        return helper(root, freq);
    }
    
    public int helper(TreeNode root, int[] freq){
        freq[root.val]++;
        if(root.left==null && root.right==null){
            int ans = isValid(freq) ? 1 : 0;
            freq[root.val]--;
            return ans;
        }
        int sum=0;
        if(root.left!=null){
            sum += helper(root.left, freq);
        }
        if(root.right!=null){
            sum += helper(root.right, freq);
        }
        freq[root.val]--;
        return sum;
    }

    public boolean isValid(int[] freq){
        boolean flag = false;
        for(int i=1; i<=9; i++){
            if(freq[i]%2==1){
                if(flag) return false;
                flag=true;
            }
        }
        return true;
    }
}