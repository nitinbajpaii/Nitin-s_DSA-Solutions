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
    List<Integer> list = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        rightSide(root,0);
        return list;
    }
    public void rightSide(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(level==list.size()){
            list.add(root.val);
        }
        rightSide(root.right,level+1);
        rightSide(root.left,level+1);

    }
}