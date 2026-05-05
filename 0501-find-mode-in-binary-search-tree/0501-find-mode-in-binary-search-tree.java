class Solution {
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];

        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode p = st.pop();
            list.add(p.val);

            if (p.left != null) st.push(p.left);
            if (p.right != null) st.push(p.right);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : list) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int max = 0;
        for (int freq : map.values()) {
            max = Math.max(max, freq);
        }
        ArrayList<Integer> modes = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                modes.add(key);
            }
        }
        int[] ans = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            ans[i] = modes.get(i);
        }

        return ans;
    }
}