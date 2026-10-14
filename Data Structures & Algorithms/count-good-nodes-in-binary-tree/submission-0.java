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
    int total = 0;
    public int goodNodes(TreeNode root) {
       bfs(root, Integer.MIN_VALUE);
       return total;
    }

    private void bfs(TreeNode root, int currLast) {
        if(root == null) {
            return;
        }

        if(root.val >= currLast) {
            total += 1;
            bfs(root.left, root.val);
            bfs(root.right, root.val);
        } else {
            bfs(root.left, currLast);
            bfs(root.right, currLast);
        }
    }
}
