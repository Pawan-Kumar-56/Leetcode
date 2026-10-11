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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int check=0;
        if(root==null) return ans;
        Deque<TreeNode> dq=new ArrayDeque<>();
        dq.addFirst(root);
        while(!dq.isEmpty()){
            int size=dq.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(check==0){
                    TreeNode node=dq.removeFirst();
                    list.add(node.val);
                    if(node.left!=null){
                        dq.addLast(node.left);
                    }
                    if(node.right!=null){
                        dq.addLast(node.right);
                    }
                }else{
                    TreeNode node=dq.removeLast();
                    list.add(node.val);
                    if(node.right!=null){
                        dq.addFirst(node.right);
                    }
                    if(node.left!=null){
                        dq.addFirst(node.left);
                    }
                }
            }
            ans.add(list);
            if(check==0) check=1;
            else if(check==1) check=0;

        }
        return ans;
    }
}