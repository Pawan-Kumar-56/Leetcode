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
    List<Integer> list=new ArrayList<>();
    HashMap<TreeNode,TreeNode> map=new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root==null) return list;
        hash(root);
        up(target,0,k,target,root);
        return list;
    }
    public void dfs(TreeNode root,int cnt,int k,TreeNode target,TreeNode main){
        if(root==null) return;
        if(root==target && cnt>0) return;
        if(!map.containsKey(root) && root!=main){
            return;
        }
        if(cnt==k){
            list.add(root.val);
        }
        dfs(root.left,cnt+1,k,target,main);
        dfs(root.right,cnt+1,k,target,main);
    }
    public void up(TreeNode root,int cnt,int k,TreeNode target,TreeNode main){
        if(root==null) return;
        TreeNode parent=root;
        while(parent!=null){
            dfs(parent,cnt,k,target,main);
            if(map.containsKey(parent)){   
                TreeNode current = parent;
                parent = map.get(current);
                map.remove(current);
            }
            else parent=null;
            cnt++;
        }
    }
    public void hash(TreeNode root){
        if(root==null) return;
        if(root.left!=null){
            map.put(root.left,root);
            hash(root.left);
        }
        if(root.right!=null){
            map.put(root.right,root);
            hash(root.right);
        }
    }
}