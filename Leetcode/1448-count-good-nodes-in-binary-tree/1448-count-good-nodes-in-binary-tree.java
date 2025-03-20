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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    public int dfs(TreeNode node, int maximum){
        int cnt = 0;
        if(node==null) return 0;

        if(node.val >= maximum) {
            cnt=1;
            maximum = node.val;
        }

        cnt += dfs(node.left, maximum);
        cnt += dfs(node.right, maximum);
        return cnt;
    }
}

