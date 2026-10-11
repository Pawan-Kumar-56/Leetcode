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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return f(root.left,root.right);
    }
    public boolean f(TreeNode left1,TreeNode right1){
        if(left1==null && right1==null) return true;
        if(left1==null || right1==null) return false;
        return (left1.val==right1.val) &&
                f(left1.left,right1.right) && 
                f(left1.right,right1.left);
    }
}