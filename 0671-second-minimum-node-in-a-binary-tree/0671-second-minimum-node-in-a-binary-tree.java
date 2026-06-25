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
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;

        int min = root.val;
        long second = Long.MAX_VALUE;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node.val > min && node.val < second) {
                second = node.val;
            }

            if (node.left != null) q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }

        return second == Long.MAX_VALUE ? -1 : (int) second;
    }
}