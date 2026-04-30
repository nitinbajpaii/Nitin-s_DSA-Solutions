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
    int max_sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return max_sum;
    }
    public int solve(TreeNode root){
        if(root==null){
            return 0;
        }
        int left_sum = Math.max(0,solve(root.left));
        int right_sum = Math.max(0,solve(root.right));
        max_sum = Math.max(max_sum,left_sum+right_sum+root.val);
        return root.val+Math.max(left_sum,right_sum);
    }

}