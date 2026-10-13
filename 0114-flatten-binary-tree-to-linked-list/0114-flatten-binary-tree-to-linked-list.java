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
    TreeNode curr;

    public void flatten(TreeNode root) {
        if (root == null) return;

        curr = root;
        pre(root);
    }

    public void pre(TreeNode root) {
        if (root == null) return;

        if (root.left != null) {
            TreeNode leftSubtree = root.left;
            TreeNode rightSubtree = root.right;

            root.left = null;
            root.right = leftSubtree;

            TreeNode temp = leftSubtree;
            while (temp.right != null) {
                temp = temp.right;
            }

            temp.right = rightSubtree;
        }

        pre(root.right);
    }
}