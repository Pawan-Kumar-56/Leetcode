/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q) return root;

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        if(left==null) return right;
        return left;

    }
    public boolean dfs(TreeNode root, TreeNode p, TreeNode q,int a){
        if(root==null) return false;
        if(root.val==p.val || root.val==q.val){
            a++;
        }
        if(a==2){
            return true;
        }
        return dfs(root.left,p,q,a) ||
                dfs(root.right,p,q,a);
        // return false;
    }
}