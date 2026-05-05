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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode p = st.pop();
            list.add(p.val);
            if(p.left!=null){
                st.push(p.left);
            }
            if(p.right!=null){
                st.push(p.right);
            }
        }
        return list.size();
    }
}