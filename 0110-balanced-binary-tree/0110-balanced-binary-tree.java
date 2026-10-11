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
    int a=0;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int h=f(root);
        return (a==0)?true:false;
    }
    public int f(TreeNode root){
        if(root==null) return 0;

        int left=1+f(root.left);
        int right=1+f(root.right);
        if(Math.abs(left-right)>1){
            a=1;
        }
        return Math.max(left,right);
    }
    
}