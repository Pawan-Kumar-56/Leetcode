
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth,
                            int need1, int need2) {

        long ans1 = (long) cost1 * need1 + (long) cost2 * need2;

        int min = Math.min(need1, need2);
        int max = Math.max(need1, need2);

        long ans2 = (long) min * costBoth;

        if (need1 > need2) {
            ans2 += (long) (need1 - need2) * Math.min(cost1, costBoth);
        } else {
            ans2 += (long) (need2 - need1) * Math.min(cost2, costBoth);
        }

        long ans3 = (long) max * costBoth;

        return Math.min(ans1, Math.min(ans2, ans3));
    }
}
