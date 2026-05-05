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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode t = st.pop();
            list.add(t.val);
            if(t.left!=null){
                st.push(t.left);
            }
            if(t.right!=null){
                st.push(t.right);
            }
        }
        int n = list.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(list.get(i)+list.get(j)==k){
                    return true;
                }
            }
        }
        return false;
    }
}