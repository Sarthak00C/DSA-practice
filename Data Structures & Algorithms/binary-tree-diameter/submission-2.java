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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        DoT(root);
        return diameter;
    }

    private int DoT(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int l = DoT(root.left);
        int r = DoT(root.right);

        diameter = Math.max(diameter, l + r);

        return 1 + Math.max(l, r);
    }

    
}
