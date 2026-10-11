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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        f(root);
        return max;
    }
    public int f(TreeNode root){
        if(root==null) return 0;

        int left=1+f(root.left);
        int right=1+f(root.right);
        max=Math.max(left+right-2,max);
        return Math.max(left,right);
    }
}