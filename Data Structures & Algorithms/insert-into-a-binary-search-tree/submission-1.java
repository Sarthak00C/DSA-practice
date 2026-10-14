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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        dfs(root, val);
        return root;
    }

    private void dfs(TreeNode root, int val) {
        if(root == null) {
            return;
        }

        if(root.left == null || root.right == null) {
            TreeNode node = new TreeNode(val); 
            if(root.val >= val && root.left == null) {
                root.left = node;
                return;
            }
            if(root.val < val && root.right == null) {
                root.right = node;
                return;
            }
        }

        if(root.val >= val) {
            insertIntoBST(root.left, val);
        } else {
            insertIntoBST(root.right, val);
        }
    }
}