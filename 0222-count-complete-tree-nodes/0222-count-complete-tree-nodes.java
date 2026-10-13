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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int lh=leftheight(root);
        int rh=rightheight(root);
        if(lh==rh) return (int)(Math.pow(2,lh+1)-1);
        else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    }
    public int leftheight(TreeNode root){
        if(root==null) return 0;
        if(root.left!=null){
            return 1+leftheight(root.left);
        }
        return 0;
    }
    public int rightheight(TreeNode root){
        if(root==null) return 0;
        if(root.right!=null){
            return 1+rightheight(root.right);
        }
        return 0;
    }
    
}