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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        Stack<TreeNode> st = new Stack<>();
        Set<Integer> set = new HashSet<>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            set.add(root.val);

            if(root.left!=null){
                st.push(root.left);
            }
            if(root.right!=null){
                st.push(root.right);
            }
        }
        return set.size()==1;
    }
}