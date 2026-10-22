import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> seen = new HashSet<>();
        return dfs(root, k, seen);
    }

    private boolean dfs(TreeNode root, int k, Set<Integer> seen) {
        if (root == null) return false;

        int target = k - root.val;

        if (seen.contains(target)) {
            return true;
        }

        seen.add(root.val);

        return dfs(root.left, k, seen) ||
               dfs(root.right, k, seen);
    }
}