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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level_count=0;
        while(!q.isEmpty()){
            int level_size=q.size();
            List<Integer> sublist = new ArrayList<>();
            level_count++;
            for(int i=0;i<level_size;i++){
                TreeNode node = q.remove();
                sublist.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            if(level_count%2==0){
                Collections.reverse(sublist);
            }
            list.add(sublist);
        }
        return list;
    }
}