
class Solution {
    List<List<Integer>> list = new ArrayList<>();
    List<int[]> nodes = new ArrayList<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        f(root, 0, 0);

        // Sort by column, then row, then node value
        nodes.sort((a, b) -> {
            if (a[1] != b[1])
                return Integer.compare(a[1], b[1]);

            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);

            return Integer.compare(a[2], b[2]);
        });

        int prevCol = Integer.MIN_VALUE;
        List<Integer> temp = new ArrayList<>();

        for (int[] arr : nodes) {
            int col = arr[1];
            int val = arr[2];

            if (col != prevCol && !temp.isEmpty()) {
                list.add(temp);
                temp = new ArrayList<>();
            }

            temp.add(val);
            prevCol = col;
        }

        if (!temp.isEmpty()) {
            list.add(temp);
        }

        return list;
    }

    public void f(TreeNode root, int r, int c) {
        if (root == null) return;

        nodes.add(new int[]{r, c, root.val});

        f(root.left, r + 1, c - 1);
        f(root.right, r + 1, c + 1);
    }
}
