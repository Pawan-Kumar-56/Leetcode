class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        Stack<Integer> s = new Stack<>();

        // --- NO NEED OF MAP, MAX, IDX, SPECIAL CHECK ---
        
        // initialize ans as -1
        for (int i = 0; i < n; i++) ans[i] = -1;

        s.push(nums[n - 1]);

        // Main backward loop
        for (int i = n - 2; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= nums[i]) {
                s.pop();
            }

            if (!s.isEmpty()) {
                ans[i] = s.peek();
            }

            s.push(nums[i]);
        }

        // ------- FIX FOR CIRCULAR PART -------
        // Now treat it as circular:
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= nums[i]) {
                s.pop();
            }

            if (!s.isEmpty() && ans[i] == -1) {
                ans[i] = s.peek();
            }

            s.push(nums[i]);
        }
        // -------------------------------------

        return ans;
    }
}
