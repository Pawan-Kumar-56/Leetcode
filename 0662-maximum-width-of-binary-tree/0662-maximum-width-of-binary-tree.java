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
class Pair {
    TreeNode root;
    long position;

    public Pair(TreeNode root, long position) {
        this.root = root;
        this.position = position;
    }
}
class Solution {
    
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0L));
        int max=0;
        while(!q.isEmpty()){
            long end=0;
            long start=0;
            long fornormalize=q.peek().position;
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair p=q.poll();
                TreeNode node=p.root;
                long parent=p.position-fornormalize;
                if(i==0){
                    start=parent;
                    // if(node.left!=null && node.right==null){
                    //     q.add(new Pair(node.left,2*parent+1));
                    //     start=2*parent+1;
                    // }
                    // else if(node.right!=null && node.left==null){
                    //     start=2*parent+2;
                    //     q.add(new Pair(node.right,start));
                    // }
                    // else if(node.right!=null && node.left!=null){
                    //     q.add(new Pair(node.left,2*parent+1));
                    //     q.add(new Pair(node.right,2*parent+2));
                    // }
                    // continue;
                }
                if(i==size-1){
                    end=parent;
                    // if(node.left!=null && node.right==null){
                    //     q.add(new Pair(node.left,2*parent+1));
                    //     end=2*parent+1;
                    // }
                    // else if(node.right!=null && node.left!=null){
                    //     q.add(new Pair(node.left,2*parent+1));
                    //     q.add(new Pair(node.right,2*parent+2));
                    // }
                    // else if(node.right!=null && node.left==null){
                    //     q.add(new Pair(node.right,2*parent+2));
                    //     end=2*parent+2;
                    // }
                    // continue;
                }
                if(node.left!=null) q.add(new Pair(node.left,2*parent+1));
                if(node.right!=null) q.add(new Pair(node.right,2*parent+2));
                
            }
            max=Math.max(max,(int)(end-start+1));
        }
        return max;
    }
    // public void f(TreeNode root){
    //     if(root==null) return 0;

    // }
}