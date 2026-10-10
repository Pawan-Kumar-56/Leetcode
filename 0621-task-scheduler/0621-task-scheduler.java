
class Solution {
    public int leastInterval(char[] tasks, int n) {

        // Step 1: Count the frequency of each task
        int[] freq = new int[26];

        for (char c : tasks) {
            freq[c - 'A']++;
        }

        // Step 2: Find the maximum frequency
        int maxFreq = 0;

        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        // Step 3: Count tasks with maximum frequency
        int maxCount = 0;

        for (int f : freq) {
            if (f == maxFreq) {
                maxCount++;
            }
        }

        // Step 4: Calculate the minimum required intervals
        int intervals = (maxFreq - 1) * (n + 1) + maxCount;

        // Step 5: We must execute every task
        return Math.max(tasks.length, intervals);
    }
}
