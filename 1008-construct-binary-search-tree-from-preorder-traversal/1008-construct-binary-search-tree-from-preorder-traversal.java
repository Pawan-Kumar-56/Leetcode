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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int val:preorder){
            root=made(root,val);
        }
        return root;

    }
    public TreeNode made(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }

        if(root.val>val){
            root.left=made(root.left,val);
        }
        else{
            root.right=made(root.right,val);
        }
        return root;
    }
}